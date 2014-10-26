/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Points Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.PointsCondition#getKeyWd <em>Key Wd</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.PointsCondition#getSign <em>Sign</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.PointsCondition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getPointsCondition()
 * @model
 * @generated
 */
public interface PointsCondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Key Wd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Wd</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Wd</em>' attribute.
   * @see #setKeyWd(String)
   * @see uws.engage.dsl.assess.AssessPackage#getPointsCondition_KeyWd()
   * @model
   * @generated
   */
  String getKeyWd();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.PointsCondition#getKeyWd <em>Key Wd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Wd</em>' attribute.
   * @see #getKeyWd()
   * @generated
   */
  void setKeyWd(String value);

  /**
   * Returns the value of the '<em><b>Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sign</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sign</em>' attribute.
   * @see #setSign(String)
   * @see uws.engage.dsl.assess.AssessPackage#getPointsCondition_Sign()
   * @model
   * @generated
   */
  String getSign();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.PointsCondition#getSign <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sign</em>' attribute.
   * @see #getSign()
   * @generated
   */
  void setSign(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Point)
   * @see uws.engage.dsl.assess.AssessPackage#getPointsCondition_Value()
   * @model containment="true"
   * @generated
   */
  Point getValue();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.PointsCondition#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Point value);

} // PointsCondition
