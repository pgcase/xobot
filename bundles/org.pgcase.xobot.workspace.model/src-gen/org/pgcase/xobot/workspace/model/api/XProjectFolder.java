/*******************************************************************************
 * Copyright (c) 2018-2019 ArSysOp
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
package org.pgcase.xobot.workspace.model.api;

import org.eclipse.emf.ecore.EObject;

import org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pgcase.xobot.workspace.model.api.XProjectFolder#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.pgcase.xobot.workspace.model.api.XProjectFolder#getName <em>Name</em>}</li>
 *   <li>{@link org.pgcase.xobot.workspace.model.api.XProjectFolder#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.pgcase.xobot.workspace.model.api.XProjectFolder#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage#getProjectFolder()
 * @model superTypes="org.pgcase.xobot.workspace.model.api.ProjectFolderDescriptor"
 * @generated
 */
public interface XProjectFolder extends EObject, XProjectFolderDescriptor {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage#getProjectFolder_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.workspace.model.api.XProjectFolder#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage#getProjectFolder_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.workspace.model.api.XProjectFolder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see #setOrigin(String)
	 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage#getProjectFolder_Origin()
	 * @model
	 * @generated
	 */
	String getOrigin();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.workspace.model.api.XProjectFolder#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(String value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.pgcase.xobot.workspace.model.api.XProject#getProjectFolders <em>Project Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(XProject)
	 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage#getProjectFolder_Project()
	 * @see org.pgcase.xobot.workspace.model.api.XProject#getProjectFolders
	 * @model opposite="projectFolders" required="true" transient="false"
	 * @generated
	 */
	XProject getProject();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.workspace.model.api.XProjectFolder#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(XProject value);

} // XProjectFolder
