/**
 */
package uws.chaudy.engage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.chaudy.engage.FeedbackModel#getTriggers <em>Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.chaudy.engage.EngagePackage#getFeedbackModel()
 * @model
 * @generated
 */
public interface FeedbackModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
   * The list contents are of type {@link uws.chaudy.engage.Trigger}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Triggers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triggers</em>' containment reference list.
   * @see uws.chaudy.engage.EngagePackage#getFeedbackModel_Triggers()
   * @model containment="true"
   * @generated
   */
  EList<Trigger> getTriggers();

} // FeedbackModel
