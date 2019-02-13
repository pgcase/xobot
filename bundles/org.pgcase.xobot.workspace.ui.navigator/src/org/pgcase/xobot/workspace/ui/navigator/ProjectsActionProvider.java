package org.pgcase.xobot.workspace.ui.navigator;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.navigator.ICommonActionConstants;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.pgcase.xobot.basis.ui.navigator.RegistryActionProvider;

public class ProjectsActionProvider extends RegistryActionProvider {

	private IAction openAction;

	@Override
	protected void makeActions(ICommonActionExtensionSite aSite) {
		openAction = createOpenAction(getActionSite());
		// TODO Auto-generated method stub
		super.makeActions(aSite);
	}

	@Override
	public void fillActionBars(IActionBars actionBars) {
		actionBars.setGlobalActionHandler(ICommonActionConstants.OPEN, openAction);
		// TODO Auto-generated method stub
		super.fillActionBars(actionBars);
	}

	protected Action createOpenAction(ICommonActionExtensionSite aSite) {
		Action action = new Action() {
			@Override
			public void run() {
				StructuredViewer structuredViewer = getActionSite().getStructuredViewer();
				ISelection selection = structuredViewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection new_name = (IStructuredSelection) selection;
					((IStructuredSelection) selection).getFirstElement();
				}
				structuredViewer.refresh();
			}
		};
		action.setText("Open");
		return action;
	}

}
