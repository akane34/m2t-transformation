package co.edu.uniandes.transformation;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;

import co.edu.uniandes.metamodels.Html.HtmlPackage;
import co.edu.uniandes.transformation.mtcluncher.Launcher;
import edu.ca.ualberta.ssrg.chaintracker.acceleo.main.AcceleoLauncherException;

public class MTCLauncher 
{
	public static void main(String[] args) throws IOException, AcceleoLauncherException {
		if (args != null && args.length == 5){
			HtmlPackage htmlPackage = HtmlPackage.eINSTANCE;
			EPackage.Registry.INSTANCE.put(htmlPackage.getNsURI(), htmlPackage);
			
			Launcher launcher = new Launcher();			
			
			String metamodelPath = args[0];
			String metamodelName = args[1];
			String modelPath = args[2];
			String templatePath = args[3];
			String outputPath = args[4];
			String outputDirCompiledMtl = args[5];			
			
			launcher.runAcceleo(metamodelPath, metamodelName, modelPath, templatePath, outputPath, outputDirCompiledMtl);
		}	
	}
}
