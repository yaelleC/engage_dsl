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
import uws.engage.dsl.assess.Point;
import uws.engage.dsl.assess.UpdateScore;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Score</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.UpdateScoreImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.UpdateScoreImpl#getPts <em>Pts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UpdateScoreImpl extends MinimalEObjectImpl.Container implements UpdateScore
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
   * The cached value of the '{@link #getPts() <em>Pts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPts()
   * @generated
   * @ordered
   */
  protected Point pts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UpdateScoreImpl()
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
    return AssessPackage.Literals.UPDATE_SCORE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssessPackage.UPDATE_SCORE__OUTCOME, oldOutcome, outcome));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.UPDATE_SCORE__OUTCOME, oldOutcome, outcome));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessPackage.UPDATE_SCORE__PTS, oldPts, newPts);
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
        msgs = ((InternalEObject)pts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessPackage.UPDATE_SCORE__PTS, null, msgs);
      if (newPts != null)
        msgs = ((InternalEObject)newPts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssessPackage.UPDATE_SCORE__PTS, null, msgs);
      msgs = basicSetPts(newPts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.UPDATE_SCORE__PTS, newPts, newPts));
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
      case AssessPackage.UPDATE_SCORE__PTS:
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
      case AssessPackage.UPDATE_SCORE__OUTCOME:
        if (resolve) return getOutcome();
        return basicGetOutcome();
      case AssessPackage.UPDATE_SCORE__PTS:
        return getPts();
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
      case AssessPackage.UPDATE_SCORE__OUTCOME:
        setOutcome((Outcome)newValue);
        return;
      case AssessPackage.UPDATE_SCORE__PTS:
        setPts((Point)newValue);
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
      case AssessPackage.UPDATE_SCORE__OUTCOME:
        setOutcome((Outcome)null);
        return;
      case AssessPackage.UPDATE_SCORE__PTS:
        setPts((Point)null);
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
      case AssessPackage.UPDATE_SCORE__OUTCOME:
        return outcome != null;
      case AssessPackage.UPDATE_SCORE__PTS:
        return pts != null;
    }
    return super.eIsSet(featureID);
  }

} //UpdateScoreImpl
