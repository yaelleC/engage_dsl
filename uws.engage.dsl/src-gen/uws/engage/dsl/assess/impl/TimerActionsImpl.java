/**
 */
package uws.engage.dsl.assess.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uws.engage.dsl.assess.AssessPackage;
import uws.engage.dsl.assess.TimerAction;
import uws.engage.dsl.assess.TimerActions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer Actions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.TimerActionsImpl#getTimerActions <em>Timer Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimerActionsImpl extends MinimalEObjectImpl.Container implements TimerActions
{
  /**
   * The cached value of the '{@link #getTimerActions() <em>Timer Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimerActions()
   * @generated
   * @ordered
   */
  protected EList<TimerAction> timerActions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimerActionsImpl()
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
    return AssessPackage.Literals.TIMER_ACTIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TimerAction> getTimerActions()
  {
    if (timerActions == null)
    {
      timerActions = new EObjectContainmentEList<TimerAction>(TimerAction.class, this, AssessPackage.TIMER_ACTIONS__TIMER_ACTIONS);
    }
    return timerActions;
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
      case AssessPackage.TIMER_ACTIONS__TIMER_ACTIONS:
        return ((InternalEList<?>)getTimerActions()).basicRemove(otherEnd, msgs);
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
      case AssessPackage.TIMER_ACTIONS__TIMER_ACTIONS:
        return getTimerActions();
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
      case AssessPackage.TIMER_ACTIONS__TIMER_ACTIONS:
        getTimerActions().clear();
        getTimerActions().addAll((Collection<? extends TimerAction>)newValue);
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
      case AssessPackage.TIMER_ACTIONS__TIMER_ACTIONS:
        getTimerActions().clear();
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
      case AssessPackage.TIMER_ACTIONS__TIMER_ACTIONS:
        return timerActions != null && !timerActions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TimerActionsImpl
