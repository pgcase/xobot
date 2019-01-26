package org.pgcase.xobot.landscape.internal.core;

import java.util.Objects;

import org.eclipse.core.expressions.PropertyTester;
import org.pgcase.xobot.landscape.runtime.XTargetDescriptor;

public class XTargetPropertyTester extends PropertyTester {

	protected static final String ORIGIN = "origin"; //$NON-NLS-1$

	public XTargetPropertyTester() {
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (receiver instanceof XTargetDescriptor) {
			XTargetDescriptor target = (XTargetDescriptor) receiver;
			if (ORIGIN.equals(property)) {
				return Objects.equals(expectedValue, target.getOrigin());
			}
		}
		return false;
	}

}
