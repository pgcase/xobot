package org.pgcase.xobot.dbproc.team.ui;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.pgcase.xobot.dbproc.core.resources.XFunctionDefinitionBody;
import org.pgcase.xobot.dbproc.core.resources.XFunctionDefinitionIndex;
import org.pgcase.xobot.workspace.runtime.XWorkspaceElementDescriptor;

public class DbprocElementWorkbenchAdapter implements IWorkbenchAdapter {
	
	public DbprocElementWorkbenchAdapter() {
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
		return new Object[0];
	}

	public ImageDescriptor getImageDescriptor(Object object) {
		//FIXME:
		try {
			URL url = new URL("platform:/plugin/org.pgcase.xobot.workspace.team.ui/images/xobot16.png"); //$NON-NLS-1$
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
			return NLS.bind(DbprocTeamUiMessages.DbprocElementWorkbenchAdapter_function_definition_text, file.getName());
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
		return null;
	}
	
}
