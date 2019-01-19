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
package org.pgcase.xobot.landscape.model.meta;

import org.eclipse.emf.ecore.EFactory;
import org.pgcase.xobot.landscape.model.api.XSource;
import org.pgcase.xobot.landscape.model.api.XSourceSet;
import org.pgcase.xobot.landscape.model.api.XTarget;
import org.pgcase.xobot.landscape.model.api.XTargetSet;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pgcase.xobot.landscape.model.meta.XLandscapePackage
 * @generated
 */
public interface XLandscapeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XLandscapeFactory eINSTANCE = org.pgcase.xobot.landscape.model.impl.XLandscapeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Source Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Set</em>'.
	 * @generated
	 */
	XSourceSet createSourceSet();

	/**
	 * Returns a new object of class '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source</em>'.
	 * @generated
	 */
	XSource createSource();

	/**
	 * Returns a new object of class '<em>Target Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Set</em>'.
	 * @generated
	 */
	XTargetSet createTargetSet();

	/**
	 * Returns a new object of class '<em>Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target</em>'.
	 * @generated
	 */
	XTarget createTarget();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XLandscapePackage getLandscapePackage();

} //XLandscapeFactory
