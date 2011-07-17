/**
 * <copyright>
 * </copyright>
 *
 */
package de.bomzhi.petrinet.petrinetDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Put Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.PutStatement#getCount <em>Count</em>}</li>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.PutStatement#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link de.bomzhi.petrinet.petrinetDsl.PutStatement#getPlaceRef <em>Place Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage#getPutStatement()
 * @model
 * @generated
 */
public interface PutStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Count</em>' attribute.
   * @see #setCount(int)
   * @see de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage#getPutStatement_Count()
   * @model
   * @generated
   */
  int getCount();

  /**
   * Sets the value of the '{@link de.bomzhi.petrinet.petrinetDsl.PutStatement#getCount <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' attribute.
   * @see #getCount()
   * @generated
   */
  void setCount(int value);

  /**
   * Returns the value of the '<em><b>Resource Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Ref</em>' reference.
   * @see #setResourceRef(Resource)
   * @see de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage#getPutStatement_ResourceRef()
   * @model
   * @generated
   */
  Resource getResourceRef();

  /**
   * Sets the value of the '{@link de.bomzhi.petrinet.petrinetDsl.PutStatement#getResourceRef <em>Resource Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource Ref</em>' reference.
   * @see #getResourceRef()
   * @generated
   */
  void setResourceRef(Resource value);

  /**
   * Returns the value of the '<em><b>Place Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Place Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Place Ref</em>' reference.
   * @see #setPlaceRef(Place)
   * @see de.bomzhi.petrinet.petrinetDsl.PetrinetDslPackage#getPutStatement_PlaceRef()
   * @model
   * @generated
   */
  Place getPlaceRef();

  /**
   * Sets the value of the '{@link de.bomzhi.petrinet.petrinetDsl.PutStatement#getPlaceRef <em>Place Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Place Ref</em>' reference.
   * @see #getPlaceRef()
   * @generated
   */
  void setPlaceRef(Place value);

} // PutStatement
