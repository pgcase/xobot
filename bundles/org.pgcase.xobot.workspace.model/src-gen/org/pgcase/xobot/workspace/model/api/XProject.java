/**
 */
package org.pgcase.xobot.workspace.model.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pgcase.xobot.workspace.model.api.XProject#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.pgcase.xobot.workspace.model.api.XProject#getName <em>Name</em>}</li>
 *   <li>{@link org.pgcase.xobot.workspace.model.api.XProject#getProjectFolders <em>Project Folders</em>}</li>
 *   <li>{@link org.pgcase.xobot.workspace.model.api.XProject#getProjectSources <em>Project Sources</em>}</li>
 *   <li>{@link org.pgcase.xobot.workspace.model.api.XProject#getProjectTargets <em>Project Targets</em>}</li>
 * </ul>
 *
 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage#getProject()
 * @model superTypes="org.pgcase.xobot.workspace.model.api.ProjectDescriptor"
 * @generated
 */
public interface XProject extends EObject, XProjectDescriptor {
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
	 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage#getProject_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.workspace.model.api.XProject#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.workspace.model.api.XProject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Project Folders</b></em>' containment reference list.
	 * The list contents are of type {@link org.pgcase.xobot.workspace.model.api.XProjectFolder}.
	 * It is bidirectional and its opposite is '{@link org.pgcase.xobot.workspace.model.api.XProjectFolder#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Folders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Folders</em>' containment reference list.
	 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage#getProject_ProjectFolders()
	 * @see org.pgcase.xobot.workspace.model.api.XProjectFolder#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<XProjectFolder> getProjectFolders();

	/**
	 * Returns the value of the '<em><b>Project Sources</b></em>' containment reference list.
	 * The list contents are of type {@link org.pgcase.xobot.workspace.model.api.XProjectSource}.
	 * It is bidirectional and its opposite is '{@link org.pgcase.xobot.workspace.model.api.XProjectSource#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Sources</em>' containment reference list.
	 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage#getProject_ProjectSources()
	 * @see org.pgcase.xobot.workspace.model.api.XProjectSource#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<XProjectSource> getProjectSources();

	/**
	 * Returns the value of the '<em><b>Project Targets</b></em>' containment reference list.
	 * The list contents are of type {@link org.pgcase.xobot.workspace.model.api.XProjectTarget}.
	 * It is bidirectional and its opposite is '{@link org.pgcase.xobot.workspace.model.api.XProjectTarget#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Targets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Targets</em>' containment reference list.
	 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage#getProject_ProjectTargets()
	 * @see org.pgcase.xobot.workspace.model.api.XProjectTarget#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<XProjectTarget> getProjectTargets();

} // XProject
