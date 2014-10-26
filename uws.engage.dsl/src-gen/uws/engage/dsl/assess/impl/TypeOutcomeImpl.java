/**
 */
package uws.engage.dsl.assess.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uws.engage.dsl.assess.AssessPackage;
import uws.engage.dsl.assess.TypeOutcome;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Outcome</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.TypeOutcomeImpl#isKnowledge <em>Knowledge</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.TypeOutcomeImpl#isSkill <em>Skill</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.TypeOutcomeImpl#isCompetence <em>Competence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeOutcomeImpl extends MinimalEObjectImpl.Container implements TypeOutcome
{
  /**
   * The default value of the '{@link #isKnowledge() <em>Knowledge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isKnowledge()
   * @generated
   * @ordered
   */
  protected static final boolean KNOWLEDGE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isKnowledge() <em>Knowledge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isKnowledge()
   * @generated
   * @ordered
   */
  protected boolean knowledge = KNOWLEDGE_EDEFAULT;

  /**
   * The default value of the '{@link #isSkill() <em>Skill</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSkill()
   * @generated
   * @ordered
   */
  protected static final boolean SKILL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSkill() <em>Skill</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSkill()
   * @generated
   * @ordered
   */
  protected boolean skill = SKILL_EDEFAULT;

  /**
   * The default value of the '{@link #isCompetence() <em>Competence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCompetence()
   * @generated
   * @ordered
   */
  protected static final boolean COMPETENCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCompetence() <em>Competence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCompetence()
   * @generated
   * @ordered
   */
  protected boolean competence = COMPETENCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeOutcomeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AssessPackage.Literals.TYPE_OUTCOME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isKnowledge()
  {
    return knowledge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKnowledge(boolean newKnowledge)
  {
    boolean oldKnowledge = knowledge;
    knowledge = newKnowledge;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.TYPE_OUTCOME__KNOWLEDGE, oldKnowledge, knowledge));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSkill()
  {
    return skill;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSkill(boolean newSkill)
  {
    boolean oldSkill = skill;
    skill = newSkill;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.TYPE_OUTCOME__SKILL, oldSkill, skill));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCompetence()
  {
    return competence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompetence(boolean newCompetence)
  {
    boolean oldCompetence = competence;
    competence = newCompetence;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.TYPE_OUTCOME__COMPETENCE, oldCompetence, competence));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AssessPackage.TYPE_OUTCOME__KNOWLEDGE:
        return isKnowledge();
      case AssessPackage.TYPE_OUTCOME__SKILL:
        return isSkill();
      case AssessPackage.TYPE_OUTCOME__COMPETENCE:
        return isCompetence();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AssessPackage.TYPE_OUTCOME__KNOWLEDGE:
        setKnowledge((Boolean)newValue);
        return;
      case AssessPackage.TYPE_OUTCOME__SKILL:
        setSkill((Boolean)newValue);
        return;
      case AssessPackage.TYPE_OUTCOME__COMPETENCE:
        setCompetence((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AssessPackage.TYPE_OUTCOME__KNOWLEDGE:
        setKnowledge(KNOWLEDGE_EDEFAULT);
        return;
      case AssessPackage.TYPE_OUTCOME__SKILL:
        setSkill(SKILL_EDEFAULT);
        return;
      case AssessPackage.TYPE_OUTCOME__COMPETENCE:
        setCompetence(COMPETENCE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AssessPackage.TYPE_OUTCOME__KNOWLEDGE:
        return knowledge != KNOWLEDGE_EDEFAULT;
      case AssessPackage.TYPE_OUTCOME__SKILL:
        return skill != SKILL_EDEFAULT;
      case AssessPackage.TYPE_OUTCOME__COMPETENCE:
        return competence != COMPETENCE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (knowledge: ");
    result.append(knowledge);
    result.append(", skill: ");
    result.append(skill);
    result.append(", competence: ");
    result.append(competence);
    result.append(')');
    return result.toString();
  }

} //TypeOutcomeImpl
