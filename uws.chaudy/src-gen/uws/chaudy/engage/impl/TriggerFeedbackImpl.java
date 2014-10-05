/**
 */
package uws.chaudy.engage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uws.chaudy.engage.EngagePackage;
import uws.chaudy.engage.Feedback;
import uws.chaudy.engage.TriggerFeedback;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Feedback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.chaudy.engage.impl.TriggerFeedbackImpl#getFeedback <em>Feedback</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerFeedbackImpl extends MinimalEObjectImpl.Container implements TriggerFeedback
{
  /**
   * The cached value of the '{@link #getFeedback() <em>Feedback</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeedback()
   * @generated
   * @ordered
   */
  protected Feedback feedback;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TriggerFeedbackImpl()
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
    return EngagePackage.Literals.TRIGGER_FEEDBACK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feedback getFeedback()
  {
    if (feedback != null && feedback.eIsProxy())
    {
      InternalEObject oldFeedback = (InternalEObject)feedback;
      feedback = (Feedback)eResolveProxy(oldFeedback);
      if (feedback != oldFeedback)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngagePackage.TRIGGER_FEEDBACK__FEEDBACK, oldFeedback, feedback));
      }
    }
    return feedback;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feedback basicGetFeedback()
  {
    return feedback;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeedback(Feedback newFeedback)
  {
    Feedback oldFeedback = feedback;
    feedback = newFeedback;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EngagePackage.TRIGGER_FEEDBACK__FEEDBACK, oldFeedback, feedback));
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
      case EngagePackage.TRIGGER_FEEDBACK__FEEDBACK:
        if (resolve) return getFeedback();
        return basicGetFeedback();
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
      case EngagePackage.TRIGGER_FEEDBACK__FEEDBACK:
        setFeedback((Feedback)newValue);
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
      case EngagePackage.TRIGGER_FEEDBACK__FEEDBACK:
        setFeedback((Feedback)null);
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
      case EngagePackage.TRIGGER_FEEDBACK__FEEDBACK:
        return feedback != null;
    }
    return super.eIsSet(featureID);
  }

} //TriggerFeedbackImpl
