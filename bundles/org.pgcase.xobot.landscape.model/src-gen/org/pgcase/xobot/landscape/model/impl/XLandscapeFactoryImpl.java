/**
 */
package org.pgcase.xobot.landscape.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.pgcase.xobot.landscape.model.api.*;
import org.pgcase.xobot.landscape.model.meta.XLandscapeFactory;
import org.pgcase.xobot.landscape.model.meta.XLandscapePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XLandscapeFactoryImpl extends EFactoryImpl implements XLandscapeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XLandscapeFactory init() {
		try {
			XLandscapeFactory theLandscapeFactory = (XLandscapeFactory)EPackage.Registry.INSTANCE.getEFactory(XLandscapePackage.eNS_URI);
			if (theLandscapeFactory != null) {
				return theLandscapeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XLandscapeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XLandscapeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XLandscapePackage.SOURCE_SET: return createSourceSet();
			case XLandscapePackage.SOURCE: return createSource();
			case XLandscapePackage.TARGET_SET: return createTargetSet();
			case XLandscapePackage.TARGET: return createTarget();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSourceSet createSourceSet() {
		XSourceSetImpl sourceSet = new XSourceSetImpl();
		return sourceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSource createSource() {
		XSourceImpl source = new XSourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTargetSet createTargetSet() {
		XTargetSetImpl targetSet = new XTargetSetImpl();
		return targetSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTarget createTarget() {
		XTargetImpl target = new XTargetImpl();
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XLandscapePackage getLandscapePackage() {
		return (XLandscapePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XLandscapePackage getPackage() {
		return XLandscapePackage.eINSTANCE;
	}

} //XLandscapeFactoryImpl
