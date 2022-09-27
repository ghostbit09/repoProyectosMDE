/*
* 
*/
package ui_diagram.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class Ui_diagramVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "ui_concrete.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ui_diagram.diagram.edit.parts.UI_DiagramEditPart.MODEL_ID.equals(view.getType())) {
				return ui_diagram.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getVisualID(view.getType());
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
				ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
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
		if (ui_diagram.Ui_diagramPackage.eINSTANCE.getUI_Diagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ui_diagram.UI_Diagram) domainElement)) {
			return ui_diagram.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID;
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
		String containerModelID = ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getModelID(containerView);
		if (!ui_diagram.diagram.edit.parts.UI_DiagramEditPart.MODEL_ID.equals(containerModelID)
				&& !"ui_diagram".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ui_diagram.diagram.edit.parts.UI_DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ui_diagram.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ui_diagram.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getUserInterface().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID;
			}
			break;
		case ui_diagram.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.GroupEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.Button2EditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.Label2EditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.TextInput2EditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getDropDown().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.DropDown2EditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getMenu().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.Menu2EditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getImg().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.Img2EditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getIcon().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.Icon2EditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.Table2EditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.ComboBox2EditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID;
			}
			break;
		case ui_diagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.Group2EditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.ButtonEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.LabelEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.TextInputEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getDropDown().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.DropDownEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getMenu().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.MenuEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getImg().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.ImgEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getIcon().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.IconEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.TableEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.ComboBoxEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID;
			}
			break;
		case ui_diagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.Group2EditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.ButtonEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.LabelEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.TextInputEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getDropDown().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.DropDownEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getMenu().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.MenuEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getImg().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.ImgEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getIcon().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.IconEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.TableEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.ComboBoxEditPart.VISUAL_ID;
			}
			if (ui_diagram.Ui_diagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return ui_diagram.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getModelID(containerView);
		if (!ui_diagram.diagram.edit.parts.UI_DiagramEditPart.MODEL_ID.equals(containerModelID)
				&& !"ui_diagram".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ui_diagram.diagram.edit.parts.UI_DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ui_diagram.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ui_diagram.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.UserInterfaceTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.GroupTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.GroupTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.ButtonTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.LabelTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.CheckBoxTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.TextInputEditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.TextInputTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.DropDownEditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.DropDownTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.MenuEditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.MenuTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.ImgEditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.ImgTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.IconEditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.IconTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.TableEditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.TableTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.ComboBoxEditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.ComboBoxTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.RadioButtonTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.Button2EditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.ButtonTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.Label2EditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.LabelTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.CheckBoxTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.TextInput2EditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.TextInputTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.DropDown2EditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.DropDownTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.Menu2EditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.MenuTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.Img2EditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.ImgTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.Icon2EditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.IconTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.Table2EditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.TableTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.ComboBox2EditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.ComboBoxTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.RadioButtonTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.Button2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.Label2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.TextInput2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.DropDown2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.Menu2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.Img2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.Icon2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.Table2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.ComboBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.DropDownEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.MenuEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.ImgEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.IconEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.ComboBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_diagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (ui_diagram.diagram.edit.parts.Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.DropDownEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.MenuEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.ImgEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.IconEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.ComboBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_diagram.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(ui_diagram.UI_Diagram element) {
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
		case ui_diagram.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID:
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
		case ui_diagram.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			return false;
		case ui_diagram.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.LabelEditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.TextInputEditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.DropDownEditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.MenuEditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.ImgEditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.IconEditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.TableEditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.ComboBoxEditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.Button2EditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.Label2EditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.TextInput2EditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.DropDown2EditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.Menu2EditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.Img2EditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.Icon2EditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.Table2EditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.ComboBox2EditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID:
		case ui_diagram.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID:
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
			return ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
