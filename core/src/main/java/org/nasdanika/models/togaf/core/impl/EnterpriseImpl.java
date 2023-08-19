/**
 */
package org.nasdanika.models.togaf.core.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.togaf.core.CorePackage;
import org.nasdanika.models.togaf.core.Enterprise;
import org.nasdanika.models.togaf.core.EnterpriseContinuumElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enterprise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.EnterpriseImpl#getEnterpriseContinuum <em>Enterprise Continuum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnterpriseImpl extends MinimalEObjectImpl.Container implements Enterprise {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnterpriseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ENTERPRISE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EnterpriseContinuumElement> getEnterpriseContinuum() {
		return (EList<EnterpriseContinuumElement>)eDynamicGet(CorePackage.ENTERPRISE__ENTERPRISE_CONTINUUM, CorePackage.Literals.ENTERPRISE__ENTERPRISE_CONTINUUM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ENTERPRISE__ENTERPRISE_CONTINUUM:
				return ((InternalEList<?>)getEnterpriseContinuum()).basicRemove(otherEnd, msgs);
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
			case CorePackage.ENTERPRISE__ENTERPRISE_CONTINUUM:
				return getEnterpriseContinuum();
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
			case CorePackage.ENTERPRISE__ENTERPRISE_CONTINUUM:
				getEnterpriseContinuum().clear();
				getEnterpriseContinuum().addAll((Collection<? extends EnterpriseContinuumElement>)newValue);
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
			case CorePackage.ENTERPRISE__ENTERPRISE_CONTINUUM:
				getEnterpriseContinuum().clear();
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
			case CorePackage.ENTERPRISE__ENTERPRISE_CONTINUUM:
				return !getEnterpriseContinuum().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnterpriseImpl
