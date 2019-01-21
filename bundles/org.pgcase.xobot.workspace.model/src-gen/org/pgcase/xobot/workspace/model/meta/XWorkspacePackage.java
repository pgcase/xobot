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
package org.pgcase.xobot.workspace.model.meta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.pgcase.xobot.workspace.model.meta.XWorkspaceFactory
 * @model kind="package"
 * @generated
 */
public interface XWorkspacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workspace"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.pgcase.org/xobot/workspace/0.1.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "workspace"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XWorkspacePackage eINSTANCE = org.pgcase.xobot.workspace.model.impl.XWorkspacePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pgcase.xobot.workspace.runtime.XProjectDescriptor <em>Project Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pgcase.xobot.workspace.runtime.XProjectDescriptor
	 * @see org.pgcase.xobot.workspace.model.impl.XWorkspacePackageImpl#getProjectDescriptor()
	 * @generated
	 */
	int PROJECT_DESCRIPTOR = 0;

	/**
	 * The number of structural features of the '<em>Project Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Project Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor <em>Project Folder Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor
	 * @see org.pgcase.xobot.workspace.model.impl.XWorkspacePackageImpl#getProjectFolderDescriptor()
	 * @generated
	 */
	int PROJECT_FOLDER_DESCRIPTOR = 1;

	/**
	 * The number of structural features of the '<em>Project Folder Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FOLDER_DESCRIPTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Project Folder Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FOLDER_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.pgcase.xobot.workspace.runtime.XProjectSourceDescriptor <em>Project Source Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pgcase.xobot.workspace.runtime.XProjectSourceDescriptor
	 * @see org.pgcase.xobot.workspace.model.impl.XWorkspacePackageImpl#getProjectSourceDescriptor()
	 * @generated
	 */
	int PROJECT_SOURCE_DESCRIPTOR = 2;

	/**
	 * The number of structural features of the '<em>Project Source Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SOURCE_DESCRIPTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Project Source Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SOURCE_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor <em>Project Target Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor
	 * @see org.pgcase.xobot.workspace.model.impl.XWorkspacePackageImpl#getProjectTargetDescriptor()
	 * @generated
	 */
	int PROJECT_TARGET_DESCRIPTOR = 3;

	/**
	 * The number of structural features of the '<em>Project Target Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TARGET_DESCRIPTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Project Target Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TARGET_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.pgcase.xobot.workspace.model.impl.XProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pgcase.xobot.workspace.model.impl.XProjectImpl
	 * @see org.pgcase.xobot.workspace.model.impl.XWorkspacePackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__IDENTIFIER = PROJECT_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = PROJECT_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PATH = PROJECT_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Project Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_FOLDERS = PROJECT_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Project Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_SOURCES = PROJECT_DESCRIPTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Project Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_TARGETS = PROJECT_DESCRIPTOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = PROJECT_DESCRIPTOR_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = PROJECT_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pgcase.xobot.workspace.model.impl.XProjectFolderImpl <em>Project Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pgcase.xobot.workspace.model.impl.XProjectFolderImpl
	 * @see org.pgcase.xobot.workspace.model.impl.XWorkspacePackageImpl#getProjectFolder()
	 * @generated
	 */
	int PROJECT_FOLDER = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FOLDER__IDENTIFIER = PROJECT_FOLDER_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FOLDER__NAME = PROJECT_FOLDER_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FOLDER__ORIGIN = PROJECT_FOLDER_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FOLDER__PATH = PROJECT_FOLDER_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FOLDER__PROJECT = PROJECT_FOLDER_DESCRIPTOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Project Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FOLDER_FEATURE_COUNT = PROJECT_FOLDER_DESCRIPTOR_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Project Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FOLDER_OPERATION_COUNT = PROJECT_FOLDER_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pgcase.xobot.workspace.model.impl.XProjectSourceImpl <em>Project Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pgcase.xobot.workspace.model.impl.XProjectSourceImpl
	 * @see org.pgcase.xobot.workspace.model.impl.XWorkspacePackageImpl#getProjectSource()
	 * @generated
	 */
	int PROJECT_SOURCE = 6;

	/**
	 * The feature id for the '<em><b>Source Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SOURCE__SOURCE_IDENTIFIER = PROJECT_SOURCE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SOURCE__PROJECT = PROJECT_SOURCE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Project Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SOURCE_FEATURE_COUNT = PROJECT_SOURCE_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Project Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SOURCE_OPERATION_COUNT = PROJECT_SOURCE_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pgcase.xobot.workspace.model.impl.XProjectTargetImpl <em>Project Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pgcase.xobot.workspace.model.impl.XProjectTargetImpl
	 * @see org.pgcase.xobot.workspace.model.impl.XWorkspacePackageImpl#getProjectTarget()
	 * @generated
	 */
	int PROJECT_TARGET = 7;

	/**
	 * The feature id for the '<em><b>Target Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TARGET__TARGET_IDENTIFIER = PROJECT_TARGET_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TARGET__PROJECT = PROJECT_TARGET_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Project Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TARGET_FEATURE_COUNT = PROJECT_TARGET_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Project Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TARGET_OPERATION_COUNT = PROJECT_TARGET_DESCRIPTOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.pgcase.xobot.workspace.runtime.XProjectDescriptor <em>Project Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Descriptor</em>'.
	 * @see org.pgcase.xobot.workspace.runtime.XProjectDescriptor
	 * @model instanceClass="org.pgcase.xobot.workspace.runtime.XProjectDescriptor"
	 * @generated
	 */
	EClass getProjectDescriptor();

	/**
	 * Returns the meta object for class '{@link org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor <em>Project Folder Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Folder Descriptor</em>'.
	 * @see org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor
	 * @model instanceClass="org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor"
	 * @generated
	 */
	EClass getProjectFolderDescriptor();

	/**
	 * Returns the meta object for class '{@link org.pgcase.xobot.workspace.runtime.XProjectSourceDescriptor <em>Project Source Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Source Descriptor</em>'.
	 * @see org.pgcase.xobot.workspace.runtime.XProjectSourceDescriptor
	 * @model instanceClass="org.pgcase.xobot.workspace.runtime.XProjectSourceDescriptor"
	 * @generated
	 */
	EClass getProjectSourceDescriptor();

	/**
	 * Returns the meta object for class '{@link org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor <em>Project Target Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Target Descriptor</em>'.
	 * @see org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor
	 * @model instanceClass="org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor"
	 * @generated
	 */
	EClass getProjectTargetDescriptor();

	/**
	 * Returns the meta object for class '{@link org.pgcase.xobot.workspace.model.api.XProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.pgcase.xobot.workspace.model.api.XProject
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link org.pgcase.xobot.workspace.model.api.XProject#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.pgcase.xobot.workspace.model.api.XProject#getIdentifier()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.pgcase.xobot.workspace.model.api.XProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.pgcase.xobot.workspace.model.api.XProject#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.pgcase.xobot.workspace.model.api.XProject#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.pgcase.xobot.workspace.model.api.XProject#getPath()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pgcase.xobot.workspace.model.api.XProject#getProjectFolders <em>Project Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Project Folders</em>'.
	 * @see org.pgcase.xobot.workspace.model.api.XProject#getProjectFolders()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_ProjectFolders();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pgcase.xobot.workspace.model.api.XProject#getProjectSources <em>Project Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Project Sources</em>'.
	 * @see org.pgcase.xobot.workspace.model.api.XProject#getProjectSources()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_ProjectSources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pgcase.xobot.workspace.model.api.XProject#getProjectTargets <em>Project Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Project Targets</em>'.
	 * @see org.pgcase.xobot.workspace.model.api.XProject#getProjectTargets()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_ProjectTargets();

	/**
	 * Returns the meta object for class '{@link org.pgcase.xobot.workspace.model.api.XProjectFolder <em>Project Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Folder</em>'.
	 * @see org.pgcase.xobot.workspace.model.api.XProjectFolder
	 * @generated
	 */
	EClass getProjectFolder();

	/**
	 * Returns the meta object for the attribute '{@link org.pgcase.xobot.workspace.model.api.XProjectFolder#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.pgcase.xobot.workspace.model.api.XProjectFolder#getIdentifier()
	 * @see #getProjectFolder()
	 * @generated
	 */
	EAttribute getProjectFolder_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.pgcase.xobot.workspace.model.api.XProjectFolder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.pgcase.xobot.workspace.model.api.XProjectFolder#getName()
	 * @see #getProjectFolder()
	 * @generated
	 */
	EAttribute getProjectFolder_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.pgcase.xobot.workspace.model.api.XProjectFolder#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see org.pgcase.xobot.workspace.model.api.XProjectFolder#getOrigin()
	 * @see #getProjectFolder()
	 * @generated
	 */
	EAttribute getProjectFolder_Origin();

	/**
	 * Returns the meta object for the attribute '{@link org.pgcase.xobot.workspace.model.api.XProjectFolder#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.pgcase.xobot.workspace.model.api.XProjectFolder#getPath()
	 * @see #getProjectFolder()
	 * @generated
	 */
	EAttribute getProjectFolder_Path();

	/**
	 * Returns the meta object for the container reference '{@link org.pgcase.xobot.workspace.model.api.XProjectFolder#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see org.pgcase.xobot.workspace.model.api.XProjectFolder#getProject()
	 * @see #getProjectFolder()
	 * @generated
	 */
	EReference getProjectFolder_Project();

	/**
	 * Returns the meta object for class '{@link org.pgcase.xobot.workspace.model.api.XProjectSource <em>Project Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Source</em>'.
	 * @see org.pgcase.xobot.workspace.model.api.XProjectSource
	 * @generated
	 */
	EClass getProjectSource();

	/**
	 * Returns the meta object for the attribute '{@link org.pgcase.xobot.workspace.model.api.XProjectSource#getSourceIdentifier <em>Source Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Identifier</em>'.
	 * @see org.pgcase.xobot.workspace.model.api.XProjectSource#getSourceIdentifier()
	 * @see #getProjectSource()
	 * @generated
	 */
	EAttribute getProjectSource_SourceIdentifier();

	/**
	 * Returns the meta object for the container reference '{@link org.pgcase.xobot.workspace.model.api.XProjectSource#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see org.pgcase.xobot.workspace.model.api.XProjectSource#getProject()
	 * @see #getProjectSource()
	 * @generated
	 */
	EReference getProjectSource_Project();

	/**
	 * Returns the meta object for class '{@link org.pgcase.xobot.workspace.model.api.XProjectTarget <em>Project Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Target</em>'.
	 * @see org.pgcase.xobot.workspace.model.api.XProjectTarget
	 * @generated
	 */
	EClass getProjectTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.pgcase.xobot.workspace.model.api.XProjectTarget#getTargetIdentifier <em>Target Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Identifier</em>'.
	 * @see org.pgcase.xobot.workspace.model.api.XProjectTarget#getTargetIdentifier()
	 * @see #getProjectTarget()
	 * @generated
	 */
	EAttribute getProjectTarget_TargetIdentifier();

	/**
	 * Returns the meta object for the container reference '{@link org.pgcase.xobot.workspace.model.api.XProjectTarget#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see org.pgcase.xobot.workspace.model.api.XProjectTarget#getProject()
	 * @see #getProjectTarget()
	 * @generated
	 */
	EReference getProjectTarget_Project();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XWorkspaceFactory getWorkspaceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.pgcase.xobot.workspace.runtime.XProjectDescriptor <em>Project Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pgcase.xobot.workspace.runtime.XProjectDescriptor
		 * @see org.pgcase.xobot.workspace.model.impl.XWorkspacePackageImpl#getProjectDescriptor()
		 * @generated
		 */
		EClass PROJECT_DESCRIPTOR = eINSTANCE.getProjectDescriptor();

		/**
		 * The meta object literal for the '{@link org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor <em>Project Folder Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor
		 * @see org.pgcase.xobot.workspace.model.impl.XWorkspacePackageImpl#getProjectFolderDescriptor()
		 * @generated
		 */
		EClass PROJECT_FOLDER_DESCRIPTOR = eINSTANCE.getProjectFolderDescriptor();

		/**
		 * The meta object literal for the '{@link org.pgcase.xobot.workspace.runtime.XProjectSourceDescriptor <em>Project Source Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pgcase.xobot.workspace.runtime.XProjectSourceDescriptor
		 * @see org.pgcase.xobot.workspace.model.impl.XWorkspacePackageImpl#getProjectSourceDescriptor()
		 * @generated
		 */
		EClass PROJECT_SOURCE_DESCRIPTOR = eINSTANCE.getProjectSourceDescriptor();

		/**
		 * The meta object literal for the '{@link org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor <em>Project Target Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor
		 * @see org.pgcase.xobot.workspace.model.impl.XWorkspacePackageImpl#getProjectTargetDescriptor()
		 * @generated
		 */
		EClass PROJECT_TARGET_DESCRIPTOR = eINSTANCE.getProjectTargetDescriptor();

		/**
		 * The meta object literal for the '{@link org.pgcase.xobot.workspace.model.impl.XProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pgcase.xobot.workspace.model.impl.XProjectImpl
		 * @see org.pgcase.xobot.workspace.model.impl.XWorkspacePackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__IDENTIFIER = eINSTANCE.getProject_Identifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PATH = eINSTANCE.getProject_Path();

		/**
		 * The meta object literal for the '<em><b>Project Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PROJECT_FOLDERS = eINSTANCE.getProject_ProjectFolders();

		/**
		 * The meta object literal for the '<em><b>Project Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PROJECT_SOURCES = eINSTANCE.getProject_ProjectSources();

		/**
		 * The meta object literal for the '<em><b>Project Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PROJECT_TARGETS = eINSTANCE.getProject_ProjectTargets();

		/**
		 * The meta object literal for the '{@link org.pgcase.xobot.workspace.model.impl.XProjectFolderImpl <em>Project Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pgcase.xobot.workspace.model.impl.XProjectFolderImpl
		 * @see org.pgcase.xobot.workspace.model.impl.XWorkspacePackageImpl#getProjectFolder()
		 * @generated
		 */
		EClass PROJECT_FOLDER = eINSTANCE.getProjectFolder();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_FOLDER__IDENTIFIER = eINSTANCE.getProjectFolder_Identifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_FOLDER__NAME = eINSTANCE.getProjectFolder_Name();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_FOLDER__ORIGIN = eINSTANCE.getProjectFolder_Origin();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_FOLDER__PATH = eINSTANCE.getProjectFolder_Path();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_FOLDER__PROJECT = eINSTANCE.getProjectFolder_Project();

		/**
		 * The meta object literal for the '{@link org.pgcase.xobot.workspace.model.impl.XProjectSourceImpl <em>Project Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pgcase.xobot.workspace.model.impl.XProjectSourceImpl
		 * @see org.pgcase.xobot.workspace.model.impl.XWorkspacePackageImpl#getProjectSource()
		 * @generated
		 */
		EClass PROJECT_SOURCE = eINSTANCE.getProjectSource();

		/**
		 * The meta object literal for the '<em><b>Source Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_SOURCE__SOURCE_IDENTIFIER = eINSTANCE.getProjectSource_SourceIdentifier();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_SOURCE__PROJECT = eINSTANCE.getProjectSource_Project();

		/**
		 * The meta object literal for the '{@link org.pgcase.xobot.workspace.model.impl.XProjectTargetImpl <em>Project Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pgcase.xobot.workspace.model.impl.XProjectTargetImpl
		 * @see org.pgcase.xobot.workspace.model.impl.XWorkspacePackageImpl#getProjectTarget()
		 * @generated
		 */
		EClass PROJECT_TARGET = eINSTANCE.getProjectTarget();

		/**
		 * The meta object literal for the '<em><b>Target Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TARGET__TARGET_IDENTIFIER = eINSTANCE.getProjectTarget_TargetIdentifier();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_TARGET__PROJECT = eINSTANCE.getProjectTarget_Project();

	}

} //XWorkspacePackage
