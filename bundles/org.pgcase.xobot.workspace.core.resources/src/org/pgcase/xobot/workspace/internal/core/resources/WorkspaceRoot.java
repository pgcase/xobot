package org.pgcase.xobot.workspace.internal.core.resources;

import org.eclipse.core.runtime.Path;
import org.pgcase.xobot.workspace.runtime.XWorkspaceElementDescriptor;

public class WorkspaceRoot implements XWorkspaceElementDescriptor {
	
	static final WorkspaceRoot INSTANCE = new WorkspaceRoot();

	private final String name;
	private final String path;
	
	private WorkspaceRoot() {
		name = Path.ROOT.toString();
		path = Path.ROOT.toString();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getPath() {
		return path;
	}

}
