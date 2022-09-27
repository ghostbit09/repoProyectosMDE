/**
 */
package ui_diagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ui_diagram.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ui_diagramFactoryImpl extends EFactoryImpl implements Ui_diagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ui_diagramFactory init() {
		try {
			Ui_diagramFactory theUi_diagramFactory = (Ui_diagramFactory)EPackage.Registry.INSTANCE.getEFactory(Ui_diagramPackage.eNS_URI);
			if (theUi_diagramFactory != null) {
				return theUi_diagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ui_diagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ui_diagramFactoryImpl() {
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
			case Ui_diagramPackage.MODEL_FACTORY: return createModelFactory();
			case Ui_diagramPackage.UI_DIAGRAM: return createUI_Diagram();
			case Ui_diagramPackage.USER_INTERFACE: return createUserInterface();
			case Ui_diagramPackage.MODEL_ELEMENT: return createModelElement();
			case Ui_diagramPackage.GRAPHICAL_CONTAINER: return createGraphicalContainer();
			case Ui_diagramPackage.GRAPHICAL_INDIVIDUAL: return createGraphicalIndividual();
			case Ui_diagramPackage.GROUP: return createGroup();
			case Ui_diagramPackage.BUTTON: return createButton();
			case Ui_diagramPackage.LABEL: return createLabel();
			case Ui_diagramPackage.CHECK_BOX: return createCheckBox();
			case Ui_diagramPackage.TEXT_INPUT: return createTextInput();
			case Ui_diagramPackage.DROP_DOWN: return createDropDown();
			case Ui_diagramPackage.MENU: return createMenu();
			case Ui_diagramPackage.IMG: return createImg();
			case Ui_diagramPackage.ICON: return createIcon();
			case Ui_diagramPackage.TABLE: return createTable();
			case Ui_diagramPackage.COMBO_BOX: return createComboBox();
			case Ui_diagramPackage.RADIO_BUTTON: return createRadioButton();
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
	public UI_Diagram createUI_Diagram() {
		UI_DiagramImpl uI_Diagram = new UI_DiagramImpl();
		return uI_Diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserInterface createUserInterface() {
		UserInterfaceImpl userInterface = new UserInterfaceImpl();
		return userInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement createModelElement() {
		ModelElementImpl modelElement = new ModelElementImpl();
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalContainer createGraphicalContainer() {
		GraphicalContainerImpl graphicalContainer = new GraphicalContainerImpl();
		return graphicalContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalIndividual createGraphicalIndividual() {
		GraphicalIndividualImpl graphicalIndividual = new GraphicalIndividualImpl();
		return graphicalIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckBox createCheckBox() {
		CheckBoxImpl checkBox = new CheckBoxImpl();
		return checkBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInput createTextInput() {
		TextInputImpl textInput = new TextInputImpl();
		return textInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropDown createDropDown() {
		DropDownImpl dropDown = new DropDownImpl();
		return dropDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu createMenu() {
		MenuImpl menu = new MenuImpl();
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Img createImg() {
		ImgImpl img = new ImgImpl();
		return img;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Icon createIcon() {
		IconImpl icon = new IconImpl();
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboBox createComboBox() {
		ComboBoxImpl comboBox = new ComboBoxImpl();
		return comboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioButton createRadioButton() {
		RadioButtonImpl radioButton = new RadioButtonImpl();
		return radioButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ui_diagramPackage getUi_diagramPackage() {
		return (Ui_diagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ui_diagramPackage getPackage() {
		return Ui_diagramPackage.eINSTANCE;
	}

} //Ui_diagramFactoryImpl
