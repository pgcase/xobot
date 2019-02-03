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
package org.pgcase.xobot.workspace.internal.core.registry;

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
import org.pgcase.xobot.landscape.runtime.XPileDescriptor;
import org.pgcase.xobot.landscape.runtime.XSourceDescriptor;
import org.pgcase.xobot.landscape.runtime.XTargetDescriptor;
import org.pgcase.xobot.workspace.model.api.XProject;
import org.pgcase.xobot.workspace.model.api.XProjectFolder;
import org.pgcase.xobot.workspace.model.api.XProjectSource;
import org.pgcase.xobot.workspace.model.api.XProjectTarget;
import org.pgcase.xobot.workspace.model.meta.XWorkspaceFactory;
import org.pgcase.xobot.workspace.model.meta.XWorkspacePackage;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.XWorkspaceEvents;
import org.pgcase.xobot.workspace.runtime.registry.XProjectRegistry;

@Component
public class ProjectDomainRegistry extends EditingDomainBasedRegistry<XProjectDescriptor> implements XProjectRegistry {

	private final Map<String, XProjectDescriptor> projectIndex = new HashMap<>();

	@Activate
	@Override
	public void activate(Map<String, Object> properties) {
		super.activate(properties);
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
	public Iterable<? extends XProjectDescriptor> getRegistryContent() {
		return getProjects();
	}

	@Override
	public Iterable<XProjectDescriptor> getProjects() {
		return projectIndex.values();
	}

	@Override
	public XProjectDescriptor getProject(String projectIdentifier) {
		return projectIndex.get(projectIdentifier);
	}

	@Override
	public void registerProject(XProjectDescriptor project) {
		registerContent(project);
	}

	@Override
	public void unregisterProject(String projectIdentifier) {
		unregisterContent(projectIdentifier);
	}

	@Override
	public EClass getContentClassifier() {
		return XWorkspacePackage.eINSTANCE.getProject();
	}

	@Override
	public EStructuralFeature getContentIdentifierAttribute() {
		return XWorkspacePackage.eINSTANCE.getProject_Identifier();
	}

	@Override
	public EStructuralFeature getContentNameAttribute() {
		return XWorkspacePackage.eINSTANCE.getProject_Name();
	}

	@Override
	protected DomainContentAdapter<XProjectDescriptor, ProjectDomainRegistry> createContentAdapter() {
		return new ProjectDomainRegistryTracker(this);
	}

	@Override
	public XProjectDescriptor createProject(String projectIdentifier, Iterable<? extends XSourceDescriptor> sources,
			Iterable<? extends XTargetDescriptor> targets, Iterable<? extends XPileDescriptor> folders) {
		XWorkspaceFactory factory = XWorkspaceFactory.eINSTANCE;
		XProject created = factory.createProject();
		created.setIdentifier(projectIdentifier);
		created.setName(projectIdentifier);
		if (sources != null) {
			EList<XProjectSource> projectSources = created.getProjectSources();
			for (XSourceDescriptor source : sources) {
				XProjectSource projectSource = factory.createProjectSource();
				projectSource.setSourceIdentifier(source.getIdentifier());
				projectSources.add(projectSource);
			}
		}
		if (targets != null) {
			EList<XProjectTarget> projectTargets = created.getProjectTargets();
			for (XTargetDescriptor target : targets) {
				XProjectTarget projectTarget = factory.createProjectTarget();
				projectTarget.setTargetIdentifier(target.getIdentifier());
				projectTargets.add(projectTarget);
			}
		}
		if (folders != null) {
			EList<XProjectFolder> projectFolders = created.getProjectFolders();
			for (XPileDescriptor pile : folders) {
				XProjectFolder projectFolder = factory.createProjectFolder();
				projectFolder.setIdentifier(pile.getIdentifier());
				projectFolder.setName(pile.getName());
				projectFolder.setPath(pile.getPath());
				projectFolder.setOrigin(pile.getOrigin());
				projectFolders.add(projectFolder);
			}
		}
		return created;
	}

	@Override
	public Class<XProjectDescriptor> getContentClass() {
		return XProjectDescriptor.class;
	}

	@Override
	public String resolveIdentifier(XProjectDescriptor content) {
		if (content == null) {
			return null;
		}
		return content.getIdentifier();
	}

	@Override
	public String getContentCreateTopic() {
		return XWorkspaceEvents.PROJECT_CREATE;
	}

	@Override
	public String getContentUpdateTopic() {
		return XWorkspaceEvents.PROJECT_UPDATE;
	}

	@Override
	public String getContentDeleteTopic() {
		return XWorkspaceEvents.PROJECT_DELETE;
	}

}
