/**
 */
package co.edu.uniandes.metamodels.Html.impl;

import co.edu.uniandes.metamodels.Html.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HtmlFactoryImpl extends EFactoryImpl implements HtmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HtmlFactory init() {
		try {
			HtmlFactory theHtmlFactory = (HtmlFactory)EPackage.Registry.INSTANCE.getEFactory(HtmlPackage.eNS_URI);
			if (theHtmlFactory != null) {
				return theHtmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HtmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HtmlPackage.HTML: return createHTML();
			case HtmlPackage.HTML_ELEMENT: return createHTMLElement();
			case HtmlPackage.HEAD: return createHEAD();
			case HtmlPackage.LINK: return createLINK();
			case HtmlPackage.TITLE: return createTITLE();
			case HtmlPackage.BODY: return createBODY();
			case HtmlPackage.H1: return createH1();
			case HtmlPackage.H2: return createH2();
			case HtmlPackage.H3: return createH3();
			case HtmlPackage.H4: return createH4();
			case HtmlPackage.EM: return createEM();
			case HtmlPackage.STRONG: return createSTRONG();
			case HtmlPackage.B: return createB();
			case HtmlPackage.I: return createI();
			case HtmlPackage.TT: return createTT();
			case HtmlPackage.PRE: return createPRE();
			case HtmlPackage.BIG: return createBIG();
			case HtmlPackage.SMALL: return createSMALL();
			case HtmlPackage.SUB: return createSUB();
			case HtmlPackage.SUP: return createSUP();
			case HtmlPackage.STRIKE: return createSTRIKE();
			case HtmlPackage.FONT: return createFONT();
			case HtmlPackage.IMG: return createIMG();
			case HtmlPackage.BR: return createBR();
			case HtmlPackage.MAP: return createMAP();
			case HtmlPackage.AREA: return createAREA();
			case HtmlPackage.STYLE: return createSTYLE();
			case HtmlPackage.EMBED: return createEMBED();
			case HtmlPackage.NOEMBED: return createNOEMBED();
			case HtmlPackage.SPAN: return createSPAN();
			case HtmlPackage.A: return createA();
			case HtmlPackage.DIV: return createDIV();
			case HtmlPackage.P: return createP();
			case HtmlPackage.TABLE: return createTABLE();
			case HtmlPackage.TR: return createTR();
			case HtmlPackage.TD: return createTD();
			case HtmlPackage.TH: return createTH();
			case HtmlPackage.FORM: return createFORM();
			case HtmlPackage.INPUT: return createINPUT();
			case HtmlPackage.TEXTAREA: return createTEXTAREA();
			case HtmlPackage.SELECT: return createSELECT();
			case HtmlPackage.OPTION: return createOPTION();
			case HtmlPackage.OL: return createOL();
			case HtmlPackage.UL: return createUL();
			case HtmlPackage.LI: return createLI();
			case HtmlPackage.DL: return createDL();
			case HtmlPackage.DT: return createDT();
			case HtmlPackage.DD: return createDD();
			case HtmlPackage.APPLET: return createAPPLET();
			case HtmlPackage.PARAM: return createPARAM();
			case HtmlPackage.OBJECT: return createOBJECT();
			case HtmlPackage.FRAMESET: return createFRAMESET();
			case HtmlPackage.FRAME: return createFRAME();
			case HtmlPackage.NOFRAME: return createNOFRAME();
			case HtmlPackage.IFRAME: return createIFRAME();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTML createHTML() {
		HTMLImpl html = new HTMLImpl();
		return html;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTMLElement createHTMLElement() {
		HTMLElementImpl htmlElement = new HTMLElementImpl();
		return htmlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HEAD createHEAD() {
		HEADImpl head = new HEADImpl();
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LINK createLINK() {
		LINKImpl link = new LINKImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TITLE createTITLE() {
		TITLEImpl title = new TITLEImpl();
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BODY createBODY() {
		BODYImpl body = new BODYImpl();
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H1 createH1() {
		H1Impl h1 = new H1Impl();
		return h1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H2 createH2() {
		H2Impl h2 = new H2Impl();
		return h2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H3 createH3() {
		H3Impl h3 = new H3Impl();
		return h3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H4 createH4() {
		H4Impl h4 = new H4Impl();
		return h4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EM createEM() {
		EMImpl em = new EMImpl();
		return em;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STRONG createSTRONG() {
		STRONGImpl strong = new STRONGImpl();
		return strong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B createB() {
		BImpl b = new BImpl();
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I createI() {
		IImpl i = new IImpl();
		return i;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TT createTT() {
		TTImpl tt = new TTImpl();
		return tt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRE createPRE() {
		PREImpl pre = new PREImpl();
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BIG createBIG() {
		BIGImpl big = new BIGImpl();
		return big;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMALL createSMALL() {
		SMALLImpl small = new SMALLImpl();
		return small;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUB createSUB() {
		SUBImpl sub = new SUBImpl();
		return sub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUP createSUP() {
		SUPImpl sup = new SUPImpl();
		return sup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STRIKE createSTRIKE() {
		STRIKEImpl strike = new STRIKEImpl();
		return strike;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FONT createFONT() {
		FONTImpl font = new FONTImpl();
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMG createIMG() {
		IMGImpl img = new IMGImpl();
		return img;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BR createBR() {
		BRImpl br = new BRImpl();
		return br;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAP createMAP() {
		MAPImpl map = new MAPImpl();
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AREA createAREA() {
		AREAImpl area = new AREAImpl();
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STYLE createSTYLE() {
		STYLEImpl style = new STYLEImpl();
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMBED createEMBED() {
		EMBEDImpl embed = new EMBEDImpl();
		return embed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NOEMBED createNOEMBED() {
		NOEMBEDImpl noembed = new NOEMBEDImpl();
		return noembed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPAN createSPAN() {
		SPANImpl span = new SPANImpl();
		return span;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A createA() {
		AImpl a = new AImpl();
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DIV createDIV() {
		DIVImpl div = new DIVImpl();
		return div;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P createP() {
		PImpl p = new PImpl();
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TABLE createTABLE() {
		TABLEImpl table = new TABLEImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TR createTR() {
		TRImpl tr = new TRImpl();
		return tr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TD createTD() {
		TDImpl td = new TDImpl();
		return td;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TH createTH() {
		THImpl th = new THImpl();
		return th;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FORM createFORM() {
		FORMImpl form = new FORMImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INPUT createINPUT() {
		INPUTImpl input = new INPUTImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEXTAREA createTEXTAREA() {
		TEXTAREAImpl textarea = new TEXTAREAImpl();
		return textarea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SELECT createSELECT() {
		SELECTImpl select = new SELECTImpl();
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPTION createOPTION() {
		OPTIONImpl option = new OPTIONImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OL createOL() {
		OLImpl ol = new OLImpl();
		return ol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UL createUL() {
		ULImpl ul = new ULImpl();
		return ul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LI createLI() {
		LIImpl li = new LIImpl();
		return li;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DL createDL() {
		DLImpl dl = new DLImpl();
		return dl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DT createDT() {
		DTImpl dt = new DTImpl();
		return dt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DD createDD() {
		DDImpl dd = new DDImpl();
		return dd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APPLET createAPPLET() {
		APPLETImpl applet = new APPLETImpl();
		return applet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PARAM createPARAM() {
		PARAMImpl param = new PARAMImpl();
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBJECT createOBJECT() {
		OBJECTImpl object = new OBJECTImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FRAMESET createFRAMESET() {
		FRAMESETImpl frameset = new FRAMESETImpl();
		return frameset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FRAME createFRAME() {
		FRAMEImpl frame = new FRAMEImpl();
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NOFRAME createNOFRAME() {
		NOFRAMEImpl noframe = new NOFRAMEImpl();
		return noframe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFRAME createIFRAME() {
		IFRAMEImpl iframe = new IFRAMEImpl();
		return iframe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlPackage getHtmlPackage() {
		return (HtmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HtmlPackage getPackage() {
		return HtmlPackage.eINSTANCE;
	}

} //HtmlFactoryImpl
