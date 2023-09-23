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
	int STAKEHOLDER = 14;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.ConcernImpl <em>Concern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.ConcernImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getConcern()
	 * @generated
	 */
	int CONCERN = 15;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.ArchitectureViewpointImpl <em>Architecture Viewpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.ArchitectureViewpointImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getArchitectureViewpoint()
	 * @generated
	 */
	int ARCHITECTURE_VIEWPOINT = 16;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.ModelKindImpl <em>Model Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.ModelKindImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getModelKind()
	 * @generated
	 */
	int MODEL_KIND = 17;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.ArchitectureViewImpl <em>Architecture View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.ArchitectureViewImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getArchitectureView()
	 * @generated
	 */
	int ARCHITECTURE_VIEW = 18;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.ArchitectureModelImpl <em>Architecture Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.ArchitectureModelImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getArchitectureModel()
	 * @generated
	 */
	int ARCHITECTURE_MODEL = 19;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.ArchitectureWorkProductImpl <em>Architecture Work Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.ArchitectureWorkProductImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getArchitectureWorkProduct()
	 * @generated
	 */
	int ARCHITECTURE_WORK_PRODUCT = 2;

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
	int ARTIFACT = 3;

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
	int DELIVERABLE = 4;

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
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.SignOffImpl <em>Sign Off</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.SignOffImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getSignOff()
	 * @generated
	 */
	int SIGN_OFF = 5;

	/**
	 * The number of structural features of the '<em>Sign Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_OFF_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Sign Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_OFF_OPERATION_COUNT = 0;

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
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.PrincipleImpl <em>Principle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.PrincipleImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getPrinciple()
	 * @generated
	 */
	int PRINCIPLE = 10;

	/**
	 * The number of structural features of the '<em>Principle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Principle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.SystemImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 11;

	/**
	 * The feature id for the '<em><b>Exhibits</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__EXHIBITS = 0;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.ArchitectureDescriptionImpl <em>Architecture Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.ArchitectureDescriptionImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getArchitectureDescription()
	 * @generated
	 */
	int ARCHITECTURE_DESCRIPTION = 12;

	/**
	 * The feature id for the '<em><b>Expresses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DESCRIPTION__EXPRESSES = 0;

	/**
	 * The feature id for the '<em><b>Identifies System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DESCRIPTION__IDENTIFIES_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Identifies Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DESCRIPTION__IDENTIFIES_STAKEHOLDERS = 2;

	/**
	 * The feature id for the '<em><b>Identifies Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DESCRIPTION__IDENTIFIES_CONCERNS = 3;

	/**
	 * The feature id for the '<em><b>View Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DESCRIPTION__VIEW_POINTS = 4;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DESCRIPTION__VIEWS = 5;

	/**
	 * The number of structural features of the '<em>Architecture Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DESCRIPTION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Architecture Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.togaf.core.impl.ArchitectureImpl <em>Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.togaf.core.impl.ArchitectureImpl
	 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getArchitecture()
	 * @generated
	 */
	int ARCHITECTURE = 13;

	/**
	 * The number of structural features of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Has Interest In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__HAS_INTEREST_IN = 0;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__HAS = 1;

	/**
	 * The number of structural features of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Frames</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEWPOINT__FRAMES = 0;

	/**
	 * The feature id for the '<em><b>Governs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEWPOINT__GOVERNS = 1;

	/**
	 * The feature id for the '<em><b>Model Kinds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEWPOINT__MODEL_KINDS = 2;

	/**
	 * The number of structural features of the '<em>Architecture Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEWPOINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Architecture Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEWPOINT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Governs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_KIND__GOVERNS = 0;

	/**
	 * The number of structural features of the '<em>Model Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_KIND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_KIND_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEW__ADDRESSES = 0;

	/**
	 * The feature id for the '<em><b>Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEW__MODELS = 1;

	/**
	 * The number of structural features of the '<em>Architecture View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Architecture View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEW_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Architecture Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_MODEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Architecture Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_MODEL_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the reference '{@link org.nasdanika.models.togaf.core.Stakeholder#getHasInterestIn <em>Has Interest In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Interest In</em>'.
	 * @see org.nasdanika.models.togaf.core.Stakeholder#getHasInterestIn()
	 * @see #getStakeholder()
	 * @generated
	 */
	EReference getStakeholder_HasInterestIn();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.togaf.core.Stakeholder#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has</em>'.
	 * @see org.nasdanika.models.togaf.core.Stakeholder#getHas()
	 * @see #getStakeholder()
	 * @generated
	 */
	EReference getStakeholder_Has();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.togaf.core.Concern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concern</em>'.
	 * @see org.nasdanika.models.togaf.core.Concern
	 * @generated
	 */
	EClass getConcern();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.togaf.core.ArchitectureViewpoint <em>Architecture Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Viewpoint</em>'.
	 * @see org.nasdanika.models.togaf.core.ArchitectureViewpoint
	 * @generated
	 */
	EClass getArchitectureViewpoint();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.togaf.core.ArchitectureViewpoint#getFrames <em>Frames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Frames</em>'.
	 * @see org.nasdanika.models.togaf.core.ArchitectureViewpoint#getFrames()
	 * @see #getArchitectureViewpoint()
	 * @generated
	 */
	EReference getArchitectureViewpoint_Frames();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.togaf.core.ArchitectureViewpoint#getGoverns <em>Governs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Governs</em>'.
	 * @see org.nasdanika.models.togaf.core.ArchitectureViewpoint#getGoverns()
	 * @see #getArchitectureViewpoint()
	 * @generated
	 */
	EReference getArchitectureViewpoint_Governs();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.togaf.core.ArchitectureViewpoint#getModelKinds <em>Model Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Model Kinds</em>'.
	 * @see org.nasdanika.models.togaf.core.ArchitectureViewpoint#getModelKinds()
	 * @see #getArchitectureViewpoint()
	 * @generated
	 */
	EReference getArchitectureViewpoint_ModelKinds();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.togaf.core.ModelKind <em>Model Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Kind</em>'.
	 * @see org.nasdanika.models.togaf.core.ModelKind
	 * @generated
	 */
	EClass getModelKind();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.togaf.core.ModelKind#getGoverns <em>Governs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Governs</em>'.
	 * @see org.nasdanika.models.togaf.core.ModelKind#getGoverns()
	 * @see #getModelKind()
	 * @generated
	 */
	EReference getModelKind_Governs();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.togaf.core.ArchitectureView <em>Architecture View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture View</em>'.
	 * @see org.nasdanika.models.togaf.core.ArchitectureView
	 * @generated
	 */
	EClass getArchitectureView();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.togaf.core.ArchitectureView#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Addresses</em>'.
	 * @see org.nasdanika.models.togaf.core.ArchitectureView#getAddresses()
	 * @see #getArchitectureView()
	 * @generated
	 */
	EReference getArchitectureView_Addresses();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.togaf.core.ArchitectureView#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Models</em>'.
	 * @see org.nasdanika.models.togaf.core.ArchitectureView#getModels()
	 * @see #getArchitectureView()
	 * @generated
	 */
	EReference getArchitectureView_Models();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.togaf.core.ArchitectureModel <em>Architecture Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Model</em>'.
	 * @see org.nasdanika.models.togaf.core.ArchitectureModel
	 * @generated
	 */
	EClass getArchitectureModel();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.togaf.core.SignOff <em>Sign Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sign Off</em>'.
	 * @see org.nasdanika.models.togaf.core.SignOff
	 * @generated
	 */
	EClass getSignOff();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.togaf.core.Principle <em>Principle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Principle</em>'.
	 * @see org.nasdanika.models.togaf.core.Principle
	 * @generated
	 */
	EClass getPrinciple();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.togaf.core.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.nasdanika.models.togaf.core.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.togaf.core.System#getExhibits <em>Exhibits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exhibits</em>'.
	 * @see org.nasdanika.models.togaf.core.System#getExhibits()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Exhibits();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.togaf.core.ArchitectureDescription <em>Architecture Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Description</em>'.
	 * @see org.nasdanika.models.togaf.core.ArchitectureDescription
	 * @generated
	 */
	EClass getArchitectureDescription();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.togaf.core.ArchitectureDescription#getExpresses <em>Expresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expresses</em>'.
	 * @see org.nasdanika.models.togaf.core.ArchitectureDescription#getExpresses()
	 * @see #getArchitectureDescription()
	 * @generated
	 */
	EReference getArchitectureDescription_Expresses();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.togaf.core.ArchitectureDescription#getIdentifiesSystem <em>Identifies System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identifies System</em>'.
	 * @see org.nasdanika.models.togaf.core.ArchitectureDescription#getIdentifiesSystem()
	 * @see #getArchitectureDescription()
	 * @generated
	 */
	EReference getArchitectureDescription_IdentifiesSystem();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.togaf.core.ArchitectureDescription#getIdentifiesStakeholders <em>Identifies Stakeholders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Identifies Stakeholders</em>'.
	 * @see org.nasdanika.models.togaf.core.ArchitectureDescription#getIdentifiesStakeholders()
	 * @see #getArchitectureDescription()
	 * @generated
	 */
	EReference getArchitectureDescription_IdentifiesStakeholders();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.togaf.core.ArchitectureDescription#getIdentifiesConcerns <em>Identifies Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Identifies Concerns</em>'.
	 * @see org.nasdanika.models.togaf.core.ArchitectureDescription#getIdentifiesConcerns()
	 * @see #getArchitectureDescription()
	 * @generated
	 */
	EReference getArchitectureDescription_IdentifiesConcerns();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.togaf.core.ArchitectureDescription#getViewPoints <em>View Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>View Points</em>'.
	 * @see org.nasdanika.models.togaf.core.ArchitectureDescription#getViewPoints()
	 * @see #getArchitectureDescription()
	 * @generated
	 */
	EReference getArchitectureDescription_ViewPoints();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.togaf.core.ArchitectureDescription#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Views</em>'.
	 * @see org.nasdanika.models.togaf.core.ArchitectureDescription#getViews()
	 * @see #getArchitectureDescription()
	 * @generated
	 */
	EReference getArchitectureDescription_Views();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.togaf.core.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture</em>'.
	 * @see org.nasdanika.models.togaf.core.Architecture
	 * @generated
	 */
	EClass getArchitecture();

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
		 * The meta object literal for the '<em><b>Has Interest In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKEHOLDER__HAS_INTEREST_IN = eINSTANCE.getStakeholder_HasInterestIn();
		/**
		 * The meta object literal for the '<em><b>Has</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKEHOLDER__HAS = eINSTANCE.getStakeholder_Has();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.togaf.core.impl.ConcernImpl <em>Concern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.togaf.core.impl.ConcernImpl
		 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getConcern()
		 * @generated
		 */
		EClass CONCERN = eINSTANCE.getConcern();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.togaf.core.impl.ArchitectureViewpointImpl <em>Architecture Viewpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.togaf.core.impl.ArchitectureViewpointImpl
		 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getArchitectureViewpoint()
		 * @generated
		 */
		EClass ARCHITECTURE_VIEWPOINT = eINSTANCE.getArchitectureViewpoint();
		/**
		 * The meta object literal for the '<em><b>Frames</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_VIEWPOINT__FRAMES = eINSTANCE.getArchitectureViewpoint_Frames();
		/**
		 * The meta object literal for the '<em><b>Governs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_VIEWPOINT__GOVERNS = eINSTANCE.getArchitectureViewpoint_Governs();
		/**
		 * The meta object literal for the '<em><b>Model Kinds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_VIEWPOINT__MODEL_KINDS = eINSTANCE.getArchitectureViewpoint_ModelKinds();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.togaf.core.impl.ModelKindImpl <em>Model Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.togaf.core.impl.ModelKindImpl
		 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getModelKind()
		 * @generated
		 */
		EClass MODEL_KIND = eINSTANCE.getModelKind();
		/**
		 * The meta object literal for the '<em><b>Governs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_KIND__GOVERNS = eINSTANCE.getModelKind_Governs();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.togaf.core.impl.ArchitectureViewImpl <em>Architecture View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.togaf.core.impl.ArchitectureViewImpl
		 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getArchitectureView()
		 * @generated
		 */
		EClass ARCHITECTURE_VIEW = eINSTANCE.getArchitectureView();
		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_VIEW__ADDRESSES = eINSTANCE.getArchitectureView_Addresses();
		/**
		 * The meta object literal for the '<em><b>Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_VIEW__MODELS = eINSTANCE.getArchitectureView_Models();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.togaf.core.impl.ArchitectureModelImpl <em>Architecture Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.togaf.core.impl.ArchitectureModelImpl
		 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getArchitectureModel()
		 * @generated
		 */
		EClass ARCHITECTURE_MODEL = eINSTANCE.getArchitectureModel();
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
		 * The meta object literal for the '{@link org.nasdanika.models.togaf.core.impl.SignOffImpl <em>Sign Off</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.togaf.core.impl.SignOffImpl
		 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getSignOff()
		 * @generated
		 */
		EClass SIGN_OFF = eINSTANCE.getSignOff();
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
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.togaf.core.impl.PrincipleImpl <em>Principle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.togaf.core.impl.PrincipleImpl
		 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getPrinciple()
		 * @generated
		 */
		EClass PRINCIPLE = eINSTANCE.getPrinciple();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.togaf.core.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.togaf.core.impl.SystemImpl
		 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();
		/**
		 * The meta object literal for the '<em><b>Exhibits</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__EXHIBITS = eINSTANCE.getSystem_Exhibits();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.togaf.core.impl.ArchitectureDescriptionImpl <em>Architecture Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.togaf.core.impl.ArchitectureDescriptionImpl
		 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getArchitectureDescription()
		 * @generated
		 */
		EClass ARCHITECTURE_DESCRIPTION = eINSTANCE.getArchitectureDescription();
		/**
		 * The meta object literal for the '<em><b>Expresses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_DESCRIPTION__EXPRESSES = eINSTANCE.getArchitectureDescription_Expresses();
		/**
		 * The meta object literal for the '<em><b>Identifies System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_DESCRIPTION__IDENTIFIES_SYSTEM = eINSTANCE.getArchitectureDescription_IdentifiesSystem();
		/**
		 * The meta object literal for the '<em><b>Identifies Stakeholders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_DESCRIPTION__IDENTIFIES_STAKEHOLDERS = eINSTANCE.getArchitectureDescription_IdentifiesStakeholders();
		/**
		 * The meta object literal for the '<em><b>Identifies Concerns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_DESCRIPTION__IDENTIFIES_CONCERNS = eINSTANCE.getArchitectureDescription_IdentifiesConcerns();
		/**
		 * The meta object literal for the '<em><b>View Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_DESCRIPTION__VIEW_POINTS = eINSTANCE.getArchitectureDescription_ViewPoints();
		/**
		 * The meta object literal for the '<em><b>Views</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_DESCRIPTION__VIEWS = eINSTANCE.getArchitectureDescription_Views();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.togaf.core.impl.ArchitectureImpl <em>Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.togaf.core.impl.ArchitectureImpl
		 * @see org.nasdanika.models.togaf.core.impl.CorePackageImpl#getArchitecture()
		 * @generated
		 */
		EClass ARCHITECTURE = eINSTANCE.getArchitecture();

	}

} //CorePackage
