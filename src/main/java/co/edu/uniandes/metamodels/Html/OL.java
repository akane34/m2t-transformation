/**
 */
package co.edu.uniandes.metamodels.Html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.OL#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getOL()
 * @model
 * @generated
 */
public interface OL extends ListElement {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(String)
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#getOL_Start()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getStart();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.metamodels.Html.OL#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(String value);

} // OL
