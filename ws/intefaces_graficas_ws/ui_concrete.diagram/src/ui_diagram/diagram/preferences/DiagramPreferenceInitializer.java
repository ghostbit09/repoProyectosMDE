/*
 * 
 */
package ui_diagram.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		ui_diagram.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		ui_diagram.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		ui_diagram.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		ui_diagram.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		ui_diagram.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
