/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.Model#getGame <em>Game</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Model#getPlayer <em>Player</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Model#getLearningOutcomes <em>Learning Outcomes</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Model#getFeedbackMessages <em>Feedback Messages</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Model#getEvidenceModel <em>Evidence Model</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Model#getFeedbackModel <em>Feedback Model</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Model#getBadgeModel <em>Badge Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Game</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Game</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Game</em>' containment reference.
   * @see #setGame(GameDescription)
   * @see uws.engage.dsl.assess.AssessPackage#getModel_Game()
   * @model containment="true"
   * @generated
   */
  GameDescription getGame();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Model#getGame <em>Game</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Game</em>' containment reference.
   * @see #getGame()
   * @generated
   */
  void setGame(GameDescription value);

  /**
   * Returns the value of the '<em><b>Player</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Player</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Player</em>' containment reference.
   * @see #setPlayer(PlayerDescription)
   * @see uws.engage.dsl.assess.AssessPackage#getModel_Player()
   * @model containment="true"
   * @generated
   */
  PlayerDescription getPlayer();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Model#getPlayer <em>Player</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Player</em>' containment reference.
   * @see #getPlayer()
   * @generated
   */
  void setPlayer(PlayerDescription value);

  /**
   * Returns the value of the '<em><b>Learning Outcomes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Learning Outcomes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Learning Outcomes</em>' containment reference.
   * @see #setLearningOutcomes(LearningOutcomes)
   * @see uws.engage.dsl.assess.AssessPackage#getModel_LearningOutcomes()
   * @model containment="true"
   * @generated
   */
  LearningOutcomes getLearningOutcomes();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Model#getLearningOutcomes <em>Learning Outcomes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Learning Outcomes</em>' containment reference.
   * @see #getLearningOutcomes()
   * @generated
   */
  void setLearningOutcomes(LearningOutcomes value);

  /**
   * Returns the value of the '<em><b>Feedback Messages</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feedback Messages</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feedback Messages</em>' containment reference.
   * @see #setFeedbackMessages(FeedbackMessages)
   * @see uws.engage.dsl.assess.AssessPackage#getModel_FeedbackMessages()
   * @model containment="true"
   * @generated
   */
  FeedbackMessages getFeedbackMessages();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Model#getFeedbackMessages <em>Feedback Messages</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feedback Messages</em>' containment reference.
   * @see #getFeedbackMessages()
   * @generated
   */
  void setFeedbackMessages(FeedbackMessages value);

  /**
   * Returns the value of the '<em><b>Evidence Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evidence Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evidence Model</em>' containment reference.
   * @see #setEvidenceModel(EvidenceModel)
   * @see uws.engage.dsl.assess.AssessPackage#getModel_EvidenceModel()
   * @model containment="true"
   * @generated
   */
  EvidenceModel getEvidenceModel();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Model#getEvidenceModel <em>Evidence Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evidence Model</em>' containment reference.
   * @see #getEvidenceModel()
   * @generated
   */
  void setEvidenceModel(EvidenceModel value);

  /**
   * Returns the value of the '<em><b>Feedback Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feedback Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feedback Model</em>' containment reference.
   * @see #setFeedbackModel(FeedbackModel)
   * @see uws.engage.dsl.assess.AssessPackage#getModel_FeedbackModel()
   * @model containment="true"
   * @generated
   */
  FeedbackModel getFeedbackModel();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Model#getFeedbackModel <em>Feedback Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feedback Model</em>' containment reference.
   * @see #getFeedbackModel()
   * @generated
   */
  void setFeedbackModel(FeedbackModel value);

  /**
   * Returns the value of the '<em><b>Badge Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Badge Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Badge Model</em>' containment reference.
   * @see #setBadgeModel(BadgeModel)
   * @see uws.engage.dsl.assess.AssessPackage#getModel_BadgeModel()
   * @model containment="true"
   * @generated
   */
  BadgeModel getBadgeModel();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Model#getBadgeModel <em>Badge Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Badge Model</em>' containment reference.
   * @see #getBadgeModel()
   * @generated
   */
  void setBadgeModel(BadgeModel value);

} // Model
