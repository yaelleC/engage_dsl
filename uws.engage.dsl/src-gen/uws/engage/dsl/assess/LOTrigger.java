/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LO Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.LOTrigger#getFunction <em>Function</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.LOTrigger#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.LOTrigger#getSign <em>Sign</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.LOTrigger#isNegativeLimit <em>Negative Limit</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.LOTrigger#getLimit <em>Limit</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.LOTrigger#getTriggerReactions <em>Trigger Reactions</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getLOTrigger()
 * @model
 * @generated
 */
public interface LOTrigger extends EObject
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' attribute.
   * @see #setFunction(String)
   * @see uws.engage.dsl.assess.AssessPackage#getLOTrigger_Function()
   * @model
   * @generated
   */
  String getFunction();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.LOTrigger#getFunction <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' attribute.
   * @see #getFunction()
   * @generated
   */
  void setFunction(String value);

  /**
   * Returns the value of the '<em><b>Outcome</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outcome</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outcome</em>' reference.
   * @see #setOutcome(Outcome)
   * @see uws.engage.dsl.assess.AssessPackage#getLOTrigger_Outcome()
   * @model
   * @generated
   */
  Outcome getOutcome();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.LOTrigger#getOutcome <em>Outcome</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outcome</em>' reference.
   * @see #getOutcome()
   * @generated
   */
  void setOutcome(Outcome value);

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
   * @see uws.engage.dsl.assess.AssessPackage#getLOTrigger_Sign()
   * @model
   * @generated
   */
  String getSign();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.LOTrigger#getSign <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sign</em>' attribute.
   * @see #getSign()
   * @generated
   */
  void setSign(String value);

  /**
   * Returns the value of the '<em><b>Negative Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Negative Limit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negative Limit</em>' attribute.
   * @see #setNegativeLimit(boolean)
   * @see uws.engage.dsl.assess.AssessPackage#getLOTrigger_NegativeLimit()
   * @model
   * @generated
   */
  boolean isNegativeLimit();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.LOTrigger#isNegativeLimit <em>Negative Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negative Limit</em>' attribute.
   * @see #isNegativeLimit()
   * @generated
   */
  void setNegativeLimit(boolean value);

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
   * @see uws.engage.dsl.assess.AssessPackage#getLOTrigger_Limit()
   * @model
   * @generated
   */
  int getLimit();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.LOTrigger#getLimit <em>Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limit</em>' attribute.
   * @see #getLimit()
   * @generated
   */
  void setLimit(int value);

  /**
   * Returns the value of the '<em><b>Trigger Reactions</b></em>' containment reference list.
   * The list contents are of type {@link uws.engage.dsl.assess.TriggerFeedback}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trigger Reactions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger Reactions</em>' containment reference list.
   * @see uws.engage.dsl.assess.AssessPackage#getLOTrigger_TriggerReactions()
   * @model containment="true"
   * @generated
   */
  EList<TriggerFeedback> getTriggerReactions();

} // LOTrigger
