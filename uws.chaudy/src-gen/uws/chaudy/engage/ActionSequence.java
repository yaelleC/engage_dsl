/**
 */
package uws.chaudy.engage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.chaudy.engage.ActionSequence#getAction1 <em>Action1</em>}</li>
 *   <li>{@link uws.chaudy.engage.ActionSequence#isBefore <em>Before</em>}</li>
 *   <li>{@link uws.chaudy.engage.ActionSequence#isAfter <em>After</em>}</li>
 *   <li>{@link uws.chaudy.engage.ActionSequence#getAction2 <em>Action2</em>}</li>
 *   <li>{@link uws.chaudy.engage.ActionSequence#getSequenceReactions <em>Sequence Reactions</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.chaudy.engage.EngagePackage#getActionSequence()
 * @model
 * @generated
 */
public interface ActionSequence extends EObject
{
  /**
   * Returns the value of the '<em><b>Action1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action1</em>' attribute.
   * @see #setAction1(String)
   * @see uws.chaudy.engage.EngagePackage#getActionSequence_Action1()
   * @model
   * @generated
   */
  String getAction1();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.ActionSequence#getAction1 <em>Action1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action1</em>' attribute.
   * @see #getAction1()
   * @generated
   */
  void setAction1(String value);

  /**
   * Returns the value of the '<em><b>Before</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Before</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Before</em>' attribute.
   * @see #setBefore(boolean)
   * @see uws.chaudy.engage.EngagePackage#getActionSequence_Before()
   * @model
   * @generated
   */
  boolean isBefore();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.ActionSequence#isBefore <em>Before</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Before</em>' attribute.
   * @see #isBefore()
   * @generated
   */
  void setBefore(boolean value);

  /**
   * Returns the value of the '<em><b>After</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>After</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>After</em>' attribute.
   * @see #setAfter(boolean)
   * @see uws.chaudy.engage.EngagePackage#getActionSequence_After()
   * @model
   * @generated
   */
  boolean isAfter();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.ActionSequence#isAfter <em>After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>After</em>' attribute.
   * @see #isAfter()
   * @generated
   */
  void setAfter(boolean value);

  /**
   * Returns the value of the '<em><b>Action2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action2</em>' attribute.
   * @see #setAction2(String)
   * @see uws.chaudy.engage.EngagePackage#getActionSequence_Action2()
   * @model
   * @generated
   */
  String getAction2();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.ActionSequence#getAction2 <em>Action2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action2</em>' attribute.
   * @see #getAction2()
   * @generated
   */
  void setAction2(String value);

  /**
   * Returns the value of the '<em><b>Sequence Reactions</b></em>' containment reference list.
   * The list contents are of type {@link uws.chaudy.engage.ActionReaction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence Reactions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence Reactions</em>' containment reference list.
   * @see uws.chaudy.engage.EngagePackage#getActionSequence_SequenceReactions()
   * @model containment="true"
   * @generated
   */
  EList<ActionReaction> getSequenceReactions();

} // ActionSequence
