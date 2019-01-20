package org.pgcase.xobot.workspace.team.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.team.core.RepositoryProvider;

public class XobotRepositoryProvider extends RepositoryProvider {

	public static final String REPOSITORY_PROVIDER_XOBOT = "org.pgcase.xobot.workspace.team.core.xobot";

	public XobotRepositoryProvider() {
		super();
	}

	@Override
	public void deconfigure() throws CoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public void configureProject() throws CoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getID() {
		return REPOSITORY_PROVIDER_XOBOT;
	}
	
}
