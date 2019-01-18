package org.pgcase.xobot.workspace.resources;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdapterFactory;

public class Xobot2ResourceAdapterFactory implements IAdapterFactory {

	@Override
	public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
		if (IProject.class.equals(adapterType)) {
			if (adaptableObject instanceof XobotResourceElement) {
				XobotResourceElement element = (XobotResourceElement) adaptableObject;
				IProject resource = element.getResource().getProject();
				return adapterType.cast(resource);
			}
		}
		return null;
	}

	@Override
	public Class<?>[] getAdapterList() {
		return new Class[] {IResource.class};
	}

}
