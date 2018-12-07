package co.edu.uniandes.transformation.mtcluncher;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;

import edu.ca.ualberta.ssrg.chaintracker.acceleo.main.AcceleoLauncherException;
import edu.ca.ualberta.ssrg.chaintracker.acceleo.main.AcceleoStandaloneCompiler;
import edu.ca.ualberta.ssrg.chaintracker.acceleo.main.AcceleoTemplateParser;

public class AcceleoLauncher
{
  private static final String COMPILED_DIRECTORY = "compiledMtl/";
  private static final String COMPILE_URI_ERROR = "Could not get URI from Ecore metamodel.";
  private static final String COMPILE_COPY_FAIL_ERROR = "Could not copy template file to temporary directory for compiling.";
  private static final String COMPILE_METAMODEL_HREF_ERROR = "Could not update metamodel reference in compiled template file.";
  private static final String GENERATE_ERROR = "Error running Acceleo generate.";
  
  public void launch(String inMetamodelPath, String inModelPath, String templatePath, String outputPath, String outputDirCompiledMtl)
    throws AcceleoLauncherException
  {
	  try{
    String moduleURI = null;
    URI ecoreURI = URI.createFileURI(inMetamodelPath);
    if (ecoreURI != null) {
      moduleURI = GenericGenerate.registerEcoreMetaModel(ecoreURI);
    } else {
      throw new AcceleoLauncherException("Could not get URI from Ecore metamodel.");
    }
    compileMTLFile(inMetamodelPath, templatePath, moduleURI, outputDirCompiledMtl);    
    generateCode(inMetamodelPath, inModelPath, templatePath, outputPath, outputDirCompiledMtl);
	  }catch(InterruptedException e){
		  throw new AcceleoLauncherException("InterruptedException: " + e.getMessage());
	  }
  }
  
  private void compileMTLFile(String inMetamodelPath, String templatePath, String moduleURI, String outputDirCompiledMtl)
    throws AcceleoLauncherException, InterruptedException
  {
    File temp = com.google.common.io.Files.createTempDir();
    String fileName = getFileName(templatePath);
    String tempFile = temp.getPath() + File.separator + fileName;
    try
    {
      com.google.common.io.Files.copy(new File(templatePath), new File(tempFile));
    }
    catch (IOException e)
    {
      e.printStackTrace();
      throw new AcceleoLauncherException("Could not copy template file to temporary directory for compiling.");
    }
    //String outputDir = "./bin/compiledMtl/";
    String outputDir = outputDirCompiledMtl;
    String outputFile = null;
    
    AcceleoStandaloneCompiler c = new AcceleoStandaloneCompiler();
    c.setSourceFolder(temp.getPath());
    c.setOutputFolder(outputDir);
    c.setBinaryResource(false);
    c.execute();
    
    outputFile = outputDir + File.separator + fileName.replace(".mtl", ".emtl");
    
    renameMetaModelReference(outputFile, inMetamodelPath, moduleURI);        
  }
  
  public void renameMetaModelReference(String compiledMTLPath, String inMetamodelPath, String moduleURI)
    throws AcceleoLauncherException
  {
    if ((moduleURI == null) || (moduleURI.isEmpty())) {
      throw new AcceleoLauncherException("Could not get URI from Ecore metamodel.");
    }
    Path path = Paths.get(compiledMTLPath, new String[0]);
    Charset charset = StandardCharsets.UTF_8;
    try
    {
      String content = new String(java.nio.file.Files.readAllBytes(path), charset);
      
      Pattern metamodelUriPattern = Pattern.compile("href=\"((.*).ecore)");
      Matcher m = metamodelUriPattern.matcher(content);
      String badMetamodelUri = "";
      if ((m != null) && (m.find()) && (m.groupCount() > 0))
      {
        badMetamodelUri = m.group(1);
        if (badMetamodelUri.length() > 0) {
          content = content.replaceAll(Pattern.quote(badMetamodelUri), moduleURI);
        }
      }
      java.nio.file.Files.write(path, content.getBytes(charset), new OpenOption[0]);
    }
    catch (IOException e)
    {
      e.printStackTrace();
      throw new AcceleoLauncherException("Could not update metamodel reference in compiled template file.");
    }
    String content;
  }
  
  private void generateCode(String inMetamodelPath, String inModelPath, String templatePath, String outputPath, String outputDirCompiledMtl)
    throws AcceleoLauncherException
  {
    URI modelURI = URI.createFileURI(inModelPath);
    File generationFolderFile = new File(outputPath);
    URI metaModelURI = URI.createFileURI(inMetamodelPath);
    
    String moduleName = outputDirCompiledMtl + getFileNameNoExtension(templatePath);
    
    AcceleoTemplateParser parser = new AcceleoTemplateParser();
    parser.parse(templatePath);
    List<String> templateNames = parser.getTemplateNames();
    try
    {
      GenericGenerate generator = new GenericGenerate(
        modelURI, generationFolderFile, metaModelURI, moduleName, templateNames, Collections.emptyList());
      generator.doGenerate(new BasicMonitor());
    }
    catch (IOException e)
    {
      e.printStackTrace();
      throw new AcceleoLauncherException("Error running Acceleo generate.");
    }
  }
  
  private static String getFileName(String fileName)
  {
    File f = new File(fileName);
    String name = f.getName();
    
    return name;
  }
  
  private static String getFileNameNoExtension(String file)
  {
    String[] fileNameParts = getFileName(file).split("\\.");
    return fileNameParts[0];
  }
  
  public static void main(String... args)
  {
    if (args.length < 4)
    {
      System.err.println("4 arguments required: \n\t1. metamodel file (.ecore)\n\t2. model file (.xmi)\n\t3. template file (.mtl)\n\t4. destination folder");
      
      return;
    }
    String inMetamodelPath = args[0];
    String inModelPath = args[1];
    String templatePath = args[2];
    String outputPath = args[3];
    String outputDirCompiledMtl = args[4];
    
    AcceleoLauncher launcher = new AcceleoLauncher();
    try
    {
      launcher.launch(inMetamodelPath, inModelPath, templatePath, outputPath, outputDirCompiledMtl);
    }
    catch (AcceleoLauncherException e)
    {
      e.printStackTrace();
    }
  }
}
