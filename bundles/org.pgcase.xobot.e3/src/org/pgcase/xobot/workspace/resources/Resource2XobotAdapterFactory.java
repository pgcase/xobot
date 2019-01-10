package org.pgcase.xobot.workspace.resources;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdapterFactory;
import org.pgcase.xobot.workspace.core.XElement;

public class Resource2XobotAdapterFactory implements IAdapterFactory {

	@Override
	public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
		if (XElement.class.equals(adapterType)) {
			if (adaptableObject instanceof IResource) {
				IResource resource = (IResource) adaptableObject;
				XElement element = new XobotResourceElement(resource);
				return adapterType.cast(element);
			}
		}
		return null;
	}

	@Override
	public Class<?>[] getAdapterList() {
		return new Class[] {XElement.class};
	}

}
