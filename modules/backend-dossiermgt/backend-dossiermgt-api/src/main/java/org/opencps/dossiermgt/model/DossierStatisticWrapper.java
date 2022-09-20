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
 * This class is a wrapper for {@link DossierStatistic}.
 * </p>
 *
 * @author huymq
 * @see DossierStatistic
 * @generated
 */
@ProviderType
public class DossierStatisticWrapper implements DossierStatistic,
	ModelWrapper<DossierStatistic> {
	public DossierStatisticWrapper(DossierStatistic dossierStatistic) {
		_dossierStatistic = dossierStatistic;
	}

	@Override
	public Class<?> getModelClass() {
		return DossierStatistic.class;
	}

	@Override
	public String getModelClassName() {
		return DossierStatistic.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("dossierStatisticId", getDossierStatisticId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("month", getMonth());
		attributes.put("year", getYear());
		attributes.put("remainingCount", getRemainingCount());
		attributes.put("receivedCount", getReceivedCount());
		attributes.put("onlineCount", getOnlineCount());
		attributes.put("undueCount", getUndueCount());
		attributes.put("overdueCount", getOverdueCount());
		attributes.put("ontimeCount", getOntimeCount());
		attributes.put("overtimeCount", getOvertimeCount());
		attributes.put("govAgencyCode", getGovAgencyCode());
		attributes.put("govAgencyName", getGovAgencyName());
		attributes.put("domainCode", getDomainCode());
		attributes.put("domainName", getDomainName());
		attributes.put("administrationLevel", getAdministrationLevel());
		attributes.put("reporting", getReporting());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long dossierStatisticId = (Long)attributes.get("dossierStatisticId");

		if (dossierStatisticId != null) {
			setDossierStatisticId(dossierStatisticId);
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

		Integer month = (Integer)attributes.get("month");

		if (month != null) {
			setMonth(month);
		}

		Integer year = (Integer)attributes.get("year");

		if (year != null) {
			setYear(year);
		}

		Integer remainingCount = (Integer)attributes.get("remainingCount");

		if (remainingCount != null) {
			setRemainingCount(remainingCount);
		}

		Integer receivedCount = (Integer)attributes.get("receivedCount");

		if (receivedCount != null) {
			setReceivedCount(receivedCount);
		}

		Integer onlineCount = (Integer)attributes.get("onlineCount");

		if (onlineCount != null) {
			setOnlineCount(onlineCount);
		}

		Integer undueCount = (Integer)attributes.get("undueCount");

		if (undueCount != null) {
			setUndueCount(undueCount);
		}

		Integer overdueCount = (Integer)attributes.get("overdueCount");

		if (overdueCount != null) {
			setOverdueCount(overdueCount);
		}

		Integer ontimeCount = (Integer)attributes.get("ontimeCount");

		if (ontimeCount != null) {
			setOntimeCount(ontimeCount);
		}

		Integer overtimeCount = (Integer)attributes.get("overtimeCount");

		if (overtimeCount != null) {
			setOvertimeCount(overtimeCount);
		}

		String govAgencyCode = (String)attributes.get("govAgencyCode");

		if (govAgencyCode != null) {
			setGovAgencyCode(govAgencyCode);
		}

		String govAgencyName = (String)attributes.get("govAgencyName");

		if (govAgencyName != null) {
			setGovAgencyName(govAgencyName);
		}

		String domainCode = (String)attributes.get("domainCode");

		if (domainCode != null) {
			setDomainCode(domainCode);
		}

		String domainName = (String)attributes.get("domainName");

		if (domainName != null) {
			setDomainName(domainName);
		}

		Integer administrationLevel = (Integer)attributes.get(
				"administrationLevel");

		if (administrationLevel != null) {
			setAdministrationLevel(administrationLevel);
		}

		Boolean reporting = (Boolean)attributes.get("reporting");

		if (reporting != null) {
			setReporting(reporting);
		}
	}

	@Override
	public DossierStatistic toEscapedModel() {
		return new DossierStatisticWrapper(_dossierStatistic.toEscapedModel());
	}

	@Override
	public DossierStatistic toUnescapedModel() {
		return new DossierStatisticWrapper(_dossierStatistic.toUnescapedModel());
	}

	/**
	* Returns the reporting of this dossier statistic.
	*
	* @return the reporting of this dossier statistic
	*/
	@Override
	public boolean getReporting() {
		return _dossierStatistic.getReporting();
	}

	@Override
	public boolean isCachedModel() {
		return _dossierStatistic.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _dossierStatistic.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _dossierStatistic.isNew();
	}

	/**
	* Returns <code>true</code> if this dossier statistic is reporting.
	*
	* @return <code>true</code> if this dossier statistic is reporting; <code>false</code> otherwise
	*/
	@Override
	public boolean isReporting() {
		return _dossierStatistic.isReporting();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _dossierStatistic.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<DossierStatistic> toCacheModel() {
		return _dossierStatistic.toCacheModel();
	}

	@Override
	public int compareTo(DossierStatistic dossierStatistic) {
		return _dossierStatistic.compareTo(dossierStatistic);
	}

	/**
	* Returns the administration level of this dossier statistic.
	*
	* @return the administration level of this dossier statistic
	*/
	@Override
	public int getAdministrationLevel() {
		return _dossierStatistic.getAdministrationLevel();
	}

	/**
	* Returns the month of this dossier statistic.
	*
	* @return the month of this dossier statistic
	*/
	@Override
	public int getMonth() {
		return _dossierStatistic.getMonth();
	}

	/**
	* Returns the online count of this dossier statistic.
	*
	* @return the online count of this dossier statistic
	*/
	@Override
	public int getOnlineCount() {
		return _dossierStatistic.getOnlineCount();
	}

	/**
	* Returns the ontime count of this dossier statistic.
	*
	* @return the ontime count of this dossier statistic
	*/
	@Override
	public int getOntimeCount() {
		return _dossierStatistic.getOntimeCount();
	}

	/**
	* Returns the overdue count of this dossier statistic.
	*
	* @return the overdue count of this dossier statistic
	*/
	@Override
	public int getOverdueCount() {
		return _dossierStatistic.getOverdueCount();
	}

	/**
	* Returns the overtime count of this dossier statistic.
	*
	* @return the overtime count of this dossier statistic
	*/
	@Override
	public int getOvertimeCount() {
		return _dossierStatistic.getOvertimeCount();
	}

	/**
	* Returns the received count of this dossier statistic.
	*
	* @return the received count of this dossier statistic
	*/
	@Override
	public int getReceivedCount() {
		return _dossierStatistic.getReceivedCount();
	}

	/**
	* Returns the remaining count of this dossier statistic.
	*
	* @return the remaining count of this dossier statistic
	*/
	@Override
	public int getRemainingCount() {
		return _dossierStatistic.getRemainingCount();
	}

	/**
	* Returns the undue count of this dossier statistic.
	*
	* @return the undue count of this dossier statistic
	*/
	@Override
	public int getUndueCount() {
		return _dossierStatistic.getUndueCount();
	}

	/**
	* Returns the year of this dossier statistic.
	*
	* @return the year of this dossier statistic
	*/
	@Override
	public int getYear() {
		return _dossierStatistic.getYear();
	}

	@Override
	public int hashCode() {
		return _dossierStatistic.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dossierStatistic.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new DossierStatisticWrapper((DossierStatistic)_dossierStatistic.clone());
	}

	/**
	* Returns the domain code of this dossier statistic.
	*
	* @return the domain code of this dossier statistic
	*/
	@Override
	public java.lang.String getDomainCode() {
		return _dossierStatistic.getDomainCode();
	}

	/**
	* Returns the domain name of this dossier statistic.
	*
	* @return the domain name of this dossier statistic
	*/
	@Override
	public java.lang.String getDomainName() {
		return _dossierStatistic.getDomainName();
	}

	/**
	* Returns the gov agency code of this dossier statistic.
	*
	* @return the gov agency code of this dossier statistic
	*/
	@Override
	public java.lang.String getGovAgencyCode() {
		return _dossierStatistic.getGovAgencyCode();
	}

	/**
	* Returns the gov agency name of this dossier statistic.
	*
	* @return the gov agency name of this dossier statistic
	*/
	@Override
	public java.lang.String getGovAgencyName() {
		return _dossierStatistic.getGovAgencyName();
	}

	/**
	* Returns the user name of this dossier statistic.
	*
	* @return the user name of this dossier statistic
	*/
	@Override
	public java.lang.String getUserName() {
		return _dossierStatistic.getUserName();
	}

	/**
	* Returns the user uuid of this dossier statistic.
	*
	* @return the user uuid of this dossier statistic
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _dossierStatistic.getUserUuid();
	}

	/**
	* Returns the uuid of this dossier statistic.
	*
	* @return the uuid of this dossier statistic
	*/
	@Override
	public java.lang.String getUuid() {
		return _dossierStatistic.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _dossierStatistic.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dossierStatistic.toXmlString();
	}

	/**
	* Returns the create date of this dossier statistic.
	*
	* @return the create date of this dossier statistic
	*/
	@Override
	public Date getCreateDate() {
		return _dossierStatistic.getCreateDate();
	}

	/**
	* Returns the modified date of this dossier statistic.
	*
	* @return the modified date of this dossier statistic
	*/
	@Override
	public Date getModifiedDate() {
		return _dossierStatistic.getModifiedDate();
	}

	/**
	* Returns the company ID of this dossier statistic.
	*
	* @return the company ID of this dossier statistic
	*/
	@Override
	public long getCompanyId() {
		return _dossierStatistic.getCompanyId();
	}

	/**
	* Returns the dossier statistic ID of this dossier statistic.
	*
	* @return the dossier statistic ID of this dossier statistic
	*/
	@Override
	public long getDossierStatisticId() {
		return _dossierStatistic.getDossierStatisticId();
	}

	/**
	* Returns the group ID of this dossier statistic.
	*
	* @return the group ID of this dossier statistic
	*/
	@Override
	public long getGroupId() {
		return _dossierStatistic.getGroupId();
	}

	/**
	* Returns the primary key of this dossier statistic.
	*
	* @return the primary key of this dossier statistic
	*/
	@Override
	public long getPrimaryKey() {
		return _dossierStatistic.getPrimaryKey();
	}

	/**
	* Returns the user ID of this dossier statistic.
	*
	* @return the user ID of this dossier statistic
	*/
	@Override
	public long getUserId() {
		return _dossierStatistic.getUserId();
	}

	@Override
	public void persist() {
		_dossierStatistic.persist();
	}

	/**
	* Sets the administration level of this dossier statistic.
	*
	* @param administrationLevel the administration level of this dossier statistic
	*/
	@Override
	public void setAdministrationLevel(int administrationLevel) {
		_dossierStatistic.setAdministrationLevel(administrationLevel);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dossierStatistic.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this dossier statistic.
	*
	* @param companyId the company ID of this dossier statistic
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dossierStatistic.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this dossier statistic.
	*
	* @param createDate the create date of this dossier statistic
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_dossierStatistic.setCreateDate(createDate);
	}

	/**
	* Sets the domain code of this dossier statistic.
	*
	* @param domainCode the domain code of this dossier statistic
	*/
	@Override
	public void setDomainCode(java.lang.String domainCode) {
		_dossierStatistic.setDomainCode(domainCode);
	}

	/**
	* Sets the domain name of this dossier statistic.
	*
	* @param domainName the domain name of this dossier statistic
	*/
	@Override
	public void setDomainName(java.lang.String domainName) {
		_dossierStatistic.setDomainName(domainName);
	}

	/**
	* Sets the dossier statistic ID of this dossier statistic.
	*
	* @param dossierStatisticId the dossier statistic ID of this dossier statistic
	*/
	@Override
	public void setDossierStatisticId(long dossierStatisticId) {
		_dossierStatistic.setDossierStatisticId(dossierStatisticId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_dossierStatistic.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_dossierStatistic.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_dossierStatistic.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the gov agency code of this dossier statistic.
	*
	* @param govAgencyCode the gov agency code of this dossier statistic
	*/
	@Override
	public void setGovAgencyCode(java.lang.String govAgencyCode) {
		_dossierStatistic.setGovAgencyCode(govAgencyCode);
	}

	/**
	* Sets the gov agency name of this dossier statistic.
	*
	* @param govAgencyName the gov agency name of this dossier statistic
	*/
	@Override
	public void setGovAgencyName(java.lang.String govAgencyName) {
		_dossierStatistic.setGovAgencyName(govAgencyName);
	}

	/**
	* Sets the group ID of this dossier statistic.
	*
	* @param groupId the group ID of this dossier statistic
	*/
	@Override
	public void setGroupId(long groupId) {
		_dossierStatistic.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this dossier statistic.
	*
	* @param modifiedDate the modified date of this dossier statistic
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_dossierStatistic.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the month of this dossier statistic.
	*
	* @param month the month of this dossier statistic
	*/
	@Override
	public void setMonth(int month) {
		_dossierStatistic.setMonth(month);
	}

	@Override
	public void setNew(boolean n) {
		_dossierStatistic.setNew(n);
	}

	/**
	* Sets the online count of this dossier statistic.
	*
	* @param onlineCount the online count of this dossier statistic
	*/
	@Override
	public void setOnlineCount(int onlineCount) {
		_dossierStatistic.setOnlineCount(onlineCount);
	}

	/**
	* Sets the ontime count of this dossier statistic.
	*
	* @param ontimeCount the ontime count of this dossier statistic
	*/
	@Override
	public void setOntimeCount(int ontimeCount) {
		_dossierStatistic.setOntimeCount(ontimeCount);
	}

	/**
	* Sets the overdue count of this dossier statistic.
	*
	* @param overdueCount the overdue count of this dossier statistic
	*/
	@Override
	public void setOverdueCount(int overdueCount) {
		_dossierStatistic.setOverdueCount(overdueCount);
	}

	/**
	* Sets the overtime count of this dossier statistic.
	*
	* @param overtimeCount the overtime count of this dossier statistic
	*/
	@Override
	public void setOvertimeCount(int overtimeCount) {
		_dossierStatistic.setOvertimeCount(overtimeCount);
	}

	/**
	* Sets the primary key of this dossier statistic.
	*
	* @param primaryKey the primary key of this dossier statistic
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dossierStatistic.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_dossierStatistic.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the received count of this dossier statistic.
	*
	* @param receivedCount the received count of this dossier statistic
	*/
	@Override
	public void setReceivedCount(int receivedCount) {
		_dossierStatistic.setReceivedCount(receivedCount);
	}

	/**
	* Sets the remaining count of this dossier statistic.
	*
	* @param remainingCount the remaining count of this dossier statistic
	*/
	@Override
	public void setRemainingCount(int remainingCount) {
		_dossierStatistic.setRemainingCount(remainingCount);
	}

	/**
	* Sets whether this dossier statistic is reporting.
	*
	* @param reporting the reporting of this dossier statistic
	*/
	@Override
	public void setReporting(boolean reporting) {
		_dossierStatistic.setReporting(reporting);
	}

	/**
	* Sets the undue count of this dossier statistic.
	*
	* @param undueCount the undue count of this dossier statistic
	*/
	@Override
	public void setUndueCount(int undueCount) {
		_dossierStatistic.setUndueCount(undueCount);
	}

	/**
	* Sets the user ID of this dossier statistic.
	*
	* @param userId the user ID of this dossier statistic
	*/
	@Override
	public void setUserId(long userId) {
		_dossierStatistic.setUserId(userId);
	}

	/**
	* Sets the user name of this dossier statistic.
	*
	* @param userName the user name of this dossier statistic
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_dossierStatistic.setUserName(userName);
	}

	/**
	* Sets the user uuid of this dossier statistic.
	*
	* @param userUuid the user uuid of this dossier statistic
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dossierStatistic.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this dossier statistic.
	*
	* @param uuid the uuid of this dossier statistic
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_dossierStatistic.setUuid(uuid);
	}

	/**
	* Sets the year of this dossier statistic.
	*
	* @param year the year of this dossier statistic
	*/
	@Override
	public void setYear(int year) {
		_dossierStatistic.setYear(year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierStatisticWrapper)) {
			return false;
		}

		DossierStatisticWrapper dossierStatisticWrapper = (DossierStatisticWrapper)obj;

		if (Objects.equals(_dossierStatistic,
					dossierStatisticWrapper._dossierStatistic)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _dossierStatistic.getStagedModelType();
	}

	@Override
	public DossierStatistic getWrappedModel() {
		return _dossierStatistic;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _dossierStatistic.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _dossierStatistic.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_dossierStatistic.resetOriginalValues();
	}

	private final DossierStatistic _dossierStatistic;
}