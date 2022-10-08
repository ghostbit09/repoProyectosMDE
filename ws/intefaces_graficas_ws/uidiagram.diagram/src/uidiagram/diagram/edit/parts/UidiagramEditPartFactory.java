/*
 * 
 */
package uidiagram.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import uidiagram.diagram.part.UidiagramVisualIDRegistry;

/**
 * @generated
 */
public class UidiagramEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (UidiagramVisualIDRegistry.getVisualID(view)) {

			case Ui_DiagramEditPart.VISUAL_ID:
				return new Ui_DiagramEditPart(view);

			case UserInterfaceEditPart.VISUAL_ID:
				return new UserInterfaceEditPart(view);

			case UserInterfaceNameEditPart.VISUAL_ID:
				return new UserInterfaceNameEditPart(view);

			case GroupEditPart.VISUAL_ID:
				return new GroupEditPart(view);

			case GroupNameEditPart.VISUAL_ID:
				return new GroupNameEditPart(view);

			case Group2EditPart.VISUAL_ID:
				return new Group2EditPart(view);

			case GroupName2EditPart.VISUAL_ID:
				return new GroupName2EditPart(view);

			case ButtonEditPart.VISUAL_ID:
				return new ButtonEditPart(view);

			case ButtonNameEditPart.VISUAL_ID:
				return new ButtonNameEditPart(view);

			case LabelEditPart.VISUAL_ID:
				return new LabelEditPart(view);

			case LabelNameEditPart.VISUAL_ID:
				return new LabelNameEditPart(view);

			case CheckBoxEditPart.VISUAL_ID:
				return new CheckBoxEditPart(view);

			case CheckBoxNameEditPart.VISUAL_ID:
				return new CheckBoxNameEditPart(view);

			case TextInputEditPart.VISUAL_ID:
				return new TextInputEditPart(view);

			case TextInputNameEditPart.VISUAL_ID:
				return new TextInputNameEditPart(view);

			case DropDownEditPart.VISUAL_ID:
				return new DropDownEditPart(view);

			case DropDownNameEditPart.VISUAL_ID:
				return new DropDownNameEditPart(view);

			case MenuEditPart.VISUAL_ID:
				return new MenuEditPart(view);

			case MenuNameEditPart.VISUAL_ID:
				return new MenuNameEditPart(view);

			case ImgEditPart.VISUAL_ID:
				return new ImgEditPart(view);

			case ImgNameEditPart.VISUAL_ID:
				return new ImgNameEditPart(view);

			case IconEditPart.VISUAL_ID:
				return new IconEditPart(view);

			case IconNameEditPart.VISUAL_ID:
				return new IconNameEditPart(view);

			case TableEditPart.VISUAL_ID:
				return new TableEditPart(view);

			case TableNameEditPart.VISUAL_ID:
				return new TableNameEditPart(view);

			case ColumnEditPart.VISUAL_ID:
				return new ColumnEditPart(view);

			case ColumnNameEditPart.VISUAL_ID:
				return new ColumnNameEditPart(view);

			case ComboBoxEditPart.VISUAL_ID:
				return new ComboBoxEditPart(view);

			case ComboBoxNameEditPart.VISUAL_ID:
				return new ComboBoxNameEditPart(view);

			case RadioButtonEditPart.VISUAL_ID:
				return new RadioButtonEditPart(view);

			case RadioButtonNameEditPart.VISUAL_ID:
				return new RadioButtonNameEditPart(view);

			case UserInterface2EditPart.VISUAL_ID:
				return new UserInterface2EditPart(view);

			case UserInterfaceName2EditPart.VISUAL_ID:
				return new UserInterfaceName2EditPart(view);

			case Button2EditPart.VISUAL_ID:
				return new Button2EditPart(view);

			case ButtonName2EditPart.VISUAL_ID:
				return new ButtonName2EditPart(view);

			case Label2EditPart.VISUAL_ID:
				return new Label2EditPart(view);

			case LabelName2EditPart.VISUAL_ID:
				return new LabelName2EditPart(view);

			case CheckBox2EditPart.VISUAL_ID:
				return new CheckBox2EditPart(view);

			case CheckBoxName2EditPart.VISUAL_ID:
				return new CheckBoxName2EditPart(view);

			case TextInput2EditPart.VISUAL_ID:
				return new TextInput2EditPart(view);

			case TextInputName2EditPart.VISUAL_ID:
				return new TextInputName2EditPart(view);

			case DropDown2EditPart.VISUAL_ID:
				return new DropDown2EditPart(view);

			case DropDownName2EditPart.VISUAL_ID:
				return new DropDownName2EditPart(view);

			case Menu2EditPart.VISUAL_ID:
				return new Menu2EditPart(view);

			case MenuName2EditPart.VISUAL_ID:
				return new MenuName2EditPart(view);

			case Img2EditPart.VISUAL_ID:
				return new Img2EditPart(view);

			case ImgName2EditPart.VISUAL_ID:
				return new ImgName2EditPart(view);

			case Icon2EditPart.VISUAL_ID:
				return new Icon2EditPart(view);

			case IconName2EditPart.VISUAL_ID:
				return new IconName2EditPart(view);

			case Table2EditPart.VISUAL_ID:
				return new Table2EditPart(view);

			case TableName2EditPart.VISUAL_ID:
				return new TableName2EditPart(view);

			case Column2EditPart.VISUAL_ID:
				return new Column2EditPart(view);

			case ColumnName2EditPart.VISUAL_ID:
				return new ColumnName2EditPart(view);

			case ComboBox2EditPart.VISUAL_ID:
				return new ComboBox2EditPart(view);

			case ComboBoxName2EditPart.VISUAL_ID:
				return new ComboBoxName2EditPart(view);

			case RadioButton2EditPart.VISUAL_ID:
				return new RadioButton2EditPart(view);

			case RadioButtonName2EditPart.VISUAL_ID:
				return new RadioButtonName2EditPart(view);

			case UserInterface3EditPart.VISUAL_ID:
				return new UserInterface3EditPart(view);

			case UserInterfaceName3EditPart.VISUAL_ID:
				return new UserInterfaceName3EditPart(view);

			case UserInterfaceUserInterfaceListWidgetsCompartmentEditPart.VISUAL_ID:
				return new UserInterfaceUserInterfaceListWidgetsCompartmentEditPart(view);

			case GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID:
				return new GroupGroupLstChildModelElementsCompartmentEditPart(view);

			case GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID:
				return new GroupGroupLstChildModelElementsCompartment2EditPart(view);

			case TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID:
				return new TableTableLstChildModelElementsCompartmentEditPart(view);

			case UserInterfaceUserInterfaceListWidgetsCompartment2EditPart.VISUAL_ID:
				return new UserInterfaceUserInterfaceListWidgetsCompartment2EditPart(view);

			case TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID:
				return new TableTableLstChildModelElementsCompartment2EditPart(view);

			case UserInterfaceUserInterfaceListWidgetsCompartment3EditPart.VISUAL_ID:
				return new UserInterfaceUserInterfaceListWidgetsCompartment3EditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
