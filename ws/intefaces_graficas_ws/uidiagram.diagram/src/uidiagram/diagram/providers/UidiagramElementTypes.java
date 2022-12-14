/*
 * 
 */
package uidiagram.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import uidiagram.UidiagramPackage;
import uidiagram.diagram.edit.parts.Button2EditPart;
import uidiagram.diagram.edit.parts.ButtonEditPart;
import uidiagram.diagram.edit.parts.CheckBox2EditPart;
import uidiagram.diagram.edit.parts.CheckBoxEditPart;
import uidiagram.diagram.edit.parts.ComboBox2EditPart;
import uidiagram.diagram.edit.parts.ComboBoxEditPart;
import uidiagram.diagram.edit.parts.FloatingButton2EditPart;
import uidiagram.diagram.edit.parts.FloatingButtonEditPart;
import uidiagram.diagram.edit.parts.Img2EditPart;
import uidiagram.diagram.edit.parts.ImgEditPart;
import uidiagram.diagram.edit.parts.Label2EditPart;
import uidiagram.diagram.edit.parts.LabelEditPart;
import uidiagram.diagram.edit.parts.RadioButton2EditPart;
import uidiagram.diagram.edit.parts.RadioButtonEditPart;
import uidiagram.diagram.edit.parts.Table2EditPart;
import uidiagram.diagram.edit.parts.TableEditPart;
import uidiagram.diagram.edit.parts.TableRow2EditPart;
import uidiagram.diagram.edit.parts.TableRowEditPart;
import uidiagram.diagram.edit.parts.TextInput2EditPart;
import uidiagram.diagram.edit.parts.TextInputEditPart;
import uidiagram.diagram.edit.parts.Ui_DiagramEditPart;
import uidiagram.diagram.edit.parts.UserInterface2EditPart;
import uidiagram.diagram.edit.parts.UserInterface3EditPart;
import uidiagram.diagram.edit.parts.UserInterfaceEditPart;
import uidiagram.diagram.part.UidiagramDiagramEditorPlugin;

/**
 * @generated
 */
public class UidiagramElementTypes {

	/**
	* @generated
	*/
	private UidiagramElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			UidiagramDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Ui_Diagram_1000 = getElementType("uidiagram.diagram.Ui_Diagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UserInterface_2001 = getElementType("uidiagram.diagram.UserInterface_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_3016 = getElementType("uidiagram.diagram.Button_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3017 = getElementType("uidiagram.diagram.Label_3017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CheckBox_3018 = getElementType("uidiagram.diagram.CheckBox_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TextInput_3019 = getElementType("uidiagram.diagram.TextInput_3019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Img_3022 = getElementType("uidiagram.diagram.Img_3022"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Table_3024 = getElementType("uidiagram.diagram.Table_3024"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_3003 = getElementType("uidiagram.diagram.Button_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3004 = getElementType("uidiagram.diagram.Label_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CheckBox_3005 = getElementType("uidiagram.diagram.CheckBox_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TextInput_3006 = getElementType("uidiagram.diagram.TextInput_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Img_3009 = getElementType("uidiagram.diagram.Img_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Table_3011 = getElementType("uidiagram.diagram.Table_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TableRow_3029 = getElementType("uidiagram.diagram.TableRow_3029"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComboBox_3013 = getElementType("uidiagram.diagram.ComboBox_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RadioButton_3014 = getElementType("uidiagram.diagram.RadioButton_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FloatingButton_3031 = getElementType("uidiagram.diagram.FloatingButton_3031"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UserInterface_3015 = getElementType("uidiagram.diagram.UserInterface_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TableRow_3032 = getElementType("uidiagram.diagram.TableRow_3032"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComboBox_3026 = getElementType("uidiagram.diagram.ComboBox_3026"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RadioButton_3027 = getElementType("uidiagram.diagram.RadioButton_3027"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FloatingButton_3034 = getElementType("uidiagram.diagram.FloatingButton_3034"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UserInterface_3028 = getElementType("uidiagram.diagram.UserInterface_3028"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Ui_Diagram_1000, UidiagramPackage.eINSTANCE.getUi_Diagram());

			elements.put(UserInterface_2001, UidiagramPackage.eINSTANCE.getUserInterface());

			elements.put(Button_3016, UidiagramPackage.eINSTANCE.getButton());

			elements.put(Label_3017, UidiagramPackage.eINSTANCE.getLabel());

			elements.put(CheckBox_3018, UidiagramPackage.eINSTANCE.getCheckBox());

			elements.put(TextInput_3019, UidiagramPackage.eINSTANCE.getTextInput());

			elements.put(Img_3022, UidiagramPackage.eINSTANCE.getImg());

			elements.put(Table_3024, UidiagramPackage.eINSTANCE.getTable());

			elements.put(Button_3003, UidiagramPackage.eINSTANCE.getButton());

			elements.put(Label_3004, UidiagramPackage.eINSTANCE.getLabel());

			elements.put(CheckBox_3005, UidiagramPackage.eINSTANCE.getCheckBox());

			elements.put(TextInput_3006, UidiagramPackage.eINSTANCE.getTextInput());

			elements.put(Img_3009, UidiagramPackage.eINSTANCE.getImg());

			elements.put(Table_3011, UidiagramPackage.eINSTANCE.getTable());

			elements.put(TableRow_3029, UidiagramPackage.eINSTANCE.getTableRow());

			elements.put(ComboBox_3013, UidiagramPackage.eINSTANCE.getComboBox());

			elements.put(RadioButton_3014, UidiagramPackage.eINSTANCE.getRadioButton());

			elements.put(FloatingButton_3031, UidiagramPackage.eINSTANCE.getFloatingButton());

			elements.put(UserInterface_3015, UidiagramPackage.eINSTANCE.getUserInterface());

			elements.put(TableRow_3032, UidiagramPackage.eINSTANCE.getTableRow());

			elements.put(ComboBox_3026, UidiagramPackage.eINSTANCE.getComboBox());

			elements.put(RadioButton_3027, UidiagramPackage.eINSTANCE.getRadioButton());

			elements.put(FloatingButton_3034, UidiagramPackage.eINSTANCE.getFloatingButton());

			elements.put(UserInterface_3028, UidiagramPackage.eINSTANCE.getUserInterface());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Ui_Diagram_1000);
			KNOWN_ELEMENT_TYPES.add(UserInterface_2001);
			KNOWN_ELEMENT_TYPES.add(Button_3016);
			KNOWN_ELEMENT_TYPES.add(Label_3017);
			KNOWN_ELEMENT_TYPES.add(CheckBox_3018);
			KNOWN_ELEMENT_TYPES.add(TextInput_3019);
			KNOWN_ELEMENT_TYPES.add(Img_3022);
			KNOWN_ELEMENT_TYPES.add(Table_3024);
			KNOWN_ELEMENT_TYPES.add(Button_3003);
			KNOWN_ELEMENT_TYPES.add(Label_3004);
			KNOWN_ELEMENT_TYPES.add(CheckBox_3005);
			KNOWN_ELEMENT_TYPES.add(TextInput_3006);
			KNOWN_ELEMENT_TYPES.add(Img_3009);
			KNOWN_ELEMENT_TYPES.add(Table_3011);
			KNOWN_ELEMENT_TYPES.add(TableRow_3029);
			KNOWN_ELEMENT_TYPES.add(ComboBox_3013);
			KNOWN_ELEMENT_TYPES.add(RadioButton_3014);
			KNOWN_ELEMENT_TYPES.add(FloatingButton_3031);
			KNOWN_ELEMENT_TYPES.add(UserInterface_3015);
			KNOWN_ELEMENT_TYPES.add(TableRow_3032);
			KNOWN_ELEMENT_TYPES.add(ComboBox_3026);
			KNOWN_ELEMENT_TYPES.add(RadioButton_3027);
			KNOWN_ELEMENT_TYPES.add(FloatingButton_3034);
			KNOWN_ELEMENT_TYPES.add(UserInterface_3028);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case Ui_DiagramEditPart.VISUAL_ID:
			return Ui_Diagram_1000;
		case UserInterfaceEditPart.VISUAL_ID:
			return UserInterface_2001;
		case ButtonEditPart.VISUAL_ID:
			return Button_3016;
		case LabelEditPart.VISUAL_ID:
			return Label_3017;
		case CheckBoxEditPart.VISUAL_ID:
			return CheckBox_3018;
		case TextInputEditPart.VISUAL_ID:
			return TextInput_3019;
		case ImgEditPart.VISUAL_ID:
			return Img_3022;
		case TableEditPart.VISUAL_ID:
			return Table_3024;
		case Button2EditPart.VISUAL_ID:
			return Button_3003;
		case Label2EditPart.VISUAL_ID:
			return Label_3004;
		case CheckBox2EditPart.VISUAL_ID:
			return CheckBox_3005;
		case TextInput2EditPart.VISUAL_ID:
			return TextInput_3006;
		case Img2EditPart.VISUAL_ID:
			return Img_3009;
		case Table2EditPart.VISUAL_ID:
			return Table_3011;
		case TableRowEditPart.VISUAL_ID:
			return TableRow_3029;
		case ComboBoxEditPart.VISUAL_ID:
			return ComboBox_3013;
		case RadioButtonEditPart.VISUAL_ID:
			return RadioButton_3014;
		case FloatingButtonEditPart.VISUAL_ID:
			return FloatingButton_3031;
		case UserInterface2EditPart.VISUAL_ID:
			return UserInterface_3015;
		case TableRow2EditPart.VISUAL_ID:
			return TableRow_3032;
		case ComboBox2EditPart.VISUAL_ID:
			return ComboBox_3026;
		case RadioButton2EditPart.VISUAL_ID:
			return RadioButton_3027;
		case FloatingButton2EditPart.VISUAL_ID:
			return FloatingButton_3034;
		case UserInterface3EditPart.VISUAL_ID:
			return UserInterface_3028;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return uidiagram.diagram.providers.UidiagramElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return uidiagram.diagram.providers.UidiagramElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return uidiagram.diagram.providers.UidiagramElementTypes.getElement(elementTypeAdapter);
		}
	};

}
