/**
 */
package sql_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql_metamodel.Schema#getListTables <em>List Tables</em>}</li>
 * </ul>
 *
 * @see sql_metamodel.Sql_metamodelPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends ModelElement {
	/**
	 * Returns the value of the '<em><b>List Tables</b></em>' containment reference list.
	 * The list contents are of type {@link sql_metamodel.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Tables</em>' containment reference list.
	 * @see sql_metamodel.Sql_metamodelPackage#getSchema_ListTables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getListTables();

} // Schema
