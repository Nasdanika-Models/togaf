/**
 */
package org.nasdanika.models.togaf.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deliverable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Deliverables are contractually specified, formally reviewed, approved, and signed off by stakeholders.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.togaf.core.Deliverable#getUses <em>Uses</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.Deliverable#getSignoffs <em>Signoffs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.togaf.core.CorePackage#getDeliverable()
 * @model
 * @generated
 */
public interface Deliverable extends ArchitectureWorkProduct {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.togaf.core.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A deliverable can use/reference zero or more artifacts. TODO: Derived opposite from artifacts to deliverables. Association class with a key and perhaps configuration/properties - an artifact can be a "template" or a pattern and its use is instantiation with given "bindings"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see org.nasdanika.models.togaf.core.CorePackage#getDeliverable_Uses()
	 * @model
	 * @generated
	 */
	EList<Artifact> getUses();

	/**
	 * Returns the value of the '<em><b>Signoffs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.togaf.core.SignOff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tracking of stakeholder interactions. TODO: a better name for the reference which is a generic for review/approval/signoff. A base association class and subclasses - Review, Approval, Signoff. Dates, comments etc for each.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signoffs</em>' reference list.
	 * @see org.nasdanika.models.togaf.core.CorePackage#getDeliverable_Signoffs()
	 * @model required="true"
	 * @generated
	 */
	EList<SignOff> getSignoffs();

} // Deliverable
