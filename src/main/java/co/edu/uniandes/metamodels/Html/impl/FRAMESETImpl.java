/**
 */
package co.edu.uniandes.metamodels.Html.impl;

import co.edu.uniandes.metamodels.Html.FRAMESET;
import co.edu.uniandes.metamodels.Html.HtmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FRAMESET</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.FRAMESETImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.FRAMESETImpl#getCols <em>Cols</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.FRAMESETImpl#getFramespacing <em>Framespacing</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.FRAMESETImpl#getFrameborder <em>Frameborder</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.FRAMESETImpl#getBorder <em>Border</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FRAMESETImpl extends MinimalEObjectImpl.Container implements FRAMESET {
	/**
	 * The default value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected static final String ROWS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected String rows = ROWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCols() <em>Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCols()
	 * @generated
	 * @ordered
	 */
	protected static final String COLS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCols() <em>Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCols()
	 * @generated
	 * @ordered
	 */
	protected String cols = COLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFramespacing() <em>Framespacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramespacing()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAMESPACING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFramespacing() <em>Framespacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramespacing()
	 * @generated
	 * @ordered
	 */
	protected String framespacing = FRAMESPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrameborder() <em>Frameborder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameborder()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAMEBORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrameborder() <em>Frameborder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameborder()
	 * @generated
	 * @ordered
	 */
	protected String frameborder = FRAMEBORDER_EDEFAULT;

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
	protected FRAMESETImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.FRAMESET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRows() {
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRows(String newRows) {
		String oldRows = rows;
		rows = newRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAMESET__ROWS, oldRows, rows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCols() {
		return cols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCols(String newCols) {
		String oldCols = cols;
		cols = newCols;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAMESET__COLS, oldCols, cols));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFramespacing() {
		return framespacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFramespacing(String newFramespacing) {
		String oldFramespacing = framespacing;
		framespacing = newFramespacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAMESET__FRAMESPACING, oldFramespacing, framespacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrameborder() {
		return frameborder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameborder(String newFrameborder) {
		String oldFrameborder = frameborder;
		frameborder = newFrameborder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAMESET__FRAMEBORDER, oldFrameborder, frameborder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.FRAMESET__BORDER, oldBorder, border));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.FRAMESET__ROWS:
				return getRows();
			case HtmlPackage.FRAMESET__COLS:
				return getCols();
			case HtmlPackage.FRAMESET__FRAMESPACING:
				return getFramespacing();
			case HtmlPackage.FRAMESET__FRAMEBORDER:
				return getFrameborder();
			case HtmlPackage.FRAMESET__BORDER:
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
			case HtmlPackage.FRAMESET__ROWS:
				setRows((String)newValue);
				return;
			case HtmlPackage.FRAMESET__COLS:
				setCols((String)newValue);
				return;
			case HtmlPackage.FRAMESET__FRAMESPACING:
				setFramespacing((String)newValue);
				return;
			case HtmlPackage.FRAMESET__FRAMEBORDER:
				setFrameborder((String)newValue);
				return;
			case HtmlPackage.FRAMESET__BORDER:
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
			case HtmlPackage.FRAMESET__ROWS:
				setRows(ROWS_EDEFAULT);
				return;
			case HtmlPackage.FRAMESET__COLS:
				setCols(COLS_EDEFAULT);
				return;
			case HtmlPackage.FRAMESET__FRAMESPACING:
				setFramespacing(FRAMESPACING_EDEFAULT);
				return;
			case HtmlPackage.FRAMESET__FRAMEBORDER:
				setFrameborder(FRAMEBORDER_EDEFAULT);
				return;
			case HtmlPackage.FRAMESET__BORDER:
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
			case HtmlPackage.FRAMESET__ROWS:
				return ROWS_EDEFAULT == null ? rows != null : !ROWS_EDEFAULT.equals(rows);
			case HtmlPackage.FRAMESET__COLS:
				return COLS_EDEFAULT == null ? cols != null : !COLS_EDEFAULT.equals(cols);
			case HtmlPackage.FRAMESET__FRAMESPACING:
				return FRAMESPACING_EDEFAULT == null ? framespacing != null : !FRAMESPACING_EDEFAULT.equals(framespacing);
			case HtmlPackage.FRAMESET__FRAMEBORDER:
				return FRAMEBORDER_EDEFAULT == null ? frameborder != null : !FRAMEBORDER_EDEFAULT.equals(frameborder);
			case HtmlPackage.FRAMESET__BORDER:
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
		result.append(" (rows: ");
		result.append(rows);
		result.append(", cols: ");
		result.append(cols);
		result.append(", framespacing: ");
		result.append(framespacing);
		result.append(", frameborder: ");
		result.append(frameborder);
		result.append(", border: ");
		result.append(border);
		result.append(')');
		return result.toString();
	}

} //FRAMESETImpl
