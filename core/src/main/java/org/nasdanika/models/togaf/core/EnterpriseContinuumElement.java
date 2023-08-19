/**
 */
package org.nasdanika.models.togaf.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enterprise Continuum Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An element of the enterprise continuum. Examples: Foundation Architectures, Common Systems Archtiectures, Industry Architectures, Organization-Specific Architectures (can be nested).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.togaf.core.EnterpriseContinuumElement#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.EnterpriseContinuumElement#getArchitectureBuildingBlocks <em>Architecture Building Blocks</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.EnterpriseContinuumElement#getSolutionBuildingBlocks <em>Solution Building Blocks</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.togaf.core.CorePackage#getEnterpriseContinuumElement()
 * @model
 * @generated
 */
public interface EnterpriseContinuumElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.togaf.core.EnterpriseContinuumElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specializations of this element. E.g. organization-specific archtiectures are specializations of industry archtectures
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see org.nasdanika.models.togaf.core.CorePackage#getEnterpriseContinuumElement_Specializations()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnterpriseContinuumElement> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Architecture Building Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.togaf.core.ArchitectureBuildingBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture Building Blocks</em>' containment reference list.
	 * @see org.nasdanika.models.togaf.core.CorePackage#getEnterpriseContinuumElement_ArchitectureBuildingBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArchitectureBuildingBlock> getArchitectureBuildingBlocks();

	/**
	 * Returns the value of the '<em><b>Solution Building Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.togaf.core.ArchitectureBuildingBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Building Blocks</em>' containment reference list.
	 * @see org.nasdanika.models.togaf.core.CorePackage#getEnterpriseContinuumElement_SolutionBuildingBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArchitectureBuildingBlock> getSolutionBuildingBlocks();

} // EnterpriseContinuumElement
