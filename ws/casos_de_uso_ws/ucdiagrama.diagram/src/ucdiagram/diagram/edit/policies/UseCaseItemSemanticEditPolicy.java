/*
* 
*/
package ucdiagram.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import ucdiagram.diagram.edit.commands.ComRelationshipCreateCommand;
import ucdiagram.diagram.edit.commands.ComRelationshipReorientCommand;
import ucdiagram.diagram.edit.commands.ExtendsRelationshipCreateCommand;
import ucdiagram.diagram.edit.commands.ExtendsRelationshipReorientCommand;
import ucdiagram.diagram.edit.commands.IncludeRelationshipCreateCommand;
import ucdiagram.diagram.edit.commands.IncludeRelationshipReorientCommand;
import ucdiagram.diagram.edit.parts.ComRelationshipEditPart;
import ucdiagram.diagram.edit.parts.ExtendsRelationshipEditPart;
import ucdiagram.diagram.edit.parts.IncludeRelationshipEditPart;
import ucdiagram.diagram.part.UcdiagramVisualIDRegistry;
import ucdiagram.diagram.providers.UcdiagramElementTypes;

/**
 * @generated
 */
public class UseCaseItemSemanticEditPolicy extends UcdiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UseCaseItemSemanticEditPolicy() {
		super(UcdiagramElementTypes.UseCase_3001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (UcdiagramVisualIDRegistry.getVisualID(incomingLink) == ComRelationshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (UcdiagramVisualIDRegistry.getVisualID(incomingLink) == IncludeRelationshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (UcdiagramVisualIDRegistry.getVisualID(incomingLink) == ExtendsRelationshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (UcdiagramVisualIDRegistry.getVisualID(outgoingLink) == IncludeRelationshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (UcdiagramVisualIDRegistry.getVisualID(outgoingLink) == ExtendsRelationshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UcdiagramElementTypes.ComRelationship_4001 == req.getElementType()) {
			return null;
		}
		if (UcdiagramElementTypes.IncludeRelationship_4002 == req.getElementType()) {
			return getGEFWrapper(new IncludeRelationshipCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UcdiagramElementTypes.ExtendsRelationship_4003 == req.getElementType()) {
			return getGEFWrapper(new ExtendsRelationshipCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UcdiagramElementTypes.ComRelationship_4001 == req.getElementType()) {
			return getGEFWrapper(new ComRelationshipCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UcdiagramElementTypes.IncludeRelationship_4002 == req.getElementType()) {
			return getGEFWrapper(new IncludeRelationshipCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UcdiagramElementTypes.ExtendsRelationship_4003 == req.getElementType()) {
			return getGEFWrapper(new ExtendsRelationshipCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ComRelationshipEditPart.VISUAL_ID:
			return getGEFWrapper(new ComRelationshipReorientCommand(req));
		case IncludeRelationshipEditPart.VISUAL_ID:
			return getGEFWrapper(new IncludeRelationshipReorientCommand(req));
		case ExtendsRelationshipEditPart.VISUAL_ID:
			return getGEFWrapper(new ExtendsRelationshipReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
