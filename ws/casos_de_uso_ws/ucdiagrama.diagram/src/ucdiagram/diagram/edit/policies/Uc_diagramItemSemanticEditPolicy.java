/*
* 
*/
package ucdiagram.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import ucdiagram.diagram.edit.commands.ActorCreateCommand;
import ucdiagram.diagram.edit.commands.LimitBoxCreateCommand;
import ucdiagram.diagram.providers.UcdiagramElementTypes;

/**
 * @generated
 */
public class Uc_diagramItemSemanticEditPolicy extends UcdiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public Uc_diagramItemSemanticEditPolicy() {
		super(UcdiagramElementTypes.Uc_diagram_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UcdiagramElementTypes.Actor_2002 == req.getElementType()) {
			return getGEFWrapper(new ActorCreateCommand(req));
		}
		if (UcdiagramElementTypes.LimitBox_2004 == req.getElementType()) {
			return getGEFWrapper(new LimitBoxCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
