/**
 */
package org.pgcase.xobot.workspace.model.meta;

import org.eclipse.emf.ecore.EFactory;

import org.pgcase.xobot.workspace.model.api.XProject;
import org.pgcase.xobot.workspace.model.api.XProjectFolder;
import org.pgcase.xobot.workspace.model.api.XProjectSource;
import org.pgcase.xobot.workspace.model.api.XProjectTarget;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pgcase.xobot.workspace.model.meta.XLandscapePackage
 * @generated
 */
public interface XLandscapeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XLandscapeFactory eINSTANCE = org.pgcase.xobot.workspace.model.impl.XLandscapeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	XProject createProject();

	/**
	 * Returns a new object of class '<em>Project Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Folder</em>'.
	 * @generated
	 */
	XProjectFolder createProjectFolder();

	/**
	 * Returns a new object of class '<em>Project Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Source</em>'.
	 * @generated
	 */
	XProjectSource createProjectSource();

	/**
	 * Returns a new object of class '<em>Project Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Target</em>'.
	 * @generated
	 */
	XProjectTarget createProjectTarget();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XLandscapePackage getLandscapePackage();

} //XLandscapeFactory
