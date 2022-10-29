/**
 */
package sql_metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql_metamodel.Column#getType <em>Type</em>}</li>
 *   <li>{@link sql_metamodel.Column#getIsNotNull <em>Is Not Null</em>}</li>
 *   <li>{@link sql_metamodel.Column#getIsAutoIncremetable <em>Is Auto Incremetable</em>}</li>
 * </ul>
 *
 * @see sql_metamodel.Sql_metamodelPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see sql_metamodel.Sql_metamodelPackage#getColumn_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link sql_metamodel.Column#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Is Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Not Null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Not Null</em>' attribute.
	 * @see #setIsNotNull(Boolean)
	 * @see sql_metamodel.Sql_metamodelPackage#getColumn_IsNotNull()
	 * @model
	 * @generated
	 */
	Boolean getIsNotNull();

	/**
	 * Sets the value of the '{@link sql_metamodel.Column#getIsNotNull <em>Is Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Not Null</em>' attribute.
	 * @see #getIsNotNull()
	 * @generated
	 */
	void setIsNotNull(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Auto Incremetable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Auto Incremetable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Auto Incremetable</em>' attribute.
	 * @see #setIsAutoIncremetable(Boolean)
	 * @see sql_metamodel.Sql_metamodelPackage#getColumn_IsAutoIncremetable()
	 * @model
	 * @generated
	 */
	Boolean getIsAutoIncremetable();

	/**
	 * Sets the value of the '{@link sql_metamodel.Column#getIsAutoIncremetable <em>Is Auto Incremetable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Auto Incremetable</em>' attribute.
	 * @see #getIsAutoIncremetable()
	 * @generated
	 */
	void setIsAutoIncremetable(Boolean value);

} // Column
