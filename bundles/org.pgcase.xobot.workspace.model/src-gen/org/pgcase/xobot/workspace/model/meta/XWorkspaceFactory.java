/*******************************************************************************
 * Copyright (c) 2018-2020 ArSysOp
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     ArSysOp - initial API and implementation
 *******************************************************************************/
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
 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage
 * @generated
 */
public interface XWorkspaceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XWorkspaceFactory eINSTANCE = org.pgcase.xobot.workspace.model.impl.XWorkspaceFactoryImpl.init();

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
	XWorkspacePackage getWorkspacePackage();

} //XWorkspaceFactory
