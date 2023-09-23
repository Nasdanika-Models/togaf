/**
 */
package org.nasdanika.models.togaf.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.togaf.core.Architecture;
import org.nasdanika.models.togaf.core.ArchitectureDescription;
import org.nasdanika.models.togaf.core.ArchitectureView;
import org.nasdanika.models.togaf.core.ArchitectureViewpoint;
import org.nasdanika.models.togaf.core.Concern;
import org.nasdanika.models.togaf.core.CorePackage;
import org.nasdanika.models.togaf.core.Stakeholder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.ArchitectureDescriptionImpl#getExpresses <em>Expresses</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.ArchitectureDescriptionImpl#getIdentifiesSystem <em>Identifies System</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.ArchitectureDescriptionImpl#getIdentifiesStakeholders <em>Identifies Stakeholders</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.ArchitectureDescriptionImpl#getIdentifiesConcerns <em>Identifies Concerns</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.ArchitectureDescriptionImpl#getViewPoints <em>View Points</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.ArchitectureDescriptionImpl#getViews <em>Views</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureDescriptionImpl extends MinimalEObjectImpl.Container implements ArchitectureDescription {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ARCHITECTURE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Architecture getExpresses() {
		return (Architecture)eDynamicGet(CorePackage.ARCHITECTURE_DESCRIPTION__EXPRESSES, CorePackage.Literals.ARCHITECTURE_DESCRIPTION__EXPRESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture basicGetExpresses() {
		return (Architecture)eDynamicGet(CorePackage.ARCHITECTURE_DESCRIPTION__EXPRESSES, CorePackage.Literals.ARCHITECTURE_DESCRIPTION__EXPRESSES, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpresses(Architecture newExpresses) {
		eDynamicSet(CorePackage.ARCHITECTURE_DESCRIPTION__EXPRESSES, CorePackage.Literals.ARCHITECTURE_DESCRIPTION__EXPRESSES, newExpresses);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.nasdanika.models.togaf.core.System getIdentifiesSystem() {
		return (org.nasdanika.models.togaf.core.System)eDynamicGet(CorePackage.ARCHITECTURE_DESCRIPTION__IDENTIFIES_SYSTEM, CorePackage.Literals.ARCHITECTURE_DESCRIPTION__IDENTIFIES_SYSTEM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.models.togaf.core.System basicGetIdentifiesSystem() {
		return (org.nasdanika.models.togaf.core.System)eDynamicGet(CorePackage.ARCHITECTURE_DESCRIPTION__IDENTIFIES_SYSTEM, CorePackage.Literals.ARCHITECTURE_DESCRIPTION__IDENTIFIES_SYSTEM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifiesSystem(org.nasdanika.models.togaf.core.System newIdentifiesSystem) {
		eDynamicSet(CorePackage.ARCHITECTURE_DESCRIPTION__IDENTIFIES_SYSTEM, CorePackage.Literals.ARCHITECTURE_DESCRIPTION__IDENTIFIES_SYSTEM, newIdentifiesSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Stakeholder> getIdentifiesStakeholders() {
		return (EList<Stakeholder>)eDynamicGet(CorePackage.ARCHITECTURE_DESCRIPTION__IDENTIFIES_STAKEHOLDERS, CorePackage.Literals.ARCHITECTURE_DESCRIPTION__IDENTIFIES_STAKEHOLDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Concern> getIdentifiesConcerns() {
		return (EList<Concern>)eDynamicGet(CorePackage.ARCHITECTURE_DESCRIPTION__IDENTIFIES_CONCERNS, CorePackage.Literals.ARCHITECTURE_DESCRIPTION__IDENTIFIES_CONCERNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ArchitectureViewpoint> getViewPoints() {
		return (EList<ArchitectureViewpoint>)eDynamicGet(CorePackage.ARCHITECTURE_DESCRIPTION__VIEW_POINTS, CorePackage.Literals.ARCHITECTURE_DESCRIPTION__VIEW_POINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ArchitectureView> getViews() {
		return (EList<ArchitectureView>)eDynamicGet(CorePackage.ARCHITECTURE_DESCRIPTION__VIEWS, CorePackage.Literals.ARCHITECTURE_DESCRIPTION__VIEWS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ARCHITECTURE_DESCRIPTION__EXPRESSES:
				if (resolve) return getExpresses();
				return basicGetExpresses();
			case CorePackage.ARCHITECTURE_DESCRIPTION__IDENTIFIES_SYSTEM:
				if (resolve) return getIdentifiesSystem();
				return basicGetIdentifiesSystem();
			case CorePackage.ARCHITECTURE_DESCRIPTION__IDENTIFIES_STAKEHOLDERS:
				return getIdentifiesStakeholders();
			case CorePackage.ARCHITECTURE_DESCRIPTION__IDENTIFIES_CONCERNS:
				return getIdentifiesConcerns();
			case CorePackage.ARCHITECTURE_DESCRIPTION__VIEW_POINTS:
				return getViewPoints();
			case CorePackage.ARCHITECTURE_DESCRIPTION__VIEWS:
				return getViews();
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
			case CorePackage.ARCHITECTURE_DESCRIPTION__EXPRESSES:
				setExpresses((Architecture)newValue);
				return;
			case CorePackage.ARCHITECTURE_DESCRIPTION__IDENTIFIES_SYSTEM:
				setIdentifiesSystem((org.nasdanika.models.togaf.core.System)newValue);
				return;
			case CorePackage.ARCHITECTURE_DESCRIPTION__IDENTIFIES_STAKEHOLDERS:
				getIdentifiesStakeholders().clear();
				getIdentifiesStakeholders().addAll((Collection<? extends Stakeholder>)newValue);
				return;
			case CorePackage.ARCHITECTURE_DESCRIPTION__IDENTIFIES_CONCERNS:
				getIdentifiesConcerns().clear();
				getIdentifiesConcerns().addAll((Collection<? extends Concern>)newValue);
				return;
			case CorePackage.ARCHITECTURE_DESCRIPTION__VIEW_POINTS:
				getViewPoints().clear();
				getViewPoints().addAll((Collection<? extends ArchitectureViewpoint>)newValue);
				return;
			case CorePackage.ARCHITECTURE_DESCRIPTION__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends ArchitectureView>)newValue);
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
			case CorePackage.ARCHITECTURE_DESCRIPTION__EXPRESSES:
				setExpresses((Architecture)null);
				return;
			case CorePackage.ARCHITECTURE_DESCRIPTION__IDENTIFIES_SYSTEM:
				setIdentifiesSystem((org.nasdanika.models.togaf.core.System)null);
				return;
			case CorePackage.ARCHITECTURE_DESCRIPTION__IDENTIFIES_STAKEHOLDERS:
				getIdentifiesStakeholders().clear();
				return;
			case CorePackage.ARCHITECTURE_DESCRIPTION__IDENTIFIES_CONCERNS:
				getIdentifiesConcerns().clear();
				return;
			case CorePackage.ARCHITECTURE_DESCRIPTION__VIEW_POINTS:
				getViewPoints().clear();
				return;
			case CorePackage.ARCHITECTURE_DESCRIPTION__VIEWS:
				getViews().clear();
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
			case CorePackage.ARCHITECTURE_DESCRIPTION__EXPRESSES:
				return basicGetExpresses() != null;
			case CorePackage.ARCHITECTURE_DESCRIPTION__IDENTIFIES_SYSTEM:
				return basicGetIdentifiesSystem() != null;
			case CorePackage.ARCHITECTURE_DESCRIPTION__IDENTIFIES_STAKEHOLDERS:
				return !getIdentifiesStakeholders().isEmpty();
			case CorePackage.ARCHITECTURE_DESCRIPTION__IDENTIFIES_CONCERNS:
				return !getIdentifiesConcerns().isEmpty();
			case CorePackage.ARCHITECTURE_DESCRIPTION__VIEW_POINTS:
				return !getViewPoints().isEmpty();
			case CorePackage.ARCHITECTURE_DESCRIPTION__VIEWS:
				return !getViews().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArchitectureDescriptionImpl
