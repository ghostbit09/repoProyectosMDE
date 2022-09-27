/*
 * 
 */
package ui_diagram.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

/**
 * @generated
 */
public class UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart extends ShapeCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7001;

	/**
	* @generated
	*/
	public UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return ui_diagram.diagram.part.Messages.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart_title;
	}

	/**
	* @generated
	*/
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ui_diagram.diagram.edit.policies.UserInterfaceUserInterfaceLstModelElementsCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(
				ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new ui_diagram.diagram.edit.policies.UserInterfaceUserInterfaceLstModelElementsCompartmentCanonicalEditPolicy());
	}

	/**
	* @generated
	*/
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == ui_diagram.diagram.providers.Ui_diagramElementTypes.Group_3001) {
				return this;
			}
			if (type == ui_diagram.diagram.providers.Ui_diagramElementTypes.Button_3013) {
				return this;
			}
			if (type == ui_diagram.diagram.providers.Ui_diagramElementTypes.Label_3014) {
				return this;
			}
			if (type == ui_diagram.diagram.providers.Ui_diagramElementTypes.CheckBox_3015) {
				return this;
			}
			if (type == ui_diagram.diagram.providers.Ui_diagramElementTypes.TextInput_3016) {
				return this;
			}
			if (type == ui_diagram.diagram.providers.Ui_diagramElementTypes.DropDown_3017) {
				return this;
			}
			if (type == ui_diagram.diagram.providers.Ui_diagramElementTypes.Menu_3018) {
				return this;
			}
			if (type == ui_diagram.diagram.providers.Ui_diagramElementTypes.Img_3019) {
				return this;
			}
			if (type == ui_diagram.diagram.providers.Ui_diagramElementTypes.Icon_3020) {
				return this;
			}
			if (type == ui_diagram.diagram.providers.Ui_diagramElementTypes.Table_3021) {
				return this;
			}
			if (type == ui_diagram.diagram.providers.Ui_diagramElementTypes.ComboBox_3022) {
				return this;
			}
			if (type == ui_diagram.diagram.providers.Ui_diagramElementTypes.RadioButton_3024) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
