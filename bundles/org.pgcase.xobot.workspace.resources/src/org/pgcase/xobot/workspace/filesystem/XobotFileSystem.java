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
package org.pgcase.xobot.workspace.filesystem;

import java.io.File;
import java.net.URI;
import java.nio.file.Paths;

import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.filesystem.provider.FileSystem;
import org.eclipse.core.runtime.IPath;

public class XobotFileSystem extends FileSystem {
	
	private final File root;

	public XobotFileSystem() {
		IPath rootPath = XobotFiles.resolveInstallLocationRoot();
		root = new File(rootPath.toString());
	}

	@Override
	public IFileStore getStore(URI uri) {
		String path = uri.getPath();
		File file = Paths.get(root.getPath(), path.split("/")).toFile();
		return new XobotFile(this, uri, file);
	}

}
