/**
 */
package uws.chaudy.engage;

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
 * @see uws.chaudy.engage.EngageFactory
 * @model kind="package"
 * @generated
 */
public interface EngagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "engage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.chaudy.uws/Engage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "engage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EngagePackage eINSTANCE = uws.chaudy.engage.impl.EngagePackageImpl.init();

  /**
   * The meta object id for the '{@link uws.chaudy.engage.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.ModelImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getModel()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.TypeImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getType()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.EnumImpl <em>Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.EnumImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getEnum()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.GameDescriptionImpl <em>Game Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.GameDescriptionImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getGameDescription()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.AgeImpl <em>Age</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.AgeImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getAge()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.PlayerDescriptionImpl <em>Player Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.PlayerDescriptionImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getPlayerDescription()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.CharacteristicImpl <em>Characteristic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.CharacteristicImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getCharacteristic()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.LearningOutcomesImpl <em>Learning Outcomes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.LearningOutcomesImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getLearningOutcomes()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.OutcomeImpl <em>Outcome</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.OutcomeImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getOutcome()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.TypeOutcomeImpl <em>Type Outcome</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.TypeOutcomeImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getTypeOutcome()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.FeedbackMessagesImpl <em>Feedback Messages</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.FeedbackMessagesImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getFeedbackMessages()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.FeedbackImpl <em>Feedback</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.FeedbackImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getFeedback()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.EvidenceModelImpl <em>Evidence Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.EvidenceModelImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getEvidenceModel()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.ActionSequencesImpl <em>Action Sequences</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.ActionSequencesImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getActionSequences()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.ActionSequenceImpl <em>Action Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.ActionSequenceImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getActionSequence()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.TimerActionsImpl <em>Timer Actions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.TimerActionsImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getTimerActions()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.TimerActionImpl <em>Timer Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.TimerActionImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getTimerAction()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.TimingImpl <em>Timing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.TimingImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getTiming()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.ActionReactionImpl <em>Action Reaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.ActionReactionImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getActionReaction()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.UpdateScoreImpl <em>Update Score</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.UpdateScoreImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getUpdateScore()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.TriggerFeedbackImpl <em>Trigger Feedback</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.TriggerFeedbackImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getTriggerFeedback()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.ActionImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getAction()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.ParameterImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 22;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uws.chaudy.engage.impl.PointsImpl <em>Points</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.PointsImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getPoints()
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
   * The feature id for the '<em><b>Pts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTS__PTS = 1;

  /**
   * The feature id for the '<em><b>Others</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTS__OTHERS = 2;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTS__PARAMS = 3;

  /**
   * The number of structural features of the '<em>Points</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uws.chaudy.engage.impl.PointImpl <em>Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.PointImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getPoint()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.ParamsImpl <em>Params</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.ParamsImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getParams()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.ReactionsImpl <em>Reactions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.ReactionsImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getReactions()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.ReactionImpl <em>Reaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.ReactionImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getReaction()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.ParamConditionImpl <em>Param Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.ParamConditionImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getParamCondition()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.PointsConditionImpl <em>Points Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.PointsConditionImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getPointsCondition()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.FeedbackModelImpl <em>Feedback Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.FeedbackModelImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getFeedbackModel()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.TriggerImpl <em>Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.TriggerImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getTrigger()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.OutcomeValueLimitImpl <em>Outcome Value Limit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.OutcomeValueLimitImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getOutcomeValueLimit()
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
   * The meta object id for the '{@link uws.chaudy.engage.impl.InactivityLimitImpl <em>Inactivity Limit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uws.chaudy.engage.impl.InactivityLimitImpl
   * @see uws.chaudy.engage.impl.EngagePackageImpl#getInactivityLimit()
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
   * Returns the meta object for class '{@link uws.chaudy.engage.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see uws.chaudy.engage.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.Model#getGame <em>Game</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Game</em>'.
   * @see uws.chaudy.engage.Model#getGame()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Game();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.Model#getPlayer <em>Player</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Player</em>'.
   * @see uws.chaudy.engage.Model#getPlayer()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Player();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.Model#getLearningOutcomes <em>Learning Outcomes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Learning Outcomes</em>'.
   * @see uws.chaudy.engage.Model#getLearningOutcomes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_LearningOutcomes();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.Model#getFeedbackMessages <em>Feedback Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feedback Messages</em>'.
   * @see uws.chaudy.engage.Model#getFeedbackMessages()
   * @see #getModel()
   * @generated
   */
  EReference getModel_FeedbackMessages();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.Model#getEvidenceModel <em>Evidence Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Evidence Model</em>'.
   * @see uws.chaudy.engage.Model#getEvidenceModel()
   * @see #getModel()
   * @generated
   */
  EReference getModel_EvidenceModel();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.Model#getFeedbackModel <em>Feedback Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feedback Model</em>'.
   * @see uws.chaudy.engage.Model#getFeedbackModel()
   * @see #getModel()
   * @generated
   */
  EReference getModel_FeedbackModel();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see uws.chaudy.engage.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.Type#getSimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Simple Type</em>'.
   * @see uws.chaudy.engage.Type#getSimpleType()
   * @see #getType()
   * @generated
   */
  EAttribute getType_SimpleType();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.Type#getEnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enum Type</em>'.
   * @see uws.chaudy.engage.Type#getEnumType()
   * @see #getType()
   * @generated
   */
  EReference getType_EnumType();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum</em>'.
   * @see uws.chaudy.engage.Enum
   * @generated
   */
  EClass getEnum();

  /**
   * Returns the meta object for the attribute list '{@link uws.chaudy.engage.Enum#getEnumValues <em>Enum Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Enum Values</em>'.
   * @see uws.chaudy.engage.Enum#getEnumValues()
   * @see #getEnum()
   * @generated
   */
  EAttribute getEnum_EnumValues();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.GameDescription <em>Game Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Game Description</em>'.
   * @see uws.chaudy.engage.GameDescription
   * @generated
   */
  EClass getGameDescription();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.GameDescription#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uws.chaudy.engage.GameDescription#getName()
   * @see #getGameDescription()
   * @generated
   */
  EAttribute getGameDescription_Name();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.GameDescription#getDev <em>Dev</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dev</em>'.
   * @see uws.chaudy.engage.GameDescription#getDev()
   * @see #getGameDescription()
   * @generated
   */
  EAttribute getGameDescription_Dev();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.GameDescription#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see uws.chaudy.engage.GameDescription#getDesc()
   * @see #getGameDescription()
   * @generated
   */
  EAttribute getGameDescription_Desc();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.GameDescription#getAgeRange <em>Age Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Age Range</em>'.
   * @see uws.chaudy.engage.GameDescription#getAgeRange()
   * @see #getGameDescription()
   * @generated
   */
  EReference getGameDescription_AgeRange();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.GameDescription#getLang <em>Lang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lang</em>'.
   * @see uws.chaudy.engage.GameDescription#getLang()
   * @see #getGameDescription()
   * @generated
   */
  EAttribute getGameDescription_Lang();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.GameDescription#getCountry <em>Country</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Country</em>'.
   * @see uws.chaudy.engage.GameDescription#getCountry()
   * @see #getGameDescription()
   * @generated
   */
  EAttribute getGameDescription_Country();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.GameDescription#getGenre <em>Genre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Genre</em>'.
   * @see uws.chaudy.engage.GameDescription#getGenre()
   * @see #getGameDescription()
   * @generated
   */
  EAttribute getGameDescription_Genre();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.GameDescription#getSubject <em>Subject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Subject</em>'.
   * @see uws.chaudy.engage.GameDescription#getSubject()
   * @see #getGameDescription()
   * @generated
   */
  EAttribute getGameDescription_Subject();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.GameDescription#getPublic <em>Public</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Public</em>'.
   * @see uws.chaudy.engage.GameDescription#getPublic()
   * @see #getGameDescription()
   * @generated
   */
  EAttribute getGameDescription_Public();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.Age <em>Age</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Age</em>'.
   * @see uws.chaudy.engage.Age
   * @generated
   */
  EClass getAge();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.Age#getAgeMin <em>Age Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Age Min</em>'.
   * @see uws.chaudy.engage.Age#getAgeMin()
   * @see #getAge()
   * @generated
   */
  EAttribute getAge_AgeMin();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.Age#getAgeMax <em>Age Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Age Max</em>'.
   * @see uws.chaudy.engage.Age#getAgeMax()
   * @see #getAge()
   * @generated
   */
  EAttribute getAge_AgeMax();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.PlayerDescription <em>Player Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Player Description</em>'.
   * @see uws.chaudy.engage.PlayerDescription
   * @generated
   */
  EClass getPlayerDescription();

  /**
   * Returns the meta object for the containment reference list '{@link uws.chaudy.engage.PlayerDescription#getCharacteristics <em>Characteristics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Characteristics</em>'.
   * @see uws.chaudy.engage.PlayerDescription#getCharacteristics()
   * @see #getPlayerDescription()
   * @generated
   */
  EReference getPlayerDescription_Characteristics();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.Characteristic <em>Characteristic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Characteristic</em>'.
   * @see uws.chaudy.engage.Characteristic
   * @generated
   */
  EClass getCharacteristic();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.Characteristic#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uws.chaudy.engage.Characteristic#getName()
   * @see #getCharacteristic()
   * @generated
   */
  EAttribute getCharacteristic_Name();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.Characteristic#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see uws.chaudy.engage.Characteristic#getType()
   * @see #getCharacteristic()
   * @generated
   */
  EReference getCharacteristic_Type();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.LearningOutcomes <em>Learning Outcomes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Learning Outcomes</em>'.
   * @see uws.chaudy.engage.LearningOutcomes
   * @generated
   */
  EClass getLearningOutcomes();

  /**
   * Returns the meta object for the containment reference list '{@link uws.chaudy.engage.LearningOutcomes#getOutcomes <em>Outcomes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outcomes</em>'.
   * @see uws.chaudy.engage.LearningOutcomes#getOutcomes()
   * @see #getLearningOutcomes()
   * @generated
   */
  EReference getLearningOutcomes_Outcomes();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.Outcome <em>Outcome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Outcome</em>'.
   * @see uws.chaudy.engage.Outcome
   * @generated
   */
  EClass getOutcome();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.Outcome#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uws.chaudy.engage.Outcome#getName()
   * @see #getOutcome()
   * @generated
   */
  EAttribute getOutcome_Name();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.Outcome#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see uws.chaudy.engage.Outcome#getDesc()
   * @see #getOutcome()
   * @generated
   */
  EAttribute getOutcome_Desc();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.Outcome#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uws.chaudy.engage.Outcome#getValue()
   * @see #getOutcome()
   * @generated
   */
  EAttribute getOutcome_Value();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.Outcome#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see uws.chaudy.engage.Outcome#getType()
   * @see #getOutcome()
   * @generated
   */
  EReference getOutcome_Type();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.TypeOutcome <em>Type Outcome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Outcome</em>'.
   * @see uws.chaudy.engage.TypeOutcome
   * @generated
   */
  EClass getTypeOutcome();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.TypeOutcome#isKnowledge <em>Knowledge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Knowledge</em>'.
   * @see uws.chaudy.engage.TypeOutcome#isKnowledge()
   * @see #getTypeOutcome()
   * @generated
   */
  EAttribute getTypeOutcome_Knowledge();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.TypeOutcome#isSkill <em>Skill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Skill</em>'.
   * @see uws.chaudy.engage.TypeOutcome#isSkill()
   * @see #getTypeOutcome()
   * @generated
   */
  EAttribute getTypeOutcome_Skill();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.TypeOutcome#isCompetence <em>Competence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Competence</em>'.
   * @see uws.chaudy.engage.TypeOutcome#isCompetence()
   * @see #getTypeOutcome()
   * @generated
   */
  EAttribute getTypeOutcome_Competence();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.FeedbackMessages <em>Feedback Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feedback Messages</em>'.
   * @see uws.chaudy.engage.FeedbackMessages
   * @generated
   */
  EClass getFeedbackMessages();

  /**
   * Returns the meta object for the containment reference list '{@link uws.chaudy.engage.FeedbackMessages#getFeedbackMsgs <em>Feedback Msgs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feedback Msgs</em>'.
   * @see uws.chaudy.engage.FeedbackMessages#getFeedbackMsgs()
   * @see #getFeedbackMessages()
   * @generated
   */
  EReference getFeedbackMessages_FeedbackMsgs();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.Feedback <em>Feedback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feedback</em>'.
   * @see uws.chaudy.engage.Feedback
   * @generated
   */
  EClass getFeedback();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.Feedback#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uws.chaudy.engage.Feedback#getName()
   * @see #getFeedback()
   * @generated
   */
  EAttribute getFeedback_Name();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.Feedback#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see uws.chaudy.engage.Feedback#getMessage()
   * @see #getFeedback()
   * @generated
   */
  EAttribute getFeedback_Message();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.Feedback#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uws.chaudy.engage.Feedback#getType()
   * @see #getFeedback()
   * @generated
   */
  EAttribute getFeedback_Type();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.Feedback#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see uws.chaudy.engage.Feedback#isFinal()
   * @see #getFeedback()
   * @generated
   */
  EAttribute getFeedback_Final();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.EvidenceModel <em>Evidence Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evidence Model</em>'.
   * @see uws.chaudy.engage.EvidenceModel
   * @generated
   */
  EClass getEvidenceModel();

  /**
   * Returns the meta object for the containment reference list '{@link uws.chaudy.engage.EvidenceModel#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see uws.chaudy.engage.EvidenceModel#getActions()
   * @see #getEvidenceModel()
   * @generated
   */
  EReference getEvidenceModel_Actions();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.EvidenceModel#getTimerActions <em>Timer Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Timer Actions</em>'.
   * @see uws.chaudy.engage.EvidenceModel#getTimerActions()
   * @see #getEvidenceModel()
   * @generated
   */
  EReference getEvidenceModel_TimerActions();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.EvidenceModel#getActionSequence <em>Action Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action Sequence</em>'.
   * @see uws.chaudy.engage.EvidenceModel#getActionSequence()
   * @see #getEvidenceModel()
   * @generated
   */
  EReference getEvidenceModel_ActionSequence();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.ActionSequences <em>Action Sequences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Sequences</em>'.
   * @see uws.chaudy.engage.ActionSequences
   * @generated
   */
  EClass getActionSequences();

  /**
   * Returns the meta object for the containment reference list '{@link uws.chaudy.engage.ActionSequences#getActionSequences <em>Action Sequences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action Sequences</em>'.
   * @see uws.chaudy.engage.ActionSequences#getActionSequences()
   * @see #getActionSequences()
   * @generated
   */
  EReference getActionSequences_ActionSequences();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.ActionSequence <em>Action Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Sequence</em>'.
   * @see uws.chaudy.engage.ActionSequence
   * @generated
   */
  EClass getActionSequence();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.ActionSequence#getAction1 <em>Action1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action1</em>'.
   * @see uws.chaudy.engage.ActionSequence#getAction1()
   * @see #getActionSequence()
   * @generated
   */
  EAttribute getActionSequence_Action1();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.ActionSequence#isBefore <em>Before</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Before</em>'.
   * @see uws.chaudy.engage.ActionSequence#isBefore()
   * @see #getActionSequence()
   * @generated
   */
  EAttribute getActionSequence_Before();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.ActionSequence#isAfter <em>After</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>After</em>'.
   * @see uws.chaudy.engage.ActionSequence#isAfter()
   * @see #getActionSequence()
   * @generated
   */
  EAttribute getActionSequence_After();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.ActionSequence#getAction2 <em>Action2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action2</em>'.
   * @see uws.chaudy.engage.ActionSequence#getAction2()
   * @see #getActionSequence()
   * @generated
   */
  EAttribute getActionSequence_Action2();

  /**
   * Returns the meta object for the containment reference list '{@link uws.chaudy.engage.ActionSequence#getSequenceReactions <em>Sequence Reactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sequence Reactions</em>'.
   * @see uws.chaudy.engage.ActionSequence#getSequenceReactions()
   * @see #getActionSequence()
   * @generated
   */
  EReference getActionSequence_SequenceReactions();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.TimerActions <em>Timer Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timer Actions</em>'.
   * @see uws.chaudy.engage.TimerActions
   * @generated
   */
  EClass getTimerActions();

  /**
   * Returns the meta object for the containment reference list '{@link uws.chaudy.engage.TimerActions#getTimerActions <em>Timer Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Timer Actions</em>'.
   * @see uws.chaudy.engage.TimerActions#getTimerActions()
   * @see #getTimerActions()
   * @generated
   */
  EReference getTimerActions_TimerActions();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.TimerAction <em>Timer Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timer Action</em>'.
   * @see uws.chaudy.engage.TimerAction
   * @generated
   */
  EClass getTimerAction();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.TimerAction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uws.chaudy.engage.TimerAction#getName()
   * @see #getTimerAction()
   * @generated
   */
  EAttribute getTimerAction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uws.chaudy.engage.TimerAction#getTimings <em>Timings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Timings</em>'.
   * @see uws.chaudy.engage.TimerAction#getTimings()
   * @see #getTimerAction()
   * @generated
   */
  EReference getTimerAction_Timings();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.Timing <em>Timing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timing</em>'.
   * @see uws.chaudy.engage.Timing
   * @generated
   */
  EClass getTiming();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.Timing#isBefore <em>Before</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Before</em>'.
   * @see uws.chaudy.engage.Timing#isBefore()
   * @see #getTiming()
   * @generated
   */
  EAttribute getTiming_Before();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.Timing#isAfter <em>After</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>After</em>'.
   * @see uws.chaudy.engage.Timing#isAfter()
   * @see #getTiming()
   * @generated
   */
  EAttribute getTiming_After();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.Timing#getLimit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Limit</em>'.
   * @see uws.chaudy.engage.Timing#getLimit()
   * @see #getTiming()
   * @generated
   */
  EAttribute getTiming_Limit();

  /**
   * Returns the meta object for the containment reference list '{@link uws.chaudy.engage.Timing#getTimingReactions <em>Timing Reactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Timing Reactions</em>'.
   * @see uws.chaudy.engage.Timing#getTimingReactions()
   * @see #getTiming()
   * @generated
   */
  EReference getTiming_TimingReactions();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.ActionReaction <em>Action Reaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Reaction</em>'.
   * @see uws.chaudy.engage.ActionReaction
   * @generated
   */
  EClass getActionReaction();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.ActionReaction#getUpdateScore <em>Update Score</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Update Score</em>'.
   * @see uws.chaudy.engage.ActionReaction#getUpdateScore()
   * @see #getActionReaction()
   * @generated
   */
  EReference getActionReaction_UpdateScore();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.ActionReaction#getTriggerFeedback <em>Trigger Feedback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trigger Feedback</em>'.
   * @see uws.chaudy.engage.ActionReaction#getTriggerFeedback()
   * @see #getActionReaction()
   * @generated
   */
  EReference getActionReaction_TriggerFeedback();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.UpdateScore <em>Update Score</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Score</em>'.
   * @see uws.chaudy.engage.UpdateScore
   * @generated
   */
  EClass getUpdateScore();

  /**
   * Returns the meta object for the reference '{@link uws.chaudy.engage.UpdateScore#getOutcome <em>Outcome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Outcome</em>'.
   * @see uws.chaudy.engage.UpdateScore#getOutcome()
   * @see #getUpdateScore()
   * @generated
   */
  EReference getUpdateScore_Outcome();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.UpdateScore#getPts <em>Pts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pts</em>'.
   * @see uws.chaudy.engage.UpdateScore#getPts()
   * @see #getUpdateScore()
   * @generated
   */
  EReference getUpdateScore_Pts();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.TriggerFeedback <em>Trigger Feedback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trigger Feedback</em>'.
   * @see uws.chaudy.engage.TriggerFeedback
   * @generated
   */
  EClass getTriggerFeedback();

  /**
   * Returns the meta object for the reference '{@link uws.chaudy.engage.TriggerFeedback#getFeedback <em>Feedback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feedback</em>'.
   * @see uws.chaudy.engage.TriggerFeedback#getFeedback()
   * @see #getTriggerFeedback()
   * @generated
   */
  EReference getTriggerFeedback_Feedback();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see uws.chaudy.engage.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uws.chaudy.engage.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uws.chaudy.engage.Action#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see uws.chaudy.engage.Action#getParams()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Params();

  /**
   * Returns the meta object for the containment reference list '{@link uws.chaudy.engage.Action#getPoints <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Points</em>'.
   * @see uws.chaudy.engage.Action#getPoints()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Points();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.Action#getReactions <em>Reactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reactions</em>'.
   * @see uws.chaudy.engage.Action#getReactions()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Reactions();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see uws.chaudy.engage.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see uws.chaudy.engage.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uws.chaudy.engage.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.Points <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Points</em>'.
   * @see uws.chaudy.engage.Points
   * @generated
   */
  EClass getPoints();

  /**
   * Returns the meta object for the reference '{@link uws.chaudy.engage.Points#getOutcome <em>Outcome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Outcome</em>'.
   * @see uws.chaudy.engage.Points#getOutcome()
   * @see #getPoints()
   * @generated
   */
  EReference getPoints_Outcome();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.Points#getPts <em>Pts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pts</em>'.
   * @see uws.chaudy.engage.Points#getPts()
   * @see #getPoints()
   * @generated
   */
  EReference getPoints_Pts();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.Points#isOthers <em>Others</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Others</em>'.
   * @see uws.chaudy.engage.Points#isOthers()
   * @see #getPoints()
   * @generated
   */
  EAttribute getPoints_Others();

  /**
   * Returns the meta object for the containment reference list '{@link uws.chaudy.engage.Points#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see uws.chaudy.engage.Points#getParams()
   * @see #getPoints()
   * @generated
   */
  EReference getPoints_Params();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point</em>'.
   * @see uws.chaudy.engage.Point
   * @generated
   */
  EClass getPoint();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.Point#isNegative <em>Negative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Negative</em>'.
   * @see uws.chaudy.engage.Point#isNegative()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_Negative();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.Point#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uws.chaudy.engage.Point#getValue()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_Value();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.Params <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Params</em>'.
   * @see uws.chaudy.engage.Params
   * @generated
   */
  EClass getParams();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.Params#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uws.chaudy.engage.Params#getName()
   * @see #getParams()
   * @generated
   */
  EAttribute getParams_Name();

  /**
   * Returns the meta object for the attribute list '{@link uws.chaudy.engage.Params#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see uws.chaudy.engage.Params#getValues()
   * @see #getParams()
   * @generated
   */
  EAttribute getParams_Values();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.Reactions <em>Reactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reactions</em>'.
   * @see uws.chaudy.engage.Reactions
   * @generated
   */
  EClass getReactions();

  /**
   * Returns the meta object for the containment reference list '{@link uws.chaudy.engage.Reactions#getReaction <em>Reaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reaction</em>'.
   * @see uws.chaudy.engage.Reactions#getReaction()
   * @see #getReactions()
   * @generated
   */
  EReference getReactions_Reaction();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.Reaction <em>Reaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reaction</em>'.
   * @see uws.chaudy.engage.Reaction
   * @generated
   */
  EClass getReaction();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.Reaction#getParamsC <em>Params C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params C</em>'.
   * @see uws.chaudy.engage.Reaction#getParamsC()
   * @see #getReaction()
   * @generated
   */
  EReference getReaction_ParamsC();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.Reaction#getPointsC <em>Points C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Points C</em>'.
   * @see uws.chaudy.engage.Reaction#getPointsC()
   * @see #getReaction()
   * @generated
   */
  EReference getReaction_PointsC();

  /**
   * Returns the meta object for the reference '{@link uws.chaudy.engage.Reaction#getFeedback <em>Feedback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feedback</em>'.
   * @see uws.chaudy.engage.Reaction#getFeedback()
   * @see #getReaction()
   * @generated
   */
  EReference getReaction_Feedback();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.ParamCondition <em>Param Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Condition</em>'.
   * @see uws.chaudy.engage.ParamCondition
   * @generated
   */
  EClass getParamCondition();

  /**
   * Returns the meta object for the reference '{@link uws.chaudy.engage.ParamCondition#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Params</em>'.
   * @see uws.chaudy.engage.ParamCondition#getParams()
   * @see #getParamCondition()
   * @generated
   */
  EReference getParamCondition_Params();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.PointsCondition <em>Points Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Points Condition</em>'.
   * @see uws.chaudy.engage.PointsCondition
   * @generated
   */
  EClass getPointsCondition();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.PointsCondition#getKeyWd <em>Key Wd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key Wd</em>'.
   * @see uws.chaudy.engage.PointsCondition#getKeyWd()
   * @see #getPointsCondition()
   * @generated
   */
  EAttribute getPointsCondition_KeyWd();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.PointsCondition#getSign <em>Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sign</em>'.
   * @see uws.chaudy.engage.PointsCondition#getSign()
   * @see #getPointsCondition()
   * @generated
   */
  EAttribute getPointsCondition_Sign();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.PointsCondition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see uws.chaudy.engage.PointsCondition#getValue()
   * @see #getPointsCondition()
   * @generated
   */
  EReference getPointsCondition_Value();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.FeedbackModel <em>Feedback Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feedback Model</em>'.
   * @see uws.chaudy.engage.FeedbackModel
   * @generated
   */
  EClass getFeedbackModel();

  /**
   * Returns the meta object for the containment reference list '{@link uws.chaudy.engage.FeedbackModel#getTriggers <em>Triggers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Triggers</em>'.
   * @see uws.chaudy.engage.FeedbackModel#getTriggers()
   * @see #getFeedbackModel()
   * @generated
   */
  EReference getFeedbackModel_Triggers();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.Trigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trigger</em>'.
   * @see uws.chaudy.engage.Trigger
   * @generated
   */
  EClass getTrigger();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.Trigger#getPerf <em>Perf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Perf</em>'.
   * @see uws.chaudy.engage.Trigger#getPerf()
   * @see #getTrigger()
   * @generated
   */
  EReference getTrigger_Perf();

  /**
   * Returns the meta object for the containment reference '{@link uws.chaudy.engage.Trigger#getInactivity <em>Inactivity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inactivity</em>'.
   * @see uws.chaudy.engage.Trigger#getInactivity()
   * @see #getTrigger()
   * @generated
   */
  EReference getTrigger_Inactivity();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.OutcomeValueLimit <em>Outcome Value Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Outcome Value Limit</em>'.
   * @see uws.chaudy.engage.OutcomeValueLimit
   * @generated
   */
  EClass getOutcomeValueLimit();

  /**
   * Returns the meta object for the reference '{@link uws.chaudy.engage.OutcomeValueLimit#getOutcome <em>Outcome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Outcome</em>'.
   * @see uws.chaudy.engage.OutcomeValueLimit#getOutcome()
   * @see #getOutcomeValueLimit()
   * @generated
   */
  EReference getOutcomeValueLimit_Outcome();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.OutcomeValueLimit#getSign <em>Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sign</em>'.
   * @see uws.chaudy.engage.OutcomeValueLimit#getSign()
   * @see #getOutcomeValueLimit()
   * @generated
   */
  EAttribute getOutcomeValueLimit_Sign();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.OutcomeValueLimit#isNegativeLimit <em>Negative Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Negative Limit</em>'.
   * @see uws.chaudy.engage.OutcomeValueLimit#isNegativeLimit()
   * @see #getOutcomeValueLimit()
   * @generated
   */
  EAttribute getOutcomeValueLimit_NegativeLimit();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.OutcomeValueLimit#getLimit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Limit</em>'.
   * @see uws.chaudy.engage.OutcomeValueLimit#getLimit()
   * @see #getOutcomeValueLimit()
   * @generated
   */
  EAttribute getOutcomeValueLimit_Limit();

  /**
   * Returns the meta object for the containment reference list '{@link uws.chaudy.engage.OutcomeValueLimit#getTriggerReactions <em>Trigger Reactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Trigger Reactions</em>'.
   * @see uws.chaudy.engage.OutcomeValueLimit#getTriggerReactions()
   * @see #getOutcomeValueLimit()
   * @generated
   */
  EReference getOutcomeValueLimit_TriggerReactions();

  /**
   * Returns the meta object for class '{@link uws.chaudy.engage.InactivityLimit <em>Inactivity Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inactivity Limit</em>'.
   * @see uws.chaudy.engage.InactivityLimit
   * @generated
   */
  EClass getInactivityLimit();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.InactivityLimit#getSign <em>Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sign</em>'.
   * @see uws.chaudy.engage.InactivityLimit#getSign()
   * @see #getInactivityLimit()
   * @generated
   */
  EAttribute getInactivityLimit_Sign();

  /**
   * Returns the meta object for the attribute '{@link uws.chaudy.engage.InactivityLimit#getLimit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Limit</em>'.
   * @see uws.chaudy.engage.InactivityLimit#getLimit()
   * @see #getInactivityLimit()
   * @generated
   */
  EAttribute getInactivityLimit_Limit();

  /**
   * Returns the meta object for the containment reference list '{@link uws.chaudy.engage.InactivityLimit#getTriggerReactions <em>Trigger Reactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Trigger Reactions</em>'.
   * @see uws.chaudy.engage.InactivityLimit#getTriggerReactions()
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
  EngageFactory getEngageFactory();

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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.ModelImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getModel()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.TypeImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getType()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.EnumImpl <em>Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.EnumImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getEnum()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.GameDescriptionImpl <em>Game Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.GameDescriptionImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getGameDescription()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.AgeImpl <em>Age</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.AgeImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getAge()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.PlayerDescriptionImpl <em>Player Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.PlayerDescriptionImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getPlayerDescription()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.CharacteristicImpl <em>Characteristic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.CharacteristicImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getCharacteristic()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.LearningOutcomesImpl <em>Learning Outcomes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.LearningOutcomesImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getLearningOutcomes()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.OutcomeImpl <em>Outcome</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.OutcomeImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getOutcome()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.TypeOutcomeImpl <em>Type Outcome</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.TypeOutcomeImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getTypeOutcome()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.FeedbackMessagesImpl <em>Feedback Messages</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.FeedbackMessagesImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getFeedbackMessages()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.FeedbackImpl <em>Feedback</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.FeedbackImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getFeedback()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.EvidenceModelImpl <em>Evidence Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.EvidenceModelImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getEvidenceModel()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.ActionSequencesImpl <em>Action Sequences</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.ActionSequencesImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getActionSequences()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.ActionSequenceImpl <em>Action Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.ActionSequenceImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getActionSequence()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.TimerActionsImpl <em>Timer Actions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.TimerActionsImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getTimerActions()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.TimerActionImpl <em>Timer Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.TimerActionImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getTimerAction()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.TimingImpl <em>Timing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.TimingImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getTiming()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.ActionReactionImpl <em>Action Reaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.ActionReactionImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getActionReaction()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.UpdateScoreImpl <em>Update Score</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.UpdateScoreImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getUpdateScore()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.TriggerFeedbackImpl <em>Trigger Feedback</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.TriggerFeedbackImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getTriggerFeedback()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.ActionImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getAction()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.ParameterImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.PointsImpl <em>Points</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.PointsImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getPoints()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.PointImpl <em>Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.PointImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getPoint()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.ParamsImpl <em>Params</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.ParamsImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getParams()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.ReactionsImpl <em>Reactions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.ReactionsImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getReactions()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.ReactionImpl <em>Reaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.ReactionImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getReaction()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.ParamConditionImpl <em>Param Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.ParamConditionImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getParamCondition()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.PointsConditionImpl <em>Points Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.PointsConditionImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getPointsCondition()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.FeedbackModelImpl <em>Feedback Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.FeedbackModelImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getFeedbackModel()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.TriggerImpl <em>Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.TriggerImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getTrigger()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.OutcomeValueLimitImpl <em>Outcome Value Limit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.OutcomeValueLimitImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getOutcomeValueLimit()
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
     * The meta object literal for the '{@link uws.chaudy.engage.impl.InactivityLimitImpl <em>Inactivity Limit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uws.chaudy.engage.impl.InactivityLimitImpl
     * @see uws.chaudy.engage.impl.EngagePackageImpl#getInactivityLimit()
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

} //EngagePackage
