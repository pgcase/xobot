package org.pgcase.xobot.workspace.core.filesystem;

import java.net.URI;
import java.net.URL;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.osgi.service.datalocation.Location;
import org.eclipse.osgi.util.NLS;

public class XobotFiles {

	public static String OSGI_INSTALL_AREA = "osgi.install.area"; //$NON-NLS-1$

	public static String XOBOT_SCHEMA = "xobot"; //$NON-NLS-1$
	public static String XOBOT_SEGMENT = ".xobot"; //$NON-NLS-1$
	
	public static IPath resolveInstallLocationRoot() {
		Location installLocation = Platform.getInstallLocation();
		URL installUrl = installLocation.getURL();
		IPath installPath = new Path(installUrl.getFile()).removeTrailingSeparator();
		IPath rootPath = installPath.append(XOBOT_SEGMENT);
		return rootPath;
	}
	
	public static URI composeInstallLocationRoot(String name) {
		//xobot://osgi.install.area/name
		String pattern = "{0}://{1}/{2}";
		Object[] bindings = new Object[] {XOBOT_SCHEMA, OSGI_INSTALL_AREA, name};
		String str = NLS.bind(pattern, bindings);
		return URI.create(str);
	}

	
}
