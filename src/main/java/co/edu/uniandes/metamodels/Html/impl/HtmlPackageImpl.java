/**
 */
package co.edu.uniandes.metamodels.Html.impl;

import co.edu.uniandes.metamodels.Html.BODYElement;
import co.edu.uniandes.metamodels.Html.HEADElement;
import co.edu.uniandes.metamodels.Html.HTMLElement;
import co.edu.uniandes.metamodels.Html.HtmlFactory;
import co.edu.uniandes.metamodels.Html.HtmlPackage;
import co.edu.uniandes.metamodels.Html.ListElement;
import co.edu.uniandes.metamodels.Html.TABLEElement;

import co.edu.uniandes.metamodels.PrimitiveTypes.PrimitiveTypesPackage;

import co.edu.uniandes.metamodels.PrimitiveTypes.impl.PrimitiveTypesPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HtmlPackageImpl extends EPackageImpl implements HtmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ttEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strikeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass embedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noembedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textareaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass olEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ulEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass framesetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noframeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iframeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see co.edu.uniandes.metamodels.Html.HtmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HtmlPackageImpl() {
		super(eNS_URI, HtmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link HtmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HtmlPackage init() {
		if (isInited) return (HtmlPackage)EPackage.Registry.INSTANCE.getEPackage(HtmlPackage.eNS_URI);

		// Obtain or create and register package
		HtmlPackageImpl theHtmlPackage = (HtmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HtmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HtmlPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PrimitiveTypesPackageImpl thePrimitiveTypesPackage = (PrimitiveTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI) instanceof PrimitiveTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI) : PrimitiveTypesPackage.eINSTANCE);

		// Create package meta-data objects
		theHtmlPackage.createPackageContents();
		thePrimitiveTypesPackage.createPackageContents();

		// Initialize created meta-data
		theHtmlPackage.initializePackageContents();
		thePrimitiveTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHtmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HtmlPackage.eNS_URI, theHtmlPackage);
		return theHtmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTML() {
		return htmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTML_Head() {
		return (EReference)htmlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTML_Body() {
		return (EReference)htmlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTMLElement() {
		return htmlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTMLElement_Value() {
		return (EAttribute)htmlElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTMLElement_Children() {
		return (EReference)htmlElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTMLElement_Parent() {
		return (EReference)htmlElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTMLElement_Id() {
		return (EAttribute)htmlElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTMLElement_Class() {
		return (EAttribute)htmlElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTMLElement_Title() {
		return (EAttribute)htmlElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHEAD() {
		return headEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHEAD_HeadElements() {
		return (EReference)headEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHEAD_Html() {
		return (EReference)headEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHEADElement() {
		return headElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHEADElement_Head() {
		return (EReference)headElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLINK() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLINK_Rel() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLINK_Ahref() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLINK_Type() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTITLE() {
		return titleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBODY() {
		return bodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBODY_Background() {
		return (EAttribute)bodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBODY_Bgcolor() {
		return (EAttribute)bodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBODY_Text() {
		return (EAttribute)bodyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBODY_Link() {
		return (EAttribute)bodyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBODY_Alink() {
		return (EAttribute)bodyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBODY_Vlink() {
		return (EAttribute)bodyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBODY_BodyElements() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBODY_Html() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBODYElement() {
		return bodyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBODYElement_Body() {
		return (EReference)bodyElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH1() {
		return h1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH2() {
		return h2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH3() {
		return h3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH4() {
		return h4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEM() {
		return emEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSTRONG() {
		return strongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getB() {
		return bEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI() {
		return iEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTT() {
		return ttEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRE() {
		return preEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBIG() {
		return bigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSMALL() {
		return smallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSUB() {
		return subEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSUP() {
		return supEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSTRIKE() {
		return strikeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFONT() {
		return fontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFONT_Color() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFONT_Face() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFONT_Size() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIMG() {
		return imgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIMG_Src() {
		return (EAttribute)imgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIMG_Width() {
		return (EAttribute)imgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIMG_Height() {
		return (EAttribute)imgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIMG_Alt() {
		return (EAttribute)imgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIMG_Align() {
		return (EAttribute)imgEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIMG_Vspace() {
		return (EAttribute)imgEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIMG_Hspace() {
		return (EAttribute)imgEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIMG_Ismap() {
		return (EAttribute)imgEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIMG_Usemap() {
		return (EAttribute)imgEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIMG_Border() {
		return (EAttribute)imgEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBR() {
		return brEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBR_Clear() {
		return (EAttribute)brEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMAP() {
		return mapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAREA() {
		return areaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAREA_Shape() {
		return (EAttribute)areaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAREA_Coords() {
		return (EAttribute)areaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAREA_Ahref() {
		return (EAttribute)areaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSTYLE() {
		return styleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMBED() {
		return embedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMBED_Src() {
		return (EAttribute)embedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMBED_Width() {
		return (EAttribute)embedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMBED_Height() {
		return (EAttribute)embedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMBED_Align() {
		return (EAttribute)embedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMBED_Vspace() {
		return (EAttribute)embedEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMBED_Hspace() {
		return (EAttribute)embedEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMBED_Border() {
		return (EAttribute)embedEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNOEMBED() {
		return noembedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPAN() {
		return spanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPAN_Style() {
		return (EAttribute)spanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA() {
		return aEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA_Ahref() {
		return (EAttribute)aEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA_Name() {
		return (EAttribute)aEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDIV() {
		return divEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDIV_Align() {
		return (EAttribute)divEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getP() {
		return pEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTABLEElement() {
		return tableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTABLEElement_Bgcolor() {
		return (EAttribute)tableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTABLEElement_Background() {
		return (EAttribute)tableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTABLE() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTABLE_Border() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTABLE_Width() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTABLE_Cellspacing() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTABLE_Cellpadding() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTABLE_Trs() {
		return (EReference)tableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTR() {
		return trEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTR_Valign() {
		return (EAttribute)trEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTR_Align() {
		return (EAttribute)trEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTR_Table() {
		return (EReference)trEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTR_Tds() {
		return (EReference)trEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTD() {
		return tdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTD_Colspan() {
		return (EAttribute)tdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTD_Rowspan() {
		return (EAttribute)tdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTD_Valign() {
		return (EAttribute)tdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTD_Align() {
		return (EAttribute)tdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTD_Width() {
		return (EAttribute)tdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTD_Tr() {
		return (EReference)tdEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTH() {
		return thEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFORM() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFORM_Action() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFORM_Method() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getINPUT() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINPUT_Align() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINPUT_Maxlength() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINPUT_Size() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINPUT_Checked() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINPUT_Src() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINPUT_InputValue() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINPUT_Name() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINPUT_Type() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTEXTAREA() {
		return textareaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTEXTAREA_Name() {
		return (EAttribute)textareaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTEXTAREA_Rows() {
		return (EAttribute)textareaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTEXTAREA_Cols() {
		return (EAttribute)textareaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSELECT() {
		return selectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSELECT_Multiple() {
		return (EAttribute)selectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSELECT_Size() {
		return (EAttribute)selectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSELECT_Name() {
		return (EAttribute)selectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPTION() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPTION_Selected() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPTION_OptionValue() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListElement() {
		return listElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListElement_Type() {
		return (EAttribute)listElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOL() {
		return olEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOL_Start() {
		return (EAttribute)olEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUL() {
		return ulEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLI() {
		return liEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLI_LiValue() {
		return (EAttribute)liEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDL() {
		return dlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDT() {
		return dtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDD() {
		return ddEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPPLET() {
		return appletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPPLET_Applet() {
		return (EAttribute)appletEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPPLET_Class() {
		return (EAttribute)appletEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPPLET_Src() {
		return (EAttribute)appletEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPPLET_Align() {
		return (EAttribute)appletEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPPLET_Width() {
		return (EAttribute)appletEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPPLET_Height() {
		return (EAttribute)appletEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPARAM() {
		return paramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_Name() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_ParamValue() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOBJECT() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOBJECT_Classid() {
		return (EAttribute)objectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOBJECT_Data() {
		return (EAttribute)objectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOBJECT_Type() {
		return (EAttribute)objectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOBJECT_Standby() {
		return (EAttribute)objectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFRAMESET() {
		return framesetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFRAMESET_Rows() {
		return (EAttribute)framesetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFRAMESET_Cols() {
		return (EAttribute)framesetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFRAMESET_Framespacing() {
		return (EAttribute)framesetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFRAMESET_Frameborder() {
		return (EAttribute)framesetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFRAMESET_Border() {
		return (EAttribute)framesetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFRAME() {
		return frameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFRAME_Src() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFRAME_Name() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFRAME_Marginwidth() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFRAME_Marginheight() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFRAME_Scrolling() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFRAME_Noresize() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNOFRAME() {
		return noframeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFRAME() {
		return iframeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlFactory getHtmlFactory() {
		return (HtmlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		htmlEClass = createEClass(HTML);
		createEReference(htmlEClass, HTML__HEAD);
		createEReference(htmlEClass, HTML__BODY);

		htmlElementEClass = createEClass(HTML_ELEMENT);
		createEAttribute(htmlElementEClass, HTML_ELEMENT__VALUE);
		createEReference(htmlElementEClass, HTML_ELEMENT__CHILDREN);
		createEReference(htmlElementEClass, HTML_ELEMENT__PARENT);
		createEAttribute(htmlElementEClass, HTML_ELEMENT__ID);
		createEAttribute(htmlElementEClass, HTML_ELEMENT__CLASS);
		createEAttribute(htmlElementEClass, HTML_ELEMENT__TITLE);

		headEClass = createEClass(HEAD);
		createEReference(headEClass, HEAD__HEAD_ELEMENTS);
		createEReference(headEClass, HEAD__HTML);

		headElementEClass = createEClass(HEAD_ELEMENT);
		createEReference(headElementEClass, HEAD_ELEMENT__HEAD);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__REL);
		createEAttribute(linkEClass, LINK__AHREF);
		createEAttribute(linkEClass, LINK__TYPE);

		titleEClass = createEClass(TITLE);

		bodyEClass = createEClass(BODY);
		createEAttribute(bodyEClass, BODY__BACKGROUND);
		createEAttribute(bodyEClass, BODY__BGCOLOR);
		createEAttribute(bodyEClass, BODY__TEXT);
		createEAttribute(bodyEClass, BODY__LINK);
		createEAttribute(bodyEClass, BODY__ALINK);
		createEAttribute(bodyEClass, BODY__VLINK);
		createEReference(bodyEClass, BODY__BODY_ELEMENTS);
		createEReference(bodyEClass, BODY__HTML);

		bodyElementEClass = createEClass(BODY_ELEMENT);
		createEReference(bodyElementEClass, BODY_ELEMENT__BODY);

		h1EClass = createEClass(H1);

		h2EClass = createEClass(H2);

		h3EClass = createEClass(H3);

		h4EClass = createEClass(H4);

		emEClass = createEClass(EM);

		strongEClass = createEClass(STRONG);

		bEClass = createEClass(B);

		iEClass = createEClass(I);

		ttEClass = createEClass(TT);

		preEClass = createEClass(PRE);

		bigEClass = createEClass(BIG);

		smallEClass = createEClass(SMALL);

		subEClass = createEClass(SUB);

		supEClass = createEClass(SUP);

		strikeEClass = createEClass(STRIKE);

		fontEClass = createEClass(FONT);
		createEAttribute(fontEClass, FONT__COLOR);
		createEAttribute(fontEClass, FONT__FACE);
		createEAttribute(fontEClass, FONT__SIZE);

		imgEClass = createEClass(IMG);
		createEAttribute(imgEClass, IMG__SRC);
		createEAttribute(imgEClass, IMG__WIDTH);
		createEAttribute(imgEClass, IMG__HEIGHT);
		createEAttribute(imgEClass, IMG__ALT);
		createEAttribute(imgEClass, IMG__ALIGN);
		createEAttribute(imgEClass, IMG__VSPACE);
		createEAttribute(imgEClass, IMG__HSPACE);
		createEAttribute(imgEClass, IMG__ISMAP);
		createEAttribute(imgEClass, IMG__USEMAP);
		createEAttribute(imgEClass, IMG__BORDER);

		brEClass = createEClass(BR);
		createEAttribute(brEClass, BR__CLEAR);

		mapEClass = createEClass(MAP);

		areaEClass = createEClass(AREA);
		createEAttribute(areaEClass, AREA__SHAPE);
		createEAttribute(areaEClass, AREA__COORDS);
		createEAttribute(areaEClass, AREA__AHREF);

		styleEClass = createEClass(STYLE);

		embedEClass = createEClass(EMBED);
		createEAttribute(embedEClass, EMBED__SRC);
		createEAttribute(embedEClass, EMBED__WIDTH);
		createEAttribute(embedEClass, EMBED__HEIGHT);
		createEAttribute(embedEClass, EMBED__ALIGN);
		createEAttribute(embedEClass, EMBED__VSPACE);
		createEAttribute(embedEClass, EMBED__HSPACE);
		createEAttribute(embedEClass, EMBED__BORDER);

		noembedEClass = createEClass(NOEMBED);

		spanEClass = createEClass(SPAN);
		createEAttribute(spanEClass, SPAN__STYLE);

		aEClass = createEClass(A);
		createEAttribute(aEClass, A__AHREF);
		createEAttribute(aEClass, A__NAME);

		divEClass = createEClass(DIV);
		createEAttribute(divEClass, DIV__ALIGN);

		pEClass = createEClass(P);

		tableElementEClass = createEClass(TABLE_ELEMENT);
		createEAttribute(tableElementEClass, TABLE_ELEMENT__BGCOLOR);
		createEAttribute(tableElementEClass, TABLE_ELEMENT__BACKGROUND);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__BORDER);
		createEAttribute(tableEClass, TABLE__WIDTH);
		createEAttribute(tableEClass, TABLE__CELLSPACING);
		createEAttribute(tableEClass, TABLE__CELLPADDING);
		createEReference(tableEClass, TABLE__TRS);

		trEClass = createEClass(TR);
		createEAttribute(trEClass, TR__VALIGN);
		createEAttribute(trEClass, TR__ALIGN);
		createEReference(trEClass, TR__TABLE);
		createEReference(trEClass, TR__TDS);

		tdEClass = createEClass(TD);
		createEAttribute(tdEClass, TD__COLSPAN);
		createEAttribute(tdEClass, TD__ROWSPAN);
		createEAttribute(tdEClass, TD__VALIGN);
		createEAttribute(tdEClass, TD__ALIGN);
		createEAttribute(tdEClass, TD__WIDTH);
		createEReference(tdEClass, TD__TR);

		thEClass = createEClass(TH);

		formEClass = createEClass(FORM);
		createEAttribute(formEClass, FORM__ACTION);
		createEAttribute(formEClass, FORM__METHOD);

		inputEClass = createEClass(INPUT);
		createEAttribute(inputEClass, INPUT__ALIGN);
		createEAttribute(inputEClass, INPUT__MAXLENGTH);
		createEAttribute(inputEClass, INPUT__SIZE);
		createEAttribute(inputEClass, INPUT__CHECKED);
		createEAttribute(inputEClass, INPUT__SRC);
		createEAttribute(inputEClass, INPUT__INPUT_VALUE);
		createEAttribute(inputEClass, INPUT__NAME);
		createEAttribute(inputEClass, INPUT__TYPE);

		textareaEClass = createEClass(TEXTAREA);
		createEAttribute(textareaEClass, TEXTAREA__NAME);
		createEAttribute(textareaEClass, TEXTAREA__ROWS);
		createEAttribute(textareaEClass, TEXTAREA__COLS);

		selectEClass = createEClass(SELECT);
		createEAttribute(selectEClass, SELECT__MULTIPLE);
		createEAttribute(selectEClass, SELECT__SIZE);
		createEAttribute(selectEClass, SELECT__NAME);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__SELECTED);
		createEAttribute(optionEClass, OPTION__OPTION_VALUE);

		listElementEClass = createEClass(LIST_ELEMENT);
		createEAttribute(listElementEClass, LIST_ELEMENT__TYPE);

		olEClass = createEClass(OL);
		createEAttribute(olEClass, OL__START);

		ulEClass = createEClass(UL);

		liEClass = createEClass(LI);
		createEAttribute(liEClass, LI__LI_VALUE);

		dlEClass = createEClass(DL);

		dtEClass = createEClass(DT);

		ddEClass = createEClass(DD);

		appletEClass = createEClass(APPLET);
		createEAttribute(appletEClass, APPLET__APPLET);
		createEAttribute(appletEClass, APPLET__CLASS);
		createEAttribute(appletEClass, APPLET__SRC);
		createEAttribute(appletEClass, APPLET__ALIGN);
		createEAttribute(appletEClass, APPLET__WIDTH);
		createEAttribute(appletEClass, APPLET__HEIGHT);

		paramEClass = createEClass(PARAM);
		createEAttribute(paramEClass, PARAM__NAME);
		createEAttribute(paramEClass, PARAM__PARAM_VALUE);

		objectEClass = createEClass(OBJECT);
		createEAttribute(objectEClass, OBJECT__CLASSID);
		createEAttribute(objectEClass, OBJECT__DATA);
		createEAttribute(objectEClass, OBJECT__TYPE);
		createEAttribute(objectEClass, OBJECT__STANDBY);

		framesetEClass = createEClass(FRAMESET);
		createEAttribute(framesetEClass, FRAMESET__ROWS);
		createEAttribute(framesetEClass, FRAMESET__COLS);
		createEAttribute(framesetEClass, FRAMESET__FRAMESPACING);
		createEAttribute(framesetEClass, FRAMESET__FRAMEBORDER);
		createEAttribute(framesetEClass, FRAMESET__BORDER);

		frameEClass = createEClass(FRAME);
		createEAttribute(frameEClass, FRAME__SRC);
		createEAttribute(frameEClass, FRAME__NAME);
		createEAttribute(frameEClass, FRAME__MARGINWIDTH);
		createEAttribute(frameEClass, FRAME__MARGINHEIGHT);
		createEAttribute(frameEClass, FRAME__SCROLLING);
		createEAttribute(frameEClass, FRAME__NORESIZE);

		noframeEClass = createEClass(NOFRAME);

		iframeEClass = createEClass(IFRAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		headEClass.getESuperTypes().add(this.getHTMLElement());
		headElementEClass.getESuperTypes().add(this.getHTMLElement());
		linkEClass.getESuperTypes().add(this.getHEADElement());
		titleEClass.getESuperTypes().add(this.getHEADElement());
		bodyEClass.getESuperTypes().add(this.getHTMLElement());
		bodyElementEClass.getESuperTypes().add(this.getHTMLElement());
		h1EClass.getESuperTypes().add(this.getBODYElement());
		h2EClass.getESuperTypes().add(this.getBODYElement());
		h3EClass.getESuperTypes().add(this.getBODYElement());
		h4EClass.getESuperTypes().add(this.getBODYElement());
		emEClass.getESuperTypes().add(this.getBODYElement());
		strongEClass.getESuperTypes().add(this.getBODYElement());
		bEClass.getESuperTypes().add(this.getBODYElement());
		iEClass.getESuperTypes().add(this.getBODYElement());
		ttEClass.getESuperTypes().add(this.getBODYElement());
		preEClass.getESuperTypes().add(this.getBODYElement());
		bigEClass.getESuperTypes().add(this.getBODYElement());
		smallEClass.getESuperTypes().add(this.getBODYElement());
		subEClass.getESuperTypes().add(this.getBODYElement());
		supEClass.getESuperTypes().add(this.getBODYElement());
		strikeEClass.getESuperTypes().add(this.getBODYElement());
		fontEClass.getESuperTypes().add(this.getBODYElement());
		imgEClass.getESuperTypes().add(this.getBODYElement());
		brEClass.getESuperTypes().add(this.getBODYElement());
		mapEClass.getESuperTypes().add(this.getBODYElement());
		areaEClass.getESuperTypes().add(this.getBODYElement());
		styleEClass.getESuperTypes().add(this.getBODYElement());
		embedEClass.getESuperTypes().add(this.getBODYElement());
		noembedEClass.getESuperTypes().add(this.getBODYElement());
		spanEClass.getESuperTypes().add(this.getBODYElement());
		aEClass.getESuperTypes().add(this.getBODYElement());
		divEClass.getESuperTypes().add(this.getBODYElement());
		pEClass.getESuperTypes().add(this.getBODYElement());
		tableElementEClass.getESuperTypes().add(this.getBODYElement());
		tableEClass.getESuperTypes().add(this.getTABLEElement());
		trEClass.getESuperTypes().add(this.getTABLEElement());
		tdEClass.getESuperTypes().add(this.getTABLEElement());
		thEClass.getESuperTypes().add(this.getTD());
		olEClass.getESuperTypes().add(this.getListElement());
		ulEClass.getESuperTypes().add(this.getListElement());
		liEClass.getESuperTypes().add(this.getListElement());
		iframeEClass.getESuperTypes().add(this.getFRAME());

		// Initialize classes, features, and operations; add parameters
		initEClass(htmlEClass, co.edu.uniandes.metamodels.Html.HTML.class, "HTML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHTML_Head(), this.getHEAD(), this.getHEAD_Html(), "head", null, 1, 1, co.edu.uniandes.metamodels.Html.HTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHTML_Body(), this.getBODY(), this.getBODY_Html(), "body", null, 1, 1, co.edu.uniandes.metamodels.Html.HTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(htmlElementEClass, HTMLElement.class, "HTMLElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHTMLElement_Value(), ecorePackage.getEString(), "value", null, 1, 1, HTMLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHTMLElement_Children(), this.getHTMLElement(), this.getHTMLElement_Parent(), "children", null, 0, -1, HTMLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHTMLElement_Parent(), this.getHTMLElement(), this.getHTMLElement_Children(), "parent", null, 1, 1, HTMLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHTMLElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, HTMLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTMLElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, HTMLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTMLElement_Title(), ecorePackage.getEString(), "title", null, 0, 1, HTMLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headEClass, co.edu.uniandes.metamodels.Html.HEAD.class, "HEAD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHEAD_HeadElements(), this.getHEADElement(), this.getHEADElement_Head(), "headElements", null, 0, -1, co.edu.uniandes.metamodels.Html.HEAD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHEAD_Html(), this.getHTML(), this.getHTML_Head(), "html", null, 1, 1, co.edu.uniandes.metamodels.Html.HEAD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(headElementEClass, HEADElement.class, "HEADElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHEADElement_Head(), this.getHEAD(), this.getHEAD_HeadElements(), "head", null, 1, 1, HEADElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(linkEClass, co.edu.uniandes.metamodels.Html.LINK.class, "LINK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLINK_Rel(), ecorePackage.getEString(), "rel", null, 1, 1, co.edu.uniandes.metamodels.Html.LINK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLINK_Ahref(), ecorePackage.getEString(), "ahref", null, 1, 1, co.edu.uniandes.metamodels.Html.LINK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLINK_Type(), ecorePackage.getEString(), "type", null, 1, 1, co.edu.uniandes.metamodels.Html.LINK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(titleEClass, co.edu.uniandes.metamodels.Html.TITLE.class, "TITLE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bodyEClass, co.edu.uniandes.metamodels.Html.BODY.class, "BODY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBODY_Background(), ecorePackage.getEString(), "background", null, 1, 1, co.edu.uniandes.metamodels.Html.BODY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBODY_Bgcolor(), ecorePackage.getEString(), "bgcolor", null, 1, 1, co.edu.uniandes.metamodels.Html.BODY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBODY_Text(), ecorePackage.getEString(), "text", null, 1, 1, co.edu.uniandes.metamodels.Html.BODY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBODY_Link(), ecorePackage.getEString(), "link", null, 1, 1, co.edu.uniandes.metamodels.Html.BODY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBODY_Alink(), ecorePackage.getEString(), "alink", null, 1, 1, co.edu.uniandes.metamodels.Html.BODY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBODY_Vlink(), ecorePackage.getEString(), "vlink", null, 1, 1, co.edu.uniandes.metamodels.Html.BODY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBODY_BodyElements(), this.getBODYElement(), this.getBODYElement_Body(), "bodyElements", null, 0, -1, co.edu.uniandes.metamodels.Html.BODY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBODY_Html(), this.getHTML(), this.getHTML_Body(), "html", null, 1, 1, co.edu.uniandes.metamodels.Html.BODY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bodyElementEClass, BODYElement.class, "BODYElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBODYElement_Body(), this.getBODY(), this.getBODY_BodyElements(), "body", null, 1, 1, BODYElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(h1EClass, co.edu.uniandes.metamodels.Html.H1.class, "H1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(h2EClass, co.edu.uniandes.metamodels.Html.H2.class, "H2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(h3EClass, co.edu.uniandes.metamodels.Html.H3.class, "H3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(h4EClass, co.edu.uniandes.metamodels.Html.H4.class, "H4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emEClass, co.edu.uniandes.metamodels.Html.EM.class, "EM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strongEClass, co.edu.uniandes.metamodels.Html.STRONG.class, "STRONG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bEClass, co.edu.uniandes.metamodels.Html.B.class, "B", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iEClass, co.edu.uniandes.metamodels.Html.I.class, "I", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ttEClass, co.edu.uniandes.metamodels.Html.TT.class, "TT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preEClass, co.edu.uniandes.metamodels.Html.PRE.class, "PRE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bigEClass, co.edu.uniandes.metamodels.Html.BIG.class, "BIG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smallEClass, co.edu.uniandes.metamodels.Html.SMALL.class, "SMALL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subEClass, co.edu.uniandes.metamodels.Html.SUB.class, "SUB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(supEClass, co.edu.uniandes.metamodels.Html.SUP.class, "SUP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strikeEClass, co.edu.uniandes.metamodels.Html.STRIKE.class, "STRIKE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fontEClass, co.edu.uniandes.metamodels.Html.FONT.class, "FONT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFONT_Color(), ecorePackage.getEString(), "color", null, 1, 1, co.edu.uniandes.metamodels.Html.FONT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFONT_Face(), ecorePackage.getEString(), "face", null, 1, 1, co.edu.uniandes.metamodels.Html.FONT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFONT_Size(), ecorePackage.getEString(), "size", null, 1, 1, co.edu.uniandes.metamodels.Html.FONT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(imgEClass, co.edu.uniandes.metamodels.Html.IMG.class, "IMG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIMG_Src(), ecorePackage.getEString(), "src", null, 1, 1, co.edu.uniandes.metamodels.Html.IMG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIMG_Width(), ecorePackage.getEString(), "width", null, 1, 1, co.edu.uniandes.metamodels.Html.IMG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIMG_Height(), ecorePackage.getEString(), "height", null, 1, 1, co.edu.uniandes.metamodels.Html.IMG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIMG_Alt(), ecorePackage.getEString(), "alt", null, 1, 1, co.edu.uniandes.metamodels.Html.IMG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIMG_Align(), ecorePackage.getEString(), "align", null, 1, 1, co.edu.uniandes.metamodels.Html.IMG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIMG_Vspace(), ecorePackage.getEString(), "vspace", null, 1, 1, co.edu.uniandes.metamodels.Html.IMG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIMG_Hspace(), ecorePackage.getEString(), "hspace", null, 1, 1, co.edu.uniandes.metamodels.Html.IMG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIMG_Ismap(), ecorePackage.getEString(), "ismap", null, 1, 1, co.edu.uniandes.metamodels.Html.IMG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIMG_Usemap(), ecorePackage.getEString(), "usemap", null, 1, 1, co.edu.uniandes.metamodels.Html.IMG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIMG_Border(), ecorePackage.getEString(), "border", null, 1, 1, co.edu.uniandes.metamodels.Html.IMG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(brEClass, co.edu.uniandes.metamodels.Html.BR.class, "BR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBR_Clear(), ecorePackage.getEString(), "clear", null, 1, 1, co.edu.uniandes.metamodels.Html.BR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mapEClass, co.edu.uniandes.metamodels.Html.MAP.class, "MAP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(areaEClass, co.edu.uniandes.metamodels.Html.AREA.class, "AREA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAREA_Shape(), ecorePackage.getEString(), "shape", null, 1, 1, co.edu.uniandes.metamodels.Html.AREA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAREA_Coords(), ecorePackage.getEString(), "coords", null, 1, 1, co.edu.uniandes.metamodels.Html.AREA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAREA_Ahref(), ecorePackage.getEString(), "ahref", null, 1, 1, co.edu.uniandes.metamodels.Html.AREA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(styleEClass, co.edu.uniandes.metamodels.Html.STYLE.class, "STYLE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(embedEClass, co.edu.uniandes.metamodels.Html.EMBED.class, "EMBED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMBED_Src(), ecorePackage.getEString(), "src", null, 1, 1, co.edu.uniandes.metamodels.Html.EMBED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEMBED_Width(), ecorePackage.getEString(), "width", null, 1, 1, co.edu.uniandes.metamodels.Html.EMBED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEMBED_Height(), ecorePackage.getEString(), "height", null, 1, 1, co.edu.uniandes.metamodels.Html.EMBED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEMBED_Align(), ecorePackage.getEString(), "align", null, 1, 1, co.edu.uniandes.metamodels.Html.EMBED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEMBED_Vspace(), ecorePackage.getEString(), "vspace", null, 1, 1, co.edu.uniandes.metamodels.Html.EMBED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEMBED_Hspace(), ecorePackage.getEString(), "hspace", null, 1, 1, co.edu.uniandes.metamodels.Html.EMBED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEMBED_Border(), ecorePackage.getEString(), "border", null, 1, 1, co.edu.uniandes.metamodels.Html.EMBED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(noembedEClass, co.edu.uniandes.metamodels.Html.NOEMBED.class, "NOEMBED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spanEClass, co.edu.uniandes.metamodels.Html.SPAN.class, "SPAN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPAN_Style(), ecorePackage.getEString(), "style", null, 1, 1, co.edu.uniandes.metamodels.Html.SPAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(aEClass, co.edu.uniandes.metamodels.Html.A.class, "A", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getA_Ahref(), ecorePackage.getEString(), "ahref", null, 1, 1, co.edu.uniandes.metamodels.Html.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getA_Name(), ecorePackage.getEString(), "name", null, 1, 1, co.edu.uniandes.metamodels.Html.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(divEClass, co.edu.uniandes.metamodels.Html.DIV.class, "DIV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDIV_Align(), ecorePackage.getEString(), "align", null, 1, 1, co.edu.uniandes.metamodels.Html.DIV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pEClass, co.edu.uniandes.metamodels.Html.P.class, "P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableElementEClass, TABLEElement.class, "TABLEElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTABLEElement_Bgcolor(), ecorePackage.getEString(), "bgcolor", null, 1, 1, TABLEElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTABLEElement_Background(), ecorePackage.getEString(), "background", null, 1, 1, TABLEElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tableEClass, co.edu.uniandes.metamodels.Html.TABLE.class, "TABLE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTABLE_Border(), ecorePackage.getEString(), "border", null, 1, 1, co.edu.uniandes.metamodels.Html.TABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTABLE_Width(), ecorePackage.getEString(), "width", null, 1, 1, co.edu.uniandes.metamodels.Html.TABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTABLE_Cellspacing(), ecorePackage.getEString(), "cellspacing", null, 1, 1, co.edu.uniandes.metamodels.Html.TABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTABLE_Cellpadding(), ecorePackage.getEString(), "cellpadding", null, 1, 1, co.edu.uniandes.metamodels.Html.TABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTABLE_Trs(), this.getTR(), this.getTR_Table(), "trs", null, 0, -1, co.edu.uniandes.metamodels.Html.TABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trEClass, co.edu.uniandes.metamodels.Html.TR.class, "TR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTR_Valign(), ecorePackage.getEString(), "valign", null, 1, 1, co.edu.uniandes.metamodels.Html.TR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTR_Align(), ecorePackage.getEString(), "align", null, 1, 1, co.edu.uniandes.metamodels.Html.TR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTR_Table(), this.getTABLE(), this.getTABLE_Trs(), "table", null, 1, 1, co.edu.uniandes.metamodels.Html.TR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTR_Tds(), this.getTD(), this.getTD_Tr(), "tds", null, 0, -1, co.edu.uniandes.metamodels.Html.TR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tdEClass, co.edu.uniandes.metamodels.Html.TD.class, "TD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTD_Colspan(), ecorePackage.getEString(), "colspan", null, 1, 1, co.edu.uniandes.metamodels.Html.TD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTD_Rowspan(), ecorePackage.getEString(), "rowspan", null, 1, 1, co.edu.uniandes.metamodels.Html.TD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTD_Valign(), ecorePackage.getEString(), "valign", null, 1, 1, co.edu.uniandes.metamodels.Html.TD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTD_Align(), ecorePackage.getEString(), "align", null, 1, 1, co.edu.uniandes.metamodels.Html.TD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTD_Width(), ecorePackage.getEString(), "width", null, 1, 1, co.edu.uniandes.metamodels.Html.TD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTD_Tr(), this.getTR(), this.getTR_Tds(), "tr", null, 1, 1, co.edu.uniandes.metamodels.Html.TD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(thEClass, co.edu.uniandes.metamodels.Html.TH.class, "TH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formEClass, co.edu.uniandes.metamodels.Html.FORM.class, "FORM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFORM_Action(), ecorePackage.getEString(), "action", null, 1, 1, co.edu.uniandes.metamodels.Html.FORM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFORM_Method(), ecorePackage.getEString(), "method", null, 1, 1, co.edu.uniandes.metamodels.Html.FORM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(inputEClass, co.edu.uniandes.metamodels.Html.INPUT.class, "INPUT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getINPUT_Align(), ecorePackage.getEString(), "align", null, 1, 1, co.edu.uniandes.metamodels.Html.INPUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getINPUT_Maxlength(), ecorePackage.getEString(), "maxlength", null, 1, 1, co.edu.uniandes.metamodels.Html.INPUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getINPUT_Size(), ecorePackage.getEString(), "size", null, 1, 1, co.edu.uniandes.metamodels.Html.INPUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getINPUT_Checked(), ecorePackage.getEString(), "checked", null, 1, 1, co.edu.uniandes.metamodels.Html.INPUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getINPUT_Src(), ecorePackage.getEString(), "src", null, 1, 1, co.edu.uniandes.metamodels.Html.INPUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getINPUT_InputValue(), ecorePackage.getEString(), "inputValue", null, 1, 1, co.edu.uniandes.metamodels.Html.INPUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getINPUT_Name(), ecorePackage.getEString(), "name", null, 1, 1, co.edu.uniandes.metamodels.Html.INPUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getINPUT_Type(), ecorePackage.getEString(), "type", null, 1, 1, co.edu.uniandes.metamodels.Html.INPUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(textareaEClass, co.edu.uniandes.metamodels.Html.TEXTAREA.class, "TEXTAREA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTEXTAREA_Name(), ecorePackage.getEString(), "name", null, 1, 1, co.edu.uniandes.metamodels.Html.TEXTAREA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTEXTAREA_Rows(), ecorePackage.getEString(), "rows", null, 1, 1, co.edu.uniandes.metamodels.Html.TEXTAREA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTEXTAREA_Cols(), ecorePackage.getEString(), "cols", null, 1, 1, co.edu.uniandes.metamodels.Html.TEXTAREA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(selectEClass, co.edu.uniandes.metamodels.Html.SELECT.class, "SELECT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSELECT_Multiple(), ecorePackage.getEString(), "multiple", null, 1, 1, co.edu.uniandes.metamodels.Html.SELECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSELECT_Size(), ecorePackage.getEString(), "size", null, 1, 1, co.edu.uniandes.metamodels.Html.SELECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSELECT_Name(), ecorePackage.getEString(), "name", null, 1, 1, co.edu.uniandes.metamodels.Html.SELECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(optionEClass, co.edu.uniandes.metamodels.Html.OPTION.class, "OPTION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOPTION_Selected(), ecorePackage.getEString(), "selected", null, 1, 1, co.edu.uniandes.metamodels.Html.OPTION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOPTION_OptionValue(), ecorePackage.getEString(), "optionValue", null, 1, 1, co.edu.uniandes.metamodels.Html.OPTION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(listElementEClass, ListElement.class, "ListElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListElement_Type(), ecorePackage.getEString(), "type", null, 1, 1, ListElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(olEClass, co.edu.uniandes.metamodels.Html.OL.class, "OL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOL_Start(), ecorePackage.getEString(), "start", null, 1, 1, co.edu.uniandes.metamodels.Html.OL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ulEClass, co.edu.uniandes.metamodels.Html.UL.class, "UL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(liEClass, co.edu.uniandes.metamodels.Html.LI.class, "LI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLI_LiValue(), ecorePackage.getEString(), "liValue", null, 1, 1, co.edu.uniandes.metamodels.Html.LI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dlEClass, co.edu.uniandes.metamodels.Html.DL.class, "DL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dtEClass, co.edu.uniandes.metamodels.Html.DT.class, "DT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ddEClass, co.edu.uniandes.metamodels.Html.DD.class, "DD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(appletEClass, co.edu.uniandes.metamodels.Html.APPLET.class, "APPLET", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPPLET_Applet(), ecorePackage.getEString(), "applet", null, 1, 1, co.edu.uniandes.metamodels.Html.APPLET.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPPLET_Class(), ecorePackage.getEString(), "class", null, 1, 1, co.edu.uniandes.metamodels.Html.APPLET.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPPLET_Src(), ecorePackage.getEString(), "src", null, 1, 1, co.edu.uniandes.metamodels.Html.APPLET.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPPLET_Align(), ecorePackage.getEString(), "align", null, 1, 1, co.edu.uniandes.metamodels.Html.APPLET.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPPLET_Width(), ecorePackage.getEString(), "width", null, 1, 1, co.edu.uniandes.metamodels.Html.APPLET.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAPPLET_Height(), ecorePackage.getEString(), "height", null, 1, 1, co.edu.uniandes.metamodels.Html.APPLET.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(paramEClass, co.edu.uniandes.metamodels.Html.PARAM.class, "PARAM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPARAM_Name(), ecorePackage.getEString(), "name", null, 1, 1, co.edu.uniandes.metamodels.Html.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPARAM_ParamValue(), ecorePackage.getEString(), "paramValue", null, 1, 1, co.edu.uniandes.metamodels.Html.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectEClass, co.edu.uniandes.metamodels.Html.OBJECT.class, "OBJECT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOBJECT_Classid(), ecorePackage.getEString(), "classid", null, 1, 1, co.edu.uniandes.metamodels.Html.OBJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOBJECT_Data(), ecorePackage.getEString(), "data", null, 1, 1, co.edu.uniandes.metamodels.Html.OBJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOBJECT_Type(), ecorePackage.getEString(), "type", null, 1, 1, co.edu.uniandes.metamodels.Html.OBJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOBJECT_Standby(), ecorePackage.getEString(), "standby", null, 1, 1, co.edu.uniandes.metamodels.Html.OBJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(framesetEClass, co.edu.uniandes.metamodels.Html.FRAMESET.class, "FRAMESET", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFRAMESET_Rows(), ecorePackage.getEString(), "rows", null, 1, 1, co.edu.uniandes.metamodels.Html.FRAMESET.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFRAMESET_Cols(), ecorePackage.getEString(), "cols", null, 1, 1, co.edu.uniandes.metamodels.Html.FRAMESET.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFRAMESET_Framespacing(), ecorePackage.getEString(), "framespacing", null, 1, 1, co.edu.uniandes.metamodels.Html.FRAMESET.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFRAMESET_Frameborder(), ecorePackage.getEString(), "frameborder", null, 1, 1, co.edu.uniandes.metamodels.Html.FRAMESET.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFRAMESET_Border(), ecorePackage.getEString(), "border", null, 1, 1, co.edu.uniandes.metamodels.Html.FRAMESET.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(frameEClass, co.edu.uniandes.metamodels.Html.FRAME.class, "FRAME", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFRAME_Src(), ecorePackage.getEString(), "src", null, 1, 1, co.edu.uniandes.metamodels.Html.FRAME.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFRAME_Name(), ecorePackage.getEString(), "name", null, 1, 1, co.edu.uniandes.metamodels.Html.FRAME.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFRAME_Marginwidth(), ecorePackage.getEString(), "marginwidth", null, 1, 1, co.edu.uniandes.metamodels.Html.FRAME.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFRAME_Marginheight(), ecorePackage.getEString(), "marginheight", null, 1, 1, co.edu.uniandes.metamodels.Html.FRAME.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFRAME_Scrolling(), ecorePackage.getEString(), "scrolling", null, 1, 1, co.edu.uniandes.metamodels.Html.FRAME.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFRAME_Noresize(), ecorePackage.getEString(), "noresize", null, 1, 1, co.edu.uniandes.metamodels.Html.FRAME.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(noframeEClass, co.edu.uniandes.metamodels.Html.NOFRAME.class, "NOFRAME", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iframeEClass, co.edu.uniandes.metamodels.Html.IFRAME.class, "IFRAME", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //HtmlPackageImpl
