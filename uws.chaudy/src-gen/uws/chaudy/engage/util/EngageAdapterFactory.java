/**
 */
package uws.chaudy.engage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uws.chaudy.engage.EngagePackage
 * @generated
 */
public class EngageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EngagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EngageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EngagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EngageSwitch<Adapter> modelSwitch =
    new EngageSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseEnum(uws.chaudy.engage.Enum object)
      {
        return createEnumAdapter();
      }
      @Override
      public Adapter caseGameDescription(GameDescription object)
      {
        return createGameDescriptionAdapter();
      }
      @Override
      public Adapter caseAge(Age object)
      {
        return createAgeAdapter();
      }
      @Override
      public Adapter casePlayerDescription(PlayerDescription object)
      {
        return createPlayerDescriptionAdapter();
      }
      @Override
      public Adapter caseCharacteristic(Characteristic object)
      {
        return createCharacteristicAdapter();
      }
      @Override
      public Adapter caseLearningOutcomes(LearningOutcomes object)
      {
        return createLearningOutcomesAdapter();
      }
      @Override
      public Adapter caseOutcome(Outcome object)
      {
        return createOutcomeAdapter();
      }
      @Override
      public Adapter caseTypeOutcome(TypeOutcome object)
      {
        return createTypeOutcomeAdapter();
      }
      @Override
      public Adapter caseFeedbackMessages(FeedbackMessages object)
      {
        return createFeedbackMessagesAdapter();
      }
      @Override
      public Adapter caseFeedback(Feedback object)
      {
        return createFeedbackAdapter();
      }
      @Override
      public Adapter caseEvidenceModel(EvidenceModel object)
      {
        return createEvidenceModelAdapter();
      }
      @Override
      public Adapter caseActionSequences(ActionSequences object)
      {
        return createActionSequencesAdapter();
      }
      @Override
      public Adapter caseActionSequence(ActionSequence object)
      {
        return createActionSequenceAdapter();
      }
      @Override
      public Adapter caseTimerActions(TimerActions object)
      {
        return createTimerActionsAdapter();
      }
      @Override
      public Adapter caseTimerAction(TimerAction object)
      {
        return createTimerActionAdapter();
      }
      @Override
      public Adapter caseTiming(Timing object)
      {
        return createTimingAdapter();
      }
      @Override
      public Adapter caseActionReaction(ActionReaction object)
      {
        return createActionReactionAdapter();
      }
      @Override
      public Adapter caseUpdateScore(UpdateScore object)
      {
        return createUpdateScoreAdapter();
      }
      @Override
      public Adapter caseTriggerFeedback(TriggerFeedback object)
      {
        return createTriggerFeedbackAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter casePoints(Points object)
      {
        return createPointsAdapter();
      }
      @Override
      public Adapter casePoint(Point object)
      {
        return createPointAdapter();
      }
      @Override
      public Adapter caseParams(Params object)
      {
        return createParamsAdapter();
      }
      @Override
      public Adapter caseReactions(Reactions object)
      {
        return createReactionsAdapter();
      }
      @Override
      public Adapter caseReaction(Reaction object)
      {
        return createReactionAdapter();
      }
      @Override
      public Adapter caseParamCondition(ParamCondition object)
      {
        return createParamConditionAdapter();
      }
      @Override
      public Adapter casePointsCondition(PointsCondition object)
      {
        return createPointsConditionAdapter();
      }
      @Override
      public Adapter caseFeedbackModel(FeedbackModel object)
      {
        return createFeedbackModelAdapter();
      }
      @Override
      public Adapter caseTrigger(Trigger object)
      {
        return createTriggerAdapter();
      }
      @Override
      public Adapter caseOutcomeValueLimit(OutcomeValueLimit object)
      {
        return createOutcomeValueLimitAdapter();
      }
      @Override
      public Adapter caseInactivityLimit(InactivityLimit object)
      {
        return createInactivityLimitAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.Enum
   * @generated
   */
  public Adapter createEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.GameDescription <em>Game Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.GameDescription
   * @generated
   */
  public Adapter createGameDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.Age <em>Age</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.Age
   * @generated
   */
  public Adapter createAgeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.PlayerDescription <em>Player Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.PlayerDescription
   * @generated
   */
  public Adapter createPlayerDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.Characteristic <em>Characteristic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.Characteristic
   * @generated
   */
  public Adapter createCharacteristicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.LearningOutcomes <em>Learning Outcomes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.LearningOutcomes
   * @generated
   */
  public Adapter createLearningOutcomesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.Outcome <em>Outcome</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.Outcome
   * @generated
   */
  public Adapter createOutcomeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.TypeOutcome <em>Type Outcome</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.TypeOutcome
   * @generated
   */
  public Adapter createTypeOutcomeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.FeedbackMessages <em>Feedback Messages</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.FeedbackMessages
   * @generated
   */
  public Adapter createFeedbackMessagesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.Feedback <em>Feedback</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.Feedback
   * @generated
   */
  public Adapter createFeedbackAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.EvidenceModel <em>Evidence Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.EvidenceModel
   * @generated
   */
  public Adapter createEvidenceModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.ActionSequences <em>Action Sequences</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.ActionSequences
   * @generated
   */
  public Adapter createActionSequencesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.ActionSequence <em>Action Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.ActionSequence
   * @generated
   */
  public Adapter createActionSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.TimerActions <em>Timer Actions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.TimerActions
   * @generated
   */
  public Adapter createTimerActionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.TimerAction <em>Timer Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.TimerAction
   * @generated
   */
  public Adapter createTimerActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.Timing <em>Timing</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.Timing
   * @generated
   */
  public Adapter createTimingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.ActionReaction <em>Action Reaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.ActionReaction
   * @generated
   */
  public Adapter createActionReactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.UpdateScore <em>Update Score</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.UpdateScore
   * @generated
   */
  public Adapter createUpdateScoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.TriggerFeedback <em>Trigger Feedback</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.TriggerFeedback
   * @generated
   */
  public Adapter createTriggerFeedbackAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.Points <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.Points
   * @generated
   */
  public Adapter createPointsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.Point
   * @generated
   */
  public Adapter createPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.Params <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.Params
   * @generated
   */
  public Adapter createParamsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.Reactions <em>Reactions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.Reactions
   * @generated
   */
  public Adapter createReactionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.Reaction <em>Reaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.Reaction
   * @generated
   */
  public Adapter createReactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.ParamCondition <em>Param Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.ParamCondition
   * @generated
   */
  public Adapter createParamConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.PointsCondition <em>Points Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.PointsCondition
   * @generated
   */
  public Adapter createPointsConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.FeedbackModel <em>Feedback Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.FeedbackModel
   * @generated
   */
  public Adapter createFeedbackModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.Trigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.Trigger
   * @generated
   */
  public Adapter createTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.OutcomeValueLimit <em>Outcome Value Limit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.OutcomeValueLimit
   * @generated
   */
  public Adapter createOutcomeValueLimitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.chaudy.engage.InactivityLimit <em>Inactivity Limit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.chaudy.engage.InactivityLimit
   * @generated
   */
  public Adapter createInactivityLimitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EngageAdapterFactory
