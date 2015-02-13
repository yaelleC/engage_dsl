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
import uws.engage.dsl.assess.BadgeModel;
import uws.engage.dsl.assess.GenericTrigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Badge Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.BadgeModelImpl#getGenericTriggers <em>Generic Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BadgeModelImpl extends MinimalEObjectImpl.Container implements BadgeModel
{
  /**
   * The cached value of the '{@link #getGenericTriggers() <em>Generic Triggers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericTriggers()
   * @generated
   * @ordered
   */
  protected EList<GenericTrigger> genericTriggers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BadgeModelImpl()
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
    return AssessPackage.Literals.BADGE_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GenericTrigger> getGenericTriggers()
  {
    if (genericTriggers == null)
    {
      genericTriggers = new EObjectContainmentEList<GenericTrigger>(GenericTrigger.class, this, AssessPackage.BADGE_MODEL__GENERIC_TRIGGERS);
    }
    return genericTriggers;
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
      case AssessPackage.BADGE_MODEL__GENERIC_TRIGGERS:
        return ((InternalEList<?>)getGenericTriggers()).basicRemove(otherEnd, msgs);
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
      case AssessPackage.BADGE_MODEL__GENERIC_TRIGGERS:
        return getGenericTriggers();
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
      case AssessPackage.BADGE_MODEL__GENERIC_TRIGGERS:
        getGenericTriggers().clear();
        getGenericTriggers().addAll((Collection<? extends GenericTrigger>)newValue);
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
      case AssessPackage.BADGE_MODEL__GENERIC_TRIGGERS:
        getGenericTriggers().clear();
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
      case AssessPackage.BADGE_MODEL__GENERIC_TRIGGERS:
        return genericTriggers != null && !genericTriggers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BadgeModelImpl
