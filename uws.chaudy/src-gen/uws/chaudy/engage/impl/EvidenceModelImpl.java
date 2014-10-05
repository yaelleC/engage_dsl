/**
 */
package uws.chaudy.engage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uws.chaudy.engage.Action;
import uws.chaudy.engage.ActionSequences;
import uws.chaudy.engage.EngagePackage;
import uws.chaudy.engage.EvidenceModel;
import uws.chaudy.engage.TimerActions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.chaudy.engage.impl.EvidenceModelImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link uws.chaudy.engage.impl.EvidenceModelImpl#getTimerActions <em>Timer Actions</em>}</li>
 *   <li>{@link uws.chaudy.engage.impl.EvidenceModelImpl#getActionSequence <em>Action Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvidenceModelImpl extends MinimalEObjectImpl.Container implements EvidenceModel
{
  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<Action> actions;

  /**
   * The cached value of the '{@link #getTimerActions() <em>Timer Actions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimerActions()
   * @generated
   * @ordered
   */
  protected TimerActions timerActions;

  /**
   * The cached value of the '{@link #getActionSequence() <em>Action Sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionSequence()
   * @generated
   * @ordered
   */
  protected ActionSequences actionSequence;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EvidenceModelImpl()
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
    return EngagePackage.Literals.EVIDENCE_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<Action>(Action.class, this, EngagePackage.EVIDENCE_MODEL__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimerActions getTimerActions()
  {
    return timerActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimerActions(TimerActions newTimerActions, NotificationChain msgs)
  {
    TimerActions oldTimerActions = timerActions;
    timerActions = newTimerActions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EngagePackage.EVIDENCE_MODEL__TIMER_ACTIONS, oldTimerActions, newTimerActions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimerActions(TimerActions newTimerActions)
  {
    if (newTimerActions != timerActions)
    {
      NotificationChain msgs = null;
      if (timerActions != null)
        msgs = ((InternalEObject)timerActions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EngagePackage.EVIDENCE_MODEL__TIMER_ACTIONS, null, msgs);
      if (newTimerActions != null)
        msgs = ((InternalEObject)newTimerActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EngagePackage.EVIDENCE_MODEL__TIMER_ACTIONS, null, msgs);
      msgs = basicSetTimerActions(newTimerActions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EngagePackage.EVIDENCE_MODEL__TIMER_ACTIONS, newTimerActions, newTimerActions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionSequences getActionSequence()
  {
    return actionSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActionSequence(ActionSequences newActionSequence, NotificationChain msgs)
  {
    ActionSequences oldActionSequence = actionSequence;
    actionSequence = newActionSequence;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EngagePackage.EVIDENCE_MODEL__ACTION_SEQUENCE, oldActionSequence, newActionSequence);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionSequence(ActionSequences newActionSequence)
  {
    if (newActionSequence != actionSequence)
    {
      NotificationChain msgs = null;
      if (actionSequence != null)
        msgs = ((InternalEObject)actionSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EngagePackage.EVIDENCE_MODEL__ACTION_SEQUENCE, null, msgs);
      if (newActionSequence != null)
        msgs = ((InternalEObject)newActionSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EngagePackage.EVIDENCE_MODEL__ACTION_SEQUENCE, null, msgs);
      msgs = basicSetActionSequence(newActionSequence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EngagePackage.EVIDENCE_MODEL__ACTION_SEQUENCE, newActionSequence, newActionSequence));
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
      case EngagePackage.EVIDENCE_MODEL__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
      case EngagePackage.EVIDENCE_MODEL__TIMER_ACTIONS:
        return basicSetTimerActions(null, msgs);
      case EngagePackage.EVIDENCE_MODEL__ACTION_SEQUENCE:
        return basicSetActionSequence(null, msgs);
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
      case EngagePackage.EVIDENCE_MODEL__ACTIONS:
        return getActions();
      case EngagePackage.EVIDENCE_MODEL__TIMER_ACTIONS:
        return getTimerActions();
      case EngagePackage.EVIDENCE_MODEL__ACTION_SEQUENCE:
        return getActionSequence();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EngagePackage.EVIDENCE_MODEL__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Action>)newValue);
        return;
      case EngagePackage.EVIDENCE_MODEL__TIMER_ACTIONS:
        setTimerActions((TimerActions)newValue);
        return;
      case EngagePackage.EVIDENCE_MODEL__ACTION_SEQUENCE:
        setActionSequence((ActionSequences)newValue);
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
      case EngagePackage.EVIDENCE_MODEL__ACTIONS:
        getActions().clear();
        return;
      case EngagePackage.EVIDENCE_MODEL__TIMER_ACTIONS:
        setTimerActions((TimerActions)null);
        return;
      case EngagePackage.EVIDENCE_MODEL__ACTION_SEQUENCE:
        setActionSequence((ActionSequences)null);
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
      case EngagePackage.EVIDENCE_MODEL__ACTIONS:
        return actions != null && !actions.isEmpty();
      case EngagePackage.EVIDENCE_MODEL__TIMER_ACTIONS:
        return timerActions != null;
      case EngagePackage.EVIDENCE_MODEL__ACTION_SEQUENCE:
        return actionSequence != null;
    }
    return super.eIsSet(featureID);
  }

} //EvidenceModelImpl
