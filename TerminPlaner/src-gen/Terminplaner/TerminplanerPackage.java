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
	 * The feature id for the '<em><b>Start Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMIN__START_DATUM = 2;

	/**
	 * The feature id for the '<em><b>Nutzer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMIN__NUTZER = 3;

	/**
	 * The feature id for the '<em><b>End Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMIN__END_DATUM = 4;

	/**
	 * The feature id for the '<em><b>Ort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMIN__ORT = 5;

	/**
	 * The number of structural features of the '<em>Termin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMIN_FEATURE_COUNT = 6;

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
	 * The feature id for the '<em><b>Termine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJEKT__TERMINE = 3;

	/**
	 * The number of structural features of the '<em>Projekt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJEKT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Projekt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJEKT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Terminplaner.impl.VerwaltungssystemImpl <em>Verwaltungssystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Terminplaner.impl.VerwaltungssystemImpl
	 * @see Terminplaner.impl.TerminplanerPackageImpl#getVerwaltungssystem()
	 * @generated
	 */
	int VERWALTUNGSSYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Projekte</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWALTUNGSSYSTEM__PROJEKTE = 0;

	/**
	 * The feature id for the '<em><b>Termine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWALTUNGSSYSTEM__TERMINE = 1;

	/**
	 * The feature id for the '<em><b>Nutzer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWALTUNGSSYSTEM__NUTZER = 2;

	/**
	 * The number of structural features of the '<em>Verwaltungssystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWALTUNGSSYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Verwaltungssystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWALTUNGSSYSTEM_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the attribute '{@link Terminplaner.Termin#getStartDatum <em>Start Datum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Datum</em>'.
	 * @see Terminplaner.Termin#getStartDatum()
	 * @see #getTermin()
	 * @generated
	 */
	EAttribute getTermin_StartDatum();

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
	 * Returns the meta object for the attribute '{@link Terminplaner.Termin#getEndDatum <em>End Datum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Datum</em>'.
	 * @see Terminplaner.Termin#getEndDatum()
	 * @see #getTermin()
	 * @generated
	 */
	EAttribute getTermin_EndDatum();

	/**
	 * Returns the meta object for the attribute '{@link Terminplaner.Termin#getOrt <em>Ort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ort</em>'.
	 * @see Terminplaner.Termin#getOrt()
	 * @see #getTermin()
	 * @generated
	 */
	EAttribute getTermin_Ort();

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
	 * Returns the meta object for the reference '{@link Terminplaner.Projekt#getTermine <em>Termine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Termine</em>'.
	 * @see Terminplaner.Projekt#getTermine()
	 * @see #getProjekt()
	 * @generated
	 */
	EReference getProjekt_Termine();

	/**
	 * Returns the meta object for class '{@link Terminplaner.Verwaltungssystem <em>Verwaltungssystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verwaltungssystem</em>'.
	 * @see Terminplaner.Verwaltungssystem
	 * @generated
	 */
	EClass getVerwaltungssystem();

	/**
	 * Returns the meta object for the containment reference list '{@link Terminplaner.Verwaltungssystem#getProjekte <em>Projekte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projekte</em>'.
	 * @see Terminplaner.Verwaltungssystem#getProjekte()
	 * @see #getVerwaltungssystem()
	 * @generated
	 */
	EReference getVerwaltungssystem_Projekte();

	/**
	 * Returns the meta object for the containment reference list '{@link Terminplaner.Verwaltungssystem#getTermine <em>Termine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Termine</em>'.
	 * @see Terminplaner.Verwaltungssystem#getTermine()
	 * @see #getVerwaltungssystem()
	 * @generated
	 */
	EReference getVerwaltungssystem_Termine();

	/**
	 * Returns the meta object for the containment reference list '{@link Terminplaner.Verwaltungssystem#getNutzer <em>Nutzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nutzer</em>'.
	 * @see Terminplaner.Verwaltungssystem#getNutzer()
	 * @see #getVerwaltungssystem()
	 * @generated
	 */
	EReference getVerwaltungssystem_Nutzer();

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
		 * The meta object literal for the '<em><b>Start Datum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMIN__START_DATUM = eINSTANCE.getTermin_StartDatum();

		/**
		 * The meta object literal for the '<em><b>Nutzer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMIN__NUTZER = eINSTANCE.getTermin_Nutzer();

		/**
		 * The meta object literal for the '<em><b>End Datum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMIN__END_DATUM = eINSTANCE.getTermin_EndDatum();

		/**
		 * The meta object literal for the '<em><b>Ort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMIN__ORT = eINSTANCE.getTermin_Ort();

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
		 * The meta object literal for the '<em><b>Termine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJEKT__TERMINE = eINSTANCE.getProjekt_Termine();

		/**
		 * The meta object literal for the '{@link Terminplaner.impl.VerwaltungssystemImpl <em>Verwaltungssystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Terminplaner.impl.VerwaltungssystemImpl
		 * @see Terminplaner.impl.TerminplanerPackageImpl#getVerwaltungssystem()
		 * @generated
		 */
		EClass VERWALTUNGSSYSTEM = eINSTANCE.getVerwaltungssystem();

		/**
		 * The meta object literal for the '<em><b>Projekte</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERWALTUNGSSYSTEM__PROJEKTE = eINSTANCE.getVerwaltungssystem_Projekte();

		/**
		 * The meta object literal for the '<em><b>Termine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERWALTUNGSSYSTEM__TERMINE = eINSTANCE.getVerwaltungssystem_Termine();

		/**
		 * The meta object literal for the '<em><b>Nutzer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERWALTUNGSSYSTEM__NUTZER = eINSTANCE.getVerwaltungssystem_Nutzer();

	}

} //TerminplanerPackage
