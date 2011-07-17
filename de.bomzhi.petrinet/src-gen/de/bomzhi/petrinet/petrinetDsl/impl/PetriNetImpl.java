/**
 * <copyright>
 * </copyright>
 *
 */
package de.bomzhi.petrinet.petrinetDsl.impl;

import de.bomzhi.petrinet.petrinetDsl.PetriNet;
import de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage;
import de.bomzhi.petrinet.petrinetDsl.Place;
import de.bomzhi.petrinet.petrinetDsl.Resource;
import de.bomzhi.petrinet.petrinetDsl.Transaction;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.impl.PetriNetImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.impl.PetriNetImpl#getPlaces <em>Places</em>}</li>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.impl.PetriNetImpl#getTransactions <em>Transactions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PetriNetImpl extends MinimalEObjectImpl.Container implements PetriNet
{
  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected EList<Resource> resources;

  /**
   * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlaces()
   * @generated
   * @ordered
   */
  protected EList<Place> places;

  /**
   * The cached value of the '{@link #getTransactions() <em>Transactions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransactions()
   * @generated
   * @ordered
   */
  protected EList<Transaction> transactions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PetriNetImpl()
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
    return PetrinetDslPackage.Literals.PETRI_NET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Resource> getResources()
  {
    if (resources == null)
    {
      resources = new EObjectContainmentEList<Resource>(Resource.class, this, PetrinetDslPackage.PETRI_NET__RESOURCES);
    }
    return resources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Place> getPlaces()
  {
    if (places == null)
    {
      places = new EObjectContainmentEList<Place>(Place.class, this, PetrinetDslPackage.PETRI_NET__PLACES);
    }
    return places;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transaction> getTransactions()
  {
    if (transactions == null)
    {
      transactions = new EObjectContainmentEList<Transaction>(Transaction.class, this, PetrinetDslPackage.PETRI_NET__TRANSACTIONS);
    }
    return transactions;
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
      case PetrinetDslPackage.PETRI_NET__RESOURCES:
        return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
      case PetrinetDslPackage.PETRI_NET__PLACES:
        return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
      case PetrinetDslPackage.PETRI_NET__TRANSACTIONS:
        return ((InternalEList<?>)getTransactions()).basicRemove(otherEnd, msgs);
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
      case PetrinetDslPackage.PETRI_NET__RESOURCES:
        return getResources();
      case PetrinetDslPackage.PETRI_NET__PLACES:
        return getPlaces();
      case PetrinetDslPackage.PETRI_NET__TRANSACTIONS:
        return getTransactions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PetrinetDslPackage.PETRI_NET__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends Resource>)newValue);
        return;
      case PetrinetDslPackage.PETRI_NET__PLACES:
        getPlaces().clear();
        getPlaces().addAll((Collection<? extends Place>)newValue);
        return;
      case PetrinetDslPackage.PETRI_NET__TRANSACTIONS:
        getTransactions().clear();
        getTransactions().addAll((Collection<? extends Transaction>)newValue);
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
      case PetrinetDslPackage.PETRI_NET__RESOURCES:
        getResources().clear();
        return;
      case PetrinetDslPackage.PETRI_NET__PLACES:
        getPlaces().clear();
        return;
      case PetrinetDslPackage.PETRI_NET__TRANSACTIONS:
        getTransactions().clear();
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
      case PetrinetDslPackage.PETRI_NET__RESOURCES:
        return resources != null && !resources.isEmpty();
      case PetrinetDslPackage.PETRI_NET__PLACES:
        return places != null && !places.isEmpty();
      case PetrinetDslPackage.PETRI_NET__TRANSACTIONS:
        return transactions != null && !transactions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PetriNetImpl
