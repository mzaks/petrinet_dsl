
package de.bomzhi.petrinet;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PetrinetDslStandaloneSetup extends PetrinetDslStandaloneSetupGenerated{

	public static void doSetup() {
		new PetrinetDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

