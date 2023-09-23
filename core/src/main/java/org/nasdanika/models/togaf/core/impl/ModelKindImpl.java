/**
 */
package org.nasdanika.models.togaf.core.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.togaf.core.ArchitectureModel;
import org.nasdanika.models.togaf.core.CorePackage;
import org.nasdanika.models.togaf.core.ModelKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Kind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.ModelKindImpl#getGoverns <em>Governs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelKindImpl extends MinimalEObjectImpl.Container implements ModelKind {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelKindImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.MODEL_KIND;
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
	public ArchitectureModel getGoverns() {
		return (ArchitectureModel)eDynamicGet(CorePackage.MODEL_KIND__GOVERNS, CorePackage.Literals.MODEL_KIND__GOVERNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureModel basicGetGoverns() {
		return (ArchitectureModel)eDynamicGet(CorePackage.MODEL_KIND__GOVERNS, CorePackage.Literals.MODEL_KIND__GOVERNS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoverns(ArchitectureModel newGoverns) {
		eDynamicSet(CorePackage.MODEL_KIND__GOVERNS, CorePackage.Literals.MODEL_KIND__GOVERNS, newGoverns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.MODEL_KIND__GOVERNS:
				if (resolve) return getGoverns();
				return basicGetGoverns();
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
			case CorePackage.MODEL_KIND__GOVERNS:
				setGoverns((ArchitectureModel)newValue);
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
			case CorePackage.MODEL_KIND__GOVERNS:
				setGoverns((ArchitectureModel)null);
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
			case CorePackage.MODEL_KIND__GOVERNS:
				return basicGetGoverns() != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelKindImpl
