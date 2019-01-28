package org.pgcase.xobot.workspace.core.resources.mappings;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.resources.mapping.ResourceMappingContext;
import org.eclipse.core.resources.mapping.ResourceTraversal;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.pgcase.xobot.workspace.core.resources.WorkspaceCoreResources;

public class XobotResourceMapping extends ResourceMapping {

	private final IResource fResource;

	public XobotResourceMapping(IResource fResource) {
		this.fResource = fResource;
	}

	@Override
	public Object getModelObject() {
		return fResource;
	}

	@Override
	public String getModelProviderId() {
		return WorkspaceCoreResources.MODEL_PROVIDER_ID;
	}

	@Override
	public IProject[] getProjects() {
		return new IProject[] { fResource.getProject() };
	}

	@Override
	public ResourceTraversal[] getTraversals(ResourceMappingContext context, IProgressMonitor monitor)
			throws CoreException {
		return new ResourceTraversal[] { new ResourceTraversal(new IResource[] { fResource }, IResource.DEPTH_INFINITE, IResource.NONE) };
	}

}
