/*
 * 
 */
package ucdiagram.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import ucdiagram.UcdiagramPackage;
import ucdiagram.diagram.edit.parts.ActorNameEditPart;
import ucdiagram.diagram.edit.parts.ExtendsRelationshipLabelNameEditPart;
import ucdiagram.diagram.edit.parts.IncludeRelationshipLabelNameEditPart;
import ucdiagram.diagram.edit.parts.LimitBoxNameEditPart;
import ucdiagram.diagram.edit.parts.UseCaseNameEditPart;
import ucdiagram.diagram.parsers.MessageFormatParser;
import ucdiagram.diagram.part.UcdiagramVisualIDRegistry;

/**
 * @generated
 */
public class UcdiagramParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser actorName_5010Parser;

	/**
	* @generated
	*/
	private IParser getActorName_5010Parser() {
		if (actorName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { UcdiagramPackage.eINSTANCE.getActor_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actorName_5010Parser = parser;
		}
		return actorName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser limitBoxName_5013Parser;

	/**
	* @generated
	*/
	private IParser getLimitBoxName_5013Parser() {
		if (limitBoxName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { UcdiagramPackage.eINSTANCE.getLimitBox_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			limitBoxName_5013Parser = parser;
		}
		return limitBoxName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser useCaseName_5012Parser;

	/**
	* @generated
	*/
	private IParser getUseCaseName_5012Parser() {
		if (useCaseName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { UcdiagramPackage.eINSTANCE.getUseCase_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			useCaseName_5012Parser = parser;
		}
		return useCaseName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser includeRelationshipLabelName_6001Parser;

	/**
	* @generated
	*/
	private IParser getIncludeRelationshipLabelName_6001Parser() {
		if (includeRelationshipLabelName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { UcdiagramPackage.eINSTANCE.getincludeRelationship_LabelName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			includeRelationshipLabelName_6001Parser = parser;
		}
		return includeRelationshipLabelName_6001Parser;
	}

	/**
	* @generated
	*/
	private IParser extendsRelationshipLabelName_6002Parser;

	/**
	* @generated
	*/
	private IParser getExtendsRelationshipLabelName_6002Parser() {
		if (extendsRelationshipLabelName_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { UcdiagramPackage.eINSTANCE.getextendsRelationship_LabelName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			extendsRelationshipLabelName_6002Parser = parser;
		}
		return extendsRelationshipLabelName_6002Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ActorNameEditPart.VISUAL_ID:
			return getActorName_5010Parser();
		case LimitBoxNameEditPart.VISUAL_ID:
			return getLimitBoxName_5013Parser();
		case UseCaseNameEditPart.VISUAL_ID:
			return getUseCaseName_5012Parser();
		case IncludeRelationshipLabelNameEditPart.VISUAL_ID:
			return getIncludeRelationshipLabelName_6001Parser();
		case ExtendsRelationshipLabelNameEditPart.VISUAL_ID:
			return getExtendsRelationshipLabelName_6002Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(UcdiagramVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(UcdiagramVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (UcdiagramElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
