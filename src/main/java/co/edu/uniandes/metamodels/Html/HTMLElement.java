/**
 */
package co.edu.uniandes.metamodels.Html;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTML Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.HTMLElement#getValue <em>Value</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.HTMLElement#getChildren <em>Children</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.HTMLElement#getParent <em>Parent</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.HTMLElement#getId <em>Id</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.HTMLElement#getClass_ <em>Class</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.HTMLElement#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getHTMLElement()
 * @model
 * @generated
 */
public interface HTMLElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getHTMLElement_Value()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.HTMLElement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.metamodels.Html.HTMLElement}.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.metamodels.Html.HTMLElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getHTMLElement_Children()
	 * @see co.edu.uniandes.metamodels.Html.HTMLElement#getParent
	 * @model opposite="parent" containment="true" ordered="false"
	 * @generated
	 */
	EList<HTMLElement> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.metamodels.Html.HTMLElement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(HTMLElement)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getHTMLElement_Parent()
	 * @see co.edu.uniandes.metamodels.Html.HTMLElement#getChildren
	 * @model opposite="children" required="true" transient="false" ordered="false"
	 * @generated
	 */
	HTMLElement getParent();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.HTMLElement#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(HTMLElement value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getHTMLElement_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.HTMLElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getHTMLElement_Class()
	 * @model
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.HTMLElement#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getHTMLElement_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.HTMLElement#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // HTMLElement
