/**
 */
package uws.chaudy.engage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uws.chaudy.engage.Action;
import uws.chaudy.engage.ActionReaction;
import uws.chaudy.engage.ActionSequence;
import uws.chaudy.engage.ActionSequences;
import uws.chaudy.engage.Age;
import uws.chaudy.engage.Characteristic;
import uws.chaudy.engage.EngageFactory;
import uws.chaudy.engage.EngagePackage;
import uws.chaudy.engage.EvidenceModel;
import uws.chaudy.engage.Feedback;
import uws.chaudy.engage.FeedbackMessages;
import uws.chaudy.engage.FeedbackModel;
import uws.chaudy.engage.GameDescription;
import uws.chaudy.engage.InactivityLimit;
import uws.chaudy.engage.LearningOutcomes;
import uws.chaudy.engage.Model;
import uws.chaudy.engage.Outcome;
import uws.chaudy.engage.OutcomeValueLimit;
import uws.chaudy.engage.ParamCondition;
import uws.chaudy.engage.Parameter;
import uws.chaudy.engage.Params;
import uws.chaudy.engage.PlayerDescription;
import uws.chaudy.engage.Point;
import uws.chaudy.engage.Points;
import uws.chaudy.engage.PointsCondition;
import uws.chaudy.engage.Reaction;
import uws.chaudy.engage.Reactions;
import uws.chaudy.engage.TimerAction;
import uws.chaudy.engage.TimerActions;
import uws.chaudy.engage.Timing;
import uws.chaudy.engage.Trigger;
import uws.chaudy.engage.TriggerFeedback;
import uws.chaudy.engage.Type;
import uws.chaudy.engage.TypeOutcome;
import uws.chaudy.engage.UpdateScore;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EngageFactoryImpl extends EFactoryImpl implements EngageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EngageFactory init()
  {
    try
    {
      EngageFactory theEngageFactory = (EngageFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.chaudy.uws/Engage"); 
      if (theEngageFactory != null)
      {
        return theEngageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EngageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EngageFactoryImpl()
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
      case EngagePackage.MODEL: return createModel();
      case EngagePackage.TYPE: return createType();
      case EngagePackage.ENUM: return createEnum();
      case EngagePackage.GAME_DESCRIPTION: return createGameDescription();
      case EngagePackage.AGE: return createAge();
      case EngagePackage.PLAYER_DESCRIPTION: return createPlayerDescription();
      case EngagePackage.CHARACTERISTIC: return createCharacteristic();
      case EngagePackage.LEARNING_OUTCOMES: return createLearningOutcomes();
      case EngagePackage.OUTCOME: return createOutcome();
      case EngagePackage.TYPE_OUTCOME: return createTypeOutcome();
      case EngagePackage.FEEDBACK_MESSAGES: return createFeedbackMessages();
      case EngagePackage.FEEDBACK: return createFeedback();
      case EngagePackage.EVIDENCE_MODEL: return createEvidenceModel();
      case EngagePackage.ACTION_SEQUENCES: return createActionSequences();
      case EngagePackage.ACTION_SEQUENCE: return createActionSequence();
      case EngagePackage.TIMER_ACTIONS: return createTimerActions();
      case EngagePackage.TIMER_ACTION: return createTimerAction();
      case EngagePackage.TIMING: return createTiming();
      case EngagePackage.ACTION_REACTION: return createActionReaction();
      case EngagePackage.UPDATE_SCORE: return createUpdateScore();
      case EngagePackage.TRIGGER_FEEDBACK: return createTriggerFeedback();
      case EngagePackage.ACTION: return createAction();
      case EngagePackage.PARAMETER: return createParameter();
      case EngagePackage.POINTS: return createPoints();
      case EngagePackage.POINT: return createPoint();
      case EngagePackage.PARAMS: return createParams();
      case EngagePackage.REACTIONS: return createReactions();
      case EngagePackage.REACTION: return createReaction();
      case EngagePackage.PARAM_CONDITION: return createParamCondition();
      case EngagePackage.POINTS_CONDITION: return createPointsCondition();
      case EngagePackage.FEEDBACK_MODEL: return createFeedbackModel();
      case EngagePackage.TRIGGER: return createTrigger();
      case EngagePackage.OUTCOME_VALUE_LIMIT: return createOutcomeValueLimit();
      case EngagePackage.INACTIVITY_LIMIT: return createInactivityLimit();
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
  public uws.chaudy.engage.Enum createEnum()
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
  public EngagePackage getEngagePackage()
  {
    return (EngagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EngagePackage getPackage()
  {
    return EngagePackage.eINSTANCE;
  }

} //EngageFactoryImpl
