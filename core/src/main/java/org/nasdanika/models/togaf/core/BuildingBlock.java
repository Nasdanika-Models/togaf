/**
 */
package org.nasdanika.models.togaf.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Building Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A potentially reusable compoent
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.togaf.core.BuildingBlock#getSpecializes <em>Specializes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.togaf.core.CorePackage#getBuildingBlock()
 * @model
 * @generated
 */
public interface BuildingBlock extends ArchitectureWorkProduct {
	/**
	 * Returns the value of the '<em><b>Specializes</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.togaf.core.BuildingBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A BB which this BB is a specialization of. For example "Git version control" is a specialization of "Version Control". TODO: Association class with quality attributes which can be used as criteria in decision analysis. A derived opposite "specializations".  Validations that ABB's specialize ABB's and SBB's specialize SBB's.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specializes</em>' reference list.
	 * @see org.nasdanika.models.togaf.core.CorePackage#getBuildingBlock_Specializes()
	 * @model
	 * @generated
	 */
	EList<BuildingBlock> getSpecializes();

} // BuildingBlock
