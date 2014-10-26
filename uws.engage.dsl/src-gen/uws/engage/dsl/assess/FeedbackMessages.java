/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Messages</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.FeedbackMessages#getFeedbackMsgs <em>Feedback Msgs</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getFeedbackMessages()
 * @model
 * @generated
 */
public interface FeedbackMessages extends EObject
{
  /**
   * Returns the value of the '<em><b>Feedback Msgs</b></em>' containment reference list.
   * The list contents are of type {@link uws.engage.dsl.assess.Feedback}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feedback Msgs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feedback Msgs</em>' containment reference list.
   * @see uws.engage.dsl.assess.AssessPackage#getFeedbackMessages_FeedbackMsgs()
   * @model containment="true"
   * @generated
   */
  EList<Feedback> getFeedbackMsgs();

} // FeedbackMessages
