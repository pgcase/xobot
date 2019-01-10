package org.pgcase.xobot.workspace.resources;

import org.eclipse.core.resources.IResource;
import org.pgcase.xobot.workspace.core.XElement;

//stub implementation to associate IResource with XElement
public class XobotResourceElement implements XElement {
	
	private final IResource resource;

	public XobotResourceElement(IResource resource) {
		this.resource = resource;
	}
	
	public IResource getResource() {
		return resource;
	}

}
