/**
 */
package ucdiagram.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ucdiagram.LimitBox;
import ucdiagram.UcdiagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Limit Box</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LimitBoxTest extends TestCase {

	/**
	 * The fixture for this Limit Box test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LimitBox fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LimitBoxTest.class);
	}

	/**
	 * Constructs a new Limit Box test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimitBoxTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Limit Box test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LimitBox fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Limit Box test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LimitBox getFixture() {
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
		setFixture(UcdiagramFactory.eINSTANCE.createLimitBox());
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

} //LimitBoxTest
