package org.pgcase.xobot.workspace.ui.navigator;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Adapters;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.pgcase.xobot.basis.ui.navigator.RegistryLabelProvider;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor;

public class ProjectsLabelProvider extends RegistryLabelProvider {
	
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
		if (element instanceof XProjectFolderDescriptor) {
			ISharedImages images = PlatformUI.getWorkbench().getSharedImages();
			return images.getImage(ISharedImages.IMG_OBJ_FOLDER);
		}
		return super.getImage(element);
	}
	
	@Override
	public String getText(Object element) {
		if (element instanceof XProjectDescriptor) {
			IResource adapt = Adapters.adapt(element, IResource.class);
			if (adapt != null) {
				return adapt.getName() + ' ' + '('+ adapt.getLocationURI() + ')';
			}
			return super.getText(element);
		}
		if (element instanceof ProjectSourcesNode) {
			return "Источники";
		}
		if (element instanceof ProjectTargetsNode) {
			return "Приемники";
		}
		if (element instanceof XProjectFolderDescriptor) {
			XProjectFolderDescriptor folder = (XProjectFolderDescriptor) element;
			return folder.getName();
		}
		return super.getText(element);
	}
	
}
