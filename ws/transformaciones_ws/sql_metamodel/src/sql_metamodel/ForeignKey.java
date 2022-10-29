/**
 */
package sql_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql_metamodel.ForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link sql_metamodel.ForeignKey#getPrimaryKey <em>Primary Key</em>}</li>
 * </ul>
 *
 * @see sql_metamodel.Sql_metamodelPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sql_metamodel.Sql_metamodelPackage#getForeignKey_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sql_metamodel.ForeignKey#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' reference.
	 * @see #setPrimaryKey(PrimaryKey)
	 * @see sql_metamodel.Sql_metamodelPackage#getForeignKey_PrimaryKey()
	 * @model
	 * @generated
	 */
	PrimaryKey getPrimaryKey();

	/**
	 * Sets the value of the '{@link sql_metamodel.ForeignKey#getPrimaryKey <em>Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' reference.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(PrimaryKey value);

} // ForeignKey
