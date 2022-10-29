/**
 */
package sql_metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sql_metamodel.Schema;
import sql_metamodel.Sql_metamodelPackage;
import sql_metamodel.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sql_metamodel.impl.SchemaImpl#getListTables <em>List Tables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends ModelElementImpl implements Schema {
	/**
	 * The cached value of the '{@link #getListTables() <em>List Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListTables()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> listTables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sql_metamodelPackage.Literals.SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getListTables() {
		if (listTables == null) {
			listTables = new EObjectContainmentEList<Table>(Table.class, this, Sql_metamodelPackage.SCHEMA__LIST_TABLES);
		}
		return listTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Sql_metamodelPackage.SCHEMA__LIST_TABLES:
				return ((InternalEList<?>)getListTables()).basicRemove(otherEnd, msgs);
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
			case Sql_metamodelPackage.SCHEMA__LIST_TABLES:
				return getListTables();
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
			case Sql_metamodelPackage.SCHEMA__LIST_TABLES:
				getListTables().clear();
				getListTables().addAll((Collection<? extends Table>)newValue);
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
			case Sql_metamodelPackage.SCHEMA__LIST_TABLES:
				getListTables().clear();
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
			case Sql_metamodelPackage.SCHEMA__LIST_TABLES:
				return listTables != null && !listTables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SchemaImpl
