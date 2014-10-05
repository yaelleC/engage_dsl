/**
 */
package uws.chaudy.engage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.chaudy.engage.Model#getGame <em>Game</em>}</li>
 *   <li>{@link uws.chaudy.engage.Model#getPlayer <em>Player</em>}</li>
 *   <li>{@link uws.chaudy.engage.Model#getLearningOutcomes <em>Learning Outcomes</em>}</li>
 *   <li>{@link uws.chaudy.engage.Model#getFeedbackMessages <em>Feedback Messages</em>}</li>
 *   <li>{@link uws.chaudy.engage.Model#getEvidenceModel <em>Evidence Model</em>}</li>
 *   <li>{@link uws.chaudy.engage.Model#getFeedbackModel <em>Feedback Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.chaudy.engage.EngagePackage#getModel()
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
   * @see uws.chaudy.engage.EngagePackage#getModel_Game()
   * @model containment="true"
   * @generated
   */
  GameDescription getGame();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.Model#getGame <em>Game</em>}' containment reference.
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
   * @see uws.chaudy.engage.EngagePackage#getModel_Player()
   * @model containment="true"
   * @generated
   */
  PlayerDescription getPlayer();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.Model#getPlayer <em>Player</em>}' containment reference.
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
   * @see uws.chaudy.engage.EngagePackage#getModel_LearningOutcomes()
   * @model containment="true"
   * @generated
   */
  LearningOutcomes getLearningOutcomes();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.Model#getLearningOutcomes <em>Learning Outcomes</em>}' containment reference.
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
   * @see uws.chaudy.engage.EngagePackage#getModel_FeedbackMessages()
   * @model containment="true"
   * @generated
   */
  FeedbackMessages getFeedbackMessages();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.Model#getFeedbackMessages <em>Feedback Messages</em>}' containment reference.
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
   * @see uws.chaudy.engage.EngagePackage#getModel_EvidenceModel()
   * @model containment="true"
   * @generated
   */
  EvidenceModel getEvidenceModel();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.Model#getEvidenceModel <em>Evidence Model</em>}' containment reference.
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
   * @see uws.chaudy.engage.EngagePackage#getModel_FeedbackModel()
   * @model containment="true"
   * @generated
   */
  FeedbackModel getFeedbackModel();

  /**
   * Sets the value of the '{@link uws.chaudy.engage.Model#getFeedbackModel <em>Feedback Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feedback Model</em>' containment reference.
   * @see #getFeedbackModel()
   * @generated
   */
  void setFeedbackModel(FeedbackModel value);

} // Model
