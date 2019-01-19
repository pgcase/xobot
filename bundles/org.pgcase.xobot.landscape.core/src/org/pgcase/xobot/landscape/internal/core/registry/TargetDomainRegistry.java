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
package org.pgcase.xobot.landscape.internal.core.registry;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.pgcase.xobot.basis.emf.edit.DomainContentAdapter;
import org.pgcase.xobot.basis.emf.edit.EditingDomainBasedRegistry;
import org.pgcase.xobot.basis.emf.edit.EditingDomainRegistry;
import org.pgcase.xobot.basis.runtime.IdentifiedDescriptor;
import org.pgcase.xobot.landscape.model.api.XTargetSet;
import org.pgcase.xobot.landscape.model.meta.XLandscapeFactory;
import org.pgcase.xobot.landscape.model.meta.XLandscapePackage;
import org.pgcase.xobot.landscape.runtime.XTargetDescriptor;
import org.pgcase.xobot.landscape.runtime.XTargetSetDescriptor;
import org.pgcase.xobot.landscape.runtime.registry.XTargetRegistry;

@Component
public class TargetDomainRegistry extends EditingDomainBasedRegistry implements XTargetRegistry {
	
	private final Map<String, XTargetSetDescriptor> targetSets = new HashMap<>();
	private final Map<String, XTargetDescriptor> targets = new HashMap<>();

	@Activate
	public void activate() {
		XTargetSet set1 = XLandscapeFactory.eINSTANCE.createTargetSet();
		set1.setIdentifier("id1");
		set1.setName("Target Set 1");
		registerTargetSet(set1);
	}

	@Override
	public Iterable<? extends IdentifiedDescriptor> getIdentifiedContent() {
		return getTargetSets();
	}

	@Override
	public void registerContent(IdentifiedDescriptor content) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterContent(String identifier) {
		unregisterTargetSet(identifier);
	}

	@Override
	public Iterable<XTargetSetDescriptor> getTargetSets() {
		return targetSets.values();
	}

	@Override
	public Iterable<XTargetDescriptor> getTargets() {
		return targets.values();
	}

	@Override
	public void registerTargetSet(XTargetSetDescriptor targetSet) {
		String identifier = targetSet.getIdentifier();
		targetSets.put(identifier, targetSet);
	}

	@Override
	public void unregisterTargetSet(String targetSetIdentifier) {
		// TODO Auto-generated method stub
	
	}
	
	@Override
	public void registerTarget(XTargetDescriptor target) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void unregisterTarget(String targetIdentifier) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EClass getContentClassifier() {
		return XLandscapePackage.eINSTANCE.getTargetSet();
	}

	@Override
	public EStructuralFeature getContentIdentifierAttribute() {
		return XLandscapePackage.eINSTANCE.getTargetSet_Identifier();
	}

	@Override
	public EStructuralFeature getContentNameAttribute() {
		return XLandscapePackage.eINSTANCE.getTargetSet_Name();
	}

	@Override
	protected DomainContentAdapter<? extends EditingDomainRegistry> createContentAdapter() {
		return new TargetDomainRegistryTracker(this);
	}

}
