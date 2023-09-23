/**
 */
package org.nasdanika.models.togaf.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.togaf.core.ArchitectureView#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.nasdanika.models.togaf.core.ArchitectureView#getModels <em>Models</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.togaf.core.CorePackage#getArchitectureView()
 * @model
 * @generated
 */
public interface ArchitectureView extends EObject {
	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.togaf.core.Concern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' reference list.
	 * @see org.nasdanika.models.togaf.core.CorePackage#getArchitectureView_Addresses()
	 * @model required="true"
	 * @generated
	 */
	EList<Concern> getAddresses();

	/**
	 * Returns the value of the '<em><b>Models</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.togaf.core.ArchitectureModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' reference list.
	 * @see org.nasdanika.models.togaf.core.CorePackage#getArchitectureView_Models()
	 * @model required="true"
	 * @generated
	 */
	EList<ArchitectureModel> getModels();

} // ArchitectureView
