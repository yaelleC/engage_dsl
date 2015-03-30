/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.ParamIn#getParam <em>Param</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.ParamIn#getValuesPoss <em>Values Poss</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getParamIn()
 * @model
 * @generated
 */
public interface ParamIn extends EObject
{
  /**
   * Returns the value of the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' reference.
   * @see #setParam(Parameter)
   * @see uws.engage.dsl.assess.AssessPackage#getParamIn_Param()
   * @model
   * @generated
   */
  Parameter getParam();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.ParamIn#getParam <em>Param</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' reference.
   * @see #getParam()
   * @generated
   */
  void setParam(Parameter value);

  /**
   * Returns the value of the '<em><b>Values Poss</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values Poss</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values Poss</em>' attribute list.
   * @see uws.engage.dsl.assess.AssessPackage#getParamIn_ValuesPoss()
   * @model unique="false"
   * @generated
   */
  EList<String> getValuesPoss();

} // ParamIn
