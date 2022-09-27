/*
 * 
 */
package ui_diagram.diagram.providers;

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

/**
 * @generated
 */
public class Ui_diagramElementTypes {

	/**
	* @generated
	*/
	private Ui_diagramElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType UI_Diagram_1000 = getElementType("ui_concrete.diagram.UI_Diagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UserInterface_2001 = getElementType("ui_concrete.diagram.UserInterface_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3001 = getElementType("ui_concrete.diagram.Group_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3002 = getElementType("ui_concrete.diagram.Group_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_3003 = getElementType("ui_concrete.diagram.Button_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3004 = getElementType("ui_concrete.diagram.Label_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CheckBox_3005 = getElementType("ui_concrete.diagram.CheckBox_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TextInput_3006 = getElementType("ui_concrete.diagram.TextInput_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DropDown_3007 = getElementType("ui_concrete.diagram.DropDown_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Menu_3008 = getElementType("ui_concrete.diagram.Menu_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Img_3009 = getElementType("ui_concrete.diagram.Img_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Icon_3010 = getElementType("ui_concrete.diagram.Icon_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Table_3011 = getElementType("ui_concrete.diagram.Table_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComboBox_3012 = getElementType("ui_concrete.diagram.ComboBox_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RadioButton_3023 = getElementType("ui_concrete.diagram.RadioButton_3023"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_3013 = getElementType("ui_concrete.diagram.Button_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3014 = getElementType("ui_concrete.diagram.Label_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CheckBox_3015 = getElementType("ui_concrete.diagram.CheckBox_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TextInput_3016 = getElementType("ui_concrete.diagram.TextInput_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DropDown_3017 = getElementType("ui_concrete.diagram.DropDown_3017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Menu_3018 = getElementType("ui_concrete.diagram.Menu_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Img_3019 = getElementType("ui_concrete.diagram.Img_3019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Icon_3020 = getElementType("ui_concrete.diagram.Icon_3020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Table_3021 = getElementType("ui_concrete.diagram.Table_3021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComboBox_3022 = getElementType("ui_concrete.diagram.ComboBox_3022"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RadioButton_3024 = getElementType("ui_concrete.diagram.RadioButton_3024"); //$NON-NLS-1$

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

			elements.put(UI_Diagram_1000, ui_diagram.Ui_diagramPackage.eINSTANCE.getUI_Diagram());

			elements.put(UserInterface_2001, ui_diagram.Ui_diagramPackage.eINSTANCE.getUserInterface());

			elements.put(Group_3001, ui_diagram.Ui_diagramPackage.eINSTANCE.getGroup());

			elements.put(Group_3002, ui_diagram.Ui_diagramPackage.eINSTANCE.getGroup());

			elements.put(Button_3003, ui_diagram.Ui_diagramPackage.eINSTANCE.getButton());

			elements.put(Label_3004, ui_diagram.Ui_diagramPackage.eINSTANCE.getLabel());

			elements.put(CheckBox_3005, ui_diagram.Ui_diagramPackage.eINSTANCE.getCheckBox());

			elements.put(TextInput_3006, ui_diagram.Ui_diagramPackage.eINSTANCE.getTextInput());

			elements.put(DropDown_3007, ui_diagram.Ui_diagramPackage.eINSTANCE.getDropDown());

			elements.put(Menu_3008, ui_diagram.Ui_diagramPackage.eINSTANCE.getMenu());

			elements.put(Img_3009, ui_diagram.Ui_diagramPackage.eINSTANCE.getImg());

			elements.put(Icon_3010, ui_diagram.Ui_diagramPackage.eINSTANCE.getIcon());

			elements.put(Table_3011, ui_diagram.Ui_diagramPackage.eINSTANCE.getTable());

			elements.put(ComboBox_3012, ui_diagram.Ui_diagramPackage.eINSTANCE.getComboBox());

			elements.put(RadioButton_3023, ui_diagram.Ui_diagramPackage.eINSTANCE.getRadioButton());

			elements.put(Button_3013, ui_diagram.Ui_diagramPackage.eINSTANCE.getButton());

			elements.put(Label_3014, ui_diagram.Ui_diagramPackage.eINSTANCE.getLabel());

			elements.put(CheckBox_3015, ui_diagram.Ui_diagramPackage.eINSTANCE.getCheckBox());

			elements.put(TextInput_3016, ui_diagram.Ui_diagramPackage.eINSTANCE.getTextInput());

			elements.put(DropDown_3017, ui_diagram.Ui_diagramPackage.eINSTANCE.getDropDown());

			elements.put(Menu_3018, ui_diagram.Ui_diagramPackage.eINSTANCE.getMenu());

			elements.put(Img_3019, ui_diagram.Ui_diagramPackage.eINSTANCE.getImg());

			elements.put(Icon_3020, ui_diagram.Ui_diagramPackage.eINSTANCE.getIcon());

			elements.put(Table_3021, ui_diagram.Ui_diagramPackage.eINSTANCE.getTable());

			elements.put(ComboBox_3022, ui_diagram.Ui_diagramPackage.eINSTANCE.getComboBox());

			elements.put(RadioButton_3024, ui_diagram.Ui_diagramPackage.eINSTANCE.getRadioButton());
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
			KNOWN_ELEMENT_TYPES.add(UI_Diagram_1000);
			KNOWN_ELEMENT_TYPES.add(UserInterface_2001);
			KNOWN_ELEMENT_TYPES.add(Group_3001);
			KNOWN_ELEMENT_TYPES.add(Group_3002);
			KNOWN_ELEMENT_TYPES.add(Button_3003);
			KNOWN_ELEMENT_TYPES.add(Label_3004);
			KNOWN_ELEMENT_TYPES.add(CheckBox_3005);
			KNOWN_ELEMENT_TYPES.add(TextInput_3006);
			KNOWN_ELEMENT_TYPES.add(DropDown_3007);
			KNOWN_ELEMENT_TYPES.add(Menu_3008);
			KNOWN_ELEMENT_TYPES.add(Img_3009);
			KNOWN_ELEMENT_TYPES.add(Icon_3010);
			KNOWN_ELEMENT_TYPES.add(Table_3011);
			KNOWN_ELEMENT_TYPES.add(ComboBox_3012);
			KNOWN_ELEMENT_TYPES.add(RadioButton_3023);
			KNOWN_ELEMENT_TYPES.add(Button_3013);
			KNOWN_ELEMENT_TYPES.add(Label_3014);
			KNOWN_ELEMENT_TYPES.add(CheckBox_3015);
			KNOWN_ELEMENT_TYPES.add(TextInput_3016);
			KNOWN_ELEMENT_TYPES.add(DropDown_3017);
			KNOWN_ELEMENT_TYPES.add(Menu_3018);
			KNOWN_ELEMENT_TYPES.add(Img_3019);
			KNOWN_ELEMENT_TYPES.add(Icon_3020);
			KNOWN_ELEMENT_TYPES.add(Table_3021);
			KNOWN_ELEMENT_TYPES.add(ComboBox_3022);
			KNOWN_ELEMENT_TYPES.add(RadioButton_3024);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ui_diagram.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			return UI_Diagram_1000;
		case ui_diagram.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
			return UserInterface_2001;
		case ui_diagram.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return Group_3001;
		case ui_diagram.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return Group_3002;
		case ui_diagram.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return Button_3003;
		case ui_diagram.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return Label_3004;
		case ui_diagram.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
			return CheckBox_3005;
		case ui_diagram.diagram.edit.parts.TextInputEditPart.VISUAL_ID:
			return TextInput_3006;
		case ui_diagram.diagram.edit.parts.DropDownEditPart.VISUAL_ID:
			return DropDown_3007;
		case ui_diagram.diagram.edit.parts.MenuEditPart.VISUAL_ID:
			return Menu_3008;
		case ui_diagram.diagram.edit.parts.ImgEditPart.VISUAL_ID:
			return Img_3009;
		case ui_diagram.diagram.edit.parts.IconEditPart.VISUAL_ID:
			return Icon_3010;
		case ui_diagram.diagram.edit.parts.TableEditPart.VISUAL_ID:
			return Table_3011;
		case ui_diagram.diagram.edit.parts.ComboBoxEditPart.VISUAL_ID:
			return ComboBox_3012;
		case ui_diagram.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID:
			return RadioButton_3023;
		case ui_diagram.diagram.edit.parts.Button2EditPart.VISUAL_ID:
			return Button_3013;
		case ui_diagram.diagram.edit.parts.Label2EditPart.VISUAL_ID:
			return Label_3014;
		case ui_diagram.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID:
			return CheckBox_3015;
		case ui_diagram.diagram.edit.parts.TextInput2EditPart.VISUAL_ID:
			return TextInput_3016;
		case ui_diagram.diagram.edit.parts.DropDown2EditPart.VISUAL_ID:
			return DropDown_3017;
		case ui_diagram.diagram.edit.parts.Menu2EditPart.VISUAL_ID:
			return Menu_3018;
		case ui_diagram.diagram.edit.parts.Img2EditPart.VISUAL_ID:
			return Img_3019;
		case ui_diagram.diagram.edit.parts.Icon2EditPart.VISUAL_ID:
			return Icon_3020;
		case ui_diagram.diagram.edit.parts.Table2EditPart.VISUAL_ID:
			return Table_3021;
		case ui_diagram.diagram.edit.parts.ComboBox2EditPart.VISUAL_ID:
			return ComboBox_3022;
		case ui_diagram.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID:
			return RadioButton_3024;
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
			return ui_diagram.diagram.providers.Ui_diagramElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return ui_diagram.diagram.providers.Ui_diagramElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return ui_diagram.diagram.providers.Ui_diagramElementTypes.getElement(elementTypeAdapter);
		}
	};

}
