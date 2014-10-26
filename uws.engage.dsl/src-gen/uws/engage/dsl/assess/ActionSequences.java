/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Sequences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.ActionSequences#getActionSequences <em>Action Sequences</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getActionSequences()
 * @model
 * @generated
 */
public interface ActionSequences extends EObject
{
  /**
   * Returns the value of the '<em><b>Action Sequences</b></em>' containment reference list.
   * The list contents are of type {@link uws.engage.dsl.assess.ActionSequence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Sequences</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Sequences</em>' containment reference list.
   * @see uws.engage.dsl.assess.AssessPackage#getActionSequences_ActionSequences()
   * @model containment="true"
   * @generated
   */
  EList<ActionSequence> getActionSequences();

} // ActionSequences
