/**
 */
package uws.chaudy.engage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.chaudy.engage.Enum#getEnumValues <em>Enum Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.chaudy.engage.EngagePackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends EObject
{
  /**
   * Returns the value of the '<em><b>Enum Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Values</em>' attribute list.
   * @see uws.chaudy.engage.EngagePackage#getEnum_EnumValues()
   * @model unique="false"
   * @generated
   */
  EList<String> getEnumValues();

} // Enum
