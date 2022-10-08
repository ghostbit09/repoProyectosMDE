/*
 * 
 */
package uidiagram.diagram.edit.parts;

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

import uidiagram.diagram.edit.policies.TableTableLstChildModelElementsCompartmentCanonicalEditPolicy;
import uidiagram.diagram.edit.policies.TableTableLstChildModelElementsCompartmentItemSemanticEditPolicy;
import uidiagram.diagram.part.Messages;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class TableTableLstChildModelElementsCompartmentEditPart extends ShapeCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7004;

	/**
	* @generated
	*/
	public TableTableLstChildModelElementsCompartmentEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.TableTableLstChildModelElementsCompartmentEditPart_title;
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
				new TableTableLstChildModelElementsCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(UidiagramVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new TableTableLstChildModelElementsCompartmentCanonicalEditPolicy());
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
			if (type == UidiagramElementTypes.Group_3002) {
				return this;
			}
			if (type == UidiagramElementTypes.Button_3003) {
				return this;
			}
			if (type == UidiagramElementTypes.Label_3004) {
				return this;
			}
			if (type == UidiagramElementTypes.CheckBox_3005) {
				return this;
			}
			if (type == UidiagramElementTypes.TextInput_3006) {
				return this;
			}
			if (type == UidiagramElementTypes.DropDown_3007) {
				return this;
			}
			if (type == UidiagramElementTypes.Menu_3008) {
				return this;
			}
			if (type == UidiagramElementTypes.Img_3009) {
				return this;
			}
			if (type == UidiagramElementTypes.Icon_3010) {
				return this;
			}
			if (type == UidiagramElementTypes.Table_3011) {
				return this;
			}
			if (type == UidiagramElementTypes.Column_3012) {
				return this;
			}
			if (type == UidiagramElementTypes.ComboBox_3013) {
				return this;
			}
			if (type == UidiagramElementTypes.RadioButton_3014) {
				return this;
			}
			if (type == UidiagramElementTypes.UserInterface_3015) {
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
