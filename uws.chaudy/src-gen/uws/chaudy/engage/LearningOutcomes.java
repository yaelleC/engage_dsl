/**
 */
package uws.chaudy.engage;

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
 *   <li>{@link uws.chaudy.engage.LearningOutcomes#getOutcomes <em>Outcomes</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.chaudy.engage.EngagePackage#getLearningOutcomes()
 * @model
 * @generated
 */
public interface LearningOutcomes extends EObject
{
  /**
   * Returns the value of the '<em><b>Outcomes</b></em>' containment reference list.
   * The list contents are of type {@link uws.chaudy.engage.Outcome}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outcomes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outcomes</em>' containment reference list.
   * @see uws.chaudy.engage.EngagePackage#getLearningOutcomes_Outcomes()
   * @model containment="true"
   * @generated
   */
  EList<Outcome> getOutcomes();

} // LearningOutcomes
