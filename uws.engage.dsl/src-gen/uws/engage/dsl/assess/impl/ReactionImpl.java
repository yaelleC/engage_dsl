/**
 */
package uws.engage.dsl.assess.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uws.engage.dsl.assess.AssessPackage;
import uws.engage.dsl.assess.Feedback;
import uws.engage.dsl.assess.ParamCondition;
import uws.engage.dsl.assess.PointsCondition;
import uws.engage.dsl.assess.Reaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.ReactionImpl#getParamsC <em>Params C</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.ReactionImpl#getPointsC <em>Points C</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.ReactionImpl#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.ReactionImpl#isImmediate <em>Immediate</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.ReactionImpl#isDelayed <em>Delayed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReactionImpl extends MinimalEObjectImpl.Container implements Reaction
{
  /**
   * The cached value of the '{@link #getParamsC() <em>Params C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamsC()
   * @generated
   * @ordered
   */
  protected ParamCondition paramsC;

  /**
   * The cached value of the '{@link #getPointsC() <em>Points C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointsC()
   * @generated
   * @ordered
   */
  protected PointsCondition pointsC;

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
  protected ReactionImpl()
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
    return AssessPackage.Literals.REACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamCondition getParamsC()
  {
    return paramsC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParamsC(ParamCondition newParamsC, NotificationChain msgs)
  {
    ParamCondition oldParamsC = paramsC;
    paramsC = newParamsC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessPackage.REACTION__PARAMS_C, oldParamsC, newParamsC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParamsC(ParamCondition newParamsC)
  {
    if (newParamsC != paramsC)
    {
      NotificationChain msgs = null;
      if (paramsC != null)
        msgs = ((InternalEObject)paramsC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessPackage.REACTION__PARAMS_C, null, msgs);
      if (newParamsC != null)
        msgs = ((InternalEObject)newParamsC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssessPackage.REACTION__PARAMS_C, null, msgs);
      msgs = basicSetParamsC(newParamsC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.REACTION__PARAMS_C, newParamsC, newParamsC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointsCondition getPointsC()
  {
    return pointsC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPointsC(PointsCondition newPointsC, NotificationChain msgs)
  {
    PointsCondition oldPointsC = pointsC;
    pointsC = newPointsC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessPackage.REACTION__POINTS_C, oldPointsC, newPointsC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPointsC(PointsCondition newPointsC)
  {
    if (newPointsC != pointsC)
    {
      NotificationChain msgs = null;
      if (pointsC != null)
        msgs = ((InternalEObject)pointsC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessPackage.REACTION__POINTS_C, null, msgs);
      if (newPointsC != null)
        msgs = ((InternalEObject)newPointsC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssessPackage.REACTION__POINTS_C, null, msgs);
      msgs = basicSetPointsC(newPointsC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.REACTION__POINTS_C, newPointsC, newPointsC));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssessPackage.REACTION__FEEDBACK, oldFeedback, feedback));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.REACTION__FEEDBACK, oldFeedback, feedback));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.REACTION__IMMEDIATE, oldImmediate, immediate));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.REACTION__DELAYED, oldDelayed, delayed));
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
      case AssessPackage.REACTION__PARAMS_C:
        return basicSetParamsC(null, msgs);
      case AssessPackage.REACTION__POINTS_C:
        return basicSetPointsC(null, msgs);
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
      case AssessPackage.REACTION__PARAMS_C:
        return getParamsC();
      case AssessPackage.REACTION__POINTS_C:
        return getPointsC();
      case AssessPackage.REACTION__FEEDBACK:
        if (resolve) return getFeedback();
        return basicGetFeedback();
      case AssessPackage.REACTION__IMMEDIATE:
        return isImmediate();
      case AssessPackage.REACTION__DELAYED:
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
      case AssessPackage.REACTION__PARAMS_C:
        setParamsC((ParamCondition)newValue);
        return;
      case AssessPackage.REACTION__POINTS_C:
        setPointsC((PointsCondition)newValue);
        return;
      case AssessPackage.REACTION__FEEDBACK:
        setFeedback((Feedback)newValue);
        return;
      case AssessPackage.REACTION__IMMEDIATE:
        setImmediate((Boolean)newValue);
        return;
      case AssessPackage.REACTION__DELAYED:
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
      case AssessPackage.REACTION__PARAMS_C:
        setParamsC((ParamCondition)null);
        return;
      case AssessPackage.REACTION__POINTS_C:
        setPointsC((PointsCondition)null);
        return;
      case AssessPackage.REACTION__FEEDBACK:
        setFeedback((Feedback)null);
        return;
      case AssessPackage.REACTION__IMMEDIATE:
        setImmediate(IMMEDIATE_EDEFAULT);
        return;
      case AssessPackage.REACTION__DELAYED:
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
      case AssessPackage.REACTION__PARAMS_C:
        return paramsC != null;
      case AssessPackage.REACTION__POINTS_C:
        return pointsC != null;
      case AssessPackage.REACTION__FEEDBACK:
        return feedback != null;
      case AssessPackage.REACTION__IMMEDIATE:
        return immediate != IMMEDIATE_EDEFAULT;
      case AssessPackage.REACTION__DELAYED:
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

} //ReactionImpl
