/*
* generated by Xtext
*/
package uws.chaudy.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uws.chaudy.services.EngageGrammarAccess;

public class EngageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private EngageGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected uws.chaudy.parser.antlr.internal.InternalEngageParser createParser(XtextTokenStream stream) {
		return new uws.chaudy.parser.antlr.internal.InternalEngageParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public EngageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(EngageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}