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
package org.pgcase.xobot.workspace.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.pgcase.xobot.workspace.model.api.*;

import org.pgcase.xobot.workspace.model.meta.XWorkspacePackage;

import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectSourceDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage
 * @generated
 */
public class WorkspaceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XWorkspacePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkspaceSwitch() {
		if (modelPackage == null) {
			modelPackage = XWorkspacePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XWorkspacePackage.PROJECT_DESCRIPTOR: {
				XProjectDescriptor projectDescriptor = (XProjectDescriptor)theEObject;
				T result = caseProjectDescriptor(projectDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XWorkspacePackage.PROJECT_FOLDER_DESCRIPTOR: {
				XProjectFolderDescriptor projectFolderDescriptor = (XProjectFolderDescriptor)theEObject;
				T result = caseProjectFolderDescriptor(projectFolderDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XWorkspacePackage.PROJECT_SOURCE_DESCRIPTOR: {
				XProjectSourceDescriptor projectSourceDescriptor = (XProjectSourceDescriptor)theEObject;
				T result = caseProjectSourceDescriptor(projectSourceDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XWorkspacePackage.PROJECT_TARGET_DESCRIPTOR: {
				XProjectTargetDescriptor projectTargetDescriptor = (XProjectTargetDescriptor)theEObject;
				T result = caseProjectTargetDescriptor(projectTargetDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XWorkspacePackage.PROJECT: {
				XProject project = (XProject)theEObject;
				T result = caseProject(project);
				if (result == null) result = caseProjectDescriptor(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XWorkspacePackage.PROJECT_FOLDER: {
				XProjectFolder projectFolder = (XProjectFolder)theEObject;
				T result = caseProjectFolder(projectFolder);
				if (result == null) result = caseProjectFolderDescriptor(projectFolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XWorkspacePackage.PROJECT_SOURCE: {
				XProjectSource projectSource = (XProjectSource)theEObject;
				T result = caseProjectSource(projectSource);
				if (result == null) result = caseProjectSourceDescriptor(projectSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XWorkspacePackage.PROJECT_TARGET: {
				XProjectTarget projectTarget = (XProjectTarget)theEObject;
				T result = caseProjectTarget(projectTarget);
				if (result == null) result = caseProjectTargetDescriptor(projectTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectDescriptor(XProjectDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Folder Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Folder Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectFolderDescriptor(XProjectFolderDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Source Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Source Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectSourceDescriptor(XProjectSourceDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Target Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Target Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectTargetDescriptor(XProjectTargetDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(XProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectFolder(XProjectFolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectSource(XProjectSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectTarget(XProjectTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WorkspaceSwitch
