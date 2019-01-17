package org.pgcase.xobot.landscape.core;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.pgcase.xobot.basis.emf.edit.DomainContentAdapter;
import org.pgcase.xobot.basis.emf.edit.EditingDomainBasedRegistry;
import org.pgcase.xobot.basis.runtime.IdentifiedDescriptor;
import org.pgcase.xobot.landscape.model.api.XSourceSet;
import org.pgcase.xobot.landscape.model.meta.XLandscapeFactory;
import org.pgcase.xobot.landscape.model.meta.XLandscapePackage;
import org.pgcase.xobot.landscape.runtime.XSourceDescriptor;
import org.pgcase.xobot.landscape.runtime.XSourceSetDescriptor;
import org.pgcase.xobot.landscape.runtime.registry.XSourceRegistry;

@Component
public class SourceDomainRegistry extends EditingDomainBasedRegistry implements XSourceRegistry {
	
	private final Map<String, XSourceSetDescriptor> sourceSets = new HashMap<>();
	private final Map<String, XSourceDescriptor> sources = new HashMap<>();
	
	@Activate
	public void activate() {
		XSourceSet set1 = XLandscapeFactory.eINSTANCE.createSourceSet();
		set1.setIdentifier("id1");
		set1.setName("Source Set 1");
		registerSourceSet(set1);
	}

	@Override
	public Iterable<? extends IdentifiedDescriptor> getIdentifiedContent() {
		return getSourceSets();
	}

	@Override
	public Iterable<XSourceSetDescriptor> getSourceSets() {
		return sourceSets.values();
	}

	@Override
	public Iterable<XSourceDescriptor> getSources() {
		return sources.values();
	}

	@Override
	public void registerSourceSet(XSourceSetDescriptor sourceSet) {
		String identifier = sourceSet.getIdentifier();
		sourceSets.put(identifier, sourceSet);
	}

	@Override
	public void unregisterSourceSet(String sourceSetIdentifier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerSource(XSourceDescriptor source) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterSource(String sourceIdentifier) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EClass getContentClassifier() {
		return XLandscapePackage.eINSTANCE.getSourceSet();
	}

	@Override
	public EStructuralFeature getContentIdentifierAttribute() {
		return XLandscapePackage.eINSTANCE.getSourceSet_Identifier();
	}

	@Override
	public EStructuralFeature getContentNameAttribute() {
		return XLandscapePackage.eINSTANCE.getSourceSet_Name();
	}

	@Override
	protected DomainContentAdapter<SourceDomainRegistry> createContentAdapter() {
		return new SourceDomainRegistryTracker(this);
	}

	@Override
	public void registerContent(IdentifiedDescriptor content) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterContent(String identifier) {
		// TODO Auto-generated method stub
		
	}

}
