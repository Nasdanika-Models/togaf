/**
 */
package org.nasdanika.models.togaf.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.togaf.core.ArchitectureDescription#getExpresses <em>Expresses</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.ArchitectureDescription#getIdentifiesSystem <em>Identifies System</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.ArchitectureDescription#getIdentifiesStakeholders <em>Identifies Stakeholders</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.ArchitectureDescription#getIdentifiesConcerns <em>Identifies Concerns</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.ArchitectureDescription#getViewPoints <em>View Points</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.ArchitectureDescription#getViews <em>Views</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.togaf.core.CorePackage#getArchitectureDescription()
 * @model
 * @generated
 */
public interface ArchitectureDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Expresses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ArchitectureDescription expresses Architecture
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expresses</em>' reference.
	 * @see #setExpresses(Architecture)
	 * @see org.nasdanika.models.togaf.core.CorePackage#getArchitectureDescription_Expresses()
	 * @model
	 * @generated
	 */
	Architecture getExpresses();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.togaf.core.ArchitectureDescription#getExpresses <em>Expresses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expresses</em>' reference.
	 * @see #getExpresses()
	 * @generated
	 */
	void setExpresses(Architecture value);

	/**
	 * Returns the value of the '<em><b>Identifies System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ArchitectureDescription identifies System
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifies System</em>' reference.
	 * @see #setIdentifiesSystem(org.nasdanika.models.togaf.core.System)
	 * @see org.nasdanika.models.togaf.core.CorePackage#getArchitectureDescription_IdentifiesSystem()
	 * @model required="true"
	 * @generated
	 */
	org.nasdanika.models.togaf.core.System getIdentifiesSystem();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.togaf.core.ArchitectureDescription#getIdentifiesSystem <em>Identifies System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifies System</em>' reference.
	 * @see #getIdentifiesSystem()
	 * @generated
	 */
	void setIdentifiesSystem(org.nasdanika.models.togaf.core.System value);

	/**
	 * Returns the value of the '<em><b>Identifies Stakeholders</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.togaf.core.Stakeholder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ArchitectureDescription identifies System
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifies Stakeholders</em>' reference list.
	 * @see org.nasdanika.models.togaf.core.CorePackage#getArchitectureDescription_IdentifiesStakeholders()
	 * @model required="true"
	 * @generated
	 */
	EList<Stakeholder> getIdentifiesStakeholders();

	/**
	 * Returns the value of the '<em><b>Identifies Concerns</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.togaf.core.Concern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ArchitectureDescription identifies System
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifies Concerns</em>' reference list.
	 * @see org.nasdanika.models.togaf.core.CorePackage#getArchitectureDescription_IdentifiesConcerns()
	 * @model required="true"
	 * @generated
	 */
	EList<Concern> getIdentifiesConcerns();

	/**
	 * Returns the value of the '<em><b>View Points</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.togaf.core.ArchitectureViewpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Points</em>' reference list.
	 * @see org.nasdanika.models.togaf.core.CorePackage#getArchitectureDescription_ViewPoints()
	 * @model required="true"
	 * @generated
	 */
	EList<ArchitectureViewpoint> getViewPoints();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.togaf.core.ArchitectureView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' reference list.
	 * @see org.nasdanika.models.togaf.core.CorePackage#getArchitectureDescription_Views()
	 * @model required="true"
	 * @generated
	 */
	EList<ArchitectureView> getViews();

} // ArchitectureDescription
