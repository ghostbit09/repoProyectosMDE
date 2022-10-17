/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.ButtonCreateCommand;
import uidiagram.diagram.edit.commands.CheckBoxCreateCommand;
import uidiagram.diagram.edit.commands.ComboBox2CreateCommand;
import uidiagram.diagram.edit.commands.FloatingButton2CreateCommand;
import uidiagram.diagram.edit.commands.ImgCreateCommand;
import uidiagram.diagram.edit.commands.LabelCreateCommand;
import uidiagram.diagram.edit.commands.RadioButton2CreateCommand;
import uidiagram.diagram.edit.commands.TableCreateCommand;
import uidiagram.diagram.edit.commands.TableRow2CreateCommand;
import uidiagram.diagram.edit.commands.TextInputCreateCommand;
import uidiagram.diagram.edit.commands.UserInterface3CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class UserInterfaceUserInterfaceListWidgetsCompartment3ItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UserInterfaceUserInterfaceListWidgetsCompartment3ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.UserInterface_3028);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Button_3016 == req.getElementType()) {
			return getGEFWrapper(new ButtonCreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3017 == req.getElementType()) {
			return getGEFWrapper(new LabelCreateCommand(req));
		}
		if (UidiagramElementTypes.CheckBox_3018 == req.getElementType()) {
			return getGEFWrapper(new CheckBoxCreateCommand(req));
		}
		if (UidiagramElementTypes.TextInput_3019 == req.getElementType()) {
			return getGEFWrapper(new TextInputCreateCommand(req));
		}
		if (UidiagramElementTypes.Img_3022 == req.getElementType()) {
			return getGEFWrapper(new ImgCreateCommand(req));
		}
		if (UidiagramElementTypes.Table_3024 == req.getElementType()) {
			return getGEFWrapper(new TableCreateCommand(req));
		}
		if (UidiagramElementTypes.TableRow_3032 == req.getElementType()) {
			return getGEFWrapper(new TableRow2CreateCommand(req));
		}
		if (UidiagramElementTypes.ComboBox_3026 == req.getElementType()) {
			return getGEFWrapper(new ComboBox2CreateCommand(req));
		}
		if (UidiagramElementTypes.RadioButton_3027 == req.getElementType()) {
			return getGEFWrapper(new RadioButton2CreateCommand(req));
		}
		if (UidiagramElementTypes.FloatingButton_3034 == req.getElementType()) {
			return getGEFWrapper(new FloatingButton2CreateCommand(req));
		}
		if (UidiagramElementTypes.UserInterface_3028 == req.getElementType()) {
			return getGEFWrapper(new UserInterface3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
