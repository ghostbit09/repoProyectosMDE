
/*
* 
*/
package ui_diagram.diagram.sheet;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class Ui_diagramSheetLabelProvider extends BaseLabelProvider implements ILabelProvider {

	/**
	* @generated
	*/
	public String getText(Object element) {
		element = unwrap(element);
		if (element instanceof ui_diagram.diagram.navigator.Ui_diagramNavigatorGroup) {
			return ((ui_diagram.diagram.navigator.Ui_diagramNavigatorGroup) element).getGroupName();
		}
		IElementType etype = getElementType(getView(element));
		return etype == null ? "" : etype.getDisplayName();
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		IElementType etype = getElementType(getView(unwrap(element)));
		return etype == null ? null : ui_diagram.diagram.providers.Ui_diagramElementTypes.getImage(etype);
	}

	/**
	* @generated
	*/
	private Object unwrap(Object element) {
		if (element instanceof IStructuredSelection) {
			return ((IStructuredSelection) element).getFirstElement();
		}
		return element;
	}

	/**
	* @generated
	*/
	private View getView(Object element) {
		if (element instanceof View) {
			return (View) element;
		}
		if (element instanceof IAdaptable) {
			return (View) ((IAdaptable) element).getAdapter(View.class);
		}
		return null;
	}

	/**
	* @generated
	*/
	private IElementType getElementType(View view) {
		// For intermediate views climb up the containment hierarchy to find the one associated with an element type.
		while (view != null) {
			int vid = ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getVisualID(view);
			IElementType etype = ui_diagram.diagram.providers.Ui_diagramElementTypes.getElementType(vid);
			if (etype != null) {
				return etype;
			}
			view = view.eContainer() instanceof View ? (View) view.eContainer() : null;
		}
		return null;
	}

}
