package org.pgcase.xobot.workspace.ui.navigator;

import org.eclipse.core.runtime.Adapters;
import org.pgcase.xobot.landscape.ui.navigator.TargetsContentProvider;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;

public class ProjectTargetsContentProvider extends TargetsContentProvider {
	
	@Override
	public Object[] getChildren(Object parentElement) {
		XProjectDescriptor adapt = Adapters.adapt(parentElement, XProjectDescriptor.class);
		if (adapt != null) {
//			XProjectDescriptor project = (XProjectDescriptor) parentElement;
			//FIXME: return configured targets
			return super.getChildren(getRegistry());
		}
		// TODO Auto-generated method stub
		return super.getChildren(parentElement);
	}
	
}
