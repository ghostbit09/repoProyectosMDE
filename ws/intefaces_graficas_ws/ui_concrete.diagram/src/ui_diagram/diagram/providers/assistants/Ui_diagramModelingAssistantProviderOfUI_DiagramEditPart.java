/*
 * 
 */
package ui_diagram.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Ui_diagramModelingAssistantProviderOfUI_DiagramEditPart
		extends ui_diagram.diagram.providers.Ui_diagramModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.UserInterface_2001);
		return types;
	}

}
