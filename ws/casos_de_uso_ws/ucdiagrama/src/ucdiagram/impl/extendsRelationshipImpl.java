/**
 */
package ucdiagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ucdiagram.UcdiagramPackage;
import ucdiagram.UseCase;
import ucdiagram.extendsRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>extends Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucdiagram.impl.extendsRelationshipImpl#getLabelName <em>Label Name</em>}</li>
 *   <li>{@link ucdiagram.impl.extendsRelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ucdiagram.impl.extendsRelationshipImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class extendsRelationshipImpl extends EObjectImpl implements extendsRelationship {
	/**
	 * The default value of the '{@link #getLabelName() <em>Label Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelName()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_NAME_EDEFAULT = "<extends>";

	/**
	 * The cached value of the '{@link #getLabelName() <em>Label Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelName()
	 * @generated
	 * @ordered
	 */
	protected String labelName = LABEL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected UseCase source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected UseCase target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected extendsRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UcdiagramPackage.Literals.EXTENDS_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelName() {
		return labelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelName(String newLabelName) {
		String oldLabelName = labelName;
		labelName = newLabelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UcdiagramPackage.EXTENDS_RELATIONSHIP__LABEL_NAME, oldLabelName, labelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (UseCase)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UcdiagramPackage.EXTENDS_RELATIONSHIP__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(UseCase newSource) {
		UseCase oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UcdiagramPackage.EXTENDS_RELATIONSHIP__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (UseCase)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UcdiagramPackage.EXTENDS_RELATIONSHIP__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(UseCase newTarget) {
		UseCase oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UcdiagramPackage.EXTENDS_RELATIONSHIP__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UcdiagramPackage.EXTENDS_RELATIONSHIP__LABEL_NAME:
				return getLabelName();
			case UcdiagramPackage.EXTENDS_RELATIONSHIP__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case UcdiagramPackage.EXTENDS_RELATIONSHIP__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UcdiagramPackage.EXTENDS_RELATIONSHIP__LABEL_NAME:
				setLabelName((String)newValue);
				return;
			case UcdiagramPackage.EXTENDS_RELATIONSHIP__SOURCE:
				setSource((UseCase)newValue);
				return;
			case UcdiagramPackage.EXTENDS_RELATIONSHIP__TARGET:
				setTarget((UseCase)newValue);
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
			case UcdiagramPackage.EXTENDS_RELATIONSHIP__LABEL_NAME:
				setLabelName(LABEL_NAME_EDEFAULT);
				return;
			case UcdiagramPackage.EXTENDS_RELATIONSHIP__SOURCE:
				setSource((UseCase)null);
				return;
			case UcdiagramPackage.EXTENDS_RELATIONSHIP__TARGET:
				setTarget((UseCase)null);
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
			case UcdiagramPackage.EXTENDS_RELATIONSHIP__LABEL_NAME:
				return LABEL_NAME_EDEFAULT == null ? labelName != null : !LABEL_NAME_EDEFAULT.equals(labelName);
			case UcdiagramPackage.EXTENDS_RELATIONSHIP__SOURCE:
				return source != null;
			case UcdiagramPackage.EXTENDS_RELATIONSHIP__TARGET:
				return target != null;
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
		result.append(" (labelName: ");
		result.append(labelName);
		result.append(')');
		return result.toString();
	}

} //extendsRelationshipImpl
