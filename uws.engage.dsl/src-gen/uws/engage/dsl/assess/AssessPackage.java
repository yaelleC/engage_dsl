/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uws.engage.dsl.assess.AssessFactory
 * @model kind="package"
 * @generated
 */
public interface AssessPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "assess";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.engage.uws/dsl/Assess";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "assess";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AssessPackage eINSTANCE = uws.engage.dsl.assess.impl.AssessPackageImpl.init();

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.ModelImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Game</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GAME = 0;

  /**
   * The feature id for the '<em><b>Player</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PLAYER = 1;

  /**
   * The feature id for the '<em><b>Learning Outcomes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__LEARNING_OUTCOMES = 2;

  /**
   * The feature id for the '<em><b>Feedback Messages</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FEEDBACK_MESSAGES = 3;

  /**
   * The feature id for the '<em><b>Evidence Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__EVIDENCE_MODEL = 4;

  /**
   * The feature id for the '<em><b>Feedback Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FEEDBACK_MODEL = 5;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.TypeImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getType()
   * @generated
   */
  int TYPE = 1;

  /**
   * The feature id for the '<em><b>Simple Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__SIMPLE_TYPE = 0;

  /**
   * The feature id for the '<em><b>Enum Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__ENUM_TYPE = 1;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.EnumImpl <em>Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.EnumImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getEnum()
   * @generated
   */
  int ENUM = 2;

  /**
   * The feature id for the '<em><b>Enum Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__ENUM_VALUES = 0;

  /**
   * The number of structural features of the '<em>Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.GameDescriptionImpl <em>Game Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.GameDescriptionImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getGameDescription()
   * @generated
   */
  int GAME_DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_DESCRIPTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Dev</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_DESCRIPTION__DEV = 1;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_DESCRIPTION__DESC = 2;

  /**
   * The feature id for the '<em><b>Age Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_DESCRIPTION__AGE_RANGE = 3;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_DESCRIPTION__LANG = 4;

  /**
   * The feature id for the '<em><b>Country</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_DESCRIPTION__COUNTRY = 5;

  /**
   * The feature id for the '<em><b>Genre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_DESCRIPTION__GENRE = 6;

  /**
   * The feature id for the '<em><b>Subject</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_DESCRIPTION__SUBJECT = 7;

  /**
   * The feature id for the '<em><b>Public</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_DESCRIPTION__PUBLIC = 8;

  /**
   * The number of structural features of the '<em>Game Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_DESCRIPTION_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.AgeImpl <em>Age</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.AgeImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getAge()
   * @generated
   */
  int AGE = 4;

  /**
   * The feature id for the '<em><b>Age Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGE__AGE_MIN = 0;

  /**
   * The feature id for the '<em><b>Age Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGE__AGE_MAX = 1;

  /**
   * The number of structural features of the '<em>Age</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.PlayerDescriptionImpl <em>Player Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.PlayerDescriptionImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getPlayerDescription()
   * @generated
   */
  int PLAYER_DESCRIPTION = 5;

  /**
   * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER_DESCRIPTION__CHARACTERISTICS = 0;

  /**
   * The number of structural features of the '<em>Player Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER_DESCRIPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.CharacteristicImpl <em>Characteristic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.CharacteristicImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getCharacteristic()
   * @generated
   */
  int CHARACTERISTIC = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTERISTIC__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTERISTIC__TYPE = 1;

  /**
   * The number of structural features of the '<em>Characteristic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTERISTIC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.LearningOutcomesImpl <em>Learning Outcomes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.LearningOutcomesImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getLearningOutcomes()
   * @generated
   */
  int LEARNING_OUTCOMES = 7;

  /**
   * The feature id for the '<em><b>Outcomes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEARNING_OUTCOMES__OUTCOMES = 0;

  /**
   * The number of structural features of the '<em>Learning Outcomes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEARNING_OUTCOMES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.OutcomeImpl <em>Outcome</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.OutcomeImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getOutcome()
   * @generated
   */
  int OUTCOME = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTCOME__NAME = 0;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTCOME__DESC = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTCOME__VALUE = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTCOME__TYPE = 3;

  /**
   * The number of structural features of the '<em>Outcome</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTCOME_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.TypeOutcomeImpl <em>Type Outcome</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.TypeOutcomeImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getTypeOutcome()
   * @generated
   */
  int TYPE_OUTCOME = 9;

  /**
   * The feature id for the '<em><b>Knowledge</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OUTCOME__KNOWLEDGE = 0;

  /**
   * The feature id for the '<em><b>Skill</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OUTCOME__SKILL = 1;

  /**
   * The feature id for the '<em><b>Competence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OUTCOME__COMPETENCE = 2;

  /**
   * The number of structural features of the '<em>Type Outcome</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OUTCOME_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.FeedbackMessagesImpl <em>Feedback Messages</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.FeedbackMessagesImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getFeedbackMessages()
   * @generated
   */
  int FEEDBACK_MESSAGES = 10;

  /**
   * The feature id for the '<em><b>Feedback Msgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_MESSAGES__FEEDBACK_MSGS = 0;

  /**
   * The number of structural features of the '<em>Feedback Messages</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_MESSAGES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.FeedbackImpl <em>Feedback</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.FeedbackImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getFeedback()
   * @generated
   */
  int FEEDBACK = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK__NAME = 0;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK__MESSAGE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK__TYPE = 2;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK__FINAL = 3;

  /**
   * The number of structural features of the '<em>Feedback</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.EvidenceModelImpl <em>Evidence Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.EvidenceModelImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getEvidenceModel()
   * @generated
   */
  int EVIDENCE_MODEL = 12;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVIDENCE_MODEL__ACTIONS = 0;

  /**
   * The feature id for the '<em><b>Timer Actions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVIDENCE_MODEL__TIMER_ACTIONS = 1;

  /**
   * The feature id for the '<em><b>Action Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVIDENCE_MODEL__ACTION_SEQUENCE = 2;

  /**
   * The number of structural features of the '<em>Evidence Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVIDENCE_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.ActionSequencesImpl <em>Action Sequences</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.ActionSequencesImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getActionSequences()
   * @generated
   */
  int ACTION_SEQUENCES = 13;

  /**
   * The feature id for the '<em><b>Action Sequences</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SEQUENCES__ACTION_SEQUENCES = 0;

  /**
   * The number of structural features of the '<em>Action Sequences</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SEQUENCES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.ActionSequenceImpl <em>Action Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.ActionSequenceImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getActionSequence()
   * @generated
   */
  int ACTION_SEQUENCE = 14;

  /**
   * The feature id for the '<em><b>Action1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SEQUENCE__ACTION1 = 0;

  /**
   * The feature id for the '<em><b>Before</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SEQUENCE__BEFORE = 1;

  /**
   * The feature id for the '<em><b>After</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SEQUENCE__AFTER = 2;

  /**
   * The feature id for the '<em><b>Action2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SEQUENCE__ACTION2 = 3;

  /**
   * The feature id for the '<em><b>Sequence Reactions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SEQUENCE__SEQUENCE_REACTIONS = 4;

  /**
   * The number of structural features of the '<em>Action Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SEQUENCE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.TimerActionsImpl <em>Timer Actions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.TimerActionsImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getTimerActions()
   * @generated
   */
  int TIMER_ACTIONS = 15;

  /**
   * The feature id for the '<em><b>Timer Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMER_ACTIONS__TIMER_ACTIONS = 0;

  /**
   * The number of structural features of the '<em>Timer Actions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMER_ACTIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.TimerActionImpl <em>Timer Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.TimerActionImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getTimerAction()
   * @generated
   */
  int TIMER_ACTION = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMER_ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Timings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMER_ACTION__TIMINGS = 1;

  /**
   * The number of structural features of the '<em>Timer Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMER_ACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.TimingImpl <em>Timing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.TimingImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getTiming()
   * @generated
   */
  int TIMING = 17;

  /**
   * The feature id for the '<em><b>Before</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING__BEFORE = 0;

  /**
   * The feature id for the '<em><b>After</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING__AFTER = 1;

  /**
   * The feature id for the '<em><b>Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING__LIMIT = 2;

  /**
   * The feature id for the '<em><b>Timing Reactions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING__TIMING_REACTIONS = 3;

  /**
   * The number of structural features of the '<em>Timing</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.ActionReactionImpl <em>Action Reaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.ActionReactionImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getActionReaction()
   * @generated
   */
  int ACTION_REACTION = 18;

  /**
   * The feature id for the '<em><b>Update Score</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_REACTION__UPDATE_SCORE = 0;

  /**
   * The feature id for the '<em><b>Trigger Feedback</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_REACTION__TRIGGER_FEEDBACK = 1;

  /**
   * The number of structural features of the '<em>Action Reaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_REACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.UpdateScoreImpl <em>Update Score</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.UpdateScoreImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getUpdateScore()
   * @generated
   */
  int UPDATE_SCORE = 19;

  /**
   * The feature id for the '<em><b>Outcome</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_SCORE__OUTCOME = 0;

  /**
   * The feature id for the '<em><b>Pts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_SCORE__PTS = 1;

  /**
   * The number of structural features of the '<em>Update Score</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_SCORE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.TriggerFeedbackImpl <em>Trigger Feedback</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.TriggerFeedbackImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getTriggerFeedback()
   * @generated
   */
  int TRIGGER_FEEDBACK = 20;

  /**
   * The feature id for the '<em><b>Feedback</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_FEEDBACK__FEEDBACK = 0;

  /**
   * The number of structural features of the '<em>Trigger Feedback</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_FEEDBACK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.ActionImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getAction()
   * @generated
   */
  int ACTION = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Points</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__POINTS = 2;

  /**
   * The feature id for the '<em><b>Reactions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__REACTIONS = 3;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.ParameterImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 22;

  /**
   * The feature id for the '<em><b>Log Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__LOG_ONLY = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 2;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.PointsImpl <em>Points</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.PointsImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getPoints()
   * @generated
   */
  int POINTS = 23;

  /**
   * The feature id for the '<em><b>Outcome</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTS__OUTCOME = 0;

  /**
   * The feature id for the '<em><b>Reset Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTS__RESET_VALUE = 1;

  /**
   * The feature id for the '<em><b>Pts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTS__PTS = 2;

  /**
   * The feature id for the '<em><b>Others</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTS__OTHERS = 3;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTS__PARAMS = 4;

  /**
   * The number of structural features of the '<em>Points</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTS_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.PointImpl <em>Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.PointImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getPoint()
   * @generated
   */
  int POINT = 24;

  /**
   * The feature id for the '<em><b>Negative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__NEGATIVE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.ParamsImpl <em>Params</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.ParamsImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getParams()
   * @generated
   */
  int PARAMS = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMS__NAME = 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMS__VALUES = 1;

  /**
   * The number of structural features of the '<em>Params</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.ReactionsImpl <em>Reactions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.ReactionsImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getReactions()
   * @generated
   */
  int REACTIONS = 26;

  /**
   * The feature id for the '<em><b>Reaction</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTIONS__REACTION = 0;

  /**
   * The number of structural features of the '<em>Reactions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.ReactionImpl <em>Reaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.ReactionImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getReaction()
   * @generated
   */
  int REACTION = 27;

  /**
   * The feature id for the '<em><b>Params C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION__PARAMS_C = 0;

  /**
   * The feature id for the '<em><b>Points C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION__POINTS_C = 1;

  /**
   * The feature id for the '<em><b>Feedback</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION__FEEDBACK = 2;

  /**
   * The number of structural features of the '<em>Reaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.ParamConditionImpl <em>Param Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.ParamConditionImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getParamCondition()
   * @generated
   */
  int PARAM_CONDITION = 28;

  /**
   * The feature id for the '<em><b>Params</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_CONDITION__PARAMS = 0;

  /**
   * The number of structural features of the '<em>Param Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.PointsConditionImpl <em>Points Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.PointsConditionImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getPointsCondition()
   * @generated
   */
  int POINTS_CONDITION = 29;

  /**
   * The feature id for the '<em><b>Key Wd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTS_CONDITION__KEY_WD = 0;

  /**
   * The feature id for the '<em><b>Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTS_CONDITION__SIGN = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTS_CONDITION__VALUE = 2;

  /**
   * The number of structural features of the '<em>Points Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTS_CONDITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.FeedbackModelImpl <em>Feedback Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.FeedbackModelImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getFeedbackModel()
   * @generated
   */
  int FEEDBACK_MODEL = 30;

  /**
   * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_MODEL__TRIGGERS = 0;

  /**
   * The number of structural features of the '<em>Feedback Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.TriggerImpl <em>Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.TriggerImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getTrigger()
   * @generated
   */
  int TRIGGER = 31;

  /**
   * The feature id for the '<em><b>Perf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__PERF = 0;

  /**
   * The feature id for the '<em><b>Inactivity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__INACTIVITY = 1;

  /**
   * The number of structural features of the '<em>Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.OutcomeValueLimitImpl <em>Outcome Value Limit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.OutcomeValueLimitImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getOutcomeValueLimit()
   * @generated
   */
  int OUTCOME_VALUE_LIMIT = 32;

  /**
   * The feature id for the '<em><b>Outcome</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTCOME_VALUE_LIMIT__OUTCOME = 0;

  /**
   * The feature id for the '<em><b>Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTCOME_VALUE_LIMIT__SIGN = 1;

  /**
   * The feature id for the '<em><b>Negative Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTCOME_VALUE_LIMIT__NEGATIVE_LIMIT = 2;

  /**
   * The feature id for the '<em><b>Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTCOME_VALUE_LIMIT__LIMIT = 3;

  /**
   * The feature id for the '<em><b>Trigger Reactions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTCOME_VALUE_LIMIT__TRIGGER_REACTIONS = 4;

  /**
   * The number of structural features of the '<em>Outcome Value Limit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTCOME_VALUE_LIMIT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link uws.engage.dsl.assess.impl.InactivityLimitImpl <em>Inactivity Limit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.engage.dsl.assess.impl.InactivityLimitImpl
   * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getInactivityLimit()
   * @generated
   */
  int INACTIVITY_LIMIT = 33;

  /**
   * The feature id for the '<em><b>Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INACTIVITY_LIMIT__SIGN = 0;

  /**
   * The feature id for the '<em><b>Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INACTIVITY_LIMIT__LIMIT = 1;

  /**
   * The feature id for the '<em><b>Trigger Reactions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INACTIVITY_LIMIT__TRIGGER_REACTIONS = 2;

  /**
   * The number of structural features of the '<em>Inactivity Limit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INACTIVITY_LIMIT_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see uws.engage.dsl.assess.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.Model#getGame <em>Game</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Game</em>'.
   * @see uws.engage.dsl.assess.Model#getGame()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Game();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.Model#getPlayer <em>Player</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Player</em>'.
   * @see uws.engage.dsl.assess.Model#getPlayer()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Player();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.Model#getLearningOutcomes <em>Learning Outcomes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Learning Outcomes</em>'.
   * @see uws.engage.dsl.assess.Model#getLearningOutcomes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_LearningOutcomes();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.Model#getFeedbackMessages <em>Feedback Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feedback Messages</em>'.
   * @see uws.engage.dsl.assess.Model#getFeedbackMessages()
   * @see #getModel()
   * @generated
   */
  EReference getModel_FeedbackMessages();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.Model#getEvidenceModel <em>Evidence Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Evidence Model</em>'.
   * @see uws.engage.dsl.assess.Model#getEvidenceModel()
   * @see #getModel()
   * @generated
   */
  EReference getModel_EvidenceModel();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.Model#getFeedbackModel <em>Feedback Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feedback Model</em>'.
   * @see uws.engage.dsl.assess.Model#getFeedbackModel()
   * @see #getModel()
   * @generated
   */
  EReference getModel_FeedbackModel();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see uws.engage.dsl.assess.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Type#getSimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Simple Type</em>'.
   * @see uws.engage.dsl.assess.Type#getSimpleType()
   * @see #getType()
   * @generated
   */
  EAttribute getType_SimpleType();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.Type#getEnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enum Type</em>'.
   * @see uws.engage.dsl.assess.Type#getEnumType()
   * @see #getType()
   * @generated
   */
  EReference getType_EnumType();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum</em>'.
   * @see uws.engage.dsl.assess.Enum
   * @generated
   */
  EClass getEnum();

  /**
   * Returns the meta object for the attribute list '{@link uws.engage.dsl.assess.Enum#getEnumValues <em>Enum Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Enum Values</em>'.
   * @see uws.engage.dsl.assess.Enum#getEnumValues()
   * @see #getEnum()
   * @generated
   */
  EAttribute getEnum_EnumValues();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.GameDescription <em>Game Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Game Description</em>'.
   * @see uws.engage.dsl.assess.GameDescription
   * @generated
   */
  EClass getGameDescription();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.GameDescription#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uws.engage.dsl.assess.GameDescription#getName()
   * @see #getGameDescription()
   * @generated
   */
  EAttribute getGameDescription_Name();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.GameDescription#getDev <em>Dev</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dev</em>'.
   * @see uws.engage.dsl.assess.GameDescription#getDev()
   * @see #getGameDescription()
   * @generated
   */
  EAttribute getGameDescription_Dev();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.GameDescription#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see uws.engage.dsl.assess.GameDescription#getDesc()
   * @see #getGameDescription()
   * @generated
   */
  EAttribute getGameDescription_Desc();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.GameDescription#getAgeRange <em>Age Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Age Range</em>'.
   * @see uws.engage.dsl.assess.GameDescription#getAgeRange()
   * @see #getGameDescription()
   * @generated
   */
  EReference getGameDescription_AgeRange();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.GameDescription#getLang <em>Lang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lang</em>'.
   * @see uws.engage.dsl.assess.GameDescription#getLang()
   * @see #getGameDescription()
   * @generated
   */
  EAttribute getGameDescription_Lang();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.GameDescription#getCountry <em>Country</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Country</em>'.
   * @see uws.engage.dsl.assess.GameDescription#getCountry()
   * @see #getGameDescription()
   * @generated
   */
  EAttribute getGameDescription_Country();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.GameDescription#getGenre <em>Genre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Genre</em>'.
   * @see uws.engage.dsl.assess.GameDescription#getGenre()
   * @see #getGameDescription()
   * @generated
   */
  EAttribute getGameDescription_Genre();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.GameDescription#getSubject <em>Subject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Subject</em>'.
   * @see uws.engage.dsl.assess.GameDescription#getSubject()
   * @see #getGameDescription()
   * @generated
   */
  EAttribute getGameDescription_Subject();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.GameDescription#getPublic <em>Public</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Public</em>'.
   * @see uws.engage.dsl.assess.GameDescription#getPublic()
   * @see #getGameDescription()
   * @generated
   */
  EAttribute getGameDescription_Public();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.Age <em>Age</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Age</em>'.
   * @see uws.engage.dsl.assess.Age
   * @generated
   */
  EClass getAge();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Age#getAgeMin <em>Age Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Age Min</em>'.
   * @see uws.engage.dsl.assess.Age#getAgeMin()
   * @see #getAge()
   * @generated
   */
  EAttribute getAge_AgeMin();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Age#getAgeMax <em>Age Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Age Max</em>'.
   * @see uws.engage.dsl.assess.Age#getAgeMax()
   * @see #getAge()
   * @generated
   */
  EAttribute getAge_AgeMax();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.PlayerDescription <em>Player Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Player Description</em>'.
   * @see uws.engage.dsl.assess.PlayerDescription
   * @generated
   */
  EClass getPlayerDescription();

  /**
   * Returns the meta object for the containment reference list '{@link uws.engage.dsl.assess.PlayerDescription#getCharacteristics <em>Characteristics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Characteristics</em>'.
   * @see uws.engage.dsl.assess.PlayerDescription#getCharacteristics()
   * @see #getPlayerDescription()
   * @generated
   */
  EReference getPlayerDescription_Characteristics();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.Characteristic <em>Characteristic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Characteristic</em>'.
   * @see uws.engage.dsl.assess.Characteristic
   * @generated
   */
  EClass getCharacteristic();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Characteristic#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uws.engage.dsl.assess.Characteristic#getName()
   * @see #getCharacteristic()
   * @generated
   */
  EAttribute getCharacteristic_Name();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.Characteristic#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see uws.engage.dsl.assess.Characteristic#getType()
   * @see #getCharacteristic()
   * @generated
   */
  EReference getCharacteristic_Type();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.LearningOutcomes <em>Learning Outcomes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Learning Outcomes</em>'.
   * @see uws.engage.dsl.assess.LearningOutcomes
   * @generated
   */
  EClass getLearningOutcomes();

  /**
   * Returns the meta object for the containment reference list '{@link uws.engage.dsl.assess.LearningOutcomes#getOutcomes <em>Outcomes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outcomes</em>'.
   * @see uws.engage.dsl.assess.LearningOutcomes#getOutcomes()
   * @see #getLearningOutcomes()
   * @generated
   */
  EReference getLearningOutcomes_Outcomes();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.Outcome <em>Outcome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Outcome</em>'.
   * @see uws.engage.dsl.assess.Outcome
   * @generated
   */
  EClass getOutcome();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Outcome#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uws.engage.dsl.assess.Outcome#getName()
   * @see #getOutcome()
   * @generated
   */
  EAttribute getOutcome_Name();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Outcome#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see uws.engage.dsl.assess.Outcome#getDesc()
   * @see #getOutcome()
   * @generated
   */
  EAttribute getOutcome_Desc();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Outcome#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uws.engage.dsl.assess.Outcome#getValue()
   * @see #getOutcome()
   * @generated
   */
  EAttribute getOutcome_Value();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.Outcome#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see uws.engage.dsl.assess.Outcome#getType()
   * @see #getOutcome()
   * @generated
   */
  EReference getOutcome_Type();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.TypeOutcome <em>Type Outcome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Outcome</em>'.
   * @see uws.engage.dsl.assess.TypeOutcome
   * @generated
   */
  EClass getTypeOutcome();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.TypeOutcome#isKnowledge <em>Knowledge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Knowledge</em>'.
   * @see uws.engage.dsl.assess.TypeOutcome#isKnowledge()
   * @see #getTypeOutcome()
   * @generated
   */
  EAttribute getTypeOutcome_Knowledge();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.TypeOutcome#isSkill <em>Skill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Skill</em>'.
   * @see uws.engage.dsl.assess.TypeOutcome#isSkill()
   * @see #getTypeOutcome()
   * @generated
   */
  EAttribute getTypeOutcome_Skill();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.TypeOutcome#isCompetence <em>Competence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Competence</em>'.
   * @see uws.engage.dsl.assess.TypeOutcome#isCompetence()
   * @see #getTypeOutcome()
   * @generated
   */
  EAttribute getTypeOutcome_Competence();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.FeedbackMessages <em>Feedback Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feedback Messages</em>'.
   * @see uws.engage.dsl.assess.FeedbackMessages
   * @generated
   */
  EClass getFeedbackMessages();

  /**
   * Returns the meta object for the containment reference list '{@link uws.engage.dsl.assess.FeedbackMessages#getFeedbackMsgs <em>Feedback Msgs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feedback Msgs</em>'.
   * @see uws.engage.dsl.assess.FeedbackMessages#getFeedbackMsgs()
   * @see #getFeedbackMessages()
   * @generated
   */
  EReference getFeedbackMessages_FeedbackMsgs();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.Feedback <em>Feedback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feedback</em>'.
   * @see uws.engage.dsl.assess.Feedback
   * @generated
   */
  EClass getFeedback();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Feedback#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uws.engage.dsl.assess.Feedback#getName()
   * @see #getFeedback()
   * @generated
   */
  EAttribute getFeedback_Name();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Feedback#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see uws.engage.dsl.assess.Feedback#getMessage()
   * @see #getFeedback()
   * @generated
   */
  EAttribute getFeedback_Message();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Feedback#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uws.engage.dsl.assess.Feedback#getType()
   * @see #getFeedback()
   * @generated
   */
  EAttribute getFeedback_Type();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Feedback#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see uws.engage.dsl.assess.Feedback#isFinal()
   * @see #getFeedback()
   * @generated
   */
  EAttribute getFeedback_Final();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.EvidenceModel <em>Evidence Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evidence Model</em>'.
   * @see uws.engage.dsl.assess.EvidenceModel
   * @generated
   */
  EClass getEvidenceModel();

  /**
   * Returns the meta object for the containment reference list '{@link uws.engage.dsl.assess.EvidenceModel#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see uws.engage.dsl.assess.EvidenceModel#getActions()
   * @see #getEvidenceModel()
   * @generated
   */
  EReference getEvidenceModel_Actions();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.EvidenceModel#getTimerActions <em>Timer Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Timer Actions</em>'.
   * @see uws.engage.dsl.assess.EvidenceModel#getTimerActions()
   * @see #getEvidenceModel()
   * @generated
   */
  EReference getEvidenceModel_TimerActions();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.EvidenceModel#getActionSequence <em>Action Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action Sequence</em>'.
   * @see uws.engage.dsl.assess.EvidenceModel#getActionSequence()
   * @see #getEvidenceModel()
   * @generated
   */
  EReference getEvidenceModel_ActionSequence();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.ActionSequences <em>Action Sequences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Sequences</em>'.
   * @see uws.engage.dsl.assess.ActionSequences
   * @generated
   */
  EClass getActionSequences();

  /**
   * Returns the meta object for the containment reference list '{@link uws.engage.dsl.assess.ActionSequences#getActionSequences <em>Action Sequences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action Sequences</em>'.
   * @see uws.engage.dsl.assess.ActionSequences#getActionSequences()
   * @see #getActionSequences()
   * @generated
   */
  EReference getActionSequences_ActionSequences();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.ActionSequence <em>Action Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Sequence</em>'.
   * @see uws.engage.dsl.assess.ActionSequence
   * @generated
   */
  EClass getActionSequence();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.ActionSequence#getAction1 <em>Action1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action1</em>'.
   * @see uws.engage.dsl.assess.ActionSequence#getAction1()
   * @see #getActionSequence()
   * @generated
   */
  EAttribute getActionSequence_Action1();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.ActionSequence#isBefore <em>Before</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Before</em>'.
   * @see uws.engage.dsl.assess.ActionSequence#isBefore()
   * @see #getActionSequence()
   * @generated
   */
  EAttribute getActionSequence_Before();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.ActionSequence#isAfter <em>After</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>After</em>'.
   * @see uws.engage.dsl.assess.ActionSequence#isAfter()
   * @see #getActionSequence()
   * @generated
   */
  EAttribute getActionSequence_After();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.ActionSequence#getAction2 <em>Action2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action2</em>'.
   * @see uws.engage.dsl.assess.ActionSequence#getAction2()
   * @see #getActionSequence()
   * @generated
   */
  EAttribute getActionSequence_Action2();

  /**
   * Returns the meta object for the containment reference list '{@link uws.engage.dsl.assess.ActionSequence#getSequenceReactions <em>Sequence Reactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sequence Reactions</em>'.
   * @see uws.engage.dsl.assess.ActionSequence#getSequenceReactions()
   * @see #getActionSequence()
   * @generated
   */
  EReference getActionSequence_SequenceReactions();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.TimerActions <em>Timer Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timer Actions</em>'.
   * @see uws.engage.dsl.assess.TimerActions
   * @generated
   */
  EClass getTimerActions();

  /**
   * Returns the meta object for the containment reference list '{@link uws.engage.dsl.assess.TimerActions#getTimerActions <em>Timer Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Timer Actions</em>'.
   * @see uws.engage.dsl.assess.TimerActions#getTimerActions()
   * @see #getTimerActions()
   * @generated
   */
  EReference getTimerActions_TimerActions();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.TimerAction <em>Timer Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timer Action</em>'.
   * @see uws.engage.dsl.assess.TimerAction
   * @generated
   */
  EClass getTimerAction();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.TimerAction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uws.engage.dsl.assess.TimerAction#getName()
   * @see #getTimerAction()
   * @generated
   */
  EAttribute getTimerAction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uws.engage.dsl.assess.TimerAction#getTimings <em>Timings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Timings</em>'.
   * @see uws.engage.dsl.assess.TimerAction#getTimings()
   * @see #getTimerAction()
   * @generated
   */
  EReference getTimerAction_Timings();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.Timing <em>Timing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timing</em>'.
   * @see uws.engage.dsl.assess.Timing
   * @generated
   */
  EClass getTiming();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Timing#isBefore <em>Before</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Before</em>'.
   * @see uws.engage.dsl.assess.Timing#isBefore()
   * @see #getTiming()
   * @generated
   */
  EAttribute getTiming_Before();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Timing#isAfter <em>After</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>After</em>'.
   * @see uws.engage.dsl.assess.Timing#isAfter()
   * @see #getTiming()
   * @generated
   */
  EAttribute getTiming_After();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Timing#getLimit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Limit</em>'.
   * @see uws.engage.dsl.assess.Timing#getLimit()
   * @see #getTiming()
   * @generated
   */
  EAttribute getTiming_Limit();

  /**
   * Returns the meta object for the containment reference list '{@link uws.engage.dsl.assess.Timing#getTimingReactions <em>Timing Reactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Timing Reactions</em>'.
   * @see uws.engage.dsl.assess.Timing#getTimingReactions()
   * @see #getTiming()
   * @generated
   */
  EReference getTiming_TimingReactions();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.ActionReaction <em>Action Reaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Reaction</em>'.
   * @see uws.engage.dsl.assess.ActionReaction
   * @generated
   */
  EClass getActionReaction();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.ActionReaction#getUpdateScore <em>Update Score</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Update Score</em>'.
   * @see uws.engage.dsl.assess.ActionReaction#getUpdateScore()
   * @see #getActionReaction()
   * @generated
   */
  EReference getActionReaction_UpdateScore();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.ActionReaction#getTriggerFeedback <em>Trigger Feedback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trigger Feedback</em>'.
   * @see uws.engage.dsl.assess.ActionReaction#getTriggerFeedback()
   * @see #getActionReaction()
   * @generated
   */
  EReference getActionReaction_TriggerFeedback();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.UpdateScore <em>Update Score</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Score</em>'.
   * @see uws.engage.dsl.assess.UpdateScore
   * @generated
   */
  EClass getUpdateScore();

  /**
   * Returns the meta object for the reference '{@link uws.engage.dsl.assess.UpdateScore#getOutcome <em>Outcome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Outcome</em>'.
   * @see uws.engage.dsl.assess.UpdateScore#getOutcome()
   * @see #getUpdateScore()
   * @generated
   */
  EReference getUpdateScore_Outcome();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.UpdateScore#getPts <em>Pts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pts</em>'.
   * @see uws.engage.dsl.assess.UpdateScore#getPts()
   * @see #getUpdateScore()
   * @generated
   */
  EReference getUpdateScore_Pts();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.TriggerFeedback <em>Trigger Feedback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trigger Feedback</em>'.
   * @see uws.engage.dsl.assess.TriggerFeedback
   * @generated
   */
  EClass getTriggerFeedback();

  /**
   * Returns the meta object for the reference '{@link uws.engage.dsl.assess.TriggerFeedback#getFeedback <em>Feedback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feedback</em>'.
   * @see uws.engage.dsl.assess.TriggerFeedback#getFeedback()
   * @see #getTriggerFeedback()
   * @generated
   */
  EReference getTriggerFeedback_Feedback();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see uws.engage.dsl.assess.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uws.engage.dsl.assess.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uws.engage.dsl.assess.Action#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see uws.engage.dsl.assess.Action#getParams()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Params();

  /**
   * Returns the meta object for the containment reference list '{@link uws.engage.dsl.assess.Action#getPoints <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Points</em>'.
   * @see uws.engage.dsl.assess.Action#getPoints()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Points();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.Action#getReactions <em>Reactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reactions</em>'.
   * @see uws.engage.dsl.assess.Action#getReactions()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Reactions();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see uws.engage.dsl.assess.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Parameter#isLogOnly <em>Log Only</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Log Only</em>'.
   * @see uws.engage.dsl.assess.Parameter#isLogOnly()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_LogOnly();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see uws.engage.dsl.assess.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uws.engage.dsl.assess.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.Points <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Points</em>'.
   * @see uws.engage.dsl.assess.Points
   * @generated
   */
  EClass getPoints();

  /**
   * Returns the meta object for the reference '{@link uws.engage.dsl.assess.Points#getOutcome <em>Outcome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Outcome</em>'.
   * @see uws.engage.dsl.assess.Points#getOutcome()
   * @see #getPoints()
   * @generated
   */
  EReference getPoints_Outcome();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Points#isResetValue <em>Reset Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reset Value</em>'.
   * @see uws.engage.dsl.assess.Points#isResetValue()
   * @see #getPoints()
   * @generated
   */
  EAttribute getPoints_ResetValue();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.Points#getPts <em>Pts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pts</em>'.
   * @see uws.engage.dsl.assess.Points#getPts()
   * @see #getPoints()
   * @generated
   */
  EReference getPoints_Pts();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Points#isOthers <em>Others</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Others</em>'.
   * @see uws.engage.dsl.assess.Points#isOthers()
   * @see #getPoints()
   * @generated
   */
  EAttribute getPoints_Others();

  /**
   * Returns the meta object for the containment reference list '{@link uws.engage.dsl.assess.Points#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see uws.engage.dsl.assess.Points#getParams()
   * @see #getPoints()
   * @generated
   */
  EReference getPoints_Params();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point</em>'.
   * @see uws.engage.dsl.assess.Point
   * @generated
   */
  EClass getPoint();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Point#isNegative <em>Negative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Negative</em>'.
   * @see uws.engage.dsl.assess.Point#isNegative()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_Negative();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Point#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uws.engage.dsl.assess.Point#getValue()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_Value();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.Params <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Params</em>'.
   * @see uws.engage.dsl.assess.Params
   * @generated
   */
  EClass getParams();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.Params#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uws.engage.dsl.assess.Params#getName()
   * @see #getParams()
   * @generated
   */
  EAttribute getParams_Name();

  /**
   * Returns the meta object for the attribute list '{@link uws.engage.dsl.assess.Params#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see uws.engage.dsl.assess.Params#getValues()
   * @see #getParams()
   * @generated
   */
  EAttribute getParams_Values();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.Reactions <em>Reactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reactions</em>'.
   * @see uws.engage.dsl.assess.Reactions
   * @generated
   */
  EClass getReactions();

  /**
   * Returns the meta object for the containment reference list '{@link uws.engage.dsl.assess.Reactions#getReaction <em>Reaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reaction</em>'.
   * @see uws.engage.dsl.assess.Reactions#getReaction()
   * @see #getReactions()
   * @generated
   */
  EReference getReactions_Reaction();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.Reaction <em>Reaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reaction</em>'.
   * @see uws.engage.dsl.assess.Reaction
   * @generated
   */
  EClass getReaction();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.Reaction#getParamsC <em>Params C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params C</em>'.
   * @see uws.engage.dsl.assess.Reaction#getParamsC()
   * @see #getReaction()
   * @generated
   */
  EReference getReaction_ParamsC();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.Reaction#getPointsC <em>Points C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Points C</em>'.
   * @see uws.engage.dsl.assess.Reaction#getPointsC()
   * @see #getReaction()
   * @generated
   */
  EReference getReaction_PointsC();

  /**
   * Returns the meta object for the reference '{@link uws.engage.dsl.assess.Reaction#getFeedback <em>Feedback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feedback</em>'.
   * @see uws.engage.dsl.assess.Reaction#getFeedback()
   * @see #getReaction()
   * @generated
   */
  EReference getReaction_Feedback();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.ParamCondition <em>Param Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Condition</em>'.
   * @see uws.engage.dsl.assess.ParamCondition
   * @generated
   */
  EClass getParamCondition();

  /**
   * Returns the meta object for the reference '{@link uws.engage.dsl.assess.ParamCondition#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Params</em>'.
   * @see uws.engage.dsl.assess.ParamCondition#getParams()
   * @see #getParamCondition()
   * @generated
   */
  EReference getParamCondition_Params();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.PointsCondition <em>Points Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Points Condition</em>'.
   * @see uws.engage.dsl.assess.PointsCondition
   * @generated
   */
  EClass getPointsCondition();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.PointsCondition#getKeyWd <em>Key Wd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key Wd</em>'.
   * @see uws.engage.dsl.assess.PointsCondition#getKeyWd()
   * @see #getPointsCondition()
   * @generated
   */
  EAttribute getPointsCondition_KeyWd();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.PointsCondition#getSign <em>Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sign</em>'.
   * @see uws.engage.dsl.assess.PointsCondition#getSign()
   * @see #getPointsCondition()
   * @generated
   */
  EAttribute getPointsCondition_Sign();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.PointsCondition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see uws.engage.dsl.assess.PointsCondition#getValue()
   * @see #getPointsCondition()
   * @generated
   */
  EReference getPointsCondition_Value();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.FeedbackModel <em>Feedback Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feedback Model</em>'.
   * @see uws.engage.dsl.assess.FeedbackModel
   * @generated
   */
  EClass getFeedbackModel();

  /**
   * Returns the meta object for the containment reference list '{@link uws.engage.dsl.assess.FeedbackModel#getTriggers <em>Triggers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Triggers</em>'.
   * @see uws.engage.dsl.assess.FeedbackModel#getTriggers()
   * @see #getFeedbackModel()
   * @generated
   */
  EReference getFeedbackModel_Triggers();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.Trigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trigger</em>'.
   * @see uws.engage.dsl.assess.Trigger
   * @generated
   */
  EClass getTrigger();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.Trigger#getPerf <em>Perf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Perf</em>'.
   * @see uws.engage.dsl.assess.Trigger#getPerf()
   * @see #getTrigger()
   * @generated
   */
  EReference getTrigger_Perf();

  /**
   * Returns the meta object for the containment reference '{@link uws.engage.dsl.assess.Trigger#getInactivity <em>Inactivity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inactivity</em>'.
   * @see uws.engage.dsl.assess.Trigger#getInactivity()
   * @see #getTrigger()
   * @generated
   */
  EReference getTrigger_Inactivity();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.OutcomeValueLimit <em>Outcome Value Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Outcome Value Limit</em>'.
   * @see uws.engage.dsl.assess.OutcomeValueLimit
   * @generated
   */
  EClass getOutcomeValueLimit();

  /**
   * Returns the meta object for the reference '{@link uws.engage.dsl.assess.OutcomeValueLimit#getOutcome <em>Outcome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Outcome</em>'.
   * @see uws.engage.dsl.assess.OutcomeValueLimit#getOutcome()
   * @see #getOutcomeValueLimit()
   * @generated
   */
  EReference getOutcomeValueLimit_Outcome();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.OutcomeValueLimit#getSign <em>Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sign</em>'.
   * @see uws.engage.dsl.assess.OutcomeValueLimit#getSign()
   * @see #getOutcomeValueLimit()
   * @generated
   */
  EAttribute getOutcomeValueLimit_Sign();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.OutcomeValueLimit#isNegativeLimit <em>Negative Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Negative Limit</em>'.
   * @see uws.engage.dsl.assess.OutcomeValueLimit#isNegativeLimit()
   * @see #getOutcomeValueLimit()
   * @generated
   */
  EAttribute getOutcomeValueLimit_NegativeLimit();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.OutcomeValueLimit#getLimit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Limit</em>'.
   * @see uws.engage.dsl.assess.OutcomeValueLimit#getLimit()
   * @see #getOutcomeValueLimit()
   * @generated
   */
  EAttribute getOutcomeValueLimit_Limit();

  /**
   * Returns the meta object for the containment reference list '{@link uws.engage.dsl.assess.OutcomeValueLimit#getTriggerReactions <em>Trigger Reactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Trigger Reactions</em>'.
   * @see uws.engage.dsl.assess.OutcomeValueLimit#getTriggerReactions()
   * @see #getOutcomeValueLimit()
   * @generated
   */
  EReference getOutcomeValueLimit_TriggerReactions();

  /**
   * Returns the meta object for class '{@link uws.engage.dsl.assess.InactivityLimit <em>Inactivity Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inactivity Limit</em>'.
   * @see uws.engage.dsl.assess.InactivityLimit
   * @generated
   */
  EClass getInactivityLimit();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.InactivityLimit#getSign <em>Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sign</em>'.
   * @see uws.engage.dsl.assess.InactivityLimit#getSign()
   * @see #getInactivityLimit()
   * @generated
   */
  EAttribute getInactivityLimit_Sign();

  /**
   * Returns the meta object for the attribute '{@link uws.engage.dsl.assess.InactivityLimit#getLimit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Limit</em>'.
   * @see uws.engage.dsl.assess.InactivityLimit#getLimit()
   * @see #getInactivityLimit()
   * @generated
   */
  EAttribute getInactivityLimit_Limit();

  /**
   * Returns the meta object for the containment reference list '{@link uws.engage.dsl.assess.InactivityLimit#getTriggerReactions <em>Trigger Reactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Trigger Reactions</em>'.
   * @see uws.engage.dsl.assess.InactivityLimit#getTriggerReactions()
   * @see #getInactivityLimit()
   * @generated
   */
  EReference getInactivityLimit_TriggerReactions();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AssessFactory getAssessFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.ModelImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Game</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GAME = eINSTANCE.getModel_Game();

    /**
     * The meta object literal for the '<em><b>Player</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PLAYER = eINSTANCE.getModel_Player();

    /**
     * The meta object literal for the '<em><b>Learning Outcomes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__LEARNING_OUTCOMES = eINSTANCE.getModel_LearningOutcomes();

    /**
     * The meta object literal for the '<em><b>Feedback Messages</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__FEEDBACK_MESSAGES = eINSTANCE.getModel_FeedbackMessages();

    /**
     * The meta object literal for the '<em><b>Evidence Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__EVIDENCE_MODEL = eINSTANCE.getModel_EvidenceModel();

    /**
     * The meta object literal for the '<em><b>Feedback Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__FEEDBACK_MODEL = eINSTANCE.getModel_FeedbackModel();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.TypeImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Simple Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__SIMPLE_TYPE = eINSTANCE.getType_SimpleType();

    /**
     * The meta object literal for the '<em><b>Enum Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__ENUM_TYPE = eINSTANCE.getType_EnumType();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.EnumImpl <em>Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.EnumImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getEnum()
     * @generated
     */
    EClass ENUM = eINSTANCE.getEnum();

    /**
     * The meta object literal for the '<em><b>Enum Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__ENUM_VALUES = eINSTANCE.getEnum_EnumValues();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.GameDescriptionImpl <em>Game Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.GameDescriptionImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getGameDescription()
     * @generated
     */
    EClass GAME_DESCRIPTION = eINSTANCE.getGameDescription();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GAME_DESCRIPTION__NAME = eINSTANCE.getGameDescription_Name();

    /**
     * The meta object literal for the '<em><b>Dev</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GAME_DESCRIPTION__DEV = eINSTANCE.getGameDescription_Dev();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GAME_DESCRIPTION__DESC = eINSTANCE.getGameDescription_Desc();

    /**
     * The meta object literal for the '<em><b>Age Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GAME_DESCRIPTION__AGE_RANGE = eINSTANCE.getGameDescription_AgeRange();

    /**
     * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GAME_DESCRIPTION__LANG = eINSTANCE.getGameDescription_Lang();

    /**
     * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GAME_DESCRIPTION__COUNTRY = eINSTANCE.getGameDescription_Country();

    /**
     * The meta object literal for the '<em><b>Genre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GAME_DESCRIPTION__GENRE = eINSTANCE.getGameDescription_Genre();

    /**
     * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GAME_DESCRIPTION__SUBJECT = eINSTANCE.getGameDescription_Subject();

    /**
     * The meta object literal for the '<em><b>Public</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GAME_DESCRIPTION__PUBLIC = eINSTANCE.getGameDescription_Public();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.AgeImpl <em>Age</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.AgeImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getAge()
     * @generated
     */
    EClass AGE = eINSTANCE.getAge();

    /**
     * The meta object literal for the '<em><b>Age Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGE__AGE_MIN = eINSTANCE.getAge_AgeMin();

    /**
     * The meta object literal for the '<em><b>Age Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGE__AGE_MAX = eINSTANCE.getAge_AgeMax();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.PlayerDescriptionImpl <em>Player Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.PlayerDescriptionImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getPlayerDescription()
     * @generated
     */
    EClass PLAYER_DESCRIPTION = eINSTANCE.getPlayerDescription();

    /**
     * The meta object literal for the '<em><b>Characteristics</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAYER_DESCRIPTION__CHARACTERISTICS = eINSTANCE.getPlayerDescription_Characteristics();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.CharacteristicImpl <em>Characteristic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.CharacteristicImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getCharacteristic()
     * @generated
     */
    EClass CHARACTERISTIC = eINSTANCE.getCharacteristic();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARACTERISTIC__NAME = eINSTANCE.getCharacteristic_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHARACTERISTIC__TYPE = eINSTANCE.getCharacteristic_Type();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.LearningOutcomesImpl <em>Learning Outcomes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.LearningOutcomesImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getLearningOutcomes()
     * @generated
     */
    EClass LEARNING_OUTCOMES = eINSTANCE.getLearningOutcomes();

    /**
     * The meta object literal for the '<em><b>Outcomes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEARNING_OUTCOMES__OUTCOMES = eINSTANCE.getLearningOutcomes_Outcomes();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.OutcomeImpl <em>Outcome</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.OutcomeImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getOutcome()
     * @generated
     */
    EClass OUTCOME = eINSTANCE.getOutcome();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTCOME__NAME = eINSTANCE.getOutcome_Name();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTCOME__DESC = eINSTANCE.getOutcome_Desc();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTCOME__VALUE = eINSTANCE.getOutcome_Value();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTCOME__TYPE = eINSTANCE.getOutcome_Type();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.TypeOutcomeImpl <em>Type Outcome</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.TypeOutcomeImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getTypeOutcome()
     * @generated
     */
    EClass TYPE_OUTCOME = eINSTANCE.getTypeOutcome();

    /**
     * The meta object literal for the '<em><b>Knowledge</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_OUTCOME__KNOWLEDGE = eINSTANCE.getTypeOutcome_Knowledge();

    /**
     * The meta object literal for the '<em><b>Skill</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_OUTCOME__SKILL = eINSTANCE.getTypeOutcome_Skill();

    /**
     * The meta object literal for the '<em><b>Competence</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_OUTCOME__COMPETENCE = eINSTANCE.getTypeOutcome_Competence();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.FeedbackMessagesImpl <em>Feedback Messages</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.FeedbackMessagesImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getFeedbackMessages()
     * @generated
     */
    EClass FEEDBACK_MESSAGES = eINSTANCE.getFeedbackMessages();

    /**
     * The meta object literal for the '<em><b>Feedback Msgs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEEDBACK_MESSAGES__FEEDBACK_MSGS = eINSTANCE.getFeedbackMessages_FeedbackMsgs();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.FeedbackImpl <em>Feedback</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.FeedbackImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getFeedback()
     * @generated
     */
    EClass FEEDBACK = eINSTANCE.getFeedback();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEEDBACK__NAME = eINSTANCE.getFeedback_Name();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEEDBACK__MESSAGE = eINSTANCE.getFeedback_Message();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEEDBACK__TYPE = eINSTANCE.getFeedback_Type();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEEDBACK__FINAL = eINSTANCE.getFeedback_Final();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.EvidenceModelImpl <em>Evidence Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.EvidenceModelImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getEvidenceModel()
     * @generated
     */
    EClass EVIDENCE_MODEL = eINSTANCE.getEvidenceModel();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVIDENCE_MODEL__ACTIONS = eINSTANCE.getEvidenceModel_Actions();

    /**
     * The meta object literal for the '<em><b>Timer Actions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVIDENCE_MODEL__TIMER_ACTIONS = eINSTANCE.getEvidenceModel_TimerActions();

    /**
     * The meta object literal for the '<em><b>Action Sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVIDENCE_MODEL__ACTION_SEQUENCE = eINSTANCE.getEvidenceModel_ActionSequence();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.ActionSequencesImpl <em>Action Sequences</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.ActionSequencesImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getActionSequences()
     * @generated
     */
    EClass ACTION_SEQUENCES = eINSTANCE.getActionSequences();

    /**
     * The meta object literal for the '<em><b>Action Sequences</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_SEQUENCES__ACTION_SEQUENCES = eINSTANCE.getActionSequences_ActionSequences();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.ActionSequenceImpl <em>Action Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.ActionSequenceImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getActionSequence()
     * @generated
     */
    EClass ACTION_SEQUENCE = eINSTANCE.getActionSequence();

    /**
     * The meta object literal for the '<em><b>Action1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_SEQUENCE__ACTION1 = eINSTANCE.getActionSequence_Action1();

    /**
     * The meta object literal for the '<em><b>Before</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_SEQUENCE__BEFORE = eINSTANCE.getActionSequence_Before();

    /**
     * The meta object literal for the '<em><b>After</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_SEQUENCE__AFTER = eINSTANCE.getActionSequence_After();

    /**
     * The meta object literal for the '<em><b>Action2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_SEQUENCE__ACTION2 = eINSTANCE.getActionSequence_Action2();

    /**
     * The meta object literal for the '<em><b>Sequence Reactions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_SEQUENCE__SEQUENCE_REACTIONS = eINSTANCE.getActionSequence_SequenceReactions();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.TimerActionsImpl <em>Timer Actions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.TimerActionsImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getTimerActions()
     * @generated
     */
    EClass TIMER_ACTIONS = eINSTANCE.getTimerActions();

    /**
     * The meta object literal for the '<em><b>Timer Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TIMER_ACTIONS__TIMER_ACTIONS = eINSTANCE.getTimerActions_TimerActions();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.TimerActionImpl <em>Timer Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.TimerActionImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getTimerAction()
     * @generated
     */
    EClass TIMER_ACTION = eINSTANCE.getTimerAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIMER_ACTION__NAME = eINSTANCE.getTimerAction_Name();

    /**
     * The meta object literal for the '<em><b>Timings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TIMER_ACTION__TIMINGS = eINSTANCE.getTimerAction_Timings();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.TimingImpl <em>Timing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.TimingImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getTiming()
     * @generated
     */
    EClass TIMING = eINSTANCE.getTiming();

    /**
     * The meta object literal for the '<em><b>Before</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIMING__BEFORE = eINSTANCE.getTiming_Before();

    /**
     * The meta object literal for the '<em><b>After</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIMING__AFTER = eINSTANCE.getTiming_After();

    /**
     * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIMING__LIMIT = eINSTANCE.getTiming_Limit();

    /**
     * The meta object literal for the '<em><b>Timing Reactions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TIMING__TIMING_REACTIONS = eINSTANCE.getTiming_TimingReactions();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.ActionReactionImpl <em>Action Reaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.ActionReactionImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getActionReaction()
     * @generated
     */
    EClass ACTION_REACTION = eINSTANCE.getActionReaction();

    /**
     * The meta object literal for the '<em><b>Update Score</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_REACTION__UPDATE_SCORE = eINSTANCE.getActionReaction_UpdateScore();

    /**
     * The meta object literal for the '<em><b>Trigger Feedback</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_REACTION__TRIGGER_FEEDBACK = eINSTANCE.getActionReaction_TriggerFeedback();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.UpdateScoreImpl <em>Update Score</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.UpdateScoreImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getUpdateScore()
     * @generated
     */
    EClass UPDATE_SCORE = eINSTANCE.getUpdateScore();

    /**
     * The meta object literal for the '<em><b>Outcome</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_SCORE__OUTCOME = eINSTANCE.getUpdateScore_Outcome();

    /**
     * The meta object literal for the '<em><b>Pts</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_SCORE__PTS = eINSTANCE.getUpdateScore_Pts();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.TriggerFeedbackImpl <em>Trigger Feedback</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.TriggerFeedbackImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getTriggerFeedback()
     * @generated
     */
    EClass TRIGGER_FEEDBACK = eINSTANCE.getTriggerFeedback();

    /**
     * The meta object literal for the '<em><b>Feedback</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIGGER_FEEDBACK__FEEDBACK = eINSTANCE.getTriggerFeedback_Feedback();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.ActionImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__PARAMS = eINSTANCE.getAction_Params();

    /**
     * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__POINTS = eINSTANCE.getAction_Points();

    /**
     * The meta object literal for the '<em><b>Reactions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__REACTIONS = eINSTANCE.getAction_Reactions();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.ParameterImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Log Only</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__LOG_ONLY = eINSTANCE.getParameter_LogOnly();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.PointsImpl <em>Points</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.PointsImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getPoints()
     * @generated
     */
    EClass POINTS = eINSTANCE.getPoints();

    /**
     * The meta object literal for the '<em><b>Outcome</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINTS__OUTCOME = eINSTANCE.getPoints_Outcome();

    /**
     * The meta object literal for the '<em><b>Reset Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINTS__RESET_VALUE = eINSTANCE.getPoints_ResetValue();

    /**
     * The meta object literal for the '<em><b>Pts</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINTS__PTS = eINSTANCE.getPoints_Pts();

    /**
     * The meta object literal for the '<em><b>Others</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINTS__OTHERS = eINSTANCE.getPoints_Others();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINTS__PARAMS = eINSTANCE.getPoints_Params();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.PointImpl <em>Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.PointImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getPoint()
     * @generated
     */
    EClass POINT = eINSTANCE.getPoint();

    /**
     * The meta object literal for the '<em><b>Negative</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__NEGATIVE = eINSTANCE.getPoint_Negative();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__VALUE = eINSTANCE.getPoint_Value();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.ParamsImpl <em>Params</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.ParamsImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getParams()
     * @generated
     */
    EClass PARAMS = eINSTANCE.getParams();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMS__NAME = eINSTANCE.getParams_Name();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMS__VALUES = eINSTANCE.getParams_Values();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.ReactionsImpl <em>Reactions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.ReactionsImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getReactions()
     * @generated
     */
    EClass REACTIONS = eINSTANCE.getReactions();

    /**
     * The meta object literal for the '<em><b>Reaction</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REACTIONS__REACTION = eINSTANCE.getReactions_Reaction();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.ReactionImpl <em>Reaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.ReactionImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getReaction()
     * @generated
     */
    EClass REACTION = eINSTANCE.getReaction();

    /**
     * The meta object literal for the '<em><b>Params C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REACTION__PARAMS_C = eINSTANCE.getReaction_ParamsC();

    /**
     * The meta object literal for the '<em><b>Points C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REACTION__POINTS_C = eINSTANCE.getReaction_PointsC();

    /**
     * The meta object literal for the '<em><b>Feedback</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REACTION__FEEDBACK = eINSTANCE.getReaction_Feedback();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.ParamConditionImpl <em>Param Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.ParamConditionImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getParamCondition()
     * @generated
     */
    EClass PARAM_CONDITION = eINSTANCE.getParamCondition();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM_CONDITION__PARAMS = eINSTANCE.getParamCondition_Params();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.PointsConditionImpl <em>Points Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.PointsConditionImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getPointsCondition()
     * @generated
     */
    EClass POINTS_CONDITION = eINSTANCE.getPointsCondition();

    /**
     * The meta object literal for the '<em><b>Key Wd</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINTS_CONDITION__KEY_WD = eINSTANCE.getPointsCondition_KeyWd();

    /**
     * The meta object literal for the '<em><b>Sign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINTS_CONDITION__SIGN = eINSTANCE.getPointsCondition_Sign();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINTS_CONDITION__VALUE = eINSTANCE.getPointsCondition_Value();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.FeedbackModelImpl <em>Feedback Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.FeedbackModelImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getFeedbackModel()
     * @generated
     */
    EClass FEEDBACK_MODEL = eINSTANCE.getFeedbackModel();

    /**
     * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEEDBACK_MODEL__TRIGGERS = eINSTANCE.getFeedbackModel_Triggers();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.TriggerImpl <em>Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.TriggerImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getTrigger()
     * @generated
     */
    EClass TRIGGER = eINSTANCE.getTrigger();

    /**
     * The meta object literal for the '<em><b>Perf</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIGGER__PERF = eINSTANCE.getTrigger_Perf();

    /**
     * The meta object literal for the '<em><b>Inactivity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIGGER__INACTIVITY = eINSTANCE.getTrigger_Inactivity();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.OutcomeValueLimitImpl <em>Outcome Value Limit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.OutcomeValueLimitImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getOutcomeValueLimit()
     * @generated
     */
    EClass OUTCOME_VALUE_LIMIT = eINSTANCE.getOutcomeValueLimit();

    /**
     * The meta object literal for the '<em><b>Outcome</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTCOME_VALUE_LIMIT__OUTCOME = eINSTANCE.getOutcomeValueLimit_Outcome();

    /**
     * The meta object literal for the '<em><b>Sign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTCOME_VALUE_LIMIT__SIGN = eINSTANCE.getOutcomeValueLimit_Sign();

    /**
     * The meta object literal for the '<em><b>Negative Limit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTCOME_VALUE_LIMIT__NEGATIVE_LIMIT = eINSTANCE.getOutcomeValueLimit_NegativeLimit();

    /**
     * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTCOME_VALUE_LIMIT__LIMIT = eINSTANCE.getOutcomeValueLimit_Limit();

    /**
     * The meta object literal for the '<em><b>Trigger Reactions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTCOME_VALUE_LIMIT__TRIGGER_REACTIONS = eINSTANCE.getOutcomeValueLimit_TriggerReactions();

    /**
     * The meta object literal for the '{@link uws.engage.dsl.assess.impl.InactivityLimitImpl <em>Inactivity Limit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.engage.dsl.assess.impl.InactivityLimitImpl
     * @see uws.engage.dsl.assess.impl.AssessPackageImpl#getInactivityLimit()
     * @generated
     */
    EClass INACTIVITY_LIMIT = eINSTANCE.getInactivityLimit();

    /**
     * The meta object literal for the '<em><b>Sign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INACTIVITY_LIMIT__SIGN = eINSTANCE.getInactivityLimit_Sign();

    /**
     * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INACTIVITY_LIMIT__LIMIT = eINSTANCE.getInactivityLimit_Limit();

    /**
     * The meta object literal for the '<em><b>Trigger Reactions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INACTIVITY_LIMIT__TRIGGER_REACTIONS = eINSTANCE.getInactivityLimit_TriggerReactions();

  }

} //AssessPackage
