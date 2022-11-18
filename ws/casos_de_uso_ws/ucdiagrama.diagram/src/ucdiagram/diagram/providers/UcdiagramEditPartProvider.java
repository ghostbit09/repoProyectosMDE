/*
 * 
 */
package ucdiagram.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import ucdiagram.diagram.edit.parts.Uc_diagramEditPart;
import ucdiagram.diagram.edit.parts.UcdiagramEditPartFactory;
import ucdiagram.diagram.part.UcdiagramVisualIDRegistry;

/**
 * @generated
 */
public class UcdiagramEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public UcdiagramEditPartProvider() {
		super(new UcdiagramEditPartFactory(), UcdiagramVisualIDRegistry.TYPED_INSTANCE, Uc_diagramEditPart.MODEL_ID);
	}

}
