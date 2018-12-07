/**
 */
package co.edu.uniandes.metamodels.Html.util;

import co.edu.uniandes.metamodels.Html.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.metamodels.Html.HtmlPackage
 * @generated
 */
public class HtmlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HtmlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlSwitch() {
		if (modelPackage == null) {
			modelPackage = HtmlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HtmlPackage.HTML: {
				HTML html = (HTML)theEObject;
				T result = caseHTML(html);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.HTML_ELEMENT: {
				HTMLElement htmlElement = (HTMLElement)theEObject;
				T result = caseHTMLElement(htmlElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.HEAD: {
				HEAD head = (HEAD)theEObject;
				T result = caseHEAD(head);
				if (result == null) result = caseHTMLElement(head);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.HEAD_ELEMENT: {
				HEADElement headElement = (HEADElement)theEObject;
				T result = caseHEADElement(headElement);
				if (result == null) result = caseHTMLElement(headElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.LINK: {
				LINK link = (LINK)theEObject;
				T result = caseLINK(link);
				if (result == null) result = caseHEADElement(link);
				if (result == null) result = caseHTMLElement(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.TITLE: {
				TITLE title = (TITLE)theEObject;
				T result = caseTITLE(title);
				if (result == null) result = caseHEADElement(title);
				if (result == null) result = caseHTMLElement(title);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.BODY: {
				BODY body = (BODY)theEObject;
				T result = caseBODY(body);
				if (result == null) result = caseHTMLElement(body);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.BODY_ELEMENT: {
				BODYElement bodyElement = (BODYElement)theEObject;
				T result = caseBODYElement(bodyElement);
				if (result == null) result = caseHTMLElement(bodyElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.H1: {
				H1 h1 = (H1)theEObject;
				T result = caseH1(h1);
				if (result == null) result = caseBODYElement(h1);
				if (result == null) result = caseHTMLElement(h1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.H2: {
				H2 h2 = (H2)theEObject;
				T result = caseH2(h2);
				if (result == null) result = caseBODYElement(h2);
				if (result == null) result = caseHTMLElement(h2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.H3: {
				H3 h3 = (H3)theEObject;
				T result = caseH3(h3);
				if (result == null) result = caseBODYElement(h3);
				if (result == null) result = caseHTMLElement(h3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.H4: {
				H4 h4 = (H4)theEObject;
				T result = caseH4(h4);
				if (result == null) result = caseBODYElement(h4);
				if (result == null) result = caseHTMLElement(h4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.EM: {
				EM em = (EM)theEObject;
				T result = caseEM(em);
				if (result == null) result = caseBODYElement(em);
				if (result == null) result = caseHTMLElement(em);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.STRONG: {
				STRONG strong = (STRONG)theEObject;
				T result = caseSTRONG(strong);
				if (result == null) result = caseBODYElement(strong);
				if (result == null) result = caseHTMLElement(strong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.B: {
				B b = (B)theEObject;
				T result = caseB(b);
				if (result == null) result = caseBODYElement(b);
				if (result == null) result = caseHTMLElement(b);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.I: {
				I i = (I)theEObject;
				T result = caseI(i);
				if (result == null) result = caseBODYElement(i);
				if (result == null) result = caseHTMLElement(i);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.TT: {
				TT tt = (TT)theEObject;
				T result = caseTT(tt);
				if (result == null) result = caseBODYElement(tt);
				if (result == null) result = caseHTMLElement(tt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.PRE: {
				PRE pre = (PRE)theEObject;
				T result = casePRE(pre);
				if (result == null) result = caseBODYElement(pre);
				if (result == null) result = caseHTMLElement(pre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.BIG: {
				BIG big = (BIG)theEObject;
				T result = caseBIG(big);
				if (result == null) result = caseBODYElement(big);
				if (result == null) result = caseHTMLElement(big);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.SMALL: {
				SMALL small = (SMALL)theEObject;
				T result = caseSMALL(small);
				if (result == null) result = caseBODYElement(small);
				if (result == null) result = caseHTMLElement(small);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.SUB: {
				SUB sub = (SUB)theEObject;
				T result = caseSUB(sub);
				if (result == null) result = caseBODYElement(sub);
				if (result == null) result = caseHTMLElement(sub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.SUP: {
				SUP sup = (SUP)theEObject;
				T result = caseSUP(sup);
				if (result == null) result = caseBODYElement(sup);
				if (result == null) result = caseHTMLElement(sup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.STRIKE: {
				STRIKE strike = (STRIKE)theEObject;
				T result = caseSTRIKE(strike);
				if (result == null) result = caseBODYElement(strike);
				if (result == null) result = caseHTMLElement(strike);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.FONT: {
				FONT font = (FONT)theEObject;
				T result = caseFONT(font);
				if (result == null) result = caseBODYElement(font);
				if (result == null) result = caseHTMLElement(font);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.IMG: {
				IMG img = (IMG)theEObject;
				T result = caseIMG(img);
				if (result == null) result = caseBODYElement(img);
				if (result == null) result = caseHTMLElement(img);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.BR: {
				BR br = (BR)theEObject;
				T result = caseBR(br);
				if (result == null) result = caseBODYElement(br);
				if (result == null) result = caseHTMLElement(br);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.MAP: {
				MAP map = (MAP)theEObject;
				T result = caseMAP(map);
				if (result == null) result = caseBODYElement(map);
				if (result == null) result = caseHTMLElement(map);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.AREA: {
				AREA area = (AREA)theEObject;
				T result = caseAREA(area);
				if (result == null) result = caseBODYElement(area);
				if (result == null) result = caseHTMLElement(area);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.STYLE: {
				STYLE style = (STYLE)theEObject;
				T result = caseSTYLE(style);
				if (result == null) result = caseBODYElement(style);
				if (result == null) result = caseHTMLElement(style);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.EMBED: {
				EMBED embed = (EMBED)theEObject;
				T result = caseEMBED(embed);
				if (result == null) result = caseBODYElement(embed);
				if (result == null) result = caseHTMLElement(embed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.NOEMBED: {
				NOEMBED noembed = (NOEMBED)theEObject;
				T result = caseNOEMBED(noembed);
				if (result == null) result = caseBODYElement(noembed);
				if (result == null) result = caseHTMLElement(noembed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.SPAN: {
				SPAN span = (SPAN)theEObject;
				T result = caseSPAN(span);
				if (result == null) result = caseBODYElement(span);
				if (result == null) result = caseHTMLElement(span);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.A: {
				A a = (A)theEObject;
				T result = caseA(a);
				if (result == null) result = caseBODYElement(a);
				if (result == null) result = caseHTMLElement(a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.DIV: {
				DIV div = (DIV)theEObject;
				T result = caseDIV(div);
				if (result == null) result = caseBODYElement(div);
				if (result == null) result = caseHTMLElement(div);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.P: {
				P p = (P)theEObject;
				T result = caseP(p);
				if (result == null) result = caseBODYElement(p);
				if (result == null) result = caseHTMLElement(p);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.TABLE_ELEMENT: {
				TABLEElement tableElement = (TABLEElement)theEObject;
				T result = caseTABLEElement(tableElement);
				if (result == null) result = caseBODYElement(tableElement);
				if (result == null) result = caseHTMLElement(tableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.TABLE: {
				TABLE table = (TABLE)theEObject;
				T result = caseTABLE(table);
				if (result == null) result = caseTABLEElement(table);
				if (result == null) result = caseBODYElement(table);
				if (result == null) result = caseHTMLElement(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.TR: {
				TR tr = (TR)theEObject;
				T result = caseTR(tr);
				if (result == null) result = caseTABLEElement(tr);
				if (result == null) result = caseBODYElement(tr);
				if (result == null) result = caseHTMLElement(tr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.TD: {
				TD td = (TD)theEObject;
				T result = caseTD(td);
				if (result == null) result = caseTABLEElement(td);
				if (result == null) result = caseBODYElement(td);
				if (result == null) result = caseHTMLElement(td);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.TH: {
				TH th = (TH)theEObject;
				T result = caseTH(th);
				if (result == null) result = caseTD(th);
				if (result == null) result = caseTABLEElement(th);
				if (result == null) result = caseBODYElement(th);
				if (result == null) result = caseHTMLElement(th);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.FORM: {
				FORM form = (FORM)theEObject;
				T result = caseFORM(form);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.INPUT: {
				INPUT input = (INPUT)theEObject;
				T result = caseINPUT(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.TEXTAREA: {
				TEXTAREA textarea = (TEXTAREA)theEObject;
				T result = caseTEXTAREA(textarea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.SELECT: {
				SELECT select = (SELECT)theEObject;
				T result = caseSELECT(select);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.OPTION: {
				OPTION option = (OPTION)theEObject;
				T result = caseOPTION(option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.LIST_ELEMENT: {
				ListElement listElement = (ListElement)theEObject;
				T result = caseListElement(listElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.OL: {
				OL ol = (OL)theEObject;
				T result = caseOL(ol);
				if (result == null) result = caseListElement(ol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.UL: {
				UL ul = (UL)theEObject;
				T result = caseUL(ul);
				if (result == null) result = caseListElement(ul);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.LI: {
				LI li = (LI)theEObject;
				T result = caseLI(li);
				if (result == null) result = caseListElement(li);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.DL: {
				DL dl = (DL)theEObject;
				T result = caseDL(dl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.DT: {
				DT dt = (DT)theEObject;
				T result = caseDT(dt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.DD: {
				DD dd = (DD)theEObject;
				T result = caseDD(dd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.APPLET: {
				APPLET applet = (APPLET)theEObject;
				T result = caseAPPLET(applet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.PARAM: {
				PARAM param = (PARAM)theEObject;
				T result = casePARAM(param);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.OBJECT: {
				OBJECT object = (OBJECT)theEObject;
				T result = caseOBJECT(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.FRAMESET: {
				FRAMESET frameset = (FRAMESET)theEObject;
				T result = caseFRAMESET(frameset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.FRAME: {
				FRAME frame = (FRAME)theEObject;
				T result = caseFRAME(frame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.NOFRAME: {
				NOFRAME noframe = (NOFRAME)theEObject;
				T result = caseNOFRAME(noframe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HtmlPackage.IFRAME: {
				IFRAME iframe = (IFRAME)theEObject;
				T result = caseIFRAME(iframe);
				if (result == null) result = caseFRAME(iframe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTML</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTML</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTML(HTML object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTML Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTML Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTMLElement(HTMLElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HEAD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HEAD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHEAD(HEAD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HEAD Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HEAD Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHEADElement(HEADElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LINK</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LINK</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLINK(LINK object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TITLE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TITLE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTITLE(TITLE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BODY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BODY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBODY(BODY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BODY Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BODY Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBODYElement(BODYElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH1(H1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH2(H2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH3(H3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH4(H4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEM(EM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STRONG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STRONG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTRONG(STRONG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>B</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>B</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseB(B object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI(I object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTT(TT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRE(PRE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BIG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BIG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBIG(BIG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SMALL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SMALL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSMALL(SMALL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SUB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SUB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSUB(SUB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SUP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SUP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSUP(SUP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STRIKE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STRIKE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTRIKE(STRIKE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FONT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FONT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFONT(FONT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMG(IMG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBR(BR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAP(MAP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AREA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AREA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAREA(AREA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STYLE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STYLE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTYLE(STYLE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMBED</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMBED</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMBED(EMBED object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NOEMBED</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NOEMBED</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNOEMBED(NOEMBED object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPAN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPAN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPAN(SPAN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA(A object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DIV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DIV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDIV(DIV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>P</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>P</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseP(P object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TABLE Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TABLE Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTABLEElement(TABLEElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TABLE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TABLE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTABLE(TABLE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTR(TR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTD(TD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TH</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TH</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTH(TH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FORM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FORM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFORM(FORM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INPUT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INPUT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINPUT(INPUT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEXTAREA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEXTAREA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEXTAREA(TEXTAREA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SELECT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SELECT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSELECT(SELECT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OPTION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OPTION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPTION(OPTION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListElement(ListElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOL(OL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUL(UL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLI(LI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDL(DL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDT(DT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDD(DD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APPLET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APPLET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPPLET(APPLET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PARAM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PARAM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePARAM(PARAM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OBJECT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OBJECT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOBJECT(OBJECT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FRAMESET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FRAMESET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFRAMESET(FRAMESET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FRAME</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FRAME</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFRAME(FRAME object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NOFRAME</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NOFRAME</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNOFRAME(NOFRAME object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFRAME</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFRAME</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFRAME(IFRAME object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HtmlSwitch
