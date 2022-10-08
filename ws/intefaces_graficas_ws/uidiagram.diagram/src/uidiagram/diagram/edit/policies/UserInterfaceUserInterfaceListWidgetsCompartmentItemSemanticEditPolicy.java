/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.Button2CreateCommand;
import uidiagram.diagram.edit.commands.CheckBox2CreateCommand;
import uidiagram.diagram.edit.commands.Column2CreateCommand;
import uidiagram.diagram.edit.commands.ComboBox2CreateCommand;
import uidiagram.diagram.edit.commands.DropDown2CreateCommand;
import uidiagram.diagram.edit.commands.GroupCreateCommand;
import uidiagram.diagram.edit.commands.Icon2CreateCommand;
import uidiagram.diagram.edit.commands.Img2CreateCommand;
import uidiagram.diagram.edit.commands.Label2CreateCommand;
import uidiagram.diagram.edit.commands.Menu2CreateCommand;
import uidiagram.diagram.edit.commands.RadioButton2CreateCommand;
import uidiagram.diagram.edit.commands.Table2CreateCommand;
import uidiagram.diagram.edit.commands.TextInput2CreateCommand;
import uidiagram.diagram.edit.commands.UserInterface3CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class UserInterfaceUserInterfaceListWidgetsCompartmentItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UserInterfaceUserInterfaceListWidgetsCompartmentItemSemanticEditPolicy() {
		super(UidiagramElementTypes.UserInterface_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Group_3001 == req.getElementType()) {
			return getGEFWrapper(new GroupCreateCommand(req));
		}
		if (UidiagramElementTypes.Button_3016 == req.getElementType()) {
			return getGEFWrapper(new Button2CreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3017 == req.getElementType()) {
			return getGEFWrapper(new Label2CreateCommand(req));
		}
		if (UidiagramElementTypes.CheckBox_3018 == req.getElementType()) {
			return getGEFWrapper(new CheckBox2CreateCommand(req));
		}
		if (UidiagramElementTypes.TextInput_3019 == req.getElementType()) {
			return getGEFWrapper(new TextInput2CreateCommand(req));
		}
		if (UidiagramElementTypes.DropDown_3020 == req.getElementType()) {
			return getGEFWrapper(new DropDown2CreateCommand(req));
		}
		if (UidiagramElementTypes.Menu_3021 == req.getElementType()) {
			return getGEFWrapper(new Menu2CreateCommand(req));
		}
		if (UidiagramElementTypes.Img_3022 == req.getElementType()) {
			return getGEFWrapper(new Img2CreateCommand(req));
		}
		if (UidiagramElementTypes.Icon_3023 == req.getElementType()) {
			return getGEFWrapper(new Icon2CreateCommand(req));
		}
		if (UidiagramElementTypes.Table_3024 == req.getElementType()) {
			return getGEFWrapper(new Table2CreateCommand(req));
		}
		if (UidiagramElementTypes.Column_3025 == req.getElementType()) {
			return getGEFWrapper(new Column2CreateCommand(req));
		}
		if (UidiagramElementTypes.ComboBox_3026 == req.getElementType()) {
			return getGEFWrapper(new ComboBox2CreateCommand(req));
		}
		if (UidiagramElementTypes.RadioButton_3027 == req.getElementType()) {
			return getGEFWrapper(new RadioButton2CreateCommand(req));
		}
		if (UidiagramElementTypes.UserInterface_3028 == req.getElementType()) {
			return getGEFWrapper(new UserInterface3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
