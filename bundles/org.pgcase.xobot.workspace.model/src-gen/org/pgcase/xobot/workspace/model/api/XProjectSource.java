/**
 */
package org.pgcase.xobot.workspace.model.api;

import org.eclipse.emf.ecore.EObject;

import org.pgcase.xobot.workspace.runtime.XProjectSourceDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pgcase.xobot.workspace.model.api.XProjectSource#getSourceIdentifier <em>Source Identifier</em>}</li>
 *   <li>{@link org.pgcase.xobot.workspace.model.api.XProjectSource#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage#getProjectSource()
 * @model superTypes="org.pgcase.xobot.workspace.model.api.ProjectSourceDescriptor"
 * @generated
 */
public interface XProjectSource extends EObject, XProjectSourceDescriptor {
	/**
	 * Returns the value of the '<em><b>Source Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Identifier</em>' attribute.
	 * @see #setSourceIdentifier(String)
	 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage#getProjectSource_SourceIdentifier()
	 * @model required="true"
	 * @generated
	 */
	String getSourceIdentifier();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.workspace.model.api.XProjectSource#getSourceIdentifier <em>Source Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Identifier</em>' attribute.
	 * @see #getSourceIdentifier()
	 * @generated
	 */
	void setSourceIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.pgcase.xobot.workspace.model.api.XProject#getProjectSources <em>Project Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(XProject)
	 * @see org.pgcase.xobot.workspace.model.meta.XWorkspacePackage#getProjectSource_Project()
	 * @see org.pgcase.xobot.workspace.model.api.XProject#getProjectSources
	 * @model opposite="projectSources" required="true" transient="false"
	 * @generated
	 */
	XProject getProject();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.workspace.model.api.XProjectSource#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(XProject value);

} // XProjectSource
