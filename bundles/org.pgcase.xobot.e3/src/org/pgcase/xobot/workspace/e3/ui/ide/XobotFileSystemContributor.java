package org.pgcase.xobot.workspace.e3.ui.ide;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ide.fileSystem.FileSystemContributor;

public class XobotFileSystemContributor extends FileSystemContributor {

	public XobotFileSystemContributor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public URI browseFileSystem(String initialPath, Shell shell) {
		// TODO Auto-generated method stub
		try {
			return new URI("xobot:/some/path");
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
