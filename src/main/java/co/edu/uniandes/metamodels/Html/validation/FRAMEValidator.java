/**
 *
 * $Id$
 */
package co.edu.uniandes.metamodels.Html.validation;


/**
 * A sample validator interface for {@link co.edu.uniandes.metamodels.Html.FRAME}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FRAMEValidator {
	boolean validate();

	boolean validateSrc(String value);
	boolean validateName(String value);
	boolean validateMarginwidth(String value);
	boolean validateMarginheight(String value);
	boolean validateScrolling(String value);
	boolean validateNoresize(String value);
}
