/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.Button2CreateCommand;
import uidiagram.diagram.edit.commands.CheckBox2CreateCommand;
import uidiagram.diagram.edit.commands.ComboBoxCreateCommand;
import uidiagram.diagram.edit.commands.FloatingButtonCreateCommand;
import uidiagram.diagram.edit.commands.Img2CreateCommand;
import uidiagram.diagram.edit.commands.Label2CreateCommand;
import uidiagram.diagram.edit.commands.RadioButtonCreateCommand;
import uidiagram.diagram.edit.commands.Table2CreateCommand;
import uidiagram.diagram.edit.commands.TableRowCreateCommand;
import uidiagram.diagram.edit.commands.TextInput2CreateCommand;
import uidiagram.diagram.edit.commands.UserInterface2CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class TableRowTableRowLstChildModelElementsCompartmentItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TableRowTableRowLstChildModelElementsCompartmentItemSemanticEditPolicy() {
		super(UidiagramElementTypes.TableRow_3029);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Button_3003 == req.getElementType()) {
			return getGEFWrapper(new Button2CreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3004 == req.getElementType()) {
			return getGEFWrapper(new Label2CreateCommand(req));
		}
		if (UidiagramElementTypes.CheckBox_3005 == req.getElementType()) {
			return getGEFWrapper(new CheckBox2CreateCommand(req));
		}
		if (UidiagramElementTypes.TextInput_3006 == req.getElementType()) {
			return getGEFWrapper(new TextInput2CreateCommand(req));
		}
		if (UidiagramElementTypes.Img_3009 == req.getElementType()) {
			return getGEFWrapper(new Img2CreateCommand(req));
		}
		if (UidiagramElementTypes.Table_3011 == req.getElementType()) {
			return getGEFWrapper(new Table2CreateCommand(req));
		}
		if (UidiagramElementTypes.TableRow_3029 == req.getElementType()) {
			return getGEFWrapper(new TableRowCreateCommand(req));
		}
		if (UidiagramElementTypes.ComboBox_3013 == req.getElementType()) {
			return getGEFWrapper(new ComboBoxCreateCommand(req));
		}
		if (UidiagramElementTypes.RadioButton_3014 == req.getElementType()) {
			return getGEFWrapper(new RadioButtonCreateCommand(req));
		}
		if (UidiagramElementTypes.FloatingButton_3031 == req.getElementType()) {
			return getGEFWrapper(new FloatingButtonCreateCommand(req));
		}
		if (UidiagramElementTypes.UserInterface_3015 == req.getElementType()) {
			return getGEFWrapper(new UserInterface2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
