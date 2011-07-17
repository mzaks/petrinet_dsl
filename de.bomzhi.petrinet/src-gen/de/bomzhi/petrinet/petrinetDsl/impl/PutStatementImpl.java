/**
 * <copyright>
 * </copyright>
 *
 */
package de.bomzhi.petrinet.petrinetDsl.impl;

import de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage;
import de.bomzhi.petrinet.petrinetDsl.Place;
import de.bomzhi.petrinet.petrinetDsl.PutStatement;
import de.bomzhi.petrinet.petrinetDsl.Resource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Put Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.impl.PutStatementImpl#getCount <em>Count</em>}</li>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.impl.PutStatementImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.impl.PutStatementImpl#getPlaceRef <em>Place Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PutStatementImpl extends MinimalEObjectImpl.Container implements PutStatement
{
  /**
   * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCount()
   * @generated
   * @ordered
   */
  protected static final int COUNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCount()
   * @generated
   * @ordered
   */
  protected int count = COUNT_EDEFAULT;

  /**
   * The cached value of the '{@link #getResourceRef() <em>Resource Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceRef()
   * @generated
   * @ordered
   */
  protected Resource resourceRef;

  /**
   * The cached value of the '{@link #getPlaceRef() <em>Place Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlaceRef()
   * @generated
   * @ordered
   */
  protected Place placeRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PutStatementImpl()
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
    return PetrinetDslPackage.Literals.PUT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCount()
  {
    return count;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCount(int newCount)
  {
    int oldCount = count;
    count = newCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PetrinetDslPackage.PUT_STATEMENT__COUNT, oldCount, count));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource getResourceRef()
  {
    if (resourceRef != null && resourceRef.eIsProxy())
    {
      InternalEObject oldResourceRef = (InternalEObject)resourceRef;
      resourceRef = (Resource)eResolveProxy(oldResourceRef);
      if (resourceRef != oldResourceRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetDslPackage.PUT_STATEMENT__RESOURCE_REF, oldResourceRef, resourceRef));
      }
    }
    return resourceRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource basicGetResourceRef()
  {
    return resourceRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResourceRef(Resource newResourceRef)
  {
    Resource oldResourceRef = resourceRef;
    resourceRef = newResourceRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PetrinetDslPackage.PUT_STATEMENT__RESOURCE_REF, oldResourceRef, resourceRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Place getPlaceRef()
  {
    if (placeRef != null && placeRef.eIsProxy())
    {
      InternalEObject oldPlaceRef = (InternalEObject)placeRef;
      placeRef = (Place)eResolveProxy(oldPlaceRef);
      if (placeRef != oldPlaceRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetDslPackage.PUT_STATEMENT__PLACE_REF, oldPlaceRef, placeRef));
      }
    }
    return placeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Place basicGetPlaceRef()
  {
    return placeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlaceRef(Place newPlaceRef)
  {
    Place oldPlaceRef = placeRef;
    placeRef = newPlaceRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PetrinetDslPackage.PUT_STATEMENT__PLACE_REF, oldPlaceRef, placeRef));
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
      case PetrinetDslPackage.PUT_STATEMENT__COUNT:
        return getCount();
      case PetrinetDslPackage.PUT_STATEMENT__RESOURCE_REF:
        if (resolve) return getResourceRef();
        return basicGetResourceRef();
      case PetrinetDslPackage.PUT_STATEMENT__PLACE_REF:
        if (resolve) return getPlaceRef();
        return basicGetPlaceRef();
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
      case PetrinetDslPackage.PUT_STATEMENT__COUNT:
        setCount((Integer)newValue);
        return;
      case PetrinetDslPackage.PUT_STATEMENT__RESOURCE_REF:
        setResourceRef((Resource)newValue);
        return;
      case PetrinetDslPackage.PUT_STATEMENT__PLACE_REF:
        setPlaceRef((Place)newValue);
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
      case PetrinetDslPackage.PUT_STATEMENT__COUNT:
        setCount(COUNT_EDEFAULT);
        return;
      case PetrinetDslPackage.PUT_STATEMENT__RESOURCE_REF:
        setResourceRef((Resource)null);
        return;
      case PetrinetDslPackage.PUT_STATEMENT__PLACE_REF:
        setPlaceRef((Place)null);
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
      case PetrinetDslPackage.PUT_STATEMENT__COUNT:
        return count != COUNT_EDEFAULT;
      case PetrinetDslPackage.PUT_STATEMENT__RESOURCE_REF:
        return resourceRef != null;
      case PetrinetDslPackage.PUT_STATEMENT__PLACE_REF:
        return placeRef != null;
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
    result.append(" (count: ");
    result.append(count);
    result.append(')');
    return result.toString();
  }

} //PutStatementImpl
