package org.pgcase.xobot.dbproc.team.ui;

import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.team.core.mapping.IResourceMappingMerger;
import org.eclipse.team.ui.mapping.ISynchronizationCompareAdapter;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.pgcase.xobot.dbproc.core.resources.XFunctionDefinitionBody;
import org.pgcase.xobot.dbproc.core.resources.XFunctionDefinitionIndex;
import org.pgcase.xobot.dbproc.core.resources.mappings.DbprocModelProvider;
import org.pgcase.xobot.dbproc.core.resources.mappings.XFunctionBodyResourceMapping;
import org.pgcase.xobot.dbproc.core.resources.mappings.XFunctionIndexResourceMapping;
import org.pgcase.xobot.dbproc.team.core.DbprocModelMerger;
import org.pgcase.xobot.workspace.core.resources.mappings.XWorkspaceElementResourceMapping;
import org.pgcase.xobot.workspace.runtime.XWorkspaceElementDescriptor;

public class DbprocElementAdapterFactory implements IAdapterFactory {

	private IWorkbenchAdapter modelAdapter = new DbprocElementWorkbenchAdapter();
	private DbprocModelMerger modelMerger;
	private DbprocCompareAdapter compareAdapter;
	
	public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
		if (adapterType == IWorkbenchAdapter.class && adaptableObject instanceof XWorkspaceElementDescriptor) {
			return adapterType.cast(modelAdapter);
		}
		if (adapterType == ResourceMapping.class && adaptableObject instanceof XWorkspaceElementDescriptor) {
			ResourceMapping create = XWorkspaceElementResourceMapping.create((XWorkspaceElementDescriptor)adaptableObject);
			if (create != null) {
				return adapterType.cast(create);
			}
			if (adaptableObject instanceof XFunctionDefinitionIndex) {
				XFunctionDefinitionIndex index = (XFunctionDefinitionIndex) adaptableObject;
				XFunctionIndexResourceMapping mapping = new XFunctionIndexResourceMapping(index);
				return adapterType.cast(mapping);
			}
			if (adaptableObject instanceof XFunctionDefinitionBody) {
				XFunctionDefinitionBody body = (XFunctionDefinitionBody) adaptableObject;
				XFunctionBodyResourceMapping mapping = new XFunctionBodyResourceMapping(body);
				return adapterType.cast(mapping);
			}
		}
		if (adapterType == IResourceMappingMerger.class && adaptableObject instanceof DbprocModelProvider) {
			if (modelMerger == null) {
				modelMerger = new DbprocModelMerger((DbprocModelProvider)adaptableObject);
			}
			return adapterType.cast(modelMerger);
		}
		if (adapterType == ISynchronizationCompareAdapter.class && adaptableObject instanceof DbprocModelProvider) {
			if (compareAdapter == null) {
				compareAdapter = new DbprocCompareAdapter((DbprocModelProvider)adaptableObject);
			}
			return adapterType.cast(compareAdapter);
		}
		
		return null;
	}

	public Class<?>[] getAdapterList() {
		return new Class[] { IWorkbenchAdapter.class, ResourceMapping.class, IResourceMappingMerger.class, ISynchronizationCompareAdapter.class };
	}

}
