/**
 */
package sql_metamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sql_metamodel.Column;
import sql_metamodel.Sql_metamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sql_metamodel.impl.ColumnImpl#getType <em>Type</em>}</li>
 *   <li>{@link sql_metamodel.impl.ColumnImpl#getIsNotNull <em>Is Not Null</em>}</li>
 *   <li>{@link sql_metamodel.impl.ColumnImpl#getIsAutoIncremetable <em>Is Auto Incremetable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends ModelElementImpl implements Column {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsNotNull() <em>Is Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNotNull()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_NOT_NULL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsNotNull() <em>Is Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNotNull()
	 * @generated
	 * @ordered
	 */
	protected Boolean isNotNull = IS_NOT_NULL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsAutoIncremetable() <em>Is Auto Incremetable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAutoIncremetable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_AUTO_INCREMETABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsAutoIncremetable() <em>Is Auto Incremetable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAutoIncremetable()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAutoIncremetable = IS_AUTO_INCREMETABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sql_metamodelPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sql_metamodelPackage.COLUMN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsNotNull() {
		return isNotNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNotNull(Boolean newIsNotNull) {
		Boolean oldIsNotNull = isNotNull;
		isNotNull = newIsNotNull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sql_metamodelPackage.COLUMN__IS_NOT_NULL, oldIsNotNull, isNotNull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAutoIncremetable() {
		return isAutoIncremetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAutoIncremetable(Boolean newIsAutoIncremetable) {
		Boolean oldIsAutoIncremetable = isAutoIncremetable;
		isAutoIncremetable = newIsAutoIncremetable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sql_metamodelPackage.COLUMN__IS_AUTO_INCREMETABLE, oldIsAutoIncremetable, isAutoIncremetable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Sql_metamodelPackage.COLUMN__TYPE:
				return getType();
			case Sql_metamodelPackage.COLUMN__IS_NOT_NULL:
				return getIsNotNull();
			case Sql_metamodelPackage.COLUMN__IS_AUTO_INCREMETABLE:
				return getIsAutoIncremetable();
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
			case Sql_metamodelPackage.COLUMN__TYPE:
				setType((String)newValue);
				return;
			case Sql_metamodelPackage.COLUMN__IS_NOT_NULL:
				setIsNotNull((Boolean)newValue);
				return;
			case Sql_metamodelPackage.COLUMN__IS_AUTO_INCREMETABLE:
				setIsAutoIncremetable((Boolean)newValue);
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
			case Sql_metamodelPackage.COLUMN__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Sql_metamodelPackage.COLUMN__IS_NOT_NULL:
				setIsNotNull(IS_NOT_NULL_EDEFAULT);
				return;
			case Sql_metamodelPackage.COLUMN__IS_AUTO_INCREMETABLE:
				setIsAutoIncremetable(IS_AUTO_INCREMETABLE_EDEFAULT);
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
			case Sql_metamodelPackage.COLUMN__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case Sql_metamodelPackage.COLUMN__IS_NOT_NULL:
				return IS_NOT_NULL_EDEFAULT == null ? isNotNull != null : !IS_NOT_NULL_EDEFAULT.equals(isNotNull);
			case Sql_metamodelPackage.COLUMN__IS_AUTO_INCREMETABLE:
				return IS_AUTO_INCREMETABLE_EDEFAULT == null ? isAutoIncremetable != null : !IS_AUTO_INCREMETABLE_EDEFAULT.equals(isAutoIncremetable);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", isNotNull: ");
		result.append(isNotNull);
		result.append(", isAutoIncremetable: ");
		result.append(isAutoIncremetable);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
