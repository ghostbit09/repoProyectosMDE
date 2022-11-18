/*
* 
*/
package ucdiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ucdiagram.diagram.edit.commands.UseCaseCreateCommand;
import ucdiagram.diagram.providers.UcdiagramElementTypes;

/**
 * @generated
 */
public class LimitBoxLimitBoxUseCasesCompartmentItemSemanticEditPolicy extends UcdiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public LimitBoxLimitBoxUseCasesCompartmentItemSemanticEditPolicy() {
		super(UcdiagramElementTypes.LimitBox_2004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UcdiagramElementTypes.UseCase_3001 == req.getElementType()) {
			return getGEFWrapper(new UseCaseCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
