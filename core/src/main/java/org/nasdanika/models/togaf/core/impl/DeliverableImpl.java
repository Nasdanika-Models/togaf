/**
 */
package org.nasdanika.models.togaf.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.togaf.core.Artifact;
import org.nasdanika.models.togaf.core.CorePackage;
import org.nasdanika.models.togaf.core.Deliverable;
import org.nasdanika.models.togaf.core.SignOff;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deliverable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.DeliverableImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.DeliverableImpl#getSignoffs <em>Signoffs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeliverableImpl extends ArchitectureWorkProductImpl implements Deliverable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliverableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DELIVERABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getUses() {
		return (EList<Artifact>)eDynamicGet(CorePackage.DELIVERABLE__USES, CorePackage.Literals.DELIVERABLE__USES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SignOff> getSignoffs() {
		return (EList<SignOff>)eDynamicGet(CorePackage.DELIVERABLE__SIGNOFFS, CorePackage.Literals.DELIVERABLE__SIGNOFFS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.DELIVERABLE__USES:
				return getUses();
			case CorePackage.DELIVERABLE__SIGNOFFS:
				return getSignoffs();
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
			case CorePackage.DELIVERABLE__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends Artifact>)newValue);
				return;
			case CorePackage.DELIVERABLE__SIGNOFFS:
				getSignoffs().clear();
				getSignoffs().addAll((Collection<? extends SignOff>)newValue);
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
			case CorePackage.DELIVERABLE__USES:
				getUses().clear();
				return;
			case CorePackage.DELIVERABLE__SIGNOFFS:
				getSignoffs().clear();
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
			case CorePackage.DELIVERABLE__USES:
				return !getUses().isEmpty();
			case CorePackage.DELIVERABLE__SIGNOFFS:
				return !getSignoffs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeliverableImpl
