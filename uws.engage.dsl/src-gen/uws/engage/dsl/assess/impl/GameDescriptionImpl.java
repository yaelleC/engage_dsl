/**
 */
package uws.engage.dsl.assess.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uws.engage.dsl.assess.Age;
import uws.engage.dsl.assess.AssessPackage;
import uws.engage.dsl.assess.GameDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.GameDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.GameDescriptionImpl#getDev <em>Dev</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.GameDescriptionImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.GameDescriptionImpl#getAgeRange <em>Age Range</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.GameDescriptionImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.GameDescriptionImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.GameDescriptionImpl#getGenre <em>Genre</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.GameDescriptionImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.GameDescriptionImpl#getPublic <em>Public</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GameDescriptionImpl extends MinimalEObjectImpl.Container implements GameDescription
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDev() <em>Dev</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDev()
   * @generated
   * @ordered
   */
  protected static final int DEV_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDev() <em>Dev</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDev()
   * @generated
   * @ordered
   */
  protected int dev = DEV_EDEFAULT;

  /**
   * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected static final String DESC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected String desc = DESC_EDEFAULT;

  /**
   * The cached value of the '{@link #getAgeRange() <em>Age Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgeRange()
   * @generated
   * @ordered
   */
  protected Age ageRange;

  /**
   * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLang()
   * @generated
   * @ordered
   */
  protected static final String LANG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLang()
   * @generated
   * @ordered
   */
  protected String lang = LANG_EDEFAULT;

  /**
   * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountry()
   * @generated
   * @ordered
   */
  protected static final String COUNTRY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountry()
   * @generated
   * @ordered
   */
  protected String country = COUNTRY_EDEFAULT;

  /**
   * The default value of the '{@link #getGenre() <em>Genre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenre()
   * @generated
   * @ordered
   */
  protected static final String GENRE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGenre() <em>Genre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenre()
   * @generated
   * @ordered
   */
  protected String genre = GENRE_EDEFAULT;

  /**
   * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubject()
   * @generated
   * @ordered
   */
  protected static final String SUBJECT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubject()
   * @generated
   * @ordered
   */
  protected String subject = SUBJECT_EDEFAULT;

  /**
   * The default value of the '{@link #getPublic() <em>Public</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPublic()
   * @generated
   * @ordered
   */
  protected static final String PUBLIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPublic() <em>Public</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPublic()
   * @generated
   * @ordered
   */
  protected String public_ = PUBLIC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GameDescriptionImpl()
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
    return AssessPackage.Literals.GAME_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.GAME_DESCRIPTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDev()
  {
    return dev;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDev(int newDev)
  {
    int oldDev = dev;
    dev = newDev;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.GAME_DESCRIPTION__DEV, oldDev, dev));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDesc()
  {
    return desc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesc(String newDesc)
  {
    String oldDesc = desc;
    desc = newDesc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.GAME_DESCRIPTION__DESC, oldDesc, desc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Age getAgeRange()
  {
    return ageRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAgeRange(Age newAgeRange, NotificationChain msgs)
  {
    Age oldAgeRange = ageRange;
    ageRange = newAgeRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessPackage.GAME_DESCRIPTION__AGE_RANGE, oldAgeRange, newAgeRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAgeRange(Age newAgeRange)
  {
    if (newAgeRange != ageRange)
    {
      NotificationChain msgs = null;
      if (ageRange != null)
        msgs = ((InternalEObject)ageRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessPackage.GAME_DESCRIPTION__AGE_RANGE, null, msgs);
      if (newAgeRange != null)
        msgs = ((InternalEObject)newAgeRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssessPackage.GAME_DESCRIPTION__AGE_RANGE, null, msgs);
      msgs = basicSetAgeRange(newAgeRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.GAME_DESCRIPTION__AGE_RANGE, newAgeRange, newAgeRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLang()
  {
    return lang;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLang(String newLang)
  {
    String oldLang = lang;
    lang = newLang;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.GAME_DESCRIPTION__LANG, oldLang, lang));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCountry()
  {
    return country;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCountry(String newCountry)
  {
    String oldCountry = country;
    country = newCountry;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.GAME_DESCRIPTION__COUNTRY, oldCountry, country));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGenre()
  {
    return genre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenre(String newGenre)
  {
    String oldGenre = genre;
    genre = newGenre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.GAME_DESCRIPTION__GENRE, oldGenre, genre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSubject()
  {
    return subject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubject(String newSubject)
  {
    String oldSubject = subject;
    subject = newSubject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.GAME_DESCRIPTION__SUBJECT, oldSubject, subject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPublic()
  {
    return public_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPublic(String newPublic)
  {
    String oldPublic = public_;
    public_ = newPublic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.GAME_DESCRIPTION__PUBLIC, oldPublic, public_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AssessPackage.GAME_DESCRIPTION__AGE_RANGE:
        return basicSetAgeRange(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AssessPackage.GAME_DESCRIPTION__NAME:
        return getName();
      case AssessPackage.GAME_DESCRIPTION__DEV:
        return getDev();
      case AssessPackage.GAME_DESCRIPTION__DESC:
        return getDesc();
      case AssessPackage.GAME_DESCRIPTION__AGE_RANGE:
        return getAgeRange();
      case AssessPackage.GAME_DESCRIPTION__LANG:
        return getLang();
      case AssessPackage.GAME_DESCRIPTION__COUNTRY:
        return getCountry();
      case AssessPackage.GAME_DESCRIPTION__GENRE:
        return getGenre();
      case AssessPackage.GAME_DESCRIPTION__SUBJECT:
        return getSubject();
      case AssessPackage.GAME_DESCRIPTION__PUBLIC:
        return getPublic();
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
      case AssessPackage.GAME_DESCRIPTION__NAME:
        setName((String)newValue);
        return;
      case AssessPackage.GAME_DESCRIPTION__DEV:
        setDev((Integer)newValue);
        return;
      case AssessPackage.GAME_DESCRIPTION__DESC:
        setDesc((String)newValue);
        return;
      case AssessPackage.GAME_DESCRIPTION__AGE_RANGE:
        setAgeRange((Age)newValue);
        return;
      case AssessPackage.GAME_DESCRIPTION__LANG:
        setLang((String)newValue);
        return;
      case AssessPackage.GAME_DESCRIPTION__COUNTRY:
        setCountry((String)newValue);
        return;
      case AssessPackage.GAME_DESCRIPTION__GENRE:
        setGenre((String)newValue);
        return;
      case AssessPackage.GAME_DESCRIPTION__SUBJECT:
        setSubject((String)newValue);
        return;
      case AssessPackage.GAME_DESCRIPTION__PUBLIC:
        setPublic((String)newValue);
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
      case AssessPackage.GAME_DESCRIPTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AssessPackage.GAME_DESCRIPTION__DEV:
        setDev(DEV_EDEFAULT);
        return;
      case AssessPackage.GAME_DESCRIPTION__DESC:
        setDesc(DESC_EDEFAULT);
        return;
      case AssessPackage.GAME_DESCRIPTION__AGE_RANGE:
        setAgeRange((Age)null);
        return;
      case AssessPackage.GAME_DESCRIPTION__LANG:
        setLang(LANG_EDEFAULT);
        return;
      case AssessPackage.GAME_DESCRIPTION__COUNTRY:
        setCountry(COUNTRY_EDEFAULT);
        return;
      case AssessPackage.GAME_DESCRIPTION__GENRE:
        setGenre(GENRE_EDEFAULT);
        return;
      case AssessPackage.GAME_DESCRIPTION__SUBJECT:
        setSubject(SUBJECT_EDEFAULT);
        return;
      case AssessPackage.GAME_DESCRIPTION__PUBLIC:
        setPublic(PUBLIC_EDEFAULT);
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
      case AssessPackage.GAME_DESCRIPTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AssessPackage.GAME_DESCRIPTION__DEV:
        return dev != DEV_EDEFAULT;
      case AssessPackage.GAME_DESCRIPTION__DESC:
        return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
      case AssessPackage.GAME_DESCRIPTION__AGE_RANGE:
        return ageRange != null;
      case AssessPackage.GAME_DESCRIPTION__LANG:
        return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
      case AssessPackage.GAME_DESCRIPTION__COUNTRY:
        return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
      case AssessPackage.GAME_DESCRIPTION__GENRE:
        return GENRE_EDEFAULT == null ? genre != null : !GENRE_EDEFAULT.equals(genre);
      case AssessPackage.GAME_DESCRIPTION__SUBJECT:
        return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
      case AssessPackage.GAME_DESCRIPTION__PUBLIC:
        return PUBLIC_EDEFAULT == null ? public_ != null : !PUBLIC_EDEFAULT.equals(public_);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", dev: ");
    result.append(dev);
    result.append(", desc: ");
    result.append(desc);
    result.append(", lang: ");
    result.append(lang);
    result.append(", country: ");
    result.append(country);
    result.append(", genre: ");
    result.append(genre);
    result.append(", subject: ");
    result.append(subject);
    result.append(", public: ");
    result.append(public_);
    result.append(')');
    return result.toString();
  }

} //GameDescriptionImpl
