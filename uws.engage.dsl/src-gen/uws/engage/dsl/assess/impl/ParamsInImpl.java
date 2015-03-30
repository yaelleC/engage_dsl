/**
 */
package uws.engage.dsl.assess.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uws.engage.dsl.assess.AssessPackage;
import uws.engage.dsl.assess.ParamIn;
import uws.engage.dsl.assess.ParamsIn;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Params In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.ParamsInImpl#getParamIn <em>Param In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParamsInImpl extends MinimalEObjectImpl.Container implements ParamsIn
{
  /**
   * The cached value of the '{@link #getParamIn() <em>Param In</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamIn()
   * @generated
   * @ordered
   */
  protected EList<ParamIn> paramIn;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParamsInImpl()
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
    return AssessPackage.Literals.PARAMS_IN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParamIn> getParamIn()
  {
    if (paramIn == null)
    {
      paramIn = new EObjectContainmentEList<ParamIn>(ParamIn.class, this, AssessPackage.PARAMS_IN__PARAM_IN);
    }
    return paramIn;
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
      case AssessPackage.PARAMS_IN__PARAM_IN:
        return ((InternalEList<?>)getParamIn()).basicRemove(otherEnd, msgs);
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
      case AssessPackage.PARAMS_IN__PARAM_IN:
        return getParamIn();
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
      case AssessPackage.PARAMS_IN__PARAM_IN:
        getParamIn().clear();
        getParamIn().addAll((Collection<? extends ParamIn>)newValue);
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
      case AssessPackage.PARAMS_IN__PARAM_IN:
        getParamIn().clear();
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
      case AssessPackage.PARAMS_IN__PARAM_IN:
        return paramIn != null && !paramIn.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ParamsInImpl
