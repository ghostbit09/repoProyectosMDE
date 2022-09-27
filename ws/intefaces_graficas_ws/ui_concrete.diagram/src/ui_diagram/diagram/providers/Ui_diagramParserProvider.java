/*
 * 
 */
package ui_diagram.diagram.providers;

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

/**
 * @generated
 */
public class Ui_diagramParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser userInterfaceTitle_5023Parser;

	/**
	* @generated
	*/
	private IParser getUserInterfaceTitle_5023Parser() {
		if (userInterfaceTitle_5023Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ui_diagram.Ui_diagramPackage.eINSTANCE.getUserInterface_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			userInterfaceTitle_5023Parser = parser;
		}
		return userInterfaceTitle_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser groupTitle_5012Parser;

	/**
	* @generated
	*/
	private IParser getGroupTitle_5012Parser() {
		if (groupTitle_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			groupTitle_5012Parser = parser;
		}
		return groupTitle_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser groupTitle_5011Parser;

	/**
	* @generated
	*/
	private IParser getGroupTitle_5011Parser() {
		if (groupTitle_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			groupTitle_5011Parser = parser;
		}
		return groupTitle_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonTitle_5024Parser;

	/**
	* @generated
	*/
	private IParser getButtonTitle_5024Parser() {
		if (buttonTitle_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			buttonTitle_5024Parser = parser;
		}
		return buttonTitle_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser labelTitle_5025Parser;

	/**
	* @generated
	*/
	private IParser getLabelTitle_5025Parser() {
		if (labelTitle_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			labelTitle_5025Parser = parser;
		}
		return labelTitle_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser checkBoxTitle_5026Parser;

	/**
	* @generated
	*/
	private IParser getCheckBoxTitle_5026Parser() {
		if (checkBoxTitle_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			checkBoxTitle_5026Parser = parser;
		}
		return checkBoxTitle_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser textInputTitle_5027Parser;

	/**
	* @generated
	*/
	private IParser getTextInputTitle_5027Parser() {
		if (textInputTitle_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			textInputTitle_5027Parser = parser;
		}
		return textInputTitle_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser dropDownTitle_5028Parser;

	/**
	* @generated
	*/
	private IParser getDropDownTitle_5028Parser() {
		if (dropDownTitle_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			dropDownTitle_5028Parser = parser;
		}
		return dropDownTitle_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser menuTitle_5029Parser;

	/**
	* @generated
	*/
	private IParser getMenuTitle_5029Parser() {
		if (menuTitle_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			menuTitle_5029Parser = parser;
		}
		return menuTitle_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser imgTitle_5030Parser;

	/**
	* @generated
	*/
	private IParser getImgTitle_5030Parser() {
		if (imgTitle_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			imgTitle_5030Parser = parser;
		}
		return imgTitle_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser iconTitle_5031Parser;

	/**
	* @generated
	*/
	private IParser getIconTitle_5031Parser() {
		if (iconTitle_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			iconTitle_5031Parser = parser;
		}
		return iconTitle_5031Parser;
	}

	/**
	* @generated
	*/
	private IParser tableTitle_5032Parser;

	/**
	* @generated
	*/
	private IParser getTableTitle_5032Parser() {
		if (tableTitle_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			tableTitle_5032Parser = parser;
		}
		return tableTitle_5032Parser;
	}

	/**
	* @generated
	*/
	private IParser comboBoxTitle_5033Parser;

	/**
	* @generated
	*/
	private IParser getComboBoxTitle_5033Parser() {
		if (comboBoxTitle_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			comboBoxTitle_5033Parser = parser;
		}
		return comboBoxTitle_5033Parser;
	}

	/**
	* @generated
	*/
	private IParser radioButtonTitle_5034Parser;

	/**
	* @generated
	*/
	private IParser getRadioButtonTitle_5034Parser() {
		if (radioButtonTitle_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			radioButtonTitle_5034Parser = parser;
		}
		return radioButtonTitle_5034Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonTitle_5035Parser;

	/**
	* @generated
	*/
	private IParser getButtonTitle_5035Parser() {
		if (buttonTitle_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			buttonTitle_5035Parser = parser;
		}
		return buttonTitle_5035Parser;
	}

	/**
	* @generated
	*/
	private IParser labelTitle_5036Parser;

	/**
	* @generated
	*/
	private IParser getLabelTitle_5036Parser() {
		if (labelTitle_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			labelTitle_5036Parser = parser;
		}
		return labelTitle_5036Parser;
	}

	/**
	* @generated
	*/
	private IParser checkBoxTitle_5037Parser;

	/**
	* @generated
	*/
	private IParser getCheckBoxTitle_5037Parser() {
		if (checkBoxTitle_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			checkBoxTitle_5037Parser = parser;
		}
		return checkBoxTitle_5037Parser;
	}

	/**
	* @generated
	*/
	private IParser textInputTitle_5038Parser;

	/**
	* @generated
	*/
	private IParser getTextInputTitle_5038Parser() {
		if (textInputTitle_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			textInputTitle_5038Parser = parser;
		}
		return textInputTitle_5038Parser;
	}

	/**
	* @generated
	*/
	private IParser dropDownTitle_5039Parser;

	/**
	* @generated
	*/
	private IParser getDropDownTitle_5039Parser() {
		if (dropDownTitle_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			dropDownTitle_5039Parser = parser;
		}
		return dropDownTitle_5039Parser;
	}

	/**
	* @generated
	*/
	private IParser menuTitle_5040Parser;

	/**
	* @generated
	*/
	private IParser getMenuTitle_5040Parser() {
		if (menuTitle_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			menuTitle_5040Parser = parser;
		}
		return menuTitle_5040Parser;
	}

	/**
	* @generated
	*/
	private IParser imgTitle_5041Parser;

	/**
	* @generated
	*/
	private IParser getImgTitle_5041Parser() {
		if (imgTitle_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			imgTitle_5041Parser = parser;
		}
		return imgTitle_5041Parser;
	}

	/**
	* @generated
	*/
	private IParser iconTitle_5042Parser;

	/**
	* @generated
	*/
	private IParser getIconTitle_5042Parser() {
		if (iconTitle_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			iconTitle_5042Parser = parser;
		}
		return iconTitle_5042Parser;
	}

	/**
	* @generated
	*/
	private IParser tableTitle_5043Parser;

	/**
	* @generated
	*/
	private IParser getTableTitle_5043Parser() {
		if (tableTitle_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			tableTitle_5043Parser = parser;
		}
		return tableTitle_5043Parser;
	}

	/**
	* @generated
	*/
	private IParser comboBoxTitle_5044Parser;

	/**
	* @generated
	*/
	private IParser getComboBoxTitle_5044Parser() {
		if (comboBoxTitle_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			comboBoxTitle_5044Parser = parser;
		}
		return comboBoxTitle_5044Parser;
	}

	/**
	* @generated
	*/
	private IParser radioButtonTitle_5045Parser;

	/**
	* @generated
	*/
	private IParser getRadioButtonTitle_5045Parser() {
		if (radioButtonTitle_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_diagram.Ui_diagramPackage.eINSTANCE.getModelElement_Title() };
			ui_diagram.diagram.parsers.MessageFormatParser parser = new ui_diagram.diagram.parsers.MessageFormatParser(
					features);
			radioButtonTitle_5045Parser = parser;
		}
		return radioButtonTitle_5045Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ui_diagram.diagram.edit.parts.UserInterfaceTitleEditPart.VISUAL_ID:
			return getUserInterfaceTitle_5023Parser();
		case ui_diagram.diagram.edit.parts.GroupTitleEditPart.VISUAL_ID:
			return getGroupTitle_5012Parser();
		case ui_diagram.diagram.edit.parts.GroupTitle2EditPart.VISUAL_ID:
			return getGroupTitle_5011Parser();
		case ui_diagram.diagram.edit.parts.ButtonTitleEditPart.VISUAL_ID:
			return getButtonTitle_5024Parser();
		case ui_diagram.diagram.edit.parts.LabelTitleEditPart.VISUAL_ID:
			return getLabelTitle_5025Parser();
		case ui_diagram.diagram.edit.parts.CheckBoxTitleEditPart.VISUAL_ID:
			return getCheckBoxTitle_5026Parser();
		case ui_diagram.diagram.edit.parts.TextInputTitleEditPart.VISUAL_ID:
			return getTextInputTitle_5027Parser();
		case ui_diagram.diagram.edit.parts.DropDownTitleEditPart.VISUAL_ID:
			return getDropDownTitle_5028Parser();
		case ui_diagram.diagram.edit.parts.MenuTitleEditPart.VISUAL_ID:
			return getMenuTitle_5029Parser();
		case ui_diagram.diagram.edit.parts.ImgTitleEditPart.VISUAL_ID:
			return getImgTitle_5030Parser();
		case ui_diagram.diagram.edit.parts.IconTitleEditPart.VISUAL_ID:
			return getIconTitle_5031Parser();
		case ui_diagram.diagram.edit.parts.TableTitleEditPart.VISUAL_ID:
			return getTableTitle_5032Parser();
		case ui_diagram.diagram.edit.parts.ComboBoxTitleEditPart.VISUAL_ID:
			return getComboBoxTitle_5033Parser();
		case ui_diagram.diagram.edit.parts.RadioButtonTitleEditPart.VISUAL_ID:
			return getRadioButtonTitle_5034Parser();
		case ui_diagram.diagram.edit.parts.ButtonTitle2EditPart.VISUAL_ID:
			return getButtonTitle_5035Parser();
		case ui_diagram.diagram.edit.parts.LabelTitle2EditPart.VISUAL_ID:
			return getLabelTitle_5036Parser();
		case ui_diagram.diagram.edit.parts.CheckBoxTitle2EditPart.VISUAL_ID:
			return getCheckBoxTitle_5037Parser();
		case ui_diagram.diagram.edit.parts.TextInputTitle2EditPart.VISUAL_ID:
			return getTextInputTitle_5038Parser();
		case ui_diagram.diagram.edit.parts.DropDownTitle2EditPart.VISUAL_ID:
			return getDropDownTitle_5039Parser();
		case ui_diagram.diagram.edit.parts.MenuTitle2EditPart.VISUAL_ID:
			return getMenuTitle_5040Parser();
		case ui_diagram.diagram.edit.parts.ImgTitle2EditPart.VISUAL_ID:
			return getImgTitle_5041Parser();
		case ui_diagram.diagram.edit.parts.IconTitle2EditPart.VISUAL_ID:
			return getIconTitle_5042Parser();
		case ui_diagram.diagram.edit.parts.TableTitle2EditPart.VISUAL_ID:
			return getTableTitle_5043Parser();
		case ui_diagram.diagram.edit.parts.ComboBoxTitle2EditPart.VISUAL_ID:
			return getComboBoxTitle_5044Parser();
		case ui_diagram.diagram.edit.parts.RadioButtonTitle2EditPart.VISUAL_ID:
			return getRadioButtonTitle_5045Parser();
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
			return getParser(ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ui_diagram.diagram.providers.Ui_diagramElementTypes.getElement(hint) == null) {
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
