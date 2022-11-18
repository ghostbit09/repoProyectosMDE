/**
 */
package ucdiagram.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ucdiagram.UcdiagramFactory;
import ucdiagram.uc_diagram;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>uc diagram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class uc_diagramTest extends TestCase {

	/**
	 * The fixture for this uc diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected uc_diagram fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(uc_diagramTest.class);
	}

	/**
	 * Constructs a new uc diagram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uc_diagramTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this uc diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(uc_diagram fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this uc diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected uc_diagram getFixture() {
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
		setFixture(UcdiagramFactory.eINSTANCE.createuc_diagram());
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

} //uc_diagramTest
