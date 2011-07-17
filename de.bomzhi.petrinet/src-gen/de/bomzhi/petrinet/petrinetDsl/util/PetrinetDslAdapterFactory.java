/**
 * <copyright>
 * </copyright>
 *
 */
package de.bomzhi.petrinet.petrinetDsl.util;

import de.bomzhi.petrinet.petrinetDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage
 * @generated
 */
public class PetrinetDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PetrinetDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PetrinetDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PetrinetDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PetrinetDslSwitch<Adapter> modelSwitch =
    new PetrinetDslSwitch<Adapter>()
    {
      @Override
      public Adapter casePetriNet(PetriNet object)
      {
        return createPetriNetAdapter();
      }
      @Override
      public Adapter caseResource(Resource object)
      {
        return createResourceAdapter();
      }
      @Override
      public Adapter casePlace(Place object)
      {
        return createPlaceAdapter();
      }
      @Override
      public Adapter caseStorage(Storage object)
      {
        return createStorageAdapter();
      }
      @Override
      public Adapter caseTransaction(Transaction object)
      {
        return createTransactionAdapter();
      }
      @Override
      public Adapter caseAssureStatement(AssureStatement object)
      {
        return createAssureStatementAdapter();
      }
      @Override
      public Adapter caseTakeStatement(TakeStatement object)
      {
        return createTakeStatementAdapter();
      }
      @Override
      public Adapter casePutStatement(PutStatement object)
      {
        return createPutStatementAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.bomzhi.petrinet.petrinetDsl.PetriNet <em>Petri Net</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.bomzhi.petrinet.petrinetDsl.PetriNet
   * @generated
   */
  public Adapter createPetriNetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.bomzhi.petrinet.petrinetDsl.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.bomzhi.petrinet.petrinetDsl.Resource
   * @generated
   */
  public Adapter createResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.bomzhi.petrinet.petrinetDsl.Place <em>Place</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.bomzhi.petrinet.petrinetDsl.Place
   * @generated
   */
  public Adapter createPlaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.bomzhi.petrinet.petrinetDsl.Storage <em>Storage</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.bomzhi.petrinet.petrinetDsl.Storage
   * @generated
   */
  public Adapter createStorageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.bomzhi.petrinet.petrinetDsl.Transaction <em>Transaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.bomzhi.petrinet.petrinetDsl.Transaction
   * @generated
   */
  public Adapter createTransactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.bomzhi.petrinet.petrinetDsl.AssureStatement <em>Assure Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.bomzhi.petrinet.petrinetDsl.AssureStatement
   * @generated
   */
  public Adapter createAssureStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.bomzhi.petrinet.petrinetDsl.TakeStatement <em>Take Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.bomzhi.petrinet.petrinetDsl.TakeStatement
   * @generated
   */
  public Adapter createTakeStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.bomzhi.petrinet.petrinetDsl.PutStatement <em>Put Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.bomzhi.petrinet.petrinetDsl.PutStatement
   * @generated
   */
  public Adapter createPutStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PetrinetDslAdapterFactory
