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
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.event.EventAdmin;
import org.pgcase.xobot.basis.emf.edit.DomainContentAdapter;
import org.pgcase.xobot.basis.emf.edit.EditingDomainBasedRegistry;
import org.pgcase.xobot.landscape.model.api.XTarget;
import org.pgcase.xobot.landscape.model.api.XTargetSet;
import org.pgcase.xobot.landscape.model.meta.XLandscapeFactory;
import org.pgcase.xobot.landscape.model.meta.XLandscapePackage;
import org.pgcase.xobot.landscape.runtime.FocusDescriptors;
import org.pgcase.xobot.landscape.runtime.XLandscapeEvents;
import org.pgcase.xobot.landscape.runtime.XTargetDescriptor;
import org.pgcase.xobot.landscape.runtime.XTargetSetDescriptor;
import org.pgcase.xobot.landscape.runtime.registry.XTargetRegistry;

@Component
public class TargetDomainRegistry extends EditingDomainBasedRegistry<XTargetSetDescriptor> implements XTargetRegistry {

	private final Map<String, XTargetDescriptor> targets = new HashMap<>();

	@Activate
	public void activate() {
		XTargetSet set1 = XLandscapeFactory.eINSTANCE.createTargetSet();
		set1.setIdentifier("ru.pgconf.2019.xobot.official");
		set1.setName("PgConf.Russia 2019 Official");

		EList<XTarget> set1Targets = set1.getTargets();
		XTarget set1target1 = XLandscapeFactory.eINSTANCE.createTarget();
		set1target1.setIdentifier("ru.pgconf.2019.xobot.official.v0.1.0");
		set1target1.setName("Xobot v0.1.0");
		set1target1.setMaturity(FocusDescriptors.MATURITY_OFFICIAL);
		set1target1.setOrigin("jdbc");
		set1target1.setUri("jdbc:postgresql://ec2-54-75-230-41.eu-west-1.compute.amazonaws.com:5432/d85oais0tvhf9u");
		set1target1.setFork("official");
		set1Targets.add(set1target1);

		registerTargetSet(set1);

		XTargetSet set2 = XLandscapeFactory.eINSTANCE.createTargetSet();
		set2.setIdentifier("ru.pgconf.2019.xobot.stable");
		set2.setName("PgConf.Russia 2019 Stable");

		EList<XTarget> set2Targets = set2.getTargets();
		XTarget set2target1 = XLandscapeFactory.eINSTANCE.createTarget();
		set2target1.setIdentifier("ru.pgconf.2019.xobot.stable.v0.1.1");
		set2target1.setName("Xobot Stable");
		set2target1.setMaturity(FocusDescriptors.MATURITY_STABLE);
		set2target1.setOrigin("jdbc");
		set2target1.setUri("jdbc:postgresql://ec2-54-75-230-41.eu-west-1.compute.amazonaws.com:5432/d85oais0tvhf9u");
		set2target1.setFork("stable");
		set2Targets.add(set2target1);

		registerTargetSet(set2);

		XTargetSet set3 = XLandscapeFactory.eINSTANCE.createTargetSet();
		set3.setIdentifier("ru.pgconf.2019.xobot.integration");
		set3.setName("PgConf.Russia 2019 Integration");

		EList<XTarget> set3Targets = set3.getTargets();
		XTarget set3target1 = XLandscapeFactory.eINSTANCE.createTarget();
		set3target1.setIdentifier("ru.pgconf.2019.xobot.integration.v0.1.1-SNAPSHOT");
		set3target1.setName("Xobot Integration");
		set3target1.setMaturity(FocusDescriptors.MATURITY_INTEGRATION);
		set3target1.setOrigin("jdbc");
		set3target1.setUri("jdbc:postgresql://ec2-54-75-230-41.eu-west-1.compute.amazonaws.com:5432/d85oais0tvhf9u");
		set3target1.setFork("integration");
		set3Targets.add(set3target1);

		registerTargetSet(set3);

		XTargetSet set4 = XLandscapeFactory.eINSTANCE.createTargetSet();
		set4.setIdentifier("ru.pgconf.2019.xobot.sandbox");
		set4.setName("PgConf.Russia 2019 Sandbox");
		EList<XTarget> set4Targets = set4.getTargets();

		XTarget set4target1 = XLandscapeFactory.eINSTANCE.createTarget();
		set4target1.setIdentifier("ru.pgconf.2019.xobot.sandbox.dbpro");
		set4target1.setName("Xobot Sandbox dbpro");
		set4target1.setMaturity(FocusDescriptors.MATURITY_SANDBOX);
		set4target1.setOrigin("jdbc");
		set4target1.setUri("jdbc:postgresql://ec2-54-75-230-41.eu-west-1.compute.amazonaws.com:5432/d85oais0tvhf9u");
		set4target1.setFork("sandbox_dbpro");
		set4Targets.add(set4target1);

		XTarget set4target2 = XLandscapeFactory.eINSTANCE.createTarget();
		set4target2.setIdentifier("ru.pgconf.2019.xobot.sandbox.parse");
		set4target2.setName("Xobot Sandbox parse");
		set4target2.setMaturity(FocusDescriptors.MATURITY_SANDBOX);
		set4target2.setOrigin("jdbc");
		set4target2.setUri("jdbc:postgresql://ec2-54-75-230-41.eu-west-1.compute.amazonaws.com:5432/d85oais0tvhf9u");
		set4target2.setFork("sandbox_parse");
		set4Targets.add(set4target2);

		XTarget set4target3 = XLandscapeFactory.eINSTANCE.createTarget();
		set4target3.setIdentifier("ru.pgconf.2019.xobot.sandbox.model");
		set4target3.setName("Xobot Sandbox model");
		set4target3.setMaturity(FocusDescriptors.MATURITY_SANDBOX);
		set4target3.setOrigin("jdbc");
		set4target3.setUri("jdbc:postgresql://ec2-54-75-230-41.eu-west-1.compute.amazonaws.com:5432/d85oais0tvhf9u");
		set4target3.setFork("sandbox_model");
		set4Targets.add(set4target3);

		registerTargetSet(set4);
	}

	@Reference
	@Override
	public void bindEventAdmin(EventAdmin eventAdmin) {
		super.bindEventAdmin(eventAdmin);
	}
	
	@Override
	public void unbindEventAdmin(EventAdmin eventAdmin) {
		super.unbindEventAdmin(eventAdmin);
	}

	@Override
	public Iterable<? extends XTargetSetDescriptor> getTargetSets() {
		return getRegistryContent();
	}

	@Override
	public Iterable<XTargetDescriptor> getTargets() {
		return targets.values();
	}

	@Override
	public void registerTargetSet(XTargetSetDescriptor targetSet) {
		registerContent(targetSet);
	}

	@Override
	public void unregisterTargetSet(String targetSetIdentifier) {
		unregisterContent(targetSetIdentifier);
	}

	@Override
	public void registerTarget(XTargetDescriptor target) {
		String identifier = target.getIdentifier();
		targets.put(identifier, target);
		// TODO Auto-generated method stub
	}

	@Override
	public void unregisterTarget(String targetIdentifier) {
		// TODO Auto-generated method stub

	}

	@Override
	public Class<XTargetSetDescriptor> getContentClass() {
		return XTargetSetDescriptor.class;
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
	protected DomainContentAdapter<XTargetSetDescriptor, TargetDomainRegistry> createContentAdapter() {
		return new TargetDomainRegistryTracker(this);
	}

	@Override
	public String resolveIdentifier(XTargetSetDescriptor content) {
		if (content == null) {
			return null;
		}
		return content.getIdentifier();
	}

	@Override
	public String getContentCreateTopic() {
		return XLandscapeEvents.TARGET_SET_CREATE;
	}

	@Override
	public String getContentUpdateTopic() {
		return XLandscapeEvents.TARGET_SET_UPDATE;
	}

	@Override
	public String getContentDeleteTopic() {
		return XLandscapeEvents.TARGET_SET_DELETE;
	}

}
