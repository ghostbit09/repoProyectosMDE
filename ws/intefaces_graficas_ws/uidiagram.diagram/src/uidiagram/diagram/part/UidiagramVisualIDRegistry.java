/*
* 
*/
package uidiagram.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import uidiagram.Ui_Diagram;
import uidiagram.UidiagramPackage;
import uidiagram.diagram.edit.parts.Button2EditPart;
import uidiagram.diagram.edit.parts.ButtonEditPart;
import uidiagram.diagram.edit.parts.ButtonName2EditPart;
import uidiagram.diagram.edit.parts.ButtonNameEditPart;
import uidiagram.diagram.edit.parts.CheckBox2EditPart;
import uidiagram.diagram.edit.parts.CheckBoxEditPart;
import uidiagram.diagram.edit.parts.CheckBoxName2EditPart;
import uidiagram.diagram.edit.parts.CheckBoxNameEditPart;
import uidiagram.diagram.edit.parts.ComboBox2EditPart;
import uidiagram.diagram.edit.parts.ComboBoxEditPart;
import uidiagram.diagram.edit.parts.ComboBoxName2EditPart;
import uidiagram.diagram.edit.parts.ComboBoxNameEditPart;
import uidiagram.diagram.edit.parts.FloatingButton2EditPart;
import uidiagram.diagram.edit.parts.FloatingButtonEditPart;
import uidiagram.diagram.edit.parts.FloatingButtonName2EditPart;
import uidiagram.diagram.edit.parts.FloatingButtonNameEditPart;
import uidiagram.diagram.edit.parts.Img2EditPart;
import uidiagram.diagram.edit.parts.ImgEditPart;
import uidiagram.diagram.edit.parts.ImgName2EditPart;
import uidiagram.diagram.edit.parts.ImgNameEditPart;
import uidiagram.diagram.edit.parts.Label2EditPart;
import uidiagram.diagram.edit.parts.LabelEditPart;
import uidiagram.diagram.edit.parts.LabelName2EditPart;
import uidiagram.diagram.edit.parts.LabelNameEditPart;
import uidiagram.diagram.edit.parts.RadioButton2EditPart;
import uidiagram.diagram.edit.parts.RadioButtonEditPart;
import uidiagram.diagram.edit.parts.RadioButtonName2EditPart;
import uidiagram.diagram.edit.parts.RadioButtonNameEditPart;
import uidiagram.diagram.edit.parts.Table2EditPart;
import uidiagram.diagram.edit.parts.TableEditPart;
import uidiagram.diagram.edit.parts.TableName2EditPart;
import uidiagram.diagram.edit.parts.TableNameEditPart;
import uidiagram.diagram.edit.parts.TableRow2EditPart;
import uidiagram.diagram.edit.parts.TableRowEditPart;
import uidiagram.diagram.edit.parts.TableRowName2EditPart;
import uidiagram.diagram.edit.parts.TableRowNameEditPart;
import uidiagram.diagram.edit.parts.TableRowTableRowLstChildModelElementsCompartment2EditPart;
import uidiagram.diagram.edit.parts.TableRowTableRowLstChildModelElementsCompartmentEditPart;
import uidiagram.diagram.edit.parts.TableTableLstChildModelElementsCompartment2EditPart;
import uidiagram.diagram.edit.parts.TableTableLstChildModelElementsCompartmentEditPart;
import uidiagram.diagram.edit.parts.TextInput2EditPart;
import uidiagram.diagram.edit.parts.TextInputEditPart;
import uidiagram.diagram.edit.parts.TextInputName2EditPart;
import uidiagram.diagram.edit.parts.TextInputNameEditPart;
import uidiagram.diagram.edit.parts.Ui_DiagramEditPart;
import uidiagram.diagram.edit.parts.UserInterface2EditPart;
import uidiagram.diagram.edit.parts.UserInterface3EditPart;
import uidiagram.diagram.edit.parts.UserInterfaceEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceName2EditPart;
import uidiagram.diagram.edit.parts.UserInterfaceName3EditPart;
import uidiagram.diagram.edit.parts.UserInterfaceNameEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceUserInterfaceListWidgetsCompartment2EditPart;
import uidiagram.diagram.edit.parts.UserInterfaceUserInterfaceListWidgetsCompartment3EditPart;
import uidiagram.diagram.edit.parts.UserInterfaceUserInterfaceListWidgetsCompartmentEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class UidiagramVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "uidiagram.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (Ui_DiagramEditPart.MODEL_ID.equals(view.getType())) {
				return Ui_DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				UidiagramDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (UidiagramPackage.eINSTANCE.getUi_Diagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Ui_Diagram) domainElement)) {
			return Ui_DiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getModelID(containerView);
		if (!Ui_DiagramEditPart.MODEL_ID.equals(containerModelID) && !"uidiagram".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (Ui_DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Ui_DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case Ui_DiagramEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getUserInterface().isSuperTypeOf(domainElement.eClass())) {
				return UserInterfaceEditPart.VISUAL_ID;
			}
			break;
		case UserInterfaceUserInterfaceListWidgetsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return CheckBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getImg().isSuperTypeOf(domainElement.eClass())) {
				return ImgEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTableRow().isSuperTypeOf(domainElement.eClass())) {
				return TableRow2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButton2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getFloatingButton().isSuperTypeOf(domainElement.eClass())) {
				return FloatingButton2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getUserInterface().isSuperTypeOf(domainElement.eClass())) {
				return UserInterface3EditPart.VISUAL_ID;
			}
			break;
		case TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return CheckBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInput2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getImg().isSuperTypeOf(domainElement.eClass())) {
				return Img2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTableRow().isSuperTypeOf(domainElement.eClass())) {
				return TableRowEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getFloatingButton().isSuperTypeOf(domainElement.eClass())) {
				return FloatingButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getUserInterface().isSuperTypeOf(domainElement.eClass())) {
				return UserInterface2EditPart.VISUAL_ID;
			}
			break;
		case TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return CheckBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInput2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getImg().isSuperTypeOf(domainElement.eClass())) {
				return Img2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTableRow().isSuperTypeOf(domainElement.eClass())) {
				return TableRowEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getFloatingButton().isSuperTypeOf(domainElement.eClass())) {
				return FloatingButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getUserInterface().isSuperTypeOf(domainElement.eClass())) {
				return UserInterface2EditPart.VISUAL_ID;
			}
			break;
		case TableRowTableRowLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return CheckBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInput2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getImg().isSuperTypeOf(domainElement.eClass())) {
				return Img2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTableRow().isSuperTypeOf(domainElement.eClass())) {
				return TableRowEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getFloatingButton().isSuperTypeOf(domainElement.eClass())) {
				return FloatingButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getUserInterface().isSuperTypeOf(domainElement.eClass())) {
				return UserInterface2EditPart.VISUAL_ID;
			}
			break;
		case UserInterfaceUserInterfaceListWidgetsCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return CheckBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getImg().isSuperTypeOf(domainElement.eClass())) {
				return ImgEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTableRow().isSuperTypeOf(domainElement.eClass())) {
				return TableRow2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButton2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getFloatingButton().isSuperTypeOf(domainElement.eClass())) {
				return FloatingButton2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getUserInterface().isSuperTypeOf(domainElement.eClass())) {
				return UserInterface3EditPart.VISUAL_ID;
			}
			break;
		case TableRowTableRowLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return CheckBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInput2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getImg().isSuperTypeOf(domainElement.eClass())) {
				return Img2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTableRow().isSuperTypeOf(domainElement.eClass())) {
				return TableRowEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getFloatingButton().isSuperTypeOf(domainElement.eClass())) {
				return FloatingButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getUserInterface().isSuperTypeOf(domainElement.eClass())) {
				return UserInterface2EditPart.VISUAL_ID;
			}
			break;
		case UserInterfaceUserInterfaceListWidgetsCompartment3EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return CheckBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getImg().isSuperTypeOf(domainElement.eClass())) {
				return ImgEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTableRow().isSuperTypeOf(domainElement.eClass())) {
				return TableRow2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButton2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getFloatingButton().isSuperTypeOf(domainElement.eClass())) {
				return FloatingButton2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getUserInterface().isSuperTypeOf(domainElement.eClass())) {
				return UserInterface3EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getModelID(containerView);
		if (!Ui_DiagramEditPart.MODEL_ID.equals(containerModelID) && !"uidiagram".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (Ui_DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Ui_DiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case Ui_DiagramEditPart.VISUAL_ID:
			if (UserInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserInterfaceEditPart.VISUAL_ID:
			if (UserInterfaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserInterfaceUserInterfaceListWidgetsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ButtonEditPart.VISUAL_ID:
			if (ButtonNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LabelEditPart.VISUAL_ID:
			if (LabelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CheckBoxEditPart.VISUAL_ID:
			if (CheckBoxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextInputEditPart.VISUAL_ID:
			if (TextInputNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImgEditPart.VISUAL_ID:
			if (ImgNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableEditPart.VISUAL_ID:
			if (TableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Button2EditPart.VISUAL_ID:
			if (ButtonName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Label2EditPart.VISUAL_ID:
			if (LabelName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CheckBox2EditPart.VISUAL_ID:
			if (CheckBoxName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextInput2EditPart.VISUAL_ID:
			if (TextInputName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Img2EditPart.VISUAL_ID:
			if (ImgName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Table2EditPart.VISUAL_ID:
			if (TableName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableRowEditPart.VISUAL_ID:
			if (TableRowNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableRowTableRowLstChildModelElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComboBoxEditPart.VISUAL_ID:
			if (ComboBoxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RadioButtonEditPart.VISUAL_ID:
			if (RadioButtonNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FloatingButtonEditPart.VISUAL_ID:
			if (FloatingButtonNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserInterface2EditPart.VISUAL_ID:
			if (UserInterfaceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserInterfaceUserInterfaceListWidgetsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableRow2EditPart.VISUAL_ID:
			if (TableRowName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableRowTableRowLstChildModelElementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComboBox2EditPart.VISUAL_ID:
			if (ComboBoxName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RadioButton2EditPart.VISUAL_ID:
			if (RadioButtonName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FloatingButton2EditPart.VISUAL_ID:
			if (FloatingButtonName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserInterface3EditPart.VISUAL_ID:
			if (UserInterfaceName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserInterfaceUserInterfaceListWidgetsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserInterfaceUserInterfaceListWidgetsCompartmentEditPart.VISUAL_ID:
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImgEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableRow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FloatingButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserInterface3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (Button2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInput2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Img2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableRowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FloatingButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserInterface2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (Button2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInput2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Img2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableRowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FloatingButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserInterface2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableRowTableRowLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (Button2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInput2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Img2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableRowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FloatingButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserInterface2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserInterfaceUserInterfaceListWidgetsCompartment2EditPart.VISUAL_ID:
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImgEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableRow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FloatingButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserInterface3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableRowTableRowLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (Button2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInput2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Img2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableRowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FloatingButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserInterface2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserInterfaceUserInterfaceListWidgetsCompartment3EditPart.VISUAL_ID:
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImgEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableRow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FloatingButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserInterface3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Ui_Diagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case UserInterfaceUserInterfaceListWidgetsCompartmentEditPart.VISUAL_ID:
		case TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID:
		case TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID:
		case TableRowTableRowLstChildModelElementsCompartmentEditPart.VISUAL_ID:
		case UserInterfaceUserInterfaceListWidgetsCompartment2EditPart.VISUAL_ID:
		case TableRowTableRowLstChildModelElementsCompartment2EditPart.VISUAL_ID:
		case UserInterfaceUserInterfaceListWidgetsCompartment3EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case Ui_DiagramEditPart.VISUAL_ID:
			return false;
		case Button2EditPart.VISUAL_ID:
		case Label2EditPart.VISUAL_ID:
		case CheckBox2EditPart.VISUAL_ID:
		case TextInput2EditPart.VISUAL_ID:
		case Img2EditPart.VISUAL_ID:
		case ComboBoxEditPart.VISUAL_ID:
		case RadioButtonEditPart.VISUAL_ID:
		case ButtonEditPart.VISUAL_ID:
		case LabelEditPart.VISUAL_ID:
		case CheckBoxEditPart.VISUAL_ID:
		case TextInputEditPart.VISUAL_ID:
		case ImgEditPart.VISUAL_ID:
		case ComboBox2EditPart.VISUAL_ID:
		case RadioButton2EditPart.VISUAL_ID:
		case FloatingButtonEditPart.VISUAL_ID:
		case FloatingButton2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
