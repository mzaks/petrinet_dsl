/*
 * generated by Xtext
 */
package de.bomzhi.petrinet.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PetrinetDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return de.bomzhi.petrinet.ui.internal.PetrinetDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return de.bomzhi.petrinet.ui.internal.PetrinetDslActivator.getInstance().getInjector("de.bomzhi.petrinet.PetrinetDsl");
	}
	
}