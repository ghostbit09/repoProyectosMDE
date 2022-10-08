/**
 */
package uidiagram;

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
 *   <li>{@link uidiagram.Table#getLstColumn <em>Lst Column</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getTable()
 * @model annotation="gmf.node label='name' figure='rectangle'"
 * @generated
 */
public interface Table extends GraphicalContainer {
	/**
	 * Returns the value of the '<em><b>Lst Column</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagram.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Column</em>' containment reference list.
	 * @see uidiagram.UidiagramPackage#getTable_LstColumn()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getLstColumn();

} // Table
