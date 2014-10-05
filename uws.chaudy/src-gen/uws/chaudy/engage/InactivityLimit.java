/**
 */
package uws.chaudy.engage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inactivity Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.chaudy.engage.InactivityLimit#getSign <em>Sign</em>}</li>
 *   <li>{@link uws.chaudy.engage.InactivityLimit#getLimit <em>Limit</em>}</li>
 *   <li>{@link uws.chaudy.engage.InactivityLimit#getTriggerReactions <em>Trigger Reactions</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.chaudy.engage.EngagePackage#getInactivityLimit()
 * @model
 * @generated
 */
public interface InactivityLimit extends EObject
{
  /**
   * Returns the value of the '<em><b>Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sign</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sign</em>' attribute.
   * @see #setSign(String)
   * @see uws.chaudy.engage.EngagePackage#getInactivityLimit_Sign()
   * @model
   * @generated
   */
  String getSign();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.InactivityLimit#getSign <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sign</em>' attribute.
   * @see #getSign()
   * @generated
   */
  void setSign(String value);

  /**
   * Returns the value of the '<em><b>Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Limit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limit</em>' attribute.
   * @see #setLimit(int)
   * @see uws.chaudy.engage.EngagePackage#getInactivityLimit_Limit()
   * @model
   * @generated
   */
  int getLimit();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.InactivityLimit#getLimit <em>Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limit</em>' attribute.
   * @see #getLimit()
   * @generated
   */
  void setLimit(int value);

  /**
   * Returns the value of the '<em><b>Trigger Reactions</b></em>' containment reference list.
   * The list contents are of type {@link uws.chaudy.engage.ActionReaction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trigger Reactions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger Reactions</em>' containment reference list.
   * @see uws.chaudy.engage.EngagePackage#getInactivityLimit_TriggerReactions()
   * @model containment="true"
   * @generated
   */
  EList<ActionReaction> getTriggerReactions();

} // InactivityLimit
