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
import uws.chaudy.engage.Point;
import uws.chaudy.engage.PointsCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Points Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.chaudy.engage.impl.PointsConditionImpl#getKeyWd <em>Key Wd</em>}</li>
 *   <li>{@link uws.chaudy.engage.impl.PointsConditionImpl#getSign <em>Sign</em>}</li>
 *   <li>{@link uws.chaudy.engage.impl.PointsConditionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointsConditionImpl extends MinimalEObjectImpl.Container implements PointsCondition
{
  /**
   * The default value of the '{@link #getKeyWd() <em>Key Wd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyWd()
   * @generated
   * @ordered
   */
  protected static final String KEY_WD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKeyWd() <em>Key Wd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyWd()
   * @generated
   * @ordered
   */
  protected String keyWd = KEY_WD_EDEFAULT;

  /**
   * The default value of the '{@link #getSign() <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSign()
   * @generated
   * @ordered
   */
  protected static final String SIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSign() <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSign()
   * @generated
   * @ordered
   */
  protected String sign = SIGN_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Point value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PointsConditionImpl()
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
    return EngagePackage.Literals.POINTS_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKeyWd()
  {
    return keyWd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyWd(String newKeyWd)
  {
    String oldKeyWd = keyWd;
    keyWd = newKeyWd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EngagePackage.POINTS_CONDITION__KEY_WD, oldKeyWd, keyWd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSign()
  {
    return sign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSign(String newSign)
  {
    String oldSign = sign;
    sign = newSign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EngagePackage.POINTS_CONDITION__SIGN, oldSign, sign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Point newValue, NotificationChain msgs)
  {
    Point oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EngagePackage.POINTS_CONDITION__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Point newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EngagePackage.POINTS_CONDITION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EngagePackage.POINTS_CONDITION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EngagePackage.POINTS_CONDITION__VALUE, newValue, newValue));
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
      case EngagePackage.POINTS_CONDITION__VALUE:
        return basicSetValue(null, msgs);
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
      case EngagePackage.POINTS_CONDITION__KEY_WD:
        return getKeyWd();
      case EngagePackage.POINTS_CONDITION__SIGN:
        return getSign();
      case EngagePackage.POINTS_CONDITION__VALUE:
        return getValue();
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
      case EngagePackage.POINTS_CONDITION__KEY_WD:
        setKeyWd((String)newValue);
        return;
      case EngagePackage.POINTS_CONDITION__SIGN:
        setSign((String)newValue);
        return;
      case EngagePackage.POINTS_CONDITION__VALUE:
        setValue((Point)newValue);
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
      case EngagePackage.POINTS_CONDITION__KEY_WD:
        setKeyWd(KEY_WD_EDEFAULT);
        return;
      case EngagePackage.POINTS_CONDITION__SIGN:
        setSign(SIGN_EDEFAULT);
        return;
      case EngagePackage.POINTS_CONDITION__VALUE:
        setValue((Point)null);
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
      case EngagePackage.POINTS_CONDITION__KEY_WD:
        return KEY_WD_EDEFAULT == null ? keyWd != null : !KEY_WD_EDEFAULT.equals(keyWd);
      case EngagePackage.POINTS_CONDITION__SIGN:
        return SIGN_EDEFAULT == null ? sign != null : !SIGN_EDEFAULT.equals(sign);
      case EngagePackage.POINTS_CONDITION__VALUE:
        return value != null;
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
    result.append(" (keyWd: ");
    result.append(keyWd);
    result.append(", sign: ");
    result.append(sign);
    result.append(')');
    return result.toString();
  }

} //PointsConditionImpl
