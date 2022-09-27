/*
 * 
 */
package ui_diagram.diagram.providers;

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
		ElementInitializers cached = ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
