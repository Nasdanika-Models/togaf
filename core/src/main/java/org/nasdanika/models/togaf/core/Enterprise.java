/**
 */
package org.nasdanika.models.togaf.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enterprise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Highest level of description for an organization
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.togaf.core.Enterprise#getEnterpriseContinuum <em>Enterprise Continuum</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.togaf.core.CorePackage#getEnterprise()
 * @model
 * @generated
 */
public interface Enterprise extends EObject {

	/**
	 * Returns the value of the '<em><b>Enterprise Continuum</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.togaf.core.EnterpriseContinuumElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Root (most generic) entries of the enterprise continuum
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enterprise Continuum</em>' containment reference list.
	 * @see org.nasdanika.models.togaf.core.CorePackage#getEnterprise_EnterpriseContinuum()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnterpriseContinuumElement> getEnterpriseContinuum();
} // Enterprise
