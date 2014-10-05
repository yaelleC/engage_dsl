/**
 */
package uws.chaudy.engage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.chaudy.engage.EvidenceModel#getActions <em>Actions</em>}</li>
 *   <li>{@link uws.chaudy.engage.EvidenceModel#getTimerActions <em>Timer Actions</em>}</li>
 *   <li>{@link uws.chaudy.engage.EvidenceModel#getActionSequence <em>Action Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.chaudy.engage.EngagePackage#getEvidenceModel()
 * @model
 * @generated
 */
public interface EvidenceModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link uws.chaudy.engage.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see uws.chaudy.engage.EngagePackage#getEvidenceModel_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

  /**
   * Returns the value of the '<em><b>Timer Actions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timer Actions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timer Actions</em>' containment reference.
   * @see #setTimerActions(TimerActions)
   * @see uws.chaudy.engage.EngagePackage#getEvidenceModel_TimerActions()
   * @model containment="true"
   * @generated
   */
  TimerActions getTimerActions();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.EvidenceModel#getTimerActions <em>Timer Actions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timer Actions</em>' containment reference.
   * @see #getTimerActions()
   * @generated
   */
  void setTimerActions(TimerActions value);

  /**
   * Returns the value of the '<em><b>Action Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Sequence</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Sequence</em>' containment reference.
   * @see #setActionSequence(ActionSequences)
   * @see uws.chaudy.engage.EngagePackage#getEvidenceModel_ActionSequence()
   * @model containment="true"
   * @generated
   */
  ActionSequences getActionSequence();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.EvidenceModel#getActionSequence <em>Action Sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Sequence</em>' containment reference.
   * @see #getActionSequence()
   * @generated
   */
  void setActionSequence(ActionSequences value);

} // EvidenceModel
