/**
 */
package uws.chaudy.engage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.chaudy.engage.ParamCondition#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.chaudy.engage.EngagePackage#getParamCondition()
 * @model
 * @generated
 */
public interface ParamCondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' reference.
   * @see #setParams(Params)
   * @see uws.chaudy.engage.EngagePackage#getParamCondition_Params()
   * @model
   * @generated
   */
  Params getParams();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.ParamCondition#getParams <em>Params</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' reference.
   * @see #getParams()
   * @generated
   */
  void setParams(Params value);

} // ParamCondition
