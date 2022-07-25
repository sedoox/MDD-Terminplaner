/**
 */
package Terminplaner;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Terminplaner.TerminplanerFactory
 * @model kind="package"
 * @generated
 */
public interface TerminplanerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Terminplaner";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "de.thm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.thm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TerminplanerPackage eINSTANCE = Terminplaner.impl.TerminplanerPackageImpl.init();

	/**
	 * The meta object id for the '{@link Terminplaner.impl.TerminImpl <em>Termin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Terminplaner.impl.TerminImpl
	 * @see Terminplaner.impl.TerminplanerPackageImpl#getTermin()
	 * @generated
	 */
	int TERMIN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMIN__BESCHREIBUNG = 1;

	/**
	 * The feature id for the '<em><b>Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMIN__DATUM = 2;

	/**
	 * The feature id for the '<em><b>Nutzer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMIN__NUTZER = 3;

	/**
	 * The number of structural features of the '<em>Termin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMIN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Termin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Terminplaner.impl.NutzerImpl <em>Nutzer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Terminplaner.impl.NutzerImpl
	 * @see Terminplaner.impl.TerminplanerPackageImpl#getNutzer()
	 * @generated
	 */
	int NUTZER = 1;

	/**
	 * The feature id for the '<em><b>Vorname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTZER__VORNAME = 0;

	/**
	 * The feature id for the '<em><b>Nachname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTZER__NACHNAME = 1;

	/**
	 * The feature id for the '<em><b>Termine</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTZER__TERMINE = 2;

	/**
	 * The feature id for the '<em><b>Projekte</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTZER__PROJEKTE = 3;

	/**
	 * The number of structural features of the '<em>Nutzer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTZER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Nutzer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTZER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Terminplaner.impl.ProjektImpl <em>Projekt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Terminplaner.impl.ProjektImpl
	 * @see Terminplaner.impl.TerminplanerPackageImpl#getProjekt()
	 * @generated
	 */
	int PROJEKT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJEKT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJEKT__BESCHREIBUNG = 1;

	/**
	 * The feature id for the '<em><b>Nutzer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJEKT__NUTZER = 2;

	/**
	 * The number of structural features of the '<em>Projekt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJEKT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Projekt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJEKT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Terminplaner.impl.KalenderImpl <em>Kalender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Terminplaner.impl.KalenderImpl
	 * @see Terminplaner.impl.TerminplanerPackageImpl#getKalender()
	 * @generated
	 */
	int KALENDER = 3;

	/**
	 * The feature id for the '<em><b>Projekte</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KALENDER__PROJEKTE = 0;

	/**
	 * The feature id for the '<em><b>Termine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KALENDER__TERMINE = 1;

	/**
	 * The feature id for the '<em><b>Nutzer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KALENDER__NUTZER = 2;

	/**
	 * The number of structural features of the '<em>Kalender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KALENDER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Kalender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KALENDER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Terminplaner.Termin <em>Termin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termin</em>'.
	 * @see Terminplaner.Termin
	 * @generated
	 */
	EClass getTermin();

	/**
	 * Returns the meta object for the attribute '{@link Terminplaner.Termin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Terminplaner.Termin#getName()
	 * @see #getTermin()
	 * @generated
	 */
	EAttribute getTermin_Name();

	/**
	 * Returns the meta object for the attribute '{@link Terminplaner.Termin#getBeschreibung <em>Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beschreibung</em>'.
	 * @see Terminplaner.Termin#getBeschreibung()
	 * @see #getTermin()
	 * @generated
	 */
	EAttribute getTermin_Beschreibung();

	/**
	 * Returns the meta object for the attribute '{@link Terminplaner.Termin#getDatum <em>Datum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datum</em>'.
	 * @see Terminplaner.Termin#getDatum()
	 * @see #getTermin()
	 * @generated
	 */
	EAttribute getTermin_Datum();

	/**
	 * Returns the meta object for the reference list '{@link Terminplaner.Termin#getNutzer <em>Nutzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nutzer</em>'.
	 * @see Terminplaner.Termin#getNutzer()
	 * @see #getTermin()
	 * @generated
	 */
	EReference getTermin_Nutzer();

	/**
	 * Returns the meta object for class '{@link Terminplaner.Nutzer <em>Nutzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nutzer</em>'.
	 * @see Terminplaner.Nutzer
	 * @generated
	 */
	EClass getNutzer();

	/**
	 * Returns the meta object for the attribute '{@link Terminplaner.Nutzer#getVorname <em>Vorname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vorname</em>'.
	 * @see Terminplaner.Nutzer#getVorname()
	 * @see #getNutzer()
	 * @generated
	 */
	EAttribute getNutzer_Vorname();

	/**
	 * Returns the meta object for the attribute '{@link Terminplaner.Nutzer#getNachname <em>Nachname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nachname</em>'.
	 * @see Terminplaner.Nutzer#getNachname()
	 * @see #getNutzer()
	 * @generated
	 */
	EAttribute getNutzer_Nachname();

	/**
	 * Returns the meta object for the reference list '{@link Terminplaner.Nutzer#getTermine <em>Termine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Termine</em>'.
	 * @see Terminplaner.Nutzer#getTermine()
	 * @see #getNutzer()
	 * @generated
	 */
	EReference getNutzer_Termine();

	/**
	 * Returns the meta object for the reference list '{@link Terminplaner.Nutzer#getProjekte <em>Projekte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Projekte</em>'.
	 * @see Terminplaner.Nutzer#getProjekte()
	 * @see #getNutzer()
	 * @generated
	 */
	EReference getNutzer_Projekte();

	/**
	 * Returns the meta object for class '{@link Terminplaner.Projekt <em>Projekt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Projekt</em>'.
	 * @see Terminplaner.Projekt
	 * @generated
	 */
	EClass getProjekt();

	/**
	 * Returns the meta object for the attribute '{@link Terminplaner.Projekt#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Terminplaner.Projekt#getName()
	 * @see #getProjekt()
	 * @generated
	 */
	EAttribute getProjekt_Name();

	/**
	 * Returns the meta object for the attribute '{@link Terminplaner.Projekt#getBeschreibung <em>Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beschreibung</em>'.
	 * @see Terminplaner.Projekt#getBeschreibung()
	 * @see #getProjekt()
	 * @generated
	 */
	EAttribute getProjekt_Beschreibung();

	/**
	 * Returns the meta object for the reference list '{@link Terminplaner.Projekt#getNutzer <em>Nutzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nutzer</em>'.
	 * @see Terminplaner.Projekt#getNutzer()
	 * @see #getProjekt()
	 * @generated
	 */
	EReference getProjekt_Nutzer();

	/**
	 * Returns the meta object for class '{@link Terminplaner.Kalender <em>Kalender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kalender</em>'.
	 * @see Terminplaner.Kalender
	 * @generated
	 */
	EClass getKalender();

	/**
	 * Returns the meta object for the containment reference list '{@link Terminplaner.Kalender#getProjekte <em>Projekte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projekte</em>'.
	 * @see Terminplaner.Kalender#getProjekte()
	 * @see #getKalender()
	 * @generated
	 */
	EReference getKalender_Projekte();

	/**
	 * Returns the meta object for the containment reference list '{@link Terminplaner.Kalender#getTermine <em>Termine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Termine</em>'.
	 * @see Terminplaner.Kalender#getTermine()
	 * @see #getKalender()
	 * @generated
	 */
	EReference getKalender_Termine();

	/**
	 * Returns the meta object for the containment reference list '{@link Terminplaner.Kalender#getNutzer <em>Nutzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nutzer</em>'.
	 * @see Terminplaner.Kalender#getNutzer()
	 * @see #getKalender()
	 * @generated
	 */
	EReference getKalender_Nutzer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TerminplanerFactory getTerminplanerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Terminplaner.impl.TerminImpl <em>Termin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Terminplaner.impl.TerminImpl
		 * @see Terminplaner.impl.TerminplanerPackageImpl#getTermin()
		 * @generated
		 */
		EClass TERMIN = eINSTANCE.getTermin();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMIN__NAME = eINSTANCE.getTermin_Name();

		/**
		 * The meta object literal for the '<em><b>Beschreibung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMIN__BESCHREIBUNG = eINSTANCE.getTermin_Beschreibung();

		/**
		 * The meta object literal for the '<em><b>Datum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMIN__DATUM = eINSTANCE.getTermin_Datum();

		/**
		 * The meta object literal for the '<em><b>Nutzer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMIN__NUTZER = eINSTANCE.getTermin_Nutzer();

		/**
		 * The meta object literal for the '{@link Terminplaner.impl.NutzerImpl <em>Nutzer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Terminplaner.impl.NutzerImpl
		 * @see Terminplaner.impl.TerminplanerPackageImpl#getNutzer()
		 * @generated
		 */
		EClass NUTZER = eINSTANCE.getNutzer();

		/**
		 * The meta object literal for the '<em><b>Vorname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUTZER__VORNAME = eINSTANCE.getNutzer_Vorname();

		/**
		 * The meta object literal for the '<em><b>Nachname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUTZER__NACHNAME = eINSTANCE.getNutzer_Nachname();

		/**
		 * The meta object literal for the '<em><b>Termine</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUTZER__TERMINE = eINSTANCE.getNutzer_Termine();

		/**
		 * The meta object literal for the '<em><b>Projekte</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUTZER__PROJEKTE = eINSTANCE.getNutzer_Projekte();

		/**
		 * The meta object literal for the '{@link Terminplaner.impl.ProjektImpl <em>Projekt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Terminplaner.impl.ProjektImpl
		 * @see Terminplaner.impl.TerminplanerPackageImpl#getProjekt()
		 * @generated
		 */
		EClass PROJEKT = eINSTANCE.getProjekt();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJEKT__NAME = eINSTANCE.getProjekt_Name();

		/**
		 * The meta object literal for the '<em><b>Beschreibung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJEKT__BESCHREIBUNG = eINSTANCE.getProjekt_Beschreibung();

		/**
		 * The meta object literal for the '<em><b>Nutzer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJEKT__NUTZER = eINSTANCE.getProjekt_Nutzer();

		/**
		 * The meta object literal for the '{@link Terminplaner.impl.KalenderImpl <em>Kalender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Terminplaner.impl.KalenderImpl
		 * @see Terminplaner.impl.TerminplanerPackageImpl#getKalender()
		 * @generated
		 */
		EClass KALENDER = eINSTANCE.getKalender();

		/**
		 * The meta object literal for the '<em><b>Projekte</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KALENDER__PROJEKTE = eINSTANCE.getKalender_Projekte();

		/**
		 * The meta object literal for the '<em><b>Termine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KALENDER__TERMINE = eINSTANCE.getKalender_Termine();

		/**
		 * The meta object literal for the '<em><b>Nutzer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KALENDER__NUTZER = eINSTANCE.getKalender_Nutzer();

	}

} //TerminplanerPackage
