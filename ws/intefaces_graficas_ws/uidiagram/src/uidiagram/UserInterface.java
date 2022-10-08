/**
 */
package uidiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.UserInterface#getTitle <em>Title</em>}</li>
 *   <li>{@link uidiagram.UserInterface#getListWidgets <em>List Widgets</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getUserInterface()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface UserInterface extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see uidiagram.UidiagramPackage#getUserInterface_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link uidiagram.UserInterface#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>List Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagram.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Widgets</em>' containment reference list.
	 * @see uidiagram.UidiagramPackage#getUserInterface_ListWidgets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElement> getListWidgets();

} // UserInterface
