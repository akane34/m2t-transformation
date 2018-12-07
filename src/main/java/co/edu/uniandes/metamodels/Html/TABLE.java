/**
 */
package co.edu.uniandes.metamodels.Html;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TABLE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.TABLE#getBorder <em>Border</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.TABLE#getWidth <em>Width</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.TABLE#getCellspacing <em>Cellspacing</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.TABLE#getCellpadding <em>Cellpadding</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.TABLE#getTrs <em>Trs</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTABLE()
 * @model
 * @generated
 */
public interface TABLE extends TABLEElement {
	/**
	 * Returns the value of the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' attribute.
	 * @see #setBorder(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTABLE_Border()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getBorder();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.TABLE#getBorder <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border</em>' attribute.
	 * @see #getBorder()
	 * @generated
	 */
	void setBorder(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTABLE_Width()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.TABLE#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

	/**
	 * Returns the value of the '<em><b>Cellspacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cellspacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cellspacing</em>' attribute.
	 * @see #setCellspacing(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTABLE_Cellspacing()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getCellspacing();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.TABLE#getCellspacing <em>Cellspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cellspacing</em>' attribute.
	 * @see #getCellspacing()
	 * @generated
	 */
	void setCellspacing(String value);

	/**
	 * Returns the value of the '<em><b>Cellpadding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cellpadding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cellpadding</em>' attribute.
	 * @see #setCellpadding(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTABLE_Cellpadding()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getCellpadding();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.TABLE#getCellpadding <em>Cellpadding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cellpadding</em>' attribute.
	 * @see #getCellpadding()
	 * @generated
	 */
	void setCellpadding(String value);

	/**
	 * Returns the value of the '<em><b>Trs</b></em>' reference list.
	 * The list contents are of type {@link co.edu.uniandes.metamodels.Html.TR}.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.metamodels.Html.TR#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trs</em>' reference list.
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTABLE_Trs()
	 * @see co.edu.uniandes.metamodels.Html.TR#getTable
	 * @model opposite="table" ordered="false"
	 * @generated
	 */
	EList<TR> getTrs();

} // TABLE
