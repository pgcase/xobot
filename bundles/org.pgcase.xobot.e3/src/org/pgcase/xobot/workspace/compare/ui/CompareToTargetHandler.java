package org.pgcase.xobot.workspace.compare.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

public class CompareToTargetHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveShell(event);
		IStructuredSelection selection = HandlerUtil.getCurrentStructuredSelection(event);
		String bind = "Here we should compare {0} to target";
		Object[] selected = selection.toArray();
		MessageDialog.openInformation(shell, "Compare to Target", NLS.bind(bind, selected ));
		// TODO Auto-generated method stub
		return null;
	}

}
