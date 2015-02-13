/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Points</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.Points#getOutcomesPoints <em>Outcomes Points</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Points#isOthers <em>Others</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Points#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getPoints()
 * @model
 * @generated
 */
public interface Points extends EObject
{
  /**
   * Returns the value of the '<em><b>Outcomes Points</b></em>' containment reference list.
   * The list contents are of type {@link uws.engage.dsl.assess.OutcomesPoints}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outcomes Points</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outcomes Points</em>' containment reference list.
   * @see uws.engage.dsl.assess.AssessPackage#getPoints_OutcomesPoints()
   * @model containment="true"
   * @generated
   */
  EList<OutcomesPoints> getOutcomesPoints();

  /**
   * Returns the value of the '<em><b>Others</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Others</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Others</em>' attribute.
   * @see #setOthers(boolean)
   * @see uws.engage.dsl.assess.AssessPackage#getPoints_Others()
   * @model
   * @generated
   */
  boolean isOthers();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Points#isOthers <em>Others</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Others</em>' attribute.
   * @see #isOthers()
   * @generated
   */
  void setOthers(boolean value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link uws.engage.dsl.assess.Params}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see uws.engage.dsl.assess.AssessPackage#getPoints_Params()
   * @model containment="true"
   * @generated
   */
  EList<Params> getParams();

} // Points
