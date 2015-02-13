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
import uws.engage.dsl.assess.OutcomesPoints;
import uws.engage.dsl.assess.Params;
import uws.engage.dsl.assess.Points;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Points</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.PointsImpl#getOutcomesPoints <em>Outcomes Points</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.PointsImpl#isOthers <em>Others</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.PointsImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointsImpl extends MinimalEObjectImpl.Container implements Points
{
  /**
   * The cached value of the '{@link #getOutcomesPoints() <em>Outcomes Points</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutcomesPoints()
   * @generated
   * @ordered
   */
  protected EList<OutcomesPoints> outcomesPoints;

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
    return AssessPackage.Literals.POINTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OutcomesPoints> getOutcomesPoints()
  {
    if (outcomesPoints == null)
    {
      outcomesPoints = new EObjectContainmentEList<OutcomesPoints>(OutcomesPoints.class, this, AssessPackage.POINTS__OUTCOMES_POINTS);
    }
    return outcomesPoints;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.POINTS__OTHERS, oldOthers, others));
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
      params = new EObjectContainmentEList<Params>(Params.class, this, AssessPackage.POINTS__PARAMS);
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
      case AssessPackage.POINTS__OUTCOMES_POINTS:
        return ((InternalEList<?>)getOutcomesPoints()).basicRemove(otherEnd, msgs);
      case AssessPackage.POINTS__PARAMS:
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
      case AssessPackage.POINTS__OUTCOMES_POINTS:
        return getOutcomesPoints();
      case AssessPackage.POINTS__OTHERS:
        return isOthers();
      case AssessPackage.POINTS__PARAMS:
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
      case AssessPackage.POINTS__OUTCOMES_POINTS:
        getOutcomesPoints().clear();
        getOutcomesPoints().addAll((Collection<? extends OutcomesPoints>)newValue);
        return;
      case AssessPackage.POINTS__OTHERS:
        setOthers((Boolean)newValue);
        return;
      case AssessPackage.POINTS__PARAMS:
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
      case AssessPackage.POINTS__OUTCOMES_POINTS:
        getOutcomesPoints().clear();
        return;
      case AssessPackage.POINTS__OTHERS:
        setOthers(OTHERS_EDEFAULT);
        return;
      case AssessPackage.POINTS__PARAMS:
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
      case AssessPackage.POINTS__OUTCOMES_POINTS:
        return outcomesPoints != null && !outcomesPoints.isEmpty();
      case AssessPackage.POINTS__OTHERS:
        return others != OTHERS_EDEFAULT;
      case AssessPackage.POINTS__PARAMS:
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
