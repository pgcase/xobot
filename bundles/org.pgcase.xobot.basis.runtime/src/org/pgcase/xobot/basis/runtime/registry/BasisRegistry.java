package org.pgcase.xobot.basis.runtime.registry;

import org.pgcase.xobot.basis.runtime.DescribedDescriptor;

public interface BasisRegistry {
	
	Iterable<? extends DescribedDescriptor> getDescribedRoots();

}
