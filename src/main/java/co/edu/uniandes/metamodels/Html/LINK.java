/**
 */
package co.edu.uniandes.metamodels.Html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LINK</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.LINK#getRel <em>Rel</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.LINK#getAhref <em>Ahref</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.LINK#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getLINK()
 * @model
 * @generated
 */
public interface LINK extends HEADElement {
	/**
	 * Returns the value of the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel</em>' attribute.
	 * @see #setRel(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getLINK_Rel()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getRel();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.LINK#getRel <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel</em>' attribute.
	 * @see #getRel()
	 * @generated
	 */
	void setRel(String value);

	/**
	 * Returns the value of the '<em><b>Ahref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ahref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ahref</em>' attribute.
	 * @see #setAhref(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getLINK_Ahref()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getAhref();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.LINK#getAhref <em>Ahref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ahref</em>' attribute.
	 * @see #getAhref()
	 * @generated
	 */
	void setAhref(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getLINK_Type()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.LINK#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // LINK
