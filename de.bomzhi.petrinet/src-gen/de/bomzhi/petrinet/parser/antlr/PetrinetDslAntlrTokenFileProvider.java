/*
* generated by Xtext
*/
package de.bomzhi.petrinet.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PetrinetDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("de/bomzhi/petrinet/parser/antlr/internal/InternalPetrinetDsl.tokens");
	}
}
