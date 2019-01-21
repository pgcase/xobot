package org.pgcase.xobot.workspace.team.ui.navigator;

import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.team.core.mapping.IResourceMappingMerger;
import org.eclipse.team.ui.mapping.ISynchronizationCompareAdapter;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.pgcase.xobot.workspace.core.resources.mappings.XWorkspaceElementResourceMapping;
import org.pgcase.xobot.workspace.core.resources.mappings.XobotModelProvider;
import org.pgcase.xobot.workspace.runtime.XWorkspaceElementDescriptor;
import org.pgcase.xobot.workspace.team.core.XobotModelMerger;

public class XWorkspaceElementAdapterFactory implements IAdapterFactory {

	private IWorkbenchAdapter modelAdapter = new XWorkspaceElementWorkbenchAdapter();
	private XobotModelMerger modelMerger;
	private XobotCompareAdapter compareAdapter;
	
	public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
		if (adapterType == IWorkbenchAdapter.class && adaptableObject instanceof XWorkspaceElementDescriptor) {
			return adapterType.cast(modelAdapter);
		}
		if (adapterType == ResourceMapping.class && adaptableObject instanceof XWorkspaceElementDescriptor) {
			return adapterType.cast(XWorkspaceElementResourceMapping.create((XWorkspaceElementDescriptor)adaptableObject));
		}
		if (adapterType == IResourceMappingMerger.class && adaptableObject instanceof XobotModelProvider) {
			if (modelMerger == null) {
				modelMerger = new XobotModelMerger((XobotModelProvider)adaptableObject);
			}
			return adapterType.cast(modelMerger);
		}
		if (adapterType == ISynchronizationCompareAdapter.class && adaptableObject instanceof XobotModelProvider) {
			if (compareAdapter == null) {
				compareAdapter = new XobotCompareAdapter((XobotModelProvider)adaptableObject);
			}
			return adapterType.cast(compareAdapter);
		}
		
		return null;
	}

	public Class<?>[] getAdapterList() {
		return new Class[] { IWorkbenchAdapter.class, ResourceMapping.class, IResourceMappingMerger.class, ISynchronizationCompareAdapter.class };
	}

}
