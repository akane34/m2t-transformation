/**
 */
package co.edu.uniandes.metamodels.Html;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HEAD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.HEAD#getHeadElements <em>Head Elements</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.HEAD#getHtml <em>Html</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getHEAD()
 * @model
 * @generated
 */
public interface HEAD extends HTMLElement {
	/**
	 * Returns the value of the '<em><b>Head Elements</b></em>' reference list.
	 * The list contents are of type {@link co.edu.uniandes.metamodels.Html.HEADElement}.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.metamodels.Html.HEADElement#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head Elements</em>' reference list.
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getHEAD_HeadElements()
	 * @see co.edu.uniandes.metamodels.Html.HEADElement#getHead
	 * @model opposite="head" ordered="false"
	 * @generated
	 */
	EList<HEADElement> getHeadElements();

	/**
	 * Returns the value of the '<em><b>Html</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.metamodels.Html.HTML#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Html</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html</em>' reference.
	 * @see #setHtml(HTML)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getHEAD_Html()
	 * @see co.edu.uniandes.metamodels.Html.HTML#getHead
	 * @model opposite="head" required="true" ordered="false"
	 * @generated
	 */
	HTML getHtml();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.HEAD#getHtml <em>Html</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html</em>' reference.
	 * @see #getHtml()
	 * @generated
	 */
	void setHtml(HTML value);

} // HEAD
