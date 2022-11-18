/*
 * 
 */
package ucdiagram.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import ucdiagram.UcdiagramPackage;
import ucdiagram.diagram.edit.parts.ActorEditPart;
import ucdiagram.diagram.edit.parts.ComRelationshipEditPart;
import ucdiagram.diagram.edit.parts.ExtendsRelationshipEditPart;
import ucdiagram.diagram.edit.parts.IncludeRelationshipEditPart;
import ucdiagram.diagram.edit.parts.LimitBoxEditPart;
import ucdiagram.diagram.edit.parts.Uc_diagramEditPart;
import ucdiagram.diagram.edit.parts.UseCaseEditPart;
import ucdiagram.diagram.part.UcdiagramDiagramEditorPlugin;

/**
 * @generated
 */
public class UcdiagramElementTypes {

	/**
	* @generated
	*/
	private UcdiagramElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			UcdiagramDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Uc_diagram_1000 = getElementType("ucdiagrama.diagram.Uc_diagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Actor_2002 = getElementType("ucdiagrama.diagram.Actor_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LimitBox_2004 = getElementType("ucdiagrama.diagram.LimitBox_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UseCase_3001 = getElementType("ucdiagrama.diagram.UseCase_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComRelationship_4001 = getElementType("ucdiagrama.diagram.ComRelationship_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IncludeRelationship_4002 = getElementType(
			"ucdiagrama.diagram.IncludeRelationship_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExtendsRelationship_4003 = getElementType(
			"ucdiagrama.diagram.ExtendsRelationship_4003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Uc_diagram_1000, UcdiagramPackage.eINSTANCE.getuc_diagram());

			elements.put(Actor_2002, UcdiagramPackage.eINSTANCE.getActor());

			elements.put(LimitBox_2004, UcdiagramPackage.eINSTANCE.getLimitBox());

			elements.put(UseCase_3001, UcdiagramPackage.eINSTANCE.getUseCase());

			elements.put(ComRelationship_4001, UcdiagramPackage.eINSTANCE.getcomRelationship());

			elements.put(IncludeRelationship_4002, UcdiagramPackage.eINSTANCE.getincludeRelationship());

			elements.put(ExtendsRelationship_4003, UcdiagramPackage.eINSTANCE.getextendsRelationship());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Uc_diagram_1000);
			KNOWN_ELEMENT_TYPES.add(Actor_2002);
			KNOWN_ELEMENT_TYPES.add(LimitBox_2004);
			KNOWN_ELEMENT_TYPES.add(UseCase_3001);
			KNOWN_ELEMENT_TYPES.add(ComRelationship_4001);
			KNOWN_ELEMENT_TYPES.add(IncludeRelationship_4002);
			KNOWN_ELEMENT_TYPES.add(ExtendsRelationship_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case Uc_diagramEditPart.VISUAL_ID:
			return Uc_diagram_1000;
		case ActorEditPart.VISUAL_ID:
			return Actor_2002;
		case LimitBoxEditPart.VISUAL_ID:
			return LimitBox_2004;
		case UseCaseEditPart.VISUAL_ID:
			return UseCase_3001;
		case ComRelationshipEditPart.VISUAL_ID:
			return ComRelationship_4001;
		case IncludeRelationshipEditPart.VISUAL_ID:
			return IncludeRelationship_4002;
		case ExtendsRelationshipEditPart.VISUAL_ID:
			return ExtendsRelationship_4003;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return ucdiagram.diagram.providers.UcdiagramElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return ucdiagram.diagram.providers.UcdiagramElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return ucdiagram.diagram.providers.UcdiagramElementTypes.getElement(elementTypeAdapter);
		}
	};

}
