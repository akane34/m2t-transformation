/**
 */
package co.edu.uniandes.metamodels.Html;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TEXTAREA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.TEXTAREA#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.TEXTAREA#getRows <em>Rows</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.TEXTAREA#getCols <em>Cols</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTEXTAREA()
 * @model
 * @generated
 */
public interface TEXTAREA extends EObject {
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
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTEXTAREA_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.TEXTAREA#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #setRows(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTEXTAREA_Rows()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getRows();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.TEXTAREA#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #getRows()
	 * @generated
	 */
	void setRows(String value);

	/**
	 * Returns the value of the '<em><b>Cols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cols</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cols</em>' attribute.
	 * @see #setCols(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTEXTAREA_Cols()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getCols();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.TEXTAREA#getCols <em>Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cols</em>' attribute.
	 * @see #getCols()
	 * @generated
	 */
	void setCols(String value);

} // TEXTAREA
