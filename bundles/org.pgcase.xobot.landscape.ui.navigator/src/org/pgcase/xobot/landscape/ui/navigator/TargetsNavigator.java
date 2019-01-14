package org.pgcase.xobot.landscape.ui.navigator;

import org.pgcase.xobot.landscape.runtime.registry.XTargetRegistry;

public class TargetsNavigator extends RegistryNavigator<XTargetRegistry> {

	@Override
	protected Class<XTargetRegistry> getRegistryClass() {
		return XTargetRegistry.class;
	}

}
