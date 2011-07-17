/**
 * <copyright>
 * </copyright>
 *
 */
package de.bomzhi.petrinet.petrinetDsl.impl;

import de.bomzhi.petrinet.petrinetDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetDslFactoryImpl extends EFactoryImpl implements PetrinetDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PetrinetDslFactory init()
  {
    try
    {
      PetrinetDslFactory thePetrinetDslFactory = (PetrinetDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.bomzhi.de/petrinet/PetrinetDsl"); 
      if (thePetrinetDslFactory != null)
      {
        return thePetrinetDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PetrinetDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PetrinetDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PetrinetDslPackage.PETRI_NET: return createPetriNet();
      case PetrinetDslPackage.RESOURCE: return createResource();
      case PetrinetDslPackage.PLACE: return createPlace();
      case PetrinetDslPackage.STORAGE: return createStorage();
      case PetrinetDslPackage.TRANSACTION: return createTransaction();
      case PetrinetDslPackage.ASSURE_STATEMENT: return createAssureStatement();
      case PetrinetDslPackage.TAKE_STATEMENT: return createTakeStatement();
      case PetrinetDslPackage.PUT_STATEMENT: return createPutStatement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PetriNet createPetriNet()
  {
    PetriNetImpl petriNet = new PetriNetImpl();
    return petriNet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource createResource()
  {
    ResourceImpl resource = new ResourceImpl();
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Place createPlace()
  {
    PlaceImpl place = new PlaceImpl();
    return place;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Storage createStorage()
  {
    StorageImpl storage = new StorageImpl();
    return storage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transaction createTransaction()
  {
    TransactionImpl transaction = new TransactionImpl();
    return transaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssureStatement createAssureStatement()
  {
    AssureStatementImpl assureStatement = new AssureStatementImpl();
    return assureStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TakeStatement createTakeStatement()
  {
    TakeStatementImpl takeStatement = new TakeStatementImpl();
    return takeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PutStatement createPutStatement()
  {
    PutStatementImpl putStatement = new PutStatementImpl();
    return putStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PetrinetDslPackage getPetrinetDslPackage()
  {
    return (PetrinetDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PetrinetDslPackage getPackage()
  {
    return PetrinetDslPackage.eINSTANCE;
  }

} //PetrinetDslFactoryImpl
