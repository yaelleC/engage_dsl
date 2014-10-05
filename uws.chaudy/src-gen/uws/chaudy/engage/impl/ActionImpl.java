/**
 */
package uws.chaudy.engage.impl;

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

import uws.chaudy.engage.Action;
import uws.chaudy.engage.EngagePackage;
import uws.chaudy.engage.Parameter;
import uws.chaudy.engage.Points;
import uws.chaudy.engage.Reactions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.chaudy.engage.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link uws.chaudy.engage.impl.ActionImpl#getParams <em>Params</em>}</li>
 *   <li>{@link uws.chaudy.engage.impl.ActionImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link uws.chaudy.engage.impl.ActionImpl#getReactions <em>Reactions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Parameter> params;

  /**
   * The cached value of the '{@link #getPoints() <em>Points</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPoints()
   * @generated
   * @ordered
   */
  protected EList<Points> points;

  /**
   * The cached value of the '{@link #getReactions() <em>Reactions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReactions()
   * @generated
   * @ordered
   */
  protected Reactions reactions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return EngagePackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EngagePackage.ACTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<Parameter>(Parameter.class, this, EngagePackage.ACTION__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Points> getPoints()
  {
    if (points == null)
    {
      points = new EObjectContainmentEList<Points>(Points.class, this, EngagePackage.ACTION__POINTS);
    }
    return points;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reactions getReactions()
  {
    return reactions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReactions(Reactions newReactions, NotificationChain msgs)
  {
    Reactions oldReactions = reactions;
    reactions = newReactions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EngagePackage.ACTION__REACTIONS, oldReactions, newReactions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReactions(Reactions newReactions)
  {
    if (newReactions != reactions)
    {
      NotificationChain msgs = null;
      if (reactions != null)
        msgs = ((InternalEObject)reactions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EngagePackage.ACTION__REACTIONS, null, msgs);
      if (newReactions != null)
        msgs = ((InternalEObject)newReactions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EngagePackage.ACTION__REACTIONS, null, msgs);
      msgs = basicSetReactions(newReactions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EngagePackage.ACTION__REACTIONS, newReactions, newReactions));
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
      case EngagePackage.ACTION__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case EngagePackage.ACTION__POINTS:
        return ((InternalEList<?>)getPoints()).basicRemove(otherEnd, msgs);
      case EngagePackage.ACTION__REACTIONS:
        return basicSetReactions(null, msgs);
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
      case EngagePackage.ACTION__NAME:
        return getName();
      case EngagePackage.ACTION__PARAMS:
        return getParams();
      case EngagePackage.ACTION__POINTS:
        return getPoints();
      case EngagePackage.ACTION__REACTIONS:
        return getReactions();
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
      case EngagePackage.ACTION__NAME:
        setName((String)newValue);
        return;
      case EngagePackage.ACTION__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Parameter>)newValue);
        return;
      case EngagePackage.ACTION__POINTS:
        getPoints().clear();
        getPoints().addAll((Collection<? extends Points>)newValue);
        return;
      case EngagePackage.ACTION__REACTIONS:
        setReactions((Reactions)newValue);
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
      case EngagePackage.ACTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EngagePackage.ACTION__PARAMS:
        getParams().clear();
        return;
      case EngagePackage.ACTION__POINTS:
        getPoints().clear();
        return;
      case EngagePackage.ACTION__REACTIONS:
        setReactions((Reactions)null);
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
      case EngagePackage.ACTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EngagePackage.ACTION__PARAMS:
        return params != null && !params.isEmpty();
      case EngagePackage.ACTION__POINTS:
        return points != null && !points.isEmpty();
      case EngagePackage.ACTION__REACTIONS:
        return reactions != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ActionImpl
