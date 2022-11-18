/*
 * 
 */
package ucdiagram.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import ucdiagram.diagram.providers.UcdiagramElementTypes;
import ucdiagram.diagram.providers.UcdiagramModelingAssistantProvider;

/**
 * @generated
 */
public class UcdiagramModelingAssistantProviderOfUc_diagramEditPart extends UcdiagramModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UcdiagramElementTypes.Actor_2002);
		types.add(UcdiagramElementTypes.LimitBox_2004);
		return types;
	}

}
