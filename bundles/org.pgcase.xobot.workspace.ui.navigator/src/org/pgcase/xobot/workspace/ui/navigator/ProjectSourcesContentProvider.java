package org.pgcase.xobot.workspace.ui.navigator;

import org.eclipse.core.runtime.Adapters;
import org.pgcase.xobot.landscape.ui.navigator.SourcesContentProvider;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;

public class ProjectSourcesContentProvider extends SourcesContentProvider {
	
	@Override
	public Object[] getChildren(Object parentElement) {
		XProjectDescriptor adapt = Adapters.adapt(parentElement, XProjectDescriptor.class);
		if (adapt != null) {
//			XProjectDescriptor project = (XProjectDescriptor) parentElement;
			//FIXME: return configured sources
			return super.getChildren(getRegistry());
		}
		// TODO Auto-generated method stub
		return super.getChildren(parentElement);
	}
	
}
