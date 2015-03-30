/**
 */
package uws.engage.dsl.assess.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uws.engage.dsl.assess.AssessPackage
 * @generated
 */
public class AssessAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AssessPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssessAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AssessPackage.eINSTANCE;
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
  protected AssessSwitch<Adapter> modelSwitch =
    new AssessSwitch<Adapter>()
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
      public Adapter caseEnum(uws.engage.dsl.assess.Enum object)
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
      public Adapter caseParamsIn(ParamsIn object)
      {
        return createParamsInAdapter();
      }
      @Override
      public Adapter caseParamIn(ParamIn object)
      {
        return createParamInAdapter();
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
      public Adapter caseOutcomesPoints(OutcomesPoints object)
      {
        return createOutcomesPointsAdapter();
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
      public Adapter caseBadgeModel(BadgeModel object)
      {
        return createBadgeModelAdapter();
      }
      @Override
      public Adapter caseGenericTrigger(GenericTrigger object)
      {
        return createGenericTriggerAdapter();
      }
      @Override
      public Adapter caseSimpleTrigger(SimpleTrigger object)
      {
        return createSimpleTriggerAdapter();
      }
      @Override
      public Adapter caseLOTrigger(LOTrigger object)
      {
        return createLOTriggerAdapter();
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
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.Enum
   * @generated
   */
  public Adapter createEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.GameDescription <em>Game Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.GameDescription
   * @generated
   */
  public Adapter createGameDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.Age <em>Age</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.Age
   * @generated
   */
  public Adapter createAgeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.PlayerDescription <em>Player Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.PlayerDescription
   * @generated
   */
  public Adapter createPlayerDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.Characteristic <em>Characteristic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.Characteristic
   * @generated
   */
  public Adapter createCharacteristicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.LearningOutcomes <em>Learning Outcomes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.LearningOutcomes
   * @generated
   */
  public Adapter createLearningOutcomesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.Outcome <em>Outcome</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.Outcome
   * @generated
   */
  public Adapter createOutcomeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.TypeOutcome <em>Type Outcome</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.TypeOutcome
   * @generated
   */
  public Adapter createTypeOutcomeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.FeedbackMessages <em>Feedback Messages</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.FeedbackMessages
   * @generated
   */
  public Adapter createFeedbackMessagesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.Feedback <em>Feedback</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.Feedback
   * @generated
   */
  public Adapter createFeedbackAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.EvidenceModel <em>Evidence Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.EvidenceModel
   * @generated
   */
  public Adapter createEvidenceModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.ActionSequences <em>Action Sequences</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.ActionSequences
   * @generated
   */
  public Adapter createActionSequencesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.ActionSequence <em>Action Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.ActionSequence
   * @generated
   */
  public Adapter createActionSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.TimerActions <em>Timer Actions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.TimerActions
   * @generated
   */
  public Adapter createTimerActionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.TimerAction <em>Timer Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.TimerAction
   * @generated
   */
  public Adapter createTimerActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.Timing <em>Timing</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.Timing
   * @generated
   */
  public Adapter createTimingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.ActionReaction <em>Action Reaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.ActionReaction
   * @generated
   */
  public Adapter createActionReactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.UpdateScore <em>Update Score</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.UpdateScore
   * @generated
   */
  public Adapter createUpdateScoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.TriggerFeedback <em>Trigger Feedback</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.TriggerFeedback
   * @generated
   */
  public Adapter createTriggerFeedbackAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.ParamsIn <em>Params In</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.ParamsIn
   * @generated
   */
  public Adapter createParamsInAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.ParamIn <em>Param In</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.ParamIn
   * @generated
   */
  public Adapter createParamInAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.Points <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.Points
   * @generated
   */
  public Adapter createPointsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.OutcomesPoints <em>Outcomes Points</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.OutcomesPoints
   * @generated
   */
  public Adapter createOutcomesPointsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.Point
   * @generated
   */
  public Adapter createPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.Params <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.Params
   * @generated
   */
  public Adapter createParamsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.Reactions <em>Reactions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.Reactions
   * @generated
   */
  public Adapter createReactionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.Reaction <em>Reaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.Reaction
   * @generated
   */
  public Adapter createReactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.ParamCondition <em>Param Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.ParamCondition
   * @generated
   */
  public Adapter createParamConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.PointsCondition <em>Points Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.PointsCondition
   * @generated
   */
  public Adapter createPointsConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.FeedbackModel <em>Feedback Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.FeedbackModel
   * @generated
   */
  public Adapter createFeedbackModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.Trigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.Trigger
   * @generated
   */
  public Adapter createTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.OutcomeValueLimit <em>Outcome Value Limit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.OutcomeValueLimit
   * @generated
   */
  public Adapter createOutcomeValueLimitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.InactivityLimit <em>Inactivity Limit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.InactivityLimit
   * @generated
   */
  public Adapter createInactivityLimitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.BadgeModel <em>Badge Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.BadgeModel
   * @generated
   */
  public Adapter createBadgeModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.GenericTrigger <em>Generic Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.GenericTrigger
   * @generated
   */
  public Adapter createGenericTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.SimpleTrigger <em>Simple Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.SimpleTrigger
   * @generated
   */
  public Adapter createSimpleTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uws.engage.dsl.assess.LOTrigger <em>LO Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uws.engage.dsl.assess.LOTrigger
   * @generated
   */
  public Adapter createLOTriggerAdapter()
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

} //AssessAdapterFactory
