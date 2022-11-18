/**
 */
package ucdiagram.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import ucdiagram.UcdiagramPackage;
import ucdiagram.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucdiagram.impl.UseCaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link ucdiagram.impl.UseCaseImpl#getUseCaseId <em>Use Case Id</em>}</li>
 *   <li>{@link ucdiagram.impl.UseCaseImpl#getDate <em>Date</em>}</li>
 *   <li>{@link ucdiagram.impl.UseCaseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ucdiagram.impl.UseCaseImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link ucdiagram.impl.UseCaseImpl#getListPreconditions <em>List Preconditions</em>}</li>
 *   <li>{@link ucdiagram.impl.UseCaseImpl#getListPostconditions <em>List Postconditions</em>}</li>
 *   <li>{@link ucdiagram.impl.UseCaseImpl#getListFlowEvents <em>List Flow Events</em>}</li>
 *   <li>{@link ucdiagram.impl.UseCaseImpl#getListExceptions <em>List Exceptions</em>}</li>
 *   <li>{@link ucdiagram.impl.UseCaseImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseImpl extends EObjectImpl implements UseCase {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseCaseId() <em>Use Case Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCaseId()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_CASE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseCaseId() <em>Use Case Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCaseId()
	 * @generated
	 * @ordered
	 */
	protected String useCaseId = USE_CASE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjective() <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjective() <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected String objective = OBJECTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListPreconditions() <em>List Preconditions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListPreconditions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> listPreconditions;

	/**
	 * The cached value of the '{@link #getListPostconditions() <em>List Postconditions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListPostconditions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> listPostconditions;

	/**
	 * The cached value of the '{@link #getListFlowEvents() <em>List Flow Events</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListFlowEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<String> listFlowEvents;

	/**
	 * The cached value of the '{@link #getListExceptions() <em>List Exceptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> listExceptions;

	/**
	 * The default value of the '{@link #getAnnotations() <em>Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected String annotations = ANNOTATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UcdiagramPackage.Literals.USE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UcdiagramPackage.USE_CASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseCaseId() {
		return useCaseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCaseId(String newUseCaseId) {
		String oldUseCaseId = useCaseId;
		useCaseId = newUseCaseId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UcdiagramPackage.USE_CASE__USE_CASE_ID, oldUseCaseId, useCaseId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UcdiagramPackage.USE_CASE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UcdiagramPackage.USE_CASE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjective() {
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjective(String newObjective) {
		String oldObjective = objective;
		objective = newObjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UcdiagramPackage.USE_CASE__OBJECTIVE, oldObjective, objective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getListPreconditions() {
		if (listPreconditions == null) {
			listPreconditions = new EDataTypeUniqueEList<String>(String.class, this, UcdiagramPackage.USE_CASE__LIST_PRECONDITIONS);
		}
		return listPreconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getListPostconditions() {
		if (listPostconditions == null) {
			listPostconditions = new EDataTypeUniqueEList<String>(String.class, this, UcdiagramPackage.USE_CASE__LIST_POSTCONDITIONS);
		}
		return listPostconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getListFlowEvents() {
		if (listFlowEvents == null) {
			listFlowEvents = new EDataTypeUniqueEList<String>(String.class, this, UcdiagramPackage.USE_CASE__LIST_FLOW_EVENTS);
		}
		return listFlowEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getListExceptions() {
		if (listExceptions == null) {
			listExceptions = new EDataTypeUniqueEList<String>(String.class, this, UcdiagramPackage.USE_CASE__LIST_EXCEPTIONS);
		}
		return listExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(String newAnnotations) {
		String oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UcdiagramPackage.USE_CASE__ANNOTATIONS, oldAnnotations, annotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UcdiagramPackage.USE_CASE__NAME:
				return getName();
			case UcdiagramPackage.USE_CASE__USE_CASE_ID:
				return getUseCaseId();
			case UcdiagramPackage.USE_CASE__DATE:
				return getDate();
			case UcdiagramPackage.USE_CASE__DESCRIPTION:
				return getDescription();
			case UcdiagramPackage.USE_CASE__OBJECTIVE:
				return getObjective();
			case UcdiagramPackage.USE_CASE__LIST_PRECONDITIONS:
				return getListPreconditions();
			case UcdiagramPackage.USE_CASE__LIST_POSTCONDITIONS:
				return getListPostconditions();
			case UcdiagramPackage.USE_CASE__LIST_FLOW_EVENTS:
				return getListFlowEvents();
			case UcdiagramPackage.USE_CASE__LIST_EXCEPTIONS:
				return getListExceptions();
			case UcdiagramPackage.USE_CASE__ANNOTATIONS:
				return getAnnotations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UcdiagramPackage.USE_CASE__NAME:
				setName((String)newValue);
				return;
			case UcdiagramPackage.USE_CASE__USE_CASE_ID:
				setUseCaseId((String)newValue);
				return;
			case UcdiagramPackage.USE_CASE__DATE:
				setDate((String)newValue);
				return;
			case UcdiagramPackage.USE_CASE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case UcdiagramPackage.USE_CASE__OBJECTIVE:
				setObjective((String)newValue);
				return;
			case UcdiagramPackage.USE_CASE__LIST_PRECONDITIONS:
				getListPreconditions().clear();
				getListPreconditions().addAll((Collection<? extends String>)newValue);
				return;
			case UcdiagramPackage.USE_CASE__LIST_POSTCONDITIONS:
				getListPostconditions().clear();
				getListPostconditions().addAll((Collection<? extends String>)newValue);
				return;
			case UcdiagramPackage.USE_CASE__LIST_FLOW_EVENTS:
				getListFlowEvents().clear();
				getListFlowEvents().addAll((Collection<? extends String>)newValue);
				return;
			case UcdiagramPackage.USE_CASE__LIST_EXCEPTIONS:
				getListExceptions().clear();
				getListExceptions().addAll((Collection<? extends String>)newValue);
				return;
			case UcdiagramPackage.USE_CASE__ANNOTATIONS:
				setAnnotations((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UcdiagramPackage.USE_CASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UcdiagramPackage.USE_CASE__USE_CASE_ID:
				setUseCaseId(USE_CASE_ID_EDEFAULT);
				return;
			case UcdiagramPackage.USE_CASE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case UcdiagramPackage.USE_CASE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case UcdiagramPackage.USE_CASE__OBJECTIVE:
				setObjective(OBJECTIVE_EDEFAULT);
				return;
			case UcdiagramPackage.USE_CASE__LIST_PRECONDITIONS:
				getListPreconditions().clear();
				return;
			case UcdiagramPackage.USE_CASE__LIST_POSTCONDITIONS:
				getListPostconditions().clear();
				return;
			case UcdiagramPackage.USE_CASE__LIST_FLOW_EVENTS:
				getListFlowEvents().clear();
				return;
			case UcdiagramPackage.USE_CASE__LIST_EXCEPTIONS:
				getListExceptions().clear();
				return;
			case UcdiagramPackage.USE_CASE__ANNOTATIONS:
				setAnnotations(ANNOTATIONS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UcdiagramPackage.USE_CASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UcdiagramPackage.USE_CASE__USE_CASE_ID:
				return USE_CASE_ID_EDEFAULT == null ? useCaseId != null : !USE_CASE_ID_EDEFAULT.equals(useCaseId);
			case UcdiagramPackage.USE_CASE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case UcdiagramPackage.USE_CASE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case UcdiagramPackage.USE_CASE__OBJECTIVE:
				return OBJECTIVE_EDEFAULT == null ? objective != null : !OBJECTIVE_EDEFAULT.equals(objective);
			case UcdiagramPackage.USE_CASE__LIST_PRECONDITIONS:
				return listPreconditions != null && !listPreconditions.isEmpty();
			case UcdiagramPackage.USE_CASE__LIST_POSTCONDITIONS:
				return listPostconditions != null && !listPostconditions.isEmpty();
			case UcdiagramPackage.USE_CASE__LIST_FLOW_EVENTS:
				return listFlowEvents != null && !listFlowEvents.isEmpty();
			case UcdiagramPackage.USE_CASE__LIST_EXCEPTIONS:
				return listExceptions != null && !listExceptions.isEmpty();
			case UcdiagramPackage.USE_CASE__ANNOTATIONS:
				return ANNOTATIONS_EDEFAULT == null ? annotations != null : !ANNOTATIONS_EDEFAULT.equals(annotations);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", useCaseId: ");
		result.append(useCaseId);
		result.append(", date: ");
		result.append(date);
		result.append(", description: ");
		result.append(description);
		result.append(", objective: ");
		result.append(objective);
		result.append(", listPreconditions: ");
		result.append(listPreconditions);
		result.append(", listPostconditions: ");
		result.append(listPostconditions);
		result.append(", listFlowEvents: ");
		result.append(listFlowEvents);
		result.append(", listExceptions: ");
		result.append(listExceptions);
		result.append(", annotations: ");
		result.append(annotations);
		result.append(')');
		return result.toString();
	}

} //UseCaseImpl
