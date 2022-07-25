/**
 */
package Terminplaner.tests;

import Terminplaner.Nutzer;
import Terminplaner.TerminplanerFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Nutzer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NutzerTest extends TestCase {

	/**
	 * The fixture for this Nutzer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Nutzer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NutzerTest.class);
	}

	/**
	 * Constructs a new Nutzer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutzerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Nutzer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Nutzer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Nutzer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Nutzer getFixture() {
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
		setFixture(TerminplanerFactory.eINSTANCE.createNutzer());
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

} //NutzerTest
