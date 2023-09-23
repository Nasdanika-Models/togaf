/**
 */
package org.nasdanika.models.togaf.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.togaf.core.ModelKind#getGoverns <em>Governs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.togaf.core.CorePackage#getModelKind()
 * @model
 * @generated
 */
public interface ModelKind extends EObject {
	/**
	 * Returns the value of the '<em><b>Governs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Governs</em>' reference.
	 * @see #setGoverns(ArchitectureModel)
	 * @see org.nasdanika.models.togaf.core.CorePackage#getModelKind_Governs()
	 * @model
	 * @generated
	 */
	ArchitectureModel getGoverns();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.togaf.core.ModelKind#getGoverns <em>Governs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Governs</em>' reference.
	 * @see #getGoverns()
	 * @generated
	 */
	void setGoverns(ArchitectureModel value);

} // ModelKind
