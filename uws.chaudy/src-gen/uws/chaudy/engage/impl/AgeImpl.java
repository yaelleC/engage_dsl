/**
 */
package uws.chaudy.engage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uws.chaudy.engage.Age;
import uws.chaudy.engage.EngagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Age</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.chaudy.engage.impl.AgeImpl#getAgeMin <em>Age Min</em>}</li>
 *   <li>{@link uws.chaudy.engage.impl.AgeImpl#getAgeMax <em>Age Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgeImpl extends MinimalEObjectImpl.Container implements Age
{
  /**
   * The default value of the '{@link #getAgeMin() <em>Age Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgeMin()
   * @generated
   * @ordered
   */
  protected static final int AGE_MIN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAgeMin() <em>Age Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgeMin()
   * @generated
   * @ordered
   */
  protected int ageMin = AGE_MIN_EDEFAULT;

  /**
   * The default value of the '{@link #getAgeMax() <em>Age Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgeMax()
   * @generated
   * @ordered
   */
  protected static final int AGE_MAX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAgeMax() <em>Age Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgeMax()
   * @generated
   * @ordered
   */
  protected int ageMax = AGE_MAX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AgeImpl()
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
    return EngagePackage.Literals.AGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAgeMin()
  {
    return ageMin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAgeMin(int newAgeMin)
  {
    int oldAgeMin = ageMin;
    ageMin = newAgeMin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EngagePackage.AGE__AGE_MIN, oldAgeMin, ageMin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAgeMax()
  {
    return ageMax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAgeMax(int newAgeMax)
  {
    int oldAgeMax = ageMax;
    ageMax = newAgeMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EngagePackage.AGE__AGE_MAX, oldAgeMax, ageMax));
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
      case EngagePackage.AGE__AGE_MIN:
        return getAgeMin();
      case EngagePackage.AGE__AGE_MAX:
        return getAgeMax();
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
      case EngagePackage.AGE__AGE_MIN:
        setAgeMin((Integer)newValue);
        return;
      case EngagePackage.AGE__AGE_MAX:
        setAgeMax((Integer)newValue);
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
      case EngagePackage.AGE__AGE_MIN:
        setAgeMin(AGE_MIN_EDEFAULT);
        return;
      case EngagePackage.AGE__AGE_MAX:
        setAgeMax(AGE_MAX_EDEFAULT);
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
      case EngagePackage.AGE__AGE_MIN:
        return ageMin != AGE_MIN_EDEFAULT;
      case EngagePackage.AGE__AGE_MAX:
        return ageMax != AGE_MAX_EDEFAULT;
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
    result.append(" (ageMin: ");
    result.append(ageMin);
    result.append(", ageMax: ");
    result.append(ageMax);
    result.append(')');
    return result.toString();
  }

} //AgeImpl
