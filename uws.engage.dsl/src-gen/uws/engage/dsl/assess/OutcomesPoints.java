/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outcomes Points</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.OutcomesPoints#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.OutcomesPoints#isResetValue <em>Reset Value</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.OutcomesPoints#getPts <em>Pts</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.OutcomesPoints#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getOutcomesPoints()
 * @model
 * @generated
 */
public interface OutcomesPoints extends EObject
{
  /**
   * Returns the value of the '<em><b>Outcome</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outcome</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outcome</em>' reference.
   * @see #setOutcome(Outcome)
   * @see uws.engage.dsl.assess.AssessPackage#getOutcomesPoints_Outcome()
   * @model
   * @generated
   */
  Outcome getOutcome();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.OutcomesPoints#getOutcome <em>Outcome</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outcome</em>' reference.
   * @see #getOutcome()
   * @generated
   */
  void setOutcome(Outcome value);

  /**
   * Returns the value of the '<em><b>Reset Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reset Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reset Value</em>' attribute.
   * @see #setResetValue(boolean)
   * @see uws.engage.dsl.assess.AssessPackage#getOutcomesPoints_ResetValue()
   * @model
   * @generated
   */
  boolean isResetValue();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.OutcomesPoints#isResetValue <em>Reset Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reset Value</em>' attribute.
   * @see #isResetValue()
   * @generated
   */
  void setResetValue(boolean value);

  /**
   * Returns the value of the '<em><b>Pts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pts</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pts</em>' containment reference.
   * @see #setPts(Point)
   * @see uws.engage.dsl.assess.AssessPackage#getOutcomesPoints_Pts()
   * @model containment="true"
   * @generated
   */
  Point getPts();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.OutcomesPoints#getPts <em>Pts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pts</em>' containment reference.
   * @see #getPts()
   * @generated
   */
  void setPts(Point value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(Parameter)
   * @see uws.engage.dsl.assess.AssessPackage#getOutcomesPoints_Var()
   * @model
   * @generated
   */
  Parameter getVar();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.OutcomesPoints#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Parameter value);

} // OutcomesPoints
