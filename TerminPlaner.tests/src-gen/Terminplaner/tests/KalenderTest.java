/**
 */
package Terminplaner.tests;

import Terminplaner.Kalender;
import Terminplaner.TerminplanerFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Kalender</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KalenderTest extends TestCase {

	/**
	 * The fixture for this Kalender test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Kalender fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KalenderTest.class);
	}

	/**
	 * Constructs a new Kalender test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KalenderTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Kalender test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Kalender fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Kalender test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Kalender getFixture() {
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
		setFixture(TerminplanerFactory.eINSTANCE.createKalender());
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

} //KalenderTest
