/*
* 
*/
package ucdiagram.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import ucdiagram.UcdiagramPackage;
import ucdiagram.diagram.edit.parts.ActorEditPart;
import ucdiagram.diagram.edit.parts.ActorNameEditPart;
import ucdiagram.diagram.edit.parts.ComRelationshipEditPart;
import ucdiagram.diagram.edit.parts.ExtendsRelationshipEditPart;
import ucdiagram.diagram.edit.parts.ExtendsRelationshipLabelNameEditPart;
import ucdiagram.diagram.edit.parts.IncludeRelationshipEditPart;
import ucdiagram.diagram.edit.parts.IncludeRelationshipLabelNameEditPart;
import ucdiagram.diagram.edit.parts.LimitBoxEditPart;
import ucdiagram.diagram.edit.parts.LimitBoxLimitBoxUseCasesCompartmentEditPart;
import ucdiagram.diagram.edit.parts.LimitBoxNameEditPart;
import ucdiagram.diagram.edit.parts.Uc_diagramEditPart;
import ucdiagram.diagram.edit.parts.UseCaseEditPart;
import ucdiagram.diagram.edit.parts.UseCaseNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class UcdiagramVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "ucdiagrama.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (Uc_diagramEditPart.MODEL_ID.equals(view.getType())) {
				return Uc_diagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return ucdiagram.diagram.part.UcdiagramVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				UcdiagramDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (UcdiagramPackage.eINSTANCE.getuc_diagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ucdiagram.uc_diagram) domainElement)) {
			return Uc_diagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = ucdiagram.diagram.part.UcdiagramVisualIDRegistry.getModelID(containerView);
		if (!Uc_diagramEditPart.MODEL_ID.equals(containerModelID) && !"ucdiagram".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (Uc_diagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ucdiagram.diagram.part.UcdiagramVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Uc_diagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case Uc_diagramEditPart.VISUAL_ID:
			if (UcdiagramPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
				return ActorEditPart.VISUAL_ID;
			}
			if (UcdiagramPackage.eINSTANCE.getLimitBox().isSuperTypeOf(domainElement.eClass())) {
				return LimitBoxEditPart.VISUAL_ID;
			}
			break;
		case LimitBoxLimitBoxUseCasesCompartmentEditPart.VISUAL_ID:
			if (UcdiagramPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
				return UseCaseEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = ucdiagram.diagram.part.UcdiagramVisualIDRegistry.getModelID(containerView);
		if (!Uc_diagramEditPart.MODEL_ID.equals(containerModelID) && !"ucdiagram".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (Uc_diagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ucdiagram.diagram.part.UcdiagramVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Uc_diagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case Uc_diagramEditPart.VISUAL_ID:
			if (ActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LimitBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActorEditPart.VISUAL_ID:
			if (ActorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LimitBoxEditPart.VISUAL_ID:
			if (LimitBoxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LimitBoxLimitBoxUseCasesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UseCaseEditPart.VISUAL_ID:
			if (UseCaseNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LimitBoxLimitBoxUseCasesCompartmentEditPart.VISUAL_ID:
			if (UseCaseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IncludeRelationshipEditPart.VISUAL_ID:
			if (IncludeRelationshipLabelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExtendsRelationshipEditPart.VISUAL_ID:
			if (ExtendsRelationshipLabelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (UcdiagramPackage.eINSTANCE.getcomRelationship().isSuperTypeOf(domainElement.eClass())) {
			return ComRelationshipEditPart.VISUAL_ID;
		}
		if (UcdiagramPackage.eINSTANCE.getincludeRelationship().isSuperTypeOf(domainElement.eClass())) {
			return IncludeRelationshipEditPart.VISUAL_ID;
		}
		if (UcdiagramPackage.eINSTANCE.getextendsRelationship().isSuperTypeOf(domainElement.eClass())) {
			return ExtendsRelationshipEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ucdiagram.uc_diagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case LimitBoxLimitBoxUseCasesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case Uc_diagramEditPart.VISUAL_ID:
			return false;
		case ActorEditPart.VISUAL_ID:
		case UseCaseEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return ucdiagram.diagram.part.UcdiagramVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return ucdiagram.diagram.part.UcdiagramVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return ucdiagram.diagram.part.UcdiagramVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return ucdiagram.diagram.part.UcdiagramVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return ucdiagram.diagram.part.UcdiagramVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return ucdiagram.diagram.part.UcdiagramVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
