/*
 * 
 */
package uidiagram.diagram.providers;

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

import uidiagram.UidiagramPackage;
import uidiagram.diagram.edit.parts.ButtonName2EditPart;
import uidiagram.diagram.edit.parts.ButtonNameEditPart;
import uidiagram.diagram.edit.parts.CheckBoxName2EditPart;
import uidiagram.diagram.edit.parts.CheckBoxNameEditPart;
import uidiagram.diagram.edit.parts.ComboBoxName2EditPart;
import uidiagram.diagram.edit.parts.ComboBoxNameEditPart;
import uidiagram.diagram.edit.parts.FloatingButtonName2EditPart;
import uidiagram.diagram.edit.parts.FloatingButtonNameEditPart;
import uidiagram.diagram.edit.parts.ImgName2EditPart;
import uidiagram.diagram.edit.parts.ImgNameEditPart;
import uidiagram.diagram.edit.parts.LabelName2EditPart;
import uidiagram.diagram.edit.parts.LabelNameEditPart;
import uidiagram.diagram.edit.parts.RadioButtonName2EditPart;
import uidiagram.diagram.edit.parts.RadioButtonNameEditPart;
import uidiagram.diagram.edit.parts.TableName2EditPart;
import uidiagram.diagram.edit.parts.TableNameEditPart;
import uidiagram.diagram.edit.parts.TableRowName2EditPart;
import uidiagram.diagram.edit.parts.TableRowNameEditPart;
import uidiagram.diagram.edit.parts.TextInputName2EditPart;
import uidiagram.diagram.edit.parts.TextInputNameEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceName2EditPart;
import uidiagram.diagram.edit.parts.UserInterfaceName3EditPart;
import uidiagram.diagram.edit.parts.UserInterfaceNameEditPart;
import uidiagram.diagram.parsers.MessageFormatParser;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;

/**
 * @generated
 */
public class UidiagramParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser userInterfaceName_5029Parser;

	/**
	* @generated
	*/
	private IParser getUserInterfaceName_5029Parser() {
		if (userInterfaceName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userInterfaceName_5029Parser = parser;
		}
		return userInterfaceName_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonName_5012Parser;

	/**
	* @generated
	*/
	private IParser getButtonName_5012Parser() {
		if (buttonName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5012Parser = parser;
		}
		return buttonName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser labelName_5013Parser;

	/**
	* @generated
	*/
	private IParser getLabelName_5013Parser() {
		if (labelName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelName_5013Parser = parser;
		}
		return labelName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser checkBoxName_5014Parser;

	/**
	* @generated
	*/
	private IParser getCheckBoxName_5014Parser() {
		if (checkBoxName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			checkBoxName_5014Parser = parser;
		}
		return checkBoxName_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser textInputName_5015Parser;

	/**
	* @generated
	*/
	private IParser getTextInputName_5015Parser() {
		if (textInputName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textInputName_5015Parser = parser;
		}
		return textInputName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser imgName_5018Parser;

	/**
	* @generated
	*/
	private IParser getImgName_5018Parser() {
		if (imgName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			imgName_5018Parser = parser;
		}
		return imgName_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser tableName_5020Parser;

	/**
	* @generated
	*/
	private IParser getTableName_5020Parser() {
		if (tableName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableName_5020Parser = parser;
		}
		return tableName_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonName_5001Parser;

	/**
	* @generated
	*/
	private IParser getButtonName_5001Parser() {
		if (buttonName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5001Parser = parser;
		}
		return buttonName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser labelName_5002Parser;

	/**
	* @generated
	*/
	private IParser getLabelName_5002Parser() {
		if (labelName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelName_5002Parser = parser;
		}
		return labelName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser checkBoxName_5003Parser;

	/**
	* @generated
	*/
	private IParser getCheckBoxName_5003Parser() {
		if (checkBoxName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			checkBoxName_5003Parser = parser;
		}
		return checkBoxName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser textInputName_5004Parser;

	/**
	* @generated
	*/
	private IParser getTextInputName_5004Parser() {
		if (textInputName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textInputName_5004Parser = parser;
		}
		return textInputName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser imgName_5007Parser;

	/**
	* @generated
	*/
	private IParser getImgName_5007Parser() {
		if (imgName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			imgName_5007Parser = parser;
		}
		return imgName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser tableName_5026Parser;

	/**
	* @generated
	*/
	private IParser getTableName_5026Parser() {
		if (tableName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableName_5026Parser = parser;
		}
		return tableName_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser tableRowName_5035Parser;

	/**
	* @generated
	*/
	private IParser getTableRowName_5035Parser() {
		if (tableRowName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableRowName_5035Parser = parser;
		}
		return tableRowName_5035Parser;
	}

	/**
	* @generated
	*/
	private IParser comboBoxName_5010Parser;

	/**
	* @generated
	*/
	private IParser getComboBoxName_5010Parser() {
		if (comboBoxName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			comboBoxName_5010Parser = parser;
		}
		return comboBoxName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser radioButtonName_5011Parser;

	/**
	* @generated
	*/
	private IParser getRadioButtonName_5011Parser() {
		if (radioButtonName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			radioButtonName_5011Parser = parser;
		}
		return radioButtonName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser floatingButtonName_5030Parser;

	/**
	* @generated
	*/
	private IParser getFloatingButtonName_5030Parser() {
		if (floatingButtonName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			floatingButtonName_5030Parser = parser;
		}
		return floatingButtonName_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser userInterfaceName_5025Parser;

	/**
	* @generated
	*/
	private IParser getUserInterfaceName_5025Parser() {
		if (userInterfaceName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userInterfaceName_5025Parser = parser;
		}
		return userInterfaceName_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser tableRowName_5031Parser;

	/**
	* @generated
	*/
	private IParser getTableRowName_5031Parser() {
		if (tableRowName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableRowName_5031Parser = parser;
		}
		return tableRowName_5031Parser;
	}

	/**
	* @generated
	*/
	private IParser comboBoxName_5022Parser;

	/**
	* @generated
	*/
	private IParser getComboBoxName_5022Parser() {
		if (comboBoxName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			comboBoxName_5022Parser = parser;
		}
		return comboBoxName_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser radioButtonName_5023Parser;

	/**
	* @generated
	*/
	private IParser getRadioButtonName_5023Parser() {
		if (radioButtonName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			radioButtonName_5023Parser = parser;
		}
		return radioButtonName_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser floatingButtonName_5033Parser;

	/**
	* @generated
	*/
	private IParser getFloatingButtonName_5033Parser() {
		if (floatingButtonName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			floatingButtonName_5033Parser = parser;
		}
		return floatingButtonName_5033Parser;
	}

	/**
	* @generated
	*/
	private IParser userInterfaceName_5024Parser;

	/**
	* @generated
	*/
	private IParser getUserInterfaceName_5024Parser() {
		if (userInterfaceName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userInterfaceName_5024Parser = parser;
		}
		return userInterfaceName_5024Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case UserInterfaceNameEditPart.VISUAL_ID:
			return getUserInterfaceName_5029Parser();
		case ButtonNameEditPart.VISUAL_ID:
			return getButtonName_5012Parser();
		case LabelNameEditPart.VISUAL_ID:
			return getLabelName_5013Parser();
		case CheckBoxNameEditPart.VISUAL_ID:
			return getCheckBoxName_5014Parser();
		case TextInputNameEditPart.VISUAL_ID:
			return getTextInputName_5015Parser();
		case ImgNameEditPart.VISUAL_ID:
			return getImgName_5018Parser();
		case TableNameEditPart.VISUAL_ID:
			return getTableName_5020Parser();
		case ButtonName2EditPart.VISUAL_ID:
			return getButtonName_5001Parser();
		case LabelName2EditPart.VISUAL_ID:
			return getLabelName_5002Parser();
		case CheckBoxName2EditPart.VISUAL_ID:
			return getCheckBoxName_5003Parser();
		case TextInputName2EditPart.VISUAL_ID:
			return getTextInputName_5004Parser();
		case ImgName2EditPart.VISUAL_ID:
			return getImgName_5007Parser();
		case TableName2EditPart.VISUAL_ID:
			return getTableName_5026Parser();
		case TableRowNameEditPart.VISUAL_ID:
			return getTableRowName_5035Parser();
		case ComboBoxNameEditPart.VISUAL_ID:
			return getComboBoxName_5010Parser();
		case RadioButtonNameEditPart.VISUAL_ID:
			return getRadioButtonName_5011Parser();
		case FloatingButtonNameEditPart.VISUAL_ID:
			return getFloatingButtonName_5030Parser();
		case UserInterfaceName2EditPart.VISUAL_ID:
			return getUserInterfaceName_5025Parser();
		case TableRowName2EditPart.VISUAL_ID:
			return getTableRowName_5031Parser();
		case ComboBoxName2EditPart.VISUAL_ID:
			return getComboBoxName_5022Parser();
		case RadioButtonName2EditPart.VISUAL_ID:
			return getRadioButtonName_5023Parser();
		case FloatingButtonName2EditPart.VISUAL_ID:
			return getFloatingButtonName_5033Parser();
		case UserInterfaceName3EditPart.VISUAL_ID:
			return getUserInterfaceName_5024Parser();
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
			return getParser(UidiagramVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(UidiagramVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (UidiagramElementTypes.getElement(hint) == null) {
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
