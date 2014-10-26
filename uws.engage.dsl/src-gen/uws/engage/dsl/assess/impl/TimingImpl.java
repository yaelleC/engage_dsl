/**
 */
package uws.engage.dsl.assess.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uws.engage.dsl.assess.ActionReaction;
import uws.engage.dsl.assess.AssessPackage;
import uws.engage.dsl.assess.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.TimingImpl#isBefore <em>Before</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.TimingImpl#isAfter <em>After</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.TimingImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.TimingImpl#getTimingReactions <em>Timing Reactions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimingImpl extends MinimalEObjectImpl.Container implements Timing
{
  /**
   * The default value of the '{@link #isBefore() <em>Before</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBefore()
   * @generated
   * @ordered
   */
  protected static final boolean BEFORE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBefore() <em>Before</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBefore()
   * @generated
   * @ordered
   */
  protected boolean before = BEFORE_EDEFAULT;

  /**
   * The default value of the '{@link #isAfter() <em>After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAfter()
   * @generated
   * @ordered
   */
  protected static final boolean AFTER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAfter() <em>After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAfter()
   * @generated
   * @ordered
   */
  protected boolean after = AFTER_EDEFAULT;

  /**
   * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimit()
   * @generated
   * @ordered
   */
  protected static final int LIMIT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimit()
   * @generated
   * @ordered
   */
  protected int limit = LIMIT_EDEFAULT;

  /**
   * The cached value of the '{@link #getTimingReactions() <em>Timing Reactions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReactions()
   * @generated
   * @ordered
   */
  protected EList<ActionReaction> timingReactions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimingImpl()
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
    return AssessPackage.Literals.TIMING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBefore()
  {
    return before;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBefore(boolean newBefore)
  {
    boolean oldBefore = before;
    before = newBefore;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.TIMING__BEFORE, oldBefore, before));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAfter()
  {
    return after;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAfter(boolean newAfter)
  {
    boolean oldAfter = after;
    after = newAfter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.TIMING__AFTER, oldAfter, after));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLimit()
  {
    return limit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLimit(int newLimit)
  {
    int oldLimit = limit;
    limit = newLimit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.TIMING__LIMIT, oldLimit, limit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActionReaction> getTimingReactions()
  {
    if (timingReactions == null)
    {
      timingReactions = new EObjectContainmentEList<ActionReaction>(ActionReaction.class, this, AssessPackage.TIMING__TIMING_REACTIONS);
    }
    return timingReactions;
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
      case AssessPackage.TIMING__TIMING_REACTIONS:
        return ((InternalEList<?>)getTimingReactions()).basicRemove(otherEnd, msgs);
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
      case AssessPackage.TIMING__BEFORE:
        return isBefore();
      case AssessPackage.TIMING__AFTER:
        return isAfter();
      case AssessPackage.TIMING__LIMIT:
        return getLimit();
      case AssessPackage.TIMING__TIMING_REACTIONS:
        return getTimingReactions();
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
      case AssessPackage.TIMING__BEFORE:
        setBefore((Boolean)newValue);
        return;
      case AssessPackage.TIMING__AFTER:
        setAfter((Boolean)newValue);
        return;
      case AssessPackage.TIMING__LIMIT:
        setLimit((Integer)newValue);
        return;
      case AssessPackage.TIMING__TIMING_REACTIONS:
        getTimingReactions().clear();
        getTimingReactions().addAll((Collection<? extends ActionReaction>)newValue);
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
      case AssessPackage.TIMING__BEFORE:
        setBefore(BEFORE_EDEFAULT);
        return;
      case AssessPackage.TIMING__AFTER:
        setAfter(AFTER_EDEFAULT);
        return;
      case AssessPackage.TIMING__LIMIT:
        setLimit(LIMIT_EDEFAULT);
        return;
      case AssessPackage.TIMING__TIMING_REACTIONS:
        getTimingReactions().clear();
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
      case AssessPackage.TIMING__BEFORE:
        return before != BEFORE_EDEFAULT;
      case AssessPackage.TIMING__AFTER:
        return after != AFTER_EDEFAULT;
      case AssessPackage.TIMING__LIMIT:
        return limit != LIMIT_EDEFAULT;
      case AssessPackage.TIMING__TIMING_REACTIONS:
        return timingReactions != null && !timingReactions.isEmpty();
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
    result.append(" (before: ");
    result.append(before);
    result.append(", after: ");
    result.append(after);
    result.append(", limit: ");
    result.append(limit);
    result.append(')');
    return result.toString();
  }

} //TimingImpl
