/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reactions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.Reactions#getReaction <em>Reaction</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getReactions()
 * @model
 * @generated
 */
public interface Reactions extends EObject
{
  /**
   * Returns the value of the '<em><b>Reaction</b></em>' containment reference list.
   * The list contents are of type {@link uws.engage.dsl.assess.Reaction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reaction</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reaction</em>' containment reference list.
   * @see uws.engage.dsl.assess.AssessPackage#getReactions_Reaction()
   * @model containment="true"
   * @generated
   */
  EList<Reaction> getReaction();

} // Reactions
