/*******************************************************************************
 * Copyright (c) 2019-2020 ArSysOp
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.pgcase.xobot.workspace.model.api.XProject;
import org.pgcase.xobot.workspace.model.api.XProjectSource;
import org.pgcase.xobot.workspace.model.meta.XWorkspacePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pgcase.xobot.workspace.model.impl.XProjectSourceImpl#getSourceIdentifier <em>Source Identifier</em>}</li>
 *   <li>{@link org.pgcase.xobot.workspace.model.impl.XProjectSourceImpl#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XProjectSourceImpl extends MinimalEObjectImpl.Container implements XProjectSource {
	/**
	 * The default value of the '{@link #getSourceIdentifier() <em>Source Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceIdentifier() <em>Source Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String sourceIdentifier = SOURCE_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XProjectSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XWorkspacePackage.Literals.PROJECT_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceIdentifier() {
		return sourceIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceIdentifier(String newSourceIdentifier) {
		String oldSourceIdentifier = sourceIdentifier;
		sourceIdentifier = newSourceIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XWorkspacePackage.PROJECT_SOURCE__SOURCE_IDENTIFIER, oldSourceIdentifier, sourceIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProject getProject() {
		if (eContainerFeatureID() != XWorkspacePackage.PROJECT_SOURCE__PROJECT) return null;
		return (XProject)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(XProject newProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProject, XWorkspacePackage.PROJECT_SOURCE__PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(XProject newProject) {
		if (newProject != eInternalContainer() || (eContainerFeatureID() != XWorkspacePackage.PROJECT_SOURCE__PROJECT && newProject != null)) {
			if (EcoreUtil.isAncestor(this, newProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, XWorkspacePackage.PROJECT__PROJECT_SOURCES, XProject.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XWorkspacePackage.PROJECT_SOURCE__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XWorkspacePackage.PROJECT_SOURCE__PROJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProject((XProject)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XWorkspacePackage.PROJECT_SOURCE__PROJECT:
				return basicSetProject(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case XWorkspacePackage.PROJECT_SOURCE__PROJECT:
				return eInternalContainer().eInverseRemove(this, XWorkspacePackage.PROJECT__PROJECT_SOURCES, XProject.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XWorkspacePackage.PROJECT_SOURCE__SOURCE_IDENTIFIER:
				return getSourceIdentifier();
			case XWorkspacePackage.PROJECT_SOURCE__PROJECT:
				return getProject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XWorkspacePackage.PROJECT_SOURCE__SOURCE_IDENTIFIER:
				setSourceIdentifier((String)newValue);
				return;
			case XWorkspacePackage.PROJECT_SOURCE__PROJECT:
				setProject((XProject)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XWorkspacePackage.PROJECT_SOURCE__SOURCE_IDENTIFIER:
				setSourceIdentifier(SOURCE_IDENTIFIER_EDEFAULT);
				return;
			case XWorkspacePackage.PROJECT_SOURCE__PROJECT:
				setProject((XProject)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XWorkspacePackage.PROJECT_SOURCE__SOURCE_IDENTIFIER:
				return SOURCE_IDENTIFIER_EDEFAULT == null ? sourceIdentifier != null : !SOURCE_IDENTIFIER_EDEFAULT.equals(sourceIdentifier);
			case XWorkspacePackage.PROJECT_SOURCE__PROJECT:
				return getProject() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sourceIdentifier: "); //$NON-NLS-1$
		result.append(sourceIdentifier);
		result.append(')');
		return result.toString();
	}

} //XProjectSourceImpl
