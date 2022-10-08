/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.ButtonCreateCommand;
import uidiagram.diagram.edit.commands.CheckBoxCreateCommand;
import uidiagram.diagram.edit.commands.ColumnCreateCommand;
import uidiagram.diagram.edit.commands.ComboBoxCreateCommand;
import uidiagram.diagram.edit.commands.DropDownCreateCommand;
import uidiagram.diagram.edit.commands.Group2CreateCommand;
import uidiagram.diagram.edit.commands.IconCreateCommand;
import uidiagram.diagram.edit.commands.ImgCreateCommand;
import uidiagram.diagram.edit.commands.LabelCreateCommand;
import uidiagram.diagram.edit.commands.MenuCreateCommand;
import uidiagram.diagram.edit.commands.RadioButtonCreateCommand;
import uidiagram.diagram.edit.commands.TableCreateCommand;
import uidiagram.diagram.edit.commands.TextInputCreateCommand;
import uidiagram.diagram.edit.commands.UserInterface2CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class GroupGroupLstChildModelElementsCompartmentItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GroupGroupLstChildModelElementsCompartmentItemSemanticEditPolicy() {
		super(UidiagramElementTypes.Group_3001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Group_3002 == req.getElementType()) {
			return getGEFWrapper(new Group2CreateCommand(req));
		}
		if (UidiagramElementTypes.Button_3003 == req.getElementType()) {
			return getGEFWrapper(new ButtonCreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3004 == req.getElementType()) {
			return getGEFWrapper(new LabelCreateCommand(req));
		}
		if (UidiagramElementTypes.CheckBox_3005 == req.getElementType()) {
			return getGEFWrapper(new CheckBoxCreateCommand(req));
		}
		if (UidiagramElementTypes.TextInput_3006 == req.getElementType()) {
			return getGEFWrapper(new TextInputCreateCommand(req));
		}
		if (UidiagramElementTypes.DropDown_3007 == req.getElementType()) {
			return getGEFWrapper(new DropDownCreateCommand(req));
		}
		if (UidiagramElementTypes.Menu_3008 == req.getElementType()) {
			return getGEFWrapper(new MenuCreateCommand(req));
		}
		if (UidiagramElementTypes.Img_3009 == req.getElementType()) {
			return getGEFWrapper(new ImgCreateCommand(req));
		}
		if (UidiagramElementTypes.Icon_3010 == req.getElementType()) {
			return getGEFWrapper(new IconCreateCommand(req));
		}
		if (UidiagramElementTypes.Table_3011 == req.getElementType()) {
			return getGEFWrapper(new TableCreateCommand(req));
		}
		if (UidiagramElementTypes.Column_3012 == req.getElementType()) {
			return getGEFWrapper(new ColumnCreateCommand(req));
		}
		if (UidiagramElementTypes.ComboBox_3013 == req.getElementType()) {
			return getGEFWrapper(new ComboBoxCreateCommand(req));
		}
		if (UidiagramElementTypes.RadioButton_3014 == req.getElementType()) {
			return getGEFWrapper(new RadioButtonCreateCommand(req));
		}
		if (UidiagramElementTypes.UserInterface_3015 == req.getElementType()) {
			return getGEFWrapper(new UserInterface2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
