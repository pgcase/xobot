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
package org.pgcase.xobot.landscape.model.api;

import org.pgcase.xobot.landscape.runtime.XTargetDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pgcase.xobot.landscape.model.api.XTarget#getTargetSet <em>Target Set</em>}</li>
 * </ul>
 *
 * @see org.pgcase.xobot.landscape.model.meta.XLandscapePackage#getTarget()
 * @model superTypes="org.pgcase.xobot.landscape.model.api.Focus org.pgcase.xobot.landscape.model.api.TargetDescriptor"
 * @generated
 */
public interface XTarget extends XFocus, XTargetDescriptor {
	/**
	 * Returns the value of the '<em><b>Target Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.pgcase.xobot.landscape.model.api.XTargetSet#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Set</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Set</em>' container reference.
	 * @see #setTargetSet(XTargetSet)
	 * @see org.pgcase.xobot.landscape.model.meta.XLandscapePackage#getTarget_TargetSet()
	 * @see org.pgcase.xobot.landscape.model.api.XTargetSet#getTargets
	 * @model opposite="targets" required="true" transient="false"
	 * @generated
	 */
	XTargetSet getTargetSet();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.landscape.model.api.XTarget#getTargetSet <em>Target Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Set</em>' container reference.
	 * @see #getTargetSet()
	 * @generated
	 */
	void setTargetSet(XTargetSet value);

} // XTarget
