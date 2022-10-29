/**
 */
package sql_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql_metamodel.Table#getListPrimaryKeys <em>List Primary Keys</em>}</li>
 *   <li>{@link sql_metamodel.Table#getListForeignKeys <em>List Foreign Keys</em>}</li>
 *   <li>{@link sql_metamodel.Table#getListColumns <em>List Columns</em>}</li>
 *   <li>{@link sql_metamodel.Table#getListRelations <em>List Relations</em>}</li>
 * </ul>
 *
 * @see sql_metamodel.Sql_metamodelPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends ModelElement {
	/**
	 * Returns the value of the '<em><b>List Primary Keys</b></em>' containment reference list.
	 * The list contents are of type {@link sql_metamodel.PrimaryKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Primary Keys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Primary Keys</em>' containment reference list.
	 * @see sql_metamodel.Sql_metamodelPackage#getTable_ListPrimaryKeys()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrimaryKey> getListPrimaryKeys();

	/**
	 * Returns the value of the '<em><b>List Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link sql_metamodel.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Foreign Keys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Foreign Keys</em>' containment reference list.
	 * @see sql_metamodel.Sql_metamodelPackage#getTable_ListForeignKeys()
	 * @model containment="true"
	 * @generated
	 */
	EList<ForeignKey> getListForeignKeys();

	/**
	 * Returns the value of the '<em><b>List Columns</b></em>' containment reference list.
	 * The list contents are of type {@link sql_metamodel.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Columns</em>' containment reference list.
	 * @see sql_metamodel.Sql_metamodelPackage#getTable_ListColumns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getListColumns();

	/**
	 * Returns the value of the '<em><b>List Relations</b></em>' containment reference list.
	 * The list contents are of type {@link sql_metamodel.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Relations</em>' containment reference list.
	 * @see sql_metamodel.Sql_metamodelPackage#getTable_ListRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getListRelations();

} // Table
