/**
 */
package sql_metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sql_metamodel.Column;
import sql_metamodel.ForeignKey;
import sql_metamodel.PrimaryKey;
import sql_metamodel.Relation;
import sql_metamodel.Sql_metamodelPackage;
import sql_metamodel.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sql_metamodel.impl.TableImpl#getListPrimaryKeys <em>List Primary Keys</em>}</li>
 *   <li>{@link sql_metamodel.impl.TableImpl#getListForeignKeys <em>List Foreign Keys</em>}</li>
 *   <li>{@link sql_metamodel.impl.TableImpl#getListColumns <em>List Columns</em>}</li>
 *   <li>{@link sql_metamodel.impl.TableImpl#getListRelations <em>List Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends ModelElementImpl implements Table {
	/**
	 * The cached value of the '{@link #getListPrimaryKeys() <em>List Primary Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListPrimaryKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimaryKey> listPrimaryKeys;

	/**
	 * The cached value of the '{@link #getListForeignKeys() <em>List Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> listForeignKeys;

	/**
	 * The cached value of the '{@link #getListColumns() <em>List Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> listColumns;

	/**
	 * The cached value of the '{@link #getListRelations() <em>List Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> listRelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sql_metamodelPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimaryKey> getListPrimaryKeys() {
		if (listPrimaryKeys == null) {
			listPrimaryKeys = new EObjectContainmentEList<PrimaryKey>(PrimaryKey.class, this, Sql_metamodelPackage.TABLE__LIST_PRIMARY_KEYS);
		}
		return listPrimaryKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKey> getListForeignKeys() {
		if (listForeignKeys == null) {
			listForeignKeys = new EObjectContainmentEList<ForeignKey>(ForeignKey.class, this, Sql_metamodelPackage.TABLE__LIST_FOREIGN_KEYS);
		}
		return listForeignKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getListColumns() {
		if (listColumns == null) {
			listColumns = new EObjectContainmentEList<Column>(Column.class, this, Sql_metamodelPackage.TABLE__LIST_COLUMNS);
		}
		return listColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getListRelations() {
		if (listRelations == null) {
			listRelations = new EObjectContainmentEList<Relation>(Relation.class, this, Sql_metamodelPackage.TABLE__LIST_RELATIONS);
		}
		return listRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Sql_metamodelPackage.TABLE__LIST_PRIMARY_KEYS:
				return ((InternalEList<?>)getListPrimaryKeys()).basicRemove(otherEnd, msgs);
			case Sql_metamodelPackage.TABLE__LIST_FOREIGN_KEYS:
				return ((InternalEList<?>)getListForeignKeys()).basicRemove(otherEnd, msgs);
			case Sql_metamodelPackage.TABLE__LIST_COLUMNS:
				return ((InternalEList<?>)getListColumns()).basicRemove(otherEnd, msgs);
			case Sql_metamodelPackage.TABLE__LIST_RELATIONS:
				return ((InternalEList<?>)getListRelations()).basicRemove(otherEnd, msgs);
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
			case Sql_metamodelPackage.TABLE__LIST_PRIMARY_KEYS:
				return getListPrimaryKeys();
			case Sql_metamodelPackage.TABLE__LIST_FOREIGN_KEYS:
				return getListForeignKeys();
			case Sql_metamodelPackage.TABLE__LIST_COLUMNS:
				return getListColumns();
			case Sql_metamodelPackage.TABLE__LIST_RELATIONS:
				return getListRelations();
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
			case Sql_metamodelPackage.TABLE__LIST_PRIMARY_KEYS:
				getListPrimaryKeys().clear();
				getListPrimaryKeys().addAll((Collection<? extends PrimaryKey>)newValue);
				return;
			case Sql_metamodelPackage.TABLE__LIST_FOREIGN_KEYS:
				getListForeignKeys().clear();
				getListForeignKeys().addAll((Collection<? extends ForeignKey>)newValue);
				return;
			case Sql_metamodelPackage.TABLE__LIST_COLUMNS:
				getListColumns().clear();
				getListColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case Sql_metamodelPackage.TABLE__LIST_RELATIONS:
				getListRelations().clear();
				getListRelations().addAll((Collection<? extends Relation>)newValue);
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
			case Sql_metamodelPackage.TABLE__LIST_PRIMARY_KEYS:
				getListPrimaryKeys().clear();
				return;
			case Sql_metamodelPackage.TABLE__LIST_FOREIGN_KEYS:
				getListForeignKeys().clear();
				return;
			case Sql_metamodelPackage.TABLE__LIST_COLUMNS:
				getListColumns().clear();
				return;
			case Sql_metamodelPackage.TABLE__LIST_RELATIONS:
				getListRelations().clear();
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
			case Sql_metamodelPackage.TABLE__LIST_PRIMARY_KEYS:
				return listPrimaryKeys != null && !listPrimaryKeys.isEmpty();
			case Sql_metamodelPackage.TABLE__LIST_FOREIGN_KEYS:
				return listForeignKeys != null && !listForeignKeys.isEmpty();
			case Sql_metamodelPackage.TABLE__LIST_COLUMNS:
				return listColumns != null && !listColumns.isEmpty();
			case Sql_metamodelPackage.TABLE__LIST_RELATIONS:
				return listRelations != null && !listRelations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableImpl
