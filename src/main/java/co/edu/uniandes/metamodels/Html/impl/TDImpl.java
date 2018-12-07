/**
 */
package co.edu.uniandes.metamodels.Html.impl;

import co.edu.uniandes.metamodels.Html.HtmlPackage;
import co.edu.uniandes.metamodels.Html.TD;
import co.edu.uniandes.metamodels.Html.TR;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.TDImpl#getColspan <em>Colspan</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.TDImpl#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.TDImpl#getValign <em>Valign</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.TDImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.TDImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.TDImpl#getTr <em>Tr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TDImpl extends TABLEElementImpl implements TD {
	/**
	 * The default value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColspan()
	 * @generated
	 * @ordered
	 */
	protected static final String COLSPAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColspan()
	 * @generated
	 * @ordered
	 */
	protected String colspan = COLSPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspan()
	 * @generated
	 * @ordered
	 */
	protected static final String ROWSPAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspan()
	 * @generated
	 * @ordered
	 */
	protected String rowspan = ROWSPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected String valign = VALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected String align = ALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTr() <em>Tr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTr()
	 * @generated
	 * @ordered
	 */
	protected TR tr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.TD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColspan() {
		return colspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColspan(String newColspan) {
		String oldColspan = colspan;
		colspan = newColspan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.TD__COLSPAN, oldColspan, colspan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRowspan() {
		return rowspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowspan(String newRowspan) {
		String oldRowspan = rowspan;
		rowspan = newRowspan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.TD__ROWSPAN, oldRowspan, rowspan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValign() {
		return valign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValign(String newValign) {
		String oldValign = valign;
		valign = newValign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.TD__VALIGN, oldValign, valign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlign(String newAlign) {
		String oldAlign = align;
		align = newAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.TD__ALIGN, oldAlign, align));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.TD__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TR getTr() {
		if (tr != null && tr.eIsProxy()) {
			InternalEObject oldTr = (InternalEObject)tr;
			tr = (TR)eResolveProxy(oldTr);
			if (tr != oldTr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HtmlPackage.TD__TR, oldTr, tr));
			}
		}
		return tr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TR basicGetTr() {
		return tr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTr(TR newTr, NotificationChain msgs) {
		TR oldTr = tr;
		tr = newTr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HtmlPackage.TD__TR, oldTr, newTr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTr(TR newTr) {
		if (newTr != tr) {
			NotificationChain msgs = null;
			if (tr != null)
				msgs = ((InternalEObject)tr).eInverseRemove(this, HtmlPackage.TR__TDS, TR.class, msgs);
			if (newTr != null)
				msgs = ((InternalEObject)newTr).eInverseAdd(this, HtmlPackage.TR__TDS, TR.class, msgs);
			msgs = basicSetTr(newTr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.TD__TR, newTr, newTr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.TD__TR:
				if (tr != null)
					msgs = ((InternalEObject)tr).eInverseRemove(this, HtmlPackage.TR__TDS, TR.class, msgs);
				return basicSetTr((TR)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.TD__TR:
				return basicSetTr(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.TD__COLSPAN:
				return getColspan();
			case HtmlPackage.TD__ROWSPAN:
				return getRowspan();
			case HtmlPackage.TD__VALIGN:
				return getValign();
			case HtmlPackage.TD__ALIGN:
				return getAlign();
			case HtmlPackage.TD__WIDTH:
				return getWidth();
			case HtmlPackage.TD__TR:
				if (resolve) return getTr();
				return basicGetTr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HtmlPackage.TD__COLSPAN:
				setColspan((String)newValue);
				return;
			case HtmlPackage.TD__ROWSPAN:
				setRowspan((String)newValue);
				return;
			case HtmlPackage.TD__VALIGN:
				setValign((String)newValue);
				return;
			case HtmlPackage.TD__ALIGN:
				setAlign((String)newValue);
				return;
			case HtmlPackage.TD__WIDTH:
				setWidth((String)newValue);
				return;
			case HtmlPackage.TD__TR:
				setTr((TR)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HtmlPackage.TD__COLSPAN:
				setColspan(COLSPAN_EDEFAULT);
				return;
			case HtmlPackage.TD__ROWSPAN:
				setRowspan(ROWSPAN_EDEFAULT);
				return;
			case HtmlPackage.TD__VALIGN:
				setValign(VALIGN_EDEFAULT);
				return;
			case HtmlPackage.TD__ALIGN:
				setAlign(ALIGN_EDEFAULT);
				return;
			case HtmlPackage.TD__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case HtmlPackage.TD__TR:
				setTr((TR)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HtmlPackage.TD__COLSPAN:
				return COLSPAN_EDEFAULT == null ? colspan != null : !COLSPAN_EDEFAULT.equals(colspan);
			case HtmlPackage.TD__ROWSPAN:
				return ROWSPAN_EDEFAULT == null ? rowspan != null : !ROWSPAN_EDEFAULT.equals(rowspan);
			case HtmlPackage.TD__VALIGN:
				return VALIGN_EDEFAULT == null ? valign != null : !VALIGN_EDEFAULT.equals(valign);
			case HtmlPackage.TD__ALIGN:
				return ALIGN_EDEFAULT == null ? align != null : !ALIGN_EDEFAULT.equals(align);
			case HtmlPackage.TD__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case HtmlPackage.TD__TR:
				return tr != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (colspan: ");
		result.append(colspan);
		result.append(", rowspan: ");
		result.append(rowspan);
		result.append(", valign: ");
		result.append(valign);
		result.append(", align: ");
		result.append(align);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //TDImpl
