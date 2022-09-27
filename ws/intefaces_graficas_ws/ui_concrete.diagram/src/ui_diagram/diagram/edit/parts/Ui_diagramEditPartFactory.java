/*
 * 
 */
package ui_diagram.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class Ui_diagramEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getVisualID(view)) {

			case ui_diagram.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.UI_DiagramEditPart(view);

			case ui_diagram.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.UserInterfaceEditPart(view);

			case ui_diagram.diagram.edit.parts.UserInterfaceTitleEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.UserInterfaceTitleEditPart(view);

			case ui_diagram.diagram.edit.parts.GroupEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.GroupEditPart(view);

			case ui_diagram.diagram.edit.parts.GroupTitleEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.GroupTitleEditPart(view);

			case ui_diagram.diagram.edit.parts.Group2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.Group2EditPart(view);

			case ui_diagram.diagram.edit.parts.GroupTitle2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.GroupTitle2EditPart(view);

			case ui_diagram.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.ButtonEditPart(view);

			case ui_diagram.diagram.edit.parts.ButtonTitleEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.ButtonTitleEditPart(view);

			case ui_diagram.diagram.edit.parts.LabelEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.LabelEditPart(view);

			case ui_diagram.diagram.edit.parts.LabelTitleEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.LabelTitleEditPart(view);

			case ui_diagram.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.CheckBoxEditPart(view);

			case ui_diagram.diagram.edit.parts.CheckBoxTitleEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.CheckBoxTitleEditPart(view);

			case ui_diagram.diagram.edit.parts.TextInputEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.TextInputEditPart(view);

			case ui_diagram.diagram.edit.parts.TextInputTitleEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.TextInputTitleEditPart(view);

			case ui_diagram.diagram.edit.parts.DropDownEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.DropDownEditPart(view);

			case ui_diagram.diagram.edit.parts.DropDownTitleEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.DropDownTitleEditPart(view);

			case ui_diagram.diagram.edit.parts.MenuEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.MenuEditPart(view);

			case ui_diagram.diagram.edit.parts.MenuTitleEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.MenuTitleEditPart(view);

			case ui_diagram.diagram.edit.parts.ImgEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.ImgEditPart(view);

			case ui_diagram.diagram.edit.parts.ImgTitleEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.ImgTitleEditPart(view);

			case ui_diagram.diagram.edit.parts.IconEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.IconEditPart(view);

			case ui_diagram.diagram.edit.parts.IconTitleEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.IconTitleEditPart(view);

			case ui_diagram.diagram.edit.parts.TableEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.TableEditPart(view);

			case ui_diagram.diagram.edit.parts.TableTitleEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.TableTitleEditPart(view);

			case ui_diagram.diagram.edit.parts.ComboBoxEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.ComboBoxEditPart(view);

			case ui_diagram.diagram.edit.parts.ComboBoxTitleEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.ComboBoxTitleEditPart(view);

			case ui_diagram.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.RadioButtonEditPart(view);

			case ui_diagram.diagram.edit.parts.RadioButtonTitleEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.RadioButtonTitleEditPart(view);

			case ui_diagram.diagram.edit.parts.Button2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.Button2EditPart(view);

			case ui_diagram.diagram.edit.parts.ButtonTitle2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.ButtonTitle2EditPart(view);

			case ui_diagram.diagram.edit.parts.Label2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.Label2EditPart(view);

			case ui_diagram.diagram.edit.parts.LabelTitle2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.LabelTitle2EditPart(view);

			case ui_diagram.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.CheckBox2EditPart(view);

			case ui_diagram.diagram.edit.parts.CheckBoxTitle2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.CheckBoxTitle2EditPart(view);

			case ui_diagram.diagram.edit.parts.TextInput2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.TextInput2EditPart(view);

			case ui_diagram.diagram.edit.parts.TextInputTitle2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.TextInputTitle2EditPart(view);

			case ui_diagram.diagram.edit.parts.DropDown2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.DropDown2EditPart(view);

			case ui_diagram.diagram.edit.parts.DropDownTitle2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.DropDownTitle2EditPart(view);

			case ui_diagram.diagram.edit.parts.Menu2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.Menu2EditPart(view);

			case ui_diagram.diagram.edit.parts.MenuTitle2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.MenuTitle2EditPart(view);

			case ui_diagram.diagram.edit.parts.Img2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.Img2EditPart(view);

			case ui_diagram.diagram.edit.parts.ImgTitle2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.ImgTitle2EditPart(view);

			case ui_diagram.diagram.edit.parts.Icon2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.Icon2EditPart(view);

			case ui_diagram.diagram.edit.parts.IconTitle2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.IconTitle2EditPart(view);

			case ui_diagram.diagram.edit.parts.Table2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.Table2EditPart(view);

			case ui_diagram.diagram.edit.parts.TableTitle2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.TableTitle2EditPart(view);

			case ui_diagram.diagram.edit.parts.ComboBox2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.ComboBox2EditPart(view);

			case ui_diagram.diagram.edit.parts.ComboBoxTitle2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.ComboBoxTitle2EditPart(view);

			case ui_diagram.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.RadioButton2EditPart(view);

			case ui_diagram.diagram.edit.parts.RadioButtonTitle2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.RadioButtonTitle2EditPart(view);

			case ui_diagram.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart(
						view);

			case ui_diagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartmentEditPart(view);

			case ui_diagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartment2EditPart(view);
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
