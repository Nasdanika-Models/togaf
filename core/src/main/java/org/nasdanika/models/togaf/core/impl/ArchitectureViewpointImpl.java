/**
 */
package org.nasdanika.models.togaf.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.togaf.core.ArchitectureView;
import org.nasdanika.models.togaf.core.ArchitectureViewpoint;
import org.nasdanika.models.togaf.core.Concern;
import org.nasdanika.models.togaf.core.CorePackage;
import org.nasdanika.models.togaf.core.ModelKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.ArchitectureViewpointImpl#getFrames <em>Frames</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.ArchitectureViewpointImpl#getGoverns <em>Governs</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.impl.ArchitectureViewpointImpl#getModelKinds <em>Model Kinds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureViewpointImpl extends MinimalEObjectImpl.Container implements ArchitectureViewpoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureViewpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ARCHITECTURE_VIEWPOINT;
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Concern> getFrames() {
		return (EList<Concern>)eDynamicGet(CorePackage.ARCHITECTURE_VIEWPOINT__FRAMES, CorePackage.Literals.ARCHITECTURE_VIEWPOINT__FRAMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchitectureView getGoverns() {
		return (ArchitectureView)eDynamicGet(CorePackage.ARCHITECTURE_VIEWPOINT__GOVERNS, CorePackage.Literals.ARCHITECTURE_VIEWPOINT__GOVERNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureView basicGetGoverns() {
		return (ArchitectureView)eDynamicGet(CorePackage.ARCHITECTURE_VIEWPOINT__GOVERNS, CorePackage.Literals.ARCHITECTURE_VIEWPOINT__GOVERNS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoverns(ArchitectureView newGoverns) {
		eDynamicSet(CorePackage.ARCHITECTURE_VIEWPOINT__GOVERNS, CorePackage.Literals.ARCHITECTURE_VIEWPOINT__GOVERNS, newGoverns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ModelKind> getModelKinds() {
		return (EList<ModelKind>)eDynamicGet(CorePackage.ARCHITECTURE_VIEWPOINT__MODEL_KINDS, CorePackage.Literals.ARCHITECTURE_VIEWPOINT__MODEL_KINDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ARCHITECTURE_VIEWPOINT__FRAMES:
				return getFrames();
			case CorePackage.ARCHITECTURE_VIEWPOINT__GOVERNS:
				if (resolve) return getGoverns();
				return basicGetGoverns();
			case CorePackage.ARCHITECTURE_VIEWPOINT__MODEL_KINDS:
				return getModelKinds();
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
			case CorePackage.ARCHITECTURE_VIEWPOINT__FRAMES:
				getFrames().clear();
				getFrames().addAll((Collection<? extends Concern>)newValue);
				return;
			case CorePackage.ARCHITECTURE_VIEWPOINT__GOVERNS:
				setGoverns((ArchitectureView)newValue);
				return;
			case CorePackage.ARCHITECTURE_VIEWPOINT__MODEL_KINDS:
				getModelKinds().clear();
				getModelKinds().addAll((Collection<? extends ModelKind>)newValue);
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
			case CorePackage.ARCHITECTURE_VIEWPOINT__FRAMES:
				getFrames().clear();
				return;
			case CorePackage.ARCHITECTURE_VIEWPOINT__GOVERNS:
				setGoverns((ArchitectureView)null);
				return;
			case CorePackage.ARCHITECTURE_VIEWPOINT__MODEL_KINDS:
				getModelKinds().clear();
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
			case CorePackage.ARCHITECTURE_VIEWPOINT__FRAMES:
				return !getFrames().isEmpty();
			case CorePackage.ARCHITECTURE_VIEWPOINT__GOVERNS:
				return basicGetGoverns() != null;
			case CorePackage.ARCHITECTURE_VIEWPOINT__MODEL_KINDS:
				return !getModelKinds().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArchitectureViewpointImpl
