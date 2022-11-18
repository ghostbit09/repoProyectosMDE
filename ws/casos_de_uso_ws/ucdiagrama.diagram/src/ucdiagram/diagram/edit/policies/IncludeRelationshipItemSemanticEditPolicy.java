/*
* 
*/
package ucdiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import ucdiagram.diagram.providers.UcdiagramElementTypes;

/**
 * @generated
 */
public class IncludeRelationshipItemSemanticEditPolicy extends UcdiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public IncludeRelationshipItemSemanticEditPolicy() {
		super(UcdiagramElementTypes.IncludeRelationship_4002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
