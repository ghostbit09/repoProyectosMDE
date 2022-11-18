/*
 * 
 */
package ucdiagram.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import ucdiagram.diagram.part.UcdiagramVisualIDRegistry;

/**
 * @generated
 */
public class UcdiagramEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (UcdiagramVisualIDRegistry.getVisualID(view)) {

			case Uc_diagramEditPart.VISUAL_ID:
				return new Uc_diagramEditPart(view);

			case ActorEditPart.VISUAL_ID:
				return new ActorEditPart(view);

			case ActorNameEditPart.VISUAL_ID:
				return new ActorNameEditPart(view);

			case LimitBoxEditPart.VISUAL_ID:
				return new LimitBoxEditPart(view);

			case LimitBoxNameEditPart.VISUAL_ID:
				return new LimitBoxNameEditPart(view);

			case UseCaseEditPart.VISUAL_ID:
				return new UseCaseEditPart(view);

			case UseCaseNameEditPart.VISUAL_ID:
				return new UseCaseNameEditPart(view);

			case LimitBoxLimitBoxUseCasesCompartmentEditPart.VISUAL_ID:
				return new LimitBoxLimitBoxUseCasesCompartmentEditPart(view);

			case ComRelationshipEditPart.VISUAL_ID:
				return new ComRelationshipEditPart(view);

			case IncludeRelationshipEditPart.VISUAL_ID:
				return new IncludeRelationshipEditPart(view);

			case IncludeRelationshipLabelNameEditPart.VISUAL_ID:
				return new IncludeRelationshipLabelNameEditPart(view);

			case ExtendsRelationshipEditPart.VISUAL_ID:
				return new ExtendsRelationshipEditPart(view);

			case ExtendsRelationshipLabelNameEditPart.VISUAL_ID:
				return new ExtendsRelationshipLabelNameEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
