/**
 */
package uws.chaudy.engage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.chaudy.engage.Action#getName <em>Name</em>}</li>
 *   <li>{@link uws.chaudy.engage.Action#getParams <em>Params</em>}</li>
 *   <li>{@link uws.chaudy.engage.Action#getPoints <em>Points</em>}</li>
 *   <li>{@link uws.chaudy.engage.Action#getReactions <em>Reactions</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.chaudy.engage.EngagePackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uws.chaudy.engage.EngagePackage#getAction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.Action#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link uws.chaudy.engage.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see uws.chaudy.engage.EngagePackage#getAction_Params()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParams();

  /**
   * Returns the value of the '<em><b>Points</b></em>' containment reference list.
   * The list contents are of type {@link uws.chaudy.engage.Points}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Points</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Points</em>' containment reference list.
   * @see uws.chaudy.engage.EngagePackage#getAction_Points()
   * @model containment="true"
   * @generated
   */
  EList<Points> getPoints();

  /**
   * Returns the value of the '<em><b>Reactions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reactions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reactions</em>' containment reference.
   * @see #setReactions(Reactions)
   * @see uws.chaudy.engage.EngagePackage#getAction_Reactions()
   * @model containment="true"
   * @generated
   */
  Reactions getReactions();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.Action#getReactions <em>Reactions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reactions</em>' containment reference.
   * @see #getReactions()
   * @generated
   */
  void setReactions(Reactions value);

} // Action
