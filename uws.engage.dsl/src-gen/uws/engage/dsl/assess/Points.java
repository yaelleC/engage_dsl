/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Points</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.Points#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Points#getPts <em>Pts</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Points#isOthers <em>Others</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Points#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getPoints()
 * @model
 * @generated
 */
public interface Points extends EObject
{
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
   * @see uws.engage.dsl.assess.AssessPackage#getPoints_Outcome()
   * @model
   * @generated
   */
  Outcome getOutcome();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Points#getOutcome <em>Outcome</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outcome</em>' reference.
   * @see #getOutcome()
   * @generated
   */
  void setOutcome(Outcome value);

  /**
   * Returns the value of the '<em><b>Pts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pts</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pts</em>' containment reference.
   * @see #setPts(Point)
   * @see uws.engage.dsl.assess.AssessPackage#getPoints_Pts()
   * @model containment="true"
   * @generated
   */
  Point getPts();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Points#getPts <em>Pts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pts</em>' containment reference.
   * @see #getPts()
   * @generated
   */
  void setPts(Point value);

  /**
   * Returns the value of the '<em><b>Others</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Others</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Others</em>' attribute.
   * @see #setOthers(boolean)
   * @see uws.engage.dsl.assess.AssessPackage#getPoints_Others()
   * @model
   * @generated
   */
  boolean isOthers();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Points#isOthers <em>Others</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Others</em>' attribute.
   * @see #isOthers()
   * @generated
   */
  void setOthers(boolean value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link uws.engage.dsl.assess.Params}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see uws.engage.dsl.assess.AssessPackage#getPoints_Params()
   * @model containment="true"
   * @generated
   */
  EList<Params> getParams();

} // Points
