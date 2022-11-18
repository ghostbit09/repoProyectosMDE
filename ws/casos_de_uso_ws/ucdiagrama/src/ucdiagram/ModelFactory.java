/**
 */
package ucdiagram;

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
 *   <li>{@link ucdiagram.ModelFactory#getListDiagrams <em>List Diagrams</em>}</li>
 * </ul>
 *
 * @see ucdiagram.UcdiagramPackage#getModelFactory()
 * @model
 * @generated
 */
public interface ModelFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>List Diagrams</b></em>' containment reference list.
	 * The list contents are of type {@link ucdiagram.uc_diagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Diagrams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Diagrams</em>' containment reference list.
	 * @see ucdiagram.UcdiagramPackage#getModelFactory_ListDiagrams()
	 * @model containment="true"
	 * @generated
	 */
	EList<uc_diagram> getListDiagrams();

} // ModelFactory
