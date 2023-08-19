/**
 */
package org.nasdanika.models.togaf.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.togaf.core.ArchitectureBuildingBlock;
import org.nasdanika.models.togaf.core.CorePackage;
import org.nasdanika.models.togaf.core.SolutionBuidingBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution Buiding Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.SolutionBuidingBlockImpl#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolutionBuidingBlockImpl extends BuildingBlockImpl implements SolutionBuidingBlock {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionBuidingBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SOLUTION_BUIDING_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ArchitectureBuildingBlock> getImplements() {
		return (EList<ArchitectureBuildingBlock>)eDynamicGet(CorePackage.SOLUTION_BUIDING_BLOCK__IMPLEMENTS, CorePackage.Literals.SOLUTION_BUIDING_BLOCK__IMPLEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.SOLUTION_BUIDING_BLOCK__IMPLEMENTS:
				return getImplements();
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
			case CorePackage.SOLUTION_BUIDING_BLOCK__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends ArchitectureBuildingBlock>)newValue);
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
			case CorePackage.SOLUTION_BUIDING_BLOCK__IMPLEMENTS:
				getImplements().clear();
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
			case CorePackage.SOLUTION_BUIDING_BLOCK__IMPLEMENTS:
				return !getImplements().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SolutionBuidingBlockImpl
