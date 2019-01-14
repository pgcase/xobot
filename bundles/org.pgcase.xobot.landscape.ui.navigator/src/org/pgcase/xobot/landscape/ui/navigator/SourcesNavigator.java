package org.pgcase.xobot.landscape.ui.navigator;

import org.pgcase.xobot.landscape.runtime.registry.XSourceRegistry;

public class SourcesNavigator extends RegistryNavigator<XSourceRegistry> {

	@Override
	protected Class<XSourceRegistry> getRegistryClass() {
		return XSourceRegistry.class;
	}
	
}
