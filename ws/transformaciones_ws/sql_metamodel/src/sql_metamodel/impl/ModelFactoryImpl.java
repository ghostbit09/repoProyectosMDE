/**
 */
package sql_metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sql_metamodel.ModelFactory;
import sql_metamodel.Schema;
import sql_metamodel.Sql_metamodelPackage;
import sql_metamodel.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sql_metamodel.impl.ModelFactoryImpl#getListSchemas <em>List Schemas</em>}</li>
 *   <li>{@link sql_metamodel.impl.ModelFactoryImpl#getListAllTables <em>List All Tables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryImpl extends EObjectImpl implements ModelFactory {
	/**
	 * The cached value of the '{@link #getListSchemas() <em>List Schemas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListSchemas()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> listSchemas;

	/**
	 * The cached value of the '{@link #getListAllTables() <em>List All Tables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListAllTables()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> listAllTables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sql_metamodelPackage.Literals.MODEL_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getListSchemas() {
		if (listSchemas == null) {
			listSchemas = new EObjectContainmentEList<Schema>(Schema.class, this, Sql_metamodelPackage.MODEL_FACTORY__LIST_SCHEMAS);
		}
		return listSchemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getListAllTables() {
		if (listAllTables == null) {
			listAllTables = new EObjectResolvingEList<Table>(Table.class, this, Sql_metamodelPackage.MODEL_FACTORY__LIST_ALL_TABLES);
		}
		return listAllTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Sql_metamodelPackage.MODEL_FACTORY__LIST_SCHEMAS:
				return ((InternalEList<?>)getListSchemas()).basicRemove(otherEnd, msgs);
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
			case Sql_metamodelPackage.MODEL_FACTORY__LIST_SCHEMAS:
				return getListSchemas();
			case Sql_metamodelPackage.MODEL_FACTORY__LIST_ALL_TABLES:
				return getListAllTables();
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
			case Sql_metamodelPackage.MODEL_FACTORY__LIST_SCHEMAS:
				getListSchemas().clear();
				getListSchemas().addAll((Collection<? extends Schema>)newValue);
				return;
			case Sql_metamodelPackage.MODEL_FACTORY__LIST_ALL_TABLES:
				getListAllTables().clear();
				getListAllTables().addAll((Collection<? extends Table>)newValue);
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
			case Sql_metamodelPackage.MODEL_FACTORY__LIST_SCHEMAS:
				getListSchemas().clear();
				return;
			case Sql_metamodelPackage.MODEL_FACTORY__LIST_ALL_TABLES:
				getListAllTables().clear();
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
			case Sql_metamodelPackage.MODEL_FACTORY__LIST_SCHEMAS:
				return listSchemas != null && !listSchemas.isEmpty();
			case Sql_metamodelPackage.MODEL_FACTORY__LIST_ALL_TABLES:
				return listAllTables != null && !listAllTables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelFactoryImpl
