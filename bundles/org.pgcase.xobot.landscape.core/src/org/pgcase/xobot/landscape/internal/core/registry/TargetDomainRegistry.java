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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.pgcase.xobot.basis.emf.edit.DomainContentAdapter;
import org.pgcase.xobot.basis.emf.edit.EditingDomainBasedRegistry;
import org.pgcase.xobot.basis.emf.edit.EditingDomainRegistry;
import org.pgcase.xobot.basis.runtime.IdentifiedDescriptor;
import org.pgcase.xobot.landscape.model.api.XTarget;
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
		set1.setIdentifier("ru.pgconf.2019.test");
		set1.setName("PgConf.Russia 2019 Tests");

		EList<XTarget> set1Sources = set1.getTargets();
		XTarget set1source1 = XLandscapeFactory.eINSTANCE.createTarget();
		set1source1.setIdentifier("ru.pgconf.2019.test.xobot");
		set1source1.setName("Xobot Test");
		set1source1.setOrigin("jdbc");
		set1source1.setUri("jdbc:postgresql://ec2-54-75-230-41.eu-west-1.compute.amazonaws.com:5432/d85oais0tvhf9u");
		set1Sources.add(set1source1);

		registerTargetSet(set1);

		XTargetSet set2 = XLandscapeFactory.eINSTANCE.createTargetSet();
		set2.setIdentifier("ru.pgconf.2019.dev");
		set2.setName("PgConf.Russia 2019 Dev");

		EList<XTarget> set2Sources = set2.getTargets();
		XTarget set2source2 = XLandscapeFactory.eINSTANCE.createTarget();
		set2source2.setIdentifier("ru.pgconf.2019.dev.xobot");
		set2source2.setName("Xobot Dev");
		set2source2.setOrigin("jdbc");
		set2source2.setUri("jdbc:postgresql://ec2-54-75-230-41.eu-west-1.compute.amazonaws.com:5432/d85oais0tvhf9u");
		set2Sources.add(set2source2);

		registerTargetSet(set2);

		XTargetSet set3 = XLandscapeFactory.eINSTANCE.createTargetSet();
		set3.setIdentifier("ru.pgconf.2019.prod");
		set3.setName("PgConf.Russia 2019 Prod");

		EList<XTarget> set3Sources = set3.getTargets();
		XTarget set3source3 = XLandscapeFactory.eINSTANCE.createTarget();
		set3source3.setIdentifier("ru.pgconf.2019.prod.xobot");
		set3source3.setName("Xobot Prod");
		set3source3.setOrigin("jdbc");
		set3source3.setUri("jdbc:postgresql://ec2-54-75-230-41.eu-west-1.compute.amazonaws.com:5432/d85oais0tvhf9u");
		set3Sources.add(set3source3);

		registerTargetSet(set3);
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
