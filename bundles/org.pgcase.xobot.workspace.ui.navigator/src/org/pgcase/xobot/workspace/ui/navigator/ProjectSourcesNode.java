package org.pgcase.xobot.workspace.ui.navigator;

import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;

public class ProjectSourcesNode {
	
	private final XProjectDescriptor project;
	
	public ProjectSourcesNode(XProjectDescriptor project) {
		this.project = project;
	}
	
	public XProjectDescriptor getProject() {
		return project;
	}
	
}
