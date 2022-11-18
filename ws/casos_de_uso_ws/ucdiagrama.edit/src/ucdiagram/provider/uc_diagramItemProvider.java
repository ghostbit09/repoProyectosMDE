/**
 */
package ucdiagram.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ucdiagram.UcdiagramFactory;
import ucdiagram.UcdiagramPackage;
import ucdiagram.uc_diagram;

/**
 * This is the item provider adapter for a {@link ucdiagram.uc_diagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class uc_diagramItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uc_diagramItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_uc_diagram_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_uc_diagram_name_feature", "_UI_uc_diagram_type"),
				 UcdiagramPackage.Literals.UC_DIAGRAM__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_uc_diagram_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_uc_diagram_description_feature", "_UI_uc_diagram_type"),
				 UcdiagramPackage.Literals.UC_DIAGRAM__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UcdiagramPackage.Literals.UC_DIAGRAM__LIST_ACTORS);
			childrenFeatures.add(UcdiagramPackage.Literals.UC_DIAGRAM__LIST_BOXES);
			childrenFeatures.add(UcdiagramPackage.Literals.UC_DIAGRAM__LIST_COM_RELS);
			childrenFeatures.add(UcdiagramPackage.Literals.UC_DIAGRAM__LIST_INC_RELS);
			childrenFeatures.add(UcdiagramPackage.Literals.UC_DIAGRAM__LIST_EXT_RELS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns uc_diagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/uc_diagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((uc_diagram)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_uc_diagram_type") :
			getString("_UI_uc_diagram_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(uc_diagram.class)) {
			case UcdiagramPackage.UC_DIAGRAM__NAME:
			case UcdiagramPackage.UC_DIAGRAM__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UcdiagramPackage.UC_DIAGRAM__LIST_ACTORS:
			case UcdiagramPackage.UC_DIAGRAM__LIST_BOXES:
			case UcdiagramPackage.UC_DIAGRAM__LIST_COM_RELS:
			case UcdiagramPackage.UC_DIAGRAM__LIST_INC_RELS:
			case UcdiagramPackage.UC_DIAGRAM__LIST_EXT_RELS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UcdiagramPackage.Literals.UC_DIAGRAM__LIST_ACTORS,
				 UcdiagramFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(UcdiagramPackage.Literals.UC_DIAGRAM__LIST_BOXES,
				 UcdiagramFactory.eINSTANCE.createLimitBox()));

		newChildDescriptors.add
			(createChildParameter
				(UcdiagramPackage.Literals.UC_DIAGRAM__LIST_COM_RELS,
				 UcdiagramFactory.eINSTANCE.createcomRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(UcdiagramPackage.Literals.UC_DIAGRAM__LIST_INC_RELS,
				 UcdiagramFactory.eINSTANCE.createincludeRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(UcdiagramPackage.Literals.UC_DIAGRAM__LIST_EXT_RELS,
				 UcdiagramFactory.eINSTANCE.createextendsRelationship()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UcdiagramEditPlugin.INSTANCE;
	}

}
