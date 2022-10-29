/**
 */
package sql_metamodel.impl;

import org.eclipse.emf.ecore.EClass;

import sql_metamodel.PrimaryKey;
import sql_metamodel.Sql_metamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PrimaryKeyImpl extends ColumnImpl implements PrimaryKey {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sql_metamodelPackage.Literals.PRIMARY_KEY;
	}

} //PrimaryKeyImpl
