/**
 */
package uws.chaudy.engage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.chaudy.engage.PlayerDescription#getCharacteristics <em>Characteristics</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.chaudy.engage.EngagePackage#getPlayerDescription()
 * @model
 * @generated
 */
public interface PlayerDescription extends EObject
{
  /**
   * Returns the value of the '<em><b>Characteristics</b></em>' containment reference list.
   * The list contents are of type {@link uws.chaudy.engage.Characteristic}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Characteristics</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Characteristics</em>' containment reference list.
   * @see uws.chaudy.engage.EngagePackage#getPlayerDescription_Characteristics()
   * @model containment="true"
   * @generated
   */
  EList<Characteristic> getCharacteristics();

} // PlayerDescription
