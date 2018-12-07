/**
 */
package co.edu.uniandes.metamodels.Html.impl;

import co.edu.uniandes.metamodels.Html.HtmlPackage;
import co.edu.uniandes.metamodels.Html.TABLEElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TABLE Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.TABLEElementImpl#getBgcolor <em>Bgcolor</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.TABLEElementImpl#getBackground <em>Background</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TABLEElementImpl extends BODYElementImpl implements TABLEElement {
	/**
	 * The default value of the '{@link #getBgcolor() <em>Bgcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgcolor()
	 * @generated
	 * @ordered
	 */
	protected static final String BGCOLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBgcolor() <em>Bgcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgcolor()
	 * @generated
	 * @ordered
	 */
	protected String bgcolor = BGCOLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected String background = BACKGROUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TABLEElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.TABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBgcolor() {
		return bgcolor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBgcolor(String newBgcolor) {
		String oldBgcolor = bgcolor;
		bgcolor = newBgcolor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.TABLE_ELEMENT__BGCOLOR, oldBgcolor, bgcolor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(String newBackground) {
		String oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.TABLE_ELEMENT__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.TABLE_ELEMENT__BGCOLOR:
				return getBgcolor();
			case HtmlPackage.TABLE_ELEMENT__BACKGROUND:
				return getBackground();
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
			case HtmlPackage.TABLE_ELEMENT__BGCOLOR:
				setBgcolor((String)newValue);
				return;
			case HtmlPackage.TABLE_ELEMENT__BACKGROUND:
				setBackground((String)newValue);
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
			case HtmlPackage.TABLE_ELEMENT__BGCOLOR:
				setBgcolor(BGCOLOR_EDEFAULT);
				return;
			case HtmlPackage.TABLE_ELEMENT__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
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
			case HtmlPackage.TABLE_ELEMENT__BGCOLOR:
				return BGCOLOR_EDEFAULT == null ? bgcolor != null : !BGCOLOR_EDEFAULT.equals(bgcolor);
			case HtmlPackage.TABLE_ELEMENT__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
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
		result.append(" (bgcolor: ");
		result.append(bgcolor);
		result.append(", background: ");
		result.append(background);
		result.append(')');
		return result.toString();
	}

} //TABLEElementImpl
