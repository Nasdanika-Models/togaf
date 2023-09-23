/**
 */
package org.nasdanika.models.togaf.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.togaf.core.ArchitectureViewpoint#getFrames <em>Frames</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.ArchitectureViewpoint#getGoverns <em>Governs</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.ArchitectureViewpoint#getModelKinds <em>Model Kinds</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.togaf.core.CorePackage#getArchitectureViewpoint()
 * @model
 * @generated
 */
public interface ArchitectureViewpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Frames</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.togaf.core.Concern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frames</em>' reference list.
	 * @see org.nasdanika.models.togaf.core.CorePackage#getArchitectureViewpoint_Frames()
	 * @model
	 * @generated
	 */
	EList<Concern> getFrames();

	/**
	 * Returns the value of the '<em><b>Governs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Governs</em>' reference.
	 * @see #setGoverns(ArchitectureView)
	 * @see org.nasdanika.models.togaf.core.CorePackage#getArchitectureViewpoint_Governs()
	 * @model
	 * @generated
	 */
	ArchitectureView getGoverns();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.togaf.core.ArchitectureViewpoint#getGoverns <em>Governs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Governs</em>' reference.
	 * @see #getGoverns()
	 * @generated
	 */
	void setGoverns(ArchitectureView value);

	/**
	 * Returns the value of the '<em><b>Model Kinds</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.togaf.core.ModelKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Kinds</em>' reference list.
	 * @see org.nasdanika.models.togaf.core.CorePackage#getArchitectureViewpoint_ModelKinds()
	 * @model required="true"
	 * @generated
	 */
	EList<ModelKind> getModelKinds();

} // ArchitectureViewpoint
