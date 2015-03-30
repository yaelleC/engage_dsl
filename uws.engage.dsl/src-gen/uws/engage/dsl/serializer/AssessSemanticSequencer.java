package uws.engage.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uws.engage.dsl.assess.Action;
import uws.engage.dsl.assess.ActionReaction;
import uws.engage.dsl.assess.ActionSequence;
import uws.engage.dsl.assess.ActionSequences;
import uws.engage.dsl.assess.Age;
import uws.engage.dsl.assess.AssessPackage;
import uws.engage.dsl.assess.BadgeModel;
import uws.engage.dsl.assess.Characteristic;
import uws.engage.dsl.assess.EvidenceModel;
import uws.engage.dsl.assess.Feedback;
import uws.engage.dsl.assess.FeedbackMessages;
import uws.engage.dsl.assess.FeedbackModel;
import uws.engage.dsl.assess.GameDescription;
import uws.engage.dsl.assess.GenericTrigger;
import uws.engage.dsl.assess.InactivityLimit;
import uws.engage.dsl.assess.LOTrigger;
import uws.engage.dsl.assess.LearningOutcomes;
import uws.engage.dsl.assess.Model;
import uws.engage.dsl.assess.Outcome;
import uws.engage.dsl.assess.OutcomeValueLimit;
import uws.engage.dsl.assess.OutcomesPoints;
import uws.engage.dsl.assess.ParamCondition;
import uws.engage.dsl.assess.ParamIn;
import uws.engage.dsl.assess.Parameter;
import uws.engage.dsl.assess.Params;
import uws.engage.dsl.assess.ParamsIn;
import uws.engage.dsl.assess.PlayerDescription;
import uws.engage.dsl.assess.Point;
import uws.engage.dsl.assess.Points;
import uws.engage.dsl.assess.PointsCondition;
import uws.engage.dsl.assess.Reaction;
import uws.engage.dsl.assess.Reactions;
import uws.engage.dsl.assess.SimpleTrigger;
import uws.engage.dsl.assess.TimerAction;
import uws.engage.dsl.assess.TimerActions;
import uws.engage.dsl.assess.Timing;
import uws.engage.dsl.assess.Trigger;
import uws.engage.dsl.assess.TriggerFeedback;
import uws.engage.dsl.assess.Type;
import uws.engage.dsl.assess.TypeOutcome;
import uws.engage.dsl.assess.UpdateScore;
import uws.engage.dsl.services.AssessGrammarAccess;

@SuppressWarnings("all")
public class AssessSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AssessGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AssessPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AssessPackage.ACTION:
				if(context == grammarAccess.getActionRule()) {
					sequence_Action(context, (Action) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.ACTION_REACTION:
				if(context == grammarAccess.getActionReactionRule()) {
					sequence_ActionReaction(context, (ActionReaction) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.ACTION_SEQUENCE:
				if(context == grammarAccess.getActionSequenceRule()) {
					sequence_ActionSequence(context, (ActionSequence) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.ACTION_SEQUENCES:
				if(context == grammarAccess.getActionSequencesRule()) {
					sequence_ActionSequences(context, (ActionSequences) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.AGE:
				if(context == grammarAccess.getAgeRule()) {
					sequence_Age(context, (Age) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.BADGE_MODEL:
				if(context == grammarAccess.getBadgeModelRule()) {
					sequence_BadgeModel(context, (BadgeModel) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.CHARACTERISTIC:
				if(context == grammarAccess.getCharacteristicRule()) {
					sequence_Characteristic(context, (Characteristic) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.ENUM:
				if(context == grammarAccess.getEnumRule()) {
					sequence_Enum(context, (uws.engage.dsl.assess.Enum) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.EVIDENCE_MODEL:
				if(context == grammarAccess.getEvidenceModelRule()) {
					sequence_EvidenceModel(context, (EvidenceModel) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.FEEDBACK:
				if(context == grammarAccess.getFeedbackRule()) {
					sequence_Feedback(context, (Feedback) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.FEEDBACK_MESSAGES:
				if(context == grammarAccess.getFeedbackMessagesRule()) {
					sequence_FeedbackMessages(context, (FeedbackMessages) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.FEEDBACK_MODEL:
				if(context == grammarAccess.getFeedbackModelRule()) {
					sequence_FeedbackModel(context, (FeedbackModel) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.GAME_DESCRIPTION:
				if(context == grammarAccess.getGameDescriptionRule()) {
					sequence_GameDescription(context, (GameDescription) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.GENERIC_TRIGGER:
				if(context == grammarAccess.getGenericTriggerRule()) {
					sequence_GenericTrigger(context, (GenericTrigger) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.INACTIVITY_LIMIT:
				if(context == grammarAccess.getInactivityLimitRule()) {
					sequence_InactivityLimit(context, (InactivityLimit) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.LO_TRIGGER:
				if(context == grammarAccess.getLOTriggerRule()) {
					sequence_LOTrigger(context, (LOTrigger) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.LEARNING_OUTCOMES:
				if(context == grammarAccess.getLearningOutcomesRule()) {
					sequence_LearningOutcomes(context, (LearningOutcomes) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.OUTCOME:
				if(context == grammarAccess.getOutcomeRule()) {
					sequence_Outcome(context, (Outcome) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.OUTCOME_VALUE_LIMIT:
				if(context == grammarAccess.getOutcomeValueLimitRule()) {
					sequence_OutcomeValueLimit(context, (OutcomeValueLimit) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.OUTCOMES_POINTS:
				if(context == grammarAccess.getOutcomesPointsRule()) {
					sequence_OutcomesPoints(context, (OutcomesPoints) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.PARAM_CONDITION:
				if(context == grammarAccess.getParamConditionRule()) {
					sequence_ParamCondition(context, (ParamCondition) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.PARAM_IN:
				if(context == grammarAccess.getParamInRule()) {
					sequence_ParamIn(context, (ParamIn) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.PARAMS:
				if(context == grammarAccess.getParamsRule()) {
					sequence_Params(context, (Params) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.PARAMS_IN:
				if(context == grammarAccess.getParamsInRule()) {
					sequence_ParamsIn(context, (ParamsIn) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.PLAYER_DESCRIPTION:
				if(context == grammarAccess.getPlayerDescriptionRule()) {
					sequence_PlayerDescription(context, (PlayerDescription) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.POINT:
				if(context == grammarAccess.getPointRule()) {
					sequence_Point(context, (Point) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.POINTS:
				if(context == grammarAccess.getPointsRule()) {
					sequence_Points(context, (Points) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.POINTS_CONDITION:
				if(context == grammarAccess.getPointsConditionRule()) {
					sequence_PointsCondition(context, (PointsCondition) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.REACTION:
				if(context == grammarAccess.getReactionRule()) {
					sequence_Reaction(context, (Reaction) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.REACTIONS:
				if(context == grammarAccess.getReactionsRule()) {
					sequence_Reactions(context, (Reactions) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.SIMPLE_TRIGGER:
				if(context == grammarAccess.getSimpleTriggerRule()) {
					sequence_SimpleTrigger(context, (SimpleTrigger) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.TIMER_ACTION:
				if(context == grammarAccess.getTimerActionRule()) {
					sequence_TimerAction(context, (TimerAction) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.TIMER_ACTIONS:
				if(context == grammarAccess.getTimerActionsRule()) {
					sequence_TimerActions(context, (TimerActions) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.TIMING:
				if(context == grammarAccess.getTimingRule()) {
					sequence_Timing(context, (Timing) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.TRIGGER:
				if(context == grammarAccess.getTriggerRule()) {
					sequence_Trigger(context, (Trigger) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.TRIGGER_FEEDBACK:
				if(context == grammarAccess.getTriggerFeedbackRule()) {
					sequence_TriggerFeedback(context, (TriggerFeedback) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.TYPE_OUTCOME:
				if(context == grammarAccess.getTypeOutcomeRule()) {
					sequence_TypeOutcome(context, (TypeOutcome) semanticObject); 
					return; 
				}
				else break;
			case AssessPackage.UPDATE_SCORE:
				if(context == grammarAccess.getUpdateScoreRule()) {
					sequence_UpdateScore(context, (UpdateScore) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (updateScore=UpdateScore | triggerFeedback=TriggerFeedback)
	 */
	protected void sequence_ActionReaction(EObject context, ActionReaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (action1=ID (before?='before' | after?='after') action2=ID sequenceReactions+=ActionReaction+)
	 */
	protected void sequence_ActionSequence(EObject context, ActionSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     actionSequences+=ActionSequence
	 */
	protected void sequence_ActionSequences(EObject context, ActionSequences semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         params+=Parameter 
	 *         params+=Parameter* 
	 *         desc=STRING 
	 *         paramsIn=ParamsIn? 
	 *         points+=Points+ 
	 *         reactions=Reactions?
	 *     )
	 */
	protected void sequence_Action(EObject context, Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ageMin=INT ageMax=INT)
	 */
	protected void sequence_Age(EObject context, Age semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AssessPackage.Literals.AGE__AGE_MIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssessPackage.Literals.AGE__AGE_MIN));
			if(transientValues.isValueTransient(semanticObject, AssessPackage.Literals.AGE__AGE_MAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssessPackage.Literals.AGE__AGE_MAX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAgeAccess().getAgeMinINTTerminalRuleCall_0_0(), semanticObject.getAgeMin());
		feeder.accept(grammarAccess.getAgeAccess().getAgeMaxINTTerminalRuleCall_2_0(), semanticObject.getAgeMax());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     genericTriggers+=GenericTrigger+
	 */
	protected void sequence_BadgeModel(EObject context, BadgeModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=Type question=STRING?)
	 */
	protected void sequence_Characteristic(EObject context, Characteristic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (enumValues+=STRING enumValues+=STRING*)
	 */
	protected void sequence_Enum(EObject context, uws.engage.dsl.assess.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (actions+=Action+ timerActions=TimerActions? actionSequence=ActionSequences?)
	 */
	protected void sequence_EvidenceModel(EObject context, EvidenceModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     feedbackMsgs+=Feedback+
	 */
	protected void sequence_FeedbackMessages(EObject context, FeedbackMessages semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     triggers+=Trigger+
	 */
	protected void sequence_FeedbackModel(EObject context, FeedbackModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID message=STRING image=STRING? type=TypeFeedback? (win?='win' | lose?='lose' | end?='end')?)
	 */
	protected void sequence_Feedback(EObject context, Feedback semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         dev=INT 
	 *         desc=STRING? 
	 *         ageRange=Age? 
	 *         lang=ID? 
	 *         country=ID? 
	 *         genre=STRING? 
	 *         subject=STRING? 
	 *         public=BOOL?
	 *     )
	 */
	protected void sequence_GameDescription(EObject context, GameDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (simple=SimpleTrigger | lo=LOTrigger)
	 */
	protected void sequence_GenericTrigger(EObject context, GenericTrigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sign=CompSign limit=INT triggerReactions+=ActionReaction+)
	 */
	protected void sequence_InactivityLimit(EObject context, InactivityLimit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         function=FeedbackKeywordsComplex 
	 *         outcome=[Outcome|ID] 
	 *         sign=CompSign 
	 *         negativeLimit?='-'? 
	 *         limit=INT 
	 *         triggerReactions+=TriggerFeedback+
	 *     )
	 */
	protected void sequence_LOTrigger(EObject context, LOTrigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     outcomes+=Outcome+
	 */
	protected void sequence_LearningOutcomes(EObject context, LearningOutcomes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         game=GameDescription 
	 *         player=PlayerDescription? 
	 *         learningOutcomes=LearningOutcomes 
	 *         feedbackMessages=FeedbackMessages? 
	 *         evidenceModel=EvidenceModel 
	 *         feedbackModel=FeedbackModel? 
	 *         badgeModel=BadgeModel?
	 *     )
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (outcome=[Outcome|ID] sign=CompSign negativeLimit?='-'? limit=INT triggerReactions+=TriggerFeedback+)
	 */
	protected void sequence_OutcomeValueLimit(EObject context, OutcomeValueLimit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID desc=STRING? value=INT? type=TypeOutcome?)
	 */
	protected void sequence_Outcome(EObject context, Outcome semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (outcome=[Outcome|ID]? resetValue?='='? (pts=Point | var=[Parameter|ID]))
	 */
	protected void sequence_OutcomesPoints(EObject context, OutcomesPoints semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (params=[Params|ID] | conditionOther?='others' | conditionOther?='else')
	 */
	protected void sequence_ParamCondition(EObject context, ParamCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (param=[Parameter|ID] valuesPoss+=Param valuesPoss+=Param*)
	 */
	protected void sequence_ParamIn(EObject context, ParamIn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (logOnly?='LogOnly'? type=Type name=ID)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     paramIn+=ParamIn+
	 */
	protected void sequence_ParamsIn(EObject context, ParamsIn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? values+=Param values+=Param*)
	 */
	protected void sequence_Params(EObject context, Params semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     characteristics+=Characteristic+
	 */
	protected void sequence_PlayerDescription(EObject context, PlayerDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (negative?='-'? value=INT)
	 */
	protected void sequence_Point(EObject context, Point semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (keyWd=PointsKeyWd (sign=Sign | value=Point))
	 */
	protected void sequence_PointsCondition(EObject context, PointsCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (outcomesPoints+=OutcomesPoints outcomesPoints+=OutcomesPoints? (others?='others' | others?='else' | params+=Params+))
	 */
	protected void sequence_Points(EObject context, Points semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((paramsC=ParamCondition | pointsC=PointsCondition) feedback=[Feedback|ID] immediate?='immediate'? delayed?='delayed'?)
	 */
	protected void sequence_Reaction(EObject context, Reaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     reaction+=Reaction+
	 */
	protected void sequence_Reactions(EObject context, Reactions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (function=FeedbackKeywordsSimple sign=CompSign negativeLimit?='-'? limit=INT triggerReactions+=TriggerFeedback+)
	 */
	protected void sequence_SimpleTrigger(EObject context, SimpleTrigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID timings+=Timing+)
	 */
	protected void sequence_TimerAction(EObject context, TimerAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     timerActions+=TimerAction+
	 */
	protected void sequence_TimerActions(EObject context, TimerActions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((before?='within' | after?='after') limit=INT timingReactions+=ActionReaction+)
	 */
	protected void sequence_Timing(EObject context, Timing semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (feedback=[Feedback|ID] immediate?='immediate'? delayed?='delayed'?)
	 */
	protected void sequence_TriggerFeedback(EObject context, TriggerFeedback semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (perf=OutcomeValueLimit | inactivity=InactivityLimit)
	 */
	protected void sequence_Trigger(EObject context, Trigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (knowledge?='knowledge' | skill?='skill' | competence?='competence')
	 */
	protected void sequence_TypeOutcome(EObject context, TypeOutcome semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         simpleType='Int' | 
	 *         simpleType='Float' | 
	 *         simpleType='String' | 
	 *         simpleType='Bool' | 
	 *         simpleType='Char' | 
	 *         simpleType='Text' | 
	 *         enumType=Enum
	 *     )
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (outcome=[Outcome|ID] pts=Point)
	 */
	protected void sequence_UpdateScore(EObject context, UpdateScore semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AssessPackage.Literals.UPDATE_SCORE__OUTCOME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssessPackage.Literals.UPDATE_SCORE__OUTCOME));
			if(transientValues.isValueTransient(semanticObject, AssessPackage.Literals.UPDATE_SCORE__PTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssessPackage.Literals.UPDATE_SCORE__PTS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUpdateScoreAccess().getOutcomeOutcomeIDTerminalRuleCall_0_0_1(), semanticObject.getOutcome());
		feeder.accept(grammarAccess.getUpdateScoreAccess().getPtsPointParserRuleCall_2_0(), semanticObject.getPts());
		feeder.finish();
	}
}
