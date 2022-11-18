/**
 */
package ucdiagram;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucdiagram.UseCase#getName <em>Name</em>}</li>
 *   <li>{@link ucdiagram.UseCase#getUseCaseId <em>Use Case Id</em>}</li>
 *   <li>{@link ucdiagram.UseCase#getDate <em>Date</em>}</li>
 *   <li>{@link ucdiagram.UseCase#getDescription <em>Description</em>}</li>
 *   <li>{@link ucdiagram.UseCase#getObjective <em>Objective</em>}</li>
 *   <li>{@link ucdiagram.UseCase#getListPreconditions <em>List Preconditions</em>}</li>
 *   <li>{@link ucdiagram.UseCase#getListPostconditions <em>List Postconditions</em>}</li>
 *   <li>{@link ucdiagram.UseCase#getListFlowEvents <em>List Flow Events</em>}</li>
 *   <li>{@link ucdiagram.UseCase#getListExceptions <em>List Exceptions</em>}</li>
 *   <li>{@link ucdiagram.UseCase#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see ucdiagram.UcdiagramPackage#getUseCase()
 * @model annotation="gmf.node label='name' figure='svg' svg.uri='platform:/plugin/ucdiagrama/svg/useCase.svg' label.layout='center'"
 * @generated
 */
public interface UseCase extends EObject {
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
	 * @see ucdiagram.UcdiagramPackage#getUseCase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ucdiagram.UseCase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Use Case Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Case Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Case Id</em>' attribute.
	 * @see #setUseCaseId(String)
	 * @see ucdiagram.UcdiagramPackage#getUseCase_UseCaseId()
	 * @model
	 * @generated
	 */
	String getUseCaseId();

	/**
	 * Sets the value of the '{@link ucdiagram.UseCase#getUseCaseId <em>Use Case Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Case Id</em>' attribute.
	 * @see #getUseCaseId()
	 * @generated
	 */
	void setUseCaseId(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see ucdiagram.UcdiagramPackage#getUseCase_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link ucdiagram.UseCase#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

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
	 * @see ucdiagram.UcdiagramPackage#getUseCase_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ucdiagram.UseCase#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective</em>' attribute.
	 * @see #setObjective(String)
	 * @see ucdiagram.UcdiagramPackage#getUseCase_Objective()
	 * @model
	 * @generated
	 */
	String getObjective();

	/**
	 * Sets the value of the '{@link ucdiagram.UseCase#getObjective <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective</em>' attribute.
	 * @see #getObjective()
	 * @generated
	 */
	void setObjective(String value);

	/**
	 * Returns the value of the '<em><b>List Preconditions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Preconditions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Preconditions</em>' attribute list.
	 * @see ucdiagram.UcdiagramPackage#getUseCase_ListPreconditions()
	 * @model
	 * @generated
	 */
	EList<String> getListPreconditions();

	/**
	 * Returns the value of the '<em><b>List Postconditions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Postconditions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Postconditions</em>' attribute list.
	 * @see ucdiagram.UcdiagramPackage#getUseCase_ListPostconditions()
	 * @model
	 * @generated
	 */
	EList<String> getListPostconditions();

	/**
	 * Returns the value of the '<em><b>List Flow Events</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Flow Events</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Flow Events</em>' attribute list.
	 * @see ucdiagram.UcdiagramPackage#getUseCase_ListFlowEvents()
	 * @model
	 * @generated
	 */
	EList<String> getListFlowEvents();

	/**
	 * Returns the value of the '<em><b>List Exceptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Exceptions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Exceptions</em>' attribute list.
	 * @see ucdiagram.UcdiagramPackage#getUseCase_ListExceptions()
	 * @model
	 * @generated
	 */
	EList<String> getListExceptions();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' attribute.
	 * @see #setAnnotations(String)
	 * @see ucdiagram.UcdiagramPackage#getUseCase_Annotations()
	 * @model
	 * @generated
	 */
	String getAnnotations();

	/**
	 * Sets the value of the '{@link ucdiagram.UseCase#getAnnotations <em>Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' attribute.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(String value);

} // UseCase
