/**
 */
package uws.chaudy.engage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.chaudy.engage.ActionReaction#getUpdateScore <em>Update Score</em>}</li>
 *   <li>{@link uws.chaudy.engage.ActionReaction#getTriggerFeedback <em>Trigger Feedback</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.chaudy.engage.EngagePackage#getActionReaction()
 * @model
 * @generated
 */
public interface ActionReaction extends EObject
{
  /**
   * Returns the value of the '<em><b>Update Score</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Score</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Score</em>' containment reference.
   * @see #setUpdateScore(UpdateScore)
   * @see uws.chaudy.engage.EngagePackage#getActionReaction_UpdateScore()
   * @model containment="true"
   * @generated
   */
  UpdateScore getUpdateScore();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.ActionReaction#getUpdateScore <em>Update Score</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update Score</em>' containment reference.
   * @see #getUpdateScore()
   * @generated
   */
  void setUpdateScore(UpdateScore value);

  /**
   * Returns the value of the '<em><b>Trigger Feedback</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trigger Feedback</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger Feedback</em>' containment reference.
   * @see #setTriggerFeedback(TriggerFeedback)
   * @see uws.chaudy.engage.EngagePackage#getActionReaction_TriggerFeedback()
   * @model containment="true"
   * @generated
   */
  TriggerFeedback getTriggerFeedback();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.ActionReaction#getTriggerFeedback <em>Trigger Feedback</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger Feedback</em>' containment reference.
   * @see #getTriggerFeedback()
   * @generated
   */
  void setTriggerFeedback(TriggerFeedback value);

} // ActionReaction
