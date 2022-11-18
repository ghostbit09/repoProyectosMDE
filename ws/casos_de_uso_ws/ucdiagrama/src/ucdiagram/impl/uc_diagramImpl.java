/**
 */
package ucdiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ucdiagram.Actor;
import ucdiagram.LimitBox;
import ucdiagram.UcdiagramPackage;
import ucdiagram.comRelationship;
import ucdiagram.extendsRelationship;
import ucdiagram.includeRelationship;
import ucdiagram.uc_diagram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>uc diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucdiagram.impl.uc_diagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link ucdiagram.impl.uc_diagramImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ucdiagram.impl.uc_diagramImpl#getListActors <em>List Actors</em>}</li>
 *   <li>{@link ucdiagram.impl.uc_diagramImpl#getListBoxes <em>List Boxes</em>}</li>
 *   <li>{@link ucdiagram.impl.uc_diagramImpl#getListComRels <em>List Com Rels</em>}</li>
 *   <li>{@link ucdiagram.impl.uc_diagramImpl#getListIncRels <em>List Inc Rels</em>}</li>
 *   <li>{@link ucdiagram.impl.uc_diagramImpl#getListExtRels <em>List Ext Rels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class uc_diagramImpl extends EObjectImpl implements uc_diagram {
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
	 * The cached value of the '{@link #getListActors() <em>List Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> listActors;

	/**
	 * The cached value of the '{@link #getListBoxes() <em>List Boxes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListBoxes()
	 * @generated
	 * @ordered
	 */
	protected EList<LimitBox> listBoxes;

	/**
	 * The cached value of the '{@link #getListComRels() <em>List Com Rels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListComRels()
	 * @generated
	 * @ordered
	 */
	protected EList<comRelationship> listComRels;

	/**
	 * The cached value of the '{@link #getListIncRels() <em>List Inc Rels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListIncRels()
	 * @generated
	 * @ordered
	 */
	protected EList<includeRelationship> listIncRels;

	/**
	 * The cached value of the '{@link #getListExtRels() <em>List Ext Rels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListExtRels()
	 * @generated
	 * @ordered
	 */
	protected EList<extendsRelationship> listExtRels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected uc_diagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UcdiagramPackage.Literals.UC_DIAGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UcdiagramPackage.UC_DIAGRAM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UcdiagramPackage.UC_DIAGRAM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getListActors() {
		if (listActors == null) {
			listActors = new EObjectContainmentEList<Actor>(Actor.class, this, UcdiagramPackage.UC_DIAGRAM__LIST_ACTORS);
		}
		return listActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LimitBox> getListBoxes() {
		if (listBoxes == null) {
			listBoxes = new EObjectContainmentEList<LimitBox>(LimitBox.class, this, UcdiagramPackage.UC_DIAGRAM__LIST_BOXES);
		}
		return listBoxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<comRelationship> getListComRels() {
		if (listComRels == null) {
			listComRels = new EObjectContainmentEList<comRelationship>(comRelationship.class, this, UcdiagramPackage.UC_DIAGRAM__LIST_COM_RELS);
		}
		return listComRels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<includeRelationship> getListIncRels() {
		if (listIncRels == null) {
			listIncRels = new EObjectContainmentEList<includeRelationship>(includeRelationship.class, this, UcdiagramPackage.UC_DIAGRAM__LIST_INC_RELS);
		}
		return listIncRels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<extendsRelationship> getListExtRels() {
		if (listExtRels == null) {
			listExtRels = new EObjectContainmentEList<extendsRelationship>(extendsRelationship.class, this, UcdiagramPackage.UC_DIAGRAM__LIST_EXT_RELS);
		}
		return listExtRels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UcdiagramPackage.UC_DIAGRAM__LIST_ACTORS:
				return ((InternalEList<?>)getListActors()).basicRemove(otherEnd, msgs);
			case UcdiagramPackage.UC_DIAGRAM__LIST_BOXES:
				return ((InternalEList<?>)getListBoxes()).basicRemove(otherEnd, msgs);
			case UcdiagramPackage.UC_DIAGRAM__LIST_COM_RELS:
				return ((InternalEList<?>)getListComRels()).basicRemove(otherEnd, msgs);
			case UcdiagramPackage.UC_DIAGRAM__LIST_INC_RELS:
				return ((InternalEList<?>)getListIncRels()).basicRemove(otherEnd, msgs);
			case UcdiagramPackage.UC_DIAGRAM__LIST_EXT_RELS:
				return ((InternalEList<?>)getListExtRels()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UcdiagramPackage.UC_DIAGRAM__NAME:
				return getName();
			case UcdiagramPackage.UC_DIAGRAM__DESCRIPTION:
				return getDescription();
			case UcdiagramPackage.UC_DIAGRAM__LIST_ACTORS:
				return getListActors();
			case UcdiagramPackage.UC_DIAGRAM__LIST_BOXES:
				return getListBoxes();
			case UcdiagramPackage.UC_DIAGRAM__LIST_COM_RELS:
				return getListComRels();
			case UcdiagramPackage.UC_DIAGRAM__LIST_INC_RELS:
				return getListIncRels();
			case UcdiagramPackage.UC_DIAGRAM__LIST_EXT_RELS:
				return getListExtRels();
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
			case UcdiagramPackage.UC_DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case UcdiagramPackage.UC_DIAGRAM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case UcdiagramPackage.UC_DIAGRAM__LIST_ACTORS:
				getListActors().clear();
				getListActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case UcdiagramPackage.UC_DIAGRAM__LIST_BOXES:
				getListBoxes().clear();
				getListBoxes().addAll((Collection<? extends LimitBox>)newValue);
				return;
			case UcdiagramPackage.UC_DIAGRAM__LIST_COM_RELS:
				getListComRels().clear();
				getListComRels().addAll((Collection<? extends comRelationship>)newValue);
				return;
			case UcdiagramPackage.UC_DIAGRAM__LIST_INC_RELS:
				getListIncRels().clear();
				getListIncRels().addAll((Collection<? extends includeRelationship>)newValue);
				return;
			case UcdiagramPackage.UC_DIAGRAM__LIST_EXT_RELS:
				getListExtRels().clear();
				getListExtRels().addAll((Collection<? extends extendsRelationship>)newValue);
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
			case UcdiagramPackage.UC_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UcdiagramPackage.UC_DIAGRAM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case UcdiagramPackage.UC_DIAGRAM__LIST_ACTORS:
				getListActors().clear();
				return;
			case UcdiagramPackage.UC_DIAGRAM__LIST_BOXES:
				getListBoxes().clear();
				return;
			case UcdiagramPackage.UC_DIAGRAM__LIST_COM_RELS:
				getListComRels().clear();
				return;
			case UcdiagramPackage.UC_DIAGRAM__LIST_INC_RELS:
				getListIncRels().clear();
				return;
			case UcdiagramPackage.UC_DIAGRAM__LIST_EXT_RELS:
				getListExtRels().clear();
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
			case UcdiagramPackage.UC_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UcdiagramPackage.UC_DIAGRAM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case UcdiagramPackage.UC_DIAGRAM__LIST_ACTORS:
				return listActors != null && !listActors.isEmpty();
			case UcdiagramPackage.UC_DIAGRAM__LIST_BOXES:
				return listBoxes != null && !listBoxes.isEmpty();
			case UcdiagramPackage.UC_DIAGRAM__LIST_COM_RELS:
				return listComRels != null && !listComRels.isEmpty();
			case UcdiagramPackage.UC_DIAGRAM__LIST_INC_RELS:
				return listIncRels != null && !listIncRels.isEmpty();
			case UcdiagramPackage.UC_DIAGRAM__LIST_EXT_RELS:
				return listExtRels != null && !listExtRels.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //uc_diagramImpl
