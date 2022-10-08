/**
 */
package uidiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uidiagram.GraphicalContainer;
import uidiagram.ModelElement;
import uidiagram.UidiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphical Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.impl.GraphicalContainerImpl#getLstChildModelElements <em>Lst Child Model Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicalContainerImpl extends ModelElementImpl implements GraphicalContainer {
	/**
	 * The cached value of the '{@link #getLstChildModelElements() <em>Lst Child Model Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstChildModelElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> lstChildModelElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicalContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagramPackage.Literals.GRAPHICAL_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getLstChildModelElements() {
		if (lstChildModelElements == null) {
			lstChildModelElements = new EObjectContainmentEList<ModelElement>(ModelElement.class, this, UidiagramPackage.GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS);
		}
		return lstChildModelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidiagramPackage.GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS:
				return ((InternalEList<?>)getLstChildModelElements()).basicRemove(otherEnd, msgs);
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
			case UidiagramPackage.GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS:
				return getLstChildModelElements();
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
			case UidiagramPackage.GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS:
				getLstChildModelElements().clear();
				getLstChildModelElements().addAll((Collection<? extends ModelElement>)newValue);
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
			case UidiagramPackage.GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS:
				getLstChildModelElements().clear();
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
			case UidiagramPackage.GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS:
				return lstChildModelElements != null && !lstChildModelElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GraphicalContainerImpl
