/*******************************************************************************
 * Copyright (c) 2018-2019 ArSysOp
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     ArSysOp - initial API and implementation
 *******************************************************************************/
package org.pgcase.xobot.workspace.core.filesystem;

import java.io.File;
import java.net.URI;

import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.filesystem.IFileSystem;
import org.eclipse.core.internal.filesystem.local.LocalFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;

public class XobotFile extends LocalFile {
	
	private final XobotFileSystem fileSystem;
	private final URI uri;
	private final File file;

	public XobotFile(XobotFileSystem fileSystem, URI uri, File file) {
		super(file);
		this.fileSystem = fileSystem;
		this.uri = uri;
		this.file = file;
	}
	
	public URI getUri() {
		return uri;
	}
	
	@Override
	public IFileStore getChild(String name) {	
		URI childUri = URI.create(uri.toString() + '/' + name);
		// TODO Auto-generated method stub
		File childFile = new File(file, name);
		return new XobotFile(fileSystem, childUri,  childFile);
	}
	
	@Deprecated
	@Override
	public IFileStore getChild(IPath path) {
		URI childUri = URI.create(uri.toString() + '/' + path.toString());
		File childFile = new File(file, path.toOSString());
		return new XobotFile(fileSystem, childUri,  childFile);
	}

	@Override
	public IFileStore getFileStore(IPath path) {
		URI childUri = URI.create(uri.toString() + new Path("/").append(path).toString()); //$NON-NLS-1$
		File childFile = new Path(file.getPath()).append(path).toFile();
		return new XobotFile(fileSystem, childUri,  childFile);
	}
	
	@Override
	public IFileSystem getFileSystem() {
		return fileSystem;
	}
	
	@Override
	public File toLocalFile(int options, IProgressMonitor monitor) throws CoreException {
		return super.toLocalFile(options, monitor);
	}

}
