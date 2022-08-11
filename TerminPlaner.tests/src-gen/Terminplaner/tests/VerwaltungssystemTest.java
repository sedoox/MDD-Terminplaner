/**
 */
package Terminplaner.tests;

import Terminplaner.TerminplanerFactory;
import Terminplaner.Verwaltungssystem;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Verwaltungssystem</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VerwaltungssystemTest extends TestCase {

	/**
	 * The fixture for this Verwaltungssystem test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Verwaltungssystem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VerwaltungssystemTest.class);
	}

	/**
	 * Constructs a new Verwaltungssystem test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerwaltungssystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Verwaltungssystem test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Verwaltungssystem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Verwaltungssystem test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Verwaltungssystem getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TerminplanerFactory.eINSTANCE.createVerwaltungssystem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //VerwaltungssystemTest
