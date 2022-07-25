/**
 */
package Terminplaner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutzer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Terminplaner.Nutzer#getVorname <em>Vorname</em>}</li>
 *   <li>{@link Terminplaner.Nutzer#getNachname <em>Nachname</em>}</li>
 *   <li>{@link Terminplaner.Nutzer#getTermine <em>Termine</em>}</li>
 *   <li>{@link Terminplaner.Nutzer#getProjekte <em>Projekte</em>}</li>
 * </ul>
 *
 * @see Terminplaner.TerminplanerPackage#getNutzer()
 * @model
 * @generated
 */
public interface Nutzer extends EObject {
	/**
	 * Returns the value of the '<em><b>Vorname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vorname</em>' attribute.
	 * @see #setVorname(String)
	 * @see Terminplaner.TerminplanerPackage#getNutzer_Vorname()
	 * @model
	 * @generated
	 */
	String getVorname();

	/**
	 * Sets the value of the '{@link Terminplaner.Nutzer#getVorname <em>Vorname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vorname</em>' attribute.
	 * @see #getVorname()
	 * @generated
	 */
	void setVorname(String value);

	/**
	 * Returns the value of the '<em><b>Nachname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachname</em>' attribute.
	 * @see #setNachname(String)
	 * @see Terminplaner.TerminplanerPackage#getNutzer_Nachname()
	 * @model
	 * @generated
	 */
	String getNachname();

	/**
	 * Sets the value of the '{@link Terminplaner.Nutzer#getNachname <em>Nachname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachname</em>' attribute.
	 * @see #getNachname()
	 * @generated
	 */
	void setNachname(String value);

	/**
	 * Returns the value of the '<em><b>Termine</b></em>' reference list.
	 * The list contents are of type {@link Terminplaner.Termin}.
	 * It is bidirectional and its opposite is '{@link Terminplaner.Termin#getNutzer <em>Nutzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termine</em>' reference list.
	 * @see Terminplaner.TerminplanerPackage#getNutzer_Termine()
	 * @see Terminplaner.Termin#getNutzer
	 * @model opposite="nutzer"
	 * @generated
	 */
	EList<Termin> getTermine();

	/**
	 * Returns the value of the '<em><b>Projekte</b></em>' reference list.
	 * The list contents are of type {@link Terminplaner.Projekt}.
	 * It is bidirectional and its opposite is '{@link Terminplaner.Projekt#getNutzer <em>Nutzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projekte</em>' reference list.
	 * @see Terminplaner.TerminplanerPackage#getNutzer_Projekte()
	 * @see Terminplaner.Projekt#getNutzer
	 * @model opposite="nutzer"
	 * @generated
	 */
	EList<Projekt> getProjekte();

} // Nutzer
