/**
 */
package ucdiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Limit Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucdiagram.LimitBox#getName <em>Name</em>}</li>
 *   <li>{@link ucdiagram.LimitBox#getUseCases <em>Use Cases</em>}</li>
 * </ul>
 *
 * @see ucdiagram.UcdiagramPackage#getLimitBox()
 * @model annotation="gmf.node label='name' label.layout='center'"
 * @generated
 */
public interface LimitBox extends EObject {
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
	 * @see ucdiagram.UcdiagramPackage#getLimitBox_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ucdiagram.LimitBox#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Use Cases</b></em>' containment reference list.
	 * The list contents are of type {@link ucdiagram.UseCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Cases</em>' containment reference list.
	 * @see ucdiagram.UcdiagramPackage#getLimitBox_UseCases()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseCase> getUseCases();

} // LimitBox
