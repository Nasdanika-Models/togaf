/**
 */
package org.nasdanika.models.togaf.core.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.togaf.core.Architecture;
import org.nasdanika.models.togaf.core.ArchitectureBuildingBlock;
import org.nasdanika.models.togaf.core.ArchitectureDescription;
import org.nasdanika.models.togaf.core.ArchitectureDomain;
import org.nasdanika.models.togaf.core.ArchitectureModel;
import org.nasdanika.models.togaf.core.ArchitectureView;
import org.nasdanika.models.togaf.core.ArchitectureViewpoint;
import org.nasdanika.models.togaf.core.ArchitectureWorkProduct;
import org.nasdanika.models.togaf.core.Artifact;
import org.nasdanika.models.togaf.core.BuildingBlock;
import org.nasdanika.models.togaf.core.Concern;
import org.nasdanika.models.togaf.core.CoreFactory;
import org.nasdanika.models.togaf.core.CorePackage;
import org.nasdanika.models.togaf.core.Deliverable;
import org.nasdanika.models.togaf.core.Enterprise;
import org.nasdanika.models.togaf.core.EnterpriseContinuumElement;
import org.nasdanika.models.togaf.core.ModelKind;
import org.nasdanika.models.togaf.core.Principle;
import org.nasdanika.models.togaf.core.SignOff;
import org.nasdanika.models.togaf.core.SolutionBuidingBlock;
import org.nasdanika.models.togaf.core.Stakeholder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enterpriseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureDomainEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stakeholderEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concernEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureViewpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureWorkProductEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliverableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signOffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildingBlockEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureBuildingBlockEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionBuidingBlockEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enterpriseContinuumElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass principleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.togaf.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCorePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CorePackageImpl theCorePackage = registeredCorePackage instanceof CorePackageImpl ? (CorePackageImpl)registeredCorePackage : new CorePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnterprise() {
		return enterpriseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnterprise_EnterpriseContinuum() {
		return (EReference)enterpriseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitectureDomain() {
		return architectureDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStakeholder() {
		return stakeholderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStakeholder_HasInterestIn() {
		return (EReference)stakeholderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStakeholder_Has() {
		return (EReference)stakeholderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcern() {
		return concernEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitectureViewpoint() {
		return architectureViewpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureViewpoint_Frames() {
		return (EReference)architectureViewpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureViewpoint_Governs() {
		return (EReference)architectureViewpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureViewpoint_ModelKinds() {
		return (EReference)architectureViewpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelKind() {
		return modelKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelKind_Governs() {
		return (EReference)modelKindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitectureView() {
		return architectureViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureView_Addresses() {
		return (EReference)architectureViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureView_Models() {
		return (EReference)architectureViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitectureModel() {
		return architectureModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitectureWorkProduct() {
		return architectureWorkProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeliverable() {
		return deliverableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeliverable_Uses() {
		return (EReference)deliverableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeliverable_Signoffs() {
		return (EReference)deliverableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignOff() {
		return signOffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuildingBlock() {
		return buildingBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBuildingBlock_Specializes() {
		return (EReference)buildingBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitectureBuildingBlock() {
		return architectureBuildingBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSolutionBuidingBlock() {
		return solutionBuidingBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolutionBuidingBlock_Implements() {
		return (EReference)solutionBuidingBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnterpriseContinuumElement() {
		return enterpriseContinuumElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnterpriseContinuumElement_Specializations() {
		return (EReference)enterpriseContinuumElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnterpriseContinuumElement_ArchitectureBuildingBlocks() {
		return (EReference)enterpriseContinuumElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnterpriseContinuumElement_SolutionBuildingBlocks() {
		return (EReference)enterpriseContinuumElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrinciple() {
		return principleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_Exhibits() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitectureDescription() {
		return architectureDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureDescription_Expresses() {
		return (EReference)architectureDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureDescription_IdentifiesSystem() {
		return (EReference)architectureDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureDescription_IdentifiesStakeholders() {
		return (EReference)architectureDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureDescription_IdentifiesConcerns() {
		return (EReference)architectureDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureDescription_ViewPoints() {
		return (EReference)architectureDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureDescription_Views() {
		return (EReference)architectureDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitecture() {
		return architectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		enterpriseEClass = createEClass(ENTERPRISE);
		createEReference(enterpriseEClass, ENTERPRISE__ENTERPRISE_CONTINUUM);

		architectureDomainEClass = createEClass(ARCHITECTURE_DOMAIN);

		architectureWorkProductEClass = createEClass(ARCHITECTURE_WORK_PRODUCT);

		artifactEClass = createEClass(ARTIFACT);

		deliverableEClass = createEClass(DELIVERABLE);
		createEReference(deliverableEClass, DELIVERABLE__USES);
		createEReference(deliverableEClass, DELIVERABLE__SIGNOFFS);

		signOffEClass = createEClass(SIGN_OFF);

		buildingBlockEClass = createEClass(BUILDING_BLOCK);
		createEReference(buildingBlockEClass, BUILDING_BLOCK__SPECIALIZES);

		architectureBuildingBlockEClass = createEClass(ARCHITECTURE_BUILDING_BLOCK);

		solutionBuidingBlockEClass = createEClass(SOLUTION_BUIDING_BLOCK);
		createEReference(solutionBuidingBlockEClass, SOLUTION_BUIDING_BLOCK__IMPLEMENTS);

		enterpriseContinuumElementEClass = createEClass(ENTERPRISE_CONTINUUM_ELEMENT);
		createEReference(enterpriseContinuumElementEClass, ENTERPRISE_CONTINUUM_ELEMENT__SPECIALIZATIONS);
		createEReference(enterpriseContinuumElementEClass, ENTERPRISE_CONTINUUM_ELEMENT__ARCHITECTURE_BUILDING_BLOCKS);
		createEReference(enterpriseContinuumElementEClass, ENTERPRISE_CONTINUUM_ELEMENT__SOLUTION_BUILDING_BLOCKS);

		principleEClass = createEClass(PRINCIPLE);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__EXHIBITS);

		architectureDescriptionEClass = createEClass(ARCHITECTURE_DESCRIPTION);
		createEReference(architectureDescriptionEClass, ARCHITECTURE_DESCRIPTION__EXPRESSES);
		createEReference(architectureDescriptionEClass, ARCHITECTURE_DESCRIPTION__IDENTIFIES_SYSTEM);
		createEReference(architectureDescriptionEClass, ARCHITECTURE_DESCRIPTION__IDENTIFIES_STAKEHOLDERS);
		createEReference(architectureDescriptionEClass, ARCHITECTURE_DESCRIPTION__IDENTIFIES_CONCERNS);
		createEReference(architectureDescriptionEClass, ARCHITECTURE_DESCRIPTION__VIEW_POINTS);
		createEReference(architectureDescriptionEClass, ARCHITECTURE_DESCRIPTION__VIEWS);

		architectureEClass = createEClass(ARCHITECTURE);

		stakeholderEClass = createEClass(STAKEHOLDER);
		createEReference(stakeholderEClass, STAKEHOLDER__HAS_INTEREST_IN);
		createEReference(stakeholderEClass, STAKEHOLDER__HAS);

		concernEClass = createEClass(CONCERN);

		architectureViewpointEClass = createEClass(ARCHITECTURE_VIEWPOINT);
		createEReference(architectureViewpointEClass, ARCHITECTURE_VIEWPOINT__FRAMES);
		createEReference(architectureViewpointEClass, ARCHITECTURE_VIEWPOINT__GOVERNS);
		createEReference(architectureViewpointEClass, ARCHITECTURE_VIEWPOINT__MODEL_KINDS);

		modelKindEClass = createEClass(MODEL_KIND);
		createEReference(modelKindEClass, MODEL_KIND__GOVERNS);

		architectureViewEClass = createEClass(ARCHITECTURE_VIEW);
		createEReference(architectureViewEClass, ARCHITECTURE_VIEW__ADDRESSES);
		createEReference(architectureViewEClass, ARCHITECTURE_VIEW__MODELS);

		architectureModelEClass = createEClass(ARCHITECTURE_MODEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		artifactEClass.getESuperTypes().add(this.getArchitectureWorkProduct());
		deliverableEClass.getESuperTypes().add(this.getArchitectureWorkProduct());
		buildingBlockEClass.getESuperTypes().add(this.getArchitectureWorkProduct());
		architectureBuildingBlockEClass.getESuperTypes().add(this.getBuildingBlock());
		solutionBuidingBlockEClass.getESuperTypes().add(this.getBuildingBlock());

		// Initialize classes, features, and operations; add parameters
		initEClass(enterpriseEClass, Enterprise.class, "Enterprise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnterprise_EnterpriseContinuum(), this.getEnterpriseContinuumElement(), null, "enterpriseContinuum", null, 0, -1, Enterprise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architectureDomainEClass, ArchitectureDomain.class, "ArchitectureDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(architectureWorkProductEClass, ArchitectureWorkProduct.class, "ArchitectureWorkProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deliverableEClass, Deliverable.class, "Deliverable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeliverable_Uses(), this.getArtifact(), null, "uses", null, 0, -1, Deliverable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeliverable_Signoffs(), this.getSignOff(), null, "signoffs", null, 1, -1, Deliverable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signOffEClass, SignOff.class, "SignOff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buildingBlockEClass, BuildingBlock.class, "BuildingBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuildingBlock_Specializes(), this.getBuildingBlock(), null, "specializes", null, 0, -1, BuildingBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architectureBuildingBlockEClass, ArchitectureBuildingBlock.class, "ArchitectureBuildingBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solutionBuidingBlockEClass, SolutionBuidingBlock.class, "SolutionBuidingBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolutionBuidingBlock_Implements(), this.getArchitectureBuildingBlock(), null, "implements", null, 0, -1, SolutionBuidingBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enterpriseContinuumElementEClass, EnterpriseContinuumElement.class, "EnterpriseContinuumElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnterpriseContinuumElement_Specializations(), this.getEnterpriseContinuumElement(), null, "specializations", null, 0, -1, EnterpriseContinuumElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseContinuumElement_ArchitectureBuildingBlocks(), this.getArchitectureBuildingBlock(), null, "architectureBuildingBlocks", null, 0, -1, EnterpriseContinuumElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseContinuumElement_SolutionBuildingBlocks(), this.getArchitectureBuildingBlock(), null, "solutionBuildingBlocks", null, 0, -1, EnterpriseContinuumElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(principleEClass, Principle.class, "Principle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemEClass, org.nasdanika.models.togaf.core.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Exhibits(), this.getArchitecture(), null, "exhibits", null, 0, 1, org.nasdanika.models.togaf.core.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architectureDescriptionEClass, ArchitectureDescription.class, "ArchitectureDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchitectureDescription_Expresses(), this.getArchitecture(), null, "expresses", null, 0, 1, ArchitectureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureDescription_IdentifiesSystem(), this.getSystem(), null, "identifiesSystem", null, 1, 1, ArchitectureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureDescription_IdentifiesStakeholders(), this.getStakeholder(), null, "identifiesStakeholders", null, 1, -1, ArchitectureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureDescription_IdentifiesConcerns(), this.getConcern(), null, "identifiesConcerns", null, 1, -1, ArchitectureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureDescription_ViewPoints(), this.getArchitectureViewpoint(), null, "viewPoints", null, 1, -1, ArchitectureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureDescription_Views(), this.getArchitectureView(), null, "views", null, 1, -1, ArchitectureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architectureEClass, Architecture.class, "Architecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stakeholderEClass, Stakeholder.class, "Stakeholder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStakeholder_HasInterestIn(), this.getSystem(), null, "hasInterestIn", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStakeholder_Has(), this.getConcern(), null, "has", null, 0, -1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concernEClass, Concern.class, "Concern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(architectureViewpointEClass, ArchitectureViewpoint.class, "ArchitectureViewpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchitectureViewpoint_Frames(), this.getConcern(), null, "frames", null, 0, -1, ArchitectureViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureViewpoint_Governs(), this.getArchitectureView(), null, "governs", null, 0, 1, ArchitectureViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureViewpoint_ModelKinds(), this.getModelKind(), null, "modelKinds", null, 1, -1, ArchitectureViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelKindEClass, ModelKind.class, "ModelKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelKind_Governs(), this.getArchitectureModel(), null, "governs", null, 0, 1, ModelKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architectureViewEClass, ArchitectureView.class, "ArchitectureView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchitectureView_Addresses(), this.getConcern(), null, "addresses", null, 1, -1, ArchitectureView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureView_Models(), this.getArchitectureModel(), null, "models", null, 1, -1, ArchitectureView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architectureModelEClass, ArchitectureModel.class, "ArchitectureModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (enterpriseEClass,
		   source,
		   new String[] {
			   "documentation", "Highest level of description for an organization"
		   });
		addAnnotation
		  (getEnterprise_EnterpriseContinuum(),
		   source,
		   new String[] {
			   "documentation", "Root (most generic) entries of the enterprise continuum"
		   });
		addAnnotation
		  (architectureDomainEClass,
		   source,
		   new String[] {
			   "documentation", "Business, Data, Application, Technology (BDAT). There might be more doomains, e.g. security."
		   });
		addAnnotation
		  (artifactEClass,
		   source,
		   new String[] {
			   "documentation", "An artifact describes an aspect of architecture. It can be used in multiple deliverables. An artifact can be a catalog, a matrix or a diagram showing some architecture elments and possibly relationships between them."
		   });
		addAnnotation
		  (deliverableEClass,
		   source,
		   new String[] {
			   "documentation", "Deliverables are contractually specified, formally reviewed, approved, and signed off by stakeholders."
		   });
		addAnnotation
		  (getDeliverable_Uses(),
		   source,
		   new String[] {
			   "documentation", "A deliverable can use/reference zero or more artifacts. TODO: Derived opposite from artifacts to deliverables. Association class with a key and perhaps configuration/properties - an artifact can be a \"template\" or a pattern and its use is instantiation with given \"bindings\""
		   });
		addAnnotation
		  (getDeliverable_Signoffs(),
		   source,
		   new String[] {
			   "documentation", "Tracking of stakeholder interactions. TODO: a better name for the reference which is a generic for review/approval/signoff. A base association class and subclasses - Review, Approval, Signoff. Dates, comments etc for each."
		   });
		addAnnotation
		  (buildingBlockEClass,
		   source,
		   new String[] {
			   "documentation", "A potentially reusable compoent"
		   });
		addAnnotation
		  (getBuildingBlock_Specializes(),
		   source,
		   new String[] {
			   "documentation", "A BB which this BB is a specialization of. For example \"Git version control\" is a specialization of \"Version Control\". TODO: Association class with quality attributes which can be used as criteria in decision analysis. A derived opposite \"specializations\".  Validations that ABB\'s specialize ABB\'s and SBB\'s specialize SBB\'s."
		   });
		addAnnotation
		  (architectureBuildingBlockEClass,
		   source,
		   new String[] {
			   "documentation", "A reusable named concept, a capability"
		   });
		addAnnotation
		  (solutionBuidingBlockEClass,
		   source,
		   new String[] {
			   "documentation", "Implementation of a capability"
		   });
		addAnnotation
		  (getSolutionBuidingBlock_Implements(),
		   source,
		   new String[] {
			   "documentation", "Architecture building block (capability) implemented by this solution building block. One solution buidling block may implement more than one capability. E.g. GitLab implements GitRepository, issue management, CI/CD, etc. TODO: Association class with quality attributes and details, derived opposite."
		   });
		addAnnotation
		  (enterpriseContinuumElementEClass,
		   source,
		   new String[] {
			   "documentation", "An element of the enterprise continuum. Examples: Foundation Architectures, Common Systems Archtiectures, Industry Architectures, Organization-Specific Architectures (can be nested)."
		   });
		addAnnotation
		  (getEnterpriseContinuumElement_Specializations(),
		   source,
		   new String[] {
			   "documentation", "Specializations of this element. E.g. organization-specific archtiectures are specializations of industry archtectures"
		   });
		addAnnotation
		  (getSystem_Exhibits(),
		   source,
		   new String[] {
			   "documentation", "A System exibits Architecture"
		   });
		addAnnotation
		  (getArchitectureDescription_Expresses(),
		   source,
		   new String[] {
			   "documentation", "An ArchitectureDescription expresses Architecture"
		   });
		addAnnotation
		  (getArchitectureDescription_IdentifiesSystem(),
		   source,
		   new String[] {
			   "documentation", "An ArchitectureDescription identifies System"
		   });
		addAnnotation
		  (getArchitectureDescription_IdentifiesStakeholders(),
		   source,
		   new String[] {
			   "documentation", "An ArchitectureDescription identifies System"
		   });
		addAnnotation
		  (getArchitectureDescription_IdentifiesConcerns(),
		   source,
		   new String[] {
			   "documentation", "An ArchitectureDescription identifies System"
		   });
	}

} //CorePackageImpl
