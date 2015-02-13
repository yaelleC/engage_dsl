/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Badge Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.BadgeModel#getGenericTriggers <em>Generic Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getBadgeModel()
 * @model
 * @generated
 */
public interface BadgeModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Generic Triggers</b></em>' containment reference list.
   * The list contents are of type {@link uws.engage.dsl.assess.GenericTrigger}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generic Triggers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Triggers</em>' containment reference list.
   * @see uws.engage.dsl.assess.AssessPackage#getBadgeModel_GenericTriggers()
   * @model containment="true"
   * @generated
   */
  EList<GenericTrigger> getGenericTriggers();

} // BadgeModel
