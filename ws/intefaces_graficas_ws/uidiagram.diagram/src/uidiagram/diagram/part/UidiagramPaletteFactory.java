
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
		paletteContainer.add(createComboBox3CreationTool());
		paletteContainer.add(createFloatingButton4CreationTool());
		paletteContainer.add(createImg5CreationTool());
		paletteContainer.add(createLabel6CreationTool());
		paletteContainer.add(createRadioButton7CreationTool());
		paletteContainer.add(createTable8CreationTool());
		paletteContainer.add(createTableRow9CreationTool());
		paletteContainer.add(createTextInput10CreationTool());
		paletteContainer.add(createUserInterface11CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createButton1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Button_3016);
		types.add(UidiagramElementTypes.Button_3003);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Button1CreationTool_title,
				Messages.Button1CreationTool_desc, types);
		entry.setId("createButton1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Button_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCheckBox2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.CheckBox_3018);
		types.add(UidiagramElementTypes.CheckBox_3005);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CheckBox2CreationTool_title,
				Messages.CheckBox2CreationTool_desc, types);
		entry.setId("createCheckBox2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.CheckBox_3018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createComboBox3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.ComboBox_3013);
		types.add(UidiagramElementTypes.ComboBox_3026);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ComboBox3CreationTool_title,
				Messages.ComboBox3CreationTool_desc, types);
		entry.setId("createComboBox3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.ComboBox_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFloatingButton4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.FloatingButton_3031);
		types.add(UidiagramElementTypes.FloatingButton_3034);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FloatingButton4CreationTool_title,
				Messages.FloatingButton4CreationTool_desc, types);
		entry.setId("createFloatingButton4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.FloatingButton_3031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImg5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Img_3022);
		types.add(UidiagramElementTypes.Img_3009);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Img5CreationTool_title,
				Messages.Img5CreationTool_desc, types);
		entry.setId("createImg5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Img_3022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLabel6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Label_3017);
		types.add(UidiagramElementTypes.Label_3004);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Label6CreationTool_title,
				Messages.Label6CreationTool_desc, types);
		entry.setId("createLabel6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Label_3017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRadioButton7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.RadioButton_3014);
		types.add(UidiagramElementTypes.RadioButton_3027);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RadioButton7CreationTool_title,
				Messages.RadioButton7CreationTool_desc, types);
		entry.setId("createRadioButton7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.RadioButton_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTable8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Table_3024);
		types.add(UidiagramElementTypes.Table_3011);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Table8CreationTool_title,
				Messages.Table8CreationTool_desc, types);
		entry.setId("createTable8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Table_3024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTableRow9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.TableRow_3029);
		types.add(UidiagramElementTypes.TableRow_3032);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TableRow9CreationTool_title,
				Messages.TableRow9CreationTool_desc, types);
		entry.setId("createTableRow9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.TableRow_3029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTextInput10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.TextInput_3019);
		types.add(UidiagramElementTypes.TextInput_3006);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TextInput10CreationTool_title,
				Messages.TextInput10CreationTool_desc, types);
		entry.setId("createTextInput10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.TextInput_3019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserInterface11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UidiagramElementTypes.UserInterface_2001);
		types.add(UidiagramElementTypes.UserInterface_3015);
		types.add(UidiagramElementTypes.UserInterface_3028);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UserInterface11CreationTool_title,
				Messages.UserInterface11CreationTool_desc, types);
		entry.setId("createUserInterface11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.UserInterface_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
