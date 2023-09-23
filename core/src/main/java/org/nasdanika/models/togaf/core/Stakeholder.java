/**
 */
package org.nasdanika.models.togaf.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.togaf.core.Stakeholder#getHasInterestIn <em>Has Interest In</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.Stakeholder#getHas <em>Has</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.togaf.core.CorePackage#getStakeholder()
 * @model
 * @generated
 */
public interface Stakeholder extends EObject {

	/**
	 * Returns the value of the '<em><b>Has Interest In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Interest In</em>' reference.
	 * @see #setHasInterestIn(org.nasdanika.models.togaf.core.System)
	 * @see org.nasdanika.models.togaf.core.CorePackage#getStakeholder_HasInterestIn()
	 * @model
	 * @generated
	 */
	org.nasdanika.models.togaf.core.System getHasInterestIn();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.togaf.core.Stakeholder#getHasInterestIn <em>Has Interest In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Interest In</em>' reference.
	 * @see #getHasInterestIn()
	 * @generated
	 */
	void setHasInterestIn(org.nasdanika.models.togaf.core.System value);

	/**
	 * Returns the value of the '<em><b>Has</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.togaf.core.Concern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' reference list.
	 * @see org.nasdanika.models.togaf.core.CorePackage#getStakeholder_Has()
	 * @model
	 * @generated
	 */
	EList<Concern> getHas();
} // Stakeholder
