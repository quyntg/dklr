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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link RegistrationTemplates}.
 * </p>
 *
 * @author huymq
 * @see RegistrationTemplates
 * @generated
 */
@ProviderType
public class RegistrationTemplatesWrapper implements RegistrationTemplates,
	ModelWrapper<RegistrationTemplates> {
	public RegistrationTemplatesWrapper(
		RegistrationTemplates registrationTemplates) {
		_registrationTemplates = registrationTemplates;
	}

	@Override
	public Class<?> getModelClass() {
		return RegistrationTemplates.class;
	}

	@Override
	public String getModelClassName() {
		return RegistrationTemplates.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("registrationTemplateId", getRegistrationTemplateId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("govAgencyCode", getGovAgencyCode());
		attributes.put("govAgencyName", getGovAgencyName());
		attributes.put("formNo", getFormNo());
		attributes.put("formName", getFormName());
		attributes.put("multiple", getMultiple());
		attributes.put("formScript", getFormScript());
		attributes.put("formReport", getFormReport());
		attributes.put("sampleData", getSampleData());
		attributes.put("formScriptOfficial", getFormScriptOfficial());
		attributes.put("formReportOfficial", getFormReportOfficial());
		attributes.put("sampleDataOfficial", getSampleDataOfficial());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long registrationTemplateId = (Long)attributes.get(
				"registrationTemplateId");

		if (registrationTemplateId != null) {
			setRegistrationTemplateId(registrationTemplateId);
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

		String govAgencyCode = (String)attributes.get("govAgencyCode");

		if (govAgencyCode != null) {
			setGovAgencyCode(govAgencyCode);
		}

		String govAgencyName = (String)attributes.get("govAgencyName");

		if (govAgencyName != null) {
			setGovAgencyName(govAgencyName);
		}

		String formNo = (String)attributes.get("formNo");

		if (formNo != null) {
			setFormNo(formNo);
		}

		String formName = (String)attributes.get("formName");

		if (formName != null) {
			setFormName(formName);
		}

		Boolean multiple = (Boolean)attributes.get("multiple");

		if (multiple != null) {
			setMultiple(multiple);
		}

		String formScript = (String)attributes.get("formScript");

		if (formScript != null) {
			setFormScript(formScript);
		}

		String formReport = (String)attributes.get("formReport");

		if (formReport != null) {
			setFormReport(formReport);
		}

		String sampleData = (String)attributes.get("sampleData");

		if (sampleData != null) {
			setSampleData(sampleData);
		}

		String formScriptOfficial = (String)attributes.get("formScriptOfficial");

		if (formScriptOfficial != null) {
			setFormScriptOfficial(formScriptOfficial);
		}

		String formReportOfficial = (String)attributes.get("formReportOfficial");

		if (formReportOfficial != null) {
			setFormReportOfficial(formReportOfficial);
		}

		String sampleDataOfficial = (String)attributes.get("sampleDataOfficial");

		if (sampleDataOfficial != null) {
			setSampleDataOfficial(sampleDataOfficial);
		}
	}

	@Override
	public RegistrationTemplates toEscapedModel() {
		return new RegistrationTemplatesWrapper(_registrationTemplates.toEscapedModel());
	}

	@Override
	public RegistrationTemplates toUnescapedModel() {
		return new RegistrationTemplatesWrapper(_registrationTemplates.toUnescapedModel());
	}

	/**
	* Returns the multiple of this registration templates.
	*
	* @return the multiple of this registration templates
	*/
	@Override
	public boolean getMultiple() {
		return _registrationTemplates.getMultiple();
	}

	@Override
	public boolean isCachedModel() {
		return _registrationTemplates.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _registrationTemplates.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this registration templates is multiple.
	*
	* @return <code>true</code> if this registration templates is multiple; <code>false</code> otherwise
	*/
	@Override
	public boolean isMultiple() {
		return _registrationTemplates.isMultiple();
	}

	@Override
	public boolean isNew() {
		return _registrationTemplates.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _registrationTemplates.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<RegistrationTemplates> toCacheModel() {
		return _registrationTemplates.toCacheModel();
	}

	@Override
	public int compareTo(RegistrationTemplates registrationTemplates) {
		return _registrationTemplates.compareTo(registrationTemplates);
	}

	@Override
	public int hashCode() {
		return _registrationTemplates.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _registrationTemplates.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new RegistrationTemplatesWrapper((RegistrationTemplates)_registrationTemplates.clone());
	}

	/**
	* Returns the form name of this registration templates.
	*
	* @return the form name of this registration templates
	*/
	@Override
	public java.lang.String getFormName() {
		return _registrationTemplates.getFormName();
	}

	/**
	* Returns the form no of this registration templates.
	*
	* @return the form no of this registration templates
	*/
	@Override
	public java.lang.String getFormNo() {
		return _registrationTemplates.getFormNo();
	}

	/**
	* Returns the form report of this registration templates.
	*
	* @return the form report of this registration templates
	*/
	@Override
	public java.lang.String getFormReport() {
		return _registrationTemplates.getFormReport();
	}

	/**
	* Returns the form report official of this registration templates.
	*
	* @return the form report official of this registration templates
	*/
	@Override
	public java.lang.String getFormReportOfficial() {
		return _registrationTemplates.getFormReportOfficial();
	}

	/**
	* Returns the form script of this registration templates.
	*
	* @return the form script of this registration templates
	*/
	@Override
	public java.lang.String getFormScript() {
		return _registrationTemplates.getFormScript();
	}

	/**
	* Returns the form script official of this registration templates.
	*
	* @return the form script official of this registration templates
	*/
	@Override
	public java.lang.String getFormScriptOfficial() {
		return _registrationTemplates.getFormScriptOfficial();
	}

	/**
	* Returns the gov agency code of this registration templates.
	*
	* @return the gov agency code of this registration templates
	*/
	@Override
	public java.lang.String getGovAgencyCode() {
		return _registrationTemplates.getGovAgencyCode();
	}

	/**
	* Returns the gov agency name of this registration templates.
	*
	* @return the gov agency name of this registration templates
	*/
	@Override
	public java.lang.String getGovAgencyName() {
		return _registrationTemplates.getGovAgencyName();
	}

	/**
	* Returns the sample data of this registration templates.
	*
	* @return the sample data of this registration templates
	*/
	@Override
	public java.lang.String getSampleData() {
		return _registrationTemplates.getSampleData();
	}

	/**
	* Returns the sample data official of this registration templates.
	*
	* @return the sample data official of this registration templates
	*/
	@Override
	public java.lang.String getSampleDataOfficial() {
		return _registrationTemplates.getSampleDataOfficial();
	}

	/**
	* Returns the user name of this registration templates.
	*
	* @return the user name of this registration templates
	*/
	@Override
	public java.lang.String getUserName() {
		return _registrationTemplates.getUserName();
	}

	/**
	* Returns the user uuid of this registration templates.
	*
	* @return the user uuid of this registration templates
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _registrationTemplates.getUserUuid();
	}

	/**
	* Returns the uuid of this registration templates.
	*
	* @return the uuid of this registration templates
	*/
	@Override
	public java.lang.String getUuid() {
		return _registrationTemplates.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _registrationTemplates.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _registrationTemplates.toXmlString();
	}

	/**
	* Returns the create date of this registration templates.
	*
	* @return the create date of this registration templates
	*/
	@Override
	public Date getCreateDate() {
		return _registrationTemplates.getCreateDate();
	}

	/**
	* Returns the modified date of this registration templates.
	*
	* @return the modified date of this registration templates
	*/
	@Override
	public Date getModifiedDate() {
		return _registrationTemplates.getModifiedDate();
	}

	/**
	* Returns the group ID of this registration templates.
	*
	* @return the group ID of this registration templates
	*/
	@Override
	public long getGroupId() {
		return _registrationTemplates.getGroupId();
	}

	/**
	* Returns the primary key of this registration templates.
	*
	* @return the primary key of this registration templates
	*/
	@Override
	public long getPrimaryKey() {
		return _registrationTemplates.getPrimaryKey();
	}

	/**
	* Returns the registration template ID of this registration templates.
	*
	* @return the registration template ID of this registration templates
	*/
	@Override
	public long getRegistrationTemplateId() {
		return _registrationTemplates.getRegistrationTemplateId();
	}

	/**
	* Returns the user ID of this registration templates.
	*
	* @return the user ID of this registration templates
	*/
	@Override
	public long getUserId() {
		return _registrationTemplates.getUserId();
	}

	@Override
	public void persist() {
		_registrationTemplates.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_registrationTemplates.setCachedModel(cachedModel);
	}

	/**
	* Sets the create date of this registration templates.
	*
	* @param createDate the create date of this registration templates
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_registrationTemplates.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_registrationTemplates.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_registrationTemplates.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_registrationTemplates.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the form name of this registration templates.
	*
	* @param formName the form name of this registration templates
	*/
	@Override
	public void setFormName(java.lang.String formName) {
		_registrationTemplates.setFormName(formName);
	}

	/**
	* Sets the form no of this registration templates.
	*
	* @param formNo the form no of this registration templates
	*/
	@Override
	public void setFormNo(java.lang.String formNo) {
		_registrationTemplates.setFormNo(formNo);
	}

	/**
	* Sets the form report of this registration templates.
	*
	* @param formReport the form report of this registration templates
	*/
	@Override
	public void setFormReport(java.lang.String formReport) {
		_registrationTemplates.setFormReport(formReport);
	}

	/**
	* Sets the form report official of this registration templates.
	*
	* @param formReportOfficial the form report official of this registration templates
	*/
	@Override
	public void setFormReportOfficial(java.lang.String formReportOfficial) {
		_registrationTemplates.setFormReportOfficial(formReportOfficial);
	}

	/**
	* Sets the form script of this registration templates.
	*
	* @param formScript the form script of this registration templates
	*/
	@Override
	public void setFormScript(java.lang.String formScript) {
		_registrationTemplates.setFormScript(formScript);
	}

	/**
	* Sets the form script official of this registration templates.
	*
	* @param formScriptOfficial the form script official of this registration templates
	*/
	@Override
	public void setFormScriptOfficial(java.lang.String formScriptOfficial) {
		_registrationTemplates.setFormScriptOfficial(formScriptOfficial);
	}

	/**
	* Sets the gov agency code of this registration templates.
	*
	* @param govAgencyCode the gov agency code of this registration templates
	*/
	@Override
	public void setGovAgencyCode(java.lang.String govAgencyCode) {
		_registrationTemplates.setGovAgencyCode(govAgencyCode);
	}

	/**
	* Sets the gov agency name of this registration templates.
	*
	* @param govAgencyName the gov agency name of this registration templates
	*/
	@Override
	public void setGovAgencyName(java.lang.String govAgencyName) {
		_registrationTemplates.setGovAgencyName(govAgencyName);
	}

	/**
	* Sets the group ID of this registration templates.
	*
	* @param groupId the group ID of this registration templates
	*/
	@Override
	public void setGroupId(long groupId) {
		_registrationTemplates.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this registration templates.
	*
	* @param modifiedDate the modified date of this registration templates
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_registrationTemplates.setModifiedDate(modifiedDate);
	}

	/**
	* Sets whether this registration templates is multiple.
	*
	* @param multiple the multiple of this registration templates
	*/
	@Override
	public void setMultiple(boolean multiple) {
		_registrationTemplates.setMultiple(multiple);
	}

	@Override
	public void setNew(boolean n) {
		_registrationTemplates.setNew(n);
	}

	/**
	* Sets the primary key of this registration templates.
	*
	* @param primaryKey the primary key of this registration templates
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_registrationTemplates.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_registrationTemplates.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the registration template ID of this registration templates.
	*
	* @param registrationTemplateId the registration template ID of this registration templates
	*/
	@Override
	public void setRegistrationTemplateId(long registrationTemplateId) {
		_registrationTemplates.setRegistrationTemplateId(registrationTemplateId);
	}

	/**
	* Sets the sample data of this registration templates.
	*
	* @param sampleData the sample data of this registration templates
	*/
	@Override
	public void setSampleData(java.lang.String sampleData) {
		_registrationTemplates.setSampleData(sampleData);
	}

	/**
	* Sets the sample data official of this registration templates.
	*
	* @param sampleDataOfficial the sample data official of this registration templates
	*/
	@Override
	public void setSampleDataOfficial(java.lang.String sampleDataOfficial) {
		_registrationTemplates.setSampleDataOfficial(sampleDataOfficial);
	}

	/**
	* Sets the user ID of this registration templates.
	*
	* @param userId the user ID of this registration templates
	*/
	@Override
	public void setUserId(long userId) {
		_registrationTemplates.setUserId(userId);
	}

	/**
	* Sets the user name of this registration templates.
	*
	* @param userName the user name of this registration templates
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_registrationTemplates.setUserName(userName);
	}

	/**
	* Sets the user uuid of this registration templates.
	*
	* @param userUuid the user uuid of this registration templates
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_registrationTemplates.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this registration templates.
	*
	* @param uuid the uuid of this registration templates
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_registrationTemplates.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RegistrationTemplatesWrapper)) {
			return false;
		}

		RegistrationTemplatesWrapper registrationTemplatesWrapper = (RegistrationTemplatesWrapper)obj;

		if (Objects.equals(_registrationTemplates,
					registrationTemplatesWrapper._registrationTemplates)) {
			return true;
		}

		return false;
	}

	@Override
	public RegistrationTemplates getWrappedModel() {
		return _registrationTemplates;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _registrationTemplates.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _registrationTemplates.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_registrationTemplates.resetOriginalValues();
	}

	private final RegistrationTemplates _registrationTemplates;
}