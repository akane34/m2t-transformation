/**
 */
package co.edu.uniandes.metamodels.Html;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.TR#getValign <em>Valign</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.TR#getAlign <em>Align</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.TR#getTable <em>Table</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.TR#getTds <em>Tds</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTR()
 * @model
 * @generated
 */
public interface TR extends TABLEElement {
	/**
	 * Returns the value of the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valign</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valign</em>' attribute.
	 * @see #setValign(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTR_Valign()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getValign();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.TR#getValign <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valign</em>' attribute.
	 * @see #getValign()
	 * @generated
	 */
	void setValign(String value);

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see #setAlign(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTR_Align()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getAlign();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.TR#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(String value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.metamodels.Html.TABLE#getTrs <em>Trs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(TABLE)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTR_Table()
	 * @see co.edu.uniandes.metamodels.Html.TABLE#getTrs
	 * @model opposite="trs" required="true" ordered="false"
	 * @generated
	 */
	TABLE getTable();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.TR#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(TABLE value);

	/**
	 * Returns the value of the '<em><b>Tds</b></em>' reference list.
	 * The list contents are of type {@link co.edu.uniandes.metamodels.Html.TD}.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.metamodels.Html.TD#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tds</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tds</em>' reference list.
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTR_Tds()
	 * @see co.edu.uniandes.metamodels.Html.TD#getTr
	 * @model opposite="tr" ordered="false"
	 * @generated
	 */
	EList<TD> getTds();

} // TR
