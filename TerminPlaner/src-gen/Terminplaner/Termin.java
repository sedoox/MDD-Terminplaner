/**
 */
package Terminplaner;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Termin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Terminplaner.Termin#getName <em>Name</em>}</li>
 *   <li>{@link Terminplaner.Termin#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link Terminplaner.Termin#getDatum <em>Datum</em>}</li>
 *   <li>{@link Terminplaner.Termin#getNutzer <em>Nutzer</em>}</li>
 * </ul>
 *
 * @see Terminplaner.TerminplanerPackage#getTermin()
 * @model
 * @generated
 */
public interface Termin extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Terminplaner.TerminplanerPackage#getTermin_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Terminplaner.Termin#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beschreibung</em>' attribute.
	 * @see #setBeschreibung(String)
	 * @see Terminplaner.TerminplanerPackage#getTermin_Beschreibung()
	 * @model
	 * @generated
	 */
	String getBeschreibung();

	/**
	 * Sets the value of the '{@link Terminplaner.Termin#getBeschreibung <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beschreibung</em>' attribute.
	 * @see #getBeschreibung()
	 * @generated
	 */
	void setBeschreibung(String value);

	/**
	 * Returns the value of the '<em><b>Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datum</em>' attribute.
	 * @see #setDatum(Date)
	 * @see Terminplaner.TerminplanerPackage#getTermin_Datum()
	 * @model
	 * @generated
	 */
	Date getDatum();

	/**
	 * Sets the value of the '{@link Terminplaner.Termin#getDatum <em>Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum</em>' attribute.
	 * @see #getDatum()
	 * @generated
	 */
	void setDatum(Date value);

	/**
	 * Returns the value of the '<em><b>Nutzer</b></em>' reference list.
	 * The list contents are of type {@link Terminplaner.Nutzer}.
	 * It is bidirectional and its opposite is '{@link Terminplaner.Nutzer#getTermine <em>Termine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nutzer</em>' reference list.
	 * @see Terminplaner.TerminplanerPackage#getTermin_Nutzer()
	 * @see Terminplaner.Nutzer#getTermine
	 * @model opposite="termine"
	 * @generated
	 */
	EList<Nutzer> getNutzer();

} // Termin
