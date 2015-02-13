/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.Feedback#getName <em>Name</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Feedback#getMessage <em>Message</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Feedback#getImage <em>Image</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Feedback#getType <em>Type</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Feedback#isWin <em>Win</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Feedback#isLose <em>Lose</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.Feedback#isEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getFeedback()
 * @model
 * @generated
 */
public interface Feedback extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uws.engage.dsl.assess.AssessPackage#getFeedback_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Feedback#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' attribute.
   * @see #setMessage(String)
   * @see uws.engage.dsl.assess.AssessPackage#getFeedback_Message()
   * @model
   * @generated
   */
  String getMessage();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Feedback#getMessage <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' attribute.
   * @see #getMessage()
   * @generated
   */
  void setMessage(String value);

  /**
   * Returns the value of the '<em><b>Image</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image</em>' attribute.
   * @see #setImage(String)
   * @see uws.engage.dsl.assess.AssessPackage#getFeedback_Image()
   * @model
   * @generated
   */
  String getImage();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Feedback#getImage <em>Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image</em>' attribute.
   * @see #getImage()
   * @generated
   */
  void setImage(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see uws.engage.dsl.assess.AssessPackage#getFeedback_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Feedback#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Win</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Win</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Win</em>' attribute.
   * @see #setWin(boolean)
   * @see uws.engage.dsl.assess.AssessPackage#getFeedback_Win()
   * @model
   * @generated
   */
  boolean isWin();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Feedback#isWin <em>Win</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Win</em>' attribute.
   * @see #isWin()
   * @generated
   */
  void setWin(boolean value);

  /**
   * Returns the value of the '<em><b>Lose</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lose</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lose</em>' attribute.
   * @see #setLose(boolean)
   * @see uws.engage.dsl.assess.AssessPackage#getFeedback_Lose()
   * @model
   * @generated
   */
  boolean isLose();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Feedback#isLose <em>Lose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lose</em>' attribute.
   * @see #isLose()
   * @generated
   */
  void setLose(boolean value);

  /**
   * Returns the value of the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' attribute.
   * @see #setEnd(boolean)
   * @see uws.engage.dsl.assess.AssessPackage#getFeedback_End()
   * @model
   * @generated
   */
  boolean isEnd();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.Feedback#isEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #isEnd()
   * @generated
   */
  void setEnd(boolean value);

} // Feedback
