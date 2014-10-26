/**
 */
package uws.engage.dsl.assess.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uws.engage.dsl.assess.ActionReaction;
import uws.engage.dsl.assess.AssessPackage;
import uws.engage.dsl.assess.TriggerFeedback;
import uws.engage.dsl.assess.UpdateScore;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Reaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.ActionReactionImpl#getUpdateScore <em>Update Score</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.ActionReactionImpl#getTriggerFeedback <em>Trigger Feedback</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionReactionImpl extends MinimalEObjectImpl.Container implements ActionReaction
{
  /**
   * The cached value of the '{@link #getUpdateScore() <em>Update Score</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdateScore()
   * @generated
   * @ordered
   */
  protected UpdateScore updateScore;

  /**
   * The cached value of the '{@link #getTriggerFeedback() <em>Trigger Feedback</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggerFeedback()
   * @generated
   * @ordered
   */
  protected TriggerFeedback triggerFeedback;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionReactionImpl()
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
    return AssessPackage.Literals.ACTION_REACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateScore getUpdateScore()
  {
    return updateScore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpdateScore(UpdateScore newUpdateScore, NotificationChain msgs)
  {
    UpdateScore oldUpdateScore = updateScore;
    updateScore = newUpdateScore;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessPackage.ACTION_REACTION__UPDATE_SCORE, oldUpdateScore, newUpdateScore);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdateScore(UpdateScore newUpdateScore)
  {
    if (newUpdateScore != updateScore)
    {
      NotificationChain msgs = null;
      if (updateScore != null)
        msgs = ((InternalEObject)updateScore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessPackage.ACTION_REACTION__UPDATE_SCORE, null, msgs);
      if (newUpdateScore != null)
        msgs = ((InternalEObject)newUpdateScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssessPackage.ACTION_REACTION__UPDATE_SCORE, null, msgs);
      msgs = basicSetUpdateScore(newUpdateScore, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.ACTION_REACTION__UPDATE_SCORE, newUpdateScore, newUpdateScore));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TriggerFeedback getTriggerFeedback()
  {
    return triggerFeedback;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTriggerFeedback(TriggerFeedback newTriggerFeedback, NotificationChain msgs)
  {
    TriggerFeedback oldTriggerFeedback = triggerFeedback;
    triggerFeedback = newTriggerFeedback;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessPackage.ACTION_REACTION__TRIGGER_FEEDBACK, oldTriggerFeedback, newTriggerFeedback);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTriggerFeedback(TriggerFeedback newTriggerFeedback)
  {
    if (newTriggerFeedback != triggerFeedback)
    {
      NotificationChain msgs = null;
      if (triggerFeedback != null)
        msgs = ((InternalEObject)triggerFeedback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessPackage.ACTION_REACTION__TRIGGER_FEEDBACK, null, msgs);
      if (newTriggerFeedback != null)
        msgs = ((InternalEObject)newTriggerFeedback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssessPackage.ACTION_REACTION__TRIGGER_FEEDBACK, null, msgs);
      msgs = basicSetTriggerFeedback(newTriggerFeedback, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.ACTION_REACTION__TRIGGER_FEEDBACK, newTriggerFeedback, newTriggerFeedback));
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
      case AssessPackage.ACTION_REACTION__UPDATE_SCORE:
        return basicSetUpdateScore(null, msgs);
      case AssessPackage.ACTION_REACTION__TRIGGER_FEEDBACK:
        return basicSetTriggerFeedback(null, msgs);
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
      case AssessPackage.ACTION_REACTION__UPDATE_SCORE:
        return getUpdateScore();
      case AssessPackage.ACTION_REACTION__TRIGGER_FEEDBACK:
        return getTriggerFeedback();
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
      case AssessPackage.ACTION_REACTION__UPDATE_SCORE:
        setUpdateScore((UpdateScore)newValue);
        return;
      case AssessPackage.ACTION_REACTION__TRIGGER_FEEDBACK:
        setTriggerFeedback((TriggerFeedback)newValue);
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
      case AssessPackage.ACTION_REACTION__UPDATE_SCORE:
        setUpdateScore((UpdateScore)null);
        return;
      case AssessPackage.ACTION_REACTION__TRIGGER_FEEDBACK:
        setTriggerFeedback((TriggerFeedback)null);
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
      case AssessPackage.ACTION_REACTION__UPDATE_SCORE:
        return updateScore != null;
      case AssessPackage.ACTION_REACTION__TRIGGER_FEEDBACK:
        return triggerFeedback != null;
    }
    return super.eIsSet(featureID);
  }

} //ActionReactionImpl
