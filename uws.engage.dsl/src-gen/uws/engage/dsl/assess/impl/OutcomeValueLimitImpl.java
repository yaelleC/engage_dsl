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

import uws.engage.dsl.assess.AssessPackage;
import uws.engage.dsl.assess.Outcome;
import uws.engage.dsl.assess.OutcomeValueLimit;
import uws.engage.dsl.assess.TriggerFeedback;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outcome Value Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.OutcomeValueLimitImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.OutcomeValueLimitImpl#getSign <em>Sign</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.OutcomeValueLimitImpl#isNegativeLimit <em>Negative Limit</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.OutcomeValueLimitImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.OutcomeValueLimitImpl#getTriggerReactions <em>Trigger Reactions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutcomeValueLimitImpl extends MinimalEObjectImpl.Container implements OutcomeValueLimit
{
  /**
   * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutcome()
   * @generated
   * @ordered
   */
  protected Outcome outcome;

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
   * The default value of the '{@link #isNegativeLimit() <em>Negative Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNegativeLimit()
   * @generated
   * @ordered
   */
  protected static final boolean NEGATIVE_LIMIT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNegativeLimit() <em>Negative Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNegativeLimit()
   * @generated
   * @ordered
   */
  protected boolean negativeLimit = NEGATIVE_LIMIT_EDEFAULT;

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
  protected EList<TriggerFeedback> triggerReactions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OutcomeValueLimitImpl()
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
    return AssessPackage.Literals.OUTCOME_VALUE_LIMIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Outcome getOutcome()
  {
    if (outcome != null && outcome.eIsProxy())
    {
      InternalEObject oldOutcome = (InternalEObject)outcome;
      outcome = (Outcome)eResolveProxy(oldOutcome);
      if (outcome != oldOutcome)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssessPackage.OUTCOME_VALUE_LIMIT__OUTCOME, oldOutcome, outcome));
      }
    }
    return outcome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Outcome basicGetOutcome()
  {
    return outcome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutcome(Outcome newOutcome)
  {
    Outcome oldOutcome = outcome;
    outcome = newOutcome;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.OUTCOME_VALUE_LIMIT__OUTCOME, oldOutcome, outcome));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.OUTCOME_VALUE_LIMIT__SIGN, oldSign, sign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNegativeLimit()
  {
    return negativeLimit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNegativeLimit(boolean newNegativeLimit)
  {
    boolean oldNegativeLimit = negativeLimit;
    negativeLimit = newNegativeLimit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.OUTCOME_VALUE_LIMIT__NEGATIVE_LIMIT, oldNegativeLimit, negativeLimit));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.OUTCOME_VALUE_LIMIT__LIMIT, oldLimit, limit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TriggerFeedback> getTriggerReactions()
  {
    if (triggerReactions == null)
    {
      triggerReactions = new EObjectContainmentEList<TriggerFeedback>(TriggerFeedback.class, this, AssessPackage.OUTCOME_VALUE_LIMIT__TRIGGER_REACTIONS);
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
      case AssessPackage.OUTCOME_VALUE_LIMIT__TRIGGER_REACTIONS:
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
      case AssessPackage.OUTCOME_VALUE_LIMIT__OUTCOME:
        if (resolve) return getOutcome();
        return basicGetOutcome();
      case AssessPackage.OUTCOME_VALUE_LIMIT__SIGN:
        return getSign();
      case AssessPackage.OUTCOME_VALUE_LIMIT__NEGATIVE_LIMIT:
        return isNegativeLimit();
      case AssessPackage.OUTCOME_VALUE_LIMIT__LIMIT:
        return getLimit();
      case AssessPackage.OUTCOME_VALUE_LIMIT__TRIGGER_REACTIONS:
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
      case AssessPackage.OUTCOME_VALUE_LIMIT__OUTCOME:
        setOutcome((Outcome)newValue);
        return;
      case AssessPackage.OUTCOME_VALUE_LIMIT__SIGN:
        setSign((String)newValue);
        return;
      case AssessPackage.OUTCOME_VALUE_LIMIT__NEGATIVE_LIMIT:
        setNegativeLimit((Boolean)newValue);
        return;
      case AssessPackage.OUTCOME_VALUE_LIMIT__LIMIT:
        setLimit((Integer)newValue);
        return;
      case AssessPackage.OUTCOME_VALUE_LIMIT__TRIGGER_REACTIONS:
        getTriggerReactions().clear();
        getTriggerReactions().addAll((Collection<? extends TriggerFeedback>)newValue);
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
      case AssessPackage.OUTCOME_VALUE_LIMIT__OUTCOME:
        setOutcome((Outcome)null);
        return;
      case AssessPackage.OUTCOME_VALUE_LIMIT__SIGN:
        setSign(SIGN_EDEFAULT);
        return;
      case AssessPackage.OUTCOME_VALUE_LIMIT__NEGATIVE_LIMIT:
        setNegativeLimit(NEGATIVE_LIMIT_EDEFAULT);
        return;
      case AssessPackage.OUTCOME_VALUE_LIMIT__LIMIT:
        setLimit(LIMIT_EDEFAULT);
        return;
      case AssessPackage.OUTCOME_VALUE_LIMIT__TRIGGER_REACTIONS:
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
      case AssessPackage.OUTCOME_VALUE_LIMIT__OUTCOME:
        return outcome != null;
      case AssessPackage.OUTCOME_VALUE_LIMIT__SIGN:
        return SIGN_EDEFAULT == null ? sign != null : !SIGN_EDEFAULT.equals(sign);
      case AssessPackage.OUTCOME_VALUE_LIMIT__NEGATIVE_LIMIT:
        return negativeLimit != NEGATIVE_LIMIT_EDEFAULT;
      case AssessPackage.OUTCOME_VALUE_LIMIT__LIMIT:
        return limit != LIMIT_EDEFAULT;
      case AssessPackage.OUTCOME_VALUE_LIMIT__TRIGGER_REACTIONS:
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
    result.append(", negativeLimit: ");
    result.append(negativeLimit);
    result.append(", limit: ");
    result.append(limit);
    result.append(')');
    return result.toString();
  }

} //OutcomeValueLimitImpl
