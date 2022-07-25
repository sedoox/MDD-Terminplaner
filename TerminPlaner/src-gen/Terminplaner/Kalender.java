/**
 */
package Terminplaner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kalender</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Terminplaner.Kalender#getProjekte <em>Projekte</em>}</li>
 *   <li>{@link Terminplaner.Kalender#getTermine <em>Termine</em>}</li>
 *   <li>{@link Terminplaner.Kalender#getNutzer <em>Nutzer</em>}</li>
 * </ul>
 *
 * @see Terminplaner.TerminplanerPackage#getKalender()
 * @model
 * @generated
 */
public interface Kalender extends EObject {
	/**
	 * Returns the value of the '<em><b>Projekte</b></em>' containment reference list.
	 * The list contents are of type {@link Terminplaner.Projekt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projekte</em>' containment reference list.
	 * @see Terminplaner.TerminplanerPackage#getKalender_Projekte()
	 * @model containment="true"
	 * @generated
	 */
	EList<Projekt> getProjekte();

	/**
	 * Returns the value of the '<em><b>Termine</b></em>' containment reference list.
	 * The list contents are of type {@link Terminplaner.Termin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termine</em>' containment reference list.
	 * @see Terminplaner.TerminplanerPackage#getKalender_Termine()
	 * @model containment="true"
	 * @generated
	 */
	EList<Termin> getTermine();

	/**
	 * Returns the value of the '<em><b>Nutzer</b></em>' containment reference list.
	 * The list contents are of type {@link Terminplaner.Nutzer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nutzer</em>' containment reference list.
	 * @see Terminplaner.TerminplanerPackage#getKalender_Nutzer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Nutzer> getNutzer();

} // Kalender
