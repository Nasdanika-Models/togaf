/**
 */
package org.nasdanika.models.togaf.core.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.togaf.core.Concern;
import org.nasdanika.models.togaf.core.CorePackage;
import org.nasdanika.models.togaf.core.Stakeholder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.StakeholderImpl#getHasInterestIn <em>Has Interest In</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.StakeholderImpl#getHas <em>Has</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StakeholderImpl extends MinimalEObjectImpl.Container implements Stakeholder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StakeholderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.STAKEHOLDER;
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
	@Override
	public org.nasdanika.models.togaf.core.System getHasInterestIn() {
		return (org.nasdanika.models.togaf.core.System)eDynamicGet(CorePackage.STAKEHOLDER__HAS_INTEREST_IN, CorePackage.Literals.STAKEHOLDER__HAS_INTEREST_IN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.models.togaf.core.System basicGetHasInterestIn() {
		return (org.nasdanika.models.togaf.core.System)eDynamicGet(CorePackage.STAKEHOLDER__HAS_INTEREST_IN, CorePackage.Literals.STAKEHOLDER__HAS_INTEREST_IN, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasInterestIn(org.nasdanika.models.togaf.core.System newHasInterestIn) {
		eDynamicSet(CorePackage.STAKEHOLDER__HAS_INTEREST_IN, CorePackage.Literals.STAKEHOLDER__HAS_INTEREST_IN, newHasInterestIn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Concern> getHas() {
		return (EList<Concern>)eDynamicGet(CorePackage.STAKEHOLDER__HAS, CorePackage.Literals.STAKEHOLDER__HAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.STAKEHOLDER__HAS_INTEREST_IN:
				if (resolve) return getHasInterestIn();
				return basicGetHasInterestIn();
			case CorePackage.STAKEHOLDER__HAS:
				return getHas();
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
			case CorePackage.STAKEHOLDER__HAS_INTEREST_IN:
				setHasInterestIn((org.nasdanika.models.togaf.core.System)newValue);
				return;
			case CorePackage.STAKEHOLDER__HAS:
				getHas().clear();
				getHas().addAll((Collection<? extends Concern>)newValue);
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
			case CorePackage.STAKEHOLDER__HAS_INTEREST_IN:
				setHasInterestIn((org.nasdanika.models.togaf.core.System)null);
				return;
			case CorePackage.STAKEHOLDER__HAS:
				getHas().clear();
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
			case CorePackage.STAKEHOLDER__HAS_INTEREST_IN:
				return basicGetHasInterestIn() != null;
			case CorePackage.STAKEHOLDER__HAS:
				return !getHas().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StakeholderImpl
