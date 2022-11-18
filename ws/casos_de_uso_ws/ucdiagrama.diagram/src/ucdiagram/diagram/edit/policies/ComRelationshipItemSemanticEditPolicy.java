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
public class ComRelationshipItemSemanticEditPolicy extends UcdiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ComRelationshipItemSemanticEditPolicy() {
		super(UcdiagramElementTypes.ComRelationship_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
