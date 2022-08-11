/**
 */
package Terminplaner.impl;

import Terminplaner.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TerminplanerFactoryImpl extends EFactoryImpl implements TerminplanerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TerminplanerFactory init() {
		try {
			TerminplanerFactory theTerminplanerFactory = (TerminplanerFactory)EPackage.Registry.INSTANCE.getEFactory(TerminplanerPackage.eNS_URI);
			if (theTerminplanerFactory != null) {
				return theTerminplanerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TerminplanerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminplanerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TerminplanerPackage.TERMIN: return createTermin();
			case TerminplanerPackage.NUTZER: return createNutzer();
			case TerminplanerPackage.PROJEKT: return createProjekt();
			case TerminplanerPackage.VERWALTUNGSSYSTEM: return createVerwaltungssystem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Termin createTermin() {
		TerminImpl termin = new TerminImpl();
		return termin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nutzer createNutzer() {
		NutzerImpl nutzer = new NutzerImpl();
		return nutzer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Projekt createProjekt() {
		ProjektImpl projekt = new ProjektImpl();
		return projekt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Verwaltungssystem createVerwaltungssystem() {
		VerwaltungssystemImpl verwaltungssystem = new VerwaltungssystemImpl();
		return verwaltungssystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminplanerPackage getTerminplanerPackage() {
		return (TerminplanerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TerminplanerPackage getPackage() {
		return TerminplanerPackage.eINSTANCE;
	}

} //TerminplanerFactoryImpl
