/**
 */
package uws.engage.dsl.assess.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uws.engage.dsl.assess.AssessPackage;
import uws.engage.dsl.assess.EvidenceModel;
import uws.engage.dsl.assess.FeedbackMessages;
import uws.engage.dsl.assess.FeedbackModel;
import uws.engage.dsl.assess.GameDescription;
import uws.engage.dsl.assess.LearningOutcomes;
import uws.engage.dsl.assess.Model;
import uws.engage.dsl.assess.PlayerDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.ModelImpl#getGame <em>Game</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.ModelImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.ModelImpl#getLearningOutcomes <em>Learning Outcomes</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.ModelImpl#getFeedbackMessages <em>Feedback Messages</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.ModelImpl#getEvidenceModel <em>Evidence Model</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.ModelImpl#getFeedbackModel <em>Feedback Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getGame() <em>Game</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGame()
   * @generated
   * @ordered
   */
  protected GameDescription game;

  /**
   * The cached value of the '{@link #getPlayer() <em>Player</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlayer()
   * @generated
   * @ordered
   */
  protected PlayerDescription player;

  /**
   * The cached value of the '{@link #getLearningOutcomes() <em>Learning Outcomes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLearningOutcomes()
   * @generated
   * @ordered
   */
  protected LearningOutcomes learningOutcomes;

  /**
   * The cached value of the '{@link #getFeedbackMessages() <em>Feedback Messages</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeedbackMessages()
   * @generated
   * @ordered
   */
  protected FeedbackMessages feedbackMessages;

  /**
   * The cached value of the '{@link #getEvidenceModel() <em>Evidence Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvidenceModel()
   * @generated
   * @ordered
   */
  protected EvidenceModel evidenceModel;

  /**
   * The cached value of the '{@link #getFeedbackModel() <em>Feedback Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeedbackModel()
   * @generated
   * @ordered
   */
  protected FeedbackModel feedbackModel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AssessPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameDescription getGame()
  {
    return game;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGame(GameDescription newGame, NotificationChain msgs)
  {
    GameDescription oldGame = game;
    game = newGame;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessPackage.MODEL__GAME, oldGame, newGame);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGame(GameDescription newGame)
  {
    if (newGame != game)
    {
      NotificationChain msgs = null;
      if (game != null)
        msgs = ((InternalEObject)game).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessPackage.MODEL__GAME, null, msgs);
      if (newGame != null)
        msgs = ((InternalEObject)newGame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssessPackage.MODEL__GAME, null, msgs);
      msgs = basicSetGame(newGame, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.MODEL__GAME, newGame, newGame));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlayerDescription getPlayer()
  {
    return player;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlayer(PlayerDescription newPlayer, NotificationChain msgs)
  {
    PlayerDescription oldPlayer = player;
    player = newPlayer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessPackage.MODEL__PLAYER, oldPlayer, newPlayer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlayer(PlayerDescription newPlayer)
  {
    if (newPlayer != player)
    {
      NotificationChain msgs = null;
      if (player != null)
        msgs = ((InternalEObject)player).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessPackage.MODEL__PLAYER, null, msgs);
      if (newPlayer != null)
        msgs = ((InternalEObject)newPlayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssessPackage.MODEL__PLAYER, null, msgs);
      msgs = basicSetPlayer(newPlayer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.MODEL__PLAYER, newPlayer, newPlayer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LearningOutcomes getLearningOutcomes()
  {
    return learningOutcomes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLearningOutcomes(LearningOutcomes newLearningOutcomes, NotificationChain msgs)
  {
    LearningOutcomes oldLearningOutcomes = learningOutcomes;
    learningOutcomes = newLearningOutcomes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessPackage.MODEL__LEARNING_OUTCOMES, oldLearningOutcomes, newLearningOutcomes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLearningOutcomes(LearningOutcomes newLearningOutcomes)
  {
    if (newLearningOutcomes != learningOutcomes)
    {
      NotificationChain msgs = null;
      if (learningOutcomes != null)
        msgs = ((InternalEObject)learningOutcomes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessPackage.MODEL__LEARNING_OUTCOMES, null, msgs);
      if (newLearningOutcomes != null)
        msgs = ((InternalEObject)newLearningOutcomes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssessPackage.MODEL__LEARNING_OUTCOMES, null, msgs);
      msgs = basicSetLearningOutcomes(newLearningOutcomes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.MODEL__LEARNING_OUTCOMES, newLearningOutcomes, newLearningOutcomes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeedbackMessages getFeedbackMessages()
  {
    return feedbackMessages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeedbackMessages(FeedbackMessages newFeedbackMessages, NotificationChain msgs)
  {
    FeedbackMessages oldFeedbackMessages = feedbackMessages;
    feedbackMessages = newFeedbackMessages;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessPackage.MODEL__FEEDBACK_MESSAGES, oldFeedbackMessages, newFeedbackMessages);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeedbackMessages(FeedbackMessages newFeedbackMessages)
  {
    if (newFeedbackMessages != feedbackMessages)
    {
      NotificationChain msgs = null;
      if (feedbackMessages != null)
        msgs = ((InternalEObject)feedbackMessages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessPackage.MODEL__FEEDBACK_MESSAGES, null, msgs);
      if (newFeedbackMessages != null)
        msgs = ((InternalEObject)newFeedbackMessages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssessPackage.MODEL__FEEDBACK_MESSAGES, null, msgs);
      msgs = basicSetFeedbackMessages(newFeedbackMessages, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.MODEL__FEEDBACK_MESSAGES, newFeedbackMessages, newFeedbackMessages));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvidenceModel getEvidenceModel()
  {
    return evidenceModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEvidenceModel(EvidenceModel newEvidenceModel, NotificationChain msgs)
  {
    EvidenceModel oldEvidenceModel = evidenceModel;
    evidenceModel = newEvidenceModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessPackage.MODEL__EVIDENCE_MODEL, oldEvidenceModel, newEvidenceModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvidenceModel(EvidenceModel newEvidenceModel)
  {
    if (newEvidenceModel != evidenceModel)
    {
      NotificationChain msgs = null;
      if (evidenceModel != null)
        msgs = ((InternalEObject)evidenceModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessPackage.MODEL__EVIDENCE_MODEL, null, msgs);
      if (newEvidenceModel != null)
        msgs = ((InternalEObject)newEvidenceModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssessPackage.MODEL__EVIDENCE_MODEL, null, msgs);
      msgs = basicSetEvidenceModel(newEvidenceModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.MODEL__EVIDENCE_MODEL, newEvidenceModel, newEvidenceModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeedbackModel getFeedbackModel()
  {
    return feedbackModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeedbackModel(FeedbackModel newFeedbackModel, NotificationChain msgs)
  {
    FeedbackModel oldFeedbackModel = feedbackModel;
    feedbackModel = newFeedbackModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessPackage.MODEL__FEEDBACK_MODEL, oldFeedbackModel, newFeedbackModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeedbackModel(FeedbackModel newFeedbackModel)
  {
    if (newFeedbackModel != feedbackModel)
    {
      NotificationChain msgs = null;
      if (feedbackModel != null)
        msgs = ((InternalEObject)feedbackModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessPackage.MODEL__FEEDBACK_MODEL, null, msgs);
      if (newFeedbackModel != null)
        msgs = ((InternalEObject)newFeedbackModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssessPackage.MODEL__FEEDBACK_MODEL, null, msgs);
      msgs = basicSetFeedbackModel(newFeedbackModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.MODEL__FEEDBACK_MODEL, newFeedbackModel, newFeedbackModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AssessPackage.MODEL__GAME:
        return basicSetGame(null, msgs);
      case AssessPackage.MODEL__PLAYER:
        return basicSetPlayer(null, msgs);
      case AssessPackage.MODEL__LEARNING_OUTCOMES:
        return basicSetLearningOutcomes(null, msgs);
      case AssessPackage.MODEL__FEEDBACK_MESSAGES:
        return basicSetFeedbackMessages(null, msgs);
      case AssessPackage.MODEL__EVIDENCE_MODEL:
        return basicSetEvidenceModel(null, msgs);
      case AssessPackage.MODEL__FEEDBACK_MODEL:
        return basicSetFeedbackModel(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AssessPackage.MODEL__GAME:
        return getGame();
      case AssessPackage.MODEL__PLAYER:
        return getPlayer();
      case AssessPackage.MODEL__LEARNING_OUTCOMES:
        return getLearningOutcomes();
      case AssessPackage.MODEL__FEEDBACK_MESSAGES:
        return getFeedbackMessages();
      case AssessPackage.MODEL__EVIDENCE_MODEL:
        return getEvidenceModel();
      case AssessPackage.MODEL__FEEDBACK_MODEL:
        return getFeedbackModel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AssessPackage.MODEL__GAME:
        setGame((GameDescription)newValue);
        return;
      case AssessPackage.MODEL__PLAYER:
        setPlayer((PlayerDescription)newValue);
        return;
      case AssessPackage.MODEL__LEARNING_OUTCOMES:
        setLearningOutcomes((LearningOutcomes)newValue);
        return;
      case AssessPackage.MODEL__FEEDBACK_MESSAGES:
        setFeedbackMessages((FeedbackMessages)newValue);
        return;
      case AssessPackage.MODEL__EVIDENCE_MODEL:
        setEvidenceModel((EvidenceModel)newValue);
        return;
      case AssessPackage.MODEL__FEEDBACK_MODEL:
        setFeedbackModel((FeedbackModel)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AssessPackage.MODEL__GAME:
        setGame((GameDescription)null);
        return;
      case AssessPackage.MODEL__PLAYER:
        setPlayer((PlayerDescription)null);
        return;
      case AssessPackage.MODEL__LEARNING_OUTCOMES:
        setLearningOutcomes((LearningOutcomes)null);
        return;
      case AssessPackage.MODEL__FEEDBACK_MESSAGES:
        setFeedbackMessages((FeedbackMessages)null);
        return;
      case AssessPackage.MODEL__EVIDENCE_MODEL:
        setEvidenceModel((EvidenceModel)null);
        return;
      case AssessPackage.MODEL__FEEDBACK_MODEL:
        setFeedbackModel((FeedbackModel)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AssessPackage.MODEL__GAME:
        return game != null;
      case AssessPackage.MODEL__PLAYER:
        return player != null;
      case AssessPackage.MODEL__LEARNING_OUTCOMES:
        return learningOutcomes != null;
      case AssessPackage.MODEL__FEEDBACK_MESSAGES:
        return feedbackMessages != null;
      case AssessPackage.MODEL__EVIDENCE_MODEL:
        return evidenceModel != null;
      case AssessPackage.MODEL__FEEDBACK_MODEL:
        return feedbackModel != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
