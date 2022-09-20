/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.opencps.dossiermgt.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link ProcessAction}.
 * </p>
 *
 * @author huymq
 * @see ProcessAction
 * @generated
 */
@ProviderType
public class ProcessActionWrapper implements ProcessAction,
	ModelWrapper<ProcessAction> {
	public ProcessActionWrapper(ProcessAction processAction) {
		_processAction = processAction;
	}

	@Override
	public Class<?> getModelClass() {
		return ProcessAction.class;
	}

	@Override
	public String getModelClassName() {
		return ProcessAction.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("processActionId", getProcessActionId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("serviceProcessId", getServiceProcessId());
		attributes.put("preStepCode", getPreStepCode());
		attributes.put("postStepCode", getPostStepCode());
		attributes.put("autoEvent", getAutoEvent());
		attributes.put("preCondition", getPreCondition());
		attributes.put("actionCode", getActionCode());
		attributes.put("actionName", getActionName());
		attributes.put("allowAssignUser", getAllowAssignUser());
		attributes.put("assignUserId", getAssignUserId());
		attributes.put("requestPayment", getRequestPayment());
		attributes.put("paymentFee", getPaymentFee());
		attributes.put("createDossierFiles", getCreateDossierFiles());
		attributes.put("returnDossierFiles", getReturnDossierFiles());
		attributes.put("makeBriefNote", getMakeBriefNote());
		attributes.put("syncActionCode", getSyncActionCode());
		attributes.put("rollbackable", getRollbackable());
		attributes.put("createDossierNo", getCreateDossierNo());
		attributes.put("eSignature", getESignature());
		attributes.put("configNote", getConfigNote());
		attributes.put("dossierTemplateNo", getDossierTemplateNo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long processActionId = (Long)attributes.get("processActionId");

		if (processActionId != null) {
			setProcessActionId(processActionId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long serviceProcessId = (Long)attributes.get("serviceProcessId");

		if (serviceProcessId != null) {
			setServiceProcessId(serviceProcessId);
		}

		String preStepCode = (String)attributes.get("preStepCode");

		if (preStepCode != null) {
			setPreStepCode(preStepCode);
		}

		String postStepCode = (String)attributes.get("postStepCode");

		if (postStepCode != null) {
			setPostStepCode(postStepCode);
		}

		String autoEvent = (String)attributes.get("autoEvent");

		if (autoEvent != null) {
			setAutoEvent(autoEvent);
		}

		String preCondition = (String)attributes.get("preCondition");

		if (preCondition != null) {
			setPreCondition(preCondition);
		}

		String actionCode = (String)attributes.get("actionCode");

		if (actionCode != null) {
			setActionCode(actionCode);
		}

		String actionName = (String)attributes.get("actionName");

		if (actionName != null) {
			setActionName(actionName);
		}

		Boolean allowAssignUser = (Boolean)attributes.get("allowAssignUser");

		if (allowAssignUser != null) {
			setAllowAssignUser(allowAssignUser);
		}

		Long assignUserId = (Long)attributes.get("assignUserId");

		if (assignUserId != null) {
			setAssignUserId(assignUserId);
		}

		Integer requestPayment = (Integer)attributes.get("requestPayment");

		if (requestPayment != null) {
			setRequestPayment(requestPayment);
		}

		String paymentFee = (String)attributes.get("paymentFee");

		if (paymentFee != null) {
			setPaymentFee(paymentFee);
		}

		String createDossierFiles = (String)attributes.get("createDossierFiles");

		if (createDossierFiles != null) {
			setCreateDossierFiles(createDossierFiles);
		}

		String returnDossierFiles = (String)attributes.get("returnDossierFiles");

		if (returnDossierFiles != null) {
			setReturnDossierFiles(returnDossierFiles);
		}

		String makeBriefNote = (String)attributes.get("makeBriefNote");

		if (makeBriefNote != null) {
			setMakeBriefNote(makeBriefNote);
		}

		String syncActionCode = (String)attributes.get("syncActionCode");

		if (syncActionCode != null) {
			setSyncActionCode(syncActionCode);
		}

		Boolean rollbackable = (Boolean)attributes.get("rollbackable");

		if (rollbackable != null) {
			setRollbackable(rollbackable);
		}

		Boolean createDossierNo = (Boolean)attributes.get("createDossierNo");

		if (createDossierNo != null) {
			setCreateDossierNo(createDossierNo);
		}

		Boolean eSignature = (Boolean)attributes.get("eSignature");

		if (eSignature != null) {
			setESignature(eSignature);
		}

		String configNote = (String)attributes.get("configNote");

		if (configNote != null) {
			setConfigNote(configNote);
		}

		String dossierTemplateNo = (String)attributes.get("dossierTemplateNo");

		if (dossierTemplateNo != null) {
			setDossierTemplateNo(dossierTemplateNo);
		}
	}

	@Override
	public ProcessAction toEscapedModel() {
		return new ProcessActionWrapper(_processAction.toEscapedModel());
	}

	@Override
	public ProcessAction toUnescapedModel() {
		return new ProcessActionWrapper(_processAction.toUnescapedModel());
	}

	/**
	* Returns the allow assign user of this process action.
	*
	* @return the allow assign user of this process action
	*/
	@Override
	public boolean getAllowAssignUser() {
		return _processAction.getAllowAssignUser();
	}

	/**
	* Returns the create dossier no of this process action.
	*
	* @return the create dossier no of this process action
	*/
	@Override
	public boolean getCreateDossierNo() {
		return _processAction.getCreateDossierNo();
	}

	/**
	* Returns the e signature of this process action.
	*
	* @return the e signature of this process action
	*/
	@Override
	public boolean getESignature() {
		return _processAction.getESignature();
	}

	/**
	* Returns the rollbackable of this process action.
	*
	* @return the rollbackable of this process action
	*/
	@Override
	public boolean getRollbackable() {
		return _processAction.getRollbackable();
	}

	/**
	* Returns <code>true</code> if this process action is allow assign user.
	*
	* @return <code>true</code> if this process action is allow assign user; <code>false</code> otherwise
	*/
	@Override
	public boolean isAllowAssignUser() {
		return _processAction.isAllowAssignUser();
	}

	@Override
	public boolean isCachedModel() {
		return _processAction.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this process action is create dossier no.
	*
	* @return <code>true</code> if this process action is create dossier no; <code>false</code> otherwise
	*/
	@Override
	public boolean isCreateDossierNo() {
		return _processAction.isCreateDossierNo();
	}

	/**
	* Returns <code>true</code> if this process action is e signature.
	*
	* @return <code>true</code> if this process action is e signature; <code>false</code> otherwise
	*/
	@Override
	public boolean isESignature() {
		return _processAction.isESignature();
	}

	@Override
	public boolean isEscapedModel() {
		return _processAction.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _processAction.isNew();
	}

	/**
	* Returns <code>true</code> if this process action is rollbackable.
	*
	* @return <code>true</code> if this process action is rollbackable; <code>false</code> otherwise
	*/
	@Override
	public boolean isRollbackable() {
		return _processAction.isRollbackable();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _processAction.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ProcessAction> toCacheModel() {
		return _processAction.toCacheModel();
	}

	@Override
	public int compareTo(ProcessAction processAction) {
		return _processAction.compareTo(processAction);
	}

	/**
	* Returns the request payment of this process action.
	*
	* @return the request payment of this process action
	*/
	@Override
	public int getRequestPayment() {
		return _processAction.getRequestPayment();
	}

	@Override
	public int hashCode() {
		return _processAction.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _processAction.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ProcessActionWrapper((ProcessAction)_processAction.clone());
	}

	/**
	* Returns the action code of this process action.
	*
	* @return the action code of this process action
	*/
	@Override
	public java.lang.String getActionCode() {
		return _processAction.getActionCode();
	}

	/**
	* Returns the action name of this process action.
	*
	* @return the action name of this process action
	*/
	@Override
	public java.lang.String getActionName() {
		return _processAction.getActionName();
	}

	/**
	* Returns the assign user uuid of this process action.
	*
	* @return the assign user uuid of this process action
	*/
	@Override
	public java.lang.String getAssignUserUuid() {
		return _processAction.getAssignUserUuid();
	}

	/**
	* Returns the auto event of this process action.
	*
	* @return the auto event of this process action
	*/
	@Override
	public java.lang.String getAutoEvent() {
		return _processAction.getAutoEvent();
	}

	/**
	* Returns the config note of this process action.
	*
	* @return the config note of this process action
	*/
	@Override
	public java.lang.String getConfigNote() {
		return _processAction.getConfigNote();
	}

	/**
	* Returns the create dossier files of this process action.
	*
	* @return the create dossier files of this process action
	*/
	@Override
	public java.lang.String getCreateDossierFiles() {
		return _processAction.getCreateDossierFiles();
	}

	/**
	* Returns the dossier template no of this process action.
	*
	* @return the dossier template no of this process action
	*/
	@Override
	public java.lang.String getDossierTemplateNo() {
		return _processAction.getDossierTemplateNo();
	}

	/**
	* Returns the make brief note of this process action.
	*
	* @return the make brief note of this process action
	*/
	@Override
	public java.lang.String getMakeBriefNote() {
		return _processAction.getMakeBriefNote();
	}

	/**
	* Returns the payment fee of this process action.
	*
	* @return the payment fee of this process action
	*/
	@Override
	public java.lang.String getPaymentFee() {
		return _processAction.getPaymentFee();
	}

	/**
	* Returns the post step code of this process action.
	*
	* @return the post step code of this process action
	*/
	@Override
	public java.lang.String getPostStepCode() {
		return _processAction.getPostStepCode();
	}

	/**
	* Returns the pre condition of this process action.
	*
	* @return the pre condition of this process action
	*/
	@Override
	public java.lang.String getPreCondition() {
		return _processAction.getPreCondition();
	}

	/**
	* Returns the pre step code of this process action.
	*
	* @return the pre step code of this process action
	*/
	@Override
	public java.lang.String getPreStepCode() {
		return _processAction.getPreStepCode();
	}

	/**
	* Returns the return dossier files of this process action.
	*
	* @return the return dossier files of this process action
	*/
	@Override
	public java.lang.String getReturnDossierFiles() {
		return _processAction.getReturnDossierFiles();
	}

	/**
	* Returns the sync action code of this process action.
	*
	* @return the sync action code of this process action
	*/
	@Override
	public java.lang.String getSyncActionCode() {
		return _processAction.getSyncActionCode();
	}

	/**
	* Returns the user name of this process action.
	*
	* @return the user name of this process action
	*/
	@Override
	public java.lang.String getUserName() {
		return _processAction.getUserName();
	}

	/**
	* Returns the user uuid of this process action.
	*
	* @return the user uuid of this process action
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _processAction.getUserUuid();
	}

	/**
	* Returns the uuid of this process action.
	*
	* @return the uuid of this process action
	*/
	@Override
	public java.lang.String getUuid() {
		return _processAction.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _processAction.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _processAction.toXmlString();
	}

	/**
	* Returns the create date of this process action.
	*
	* @return the create date of this process action
	*/
	@Override
	public Date getCreateDate() {
		return _processAction.getCreateDate();
	}

	/**
	* Returns the modified date of this process action.
	*
	* @return the modified date of this process action
	*/
	@Override
	public Date getModifiedDate() {
		return _processAction.getModifiedDate();
	}

	/**
	* Returns the assign user ID of this process action.
	*
	* @return the assign user ID of this process action
	*/
	@Override
	public long getAssignUserId() {
		return _processAction.getAssignUserId();
	}

	/**
	* Returns the company ID of this process action.
	*
	* @return the company ID of this process action
	*/
	@Override
	public long getCompanyId() {
		return _processAction.getCompanyId();
	}

	/**
	* Returns the group ID of this process action.
	*
	* @return the group ID of this process action
	*/
	@Override
	public long getGroupId() {
		return _processAction.getGroupId();
	}

	/**
	* Returns the primary key of this process action.
	*
	* @return the primary key of this process action
	*/
	@Override
	public long getPrimaryKey() {
		return _processAction.getPrimaryKey();
	}

	/**
	* Returns the process action ID of this process action.
	*
	* @return the process action ID of this process action
	*/
	@Override
	public long getProcessActionId() {
		return _processAction.getProcessActionId();
	}

	/**
	* Returns the service process ID of this process action.
	*
	* @return the service process ID of this process action
	*/
	@Override
	public long getServiceProcessId() {
		return _processAction.getServiceProcessId();
	}

	/**
	* Returns the user ID of this process action.
	*
	* @return the user ID of this process action
	*/
	@Override
	public long getUserId() {
		return _processAction.getUserId();
	}

	@Override
	public void persist() {
		_processAction.persist();
	}

	/**
	* Sets the action code of this process action.
	*
	* @param actionCode the action code of this process action
	*/
	@Override
	public void setActionCode(java.lang.String actionCode) {
		_processAction.setActionCode(actionCode);
	}

	/**
	* Sets the action name of this process action.
	*
	* @param actionName the action name of this process action
	*/
	@Override
	public void setActionName(java.lang.String actionName) {
		_processAction.setActionName(actionName);
	}

	/**
	* Sets whether this process action is allow assign user.
	*
	* @param allowAssignUser the allow assign user of this process action
	*/
	@Override
	public void setAllowAssignUser(boolean allowAssignUser) {
		_processAction.setAllowAssignUser(allowAssignUser);
	}

	/**
	* Sets the assign user ID of this process action.
	*
	* @param assignUserId the assign user ID of this process action
	*/
	@Override
	public void setAssignUserId(long assignUserId) {
		_processAction.setAssignUserId(assignUserId);
	}

	/**
	* Sets the assign user uuid of this process action.
	*
	* @param assignUserUuid the assign user uuid of this process action
	*/
	@Override
	public void setAssignUserUuid(java.lang.String assignUserUuid) {
		_processAction.setAssignUserUuid(assignUserUuid);
	}

	/**
	* Sets the auto event of this process action.
	*
	* @param autoEvent the auto event of this process action
	*/
	@Override
	public void setAutoEvent(java.lang.String autoEvent) {
		_processAction.setAutoEvent(autoEvent);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_processAction.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this process action.
	*
	* @param companyId the company ID of this process action
	*/
	@Override
	public void setCompanyId(long companyId) {
		_processAction.setCompanyId(companyId);
	}

	/**
	* Sets the config note of this process action.
	*
	* @param configNote the config note of this process action
	*/
	@Override
	public void setConfigNote(java.lang.String configNote) {
		_processAction.setConfigNote(configNote);
	}

	/**
	* Sets the create date of this process action.
	*
	* @param createDate the create date of this process action
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_processAction.setCreateDate(createDate);
	}

	/**
	* Sets the create dossier files of this process action.
	*
	* @param createDossierFiles the create dossier files of this process action
	*/
	@Override
	public void setCreateDossierFiles(java.lang.String createDossierFiles) {
		_processAction.setCreateDossierFiles(createDossierFiles);
	}

	/**
	* Sets whether this process action is create dossier no.
	*
	* @param createDossierNo the create dossier no of this process action
	*/
	@Override
	public void setCreateDossierNo(boolean createDossierNo) {
		_processAction.setCreateDossierNo(createDossierNo);
	}

	/**
	* Sets the dossier template no of this process action.
	*
	* @param dossierTemplateNo the dossier template no of this process action
	*/
	@Override
	public void setDossierTemplateNo(java.lang.String dossierTemplateNo) {
		_processAction.setDossierTemplateNo(dossierTemplateNo);
	}

	/**
	* Sets whether this process action is e signature.
	*
	* @param eSignature the e signature of this process action
	*/
	@Override
	public void setESignature(boolean eSignature) {
		_processAction.setESignature(eSignature);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_processAction.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_processAction.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_processAction.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this process action.
	*
	* @param groupId the group ID of this process action
	*/
	@Override
	public void setGroupId(long groupId) {
		_processAction.setGroupId(groupId);
	}

	/**
	* Sets the make brief note of this process action.
	*
	* @param makeBriefNote the make brief note of this process action
	*/
	@Override
	public void setMakeBriefNote(java.lang.String makeBriefNote) {
		_processAction.setMakeBriefNote(makeBriefNote);
	}

	/**
	* Sets the modified date of this process action.
	*
	* @param modifiedDate the modified date of this process action
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_processAction.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_processAction.setNew(n);
	}

	/**
	* Sets the payment fee of this process action.
	*
	* @param paymentFee the payment fee of this process action
	*/
	@Override
	public void setPaymentFee(java.lang.String paymentFee) {
		_processAction.setPaymentFee(paymentFee);
	}

	/**
	* Sets the post step code of this process action.
	*
	* @param postStepCode the post step code of this process action
	*/
	@Override
	public void setPostStepCode(java.lang.String postStepCode) {
		_processAction.setPostStepCode(postStepCode);
	}

	/**
	* Sets the pre condition of this process action.
	*
	* @param preCondition the pre condition of this process action
	*/
	@Override
	public void setPreCondition(java.lang.String preCondition) {
		_processAction.setPreCondition(preCondition);
	}

	/**
	* Sets the pre step code of this process action.
	*
	* @param preStepCode the pre step code of this process action
	*/
	@Override
	public void setPreStepCode(java.lang.String preStepCode) {
		_processAction.setPreStepCode(preStepCode);
	}

	/**
	* Sets the primary key of this process action.
	*
	* @param primaryKey the primary key of this process action
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_processAction.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_processAction.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the process action ID of this process action.
	*
	* @param processActionId the process action ID of this process action
	*/
	@Override
	public void setProcessActionId(long processActionId) {
		_processAction.setProcessActionId(processActionId);
	}

	/**
	* Sets the request payment of this process action.
	*
	* @param requestPayment the request payment of this process action
	*/
	@Override
	public void setRequestPayment(int requestPayment) {
		_processAction.setRequestPayment(requestPayment);
	}

	/**
	* Sets the return dossier files of this process action.
	*
	* @param returnDossierFiles the return dossier files of this process action
	*/
	@Override
	public void setReturnDossierFiles(java.lang.String returnDossierFiles) {
		_processAction.setReturnDossierFiles(returnDossierFiles);
	}

	/**
	* Sets whether this process action is rollbackable.
	*
	* @param rollbackable the rollbackable of this process action
	*/
	@Override
	public void setRollbackable(boolean rollbackable) {
		_processAction.setRollbackable(rollbackable);
	}

	/**
	* Sets the service process ID of this process action.
	*
	* @param serviceProcessId the service process ID of this process action
	*/
	@Override
	public void setServiceProcessId(long serviceProcessId) {
		_processAction.setServiceProcessId(serviceProcessId);
	}

	/**
	* Sets the sync action code of this process action.
	*
	* @param syncActionCode the sync action code of this process action
	*/
	@Override
	public void setSyncActionCode(java.lang.String syncActionCode) {
		_processAction.setSyncActionCode(syncActionCode);
	}

	/**
	* Sets the user ID of this process action.
	*
	* @param userId the user ID of this process action
	*/
	@Override
	public void setUserId(long userId) {
		_processAction.setUserId(userId);
	}

	/**
	* Sets the user name of this process action.
	*
	* @param userName the user name of this process action
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_processAction.setUserName(userName);
	}

	/**
	* Sets the user uuid of this process action.
	*
	* @param userUuid the user uuid of this process action
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_processAction.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this process action.
	*
	* @param uuid the uuid of this process action
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_processAction.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProcessActionWrapper)) {
			return false;
		}

		ProcessActionWrapper processActionWrapper = (ProcessActionWrapper)obj;

		if (Objects.equals(_processAction, processActionWrapper._processAction)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _processAction.getStagedModelType();
	}

	@Override
	public ProcessAction getWrappedModel() {
		return _processAction;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _processAction.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _processAction.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_processAction.resetOriginalValues();
	}

	private final ProcessAction _processAction;
}