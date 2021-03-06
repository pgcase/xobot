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
import org.pgcase.xobot.landscape.model.api.XSource;
import org.pgcase.xobot.landscape.model.api.XSourceSet;
import org.pgcase.xobot.landscape.model.meta.XLandscapeFactory;
import org.pgcase.xobot.landscape.model.meta.XLandscapePackage;
import org.pgcase.xobot.landscape.runtime.FocusDescriptors;
import org.pgcase.xobot.landscape.runtime.XLandscapeEvents;
import org.pgcase.xobot.landscape.runtime.XSourceDescriptor;
import org.pgcase.xobot.landscape.runtime.XSourceSetDescriptor;
import org.pgcase.xobot.landscape.runtime.registry.XSourceRegistry;

@Component
public class SourceDomainRegistry extends EditingDomainBasedRegistry<XSourceSetDescriptor> implements XSourceRegistry {
	
	private final Map<String, XSourceDescriptor> sourceIndex = new HashMap<>();
	
	@Activate
	public void activate() {
		XSourceSet set1 = XLandscapeFactory.eINSTANCE.createSourceSet();
		set1.setIdentifier("ru.pgcase.xobot.official"); //$NON-NLS-1$
		set1.setName("PgCase Xobot Official"); //$NON-NLS-1$
		EList<XSource> set1Sources = set1.getSources();
		XSource set1source1 = XLandscapeFactory.eINSTANCE.createSource();
		set1source1.setIdentifier("ru.pgcase.xobot.official.v0.1.0"); //$NON-NLS-1$
		set1source1.setName("PgCase Xobot 0.1.0"); //$NON-NLS-1$
		set1source1.setMaturity(FocusDescriptors.MATURITY_OFFICIAL);
		set1source1.setOrigin("git"); //$NON-NLS-1$
		set1source1.setUri("https://github.com/pgcase/pgconf"); //$NON-NLS-1$
		set1source1.setFork("master"); //$NON-NLS-1$
		set1Sources.add(set1source1);
		registerSourceSet(set1);

		XSourceSet set2 = XLandscapeFactory.eINSTANCE.createSourceSet();
		set2.setIdentifier("ru.pgcase.xobot.stable"); //$NON-NLS-1$
		set2.setName("PgCase Xobot Stable"); //$NON-NLS-1$
		EList<XSource> set2Sources = set2.getSources();
		XSource set2source1 = XLandscapeFactory.eINSTANCE.createSource();
		set2source1.setIdentifier("ru.pgcase.xobot.official.v0.1.1"); //$NON-NLS-1$
		set2source1.setName("PgCase Xobot 0.1.1"); //$NON-NLS-1$
		set2source1.setMaturity(FocusDescriptors.MATURITY_STABLE);
		set2source1.setOrigin("git"); //$NON-NLS-1$
		set2source1.setUri("https://github.com/pgcase/pgconf"); //$NON-NLS-1$
		set2source1.setFork("master"); //$NON-NLS-1$
		set2Sources.add(set2source1);
		registerSourceSet(set2);

		XSourceSet set3 = XLandscapeFactory.eINSTANCE.createSourceSet();
		set3.setIdentifier("ru.pgcase.xobot.integration"); //$NON-NLS-1$
		set3.setName("PgCase Xobot Integration"); //$NON-NLS-1$
		EList<XSource> set3Sources = set3.getSources();
		XSource set3source1 = XLandscapeFactory.eINSTANCE.createSource();
		set3source1.setIdentifier("ru.pgcase.xobot.integration.v0.1.2-SNAPSHOT"); //$NON-NLS-1$
		set3source1.setName("PgCase Xobot 0.1.2-SNAPSHOT"); //$NON-NLS-1$
		set3source1.setMaturity(FocusDescriptors.MATURITY_INTEGRATION);
		set3source1.setOrigin("git"); //$NON-NLS-1$
		set3source1.setUri("https://github.com/pgcase/pgconf"); //$NON-NLS-1$
		set3source1.setFork("develop"); //$NON-NLS-1$
		set3Sources.add(set3source1);
		registerSourceSet(set3);

		XSourceSet set4 = XLandscapeFactory.eINSTANCE.createSourceSet();
		set4.setIdentifier("ru.pgcase.xobot.sandbox"); //$NON-NLS-1$
		set4.setName("PgCase Xobot Sandbox"); //$NON-NLS-1$
		EList<XSource> set4Sources = set4.getSources();
		XSource set4source1 = XLandscapeFactory.eINSTANCE.createSource();
		set4source1.setIdentifier("ru.pgcase.xobot.sandbox.dbpro"); //$NON-NLS-1$
		set4source1.setName("PgCase Xobot dbpro"); //$NON-NLS-1$
		set4source1.setMaturity(FocusDescriptors.MATURITY_SANDBOX);
		set4source1.setOrigin("git"); //$NON-NLS-1$
		set4source1.setUri("https://github.com/pgcase/pgconf"); //$NON-NLS-1$
		set4source1.setFork("feature/dbpro"); //$NON-NLS-1$
		set4Sources.add(set4source1);

		XSource set4source2 = XLandscapeFactory.eINSTANCE.createSource();
		set4source2.setIdentifier("ru.pgcase.xobot.sandbox.parse"); //$NON-NLS-1$
		set4source2.setName("PgCase Xobot parse"); //$NON-NLS-1$
		set4source2.setMaturity(FocusDescriptors.MATURITY_SANDBOX);
		set4source2.setOrigin("git"); //$NON-NLS-1$
		set4source2.setUri("https://github.com/pgcase/pgconf"); //$NON-NLS-1$
		set4source2.setFork("feature/parse"); //$NON-NLS-1$
		set4Sources.add(set4source2);

		XSource set4source3 = XLandscapeFactory.eINSTANCE.createSource();
		set4source3.setIdentifier("ru.pgcase.xobot.sandbox.model"); //$NON-NLS-1$
		set4source3.setName("PgCase Xobot model"); //$NON-NLS-1$
		set4source3.setMaturity(FocusDescriptors.MATURITY_SANDBOX);
		set4source3.setOrigin("git"); //$NON-NLS-1$
		set4source3.setUri("https://github.com/pgcase/pgconf"); //$NON-NLS-1$
		set4source3.setFork("feature/model"); //$NON-NLS-1$
		set4Sources.add(set4source3);

		registerSourceSet(set4);

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
	public Iterable<? extends XSourceSetDescriptor> getSourceSets() {
		return getRegistryContent();
	}

	@Override
	public void registerSourceSet(XSourceSetDescriptor sourceSet) {
		registerContent(sourceSet);
		Iterable<? extends XSourceDescriptor> sources = sourceSet.getSources();
		for (XSourceDescriptor sourceDescriptor : sources) {
			registerSource(sourceDescriptor);
		}
	}

	@Override
	public void unregisterSourceSet(String sourceSetIdentifier) {
		XSourceSetDescriptor content = getRegistryContent(sourceSetIdentifier);
		if (content != null) {
			Iterable<? extends XSourceDescriptor> sources = content.getSources();
			for (XSourceDescriptor sourceDescriptor : sources) {
				unregisterSource(sourceDescriptor.getIdentifier());
			}
		}
		unregisterContent(sourceSetIdentifier);
	}

	@Override
	public Iterable<XSourceDescriptor> getSources() {
		return sourceIndex.values();
	}
	
	@Override
	public XSourceDescriptor getSource(String sourceIdentifier) {
		return sourceIndex.get(sourceIdentifier);
	}

	@Override
	public void registerSource(XSourceDescriptor source) {
		String identifier = source.getIdentifier();
		sourceIndex.put(identifier, source);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterSource(String sourceIdentifier) {
		sourceIndex.remove(sourceIdentifier);
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
	protected DomainContentAdapter<XSourceSetDescriptor, SourceDomainRegistry> createContentAdapter() {
		return new SourceDomainRegistryTracker(this);
	}

	@Override
	public Class<XSourceSetDescriptor> getContentClass() {
		return XSourceSetDescriptor.class;
	}

	@Override
	public String resolveIdentifier(XSourceSetDescriptor content) {
		if (content == null) {
			return null;
		}
		return content.getIdentifier();
	}

	@Override
	public String getContentCreateTopic() {
		return XLandscapeEvents.SOURCE_SET_CREATE;
	}

	@Override
	public String getContentUpdateTopic() {
		return XLandscapeEvents.SOURCE_SET_UPDATE;
	}

	@Override
	public String getContentDeleteTopic() {
		return XLandscapeEvents.SOURCE_SET_DELETE;
	}

}
