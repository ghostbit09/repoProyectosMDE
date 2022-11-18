/**
 */
package ucdiagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucdiagram.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UcdiagramFactoryImpl extends EFactoryImpl implements UcdiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UcdiagramFactory init() {
		try {
			UcdiagramFactory theUcdiagramFactory = (UcdiagramFactory)EPackage.Registry.INSTANCE.getEFactory(UcdiagramPackage.eNS_URI);
			if (theUcdiagramFactory != null) {
				return theUcdiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UcdiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UcdiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UcdiagramPackage.MODEL_FACTORY: return createModelFactory();
			case UcdiagramPackage.UC_DIAGRAM: return createuc_diagram();
			case UcdiagramPackage.ACTOR: return createActor();
			case UcdiagramPackage.USE_CASE: return createUseCase();
			case UcdiagramPackage.LIMIT_BOX: return createLimitBox();
			case UcdiagramPackage.COM_RELATIONSHIP: return createcomRelationship();
			case UcdiagramPackage.INCLUDE_RELATIONSHIP: return createincludeRelationship();
			case UcdiagramPackage.EXTENDS_RELATIONSHIP: return createextendsRelationship();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory createModelFactory() {
		ModelFactoryImpl modelFactory = new ModelFactoryImpl();
		return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uc_diagram createuc_diagram() {
		uc_diagramImpl uc_diagram = new uc_diagramImpl();
		return uc_diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase createUseCase() {
		UseCaseImpl useCase = new UseCaseImpl();
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimitBox createLimitBox() {
		LimitBoxImpl limitBox = new LimitBoxImpl();
		return limitBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public comRelationship createcomRelationship() {
		comRelationshipImpl comRelationship = new comRelationshipImpl();
		return comRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public includeRelationship createincludeRelationship() {
		includeRelationshipImpl includeRelationship = new includeRelationshipImpl();
		return includeRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public extendsRelationship createextendsRelationship() {
		extendsRelationshipImpl extendsRelationship = new extendsRelationshipImpl();
		return extendsRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UcdiagramPackage getUcdiagramPackage() {
		return (UcdiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UcdiagramPackage getPackage() {
		return UcdiagramPackage.eINSTANCE;
	}

} //UcdiagramFactoryImpl
