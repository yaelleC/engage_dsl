
package uws.chaudy;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EngageStandaloneSetup extends EngageStandaloneSetupGenerated{

	public static void doSetup() {
		new EngageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

