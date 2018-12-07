/**
 */
package co.edu.uniandes.metamodels.Html.impl;

import co.edu.uniandes.metamodels.Html.FRAME;
import co.edu.uniandes.metamodels.Html.HtmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FRAME</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.FRAMEImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.FRAMEImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.FRAMEImpl#getMarginwidth <em>Marginwidth</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.FRAMEImpl#getMarginheight <em>Marginheight</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.FRAMEImpl#getScrolling <em>Scrolling</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.FRAMEImpl#getNoresize <em>Noresize</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FRAMEImpl extends MinimalEObjectImpl.Container implements FRAME {
	/**
	 * The default value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected String src = SRC_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginwidth() <em>Marginwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginwidth()
	 * @generated
	 * @ordered
	 */
	protected static final String MARGINWIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarginwidth() <em>Marginwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginwidth()
	 * @generated
	 * @ordered
	 */
	protected String marginwidth = MARGINWIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginheight() <em>Marginheight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginheight()
	 * @generated
	 * @ordered
	 */
	protected static final String MARGINHEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarginheight() <em>Marginheight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginheight()
	 * @generated
	 * @ordered
	 */
	protected String marginheight = MARGINHEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getScrolling() <em>Scrolling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrolling()
	 * @generated
	 * @ordered
	 */
	protected static final String SCROLLING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScrolling() <em>Scrolling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrolling()
	 * @generated
	 * @ordered
	 */
	protected String scrolling = SCROLLING_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoresize() <em>Noresize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoresize()
	 * @generated
	 * @ordered
	 */
	protected static final String NORESIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNoresize() <em>Noresize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoresize()
	 * @generated
	 * @ordered
	 */
	protected String noresize = NORESIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FRAMEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.FRAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(String newSrc) {
		String oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAME__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarginwidth() {
		return marginwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginwidth(String newMarginwidth) {
		String oldMarginwidth = marginwidth;
		marginwidth = newMarginwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAME__MARGINWIDTH, oldMarginwidth, marginwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarginheight() {
		return marginheight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginheight(String newMarginheight) {
		String oldMarginheight = marginheight;
		marginheight = newMarginheight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAME__MARGINHEIGHT, oldMarginheight, marginheight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScrolling() {
		return scrolling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrolling(String newScrolling) {
		String oldScrolling = scrolling;
		scrolling = newScrolling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAME__SCROLLING, oldScrolling, scrolling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNoresize() {
		return noresize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoresize(String newNoresize) {
		String oldNoresize = noresize;
		noresize = newNoresize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAME__NORESIZE, oldNoresize, noresize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.FRAME__SRC:
				return getSrc();
			case HtmlPackage.FRAME__NAME:
				return getName();
			case HtmlPackage.FRAME__MARGINWIDTH:
				return getMarginwidth();
			case HtmlPackage.FRAME__MARGINHEIGHT:
				return getMarginheight();
			case HtmlPackage.FRAME__SCROLLING:
				return getScrolling();
			case HtmlPackage.FRAME__NORESIZE:
				return getNoresize();
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
			case HtmlPackage.FRAME__SRC:
				setSrc((String)newValue);
				return;
			case HtmlPackage.FRAME__NAME:
				setName((String)newValue);
				return;
			case HtmlPackage.FRAME__MARGINWIDTH:
				setMarginwidth((String)newValue);
				return;
			case HtmlPackage.FRAME__MARGINHEIGHT:
				setMarginheight((String)newValue);
				return;
			case HtmlPackage.FRAME__SCROLLING:
				setScrolling((String)newValue);
				return;
			case HtmlPackage.FRAME__NORESIZE:
				setNoresize((String)newValue);
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
			case HtmlPackage.FRAME__SRC:
				setSrc(SRC_EDEFAULT);
				return;
			case HtmlPackage.FRAME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HtmlPackage.FRAME__MARGINWIDTH:
				setMarginwidth(MARGINWIDTH_EDEFAULT);
				return;
			case HtmlPackage.FRAME__MARGINHEIGHT:
				setMarginheight(MARGINHEIGHT_EDEFAULT);
				return;
			case HtmlPackage.FRAME__SCROLLING:
				setScrolling(SCROLLING_EDEFAULT);
				return;
			case HtmlPackage.FRAME__NORESIZE:
				setNoresize(NORESIZE_EDEFAULT);
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
			case HtmlPackage.FRAME__SRC:
				return SRC_EDEFAULT == null ? src != null : !SRC_EDEFAULT.equals(src);
			case HtmlPackage.FRAME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HtmlPackage.FRAME__MARGINWIDTH:
				return MARGINWIDTH_EDEFAULT == null ? marginwidth != null : !MARGINWIDTH_EDEFAULT.equals(marginwidth);
			case HtmlPackage.FRAME__MARGINHEIGHT:
				return MARGINHEIGHT_EDEFAULT == null ? marginheight != null : !MARGINHEIGHT_EDEFAULT.equals(marginheight);
			case HtmlPackage.FRAME__SCROLLING:
				return SCROLLING_EDEFAULT == null ? scrolling != null : !SCROLLING_EDEFAULT.equals(scrolling);
			case HtmlPackage.FRAME__NORESIZE:
				return NORESIZE_EDEFAULT == null ? noresize != null : !NORESIZE_EDEFAULT.equals(noresize);
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
		result.append(" (src: ");
		result.append(src);
		result.append(", name: ");
		result.append(name);
		result.append(", marginwidth: ");
		result.append(marginwidth);
		result.append(", marginheight: ");
		result.append(marginheight);
		result.append(", scrolling: ");
		result.append(scrolling);
		result.append(", noresize: ");
		result.append(noresize);
		result.append(')');
		return result.toString();
	}

} //FRAMEImpl
