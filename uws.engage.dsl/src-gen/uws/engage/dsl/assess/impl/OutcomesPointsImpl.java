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
import uws.engage.dsl.assess.Outcome;
import uws.engage.dsl.assess.OutcomesPoints;
import uws.engage.dsl.assess.Parameter;
import uws.engage.dsl.assess.Point;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outcomes Points</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.OutcomesPointsImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.OutcomesPointsImpl#isResetValue <em>Reset Value</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.OutcomesPointsImpl#getPts <em>Pts</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.OutcomesPointsImpl#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutcomesPointsImpl extends MinimalEObjectImpl.Container implements OutcomesPoints
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
   * The default value of the '{@link #isResetValue() <em>Reset Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResetValue()
   * @generated
   * @ordered
   */
  protected static final boolean RESET_VALUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isResetValue() <em>Reset Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResetValue()
   * @generated
   * @ordered
   */
  protected boolean resetValue = RESET_VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPts() <em>Pts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPts()
   * @generated
   * @ordered
   */
  protected Point pts;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected Parameter var;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OutcomesPointsImpl()
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
    return AssessPackage.Literals.OUTCOMES_POINTS;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssessPackage.OUTCOMES_POINTS__OUTCOME, oldOutcome, outcome));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.OUTCOMES_POINTS__OUTCOME, oldOutcome, outcome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isResetValue()
  {
    return resetValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResetValue(boolean newResetValue)
  {
    boolean oldResetValue = resetValue;
    resetValue = newResetValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.OUTCOMES_POINTS__RESET_VALUE, oldResetValue, resetValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point getPts()
  {
    return pts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPts(Point newPts, NotificationChain msgs)
  {
    Point oldPts = pts;
    pts = newPts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessPackage.OUTCOMES_POINTS__PTS, oldPts, newPts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPts(Point newPts)
  {
    if (newPts != pts)
    {
      NotificationChain msgs = null;
      if (pts != null)
        msgs = ((InternalEObject)pts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessPackage.OUTCOMES_POINTS__PTS, null, msgs);
      if (newPts != null)
        msgs = ((InternalEObject)newPts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssessPackage.OUTCOMES_POINTS__PTS, null, msgs);
      msgs = basicSetPts(newPts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.OUTCOMES_POINTS__PTS, newPts, newPts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getVar()
  {
    if (var != null && var.eIsProxy())
    {
      InternalEObject oldVar = (InternalEObject)var;
      var = (Parameter)eResolveProxy(oldVar);
      if (var != oldVar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssessPackage.OUTCOMES_POINTS__VAR, oldVar, var));
      }
    }
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter basicGetVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(Parameter newVar)
  {
    Parameter oldVar = var;
    var = newVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.OUTCOMES_POINTS__VAR, oldVar, var));
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
      case AssessPackage.OUTCOMES_POINTS__PTS:
        return basicSetPts(null, msgs);
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
      case AssessPackage.OUTCOMES_POINTS__OUTCOME:
        if (resolve) return getOutcome();
        return basicGetOutcome();
      case AssessPackage.OUTCOMES_POINTS__RESET_VALUE:
        return isResetValue();
      case AssessPackage.OUTCOMES_POINTS__PTS:
        return getPts();
      case AssessPackage.OUTCOMES_POINTS__VAR:
        if (resolve) return getVar();
        return basicGetVar();
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
      case AssessPackage.OUTCOMES_POINTS__OUTCOME:
        setOutcome((Outcome)newValue);
        return;
      case AssessPackage.OUTCOMES_POINTS__RESET_VALUE:
        setResetValue((Boolean)newValue);
        return;
      case AssessPackage.OUTCOMES_POINTS__PTS:
        setPts((Point)newValue);
        return;
      case AssessPackage.OUTCOMES_POINTS__VAR:
        setVar((Parameter)newValue);
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
      case AssessPackage.OUTCOMES_POINTS__OUTCOME:
        setOutcome((Outcome)null);
        return;
      case AssessPackage.OUTCOMES_POINTS__RESET_VALUE:
        setResetValue(RESET_VALUE_EDEFAULT);
        return;
      case AssessPackage.OUTCOMES_POINTS__PTS:
        setPts((Point)null);
        return;
      case AssessPackage.OUTCOMES_POINTS__VAR:
        setVar((Parameter)null);
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
      case AssessPackage.OUTCOMES_POINTS__OUTCOME:
        return outcome != null;
      case AssessPackage.OUTCOMES_POINTS__RESET_VALUE:
        return resetValue != RESET_VALUE_EDEFAULT;
      case AssessPackage.OUTCOMES_POINTS__PTS:
        return pts != null;
      case AssessPackage.OUTCOMES_POINTS__VAR:
        return var != null;
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
    result.append(" (resetValue: ");
    result.append(resetValue);
    result.append(')');
    return result.toString();
  }

} //OutcomesPointsImpl
