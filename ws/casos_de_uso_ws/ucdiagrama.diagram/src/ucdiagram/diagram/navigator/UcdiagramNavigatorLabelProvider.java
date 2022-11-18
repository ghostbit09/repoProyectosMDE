/*
* 
*/
package ucdiagram.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import ucdiagram.diagram.edit.parts.ActorEditPart;
import ucdiagram.diagram.edit.parts.ActorNameEditPart;
import ucdiagram.diagram.edit.parts.ComRelationshipEditPart;
import ucdiagram.diagram.edit.parts.ExtendsRelationshipEditPart;
import ucdiagram.diagram.edit.parts.ExtendsRelationshipLabelNameEditPart;
import ucdiagram.diagram.edit.parts.IncludeRelationshipEditPart;
import ucdiagram.diagram.edit.parts.IncludeRelationshipLabelNameEditPart;
import ucdiagram.diagram.edit.parts.LimitBoxEditPart;
import ucdiagram.diagram.edit.parts.LimitBoxNameEditPart;
import ucdiagram.diagram.edit.parts.Uc_diagramEditPart;
import ucdiagram.diagram.edit.parts.UseCaseEditPart;
import ucdiagram.diagram.edit.parts.UseCaseNameEditPart;
import ucdiagram.diagram.part.UcdiagramDiagramEditorPlugin;
import ucdiagram.diagram.part.UcdiagramVisualIDRegistry;
import ucdiagram.diagram.providers.UcdiagramElementTypes;
import ucdiagram.diagram.providers.UcdiagramParserProvider;

/**
 * @generated
 */
public class UcdiagramNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		UcdiagramDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		UcdiagramDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof UcdiagramNavigatorItem && !isOwnView(((UcdiagramNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof UcdiagramNavigatorGroup) {
			UcdiagramNavigatorGroup group = (UcdiagramNavigatorGroup) element;
			return UcdiagramDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof UcdiagramNavigatorItem) {
			UcdiagramNavigatorItem navigatorItem = (UcdiagramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (UcdiagramVisualIDRegistry.getVisualID(view)) {
		case Uc_diagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://ucdiagram?uc_diagram", UcdiagramElementTypes.Uc_diagram_1000); //$NON-NLS-1$
		case ActorEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://ucdiagram?Actor", UcdiagramElementTypes.Actor_2002); //$NON-NLS-1$
		case LimitBoxEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://ucdiagram?LimitBox", UcdiagramElementTypes.LimitBox_2004); //$NON-NLS-1$
		case UseCaseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://ucdiagram?UseCase", UcdiagramElementTypes.UseCase_3001); //$NON-NLS-1$
		case ComRelationshipEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://ucdiagram?comRelationship", //$NON-NLS-1$
					UcdiagramElementTypes.ComRelationship_4001);
		case IncludeRelationshipEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://ucdiagram?includeRelationship", //$NON-NLS-1$
					UcdiagramElementTypes.IncludeRelationship_4002);
		case ExtendsRelationshipEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://ucdiagram?extendsRelationship", //$NON-NLS-1$
					UcdiagramElementTypes.ExtendsRelationship_4003);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = UcdiagramDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && UcdiagramElementTypes.isKnownElementType(elementType)) {
			image = UcdiagramElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof UcdiagramNavigatorGroup) {
			UcdiagramNavigatorGroup group = (UcdiagramNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof UcdiagramNavigatorItem) {
			UcdiagramNavigatorItem navigatorItem = (UcdiagramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (UcdiagramVisualIDRegistry.getVisualID(view)) {
		case Uc_diagramEditPart.VISUAL_ID:
			return getUc_diagram_1000Text(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2002Text(view);
		case LimitBoxEditPart.VISUAL_ID:
			return getLimitBox_2004Text(view);
		case UseCaseEditPart.VISUAL_ID:
			return getUseCase_3001Text(view);
		case ComRelationshipEditPart.VISUAL_ID:
			return getComRelationship_4001Text(view);
		case IncludeRelationshipEditPart.VISUAL_ID:
			return getIncludeRelationship_4002Text(view);
		case ExtendsRelationshipEditPart.VISUAL_ID:
			return getExtendsRelationship_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getUc_diagram_1000Text(View view) {
		ucdiagram.uc_diagram domainModelElement = (ucdiagram.uc_diagram) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			UcdiagramDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActor_2002Text(View view) {
		IParser parser = UcdiagramParserProvider.getParser(UcdiagramElementTypes.Actor_2002,
				view.getElement() != null ? view.getElement() : view,
				UcdiagramVisualIDRegistry.getType(ActorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UcdiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLimitBox_2004Text(View view) {
		IParser parser = UcdiagramParserProvider.getParser(UcdiagramElementTypes.LimitBox_2004,
				view.getElement() != null ? view.getElement() : view,
				UcdiagramVisualIDRegistry.getType(LimitBoxNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UcdiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUseCase_3001Text(View view) {
		IParser parser = UcdiagramParserProvider.getParser(UcdiagramElementTypes.UseCase_3001,
				view.getElement() != null ? view.getElement() : view,
				UcdiagramVisualIDRegistry.getType(UseCaseNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UcdiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComRelationship_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getIncludeRelationship_4002Text(View view) {
		IParser parser = UcdiagramParserProvider.getParser(UcdiagramElementTypes.IncludeRelationship_4002,
				view.getElement() != null ? view.getElement() : view,
				UcdiagramVisualIDRegistry.getType(IncludeRelationshipLabelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UcdiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExtendsRelationship_4003Text(View view) {
		IParser parser = UcdiagramParserProvider.getParser(UcdiagramElementTypes.ExtendsRelationship_4003,
				view.getElement() != null ? view.getElement() : view,
				UcdiagramVisualIDRegistry.getType(ExtendsRelationshipLabelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UcdiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return Uc_diagramEditPart.MODEL_ID.equals(UcdiagramVisualIDRegistry.getModelID(view));
	}

}
