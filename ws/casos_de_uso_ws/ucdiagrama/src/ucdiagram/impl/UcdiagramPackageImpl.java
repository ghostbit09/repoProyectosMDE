/**
 */
package ucdiagram.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ucdiagram.Actor;
import ucdiagram.LimitBox;
import ucdiagram.ModelFactory;
import ucdiagram.UcdiagramFactory;
import ucdiagram.UcdiagramPackage;
import ucdiagram.UseCase;
import ucdiagram.comRelationship;
import ucdiagram.extendsRelationship;
import ucdiagram.includeRelationship;
import ucdiagram.uc_diagram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UcdiagramPackageImpl extends EPackageImpl implements UcdiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uc_diagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass limitBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendsRelationshipEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ucdiagram.UcdiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UcdiagramPackageImpl() {
		super(eNS_URI, UcdiagramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UcdiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UcdiagramPackage init() {
		if (isInited) return (UcdiagramPackage)EPackage.Registry.INSTANCE.getEPackage(UcdiagramPackage.eNS_URI);

		// Obtain or create and register package
		UcdiagramPackageImpl theUcdiagramPackage = (UcdiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UcdiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UcdiagramPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theUcdiagramPackage.createPackageContents();

		// Initialize created meta-data
		theUcdiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUcdiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UcdiagramPackage.eNS_URI, theUcdiagramPackage);
		return theUcdiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactory() {
		return modelFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactory_ListDiagrams() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuc_diagram() {
		return uc_diagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getuc_diagram_Name() {
		return (EAttribute)uc_diagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getuc_diagram_Description() {
		return (EAttribute)uc_diagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuc_diagram_ListActors() {
		return (EReference)uc_diagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuc_diagram_ListBoxes() {
		return (EReference)uc_diagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuc_diagram_ListComRels() {
		return (EReference)uc_diagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuc_diagram_ListIncRels() {
		return (EReference)uc_diagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuc_diagram_ListExtRels() {
		return (EReference)uc_diagramEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_Name() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCase() {
		return useCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseCase_Name() {
		return (EAttribute)useCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseCase_UseCaseId() {
		return (EAttribute)useCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseCase_Date() {
		return (EAttribute)useCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseCase_Description() {
		return (EAttribute)useCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseCase_Objective() {
		return (EAttribute)useCaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseCase_ListPreconditions() {
		return (EAttribute)useCaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseCase_ListPostconditions() {
		return (EAttribute)useCaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseCase_ListFlowEvents() {
		return (EAttribute)useCaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseCase_ListExceptions() {
		return (EAttribute)useCaseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseCase_Annotations() {
		return (EAttribute)useCaseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLimitBox() {
		return limitBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLimitBox_Name() {
		return (EAttribute)limitBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLimitBox_UseCases() {
		return (EReference)limitBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcomRelationship() {
		return comRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcomRelationship_Source() {
		return (EReference)comRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcomRelationship_Target() {
		return (EReference)comRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getincludeRelationship() {
		return includeRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getincludeRelationship_LabelName() {
		return (EAttribute)includeRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getincludeRelationship_Source() {
		return (EReference)includeRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getincludeRelationship_Target() {
		return (EReference)includeRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getextendsRelationship() {
		return extendsRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getextendsRelationship_LabelName() {
		return (EAttribute)extendsRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getextendsRelationship_Source() {
		return (EReference)extendsRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getextendsRelationship_Target() {
		return (EReference)extendsRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UcdiagramFactory getUcdiagramFactory() {
		return (UcdiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelFactoryEClass = createEClass(MODEL_FACTORY);
		createEReference(modelFactoryEClass, MODEL_FACTORY__LIST_DIAGRAMS);

		uc_diagramEClass = createEClass(UC_DIAGRAM);
		createEAttribute(uc_diagramEClass, UC_DIAGRAM__NAME);
		createEAttribute(uc_diagramEClass, UC_DIAGRAM__DESCRIPTION);
		createEReference(uc_diagramEClass, UC_DIAGRAM__LIST_ACTORS);
		createEReference(uc_diagramEClass, UC_DIAGRAM__LIST_BOXES);
		createEReference(uc_diagramEClass, UC_DIAGRAM__LIST_COM_RELS);
		createEReference(uc_diagramEClass, UC_DIAGRAM__LIST_INC_RELS);
		createEReference(uc_diagramEClass, UC_DIAGRAM__LIST_EXT_RELS);

		actorEClass = createEClass(ACTOR);
		createEAttribute(actorEClass, ACTOR__NAME);

		useCaseEClass = createEClass(USE_CASE);
		createEAttribute(useCaseEClass, USE_CASE__NAME);
		createEAttribute(useCaseEClass, USE_CASE__USE_CASE_ID);
		createEAttribute(useCaseEClass, USE_CASE__DATE);
		createEAttribute(useCaseEClass, USE_CASE__DESCRIPTION);
		createEAttribute(useCaseEClass, USE_CASE__OBJECTIVE);
		createEAttribute(useCaseEClass, USE_CASE__LIST_PRECONDITIONS);
		createEAttribute(useCaseEClass, USE_CASE__LIST_POSTCONDITIONS);
		createEAttribute(useCaseEClass, USE_CASE__LIST_FLOW_EVENTS);
		createEAttribute(useCaseEClass, USE_CASE__LIST_EXCEPTIONS);
		createEAttribute(useCaseEClass, USE_CASE__ANNOTATIONS);

		limitBoxEClass = createEClass(LIMIT_BOX);
		createEAttribute(limitBoxEClass, LIMIT_BOX__NAME);
		createEReference(limitBoxEClass, LIMIT_BOX__USE_CASES);

		comRelationshipEClass = createEClass(COM_RELATIONSHIP);
		createEReference(comRelationshipEClass, COM_RELATIONSHIP__SOURCE);
		createEReference(comRelationshipEClass, COM_RELATIONSHIP__TARGET);

		includeRelationshipEClass = createEClass(INCLUDE_RELATIONSHIP);
		createEAttribute(includeRelationshipEClass, INCLUDE_RELATIONSHIP__LABEL_NAME);
		createEReference(includeRelationshipEClass, INCLUDE_RELATIONSHIP__SOURCE);
		createEReference(includeRelationshipEClass, INCLUDE_RELATIONSHIP__TARGET);

		extendsRelationshipEClass = createEClass(EXTENDS_RELATIONSHIP);
		createEAttribute(extendsRelationshipEClass, EXTENDS_RELATIONSHIP__LABEL_NAME);
		createEReference(extendsRelationshipEClass, EXTENDS_RELATIONSHIP__SOURCE);
		createEReference(extendsRelationshipEClass, EXTENDS_RELATIONSHIP__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(modelFactoryEClass, ModelFactory.class, "ModelFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelFactory_ListDiagrams(), this.getuc_diagram(), null, "listDiagrams", null, 0, -1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uc_diagramEClass, uc_diagram.class, "uc_diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getuc_diagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, uc_diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getuc_diagram_Description(), ecorePackage.getEString(), "description", null, 0, 1, uc_diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuc_diagram_ListActors(), this.getActor(), null, "listActors", null, 0, -1, uc_diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuc_diagram_ListBoxes(), this.getLimitBox(), null, "listBoxes", null, 0, -1, uc_diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuc_diagram_ListComRels(), this.getcomRelationship(), null, "listComRels", null, 0, -1, uc_diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuc_diagram_ListIncRels(), this.getincludeRelationship(), null, "listIncRels", null, 0, -1, uc_diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getuc_diagram_ListExtRels(), this.getextendsRelationship(), null, "listExtRels", null, 0, -1, uc_diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useCaseEClass, UseCase.class, "UseCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUseCase_Name(), ecorePackage.getEString(), "name", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUseCase_UseCaseId(), ecorePackage.getEString(), "useCaseId", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUseCase_Date(), ecorePackage.getEString(), "date", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUseCase_Description(), ecorePackage.getEString(), "description", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUseCase_Objective(), ecorePackage.getEString(), "objective", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUseCase_ListPreconditions(), ecorePackage.getEString(), "listPreconditions", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUseCase_ListPostconditions(), ecorePackage.getEString(), "listPostconditions", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUseCase_ListFlowEvents(), ecorePackage.getEString(), "listFlowEvents", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUseCase_ListExceptions(), ecorePackage.getEString(), "listExceptions", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUseCase_Annotations(), ecorePackage.getEString(), "annotations", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(limitBoxEClass, LimitBox.class, "LimitBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLimitBox_Name(), ecorePackage.getEString(), "name", null, 0, 1, LimitBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLimitBox_UseCases(), this.getUseCase(), null, "useCases", null, 0, -1, LimitBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comRelationshipEClass, comRelationship.class, "comRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getcomRelationship_Source(), this.getActor(), null, "source", null, 0, 1, comRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getcomRelationship_Target(), this.getUseCase(), null, "target", null, 0, 1, comRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(includeRelationshipEClass, includeRelationship.class, "includeRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getincludeRelationship_LabelName(), ecorePackage.getEString(), "labelName", "<include>", 0, 1, includeRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getincludeRelationship_Source(), this.getUseCase(), null, "source", null, 0, 1, includeRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getincludeRelationship_Target(), this.getUseCase(), null, "target", null, 0, 1, includeRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendsRelationshipEClass, extendsRelationship.class, "extendsRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getextendsRelationship_LabelName(), ecorePackage.getEString(), "labelName", "<extends>", 0, 1, extendsRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getextendsRelationship_Source(), this.getUseCase(), null, "source", null, 0, 1, extendsRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getextendsRelationship_Target(), this.getUseCase(), null, "target", null, 0, 1, extendsRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (uc_diagramEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (actorEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/ucdiagrama/svg/actor.svg",
			 "label.layout", "center"
		   });	
		addAnnotation
		  (useCaseEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/ucdiagrama/svg/useCase.svg",
			 "label.layout", "center"
		   });	
		addAnnotation
		  (limitBoxEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.layout", "center"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getLimitBox_UseCases(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (comRelationshipEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "2"
		   });	
		addAnnotation
		  (includeRelationshipEClass, 
		   source, 
		   new String[] {
			 "label", "labelName",
			 "source", "source",
			 "target", "target",
			 "target.decoration", "arrow",
			 "style", "dot",
			 "width", "2"
		   });	
		addAnnotation
		  (extendsRelationshipEClass, 
		   source, 
		   new String[] {
			 "label", "labelName",
			 "source", "source",
			 "target", "target",
			 "target.decoration", "arrow",
			 "style", "dot",
			 "width", "2"
		   });
	}

} //UcdiagramPackageImpl
