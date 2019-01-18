/**
 */
package org.pgcase.xobot.landscape.model.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.pgcase.xobot.landscape.runtime.XTargetSetDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pgcase.xobot.landscape.model.api.XTargetSet#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.pgcase.xobot.landscape.model.api.XTargetSet#getName <em>Name</em>}</li>
 *   <li>{@link org.pgcase.xobot.landscape.model.api.XTargetSet#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see org.pgcase.xobot.landscape.model.meta.XLandscapePackage#getTargetSet()
 * @model superTypes="org.pgcase.xobot.landscape.model.api.TargetSetDescriptor"
 * @generated
 */
public interface XTargetSet extends EObject, XTargetSetDescriptor {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.pgcase.xobot.landscape.model.meta.XLandscapePackage#getTargetSet_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.landscape.model.api.XTargetSet#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

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
	 * @see org.pgcase.xobot.landscape.model.meta.XLandscapePackage#getTargetSet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.landscape.model.api.XTargetSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
	 * The list contents are of type {@link org.pgcase.xobot.landscape.model.api.XTarget}.
	 * It is bidirectional and its opposite is '{@link org.pgcase.xobot.landscape.model.api.XTarget#getTargetSet <em>Target Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference list.
	 * @see org.pgcase.xobot.landscape.model.meta.XLandscapePackage#getTargetSet_Targets()
	 * @see org.pgcase.xobot.landscape.model.api.XTarget#getTargetSet
	 * @model opposite="targetSet" containment="true"
	 * @generated
	 */
	EList<XTarget> getTargets();

} // XTargetSet
