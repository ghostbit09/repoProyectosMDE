/**
 */
package sql_metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sql_metamodel.Sql_metamodelFactory
 * @model kind="package"
 * @generated
 */
public interface Sql_metamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sql_metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "sql_metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sql_metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Sql_metamodelPackage eINSTANCE = sql_metamodel.impl.Sql_metamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link sql_metamodel.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql_metamodel.impl.ModelFactoryImpl
	 * @see sql_metamodel.impl.Sql_metamodelPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>List Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LIST_SCHEMAS = 0;

	/**
	 * The feature id for the '<em><b>List All Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LIST_ALL_TABLES = 1;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sql_metamodel.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql_metamodel.impl.ModelElementImpl
	 * @see sql_metamodel.impl.Sql_metamodelPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sql_metamodel.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql_metamodel.impl.SchemaImpl
	 * @see sql_metamodel.impl.Sql_metamodelPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>List Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__LIST_TABLES = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sql_metamodel.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql_metamodel.impl.TableImpl
	 * @see sql_metamodel.impl.Sql_metamodelPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>List Primary Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LIST_PRIMARY_KEYS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>List Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LIST_FOREIGN_KEYS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LIST_COLUMNS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>List Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LIST_RELATIONS = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link sql_metamodel.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql_metamodel.impl.ColumnImpl
	 * @see sql_metamodel.impl.Sql_metamodelPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IS_NOT_NULL = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Auto Incremetable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IS_AUTO_INCREMETABLE = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sql_metamodel.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql_metamodel.impl.RelationImpl
	 * @see sql_metamodel.impl.Sql_metamodelPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Multiplicidad A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MULTIPLICIDAD_A = 2;

	/**
	 * The feature id for the '<em><b>Multiplicidad B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MULTIPLICIDAD_B = 3;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 4;


	/**
	 * The meta object id for the '{@link sql_metamodel.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql_metamodel.impl.PrimaryKeyImpl
	 * @see sql_metamodel.impl.Sql_metamodelPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__NAME = COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__TYPE = COLUMN__TYPE;

	/**
	 * The feature id for the '<em><b>Is Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__IS_NOT_NULL = COLUMN__IS_NOT_NULL;

	/**
	 * The feature id for the '<em><b>Is Auto Incremetable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__IS_AUTO_INCREMETABLE = COLUMN__IS_AUTO_INCREMETABLE;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql_metamodel.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql_metamodel.impl.ForeignKeyImpl
	 * @see sql_metamodel.impl.Sql_metamodelPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__PRIMARY_KEY = 1;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link sql_metamodel.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see sql_metamodel.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link sql_metamodel.ModelFactory#getListSchemas <em>List Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Schemas</em>'.
	 * @see sql_metamodel.ModelFactory#getListSchemas()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListSchemas();

	/**
	 * Returns the meta object for the reference list '{@link sql_metamodel.ModelFactory#getListAllTables <em>List All Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List All Tables</em>'.
	 * @see sql_metamodel.ModelFactory#getListAllTables()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListAllTables();

	/**
	 * Returns the meta object for class '{@link sql_metamodel.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see sql_metamodel.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link sql_metamodel.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sql_metamodel.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for class '{@link sql_metamodel.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see sql_metamodel.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link sql_metamodel.Schema#getListTables <em>List Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Tables</em>'.
	 * @see sql_metamodel.Schema#getListTables()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_ListTables();

	/**
	 * Returns the meta object for class '{@link sql_metamodel.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see sql_metamodel.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link sql_metamodel.Table#getListPrimaryKeys <em>List Primary Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Primary Keys</em>'.
	 * @see sql_metamodel.Table#getListPrimaryKeys()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ListPrimaryKeys();

	/**
	 * Returns the meta object for the containment reference list '{@link sql_metamodel.Table#getListForeignKeys <em>List Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Foreign Keys</em>'.
	 * @see sql_metamodel.Table#getListForeignKeys()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ListForeignKeys();

	/**
	 * Returns the meta object for the containment reference list '{@link sql_metamodel.Table#getListColumns <em>List Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Columns</em>'.
	 * @see sql_metamodel.Table#getListColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ListColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link sql_metamodel.Table#getListRelations <em>List Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Relations</em>'.
	 * @see sql_metamodel.Table#getListRelations()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ListRelations();

	/**
	 * Returns the meta object for class '{@link sql_metamodel.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see sql_metamodel.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link sql_metamodel.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sql_metamodel.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Type();

	/**
	 * Returns the meta object for the attribute '{@link sql_metamodel.Column#getIsNotNull <em>Is Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Not Null</em>'.
	 * @see sql_metamodel.Column#getIsNotNull()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_IsNotNull();

	/**
	 * Returns the meta object for the attribute '{@link sql_metamodel.Column#getIsAutoIncremetable <em>Is Auto Incremetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Auto Incremetable</em>'.
	 * @see sql_metamodel.Column#getIsAutoIncremetable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_IsAutoIncremetable();

	/**
	 * Returns the meta object for class '{@link sql_metamodel.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see sql_metamodel.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link sql_metamodel.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see sql_metamodel.Relation#getSource()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link sql_metamodel.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see sql_metamodel.Relation#getTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Target();

	/**
	 * Returns the meta object for the attribute '{@link sql_metamodel.Relation#getMultiplicidadA <em>Multiplicidad A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad A</em>'.
	 * @see sql_metamodel.Relation#getMultiplicidadA()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_MultiplicidadA();

	/**
	 * Returns the meta object for the attribute '{@link sql_metamodel.Relation#getMultiplicidadB <em>Multiplicidad B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad B</em>'.
	 * @see sql_metamodel.Relation#getMultiplicidadB()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_MultiplicidadB();

	/**
	 * Returns the meta object for class '{@link sql_metamodel.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see sql_metamodel.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for class '{@link sql_metamodel.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see sql_metamodel.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link sql_metamodel.ForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sql_metamodel.ForeignKey#getName()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_Name();

	/**
	 * Returns the meta object for the reference '{@link sql_metamodel.ForeignKey#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Key</em>'.
	 * @see sql_metamodel.ForeignKey#getPrimaryKey()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_PrimaryKey();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Sql_metamodelFactory getSql_metamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sql_metamodel.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql_metamodel.impl.ModelFactoryImpl
		 * @see sql_metamodel.impl.Sql_metamodelPackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em><b>List Schemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LIST_SCHEMAS = eINSTANCE.getModelFactory_ListSchemas();

		/**
		 * The meta object literal for the '<em><b>List All Tables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LIST_ALL_TABLES = eINSTANCE.getModelFactory_ListAllTables();

		/**
		 * The meta object literal for the '{@link sql_metamodel.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql_metamodel.impl.ModelElementImpl
		 * @see sql_metamodel.impl.Sql_metamodelPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

		/**
		 * The meta object literal for the '{@link sql_metamodel.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql_metamodel.impl.SchemaImpl
		 * @see sql_metamodel.impl.Sql_metamodelPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>List Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__LIST_TABLES = eINSTANCE.getSchema_ListTables();

		/**
		 * The meta object literal for the '{@link sql_metamodel.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql_metamodel.impl.TableImpl
		 * @see sql_metamodel.impl.Sql_metamodelPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>List Primary Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LIST_PRIMARY_KEYS = eINSTANCE.getTable_ListPrimaryKeys();

		/**
		 * The meta object literal for the '<em><b>List Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LIST_FOREIGN_KEYS = eINSTANCE.getTable_ListForeignKeys();

		/**
		 * The meta object literal for the '<em><b>List Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LIST_COLUMNS = eINSTANCE.getTable_ListColumns();

		/**
		 * The meta object literal for the '<em><b>List Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LIST_RELATIONS = eINSTANCE.getTable_ListRelations();

		/**
		 * The meta object literal for the '{@link sql_metamodel.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql_metamodel.impl.ColumnImpl
		 * @see sql_metamodel.impl.Sql_metamodelPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '<em><b>Is Not Null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__IS_NOT_NULL = eINSTANCE.getColumn_IsNotNull();

		/**
		 * The meta object literal for the '<em><b>Is Auto Incremetable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__IS_AUTO_INCREMETABLE = eINSTANCE.getColumn_IsAutoIncremetable();

		/**
		 * The meta object literal for the '{@link sql_metamodel.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql_metamodel.impl.RelationImpl
		 * @see sql_metamodel.impl.Sql_metamodelPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__SOURCE = eINSTANCE.getRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TARGET = eINSTANCE.getRelation_Target();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__MULTIPLICIDAD_A = eINSTANCE.getRelation_MultiplicidadA();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__MULTIPLICIDAD_B = eINSTANCE.getRelation_MultiplicidadB();

		/**
		 * The meta object literal for the '{@link sql_metamodel.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql_metamodel.impl.PrimaryKeyImpl
		 * @see sql_metamodel.impl.Sql_metamodelPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '{@link sql_metamodel.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql_metamodel.impl.ForeignKeyImpl
		 * @see sql_metamodel.impl.Sql_metamodelPackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY__NAME = eINSTANCE.getForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__PRIMARY_KEY = eINSTANCE.getForeignKey_PrimaryKey();

	}

} //Sql_metamodelPackage
