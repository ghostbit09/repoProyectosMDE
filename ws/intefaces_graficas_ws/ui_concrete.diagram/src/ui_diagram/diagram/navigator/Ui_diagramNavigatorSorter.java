/*
* 
*/
package ui_diagram.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class Ui_diagramNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7005;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7004;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ui_diagram.diagram.navigator.Ui_diagramNavigatorItem) {
			ui_diagram.diagram.navigator.Ui_diagramNavigatorItem item = (ui_diagram.diagram.navigator.Ui_diagramNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
