/**
 */
package ucdiagram;

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
 * @see ucdiagram.UcdiagramFactory
 * @model kind="package"
 * @generated
 */
public interface UcdiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ucdiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ucdiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ucdiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UcdiagramPackage eINSTANCE = ucdiagram.impl.UcdiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link ucdiagram.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucdiagram.impl.ModelFactoryImpl
	 * @see ucdiagram.impl.UcdiagramPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>List Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LIST_DIAGRAMS = 0;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ucdiagram.impl.uc_diagramImpl <em>uc diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucdiagram.impl.uc_diagramImpl
	 * @see ucdiagram.impl.UcdiagramPackageImpl#getuc_diagram()
	 * @generated
	 */
	int UC_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_DIAGRAM__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>List Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_DIAGRAM__LIST_ACTORS = 2;

	/**
	 * The feature id for the '<em><b>List Boxes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_DIAGRAM__LIST_BOXES = 3;

	/**
	 * The feature id for the '<em><b>List Com Rels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_DIAGRAM__LIST_COM_RELS = 4;

	/**
	 * The feature id for the '<em><b>List Inc Rels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_DIAGRAM__LIST_INC_RELS = 5;

	/**
	 * The feature id for the '<em><b>List Ext Rels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_DIAGRAM__LIST_EXT_RELS = 6;

	/**
	 * The number of structural features of the '<em>uc diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_DIAGRAM_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link ucdiagram.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucdiagram.impl.ActorImpl
	 * @see ucdiagram.impl.UcdiagramPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = 0;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ucdiagram.impl.UseCaseImpl <em>Use Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucdiagram.impl.UseCaseImpl
	 * @see ucdiagram.impl.UcdiagramPackageImpl#getUseCase()
	 * @generated
	 */
	int USE_CASE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Use Case Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__USE_CASE_ID = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__DATE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__OBJECTIVE = 4;

	/**
	 * The feature id for the '<em><b>List Preconditions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__LIST_PRECONDITIONS = 5;

	/**
	 * The feature id for the '<em><b>List Postconditions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__LIST_POSTCONDITIONS = 6;

	/**
	 * The feature id for the '<em><b>List Flow Events</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__LIST_FLOW_EVENTS = 7;

	/**
	 * The feature id for the '<em><b>List Exceptions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__LIST_EXCEPTIONS = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__ANNOTATIONS = 9;

	/**
	 * The number of structural features of the '<em>Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link ucdiagram.impl.LimitBoxImpl <em>Limit Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucdiagram.impl.LimitBoxImpl
	 * @see ucdiagram.impl.UcdiagramPackageImpl#getLimitBox()
	 * @generated
	 */
	int LIMIT_BOX = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_BOX__NAME = 0;

	/**
	 * The feature id for the '<em><b>Use Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_BOX__USE_CASES = 1;

	/**
	 * The number of structural features of the '<em>Limit Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_BOX_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ucdiagram.impl.comRelationshipImpl <em>com Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucdiagram.impl.comRelationshipImpl
	 * @see ucdiagram.impl.UcdiagramPackageImpl#getcomRelationship()
	 * @generated
	 */
	int COM_RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RELATIONSHIP__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RELATIONSHIP__TARGET = 1;

	/**
	 * The number of structural features of the '<em>com Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_RELATIONSHIP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ucdiagram.impl.includeRelationshipImpl <em>include Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucdiagram.impl.includeRelationshipImpl
	 * @see ucdiagram.impl.UcdiagramPackageImpl#getincludeRelationship()
	 * @generated
	 */
	int INCLUDE_RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Label Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_RELATIONSHIP__LABEL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_RELATIONSHIP__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_RELATIONSHIP__TARGET = 2;

	/**
	 * The number of structural features of the '<em>include Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_RELATIONSHIP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ucdiagram.impl.extendsRelationshipImpl <em>extends Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucdiagram.impl.extendsRelationshipImpl
	 * @see ucdiagram.impl.UcdiagramPackageImpl#getextendsRelationship()
	 * @generated
	 */
	int EXTENDS_RELATIONSHIP = 7;

	/**
	 * The feature id for the '<em><b>Label Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_RELATIONSHIP__LABEL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_RELATIONSHIP__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_RELATIONSHIP__TARGET = 2;

	/**
	 * The number of structural features of the '<em>extends Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_RELATIONSHIP_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link ucdiagram.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see ucdiagram.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link ucdiagram.ModelFactory#getListDiagrams <em>List Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Diagrams</em>'.
	 * @see ucdiagram.ModelFactory#getListDiagrams()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListDiagrams();

	/**
	 * Returns the meta object for class '{@link ucdiagram.uc_diagram <em>uc diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uc diagram</em>'.
	 * @see ucdiagram.uc_diagram
	 * @generated
	 */
	EClass getuc_diagram();

	/**
	 * Returns the meta object for the attribute '{@link ucdiagram.uc_diagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ucdiagram.uc_diagram#getName()
	 * @see #getuc_diagram()
	 * @generated
	 */
	EAttribute getuc_diagram_Name();

	/**
	 * Returns the meta object for the attribute '{@link ucdiagram.uc_diagram#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ucdiagram.uc_diagram#getDescription()
	 * @see #getuc_diagram()
	 * @generated
	 */
	EAttribute getuc_diagram_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link ucdiagram.uc_diagram#getListActors <em>List Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Actors</em>'.
	 * @see ucdiagram.uc_diagram#getListActors()
	 * @see #getuc_diagram()
	 * @generated
	 */
	EReference getuc_diagram_ListActors();

	/**
	 * Returns the meta object for the containment reference list '{@link ucdiagram.uc_diagram#getListBoxes <em>List Boxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Boxes</em>'.
	 * @see ucdiagram.uc_diagram#getListBoxes()
	 * @see #getuc_diagram()
	 * @generated
	 */
	EReference getuc_diagram_ListBoxes();

	/**
	 * Returns the meta object for the containment reference list '{@link ucdiagram.uc_diagram#getListComRels <em>List Com Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Com Rels</em>'.
	 * @see ucdiagram.uc_diagram#getListComRels()
	 * @see #getuc_diagram()
	 * @generated
	 */
	EReference getuc_diagram_ListComRels();

	/**
	 * Returns the meta object for the containment reference list '{@link ucdiagram.uc_diagram#getListIncRels <em>List Inc Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Inc Rels</em>'.
	 * @see ucdiagram.uc_diagram#getListIncRels()
	 * @see #getuc_diagram()
	 * @generated
	 */
	EReference getuc_diagram_ListIncRels();

	/**
	 * Returns the meta object for the containment reference list '{@link ucdiagram.uc_diagram#getListExtRels <em>List Ext Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Ext Rels</em>'.
	 * @see ucdiagram.uc_diagram#getListExtRels()
	 * @see #getuc_diagram()
	 * @generated
	 */
	EReference getuc_diagram_ListExtRels();

	/**
	 * Returns the meta object for class '{@link ucdiagram.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see ucdiagram.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link ucdiagram.Actor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ucdiagram.Actor#getName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Name();

	/**
	 * Returns the meta object for class '{@link ucdiagram.UseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Case</em>'.
	 * @see ucdiagram.UseCase
	 * @generated
	 */
	EClass getUseCase();

	/**
	 * Returns the meta object for the attribute '{@link ucdiagram.UseCase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ucdiagram.UseCase#getName()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_Name();

	/**
	 * Returns the meta object for the attribute '{@link ucdiagram.UseCase#getUseCaseId <em>Use Case Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Case Id</em>'.
	 * @see ucdiagram.UseCase#getUseCaseId()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_UseCaseId();

	/**
	 * Returns the meta object for the attribute '{@link ucdiagram.UseCase#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see ucdiagram.UseCase#getDate()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_Date();

	/**
	 * Returns the meta object for the attribute '{@link ucdiagram.UseCase#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ucdiagram.UseCase#getDescription()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_Description();

	/**
	 * Returns the meta object for the attribute '{@link ucdiagram.UseCase#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objective</em>'.
	 * @see ucdiagram.UseCase#getObjective()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_Objective();

	/**
	 * Returns the meta object for the attribute list '{@link ucdiagram.UseCase#getListPreconditions <em>List Preconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List Preconditions</em>'.
	 * @see ucdiagram.UseCase#getListPreconditions()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_ListPreconditions();

	/**
	 * Returns the meta object for the attribute list '{@link ucdiagram.UseCase#getListPostconditions <em>List Postconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List Postconditions</em>'.
	 * @see ucdiagram.UseCase#getListPostconditions()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_ListPostconditions();

	/**
	 * Returns the meta object for the attribute list '{@link ucdiagram.UseCase#getListFlowEvents <em>List Flow Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List Flow Events</em>'.
	 * @see ucdiagram.UseCase#getListFlowEvents()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_ListFlowEvents();

	/**
	 * Returns the meta object for the attribute list '{@link ucdiagram.UseCase#getListExceptions <em>List Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List Exceptions</em>'.
	 * @see ucdiagram.UseCase#getListExceptions()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_ListExceptions();

	/**
	 * Returns the meta object for the attribute '{@link ucdiagram.UseCase#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotations</em>'.
	 * @see ucdiagram.UseCase#getAnnotations()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_Annotations();

	/**
	 * Returns the meta object for class '{@link ucdiagram.LimitBox <em>Limit Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limit Box</em>'.
	 * @see ucdiagram.LimitBox
	 * @generated
	 */
	EClass getLimitBox();

	/**
	 * Returns the meta object for the attribute '{@link ucdiagram.LimitBox#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ucdiagram.LimitBox#getName()
	 * @see #getLimitBox()
	 * @generated
	 */
	EAttribute getLimitBox_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ucdiagram.LimitBox#getUseCases <em>Use Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Use Cases</em>'.
	 * @see ucdiagram.LimitBox#getUseCases()
	 * @see #getLimitBox()
	 * @generated
	 */
	EReference getLimitBox_UseCases();

	/**
	 * Returns the meta object for class '{@link ucdiagram.comRelationship <em>com Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>com Relationship</em>'.
	 * @see ucdiagram.comRelationship
	 * @generated
	 */
	EClass getcomRelationship();

	/**
	 * Returns the meta object for the reference '{@link ucdiagram.comRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ucdiagram.comRelationship#getSource()
	 * @see #getcomRelationship()
	 * @generated
	 */
	EReference getcomRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link ucdiagram.comRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ucdiagram.comRelationship#getTarget()
	 * @see #getcomRelationship()
	 * @generated
	 */
	EReference getcomRelationship_Target();

	/**
	 * Returns the meta object for class '{@link ucdiagram.includeRelationship <em>include Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>include Relationship</em>'.
	 * @see ucdiagram.includeRelationship
	 * @generated
	 */
	EClass getincludeRelationship();

	/**
	 * Returns the meta object for the attribute '{@link ucdiagram.includeRelationship#getLabelName <em>Label Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Name</em>'.
	 * @see ucdiagram.includeRelationship#getLabelName()
	 * @see #getincludeRelationship()
	 * @generated
	 */
	EAttribute getincludeRelationship_LabelName();

	/**
	 * Returns the meta object for the reference '{@link ucdiagram.includeRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ucdiagram.includeRelationship#getSource()
	 * @see #getincludeRelationship()
	 * @generated
	 */
	EReference getincludeRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link ucdiagram.includeRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ucdiagram.includeRelationship#getTarget()
	 * @see #getincludeRelationship()
	 * @generated
	 */
	EReference getincludeRelationship_Target();

	/**
	 * Returns the meta object for class '{@link ucdiagram.extendsRelationship <em>extends Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>extends Relationship</em>'.
	 * @see ucdiagram.extendsRelationship
	 * @generated
	 */
	EClass getextendsRelationship();

	/**
	 * Returns the meta object for the attribute '{@link ucdiagram.extendsRelationship#getLabelName <em>Label Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Name</em>'.
	 * @see ucdiagram.extendsRelationship#getLabelName()
	 * @see #getextendsRelationship()
	 * @generated
	 */
	EAttribute getextendsRelationship_LabelName();

	/**
	 * Returns the meta object for the reference '{@link ucdiagram.extendsRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ucdiagram.extendsRelationship#getSource()
	 * @see #getextendsRelationship()
	 * @generated
	 */
	EReference getextendsRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link ucdiagram.extendsRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ucdiagram.extendsRelationship#getTarget()
	 * @see #getextendsRelationship()
	 * @generated
	 */
	EReference getextendsRelationship_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UcdiagramFactory getUcdiagramFactory();

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
		 * The meta object literal for the '{@link ucdiagram.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucdiagram.impl.ModelFactoryImpl
		 * @see ucdiagram.impl.UcdiagramPackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em><b>List Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LIST_DIAGRAMS = eINSTANCE.getModelFactory_ListDiagrams();

		/**
		 * The meta object literal for the '{@link ucdiagram.impl.uc_diagramImpl <em>uc diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucdiagram.impl.uc_diagramImpl
		 * @see ucdiagram.impl.UcdiagramPackageImpl#getuc_diagram()
		 * @generated
		 */
		EClass UC_DIAGRAM = eINSTANCE.getuc_diagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UC_DIAGRAM__NAME = eINSTANCE.getuc_diagram_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UC_DIAGRAM__DESCRIPTION = eINSTANCE.getuc_diagram_Description();

		/**
		 * The meta object literal for the '<em><b>List Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_DIAGRAM__LIST_ACTORS = eINSTANCE.getuc_diagram_ListActors();

		/**
		 * The meta object literal for the '<em><b>List Boxes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_DIAGRAM__LIST_BOXES = eINSTANCE.getuc_diagram_ListBoxes();

		/**
		 * The meta object literal for the '<em><b>List Com Rels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_DIAGRAM__LIST_COM_RELS = eINSTANCE.getuc_diagram_ListComRels();

		/**
		 * The meta object literal for the '<em><b>List Inc Rels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_DIAGRAM__LIST_INC_RELS = eINSTANCE.getuc_diagram_ListIncRels();

		/**
		 * The meta object literal for the '<em><b>List Ext Rels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_DIAGRAM__LIST_EXT_RELS = eINSTANCE.getuc_diagram_ListExtRels();

		/**
		 * The meta object literal for the '{@link ucdiagram.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucdiagram.impl.ActorImpl
		 * @see ucdiagram.impl.UcdiagramPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

		/**
		 * The meta object literal for the '{@link ucdiagram.impl.UseCaseImpl <em>Use Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucdiagram.impl.UseCaseImpl
		 * @see ucdiagram.impl.UcdiagramPackageImpl#getUseCase()
		 * @generated
		 */
		EClass USE_CASE = eINSTANCE.getUseCase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__NAME = eINSTANCE.getUseCase_Name();

		/**
		 * The meta object literal for the '<em><b>Use Case Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__USE_CASE_ID = eINSTANCE.getUseCase_UseCaseId();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__DATE = eINSTANCE.getUseCase_Date();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__DESCRIPTION = eINSTANCE.getUseCase_Description();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__OBJECTIVE = eINSTANCE.getUseCase_Objective();

		/**
		 * The meta object literal for the '<em><b>List Preconditions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__LIST_PRECONDITIONS = eINSTANCE.getUseCase_ListPreconditions();

		/**
		 * The meta object literal for the '<em><b>List Postconditions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__LIST_POSTCONDITIONS = eINSTANCE.getUseCase_ListPostconditions();

		/**
		 * The meta object literal for the '<em><b>List Flow Events</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__LIST_FLOW_EVENTS = eINSTANCE.getUseCase_ListFlowEvents();

		/**
		 * The meta object literal for the '<em><b>List Exceptions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__LIST_EXCEPTIONS = eINSTANCE.getUseCase_ListExceptions();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__ANNOTATIONS = eINSTANCE.getUseCase_Annotations();

		/**
		 * The meta object literal for the '{@link ucdiagram.impl.LimitBoxImpl <em>Limit Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucdiagram.impl.LimitBoxImpl
		 * @see ucdiagram.impl.UcdiagramPackageImpl#getLimitBox()
		 * @generated
		 */
		EClass LIMIT_BOX = eINSTANCE.getLimitBox();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMIT_BOX__NAME = eINSTANCE.getLimitBox_Name();

		/**
		 * The meta object literal for the '<em><b>Use Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIMIT_BOX__USE_CASES = eINSTANCE.getLimitBox_UseCases();

		/**
		 * The meta object literal for the '{@link ucdiagram.impl.comRelationshipImpl <em>com Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucdiagram.impl.comRelationshipImpl
		 * @see ucdiagram.impl.UcdiagramPackageImpl#getcomRelationship()
		 * @generated
		 */
		EClass COM_RELATIONSHIP = eINSTANCE.getcomRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_RELATIONSHIP__SOURCE = eINSTANCE.getcomRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_RELATIONSHIP__TARGET = eINSTANCE.getcomRelationship_Target();

		/**
		 * The meta object literal for the '{@link ucdiagram.impl.includeRelationshipImpl <em>include Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucdiagram.impl.includeRelationshipImpl
		 * @see ucdiagram.impl.UcdiagramPackageImpl#getincludeRelationship()
		 * @generated
		 */
		EClass INCLUDE_RELATIONSHIP = eINSTANCE.getincludeRelationship();

		/**
		 * The meta object literal for the '<em><b>Label Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_RELATIONSHIP__LABEL_NAME = eINSTANCE.getincludeRelationship_LabelName();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDE_RELATIONSHIP__SOURCE = eINSTANCE.getincludeRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDE_RELATIONSHIP__TARGET = eINSTANCE.getincludeRelationship_Target();

		/**
		 * The meta object literal for the '{@link ucdiagram.impl.extendsRelationshipImpl <em>extends Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucdiagram.impl.extendsRelationshipImpl
		 * @see ucdiagram.impl.UcdiagramPackageImpl#getextendsRelationship()
		 * @generated
		 */
		EClass EXTENDS_RELATIONSHIP = eINSTANCE.getextendsRelationship();

		/**
		 * The meta object literal for the '<em><b>Label Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDS_RELATIONSHIP__LABEL_NAME = eINSTANCE.getextendsRelationship_LabelName();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDS_RELATIONSHIP__SOURCE = eINSTANCE.getextendsRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDS_RELATIONSHIP__TARGET = eINSTANCE.getextendsRelationship_Target();

	}

} //UcdiagramPackage
