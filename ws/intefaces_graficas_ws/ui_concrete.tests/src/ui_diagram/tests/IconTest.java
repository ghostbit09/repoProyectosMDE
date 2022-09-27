/**
 */
package ui_diagram.tests;

import junit.textui.TestRunner;

import ui_diagram.Icon;
import ui_diagram.Ui_diagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Icon</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IconTest extends GraphicalIndividualTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IconTest.class);
	}

	/**
	 * Constructs a new Icon test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Icon test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Icon getFixture() {
		return (Icon)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Ui_diagramFactory.eINSTANCE.createIcon());
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

} //IconTest
