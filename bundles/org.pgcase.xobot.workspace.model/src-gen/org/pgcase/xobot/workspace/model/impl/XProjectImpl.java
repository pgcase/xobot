/**
 */
package org.pgcase.xobot.workspace.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.pgcase.xobot.workspace.model.api.XProject;
import org.pgcase.xobot.workspace.model.api.XProjectFolder;
import org.pgcase.xobot.workspace.model.api.XProjectSource;
import org.pgcase.xobot.workspace.model.api.XProjectTarget;
import org.pgcase.xobot.workspace.model.meta.XWorkspacePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pgcase.xobot.workspace.model.impl.XProjectImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.pgcase.xobot.workspace.model.impl.XProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.pgcase.xobot.workspace.model.impl.XProjectImpl#getProjectFolders <em>Project Folders</em>}</li>
 *   <li>{@link org.pgcase.xobot.workspace.model.impl.XProjectImpl#getProjectSources <em>Project Sources</em>}</li>
 *   <li>{@link org.pgcase.xobot.workspace.model.impl.XProjectImpl#getProjectTargets <em>Project Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XProjectImpl extends MinimalEObjectImpl.Container implements XProject {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProjectFolders() <em>Project Folders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectFolders()
	 * @generated
	 * @ordered
	 */
	protected EList<XProjectFolder> projectFolders;

	/**
	 * The cached value of the '{@link #getProjectSources() <em>Project Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectSources()
	 * @generated
	 * @ordered
	 */
	protected EList<XProjectSource> projectSources;

	/**
	 * The cached value of the '{@link #getProjectTargets() <em>Project Targets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<XProjectTarget> projectTargets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XWorkspacePackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XWorkspacePackage.PROJECT__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XWorkspacePackage.PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XProjectFolder> getProjectFolders() {
		if (projectFolders == null) {
			projectFolders = new EObjectContainmentWithInverseEList<XProjectFolder>(XProjectFolder.class, this, XWorkspacePackage.PROJECT__PROJECT_FOLDERS, XWorkspacePackage.PROJECT_FOLDER__PROJECT);
		}
		return projectFolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XProjectSource> getProjectSources() {
		if (projectSources == null) {
			projectSources = new EObjectContainmentWithInverseEList<XProjectSource>(XProjectSource.class, this, XWorkspacePackage.PROJECT__PROJECT_SOURCES, XWorkspacePackage.PROJECT_SOURCE__PROJECT);
		}
		return projectSources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XProjectTarget> getProjectTargets() {
		if (projectTargets == null) {
			projectTargets = new EObjectContainmentWithInverseEList<XProjectTarget>(XProjectTarget.class, this, XWorkspacePackage.PROJECT__PROJECT_TARGETS, XWorkspacePackage.PROJECT_TARGET__PROJECT);
		}
		return projectTargets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XWorkspacePackage.PROJECT__PROJECT_FOLDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProjectFolders()).basicAdd(otherEnd, msgs);
			case XWorkspacePackage.PROJECT__PROJECT_SOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProjectSources()).basicAdd(otherEnd, msgs);
			case XWorkspacePackage.PROJECT__PROJECT_TARGETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProjectTargets()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XWorkspacePackage.PROJECT__PROJECT_FOLDERS:
				return ((InternalEList<?>)getProjectFolders()).basicRemove(otherEnd, msgs);
			case XWorkspacePackage.PROJECT__PROJECT_SOURCES:
				return ((InternalEList<?>)getProjectSources()).basicRemove(otherEnd, msgs);
			case XWorkspacePackage.PROJECT__PROJECT_TARGETS:
				return ((InternalEList<?>)getProjectTargets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XWorkspacePackage.PROJECT__IDENTIFIER:
				return getIdentifier();
			case XWorkspacePackage.PROJECT__NAME:
				return getName();
			case XWorkspacePackage.PROJECT__PROJECT_FOLDERS:
				return getProjectFolders();
			case XWorkspacePackage.PROJECT__PROJECT_SOURCES:
				return getProjectSources();
			case XWorkspacePackage.PROJECT__PROJECT_TARGETS:
				return getProjectTargets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XWorkspacePackage.PROJECT__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case XWorkspacePackage.PROJECT__NAME:
				setName((String)newValue);
				return;
			case XWorkspacePackage.PROJECT__PROJECT_FOLDERS:
				getProjectFolders().clear();
				getProjectFolders().addAll((Collection<? extends XProjectFolder>)newValue);
				return;
			case XWorkspacePackage.PROJECT__PROJECT_SOURCES:
				getProjectSources().clear();
				getProjectSources().addAll((Collection<? extends XProjectSource>)newValue);
				return;
			case XWorkspacePackage.PROJECT__PROJECT_TARGETS:
				getProjectTargets().clear();
				getProjectTargets().addAll((Collection<? extends XProjectTarget>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XWorkspacePackage.PROJECT__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case XWorkspacePackage.PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XWorkspacePackage.PROJECT__PROJECT_FOLDERS:
				getProjectFolders().clear();
				return;
			case XWorkspacePackage.PROJECT__PROJECT_SOURCES:
				getProjectSources().clear();
				return;
			case XWorkspacePackage.PROJECT__PROJECT_TARGETS:
				getProjectTargets().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XWorkspacePackage.PROJECT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case XWorkspacePackage.PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XWorkspacePackage.PROJECT__PROJECT_FOLDERS:
				return projectFolders != null && !projectFolders.isEmpty();
			case XWorkspacePackage.PROJECT__PROJECT_SOURCES:
				return projectSources != null && !projectSources.isEmpty();
			case XWorkspacePackage.PROJECT__PROJECT_TARGETS:
				return projectTargets != null && !projectTargets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (identifier: "); //$NON-NLS-1$
		result.append(identifier);
		result.append(", name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //XProjectImpl
