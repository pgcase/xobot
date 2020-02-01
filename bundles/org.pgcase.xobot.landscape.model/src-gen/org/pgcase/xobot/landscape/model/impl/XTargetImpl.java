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
package org.pgcase.xobot.landscape.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.pgcase.xobot.landscape.model.api.XTarget;
import org.pgcase.xobot.landscape.model.api.XTargetSet;
import org.pgcase.xobot.landscape.model.meta.XLandscapePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pgcase.xobot.landscape.model.impl.XTargetImpl#getTargetSet <em>Target Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XTargetImpl extends XFocusImpl implements XTarget {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XLandscapePackage.Literals.TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTargetSet getTargetSet() {
		if (eContainerFeatureID() != XLandscapePackage.TARGET__TARGET_SET) return null;
		return (XTargetSet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetSet(XTargetSet newTargetSet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTargetSet, XLandscapePackage.TARGET__TARGET_SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSet(XTargetSet newTargetSet) {
		if (newTargetSet != eInternalContainer() || (eContainerFeatureID() != XLandscapePackage.TARGET__TARGET_SET && newTargetSet != null)) {
			if (EcoreUtil.isAncestor(this, newTargetSet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTargetSet != null)
				msgs = ((InternalEObject)newTargetSet).eInverseAdd(this, XLandscapePackage.TARGET_SET__TARGETS, XTargetSet.class, msgs);
			msgs = basicSetTargetSet(newTargetSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XLandscapePackage.TARGET__TARGET_SET, newTargetSet, newTargetSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XLandscapePackage.TARGET__TARGET_SET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTargetSet((XTargetSet)otherEnd, msgs);
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
			case XLandscapePackage.TARGET__TARGET_SET:
				return basicSetTargetSet(null, msgs);
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
			case XLandscapePackage.TARGET__TARGET_SET:
				return eInternalContainer().eInverseRemove(this, XLandscapePackage.TARGET_SET__TARGETS, XTargetSet.class, msgs);
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
			case XLandscapePackage.TARGET__TARGET_SET:
				return getTargetSet();
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
			case XLandscapePackage.TARGET__TARGET_SET:
				setTargetSet((XTargetSet)newValue);
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
			case XLandscapePackage.TARGET__TARGET_SET:
				setTargetSet((XTargetSet)null);
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
			case XLandscapePackage.TARGET__TARGET_SET:
				return getTargetSet() != null;
		}
		return super.eIsSet(featureID);
	}

} //XTargetImpl
