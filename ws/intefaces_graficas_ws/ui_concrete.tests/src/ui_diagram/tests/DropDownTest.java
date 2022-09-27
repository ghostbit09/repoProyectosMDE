/**
 */
package ui_diagram.tests;

import junit.textui.TestRunner;

import ui_diagram.DropDown;
import ui_diagram.Ui_diagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Drop Down</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DropDownTest extends GraphicalIndividualTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DropDownTest.class);
	}

	/**
	 * Constructs a new Drop Down test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropDownTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Drop Down test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DropDown getFixture() {
		return (DropDown)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Ui_diagramFactory.eINSTANCE.createDropDown());
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

} //DropDownTest
