package org.pgcase.xobot.workspace.ui.navigator;

import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;

public class ProjectTargetsNode {
	
	private final XProjectDescriptor project;
	
	public ProjectTargetsNode(XProjectDescriptor project) {
		this.project = project;
	}
	
	public XProjectDescriptor getProject() {
		return project;
	}

}
