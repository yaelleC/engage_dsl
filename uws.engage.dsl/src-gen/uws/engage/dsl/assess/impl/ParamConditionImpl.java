/**
 */
package uws.engage.dsl.assess.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uws.engage.dsl.assess.AssessPackage;
import uws.engage.dsl.assess.ParamCondition;
import uws.engage.dsl.assess.Params;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.ParamConditionImpl#getParams <em>Params</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.ParamConditionImpl#isConditionOther <em>Condition Other</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParamConditionImpl extends MinimalEObjectImpl.Container implements ParamCondition
{
  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected Params params;

  /**
   * The default value of the '{@link #isConditionOther() <em>Condition Other</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConditionOther()
   * @generated
   * @ordered
   */
  protected static final boolean CONDITION_OTHER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isConditionOther() <em>Condition Other</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConditionOther()
   * @generated
   * @ordered
   */
  protected boolean conditionOther = CONDITION_OTHER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParamConditionImpl()
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
    return AssessPackage.Literals.PARAM_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Params getParams()
  {
    if (params != null && params.eIsProxy())
    {
      InternalEObject oldParams = (InternalEObject)params;
      params = (Params)eResolveProxy(oldParams);
      if (params != oldParams)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssessPackage.PARAM_CONDITION__PARAMS, oldParams, params));
      }
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Params basicGetParams()
  {
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParams(Params newParams)
  {
    Params oldParams = params;
    params = newParams;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.PARAM_CONDITION__PARAMS, oldParams, params));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isConditionOther()
  {
    return conditionOther;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditionOther(boolean newConditionOther)
  {
    boolean oldConditionOther = conditionOther;
    conditionOther = newConditionOther;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.PARAM_CONDITION__CONDITION_OTHER, oldConditionOther, conditionOther));
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
      case AssessPackage.PARAM_CONDITION__PARAMS:
        if (resolve) return getParams();
        return basicGetParams();
      case AssessPackage.PARAM_CONDITION__CONDITION_OTHER:
        return isConditionOther();
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
      case AssessPackage.PARAM_CONDITION__PARAMS:
        setParams((Params)newValue);
        return;
      case AssessPackage.PARAM_CONDITION__CONDITION_OTHER:
        setConditionOther((Boolean)newValue);
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
      case AssessPackage.PARAM_CONDITION__PARAMS:
        setParams((Params)null);
        return;
      case AssessPackage.PARAM_CONDITION__CONDITION_OTHER:
        setConditionOther(CONDITION_OTHER_EDEFAULT);
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
      case AssessPackage.PARAM_CONDITION__PARAMS:
        return params != null;
      case AssessPackage.PARAM_CONDITION__CONDITION_OTHER:
        return conditionOther != CONDITION_OTHER_EDEFAULT;
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
    result.append(" (conditionOther: ");
    result.append(conditionOther);
    result.append(')');
    return result.toString();
  }

} //ParamConditionImpl
