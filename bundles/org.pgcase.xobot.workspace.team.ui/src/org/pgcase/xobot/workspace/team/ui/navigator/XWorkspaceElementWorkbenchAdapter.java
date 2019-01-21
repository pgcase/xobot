package org.pgcase.xobot.workspace.team.ui.navigator;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.StreamSupport;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.pgcase.xobot.workspace.core.resources.WorkspaceCoreResources;
import org.pgcase.xobot.workspace.core.resources.XFunctionDefinitionBody;
import org.pgcase.xobot.workspace.core.resources.XFunctionDefinitionIndex;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor;
import org.pgcase.xobot.workspace.runtime.XWorkspaceElementDescriptor;
import org.pgcase.xobot.workspace.runtime.registry.XProjectRegistry;
import org.pgcase.xobot.workspace.runtime.registry.XWorkspaceElementService;

public class XWorkspaceElementWorkbenchAdapter implements IWorkbenchAdapter {
	
	private final XWorkspaceElementService workspaceElementService;
	
	public XWorkspaceElementWorkbenchAdapter() {
		workspaceElementService = WorkspaceCoreResources.geWorkspaceElementService();
	}

	public Object[] getChildren(Object o) {
		if (o instanceof XFunctionDefinitionIndex) {
			XFunctionDefinitionIndex index = (XFunctionDefinitionIndex) o;
			try {
				return index.getFunctionBodyFiles();
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (o instanceof XProjectFolderDescriptor) {
			XProjectFolderDescriptor folder = (XProjectFolderDescriptor) o;
			Iterable<?> iterable = workspaceElementService.getFolderItems(folder);
			return StreamSupport.stream(iterable.spliterator(), false).toArray();
		}
		if (o instanceof XProjectDescriptor) {
			XProjectDescriptor project = (XProjectDescriptor) o;
			Iterable<? extends XProjectFolderDescriptor> iterable = project.getProjectFolders();
			return StreamSupport.stream(iterable.spliterator(), false).toArray();
		}
		if (o instanceof XProjectRegistry) {
			XProjectRegistry projectRegistry = (XProjectRegistry) o;
			Iterable<XProjectDescriptor> iterable = projectRegistry.getProjects();
			return StreamSupport.stream(iterable.spliterator(), false).toArray();
		}
		return new Object[0];
	}

	public ImageDescriptor getImageDescriptor(Object object) {
		if (object instanceof XProjectFolderDescriptor) {
			return PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_OBJ_FOLDER);
		}
		//FIXME:
		try {
			URL url = new URL("platform:/plugin/org.pgcase.xobot.workspace.team.ui/images/xobot16.png");
			return ImageDescriptor.createFromURL(url);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String getLabel(Object o) {
		if (o instanceof XFunctionDefinitionIndex) {
			XFunctionDefinitionIndex file = (XFunctionDefinitionIndex) o;
			return "Function: " + file.getName();
		}
		if (o instanceof XWorkspaceElementDescriptor) {
			XWorkspaceElementDescriptor descriptor = (XWorkspaceElementDescriptor) o;
			return descriptor.getName();
		}
		return null;
	}

	public Object getParent(Object o) {
		if (o instanceof XFunctionDefinitionBody) {
			XFunctionDefinitionBody body = (XFunctionDefinitionBody) o;
			return body.getFunctionDefinitionIndex();
		}
		if (o instanceof XFunctionDefinitionIndex) {
			XFunctionDefinitionIndex index = (XFunctionDefinitionIndex) o;
			return index.getProjectFolder();
		}
		if (o instanceof XProjectFolderDescriptor) {
			XProjectFolderDescriptor folder = (XProjectFolderDescriptor) o;
			return folder.getProject();
		}
		if (o instanceof XProjectDescriptor) {
			return workspaceElementService.getProjectRegistry();
		}
		return null;
	}
	
}
