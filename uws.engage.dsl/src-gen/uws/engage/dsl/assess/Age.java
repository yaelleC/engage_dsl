/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Age</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.Age#getAgeMin <em>Age Min</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Age#getAgeMax <em>Age Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getAge()
 * @model
 * @generated
 */
public interface Age extends EObject
{
  /**
   * Returns the value of the '<em><b>Age Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Age Min</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Age Min</em>' attribute.
   * @see #setAgeMin(int)
   * @see uws.engage.dsl.assess.AssessPackage#getAge_AgeMin()
   * @model
   * @generated
   */
  int getAgeMin();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Age#getAgeMin <em>Age Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Age Min</em>' attribute.
   * @see #getAgeMin()
   * @generated
   */
  void setAgeMin(int value);

  /**
   * Returns the value of the '<em><b>Age Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Age Max</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Age Max</em>' attribute.
   * @see #setAgeMax(int)
   * @see uws.engage.dsl.assess.AssessPackage#getAge_AgeMax()
   * @model
   * @generated
   */
  int getAgeMax();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Age#getAgeMax <em>Age Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Age Max</em>' attribute.
   * @see #getAgeMax()
   * @generated
   */
  void setAgeMax(int value);

} // Age
