package co.edu.uniandes.transformation.mtcluncher;

import cs.ualberta.launcher.ATLLauncher;
import cs.ualberta.launcher.input.M2MTransformation;
import cs.ualberta.launcher.input.M2TTransformation;
import cs.ualberta.launcher.input.Metamodel;
import cs.ualberta.launcher.input.PropertyConfigInputReader;
import cs.ualberta.launcher.input.TransformationInput;
import edu.ca.ualberta.ssrg.chaintracker.acceleo.main.AcceleoLauncherException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class Launcher
{
  public static void main(String... args)
    throws IOException, AcceleoLauncherException
  {
    if (args.length == 0) {
      throw new IllegalArgumentException("Provide the name of your properties file.");
    }
    String propFileName = args[0];
    
    List<TransformationInput> inputs = new PropertyConfigInputReader().getInput(propFileName);
    for (TransformationInput input : inputs) {
      if (M2MTransformation.class.isInstance(input)) {
        runM2MTransformation(new M2MTransformation[] { (M2MTransformation)input });
      } else if (M2TTransformation.class.isInstance(input)) {
        runM2TTransformation(new M2TTransformation[] { (M2TTransformation)input }, "/temp/");
      }
    }
  }
  
  public void runATL(String sourceMetamodelPath, String sourceMetamodelName, String sourceModelPath, String targetMetamodelPath, String targetMetamodelName, String targetModelPath, String transformationModule, String transformationDirectory)
  {
    Metamodel inMetamodel = new Metamodel(sourceMetamodelPath, sourceMetamodelName, sourceModelPath);
    
    Metamodel outMetamodel = new Metamodel(targetMetamodelPath, targetMetamodelName, targetModelPath);
    
    M2MTransformation transformation = new M2MTransformation(
      inMetamodel, 
      outMetamodel, 
      transformationModule, 
      transformationDirectory);
    
    runM2MTransformation(new M2MTransformation[] { transformation });
  }
  
  public void runAcceleo(String sourceMetamodelPath, String sourceMetamodelName, String sourceModelPath, String templatePath, String outputDirectory, String outputDirCompiledMtl)
    throws AcceleoLauncherException
  {
    Metamodel inMetamodel = new Metamodel(sourceMetamodelPath, sourceMetamodelName, sourceModelPath);
    
    M2TTransformation transformation = new M2TTransformation(
      inMetamodel, 
      templatePath, 
      outputDirectory);
    
    runM2TTransformation(new M2TTransformation[] { transformation }, outputDirCompiledMtl);
  }
  
  private static void runM2MTransformation(M2MTransformation[] transformations)
  {
    ATLLauncher atlLauncher = new ATLLauncher();
    for (int i = 0; i < transformations.length; i++)
    {
      M2MTransformation M2M = transformations[i];
      atlLauncher.registerInputMetamodel(M2M.inMetamodel.metamodelPath);
      atlLauncher.registerOutputMetamodel(M2M.outMetamodel.metamodelPath);
      
      atlLauncher.launch(M2M.inMetamodel.metamodelPath, M2M.inMetamodel.metamodelName, M2M.inMetamodel.modelPath, 
        M2M.outMetamodel.metamodelPath, M2M.outMetamodel.metamodelName, M2M.outMetamodel.modelPath, 
        M2M.M2MtransformationDirectory, M2M.M2MtransformationName);
      
      System.out.println(String.format("Successfully ran ATL with input metamodel: %1$s, output metamodel: %2$s, transformation: %3$s to create %4$s\n", new Object[] {
        M2M.inMetamodel.metamodelName, M2M.outMetamodel.metamodelName, M2M.M2MtransformationName, M2M.outMetamodel.modelPath }));
    }
  }
  
  private static void runM2TTransformation(M2TTransformation[] transformations, String outputDirCompiledMtl)
    throws AcceleoLauncherException
  {
    AcceleoLauncher acceleoLauncher = new AcceleoLauncher();
    for (int i = 0; i < transformations.length; i++)
    {
      M2TTransformation M2T = transformations[i];
      acceleoLauncher.launch(M2T.inMetamodel.metamodelPath, M2T.inMetamodel.modelPath, M2T.M2TtemplatePath, M2T.outputDirectory, outputDirCompiledMtl);
      
      System.out.println(String.format("Successfully ran Acceleo with metamodel: %1$s, model: %2$s, template: %3$s", new Object[] {
        M2T.inMetamodel.metamodelPath, M2T.inMetamodel.modelPath, M2T.M2TtemplatePath }));
    }
  }
}
