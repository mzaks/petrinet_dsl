/**
 * <copyright>
 * </copyright>
 *
 */
package de.bomzhi.petrinet.petrinetDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.PetriNet#getResources <em>Resources</em>}</li>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.PetriNet#getPlaces <em>Places</em>}</li>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.PetriNet#getTransactions <em>Transactions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage#getPetriNet()
 * @model
 * @generated
 */
public interface PetriNet extends EObject
{
  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link de.bomzhi.petrinet.petrinetDsl.Resource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage#getPetriNet_Resources()
   * @model containment="true"
   * @generated
   */
  EList<Resource> getResources();

  /**
   * Returns the value of the '<em><b>Places</b></em>' containment reference list.
   * The list contents are of type {@link de.bomzhi.petrinet.petrinetDsl.Place}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Places</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Places</em>' containment reference list.
   * @see de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage#getPetriNet_Places()
   * @model containment="true"
   * @generated
   */
  EList<Place> getPlaces();

  /**
   * Returns the value of the '<em><b>Transactions</b></em>' containment reference list.
   * The list contents are of type {@link de.bomzhi.petrinet.petrinetDsl.Transaction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transactions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transactions</em>' containment reference list.
   * @see de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage#getPetriNet_Transactions()
   * @model containment="true"
   * @generated
   */
  EList<Transaction> getTransactions();

} // PetriNet
