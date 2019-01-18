/**
 */
package org.pgcase.xobot.workspace.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pgcase.xobot.workspace.model.api.*;

import org.pgcase.xobot.workspace.model.meta.XLandscapeFactory;
import org.pgcase.xobot.workspace.model.meta.XLandscapePackage;

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
			case XLandscapePackage.PROJECT: return createProject();
			case XLandscapePackage.PROJECT_FOLDER: return createProjectFolder();
			case XLandscapePackage.PROJECT_SOURCE: return createProjectSource();
			case XLandscapePackage.PROJECT_TARGET: return createProjectTarget();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProject createProject() {
		XProjectImpl project = new XProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProjectFolder createProjectFolder() {
		XProjectFolderImpl projectFolder = new XProjectFolderImpl();
		return projectFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProjectSource createProjectSource() {
		XProjectSourceImpl projectSource = new XProjectSourceImpl();
		return projectSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProjectTarget createProjectTarget() {
		XProjectTargetImpl projectTarget = new XProjectTargetImpl();
		return projectTarget;
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
