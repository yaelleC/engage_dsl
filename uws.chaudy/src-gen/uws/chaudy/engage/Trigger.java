/**
 */
package uws.chaudy.engage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.chaudy.engage.Trigger#getPerf <em>Perf</em>}</li>
 *   <li>{@link uws.chaudy.engage.Trigger#getInactivity <em>Inactivity</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.chaudy.engage.EngagePackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends EObject
{
  /**
   * Returns the value of the '<em><b>Perf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Perf</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Perf</em>' containment reference.
   * @see #setPerf(OutcomeValueLimit)
   * @see uws.chaudy.engage.EngagePackage#getTrigger_Perf()
   * @model containment="true"
   * @generated
   */
  OutcomeValueLimit getPerf();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.Trigger#getPerf <em>Perf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Perf</em>' containment reference.
   * @see #getPerf()
   * @generated
   */
  void setPerf(OutcomeValueLimit value);

  /**
   * Returns the value of the '<em><b>Inactivity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inactivity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inactivity</em>' containment reference.
   * @see #setInactivity(InactivityLimit)
   * @see uws.chaudy.engage.EngagePackage#getTrigger_Inactivity()
   * @model containment="true"
   * @generated
   */
  InactivityLimit getInactivity();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.Trigger#getInactivity <em>Inactivity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inactivity</em>' containment reference.
   * @see #getInactivity()
   * @generated
   */
  void setInactivity(InactivityLimit value);

} // Trigger
