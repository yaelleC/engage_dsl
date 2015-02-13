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
import uws.engage.dsl.assess.GenericTrigger;
import uws.engage.dsl.assess.LOTrigger;
import uws.engage.dsl.assess.SimpleTrigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.GenericTriggerImpl#getSimple <em>Simple</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.GenericTriggerImpl#getLo <em>Lo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericTriggerImpl extends MinimalEObjectImpl.Container implements GenericTrigger
{
  /**
   * The cached value of the '{@link #getSimple() <em>Simple</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimple()
   * @generated
   * @ordered
   */
  protected SimpleTrigger simple;

  /**
   * The cached value of the '{@link #getLo() <em>Lo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLo()
   * @generated
   * @ordered
   */
  protected LOTrigger lo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenericTriggerImpl()
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
    return AssessPackage.Literals.GENERIC_TRIGGER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleTrigger getSimple()
  {
    return simple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSimple(SimpleTrigger newSimple, NotificationChain msgs)
  {
    SimpleTrigger oldSimple = simple;
    simple = newSimple;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessPackage.GENERIC_TRIGGER__SIMPLE, oldSimple, newSimple);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimple(SimpleTrigger newSimple)
  {
    if (newSimple != simple)
    {
      NotificationChain msgs = null;
      if (simple != null)
        msgs = ((InternalEObject)simple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessPackage.GENERIC_TRIGGER__SIMPLE, null, msgs);
      if (newSimple != null)
        msgs = ((InternalEObject)newSimple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssessPackage.GENERIC_TRIGGER__SIMPLE, null, msgs);
      msgs = basicSetSimple(newSimple, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.GENERIC_TRIGGER__SIMPLE, newSimple, newSimple));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LOTrigger getLo()
  {
    return lo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLo(LOTrigger newLo, NotificationChain msgs)
  {
    LOTrigger oldLo = lo;
    lo = newLo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessPackage.GENERIC_TRIGGER__LO, oldLo, newLo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLo(LOTrigger newLo)
  {
    if (newLo != lo)
    {
      NotificationChain msgs = null;
      if (lo != null)
        msgs = ((InternalEObject)lo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessPackage.GENERIC_TRIGGER__LO, null, msgs);
      if (newLo != null)
        msgs = ((InternalEObject)newLo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssessPackage.GENERIC_TRIGGER__LO, null, msgs);
      msgs = basicSetLo(newLo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.GENERIC_TRIGGER__LO, newLo, newLo));
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
      case AssessPackage.GENERIC_TRIGGER__SIMPLE:
        return basicSetSimple(null, msgs);
      case AssessPackage.GENERIC_TRIGGER__LO:
        return basicSetLo(null, msgs);
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
      case AssessPackage.GENERIC_TRIGGER__SIMPLE:
        return getSimple();
      case AssessPackage.GENERIC_TRIGGER__LO:
        return getLo();
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
      case AssessPackage.GENERIC_TRIGGER__SIMPLE:
        setSimple((SimpleTrigger)newValue);
        return;
      case AssessPackage.GENERIC_TRIGGER__LO:
        setLo((LOTrigger)newValue);
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
      case AssessPackage.GENERIC_TRIGGER__SIMPLE:
        setSimple((SimpleTrigger)null);
        return;
      case AssessPackage.GENERIC_TRIGGER__LO:
        setLo((LOTrigger)null);
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
      case AssessPackage.GENERIC_TRIGGER__SIMPLE:
        return simple != null;
      case AssessPackage.GENERIC_TRIGGER__LO:
        return lo != null;
    }
    return super.eIsSet(featureID);
  }

} //GenericTriggerImpl
