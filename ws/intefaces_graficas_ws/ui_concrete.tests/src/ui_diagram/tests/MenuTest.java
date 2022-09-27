/**
 */
package ui_diagram.tests;

import junit.textui.TestRunner;

import ui_diagram.Menu;
import ui_diagram.Ui_diagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MenuTest extends GraphicalIndividualTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MenuTest.class);
	}

	/**
	 * Constructs a new Menu test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Menu test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Menu getFixture() {
		return (Menu)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Ui_diagramFactory.eINSTANCE.createMenu());
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

} //MenuTest
