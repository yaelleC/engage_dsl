/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.TimerActions#getTimerActions <em>Timer Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getTimerActions()
 * @model
 * @generated
 */
public interface TimerActions extends EObject
{
  /**
   * Returns the value of the '<em><b>Timer Actions</b></em>' containment reference list.
   * The list contents are of type {@link uws.engage.dsl.assess.TimerAction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timer Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timer Actions</em>' containment reference list.
   * @see uws.engage.dsl.assess.AssessPackage#getTimerActions_TimerActions()
   * @model containment="true"
   * @generated
   */
  EList<TimerAction> getTimerActions();

} // TimerActions
