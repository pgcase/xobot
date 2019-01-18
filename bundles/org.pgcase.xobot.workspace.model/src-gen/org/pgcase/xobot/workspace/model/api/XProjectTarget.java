/**
 */
package org.pgcase.xobot.workspace.model.api;

import org.eclipse.emf.ecore.EObject;

import org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pgcase.xobot.workspace.model.api.XProjectTarget#getTargetIdentifier <em>Target Identifier</em>}</li>
 *   <li>{@link org.pgcase.xobot.workspace.model.api.XProjectTarget#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage#getProjectTarget()
 * @model superTypes="org.pgcase.xobot.workspace.model.api.ProjectTargetDescriptor"
 * @generated
 */
public interface XProjectTarget extends EObject, XProjectTargetDescriptor {
	/**
	 * Returns the value of the '<em><b>Target Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Identifier</em>' attribute.
	 * @see #setTargetIdentifier(String)
	 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage#getProjectTarget_TargetIdentifier()
	 * @model required="true"
	 * @generated
	 */
	String getTargetIdentifier();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.workspace.model.api.XProjectTarget#getTargetIdentifier <em>Target Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Identifier</em>' attribute.
	 * @see #getTargetIdentifier()
	 * @generated
	 */
	void setTargetIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.pgcase.xobot.workspace.model.api.XProject#getProjectTargets <em>Project Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(XProject)
	 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage#getProjectTarget_Project()
	 * @see org.pgcase.xobot.workspace.model.api.XProject#getProjectTargets
	 * @model opposite="projectTargets" required="true" transient="false"
	 * @generated
	 */
	XProject getProject();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.workspace.model.api.XProjectTarget#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(XProject value);

} // XProjectTarget
