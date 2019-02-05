package org.pgcase.xobot.workspace.team.ui;

import java.util.HashMap;
import java.util.Map;

import org.pgcase.xobot.landscape.runtime.FocusDescriptors;
import org.pgcase.xobot.landscape.runtime.XSourceDescriptor;
import org.pgcase.xobot.landscape.runtime.XTargetDescriptor;
import org.pgcase.xobot.landscape.ui.wizards.LandscapeConfigurationPage;

public class XobotConfigurationWizardPage extends LandscapeConfigurationPage {

	private final Map<String, XSourceDescriptor> sourcesMap = new HashMap<>();
	private final Map<String, XTargetDescriptor> targetMap = new HashMap<>();

	public XobotConfigurationWizardPage(Map<String, XSourceDescriptor> sources, Map<String, XTargetDescriptor> targets) {
		super(XobotConfigurationWizardPage.class.getName());
		sourcesMap.putAll(sources);
		targetMap.putAll(targets);
	}
	
	@Override
	protected void loadWidgetValues() {
		setSourceIntegrationLocation(sourcesMap.get(FocusDescriptors.MATURITY_INTEGRATION));

		setTargetSandboxLocation(targetMap.get(FocusDescriptors.MATURITY_SANDBOX));
		setTargetIntegrationLocation(targetMap.get(FocusDescriptors.MATURITY_INTEGRATION));
		setTargetStableLocation(targetMap.get(FocusDescriptors.MATURITY_STABLE));
		setTargetOfficialLocation(targetMap.get(FocusDescriptors.MATURITY_OFFICIAL));
		super.loadWidgetValues();
	}

}
