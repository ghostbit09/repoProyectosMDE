/*
 * 
 */
package ucdiagram.diagram.providers;

import ucdiagram.diagram.part.UcdiagramDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = UcdiagramDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			UcdiagramDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
