package uws.engage.dsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import uws.engage.dsl.services.AssessGrammarAccess;

@SuppressWarnings("all")
public class AssessSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AssessGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Characteristic_SeparatorParserRuleCall_1_q;
	protected AbstractElementAlias match_FeedbackMessages_FeedbackKeyword_0_1_or_FeedbackMessagesKeyword_0_0;
	protected AbstractElementAlias match_GameDescription_GameKeyword_0_1_or_SeriousGameKeyword_0_0;
	protected AbstractElementAlias match_LearningOutcomes_LearningOutcomesKeyword_0_0_or_ScoresKeyword_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AssessGrammarAccess) access;
		match_Characteristic_SeparatorParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getCharacteristicAccess().getSeparatorParserRuleCall_1());
		match_FeedbackMessages_FeedbackKeyword_0_1_or_FeedbackMessagesKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFeedbackMessagesAccess().getFeedbackKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getFeedbackMessagesAccess().getFeedbackMessagesKeyword_0_0()));
		match_GameDescription_GameKeyword_0_1_or_SeriousGameKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getGameDescriptionAccess().getGameKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getGameDescriptionAccess().getSeriousGameKeyword_0_0()));
		match_LearningOutcomes_LearningOutcomesKeyword_0_0_or_ScoresKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLearningOutcomesAccess().getLearningOutcomesKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getLearningOutcomesAccess().getScoresKeyword_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getEndRule())
			return getEndToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSeparatorRule())
			return getSeparatorToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * End:
	 * 	'End'
	 * ;
	 */
	protected String getEndToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "End";
	}
	
	/**
	 * Separator:
	 * 	':'
	 * ;
	 */
	protected String getSeparatorToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Characteristic_SeparatorParserRuleCall_1_q.equals(syntax))
				emit_Characteristic_SeparatorParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FeedbackMessages_FeedbackKeyword_0_1_or_FeedbackMessagesKeyword_0_0.equals(syntax))
				emit_FeedbackMessages_FeedbackKeyword_0_1_or_FeedbackMessagesKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GameDescription_GameKeyword_0_1_or_SeriousGameKeyword_0_0.equals(syntax))
				emit_GameDescription_GameKeyword_0_1_or_SeriousGameKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LearningOutcomes_LearningOutcomesKeyword_0_0_or_ScoresKeyword_0_1.equals(syntax))
				emit_LearningOutcomes_LearningOutcomesKeyword_0_0_or_ScoresKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     Separator?
	 */
	protected void emit_Characteristic_SeparatorParserRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Feedback-messages' | 'Feedback'
	 */
	protected void emit_FeedbackMessages_FeedbackKeyword_0_1_or_FeedbackMessagesKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Game' | 'Serious-game'
	 */
	protected void emit_GameDescription_GameKeyword_0_1_or_SeriousGameKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Scores' | 'Learning-outcomes'
	 */
	protected void emit_LearningOutcomes_LearningOutcomesKeyword_0_0_or_ScoresKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
