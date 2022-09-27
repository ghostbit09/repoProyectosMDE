
/*
 * 
 */
package ui_diagram.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class Ui_diagramPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(ui_diagram.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createButton1CreationTool());
		paletteContainer.add(createCheckBox2CreationTool());
		paletteContainer.add(createComboBox3CreationTool());
		paletteContainer.add(createDropDown4CreationTool());
		paletteContainer.add(createGroup5CreationTool());
		paletteContainer.add(createIcon6CreationTool());
		paletteContainer.add(createImg7CreationTool());
		paletteContainer.add(createLabel8CreationTool());
		paletteContainer.add(createMenu9CreationTool());
		paletteContainer.add(createRadioButton10CreationTool());
		paletteContainer.add(createTable11CreationTool());
		paletteContainer.add(createTextInput12CreationTool());
		paletteContainer.add(createUserInterface13CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createButton1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.Button_3003);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.Button_3013);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_diagram.diagram.part.Messages.Button1CreationTool_title,
				ui_diagram.diagram.part.Messages.Button1CreationTool_desc, types);
		entry.setId("createButton1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_diagram.diagram.providers.Ui_diagramElementTypes
				.getImageDescriptor(ui_diagram.diagram.providers.Ui_diagramElementTypes.Button_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCheckBox2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.CheckBox_3005);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.CheckBox_3015);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_diagram.diagram.part.Messages.CheckBox2CreationTool_title,
				ui_diagram.diagram.part.Messages.CheckBox2CreationTool_desc, types);
		entry.setId("createCheckBox2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_diagram.diagram.providers.Ui_diagramElementTypes
				.getImageDescriptor(ui_diagram.diagram.providers.Ui_diagramElementTypes.CheckBox_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createComboBox3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.ComboBox_3012);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.ComboBox_3022);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_diagram.diagram.part.Messages.ComboBox3CreationTool_title,
				ui_diagram.diagram.part.Messages.ComboBox3CreationTool_desc, types);
		entry.setId("createComboBox3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_diagram.diagram.providers.Ui_diagramElementTypes
				.getImageDescriptor(ui_diagram.diagram.providers.Ui_diagramElementTypes.ComboBox_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDropDown4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.DropDown_3007);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.DropDown_3017);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_diagram.diagram.part.Messages.DropDown4CreationTool_title,
				ui_diagram.diagram.part.Messages.DropDown4CreationTool_desc, types);
		entry.setId("createDropDown4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_diagram.diagram.providers.Ui_diagramElementTypes
				.getImageDescriptor(ui_diagram.diagram.providers.Ui_diagramElementTypes.DropDown_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGroup5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.Group_3001);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.Group_3002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(ui_diagram.diagram.part.Messages.Group5CreationTool_title,
				ui_diagram.diagram.part.Messages.Group5CreationTool_desc, types);
		entry.setId("createGroup5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_diagram.diagram.providers.Ui_diagramElementTypes
				.getImageDescriptor(ui_diagram.diagram.providers.Ui_diagramElementTypes.Group_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIcon6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.Icon_3010);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.Icon_3020);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(ui_diagram.diagram.part.Messages.Icon6CreationTool_title,
				ui_diagram.diagram.part.Messages.Icon6CreationTool_desc, types);
		entry.setId("createIcon6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_diagram.diagram.providers.Ui_diagramElementTypes
				.getImageDescriptor(ui_diagram.diagram.providers.Ui_diagramElementTypes.Icon_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImg7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.Img_3009);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.Img_3019);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(ui_diagram.diagram.part.Messages.Img7CreationTool_title,
				ui_diagram.diagram.part.Messages.Img7CreationTool_desc, types);
		entry.setId("createImg7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_diagram.diagram.providers.Ui_diagramElementTypes
				.getImageDescriptor(ui_diagram.diagram.providers.Ui_diagramElementTypes.Img_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLabel8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.Label_3004);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.Label_3014);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(ui_diagram.diagram.part.Messages.Label8CreationTool_title,
				ui_diagram.diagram.part.Messages.Label8CreationTool_desc, types);
		entry.setId("createLabel8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_diagram.diagram.providers.Ui_diagramElementTypes
				.getImageDescriptor(ui_diagram.diagram.providers.Ui_diagramElementTypes.Label_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMenu9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.Menu_3008);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.Menu_3018);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(ui_diagram.diagram.part.Messages.Menu9CreationTool_title,
				ui_diagram.diagram.part.Messages.Menu9CreationTool_desc, types);
		entry.setId("createMenu9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_diagram.diagram.providers.Ui_diagramElementTypes
				.getImageDescriptor(ui_diagram.diagram.providers.Ui_diagramElementTypes.Menu_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRadioButton10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.RadioButton_3023);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.RadioButton_3024);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_diagram.diagram.part.Messages.RadioButton10CreationTool_title,
				ui_diagram.diagram.part.Messages.RadioButton10CreationTool_desc, types);
		entry.setId("createRadioButton10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_diagram.diagram.providers.Ui_diagramElementTypes
				.getImageDescriptor(ui_diagram.diagram.providers.Ui_diagramElementTypes.RadioButton_3023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTable11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.Table_3011);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.Table_3021);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_diagram.diagram.part.Messages.Table11CreationTool_title,
				ui_diagram.diagram.part.Messages.Table11CreationTool_desc, types);
		entry.setId("createTable11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_diagram.diagram.providers.Ui_diagramElementTypes
				.getImageDescriptor(ui_diagram.diagram.providers.Ui_diagramElementTypes.Table_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTextInput12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.TextInput_3006);
		types.add(ui_diagram.diagram.providers.Ui_diagramElementTypes.TextInput_3016);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_diagram.diagram.part.Messages.TextInput12CreationTool_title,
				ui_diagram.diagram.part.Messages.TextInput12CreationTool_desc, types);
		entry.setId("createTextInput12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_diagram.diagram.providers.Ui_diagramElementTypes
				.getImageDescriptor(ui_diagram.diagram.providers.Ui_diagramElementTypes.TextInput_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserInterface13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_diagram.diagram.part.Messages.UserInterface13CreationTool_title,
				ui_diagram.diagram.part.Messages.UserInterface13CreationTool_desc,
				Collections.singletonList(ui_diagram.diagram.providers.Ui_diagramElementTypes.UserInterface_2001));
		entry.setId("createUserInterface13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_diagram.diagram.providers.Ui_diagramElementTypes
				.getImageDescriptor(ui_diagram.diagram.providers.Ui_diagramElementTypes.UserInterface_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
