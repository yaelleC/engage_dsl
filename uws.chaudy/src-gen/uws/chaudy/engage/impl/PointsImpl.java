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

import uws.chaudy.engage.EngagePackage;
import uws.chaudy.engage.Outcome;
import uws.chaudy.engage.Params;
import uws.chaudy.engage.Point;
import uws.chaudy.engage.Points;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Points</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.chaudy.engage.impl.PointsImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link uws.chaudy.engage.impl.PointsImpl#getPts <em>Pts</em>}</li>
 *   <li>{@link uws.chaudy.engage.impl.PointsImpl#isOthers <em>Others</em>}</li>
 *   <li>{@link uws.chaudy.engage.impl.PointsImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointsImpl extends MinimalEObjectImpl.Container implements Points
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
   * The default value of the '{@link #isOthers() <em>Others</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOthers()
   * @generated
   * @ordered
   */
  protected static final boolean OTHERS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOthers() <em>Others</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOthers()
   * @generated
   * @ordered
   */
  protected boolean others = OTHERS_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Params> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PointsImpl()
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
    return EngagePackage.Literals.POINTS;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngagePackage.POINTS__OUTCOME, oldOutcome, outcome));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EngagePackage.POINTS__OUTCOME, oldOutcome, outcome));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EngagePackage.POINTS__PTS, oldPts, newPts);
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
        msgs = ((InternalEObject)pts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EngagePackage.POINTS__PTS, null, msgs);
      if (newPts != null)
        msgs = ((InternalEObject)newPts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EngagePackage.POINTS__PTS, null, msgs);
      msgs = basicSetPts(newPts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EngagePackage.POINTS__PTS, newPts, newPts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOthers()
  {
    return others;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOthers(boolean newOthers)
  {
    boolean oldOthers = others;
    others = newOthers;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EngagePackage.POINTS__OTHERS, oldOthers, others));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Params> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<Params>(Params.class, this, EngagePackage.POINTS__PARAMS);
    }
    return params;
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
      case EngagePackage.POINTS__PTS:
        return basicSetPts(null, msgs);
      case EngagePackage.POINTS__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
      case EngagePackage.POINTS__OUTCOME:
        if (resolve) return getOutcome();
        return basicGetOutcome();
      case EngagePackage.POINTS__PTS:
        return getPts();
      case EngagePackage.POINTS__OTHERS:
        return isOthers();
      case EngagePackage.POINTS__PARAMS:
        return getParams();
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
      case EngagePackage.POINTS__OUTCOME:
        setOutcome((Outcome)newValue);
        return;
      case EngagePackage.POINTS__PTS:
        setPts((Point)newValue);
        return;
      case EngagePackage.POINTS__OTHERS:
        setOthers((Boolean)newValue);
        return;
      case EngagePackage.POINTS__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Params>)newValue);
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
      case EngagePackage.POINTS__OUTCOME:
        setOutcome((Outcome)null);
        return;
      case EngagePackage.POINTS__PTS:
        setPts((Point)null);
        return;
      case EngagePackage.POINTS__OTHERS:
        setOthers(OTHERS_EDEFAULT);
        return;
      case EngagePackage.POINTS__PARAMS:
        getParams().clear();
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
      case EngagePackage.POINTS__OUTCOME:
        return outcome != null;
      case EngagePackage.POINTS__PTS:
        return pts != null;
      case EngagePackage.POINTS__OTHERS:
        return others != OTHERS_EDEFAULT;
      case EngagePackage.POINTS__PARAMS:
        return params != null && !params.isEmpty();
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
    result.append(" (others: ");
    result.append(others);
    result.append(')');
    return result.toString();
  }

} //PointsImpl
