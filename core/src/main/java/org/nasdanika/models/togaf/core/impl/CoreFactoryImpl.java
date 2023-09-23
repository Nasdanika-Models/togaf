/**
 */
package org.nasdanika.models.togaf.core.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import org.nasdanika.models.togaf.core.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory(CorePackage.eNS_URI);
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CorePackage.ENTERPRISE: return createEnterprise();
			case CorePackage.ARCHITECTURE_DOMAIN: return createArchitectureDomain();
			case CorePackage.ARCHITECTURE_WORK_PRODUCT: return createArchitectureWorkProduct();
			case CorePackage.ARTIFACT: return createArtifact();
			case CorePackage.DELIVERABLE: return createDeliverable();
			case CorePackage.SIGN_OFF: return createSignOff();
			case CorePackage.BUILDING_BLOCK: return createBuildingBlock();
			case CorePackage.ARCHITECTURE_BUILDING_BLOCK: return createArchitectureBuildingBlock();
			case CorePackage.SOLUTION_BUIDING_BLOCK: return createSolutionBuidingBlock();
			case CorePackage.ENTERPRISE_CONTINUUM_ELEMENT: return createEnterpriseContinuumElement();
			case CorePackage.PRINCIPLE: return createPrinciple();
			case CorePackage.SYSTEM: return createSystem();
			case CorePackage.ARCHITECTURE_DESCRIPTION: return createArchitectureDescription();
			case CorePackage.ARCHITECTURE: return createArchitecture();
			case CorePackage.STAKEHOLDER: return createStakeholder();
			case CorePackage.CONCERN: return createConcern();
			case CorePackage.ARCHITECTURE_VIEWPOINT: return createArchitectureViewpoint();
			case CorePackage.MODEL_KIND: return createModelKind();
			case CorePackage.ARCHITECTURE_VIEW: return createArchitectureView();
			case CorePackage.ARCHITECTURE_MODEL: return createArchitectureModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enterprise createEnterprise() {
		EnterpriseImpl enterprise = new EnterpriseImpl();
		return enterprise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchitectureDomain createArchitectureDomain() {
		ArchitectureDomainImpl architectureDomain = new ArchitectureDomainImpl();
		return architectureDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stakeholder createStakeholder() {
		StakeholderImpl stakeholder = new StakeholderImpl();
		return stakeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Concern createConcern() {
		ConcernImpl concern = new ConcernImpl();
		return concern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchitectureViewpoint createArchitectureViewpoint() {
		ArchitectureViewpointImpl architectureViewpoint = new ArchitectureViewpointImpl();
		return architectureViewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelKind createModelKind() {
		ModelKindImpl modelKind = new ModelKindImpl();
		return modelKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchitectureView createArchitectureView() {
		ArchitectureViewImpl architectureView = new ArchitectureViewImpl();
		return architectureView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchitectureModel createArchitectureModel() {
		ArchitectureModelImpl architectureModel = new ArchitectureModelImpl();
		return architectureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchitectureWorkProduct createArchitectureWorkProduct() {
		ArchitectureWorkProductImpl architectureWorkProduct = new ArchitectureWorkProductImpl();
		return architectureWorkProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deliverable createDeliverable() {
		DeliverableImpl deliverable = new DeliverableImpl();
		return deliverable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignOff createSignOff() {
		SignOffImpl signOff = new SignOffImpl();
		return signOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildingBlock createBuildingBlock() {
		BuildingBlockImpl buildingBlock = new BuildingBlockImpl();
		return buildingBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchitectureBuildingBlock createArchitectureBuildingBlock() {
		ArchitectureBuildingBlockImpl architectureBuildingBlock = new ArchitectureBuildingBlockImpl();
		return architectureBuildingBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolutionBuidingBlock createSolutionBuidingBlock() {
		SolutionBuidingBlockImpl solutionBuidingBlock = new SolutionBuidingBlockImpl();
		return solutionBuidingBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnterpriseContinuumElement createEnterpriseContinuumElement() {
		EnterpriseContinuumElementImpl enterpriseContinuumElement = new EnterpriseContinuumElementImpl();
		return enterpriseContinuumElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Principle createPrinciple() {
		PrincipleImpl principle = new PrincipleImpl();
		return principle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.nasdanika.models.togaf.core.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchitectureDescription createArchitectureDescription() {
		ArchitectureDescriptionImpl architectureDescription = new ArchitectureDescriptionImpl();
		return architectureDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Architecture createArchitecture() {
		ArchitectureImpl architecture = new ArchitectureImpl();
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorePackage getCorePackage() {
		return (CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactoryImpl
