/**
 */
package co.edu.uniandes.metamodels.Html;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SELECT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.SELECT#getMultiple <em>Multiple</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.SELECT#getSize <em>Size</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.SELECT#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getSELECT()
 * @model
 * @generated
 */
public interface SELECT extends EObject {
	/**
	 * Returns the value of the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple</em>' attribute.
	 * @see #setMultiple(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getSELECT_Multiple()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getMultiple();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.SELECT#getMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple</em>' attribute.
	 * @see #getMultiple()
	 * @generated
	 */
	void setMultiple(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getSELECT_Size()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.SELECT#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

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
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getSELECT_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.SELECT#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SELECT
