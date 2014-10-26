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
import uws.engage.dsl.assess.ActionSequence;
import uws.engage.dsl.assess.AssessPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.ActionSequenceImpl#getAction1 <em>Action1</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.ActionSequenceImpl#isBefore <em>Before</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.ActionSequenceImpl#isAfter <em>After</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.ActionSequenceImpl#getAction2 <em>Action2</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.ActionSequenceImpl#getSequenceReactions <em>Sequence Reactions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionSequenceImpl extends MinimalEObjectImpl.Container implements ActionSequence
{
  /**
   * The default value of the '{@link #getAction1() <em>Action1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction1()
   * @generated
   * @ordered
   */
  protected static final String ACTION1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAction1() <em>Action1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction1()
   * @generated
   * @ordered
   */
  protected String action1 = ACTION1_EDEFAULT;

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
   * The default value of the '{@link #getAction2() <em>Action2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction2()
   * @generated
   * @ordered
   */
  protected static final String ACTION2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAction2() <em>Action2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction2()
   * @generated
   * @ordered
   */
  protected String action2 = ACTION2_EDEFAULT;

  /**
   * The cached value of the '{@link #getSequenceReactions() <em>Sequence Reactions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSequenceReactions()
   * @generated
   * @ordered
   */
  protected EList<ActionReaction> sequenceReactions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionSequenceImpl()
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
    return AssessPackage.Literals.ACTION_SEQUENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAction1()
  {
    return action1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction1(String newAction1)
  {
    String oldAction1 = action1;
    action1 = newAction1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.ACTION_SEQUENCE__ACTION1, oldAction1, action1));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.ACTION_SEQUENCE__BEFORE, oldBefore, before));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.ACTION_SEQUENCE__AFTER, oldAfter, after));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAction2()
  {
    return action2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction2(String newAction2)
  {
    String oldAction2 = action2;
    action2 = newAction2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.ACTION_SEQUENCE__ACTION2, oldAction2, action2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActionReaction> getSequenceReactions()
  {
    if (sequenceReactions == null)
    {
      sequenceReactions = new EObjectContainmentEList<ActionReaction>(ActionReaction.class, this, AssessPackage.ACTION_SEQUENCE__SEQUENCE_REACTIONS);
    }
    return sequenceReactions;
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
      case AssessPackage.ACTION_SEQUENCE__SEQUENCE_REACTIONS:
        return ((InternalEList<?>)getSequenceReactions()).basicRemove(otherEnd, msgs);
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
      case AssessPackage.ACTION_SEQUENCE__ACTION1:
        return getAction1();
      case AssessPackage.ACTION_SEQUENCE__BEFORE:
        return isBefore();
      case AssessPackage.ACTION_SEQUENCE__AFTER:
        return isAfter();
      case AssessPackage.ACTION_SEQUENCE__ACTION2:
        return getAction2();
      case AssessPackage.ACTION_SEQUENCE__SEQUENCE_REACTIONS:
        return getSequenceReactions();
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
      case AssessPackage.ACTION_SEQUENCE__ACTION1:
        setAction1((String)newValue);
        return;
      case AssessPackage.ACTION_SEQUENCE__BEFORE:
        setBefore((Boolean)newValue);
        return;
      case AssessPackage.ACTION_SEQUENCE__AFTER:
        setAfter((Boolean)newValue);
        return;
      case AssessPackage.ACTION_SEQUENCE__ACTION2:
        setAction2((String)newValue);
        return;
      case AssessPackage.ACTION_SEQUENCE__SEQUENCE_REACTIONS:
        getSequenceReactions().clear();
        getSequenceReactions().addAll((Collection<? extends ActionReaction>)newValue);
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
      case AssessPackage.ACTION_SEQUENCE__ACTION1:
        setAction1(ACTION1_EDEFAULT);
        return;
      case AssessPackage.ACTION_SEQUENCE__BEFORE:
        setBefore(BEFORE_EDEFAULT);
        return;
      case AssessPackage.ACTION_SEQUENCE__AFTER:
        setAfter(AFTER_EDEFAULT);
        return;
      case AssessPackage.ACTION_SEQUENCE__ACTION2:
        setAction2(ACTION2_EDEFAULT);
        return;
      case AssessPackage.ACTION_SEQUENCE__SEQUENCE_REACTIONS:
        getSequenceReactions().clear();
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
      case AssessPackage.ACTION_SEQUENCE__ACTION1:
        return ACTION1_EDEFAULT == null ? action1 != null : !ACTION1_EDEFAULT.equals(action1);
      case AssessPackage.ACTION_SEQUENCE__BEFORE:
        return before != BEFORE_EDEFAULT;
      case AssessPackage.ACTION_SEQUENCE__AFTER:
        return after != AFTER_EDEFAULT;
      case AssessPackage.ACTION_SEQUENCE__ACTION2:
        return ACTION2_EDEFAULT == null ? action2 != null : !ACTION2_EDEFAULT.equals(action2);
      case AssessPackage.ACTION_SEQUENCE__SEQUENCE_REACTIONS:
        return sequenceReactions != null && !sequenceReactions.isEmpty();
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
    result.append(" (action1: ");
    result.append(action1);
    result.append(", before: ");
    result.append(before);
    result.append(", after: ");
    result.append(after);
    result.append(", action2: ");
    result.append(action2);
    result.append(')');
    return result.toString();
  }

} //ActionSequenceImpl
