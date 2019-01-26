package org.pgcase.xobot.landscape.internal.core;

import java.util.Objects;

import org.eclipse.core.expressions.PropertyTester;
import org.pgcase.xobot.landscape.runtime.XSourceDescriptor;

public class XSourcePropertyTester extends PropertyTester {

	protected static final String ORIGIN = "origin"; //$NON-NLS-1$

	public XSourcePropertyTester() {
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (receiver instanceof XSourceDescriptor) {
			XSourceDescriptor source = (XSourceDescriptor) receiver;
			if (ORIGIN.equals(property)) {
				return Objects.equals(expectedValue, source.getOrigin());
			}
		}
		return false;
	}

}
