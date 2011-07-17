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
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.Transaction#getName <em>Name</em>}</li>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.Transaction#getAssureStatements <em>Assure Statements</em>}</li>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.Transaction#getTakeStatements <em>Take Statements</em>}</li>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.Transaction#getPutStatements <em>Put Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage#getTransaction()
 * @model
 * @generated
 */
public interface Transaction extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage#getTransaction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.bomzhi.petrinet.petrinetDsl.Transaction#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Assure Statements</b></em>' containment reference list.
   * The list contents are of type {@link de.bomzhi.petrinet.petrinetDsl.AssureStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assure Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assure Statements</em>' containment reference list.
   * @see de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage#getTransaction_AssureStatements()
   * @model containment="true"
   * @generated
   */
  EList<AssureStatement> getAssureStatements();

  /**
   * Returns the value of the '<em><b>Take Statements</b></em>' containment reference list.
   * The list contents are of type {@link de.bomzhi.petrinet.petrinetDsl.TakeStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Take Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Take Statements</em>' containment reference list.
   * @see de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage#getTransaction_TakeStatements()
   * @model containment="true"
   * @generated
   */
  EList<TakeStatement> getTakeStatements();

  /**
   * Returns the value of the '<em><b>Put Statements</b></em>' containment reference list.
   * The list contents are of type {@link de.bomzhi.petrinet.petrinetDsl.PutStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Put Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Put Statements</em>' containment reference list.
   * @see de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage#getTransaction_PutStatements()
   * @model containment="true"
   * @generated
   */
  EList<PutStatement> getPutStatements();

} // Transaction
