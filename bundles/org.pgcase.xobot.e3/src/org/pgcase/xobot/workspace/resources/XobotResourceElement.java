package org.pgcase.xobot.workspace.resources;

import java.util.Collections;

import org.eclipse.core.resources.IResource;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectSourceDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor;

//stub implementation to associate IResource with XElement, should be obtained via registry service
public class XobotResourceElement implements XProjectDescriptor {
	
	private final IResource resource;

	public XobotResourceElement(IResource resource) {
		this.resource = resource;
	}
	
	public IResource getResource() {
		return resource;
	}
	
	@Override
	public String getIdentifier() {
		return resource.getFullPath().toString();
	}
	
	@Override
	public String getName() {
		return resource.getName();
	}
	
	@Override
	public Iterable<? extends XProjectSourceDescriptor> getProjectSources() {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends XProjectTargetDescriptor> getProjectTargets() {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}

}
