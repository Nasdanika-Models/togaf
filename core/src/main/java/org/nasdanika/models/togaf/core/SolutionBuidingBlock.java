/**
 */
package org.nasdanika.models.togaf.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Buiding Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Implementation of a capability
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.togaf.core.SolutionBuidingBlock#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.togaf.core.CorePackage#getSolutionBuidingBlock()
 * @model
 * @generated
 */
public interface SolutionBuidingBlock extends BuildingBlock {
	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.togaf.core.ArchitectureBuildingBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Architecture building block (capability) implemented by this solution building block. One solution buidling block may implement more than one capability. E.g. GitLab implements GitRepository, issue management, CI/CD, etc. TODO: Association class with quality attributes and details, derived opposite.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implements</em>' reference list.
	 * @see org.nasdanika.models.togaf.core.CorePackage#getSolutionBuidingBlock_Implements()
	 * @model
	 * @generated
	 */
	EList<ArchitectureBuildingBlock> getImplements();

} // SolutionBuidingBlock
