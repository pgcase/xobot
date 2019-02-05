package org.pgcase.xobot.workspace.ui.navigator;

import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.pgcase.xobot.basis.ui.navigator.RegistryLabelProvider;

public class ProjectLabelProvider extends RegistryLabelProvider {
	
	@Override
	public Image getImage(Object element) {
		if (element instanceof ProjectSourcesNode) {
			ISharedImages images = PlatformUI.getWorkbench().getSharedImages();
			return images.getImage(ISharedImages.IMG_TOOL_BACK);
		}
		if (element instanceof ProjectTargetsNode) {
			ISharedImages images = PlatformUI.getWorkbench().getSharedImages();
			return images.getImage(ISharedImages.IMG_TOOL_FORWARD);
		}
		return super.getImage(element);
	}
	
	@Override
	public String getText(Object element) {
		if (element instanceof ProjectSourcesNode) {
			return "Источники";
		}
		if (element instanceof ProjectTargetsNode) {
			return "Приемники";
		}
		return super.getText(element);
	}
	
}
