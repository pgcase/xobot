package org.pgcase.xobot.workspace.filesystem;

import java.net.URI;

import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.filesystem.provider.FileSystem;

public class XobotFileSystem extends FileSystem {

	public XobotFileSystem() {
	}

	@Override
	public IFileStore getStore(URI uri) {
		return new XobotFile(uri);
	}

}
