/**
 */
package org.nasdanika.models.togaf.core.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.togaf.core.CorePackage
 * @generated
 */
public class CoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreSwitch<Adapter> modelSwitch =
		new CoreSwitch<Adapter>() {
			@Override
			public Adapter caseEnterprise(Enterprise object) {
				return createEnterpriseAdapter();
			}
			@Override
			public Adapter caseArchitectureDomain(ArchitectureDomain object) {
				return createArchitectureDomainAdapter();
			}
			@Override
			public Adapter caseArchitectureWorkProduct(ArchitectureWorkProduct object) {
				return createArchitectureWorkProductAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseDeliverable(Deliverable object) {
				return createDeliverableAdapter();
			}
			@Override
			public Adapter caseSignOff(SignOff object) {
				return createSignOffAdapter();
			}
			@Override
			public Adapter caseBuildingBlock(BuildingBlock object) {
				return createBuildingBlockAdapter();
			}
			@Override
			public Adapter caseArchitectureBuildingBlock(ArchitectureBuildingBlock object) {
				return createArchitectureBuildingBlockAdapter();
			}
			@Override
			public Adapter caseSolutionBuidingBlock(SolutionBuidingBlock object) {
				return createSolutionBuidingBlockAdapter();
			}
			@Override
			public Adapter caseEnterpriseContinuumElement(EnterpriseContinuumElement object) {
				return createEnterpriseContinuumElementAdapter();
			}
			@Override
			public Adapter casePrinciple(Principle object) {
				return createPrincipleAdapter();
			}
			@Override
			public Adapter caseSystem(org.nasdanika.models.togaf.core.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseArchitectureDescription(ArchitectureDescription object) {
				return createArchitectureDescriptionAdapter();
			}
			@Override
			public Adapter caseArchitecture(Architecture object) {
				return createArchitectureAdapter();
			}
			@Override
			public Adapter caseStakeholder(Stakeholder object) {
				return createStakeholderAdapter();
			}
			@Override
			public Adapter caseConcern(Concern object) {
				return createConcernAdapter();
			}
			@Override
			public Adapter caseArchitectureViewpoint(ArchitectureViewpoint object) {
				return createArchitectureViewpointAdapter();
			}
			@Override
			public Adapter caseModelKind(ModelKind object) {
				return createModelKindAdapter();
			}
			@Override
			public Adapter caseArchitectureView(ArchitectureView object) {
				return createArchitectureViewAdapter();
			}
			@Override
			public Adapter caseArchitectureModel(ArchitectureModel object) {
				return createArchitectureModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.togaf.core.Enterprise <em>Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.togaf.core.Enterprise
	 * @generated
	 */
	public Adapter createEnterpriseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.togaf.core.ArchitectureDomain <em>Architecture Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.togaf.core.ArchitectureDomain
	 * @generated
	 */
	public Adapter createArchitectureDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.togaf.core.Stakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.togaf.core.Stakeholder
	 * @generated
	 */
	public Adapter createStakeholderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.togaf.core.Concern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.togaf.core.Concern
	 * @generated
	 */
	public Adapter createConcernAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.togaf.core.ArchitectureViewpoint <em>Architecture Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.togaf.core.ArchitectureViewpoint
	 * @generated
	 */
	public Adapter createArchitectureViewpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.togaf.core.ModelKind <em>Model Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.togaf.core.ModelKind
	 * @generated
	 */
	public Adapter createModelKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.togaf.core.ArchitectureView <em>Architecture View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.togaf.core.ArchitectureView
	 * @generated
	 */
	public Adapter createArchitectureViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.togaf.core.ArchitectureModel <em>Architecture Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.togaf.core.ArchitectureModel
	 * @generated
	 */
	public Adapter createArchitectureModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.togaf.core.ArchitectureWorkProduct <em>Architecture Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.togaf.core.ArchitectureWorkProduct
	 * @generated
	 */
	public Adapter createArchitectureWorkProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.togaf.core.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.togaf.core.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.togaf.core.Deliverable <em>Deliverable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.togaf.core.Deliverable
	 * @generated
	 */
	public Adapter createDeliverableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.togaf.core.SignOff <em>Sign Off</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.togaf.core.SignOff
	 * @generated
	 */
	public Adapter createSignOffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.togaf.core.BuildingBlock <em>Building Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.togaf.core.BuildingBlock
	 * @generated
	 */
	public Adapter createBuildingBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.togaf.core.ArchitectureBuildingBlock <em>Architecture Building Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.togaf.core.ArchitectureBuildingBlock
	 * @generated
	 */
	public Adapter createArchitectureBuildingBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.togaf.core.SolutionBuidingBlock <em>Solution Buiding Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.togaf.core.SolutionBuidingBlock
	 * @generated
	 */
	public Adapter createSolutionBuidingBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.togaf.core.EnterpriseContinuumElement <em>Enterprise Continuum Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.togaf.core.EnterpriseContinuumElement
	 * @generated
	 */
	public Adapter createEnterpriseContinuumElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.togaf.core.Principle <em>Principle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.togaf.core.Principle
	 * @generated
	 */
	public Adapter createPrincipleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.togaf.core.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.togaf.core.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.togaf.core.ArchitectureDescription <em>Architecture Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.togaf.core.ArchitectureDescription
	 * @generated
	 */
	public Adapter createArchitectureDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.togaf.core.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.togaf.core.Architecture
	 * @generated
	 */
	public Adapter createArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CoreAdapterFactory
