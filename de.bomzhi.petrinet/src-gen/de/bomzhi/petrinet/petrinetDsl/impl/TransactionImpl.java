/**
 * <copyright>
 * </copyright>
 *
 */
package de.bomzhi.petrinet.petrinetDsl.impl;

import de.bomzhi.petrinet.petrinetDsl.AssureStatement;
import de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage;
import de.bomzhi.petrinet.petrinetDsl.PutStatement;
import de.bomzhi.petrinet.petrinetDsl.TakeStatement;
import de.bomzhi.petrinet.petrinetDsl.Transaction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.impl.TransactionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.impl.TransactionImpl#getAssureStatements <em>Assure Statements</em>}</li>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.impl.TransactionImpl#getTakeStatements <em>Take Statements</em>}</li>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.impl.TransactionImpl#getPutStatements <em>Put Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransactionImpl extends MinimalEObjectImpl.Container implements Transaction
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
   * The cached value of the '{@link #getAssureStatements() <em>Assure Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssureStatements()
   * @generated
   * @ordered
   */
  protected EList<AssureStatement> assureStatements;

  /**
   * The cached value of the '{@link #getTakeStatements() <em>Take Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTakeStatements()
   * @generated
   * @ordered
   */
  protected EList<TakeStatement> takeStatements;

  /**
   * The cached value of the '{@link #getPutStatements() <em>Put Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPutStatements()
   * @generated
   * @ordered
   */
  protected EList<PutStatement> putStatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransactionImpl()
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
    return PetrinetDslPackage.Literals.TRANSACTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PetrinetDslPackage.TRANSACTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AssureStatement> getAssureStatements()
  {
    if (assureStatements == null)
    {
      assureStatements = new EObjectContainmentEList<AssureStatement>(AssureStatement.class, this, PetrinetDslPackage.TRANSACTION__ASSURE_STATEMENTS);
    }
    return assureStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TakeStatement> getTakeStatements()
  {
    if (takeStatements == null)
    {
      takeStatements = new EObjectContainmentEList<TakeStatement>(TakeStatement.class, this, PetrinetDslPackage.TRANSACTION__TAKE_STATEMENTS);
    }
    return takeStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PutStatement> getPutStatements()
  {
    if (putStatements == null)
    {
      putStatements = new EObjectContainmentEList<PutStatement>(PutStatement.class, this, PetrinetDslPackage.TRANSACTION__PUT_STATEMENTS);
    }
    return putStatements;
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
      case PetrinetDslPackage.TRANSACTION__ASSURE_STATEMENTS:
        return ((InternalEList<?>)getAssureStatements()).basicRemove(otherEnd, msgs);
      case PetrinetDslPackage.TRANSACTION__TAKE_STATEMENTS:
        return ((InternalEList<?>)getTakeStatements()).basicRemove(otherEnd, msgs);
      case PetrinetDslPackage.TRANSACTION__PUT_STATEMENTS:
        return ((InternalEList<?>)getPutStatements()).basicRemove(otherEnd, msgs);
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
      case PetrinetDslPackage.TRANSACTION__NAME:
        return getName();
      case PetrinetDslPackage.TRANSACTION__ASSURE_STATEMENTS:
        return getAssureStatements();
      case PetrinetDslPackage.TRANSACTION__TAKE_STATEMENTS:
        return getTakeStatements();
      case PetrinetDslPackage.TRANSACTION__PUT_STATEMENTS:
        return getPutStatements();
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
      case PetrinetDslPackage.TRANSACTION__NAME:
        setName((String)newValue);
        return;
      case PetrinetDslPackage.TRANSACTION__ASSURE_STATEMENTS:
        getAssureStatements().clear();
        getAssureStatements().addAll((Collection<? extends AssureStatement>)newValue);
        return;
      case PetrinetDslPackage.TRANSACTION__TAKE_STATEMENTS:
        getTakeStatements().clear();
        getTakeStatements().addAll((Collection<? extends TakeStatement>)newValue);
        return;
      case PetrinetDslPackage.TRANSACTION__PUT_STATEMENTS:
        getPutStatements().clear();
        getPutStatements().addAll((Collection<? extends PutStatement>)newValue);
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
      case PetrinetDslPackage.TRANSACTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PetrinetDslPackage.TRANSACTION__ASSURE_STATEMENTS:
        getAssureStatements().clear();
        return;
      case PetrinetDslPackage.TRANSACTION__TAKE_STATEMENTS:
        getTakeStatements().clear();
        return;
      case PetrinetDslPackage.TRANSACTION__PUT_STATEMENTS:
        getPutStatements().clear();
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
      case PetrinetDslPackage.TRANSACTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PetrinetDslPackage.TRANSACTION__ASSURE_STATEMENTS:
        return assureStatements != null && !assureStatements.isEmpty();
      case PetrinetDslPackage.TRANSACTION__TAKE_STATEMENTS:
        return takeStatements != null && !takeStatements.isEmpty();
      case PetrinetDslPackage.TRANSACTION__PUT_STATEMENTS:
        return putStatements != null && !putStatements.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //TransactionImpl
