/**
 * Copyright (c) 2019-2020 ArSysOp
 */
package org.pgcase.xobot.landscape.model.edit.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.pgcase.xobot.landscape.model.api.XFocus;
import org.pgcase.xobot.landscape.model.edit.LandscapeEditPlugin;
import org.pgcase.xobot.landscape.model.meta.XLandscapePackage;
import org.pgcase.xobot.landscape.runtime.FocusDescriptors;
import org.pgcase.xobot.landscape.runtime.XFocusDescriptor;

/**
 * This is the item provider adapter for a {@link org.pgcase.xobot.landscape.model.api.XFocus} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FocusItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		IItemColorProvider,
		IItemFontProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FocusItemProvider(AdapterFactory adapterFactory) {
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

			addIdentifierPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addMaturityPropertyDescriptor(object);
			addOriginPropertyDescriptor(object);
			addUriPropertyDescriptor(object);
			addForkPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Focus_identifier_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Focus_identifier_feature", "_UI_Focus_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XLandscapePackage.Literals.FOCUS__IDENTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_Focus_name_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Focus_name_feature", "_UI_Focus_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XLandscapePackage.Literals.FOCUS__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maturity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaturityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Focus_maturity_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Focus_maturity_feature", "_UI_Focus_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XLandscapePackage.Literals.FOCUS__MATURITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Origin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Focus_origin_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Focus_origin_feature", "_UI_Focus_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XLandscapePackage.Literals.FOCUS__ORIGIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Focus_uri_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Focus_uri_feature", "_UI_Focus_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XLandscapePackage.Literals.FOCUS__URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fork feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Focus_fork_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Focus_fork_feature", "_UI_Focus_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XLandscapePackage.Literals.FOCUS__FORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		XFocus focus = (XFocus)object;
		String name = focus.getName();
		if (name == null || name.length() == 0) {
			return getString("_UI_Focus_type"); //$NON-NLS-1$
		}
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		String origin = focus.getOrigin();
		String fork = focus.getFork();
		if (origin != null) {
			sb.append(origin);
		}
		sb.append(':');
		if (fork != null) {
			sb.append(fork);
		}
		sb.append(']').append(' ');
		sb.append(name);
		String uri = focus.getUri();
		if (uri != null) {
			sb.append(' ').append('(').append(uri).append(')');
		}
		return sb.toString();
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

		switch (notification.getFeatureID(XFocus.class)) {
			case XLandscapePackage.FOCUS__IDENTIFIER:
			case XLandscapePackage.FOCUS__NAME:
			case XLandscapePackage.FOCUS__MATURITY:
			case XLandscapePackage.FOCUS__ORIGIN:
			case XLandscapePackage.FOCUS__URI:
			case XLandscapePackage.FOCUS__FORK:
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
		return LandscapeEditPlugin.INSTANCE;
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public Object getBackground(Object object) {
		if (object instanceof XFocusDescriptor) {
			XFocusDescriptor focus = (XFocusDescriptor) object;
			String maturity = focus.getMaturity();
			Display display = Display.getDefault();
			if (maturity != null) {
				switch (maturity) {
				case FocusDescriptors.MATURITY_OFFICIAL:
					return display.getSystemColor(SWT.COLOR_RED);
				case FocusDescriptors.MATURITY_STABLE:
					return display.getSystemColor(SWT.COLOR_YELLOW);
				case FocusDescriptors.MATURITY_INTEGRATION:
					return display.getSystemColor(SWT.COLOR_CYAN);
				case FocusDescriptors.MATURITY_SANDBOX:
					return display.getSystemColor(SWT.COLOR_GREEN);
				default:
					break;
				}
			}
		}
		return super.getBackground(object);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public Object getForeground(Object object) {
		if (object instanceof XFocusDescriptor) {
//			XFocusDescriptor focus = (XFocusDescriptor) object;
//			String maturity = focus.getMaturity();
//			Display display = Display.getDefault();
//			if (maturity != null) {
//				switch (maturity) {
//				case FocusDescriptors.MATURITY_OFFICIAL:
//					return display.getSystemColor(SWT.COLOR_DARK_RED);
//				case FocusDescriptors.MATURITY_STABLE:
//					return display.getSystemColor(SWT.COLOR_DARK_YELLOW);
//				case FocusDescriptors.MATURITY_INTEGRATION:
//					return display.getSystemColor(SWT.COLOR_DARK_CYAN);
//				case FocusDescriptors.MATURITY_SANDBOX:
//					return display.getSystemColor(SWT.COLOR_DARK_GREEN);
//				default:
//					break;
//				}
//			}
		}
		return super.getForeground(object);
	}

}
