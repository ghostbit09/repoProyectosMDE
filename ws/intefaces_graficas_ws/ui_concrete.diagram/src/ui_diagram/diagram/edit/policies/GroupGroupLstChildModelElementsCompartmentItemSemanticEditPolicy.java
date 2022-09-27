/*
* 
*/
package ui_diagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class GroupGroupLstChildModelElementsCompartmentItemSemanticEditPolicy
		extends ui_diagram.diagram.edit.policies.Ui_diagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GroupGroupLstChildModelElementsCompartmentItemSemanticEditPolicy() {
		super(ui_diagram.diagram.providers.Ui_diagramElementTypes.Group_3001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.Group_3002 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.Group2CreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.Button_3003 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.ButtonCreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.Label_3004 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.LabelCreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.CheckBox_3005 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.CheckBoxCreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.TextInput_3006 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.TextInputCreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.DropDown_3007 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.DropDownCreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.Menu_3008 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.MenuCreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.Img_3009 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.ImgCreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.Icon_3010 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.IconCreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.Table_3011 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.TableCreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.ComboBox_3012 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.ComboBoxCreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.RadioButton_3023 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.RadioButtonCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
