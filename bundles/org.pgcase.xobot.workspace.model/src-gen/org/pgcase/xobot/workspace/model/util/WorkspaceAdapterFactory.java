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
package org.pgcase.xobot.workspace.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.pgcase.xobot.workspace.model.api.*;

import org.pgcase.xobot.workspace.model.meta.XWorkspacePackage;

import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectSourceDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage
 * @generated
 */
public class WorkspaceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XWorkspacePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkspaceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XWorkspacePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkspaceSwitch<Adapter> modelSwitch =
		new WorkspaceSwitch<Adapter>() {
			@Override
			public Adapter caseProjectDescriptor(XProjectDescriptor object) {
				return createProjectDescriptorAdapter();
			}
			@Override
			public Adapter caseProjectFolderDescriptor(XProjectFolderDescriptor object) {
				return createProjectFolderDescriptorAdapter();
			}
			@Override
			public Adapter caseProjectSourceDescriptor(XProjectSourceDescriptor object) {
				return createProjectSourceDescriptorAdapter();
			}
			@Override
			public Adapter caseProjectTargetDescriptor(XProjectTargetDescriptor object) {
				return createProjectTargetDescriptorAdapter();
			}
			@Override
			public Adapter caseProject(XProject object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseProjectFolder(XProjectFolder object) {
				return createProjectFolderAdapter();
			}
			@Override
			public Adapter caseProjectSource(XProjectSource object) {
				return createProjectSourceAdapter();
			}
			@Override
			public Adapter caseProjectTarget(XProjectTarget object) {
				return createProjectTargetAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.pgcase.xobot.workspace.runtime.XProjectDescriptor <em>Project Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pgcase.xobot.workspace.runtime.XProjectDescriptor
	 * @generated
	 */
	public Adapter createProjectDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor <em>Project Folder Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor
	 * @generated
	 */
	public Adapter createProjectFolderDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pgcase.xobot.workspace.runtime.XProjectSourceDescriptor <em>Project Source Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pgcase.xobot.workspace.runtime.XProjectSourceDescriptor
	 * @generated
	 */
	public Adapter createProjectSourceDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor <em>Project Target Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor
	 * @generated
	 */
	public Adapter createProjectTargetDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pgcase.xobot.workspace.model.api.XProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pgcase.xobot.workspace.model.api.XProject
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pgcase.xobot.workspace.model.api.XProjectFolder <em>Project Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pgcase.xobot.workspace.model.api.XProjectFolder
	 * @generated
	 */
	public Adapter createProjectFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pgcase.xobot.workspace.model.api.XProjectSource <em>Project Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pgcase.xobot.workspace.model.api.XProjectSource
	 * @generated
	 */
	public Adapter createProjectSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pgcase.xobot.workspace.model.api.XProjectTarget <em>Project Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pgcase.xobot.workspace.model.api.XProjectTarget
	 * @generated
	 */
	public Adapter createProjectTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WorkspaceAdapterFactory
