/**
 */
package co.edu.uniandes.metamodels.Html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HEAD Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.HEADElement#getHead <em>Head</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getHEADElement()
 * @model abstract="true"
 * @generated
 */
public interface HEADElement extends HTMLElement {
	/**
	 * Returns the value of the '<em><b>Head</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.metamodels.Html.HEAD#getHeadElements <em>Head Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' reference.
	 * @see #setHead(HEAD)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getHEADElement_Head()
	 * @see co.edu.uniandes.metamodels.Html.HEAD#getHeadElements
	 * @model opposite="headElements" required="true" ordered="false"
	 * @generated
	 */
	HEAD getHead();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.HEADElement#getHead <em>Head</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(HEAD value);

} // HEADElement
