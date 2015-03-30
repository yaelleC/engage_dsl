/**
 */
package uws.engage.dsl.assess.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import uws.engage.dsl.assess.AssessPackage;
import uws.engage.dsl.assess.ParamIn;
import uws.engage.dsl.assess.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.ParamInImpl#getParam <em>Param</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.ParamInImpl#getValuesPoss <em>Values Poss</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParamInImpl extends MinimalEObjectImpl.Container implements ParamIn
{
  /**
   * The cached value of the '{@link #getParam() <em>Param</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected Parameter param;

  /**
   * The cached value of the '{@link #getValuesPoss() <em>Values Poss</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValuesPoss()
   * @generated
   * @ordered
   */
  protected EList<String> valuesPoss;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParamInImpl()
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
    return AssessPackage.Literals.PARAM_IN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getParam()
  {
    if (param != null && param.eIsProxy())
    {
      InternalEObject oldParam = (InternalEObject)param;
      param = (Parameter)eResolveProxy(oldParam);
      if (param != oldParam)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssessPackage.PARAM_IN__PARAM, oldParam, param));
      }
    }
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter basicGetParam()
  {
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParam(Parameter newParam)
  {
    Parameter oldParam = param;
    param = newParam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.PARAM_IN__PARAM, oldParam, param));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getValuesPoss()
  {
    if (valuesPoss == null)
    {
      valuesPoss = new EDataTypeEList<String>(String.class, this, AssessPackage.PARAM_IN__VALUES_POSS);
    }
    return valuesPoss;
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
      case AssessPackage.PARAM_IN__PARAM:
        if (resolve) return getParam();
        return basicGetParam();
      case AssessPackage.PARAM_IN__VALUES_POSS:
        return getValuesPoss();
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
      case AssessPackage.PARAM_IN__PARAM:
        setParam((Parameter)newValue);
        return;
      case AssessPackage.PARAM_IN__VALUES_POSS:
        getValuesPoss().clear();
        getValuesPoss().addAll((Collection<? extends String>)newValue);
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
      case AssessPackage.PARAM_IN__PARAM:
        setParam((Parameter)null);
        return;
      case AssessPackage.PARAM_IN__VALUES_POSS:
        getValuesPoss().clear();
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
      case AssessPackage.PARAM_IN__PARAM:
        return param != null;
      case AssessPackage.PARAM_IN__VALUES_POSS:
        return valuesPoss != null && !valuesPoss.isEmpty();
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
    result.append(" (valuesPoss: ");
    result.append(valuesPoss);
    result.append(')');
    return result.toString();
  }

} //ParamInImpl
