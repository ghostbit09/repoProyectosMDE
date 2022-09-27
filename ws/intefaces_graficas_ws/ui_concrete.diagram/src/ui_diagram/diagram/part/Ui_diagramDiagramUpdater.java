/*
* 
*/
package ui_diagram.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class Ui_diagramDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ui_diagram.diagram.part.Ui_diagramNodeDescriptor> getSemanticChildren(View view) {
		switch (ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getVisualID(view)) {
		case ui_diagram.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			return getUI_Diagram_1000SemanticChildren(view);
		case ui_diagram.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
			return getUserInterfaceUserInterfaceLstModelElementsCompartment_7001SemanticChildren(view);
		case ui_diagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			return getGroupGroupLstChildModelElementsCompartment_7002SemanticChildren(view);
		case ui_diagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			return getGroupGroupLstChildModelElementsCompartment_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ui_diagram.diagram.part.Ui_diagramNodeDescriptor> getUI_Diagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ui_diagram.UI_Diagram modelElement = (ui_diagram.UI_Diagram) view.getElement();
		LinkedList<ui_diagram.diagram.part.Ui_diagramNodeDescriptor> result = new LinkedList<ui_diagram.diagram.part.Ui_diagramNodeDescriptor>();
		{
			ui_diagram.UserInterface childElement = modelElement.getUserInterface();
			int visualID = ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ui_diagram.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ui_diagram.diagram.part.Ui_diagramNodeDescriptor> getUserInterfaceUserInterfaceLstModelElementsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ui_diagram.UserInterface modelElement = (ui_diagram.UserInterface) containerView.getElement();
		LinkedList<ui_diagram.diagram.part.Ui_diagramNodeDescriptor> result = new LinkedList<ui_diagram.diagram.part.Ui_diagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstModelElements().iterator(); it.hasNext();) {
			ui_diagram.ModelElement childElement = (ui_diagram.ModelElement) it.next();
			int visualID = ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ui_diagram.diagram.edit.parts.GroupEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.Button2EditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.Label2EditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.TextInput2EditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.DropDown2EditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.Menu2EditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.Img2EditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.Icon2EditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.Table2EditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.ComboBox2EditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ui_diagram.diagram.part.Ui_diagramNodeDescriptor> getGroupGroupLstChildModelElementsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ui_diagram.Group modelElement = (ui_diagram.Group) containerView.getElement();
		LinkedList<ui_diagram.diagram.part.Ui_diagramNodeDescriptor> result = new LinkedList<ui_diagram.diagram.part.Ui_diagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstChildModelElements().iterator(); it.hasNext();) {
			ui_diagram.ModelElement childElement = (ui_diagram.ModelElement) it.next();
			int visualID = ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ui_diagram.diagram.edit.parts.Group2EditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.ButtonEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.LabelEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.TextInputEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.DropDownEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.MenuEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.ImgEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.IconEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.TableEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.ComboBoxEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ui_diagram.diagram.part.Ui_diagramNodeDescriptor> getGroupGroupLstChildModelElementsCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ui_diagram.Group modelElement = (ui_diagram.Group) containerView.getElement();
		LinkedList<ui_diagram.diagram.part.Ui_diagramNodeDescriptor> result = new LinkedList<ui_diagram.diagram.part.Ui_diagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstChildModelElements().iterator(); it.hasNext();) {
			ui_diagram.ModelElement childElement = (ui_diagram.ModelElement) it.next();
			int visualID = ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ui_diagram.diagram.edit.parts.Group2EditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.ButtonEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.LabelEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.TextInputEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.DropDownEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.MenuEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.ImgEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.IconEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.TableEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.ComboBoxEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_diagram.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID) {
				result.add(new ui_diagram.diagram.part.Ui_diagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getContainedLinks(View view) {
		switch (ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getVisualID(view)) {
		case ui_diagram.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			return getUI_Diagram_1000ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_3001ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getGroup_3002ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return getButton_3003ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return getLabel_3004ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3005ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.TextInputEditPart.VISUAL_ID:
			return getTextInput_3006ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.DropDownEditPart.VISUAL_ID:
			return getDropDown_3007ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.MenuEditPart.VISUAL_ID:
			return getMenu_3008ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.ImgEditPart.VISUAL_ID:
			return getImg_3009ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.IconEditPart.VISUAL_ID:
			return getIcon_3010ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.TableEditPart.VISUAL_ID:
			return getTable_3011ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3012ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3023ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.Button2EditPart.VISUAL_ID:
			return getButton_3013ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.Label2EditPart.VISUAL_ID:
			return getLabel_3014ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_3015ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.TextInput2EditPart.VISUAL_ID:
			return getTextInput_3016ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.DropDown2EditPart.VISUAL_ID:
			return getDropDown_3017ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.Menu2EditPart.VISUAL_ID:
			return getMenu_3018ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.Img2EditPart.VISUAL_ID:
			return getImg_3019ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.Icon2EditPart.VISUAL_ID:
			return getIcon_3020ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.Table2EditPart.VISUAL_ID:
			return getTable_3021ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3022ContainedLinks(view);
		case ui_diagram.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3024ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getIncomingLinks(View view) {
		switch (ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getVisualID(view)) {
		case ui_diagram.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_3001IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getGroup_3002IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return getButton_3003IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return getLabel_3004IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3005IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.TextInputEditPart.VISUAL_ID:
			return getTextInput_3006IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.DropDownEditPart.VISUAL_ID:
			return getDropDown_3007IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.MenuEditPart.VISUAL_ID:
			return getMenu_3008IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.ImgEditPart.VISUAL_ID:
			return getImg_3009IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.IconEditPart.VISUAL_ID:
			return getIcon_3010IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.TableEditPart.VISUAL_ID:
			return getTable_3011IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3012IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3023IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.Button2EditPart.VISUAL_ID:
			return getButton_3013IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.Label2EditPart.VISUAL_ID:
			return getLabel_3014IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_3015IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.TextInput2EditPart.VISUAL_ID:
			return getTextInput_3016IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.DropDown2EditPart.VISUAL_ID:
			return getDropDown_3017IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.Menu2EditPart.VISUAL_ID:
			return getMenu_3018IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.Img2EditPart.VISUAL_ID:
			return getImg_3019IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.Icon2EditPart.VISUAL_ID:
			return getIcon_3020IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.Table2EditPart.VISUAL_ID:
			return getTable_3021IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3022IncomingLinks(view);
		case ui_diagram.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3024IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getOutgoingLinks(View view) {
		switch (ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getVisualID(view)) {
		case ui_diagram.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_3001OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getGroup_3002OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return getButton_3003OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return getLabel_3004OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3005OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.TextInputEditPart.VISUAL_ID:
			return getTextInput_3006OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.DropDownEditPart.VISUAL_ID:
			return getDropDown_3007OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.MenuEditPart.VISUAL_ID:
			return getMenu_3008OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.ImgEditPart.VISUAL_ID:
			return getImg_3009OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.IconEditPart.VISUAL_ID:
			return getIcon_3010OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.TableEditPart.VISUAL_ID:
			return getTable_3011OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3012OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3023OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.Button2EditPart.VISUAL_ID:
			return getButton_3013OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.Label2EditPart.VISUAL_ID:
			return getLabel_3014OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_3015OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.TextInput2EditPart.VISUAL_ID:
			return getTextInput_3016OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.DropDown2EditPart.VISUAL_ID:
			return getDropDown_3017OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.Menu2EditPart.VISUAL_ID:
			return getMenu_3018OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.Img2EditPart.VISUAL_ID:
			return getImg_3019OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.Icon2EditPart.VISUAL_ID:
			return getIcon_3020OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.Table2EditPart.VISUAL_ID:
			return getTable_3021OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3022OutgoingLinks(view);
		case ui_diagram.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3024OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getUI_Diagram_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getUserInterface_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getGroup_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getGroup_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getButton_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getLabel_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getCheckBox_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getTextInput_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getDropDown_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getMenu_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getImg_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getIcon_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getTable_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getComboBox_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getRadioButton_3023ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getButton_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getLabel_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getCheckBox_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getTextInput_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getDropDown_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getMenu_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getImg_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getIcon_3020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getTable_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getComboBox_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getRadioButton_3024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getUserInterface_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getGroup_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getGroup_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getButton_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getLabel_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getCheckBox_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getTextInput_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getDropDown_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getMenu_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getImg_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getIcon_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getTable_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getComboBox_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getRadioButton_3023IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getButton_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getLabel_3014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getCheckBox_3015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getTextInput_3016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getDropDown_3017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getMenu_3018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getImg_3019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getIcon_3020IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getTable_3021IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getComboBox_3022IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getRadioButton_3024IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getUserInterface_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getGroup_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getGroup_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getButton_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getLabel_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getCheckBox_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getTextInput_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getDropDown_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getMenu_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getImg_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getIcon_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getTable_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getComboBox_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getRadioButton_3023OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getButton_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getLabel_3014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getCheckBox_3015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getTextInput_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getDropDown_3017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getMenu_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getImg_3019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getIcon_3020OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getTable_3021OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getComboBox_3022OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getRadioButton_3024OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ui_diagram.diagram.part.Ui_diagramNodeDescriptor> getSemanticChildren(View view) {
			return Ui_diagramDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getContainedLinks(View view) {
			return Ui_diagramDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getIncomingLinks(View view) {
			return Ui_diagramDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ui_diagram.diagram.part.Ui_diagramLinkDescriptor> getOutgoingLinks(View view) {
			return Ui_diagramDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
