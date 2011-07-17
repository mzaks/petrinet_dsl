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
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.Place#getName <em>Name</em>}</li>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.Place#getStorages <em>Storages</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends EObject
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
   * @see de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage#getPlace_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.bomzhi.petrinet.petrinetDsl.Place#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Storages</b></em>' containment reference list.
   * The list contents are of type {@link de.bomzhi.petrinet.petrinetDsl.Storage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Storages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Storages</em>' containment reference list.
   * @see de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage#getPlace_Storages()
   * @model containment="true"
   * @generated
   */
  EList<Storage> getStorages();

} // Place
