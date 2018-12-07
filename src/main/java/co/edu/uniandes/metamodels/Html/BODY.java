/**
 */
package co.edu.uniandes.metamodels.Html;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BODY</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.BODY#getBackground <em>Background</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.BODY#getBgcolor <em>Bgcolor</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.BODY#getText <em>Text</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.BODY#getLink <em>Link</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.BODY#getAlink <em>Alink</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.BODY#getVlink <em>Vlink</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.BODY#getBodyElements <em>Body Elements</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.BODY#getHtml <em>Html</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getBODY()
 * @model
 * @generated
 */
public interface BODY extends HTMLElement {
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
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getBODY_Background()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getBackground();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.BODY#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(String value);

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
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getBODY_Bgcolor()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getBgcolor();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.BODY#getBgcolor <em>Bgcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bgcolor</em>' attribute.
	 * @see #getBgcolor()
	 * @generated
	 */
	void setBgcolor(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getBODY_Text()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.BODY#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getBODY_Link()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getLink();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.BODY#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(String value);

	/**
	 * Returns the value of the '<em><b>Alink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alink</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alink</em>' attribute.
	 * @see #setAlink(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getBODY_Alink()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getAlink();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.BODY#getAlink <em>Alink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alink</em>' attribute.
	 * @see #getAlink()
	 * @generated
	 */
	void setAlink(String value);

	/**
	 * Returns the value of the '<em><b>Vlink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vlink</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vlink</em>' attribute.
	 * @see #setVlink(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getBODY_Vlink()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getVlink();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.BODY#getVlink <em>Vlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vlink</em>' attribute.
	 * @see #getVlink()
	 * @generated
	 */
	void setVlink(String value);

	/**
	 * Returns the value of the '<em><b>Body Elements</b></em>' reference list.
	 * The list contents are of type {@link co.edu.uniandes.metamodels.Html.BODYElement}.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.metamodels.Html.BODYElement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Elements</em>' reference list.
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getBODY_BodyElements()
	 * @see co.edu.uniandes.metamodels.Html.BODYElement#getBody
	 * @model opposite="body" ordered="false"
	 * @generated
	 */
	EList<BODYElement> getBodyElements();

	/**
	 * Returns the value of the '<em><b>Html</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.metamodels.Html.HTML#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Html</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html</em>' reference.
	 * @see #setHtml(HTML)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getBODY_Html()
	 * @see co.edu.uniandes.metamodels.Html.HTML#getBody
	 * @model opposite="body" required="true" ordered="false"
	 * @generated
	 */
	HTML getHtml();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.BODY#getHtml <em>Html</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html</em>' reference.
	 * @see #getHtml()
	 * @generated
	 */
	void setHtml(HTML value);

} // BODY
