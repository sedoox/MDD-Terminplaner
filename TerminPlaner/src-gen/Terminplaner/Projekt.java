/**
 */
package Terminplaner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projekt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Terminplaner.Projekt#getName <em>Name</em>}</li>
 *   <li>{@link Terminplaner.Projekt#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link Terminplaner.Projekt#getNutzer <em>Nutzer</em>}</li>
 * </ul>
 *
 * @see Terminplaner.TerminplanerPackage#getProjekt()
 * @model
 * @generated
 */
public interface Projekt extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Terminplaner.TerminplanerPackage#getProjekt_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Terminplaner.Projekt#getName <em>Name</em>}' attribute.
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
	 * @see Terminplaner.TerminplanerPackage#getProjekt_Beschreibung()
	 * @model
	 * @generated
	 */
	String getBeschreibung();

	/**
	 * Sets the value of the '{@link Terminplaner.Projekt#getBeschreibung <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beschreibung</em>' attribute.
	 * @see #getBeschreibung()
	 * @generated
	 */
	void setBeschreibung(String value);

	/**
	 * Returns the value of the '<em><b>Nutzer</b></em>' reference list.
	 * The list contents are of type {@link Terminplaner.Nutzer}.
	 * It is bidirectional and its opposite is '{@link Terminplaner.Nutzer#getProjekte <em>Projekte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nutzer</em>' reference list.
	 * @see Terminplaner.TerminplanerPackage#getProjekt_Nutzer()
	 * @see Terminplaner.Nutzer#getProjekte
	 * @model opposite="projekte"
	 * @generated
	 */
	EList<Nutzer> getNutzer();

} // Projekt
