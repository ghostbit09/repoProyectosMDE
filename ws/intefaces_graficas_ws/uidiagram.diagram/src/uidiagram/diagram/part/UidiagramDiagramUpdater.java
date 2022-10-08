/*
* 
*/
package uidiagram.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import uidiagram.Group;
import uidiagram.ModelElement;
import uidiagram.Table;
import uidiagram.Ui_Diagram;
import uidiagram.UserInterface;
import uidiagram.diagram.edit.parts.Button2EditPart;
import uidiagram.diagram.edit.parts.ButtonEditPart;
import uidiagram.diagram.edit.parts.CheckBox2EditPart;
import uidiagram.diagram.edit.parts.CheckBoxEditPart;
import uidiagram.diagram.edit.parts.Column2EditPart;
import uidiagram.diagram.edit.parts.ColumnEditPart;
import uidiagram.diagram.edit.parts.ComboBox2EditPart;
import uidiagram.diagram.edit.parts.ComboBoxEditPart;
import uidiagram.diagram.edit.parts.DropDown2EditPart;
import uidiagram.diagram.edit.parts.DropDownEditPart;
import uidiagram.diagram.edit.parts.Group2EditPart;
import uidiagram.diagram.edit.parts.GroupEditPart;
import uidiagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartment2EditPart;
import uidiagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartmentEditPart;
import uidiagram.diagram.edit.parts.Icon2EditPart;
import uidiagram.diagram.edit.parts.IconEditPart;
import uidiagram.diagram.edit.parts.Img2EditPart;
import uidiagram.diagram.edit.parts.ImgEditPart;
import uidiagram.diagram.edit.parts.Label2EditPart;
import uidiagram.diagram.edit.parts.LabelEditPart;
import uidiagram.diagram.edit.parts.Menu2EditPart;
import uidiagram.diagram.edit.parts.MenuEditPart;
import uidiagram.diagram.edit.parts.RadioButton2EditPart;
import uidiagram.diagram.edit.parts.RadioButtonEditPart;
import uidiagram.diagram.edit.parts.Table2EditPart;
import uidiagram.diagram.edit.parts.TableEditPart;
import uidiagram.diagram.edit.parts.TableTableLstChildModelElementsCompartment2EditPart;
import uidiagram.diagram.edit.parts.TableTableLstChildModelElementsCompartmentEditPart;
import uidiagram.diagram.edit.parts.TextInput2EditPart;
import uidiagram.diagram.edit.parts.TextInputEditPart;
import uidiagram.diagram.edit.parts.Ui_DiagramEditPart;
import uidiagram.diagram.edit.parts.UserInterface2EditPart;
import uidiagram.diagram.edit.parts.UserInterface3EditPart;
import uidiagram.diagram.edit.parts.UserInterfaceEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceUserInterfaceListWidgetsCompartment2EditPart;
import uidiagram.diagram.edit.parts.UserInterfaceUserInterfaceListWidgetsCompartment3EditPart;
import uidiagram.diagram.edit.parts.UserInterfaceUserInterfaceListWidgetsCompartmentEditPart;

/**
 * @generated
 */
public class UidiagramDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getSemanticChildren(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case Ui_DiagramEditPart.VISUAL_ID:
			return getUi_Diagram_1000SemanticChildren(view);
		case UserInterfaceUserInterfaceListWidgetsCompartmentEditPart.VISUAL_ID:
			return getUserInterfaceUserInterfaceListWidgetsCompartment_7001SemanticChildren(view);
		case GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			return getGroupGroupLstChildModelElementsCompartment_7002SemanticChildren(view);
		case GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			return getGroupGroupLstChildModelElementsCompartment_7003SemanticChildren(view);
		case TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			return getTableTableLstChildModelElementsCompartment_7004SemanticChildren(view);
		case UserInterfaceUserInterfaceListWidgetsCompartment2EditPart.VISUAL_ID:
			return getUserInterfaceUserInterfaceListWidgetsCompartment_7005SemanticChildren(view);
		case TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			return getTableTableLstChildModelElementsCompartment_7006SemanticChildren(view);
		case UserInterfaceUserInterfaceListWidgetsCompartment3EditPart.VISUAL_ID:
			return getUserInterfaceUserInterfaceListWidgetsCompartment_7007SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getUi_Diagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Ui_Diagram modelElement = (Ui_Diagram) view.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListUserInterface().iterator(); it.hasNext();) {
			UserInterface childElement = (UserInterface) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UserInterfaceEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getUserInterfaceUserInterfaceListWidgetsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UserInterface modelElement = (UserInterface) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListWidgets().iterator(); it.hasNext();) {
			ModelElement childElement = (ModelElement) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GroupEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Button2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Label2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextInput2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DropDown2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Menu2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Img2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Icon2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Table2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Column2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButton2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UserInterface3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getGroupGroupLstChildModelElementsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Group modelElement = (Group) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstChildModelElements().iterator(); it.hasNext();) {
			ModelElement childElement = (ModelElement) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Group2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LabelEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextInputEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DropDownEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MenuEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ImgEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IconEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TableEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ColumnEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UserInterface2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getGroupGroupLstChildModelElementsCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Group modelElement = (Group) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstChildModelElements().iterator(); it.hasNext();) {
			ModelElement childElement = (ModelElement) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Group2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LabelEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextInputEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DropDownEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MenuEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ImgEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IconEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TableEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ColumnEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UserInterface2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getTableTableLstChildModelElementsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Table modelElement = (Table) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstChildModelElements().iterator(); it.hasNext();) {
			ModelElement childElement = (ModelElement) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Group2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LabelEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextInputEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DropDownEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MenuEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ImgEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IconEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TableEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ColumnEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UserInterface2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getUserInterfaceUserInterfaceListWidgetsCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UserInterface modelElement = (UserInterface) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListWidgets().iterator(); it.hasNext();) {
			ModelElement childElement = (ModelElement) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GroupEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Button2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Label2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextInput2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DropDown2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Menu2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Img2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Icon2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Table2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Column2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButton2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UserInterface3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getTableTableLstChildModelElementsCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Table modelElement = (Table) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstChildModelElements().iterator(); it.hasNext();) {
			ModelElement childElement = (ModelElement) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Group2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LabelEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextInputEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DropDownEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MenuEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ImgEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IconEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TableEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ColumnEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UserInterface2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getUserInterfaceUserInterfaceListWidgetsCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UserInterface modelElement = (UserInterface) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListWidgets().iterator(); it.hasNext();) {
			ModelElement childElement = (ModelElement) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GroupEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Button2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Label2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextInput2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DropDown2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Menu2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Img2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Icon2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Table2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Column2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButton2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UserInterface3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getContainedLinks(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case Ui_DiagramEditPart.VISUAL_ID:
			return getUi_Diagram_1000ContainedLinks(view);
		case UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001ContainedLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3001ContainedLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3002ContainedLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3003ContainedLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3004ContainedLinks(view);
		case CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3005ContainedLinks(view);
		case TextInputEditPart.VISUAL_ID:
			return getTextInput_3006ContainedLinks(view);
		case DropDownEditPart.VISUAL_ID:
			return getDropDown_3007ContainedLinks(view);
		case MenuEditPart.VISUAL_ID:
			return getMenu_3008ContainedLinks(view);
		case ImgEditPart.VISUAL_ID:
			return getImg_3009ContainedLinks(view);
		case IconEditPart.VISUAL_ID:
			return getIcon_3010ContainedLinks(view);
		case TableEditPart.VISUAL_ID:
			return getTable_3011ContainedLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3012ContainedLinks(view);
		case ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3013ContainedLinks(view);
		case RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3014ContainedLinks(view);
		case UserInterface2EditPart.VISUAL_ID:
			return getUserInterface_3015ContainedLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3016ContainedLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3017ContainedLinks(view);
		case CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_3018ContainedLinks(view);
		case TextInput2EditPart.VISUAL_ID:
			return getTextInput_3019ContainedLinks(view);
		case DropDown2EditPart.VISUAL_ID:
			return getDropDown_3020ContainedLinks(view);
		case Menu2EditPart.VISUAL_ID:
			return getMenu_3021ContainedLinks(view);
		case Img2EditPart.VISUAL_ID:
			return getImg_3022ContainedLinks(view);
		case Icon2EditPart.VISUAL_ID:
			return getIcon_3023ContainedLinks(view);
		case Table2EditPart.VISUAL_ID:
			return getTable_3024ContainedLinks(view);
		case Column2EditPart.VISUAL_ID:
			return getColumn_3025ContainedLinks(view);
		case ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3026ContainedLinks(view);
		case RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3027ContainedLinks(view);
		case UserInterface3EditPart.VISUAL_ID:
			return getUserInterface_3028ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getIncomingLinks(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001IncomingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3001IncomingLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3002IncomingLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3003IncomingLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3004IncomingLinks(view);
		case CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3005IncomingLinks(view);
		case TextInputEditPart.VISUAL_ID:
			return getTextInput_3006IncomingLinks(view);
		case DropDownEditPart.VISUAL_ID:
			return getDropDown_3007IncomingLinks(view);
		case MenuEditPart.VISUAL_ID:
			return getMenu_3008IncomingLinks(view);
		case ImgEditPart.VISUAL_ID:
			return getImg_3009IncomingLinks(view);
		case IconEditPart.VISUAL_ID:
			return getIcon_3010IncomingLinks(view);
		case TableEditPart.VISUAL_ID:
			return getTable_3011IncomingLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3012IncomingLinks(view);
		case ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3013IncomingLinks(view);
		case RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3014IncomingLinks(view);
		case UserInterface2EditPart.VISUAL_ID:
			return getUserInterface_3015IncomingLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3016IncomingLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3017IncomingLinks(view);
		case CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_3018IncomingLinks(view);
		case TextInput2EditPart.VISUAL_ID:
			return getTextInput_3019IncomingLinks(view);
		case DropDown2EditPart.VISUAL_ID:
			return getDropDown_3020IncomingLinks(view);
		case Menu2EditPart.VISUAL_ID:
			return getMenu_3021IncomingLinks(view);
		case Img2EditPart.VISUAL_ID:
			return getImg_3022IncomingLinks(view);
		case Icon2EditPart.VISUAL_ID:
			return getIcon_3023IncomingLinks(view);
		case Table2EditPart.VISUAL_ID:
			return getTable_3024IncomingLinks(view);
		case Column2EditPart.VISUAL_ID:
			return getColumn_3025IncomingLinks(view);
		case ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3026IncomingLinks(view);
		case RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3027IncomingLinks(view);
		case UserInterface3EditPart.VISUAL_ID:
			return getUserInterface_3028IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getOutgoingLinks(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001OutgoingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3001OutgoingLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3002OutgoingLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3003OutgoingLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3004OutgoingLinks(view);
		case CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3005OutgoingLinks(view);
		case TextInputEditPart.VISUAL_ID:
			return getTextInput_3006OutgoingLinks(view);
		case DropDownEditPart.VISUAL_ID:
			return getDropDown_3007OutgoingLinks(view);
		case MenuEditPart.VISUAL_ID:
			return getMenu_3008OutgoingLinks(view);
		case ImgEditPart.VISUAL_ID:
			return getImg_3009OutgoingLinks(view);
		case IconEditPart.VISUAL_ID:
			return getIcon_3010OutgoingLinks(view);
		case TableEditPart.VISUAL_ID:
			return getTable_3011OutgoingLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3012OutgoingLinks(view);
		case ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3013OutgoingLinks(view);
		case RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3014OutgoingLinks(view);
		case UserInterface2EditPart.VISUAL_ID:
			return getUserInterface_3015OutgoingLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3016OutgoingLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3017OutgoingLinks(view);
		case CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_3018OutgoingLinks(view);
		case TextInput2EditPart.VISUAL_ID:
			return getTextInput_3019OutgoingLinks(view);
		case DropDown2EditPart.VISUAL_ID:
			return getDropDown_3020OutgoingLinks(view);
		case Menu2EditPart.VISUAL_ID:
			return getMenu_3021OutgoingLinks(view);
		case Img2EditPart.VISUAL_ID:
			return getImg_3022OutgoingLinks(view);
		case Icon2EditPart.VISUAL_ID:
			return getIcon_3023OutgoingLinks(view);
		case Table2EditPart.VISUAL_ID:
			return getTable_3024OutgoingLinks(view);
		case Column2EditPart.VISUAL_ID:
			return getColumn_3025OutgoingLinks(view);
		case ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3026OutgoingLinks(view);
		case RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3027OutgoingLinks(view);
		case UserInterface3EditPart.VISUAL_ID:
			return getUserInterface_3028OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getUi_Diagram_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getUserInterface_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getGroup_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getGroup_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getButton_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabel_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getCheckBox_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTextInput_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getDropDown_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getMenu_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getImg_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getIcon_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTable_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getColumn_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getComboBox_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getRadioButton_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getUserInterface_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getButton_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabel_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getCheckBox_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTextInput_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getDropDown_3020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getMenu_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getImg_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getIcon_3023ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTable_3024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getColumn_3025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getComboBox_3026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getRadioButton_3027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getUserInterface_3028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getUserInterface_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getGroup_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getGroup_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getButton_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabel_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getCheckBox_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTextInput_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getDropDown_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getMenu_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getImg_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getIcon_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTable_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getColumn_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getComboBox_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getRadioButton_3014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getUserInterface_3015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getButton_3016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabel_3017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getCheckBox_3018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTextInput_3019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getDropDown_3020IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getMenu_3021IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getImg_3022IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getIcon_3023IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTable_3024IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getColumn_3025IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getComboBox_3026IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getRadioButton_3027IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getUserInterface_3028IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getUserInterface_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getGroup_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getGroup_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getButton_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabel_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getCheckBox_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTextInput_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getDropDown_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getMenu_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getImg_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getIcon_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTable_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getColumn_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getComboBox_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getRadioButton_3014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getUserInterface_3015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getButton_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabel_3017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getCheckBox_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTextInput_3019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getDropDown_3020OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getMenu_3021OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getImg_3022OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getIcon_3023OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTable_3024OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getColumn_3025OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getComboBox_3026OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getRadioButton_3027OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getUserInterface_3028OutgoingLinks(View view) {
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

		public List<UidiagramNodeDescriptor> getSemanticChildren(View view) {
			return UidiagramDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UidiagramLinkDescriptor> getContainedLinks(View view) {
			return UidiagramDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UidiagramLinkDescriptor> getIncomingLinks(View view) {
			return UidiagramDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UidiagramLinkDescriptor> getOutgoingLinks(View view) {
			return UidiagramDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
