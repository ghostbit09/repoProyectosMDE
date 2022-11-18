/*
* 
*/
package ucdiagram.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import ucdiagram.Actor;
import ucdiagram.LimitBox;
import ucdiagram.UcdiagramPackage;
import ucdiagram.UseCase;
import ucdiagram.diagram.edit.parts.ActorEditPart;
import ucdiagram.diagram.edit.parts.ComRelationshipEditPart;
import ucdiagram.diagram.edit.parts.ExtendsRelationshipEditPart;
import ucdiagram.diagram.edit.parts.IncludeRelationshipEditPart;
import ucdiagram.diagram.edit.parts.LimitBoxEditPart;
import ucdiagram.diagram.edit.parts.LimitBoxLimitBoxUseCasesCompartmentEditPart;
import ucdiagram.diagram.edit.parts.Uc_diagramEditPart;
import ucdiagram.diagram.edit.parts.UseCaseEditPart;
import ucdiagram.diagram.providers.UcdiagramElementTypes;

/**
 * @generated
 */
public class UcdiagramDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<UcdiagramNodeDescriptor> getSemanticChildren(View view) {
		switch (UcdiagramVisualIDRegistry.getVisualID(view)) {
		case Uc_diagramEditPart.VISUAL_ID:
			return getUc_diagram_1000SemanticChildren(view);
		case LimitBoxLimitBoxUseCasesCompartmentEditPart.VISUAL_ID:
			return getLimitBoxLimitBoxUseCasesCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UcdiagramNodeDescriptor> getUc_diagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ucdiagram.uc_diagram modelElement = (ucdiagram.uc_diagram) view.getElement();
		LinkedList<UcdiagramNodeDescriptor> result = new LinkedList<UcdiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListActors().iterator(); it.hasNext();) {
			Actor childElement = (Actor) it.next();
			int visualID = UcdiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ActorEditPart.VISUAL_ID) {
				result.add(new UcdiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getListBoxes().iterator(); it.hasNext();) {
			LimitBox childElement = (LimitBox) it.next();
			int visualID = UcdiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LimitBoxEditPart.VISUAL_ID) {
				result.add(new UcdiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UcdiagramNodeDescriptor> getLimitBoxLimitBoxUseCasesCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LimitBox modelElement = (LimitBox) containerView.getElement();
		LinkedList<UcdiagramNodeDescriptor> result = new LinkedList<UcdiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUseCases().iterator(); it.hasNext();) {
			UseCase childElement = (UseCase) it.next();
			int visualID = UcdiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UseCaseEditPart.VISUAL_ID) {
				result.add(new UcdiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UcdiagramLinkDescriptor> getContainedLinks(View view) {
		switch (UcdiagramVisualIDRegistry.getVisualID(view)) {
		case Uc_diagramEditPart.VISUAL_ID:
			return getUc_diagram_1000ContainedLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2002ContainedLinks(view);
		case LimitBoxEditPart.VISUAL_ID:
			return getLimitBox_2004ContainedLinks(view);
		case UseCaseEditPart.VISUAL_ID:
			return getUseCase_3001ContainedLinks(view);
		case ComRelationshipEditPart.VISUAL_ID:
			return getComRelationship_4001ContainedLinks(view);
		case IncludeRelationshipEditPart.VISUAL_ID:
			return getIncludeRelationship_4002ContainedLinks(view);
		case ExtendsRelationshipEditPart.VISUAL_ID:
			return getExtendsRelationship_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UcdiagramLinkDescriptor> getIncomingLinks(View view) {
		switch (UcdiagramVisualIDRegistry.getVisualID(view)) {
		case ActorEditPart.VISUAL_ID:
			return getActor_2002IncomingLinks(view);
		case LimitBoxEditPart.VISUAL_ID:
			return getLimitBox_2004IncomingLinks(view);
		case UseCaseEditPart.VISUAL_ID:
			return getUseCase_3001IncomingLinks(view);
		case ComRelationshipEditPart.VISUAL_ID:
			return getComRelationship_4001IncomingLinks(view);
		case IncludeRelationshipEditPart.VISUAL_ID:
			return getIncludeRelationship_4002IncomingLinks(view);
		case ExtendsRelationshipEditPart.VISUAL_ID:
			return getExtendsRelationship_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UcdiagramLinkDescriptor> getOutgoingLinks(View view) {
		switch (UcdiagramVisualIDRegistry.getVisualID(view)) {
		case ActorEditPart.VISUAL_ID:
			return getActor_2002OutgoingLinks(view);
		case LimitBoxEditPart.VISUAL_ID:
			return getLimitBox_2004OutgoingLinks(view);
		case UseCaseEditPart.VISUAL_ID:
			return getUseCase_3001OutgoingLinks(view);
		case ComRelationshipEditPart.VISUAL_ID:
			return getComRelationship_4001OutgoingLinks(view);
		case IncludeRelationshipEditPart.VISUAL_ID:
			return getIncludeRelationship_4002OutgoingLinks(view);
		case ExtendsRelationshipEditPart.VISUAL_ID:
			return getExtendsRelationship_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UcdiagramLinkDescriptor> getUc_diagram_1000ContainedLinks(View view) {
		ucdiagram.uc_diagram modelElement = (ucdiagram.uc_diagram) view.getElement();
		LinkedList<UcdiagramLinkDescriptor> result = new LinkedList<UcdiagramLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_comRelationship_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_includeRelationship_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_extendsRelationship_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UcdiagramLinkDescriptor> getActor_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UcdiagramLinkDescriptor> getLimitBox_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UcdiagramLinkDescriptor> getUseCase_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UcdiagramLinkDescriptor> getComRelationship_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UcdiagramLinkDescriptor> getIncludeRelationship_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UcdiagramLinkDescriptor> getExtendsRelationship_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UcdiagramLinkDescriptor> getActor_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UcdiagramLinkDescriptor> getLimitBox_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UcdiagramLinkDescriptor> getUseCase_3001IncomingLinks(View view) {
		UseCase modelElement = (UseCase) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UcdiagramLinkDescriptor> result = new LinkedList<UcdiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_comRelationship_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_includeRelationship_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_extendsRelationship_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UcdiagramLinkDescriptor> getComRelationship_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UcdiagramLinkDescriptor> getIncludeRelationship_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UcdiagramLinkDescriptor> getExtendsRelationship_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UcdiagramLinkDescriptor> getActor_2002OutgoingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		LinkedList<UcdiagramLinkDescriptor> result = new LinkedList<UcdiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_comRelationship_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UcdiagramLinkDescriptor> getLimitBox_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UcdiagramLinkDescriptor> getUseCase_3001OutgoingLinks(View view) {
		UseCase modelElement = (UseCase) view.getElement();
		LinkedList<UcdiagramLinkDescriptor> result = new LinkedList<UcdiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_includeRelationship_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_extendsRelationship_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UcdiagramLinkDescriptor> getComRelationship_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UcdiagramLinkDescriptor> getIncludeRelationship_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UcdiagramLinkDescriptor> getExtendsRelationship_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<UcdiagramLinkDescriptor> getContainedTypeModelFacetLinks_comRelationship_4001(
			ucdiagram.uc_diagram container) {
		LinkedList<UcdiagramLinkDescriptor> result = new LinkedList<UcdiagramLinkDescriptor>();
		for (Iterator<?> links = container.getListComRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ucdiagram.comRelationship) {
				continue;
			}
			ucdiagram.comRelationship link = (ucdiagram.comRelationship) linkObject;
			if (ComRelationshipEditPart.VISUAL_ID != UcdiagramVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase dst = link.getTarget();
			Actor src = link.getSource();
			result.add(new UcdiagramLinkDescriptor(src, dst, link, UcdiagramElementTypes.ComRelationship_4001,
					ComRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UcdiagramLinkDescriptor> getContainedTypeModelFacetLinks_includeRelationship_4002(
			ucdiagram.uc_diagram container) {
		LinkedList<UcdiagramLinkDescriptor> result = new LinkedList<UcdiagramLinkDescriptor>();
		for (Iterator<?> links = container.getListIncRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ucdiagram.includeRelationship) {
				continue;
			}
			ucdiagram.includeRelationship link = (ucdiagram.includeRelationship) linkObject;
			if (IncludeRelationshipEditPart.VISUAL_ID != UcdiagramVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase dst = link.getTarget();
			UseCase src = link.getSource();
			result.add(new UcdiagramLinkDescriptor(src, dst, link, UcdiagramElementTypes.IncludeRelationship_4002,
					IncludeRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UcdiagramLinkDescriptor> getContainedTypeModelFacetLinks_extendsRelationship_4003(
			ucdiagram.uc_diagram container) {
		LinkedList<UcdiagramLinkDescriptor> result = new LinkedList<UcdiagramLinkDescriptor>();
		for (Iterator<?> links = container.getListExtRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ucdiagram.extendsRelationship) {
				continue;
			}
			ucdiagram.extendsRelationship link = (ucdiagram.extendsRelationship) linkObject;
			if (ExtendsRelationshipEditPart.VISUAL_ID != UcdiagramVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase dst = link.getTarget();
			UseCase src = link.getSource();
			result.add(new UcdiagramLinkDescriptor(src, dst, link, UcdiagramElementTypes.ExtendsRelationship_4003,
					ExtendsRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UcdiagramLinkDescriptor> getIncomingTypeModelFacetLinks_comRelationship_4001(
			UseCase target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UcdiagramLinkDescriptor> result = new LinkedList<UcdiagramLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UcdiagramPackage.eINSTANCE.getcomRelationship_Target()
					|| false == setting.getEObject() instanceof ucdiagram.comRelationship) {
				continue;
			}
			ucdiagram.comRelationship link = (ucdiagram.comRelationship) setting.getEObject();
			if (ComRelationshipEditPart.VISUAL_ID != UcdiagramVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Actor src = link.getSource();
			result.add(new UcdiagramLinkDescriptor(src, target, link, UcdiagramElementTypes.ComRelationship_4001,
					ComRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UcdiagramLinkDescriptor> getIncomingTypeModelFacetLinks_includeRelationship_4002(
			UseCase target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UcdiagramLinkDescriptor> result = new LinkedList<UcdiagramLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UcdiagramPackage.eINSTANCE.getincludeRelationship_Target()
					|| false == setting.getEObject() instanceof ucdiagram.includeRelationship) {
				continue;
			}
			ucdiagram.includeRelationship link = (ucdiagram.includeRelationship) setting.getEObject();
			if (IncludeRelationshipEditPart.VISUAL_ID != UcdiagramVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase src = link.getSource();
			result.add(new UcdiagramLinkDescriptor(src, target, link, UcdiagramElementTypes.IncludeRelationship_4002,
					IncludeRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UcdiagramLinkDescriptor> getIncomingTypeModelFacetLinks_extendsRelationship_4003(
			UseCase target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UcdiagramLinkDescriptor> result = new LinkedList<UcdiagramLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UcdiagramPackage.eINSTANCE.getextendsRelationship_Target()
					|| false == setting.getEObject() instanceof ucdiagram.extendsRelationship) {
				continue;
			}
			ucdiagram.extendsRelationship link = (ucdiagram.extendsRelationship) setting.getEObject();
			if (ExtendsRelationshipEditPart.VISUAL_ID != UcdiagramVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase src = link.getSource();
			result.add(new UcdiagramLinkDescriptor(src, target, link, UcdiagramElementTypes.ExtendsRelationship_4003,
					ExtendsRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UcdiagramLinkDescriptor> getOutgoingTypeModelFacetLinks_comRelationship_4001(
			Actor source) {
		ucdiagram.uc_diagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ucdiagram.uc_diagram) {
				container = (ucdiagram.uc_diagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UcdiagramLinkDescriptor> result = new LinkedList<UcdiagramLinkDescriptor>();
		for (Iterator<?> links = container.getListComRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ucdiagram.comRelationship) {
				continue;
			}
			ucdiagram.comRelationship link = (ucdiagram.comRelationship) linkObject;
			if (ComRelationshipEditPart.VISUAL_ID != UcdiagramVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase dst = link.getTarget();
			Actor src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new UcdiagramLinkDescriptor(src, dst, link, UcdiagramElementTypes.ComRelationship_4001,
					ComRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UcdiagramLinkDescriptor> getOutgoingTypeModelFacetLinks_includeRelationship_4002(
			UseCase source) {
		ucdiagram.uc_diagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ucdiagram.uc_diagram) {
				container = (ucdiagram.uc_diagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UcdiagramLinkDescriptor> result = new LinkedList<UcdiagramLinkDescriptor>();
		for (Iterator<?> links = container.getListIncRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ucdiagram.includeRelationship) {
				continue;
			}
			ucdiagram.includeRelationship link = (ucdiagram.includeRelationship) linkObject;
			if (IncludeRelationshipEditPart.VISUAL_ID != UcdiagramVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase dst = link.getTarget();
			UseCase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new UcdiagramLinkDescriptor(src, dst, link, UcdiagramElementTypes.IncludeRelationship_4002,
					IncludeRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UcdiagramLinkDescriptor> getOutgoingTypeModelFacetLinks_extendsRelationship_4003(
			UseCase source) {
		ucdiagram.uc_diagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ucdiagram.uc_diagram) {
				container = (ucdiagram.uc_diagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UcdiagramLinkDescriptor> result = new LinkedList<UcdiagramLinkDescriptor>();
		for (Iterator<?> links = container.getListExtRels().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ucdiagram.extendsRelationship) {
				continue;
			}
			ucdiagram.extendsRelationship link = (ucdiagram.extendsRelationship) linkObject;
			if (ExtendsRelationshipEditPart.VISUAL_ID != UcdiagramVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase dst = link.getTarget();
			UseCase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new UcdiagramLinkDescriptor(src, dst, link, UcdiagramElementTypes.ExtendsRelationship_4003,
					ExtendsRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<UcdiagramNodeDescriptor> getSemanticChildren(View view) {
			return UcdiagramDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UcdiagramLinkDescriptor> getContainedLinks(View view) {
			return UcdiagramDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UcdiagramLinkDescriptor> getIncomingLinks(View view) {
			return UcdiagramDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UcdiagramLinkDescriptor> getOutgoingLinks(View view) {
			return UcdiagramDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
