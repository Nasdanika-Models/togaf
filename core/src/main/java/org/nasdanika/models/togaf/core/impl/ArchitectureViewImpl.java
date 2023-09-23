/**
 */
package org.nasdanika.models.togaf.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.togaf.core.ArchitectureModel;
import org.nasdanika.models.togaf.core.ArchitectureView;
import org.nasdanika.models.togaf.core.Concern;
import org.nasdanika.models.togaf.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.ArchitectureViewImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.ArchitectureViewImpl#getModels <em>Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureViewImpl extends MinimalEObjectImpl.Container implements ArchitectureView {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ARCHITECTURE_VIEW;
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
	public EList<Concern> getAddresses() {
		return (EList<Concern>)eDynamicGet(CorePackage.ARCHITECTURE_VIEW__ADDRESSES, CorePackage.Literals.ARCHITECTURE_VIEW__ADDRESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ArchitectureModel> getModels() {
		return (EList<ArchitectureModel>)eDynamicGet(CorePackage.ARCHITECTURE_VIEW__MODELS, CorePackage.Literals.ARCHITECTURE_VIEW__MODELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ARCHITECTURE_VIEW__ADDRESSES:
				return getAddresses();
			case CorePackage.ARCHITECTURE_VIEW__MODELS:
				return getModels();
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
			case CorePackage.ARCHITECTURE_VIEW__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Concern>)newValue);
				return;
			case CorePackage.ARCHITECTURE_VIEW__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends ArchitectureModel>)newValue);
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
			case CorePackage.ARCHITECTURE_VIEW__ADDRESSES:
				getAddresses().clear();
				return;
			case CorePackage.ARCHITECTURE_VIEW__MODELS:
				getModels().clear();
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
			case CorePackage.ARCHITECTURE_VIEW__ADDRESSES:
				return !getAddresses().isEmpty();
			case CorePackage.ARCHITECTURE_VIEW__MODELS:
				return !getModels().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArchitectureViewImpl
