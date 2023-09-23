/**
 */
package org.nasdanika.models.togaf.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.togaf.core.CorePackage
 * @generated
 */
public interface CoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreFactory eINSTANCE = org.nasdanika.models.togaf.core.impl.CoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Enterprise</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enterprise</em>'.
	 * @generated
	 */
	Enterprise createEnterprise();

	/**
	 * Returns a new object of class '<em>Architecture Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture Domain</em>'.
	 * @generated
	 */
	ArchitectureDomain createArchitectureDomain();

	/**
	 * Returns a new object of class '<em>Stakeholder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stakeholder</em>'.
	 * @generated
	 */
	Stakeholder createStakeholder();

	/**
	 * Returns a new object of class '<em>Concern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concern</em>'.
	 * @generated
	 */
	Concern createConcern();

	/**
	 * Returns a new object of class '<em>Architecture Viewpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture Viewpoint</em>'.
	 * @generated
	 */
	ArchitectureViewpoint createArchitectureViewpoint();

	/**
	 * Returns a new object of class '<em>Model Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Kind</em>'.
	 * @generated
	 */
	ModelKind createModelKind();

	/**
	 * Returns a new object of class '<em>Architecture View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture View</em>'.
	 * @generated
	 */
	ArchitectureView createArchitectureView();

	/**
	 * Returns a new object of class '<em>Architecture Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture Model</em>'.
	 * @generated
	 */
	ArchitectureModel createArchitectureModel();

	/**
	 * Returns a new object of class '<em>Architecture Work Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture Work Product</em>'.
	 * @generated
	 */
	ArchitectureWorkProduct createArchitectureWorkProduct();

	/**
	 * Returns a new object of class '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact</em>'.
	 * @generated
	 */
	Artifact createArtifact();

	/**
	 * Returns a new object of class '<em>Deliverable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deliverable</em>'.
	 * @generated
	 */
	Deliverable createDeliverable();

	/**
	 * Returns a new object of class '<em>Sign Off</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sign Off</em>'.
	 * @generated
	 */
	SignOff createSignOff();

	/**
	 * Returns a new object of class '<em>Building Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Building Block</em>'.
	 * @generated
	 */
	BuildingBlock createBuildingBlock();

	/**
	 * Returns a new object of class '<em>Architecture Building Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture Building Block</em>'.
	 * @generated
	 */
	ArchitectureBuildingBlock createArchitectureBuildingBlock();

	/**
	 * Returns a new object of class '<em>Solution Buiding Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Buiding Block</em>'.
	 * @generated
	 */
	SolutionBuidingBlock createSolutionBuidingBlock();

	/**
	 * Returns a new object of class '<em>Enterprise Continuum Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enterprise Continuum Element</em>'.
	 * @generated
	 */
	EnterpriseContinuumElement createEnterpriseContinuumElement();

	/**
	 * Returns a new object of class '<em>Principle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Principle</em>'.
	 * @generated
	 */
	Principle createPrinciple();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Architecture Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture Description</em>'.
	 * @generated
	 */
	ArchitectureDescription createArchitectureDescription();

	/**
	 * Returns a new object of class '<em>Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture</em>'.
	 * @generated
	 */
	Architecture createArchitecture();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CorePackage getCorePackage();

} //CoreFactory
