/*
* generated by Xtext
*/
package de.bomzhi.petrinet;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class PetrinetDslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return de.bomzhi.petrinet.ui.internal.PetrinetDslActivator.getInstance().getInjector("de.bomzhi.petrinet.PetrinetDsl");
	}
	
}
