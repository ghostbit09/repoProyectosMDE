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

			case ImgEditPart.VISUAL_ID:
				return new ImgEditPart(view);

			case ImgNameEditPart.VISUAL_ID:
				return new ImgNameEditPart(view);

			case TableEditPart.VISUAL_ID:
				return new TableEditPart(view);

			case TableNameEditPart.VISUAL_ID:
				return new TableNameEditPart(view);

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

			case Img2EditPart.VISUAL_ID:
				return new Img2EditPart(view);

			case ImgName2EditPart.VISUAL_ID:
				return new ImgName2EditPart(view);

			case Table2EditPart.VISUAL_ID:
				return new Table2EditPart(view);

			case TableName2EditPart.VISUAL_ID:
				return new TableName2EditPart(view);

			case TableRowEditPart.VISUAL_ID:
				return new TableRowEditPart(view);

			case TableRowNameEditPart.VISUAL_ID:
				return new TableRowNameEditPart(view);

			case ComboBoxEditPart.VISUAL_ID:
				return new ComboBoxEditPart(view);

			case ComboBoxNameEditPart.VISUAL_ID:
				return new ComboBoxNameEditPart(view);

			case RadioButtonEditPart.VISUAL_ID:
				return new RadioButtonEditPart(view);

			case RadioButtonNameEditPart.VISUAL_ID:
				return new RadioButtonNameEditPart(view);

			case FloatingButtonEditPart.VISUAL_ID:
				return new FloatingButtonEditPart(view);

			case FloatingButtonNameEditPart.VISUAL_ID:
				return new FloatingButtonNameEditPart(view);

			case UserInterface2EditPart.VISUAL_ID:
				return new UserInterface2EditPart(view);

			case UserInterfaceName2EditPart.VISUAL_ID:
				return new UserInterfaceName2EditPart(view);

			case TableRow2EditPart.VISUAL_ID:
				return new TableRow2EditPart(view);

			case TableRowName2EditPart.VISUAL_ID:
				return new TableRowName2EditPart(view);

			case ComboBox2EditPart.VISUAL_ID:
				return new ComboBox2EditPart(view);

			case ComboBoxName2EditPart.VISUAL_ID:
				return new ComboBoxName2EditPart(view);

			case RadioButton2EditPart.VISUAL_ID:
				return new RadioButton2EditPart(view);

			case RadioButtonName2EditPart.VISUAL_ID:
				return new RadioButtonName2EditPart(view);

			case FloatingButton2EditPart.VISUAL_ID:
				return new FloatingButton2EditPart(view);

			case FloatingButtonName2EditPart.VISUAL_ID:
				return new FloatingButtonName2EditPart(view);

			case UserInterface3EditPart.VISUAL_ID:
				return new UserInterface3EditPart(view);

			case UserInterfaceName3EditPart.VISUAL_ID:
				return new UserInterfaceName3EditPart(view);

			case UserInterfaceUserInterfaceListWidgetsCompartmentEditPart.VISUAL_ID:
				return new UserInterfaceUserInterfaceListWidgetsCompartmentEditPart(view);

			case TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID:
				return new TableTableLstChildModelElementsCompartmentEditPart(view);

			case TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID:
				return new TableTableLstChildModelElementsCompartment2EditPart(view);

			case TableRowTableRowLstChildModelElementsCompartmentEditPart.VISUAL_ID:
				return new TableRowTableRowLstChildModelElementsCompartmentEditPart(view);

			case UserInterfaceUserInterfaceListWidgetsCompartment2EditPart.VISUAL_ID:
				return new UserInterfaceUserInterfaceListWidgetsCompartment2EditPart(view);

			case TableRowTableRowLstChildModelElementsCompartment2EditPart.VISUAL_ID:
				return new TableRowTableRowLstChildModelElementsCompartment2EditPart(view);

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
