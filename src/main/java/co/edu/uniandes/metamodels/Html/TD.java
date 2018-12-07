/**
 */
package co.edu.uniandes.metamodels.Html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.TD#getColspan <em>Colspan</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.TD#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.TD#getValign <em>Valign</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.TD#getAlign <em>Align</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.TD#getWidth <em>Width</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.TD#getTr <em>Tr</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTD()
 * @model
 * @generated
 */
public interface TD extends TABLEElement {
	/**
	 * Returns the value of the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colspan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colspan</em>' attribute.
	 * @see #setColspan(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTD_Colspan()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getColspan();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.TD#getColspan <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colspan</em>' attribute.
	 * @see #getColspan()
	 * @generated
	 */
	void setColspan(String value);

	/**
	 * Returns the value of the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rowspan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowspan</em>' attribute.
	 * @see #setRowspan(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTD_Rowspan()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getRowspan();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.TD#getRowspan <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowspan</em>' attribute.
	 * @see #getRowspan()
	 * @generated
	 */
	void setRowspan(String value);

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
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTD_Valign()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getValign();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.TD#getValign <em>Valign</em>}' attribute.
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
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTD_Align()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getAlign();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.TD#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(String value);

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
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTD_Width()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.TD#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

	/**
	 * Returns the value of the '<em><b>Tr</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.metamodels.Html.TR#getTds <em>Tds</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tr</em>' reference.
	 * @see #setTr(TR)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getTD_Tr()
	 * @see co.edu.uniandes.metamodels.Html.TR#getTds
	 * @model opposite="tds" required="true" ordered="false"
	 * @generated
	 */
	TR getTr();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.TD#getTr <em>Tr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tr</em>' reference.
	 * @see #getTr()
	 * @generated
	 */
	void setTr(TR value);

} // TD
