package org.pgcase.xobot.dbproc.team.ui.navigator;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.runtime.Adapters;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.Saveable;
import org.pgcase.xobot.dbproc.core.resources.XFunctionDefinitionIndex;
import org.pgcase.xobot.workspace.runtime.XWorkspaceElementDescriptor;

public class DbprocElementSaveable extends Saveable {

	private XWorkspaceElementDescriptor workspaceElement;
	private boolean dirty;
	private final DbprocSaveablesProvider modelSaveablesProvider;

	public DbprocElementSaveable(DbprocSaveablesProvider modelSaveablesProvider, XFunctionDefinitionIndex element) {
		this.modelSaveablesProvider = modelSaveablesProvider;
		workspaceElement = element;
	}

	public boolean equals(Object object) {
		if (object instanceof DbprocElementSaveable) {
			DbprocElementSaveable other = (DbprocElementSaveable) object;
			return (other.getModelObject().equals(getModelObject()));
		}
		return false;
	}

	public XWorkspaceElementDescriptor getModelObject() {
		return workspaceElement;
	}

	public ImageDescriptor getImageDescriptor() {
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

	public String getName() {
		return workspaceElement.getName();
	}

	public String getToolTipText() {
		return DBProcTeamUiNavigatorMessages.DbprocElementSaveable_tooltip_saveable_text + getName();
	}

	public int hashCode() {
		return workspaceElement.hashCode();
	}

	public boolean isDirty() {
		return dirty;
	}
	
	public void doSave(IProgressMonitor monitor) {
		dirty = false;
		modelSaveablesProvider.saved(this);
	}

	public void makeDirty() {
		dirty = true;
	}

	public <T> T getAdapter(Class<T> adapter) {
		if (adapter == ResourceMapping.class) {
			return Adapters.adapt(getModelObject(), adapter);
		}
		return super.getAdapter(adapter);
	}
}
