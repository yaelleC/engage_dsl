/**
 */
package uws.engage.dsl.assess.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uws.engage.dsl.assess.Action;
import uws.engage.dsl.assess.ActionReaction;
import uws.engage.dsl.assess.ActionSequence;
import uws.engage.dsl.assess.ActionSequences;
import uws.engage.dsl.assess.Age;
import uws.engage.dsl.assess.AssessFactory;
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
import uws.engage.dsl.assess.Parameter;
import uws.engage.dsl.assess.Params;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssessPackageImpl extends EPackageImpl implements AssessPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gameDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass playerDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass characteristicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass learningOutcomesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outcomeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeOutcomeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass feedbackMessagesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass feedbackEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass evidenceModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionSequencesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionSequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timerActionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timerActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionReactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateScoreEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass triggerFeedbackEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outcomesPointsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reactionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointsConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass feedbackModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass triggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outcomeValueLimitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inactivityLimitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass badgeModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loTriggerEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uws.engage.dsl.assess.AssessPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AssessPackageImpl()
  {
    super(eNS_URI, AssessFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link AssessPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AssessPackage init()
  {
    if (isInited) return (AssessPackage)EPackage.Registry.INSTANCE.getEPackage(AssessPackage.eNS_URI);

    // Obtain or create and register package
    AssessPackageImpl theAssessPackage = (AssessPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AssessPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AssessPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theAssessPackage.createPackageContents();

    // Initialize created meta-data
    theAssessPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAssessPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AssessPackage.eNS_URI, theAssessPackage);
    return theAssessPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Game()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Player()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_LearningOutcomes()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_FeedbackMessages()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_EvidenceModel()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_FeedbackModel()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_BadgeModel()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_SimpleType()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_EnumType()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnum()
  {
    return enumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnum_EnumValues()
  {
    return (EAttribute)enumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGameDescription()
  {
    return gameDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGameDescription_Name()
  {
    return (EAttribute)gameDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGameDescription_Dev()
  {
    return (EAttribute)gameDescriptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGameDescription_Desc()
  {
    return (EAttribute)gameDescriptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGameDescription_AgeRange()
  {
    return (EReference)gameDescriptionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGameDescription_Lang()
  {
    return (EAttribute)gameDescriptionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGameDescription_Country()
  {
    return (EAttribute)gameDescriptionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGameDescription_Genre()
  {
    return (EAttribute)gameDescriptionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGameDescription_Subject()
  {
    return (EAttribute)gameDescriptionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGameDescription_Public()
  {
    return (EAttribute)gameDescriptionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAge()
  {
    return ageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAge_AgeMin()
  {
    return (EAttribute)ageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAge_AgeMax()
  {
    return (EAttribute)ageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlayerDescription()
  {
    return playerDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlayerDescription_Characteristics()
  {
    return (EReference)playerDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCharacteristic()
  {
    return characteristicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCharacteristic_Name()
  {
    return (EAttribute)characteristicEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCharacteristic_Type()
  {
    return (EReference)characteristicEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLearningOutcomes()
  {
    return learningOutcomesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLearningOutcomes_Outcomes()
  {
    return (EReference)learningOutcomesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutcome()
  {
    return outcomeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutcome_Name()
  {
    return (EAttribute)outcomeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutcome_Desc()
  {
    return (EAttribute)outcomeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutcome_Value()
  {
    return (EAttribute)outcomeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutcome_Type()
  {
    return (EReference)outcomeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeOutcome()
  {
    return typeOutcomeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeOutcome_Knowledge()
  {
    return (EAttribute)typeOutcomeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeOutcome_Skill()
  {
    return (EAttribute)typeOutcomeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeOutcome_Competence()
  {
    return (EAttribute)typeOutcomeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeedbackMessages()
  {
    return feedbackMessagesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeedbackMessages_FeedbackMsgs()
  {
    return (EReference)feedbackMessagesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeedback()
  {
    return feedbackEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeedback_Name()
  {
    return (EAttribute)feedbackEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeedback_Message()
  {
    return (EAttribute)feedbackEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeedback_Image()
  {
    return (EAttribute)feedbackEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeedback_Type()
  {
    return (EAttribute)feedbackEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeedback_Win()
  {
    return (EAttribute)feedbackEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeedback_Lose()
  {
    return (EAttribute)feedbackEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeedback_End()
  {
    return (EAttribute)feedbackEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvidenceModel()
  {
    return evidenceModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvidenceModel_Actions()
  {
    return (EReference)evidenceModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvidenceModel_TimerActions()
  {
    return (EReference)evidenceModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvidenceModel_ActionSequence()
  {
    return (EReference)evidenceModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionSequences()
  {
    return actionSequencesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionSequences_ActionSequences()
  {
    return (EReference)actionSequencesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionSequence()
  {
    return actionSequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionSequence_Action1()
  {
    return (EAttribute)actionSequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionSequence_Before()
  {
    return (EAttribute)actionSequenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionSequence_After()
  {
    return (EAttribute)actionSequenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionSequence_Action2()
  {
    return (EAttribute)actionSequenceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionSequence_SequenceReactions()
  {
    return (EReference)actionSequenceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimerActions()
  {
    return timerActionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTimerActions_TimerActions()
  {
    return (EReference)timerActionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimerAction()
  {
    return timerActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimerAction_Name()
  {
    return (EAttribute)timerActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTimerAction_Timings()
  {
    return (EReference)timerActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTiming()
  {
    return timingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTiming_Before()
  {
    return (EAttribute)timingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTiming_After()
  {
    return (EAttribute)timingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTiming_Limit()
  {
    return (EAttribute)timingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTiming_TimingReactions()
  {
    return (EReference)timingEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionReaction()
  {
    return actionReactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionReaction_UpdateScore()
  {
    return (EReference)actionReactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionReaction_TriggerFeedback()
  {
    return (EReference)actionReactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateScore()
  {
    return updateScoreEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateScore_Outcome()
  {
    return (EReference)updateScoreEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateScore_Pts()
  {
    return (EReference)updateScoreEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTriggerFeedback()
  {
    return triggerFeedbackEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTriggerFeedback_Feedback()
  {
    return (EReference)triggerFeedbackEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTriggerFeedback_Immediate()
  {
    return (EAttribute)triggerFeedbackEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAction_Name()
  {
    return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_Params()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAction_Desc()
  {
    return (EAttribute)actionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_Points()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_Reactions()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_LogOnly()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Type()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Name()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPoints()
  {
    return pointsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoints_OutcomesPoints()
  {
    return (EReference)pointsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoints_Others()
  {
    return (EAttribute)pointsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoints_Params()
  {
    return (EReference)pointsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutcomesPoints()
  {
    return outcomesPointsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutcomesPoints_Outcome()
  {
    return (EReference)outcomesPointsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutcomesPoints_ResetValue()
  {
    return (EAttribute)outcomesPointsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutcomesPoints_Pts()
  {
    return (EReference)outcomesPointsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutcomesPoints_Var()
  {
    return (EReference)outcomesPointsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPoint()
  {
    return pointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoint_Negative()
  {
    return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoint_Value()
  {
    return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParams()
  {
    return paramsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParams_Name()
  {
    return (EAttribute)paramsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParams_Values()
  {
    return (EAttribute)paramsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReactions()
  {
    return reactionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReactions_Reaction()
  {
    return (EReference)reactionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReaction()
  {
    return reactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReaction_ParamsC()
  {
    return (EReference)reactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReaction_PointsC()
  {
    return (EReference)reactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReaction_Feedback()
  {
    return (EReference)reactionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReaction_Immediate()
  {
    return (EAttribute)reactionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParamCondition()
  {
    return paramConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParamCondition_Params()
  {
    return (EReference)paramConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPointsCondition()
  {
    return pointsConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPointsCondition_KeyWd()
  {
    return (EAttribute)pointsConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPointsCondition_Sign()
  {
    return (EAttribute)pointsConditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPointsCondition_Value()
  {
    return (EReference)pointsConditionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeedbackModel()
  {
    return feedbackModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeedbackModel_Triggers()
  {
    return (EReference)feedbackModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrigger()
  {
    return triggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrigger_Perf()
  {
    return (EReference)triggerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrigger_Inactivity()
  {
    return (EReference)triggerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutcomeValueLimit()
  {
    return outcomeValueLimitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutcomeValueLimit_Outcome()
  {
    return (EReference)outcomeValueLimitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutcomeValueLimit_Sign()
  {
    return (EAttribute)outcomeValueLimitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutcomeValueLimit_NegativeLimit()
  {
    return (EAttribute)outcomeValueLimitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutcomeValueLimit_Limit()
  {
    return (EAttribute)outcomeValueLimitEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutcomeValueLimit_TriggerReactions()
  {
    return (EReference)outcomeValueLimitEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInactivityLimit()
  {
    return inactivityLimitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInactivityLimit_Sign()
  {
    return (EAttribute)inactivityLimitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInactivityLimit_Limit()
  {
    return (EAttribute)inactivityLimitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInactivityLimit_TriggerReactions()
  {
    return (EReference)inactivityLimitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBadgeModel()
  {
    return badgeModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBadgeModel_GenericTriggers()
  {
    return (EReference)badgeModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericTrigger()
  {
    return genericTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericTrigger_Simple()
  {
    return (EReference)genericTriggerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericTrigger_Lo()
  {
    return (EReference)genericTriggerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleTrigger()
  {
    return simpleTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleTrigger_Function()
  {
    return (EAttribute)simpleTriggerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleTrigger_Sign()
  {
    return (EAttribute)simpleTriggerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleTrigger_NegativeLimit()
  {
    return (EAttribute)simpleTriggerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleTrigger_Limit()
  {
    return (EAttribute)simpleTriggerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleTrigger_TriggerReactions()
  {
    return (EReference)simpleTriggerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLOTrigger()
  {
    return loTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLOTrigger_Function()
  {
    return (EAttribute)loTriggerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLOTrigger_Outcome()
  {
    return (EReference)loTriggerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLOTrigger_Sign()
  {
    return (EAttribute)loTriggerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLOTrigger_NegativeLimit()
  {
    return (EAttribute)loTriggerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLOTrigger_Limit()
  {
    return (EAttribute)loTriggerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLOTrigger_TriggerReactions()
  {
    return (EReference)loTriggerEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssessFactory getAssessFactory()
  {
    return (AssessFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__GAME);
    createEReference(modelEClass, MODEL__PLAYER);
    createEReference(modelEClass, MODEL__LEARNING_OUTCOMES);
    createEReference(modelEClass, MODEL__FEEDBACK_MESSAGES);
    createEReference(modelEClass, MODEL__EVIDENCE_MODEL);
    createEReference(modelEClass, MODEL__FEEDBACK_MODEL);
    createEReference(modelEClass, MODEL__BADGE_MODEL);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__SIMPLE_TYPE);
    createEReference(typeEClass, TYPE__ENUM_TYPE);

    enumEClass = createEClass(ENUM);
    createEAttribute(enumEClass, ENUM__ENUM_VALUES);

    gameDescriptionEClass = createEClass(GAME_DESCRIPTION);
    createEAttribute(gameDescriptionEClass, GAME_DESCRIPTION__NAME);
    createEAttribute(gameDescriptionEClass, GAME_DESCRIPTION__DEV);
    createEAttribute(gameDescriptionEClass, GAME_DESCRIPTION__DESC);
    createEReference(gameDescriptionEClass, GAME_DESCRIPTION__AGE_RANGE);
    createEAttribute(gameDescriptionEClass, GAME_DESCRIPTION__LANG);
    createEAttribute(gameDescriptionEClass, GAME_DESCRIPTION__COUNTRY);
    createEAttribute(gameDescriptionEClass, GAME_DESCRIPTION__GENRE);
    createEAttribute(gameDescriptionEClass, GAME_DESCRIPTION__SUBJECT);
    createEAttribute(gameDescriptionEClass, GAME_DESCRIPTION__PUBLIC);

    ageEClass = createEClass(AGE);
    createEAttribute(ageEClass, AGE__AGE_MIN);
    createEAttribute(ageEClass, AGE__AGE_MAX);

    playerDescriptionEClass = createEClass(PLAYER_DESCRIPTION);
    createEReference(playerDescriptionEClass, PLAYER_DESCRIPTION__CHARACTERISTICS);

    characteristicEClass = createEClass(CHARACTERISTIC);
    createEAttribute(characteristicEClass, CHARACTERISTIC__NAME);
    createEReference(characteristicEClass, CHARACTERISTIC__TYPE);

    learningOutcomesEClass = createEClass(LEARNING_OUTCOMES);
    createEReference(learningOutcomesEClass, LEARNING_OUTCOMES__OUTCOMES);

    outcomeEClass = createEClass(OUTCOME);
    createEAttribute(outcomeEClass, OUTCOME__NAME);
    createEAttribute(outcomeEClass, OUTCOME__DESC);
    createEAttribute(outcomeEClass, OUTCOME__VALUE);
    createEReference(outcomeEClass, OUTCOME__TYPE);

    typeOutcomeEClass = createEClass(TYPE_OUTCOME);
    createEAttribute(typeOutcomeEClass, TYPE_OUTCOME__KNOWLEDGE);
    createEAttribute(typeOutcomeEClass, TYPE_OUTCOME__SKILL);
    createEAttribute(typeOutcomeEClass, TYPE_OUTCOME__COMPETENCE);

    feedbackMessagesEClass = createEClass(FEEDBACK_MESSAGES);
    createEReference(feedbackMessagesEClass, FEEDBACK_MESSAGES__FEEDBACK_MSGS);

    feedbackEClass = createEClass(FEEDBACK);
    createEAttribute(feedbackEClass, FEEDBACK__NAME);
    createEAttribute(feedbackEClass, FEEDBACK__MESSAGE);
    createEAttribute(feedbackEClass, FEEDBACK__IMAGE);
    createEAttribute(feedbackEClass, FEEDBACK__TYPE);
    createEAttribute(feedbackEClass, FEEDBACK__WIN);
    createEAttribute(feedbackEClass, FEEDBACK__LOSE);
    createEAttribute(feedbackEClass, FEEDBACK__END);

    evidenceModelEClass = createEClass(EVIDENCE_MODEL);
    createEReference(evidenceModelEClass, EVIDENCE_MODEL__ACTIONS);
    createEReference(evidenceModelEClass, EVIDENCE_MODEL__TIMER_ACTIONS);
    createEReference(evidenceModelEClass, EVIDENCE_MODEL__ACTION_SEQUENCE);

    actionSequencesEClass = createEClass(ACTION_SEQUENCES);
    createEReference(actionSequencesEClass, ACTION_SEQUENCES__ACTION_SEQUENCES);

    actionSequenceEClass = createEClass(ACTION_SEQUENCE);
    createEAttribute(actionSequenceEClass, ACTION_SEQUENCE__ACTION1);
    createEAttribute(actionSequenceEClass, ACTION_SEQUENCE__BEFORE);
    createEAttribute(actionSequenceEClass, ACTION_SEQUENCE__AFTER);
    createEAttribute(actionSequenceEClass, ACTION_SEQUENCE__ACTION2);
    createEReference(actionSequenceEClass, ACTION_SEQUENCE__SEQUENCE_REACTIONS);

    timerActionsEClass = createEClass(TIMER_ACTIONS);
    createEReference(timerActionsEClass, TIMER_ACTIONS__TIMER_ACTIONS);

    timerActionEClass = createEClass(TIMER_ACTION);
    createEAttribute(timerActionEClass, TIMER_ACTION__NAME);
    createEReference(timerActionEClass, TIMER_ACTION__TIMINGS);

    timingEClass = createEClass(TIMING);
    createEAttribute(timingEClass, TIMING__BEFORE);
    createEAttribute(timingEClass, TIMING__AFTER);
    createEAttribute(timingEClass, TIMING__LIMIT);
    createEReference(timingEClass, TIMING__TIMING_REACTIONS);

    actionReactionEClass = createEClass(ACTION_REACTION);
    createEReference(actionReactionEClass, ACTION_REACTION__UPDATE_SCORE);
    createEReference(actionReactionEClass, ACTION_REACTION__TRIGGER_FEEDBACK);

    updateScoreEClass = createEClass(UPDATE_SCORE);
    createEReference(updateScoreEClass, UPDATE_SCORE__OUTCOME);
    createEReference(updateScoreEClass, UPDATE_SCORE__PTS);

    triggerFeedbackEClass = createEClass(TRIGGER_FEEDBACK);
    createEReference(triggerFeedbackEClass, TRIGGER_FEEDBACK__FEEDBACK);
    createEAttribute(triggerFeedbackEClass, TRIGGER_FEEDBACK__IMMEDIATE);

    actionEClass = createEClass(ACTION);
    createEAttribute(actionEClass, ACTION__NAME);
    createEReference(actionEClass, ACTION__PARAMS);
    createEAttribute(actionEClass, ACTION__DESC);
    createEReference(actionEClass, ACTION__POINTS);
    createEReference(actionEClass, ACTION__REACTIONS);

    parameterEClass = createEClass(PARAMETER);
    createEAttribute(parameterEClass, PARAMETER__LOG_ONLY);
    createEReference(parameterEClass, PARAMETER__TYPE);
    createEAttribute(parameterEClass, PARAMETER__NAME);

    pointsEClass = createEClass(POINTS);
    createEReference(pointsEClass, POINTS__OUTCOMES_POINTS);
    createEAttribute(pointsEClass, POINTS__OTHERS);
    createEReference(pointsEClass, POINTS__PARAMS);

    outcomesPointsEClass = createEClass(OUTCOMES_POINTS);
    createEReference(outcomesPointsEClass, OUTCOMES_POINTS__OUTCOME);
    createEAttribute(outcomesPointsEClass, OUTCOMES_POINTS__RESET_VALUE);
    createEReference(outcomesPointsEClass, OUTCOMES_POINTS__PTS);
    createEReference(outcomesPointsEClass, OUTCOMES_POINTS__VAR);

    pointEClass = createEClass(POINT);
    createEAttribute(pointEClass, POINT__NEGATIVE);
    createEAttribute(pointEClass, POINT__VALUE);

    paramsEClass = createEClass(PARAMS);
    createEAttribute(paramsEClass, PARAMS__NAME);
    createEAttribute(paramsEClass, PARAMS__VALUES);

    reactionsEClass = createEClass(REACTIONS);
    createEReference(reactionsEClass, REACTIONS__REACTION);

    reactionEClass = createEClass(REACTION);
    createEReference(reactionEClass, REACTION__PARAMS_C);
    createEReference(reactionEClass, REACTION__POINTS_C);
    createEReference(reactionEClass, REACTION__FEEDBACK);
    createEAttribute(reactionEClass, REACTION__IMMEDIATE);

    paramConditionEClass = createEClass(PARAM_CONDITION);
    createEReference(paramConditionEClass, PARAM_CONDITION__PARAMS);

    pointsConditionEClass = createEClass(POINTS_CONDITION);
    createEAttribute(pointsConditionEClass, POINTS_CONDITION__KEY_WD);
    createEAttribute(pointsConditionEClass, POINTS_CONDITION__SIGN);
    createEReference(pointsConditionEClass, POINTS_CONDITION__VALUE);

    feedbackModelEClass = createEClass(FEEDBACK_MODEL);
    createEReference(feedbackModelEClass, FEEDBACK_MODEL__TRIGGERS);

    triggerEClass = createEClass(TRIGGER);
    createEReference(triggerEClass, TRIGGER__PERF);
    createEReference(triggerEClass, TRIGGER__INACTIVITY);

    outcomeValueLimitEClass = createEClass(OUTCOME_VALUE_LIMIT);
    createEReference(outcomeValueLimitEClass, OUTCOME_VALUE_LIMIT__OUTCOME);
    createEAttribute(outcomeValueLimitEClass, OUTCOME_VALUE_LIMIT__SIGN);
    createEAttribute(outcomeValueLimitEClass, OUTCOME_VALUE_LIMIT__NEGATIVE_LIMIT);
    createEAttribute(outcomeValueLimitEClass, OUTCOME_VALUE_LIMIT__LIMIT);
    createEReference(outcomeValueLimitEClass, OUTCOME_VALUE_LIMIT__TRIGGER_REACTIONS);

    inactivityLimitEClass = createEClass(INACTIVITY_LIMIT);
    createEAttribute(inactivityLimitEClass, INACTIVITY_LIMIT__SIGN);
    createEAttribute(inactivityLimitEClass, INACTIVITY_LIMIT__LIMIT);
    createEReference(inactivityLimitEClass, INACTIVITY_LIMIT__TRIGGER_REACTIONS);

    badgeModelEClass = createEClass(BADGE_MODEL);
    createEReference(badgeModelEClass, BADGE_MODEL__GENERIC_TRIGGERS);

    genericTriggerEClass = createEClass(GENERIC_TRIGGER);
    createEReference(genericTriggerEClass, GENERIC_TRIGGER__SIMPLE);
    createEReference(genericTriggerEClass, GENERIC_TRIGGER__LO);

    simpleTriggerEClass = createEClass(SIMPLE_TRIGGER);
    createEAttribute(simpleTriggerEClass, SIMPLE_TRIGGER__FUNCTION);
    createEAttribute(simpleTriggerEClass, SIMPLE_TRIGGER__SIGN);
    createEAttribute(simpleTriggerEClass, SIMPLE_TRIGGER__NEGATIVE_LIMIT);
    createEAttribute(simpleTriggerEClass, SIMPLE_TRIGGER__LIMIT);
    createEReference(simpleTriggerEClass, SIMPLE_TRIGGER__TRIGGER_REACTIONS);

    loTriggerEClass = createEClass(LO_TRIGGER);
    createEAttribute(loTriggerEClass, LO_TRIGGER__FUNCTION);
    createEReference(loTriggerEClass, LO_TRIGGER__OUTCOME);
    createEAttribute(loTriggerEClass, LO_TRIGGER__SIGN);
    createEAttribute(loTriggerEClass, LO_TRIGGER__NEGATIVE_LIMIT);
    createEAttribute(loTriggerEClass, LO_TRIGGER__LIMIT);
    createEReference(loTriggerEClass, LO_TRIGGER__TRIGGER_REACTIONS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Game(), this.getGameDescription(), null, "game", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Player(), this.getPlayerDescription(), null, "player", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_LearningOutcomes(), this.getLearningOutcomes(), null, "learningOutcomes", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_FeedbackMessages(), this.getFeedbackMessages(), null, "feedbackMessages", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_EvidenceModel(), this.getEvidenceModel(), null, "evidenceModel", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_FeedbackModel(), this.getFeedbackModel(), null, "feedbackModel", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_BadgeModel(), this.getBadgeModel(), null, "badgeModel", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_SimpleType(), ecorePackage.getEString(), "simpleType", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_EnumType(), this.getEnum(), null, "enumType", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumEClass, uws.engage.dsl.assess.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnum_EnumValues(), ecorePackage.getEString(), "enumValues", null, 0, -1, uws.engage.dsl.assess.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gameDescriptionEClass, GameDescription.class, "GameDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGameDescription_Name(), ecorePackage.getEString(), "name", null, 0, 1, GameDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGameDescription_Dev(), ecorePackage.getEInt(), "dev", null, 0, 1, GameDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGameDescription_Desc(), ecorePackage.getEString(), "desc", null, 0, 1, GameDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGameDescription_AgeRange(), this.getAge(), null, "ageRange", null, 0, 1, GameDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGameDescription_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, GameDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGameDescription_Country(), ecorePackage.getEString(), "country", null, 0, 1, GameDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGameDescription_Genre(), ecorePackage.getEString(), "genre", null, 0, 1, GameDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGameDescription_Subject(), ecorePackage.getEString(), "subject", null, 0, 1, GameDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGameDescription_Public(), ecorePackage.getEString(), "public", null, 0, 1, GameDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ageEClass, Age.class, "Age", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAge_AgeMin(), ecorePackage.getEInt(), "ageMin", null, 0, 1, Age.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAge_AgeMax(), ecorePackage.getEInt(), "ageMax", null, 0, 1, Age.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(playerDescriptionEClass, PlayerDescription.class, "PlayerDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlayerDescription_Characteristics(), this.getCharacteristic(), null, "characteristics", null, 0, -1, PlayerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(characteristicEClass, Characteristic.class, "Characteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCharacteristic_Name(), ecorePackage.getEString(), "name", null, 0, 1, Characteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCharacteristic_Type(), this.getType(), null, "type", null, 0, 1, Characteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(learningOutcomesEClass, LearningOutcomes.class, "LearningOutcomes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLearningOutcomes_Outcomes(), this.getOutcome(), null, "outcomes", null, 0, -1, LearningOutcomes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outcomeEClass, Outcome.class, "Outcome", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutcome_Name(), ecorePackage.getEString(), "name", null, 0, 1, Outcome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutcome_Desc(), ecorePackage.getEString(), "desc", null, 0, 1, Outcome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutcome_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Outcome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutcome_Type(), this.getTypeOutcome(), null, "type", null, 0, 1, Outcome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeOutcomeEClass, TypeOutcome.class, "TypeOutcome", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeOutcome_Knowledge(), ecorePackage.getEBoolean(), "knowledge", null, 0, 1, TypeOutcome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeOutcome_Skill(), ecorePackage.getEBoolean(), "skill", null, 0, 1, TypeOutcome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeOutcome_Competence(), ecorePackage.getEBoolean(), "competence", null, 0, 1, TypeOutcome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(feedbackMessagesEClass, FeedbackMessages.class, "FeedbackMessages", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeedbackMessages_FeedbackMsgs(), this.getFeedback(), null, "feedbackMsgs", null, 0, -1, FeedbackMessages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(feedbackEClass, Feedback.class, "Feedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeedback_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeedback_Message(), ecorePackage.getEString(), "message", null, 0, 1, Feedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeedback_Image(), ecorePackage.getEString(), "image", null, 0, 1, Feedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeedback_Type(), ecorePackage.getEString(), "type", null, 0, 1, Feedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeedback_Win(), ecorePackage.getEBoolean(), "win", null, 0, 1, Feedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeedback_Lose(), ecorePackage.getEBoolean(), "lose", null, 0, 1, Feedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeedback_End(), ecorePackage.getEBoolean(), "end", null, 0, 1, Feedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evidenceModelEClass, EvidenceModel.class, "EvidenceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEvidenceModel_Actions(), this.getAction(), null, "actions", null, 0, -1, EvidenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvidenceModel_TimerActions(), this.getTimerActions(), null, "timerActions", null, 0, 1, EvidenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvidenceModel_ActionSequence(), this.getActionSequences(), null, "actionSequence", null, 0, 1, EvidenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionSequencesEClass, ActionSequences.class, "ActionSequences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActionSequences_ActionSequences(), this.getActionSequence(), null, "actionSequences", null, 0, -1, ActionSequences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionSequenceEClass, ActionSequence.class, "ActionSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActionSequence_Action1(), ecorePackage.getEString(), "action1", null, 0, 1, ActionSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActionSequence_Before(), ecorePackage.getEBoolean(), "before", null, 0, 1, ActionSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActionSequence_After(), ecorePackage.getEBoolean(), "after", null, 0, 1, ActionSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActionSequence_Action2(), ecorePackage.getEString(), "action2", null, 0, 1, ActionSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActionSequence_SequenceReactions(), this.getActionReaction(), null, "sequenceReactions", null, 0, -1, ActionSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timerActionsEClass, TimerActions.class, "TimerActions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTimerActions_TimerActions(), this.getTimerAction(), null, "timerActions", null, 0, -1, TimerActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timerActionEClass, TimerAction.class, "TimerAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTimerAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, TimerAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTimerAction_Timings(), this.getTiming(), null, "timings", null, 0, -1, TimerAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timingEClass, Timing.class, "Timing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTiming_Before(), ecorePackage.getEBoolean(), "before", null, 0, 1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTiming_After(), ecorePackage.getEBoolean(), "after", null, 0, 1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTiming_Limit(), ecorePackage.getEInt(), "limit", null, 0, 1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTiming_TimingReactions(), this.getActionReaction(), null, "timingReactions", null, 0, -1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionReactionEClass, ActionReaction.class, "ActionReaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActionReaction_UpdateScore(), this.getUpdateScore(), null, "updateScore", null, 0, 1, ActionReaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActionReaction_TriggerFeedback(), this.getTriggerFeedback(), null, "triggerFeedback", null, 0, 1, ActionReaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateScoreEClass, UpdateScore.class, "UpdateScore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUpdateScore_Outcome(), this.getOutcome(), null, "outcome", null, 0, 1, UpdateScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUpdateScore_Pts(), this.getPoint(), null, "pts", null, 0, 1, UpdateScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(triggerFeedbackEClass, TriggerFeedback.class, "TriggerFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTriggerFeedback_Feedback(), this.getFeedback(), null, "feedback", null, 0, 1, TriggerFeedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTriggerFeedback_Immediate(), ecorePackage.getEBoolean(), "immediate", null, 0, 1, TriggerFeedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAction_Params(), this.getParameter(), null, "params", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAction_Desc(), ecorePackage.getEString(), "desc", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAction_Points(), this.getPoints(), null, "points", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAction_Reactions(), this.getReactions(), null, "reactions", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameter_LogOnly(), ecorePackage.getEBoolean(), "logOnly", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_Type(), this.getType(), null, "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointsEClass, Points.class, "Points", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPoints_OutcomesPoints(), this.getOutcomesPoints(), null, "outcomesPoints", null, 0, -1, Points.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPoints_Others(), ecorePackage.getEBoolean(), "others", null, 0, 1, Points.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPoints_Params(), this.getParams(), null, "params", null, 0, -1, Points.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outcomesPointsEClass, OutcomesPoints.class, "OutcomesPoints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOutcomesPoints_Outcome(), this.getOutcome(), null, "outcome", null, 0, 1, OutcomesPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutcomesPoints_ResetValue(), ecorePackage.getEBoolean(), "resetValue", null, 0, 1, OutcomesPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutcomesPoints_Pts(), this.getPoint(), null, "pts", null, 0, 1, OutcomesPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutcomesPoints_Var(), this.getParameter(), null, "var", null, 0, 1, OutcomesPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPoint_Negative(), ecorePackage.getEBoolean(), "negative", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPoint_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramsEClass, Params.class, "Params", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParams_Name(), ecorePackage.getEString(), "name", null, 0, 1, Params.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParams_Values(), ecorePackage.getEString(), "values", null, 0, -1, Params.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reactionsEClass, Reactions.class, "Reactions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReactions_Reaction(), this.getReaction(), null, "reaction", null, 0, -1, Reactions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reactionEClass, Reaction.class, "Reaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReaction_ParamsC(), this.getParamCondition(), null, "paramsC", null, 0, 1, Reaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReaction_PointsC(), this.getPointsCondition(), null, "pointsC", null, 0, 1, Reaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReaction_Feedback(), this.getFeedback(), null, "feedback", null, 0, 1, Reaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReaction_Immediate(), ecorePackage.getEBoolean(), "immediate", null, 0, 1, Reaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramConditionEClass, ParamCondition.class, "ParamCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParamCondition_Params(), this.getParams(), null, "params", null, 0, 1, ParamCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointsConditionEClass, PointsCondition.class, "PointsCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPointsCondition_KeyWd(), ecorePackage.getEString(), "keyWd", null, 0, 1, PointsCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPointsCondition_Sign(), ecorePackage.getEString(), "sign", null, 0, 1, PointsCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPointsCondition_Value(), this.getPoint(), null, "value", null, 0, 1, PointsCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(feedbackModelEClass, FeedbackModel.class, "FeedbackModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeedbackModel_Triggers(), this.getTrigger(), null, "triggers", null, 0, -1, FeedbackModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrigger_Perf(), this.getOutcomeValueLimit(), null, "perf", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrigger_Inactivity(), this.getInactivityLimit(), null, "inactivity", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outcomeValueLimitEClass, OutcomeValueLimit.class, "OutcomeValueLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOutcomeValueLimit_Outcome(), this.getOutcome(), null, "outcome", null, 0, 1, OutcomeValueLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutcomeValueLimit_Sign(), ecorePackage.getEString(), "sign", null, 0, 1, OutcomeValueLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutcomeValueLimit_NegativeLimit(), ecorePackage.getEBoolean(), "negativeLimit", null, 0, 1, OutcomeValueLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutcomeValueLimit_Limit(), ecorePackage.getEInt(), "limit", null, 0, 1, OutcomeValueLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutcomeValueLimit_TriggerReactions(), this.getTriggerFeedback(), null, "triggerReactions", null, 0, -1, OutcomeValueLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inactivityLimitEClass, InactivityLimit.class, "InactivityLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInactivityLimit_Sign(), ecorePackage.getEString(), "sign", null, 0, 1, InactivityLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInactivityLimit_Limit(), ecorePackage.getEInt(), "limit", null, 0, 1, InactivityLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInactivityLimit_TriggerReactions(), this.getActionReaction(), null, "triggerReactions", null, 0, -1, InactivityLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(badgeModelEClass, BadgeModel.class, "BadgeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBadgeModel_GenericTriggers(), this.getGenericTrigger(), null, "genericTriggers", null, 0, -1, BadgeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(genericTriggerEClass, GenericTrigger.class, "GenericTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGenericTrigger_Simple(), this.getSimpleTrigger(), null, "simple", null, 0, 1, GenericTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGenericTrigger_Lo(), this.getLOTrigger(), null, "lo", null, 0, 1, GenericTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleTriggerEClass, SimpleTrigger.class, "SimpleTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimpleTrigger_Function(), ecorePackage.getEString(), "function", null, 0, 1, SimpleTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleTrigger_Sign(), ecorePackage.getEString(), "sign", null, 0, 1, SimpleTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleTrigger_NegativeLimit(), ecorePackage.getEBoolean(), "negativeLimit", null, 0, 1, SimpleTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleTrigger_Limit(), ecorePackage.getEInt(), "limit", null, 0, 1, SimpleTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleTrigger_TriggerReactions(), this.getTriggerFeedback(), null, "triggerReactions", null, 0, -1, SimpleTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loTriggerEClass, LOTrigger.class, "LOTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLOTrigger_Function(), ecorePackage.getEString(), "function", null, 0, 1, LOTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLOTrigger_Outcome(), this.getOutcome(), null, "outcome", null, 0, 1, LOTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLOTrigger_Sign(), ecorePackage.getEString(), "sign", null, 0, 1, LOTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLOTrigger_NegativeLimit(), ecorePackage.getEBoolean(), "negativeLimit", null, 0, 1, LOTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLOTrigger_Limit(), ecorePackage.getEInt(), "limit", null, 0, 1, LOTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLOTrigger_TriggerReactions(), this.getTriggerFeedback(), null, "triggerReactions", null, 0, -1, LOTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //AssessPackageImpl
