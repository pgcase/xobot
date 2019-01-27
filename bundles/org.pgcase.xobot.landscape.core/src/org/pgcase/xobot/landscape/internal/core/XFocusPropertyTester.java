package org.pgcase.xobot.landscape.internal.core;

import java.util.Objects;

import org.eclipse.core.expressions.PropertyTester;
import org.pgcase.xobot.landscape.runtime.XFocusDescriptor;

public class XFocusPropertyTester extends PropertyTester {
	
	protected static final String MATURITY = "maturity"; //$NON-NLS-1$

	protected static final String ORIGIN = "origin"; //$NON-NLS-1$

	public XFocusPropertyTester() {
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (receiver instanceof XFocusDescriptor) {
			XFocusDescriptor focus = (XFocusDescriptor) receiver;
			if (MATURITY.equals(property)) {
				return Objects.equals(expectedValue, focus.getMaturity());
			}
			if (ORIGIN.equals(property)) {
				return Objects.equals(expectedValue, focus.getOrigin());
			}
		}
		return false;
	}

}
