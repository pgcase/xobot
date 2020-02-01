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
package org.pgcase.xobot.workspace.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pgcase.xobot.workspace.model.api.XProject;
import org.pgcase.xobot.workspace.model.api.XProjectFolder;
import org.pgcase.xobot.workspace.model.api.XProjectSource;
import org.pgcase.xobot.workspace.model.api.XProjectTarget;

import org.pgcase.xobot.workspace.model.meta.XWorkspaceFactory;
import org.pgcase.xobot.workspace.model.meta.XWorkspacePackage;

import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectSourceDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XWorkspacePackageImpl extends EPackageImpl implements XWorkspacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectFolderDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectSourceDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectTargetDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectTargetEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XWorkspacePackageImpl() {
		super(eNS_URI, XWorkspaceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link XWorkspacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XWorkspacePackage init() {
		if (isInited) return (XWorkspacePackage)EPackage.Registry.INSTANCE.getEPackage(XWorkspacePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWorkspacePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		XWorkspacePackageImpl theWorkspacePackage = registeredWorkspacePackage instanceof XWorkspacePackageImpl ? (XWorkspacePackageImpl)registeredWorkspacePackage : new XWorkspacePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theWorkspacePackage.createPackageContents();

		// Initialize created meta-data
		theWorkspacePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWorkspacePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XWorkspacePackage.eNS_URI, theWorkspacePackage);
		return theWorkspacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectDescriptor() {
		return projectDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectFolderDescriptor() {
		return projectFolderDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectSourceDescriptor() {
		return projectSourceDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectTargetDescriptor() {
		return projectTargetDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Identifier() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Name() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Path() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_ProjectFolders() {
		return (EReference)projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_ProjectSources() {
		return (EReference)projectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_ProjectTargets() {
		return (EReference)projectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectFolder() {
		return projectFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectFolder_Identifier() {
		return (EAttribute)projectFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectFolder_Name() {
		return (EAttribute)projectFolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectFolder_Origin() {
		return (EAttribute)projectFolderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectFolder_Path() {
		return (EAttribute)projectFolderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectFolder_Project() {
		return (EReference)projectFolderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectSource() {
		return projectSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectSource_SourceIdentifier() {
		return (EAttribute)projectSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectSource_Project() {
		return (EReference)projectSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectTarget() {
		return projectTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectTarget_TargetIdentifier() {
		return (EAttribute)projectTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectTarget_Project() {
		return (EReference)projectTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XWorkspaceFactory getWorkspaceFactory() {
		return (XWorkspaceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		projectDescriptorEClass = createEClass(PROJECT_DESCRIPTOR);

		projectFolderDescriptorEClass = createEClass(PROJECT_FOLDER_DESCRIPTOR);

		projectSourceDescriptorEClass = createEClass(PROJECT_SOURCE_DESCRIPTOR);

		projectTargetDescriptorEClass = createEClass(PROJECT_TARGET_DESCRIPTOR);

		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__IDENTIFIER);
		createEAttribute(projectEClass, PROJECT__NAME);
		createEAttribute(projectEClass, PROJECT__PATH);
		createEReference(projectEClass, PROJECT__PROJECT_FOLDERS);
		createEReference(projectEClass, PROJECT__PROJECT_SOURCES);
		createEReference(projectEClass, PROJECT__PROJECT_TARGETS);

		projectFolderEClass = createEClass(PROJECT_FOLDER);
		createEAttribute(projectFolderEClass, PROJECT_FOLDER__IDENTIFIER);
		createEAttribute(projectFolderEClass, PROJECT_FOLDER__NAME);
		createEAttribute(projectFolderEClass, PROJECT_FOLDER__ORIGIN);
		createEAttribute(projectFolderEClass, PROJECT_FOLDER__PATH);
		createEReference(projectFolderEClass, PROJECT_FOLDER__PROJECT);

		projectSourceEClass = createEClass(PROJECT_SOURCE);
		createEAttribute(projectSourceEClass, PROJECT_SOURCE__SOURCE_IDENTIFIER);
		createEReference(projectSourceEClass, PROJECT_SOURCE__PROJECT);

		projectTargetEClass = createEClass(PROJECT_TARGET);
		createEAttribute(projectTargetEClass, PROJECT_TARGET__TARGET_IDENTIFIER);
		createEReference(projectTargetEClass, PROJECT_TARGET__PROJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		projectEClass.getESuperTypes().add(this.getProjectDescriptor());
		projectFolderEClass.getESuperTypes().add(this.getProjectFolderDescriptor());
		projectSourceEClass.getESuperTypes().add(this.getProjectSourceDescriptor());
		projectTargetEClass.getESuperTypes().add(this.getProjectTargetDescriptor());

		// Initialize classes, features, and operations; add parameters
		initEClass(projectDescriptorEClass, XProjectDescriptor.class, "ProjectDescriptor", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(projectFolderDescriptorEClass, XProjectFolderDescriptor.class, "ProjectFolderDescriptor", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(projectSourceDescriptorEClass, XProjectSourceDescriptor.class, "ProjectSourceDescriptor", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(projectTargetDescriptorEClass, XProjectTargetDescriptor.class, "ProjectTargetDescriptor", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(projectEClass, XProject.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getProject_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, XProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 0, 1, XProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProject_Path(), ecorePackage.getEString(), "path", null, 0, 1, XProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProject_ProjectFolders(), this.getProjectFolder(), this.getProjectFolder_Project(), "projectFolders", null, 0, -1, XProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProject_ProjectSources(), this.getProjectSource(), this.getProjectSource_Project(), "projectSources", null, 0, -1, XProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProject_ProjectTargets(), this.getProjectTarget(), this.getProjectTarget_Project(), "projectTargets", null, 0, -1, XProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(projectFolderEClass, XProjectFolder.class, "ProjectFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getProjectFolder_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, XProjectFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProjectFolder_Name(), ecorePackage.getEString(), "name", null, 0, 1, XProjectFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProjectFolder_Origin(), ecorePackage.getEString(), "origin", null, 0, 1, XProjectFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProjectFolder_Path(), ecorePackage.getEString(), "path", null, 0, 1, XProjectFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProjectFolder_Project(), this.getProject(), this.getProject_ProjectFolders(), "project", null, 1, 1, XProjectFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(projectSourceEClass, XProjectSource.class, "ProjectSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getProjectSource_SourceIdentifier(), ecorePackage.getEString(), "sourceIdentifier", null, 1, 1, XProjectSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProjectSource_Project(), this.getProject(), this.getProject_ProjectSources(), "project", null, 1, 1, XProjectSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(projectTargetEClass, XProjectTarget.class, "ProjectTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getProjectTarget_TargetIdentifier(), ecorePackage.getEString(), "targetIdentifier", null, 1, 1, XProjectTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProjectTarget_Project(), this.getProject(), this.getProject_ProjectTargets(), "project", null, 1, 1, XProjectTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //XWorkspacePackageImpl
