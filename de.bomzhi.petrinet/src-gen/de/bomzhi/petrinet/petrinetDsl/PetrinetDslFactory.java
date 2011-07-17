/**
 * <copyright>
 * </copyright>
 *
 */
package de.bomzhi.petrinet.petrinetDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage
 * @generated
 */
public interface PetrinetDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PetrinetDslFactory eINSTANCE = de.bomzhi.petrinet.petrinetDsl.impl.PetrinetDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Petri Net</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Petri Net</em>'.
   * @generated
   */
  PetriNet createPetriNet();

  /**
   * Returns a new object of class '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource</em>'.
   * @generated
   */
  Resource createResource();

  /**
   * Returns a new object of class '<em>Place</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Place</em>'.
   * @generated
   */
  Place createPlace();

  /**
   * Returns a new object of class '<em>Storage</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Storage</em>'.
   * @generated
   */
  Storage createStorage();

  /**
   * Returns a new object of class '<em>Transaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transaction</em>'.
   * @generated
   */
  Transaction createTransaction();

  /**
   * Returns a new object of class '<em>Assure Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assure Statement</em>'.
   * @generated
   */
  AssureStatement createAssureStatement();

  /**
   * Returns a new object of class '<em>Take Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Take Statement</em>'.
   * @generated
   */
  TakeStatement createTakeStatement();

  /**
   * Returns a new object of class '<em>Put Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Put Statement</em>'.
   * @generated
   */
  PutStatement createPutStatement();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PetrinetDslPackage getPetrinetDslPackage();

} //PetrinetDslFactory
