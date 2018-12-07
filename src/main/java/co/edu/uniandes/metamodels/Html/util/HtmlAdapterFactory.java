/**
 */
package co.edu.uniandes.metamodels.Html.util;

import co.edu.uniandes.metamodels.Html.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.metamodels.Html.HtmlPackage
 * @generated
 */
public class HtmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HtmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HtmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HtmlSwitch<Adapter> modelSwitch =
		new HtmlSwitch<Adapter>() {
			@Override
			public Adapter caseHTML(HTML object) {
				return createHTMLAdapter();
			}
			@Override
			public Adapter caseHTMLElement(HTMLElement object) {
				return createHTMLElementAdapter();
			}
			@Override
			public Adapter caseHEAD(HEAD object) {
				return createHEADAdapter();
			}
			@Override
			public Adapter caseHEADElement(HEADElement object) {
				return createHEADElementAdapter();
			}
			@Override
			public Adapter caseLINK(LINK object) {
				return createLINKAdapter();
			}
			@Override
			public Adapter caseTITLE(TITLE object) {
				return createTITLEAdapter();
			}
			@Override
			public Adapter caseBODY(BODY object) {
				return createBODYAdapter();
			}
			@Override
			public Adapter caseBODYElement(BODYElement object) {
				return createBODYElementAdapter();
			}
			@Override
			public Adapter caseH1(H1 object) {
				return createH1Adapter();
			}
			@Override
			public Adapter caseH2(H2 object) {
				return createH2Adapter();
			}
			@Override
			public Adapter caseH3(H3 object) {
				return createH3Adapter();
			}
			@Override
			public Adapter caseH4(H4 object) {
				return createH4Adapter();
			}
			@Override
			public Adapter caseEM(EM object) {
				return createEMAdapter();
			}
			@Override
			public Adapter caseSTRONG(STRONG object) {
				return createSTRONGAdapter();
			}
			@Override
			public Adapter caseB(B object) {
				return createBAdapter();
			}
			@Override
			public Adapter caseI(I object) {
				return createIAdapter();
			}
			@Override
			public Adapter caseTT(TT object) {
				return createTTAdapter();
			}
			@Override
			public Adapter casePRE(PRE object) {
				return createPREAdapter();
			}
			@Override
			public Adapter caseBIG(BIG object) {
				return createBIGAdapter();
			}
			@Override
			public Adapter caseSMALL(SMALL object) {
				return createSMALLAdapter();
			}
			@Override
			public Adapter caseSUB(SUB object) {
				return createSUBAdapter();
			}
			@Override
			public Adapter caseSUP(SUP object) {
				return createSUPAdapter();
			}
			@Override
			public Adapter caseSTRIKE(STRIKE object) {
				return createSTRIKEAdapter();
			}
			@Override
			public Adapter caseFONT(FONT object) {
				return createFONTAdapter();
			}
			@Override
			public Adapter caseIMG(IMG object) {
				return createIMGAdapter();
			}
			@Override
			public Adapter caseBR(BR object) {
				return createBRAdapter();
			}
			@Override
			public Adapter caseMAP(MAP object) {
				return createMAPAdapter();
			}
			@Override
			public Adapter caseAREA(AREA object) {
				return createAREAAdapter();
			}
			@Override
			public Adapter caseSTYLE(STYLE object) {
				return createSTYLEAdapter();
			}
			@Override
			public Adapter caseEMBED(EMBED object) {
				return createEMBEDAdapter();
			}
			@Override
			public Adapter caseNOEMBED(NOEMBED object) {
				return createNOEMBEDAdapter();
			}
			@Override
			public Adapter caseSPAN(SPAN object) {
				return createSPANAdapter();
			}
			@Override
			public Adapter caseA(A object) {
				return createAAdapter();
			}
			@Override
			public Adapter caseDIV(DIV object) {
				return createDIVAdapter();
			}
			@Override
			public Adapter caseP(P object) {
				return createPAdapter();
			}
			@Override
			public Adapter caseTABLEElement(TABLEElement object) {
				return createTABLEElementAdapter();
			}
			@Override
			public Adapter caseTABLE(TABLE object) {
				return createTABLEAdapter();
			}
			@Override
			public Adapter caseTR(TR object) {
				return createTRAdapter();
			}
			@Override
			public Adapter caseTD(TD object) {
				return createTDAdapter();
			}
			@Override
			public Adapter caseTH(TH object) {
				return createTHAdapter();
			}
			@Override
			public Adapter caseFORM(FORM object) {
				return createFORMAdapter();
			}
			@Override
			public Adapter caseINPUT(INPUT object) {
				return createINPUTAdapter();
			}
			@Override
			public Adapter caseTEXTAREA(TEXTAREA object) {
				return createTEXTAREAAdapter();
			}
			@Override
			public Adapter caseSELECT(SELECT object) {
				return createSELECTAdapter();
			}
			@Override
			public Adapter caseOPTION(OPTION object) {
				return createOPTIONAdapter();
			}
			@Override
			public Adapter caseListElement(ListElement object) {
				return createListElementAdapter();
			}
			@Override
			public Adapter caseOL(OL object) {
				return createOLAdapter();
			}
			@Override
			public Adapter caseUL(UL object) {
				return createULAdapter();
			}
			@Override
			public Adapter caseLI(LI object) {
				return createLIAdapter();
			}
			@Override
			public Adapter caseDL(DL object) {
				return createDLAdapter();
			}
			@Override
			public Adapter caseDT(DT object) {
				return createDTAdapter();
			}
			@Override
			public Adapter caseDD(DD object) {
				return createDDAdapter();
			}
			@Override
			public Adapter caseAPPLET(APPLET object) {
				return createAPPLETAdapter();
			}
			@Override
			public Adapter casePARAM(PARAM object) {
				return createPARAMAdapter();
			}
			@Override
			public Adapter caseOBJECT(OBJECT object) {
				return createOBJECTAdapter();
			}
			@Override
			public Adapter caseFRAMESET(FRAMESET object) {
				return createFRAMESETAdapter();
			}
			@Override
			public Adapter caseFRAME(FRAME object) {
				return createFRAMEAdapter();
			}
			@Override
			public Adapter caseNOFRAME(NOFRAME object) {
				return createNOFRAMEAdapter();
			}
			@Override
			public Adapter caseIFRAME(IFRAME object) {
				return createIFRAMEAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.HTML <em>HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.HTML
	 * @generated
	 */
	public Adapter createHTMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.HTMLElement <em>HTML Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.HTMLElement
	 * @generated
	 */
	public Adapter createHTMLElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.HEAD <em>HEAD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.HEAD
	 * @generated
	 */
	public Adapter createHEADAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.HEADElement <em>HEAD Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.HEADElement
	 * @generated
	 */
	public Adapter createHEADElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.LINK <em>LINK</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.LINK
	 * @generated
	 */
	public Adapter createLINKAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.TITLE <em>TITLE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.TITLE
	 * @generated
	 */
	public Adapter createTITLEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.BODY <em>BODY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.BODY
	 * @generated
	 */
	public Adapter createBODYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.BODYElement <em>BODY Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.BODYElement
	 * @generated
	 */
	public Adapter createBODYElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.H1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.H1
	 * @generated
	 */
	public Adapter createH1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.H2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.H2
	 * @generated
	 */
	public Adapter createH2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.H3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.H3
	 * @generated
	 */
	public Adapter createH3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.H4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.H4
	 * @generated
	 */
	public Adapter createH4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.EM <em>EM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.EM
	 * @generated
	 */
	public Adapter createEMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.STRONG <em>STRONG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.STRONG
	 * @generated
	 */
	public Adapter createSTRONGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.B <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.B
	 * @generated
	 */
	public Adapter createBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.I <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.I
	 * @generated
	 */
	public Adapter createIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.TT <em>TT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.TT
	 * @generated
	 */
	public Adapter createTTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.PRE <em>PRE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.PRE
	 * @generated
	 */
	public Adapter createPREAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.BIG <em>BIG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.BIG
	 * @generated
	 */
	public Adapter createBIGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.SMALL <em>SMALL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.SMALL
	 * @generated
	 */
	public Adapter createSMALLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.SUB <em>SUB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.SUB
	 * @generated
	 */
	public Adapter createSUBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.SUP <em>SUP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.SUP
	 * @generated
	 */
	public Adapter createSUPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.STRIKE <em>STRIKE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.STRIKE
	 * @generated
	 */
	public Adapter createSTRIKEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.FONT <em>FONT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.FONT
	 * @generated
	 */
	public Adapter createFONTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.IMG <em>IMG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.IMG
	 * @generated
	 */
	public Adapter createIMGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.BR <em>BR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.BR
	 * @generated
	 */
	public Adapter createBRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.MAP <em>MAP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.MAP
	 * @generated
	 */
	public Adapter createMAPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.AREA <em>AREA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.AREA
	 * @generated
	 */
	public Adapter createAREAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.STYLE <em>STYLE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.STYLE
	 * @generated
	 */
	public Adapter createSTYLEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.EMBED <em>EMBED</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.EMBED
	 * @generated
	 */
	public Adapter createEMBEDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.NOEMBED <em>NOEMBED</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.NOEMBED
	 * @generated
	 */
	public Adapter createNOEMBEDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.SPAN <em>SPAN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.SPAN
	 * @generated
	 */
	public Adapter createSPANAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.A <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.A
	 * @generated
	 */
	public Adapter createAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.DIV <em>DIV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.DIV
	 * @generated
	 */
	public Adapter createDIVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.P <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.P
	 * @generated
	 */
	public Adapter createPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.TABLEElement <em>TABLE Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.TABLEElement
	 * @generated
	 */
	public Adapter createTABLEElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.TABLE <em>TABLE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.TABLE
	 * @generated
	 */
	public Adapter createTABLEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.TR <em>TR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.TR
	 * @generated
	 */
	public Adapter createTRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.TD <em>TD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.TD
	 * @generated
	 */
	public Adapter createTDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.TH <em>TH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.TH
	 * @generated
	 */
	public Adapter createTHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.FORM <em>FORM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.FORM
	 * @generated
	 */
	public Adapter createFORMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.INPUT <em>INPUT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.INPUT
	 * @generated
	 */
	public Adapter createINPUTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.TEXTAREA <em>TEXTAREA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.TEXTAREA
	 * @generated
	 */
	public Adapter createTEXTAREAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.SELECT <em>SELECT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.SELECT
	 * @generated
	 */
	public Adapter createSELECTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.OPTION <em>OPTION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.OPTION
	 * @generated
	 */
	public Adapter createOPTIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.ListElement <em>List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.ListElement
	 * @generated
	 */
	public Adapter createListElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.OL <em>OL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.OL
	 * @generated
	 */
	public Adapter createOLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.UL <em>UL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.UL
	 * @generated
	 */
	public Adapter createULAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.LI <em>LI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.LI
	 * @generated
	 */
	public Adapter createLIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.DL <em>DL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.DL
	 * @generated
	 */
	public Adapter createDLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.DT <em>DT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.DT
	 * @generated
	 */
	public Adapter createDTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.DD <em>DD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.DD
	 * @generated
	 */
	public Adapter createDDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.APPLET <em>APPLET</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.APPLET
	 * @generated
	 */
	public Adapter createAPPLETAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.PARAM <em>PARAM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.PARAM
	 * @generated
	 */
	public Adapter createPARAMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.OBJECT <em>OBJECT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.OBJECT
	 * @generated
	 */
	public Adapter createOBJECTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.FRAMESET <em>FRAMESET</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.FRAMESET
	 * @generated
	 */
	public Adapter createFRAMESETAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.FRAME <em>FRAME</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.FRAME
	 * @generated
	 */
	public Adapter createFRAMEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.NOFRAME <em>NOFRAME</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.NOFRAME
	 * @generated
	 */
	public Adapter createNOFRAMEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link co.edu.uniandes.metamodels.Html.IFRAME <em>IFRAME</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.edu.uniandes.metamodels.Html.IFRAME
	 * @generated
	 */
	public Adapter createIFRAMEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HtmlAdapterFactory
