/*
* 
*/
package ui_diagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class UserInterfaceUserInterfaceLstModelElementsCompartmentItemSemanticEditPolicy
		extends ui_diagram.diagram.edit.policies.Ui_diagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UserInterfaceUserInterfaceLstModelElementsCompartmentItemSemanticEditPolicy() {
		super(ui_diagram.diagram.providers.Ui_diagramElementTypes.UserInterface_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.Group_3001 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.GroupCreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.Button_3013 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.Button2CreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.Label_3014 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.Label2CreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.CheckBox_3015 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.CheckBox2CreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.TextInput_3016 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.TextInput2CreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.DropDown_3017 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.DropDown2CreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.Menu_3018 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.Menu2CreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.Img_3019 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.Img2CreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.Icon_3020 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.Icon2CreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.Table_3021 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.Table2CreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.ComboBox_3022 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.ComboBox2CreateCommand(req));
		}
		if (ui_diagram.diagram.providers.Ui_diagramElementTypes.RadioButton_3024 == req.getElementType()) {
			return getGEFWrapper(new ui_diagram.diagram.edit.commands.RadioButton2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
