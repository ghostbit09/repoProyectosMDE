/**
 */
package sql_metamodel.tests;

import junit.textui.TestRunner;

import sql_metamodel.Column;
import sql_metamodel.Sql_metamodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColumnTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ColumnTest.class);
	}

	/**
	 * Constructs a new Column test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Column test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Column getFixture() {
		return (Column)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Sql_metamodelFactory.eINSTANCE.createColumn());
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

} //ColumnTest
