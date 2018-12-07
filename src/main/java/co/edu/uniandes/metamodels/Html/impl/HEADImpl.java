/**
 */
package co.edu.uniandes.metamodels.Html.impl;

import co.edu.uniandes.metamodels.Html.HEAD;
import co.edu.uniandes.metamodels.Html.HEADElement;
import co.edu.uniandes.metamodels.Html.HTML;
import co.edu.uniandes.metamodels.Html.HtmlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HEAD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.HEADImpl#getHeadElements <em>Head Elements</em>}</li>
 *   <li>{@link co.edu.uniandes.metamodels.Html.impl.HEADImpl#getHtml <em>Html</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HEADImpl extends HTMLElementImpl implements HEAD {
	/**
	 * The cached value of the '{@link #getHeadElements() <em>Head Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadElements()
	 * @generated
	 * @ordered
	 */
	protected EList<HEADElement> headElements;

	/**
	 * The cached value of the '{@link #getHtml() <em>Html</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtml()
	 * @generated
	 * @ordered
	 */
	protected HTML html;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HEADImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.HEAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HEADElement> getHeadElements() {
		if (headElements == null) {
			headElements = new EObjectWithInverseResolvingEList<HEADElement>(HEADElement.class, this, HtmlPackage.HEAD__HEAD_ELEMENTS, HtmlPackage.HEAD_ELEMENT__HEAD);
		}
		return headElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTML getHtml() {
		if (html != null && html.eIsProxy()) {
			InternalEObject oldHtml = (InternalEObject)html;
			html = (HTML)eResolveProxy(oldHtml);
			if (html != oldHtml) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HtmlPackage.HEAD__HTML, oldHtml, html));
			}
		}
		return html;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTML basicGetHtml() {
		return html;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtml(HTML newHtml, NotificationChain msgs) {
		HTML oldHtml = html;
		html = newHtml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HtmlPackage.HEAD__HTML, oldHtml, newHtml);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHtml(HTML newHtml) {
		if (newHtml != html) {
			NotificationChain msgs = null;
			if (html != null)
				msgs = ((InternalEObject)html).eInverseRemove(this, HtmlPackage.HTML__HEAD, HTML.class, msgs);
			if (newHtml != null)
				msgs = ((InternalEObject)newHtml).eInverseAdd(this, HtmlPackage.HTML__HEAD, HTML.class, msgs);
			msgs = basicSetHtml(newHtml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.HEAD__HTML, newHtml, newHtml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.HEAD__HEAD_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHeadElements()).basicAdd(otherEnd, msgs);
			case HtmlPackage.HEAD__HTML:
				if (html != null)
					msgs = ((InternalEObject)html).eInverseRemove(this, HtmlPackage.HTML__HEAD, HTML.class, msgs);
				return basicSetHtml((HTML)otherEnd, msgs);
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
			case HtmlPackage.HEAD__HEAD_ELEMENTS:
				return ((InternalEList<?>)getHeadElements()).basicRemove(otherEnd, msgs);
			case HtmlPackage.HEAD__HTML:
				return basicSetHtml(null, msgs);
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
			case HtmlPackage.HEAD__HEAD_ELEMENTS:
				return getHeadElements();
			case HtmlPackage.HEAD__HTML:
				if (resolve) return getHtml();
				return basicGetHtml();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HtmlPackage.HEAD__HEAD_ELEMENTS:
				getHeadElements().clear();
				getHeadElements().addAll((Collection<? extends HEADElement>)newValue);
				return;
			case HtmlPackage.HEAD__HTML:
				setHtml((HTML)newValue);
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
			case HtmlPackage.HEAD__HEAD_ELEMENTS:
				getHeadElements().clear();
				return;
			case HtmlPackage.HEAD__HTML:
				setHtml((HTML)null);
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
			case HtmlPackage.HEAD__HEAD_ELEMENTS:
				return headElements != null && !headElements.isEmpty();
			case HtmlPackage.HEAD__HTML:
				return html != null;
		}
		return super.eIsSet(featureID);
	}

} //HEADImpl
