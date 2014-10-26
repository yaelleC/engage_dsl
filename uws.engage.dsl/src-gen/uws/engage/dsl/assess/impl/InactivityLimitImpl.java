/**
 */
package uws.engage.dsl.assess.impl;

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

import uws.engage.dsl.assess.ActionReaction;
import uws.engage.dsl.assess.AssessPackage;
import uws.engage.dsl.assess.InactivityLimit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inactivity Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.InactivityLimitImpl#getSign <em>Sign</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.InactivityLimitImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.InactivityLimitImpl#getTriggerReactions <em>Trigger Reactions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InactivityLimitImpl extends MinimalEObjectImpl.Container implements InactivityLimit
{
  /**
   * The default value of the '{@link #getSign() <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSign()
   * @generated
   * @ordered
   */
  protected static final String SIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSign() <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSign()
   * @generated
   * @ordered
   */
  protected String sign = SIGN_EDEFAULT;

  /**
   * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimit()
   * @generated
   * @ordered
   */
  protected static final int LIMIT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimit()
   * @generated
   * @ordered
   */
  protected int limit = LIMIT_EDEFAULT;

  /**
   * The cached value of the '{@link #getTriggerReactions() <em>Trigger Reactions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggerReactions()
   * @generated
   * @ordered
   */
  protected EList<ActionReaction> triggerReactions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InactivityLimitImpl()
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
    return AssessPackage.Literals.INACTIVITY_LIMIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSign()
  {
    return sign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSign(String newSign)
  {
    String oldSign = sign;
    sign = newSign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.INACTIVITY_LIMIT__SIGN, oldSign, sign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLimit()
  {
    return limit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLimit(int newLimit)
  {
    int oldLimit = limit;
    limit = newLimit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.INACTIVITY_LIMIT__LIMIT, oldLimit, limit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActionReaction> getTriggerReactions()
  {
    if (triggerReactions == null)
    {
      triggerReactions = new EObjectContainmentEList<ActionReaction>(ActionReaction.class, this, AssessPackage.INACTIVITY_LIMIT__TRIGGER_REACTIONS);
    }
    return triggerReactions;
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
      case AssessPackage.INACTIVITY_LIMIT__TRIGGER_REACTIONS:
        return ((InternalEList<?>)getTriggerReactions()).basicRemove(otherEnd, msgs);
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
      case AssessPackage.INACTIVITY_LIMIT__SIGN:
        return getSign();
      case AssessPackage.INACTIVITY_LIMIT__LIMIT:
        return getLimit();
      case AssessPackage.INACTIVITY_LIMIT__TRIGGER_REACTIONS:
        return getTriggerReactions();
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
      case AssessPackage.INACTIVITY_LIMIT__SIGN:
        setSign((String)newValue);
        return;
      case AssessPackage.INACTIVITY_LIMIT__LIMIT:
        setLimit((Integer)newValue);
        return;
      case AssessPackage.INACTIVITY_LIMIT__TRIGGER_REACTIONS:
        getTriggerReactions().clear();
        getTriggerReactions().addAll((Collection<? extends ActionReaction>)newValue);
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
      case AssessPackage.INACTIVITY_LIMIT__SIGN:
        setSign(SIGN_EDEFAULT);
        return;
      case AssessPackage.INACTIVITY_LIMIT__LIMIT:
        setLimit(LIMIT_EDEFAULT);
        return;
      case AssessPackage.INACTIVITY_LIMIT__TRIGGER_REACTIONS:
        getTriggerReactions().clear();
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
      case AssessPackage.INACTIVITY_LIMIT__SIGN:
        return SIGN_EDEFAULT == null ? sign != null : !SIGN_EDEFAULT.equals(sign);
      case AssessPackage.INACTIVITY_LIMIT__LIMIT:
        return limit != LIMIT_EDEFAULT;
      case AssessPackage.INACTIVITY_LIMIT__TRIGGER_REACTIONS:
        return triggerReactions != null && !triggerReactions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (sign: ");
    result.append(sign);
    result.append(", limit: ");
    result.append(limit);
    result.append(')');
    return result.toString();
  }

} //InactivityLimitImpl
