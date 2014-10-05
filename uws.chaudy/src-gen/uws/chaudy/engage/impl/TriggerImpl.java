/**
 */
package uws.chaudy.engage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uws.chaudy.engage.EngagePackage;
import uws.chaudy.engage.InactivityLimit;
import uws.chaudy.engage.OutcomeValueLimit;
import uws.chaudy.engage.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.chaudy.engage.impl.TriggerImpl#getPerf <em>Perf</em>}</li>
 *   <li>{@link uws.chaudy.engage.impl.TriggerImpl#getInactivity <em>Inactivity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerImpl extends MinimalEObjectImpl.Container implements Trigger
{
  /**
   * The cached value of the '{@link #getPerf() <em>Perf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPerf()
   * @generated
   * @ordered
   */
  protected OutcomeValueLimit perf;

  /**
   * The cached value of the '{@link #getInactivity() <em>Inactivity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInactivity()
   * @generated
   * @ordered
   */
  protected InactivityLimit inactivity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TriggerImpl()
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
    return EngagePackage.Literals.TRIGGER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutcomeValueLimit getPerf()
  {
    return perf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPerf(OutcomeValueLimit newPerf, NotificationChain msgs)
  {
    OutcomeValueLimit oldPerf = perf;
    perf = newPerf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EngagePackage.TRIGGER__PERF, oldPerf, newPerf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPerf(OutcomeValueLimit newPerf)
  {
    if (newPerf != perf)
    {
      NotificationChain msgs = null;
      if (perf != null)
        msgs = ((InternalEObject)perf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EngagePackage.TRIGGER__PERF, null, msgs);
      if (newPerf != null)
        msgs = ((InternalEObject)newPerf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EngagePackage.TRIGGER__PERF, null, msgs);
      msgs = basicSetPerf(newPerf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EngagePackage.TRIGGER__PERF, newPerf, newPerf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InactivityLimit getInactivity()
  {
    return inactivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInactivity(InactivityLimit newInactivity, NotificationChain msgs)
  {
    InactivityLimit oldInactivity = inactivity;
    inactivity = newInactivity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EngagePackage.TRIGGER__INACTIVITY, oldInactivity, newInactivity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInactivity(InactivityLimit newInactivity)
  {
    if (newInactivity != inactivity)
    {
      NotificationChain msgs = null;
      if (inactivity != null)
        msgs = ((InternalEObject)inactivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EngagePackage.TRIGGER__INACTIVITY, null, msgs);
      if (newInactivity != null)
        msgs = ((InternalEObject)newInactivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EngagePackage.TRIGGER__INACTIVITY, null, msgs);
      msgs = basicSetInactivity(newInactivity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EngagePackage.TRIGGER__INACTIVITY, newInactivity, newInactivity));
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
      case EngagePackage.TRIGGER__PERF:
        return basicSetPerf(null, msgs);
      case EngagePackage.TRIGGER__INACTIVITY:
        return basicSetInactivity(null, msgs);
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
      case EngagePackage.TRIGGER__PERF:
        return getPerf();
      case EngagePackage.TRIGGER__INACTIVITY:
        return getInactivity();
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
      case EngagePackage.TRIGGER__PERF:
        setPerf((OutcomeValueLimit)newValue);
        return;
      case EngagePackage.TRIGGER__INACTIVITY:
        setInactivity((InactivityLimit)newValue);
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
      case EngagePackage.TRIGGER__PERF:
        setPerf((OutcomeValueLimit)null);
        return;
      case EngagePackage.TRIGGER__INACTIVITY:
        setInactivity((InactivityLimit)null);
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
      case EngagePackage.TRIGGER__PERF:
        return perf != null;
      case EngagePackage.TRIGGER__INACTIVITY:
        return inactivity != null;
    }
    return super.eIsSet(featureID);
  }

} //TriggerImpl
