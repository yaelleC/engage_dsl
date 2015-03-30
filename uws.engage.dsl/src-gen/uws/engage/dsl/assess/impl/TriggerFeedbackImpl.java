/**
 */
package uws.engage.dsl.assess.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uws.engage.dsl.assess.AssessPackage;
import uws.engage.dsl.assess.Feedback;
import uws.engage.dsl.assess.TriggerFeedback;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Feedback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.TriggerFeedbackImpl#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.TriggerFeedbackImpl#isImmediate <em>Immediate</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.TriggerFeedbackImpl#isDelayed <em>Delayed</em>}</li>
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
   * The default value of the '{@link #isImmediate() <em>Immediate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isImmediate()
   * @generated
   * @ordered
   */
  protected static final boolean IMMEDIATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isImmediate() <em>Immediate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isImmediate()
   * @generated
   * @ordered
   */
  protected boolean immediate = IMMEDIATE_EDEFAULT;

  /**
   * The default value of the '{@link #isDelayed() <em>Delayed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDelayed()
   * @generated
   * @ordered
   */
  protected static final boolean DELAYED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDelayed() <em>Delayed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDelayed()
   * @generated
   * @ordered
   */
  protected boolean delayed = DELAYED_EDEFAULT;

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
    return AssessPackage.Literals.TRIGGER_FEEDBACK;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssessPackage.TRIGGER_FEEDBACK__FEEDBACK, oldFeedback, feedback));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.TRIGGER_FEEDBACK__FEEDBACK, oldFeedback, feedback));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isImmediate()
  {
    return immediate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImmediate(boolean newImmediate)
  {
    boolean oldImmediate = immediate;
    immediate = newImmediate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.TRIGGER_FEEDBACK__IMMEDIATE, oldImmediate, immediate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDelayed()
  {
    return delayed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelayed(boolean newDelayed)
  {
    boolean oldDelayed = delayed;
    delayed = newDelayed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.TRIGGER_FEEDBACK__DELAYED, oldDelayed, delayed));
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
      case AssessPackage.TRIGGER_FEEDBACK__FEEDBACK:
        if (resolve) return getFeedback();
        return basicGetFeedback();
      case AssessPackage.TRIGGER_FEEDBACK__IMMEDIATE:
        return isImmediate();
      case AssessPackage.TRIGGER_FEEDBACK__DELAYED:
        return isDelayed();
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
      case AssessPackage.TRIGGER_FEEDBACK__FEEDBACK:
        setFeedback((Feedback)newValue);
        return;
      case AssessPackage.TRIGGER_FEEDBACK__IMMEDIATE:
        setImmediate((Boolean)newValue);
        return;
      case AssessPackage.TRIGGER_FEEDBACK__DELAYED:
        setDelayed((Boolean)newValue);
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
      case AssessPackage.TRIGGER_FEEDBACK__FEEDBACK:
        setFeedback((Feedback)null);
        return;
      case AssessPackage.TRIGGER_FEEDBACK__IMMEDIATE:
        setImmediate(IMMEDIATE_EDEFAULT);
        return;
      case AssessPackage.TRIGGER_FEEDBACK__DELAYED:
        setDelayed(DELAYED_EDEFAULT);
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
      case AssessPackage.TRIGGER_FEEDBACK__FEEDBACK:
        return feedback != null;
      case AssessPackage.TRIGGER_FEEDBACK__IMMEDIATE:
        return immediate != IMMEDIATE_EDEFAULT;
      case AssessPackage.TRIGGER_FEEDBACK__DELAYED:
        return delayed != DELAYED_EDEFAULT;
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
    result.append(" (immediate: ");
    result.append(immediate);
    result.append(", delayed: ");
    result.append(delayed);
    result.append(')');
    return result.toString();
  }

} //TriggerFeedbackImpl
