/**
 */
package uidiagram.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import uidiagram.ModelElement;
import uidiagram.UidiagramPackage;

/**
 * This is the item provider adapter for a {@link uidiagram.ModelElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelElementItemProvider 
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
	public ModelElementItemProvider(AdapterFactory adapterFactory) {
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
			addModelElementIdPropertyDescriptor(object);
			addLayout_marginTopPropertyDescriptor(object);
			addLayout_marginBottomPropertyDescriptor(object);
			addLayout_marginStartPropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addBackgroundColorPropertyDescriptor(object);
			addTextColorPropertyDescriptor(object);
			addTitleFontPropertyDescriptor(object);
			addTitleFontSizePropertyDescriptor(object);
			addTextStylePropertyDescriptor(object);
			addTextAppearancePropertyDescriptor(object);
			addInputTypePropertyDescriptor(object);
			addSrcCompatPropertyDescriptor(object);
			addMaxLengthPropertyDescriptor(object);
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
				 getString("_UI_ModelElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_name_feature", "_UI_ModelElement_type"),
				 UidiagramPackage.Literals.MODEL_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Model Element Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelElementIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelElement_modelElementId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_modelElementId_feature", "_UI_ModelElement_type"),
				 UidiagramPackage.Literals.MODEL_ELEMENT__MODEL_ELEMENT_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout margin Top feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_marginTopPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelElement_layout_marginTop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_layout_marginTop_feature", "_UI_ModelElement_type"),
				 UidiagramPackage.Literals.MODEL_ELEMENT__LAYOUT_MARGIN_TOP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout margin Bottom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_marginBottomPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelElement_layout_marginBottom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_layout_marginBottom_feature", "_UI_ModelElement_type"),
				 UidiagramPackage.Literals.MODEL_ELEMENT__LAYOUT_MARGIN_BOTTOM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout margin Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_marginStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelElement_layout_marginStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_layout_marginStart_feature", "_UI_ModelElement_type"),
				 UidiagramPackage.Literals.MODEL_ELEMENT__LAYOUT_MARGIN_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelElement_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_width_feature", "_UI_ModelElement_type"),
				 UidiagramPackage.Literals.MODEL_ELEMENT__WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelElement_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_height_feature", "_UI_ModelElement_type"),
				 UidiagramPackage.Literals.MODEL_ELEMENT__HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Background Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelElement_backgroundColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_backgroundColor_feature", "_UI_ModelElement_type"),
				 UidiagramPackage.Literals.MODEL_ELEMENT__BACKGROUND_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelElement_textColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_textColor_feature", "_UI_ModelElement_type"),
				 UidiagramPackage.Literals.MODEL_ELEMENT__TEXT_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title Font feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitleFontPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelElement_titleFont_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_titleFont_feature", "_UI_ModelElement_type"),
				 UidiagramPackage.Literals.MODEL_ELEMENT__TITLE_FONT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title Font Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitleFontSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelElement_titleFontSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_titleFontSize_feature", "_UI_ModelElement_type"),
				 UidiagramPackage.Literals.MODEL_ELEMENT__TITLE_FONT_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelElement_textStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_textStyle_feature", "_UI_ModelElement_type"),
				 UidiagramPackage.Literals.MODEL_ELEMENT__TEXT_STYLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Appearance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextAppearancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelElement_textAppearance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_textAppearance_feature", "_UI_ModelElement_type"),
				 UidiagramPackage.Literals.MODEL_ELEMENT__TEXT_APPEARANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelElement_inputType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_inputType_feature", "_UI_ModelElement_type"),
				 UidiagramPackage.Literals.MODEL_ELEMENT__INPUT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Src Compat feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSrcCompatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelElement_srcCompat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_srcCompat_feature", "_UI_ModelElement_type"),
				 UidiagramPackage.Literals.MODEL_ELEMENT__SRC_COMPAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelElement_maxLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_maxLength_feature", "_UI_ModelElement_type"),
				 UidiagramPackage.Literals.MODEL_ELEMENT__MAX_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ModelElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModelElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ModelElement_type") :
			getString("_UI_ModelElement_type") + " " + label;
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

		switch (notification.getFeatureID(ModelElement.class)) {
			case UidiagramPackage.MODEL_ELEMENT__NAME:
			case UidiagramPackage.MODEL_ELEMENT__MODEL_ELEMENT_ID:
			case UidiagramPackage.MODEL_ELEMENT__LAYOUT_MARGIN_TOP:
			case UidiagramPackage.MODEL_ELEMENT__LAYOUT_MARGIN_BOTTOM:
			case UidiagramPackage.MODEL_ELEMENT__LAYOUT_MARGIN_START:
			case UidiagramPackage.MODEL_ELEMENT__WIDTH:
			case UidiagramPackage.MODEL_ELEMENT__HEIGHT:
			case UidiagramPackage.MODEL_ELEMENT__BACKGROUND_COLOR:
			case UidiagramPackage.MODEL_ELEMENT__TEXT_COLOR:
			case UidiagramPackage.MODEL_ELEMENT__TITLE_FONT:
			case UidiagramPackage.MODEL_ELEMENT__TITLE_FONT_SIZE:
			case UidiagramPackage.MODEL_ELEMENT__TEXT_STYLE:
			case UidiagramPackage.MODEL_ELEMENT__TEXT_APPEARANCE:
			case UidiagramPackage.MODEL_ELEMENT__INPUT_TYPE:
			case UidiagramPackage.MODEL_ELEMENT__SRC_COMPAT:
			case UidiagramPackage.MODEL_ELEMENT__MAX_LENGTH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UidiagramEditPlugin.INSTANCE;
	}

}
