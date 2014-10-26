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
import uws.engage.dsl.assess.LearningOutcomes;
import uws.engage.dsl.assess.Outcome;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Learning Outcomes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.LearningOutcomesImpl#getOutcomes <em>Outcomes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LearningOutcomesImpl extends MinimalEObjectImpl.Container implements LearningOutcomes
{
  /**
   * The cached value of the '{@link #getOutcomes() <em>Outcomes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutcomes()
   * @generated
   * @ordered
   */
  protected EList<Outcome> outcomes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LearningOutcomesImpl()
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
    return AssessPackage.Literals.LEARNING_OUTCOMES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Outcome> getOutcomes()
  {
    if (outcomes == null)
    {
      outcomes = new EObjectContainmentEList<Outcome>(Outcome.class, this, AssessPackage.LEARNING_OUTCOMES__OUTCOMES);
    }
    return outcomes;
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
      case AssessPackage.LEARNING_OUTCOMES__OUTCOMES:
        return ((InternalEList<?>)getOutcomes()).basicRemove(otherEnd, msgs);
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
      case AssessPackage.LEARNING_OUTCOMES__OUTCOMES:
        return getOutcomes();
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
      case AssessPackage.LEARNING_OUTCOMES__OUTCOMES:
        getOutcomes().clear();
        getOutcomes().addAll((Collection<? extends Outcome>)newValue);
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
      case AssessPackage.LEARNING_OUTCOMES__OUTCOMES:
        getOutcomes().clear();
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
      case AssessPackage.LEARNING_OUTCOMES__OUTCOMES:
        return outcomes != null && !outcomes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LearningOutcomesImpl
