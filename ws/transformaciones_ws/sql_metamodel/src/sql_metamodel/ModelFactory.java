/**
 */
package sql_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql_metamodel.ModelFactory#getListSchemas <em>List Schemas</em>}</li>
 *   <li>{@link sql_metamodel.ModelFactory#getListAllTables <em>List All Tables</em>}</li>
 * </ul>
 *
 * @see sql_metamodel.Sql_metamodelPackage#getModelFactory()
 * @model
 * @generated
 */
public interface ModelFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>List Schemas</b></em>' containment reference list.
	 * The list contents are of type {@link sql_metamodel.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Schemas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Schemas</em>' containment reference list.
	 * @see sql_metamodel.Sql_metamodelPackage#getModelFactory_ListSchemas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getListSchemas();

	/**
	 * Returns the value of the '<em><b>List All Tables</b></em>' reference list.
	 * The list contents are of type {@link sql_metamodel.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List All Tables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List All Tables</em>' reference list.
	 * @see sql_metamodel.Sql_metamodelPackage#getModelFactory_ListAllTables()
	 * @model
	 * @generated
	 */
	EList<Table> getListAllTables();

} // ModelFactory
