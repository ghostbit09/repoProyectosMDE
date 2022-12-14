/*
 * 
 */
package ucdiagram.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import ucdiagram.UseCase;
import ucdiagram.diagram.edit.policies.UcdiagramBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ExtendsRelationshipReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public ExtendsRelationshipReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ucdiagram.extendsRelationship) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof UseCase && newEnd instanceof UseCase)) {
			return false;
		}
		UseCase target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof ucdiagram.uc_diagram)) {
			return false;
		}
		ucdiagram.uc_diagram container = (ucdiagram.uc_diagram) getLink().eContainer();
		return UcdiagramBaseItemSemanticEditPolicy.getLinkConstraints().canExistExtendsRelationship_4003(container,
				getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof UseCase && newEnd instanceof UseCase)) {
			return false;
		}
		UseCase source = getLink().getSource();
		if (!(getLink().eContainer() instanceof ucdiagram.uc_diagram)) {
			return false;
		}
		ucdiagram.uc_diagram container = (ucdiagram.uc_diagram) getLink().eContainer();
		return UcdiagramBaseItemSemanticEditPolicy.getLinkConstraints().canExistExtendsRelationship_4003(container,
				getLink(), source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected ucdiagram.extendsRelationship getLink() {
		return (ucdiagram.extendsRelationship) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected UseCase getOldSource() {
		return (UseCase) oldEnd;
	}

	/**
	* @generated
	*/
	protected UseCase getNewSource() {
		return (UseCase) newEnd;
	}

	/**
	* @generated
	*/
	protected UseCase getOldTarget() {
		return (UseCase) oldEnd;
	}

	/**
	* @generated
	*/
	protected UseCase getNewTarget() {
		return (UseCase) newEnd;
	}
}
