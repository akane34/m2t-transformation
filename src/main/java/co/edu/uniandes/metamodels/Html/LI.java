/**
 */
package co.edu.uniandes.metamodels.Html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.LI#getLiValue <em>Li Value</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getLI()
 * @model
 * @generated
 */
public interface LI extends ListElement {
	/**
	 * Returns the value of the '<em><b>Li Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Li Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Li Value</em>' attribute.
	 * @see #setLiValue(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getLI_LiValue()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getLiValue();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.LI#getLiValue <em>Li Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Li Value</em>' attribute.
	 * @see #getLiValue()
	 * @generated
	 */
	void setLiValue(String value);

} // LI
