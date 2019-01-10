package org.pgcase.xobot.workspace.resources;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdapterFactory;

public class Xobot2ResourceAdapterFactory implements IAdapterFactory {

	@Override
	public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
		if (IResource.class.equals(adapterType)) {
			if (adaptableObject instanceof XobotResourceElement) {
				XobotResourceElement element = (XobotResourceElement) adaptableObject;
				IResource resource = element.getResource();
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
