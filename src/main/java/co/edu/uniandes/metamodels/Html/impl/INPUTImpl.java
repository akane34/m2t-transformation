/**
 */
package co.edu.uniandes.metamodels.Html.impl;

import co.edu.uniandes.metamodels.Html.HtmlPackage;
import co.edu.uniandes.metamodels.Html.INPUT;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>INPUT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.INPUTImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.INPUTImpl#getMaxlength <em>Maxlength</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.INPUTImpl#getSize <em>Size</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.INPUTImpl#getChecked <em>Checked</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.INPUTImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.INPUTImpl#getInputValue <em>Input Value</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.INPUTImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.INPUTImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class INPUTImpl extends MinimalEObjectImpl.Container implements INPUT {
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
	 * The default value of the '{@link #getMaxlength() <em>Maxlength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxlength()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXLENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxlength() <em>Maxlength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxlength()
	 * @generated
	 * @ordered
	 */
	protected String maxlength = MAXLENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChecked() <em>Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecked()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECKED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChecked() <em>Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecked()
	 * @generated
	 * @ordered
	 */
	protected String checked = CHECKED_EDEFAULT;

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
	 * The default value of the '{@link #getInputValue() <em>Input Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValue()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputValue() <em>Input Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValue()
	 * @generated
	 * @ordered
	 */
	protected String inputValue = INPUT_VALUE_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected INPUTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.INPUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.INPUT__ALIGN, oldAlign, align));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxlength() {
		return maxlength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxlength(String newMaxlength) {
		String oldMaxlength = maxlength;
		maxlength = newMaxlength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.INPUT__MAXLENGTH, oldMaxlength, maxlength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.INPUT__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChecked() {
		return checked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChecked(String newChecked) {
		String oldChecked = checked;
		checked = newChecked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.INPUT__CHECKED, oldChecked, checked));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.INPUT__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputValue() {
		return inputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputValue(String newInputValue) {
		String oldInputValue = inputValue;
		inputValue = newInputValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.INPUT__INPUT_VALUE, oldInputValue, inputValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.INPUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.INPUT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.INPUT__ALIGN:
				return getAlign();
			case HtmlPackage.INPUT__MAXLENGTH:
				return getMaxlength();
			case HtmlPackage.INPUT__SIZE:
				return getSize();
			case HtmlPackage.INPUT__CHECKED:
				return getChecked();
			case HtmlPackage.INPUT__SRC:
				return getSrc();
			case HtmlPackage.INPUT__INPUT_VALUE:
				return getInputValue();
			case HtmlPackage.INPUT__NAME:
				return getName();
			case HtmlPackage.INPUT__TYPE:
				return getType();
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
			case HtmlPackage.INPUT__ALIGN:
				setAlign((String)newValue);
				return;
			case HtmlPackage.INPUT__MAXLENGTH:
				setMaxlength((String)newValue);
				return;
			case HtmlPackage.INPUT__SIZE:
				setSize((String)newValue);
				return;
			case HtmlPackage.INPUT__CHECKED:
				setChecked((String)newValue);
				return;
			case HtmlPackage.INPUT__SRC:
				setSrc((String)newValue);
				return;
			case HtmlPackage.INPUT__INPUT_VALUE:
				setInputValue((String)newValue);
				return;
			case HtmlPackage.INPUT__NAME:
				setName((String)newValue);
				return;
			case HtmlPackage.INPUT__TYPE:
				setType((String)newValue);
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
			case HtmlPackage.INPUT__ALIGN:
				setAlign(ALIGN_EDEFAULT);
				return;
			case HtmlPackage.INPUT__MAXLENGTH:
				setMaxlength(MAXLENGTH_EDEFAULT);
				return;
			case HtmlPackage.INPUT__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case HtmlPackage.INPUT__CHECKED:
				setChecked(CHECKED_EDEFAULT);
				return;
			case HtmlPackage.INPUT__SRC:
				setSrc(SRC_EDEFAULT);
				return;
			case HtmlPackage.INPUT__INPUT_VALUE:
				setInputValue(INPUT_VALUE_EDEFAULT);
				return;
			case HtmlPackage.INPUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HtmlPackage.INPUT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case HtmlPackage.INPUT__ALIGN:
				return ALIGN_EDEFAULT == null ? align != null : !ALIGN_EDEFAULT.equals(align);
			case HtmlPackage.INPUT__MAXLENGTH:
				return MAXLENGTH_EDEFAULT == null ? maxlength != null : !MAXLENGTH_EDEFAULT.equals(maxlength);
			case HtmlPackage.INPUT__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case HtmlPackage.INPUT__CHECKED:
				return CHECKED_EDEFAULT == null ? checked != null : !CHECKED_EDEFAULT.equals(checked);
			case HtmlPackage.INPUT__SRC:
				return SRC_EDEFAULT == null ? src != null : !SRC_EDEFAULT.equals(src);
			case HtmlPackage.INPUT__INPUT_VALUE:
				return INPUT_VALUE_EDEFAULT == null ? inputValue != null : !INPUT_VALUE_EDEFAULT.equals(inputValue);
			case HtmlPackage.INPUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HtmlPackage.INPUT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (align: ");
		result.append(align);
		result.append(", maxlength: ");
		result.append(maxlength);
		result.append(", size: ");
		result.append(size);
		result.append(", checked: ");
		result.append(checked);
		result.append(", src: ");
		result.append(src);
		result.append(", inputValue: ");
		result.append(inputValue);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //INPUTImpl
