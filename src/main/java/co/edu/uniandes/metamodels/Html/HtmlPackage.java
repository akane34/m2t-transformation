/**
 */
package co.edu.uniandes.metamodels.Html;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.metamodels.Html.HtmlFactory
 * @model kind="package"
 * @generated
 */
public interface HtmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Html";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://web.emn.fr/html";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Html";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HtmlPackage eINSTANCE = co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.HTMLImpl <em>HTML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.HTMLImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getHTML()
	 * @generated
	 */
	int HTML = 0;

	/**
	 * The feature id for the '<em><b>Head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML__HEAD = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML__BODY = 1;

	/**
	 * The number of structural features of the '<em>HTML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>HTML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.HTMLElementImpl <em>HTML Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.HTMLElementImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getHTMLElement()
	 * @generated
	 */
	int HTML_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT__CHILDREN = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT__ID = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT__TITLE = 5;

	/**
	 * The number of structural features of the '<em>HTML Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>HTML Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.HEADImpl <em>HEAD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.HEADImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getHEAD()
	 * @generated
	 */
	int HEAD = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__VALUE = HTML_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__CHILDREN = HTML_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__PARENT = HTML_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__ID = HTML_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__CLASS = HTML_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__TITLE = HTML_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Head Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__HEAD_ELEMENTS = HTML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Html</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__HTML = HTML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HEAD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_FEATURE_COUNT = HTML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>HEAD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_OPERATION_COUNT = HTML_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.HEADElementImpl <em>HEAD Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.HEADElementImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getHEADElement()
	 * @generated
	 */
	int HEAD_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_ELEMENT__VALUE = HTML_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_ELEMENT__CHILDREN = HTML_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_ELEMENT__PARENT = HTML_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_ELEMENT__ID = HTML_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_ELEMENT__CLASS = HTML_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_ELEMENT__TITLE = HTML_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_ELEMENT__HEAD = HTML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HEAD Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_ELEMENT_FEATURE_COUNT = HTML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HEAD Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_ELEMENT_OPERATION_COUNT = HTML_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.LINKImpl <em>LINK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.LINKImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getLINK()
	 * @generated
	 */
	int LINK = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__VALUE = HEAD_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CHILDREN = HEAD_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__PARENT = HEAD_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = HEAD_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CLASS = HEAD_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TITLE = HEAD_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HEAD = HEAD_ELEMENT__HEAD;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REL = HEAD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ahref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__AHREF = HEAD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TYPE = HEAD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>LINK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = HEAD_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>LINK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = HEAD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.TITLEImpl <em>TITLE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.TITLEImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getTITLE()
	 * @generated
	 */
	int TITLE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__VALUE = HEAD_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__CHILDREN = HEAD_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__PARENT = HEAD_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__ID = HEAD_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__CLASS = HEAD_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__TITLE = HEAD_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__HEAD = HEAD_ELEMENT__HEAD;

	/**
	 * The number of structural features of the '<em>TITLE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = HEAD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TITLE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_OPERATION_COUNT = HEAD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.BODYImpl <em>BODY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.BODYImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getBODY()
	 * @generated
	 */
	int BODY = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__VALUE = HTML_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__CHILDREN = HTML_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__PARENT = HTML_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__ID = HTML_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__CLASS = HTML_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__TITLE = HTML_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__BACKGROUND = HTML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bgcolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__BGCOLOR = HTML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__TEXT = HTML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LINK = HTML_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__ALINK = HTML_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vlink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__VLINK = HTML_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Body Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__BODY_ELEMENTS = HTML_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Html</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__HTML = HTML_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>BODY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = HTML_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>BODY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_OPERATION_COUNT = HTML_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.BODYElementImpl <em>BODY Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.BODYElementImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getBODYElement()
	 * @generated
	 */
	int BODY_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__VALUE = HTML_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__CHILDREN = HTML_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__PARENT = HTML_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__ID = HTML_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__CLASS = HTML_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__TITLE = HTML_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT__BODY = HTML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BODY Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT_FEATURE_COUNT = HTML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BODY Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_ELEMENT_OPERATION_COUNT = HTML_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.H1Impl <em>H1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.H1Impl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getH1()
	 * @generated
	 */
	int H1 = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1__BODY = BODY_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>H1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>H1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.H2Impl <em>H2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.H2Impl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getH2()
	 * @generated
	 */
	int H2 = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2__BODY = BODY_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>H2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>H2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.H3Impl <em>H3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.H3Impl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getH3()
	 * @generated
	 */
	int H3 = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3__BODY = BODY_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>H3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>H3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.H4Impl <em>H4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.H4Impl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getH4()
	 * @generated
	 */
	int H4 = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4__BODY = BODY_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>H4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>H4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.EMImpl <em>EM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.EMImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getEM()
	 * @generated
	 */
	int EM = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__BODY = BODY_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>EM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.STRONGImpl <em>STRONG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.STRONGImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getSTRONG()
	 * @generated
	 */
	int STRONG = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__BODY = BODY_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>STRONG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>STRONG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.BImpl <em>B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.BImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getB()
	 * @generated
	 */
	int B = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__BODY = BODY_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.IImpl <em>I</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.IImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getI()
	 * @generated
	 */
	int I = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__BODY = BODY_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>I</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>I</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.TTImpl <em>TT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.TTImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getTT()
	 * @generated
	 */
	int TT = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__BODY = BODY_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>TT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.PREImpl <em>PRE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.PREImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getPRE()
	 * @generated
	 */
	int PRE = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__BODY = BODY_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>PRE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.BIGImpl <em>BIG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.BIGImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getBIG()
	 * @generated
	 */
	int BIG = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__BODY = BODY_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>BIG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>BIG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.SMALLImpl <em>SMALL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.SMALLImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getSMALL()
	 * @generated
	 */
	int SMALL = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__BODY = BODY_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>SMALL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SMALL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.SUBImpl <em>SUB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.SUBImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getSUB()
	 * @generated
	 */
	int SUB = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__BODY = BODY_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>SUB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SUB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.SUPImpl <em>SUP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.SUPImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getSUP()
	 * @generated
	 */
	int SUP = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__BODY = BODY_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>SUP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SUP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.STRIKEImpl <em>STRIKE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.STRIKEImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getSTRIKE()
	 * @generated
	 */
	int STRIKE = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE__BODY = BODY_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>STRIKE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>STRIKE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.FONTImpl <em>FONT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.FONTImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getFONT()
	 * @generated
	 */
	int FONT = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__BODY = BODY_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__COLOR = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Face</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__FACE = BODY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__SIZE = BODY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>FONT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>FONT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.IMGImpl <em>IMG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.IMGImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getIMG()
	 * @generated
	 */
	int IMG = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__BODY = BODY_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__SRC = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__WIDTH = BODY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__HEIGHT = BODY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__ALT = BODY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__ALIGN = BODY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vspace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__VSPACE = BODY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Hspace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__HSPACE = BODY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ismap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__ISMAP = BODY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Usemap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__USEMAP = BODY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__BORDER = BODY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>IMG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>IMG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.BRImpl <em>BR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.BRImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getBR()
	 * @generated
	 */
	int BR = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR__BODY = BODY_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Clear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR__CLEAR = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.MAPImpl <em>MAP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.MAPImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getMAP()
	 * @generated
	 */
	int MAP = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__BODY = BODY_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>MAP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MAP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.AREAImpl <em>AREA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.AREAImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getAREA()
	 * @generated
	 */
	int AREA = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__BODY = BODY_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__SHAPE = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__COORDS = BODY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ahref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__AHREF = BODY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>AREA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>AREA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.STYLEImpl <em>STYLE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.STYLEImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getSTYLE()
	 * @generated
	 */
	int STYLE = 28;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__BODY = BODY_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>STYLE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>STYLE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.EMBEDImpl <em>EMBED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.EMBEDImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getEMBED()
	 * @generated
	 */
	int EMBED = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBED__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBED__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBED__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBED__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBED__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBED__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBED__BODY = BODY_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBED__SRC = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBED__WIDTH = BODY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBED__HEIGHT = BODY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBED__ALIGN = BODY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Vspace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBED__VSPACE = BODY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hspace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBED__HSPACE = BODY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBED__BORDER = BODY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>EMBED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBED_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>EMBED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBED_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.NOEMBEDImpl <em>NOEMBED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.NOEMBEDImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getNOEMBED()
	 * @generated
	 */
	int NOEMBED = 30;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEMBED__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEMBED__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEMBED__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEMBED__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEMBED__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEMBED__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEMBED__BODY = BODY_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>NOEMBED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEMBED_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>NOEMBED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEMBED_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.SPANImpl <em>SPAN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.SPANImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getSPAN()
	 * @generated
	 */
	int SPAN = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__BODY = BODY_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__STYLE = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SPAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SPAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.AImpl <em>A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.AImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getA()
	 * @generated
	 */
	int A = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__BODY = BODY_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Ahref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__AHREF = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__NAME = BODY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.DIVImpl <em>DIV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.DIVImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getDIV()
	 * @generated
	 */
	int DIV = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__BODY = BODY_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__ALIGN = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DIV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DIV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.PImpl <em>P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.PImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getP()
	 * @generated
	 */
	int P = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__BODY = BODY_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.TABLEElementImpl <em>TABLE Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.TABLEElementImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getTABLEElement()
	 * @generated
	 */
	int TABLE_ELEMENT = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ELEMENT__VALUE = BODY_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ELEMENT__CHILDREN = BODY_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ELEMENT__PARENT = BODY_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ELEMENT__ID = BODY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ELEMENT__CLASS = BODY_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ELEMENT__TITLE = BODY_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ELEMENT__BODY = BODY_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Bgcolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ELEMENT__BGCOLOR = BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ELEMENT__BACKGROUND = BODY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TABLE Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ELEMENT_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TABLE Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ELEMENT_OPERATION_COUNT = BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.TABLEImpl <em>TABLE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.TABLEImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getTABLE()
	 * @generated
	 */
	int TABLE = 36;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__VALUE = TABLE_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CHILDREN = TABLE_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PARENT = TABLE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ID = TABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CLASS = TABLE_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TITLE = TABLE_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BODY = TABLE_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Bgcolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BGCOLOR = TABLE_ELEMENT__BGCOLOR;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BACKGROUND = TABLE_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BORDER = TABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WIDTH = TABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cellspacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CELLSPACING = TABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cellpadding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CELLPADDING = TABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Trs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TRS = TABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TABLE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = TABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TABLE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = TABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.TRImpl <em>TR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.TRImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getTR()
	 * @generated
	 */
	int TR = 37;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__VALUE = TABLE_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__CHILDREN = TABLE_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__PARENT = TABLE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__ID = TABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__CLASS = TABLE_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__TITLE = TABLE_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__BODY = TABLE_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Bgcolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__BGCOLOR = TABLE_ELEMENT__BGCOLOR;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__BACKGROUND = TABLE_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__VALIGN = TABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__ALIGN = TABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__TABLE = TABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__TDS = TABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_FEATURE_COUNT = TABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_OPERATION_COUNT = TABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.TDImpl <em>TD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.TDImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getTD()
	 * @generated
	 */
	int TD = 38;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__VALUE = TABLE_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__CHILDREN = TABLE_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__PARENT = TABLE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__ID = TABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__CLASS = TABLE_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__TITLE = TABLE_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__BODY = TABLE_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Bgcolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__BGCOLOR = TABLE_ELEMENT__BGCOLOR;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__BACKGROUND = TABLE_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__COLSPAN = TABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__ROWSPAN = TABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__VALIGN = TABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__ALIGN = TABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__WIDTH = TABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__TR = TABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_FEATURE_COUNT = TABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>TD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_OPERATION_COUNT = TABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.THImpl <em>TH</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.THImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getTH()
	 * @generated
	 */
	int TH = 39;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__VALUE = TD__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__CHILDREN = TD__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__PARENT = TD__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__ID = TD__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__CLASS = TD__CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__TITLE = TD__TITLE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__BODY = TD__BODY;

	/**
	 * The feature id for the '<em><b>Bgcolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__BGCOLOR = TD__BGCOLOR;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__BACKGROUND = TD__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__COLSPAN = TD__COLSPAN;

	/**
	 * The feature id for the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__ROWSPAN = TD__ROWSPAN;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__VALIGN = TD__VALIGN;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__ALIGN = TD__ALIGN;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__WIDTH = TD__WIDTH;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__TR = TD__TR;

	/**
	 * The number of structural features of the '<em>TH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_FEATURE_COUNT = TD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_OPERATION_COUNT = TD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.FORMImpl <em>FORM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.FORMImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getFORM()
	 * @generated
	 */
	int FORM = 40;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__METHOD = 1;

	/**
	 * The number of structural features of the '<em>FORM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>FORM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.INPUTImpl <em>INPUT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.INPUTImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getINPUT()
	 * @generated
	 */
	int INPUT = 41;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ALIGN = 0;

	/**
	 * The feature id for the '<em><b>Maxlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__MAXLENGTH = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SIZE = 2;

	/**
	 * The feature id for the '<em><b>Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__CHECKED = 3;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SRC = 4;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INPUT_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = 7;

	/**
	 * The number of structural features of the '<em>INPUT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>INPUT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.TEXTAREAImpl <em>TEXTAREA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.TEXTAREAImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getTEXTAREA()
	 * @generated
	 */
	int TEXTAREA = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA__ROWS = 1;

	/**
	 * The feature id for the '<em><b>Cols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA__COLS = 2;

	/**
	 * The number of structural features of the '<em>TEXTAREA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TEXTAREA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.SELECTImpl <em>SELECT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.SELECTImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getSELECT()
	 * @generated
	 */
	int SELECT = 43;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__MULTIPLE = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__NAME = 2;

	/**
	 * The number of structural features of the '<em>SELECT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>SELECT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.OPTIONImpl <em>OPTION</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.OPTIONImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getOPTION()
	 * @generated
	 */
	int OPTION = 44;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__SELECTED = 0;

	/**
	 * The feature id for the '<em><b>Option Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__OPTION_VALUE = 1;

	/**
	 * The number of structural features of the '<em>OPTION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>OPTION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.ListElementImpl <em>List Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.ListElementImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getListElement()
	 * @generated
	 */
	int LIST_ELEMENT = 45;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT__TYPE = 0;

	/**
	 * The number of structural features of the '<em>List Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.OLImpl <em>OL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.OLImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getOL()
	 * @generated
	 */
	int OL = 46;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL__TYPE = LIST_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL__START = LIST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL_FEATURE_COUNT = LIST_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL_OPERATION_COUNT = LIST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.ULImpl <em>UL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.ULImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getUL()
	 * @generated
	 */
	int UL = 47;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL__TYPE = LIST_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>UL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL_FEATURE_COUNT = LIST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL_OPERATION_COUNT = LIST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.LIImpl <em>LI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.LIImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getLI()
	 * @generated
	 */
	int LI = 48;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__TYPE = LIST_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Li Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__LI_VALUE = LIST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_FEATURE_COUNT = LIST_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>LI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_OPERATION_COUNT = LIST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.DLImpl <em>DL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.DLImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getDL()
	 * @generated
	 */
	int DL = 49;

	/**
	 * The number of structural features of the '<em>DL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>DL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.DTImpl <em>DT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.DTImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getDT()
	 * @generated
	 */
	int DT = 50;

	/**
	 * The number of structural features of the '<em>DT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>DT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.DDImpl <em>DD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.DDImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getDD()
	 * @generated
	 */
	int DD = 51;

	/**
	 * The number of structural features of the '<em>DD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>DD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.APPLETImpl <em>APPLET</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.APPLETImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getAPPLET()
	 * @generated
	 */
	int APPLET = 52;

	/**
	 * The feature id for the '<em><b>Applet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLET__APPLET = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLET__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLET__SRC = 2;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLET__ALIGN = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLET__WIDTH = 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLET__HEIGHT = 5;

	/**
	 * The number of structural features of the '<em>APPLET</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLET_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>APPLET</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.PARAMImpl <em>PARAM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.PARAMImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getPARAM()
	 * @generated
	 */
	int PARAM = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Param Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__PARAM_VALUE = 1;

	/**
	 * The number of structural features of the '<em>PARAM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>PARAM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.OBJECTImpl <em>OBJECT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.OBJECTImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getOBJECT()
	 * @generated
	 */
	int OBJECT = 54;

	/**
	 * The feature id for the '<em><b>Classid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__CLASSID = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__DATA = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Standby</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__STANDBY = 3;

	/**
	 * The number of structural features of the '<em>OBJECT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>OBJECT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.FRAMESETImpl <em>FRAMESET</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.FRAMESETImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getFRAMESET()
	 * @generated
	 */
	int FRAMESET = 55;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMESET__ROWS = 0;

	/**
	 * The feature id for the '<em><b>Cols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMESET__COLS = 1;

	/**
	 * The feature id for the '<em><b>Framespacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMESET__FRAMESPACING = 2;

	/**
	 * The feature id for the '<em><b>Frameborder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMESET__FRAMEBORDER = 3;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMESET__BORDER = 4;

	/**
	 * The number of structural features of the '<em>FRAMESET</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMESET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>FRAMESET</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMESET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.FRAMEImpl <em>FRAME</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.FRAMEImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getFRAME()
	 * @generated
	 */
	int FRAME = 56;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__SRC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__NAME = 1;

	/**
	 * The feature id for the '<em><b>Marginwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__MARGINWIDTH = 2;

	/**
	 * The feature id for the '<em><b>Marginheight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__MARGINHEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Scrolling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__SCROLLING = 4;

	/**
	 * The feature id for the '<em><b>Noresize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__NORESIZE = 5;

	/**
	 * The number of structural features of the '<em>FRAME</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>FRAME</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.NOFRAMEImpl <em>NOFRAME</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.NOFRAMEImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getNOFRAME()
	 * @generated
	 */
	int NOFRAME = 57;

	/**
	 * The number of structural features of the '<em>NOFRAME</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOFRAME_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>NOFRAME</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOFRAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.metamodels.Html.impl.IFRAMEImpl <em>IFRAME</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.metamodels.Html.impl.IFRAMEImpl
	 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getIFRAME()
	 * @generated
	 */
	int IFRAME = 58;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__SRC = FRAME__SRC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__NAME = FRAME__NAME;

	/**
	 * The feature id for the '<em><b>Marginwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__MARGINWIDTH = FRAME__MARGINWIDTH;

	/**
	 * The feature id for the '<em><b>Marginheight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__MARGINHEIGHT = FRAME__MARGINHEIGHT;

	/**
	 * The feature id for the '<em><b>Scrolling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__SCROLLING = FRAME__SCROLLING;

	/**
	 * The feature id for the '<em><b>Noresize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__NORESIZE = FRAME__NORESIZE;

	/**
	 * The number of structural features of the '<em>IFRAME</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME_FEATURE_COUNT = FRAME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IFRAME</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME_OPERATION_COUNT = FRAME_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.HTML <em>HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML</em>'.
	 * @see co.edu.uniandes.metamodels.Html.HTML
	 * @generated
	 */
	EClass getHTML();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.metamodels.Html.HTML#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Head</em>'.
	 * @see co.edu.uniandes.metamodels.Html.HTML#getHead()
	 * @see #getHTML()
	 * @generated
	 */
	EReference getHTML_Head();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.metamodels.Html.HTML#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see co.edu.uniandes.metamodels.Html.HTML#getBody()
	 * @see #getHTML()
	 * @generated
	 */
	EReference getHTML_Body();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.HTMLElement <em>HTML Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML Element</em>'.
	 * @see co.edu.uniandes.metamodels.Html.HTMLElement
	 * @generated
	 */
	EClass getHTMLElement();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.HTMLElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see co.edu.uniandes.metamodels.Html.HTMLElement#getValue()
	 * @see #getHTMLElement()
	 * @generated
	 */
	EAttribute getHTMLElement_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.metamodels.Html.HTMLElement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see co.edu.uniandes.metamodels.Html.HTMLElement#getChildren()
	 * @see #getHTMLElement()
	 * @generated
	 */
	EReference getHTMLElement_Children();

	/**
	 * Returns the meta object for the container reference '{@link co.edu.uniandes.metamodels.Html.HTMLElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see co.edu.uniandes.metamodels.Html.HTMLElement#getParent()
	 * @see #getHTMLElement()
	 * @generated
	 */
	EReference getHTMLElement_Parent();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.HTMLElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see co.edu.uniandes.metamodels.Html.HTMLElement#getId()
	 * @see #getHTMLElement()
	 * @generated
	 */
	EAttribute getHTMLElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.HTMLElement#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see co.edu.uniandes.metamodels.Html.HTMLElement#getClass_()
	 * @see #getHTMLElement()
	 * @generated
	 */
	EAttribute getHTMLElement_Class();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.HTMLElement#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see co.edu.uniandes.metamodels.Html.HTMLElement#getTitle()
	 * @see #getHTMLElement()
	 * @generated
	 */
	EAttribute getHTMLElement_Title();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.HEAD <em>HEAD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HEAD</em>'.
	 * @see co.edu.uniandes.metamodels.Html.HEAD
	 * @generated
	 */
	EClass getHEAD();

	/**
	 * Returns the meta object for the reference list '{@link co.edu.uniandes.metamodels.Html.HEAD#getHeadElements <em>Head Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Head Elements</em>'.
	 * @see co.edu.uniandes.metamodels.Html.HEAD#getHeadElements()
	 * @see #getHEAD()
	 * @generated
	 */
	EReference getHEAD_HeadElements();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.metamodels.Html.HEAD#getHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Html</em>'.
	 * @see co.edu.uniandes.metamodels.Html.HEAD#getHtml()
	 * @see #getHEAD()
	 * @generated
	 */
	EReference getHEAD_Html();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.HEADElement <em>HEAD Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HEAD Element</em>'.
	 * @see co.edu.uniandes.metamodels.Html.HEADElement
	 * @generated
	 */
	EClass getHEADElement();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.metamodels.Html.HEADElement#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Head</em>'.
	 * @see co.edu.uniandes.metamodels.Html.HEADElement#getHead()
	 * @see #getHEADElement()
	 * @generated
	 */
	EReference getHEADElement_Head();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.LINK <em>LINK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LINK</em>'.
	 * @see co.edu.uniandes.metamodels.Html.LINK
	 * @generated
	 */
	EClass getLINK();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.LINK#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see co.edu.uniandes.metamodels.Html.LINK#getRel()
	 * @see #getLINK()
	 * @generated
	 */
	EAttribute getLINK_Rel();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.LINK#getAhref <em>Ahref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ahref</em>'.
	 * @see co.edu.uniandes.metamodels.Html.LINK#getAhref()
	 * @see #getLINK()
	 * @generated
	 */
	EAttribute getLINK_Ahref();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.LINK#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see co.edu.uniandes.metamodels.Html.LINK#getType()
	 * @see #getLINK()
	 * @generated
	 */
	EAttribute getLINK_Type();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.TITLE <em>TITLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TITLE</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TITLE
	 * @generated
	 */
	EClass getTITLE();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.BODY <em>BODY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BODY</em>'.
	 * @see co.edu.uniandes.metamodels.Html.BODY
	 * @generated
	 */
	EClass getBODY();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.BODY#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see co.edu.uniandes.metamodels.Html.BODY#getBackground()
	 * @see #getBODY()
	 * @generated
	 */
	EAttribute getBODY_Background();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.BODY#getBgcolor <em>Bgcolor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bgcolor</em>'.
	 * @see co.edu.uniandes.metamodels.Html.BODY#getBgcolor()
	 * @see #getBODY()
	 * @generated
	 */
	EAttribute getBODY_Bgcolor();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.BODY#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see co.edu.uniandes.metamodels.Html.BODY#getText()
	 * @see #getBODY()
	 * @generated
	 */
	EAttribute getBODY_Text();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.BODY#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see co.edu.uniandes.metamodels.Html.BODY#getLink()
	 * @see #getBODY()
	 * @generated
	 */
	EAttribute getBODY_Link();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.BODY#getAlink <em>Alink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alink</em>'.
	 * @see co.edu.uniandes.metamodels.Html.BODY#getAlink()
	 * @see #getBODY()
	 * @generated
	 */
	EAttribute getBODY_Alink();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.BODY#getVlink <em>Vlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vlink</em>'.
	 * @see co.edu.uniandes.metamodels.Html.BODY#getVlink()
	 * @see #getBODY()
	 * @generated
	 */
	EAttribute getBODY_Vlink();

	/**
	 * Returns the meta object for the reference list '{@link co.edu.uniandes.metamodels.Html.BODY#getBodyElements <em>Body Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body Elements</em>'.
	 * @see co.edu.uniandes.metamodels.Html.BODY#getBodyElements()
	 * @see #getBODY()
	 * @generated
	 */
	EReference getBODY_BodyElements();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.metamodels.Html.BODY#getHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Html</em>'.
	 * @see co.edu.uniandes.metamodels.Html.BODY#getHtml()
	 * @see #getBODY()
	 * @generated
	 */
	EReference getBODY_Html();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.BODYElement <em>BODY Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BODY Element</em>'.
	 * @see co.edu.uniandes.metamodels.Html.BODYElement
	 * @generated
	 */
	EClass getBODYElement();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.metamodels.Html.BODYElement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see co.edu.uniandes.metamodels.Html.BODYElement#getBody()
	 * @see #getBODYElement()
	 * @generated
	 */
	EReference getBODYElement_Body();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.H1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H1</em>'.
	 * @see co.edu.uniandes.metamodels.Html.H1
	 * @generated
	 */
	EClass getH1();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.H2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H2</em>'.
	 * @see co.edu.uniandes.metamodels.Html.H2
	 * @generated
	 */
	EClass getH2();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.H3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H3</em>'.
	 * @see co.edu.uniandes.metamodels.Html.H3
	 * @generated
	 */
	EClass getH3();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.H4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H4</em>'.
	 * @see co.edu.uniandes.metamodels.Html.H4
	 * @generated
	 */
	EClass getH4();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.EM <em>EM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EM</em>'.
	 * @see co.edu.uniandes.metamodels.Html.EM
	 * @generated
	 */
	EClass getEM();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.STRONG <em>STRONG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STRONG</em>'.
	 * @see co.edu.uniandes.metamodels.Html.STRONG
	 * @generated
	 */
	EClass getSTRONG();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.B <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>B</em>'.
	 * @see co.edu.uniandes.metamodels.Html.B
	 * @generated
	 */
	EClass getB();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.I <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I</em>'.
	 * @see co.edu.uniandes.metamodels.Html.I
	 * @generated
	 */
	EClass getI();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.TT <em>TT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TT</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TT
	 * @generated
	 */
	EClass getTT();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.PRE <em>PRE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRE</em>'.
	 * @see co.edu.uniandes.metamodels.Html.PRE
	 * @generated
	 */
	EClass getPRE();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.BIG <em>BIG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BIG</em>'.
	 * @see co.edu.uniandes.metamodels.Html.BIG
	 * @generated
	 */
	EClass getBIG();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.SMALL <em>SMALL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SMALL</em>'.
	 * @see co.edu.uniandes.metamodels.Html.SMALL
	 * @generated
	 */
	EClass getSMALL();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.SUB <em>SUB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SUB</em>'.
	 * @see co.edu.uniandes.metamodels.Html.SUB
	 * @generated
	 */
	EClass getSUB();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.SUP <em>SUP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SUP</em>'.
	 * @see co.edu.uniandes.metamodels.Html.SUP
	 * @generated
	 */
	EClass getSUP();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.STRIKE <em>STRIKE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STRIKE</em>'.
	 * @see co.edu.uniandes.metamodels.Html.STRIKE
	 * @generated
	 */
	EClass getSTRIKE();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.FONT <em>FONT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FONT</em>'.
	 * @see co.edu.uniandes.metamodels.Html.FONT
	 * @generated
	 */
	EClass getFONT();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.FONT#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see co.edu.uniandes.metamodels.Html.FONT#getColor()
	 * @see #getFONT()
	 * @generated
	 */
	EAttribute getFONT_Color();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.FONT#getFace <em>Face</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Face</em>'.
	 * @see co.edu.uniandes.metamodels.Html.FONT#getFace()
	 * @see #getFONT()
	 * @generated
	 */
	EAttribute getFONT_Face();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.FONT#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see co.edu.uniandes.metamodels.Html.FONT#getSize()
	 * @see #getFONT()
	 * @generated
	 */
	EAttribute getFONT_Size();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.IMG <em>IMG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IMG</em>'.
	 * @see co.edu.uniandes.metamodels.Html.IMG
	 * @generated
	 */
	EClass getIMG();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.IMG#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see co.edu.uniandes.metamodels.Html.IMG#getSrc()
	 * @see #getIMG()
	 * @generated
	 */
	EAttribute getIMG_Src();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.IMG#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see co.edu.uniandes.metamodels.Html.IMG#getWidth()
	 * @see #getIMG()
	 * @generated
	 */
	EAttribute getIMG_Width();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.IMG#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see co.edu.uniandes.metamodels.Html.IMG#getHeight()
	 * @see #getIMG()
	 * @generated
	 */
	EAttribute getIMG_Height();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.IMG#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see co.edu.uniandes.metamodels.Html.IMG#getAlt()
	 * @see #getIMG()
	 * @generated
	 */
	EAttribute getIMG_Alt();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.IMG#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see co.edu.uniandes.metamodels.Html.IMG#getAlign()
	 * @see #getIMG()
	 * @generated
	 */
	EAttribute getIMG_Align();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.IMG#getVspace <em>Vspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vspace</em>'.
	 * @see co.edu.uniandes.metamodels.Html.IMG#getVspace()
	 * @see #getIMG()
	 * @generated
	 */
	EAttribute getIMG_Vspace();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.IMG#getHspace <em>Hspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hspace</em>'.
	 * @see co.edu.uniandes.metamodels.Html.IMG#getHspace()
	 * @see #getIMG()
	 * @generated
	 */
	EAttribute getIMG_Hspace();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.IMG#getIsmap <em>Ismap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ismap</em>'.
	 * @see co.edu.uniandes.metamodels.Html.IMG#getIsmap()
	 * @see #getIMG()
	 * @generated
	 */
	EAttribute getIMG_Ismap();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.IMG#getUsemap <em>Usemap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usemap</em>'.
	 * @see co.edu.uniandes.metamodels.Html.IMG#getUsemap()
	 * @see #getIMG()
	 * @generated
	 */
	EAttribute getIMG_Usemap();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.IMG#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see co.edu.uniandes.metamodels.Html.IMG#getBorder()
	 * @see #getIMG()
	 * @generated
	 */
	EAttribute getIMG_Border();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.BR <em>BR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BR</em>'.
	 * @see co.edu.uniandes.metamodels.Html.BR
	 * @generated
	 */
	EClass getBR();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.BR#getClear <em>Clear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clear</em>'.
	 * @see co.edu.uniandes.metamodels.Html.BR#getClear()
	 * @see #getBR()
	 * @generated
	 */
	EAttribute getBR_Clear();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.MAP <em>MAP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAP</em>'.
	 * @see co.edu.uniandes.metamodels.Html.MAP
	 * @generated
	 */
	EClass getMAP();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.AREA <em>AREA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AREA</em>'.
	 * @see co.edu.uniandes.metamodels.Html.AREA
	 * @generated
	 */
	EClass getAREA();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.AREA#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see co.edu.uniandes.metamodels.Html.AREA#getShape()
	 * @see #getAREA()
	 * @generated
	 */
	EAttribute getAREA_Shape();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.AREA#getCoords <em>Coords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coords</em>'.
	 * @see co.edu.uniandes.metamodels.Html.AREA#getCoords()
	 * @see #getAREA()
	 * @generated
	 */
	EAttribute getAREA_Coords();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.AREA#getAhref <em>Ahref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ahref</em>'.
	 * @see co.edu.uniandes.metamodels.Html.AREA#getAhref()
	 * @see #getAREA()
	 * @generated
	 */
	EAttribute getAREA_Ahref();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.STYLE <em>STYLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STYLE</em>'.
	 * @see co.edu.uniandes.metamodels.Html.STYLE
	 * @generated
	 */
	EClass getSTYLE();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.EMBED <em>EMBED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMBED</em>'.
	 * @see co.edu.uniandes.metamodels.Html.EMBED
	 * @generated
	 */
	EClass getEMBED();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.EMBED#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see co.edu.uniandes.metamodels.Html.EMBED#getSrc()
	 * @see #getEMBED()
	 * @generated
	 */
	EAttribute getEMBED_Src();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.EMBED#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see co.edu.uniandes.metamodels.Html.EMBED#getWidth()
	 * @see #getEMBED()
	 * @generated
	 */
	EAttribute getEMBED_Width();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.EMBED#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see co.edu.uniandes.metamodels.Html.EMBED#getHeight()
	 * @see #getEMBED()
	 * @generated
	 */
	EAttribute getEMBED_Height();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.EMBED#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see co.edu.uniandes.metamodels.Html.EMBED#getAlign()
	 * @see #getEMBED()
	 * @generated
	 */
	EAttribute getEMBED_Align();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.EMBED#getVspace <em>Vspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vspace</em>'.
	 * @see co.edu.uniandes.metamodels.Html.EMBED#getVspace()
	 * @see #getEMBED()
	 * @generated
	 */
	EAttribute getEMBED_Vspace();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.EMBED#getHspace <em>Hspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hspace</em>'.
	 * @see co.edu.uniandes.metamodels.Html.EMBED#getHspace()
	 * @see #getEMBED()
	 * @generated
	 */
	EAttribute getEMBED_Hspace();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.EMBED#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see co.edu.uniandes.metamodels.Html.EMBED#getBorder()
	 * @see #getEMBED()
	 * @generated
	 */
	EAttribute getEMBED_Border();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.NOEMBED <em>NOEMBED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NOEMBED</em>'.
	 * @see co.edu.uniandes.metamodels.Html.NOEMBED
	 * @generated
	 */
	EClass getNOEMBED();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.SPAN <em>SPAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPAN</em>'.
	 * @see co.edu.uniandes.metamodels.Html.SPAN
	 * @generated
	 */
	EClass getSPAN();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.SPAN#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see co.edu.uniandes.metamodels.Html.SPAN#getStyle()
	 * @see #getSPAN()
	 * @generated
	 */
	EAttribute getSPAN_Style();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.A <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A</em>'.
	 * @see co.edu.uniandes.metamodels.Html.A
	 * @generated
	 */
	EClass getA();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.A#getAhref <em>Ahref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ahref</em>'.
	 * @see co.edu.uniandes.metamodels.Html.A#getAhref()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_Ahref();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.A#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.metamodels.Html.A#getName()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_Name();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.DIV <em>DIV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DIV</em>'.
	 * @see co.edu.uniandes.metamodels.Html.DIV
	 * @generated
	 */
	EClass getDIV();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.DIV#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see co.edu.uniandes.metamodels.Html.DIV#getAlign()
	 * @see #getDIV()
	 * @generated
	 */
	EAttribute getDIV_Align();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.P <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>P</em>'.
	 * @see co.edu.uniandes.metamodels.Html.P
	 * @generated
	 */
	EClass getP();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.TABLEElement <em>TABLE Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TABLE Element</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TABLEElement
	 * @generated
	 */
	EClass getTABLEElement();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.TABLEElement#getBgcolor <em>Bgcolor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bgcolor</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TABLEElement#getBgcolor()
	 * @see #getTABLEElement()
	 * @generated
	 */
	EAttribute getTABLEElement_Bgcolor();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.TABLEElement#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TABLEElement#getBackground()
	 * @see #getTABLEElement()
	 * @generated
	 */
	EAttribute getTABLEElement_Background();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.TABLE <em>TABLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TABLE</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TABLE
	 * @generated
	 */
	EClass getTABLE();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.TABLE#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TABLE#getBorder()
	 * @see #getTABLE()
	 * @generated
	 */
	EAttribute getTABLE_Border();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.TABLE#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TABLE#getWidth()
	 * @see #getTABLE()
	 * @generated
	 */
	EAttribute getTABLE_Width();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.TABLE#getCellspacing <em>Cellspacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cellspacing</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TABLE#getCellspacing()
	 * @see #getTABLE()
	 * @generated
	 */
	EAttribute getTABLE_Cellspacing();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.TABLE#getCellpadding <em>Cellpadding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cellpadding</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TABLE#getCellpadding()
	 * @see #getTABLE()
	 * @generated
	 */
	EAttribute getTABLE_Cellpadding();

	/**
	 * Returns the meta object for the reference list '{@link co.edu.uniandes.metamodels.Html.TABLE#getTrs <em>Trs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trs</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TABLE#getTrs()
	 * @see #getTABLE()
	 * @generated
	 */
	EReference getTABLE_Trs();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.TR <em>TR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TR</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TR
	 * @generated
	 */
	EClass getTR();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.TR#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TR#getValign()
	 * @see #getTR()
	 * @generated
	 */
	EAttribute getTR_Valign();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.TR#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TR#getAlign()
	 * @see #getTR()
	 * @generated
	 */
	EAttribute getTR_Align();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.metamodels.Html.TR#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TR#getTable()
	 * @see #getTR()
	 * @generated
	 */
	EReference getTR_Table();

	/**
	 * Returns the meta object for the reference list '{@link co.edu.uniandes.metamodels.Html.TR#getTds <em>Tds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tds</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TR#getTds()
	 * @see #getTR()
	 * @generated
	 */
	EReference getTR_Tds();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.TD <em>TD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TD</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TD
	 * @generated
	 */
	EClass getTD();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.TD#getColspan <em>Colspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colspan</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TD#getColspan()
	 * @see #getTD()
	 * @generated
	 */
	EAttribute getTD_Colspan();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.TD#getRowspan <em>Rowspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowspan</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TD#getRowspan()
	 * @see #getTD()
	 * @generated
	 */
	EAttribute getTD_Rowspan();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.TD#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TD#getValign()
	 * @see #getTD()
	 * @generated
	 */
	EAttribute getTD_Valign();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.TD#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TD#getAlign()
	 * @see #getTD()
	 * @generated
	 */
	EAttribute getTD_Align();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.TD#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TD#getWidth()
	 * @see #getTD()
	 * @generated
	 */
	EAttribute getTD_Width();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.metamodels.Html.TD#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tr</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TD#getTr()
	 * @see #getTD()
	 * @generated
	 */
	EReference getTD_Tr();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.TH <em>TH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TH</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TH
	 * @generated
	 */
	EClass getTH();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.FORM <em>FORM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FORM</em>'.
	 * @see co.edu.uniandes.metamodels.Html.FORM
	 * @generated
	 */
	EClass getFORM();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.FORM#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see co.edu.uniandes.metamodels.Html.FORM#getAction()
	 * @see #getFORM()
	 * @generated
	 */
	EAttribute getFORM_Action();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.FORM#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see co.edu.uniandes.metamodels.Html.FORM#getMethod()
	 * @see #getFORM()
	 * @generated
	 */
	EAttribute getFORM_Method();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.INPUT <em>INPUT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INPUT</em>'.
	 * @see co.edu.uniandes.metamodels.Html.INPUT
	 * @generated
	 */
	EClass getINPUT();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.INPUT#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see co.edu.uniandes.metamodels.Html.INPUT#getAlign()
	 * @see #getINPUT()
	 * @generated
	 */
	EAttribute getINPUT_Align();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.INPUT#getMaxlength <em>Maxlength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxlength</em>'.
	 * @see co.edu.uniandes.metamodels.Html.INPUT#getMaxlength()
	 * @see #getINPUT()
	 * @generated
	 */
	EAttribute getINPUT_Maxlength();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.INPUT#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see co.edu.uniandes.metamodels.Html.INPUT#getSize()
	 * @see #getINPUT()
	 * @generated
	 */
	EAttribute getINPUT_Size();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.INPUT#getChecked <em>Checked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked</em>'.
	 * @see co.edu.uniandes.metamodels.Html.INPUT#getChecked()
	 * @see #getINPUT()
	 * @generated
	 */
	EAttribute getINPUT_Checked();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.INPUT#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see co.edu.uniandes.metamodels.Html.INPUT#getSrc()
	 * @see #getINPUT()
	 * @generated
	 */
	EAttribute getINPUT_Src();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.INPUT#getInputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Value</em>'.
	 * @see co.edu.uniandes.metamodels.Html.INPUT#getInputValue()
	 * @see #getINPUT()
	 * @generated
	 */
	EAttribute getINPUT_InputValue();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.INPUT#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.metamodels.Html.INPUT#getName()
	 * @see #getINPUT()
	 * @generated
	 */
	EAttribute getINPUT_Name();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.INPUT#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see co.edu.uniandes.metamodels.Html.INPUT#getType()
	 * @see #getINPUT()
	 * @generated
	 */
	EAttribute getINPUT_Type();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.TEXTAREA <em>TEXTAREA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEXTAREA</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TEXTAREA
	 * @generated
	 */
	EClass getTEXTAREA();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.TEXTAREA#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TEXTAREA#getName()
	 * @see #getTEXTAREA()
	 * @generated
	 */
	EAttribute getTEXTAREA_Name();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.TEXTAREA#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TEXTAREA#getRows()
	 * @see #getTEXTAREA()
	 * @generated
	 */
	EAttribute getTEXTAREA_Rows();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.TEXTAREA#getCols <em>Cols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cols</em>'.
	 * @see co.edu.uniandes.metamodels.Html.TEXTAREA#getCols()
	 * @see #getTEXTAREA()
	 * @generated
	 */
	EAttribute getTEXTAREA_Cols();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.SELECT <em>SELECT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SELECT</em>'.
	 * @see co.edu.uniandes.metamodels.Html.SELECT
	 * @generated
	 */
	EClass getSELECT();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.SELECT#getMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see co.edu.uniandes.metamodels.Html.SELECT#getMultiple()
	 * @see #getSELECT()
	 * @generated
	 */
	EAttribute getSELECT_Multiple();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.SELECT#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see co.edu.uniandes.metamodels.Html.SELECT#getSize()
	 * @see #getSELECT()
	 * @generated
	 */
	EAttribute getSELECT_Size();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.SELECT#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.metamodels.Html.SELECT#getName()
	 * @see #getSELECT()
	 * @generated
	 */
	EAttribute getSELECT_Name();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.OPTION <em>OPTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPTION</em>'.
	 * @see co.edu.uniandes.metamodels.Html.OPTION
	 * @generated
	 */
	EClass getOPTION();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.OPTION#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see co.edu.uniandes.metamodels.Html.OPTION#getSelected()
	 * @see #getOPTION()
	 * @generated
	 */
	EAttribute getOPTION_Selected();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.OPTION#getOptionValue <em>Option Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option Value</em>'.
	 * @see co.edu.uniandes.metamodels.Html.OPTION#getOptionValue()
	 * @see #getOPTION()
	 * @generated
	 */
	EAttribute getOPTION_OptionValue();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.ListElement <em>List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Element</em>'.
	 * @see co.edu.uniandes.metamodels.Html.ListElement
	 * @generated
	 */
	EClass getListElement();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.ListElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see co.edu.uniandes.metamodels.Html.ListElement#getType()
	 * @see #getListElement()
	 * @generated
	 */
	EAttribute getListElement_Type();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.OL <em>OL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OL</em>'.
	 * @see co.edu.uniandes.metamodels.Html.OL
	 * @generated
	 */
	EClass getOL();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.OL#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see co.edu.uniandes.metamodels.Html.OL#getStart()
	 * @see #getOL()
	 * @generated
	 */
	EAttribute getOL_Start();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.UL <em>UL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UL</em>'.
	 * @see co.edu.uniandes.metamodels.Html.UL
	 * @generated
	 */
	EClass getUL();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.LI <em>LI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LI</em>'.
	 * @see co.edu.uniandes.metamodels.Html.LI
	 * @generated
	 */
	EClass getLI();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.LI#getLiValue <em>Li Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Li Value</em>'.
	 * @see co.edu.uniandes.metamodels.Html.LI#getLiValue()
	 * @see #getLI()
	 * @generated
	 */
	EAttribute getLI_LiValue();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.DL <em>DL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DL</em>'.
	 * @see co.edu.uniandes.metamodels.Html.DL
	 * @generated
	 */
	EClass getDL();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.DT <em>DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DT</em>'.
	 * @see co.edu.uniandes.metamodels.Html.DT
	 * @generated
	 */
	EClass getDT();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.DD <em>DD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DD</em>'.
	 * @see co.edu.uniandes.metamodels.Html.DD
	 * @generated
	 */
	EClass getDD();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.APPLET <em>APPLET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APPLET</em>'.
	 * @see co.edu.uniandes.metamodels.Html.APPLET
	 * @generated
	 */
	EClass getAPPLET();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.APPLET#getApplet <em>Applet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applet</em>'.
	 * @see co.edu.uniandes.metamodels.Html.APPLET#getApplet()
	 * @see #getAPPLET()
	 * @generated
	 */
	EAttribute getAPPLET_Applet();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.APPLET#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see co.edu.uniandes.metamodels.Html.APPLET#getClass_()
	 * @see #getAPPLET()
	 * @generated
	 */
	EAttribute getAPPLET_Class();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.APPLET#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see co.edu.uniandes.metamodels.Html.APPLET#getSrc()
	 * @see #getAPPLET()
	 * @generated
	 */
	EAttribute getAPPLET_Src();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.APPLET#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see co.edu.uniandes.metamodels.Html.APPLET#getAlign()
	 * @see #getAPPLET()
	 * @generated
	 */
	EAttribute getAPPLET_Align();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.APPLET#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see co.edu.uniandes.metamodels.Html.APPLET#getWidth()
	 * @see #getAPPLET()
	 * @generated
	 */
	EAttribute getAPPLET_Width();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.APPLET#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see co.edu.uniandes.metamodels.Html.APPLET#getHeight()
	 * @see #getAPPLET()
	 * @generated
	 */
	EAttribute getAPPLET_Height();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.PARAM <em>PARAM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PARAM</em>'.
	 * @see co.edu.uniandes.metamodels.Html.PARAM
	 * @generated
	 */
	EClass getPARAM();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.PARAM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.metamodels.Html.PARAM#getName()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_Name();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.PARAM#getParamValue <em>Param Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Value</em>'.
	 * @see co.edu.uniandes.metamodels.Html.PARAM#getParamValue()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_ParamValue();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.OBJECT <em>OBJECT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OBJECT</em>'.
	 * @see co.edu.uniandes.metamodels.Html.OBJECT
	 * @generated
	 */
	EClass getOBJECT();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.OBJECT#getClassid <em>Classid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classid</em>'.
	 * @see co.edu.uniandes.metamodels.Html.OBJECT#getClassid()
	 * @see #getOBJECT()
	 * @generated
	 */
	EAttribute getOBJECT_Classid();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.OBJECT#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see co.edu.uniandes.metamodels.Html.OBJECT#getData()
	 * @see #getOBJECT()
	 * @generated
	 */
	EAttribute getOBJECT_Data();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.OBJECT#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see co.edu.uniandes.metamodels.Html.OBJECT#getType()
	 * @see #getOBJECT()
	 * @generated
	 */
	EAttribute getOBJECT_Type();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.OBJECT#getStandby <em>Standby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standby</em>'.
	 * @see co.edu.uniandes.metamodels.Html.OBJECT#getStandby()
	 * @see #getOBJECT()
	 * @generated
	 */
	EAttribute getOBJECT_Standby();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.FRAMESET <em>FRAMESET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FRAMESET</em>'.
	 * @see co.edu.uniandes.metamodels.Html.FRAMESET
	 * @generated
	 */
	EClass getFRAMESET();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.FRAMESET#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see co.edu.uniandes.metamodels.Html.FRAMESET#getRows()
	 * @see #getFRAMESET()
	 * @generated
	 */
	EAttribute getFRAMESET_Rows();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.FRAMESET#getCols <em>Cols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cols</em>'.
	 * @see co.edu.uniandes.metamodels.Html.FRAMESET#getCols()
	 * @see #getFRAMESET()
	 * @generated
	 */
	EAttribute getFRAMESET_Cols();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.FRAMESET#getFramespacing <em>Framespacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Framespacing</em>'.
	 * @see co.edu.uniandes.metamodels.Html.FRAMESET#getFramespacing()
	 * @see #getFRAMESET()
	 * @generated
	 */
	EAttribute getFRAMESET_Framespacing();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.FRAMESET#getFrameborder <em>Frameborder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frameborder</em>'.
	 * @see co.edu.uniandes.metamodels.Html.FRAMESET#getFrameborder()
	 * @see #getFRAMESET()
	 * @generated
	 */
	EAttribute getFRAMESET_Frameborder();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.FRAMESET#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see co.edu.uniandes.metamodels.Html.FRAMESET#getBorder()
	 * @see #getFRAMESET()
	 * @generated
	 */
	EAttribute getFRAMESET_Border();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.FRAME <em>FRAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FRAME</em>'.
	 * @see co.edu.uniandes.metamodels.Html.FRAME
	 * @generated
	 */
	EClass getFRAME();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.FRAME#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see co.edu.uniandes.metamodels.Html.FRAME#getSrc()
	 * @see #getFRAME()
	 * @generated
	 */
	EAttribute getFRAME_Src();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.FRAME#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.metamodels.Html.FRAME#getName()
	 * @see #getFRAME()
	 * @generated
	 */
	EAttribute getFRAME_Name();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.FRAME#getMarginwidth <em>Marginwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marginwidth</em>'.
	 * @see co.edu.uniandes.metamodels.Html.FRAME#getMarginwidth()
	 * @see #getFRAME()
	 * @generated
	 */
	EAttribute getFRAME_Marginwidth();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.FRAME#getMarginheight <em>Marginheight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marginheight</em>'.
	 * @see co.edu.uniandes.metamodels.Html.FRAME#getMarginheight()
	 * @see #getFRAME()
	 * @generated
	 */
	EAttribute getFRAME_Marginheight();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.FRAME#getScrolling <em>Scrolling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scrolling</em>'.
	 * @see co.edu.uniandes.metamodels.Html.FRAME#getScrolling()
	 * @see #getFRAME()
	 * @generated
	 */
	EAttribute getFRAME_Scrolling();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.metamodels.Html.FRAME#getNoresize <em>Noresize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Noresize</em>'.
	 * @see co.edu.uniandes.metamodels.Html.FRAME#getNoresize()
	 * @see #getFRAME()
	 * @generated
	 */
	EAttribute getFRAME_Noresize();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.NOFRAME <em>NOFRAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NOFRAME</em>'.
	 * @see co.edu.uniandes.metamodels.Html.NOFRAME
	 * @generated
	 */
	EClass getNOFRAME();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.metamodels.Html.IFRAME <em>IFRAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFRAME</em>'.
	 * @see co.edu.uniandes.metamodels.Html.IFRAME
	 * @generated
	 */
	EClass getIFRAME();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HtmlFactory getHtmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.HTMLImpl <em>HTML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.HTMLImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getHTML()
		 * @generated
		 */
		EClass HTML = eINSTANCE.getHTML();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTML__HEAD = eINSTANCE.getHTML_Head();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTML__BODY = eINSTANCE.getHTML_Body();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.HTMLElementImpl <em>HTML Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.HTMLElementImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getHTMLElement()
		 * @generated
		 */
		EClass HTML_ELEMENT = eINSTANCE.getHTMLElement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_ELEMENT__VALUE = eINSTANCE.getHTMLElement_Value();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTML_ELEMENT__CHILDREN = eINSTANCE.getHTMLElement_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTML_ELEMENT__PARENT = eINSTANCE.getHTMLElement_Parent();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_ELEMENT__ID = eINSTANCE.getHTMLElement_Id();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_ELEMENT__CLASS = eINSTANCE.getHTMLElement_Class();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_ELEMENT__TITLE = eINSTANCE.getHTMLElement_Title();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.HEADImpl <em>HEAD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.HEADImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getHEAD()
		 * @generated
		 */
		EClass HEAD = eINSTANCE.getHEAD();

		/**
		 * The meta object literal for the '<em><b>Head Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD__HEAD_ELEMENTS = eINSTANCE.getHEAD_HeadElements();

		/**
		 * The meta object literal for the '<em><b>Html</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD__HTML = eINSTANCE.getHEAD_Html();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.HEADElementImpl <em>HEAD Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.HEADElementImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getHEADElement()
		 * @generated
		 */
		EClass HEAD_ELEMENT = eINSTANCE.getHEADElement();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD_ELEMENT__HEAD = eINSTANCE.getHEADElement_Head();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.LINKImpl <em>LINK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.LINKImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getLINK()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLINK();

		/**
		 * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__REL = eINSTANCE.getLINK_Rel();

		/**
		 * The meta object literal for the '<em><b>Ahref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__AHREF = eINSTANCE.getLINK_Ahref();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TYPE = eINSTANCE.getLINK_Type();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.TITLEImpl <em>TITLE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.TITLEImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getTITLE()
		 * @generated
		 */
		EClass TITLE = eINSTANCE.getTITLE();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.BODYImpl <em>BODY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.BODYImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getBODY()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBODY();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__BACKGROUND = eINSTANCE.getBODY_Background();

		/**
		 * The meta object literal for the '<em><b>Bgcolor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__BGCOLOR = eINSTANCE.getBODY_Bgcolor();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__TEXT = eINSTANCE.getBODY_Text();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__LINK = eINSTANCE.getBODY_Link();

		/**
		 * The meta object literal for the '<em><b>Alink</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__ALINK = eINSTANCE.getBODY_Alink();

		/**
		 * The meta object literal for the '<em><b>Vlink</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__VLINK = eINSTANCE.getBODY_Vlink();

		/**
		 * The meta object literal for the '<em><b>Body Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__BODY_ELEMENTS = eINSTANCE.getBODY_BodyElements();

		/**
		 * The meta object literal for the '<em><b>Html</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__HTML = eINSTANCE.getBODY_Html();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.BODYElementImpl <em>BODY Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.BODYElementImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getBODYElement()
		 * @generated
		 */
		EClass BODY_ELEMENT = eINSTANCE.getBODYElement();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_ELEMENT__BODY = eINSTANCE.getBODYElement_Body();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.H1Impl <em>H1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.H1Impl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getH1()
		 * @generated
		 */
		EClass H1 = eINSTANCE.getH1();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.H2Impl <em>H2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.H2Impl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getH2()
		 * @generated
		 */
		EClass H2 = eINSTANCE.getH2();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.H3Impl <em>H3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.H3Impl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getH3()
		 * @generated
		 */
		EClass H3 = eINSTANCE.getH3();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.H4Impl <em>H4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.H4Impl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getH4()
		 * @generated
		 */
		EClass H4 = eINSTANCE.getH4();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.EMImpl <em>EM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.EMImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getEM()
		 * @generated
		 */
		EClass EM = eINSTANCE.getEM();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.STRONGImpl <em>STRONG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.STRONGImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getSTRONG()
		 * @generated
		 */
		EClass STRONG = eINSTANCE.getSTRONG();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.BImpl <em>B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.BImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getB()
		 * @generated
		 */
		EClass B = eINSTANCE.getB();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.IImpl <em>I</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.IImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getI()
		 * @generated
		 */
		EClass I = eINSTANCE.getI();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.TTImpl <em>TT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.TTImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getTT()
		 * @generated
		 */
		EClass TT = eINSTANCE.getTT();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.PREImpl <em>PRE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.PREImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getPRE()
		 * @generated
		 */
		EClass PRE = eINSTANCE.getPRE();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.BIGImpl <em>BIG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.BIGImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getBIG()
		 * @generated
		 */
		EClass BIG = eINSTANCE.getBIG();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.SMALLImpl <em>SMALL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.SMALLImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getSMALL()
		 * @generated
		 */
		EClass SMALL = eINSTANCE.getSMALL();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.SUBImpl <em>SUB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.SUBImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getSUB()
		 * @generated
		 */
		EClass SUB = eINSTANCE.getSUB();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.SUPImpl <em>SUP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.SUPImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getSUP()
		 * @generated
		 */
		EClass SUP = eINSTANCE.getSUP();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.STRIKEImpl <em>STRIKE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.STRIKEImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getSTRIKE()
		 * @generated
		 */
		EClass STRIKE = eINSTANCE.getSTRIKE();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.FONTImpl <em>FONT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.FONTImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getFONT()
		 * @generated
		 */
		EClass FONT = eINSTANCE.getFONT();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__COLOR = eINSTANCE.getFONT_Color();

		/**
		 * The meta object literal for the '<em><b>Face</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__FACE = eINSTANCE.getFONT_Face();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__SIZE = eINSTANCE.getFONT_Size();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.IMGImpl <em>IMG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.IMGImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getIMG()
		 * @generated
		 */
		EClass IMG = eINSTANCE.getIMG();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG__SRC = eINSTANCE.getIMG_Src();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG__WIDTH = eINSTANCE.getIMG_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG__HEIGHT = eINSTANCE.getIMG_Height();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG__ALT = eINSTANCE.getIMG_Alt();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG__ALIGN = eINSTANCE.getIMG_Align();

		/**
		 * The meta object literal for the '<em><b>Vspace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG__VSPACE = eINSTANCE.getIMG_Vspace();

		/**
		 * The meta object literal for the '<em><b>Hspace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG__HSPACE = eINSTANCE.getIMG_Hspace();

		/**
		 * The meta object literal for the '<em><b>Ismap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG__ISMAP = eINSTANCE.getIMG_Ismap();

		/**
		 * The meta object literal for the '<em><b>Usemap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG__USEMAP = eINSTANCE.getIMG_Usemap();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG__BORDER = eINSTANCE.getIMG_Border();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.BRImpl <em>BR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.BRImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getBR()
		 * @generated
		 */
		EClass BR = eINSTANCE.getBR();

		/**
		 * The meta object literal for the '<em><b>Clear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BR__CLEAR = eINSTANCE.getBR_Clear();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.MAPImpl <em>MAP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.MAPImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getMAP()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMAP();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.AREAImpl <em>AREA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.AREAImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getAREA()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getAREA();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA__SHAPE = eINSTANCE.getAREA_Shape();

		/**
		 * The meta object literal for the '<em><b>Coords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA__COORDS = eINSTANCE.getAREA_Coords();

		/**
		 * The meta object literal for the '<em><b>Ahref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA__AHREF = eINSTANCE.getAREA_Ahref();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.STYLEImpl <em>STYLE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.STYLEImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getSTYLE()
		 * @generated
		 */
		EClass STYLE = eINSTANCE.getSTYLE();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.EMBEDImpl <em>EMBED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.EMBEDImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getEMBED()
		 * @generated
		 */
		EClass EMBED = eINSTANCE.getEMBED();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBED__SRC = eINSTANCE.getEMBED_Src();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBED__WIDTH = eINSTANCE.getEMBED_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBED__HEIGHT = eINSTANCE.getEMBED_Height();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBED__ALIGN = eINSTANCE.getEMBED_Align();

		/**
		 * The meta object literal for the '<em><b>Vspace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBED__VSPACE = eINSTANCE.getEMBED_Vspace();

		/**
		 * The meta object literal for the '<em><b>Hspace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBED__HSPACE = eINSTANCE.getEMBED_Hspace();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBED__BORDER = eINSTANCE.getEMBED_Border();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.NOEMBEDImpl <em>NOEMBED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.NOEMBEDImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getNOEMBED()
		 * @generated
		 */
		EClass NOEMBED = eINSTANCE.getNOEMBED();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.SPANImpl <em>SPAN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.SPANImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getSPAN()
		 * @generated
		 */
		EClass SPAN = eINSTANCE.getSPAN();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN__STYLE = eINSTANCE.getSPAN_Style();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.AImpl <em>A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.AImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getA()
		 * @generated
		 */
		EClass A = eINSTANCE.getA();

		/**
		 * The meta object literal for the '<em><b>Ahref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__AHREF = eINSTANCE.getA_Ahref();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__NAME = eINSTANCE.getA_Name();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.DIVImpl <em>DIV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.DIVImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getDIV()
		 * @generated
		 */
		EClass DIV = eINSTANCE.getDIV();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIV__ALIGN = eINSTANCE.getDIV_Align();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.PImpl <em>P</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.PImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getP()
		 * @generated
		 */
		EClass P = eINSTANCE.getP();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.TABLEElementImpl <em>TABLE Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.TABLEElementImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getTABLEElement()
		 * @generated
		 */
		EClass TABLE_ELEMENT = eINSTANCE.getTABLEElement();

		/**
		 * The meta object literal for the '<em><b>Bgcolor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ELEMENT__BGCOLOR = eINSTANCE.getTABLEElement_Bgcolor();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ELEMENT__BACKGROUND = eINSTANCE.getTABLEElement_Background();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.TABLEImpl <em>TABLE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.TABLEImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getTABLE()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTABLE();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__BORDER = eINSTANCE.getTABLE_Border();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__WIDTH = eINSTANCE.getTABLE_Width();

		/**
		 * The meta object literal for the '<em><b>Cellspacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__CELLSPACING = eINSTANCE.getTABLE_Cellspacing();

		/**
		 * The meta object literal for the '<em><b>Cellpadding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__CELLPADDING = eINSTANCE.getTABLE_Cellpadding();

		/**
		 * The meta object literal for the '<em><b>Trs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TRS = eINSTANCE.getTABLE_Trs();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.TRImpl <em>TR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.TRImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getTR()
		 * @generated
		 */
		EClass TR = eINSTANCE.getTR();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR__VALIGN = eINSTANCE.getTR_Valign();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR__ALIGN = eINSTANCE.getTR_Align();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TR__TABLE = eINSTANCE.getTR_Table();

		/**
		 * The meta object literal for the '<em><b>Tds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TR__TDS = eINSTANCE.getTR_Tds();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.TDImpl <em>TD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.TDImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getTD()
		 * @generated
		 */
		EClass TD = eINSTANCE.getTD();

		/**
		 * The meta object literal for the '<em><b>Colspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD__COLSPAN = eINSTANCE.getTD_Colspan();

		/**
		 * The meta object literal for the '<em><b>Rowspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD__ROWSPAN = eINSTANCE.getTD_Rowspan();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD__VALIGN = eINSTANCE.getTD_Valign();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD__ALIGN = eINSTANCE.getTD_Align();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD__WIDTH = eINSTANCE.getTD_Width();

		/**
		 * The meta object literal for the '<em><b>Tr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TD__TR = eINSTANCE.getTD_Tr();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.THImpl <em>TH</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.THImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getTH()
		 * @generated
		 */
		EClass TH = eINSTANCE.getTH();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.FORMImpl <em>FORM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.FORMImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getFORM()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getFORM();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__ACTION = eINSTANCE.getFORM_Action();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__METHOD = eINSTANCE.getFORM_Method();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.INPUTImpl <em>INPUT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.INPUTImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getINPUT()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getINPUT();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__ALIGN = eINSTANCE.getINPUT_Align();

		/**
		 * The meta object literal for the '<em><b>Maxlength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__MAXLENGTH = eINSTANCE.getINPUT_Maxlength();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__SIZE = eINSTANCE.getINPUT_Size();

		/**
		 * The meta object literal for the '<em><b>Checked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__CHECKED = eINSTANCE.getINPUT_Checked();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__SRC = eINSTANCE.getINPUT_Src();

		/**
		 * The meta object literal for the '<em><b>Input Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__INPUT_VALUE = eINSTANCE.getINPUT_InputValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__NAME = eINSTANCE.getINPUT_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__TYPE = eINSTANCE.getINPUT_Type();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.TEXTAREAImpl <em>TEXTAREA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.TEXTAREAImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getTEXTAREA()
		 * @generated
		 */
		EClass TEXTAREA = eINSTANCE.getTEXTAREA();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTAREA__NAME = eINSTANCE.getTEXTAREA_Name();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTAREA__ROWS = eINSTANCE.getTEXTAREA_Rows();

		/**
		 * The meta object literal for the '<em><b>Cols</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTAREA__COLS = eINSTANCE.getTEXTAREA_Cols();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.SELECTImpl <em>SELECT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.SELECTImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getSELECT()
		 * @generated
		 */
		EClass SELECT = eINSTANCE.getSELECT();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__MULTIPLE = eINSTANCE.getSELECT_Multiple();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__SIZE = eINSTANCE.getSELECT_Size();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__NAME = eINSTANCE.getSELECT_Name();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.OPTIONImpl <em>OPTION</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.OPTIONImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getOPTION()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOPTION();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__SELECTED = eINSTANCE.getOPTION_Selected();

		/**
		 * The meta object literal for the '<em><b>Option Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__OPTION_VALUE = eINSTANCE.getOPTION_OptionValue();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.ListElementImpl <em>List Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.ListElementImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getListElement()
		 * @generated
		 */
		EClass LIST_ELEMENT = eINSTANCE.getListElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ELEMENT__TYPE = eINSTANCE.getListElement_Type();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.OLImpl <em>OL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.OLImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getOL()
		 * @generated
		 */
		EClass OL = eINSTANCE.getOL();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OL__START = eINSTANCE.getOL_Start();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.ULImpl <em>UL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.ULImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getUL()
		 * @generated
		 */
		EClass UL = eINSTANCE.getUL();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.LIImpl <em>LI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.LIImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getLI()
		 * @generated
		 */
		EClass LI = eINSTANCE.getLI();

		/**
		 * The meta object literal for the '<em><b>Li Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LI__LI_VALUE = eINSTANCE.getLI_LiValue();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.DLImpl <em>DL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.DLImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getDL()
		 * @generated
		 */
		EClass DL = eINSTANCE.getDL();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.DTImpl <em>DT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.DTImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getDT()
		 * @generated
		 */
		EClass DT = eINSTANCE.getDT();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.DDImpl <em>DD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.DDImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getDD()
		 * @generated
		 */
		EClass DD = eINSTANCE.getDD();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.APPLETImpl <em>APPLET</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.APPLETImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getAPPLET()
		 * @generated
		 */
		EClass APPLET = eINSTANCE.getAPPLET();

		/**
		 * The meta object literal for the '<em><b>Applet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLET__APPLET = eINSTANCE.getAPPLET_Applet();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLET__CLASS = eINSTANCE.getAPPLET_Class();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLET__SRC = eINSTANCE.getAPPLET_Src();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLET__ALIGN = eINSTANCE.getAPPLET_Align();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLET__WIDTH = eINSTANCE.getAPPLET_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLET__HEIGHT = eINSTANCE.getAPPLET_Height();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.PARAMImpl <em>PARAM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.PARAMImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getPARAM()
		 * @generated
		 */
		EClass PARAM = eINSTANCE.getPARAM();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__NAME = eINSTANCE.getPARAM_Name();

		/**
		 * The meta object literal for the '<em><b>Param Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__PARAM_VALUE = eINSTANCE.getPARAM_ParamValue();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.OBJECTImpl <em>OBJECT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.OBJECTImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getOBJECT()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getOBJECT();

		/**
		 * The meta object literal for the '<em><b>Classid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__CLASSID = eINSTANCE.getOBJECT_Classid();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__DATA = eINSTANCE.getOBJECT_Data();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__TYPE = eINSTANCE.getOBJECT_Type();

		/**
		 * The meta object literal for the '<em><b>Standby</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__STANDBY = eINSTANCE.getOBJECT_Standby();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.FRAMESETImpl <em>FRAMESET</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.FRAMESETImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getFRAMESET()
		 * @generated
		 */
		EClass FRAMESET = eINSTANCE.getFRAMESET();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAMESET__ROWS = eINSTANCE.getFRAMESET_Rows();

		/**
		 * The meta object literal for the '<em><b>Cols</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAMESET__COLS = eINSTANCE.getFRAMESET_Cols();

		/**
		 * The meta object literal for the '<em><b>Framespacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAMESET__FRAMESPACING = eINSTANCE.getFRAMESET_Framespacing();

		/**
		 * The meta object literal for the '<em><b>Frameborder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAMESET__FRAMEBORDER = eINSTANCE.getFRAMESET_Frameborder();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAMESET__BORDER = eINSTANCE.getFRAMESET_Border();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.FRAMEImpl <em>FRAME</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.FRAMEImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getFRAME()
		 * @generated
		 */
		EClass FRAME = eINSTANCE.getFRAME();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__SRC = eINSTANCE.getFRAME_Src();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__NAME = eINSTANCE.getFRAME_Name();

		/**
		 * The meta object literal for the '<em><b>Marginwidth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__MARGINWIDTH = eINSTANCE.getFRAME_Marginwidth();

		/**
		 * The meta object literal for the '<em><b>Marginheight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__MARGINHEIGHT = eINSTANCE.getFRAME_Marginheight();

		/**
		 * The meta object literal for the '<em><b>Scrolling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__SCROLLING = eINSTANCE.getFRAME_Scrolling();

		/**
		 * The meta object literal for the '<em><b>Noresize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__NORESIZE = eINSTANCE.getFRAME_Noresize();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.NOFRAMEImpl <em>NOFRAME</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.NOFRAMEImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getNOFRAME()
		 * @generated
		 */
		EClass NOFRAME = eINSTANCE.getNOFRAME();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.metamodels.Html.impl.IFRAMEImpl <em>IFRAME</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.metamodels.Html.impl.IFRAMEImpl
		 * @see co.edu.uniandes.metamodels.Html.impl.HtmlPackageImpl#getIFRAME()
		 * @generated
		 */
		EClass IFRAME = eINSTANCE.getIFRAME();

	}

} //HtmlPackage
