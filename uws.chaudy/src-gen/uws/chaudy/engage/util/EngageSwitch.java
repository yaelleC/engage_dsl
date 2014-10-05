/**
 */
package uws.chaudy.engage.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uws.chaudy.engage.Action;
import uws.chaudy.engage.ActionReaction;
import uws.chaudy.engage.ActionSequence;
import uws.chaudy.engage.ActionSequences;
import uws.chaudy.engage.Age;
import uws.chaudy.engage.Characteristic;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uws.chaudy.engage.EngagePackage
 * @generated
 */
public class EngageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EngagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EngageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EngagePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case EngagePackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.ENUM:
      {
        uws.chaudy.engage.Enum enum_ = (uws.chaudy.engage.Enum)theEObject;
        T result = caseEnum(enum_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.GAME_DESCRIPTION:
      {
        GameDescription gameDescription = (GameDescription)theEObject;
        T result = caseGameDescription(gameDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.AGE:
      {
        Age age = (Age)theEObject;
        T result = caseAge(age);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.PLAYER_DESCRIPTION:
      {
        PlayerDescription playerDescription = (PlayerDescription)theEObject;
        T result = casePlayerDescription(playerDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.CHARACTERISTIC:
      {
        Characteristic characteristic = (Characteristic)theEObject;
        T result = caseCharacteristic(characteristic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.LEARNING_OUTCOMES:
      {
        LearningOutcomes learningOutcomes = (LearningOutcomes)theEObject;
        T result = caseLearningOutcomes(learningOutcomes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.OUTCOME:
      {
        Outcome outcome = (Outcome)theEObject;
        T result = caseOutcome(outcome);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.TYPE_OUTCOME:
      {
        TypeOutcome typeOutcome = (TypeOutcome)theEObject;
        T result = caseTypeOutcome(typeOutcome);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.FEEDBACK_MESSAGES:
      {
        FeedbackMessages feedbackMessages = (FeedbackMessages)theEObject;
        T result = caseFeedbackMessages(feedbackMessages);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.FEEDBACK:
      {
        Feedback feedback = (Feedback)theEObject;
        T result = caseFeedback(feedback);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.EVIDENCE_MODEL:
      {
        EvidenceModel evidenceModel = (EvidenceModel)theEObject;
        T result = caseEvidenceModel(evidenceModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.ACTION_SEQUENCES:
      {
        ActionSequences actionSequences = (ActionSequences)theEObject;
        T result = caseActionSequences(actionSequences);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.ACTION_SEQUENCE:
      {
        ActionSequence actionSequence = (ActionSequence)theEObject;
        T result = caseActionSequence(actionSequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.TIMER_ACTIONS:
      {
        TimerActions timerActions = (TimerActions)theEObject;
        T result = caseTimerActions(timerActions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.TIMER_ACTION:
      {
        TimerAction timerAction = (TimerAction)theEObject;
        T result = caseTimerAction(timerAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.TIMING:
      {
        Timing timing = (Timing)theEObject;
        T result = caseTiming(timing);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.ACTION_REACTION:
      {
        ActionReaction actionReaction = (ActionReaction)theEObject;
        T result = caseActionReaction(actionReaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.UPDATE_SCORE:
      {
        UpdateScore updateScore = (UpdateScore)theEObject;
        T result = caseUpdateScore(updateScore);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.TRIGGER_FEEDBACK:
      {
        TriggerFeedback triggerFeedback = (TriggerFeedback)theEObject;
        T result = caseTriggerFeedback(triggerFeedback);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.POINTS:
      {
        Points points = (Points)theEObject;
        T result = casePoints(points);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.POINT:
      {
        Point point = (Point)theEObject;
        T result = casePoint(point);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.PARAMS:
      {
        Params params = (Params)theEObject;
        T result = caseParams(params);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.REACTIONS:
      {
        Reactions reactions = (Reactions)theEObject;
        T result = caseReactions(reactions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.REACTION:
      {
        Reaction reaction = (Reaction)theEObject;
        T result = caseReaction(reaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.PARAM_CONDITION:
      {
        ParamCondition paramCondition = (ParamCondition)theEObject;
        T result = caseParamCondition(paramCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.POINTS_CONDITION:
      {
        PointsCondition pointsCondition = (PointsCondition)theEObject;
        T result = casePointsCondition(pointsCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.FEEDBACK_MODEL:
      {
        FeedbackModel feedbackModel = (FeedbackModel)theEObject;
        T result = caseFeedbackModel(feedbackModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.TRIGGER:
      {
        Trigger trigger = (Trigger)theEObject;
        T result = caseTrigger(trigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.OUTCOME_VALUE_LIMIT:
      {
        OutcomeValueLimit outcomeValueLimit = (OutcomeValueLimit)theEObject;
        T result = caseOutcomeValueLimit(outcomeValueLimit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EngagePackage.INACTIVITY_LIMIT:
      {
        InactivityLimit inactivityLimit = (InactivityLimit)theEObject;
        T result = caseInactivityLimit(inactivityLimit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnum(uws.chaudy.engage.Enum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Game Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Game Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGameDescription(GameDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Age</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Age</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAge(Age object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Player Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Player Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlayerDescription(PlayerDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Characteristic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Characteristic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCharacteristic(Characteristic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Learning Outcomes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Learning Outcomes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLearningOutcomes(LearningOutcomes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Outcome</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Outcome</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutcome(Outcome object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Outcome</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Outcome</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeOutcome(TypeOutcome object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feedback Messages</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feedback Messages</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeedbackMessages(FeedbackMessages object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feedback</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feedback</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeedback(Feedback object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Evidence Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Evidence Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvidenceModel(EvidenceModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Sequences</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Sequences</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionSequences(ActionSequences object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionSequence(ActionSequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timer Actions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timer Actions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimerActions(TimerActions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timer Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timer Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimerAction(TimerAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timing</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timing</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTiming(Timing object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Reaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Reaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionReaction(ActionReaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Score</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Score</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateScore(UpdateScore object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trigger Feedback</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trigger Feedback</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTriggerFeedback(TriggerFeedback object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Points</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Points</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePoints(Points object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePoint(Point object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Params</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Params</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParams(Params object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reactions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reactions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReactions(Reactions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReaction(Reaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParamCondition(ParamCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Points Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Points Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePointsCondition(PointsCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feedback Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feedback Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeedbackModel(FeedbackModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrigger(Trigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Outcome Value Limit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Outcome Value Limit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutcomeValueLimit(OutcomeValueLimit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inactivity Limit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inactivity Limit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInactivityLimit(InactivityLimit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EngageSwitch
