package co.edu.uniandes.transformation.mtcluncher;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.eclipse.acceleo.engine.event.IAcceleoTextGenerationListener;
import org.eclipse.acceleo.engine.generation.strategy.IAcceleoGenerationStrategy;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import co.edu.uniandes.metamodels.Html.HtmlPackage;

public class GenericGenerate
  extends AbstractAcceleoGenerator
{
  public static final String MODULE_FILE_NAME = "";
  private String moduleFileName;
  private URI ecoreURI;
  public static final String[] TEMPLATE_NAMES = { "generateElement" };
  private List<String> templateNames;
  private List<String> propertiesFiles = new ArrayList();
  
  public GenericGenerate() {}
  
  public GenericGenerate(URI modelURI, File targetFolder, URI ecoreURI, String moduleFileName, List<String> templateNames, List<? extends Object> arguments)
    throws IOException
  {
    this.ecoreURI = ecoreURI;
    this.moduleFileName = moduleFileName;    
    this.templateNames = templateNames;
    initialize(modelURI, targetFolder, arguments);
  }
  
  public void doGenerate(Monitor monitor)
    throws IOException
  {
    super.doGenerate(monitor);
  }
  
  public List<IAcceleoTextGenerationListener> getGenerationListeners()
  {
    List<IAcceleoTextGenerationListener> listeners = super.getGenerationListeners();
    
    return listeners;
  }
  
  public IAcceleoGenerationStrategy getGenerationStrategy()
  {
    return super.getGenerationStrategy();
  }
  
  public String getModuleName()
  {
    return this.moduleFileName;
  }
  
  public List<String> getProperties()
  {
    return this.propertiesFiles;
  }
  
  public void addPropertiesFile(String propertiesFile)
  {
    this.propertiesFiles.add(propertiesFile);
  }
  
  public String[] getTemplateNames()
  {
    return (String[])this.templateNames.toArray(new String[this.templateNames.size()]);
  }
  
  public void registerPackages(ResourceSet resourceSet)
  {
    super.registerPackages(resourceSet);
  }
  
  public static String registerEcoreMetaModel(URI ecoreURI)
  {
    String packageURI = null;
    
    HtmlPackage htmlPackage = HtmlPackage.eINSTANCE;
	EPackage.Registry.INSTANCE.put(htmlPackage.getNsURI(), htmlPackage);
    org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
    
    ResourceSet rs = new ResourceSetImpl();
    
    ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(EPackage.Registry.INSTANCE);
    rs.getLoadOptions().put("EXTENDED_META_DATA", 
      extendedMetaData);
    
    rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
	rs.getResource(ecoreURI, true);
    
    Resource r = rs.getResource(ecoreURI, true);
    EObject eObject = (EObject)r.getContents().get(0);
    if ((eObject instanceof EPackage))
    {
      EPackage p = (EPackage)eObject;
      EPackage.Registry.INSTANCE.put(p.getNsURI(), p);
      for (EPackage pSub : p.getESubpackages()) {
        EPackage.Registry.INSTANCE.put(pSub.getNsURI(), pSub);
      }
      packageURI = p.getNsURI();
    }
    return packageURI;
  }
  
  public void registerResourceFactories(ResourceSet resourceSet)
  {
    super.registerResourceFactories(resourceSet);
  }
  
  protected URI createTemplateURI(String str)
  {
    URI templateURI = super.createTemplateURI(str);
    
    String formattedURI = templateURI.toString().replace("rsrc%3A", "");
    templateURI = URI.createURI(formattedURI);
    
    return templateURI;
  }
}
