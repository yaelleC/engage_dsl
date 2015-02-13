/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.GenericTrigger#getSimple <em>Simple</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.GenericTrigger#getLo <em>Lo</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getGenericTrigger()
 * @model
 * @generated
 */
public interface GenericTrigger extends EObject
{
  /**
   * Returns the value of the '<em><b>Simple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple</em>' containment reference.
   * @see #setSimple(SimpleTrigger)
   * @see uws.engage.dsl.assess.AssessPackage#getGenericTrigger_Simple()
   * @model containment="true"
   * @generated
   */
  SimpleTrigger getSimple();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.GenericTrigger#getSimple <em>Simple</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple</em>' containment reference.
   * @see #getSimple()
   * @generated
   */
  void setSimple(SimpleTrigger value);

  /**
   * Returns the value of the '<em><b>Lo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lo</em>' containment reference.
   * @see #setLo(LOTrigger)
   * @see uws.engage.dsl.assess.AssessPackage#getGenericTrigger_Lo()
   * @model containment="true"
   * @generated
   */
  LOTrigger getLo();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.GenericTrigger#getLo <em>Lo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lo</em>' containment reference.
   * @see #getLo()
   * @generated
   */
  void setLo(LOTrigger value);

} // GenericTrigger
