/**
 */
package uidiagram.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uidiagram.UidiagramFactory;
import uidiagram.UidiagramPackage;
import uidiagram.UserInterface;

/**
 * This is the item provider adapter for a {@link uidiagram.UserInterface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UserInterfaceItemProvider extends ModelElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserInterfaceItemProvider(AdapterFactory adapterFactory) {
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

			addTitlePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_title_feature", "_UI_UserInterface_type"),
				 UidiagramPackage.Literals.USER_INTERFACE__TITLE,
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
			childrenFeatures.add(UidiagramPackage.Literals.USER_INTERFACE__LIST_WIDGETS);
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
	 * This returns UserInterface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UserInterface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UserInterface)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UserInterface_type") :
			getString("_UI_UserInterface_type") + " " + label;
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

		switch (notification.getFeatureID(UserInterface.class)) {
			case UidiagramPackage.USER_INTERFACE__TITLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UidiagramPackage.USER_INTERFACE__LIST_WIDGETS:
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
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_WIDGETS,
				 UidiagramFactory.eINSTANCE.createModelElement()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_WIDGETS,
				 UidiagramFactory.eINSTANCE.createUserInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_WIDGETS,
				 UidiagramFactory.eINSTANCE.createGraphicalContainer()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_WIDGETS,
				 UidiagramFactory.eINSTANCE.createGraphicalIndividual()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_WIDGETS,
				 UidiagramFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_WIDGETS,
				 UidiagramFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_WIDGETS,
				 UidiagramFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_WIDGETS,
				 UidiagramFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_WIDGETS,
				 UidiagramFactory.eINSTANCE.createTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_WIDGETS,
				 UidiagramFactory.eINSTANCE.createDropDown()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_WIDGETS,
				 UidiagramFactory.eINSTANCE.createMenu()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_WIDGETS,
				 UidiagramFactory.eINSTANCE.createImg()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_WIDGETS,
				 UidiagramFactory.eINSTANCE.createIcon()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_WIDGETS,
				 UidiagramFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_WIDGETS,
				 UidiagramFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_WIDGETS,
				 UidiagramFactory.eINSTANCE.createComboBox()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_WIDGETS,
				 UidiagramFactory.eINSTANCE.createRadioButton()));
	}

}
