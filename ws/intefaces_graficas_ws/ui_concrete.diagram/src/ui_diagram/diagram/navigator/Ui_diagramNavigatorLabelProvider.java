/*
* 
*/
package ui_diagram.diagram.navigator;

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

/**
 * @generated
 */
public class Ui_diagramNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ui_diagram.diagram.navigator.Ui_diagramNavigatorItem
				&& !isOwnView(((ui_diagram.diagram.navigator.Ui_diagramNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ui_diagram.diagram.navigator.Ui_diagramNavigatorGroup) {
			ui_diagram.diagram.navigator.Ui_diagramNavigatorGroup group = (ui_diagram.diagram.navigator.Ui_diagramNavigatorGroup) element;
			return ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ui_diagram.diagram.navigator.Ui_diagramNavigatorItem) {
			ui_diagram.diagram.navigator.Ui_diagramNavigatorItem navigatorItem = (ui_diagram.diagram.navigator.Ui_diagramNavigatorItem) element;
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
		switch (ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getVisualID(view)) {
		case ui_diagram.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?ui_diagram?UI_Diagram", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.UI_Diagram_1000);
		case ui_diagram.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?ui_diagram?UserInterface", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.UserInterface_2001);
		case ui_diagram.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?Group", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Group_3001);
		case ui_diagram.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?Group", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Group_3002);
		case ui_diagram.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?Button", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Button_3003);
		case ui_diagram.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?Label", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Label_3004);
		case ui_diagram.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?CheckBox", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.CheckBox_3005);
		case ui_diagram.diagram.edit.parts.TextInputEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?TextInput", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.TextInput_3006);
		case ui_diagram.diagram.edit.parts.DropDownEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?DropDown", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.DropDown_3007);
		case ui_diagram.diagram.edit.parts.MenuEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?Menu", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Menu_3008);
		case ui_diagram.diagram.edit.parts.ImgEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?Img", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Img_3009);
		case ui_diagram.diagram.edit.parts.IconEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?Icon", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Icon_3010);
		case ui_diagram.diagram.edit.parts.TableEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?Table", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Table_3011);
		case ui_diagram.diagram.edit.parts.ComboBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?ComboBox", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.ComboBox_3012);
		case ui_diagram.diagram.edit.parts.Button2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?Button", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Button_3013);
		case ui_diagram.diagram.edit.parts.Label2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?Label", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Label_3014);
		case ui_diagram.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?CheckBox", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.CheckBox_3015);
		case ui_diagram.diagram.edit.parts.TextInput2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?TextInput", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.TextInput_3016);
		case ui_diagram.diagram.edit.parts.DropDown2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?DropDown", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.DropDown_3017);
		case ui_diagram.diagram.edit.parts.Menu2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?Menu", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Menu_3018);
		case ui_diagram.diagram.edit.parts.Img2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?Img", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Img_3019);
		case ui_diagram.diagram.edit.parts.Icon2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?Icon", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Icon_3020);
		case ui_diagram.diagram.edit.parts.Table2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?Table", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Table_3021);
		case ui_diagram.diagram.edit.parts.ComboBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?ComboBox", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.ComboBox_3022);
		case ui_diagram.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?RadioButton", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.RadioButton_3023);
		case ui_diagram.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_diagram?RadioButton", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.RadioButton_3024);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ui_diagram.diagram.providers.Ui_diagramElementTypes.isKnownElementType(elementType)) {
			image = ui_diagram.diagram.providers.Ui_diagramElementTypes.getImage(elementType);
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
		if (element instanceof ui_diagram.diagram.navigator.Ui_diagramNavigatorGroup) {
			ui_diagram.diagram.navigator.Ui_diagramNavigatorGroup group = (ui_diagram.diagram.navigator.Ui_diagramNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ui_diagram.diagram.navigator.Ui_diagramNavigatorItem) {
			ui_diagram.diagram.navigator.Ui_diagramNavigatorItem navigatorItem = (ui_diagram.diagram.navigator.Ui_diagramNavigatorItem) element;
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
		switch (ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getVisualID(view)) {
		case ui_diagram.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			return getUI_Diagram_1000Text(view);
		case ui_diagram.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001Text(view);
		case ui_diagram.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_3001Text(view);
		case ui_diagram.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getGroup_3002Text(view);
		case ui_diagram.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return getButton_3003Text(view);
		case ui_diagram.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return getLabel_3004Text(view);
		case ui_diagram.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3005Text(view);
		case ui_diagram.diagram.edit.parts.TextInputEditPart.VISUAL_ID:
			return getTextInput_3006Text(view);
		case ui_diagram.diagram.edit.parts.DropDownEditPart.VISUAL_ID:
			return getDropDown_3007Text(view);
		case ui_diagram.diagram.edit.parts.MenuEditPart.VISUAL_ID:
			return getMenu_3008Text(view);
		case ui_diagram.diagram.edit.parts.ImgEditPart.VISUAL_ID:
			return getImg_3009Text(view);
		case ui_diagram.diagram.edit.parts.IconEditPart.VISUAL_ID:
			return getIcon_3010Text(view);
		case ui_diagram.diagram.edit.parts.TableEditPart.VISUAL_ID:
			return getTable_3011Text(view);
		case ui_diagram.diagram.edit.parts.ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3012Text(view);
		case ui_diagram.diagram.edit.parts.Button2EditPart.VISUAL_ID:
			return getButton_3013Text(view);
		case ui_diagram.diagram.edit.parts.Label2EditPart.VISUAL_ID:
			return getLabel_3014Text(view);
		case ui_diagram.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_3015Text(view);
		case ui_diagram.diagram.edit.parts.TextInput2EditPart.VISUAL_ID:
			return getTextInput_3016Text(view);
		case ui_diagram.diagram.edit.parts.DropDown2EditPart.VISUAL_ID:
			return getDropDown_3017Text(view);
		case ui_diagram.diagram.edit.parts.Menu2EditPart.VISUAL_ID:
			return getMenu_3018Text(view);
		case ui_diagram.diagram.edit.parts.Img2EditPart.VISUAL_ID:
			return getImg_3019Text(view);
		case ui_diagram.diagram.edit.parts.Icon2EditPart.VISUAL_ID:
			return getIcon_3020Text(view);
		case ui_diagram.diagram.edit.parts.Table2EditPart.VISUAL_ID:
			return getTable_3021Text(view);
		case ui_diagram.diagram.edit.parts.ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3022Text(view);
		case ui_diagram.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3023Text(view);
		case ui_diagram.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3024Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getUI_Diagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUserInterface_2001Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.UserInterface_2001,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.UserInterfaceTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3001Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Group_3001,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.GroupTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3002Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Group_3002,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.GroupTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3003Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Button_3003,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.ButtonTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3004Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Label_3004,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.LabelTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCheckBox_3005Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.CheckBox_3005,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.CheckBoxTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTextInput_3006Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.TextInput_3006,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.TextInputTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDropDown_3007Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.DropDown_3007,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.DropDownTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMenu_3008Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Menu_3008,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.MenuTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImg_3009Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Img_3009,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.ImgTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIcon_3010Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Icon_3010,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.IconTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTable_3011Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Table_3011,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.TableTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComboBox_3012Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.ComboBox_3012,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.ComboBoxTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3013Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Button_3013,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.ButtonTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3014Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Label_3014,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.LabelTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCheckBox_3015Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.CheckBox_3015,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.CheckBoxTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTextInput_3016Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.TextInput_3016,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.TextInputTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDropDown_3017Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.DropDown_3017,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.DropDownTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMenu_3018Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Menu_3018,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.MenuTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImg_3019Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Img_3019,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.ImgTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIcon_3020Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Icon_3020,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.IconTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTable_3021Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Table_3021,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.TableTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComboBox_3022Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.ComboBox_3022,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.ComboBoxTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRadioButton_3023Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.RadioButton_3023,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.RadioButtonTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRadioButton_3024Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.RadioButton_3024,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.RadioButtonTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5045); //$NON-NLS-1$
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
		return ui_diagram.diagram.edit.parts.UI_DiagramEditPart.MODEL_ID
				.equals(ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getModelID(view));
	}

}
