/**
 */
package co.edu.uniandes.metamodels.Html.impl;

import co.edu.uniandes.metamodels.Html.HtmlPackage;
import co.edu.uniandes.metamodels.Html.IMG;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IMG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.IMGImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.IMGImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.IMGImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.IMGImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.IMGImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.IMGImpl#getVspace <em>Vspace</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.IMGImpl#getHspace <em>Hspace</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.IMGImpl#getIsmap <em>Ismap</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.IMGImpl#getUsemap <em>Usemap</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.IMGImpl#getBorder <em>Border</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IMGImpl extends BODYElementImpl implements IMG {
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
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlt() <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected static final String ALT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlt() <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected String alt = ALT_EDEFAULT;

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
	 * The default value of the '{@link #getVspace() <em>Vspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVspace()
	 * @generated
	 * @ordered
	 */
	protected static final String VSPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVspace() <em>Vspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVspace()
	 * @generated
	 * @ordered
	 */
	protected String vspace = VSPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHspace() <em>Hspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHspace()
	 * @generated
	 * @ordered
	 */
	protected static final String HSPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHspace() <em>Hspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHspace()
	 * @generated
	 * @ordered
	 */
	protected String hspace = HSPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsmap() <em>Ismap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsmap()
	 * @generated
	 * @ordered
	 */
	protected static final String ISMAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsmap() <em>Ismap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsmap()
	 * @generated
	 * @ordered
	 */
	protected String ismap = ISMAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsemap() <em>Usemap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsemap()
	 * @generated
	 * @ordered
	 */
	protected static final String USEMAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsemap() <em>Usemap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsemap()
	 * @generated
	 * @ordered
	 */
	protected String usemap = USEMAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected String border = BORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.IMG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.IMG__SRC, oldSrc, src));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.IMG__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.IMG__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlt() {
		return alt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlt(String newAlt) {
		String oldAlt = alt;
		alt = newAlt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.IMG__ALT, oldAlt, alt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.IMG__ALIGN, oldAlign, align));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVspace() {
		return vspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVspace(String newVspace) {
		String oldVspace = vspace;
		vspace = newVspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.IMG__VSPACE, oldVspace, vspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHspace() {
		return hspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHspace(String newHspace) {
		String oldHspace = hspace;
		hspace = newHspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.IMG__HSPACE, oldHspace, hspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsmap() {
		return ismap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsmap(String newIsmap) {
		String oldIsmap = ismap;
		ismap = newIsmap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.IMG__ISMAP, oldIsmap, ismap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsemap() {
		return usemap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsemap(String newUsemap) {
		String oldUsemap = usemap;
		usemap = newUsemap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.IMG__USEMAP, oldUsemap, usemap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorder() {
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorder(String newBorder) {
		String oldBorder = border;
		border = newBorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.IMG__BORDER, oldBorder, border));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.IMG__SRC:
				return getSrc();
			case HtmlPackage.IMG__WIDTH:
				return getWidth();
			case HtmlPackage.IMG__HEIGHT:
				return getHeight();
			case HtmlPackage.IMG__ALT:
				return getAlt();
			case HtmlPackage.IMG__ALIGN:
				return getAlign();
			case HtmlPackage.IMG__VSPACE:
				return getVspace();
			case HtmlPackage.IMG__HSPACE:
				return getHspace();
			case HtmlPackage.IMG__ISMAP:
				return getIsmap();
			case HtmlPackage.IMG__USEMAP:
				return getUsemap();
			case HtmlPackage.IMG__BORDER:
				return getBorder();
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
			case HtmlPackage.IMG__SRC:
				setSrc((String)newValue);
				return;
			case HtmlPackage.IMG__WIDTH:
				setWidth((String)newValue);
				return;
			case HtmlPackage.IMG__HEIGHT:
				setHeight((String)newValue);
				return;
			case HtmlPackage.IMG__ALT:
				setAlt((String)newValue);
				return;
			case HtmlPackage.IMG__ALIGN:
				setAlign((String)newValue);
				return;
			case HtmlPackage.IMG__VSPACE:
				setVspace((String)newValue);
				return;
			case HtmlPackage.IMG__HSPACE:
				setHspace((String)newValue);
				return;
			case HtmlPackage.IMG__ISMAP:
				setIsmap((String)newValue);
				return;
			case HtmlPackage.IMG__USEMAP:
				setUsemap((String)newValue);
				return;
			case HtmlPackage.IMG__BORDER:
				setBorder((String)newValue);
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
			case HtmlPackage.IMG__SRC:
				setSrc(SRC_EDEFAULT);
				return;
			case HtmlPackage.IMG__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case HtmlPackage.IMG__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case HtmlPackage.IMG__ALT:
				setAlt(ALT_EDEFAULT);
				return;
			case HtmlPackage.IMG__ALIGN:
				setAlign(ALIGN_EDEFAULT);
				return;
			case HtmlPackage.IMG__VSPACE:
				setVspace(VSPACE_EDEFAULT);
				return;
			case HtmlPackage.IMG__HSPACE:
				setHspace(HSPACE_EDEFAULT);
				return;
			case HtmlPackage.IMG__ISMAP:
				setIsmap(ISMAP_EDEFAULT);
				return;
			case HtmlPackage.IMG__USEMAP:
				setUsemap(USEMAP_EDEFAULT);
				return;
			case HtmlPackage.IMG__BORDER:
				setBorder(BORDER_EDEFAULT);
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
			case HtmlPackage.IMG__SRC:
				return SRC_EDEFAULT == null ? src != null : !SRC_EDEFAULT.equals(src);
			case HtmlPackage.IMG__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case HtmlPackage.IMG__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case HtmlPackage.IMG__ALT:
				return ALT_EDEFAULT == null ? alt != null : !ALT_EDEFAULT.equals(alt);
			case HtmlPackage.IMG__ALIGN:
				return ALIGN_EDEFAULT == null ? align != null : !ALIGN_EDEFAULT.equals(align);
			case HtmlPackage.IMG__VSPACE:
				return VSPACE_EDEFAULT == null ? vspace != null : !VSPACE_EDEFAULT.equals(vspace);
			case HtmlPackage.IMG__HSPACE:
				return HSPACE_EDEFAULT == null ? hspace != null : !HSPACE_EDEFAULT.equals(hspace);
			case HtmlPackage.IMG__ISMAP:
				return ISMAP_EDEFAULT == null ? ismap != null : !ISMAP_EDEFAULT.equals(ismap);
			case HtmlPackage.IMG__USEMAP:
				return USEMAP_EDEFAULT == null ? usemap != null : !USEMAP_EDEFAULT.equals(usemap);
			case HtmlPackage.IMG__BORDER:
				return BORDER_EDEFAULT == null ? border != null : !BORDER_EDEFAULT.equals(border);
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
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", alt: ");
		result.append(alt);
		result.append(", align: ");
		result.append(align);
		result.append(", vspace: ");
		result.append(vspace);
		result.append(", hspace: ");
		result.append(hspace);
		result.append(", ismap: ");
		result.append(ismap);
		result.append(", usemap: ");
		result.append(usemap);
		result.append(", border: ");
		result.append(border);
		result.append(')');
		return result.toString();
	}

} //IMGImpl
