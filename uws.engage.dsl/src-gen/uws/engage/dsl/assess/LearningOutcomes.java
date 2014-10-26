/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Learning Outcomes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.LearningOutcomes#getOutcomes <em>Outcomes</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getLearningOutcomes()
 * @model
 * @generated
 */
public interface LearningOutcomes extends EObject
{
  /**
   * Returns the value of the '<em><b>Outcomes</b></em>' containment reference list.
   * The list contents are of type {@link uws.engage.dsl.assess.Outcome}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outcomes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outcomes</em>' containment reference list.
   * @see uws.engage.dsl.assess.AssessPackage#getLearningOutcomes_Outcomes()
   * @model containment="true"
   * @generated
   */
  EList<Outcome> getOutcomes();

} // LearningOutcomes
