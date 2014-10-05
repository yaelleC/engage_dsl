/**
 */
package uws.chaudy.engage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.chaudy.engage.Reaction#getParamsC <em>Params C</em>}</li>
 *   <li>{@link uws.chaudy.engage.Reaction#getPointsC <em>Points C</em>}</li>
 *   <li>{@link uws.chaudy.engage.Reaction#getFeedback <em>Feedback</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.chaudy.engage.EngagePackage#getReaction()
 * @model
 * @generated
 */
public interface Reaction extends EObject
{
  /**
   * Returns the value of the '<em><b>Params C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params C</em>' containment reference.
   * @see #setParamsC(ParamCondition)
   * @see uws.chaudy.engage.EngagePackage#getReaction_ParamsC()
   * @model containment="true"
   * @generated
   */
  ParamCondition getParamsC();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.Reaction#getParamsC <em>Params C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params C</em>' containment reference.
   * @see #getParamsC()
   * @generated
   */
  void setParamsC(ParamCondition value);

  /**
   * Returns the value of the '<em><b>Points C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Points C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Points C</em>' containment reference.
   * @see #setPointsC(PointsCondition)
   * @see uws.chaudy.engage.EngagePackage#getReaction_PointsC()
   * @model containment="true"
   * @generated
   */
  PointsCondition getPointsC();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.Reaction#getPointsC <em>Points C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Points C</em>' containment reference.
   * @see #getPointsC()
   * @generated
   */
  void setPointsC(PointsCondition value);

  /**
   * Returns the value of the '<em><b>Feedback</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feedback</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feedback</em>' reference.
   * @see #setFeedback(Feedback)
   * @see uws.chaudy.engage.EngagePackage#getReaction_Feedback()
   * @model
   * @generated
   */
  Feedback getFeedback();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.Reaction#getFeedback <em>Feedback</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feedback</em>' reference.
   * @see #getFeedback()
   * @generated
   */
  void setFeedback(Feedback value);

} // Reaction
