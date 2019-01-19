/*******************************************************************************
 * Copyright (c) 2018 ArSysOp
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.pgcase.xobot.basis.emf.edit.DomainContentAdapter;
import org.pgcase.xobot.basis.emf.edit.EditingDomainBasedRegistry;
import org.pgcase.xobot.basis.runtime.IdentifiedDescriptor;
import org.pgcase.xobot.workspace.model.meta.XWorkspacePackage;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.registry.XProjectRegistry;

@Component
public class ProjectDomainRegistry extends EditingDomainBasedRegistry implements XProjectRegistry {
	
	private final Map<String, XProjectDescriptor> projects = new HashMap<>();
	
	@Activate
	@Override
	public void activate(Map<String, Object> properties) {
		super.activate(properties);
	}
	
	@Override
	public Iterable<? extends IdentifiedDescriptor> getIdentifiedContent() {
		return getProjects();
	}

	@Override
	public Iterable<XProjectDescriptor> getProjects() {
		return projects.values();
	}
	
	@Override
	public XProjectDescriptor getProject(String projectIdentifier) {
		return projects.get(projectIdentifier);
	}

	@Override
	public void registerProject(XProjectDescriptor project) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterProject(String projectIdentifier) {
		// TODO Auto-generated method stub
		
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
	protected DomainContentAdapter<ProjectDomainRegistry> createContentAdapter() {
		return new ProjectDomainRegistryTracker(this);
	}

	@Override
	public void registerContent(IdentifiedDescriptor content) {
		if (content instanceof XProjectDescriptor) {
			XProjectDescriptor project = (XProjectDescriptor) content;
			registerProject(project);
		} else {
			// TODO Auto-generated method stub
		}
		
	}

	@Override
	public void unregisterContent(String identifier) {
		unregisterProject(identifier);
	}

}
