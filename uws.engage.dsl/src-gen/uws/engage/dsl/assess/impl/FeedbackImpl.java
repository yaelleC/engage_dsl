/**
 */
package uws.engage.dsl.assess.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uws.engage.dsl.assess.AssessPackage;
import uws.engage.dsl.assess.Feedback;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uws.engage.dsl.assess.impl.FeedbackImpl#getName <em>Name</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.FeedbackImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.FeedbackImpl#getImage <em>Image</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.FeedbackImpl#getType <em>Type</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.FeedbackImpl#isWin <em>Win</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.FeedbackImpl#isLose <em>Lose</em>}</li>
 *   <li>{@link uws.engage.dsl.assess.impl.FeedbackImpl#isEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeedbackImpl extends MinimalEObjectImpl.Container implements Feedback
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
   * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected static final String MESSAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected String message = MESSAGE_EDEFAULT;

  /**
   * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImage()
   * @generated
   * @ordered
   */
  protected static final String IMAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImage()
   * @generated
   * @ordered
   */
  protected String image = IMAGE_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isWin() <em>Win</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWin()
   * @generated
   * @ordered
   */
  protected static final boolean WIN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWin() <em>Win</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWin()
   * @generated
   * @ordered
   */
  protected boolean win = WIN_EDEFAULT;

  /**
   * The default value of the '{@link #isLose() <em>Lose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLose()
   * @generated
   * @ordered
   */
  protected static final boolean LOSE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLose() <em>Lose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLose()
   * @generated
   * @ordered
   */
  protected boolean lose = LOSE_EDEFAULT;

  /**
   * The default value of the '{@link #isEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnd()
   * @generated
   * @ordered
   */
  protected static final boolean END_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnd()
   * @generated
   * @ordered
   */
  protected boolean end = END_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeedbackImpl()
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
    return AssessPackage.Literals.FEEDBACK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.FEEDBACK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMessage()
  {
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMessage(String newMessage)
  {
    String oldMessage = message;
    message = newMessage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.FEEDBACK__MESSAGE, oldMessage, message));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImage()
  {
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImage(String newImage)
  {
    String oldImage = image;
    image = newImage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.FEEDBACK__IMAGE, oldImage, image));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.FEEDBACK__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isWin()
  {
    return win;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWin(boolean newWin)
  {
    boolean oldWin = win;
    win = newWin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.FEEDBACK__WIN, oldWin, win));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLose()
  {
    return lose;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLose(boolean newLose)
  {
    boolean oldLose = lose;
    lose = newLose;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.FEEDBACK__LOSE, oldLose, lose));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(boolean newEnd)
  {
    boolean oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessPackage.FEEDBACK__END, oldEnd, end));
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
      case AssessPackage.FEEDBACK__NAME:
        return getName();
      case AssessPackage.FEEDBACK__MESSAGE:
        return getMessage();
      case AssessPackage.FEEDBACK__IMAGE:
        return getImage();
      case AssessPackage.FEEDBACK__TYPE:
        return getType();
      case AssessPackage.FEEDBACK__WIN:
        return isWin();
      case AssessPackage.FEEDBACK__LOSE:
        return isLose();
      case AssessPackage.FEEDBACK__END:
        return isEnd();
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
      case AssessPackage.FEEDBACK__NAME:
        setName((String)newValue);
        return;
      case AssessPackage.FEEDBACK__MESSAGE:
        setMessage((String)newValue);
        return;
      case AssessPackage.FEEDBACK__IMAGE:
        setImage((String)newValue);
        return;
      case AssessPackage.FEEDBACK__TYPE:
        setType((String)newValue);
        return;
      case AssessPackage.FEEDBACK__WIN:
        setWin((Boolean)newValue);
        return;
      case AssessPackage.FEEDBACK__LOSE:
        setLose((Boolean)newValue);
        return;
      case AssessPackage.FEEDBACK__END:
        setEnd((Boolean)newValue);
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
      case AssessPackage.FEEDBACK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AssessPackage.FEEDBACK__MESSAGE:
        setMessage(MESSAGE_EDEFAULT);
        return;
      case AssessPackage.FEEDBACK__IMAGE:
        setImage(IMAGE_EDEFAULT);
        return;
      case AssessPackage.FEEDBACK__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case AssessPackage.FEEDBACK__WIN:
        setWin(WIN_EDEFAULT);
        return;
      case AssessPackage.FEEDBACK__LOSE:
        setLose(LOSE_EDEFAULT);
        return;
      case AssessPackage.FEEDBACK__END:
        setEnd(END_EDEFAULT);
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
      case AssessPackage.FEEDBACK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AssessPackage.FEEDBACK__MESSAGE:
        return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
      case AssessPackage.FEEDBACK__IMAGE:
        return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
      case AssessPackage.FEEDBACK__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case AssessPackage.FEEDBACK__WIN:
        return win != WIN_EDEFAULT;
      case AssessPackage.FEEDBACK__LOSE:
        return lose != LOSE_EDEFAULT;
      case AssessPackage.FEEDBACK__END:
        return end != END_EDEFAULT;
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
    result.append(", message: ");
    result.append(message);
    result.append(", image: ");
    result.append(image);
    result.append(", type: ");
    result.append(type);
    result.append(", win: ");
    result.append(win);
    result.append(", lose: ");
    result.append(lose);
    result.append(", end: ");
    result.append(end);
    result.append(')');
    return result.toString();
  }

} //FeedbackImpl
