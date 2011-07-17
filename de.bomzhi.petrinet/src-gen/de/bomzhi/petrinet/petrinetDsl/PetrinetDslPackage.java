/**
 * <copyright>
 * </copyright>
 *
 */
package de.bomzhi.petrinet.petrinetDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.bomzhi.petrinet.petrinetDsl.PetrinetDslFactory
 * @model kind="package"
 * @generated
 */
public interface PetrinetDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "petrinetDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bomzhi.de/petrinet/PetrinetDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "petrinetDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PetrinetDslPackage eINSTANCE = de.bomzhi.petrinet.petrinetDsl.impl.PetrinetDslPackageImpl.init();

  /**
   * The meta object id for the '{@link de.bomzhi.petrinet.petrinetDsl.impl.PetriNetImpl <em>Petri Net</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bomzhi.petrinet.petrinetDsl.impl.PetriNetImpl
   * @see de.bomzhi.petrinet.petrinetDsl.impl.PetrinetDslPackageImpl#getPetriNet()
   * @generated
   */
  int PETRI_NET = 0;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PETRI_NET__RESOURCES = 0;

  /**
   * The feature id for the '<em><b>Places</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PETRI_NET__PLACES = 1;

  /**
   * The feature id for the '<em><b>Transactions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PETRI_NET__TRANSACTIONS = 2;

  /**
   * The number of structural features of the '<em>Petri Net</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PETRI_NET_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.bomzhi.petrinet.petrinetDsl.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bomzhi.petrinet.petrinetDsl.impl.ResourceImpl
   * @see de.bomzhi.petrinet.petrinetDsl.impl.PetrinetDslPackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__NAME = 0;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.bomzhi.petrinet.petrinetDsl.impl.PlaceImpl <em>Place</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bomzhi.petrinet.petrinetDsl.impl.PlaceImpl
   * @see de.bomzhi.petrinet.petrinetDsl.impl.PetrinetDslPackageImpl#getPlace()
   * @generated
   */
  int PLACE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE__NAME = 0;

  /**
   * The feature id for the '<em><b>Storages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE__STORAGES = 1;

  /**
   * The number of structural features of the '<em>Place</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.bomzhi.petrinet.petrinetDsl.impl.StorageImpl <em>Storage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bomzhi.petrinet.petrinetDsl.impl.StorageImpl
   * @see de.bomzhi.petrinet.petrinetDsl.impl.PetrinetDslPackageImpl#getStorage()
   * @generated
   */
  int STORAGE = 3;

  /**
   * The feature id for the '<em><b>Resource Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORAGE__RESOURCE_REF = 0;

  /**
   * The feature id for the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORAGE__COUNT = 1;

  /**
   * The feature id for the '<em><b>Capacity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORAGE__CAPACITY = 2;

  /**
   * The number of structural features of the '<em>Storage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORAGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.bomzhi.petrinet.petrinetDsl.impl.TransactionImpl <em>Transaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bomzhi.petrinet.petrinetDsl.impl.TransactionImpl
   * @see de.bomzhi.petrinet.petrinetDsl.impl.PetrinetDslPackageImpl#getTransaction()
   * @generated
   */
  int TRANSACTION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Assure Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__ASSURE_STATEMENTS = 1;

  /**
   * The feature id for the '<em><b>Take Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__TAKE_STATEMENTS = 2;

  /**
   * The feature id for the '<em><b>Put Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__PUT_STATEMENTS = 3;

  /**
   * The number of structural features of the '<em>Transaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.bomzhi.petrinet.petrinetDsl.impl.AssureStatementImpl <em>Assure Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bomzhi.petrinet.petrinetDsl.impl.AssureStatementImpl
   * @see de.bomzhi.petrinet.petrinetDsl.impl.PetrinetDslPackageImpl#getAssureStatement()
   * @generated
   */
  int ASSURE_STATEMENT = 5;

  /**
   * The feature id for the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURE_STATEMENT__COUNT = 0;

  /**
   * The feature id for the '<em><b>Resource Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURE_STATEMENT__RESOURCE_REF = 1;

  /**
   * The feature id for the '<em><b>Place Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURE_STATEMENT__PLACE_REF = 2;

  /**
   * The number of structural features of the '<em>Assure Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURE_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.bomzhi.petrinet.petrinetDsl.impl.TakeStatementImpl <em>Take Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bomzhi.petrinet.petrinetDsl.impl.TakeStatementImpl
   * @see de.bomzhi.petrinet.petrinetDsl.impl.PetrinetDslPackageImpl#getTakeStatement()
   * @generated
   */
  int TAKE_STATEMENT = 6;

  /**
   * The feature id for the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAKE_STATEMENT__COUNT = 0;

  /**
   * The feature id for the '<em><b>Resource Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAKE_STATEMENT__RESOURCE_REF = 1;

  /**
   * The feature id for the '<em><b>Place Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAKE_STATEMENT__PLACE_REF = 2;

  /**
   * The number of structural features of the '<em>Take Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAKE_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.bomzhi.petrinet.petrinetDsl.impl.PutStatementImpl <em>Put Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bomzhi.petrinet.petrinetDsl.impl.PutStatementImpl
   * @see de.bomzhi.petrinet.petrinetDsl.impl.PetrinetDslPackageImpl#getPutStatement()
   * @generated
   */
  int PUT_STATEMENT = 7;

  /**
   * The feature id for the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUT_STATEMENT__COUNT = 0;

  /**
   * The feature id for the '<em><b>Resource Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUT_STATEMENT__RESOURCE_REF = 1;

  /**
   * The feature id for the '<em><b>Place Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUT_STATEMENT__PLACE_REF = 2;

  /**
   * The number of structural features of the '<em>Put Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUT_STATEMENT_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link de.bomzhi.petrinet.petrinetDsl.PetriNet <em>Petri Net</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Petri Net</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.PetriNet
   * @generated
   */
  EClass getPetriNet();

  /**
   * Returns the meta object for the containment reference list '{@link de.bomzhi.petrinet.petrinetDsl.PetriNet#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.PetriNet#getResources()
   * @see #getPetriNet()
   * @generated
   */
  EReference getPetriNet_Resources();

  /**
   * Returns the meta object for the containment reference list '{@link de.bomzhi.petrinet.petrinetDsl.PetriNet#getPlaces <em>Places</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Places</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.PetriNet#getPlaces()
   * @see #getPetriNet()
   * @generated
   */
  EReference getPetriNet_Places();

  /**
   * Returns the meta object for the containment reference list '{@link de.bomzhi.petrinet.petrinetDsl.PetriNet#getTransactions <em>Transactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transactions</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.PetriNet#getTransactions()
   * @see #getPetriNet()
   * @generated
   */
  EReference getPetriNet_Transactions();

  /**
   * Returns the meta object for class '{@link de.bomzhi.petrinet.petrinetDsl.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.Resource
   * @generated
   */
  EClass getResource();

  /**
   * Returns the meta object for the attribute '{@link de.bomzhi.petrinet.petrinetDsl.Resource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.Resource#getName()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Name();

  /**
   * Returns the meta object for class '{@link de.bomzhi.petrinet.petrinetDsl.Place <em>Place</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Place</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.Place
   * @generated
   */
  EClass getPlace();

  /**
   * Returns the meta object for the attribute '{@link de.bomzhi.petrinet.petrinetDsl.Place#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.Place#getName()
   * @see #getPlace()
   * @generated
   */
  EAttribute getPlace_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.bomzhi.petrinet.petrinetDsl.Place#getStorages <em>Storages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Storages</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.Place#getStorages()
   * @see #getPlace()
   * @generated
   */
  EReference getPlace_Storages();

  /**
   * Returns the meta object for class '{@link de.bomzhi.petrinet.petrinetDsl.Storage <em>Storage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Storage</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.Storage
   * @generated
   */
  EClass getStorage();

  /**
   * Returns the meta object for the reference '{@link de.bomzhi.petrinet.petrinetDsl.Storage#getResourceRef <em>Resource Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource Ref</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.Storage#getResourceRef()
   * @see #getStorage()
   * @generated
   */
  EReference getStorage_ResourceRef();

  /**
   * Returns the meta object for the attribute '{@link de.bomzhi.petrinet.petrinetDsl.Storage#getCount <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Count</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.Storage#getCount()
   * @see #getStorage()
   * @generated
   */
  EAttribute getStorage_Count();

  /**
   * Returns the meta object for the attribute '{@link de.bomzhi.petrinet.petrinetDsl.Storage#getCapacity <em>Capacity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Capacity</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.Storage#getCapacity()
   * @see #getStorage()
   * @generated
   */
  EAttribute getStorage_Capacity();

  /**
   * Returns the meta object for class '{@link de.bomzhi.petrinet.petrinetDsl.Transaction <em>Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transaction</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.Transaction
   * @generated
   */
  EClass getTransaction();

  /**
   * Returns the meta object for the attribute '{@link de.bomzhi.petrinet.petrinetDsl.Transaction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.Transaction#getName()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.bomzhi.petrinet.petrinetDsl.Transaction#getAssureStatements <em>Assure Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assure Statements</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.Transaction#getAssureStatements()
   * @see #getTransaction()
   * @generated
   */
  EReference getTransaction_AssureStatements();

  /**
   * Returns the meta object for the containment reference list '{@link de.bomzhi.petrinet.petrinetDsl.Transaction#getTakeStatements <em>Take Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Take Statements</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.Transaction#getTakeStatements()
   * @see #getTransaction()
   * @generated
   */
  EReference getTransaction_TakeStatements();

  /**
   * Returns the meta object for the containment reference list '{@link de.bomzhi.petrinet.petrinetDsl.Transaction#getPutStatements <em>Put Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Put Statements</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.Transaction#getPutStatements()
   * @see #getTransaction()
   * @generated
   */
  EReference getTransaction_PutStatements();

  /**
   * Returns the meta object for class '{@link de.bomzhi.petrinet.petrinetDsl.AssureStatement <em>Assure Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assure Statement</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.AssureStatement
   * @generated
   */
  EClass getAssureStatement();

  /**
   * Returns the meta object for the attribute '{@link de.bomzhi.petrinet.petrinetDsl.AssureStatement#getCount <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Count</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.AssureStatement#getCount()
   * @see #getAssureStatement()
   * @generated
   */
  EAttribute getAssureStatement_Count();

  /**
   * Returns the meta object for the reference '{@link de.bomzhi.petrinet.petrinetDsl.AssureStatement#getResourceRef <em>Resource Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource Ref</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.AssureStatement#getResourceRef()
   * @see #getAssureStatement()
   * @generated
   */
  EReference getAssureStatement_ResourceRef();

  /**
   * Returns the meta object for the reference '{@link de.bomzhi.petrinet.petrinetDsl.AssureStatement#getPlaceRef <em>Place Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Place Ref</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.AssureStatement#getPlaceRef()
   * @see #getAssureStatement()
   * @generated
   */
  EReference getAssureStatement_PlaceRef();

  /**
   * Returns the meta object for class '{@link de.bomzhi.petrinet.petrinetDsl.TakeStatement <em>Take Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Take Statement</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.TakeStatement
   * @generated
   */
  EClass getTakeStatement();

  /**
   * Returns the meta object for the attribute '{@link de.bomzhi.petrinet.petrinetDsl.TakeStatement#getCount <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Count</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.TakeStatement#getCount()
   * @see #getTakeStatement()
   * @generated
   */
  EAttribute getTakeStatement_Count();

  /**
   * Returns the meta object for the reference '{@link de.bomzhi.petrinet.petrinetDsl.TakeStatement#getResourceRef <em>Resource Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource Ref</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.TakeStatement#getResourceRef()
   * @see #getTakeStatement()
   * @generated
   */
  EReference getTakeStatement_ResourceRef();

  /**
   * Returns the meta object for the reference '{@link de.bomzhi.petrinet.petrinetDsl.TakeStatement#getPlaceRef <em>Place Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Place Ref</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.TakeStatement#getPlaceRef()
   * @see #getTakeStatement()
   * @generated
   */
  EReference getTakeStatement_PlaceRef();

  /**
   * Returns the meta object for class '{@link de.bomzhi.petrinet.petrinetDsl.PutStatement <em>Put Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Put Statement</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.PutStatement
   * @generated
   */
  EClass getPutStatement();

  /**
   * Returns the meta object for the attribute '{@link de.bomzhi.petrinet.petrinetDsl.PutStatement#getCount <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Count</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.PutStatement#getCount()
   * @see #getPutStatement()
   * @generated
   */
  EAttribute getPutStatement_Count();

  /**
   * Returns the meta object for the reference '{@link de.bomzhi.petrinet.petrinetDsl.PutStatement#getResourceRef <em>Resource Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource Ref</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.PutStatement#getResourceRef()
   * @see #getPutStatement()
   * @generated
   */
  EReference getPutStatement_ResourceRef();

  /**
   * Returns the meta object for the reference '{@link de.bomzhi.petrinet.petrinetDsl.PutStatement#getPlaceRef <em>Place Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Place Ref</em>'.
   * @see de.bomzhi.petrinet.petrinetDsl.PutStatement#getPlaceRef()
   * @see #getPutStatement()
   * @generated
   */
  EReference getPutStatement_PlaceRef();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PetrinetDslFactory getPetrinetDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.bomzhi.petrinet.petrinetDsl.impl.PetriNetImpl <em>Petri Net</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bomzhi.petrinet.petrinetDsl.impl.PetriNetImpl
     * @see de.bomzhi.petrinet.petrinetDsl.impl.PetrinetDslPackageImpl#getPetriNet()
     * @generated
     */
    EClass PETRI_NET = eINSTANCE.getPetriNet();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PETRI_NET__RESOURCES = eINSTANCE.getPetriNet_Resources();

    /**
     * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PETRI_NET__PLACES = eINSTANCE.getPetriNet_Places();

    /**
     * The meta object literal for the '<em><b>Transactions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PETRI_NET__TRANSACTIONS = eINSTANCE.getPetriNet_Transactions();

    /**
     * The meta object literal for the '{@link de.bomzhi.petrinet.petrinetDsl.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bomzhi.petrinet.petrinetDsl.impl.ResourceImpl
     * @see de.bomzhi.petrinet.petrinetDsl.impl.PetrinetDslPackageImpl#getResource()
     * @generated
     */
    EClass RESOURCE = eINSTANCE.getResource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

    /**
     * The meta object literal for the '{@link de.bomzhi.petrinet.petrinetDsl.impl.PlaceImpl <em>Place</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bomzhi.petrinet.petrinetDsl.impl.PlaceImpl
     * @see de.bomzhi.petrinet.petrinetDsl.impl.PetrinetDslPackageImpl#getPlace()
     * @generated
     */
    EClass PLACE = eINSTANCE.getPlace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLACE__NAME = eINSTANCE.getPlace_Name();

    /**
     * The meta object literal for the '<em><b>Storages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLACE__STORAGES = eINSTANCE.getPlace_Storages();

    /**
     * The meta object literal for the '{@link de.bomzhi.petrinet.petrinetDsl.impl.StorageImpl <em>Storage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bomzhi.petrinet.petrinetDsl.impl.StorageImpl
     * @see de.bomzhi.petrinet.petrinetDsl.impl.PetrinetDslPackageImpl#getStorage()
     * @generated
     */
    EClass STORAGE = eINSTANCE.getStorage();

    /**
     * The meta object literal for the '<em><b>Resource Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STORAGE__RESOURCE_REF = eINSTANCE.getStorage_ResourceRef();

    /**
     * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STORAGE__COUNT = eINSTANCE.getStorage_Count();

    /**
     * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STORAGE__CAPACITY = eINSTANCE.getStorage_Capacity();

    /**
     * The meta object literal for the '{@link de.bomzhi.petrinet.petrinetDsl.impl.TransactionImpl <em>Transaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bomzhi.petrinet.petrinetDsl.impl.TransactionImpl
     * @see de.bomzhi.petrinet.petrinetDsl.impl.PetrinetDslPackageImpl#getTransaction()
     * @generated
     */
    EClass TRANSACTION = eINSTANCE.getTransaction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__NAME = eINSTANCE.getTransaction_Name();

    /**
     * The meta object literal for the '<em><b>Assure Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTION__ASSURE_STATEMENTS = eINSTANCE.getTransaction_AssureStatements();

    /**
     * The meta object literal for the '<em><b>Take Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTION__TAKE_STATEMENTS = eINSTANCE.getTransaction_TakeStatements();

    /**
     * The meta object literal for the '<em><b>Put Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTION__PUT_STATEMENTS = eINSTANCE.getTransaction_PutStatements();

    /**
     * The meta object literal for the '{@link de.bomzhi.petrinet.petrinetDsl.impl.AssureStatementImpl <em>Assure Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bomzhi.petrinet.petrinetDsl.impl.AssureStatementImpl
     * @see de.bomzhi.petrinet.petrinetDsl.impl.PetrinetDslPackageImpl#getAssureStatement()
     * @generated
     */
    EClass ASSURE_STATEMENT = eINSTANCE.getAssureStatement();

    /**
     * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSURE_STATEMENT__COUNT = eINSTANCE.getAssureStatement_Count();

    /**
     * The meta object literal for the '<em><b>Resource Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURE_STATEMENT__RESOURCE_REF = eINSTANCE.getAssureStatement_ResourceRef();

    /**
     * The meta object literal for the '<em><b>Place Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURE_STATEMENT__PLACE_REF = eINSTANCE.getAssureStatement_PlaceRef();

    /**
     * The meta object literal for the '{@link de.bomzhi.petrinet.petrinetDsl.impl.TakeStatementImpl <em>Take Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bomzhi.petrinet.petrinetDsl.impl.TakeStatementImpl
     * @see de.bomzhi.petrinet.petrinetDsl.impl.PetrinetDslPackageImpl#getTakeStatement()
     * @generated
     */
    EClass TAKE_STATEMENT = eINSTANCE.getTakeStatement();

    /**
     * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAKE_STATEMENT__COUNT = eINSTANCE.getTakeStatement_Count();

    /**
     * The meta object literal for the '<em><b>Resource Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAKE_STATEMENT__RESOURCE_REF = eINSTANCE.getTakeStatement_ResourceRef();

    /**
     * The meta object literal for the '<em><b>Place Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAKE_STATEMENT__PLACE_REF = eINSTANCE.getTakeStatement_PlaceRef();

    /**
     * The meta object literal for the '{@link de.bomzhi.petrinet.petrinetDsl.impl.PutStatementImpl <em>Put Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bomzhi.petrinet.petrinetDsl.impl.PutStatementImpl
     * @see de.bomzhi.petrinet.petrinetDsl.impl.PetrinetDslPackageImpl#getPutStatement()
     * @generated
     */
    EClass PUT_STATEMENT = eINSTANCE.getPutStatement();

    /**
     * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PUT_STATEMENT__COUNT = eINSTANCE.getPutStatement_Count();

    /**
     * The meta object literal for the '<em><b>Resource Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PUT_STATEMENT__RESOURCE_REF = eINSTANCE.getPutStatement_ResourceRef();

    /**
     * The meta object literal for the '<em><b>Place Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PUT_STATEMENT__PLACE_REF = eINSTANCE.getPutStatement_PlaceRef();

  }

} //PetrinetDslPackage
