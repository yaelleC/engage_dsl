/**
 */
package uws.chaudy.engage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uws.chaudy.engage.EngagePackage;
import uws.chaudy.engage.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.chaudy.engage.impl.TypeImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link uws.chaudy.engage.impl.TypeImpl#getEnumType <em>Enum Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type
{
  /**
   * The default value of the '{@link #getSimpleType() <em>Simple Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleType()
   * @generated
   * @ordered
   */
  protected static final String SIMPLE_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSimpleType() <em>Simple Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleType()
   * @generated
   * @ordered
   */
  protected String simpleType = SIMPLE_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getEnumType() <em>Enum Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumType()
   * @generated
   * @ordered
   */
  protected uws.chaudy.engage.Enum enumType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
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
    return EngagePackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSimpleType()
  {
    return simpleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimpleType(String newSimpleType)
  {
    String oldSimpleType = simpleType;
    simpleType = newSimpleType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EngagePackage.TYPE__SIMPLE_TYPE, oldSimpleType, simpleType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public uws.chaudy.engage.Enum getEnumType()
  {
    return enumType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnumType(uws.chaudy.engage.Enum newEnumType, NotificationChain msgs)
  {
    uws.chaudy.engage.Enum oldEnumType = enumType;
    enumType = newEnumType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EngagePackage.TYPE__ENUM_TYPE, oldEnumType, newEnumType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumType(uws.chaudy.engage.Enum newEnumType)
  {
    if (newEnumType != enumType)
    {
      NotificationChain msgs = null;
      if (enumType != null)
        msgs = ((InternalEObject)enumType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EngagePackage.TYPE__ENUM_TYPE, null, msgs);
      if (newEnumType != null)
        msgs = ((InternalEObject)newEnumType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EngagePackage.TYPE__ENUM_TYPE, null, msgs);
      msgs = basicSetEnumType(newEnumType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EngagePackage.TYPE__ENUM_TYPE, newEnumType, newEnumType));
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
      case EngagePackage.TYPE__ENUM_TYPE:
        return basicSetEnumType(null, msgs);
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
      case EngagePackage.TYPE__SIMPLE_TYPE:
        return getSimpleType();
      case EngagePackage.TYPE__ENUM_TYPE:
        return getEnumType();
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
      case EngagePackage.TYPE__SIMPLE_TYPE:
        setSimpleType((String)newValue);
        return;
      case EngagePackage.TYPE__ENUM_TYPE:
        setEnumType((uws.chaudy.engage.Enum)newValue);
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
      case EngagePackage.TYPE__SIMPLE_TYPE:
        setSimpleType(SIMPLE_TYPE_EDEFAULT);
        return;
      case EngagePackage.TYPE__ENUM_TYPE:
        setEnumType((uws.chaudy.engage.Enum)null);
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
      case EngagePackage.TYPE__SIMPLE_TYPE:
        return SIMPLE_TYPE_EDEFAULT == null ? simpleType != null : !SIMPLE_TYPE_EDEFAULT.equals(simpleType);
      case EngagePackage.TYPE__ENUM_TYPE:
        return enumType != null;
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
    result.append(" (simpleType: ");
    result.append(simpleType);
    result.append(')');
    return result.toString();
  }

} //TypeImpl
