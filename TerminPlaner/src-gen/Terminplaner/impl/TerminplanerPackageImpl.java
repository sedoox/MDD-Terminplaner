/**
 */
package Terminplaner.impl;

import Terminplaner.Kalender;
import Terminplaner.Nutzer;
import Terminplaner.Projekt;
import Terminplaner.Termin;
import Terminplaner.TerminplanerFactory;
import Terminplaner.TerminplanerPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TerminplanerPackageImpl extends EPackageImpl implements TerminplanerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutzerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projektEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kalenderEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Terminplaner.TerminplanerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TerminplanerPackageImpl() {
		super(eNS_URI, TerminplanerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TerminplanerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TerminplanerPackage init() {
		if (isInited) return (TerminplanerPackage)EPackage.Registry.INSTANCE.getEPackage(TerminplanerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTerminplanerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TerminplanerPackageImpl theTerminplanerPackage = registeredTerminplanerPackage instanceof TerminplanerPackageImpl ? (TerminplanerPackageImpl)registeredTerminplanerPackage : new TerminplanerPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTerminplanerPackage.createPackageContents();

		// Initialize created meta-data
		theTerminplanerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTerminplanerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TerminplanerPackage.eNS_URI, theTerminplanerPackage);
		return theTerminplanerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermin() {
		return terminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTermin_Name() {
		return (EAttribute)terminEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTermin_Beschreibung() {
		return (EAttribute)terminEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTermin_Datum() {
		return (EAttribute)terminEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermin_Nutzer() {
		return (EReference)terminEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutzer() {
		return nutzerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNutzer_Vorname() {
		return (EAttribute)nutzerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNutzer_Nachname() {
		return (EAttribute)nutzerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutzer_Termine() {
		return (EReference)nutzerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutzer_Projekte() {
		return (EReference)nutzerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjekt() {
		return projektEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjekt_Name() {
		return (EAttribute)projektEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjekt_Beschreibung() {
		return (EAttribute)projektEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjekt_Nutzer() {
		return (EReference)projektEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKalender() {
		return kalenderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKalender_Projekte() {
		return (EReference)kalenderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKalender_Termine() {
		return (EReference)kalenderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKalender_Nutzer() {
		return (EReference)kalenderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminplanerFactory getTerminplanerFactory() {
		return (TerminplanerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		terminEClass = createEClass(TERMIN);
		createEAttribute(terminEClass, TERMIN__NAME);
		createEAttribute(terminEClass, TERMIN__BESCHREIBUNG);
		createEAttribute(terminEClass, TERMIN__DATUM);
		createEReference(terminEClass, TERMIN__NUTZER);

		nutzerEClass = createEClass(NUTZER);
		createEAttribute(nutzerEClass, NUTZER__VORNAME);
		createEAttribute(nutzerEClass, NUTZER__NACHNAME);
		createEReference(nutzerEClass, NUTZER__TERMINE);
		createEReference(nutzerEClass, NUTZER__PROJEKTE);

		projektEClass = createEClass(PROJEKT);
		createEAttribute(projektEClass, PROJEKT__NAME);
		createEAttribute(projektEClass, PROJEKT__BESCHREIBUNG);
		createEReference(projektEClass, PROJEKT__NUTZER);

		kalenderEClass = createEClass(KALENDER);
		createEReference(kalenderEClass, KALENDER__PROJEKTE);
		createEReference(kalenderEClass, KALENDER__TERMINE);
		createEReference(kalenderEClass, KALENDER__NUTZER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(terminEClass, Termin.class, "Termin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTermin_Name(), ecorePackage.getEString(), "name", null, 0, 1, Termin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTermin_Beschreibung(), ecorePackage.getEString(), "beschreibung", null, 0, 1, Termin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTermin_Datum(), ecorePackage.getEDate(), "datum", null, 0, 1, Termin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTermin_Nutzer(), this.getNutzer(), this.getNutzer_Termine(), "nutzer", null, 0, -1, Termin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nutzerEClass, Nutzer.class, "Nutzer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNutzer_Vorname(), ecorePackage.getEString(), "vorname", null, 0, 1, Nutzer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNutzer_Nachname(), ecorePackage.getEString(), "nachname", null, 0, 1, Nutzer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNutzer_Termine(), this.getTermin(), this.getTermin_Nutzer(), "termine", null, 0, -1, Nutzer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNutzer_Projekte(), this.getProjekt(), this.getProjekt_Nutzer(), "projekte", null, 0, -1, Nutzer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projektEClass, Projekt.class, "Projekt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjekt_Name(), ecorePackage.getEString(), "name", null, 0, 1, Projekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjekt_Beschreibung(), ecorePackage.getEString(), "beschreibung", null, 0, 1, Projekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjekt_Nutzer(), this.getNutzer(), this.getNutzer_Projekte(), "nutzer", null, 0, -1, Projekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kalenderEClass, Kalender.class, "Kalender", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKalender_Projekte(), this.getProjekt(), null, "projekte", null, 0, -1, Kalender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKalender_Termine(), this.getTermin(), null, "termine", null, 0, -1, Kalender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKalender_Nutzer(), this.getNutzer(), null, "nutzer", null, 0, -1, Kalender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TerminplanerPackageImpl
