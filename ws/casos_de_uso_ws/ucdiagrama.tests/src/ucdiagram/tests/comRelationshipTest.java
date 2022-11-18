/**
 */
package ucdiagram.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ucdiagram.UcdiagramFactory;
import ucdiagram.comRelationship;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>com Relationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class comRelationshipTest extends TestCase {

	/**
	 * The fixture for this com Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected comRelationship fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(comRelationshipTest.class);
	}

	/**
	 * Constructs a new com Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public comRelationshipTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this com Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(comRelationship fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this com Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected comRelationship getFixture() {
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
		setFixture(UcdiagramFactory.eINSTANCE.createcomRelationship());
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

} //comRelationshipTest
