/**
 */
package uws.chaudy.engage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uws.chaudy.engage.EngagePackage;
import uws.chaudy.engage.Feedback;
import uws.chaudy.engage.FeedbackMessages;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feedback Messages</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.chaudy.engage.impl.FeedbackMessagesImpl#getFeedbackMsgs <em>Feedback Msgs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeedbackMessagesImpl extends MinimalEObjectImpl.Container implements FeedbackMessages
{
  /**
   * The cached value of the '{@link #getFeedbackMsgs() <em>Feedback Msgs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeedbackMsgs()
   * @generated
   * @ordered
   */
  protected EList<Feedback> feedbackMsgs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeedbackMessagesImpl()
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
    return EngagePackage.Literals.FEEDBACK_MESSAGES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feedback> getFeedbackMsgs()
  {
    if (feedbackMsgs == null)
    {
      feedbackMsgs = new EObjectContainmentEList<Feedback>(Feedback.class, this, EngagePackage.FEEDBACK_MESSAGES__FEEDBACK_MSGS);
    }
    return feedbackMsgs;
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
      case EngagePackage.FEEDBACK_MESSAGES__FEEDBACK_MSGS:
        return ((InternalEList<?>)getFeedbackMsgs()).basicRemove(otherEnd, msgs);
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
      case EngagePackage.FEEDBACK_MESSAGES__FEEDBACK_MSGS:
        return getFeedbackMsgs();
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
      case EngagePackage.FEEDBACK_MESSAGES__FEEDBACK_MSGS:
        getFeedbackMsgs().clear();
        getFeedbackMsgs().addAll((Collection<? extends Feedback>)newValue);
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
      case EngagePackage.FEEDBACK_MESSAGES__FEEDBACK_MSGS:
        getFeedbackMsgs().clear();
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
      case EngagePackage.FEEDBACK_MESSAGES__FEEDBACK_MSGS:
        return feedbackMsgs != null && !feedbackMsgs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FeedbackMessagesImpl
