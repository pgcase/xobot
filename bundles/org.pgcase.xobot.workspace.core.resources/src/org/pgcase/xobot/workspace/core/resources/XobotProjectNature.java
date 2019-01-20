package org.pgcase.xobot.workspace.core.resources;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class XobotProjectNature implements IProjectNature {
	
	public static final String XOBOT_NATURE_ID= "org.pgcase.xobot.workspace.core.resources.xobot"; //$NON-NLS-1$

	private IProject project;

	@Override
	public void configure() throws CoreException {
		// TODO add builder
	}

	@Override
	public void deconfigure() throws CoreException {
		// TODO remove builder
	}

	@Override
	public IProject getProject() {
		return project;
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;
	}

}
