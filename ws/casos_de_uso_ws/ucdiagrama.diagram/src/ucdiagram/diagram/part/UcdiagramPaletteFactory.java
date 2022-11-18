
/*
 * 
 */
package ucdiagram.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import ucdiagram.diagram.providers.UcdiagramElementTypes;

/**
 * @generated
 */
public class UcdiagramPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createActor1CreationTool());
		paletteContainer.add(createLimitBox2CreationTool());
		paletteContainer.add(createUseCase3CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createComRelationship1CreationTool());
		paletteContainer.add(createExtendsRelationship2CreationTool());
		paletteContainer.add(createIncludeRelationship3CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createActor1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Actor1CreationTool_title,
				Messages.Actor1CreationTool_desc, Collections.singletonList(UcdiagramElementTypes.Actor_2002));
		entry.setId("createActor1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UcdiagramElementTypes.getImageDescriptor(UcdiagramElementTypes.Actor_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLimitBox2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LimitBox2CreationTool_title,
				Messages.LimitBox2CreationTool_desc, Collections.singletonList(UcdiagramElementTypes.LimitBox_2004));
		entry.setId("createLimitBox2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UcdiagramElementTypes.getImageDescriptor(UcdiagramElementTypes.LimitBox_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUseCase3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UseCase3CreationTool_title,
				Messages.UseCase3CreationTool_desc, Collections.singletonList(UcdiagramElementTypes.UseCase_3001));
		entry.setId("createUseCase3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UcdiagramElementTypes.getImageDescriptor(UcdiagramElementTypes.UseCase_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createComRelationship1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ComRelationship1CreationTool_title,
				Messages.ComRelationship1CreationTool_desc,
				Collections.singletonList(UcdiagramElementTypes.ComRelationship_4001));
		entry.setId("createComRelationship1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UcdiagramElementTypes.getImageDescriptor(UcdiagramElementTypes.ComRelationship_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExtendsRelationship2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ExtendsRelationship2CreationTool_title,
				Messages.ExtendsRelationship2CreationTool_desc,
				Collections.singletonList(UcdiagramElementTypes.ExtendsRelationship_4003));
		entry.setId("createExtendsRelationship2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UcdiagramElementTypes.getImageDescriptor(UcdiagramElementTypes.ExtendsRelationship_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIncludeRelationship3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.IncludeRelationship3CreationTool_title,
				Messages.IncludeRelationship3CreationTool_desc,
				Collections.singletonList(UcdiagramElementTypes.IncludeRelationship_4002));
		entry.setId("createIncludeRelationship3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UcdiagramElementTypes.getImageDescriptor(UcdiagramElementTypes.IncludeRelationship_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
