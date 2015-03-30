/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Params In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.ParamsIn#getParamIn <em>Param In</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getParamsIn()
 * @model
 * @generated
 */
public interface ParamsIn extends EObject
{
  /**
   * Returns the value of the '<em><b>Param In</b></em>' containment reference list.
   * The list contents are of type {@link uws.engage.dsl.assess.ParamIn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param In</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param In</em>' containment reference list.
   * @see uws.engage.dsl.assess.AssessPackage#getParamsIn_ParamIn()
   * @model containment="true"
   * @generated
   */
  EList<ParamIn> getParamIn();

} // ParamsIn
