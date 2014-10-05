/**
 */
package uws.chaudy.engage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.chaudy.engage.TriggerFeedback#getFeedback <em>Feedback</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.chaudy.engage.EngagePackage#getTriggerFeedback()
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
   * @see uws.chaudy.engage.EngagePackage#getTriggerFeedback_Feedback()
   * @model
   * @generated
   */
  Feedback getFeedback();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.TriggerFeedback#getFeedback <em>Feedback</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feedback</em>' reference.
   * @see #getFeedback()
   * @generated
   */
  void setFeedback(Feedback value);

} // TriggerFeedback
