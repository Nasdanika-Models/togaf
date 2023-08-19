/**
 */
package org.nasdanika.models.togaf.core;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.togaf.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/togaf/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.togaf.core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = org.nasdanika.models.togaf.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.EnterpriseImpl <em>Enterprise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.EnterpriseImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getEnterprise()
	 * @generated
	 */
	int ENTERPRISE = 0;

	/**
	 * The feature id for the '<em><b>Enterprise Continuum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE__ENTERPRISE_CONTINUUM = 0;

	/**
	 * The number of structural features of the '<em>Enterprise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Enterprise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.ArchitectureDomainImpl <em>Architecture Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.ArchitectureDomainImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getArchitectureDomain()
	 * @generated
	 */
	int ARCHITECTURE_DOMAIN = 1;

	/**
	 * The number of structural features of the '<em>Architecture Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DOMAIN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Architecture Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.StakeholderImpl <em>Stakeholder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.StakeholderImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getStakeholder()
	 * @generated
	 */
	int STAKEHOLDER = 2;

	/**
	 * The number of structural features of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.ArchitectureWorkProductImpl <em>Architecture Work Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.ArchitectureWorkProductImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getArchitectureWorkProduct()
	 * @generated
	 */
	int ARCHITECTURE_WORK_PRODUCT = 3;

	/**
	 * The number of structural features of the '<em>Architecture Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_WORK_PRODUCT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Architecture Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_WORK_PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.ArtifactImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 4;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = ARCHITECTURE_WORK_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = ARCHITECTURE_WORK_PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.DeliverableImpl <em>Deliverable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.DeliverableImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getDeliverable()
	 * @generated
	 */
	int DELIVERABLE = 5;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__USES = ARCHITECTURE_WORK_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signoffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__SIGNOFFS = ARCHITECTURE_WORK_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Deliverable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_FEATURE_COUNT = ARCHITECTURE_WORK_PRODUCT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Deliverable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_OPERATION_COUNT = ARCHITECTURE_WORK_PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.BuildingBlockImpl <em>Building Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.BuildingBlockImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getBuildingBlock()
	 * @generated
	 */
	int BUILDING_BLOCK = 6;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_BLOCK__SPECIALIZES = ARCHITECTURE_WORK_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Building Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_BLOCK_FEATURE_COUNT = ARCHITECTURE_WORK_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Building Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_BLOCK_OPERATION_COUNT = ARCHITECTURE_WORK_PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.ArchitectureBuildingBlockImpl <em>Architecture Building Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.ArchitectureBuildingBlockImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getArchitectureBuildingBlock()
	 * @generated
	 */
	int ARCHITECTURE_BUILDING_BLOCK = 7;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_BUILDING_BLOCK__SPECIALIZES = BUILDING_BLOCK__SPECIALIZES;

	/**
	 * The number of structural features of the '<em>Architecture Building Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_BUILDING_BLOCK_FEATURE_COUNT = BUILDING_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Architecture Building Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_BUILDING_BLOCK_OPERATION_COUNT = BUILDING_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.SolutionBuidingBlockImpl <em>Solution Buiding Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.SolutionBuidingBlockImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getSolutionBuidingBlock()
	 * @generated
	 */
	int SOLUTION_BUIDING_BLOCK = 8;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_BUIDING_BLOCK__SPECIALIZES = BUILDING_BLOCK__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_BUIDING_BLOCK__IMPLEMENTS = BUILDING_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Solution Buiding Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_BUIDING_BLOCK_FEATURE_COUNT = BUILDING_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Solution Buiding Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_BUIDING_BLOCK_OPERATION_COUNT = BUILDING_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.EnterpriseContinuumElementImpl <em>Enterprise Continuum Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.EnterpriseContinuumElementImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getEnterpriseContinuumElement()
	 * @generated
	 */
	int ENTERPRISE_CONTINUUM_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Specializations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_CONTINUUM_ELEMENT__SPECIALIZATIONS = 0;

	/**
	 * The feature id for the '<em><b>Architecture Building Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_CONTINUUM_ELEMENT__ARCHITECTURE_BUILDING_BLOCKS = 1;

	/**
	 * The feature id for the '<em><b>Solution Building Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_CONTINUUM_ELEMENT__SOLUTION_BUILDING_BLOCKS = 2;

	/**
	 * The number of structural features of the '<em>Enterprise Continuum Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_CONTINUUM_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Enterprise Continuum Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_CONTINUUM_ELEMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.togaf.core.Enterprise <em>Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise</em>'.
	 * @see org.nasdanika.models.togaf.core.Enterprise
	 * @generated
	 */
	EClass getEnterprise();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.togaf.core.Enterprise#getEnterpriseContinuum <em>Enterprise Continuum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enterprise Continuum</em>'.
	 * @see org.nasdanika.models.togaf.core.Enterprise#getEnterpriseContinuum()
	 * @see #getEnterprise()
	 * @generated
	 */
	EReference getEnterprise_EnterpriseContinuum();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.togaf.core.ArchitectureDomain <em>Architecture Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Domain</em>'.
	 * @see org.nasdanika.models.togaf.core.ArchitectureDomain
	 * @generated
	 */
	EClass getArchitectureDomain();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.togaf.core.Stakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stakeholder</em>'.
	 * @see org.nasdanika.models.togaf.core.Stakeholder
	 * @generated
	 */
	EClass getStakeholder();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.togaf.core.ArchitectureWorkProduct <em>Architecture Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Work Product</em>'.
	 * @see org.nasdanika.models.togaf.core.ArchitectureWorkProduct
	 * @generated
	 */
	EClass getArchitectureWorkProduct();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.togaf.core.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see org.nasdanika.models.togaf.core.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.togaf.core.Deliverable <em>Deliverable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deliverable</em>'.
	 * @see org.nasdanika.models.togaf.core.Deliverable
	 * @generated
	 */
	EClass getDeliverable();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.togaf.core.Deliverable#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see org.nasdanika.models.togaf.core.Deliverable#getUses()
	 * @see #getDeliverable()
	 * @generated
	 */
	EReference getDeliverable_Uses();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.togaf.core.Deliverable#getSignoffs <em>Signoffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signoffs</em>'.
	 * @see org.nasdanika.models.togaf.core.Deliverable#getSignoffs()
	 * @see #getDeliverable()
	 * @generated
	 */
	EReference getDeliverable_Signoffs();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.togaf.core.BuildingBlock <em>Building Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building Block</em>'.
	 * @see org.nasdanika.models.togaf.core.BuildingBlock
	 * @generated
	 */
	EClass getBuildingBlock();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.togaf.core.BuildingBlock#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specializes</em>'.
	 * @see org.nasdanika.models.togaf.core.BuildingBlock#getSpecializes()
	 * @see #getBuildingBlock()
	 * @generated
	 */
	EReference getBuildingBlock_Specializes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.togaf.core.ArchitectureBuildingBlock <em>Architecture Building Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Building Block</em>'.
	 * @see org.nasdanika.models.togaf.core.ArchitectureBuildingBlock
	 * @generated
	 */
	EClass getArchitectureBuildingBlock();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.togaf.core.SolutionBuidingBlock <em>Solution Buiding Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Buiding Block</em>'.
	 * @see org.nasdanika.models.togaf.core.SolutionBuidingBlock
	 * @generated
	 */
	EClass getSolutionBuidingBlock();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.togaf.core.SolutionBuidingBlock#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implements</em>'.
	 * @see org.nasdanika.models.togaf.core.SolutionBuidingBlock#getImplements()
	 * @see #getSolutionBuidingBlock()
	 * @generated
	 */
	EReference getSolutionBuidingBlock_Implements();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.togaf.core.EnterpriseContinuumElement <em>Enterprise Continuum Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise Continuum Element</em>'.
	 * @see org.nasdanika.models.togaf.core.EnterpriseContinuumElement
	 * @generated
	 */
	EClass getEnterpriseContinuumElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.togaf.core.EnterpriseContinuumElement#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specializations</em>'.
	 * @see org.nasdanika.models.togaf.core.EnterpriseContinuumElement#getSpecializations()
	 * @see #getEnterpriseContinuumElement()
	 * @generated
	 */
	EReference getEnterpriseContinuumElement_Specializations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.togaf.core.EnterpriseContinuumElement#getArchitectureBuildingBlocks <em>Architecture Building Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Architecture Building Blocks</em>'.
	 * @see org.nasdanika.models.togaf.core.EnterpriseContinuumElement#getArchitectureBuildingBlocks()
	 * @see #getEnterpriseContinuumElement()
	 * @generated
	 */
	EReference getEnterpriseContinuumElement_ArchitectureBuildingBlocks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.togaf.core.EnterpriseContinuumElement#getSolutionBuildingBlocks <em>Solution Building Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solution Building Blocks</em>'.
	 * @see org.nasdanika.models.togaf.core.EnterpriseContinuumElement#getSolutionBuildingBlocks()
	 * @see #getEnterpriseContinuumElement()
	 * @generated
	 */
	EReference getEnterpriseContinuumElement_SolutionBuildingBlocks();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.togaf.core.impl.EnterpriseImpl <em>Enterprise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.togaf.core.impl.EnterpriseImpl
		 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getEnterprise()
		 * @generated
		 */
		EClass ENTERPRISE = eINSTANCE.getEnterprise();
		/**
		 * The meta object literal for the '<em><b>Enterprise Continuum</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE__ENTERPRISE_CONTINUUM = eINSTANCE.getEnterprise_EnterpriseContinuum();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.togaf.core.impl.ArchitectureDomainImpl <em>Architecture Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.togaf.core.impl.ArchitectureDomainImpl
		 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getArchitectureDomain()
		 * @generated
		 */
		EClass ARCHITECTURE_DOMAIN = eINSTANCE.getArchitectureDomain();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.togaf.core.impl.StakeholderImpl <em>Stakeholder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.togaf.core.impl.StakeholderImpl
		 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getStakeholder()
		 * @generated
		 */
		EClass STAKEHOLDER = eINSTANCE.getStakeholder();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.togaf.core.impl.ArchitectureWorkProductImpl <em>Architecture Work Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.togaf.core.impl.ArchitectureWorkProductImpl
		 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getArchitectureWorkProduct()
		 * @generated
		 */
		EClass ARCHITECTURE_WORK_PRODUCT = eINSTANCE.getArchitectureWorkProduct();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.togaf.core.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.togaf.core.impl.ArtifactImpl
		 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.togaf.core.impl.DeliverableImpl <em>Deliverable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.togaf.core.impl.DeliverableImpl
		 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getDeliverable()
		 * @generated
		 */
		EClass DELIVERABLE = eINSTANCE.getDeliverable();
		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERABLE__USES = eINSTANCE.getDeliverable_Uses();
		/**
		 * The meta object literal for the '<em><b>Signoffs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERABLE__SIGNOFFS = eINSTANCE.getDeliverable_Signoffs();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.togaf.core.impl.BuildingBlockImpl <em>Building Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.togaf.core.impl.BuildingBlockImpl
		 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getBuildingBlock()
		 * @generated
		 */
		EClass BUILDING_BLOCK = eINSTANCE.getBuildingBlock();
		/**
		 * The meta object literal for the '<em><b>Specializes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING_BLOCK__SPECIALIZES = eINSTANCE.getBuildingBlock_Specializes();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.togaf.core.impl.ArchitectureBuildingBlockImpl <em>Architecture Building Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.togaf.core.impl.ArchitectureBuildingBlockImpl
		 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getArchitectureBuildingBlock()
		 * @generated
		 */
		EClass ARCHITECTURE_BUILDING_BLOCK = eINSTANCE.getArchitectureBuildingBlock();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.togaf.core.impl.SolutionBuidingBlockImpl <em>Solution Buiding Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.togaf.core.impl.SolutionBuidingBlockImpl
		 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getSolutionBuidingBlock()
		 * @generated
		 */
		EClass SOLUTION_BUIDING_BLOCK = eINSTANCE.getSolutionBuidingBlock();
		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_BUIDING_BLOCK__IMPLEMENTS = eINSTANCE.getSolutionBuidingBlock_Implements();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.togaf.core.impl.EnterpriseContinuumElementImpl <em>Enterprise Continuum Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.togaf.core.impl.EnterpriseContinuumElementImpl
		 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getEnterpriseContinuumElement()
		 * @generated
		 */
		EClass ENTERPRISE_CONTINUUM_ELEMENT = eINSTANCE.getEnterpriseContinuumElement();
		/**
		 * The meta object literal for the '<em><b>Specializations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_CONTINUUM_ELEMENT__SPECIALIZATIONS = eINSTANCE.getEnterpriseContinuumElement_Specializations();
		/**
		 * The meta object literal for the '<em><b>Architecture Building Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_CONTINUUM_ELEMENT__ARCHITECTURE_BUILDING_BLOCKS = eINSTANCE.getEnterpriseContinuumElement_ArchitectureBuildingBlocks();
		/**
		 * The meta object literal for the '<em><b>Solution Building Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_CONTINUUM_ELEMENT__SOLUTION_BUILDING_BLOCKS = eINSTANCE.getEnterpriseContinuumElement_SolutionBuildingBlocks();

	}

} //CorePackage
