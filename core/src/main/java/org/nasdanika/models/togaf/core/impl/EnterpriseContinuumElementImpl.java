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

import org.nasdanika.models.togaf.core.ArchitectureBuildingBlock;
import org.nasdanika.models.togaf.core.CorePackage;
import org.nasdanika.models.togaf.core.EnterpriseContinuumElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enterprise Continuum Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.EnterpriseContinuumElementImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.EnterpriseContinuumElementImpl#getArchitectureBuildingBlocks <em>Architecture Building Blocks</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.EnterpriseContinuumElementImpl#getSolutionBuildingBlocks <em>Solution Building Blocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnterpriseContinuumElementImpl extends MinimalEObjectImpl.Container implements EnterpriseContinuumElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnterpriseContinuumElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ENTERPRISE_CONTINUUM_ELEMENT;
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
	public EList<EnterpriseContinuumElement> getSpecializations() {
		return (EList<EnterpriseContinuumElement>)eDynamicGet(CorePackage.ENTERPRISE_CONTINUUM_ELEMENT__SPECIALIZATIONS, CorePackage.Literals.ENTERPRISE_CONTINUUM_ELEMENT__SPECIALIZATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ArchitectureBuildingBlock> getArchitectureBuildingBlocks() {
		return (EList<ArchitectureBuildingBlock>)eDynamicGet(CorePackage.ENTERPRISE_CONTINUUM_ELEMENT__ARCHITECTURE_BUILDING_BLOCKS, CorePackage.Literals.ENTERPRISE_CONTINUUM_ELEMENT__ARCHITECTURE_BUILDING_BLOCKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ArchitectureBuildingBlock> getSolutionBuildingBlocks() {
		return (EList<ArchitectureBuildingBlock>)eDynamicGet(CorePackage.ENTERPRISE_CONTINUUM_ELEMENT__SOLUTION_BUILDING_BLOCKS, CorePackage.Literals.ENTERPRISE_CONTINUUM_ELEMENT__SOLUTION_BUILDING_BLOCKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ENTERPRISE_CONTINUUM_ELEMENT__SPECIALIZATIONS:
				return ((InternalEList<?>)getSpecializations()).basicRemove(otherEnd, msgs);
			case CorePackage.ENTERPRISE_CONTINUUM_ELEMENT__ARCHITECTURE_BUILDING_BLOCKS:
				return ((InternalEList<?>)getArchitectureBuildingBlocks()).basicRemove(otherEnd, msgs);
			case CorePackage.ENTERPRISE_CONTINUUM_ELEMENT__SOLUTION_BUILDING_BLOCKS:
				return ((InternalEList<?>)getSolutionBuildingBlocks()).basicRemove(otherEnd, msgs);
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
			case CorePackage.ENTERPRISE_CONTINUUM_ELEMENT__SPECIALIZATIONS:
				return getSpecializations();
			case CorePackage.ENTERPRISE_CONTINUUM_ELEMENT__ARCHITECTURE_BUILDING_BLOCKS:
				return getArchitectureBuildingBlocks();
			case CorePackage.ENTERPRISE_CONTINUUM_ELEMENT__SOLUTION_BUILDING_BLOCKS:
				return getSolutionBuildingBlocks();
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
			case CorePackage.ENTERPRISE_CONTINUUM_ELEMENT__SPECIALIZATIONS:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends EnterpriseContinuumElement>)newValue);
				return;
			case CorePackage.ENTERPRISE_CONTINUUM_ELEMENT__ARCHITECTURE_BUILDING_BLOCKS:
				getArchitectureBuildingBlocks().clear();
				getArchitectureBuildingBlocks().addAll((Collection<? extends ArchitectureBuildingBlock>)newValue);
				return;
			case CorePackage.ENTERPRISE_CONTINUUM_ELEMENT__SOLUTION_BUILDING_BLOCKS:
				getSolutionBuildingBlocks().clear();
				getSolutionBuildingBlocks().addAll((Collection<? extends ArchitectureBuildingBlock>)newValue);
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
			case CorePackage.ENTERPRISE_CONTINUUM_ELEMENT__SPECIALIZATIONS:
				getSpecializations().clear();
				return;
			case CorePackage.ENTERPRISE_CONTINUUM_ELEMENT__ARCHITECTURE_BUILDING_BLOCKS:
				getArchitectureBuildingBlocks().clear();
				return;
			case CorePackage.ENTERPRISE_CONTINUUM_ELEMENT__SOLUTION_BUILDING_BLOCKS:
				getSolutionBuildingBlocks().clear();
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
			case CorePackage.ENTERPRISE_CONTINUUM_ELEMENT__SPECIALIZATIONS:
				return !getSpecializations().isEmpty();
			case CorePackage.ENTERPRISE_CONTINUUM_ELEMENT__ARCHITECTURE_BUILDING_BLOCKS:
				return !getArchitectureBuildingBlocks().isEmpty();
			case CorePackage.ENTERPRISE_CONTINUUM_ELEMENT__SOLUTION_BUILDING_BLOCKS:
				return !getSolutionBuildingBlocks().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnterpriseContinuumElementImpl
