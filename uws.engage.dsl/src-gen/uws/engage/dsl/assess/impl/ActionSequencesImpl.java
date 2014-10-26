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

import uws.engage.dsl.assess.ActionSequence;
import uws.engage.dsl.assess.ActionSequences;
import uws.engage.dsl.assess.AssessPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Sequences</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.ActionSequencesImpl#getActionSequences <em>Action Sequences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionSequencesImpl extends MinimalEObjectImpl.Container implements ActionSequences
{
  /**
   * The cached value of the '{@link #getActionSequences() <em>Action Sequences</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionSequences()
   * @generated
   * @ordered
   */
  protected EList<ActionSequence> actionSequences;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionSequencesImpl()
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
    return AssessPackage.Literals.ACTION_SEQUENCES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActionSequence> getActionSequences()
  {
    if (actionSequences == null)
    {
      actionSequences = new EObjectContainmentEList<ActionSequence>(ActionSequence.class, this, AssessPackage.ACTION_SEQUENCES__ACTION_SEQUENCES);
    }
    return actionSequences;
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
      case AssessPackage.ACTION_SEQUENCES__ACTION_SEQUENCES:
        return ((InternalEList<?>)getActionSequences()).basicRemove(otherEnd, msgs);
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
      case AssessPackage.ACTION_SEQUENCES__ACTION_SEQUENCES:
        return getActionSequences();
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
      case AssessPackage.ACTION_SEQUENCES__ACTION_SEQUENCES:
        getActionSequences().clear();
        getActionSequences().addAll((Collection<? extends ActionSequence>)newValue);
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
      case AssessPackage.ACTION_SEQUENCES__ACTION_SEQUENCES:
        getActionSequences().clear();
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
      case AssessPackage.ACTION_SEQUENCES__ACTION_SEQUENCES:
        return actionSequences != null && !actionSequences.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActionSequencesImpl
