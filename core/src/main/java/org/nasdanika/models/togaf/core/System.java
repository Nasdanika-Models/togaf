/**
 */
package org.nasdanika.models.togaf.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.togaf.core.System#getExhibits <em>Exhibits</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.togaf.core.CorePackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Exhibits</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A System exibits Architecture
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exhibits</em>' reference.
	 * @see #setExhibits(Architecture)
	 * @see org.nasdanika.models.togaf.core.CorePackage#getSystem_Exhibits()
	 * @model
	 * @generated
	 */
	Architecture getExhibits();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.togaf.core.System#getExhibits <em>Exhibits</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exhibits</em>' reference.
	 * @see #getExhibits()
	 * @generated
	 */
	void setExhibits(Architecture value);

} // System
