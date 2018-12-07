/**
 */
package co.edu.uniandes.metamodels.Html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TABLE Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.TABLEElement#getBgcolor <em>Bgcolor</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.TABLEElement#getBackground <em>Background</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTABLEElement()
 * @model abstract="true"
 * @generated
 */
public interface TABLEElement extends BODYElement {
	/**
	 * Returns the value of the '<em><b>Bgcolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bgcolor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bgcolor</em>' attribute.
	 * @see #setBgcolor(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTABLEElement_Bgcolor()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getBgcolor();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.TABLEElement#getBgcolor <em>Bgcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bgcolor</em>' attribute.
	 * @see #getBgcolor()
	 * @generated
	 */
	void setBgcolor(String value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTABLEElement_Background()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getBackground();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.TABLEElement#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(String value);

} // TABLEElement
