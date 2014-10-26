/**
 */
package uws.engage.dsl.assess.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uws.engage.dsl.assess.Action;
import uws.engage.dsl.assess.ActionReaction;
import uws.engage.dsl.assess.ActionSequence;
import uws.engage.dsl.assess.ActionSequences;
import uws.engage.dsl.assess.Age;
import uws.engage.dsl.assess.AssessFactory;
import uws.engage.dsl.assess.AssessPackage;
import uws.engage.dsl.assess.Characteristic;
import uws.engage.dsl.assess.EvidenceModel;
import uws.engage.dsl.assess.Feedback;
import uws.engage.dsl.assess.FeedbackMessages;
import uws.engage.dsl.assess.FeedbackModel;
import uws.engage.dsl.assess.GameDescription;
import uws.engage.dsl.assess.InactivityLimit;
import uws.engage.dsl.assess.LearningOutcomes;
import uws.engage.dsl.assess.Model;
import uws.engage.dsl.assess.Outcome;
import uws.engage.dsl.assess.OutcomeValueLimit;
import uws.engage.dsl.assess.ParamCondition;
import uws.engage.dsl.assess.Parameter;
import uws.engage.dsl.assess.Params;
import uws.engage.dsl.assess.PlayerDescription;
import uws.engage.dsl.assess.Point;
import uws.engage.dsl.assess.Points;
import uws.engage.dsl.assess.PointsCondition;
import uws.engage.dsl.assess.Reaction;
import uws.engage.dsl.assess.Reactions;
import uws.engage.dsl.assess.TimerAction;
import uws.engage.dsl.assess.TimerActions;
import uws.engage.dsl.assess.Timing;
import uws.engage.dsl.assess.Trigger;
import uws.engage.dsl.assess.TriggerFeedback;
import uws.engage.dsl.assess.Type;
import uws.engage.dsl.assess.TypeOutcome;
import uws.engage.dsl.assess.UpdateScore;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssessFactoryImpl extends EFactoryImpl implements AssessFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AssessFactory init()
  {
    try
    {
      AssessFactory theAssessFactory = (AssessFactory)EPackage.Registry.INSTANCE.getEFactory(AssessPackage.eNS_URI);
      if (theAssessFactory != null)
      {
        return theAssessFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AssessFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssessFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AssessPackage.MODEL: return createModel();
      case AssessPackage.TYPE: return createType();
      case AssessPackage.ENUM: return createEnum();
      case AssessPackage.GAME_DESCRIPTION: return createGameDescription();
      case AssessPackage.AGE: return createAge();
      case AssessPackage.PLAYER_DESCRIPTION: return createPlayerDescription();
      case AssessPackage.CHARACTERISTIC: return createCharacteristic();
      case AssessPackage.LEARNING_OUTCOMES: return createLearningOutcomes();
      case AssessPackage.OUTCOME: return createOutcome();
      case AssessPackage.TYPE_OUTCOME: return createTypeOutcome();
      case AssessPackage.FEEDBACK_MESSAGES: return createFeedbackMessages();
      case AssessPackage.FEEDBACK: return createFeedback();
      case AssessPackage.EVIDENCE_MODEL: return createEvidenceModel();
      case AssessPackage.ACTION_SEQUENCES: return createActionSequences();
      case AssessPackage.ACTION_SEQUENCE: return createActionSequence();
      case AssessPackage.TIMER_ACTIONS: return createTimerActions();
      case AssessPackage.TIMER_ACTION: return createTimerAction();
      case AssessPackage.TIMING: return createTiming();
      case AssessPackage.ACTION_REACTION: return createActionReaction();
      case AssessPackage.UPDATE_SCORE: return createUpdateScore();
      case AssessPackage.TRIGGER_FEEDBACK: return createTriggerFeedback();
      case AssessPackage.ACTION: return createAction();
      case AssessPackage.PARAMETER: return createParameter();
      case AssessPackage.POINTS: return createPoints();
      case AssessPackage.POINT: return createPoint();
      case AssessPackage.PARAMS: return createParams();
      case AssessPackage.REACTIONS: return createReactions();
      case AssessPackage.REACTION: return createReaction();
      case AssessPackage.PARAM_CONDITION: return createParamCondition();
      case AssessPackage.POINTS_CONDITION: return createPointsCondition();
      case AssessPackage.FEEDBACK_MODEL: return createFeedbackModel();
      case AssessPackage.TRIGGER: return createTrigger();
      case AssessPackage.OUTCOME_VALUE_LIMIT: return createOutcomeValueLimit();
      case AssessPackage.INACTIVITY_LIMIT: return createInactivityLimit();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public uws.engage.dsl.assess.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameDescription createGameDescription()
  {
    GameDescriptionImpl gameDescription = new GameDescriptionImpl();
    return gameDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Age createAge()
  {
    AgeImpl age = new AgeImpl();
    return age;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlayerDescription createPlayerDescription()
  {
    PlayerDescriptionImpl playerDescription = new PlayerDescriptionImpl();
    return playerDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Characteristic createCharacteristic()
  {
    CharacteristicImpl characteristic = new CharacteristicImpl();
    return characteristic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LearningOutcomes createLearningOutcomes()
  {
    LearningOutcomesImpl learningOutcomes = new LearningOutcomesImpl();
    return learningOutcomes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Outcome createOutcome()
  {
    OutcomeImpl outcome = new OutcomeImpl();
    return outcome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeOutcome createTypeOutcome()
  {
    TypeOutcomeImpl typeOutcome = new TypeOutcomeImpl();
    return typeOutcome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeedbackMessages createFeedbackMessages()
  {
    FeedbackMessagesImpl feedbackMessages = new FeedbackMessagesImpl();
    return feedbackMessages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feedback createFeedback()
  {
    FeedbackImpl feedback = new FeedbackImpl();
    return feedback;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvidenceModel createEvidenceModel()
  {
    EvidenceModelImpl evidenceModel = new EvidenceModelImpl();
    return evidenceModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionSequences createActionSequences()
  {
    ActionSequencesImpl actionSequences = new ActionSequencesImpl();
    return actionSequences;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionSequence createActionSequence()
  {
    ActionSequenceImpl actionSequence = new ActionSequenceImpl();
    return actionSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimerActions createTimerActions()
  {
    TimerActionsImpl timerActions = new TimerActionsImpl();
    return timerActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimerAction createTimerAction()
  {
    TimerActionImpl timerAction = new TimerActionImpl();
    return timerAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Timing createTiming()
  {
    TimingImpl timing = new TimingImpl();
    return timing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionReaction createActionReaction()
  {
    ActionReactionImpl actionReaction = new ActionReactionImpl();
    return actionReaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateScore createUpdateScore()
  {
    UpdateScoreImpl updateScore = new UpdateScoreImpl();
    return updateScore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TriggerFeedback createTriggerFeedback()
  {
    TriggerFeedbackImpl triggerFeedback = new TriggerFeedbackImpl();
    return triggerFeedback;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Points createPoints()
  {
    PointsImpl points = new PointsImpl();
    return points;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point createPoint()
  {
    PointImpl point = new PointImpl();
    return point;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Params createParams()
  {
    ParamsImpl params = new ParamsImpl();
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reactions createReactions()
  {
    ReactionsImpl reactions = new ReactionsImpl();
    return reactions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reaction createReaction()
  {
    ReactionImpl reaction = new ReactionImpl();
    return reaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamCondition createParamCondition()
  {
    ParamConditionImpl paramCondition = new ParamConditionImpl();
    return paramCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointsCondition createPointsCondition()
  {
    PointsConditionImpl pointsCondition = new PointsConditionImpl();
    return pointsCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeedbackModel createFeedbackModel()
  {
    FeedbackModelImpl feedbackModel = new FeedbackModelImpl();
    return feedbackModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trigger createTrigger()
  {
    TriggerImpl trigger = new TriggerImpl();
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutcomeValueLimit createOutcomeValueLimit()
  {
    OutcomeValueLimitImpl outcomeValueLimit = new OutcomeValueLimitImpl();
    return outcomeValueLimit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InactivityLimit createInactivityLimit()
  {
    InactivityLimitImpl inactivityLimit = new InactivityLimitImpl();
    return inactivityLimit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssessPackage getAssessPackage()
  {
    return (AssessPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AssessPackage getPackage()
  {
    return AssessPackage.eINSTANCE;
  }

} //AssessFactoryImpl
