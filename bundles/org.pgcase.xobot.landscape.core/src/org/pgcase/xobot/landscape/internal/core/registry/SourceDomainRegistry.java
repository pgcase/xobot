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
import org.pgcase.xobot.basis.runtime.IdentifiedDescriptor;
import org.pgcase.xobot.landscape.model.api.XSource;
import org.pgcase.xobot.landscape.model.api.XSourceSet;
import org.pgcase.xobot.landscape.model.meta.XLandscapeFactory;
import org.pgcase.xobot.landscape.model.meta.XLandscapePackage;
import org.pgcase.xobot.landscape.runtime.XSourceDescriptor;
import org.pgcase.xobot.landscape.runtime.XSourceSetDescriptor;
import org.pgcase.xobot.landscape.runtime.registry.XSourceRegistry;

@Component
public class SourceDomainRegistry extends EditingDomainBasedRegistry implements XSourceRegistry {
	
	private final Map<String, XSourceSetDescriptor> sourceSets = new HashMap<>();
	private final Map<String, XSourceDescriptor> sources = new HashMap<>();
	
	@Activate
	public void activate() {
		XSourceSet set1 = XLandscapeFactory.eINSTANCE.createSourceSet();
		set1.setIdentifier("org.pgcase");
		set1.setName("PgCase Sources");
		EList<XSource> set1Sources = set1.getSources();
		XSource set1source1 = XLandscapeFactory.eINSTANCE.createSource();
		set1source1.setIdentifier("org.pgcase.pgconf.russia.2019");
		set1source1.setName("PgConf.Russia 2019");
		set1source1.setOrigin("git");
		set1source1.setUri("https://github.com/pgcase/pgconf");
		set1Sources.add(set1source1);
		registerSourceSet(set1);
	}

	@Override
	public Iterable<? extends IdentifiedDescriptor> getIdentifiedContent() {
		return getSourceSets();
	}

	@Override
	public Iterable<XSourceSetDescriptor> getSourceSets() {
		return sourceSets.values();
	}

	@Override
	public Iterable<XSourceDescriptor> getSources() {
		return sources.values();
	}

	@Override
	public void registerSourceSet(XSourceSetDescriptor sourceSet) {
		String identifier = sourceSet.getIdentifier();
		sourceSets.put(identifier, sourceSet);
	}

	@Override
	public void unregisterSourceSet(String sourceSetIdentifier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerSource(XSourceDescriptor source) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterSource(String sourceIdentifier) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EClass getContentClassifier() {
		return XLandscapePackage.eINSTANCE.getSourceSet();
	}

	@Override
	public EStructuralFeature getContentIdentifierAttribute() {
		return XLandscapePackage.eINSTANCE.getSourceSet_Identifier();
	}

	@Override
	public EStructuralFeature getContentNameAttribute() {
		return XLandscapePackage.eINSTANCE.getSourceSet_Name();
	}

	@Override
	protected DomainContentAdapter<SourceDomainRegistry> createContentAdapter() {
		return new SourceDomainRegistryTracker(this);
	}

	@Override
	public void registerContent(IdentifiedDescriptor content) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterContent(String identifier) {
		// TODO Auto-generated method stub
		
	}

}
