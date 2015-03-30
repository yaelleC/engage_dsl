/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.TriggerFeedback#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.TriggerFeedback#isImmediate <em>Immediate</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.TriggerFeedback#isDelayed <em>Delayed</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getTriggerFeedback()
 * @model
 * @generated
 */
public interface TriggerFeedback extends EObject
{
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
   * @see uws.engage.dsl.assess.AssessPackage#getTriggerFeedback_Feedback()
   * @model
   * @generated
   */
  Feedback getFeedback();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.TriggerFeedback#getFeedback <em>Feedback</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feedback</em>' reference.
   * @see #getFeedback()
   * @generated
   */
  void setFeedback(Feedback value);

  /**
   * Returns the value of the '<em><b>Immediate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Immediate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Immediate</em>' attribute.
   * @see #setImmediate(boolean)
   * @see uws.engage.dsl.assess.AssessPackage#getTriggerFeedback_Immediate()
   * @model
   * @generated
   */
  boolean isImmediate();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.TriggerFeedback#isImmediate <em>Immediate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Immediate</em>' attribute.
   * @see #isImmediate()
   * @generated
   */
  void setImmediate(boolean value);

  /**
   * Returns the value of the '<em><b>Delayed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delayed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delayed</em>' attribute.
   * @see #setDelayed(boolean)
   * @see uws.engage.dsl.assess.AssessPackage#getTriggerFeedback_Delayed()
   * @model
   * @generated
   */
  boolean isDelayed();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.TriggerFeedback#isDelayed <em>Delayed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delayed</em>' attribute.
   * @see #isDelayed()
   * @generated
   */
  void setDelayed(boolean value);

} // TriggerFeedback
