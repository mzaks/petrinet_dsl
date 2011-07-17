/**
 * <copyright>
 * </copyright>
 *
 */
package de.bomzhi.petrinet.petrinetDsl.impl;

import de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage;
import de.bomzhi.petrinet.petrinetDsl.Resource;
import de.bomzhi.petrinet.petrinetDsl.Storage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.impl.StorageImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.impl.StorageImpl#getCount <em>Count</em>}</li>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.impl.StorageImpl#getCapacity <em>Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StorageImpl extends MinimalEObjectImpl.Container implements Storage
{
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
   * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapacity()
   * @generated
   * @ordered
   */
  protected static final int CAPACITY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapacity()
   * @generated
   * @ordered
   */
  protected int capacity = CAPACITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StorageImpl()
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
    return PetrinetDslPackage.Literals.STORAGE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetDslPackage.STORAGE__RESOURCE_REF, oldResourceRef, resourceRef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PetrinetDslPackage.STORAGE__RESOURCE_REF, oldResourceRef, resourceRef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PetrinetDslPackage.STORAGE__COUNT, oldCount, count));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCapacity()
  {
    return capacity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCapacity(int newCapacity)
  {
    int oldCapacity = capacity;
    capacity = newCapacity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PetrinetDslPackage.STORAGE__CAPACITY, oldCapacity, capacity));
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
      case PetrinetDslPackage.STORAGE__RESOURCE_REF:
        if (resolve) return getResourceRef();
        return basicGetResourceRef();
      case PetrinetDslPackage.STORAGE__COUNT:
        return getCount();
      case PetrinetDslPackage.STORAGE__CAPACITY:
        return getCapacity();
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
      case PetrinetDslPackage.STORAGE__RESOURCE_REF:
        setResourceRef((Resource)newValue);
        return;
      case PetrinetDslPackage.STORAGE__COUNT:
        setCount((Integer)newValue);
        return;
      case PetrinetDslPackage.STORAGE__CAPACITY:
        setCapacity((Integer)newValue);
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
      case PetrinetDslPackage.STORAGE__RESOURCE_REF:
        setResourceRef((Resource)null);
        return;
      case PetrinetDslPackage.STORAGE__COUNT:
        setCount(COUNT_EDEFAULT);
        return;
      case PetrinetDslPackage.STORAGE__CAPACITY:
        setCapacity(CAPACITY_EDEFAULT);
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
      case PetrinetDslPackage.STORAGE__RESOURCE_REF:
        return resourceRef != null;
      case PetrinetDslPackage.STORAGE__COUNT:
        return count != COUNT_EDEFAULT;
      case PetrinetDslPackage.STORAGE__CAPACITY:
        return capacity != CAPACITY_EDEFAULT;
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
    result.append(", capacity: ");
    result.append(capacity);
    result.append(')');
    return result.toString();
  }

} //StorageImpl
