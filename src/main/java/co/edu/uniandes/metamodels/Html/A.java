/**
 */
package co.edu.uniandes.metamodels.Html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.A#getAhref <em>Ahref</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.A#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getA()
 * @model
 * @generated
 */
public interface A extends BODYElement {
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
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getA_Ahref()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getAhref();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.A#getAhref <em>Ahref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ahref</em>' attribute.
	 * @see #getAhref()
	 * @generated
	 */
	void setAhref(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getA_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.A#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // A
