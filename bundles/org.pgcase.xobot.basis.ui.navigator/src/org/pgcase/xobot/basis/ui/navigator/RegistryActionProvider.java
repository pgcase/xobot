package org.pgcase.xobot.basis.ui.navigator;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonMenuConstants;

public class RegistryActionProvider extends CommonActionProvider {
	
	private Action refreshAction;
	
	@Override
	public void init(ICommonActionExtensionSite aSite) {
		super.init(aSite);
		makeActions(aSite);
	}
	
	@Override
	public void fillContextMenu(IMenuManager menu) {
		menu.appendToGroup(ICommonMenuConstants.GROUP_BUILD, refreshAction);
	}
	
	@Override
	public void fillActionBars(IActionBars actionBars) {
		actionBars.setGlobalActionHandler(ActionFactory.REFRESH.getId(), refreshAction);
		updateActionBars();
	}

	protected void makeActions(ICommonActionExtensionSite aSite) {
		refreshAction = createRefreshAction(aSite);
	}

	protected Action createRefreshAction(ICommonActionExtensionSite aSite) {
		Action action = new Action() {
			@Override
			public void run() {
				getActionSite().getStructuredViewer().refresh();
			}
		};
		action.setText("Refresh");
		return action;
	}

}
