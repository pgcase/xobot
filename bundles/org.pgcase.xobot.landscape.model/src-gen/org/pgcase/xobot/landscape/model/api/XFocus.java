/**
 * Copyright (c) 2018-2019 ArSysOp
 */
package org.pgcase.xobot.landscape.model.api;

import org.eclipse.emf.ecore.EObject;

import org.pgcase.xobot.landscape.runtime.XFocusDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Focus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pgcase.xobot.landscape.model.api.XFocus#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.pgcase.xobot.landscape.model.api.XFocus#getName <em>Name</em>}</li>
 *   <li>{@link org.pgcase.xobot.landscape.model.api.XFocus#getMaturity <em>Maturity</em>}</li>
 *   <li>{@link org.pgcase.xobot.landscape.model.api.XFocus#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.pgcase.xobot.landscape.model.api.XFocus#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see org.pgcase.xobot.landscape.model.meta.XLandscapePackage#getFocus()
 * @model abstract="true" superTypes="org.pgcase.xobot.landscape.model.api.FocusDescriptor"
 * @generated
 */
public interface XFocus extends EObject, XFocusDescriptor {
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
	 * @see org.pgcase.xobot.landscape.model.meta.XLandscapePackage#getFocus_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.landscape.model.api.XFocus#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see org.pgcase.xobot.landscape.model.meta.XLandscapePackage#getFocus_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.landscape.model.api.XFocus#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Maturity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maturity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maturity</em>' attribute.
	 * @see #setMaturity(String)
	 * @see org.pgcase.xobot.landscape.model.meta.XLandscapePackage#getFocus_Maturity()
	 * @model
	 * @generated
	 */
	String getMaturity();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.landscape.model.api.XFocus#getMaturity <em>Maturity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maturity</em>' attribute.
	 * @see #getMaturity()
	 * @generated
	 */
	void setMaturity(String value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see #setOrigin(String)
	 * @see org.pgcase.xobot.landscape.model.meta.XLandscapePackage#getFocus_Origin()
	 * @model
	 * @generated
	 */
	String getOrigin();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.landscape.model.api.XFocus#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(String value);

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
	 * @see org.pgcase.xobot.landscape.model.meta.XLandscapePackage#getFocus_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.landscape.model.api.XFocus#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // XFocus
