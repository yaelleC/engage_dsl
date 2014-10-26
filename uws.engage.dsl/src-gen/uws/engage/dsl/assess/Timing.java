/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.Timing#isBefore <em>Before</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Timing#isAfter <em>After</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Timing#getLimit <em>Limit</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Timing#getTimingReactions <em>Timing Reactions</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getTiming()
 * @model
 * @generated
 */
public interface Timing extends EObject
{
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
   * @see uws.engage.dsl.assess.AssessPackage#getTiming_Before()
   * @model
   * @generated
   */
  boolean isBefore();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Timing#isBefore <em>Before</em>}' attribute.
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
   * @see uws.engage.dsl.assess.AssessPackage#getTiming_After()
   * @model
   * @generated
   */
  boolean isAfter();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Timing#isAfter <em>After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>After</em>' attribute.
   * @see #isAfter()
   * @generated
   */
  void setAfter(boolean value);

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
   * @see uws.engage.dsl.assess.AssessPackage#getTiming_Limit()
   * @model
   * @generated
   */
  int getLimit();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Timing#getLimit <em>Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limit</em>' attribute.
   * @see #getLimit()
   * @generated
   */
  void setLimit(int value);

  /**
   * Returns the value of the '<em><b>Timing Reactions</b></em>' containment reference list.
   * The list contents are of type {@link uws.engage.dsl.assess.ActionReaction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timing Reactions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timing Reactions</em>' containment reference list.
   * @see uws.engage.dsl.assess.AssessPackage#getTiming_TimingReactions()
   * @model containment="true"
   * @generated
   */
  EList<ActionReaction> getTimingReactions();

} // Timing
