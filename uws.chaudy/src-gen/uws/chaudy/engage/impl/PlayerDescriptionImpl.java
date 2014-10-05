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

import uws.chaudy.engage.Characteristic;
import uws.chaudy.engage.EngagePackage;
import uws.chaudy.engage.PlayerDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.chaudy.engage.impl.PlayerDescriptionImpl#getCharacteristics <em>Characteristics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlayerDescriptionImpl extends MinimalEObjectImpl.Container implements PlayerDescription
{
  /**
   * The cached value of the '{@link #getCharacteristics() <em>Characteristics</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacteristics()
   * @generated
   * @ordered
   */
  protected EList<Characteristic> characteristics;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlayerDescriptionImpl()
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
    return EngagePackage.Literals.PLAYER_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Characteristic> getCharacteristics()
  {
    if (characteristics == null)
    {
      characteristics = new EObjectContainmentEList<Characteristic>(Characteristic.class, this, EngagePackage.PLAYER_DESCRIPTION__CHARACTERISTICS);
    }
    return characteristics;
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
      case EngagePackage.PLAYER_DESCRIPTION__CHARACTERISTICS:
        return ((InternalEList<?>)getCharacteristics()).basicRemove(otherEnd, msgs);
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
      case EngagePackage.PLAYER_DESCRIPTION__CHARACTERISTICS:
        return getCharacteristics();
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
      case EngagePackage.PLAYER_DESCRIPTION__CHARACTERISTICS:
        getCharacteristics().clear();
        getCharacteristics().addAll((Collection<? extends Characteristic>)newValue);
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
      case EngagePackage.PLAYER_DESCRIPTION__CHARACTERISTICS:
        getCharacteristics().clear();
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
      case EngagePackage.PLAYER_DESCRIPTION__CHARACTERISTICS:
        return characteristics != null && !characteristics.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PlayerDescriptionImpl
