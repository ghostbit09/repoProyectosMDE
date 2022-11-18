/**
 */
package ucdiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>extends Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucdiagram.extendsRelationship#getLabelName <em>Label Name</em>}</li>
 *   <li>{@link ucdiagram.extendsRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link ucdiagram.extendsRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ucdiagram.UcdiagramPackage#getextendsRelationship()
 * @model annotation="gmf.link label='labelName' source='source' target='target' target.decoration='arrow' style='dot' width='2'"
 * @generated
 */
public interface extendsRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Label Name</b></em>' attribute.
	 * The default value is <code>"<extends>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Name</em>' attribute.
	 * @see #setLabelName(String)
	 * @see ucdiagram.UcdiagramPackage#getextendsRelationship_LabelName()
	 * @model default="&lt;extends&gt;"
	 * @generated
	 */
	String getLabelName();

	/**
	 * Sets the value of the '{@link ucdiagram.extendsRelationship#getLabelName <em>Label Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Name</em>' attribute.
	 * @see #getLabelName()
	 * @generated
	 */
	void setLabelName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(UseCase)
	 * @see ucdiagram.UcdiagramPackage#getextendsRelationship_Source()
	 * @model
	 * @generated
	 */
	UseCase getSource();

	/**
	 * Sets the value of the '{@link ucdiagram.extendsRelationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(UseCase value);

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
	 * @see ucdiagram.UcdiagramPackage#getextendsRelationship_Target()
	 * @model
	 * @generated
	 */
	UseCase getTarget();

	/**
	 * Sets the value of the '{@link ucdiagram.extendsRelationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(UseCase value);

} // extendsRelationship
