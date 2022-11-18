/**
 */
package ucdiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>uc diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucdiagram.uc_diagram#getName <em>Name</em>}</li>
 *   <li>{@link ucdiagram.uc_diagram#getDescription <em>Description</em>}</li>
 *   <li>{@link ucdiagram.uc_diagram#getListActors <em>List Actors</em>}</li>
 *   <li>{@link ucdiagram.uc_diagram#getListBoxes <em>List Boxes</em>}</li>
 *   <li>{@link ucdiagram.uc_diagram#getListComRels <em>List Com Rels</em>}</li>
 *   <li>{@link ucdiagram.uc_diagram#getListIncRels <em>List Inc Rels</em>}</li>
 *   <li>{@link ucdiagram.uc_diagram#getListExtRels <em>List Ext Rels</em>}</li>
 * </ul>
 *
 * @see ucdiagram.UcdiagramPackage#getuc_diagram()
 * @model
 * @generated
 */
public interface uc_diagram extends EObject {
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
	 * @see ucdiagram.UcdiagramPackage#getuc_diagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ucdiagram.uc_diagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ucdiagram.UcdiagramPackage#getuc_diagram_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ucdiagram.uc_diagram#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>List Actors</b></em>' containment reference list.
	 * The list contents are of type {@link ucdiagram.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Actors</em>' containment reference list.
	 * @see ucdiagram.UcdiagramPackage#getuc_diagram_ListActors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getListActors();

	/**
	 * Returns the value of the '<em><b>List Boxes</b></em>' containment reference list.
	 * The list contents are of type {@link ucdiagram.LimitBox}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Boxes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Boxes</em>' containment reference list.
	 * @see ucdiagram.UcdiagramPackage#getuc_diagram_ListBoxes()
	 * @model containment="true"
	 * @generated
	 */
	EList<LimitBox> getListBoxes();

	/**
	 * Returns the value of the '<em><b>List Com Rels</b></em>' containment reference list.
	 * The list contents are of type {@link ucdiagram.comRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Com Rels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Com Rels</em>' containment reference list.
	 * @see ucdiagram.UcdiagramPackage#getuc_diagram_ListComRels()
	 * @model containment="true"
	 * @generated
	 */
	EList<comRelationship> getListComRels();

	/**
	 * Returns the value of the '<em><b>List Inc Rels</b></em>' containment reference list.
	 * The list contents are of type {@link ucdiagram.includeRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Inc Rels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Inc Rels</em>' containment reference list.
	 * @see ucdiagram.UcdiagramPackage#getuc_diagram_ListIncRels()
	 * @model containment="true"
	 * @generated
	 */
	EList<includeRelationship> getListIncRels();

	/**
	 * Returns the value of the '<em><b>List Ext Rels</b></em>' containment reference list.
	 * The list contents are of type {@link ucdiagram.extendsRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Ext Rels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Ext Rels</em>' containment reference list.
	 * @see ucdiagram.UcdiagramPackage#getuc_diagram_ListExtRels()
	 * @model containment="true"
	 * @generated
	 */
	EList<extendsRelationship> getListExtRels();

} // uc_diagram
