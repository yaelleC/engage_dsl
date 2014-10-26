/**
 */
package uws.engage.dsl.assess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.GameDescription#getName <em>Name</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.GameDescription#getDev <em>Dev</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.GameDescription#getDesc <em>Desc</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.GameDescription#getAgeRange <em>Age Range</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.GameDescription#getLang <em>Lang</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.GameDescription#getCountry <em>Country</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.GameDescription#getGenre <em>Genre</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.GameDescription#getSubject <em>Subject</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.GameDescription#getPublic <em>Public</em>}</li>
 * </ul>
 * </p>
 *
 * @see uws.engage.dsl.assess.AssessPackage#getGameDescription()
 * @model
 * @generated
 */
public interface GameDescription extends EObject
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
   * @see uws.engage.dsl.assess.AssessPackage#getGameDescription_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.GameDescription#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Dev</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dev</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dev</em>' attribute.
   * @see #setDev(int)
   * @see uws.engage.dsl.assess.AssessPackage#getGameDescription_Dev()
   * @model
   * @generated
   */
  int getDev();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.GameDescription#getDev <em>Dev</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dev</em>' attribute.
   * @see #getDev()
   * @generated
   */
  void setDev(int value);

  /**
   * Returns the value of the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Desc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Desc</em>' attribute.
   * @see #setDesc(String)
   * @see uws.engage.dsl.assess.AssessPackage#getGameDescription_Desc()
   * @model
   * @generated
   */
  String getDesc();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.GameDescription#getDesc <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Desc</em>' attribute.
   * @see #getDesc()
   * @generated
   */
  void setDesc(String value);

  /**
   * Returns the value of the '<em><b>Age Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Age Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Age Range</em>' containment reference.
   * @see #setAgeRange(Age)
   * @see uws.engage.dsl.assess.AssessPackage#getGameDescription_AgeRange()
   * @model containment="true"
   * @generated
   */
  Age getAgeRange();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.GameDescription#getAgeRange <em>Age Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Age Range</em>' containment reference.
   * @see #getAgeRange()
   * @generated
   */
  void setAgeRange(Age value);

  /**
   * Returns the value of the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lang</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lang</em>' attribute.
   * @see #setLang(String)
   * @see uws.engage.dsl.assess.AssessPackage#getGameDescription_Lang()
   * @model
   * @generated
   */
  String getLang();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.GameDescription#getLang <em>Lang</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lang</em>' attribute.
   * @see #getLang()
   * @generated
   */
  void setLang(String value);

  /**
   * Returns the value of the '<em><b>Country</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Country</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Country</em>' attribute.
   * @see #setCountry(String)
   * @see uws.engage.dsl.assess.AssessPackage#getGameDescription_Country()
   * @model
   * @generated
   */
  String getCountry();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.GameDescription#getCountry <em>Country</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Country</em>' attribute.
   * @see #getCountry()
   * @generated
   */
  void setCountry(String value);

  /**
   * Returns the value of the '<em><b>Genre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Genre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Genre</em>' attribute.
   * @see #setGenre(String)
   * @see uws.engage.dsl.assess.AssessPackage#getGameDescription_Genre()
   * @model
   * @generated
   */
  String getGenre();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.GameDescription#getGenre <em>Genre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Genre</em>' attribute.
   * @see #getGenre()
   * @generated
   */
  void setGenre(String value);

  /**
   * Returns the value of the '<em><b>Subject</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subject</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subject</em>' attribute.
   * @see #setSubject(String)
   * @see uws.engage.dsl.assess.AssessPackage#getGameDescription_Subject()
   * @model
   * @generated
   */
  String getSubject();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.GameDescription#getSubject <em>Subject</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subject</em>' attribute.
   * @see #getSubject()
   * @generated
   */
  void setSubject(String value);

  /**
   * Returns the value of the '<em><b>Public</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Public</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Public</em>' attribute.
   * @see #setPublic(String)
   * @see uws.engage.dsl.assess.AssessPackage#getGameDescription_Public()
   * @model
   * @generated
   */
  String getPublic();

  /**
   * Sets the value of the '{@link uws.engage.dsl.assess.GameDescription#getPublic <em>Public</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Public</em>' attribute.
   * @see #getPublic()
   * @generated
   */
  void setPublic(String value);

} // GameDescription
