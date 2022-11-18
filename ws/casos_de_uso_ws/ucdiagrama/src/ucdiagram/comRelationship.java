/**
 */
package ucdiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>com Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucdiagram.comRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link ucdiagram.comRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ucdiagram.UcdiagramPackage#getcomRelationship()
 * @model annotation="gmf.link source='source' target='target' style='solid' width='2'"
 * @generated
 */
public interface comRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Actor)
	 * @see ucdiagram.UcdiagramPackage#getcomRelationship_Source()
	 * @model
	 * @generated
	 */
	Actor getSource();

	/**
	 * Sets the value of the '{@link ucdiagram.comRelationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Actor value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(UseCase)
	 * @see ucdiagram.UcdiagramPackage#getcomRelationship_Target()
	 * @model
	 * @generated
	 */
	UseCase getTarget();

	/**
	 * Sets the value of the '{@link ucdiagram.comRelationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(UseCase value);

} // comRelationship
