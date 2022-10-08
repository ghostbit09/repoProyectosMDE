
/*
 * 
 */
package uidiagram.diagram.part;

import java.util.ArrayList;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class UidiagramPaletteFactory {

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
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createButton1CreationTool());
		paletteContainer.add(createCheckBox2CreationTool());
		paletteContainer.add(createColumn3CreationTool());
		paletteContainer.add(createComboBox4CreationTool());
		paletteContainer.add(createDropDown5CreationTool());
		paletteContainer.add(createGroup6CreationTool());
		paletteContainer.add(createIcon7CreationTool());
		paletteContainer.add(createImg8CreationTool());
		paletteContainer.add(createLabel9CreationTool());
		paletteContainer.add(createMenu10CreationTool());
		paletteContainer.add(createRadioButton11CreationTool());
		paletteContainer.add(createTable12CreationTool());
		paletteContainer.add(createTextInput13CreationTool());
		paletteContainer.add(createUserInterface14CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createButton1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Button_3003);
		types.add(UidiagramElementTypes.Button_3016);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Button1CreationTool_title,
				Messages.Button1CreationTool_desc, types);
		entry.setId("createButton1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Button_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCheckBox2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.CheckBox_3005);
		types.add(UidiagramElementTypes.CheckBox_3018);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CheckBox2CreationTool_title,
				Messages.CheckBox2CreationTool_desc, types);
		entry.setId("createCheckBox2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.CheckBox_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createColumn3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Column_3012);
		types.add(UidiagramElementTypes.Column_3025);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Column3CreationTool_title,
				Messages.Column3CreationTool_desc, types);
		entry.setId("createColumn3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Column_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createComboBox4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.ComboBox_3013);
		types.add(UidiagramElementTypes.ComboBox_3026);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ComboBox4CreationTool_title,
				Messages.ComboBox4CreationTool_desc, types);
		entry.setId("createComboBox4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.ComboBox_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDropDown5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.DropDown_3007);
		types.add(UidiagramElementTypes.DropDown_3020);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DropDown5CreationTool_title,
				Messages.DropDown5CreationTool_desc, types);
		entry.setId("createDropDown5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.DropDown_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGroup6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Group_3001);
		types.add(UidiagramElementTypes.Group_3002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Group6CreationTool_title,
				Messages.Group6CreationTool_desc, types);
		entry.setId("createGroup6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Group_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIcon7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Icon_3010);
		types.add(UidiagramElementTypes.Icon_3023);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Icon7CreationTool_title,
				Messages.Icon7CreationTool_desc, types);
		entry.setId("createIcon7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Icon_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImg8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Img_3009);
		types.add(UidiagramElementTypes.Img_3022);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Img8CreationTool_title,
				Messages.Img8CreationTool_desc, types);
		entry.setId("createImg8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Img_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLabel9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Label_3004);
		types.add(UidiagramElementTypes.Label_3017);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Label9CreationTool_title,
				Messages.Label9CreationTool_desc, types);
		entry.setId("createLabel9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Label_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMenu10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Menu_3008);
		types.add(UidiagramElementTypes.Menu_3021);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Menu10CreationTool_title,
				Messages.Menu10CreationTool_desc, types);
		entry.setId("createMenu10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Menu_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRadioButton11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.RadioButton_3014);
		types.add(UidiagramElementTypes.RadioButton_3027);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RadioButton11CreationTool_title,
				Messages.RadioButton11CreationTool_desc, types);
		entry.setId("createRadioButton11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.RadioButton_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTable12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Table_3011);
		types.add(UidiagramElementTypes.Table_3024);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Table12CreationTool_title,
				Messages.Table12CreationTool_desc, types);
		entry.setId("createTable12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Table_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTextInput13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.TextInput_3006);
		types.add(UidiagramElementTypes.TextInput_3019);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TextInput13CreationTool_title,
				Messages.TextInput13CreationTool_desc, types);
		entry.setId("createTextInput13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.TextInput_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserInterface14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UidiagramElementTypes.UserInterface_2001);
		types.add(UidiagramElementTypes.UserInterface_3015);
		types.add(UidiagramElementTypes.UserInterface_3028);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UserInterface14CreationTool_title,
				Messages.UserInterface14CreationTool_desc, types);
		entry.setId("createUserInterface14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.UserInterface_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
