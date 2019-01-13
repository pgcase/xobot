/**
 */
package org.pgcase.xobot.landscape.api;

import org.eclipse.emf.ecore.EObject;

import org.pgcase.xobot.landscape.runtime.XTargetDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pgcase.xobot.landscape.api.XTarget#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.pgcase.xobot.landscape.api.XTarget#getName <em>Name</em>}</li>
 *   <li>{@link org.pgcase.xobot.landscape.api.XTarget#getUri <em>Uri</em>}</li>
 *   <li>{@link org.pgcase.xobot.landscape.api.XTarget#getTargetSet <em>Target Set</em>}</li>
 * </ul>
 *
 * @see org.pgcase.xobot.landscape.meta.XLandscapePackage#getTarget()
 * @model superTypes="org.pgcase.xobot.landscape.api.TargetDescriptor"
 * @generated
 */
public interface XTarget extends EObject, XTargetDescriptor {
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
	 * @see org.pgcase.xobot.landscape.meta.XLandscapePackage#getTarget_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.landscape.api.XTarget#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see org.pgcase.xobot.landscape.meta.XLandscapePackage#getTarget_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.landscape.api.XTarget#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.pgcase.xobot.landscape.meta.XLandscapePackage#getTarget_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.landscape.api.XTarget#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Target Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.pgcase.xobot.landscape.api.XTargetSet#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Set</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Set</em>' container reference.
	 * @see #setTargetSet(XTargetSet)
	 * @see org.pgcase.xobot.landscape.meta.XLandscapePackage#getTarget_TargetSet()
	 * @see org.pgcase.xobot.landscape.api.XTargetSet#getTargets
	 * @model opposite="targets" required="true" transient="false"
	 * @generated
	 */
	XTargetSet getTargetSet();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.landscape.api.XTarget#getTargetSet <em>Target Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Set</em>' container reference.
	 * @see #getTargetSet()
	 * @generated
	 */
	void setTargetSet(XTargetSet value);

} // XTarget
