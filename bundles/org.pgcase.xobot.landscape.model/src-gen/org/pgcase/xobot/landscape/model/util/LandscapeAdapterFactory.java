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
package org.pgcase.xobot.landscape.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.pgcase.xobot.landscape.model.api.*;
import org.pgcase.xobot.landscape.model.meta.XLandscapePackage;
import org.pgcase.xobot.landscape.runtime.XFocusDescriptor;
import org.pgcase.xobot.landscape.runtime.XSourceDescriptor;
import org.pgcase.xobot.landscape.runtime.XSourceSetDescriptor;
import org.pgcase.xobot.landscape.runtime.XTargetDescriptor;
import org.pgcase.xobot.landscape.runtime.XTargetSetDescriptor;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.pgcase.xobot.landscape.model.meta.XLandscapePackage
 * @generated
 */
public class LandscapeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XLandscapePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LandscapeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XLandscapePackage.eINSTANCE;
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
	protected LandscapeSwitch<Adapter> modelSwitch =
		new LandscapeSwitch<Adapter>() {
			@Override
			public Adapter caseFocusDescriptor(XFocusDescriptor object) {
				return createFocusDescriptorAdapter();
			}
			@Override
			public Adapter caseSourceSetDescriptor(XSourceSetDescriptor object) {
				return createSourceSetDescriptorAdapter();
			}
			@Override
			public Adapter caseSourceDescriptor(XSourceDescriptor object) {
				return createSourceDescriptorAdapter();
			}
			@Override
			public Adapter caseTargetSetDescriptor(XTargetSetDescriptor object) {
				return createTargetSetDescriptorAdapter();
			}
			@Override
			public Adapter caseTargetDescriptor(XTargetDescriptor object) {
				return createTargetDescriptorAdapter();
			}
			@Override
			public Adapter caseFocus(XFocus object) {
				return createFocusAdapter();
			}
			@Override
			public Adapter caseSourceSet(XSourceSet object) {
				return createSourceSetAdapter();
			}
			@Override
			public Adapter caseSource(XSource object) {
				return createSourceAdapter();
			}
			@Override
			public Adapter caseTargetSet(XTargetSet object) {
				return createTargetSetAdapter();
			}
			@Override
			public Adapter caseTarget(XTarget object) {
				return createTargetAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.pgcase.xobot.landscape.runtime.XFocusDescriptor <em>Focus Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pgcase.xobot.landscape.runtime.XFocusDescriptor
	 * @generated
	 */
	public Adapter createFocusDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pgcase.xobot.landscape.runtime.XSourceSetDescriptor <em>Source Set Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pgcase.xobot.landscape.runtime.XSourceSetDescriptor
	 * @generated
	 */
	public Adapter createSourceSetDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pgcase.xobot.landscape.runtime.XSourceDescriptor <em>Source Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pgcase.xobot.landscape.runtime.XSourceDescriptor
	 * @generated
	 */
	public Adapter createSourceDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pgcase.xobot.landscape.runtime.XTargetSetDescriptor <em>Target Set Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pgcase.xobot.landscape.runtime.XTargetSetDescriptor
	 * @generated
	 */
	public Adapter createTargetSetDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pgcase.xobot.landscape.runtime.XTargetDescriptor <em>Target Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pgcase.xobot.landscape.runtime.XTargetDescriptor
	 * @generated
	 */
	public Adapter createTargetDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pgcase.xobot.landscape.model.api.XFocus <em>Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pgcase.xobot.landscape.model.api.XFocus
	 * @generated
	 */
	public Adapter createFocusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pgcase.xobot.landscape.model.api.XSourceSet <em>Source Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pgcase.xobot.landscape.model.api.XSourceSet
	 * @generated
	 */
	public Adapter createSourceSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pgcase.xobot.landscape.model.api.XSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pgcase.xobot.landscape.model.api.XSource
	 * @generated
	 */
	public Adapter createSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pgcase.xobot.landscape.model.api.XTargetSet <em>Target Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pgcase.xobot.landscape.model.api.XTargetSet
	 * @generated
	 */
	public Adapter createTargetSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pgcase.xobot.landscape.model.api.XTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pgcase.xobot.landscape.model.api.XTarget
	 * @generated
	 */
	public Adapter createTargetAdapter() {
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

} //LandscapeAdapterFactory
