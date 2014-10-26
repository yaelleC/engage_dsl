/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Outcome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.TypeOutcome#isKnowledge <em>Knowledge</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.TypeOutcome#isSkill <em>Skill</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.TypeOutcome#isCompetence <em>Competence</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getTypeOutcome()
 * @model
 * @generated
 */
public interface TypeOutcome extends EObject
{
  /**
   * Returns the value of the '<em><b>Knowledge</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Knowledge</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Knowledge</em>' attribute.
   * @see #setKnowledge(boolean)
   * @see uws.engage.dsl.assess.AssessPackage#getTypeOutcome_Knowledge()
   * @model
   * @generated
   */
  boolean isKnowledge();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.TypeOutcome#isKnowledge <em>Knowledge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Knowledge</em>' attribute.
   * @see #isKnowledge()
   * @generated
   */
  void setKnowledge(boolean value);

  /**
   * Returns the value of the '<em><b>Skill</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Skill</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Skill</em>' attribute.
   * @see #setSkill(boolean)
   * @see uws.engage.dsl.assess.AssessPackage#getTypeOutcome_Skill()
   * @model
   * @generated
   */
  boolean isSkill();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.TypeOutcome#isSkill <em>Skill</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Skill</em>' attribute.
   * @see #isSkill()
   * @generated
   */
  void setSkill(boolean value);

  /**
   * Returns the value of the '<em><b>Competence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Competence</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Competence</em>' attribute.
   * @see #setCompetence(boolean)
   * @see uws.engage.dsl.assess.AssessPackage#getTypeOutcome_Competence()
   * @model
   * @generated
   */
  boolean isCompetence();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.TypeOutcome#isCompetence <em>Competence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Competence</em>' attribute.
   * @see #isCompetence()
   * @generated
   */
  void setCompetence(boolean value);

} // TypeOutcome
