/*
* 
*/
package uidiagram.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import uidiagram.diagram.edit.parts.Button2EditPart;
import uidiagram.diagram.edit.parts.ButtonEditPart;
import uidiagram.diagram.edit.parts.ButtonName2EditPart;
import uidiagram.diagram.edit.parts.ButtonNameEditPart;
import uidiagram.diagram.edit.parts.CheckBox2EditPart;
import uidiagram.diagram.edit.parts.CheckBoxEditPart;
import uidiagram.diagram.edit.parts.CheckBoxName2EditPart;
import uidiagram.diagram.edit.parts.CheckBoxNameEditPart;
import uidiagram.diagram.edit.parts.ComboBox2EditPart;
import uidiagram.diagram.edit.parts.ComboBoxEditPart;
import uidiagram.diagram.edit.parts.ComboBoxName2EditPart;
import uidiagram.diagram.edit.parts.ComboBoxNameEditPart;
import uidiagram.diagram.edit.parts.FloatingButton2EditPart;
import uidiagram.diagram.edit.parts.FloatingButtonEditPart;
import uidiagram.diagram.edit.parts.FloatingButtonName2EditPart;
import uidiagram.diagram.edit.parts.FloatingButtonNameEditPart;
import uidiagram.diagram.edit.parts.Img2EditPart;
import uidiagram.diagram.edit.parts.ImgEditPart;
import uidiagram.diagram.edit.parts.ImgName2EditPart;
import uidiagram.diagram.edit.parts.ImgNameEditPart;
import uidiagram.diagram.edit.parts.Label2EditPart;
import uidiagram.diagram.edit.parts.LabelEditPart;
import uidiagram.diagram.edit.parts.LabelName2EditPart;
import uidiagram.diagram.edit.parts.LabelNameEditPart;
import uidiagram.diagram.edit.parts.RadioButton2EditPart;
import uidiagram.diagram.edit.parts.RadioButtonEditPart;
import uidiagram.diagram.edit.parts.RadioButtonName2EditPart;
import uidiagram.diagram.edit.parts.RadioButtonNameEditPart;
import uidiagram.diagram.edit.parts.Table2EditPart;
import uidiagram.diagram.edit.parts.TableEditPart;
import uidiagram.diagram.edit.parts.TableName2EditPart;
import uidiagram.diagram.edit.parts.TableNameEditPart;
import uidiagram.diagram.edit.parts.TableRow2EditPart;
import uidiagram.diagram.edit.parts.TableRowEditPart;
import uidiagram.diagram.edit.parts.TableRowName2EditPart;
import uidiagram.diagram.edit.parts.TableRowNameEditPart;
import uidiagram.diagram.edit.parts.TextInput2EditPart;
import uidiagram.diagram.edit.parts.TextInputEditPart;
import uidiagram.diagram.edit.parts.TextInputName2EditPart;
import uidiagram.diagram.edit.parts.TextInputNameEditPart;
import uidiagram.diagram.edit.parts.Ui_DiagramEditPart;
import uidiagram.diagram.edit.parts.UserInterface2EditPart;
import uidiagram.diagram.edit.parts.UserInterface3EditPart;
import uidiagram.diagram.edit.parts.UserInterfaceEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceName2EditPart;
import uidiagram.diagram.edit.parts.UserInterfaceName3EditPart;
import uidiagram.diagram.edit.parts.UserInterfaceNameEditPart;
import uidiagram.diagram.part.UidiagramDiagramEditorPlugin;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;
import uidiagram.diagram.providers.UidiagramElementTypes;
import uidiagram.diagram.providers.UidiagramParserProvider;

/**
 * @generated
 */
public class UidiagramNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		UidiagramDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		UidiagramDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof UidiagramNavigatorItem && !isOwnView(((UidiagramNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof UidiagramNavigatorGroup) {
			UidiagramNavigatorGroup group = (UidiagramNavigatorGroup) element;
			return UidiagramDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof UidiagramNavigatorItem) {
			UidiagramNavigatorItem navigatorItem = (UidiagramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case Ui_DiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://uidiagram?Ui_Diagram", UidiagramElementTypes.Ui_Diagram_1000); //$NON-NLS-1$
		case UserInterfaceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://uidiagram?UserInterface", //$NON-NLS-1$
					UidiagramElementTypes.UserInterface_2001);
		case Button2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Button", UidiagramElementTypes.Button_3003); //$NON-NLS-1$
		case Label2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Label", UidiagramElementTypes.Label_3004); //$NON-NLS-1$
		case CheckBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?CheckBox", UidiagramElementTypes.CheckBox_3005); //$NON-NLS-1$
		case TextInput2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?TextInput", UidiagramElementTypes.TextInput_3006); //$NON-NLS-1$
		case Img2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Img", UidiagramElementTypes.Img_3009); //$NON-NLS-1$
		case Table2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Table", UidiagramElementTypes.Table_3011); //$NON-NLS-1$
		case ComboBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?ComboBox", UidiagramElementTypes.ComboBox_3013); //$NON-NLS-1$
		case RadioButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?RadioButton", UidiagramElementTypes.RadioButton_3014); //$NON-NLS-1$
		case UserInterface2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?UserInterface", UidiagramElementTypes.UserInterface_3015); //$NON-NLS-1$
		case ButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Button", UidiagramElementTypes.Button_3016); //$NON-NLS-1$
		case LabelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Label", UidiagramElementTypes.Label_3017); //$NON-NLS-1$
		case CheckBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?CheckBox", UidiagramElementTypes.CheckBox_3018); //$NON-NLS-1$
		case TextInputEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?TextInput", UidiagramElementTypes.TextInput_3019); //$NON-NLS-1$
		case ImgEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Img", UidiagramElementTypes.Img_3022); //$NON-NLS-1$
		case TableEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Table", UidiagramElementTypes.Table_3024); //$NON-NLS-1$
		case ComboBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?ComboBox", UidiagramElementTypes.ComboBox_3026); //$NON-NLS-1$
		case RadioButton2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?RadioButton", UidiagramElementTypes.RadioButton_3027); //$NON-NLS-1$
		case UserInterface3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?UserInterface", UidiagramElementTypes.UserInterface_3028); //$NON-NLS-1$
		case TableRowEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?TableRow", UidiagramElementTypes.TableRow_3029); //$NON-NLS-1$
		case FloatingButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?FloatingButton", //$NON-NLS-1$
					UidiagramElementTypes.FloatingButton_3031);
		case TableRow2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?TableRow", UidiagramElementTypes.TableRow_3032); //$NON-NLS-1$
		case FloatingButton2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?FloatingButton", //$NON-NLS-1$
					UidiagramElementTypes.FloatingButton_3034);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = UidiagramDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && UidiagramElementTypes.isKnownElementType(elementType)) {
			image = UidiagramElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof UidiagramNavigatorGroup) {
			UidiagramNavigatorGroup group = (UidiagramNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof UidiagramNavigatorItem) {
			UidiagramNavigatorItem navigatorItem = (UidiagramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case Ui_DiagramEditPart.VISUAL_ID:
			return getUi_Diagram_1000Text(view);
		case UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001Text(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3003Text(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3004Text(view);
		case CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_3005Text(view);
		case TextInput2EditPart.VISUAL_ID:
			return getTextInput_3006Text(view);
		case Img2EditPart.VISUAL_ID:
			return getImg_3009Text(view);
		case Table2EditPart.VISUAL_ID:
			return getTable_3011Text(view);
		case ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3013Text(view);
		case RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3014Text(view);
		case UserInterface2EditPart.VISUAL_ID:
			return getUserInterface_3015Text(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3016Text(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3017Text(view);
		case CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3018Text(view);
		case TextInputEditPart.VISUAL_ID:
			return getTextInput_3019Text(view);
		case ImgEditPart.VISUAL_ID:
			return getImg_3022Text(view);
		case TableEditPart.VISUAL_ID:
			return getTable_3024Text(view);
		case ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3026Text(view);
		case RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3027Text(view);
		case UserInterface3EditPart.VISUAL_ID:
			return getUserInterface_3028Text(view);
		case TableRowEditPart.VISUAL_ID:
			return getTableRow_3029Text(view);
		case FloatingButtonEditPart.VISUAL_ID:
			return getFloatingButton_3031Text(view);
		case TableRow2EditPart.VISUAL_ID:
			return getTableRow_3032Text(view);
		case FloatingButton2EditPart.VISUAL_ID:
			return getFloatingButton_3034Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getUi_Diagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUserInterface_2001Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.UserInterface_2001,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(UserInterfaceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3003Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Button_3003,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ButtonName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3004Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Label_3004,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(LabelName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCheckBox_3005Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.CheckBox_3005,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(CheckBoxName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTextInput_3006Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.TextInput_3006,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TextInputName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImg_3009Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Img_3009,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ImgName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTable_3011Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Table_3011,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TableName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComboBox_3013Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.ComboBox_3013,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ComboBoxNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRadioButton_3014Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.RadioButton_3014,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(RadioButtonNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUserInterface_3015Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.UserInterface_3015,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(UserInterfaceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3016Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Button_3016,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ButtonNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3017Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Label_3017,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(LabelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCheckBox_3018Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.CheckBox_3018,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(CheckBoxNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTextInput_3019Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.TextInput_3019,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TextInputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImg_3022Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Img_3022,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ImgNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTable_3024Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Table_3024,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComboBox_3026Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.ComboBox_3026,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ComboBoxName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRadioButton_3027Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.RadioButton_3027,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(RadioButtonName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUserInterface_3028Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.UserInterface_3028,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(UserInterfaceName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTableRow_3029Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.TableRow_3029,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TableRowNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFloatingButton_3031Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.FloatingButton_3031,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(FloatingButtonNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTableRow_3032Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.TableRow_3032,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TableRowName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFloatingButton_3034Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.FloatingButton_3034,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(FloatingButtonName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return Ui_DiagramEditPart.MODEL_ID.equals(UidiagramVisualIDRegistry.getModelID(view));
	}

}
