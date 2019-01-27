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
 * @see org.pgcase.xobot.landscape.model.meta.XLandscapeFactory
 * @model kind="package"
 * @generated
 */
public interface XLandscapePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "landscape"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.pgcase.org/xobot/landscape/0.1.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "landscape"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XLandscapePackage eINSTANCE = org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pgcase.xobot.landscape.runtime.XFocusDescriptor <em>Focus Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pgcase.xobot.landscape.runtime.XFocusDescriptor
	 * @see org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl#getFocusDescriptor()
	 * @generated
	 */
	int FOCUS_DESCRIPTOR = 0;

	/**
	 * The number of structural features of the '<em>Focus Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_DESCRIPTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Focus Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.pgcase.xobot.landscape.runtime.XSourceSetDescriptor <em>Source Set Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pgcase.xobot.landscape.runtime.XSourceSetDescriptor
	 * @see org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl#getSourceSetDescriptor()
	 * @generated
	 */
	int SOURCE_SET_DESCRIPTOR = 1;

	/**
	 * The number of structural features of the '<em>Source Set Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SET_DESCRIPTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Source Set Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SET_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.pgcase.xobot.landscape.runtime.XSourceDescriptor <em>Source Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pgcase.xobot.landscape.runtime.XSourceDescriptor
	 * @see org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl#getSourceDescriptor()
	 * @generated
	 */
	int SOURCE_DESCRIPTOR = 2;

	/**
	 * The number of structural features of the '<em>Source Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DESCRIPTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Source Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.pgcase.xobot.landscape.runtime.XTargetSetDescriptor <em>Target Set Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pgcase.xobot.landscape.runtime.XTargetSetDescriptor
	 * @see org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl#getTargetSetDescriptor()
	 * @generated
	 */
	int TARGET_SET_DESCRIPTOR = 3;

	/**
	 * The number of structural features of the '<em>Target Set Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_SET_DESCRIPTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Target Set Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_SET_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.pgcase.xobot.landscape.runtime.XTargetDescriptor <em>Target Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pgcase.xobot.landscape.runtime.XTargetDescriptor
	 * @see org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl#getTargetDescriptor()
	 * @generated
	 */
	int TARGET_DESCRIPTOR = 4;

	/**
	 * The number of structural features of the '<em>Target Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_DESCRIPTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Target Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.pgcase.xobot.landscape.model.impl.XFocusImpl <em>Focus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pgcase.xobot.landscape.model.impl.XFocusImpl
	 * @see org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl#getFocus()
	 * @generated
	 */
	int FOCUS = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS__IDENTIFIER = FOCUS_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS__NAME = FOCUS_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maturity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS__MATURITY = FOCUS_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS__ORIGIN = FOCUS_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS__URI = FOCUS_DESCRIPTOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Focus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_FEATURE_COUNT = FOCUS_DESCRIPTOR_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Focus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_OPERATION_COUNT = FOCUS_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pgcase.xobot.landscape.model.impl.XSourceSetImpl <em>Source Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pgcase.xobot.landscape.model.impl.XSourceSetImpl
	 * @see org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl#getSourceSet()
	 * @generated
	 */
	int SOURCE_SET = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SET__IDENTIFIER = SOURCE_SET_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SET__NAME = SOURCE_SET_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SET__SOURCES = SOURCE_SET_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Source Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SET_FEATURE_COUNT = SOURCE_SET_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Source Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SET_OPERATION_COUNT = SOURCE_SET_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pgcase.xobot.landscape.model.impl.XSourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pgcase.xobot.landscape.model.impl.XSourceImpl
	 * @see org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__IDENTIFIER = FOCUS__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__NAME = FOCUS__NAME;

	/**
	 * The feature id for the '<em><b>Maturity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__MATURITY = FOCUS__MATURITY;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ORIGIN = FOCUS__ORIGIN;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__URI = FOCUS__URI;

	/**
	 * The feature id for the '<em><b>Source Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SOURCE_SET = FOCUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = FOCUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = FOCUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pgcase.xobot.landscape.model.impl.XTargetSetImpl <em>Target Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pgcase.xobot.landscape.model.impl.XTargetSetImpl
	 * @see org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl#getTargetSet()
	 * @generated
	 */
	int TARGET_SET = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_SET__IDENTIFIER = TARGET_SET_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_SET__NAME = TARGET_SET_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_SET__TARGETS = TARGET_SET_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Target Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_SET_FEATURE_COUNT = TARGET_SET_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Target Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_SET_OPERATION_COUNT = TARGET_SET_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pgcase.xobot.landscape.model.impl.XTargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pgcase.xobot.landscape.model.impl.XTargetImpl
	 * @see org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 9;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__IDENTIFIER = FOCUS__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__NAME = FOCUS__NAME;

	/**
	 * The feature id for the '<em><b>Maturity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__MATURITY = FOCUS__MATURITY;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__ORIGIN = FOCUS__ORIGIN;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__URI = FOCUS__URI;

	/**
	 * The feature id for the '<em><b>Target Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__TARGET_SET = FOCUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = FOCUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_OPERATION_COUNT = FOCUS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.pgcase.xobot.landscape.runtime.XFocusDescriptor <em>Focus Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Focus Descriptor</em>'.
	 * @see org.pgcase.xobot.landscape.runtime.XFocusDescriptor
	 * @model instanceClass="org.pgcase.xobot.landscape.runtime.XFocusDescriptor"
	 * @generated
	 */
	EClass getFocusDescriptor();

	/**
	 * Returns the meta object for class '{@link org.pgcase.xobot.landscape.runtime.XSourceSetDescriptor <em>Source Set Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Set Descriptor</em>'.
	 * @see org.pgcase.xobot.landscape.runtime.XSourceSetDescriptor
	 * @model instanceClass="org.pgcase.xobot.landscape.runtime.XSourceSetDescriptor"
	 * @generated
	 */
	EClass getSourceSetDescriptor();

	/**
	 * Returns the meta object for class '{@link org.pgcase.xobot.landscape.runtime.XSourceDescriptor <em>Source Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Descriptor</em>'.
	 * @see org.pgcase.xobot.landscape.runtime.XSourceDescriptor
	 * @model instanceClass="org.pgcase.xobot.landscape.runtime.XSourceDescriptor"
	 * @generated
	 */
	EClass getSourceDescriptor();

	/**
	 * Returns the meta object for class '{@link org.pgcase.xobot.landscape.runtime.XTargetSetDescriptor <em>Target Set Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Set Descriptor</em>'.
	 * @see org.pgcase.xobot.landscape.runtime.XTargetSetDescriptor
	 * @model instanceClass="org.pgcase.xobot.landscape.runtime.XTargetSetDescriptor"
	 * @generated
	 */
	EClass getTargetSetDescriptor();

	/**
	 * Returns the meta object for class '{@link org.pgcase.xobot.landscape.runtime.XTargetDescriptor <em>Target Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Descriptor</em>'.
	 * @see org.pgcase.xobot.landscape.runtime.XTargetDescriptor
	 * @model instanceClass="org.pgcase.xobot.landscape.runtime.XTargetDescriptor"
	 * @generated
	 */
	EClass getTargetDescriptor();

	/**
	 * Returns the meta object for class '{@link org.pgcase.xobot.landscape.model.api.XFocus <em>Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Focus</em>'.
	 * @see org.pgcase.xobot.landscape.model.api.XFocus
	 * @generated
	 */
	EClass getFocus();

	/**
	 * Returns the meta object for the attribute '{@link org.pgcase.xobot.landscape.model.api.XFocus#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.pgcase.xobot.landscape.model.api.XFocus#getIdentifier()
	 * @see #getFocus()
	 * @generated
	 */
	EAttribute getFocus_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.pgcase.xobot.landscape.model.api.XFocus#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.pgcase.xobot.landscape.model.api.XFocus#getName()
	 * @see #getFocus()
	 * @generated
	 */
	EAttribute getFocus_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.pgcase.xobot.landscape.model.api.XFocus#getMaturity <em>Maturity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maturity</em>'.
	 * @see org.pgcase.xobot.landscape.model.api.XFocus#getMaturity()
	 * @see #getFocus()
	 * @generated
	 */
	EAttribute getFocus_Maturity();

	/**
	 * Returns the meta object for the attribute '{@link org.pgcase.xobot.landscape.model.api.XFocus#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see org.pgcase.xobot.landscape.model.api.XFocus#getOrigin()
	 * @see #getFocus()
	 * @generated
	 */
	EAttribute getFocus_Origin();

	/**
	 * Returns the meta object for the attribute '{@link org.pgcase.xobot.landscape.model.api.XFocus#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.pgcase.xobot.landscape.model.api.XFocus#getUri()
	 * @see #getFocus()
	 * @generated
	 */
	EAttribute getFocus_Uri();

	/**
	 * Returns the meta object for class '{@link org.pgcase.xobot.landscape.model.api.XSourceSet <em>Source Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Set</em>'.
	 * @see org.pgcase.xobot.landscape.model.api.XSourceSet
	 * @generated
	 */
	EClass getSourceSet();

	/**
	 * Returns the meta object for the attribute '{@link org.pgcase.xobot.landscape.model.api.XSourceSet#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.pgcase.xobot.landscape.model.api.XSourceSet#getIdentifier()
	 * @see #getSourceSet()
	 * @generated
	 */
	EAttribute getSourceSet_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.pgcase.xobot.landscape.model.api.XSourceSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.pgcase.xobot.landscape.model.api.XSourceSet#getName()
	 * @see #getSourceSet()
	 * @generated
	 */
	EAttribute getSourceSet_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pgcase.xobot.landscape.model.api.XSourceSet#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see org.pgcase.xobot.landscape.model.api.XSourceSet#getSources()
	 * @see #getSourceSet()
	 * @generated
	 */
	EReference getSourceSet_Sources();

	/**
	 * Returns the meta object for class '{@link org.pgcase.xobot.landscape.model.api.XSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see org.pgcase.xobot.landscape.model.api.XSource
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the container reference '{@link org.pgcase.xobot.landscape.model.api.XSource#getSourceSet <em>Source Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source Set</em>'.
	 * @see org.pgcase.xobot.landscape.model.api.XSource#getSourceSet()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_SourceSet();

	/**
	 * Returns the meta object for class '{@link org.pgcase.xobot.landscape.model.api.XTargetSet <em>Target Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Set</em>'.
	 * @see org.pgcase.xobot.landscape.model.api.XTargetSet
	 * @generated
	 */
	EClass getTargetSet();

	/**
	 * Returns the meta object for the attribute '{@link org.pgcase.xobot.landscape.model.api.XTargetSet#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.pgcase.xobot.landscape.model.api.XTargetSet#getIdentifier()
	 * @see #getTargetSet()
	 * @generated
	 */
	EAttribute getTargetSet_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.pgcase.xobot.landscape.model.api.XTargetSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.pgcase.xobot.landscape.model.api.XTargetSet#getName()
	 * @see #getTargetSet()
	 * @generated
	 */
	EAttribute getTargetSet_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pgcase.xobot.landscape.model.api.XTargetSet#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targets</em>'.
	 * @see org.pgcase.xobot.landscape.model.api.XTargetSet#getTargets()
	 * @see #getTargetSet()
	 * @generated
	 */
	EReference getTargetSet_Targets();

	/**
	 * Returns the meta object for class '{@link org.pgcase.xobot.landscape.model.api.XTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see org.pgcase.xobot.landscape.model.api.XTarget
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Returns the meta object for the container reference '{@link org.pgcase.xobot.landscape.model.api.XTarget#getTargetSet <em>Target Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Target Set</em>'.
	 * @see org.pgcase.xobot.landscape.model.api.XTarget#getTargetSet()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_TargetSet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XLandscapeFactory getLandscapeFactory();

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
		 * The meta object literal for the '{@link org.pgcase.xobot.landscape.runtime.XFocusDescriptor <em>Focus Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pgcase.xobot.landscape.runtime.XFocusDescriptor
		 * @see org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl#getFocusDescriptor()
		 * @generated
		 */
		EClass FOCUS_DESCRIPTOR = eINSTANCE.getFocusDescriptor();

		/**
		 * The meta object literal for the '{@link org.pgcase.xobot.landscape.runtime.XSourceSetDescriptor <em>Source Set Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pgcase.xobot.landscape.runtime.XSourceSetDescriptor
		 * @see org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl#getSourceSetDescriptor()
		 * @generated
		 */
		EClass SOURCE_SET_DESCRIPTOR = eINSTANCE.getSourceSetDescriptor();

		/**
		 * The meta object literal for the '{@link org.pgcase.xobot.landscape.runtime.XSourceDescriptor <em>Source Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pgcase.xobot.landscape.runtime.XSourceDescriptor
		 * @see org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl#getSourceDescriptor()
		 * @generated
		 */
		EClass SOURCE_DESCRIPTOR = eINSTANCE.getSourceDescriptor();

		/**
		 * The meta object literal for the '{@link org.pgcase.xobot.landscape.runtime.XTargetSetDescriptor <em>Target Set Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pgcase.xobot.landscape.runtime.XTargetSetDescriptor
		 * @see org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl#getTargetSetDescriptor()
		 * @generated
		 */
		EClass TARGET_SET_DESCRIPTOR = eINSTANCE.getTargetSetDescriptor();

		/**
		 * The meta object literal for the '{@link org.pgcase.xobot.landscape.runtime.XTargetDescriptor <em>Target Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pgcase.xobot.landscape.runtime.XTargetDescriptor
		 * @see org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl#getTargetDescriptor()
		 * @generated
		 */
		EClass TARGET_DESCRIPTOR = eINSTANCE.getTargetDescriptor();

		/**
		 * The meta object literal for the '{@link org.pgcase.xobot.landscape.model.impl.XFocusImpl <em>Focus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pgcase.xobot.landscape.model.impl.XFocusImpl
		 * @see org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl#getFocus()
		 * @generated
		 */
		EClass FOCUS = eINSTANCE.getFocus();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOCUS__IDENTIFIER = eINSTANCE.getFocus_Identifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOCUS__NAME = eINSTANCE.getFocus_Name();

		/**
		 * The meta object literal for the '<em><b>Maturity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOCUS__MATURITY = eINSTANCE.getFocus_Maturity();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOCUS__ORIGIN = eINSTANCE.getFocus_Origin();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOCUS__URI = eINSTANCE.getFocus_Uri();

		/**
		 * The meta object literal for the '{@link org.pgcase.xobot.landscape.model.impl.XSourceSetImpl <em>Source Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pgcase.xobot.landscape.model.impl.XSourceSetImpl
		 * @see org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl#getSourceSet()
		 * @generated
		 */
		EClass SOURCE_SET = eINSTANCE.getSourceSet();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_SET__IDENTIFIER = eINSTANCE.getSourceSet_Identifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_SET__NAME = eINSTANCE.getSourceSet_Name();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_SET__SOURCES = eINSTANCE.getSourceSet_Sources();

		/**
		 * The meta object literal for the '{@link org.pgcase.xobot.landscape.model.impl.XSourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pgcase.xobot.landscape.model.impl.XSourceImpl
		 * @see org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Source Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__SOURCE_SET = eINSTANCE.getSource_SourceSet();

		/**
		 * The meta object literal for the '{@link org.pgcase.xobot.landscape.model.impl.XTargetSetImpl <em>Target Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pgcase.xobot.landscape.model.impl.XTargetSetImpl
		 * @see org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl#getTargetSet()
		 * @generated
		 */
		EClass TARGET_SET = eINSTANCE.getTargetSet();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_SET__IDENTIFIER = eINSTANCE.getTargetSet_Identifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_SET__NAME = eINSTANCE.getTargetSet_Name();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_SET__TARGETS = eINSTANCE.getTargetSet_Targets();

		/**
		 * The meta object literal for the '{@link org.pgcase.xobot.landscape.model.impl.XTargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pgcase.xobot.landscape.model.impl.XTargetImpl
		 * @see org.pgcase.xobot.landscape.model.impl.XLandscapePackageImpl#getTarget()
		 * @generated
		 */
		EClass TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '<em><b>Target Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__TARGET_SET = eINSTANCE.getTarget_TargetSet();

	}

} //XLandscapePackage
