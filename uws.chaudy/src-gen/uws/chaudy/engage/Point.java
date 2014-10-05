/**
 */
package uws.chaudy.engage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.chaudy.engage.Point#isNegative <em>Negative</em>}</li>
 *   <li>{@link uws.chaudy.engage.Point#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.chaudy.engage.EngagePackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends EObject
{
  /**
   * Returns the value of the '<em><b>Negative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Negative</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negative</em>' attribute.
   * @see #setNegative(boolean)
   * @see uws.chaudy.engage.EngagePackage#getPoint_Negative()
   * @model
   * @generated
   */
  boolean isNegative();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.Point#isNegative <em>Negative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negative</em>' attribute.
   * @see #isNegative()
   * @generated
   */
  void setNegative(boolean value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see uws.chaudy.engage.EngagePackage#getPoint_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.Point#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // Point
