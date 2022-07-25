/**
 */
package Terminplaner;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Terminplaner.TerminplanerPackage
 * @generated
 */
public interface TerminplanerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TerminplanerFactory eINSTANCE = Terminplaner.impl.TerminplanerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Termin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Termin</em>'.
	 * @generated
	 */
	Termin createTermin();

	/**
	 * Returns a new object of class '<em>Nutzer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutzer</em>'.
	 * @generated
	 */
	Nutzer createNutzer();

	/**
	 * Returns a new object of class '<em>Projekt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Projekt</em>'.
	 * @generated
	 */
	Projekt createProjekt();

	/**
	 * Returns a new object of class '<em>Kalender</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kalender</em>'.
	 * @generated
	 */
	Kalender createKalender();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TerminplanerPackage getTerminplanerPackage();

} //TerminplanerFactory
