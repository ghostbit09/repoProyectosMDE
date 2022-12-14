/*
* 
*/
package ucdiagram.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import ucdiagram.diagram.part.UcdiagramVisualIDRegistry;

/**
 * @generated
 */
public class UcdiagramNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7003;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7002;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof UcdiagramNavigatorItem) {
			UcdiagramNavigatorItem item = (UcdiagramNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return UcdiagramVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
