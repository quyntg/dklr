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

package com.fds.vr.business.model;

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
 * This class is a wrapper for {@link VRRegistration}.
 * </p>
 *
 * @author LamTV
 * @see VRRegistration
 * @generated
 */
@ProviderType
public class VRRegistrationWrapper implements VRRegistration,
	ModelWrapper<VRRegistration> {
	public VRRegistrationWrapper(VRRegistration vrRegistration) {
		_vrRegistration = vrRegistration;
	}

	@Override
	public Class<?> getModelClass() {
		return VRRegistration.class;
	}

	@Override
	public String getModelClassName() {
		return VRRegistration.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("registrationId", getRegistrationId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicantName", getApplicantName());
		attributes.put("applicantIdType", getApplicantIdType());
		attributes.put("applicantIdNo", getApplicantIdNo());
		attributes.put("applicantIdDate", getApplicantIdDate());
		attributes.put("address", getAddress());
		attributes.put("cityCode", getCityCode());
		attributes.put("cityName", getCityName());
		attributes.put("districtCode", getDistrictCode());
		attributes.put("districtName", getDistrictName());
		attributes.put("wardCode", getWardCode());
		attributes.put("wardName", getWardName());
		attributes.put("contactName", getContactName());
		attributes.put("contactTelNo", getContactTelNo());
		attributes.put("contactEmail", getContactEmail());
		attributes.put("govAgencyCode", getGovAgencyCode());
		attributes.put("govAgencyName", getGovAgencyName());
		attributes.put("registrationState", getRegistrationState());
		attributes.put("registrationClass", getRegistrationClass());
		attributes.put("submitting", getSubmitting());
		attributes.put("representativeEnterprise", getRepresentativeEnterprise());
		attributes.put("remarks", getRemarks());
		attributes.put("markasdeleted", getMarkasdeleted());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long registrationId = (Long)attributes.get("registrationId");

		if (registrationId != null) {
			setRegistrationId(registrationId);
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

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String applicantName = (String)attributes.get("applicantName");

		if (applicantName != null) {
			setApplicantName(applicantName);
		}

		String applicantIdType = (String)attributes.get("applicantIdType");

		if (applicantIdType != null) {
			setApplicantIdType(applicantIdType);
		}

		String applicantIdNo = (String)attributes.get("applicantIdNo");

		if (applicantIdNo != null) {
			setApplicantIdNo(applicantIdNo);
		}

		Date applicantIdDate = (Date)attributes.get("applicantIdDate");

		if (applicantIdDate != null) {
			setApplicantIdDate(applicantIdDate);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String cityCode = (String)attributes.get("cityCode");

		if (cityCode != null) {
			setCityCode(cityCode);
		}

		String cityName = (String)attributes.get("cityName");

		if (cityName != null) {
			setCityName(cityName);
		}

		String districtCode = (String)attributes.get("districtCode");

		if (districtCode != null) {
			setDistrictCode(districtCode);
		}

		String districtName = (String)attributes.get("districtName");

		if (districtName != null) {
			setDistrictName(districtName);
		}

		String wardCode = (String)attributes.get("wardCode");

		if (wardCode != null) {
			setWardCode(wardCode);
		}

		String wardName = (String)attributes.get("wardName");

		if (wardName != null) {
			setWardName(wardName);
		}

		String contactName = (String)attributes.get("contactName");

		if (contactName != null) {
			setContactName(contactName);
		}

		String contactTelNo = (String)attributes.get("contactTelNo");

		if (contactTelNo != null) {
			setContactTelNo(contactTelNo);
		}

		String contactEmail = (String)attributes.get("contactEmail");

		if (contactEmail != null) {
			setContactEmail(contactEmail);
		}

		String govAgencyCode = (String)attributes.get("govAgencyCode");

		if (govAgencyCode != null) {
			setGovAgencyCode(govAgencyCode);
		}

		String govAgencyName = (String)attributes.get("govAgencyName");

		if (govAgencyName != null) {
			setGovAgencyName(govAgencyName);
		}

		Integer registrationState = (Integer)attributes.get("registrationState");

		if (registrationState != null) {
			setRegistrationState(registrationState);
		}

		String registrationClass = (String)attributes.get("registrationClass");

		if (registrationClass != null) {
			setRegistrationClass(registrationClass);
		}

		Boolean submitting = (Boolean)attributes.get("submitting");

		if (submitting != null) {
			setSubmitting(submitting);
		}

		String representativeEnterprise = (String)attributes.get(
				"representativeEnterprise");

		if (representativeEnterprise != null) {
			setRepresentativeEnterprise(representativeEnterprise);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Integer markasdeleted = (Integer)attributes.get("markasdeleted");

		if (markasdeleted != null) {
			setMarkasdeleted(markasdeleted);
		}
	}

	@Override
	public VRRegistration toEscapedModel() {
		return new VRRegistrationWrapper(_vrRegistration.toEscapedModel());
	}

	@Override
	public VRRegistration toUnescapedModel() {
		return new VRRegistrationWrapper(_vrRegistration.toUnescapedModel());
	}

	/**
	* Returns the submitting of this vr registration.
	*
	* @return the submitting of this vr registration
	*/
	@Override
	public boolean getSubmitting() {
		return _vrRegistration.getSubmitting();
	}

	@Override
	public boolean isCachedModel() {
		return _vrRegistration.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrRegistration.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrRegistration.isNew();
	}

	/**
	* Returns <code>true</code> if this vr registration is submitting.
	*
	* @return <code>true</code> if this vr registration is submitting; <code>false</code> otherwise
	*/
	@Override
	public boolean isSubmitting() {
		return _vrRegistration.isSubmitting();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrRegistration.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRRegistration> toCacheModel() {
		return _vrRegistration.toCacheModel();
	}

	@Override
	public int compareTo(VRRegistration vrRegistration) {
		return _vrRegistration.compareTo(vrRegistration);
	}

	/**
	* Returns the markasdeleted of this vr registration.
	*
	* @return the markasdeleted of this vr registration
	*/
	@Override
	public int getMarkasdeleted() {
		return _vrRegistration.getMarkasdeleted();
	}

	/**
	* Returns the registration state of this vr registration.
	*
	* @return the registration state of this vr registration
	*/
	@Override
	public int getRegistrationState() {
		return _vrRegistration.getRegistrationState();
	}

	@Override
	public int hashCode() {
		return _vrRegistration.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrRegistration.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRRegistrationWrapper((VRRegistration)_vrRegistration.clone());
	}

	/**
	* Returns the address of this vr registration.
	*
	* @return the address of this vr registration
	*/
	@Override
	public java.lang.String getAddress() {
		return _vrRegistration.getAddress();
	}

	/**
	* Returns the applicant ID no of this vr registration.
	*
	* @return the applicant ID no of this vr registration
	*/
	@Override
	public java.lang.String getApplicantIdNo() {
		return _vrRegistration.getApplicantIdNo();
	}

	/**
	* Returns the applicant ID type of this vr registration.
	*
	* @return the applicant ID type of this vr registration
	*/
	@Override
	public java.lang.String getApplicantIdType() {
		return _vrRegistration.getApplicantIdType();
	}

	/**
	* Returns the applicant name of this vr registration.
	*
	* @return the applicant name of this vr registration
	*/
	@Override
	public java.lang.String getApplicantName() {
		return _vrRegistration.getApplicantName();
	}

	/**
	* Returns the city code of this vr registration.
	*
	* @return the city code of this vr registration
	*/
	@Override
	public java.lang.String getCityCode() {
		return _vrRegistration.getCityCode();
	}

	/**
	* Returns the city name of this vr registration.
	*
	* @return the city name of this vr registration
	*/
	@Override
	public java.lang.String getCityName() {
		return _vrRegistration.getCityName();
	}

	/**
	* Returns the contact email of this vr registration.
	*
	* @return the contact email of this vr registration
	*/
	@Override
	public java.lang.String getContactEmail() {
		return _vrRegistration.getContactEmail();
	}

	/**
	* Returns the contact name of this vr registration.
	*
	* @return the contact name of this vr registration
	*/
	@Override
	public java.lang.String getContactName() {
		return _vrRegistration.getContactName();
	}

	/**
	* Returns the contact tel no of this vr registration.
	*
	* @return the contact tel no of this vr registration
	*/
	@Override
	public java.lang.String getContactTelNo() {
		return _vrRegistration.getContactTelNo();
	}

	/**
	* Returns the district code of this vr registration.
	*
	* @return the district code of this vr registration
	*/
	@Override
	public java.lang.String getDistrictCode() {
		return _vrRegistration.getDistrictCode();
	}

	/**
	* Returns the district name of this vr registration.
	*
	* @return the district name of this vr registration
	*/
	@Override
	public java.lang.String getDistrictName() {
		return _vrRegistration.getDistrictName();
	}

	/**
	* Returns the gov agency code of this vr registration.
	*
	* @return the gov agency code of this vr registration
	*/
	@Override
	public java.lang.String getGovAgencyCode() {
		return _vrRegistration.getGovAgencyCode();
	}

	/**
	* Returns the gov agency name of this vr registration.
	*
	* @return the gov agency name of this vr registration
	*/
	@Override
	public java.lang.String getGovAgencyName() {
		return _vrRegistration.getGovAgencyName();
	}

	/**
	* Returns the registration class of this vr registration.
	*
	* @return the registration class of this vr registration
	*/
	@Override
	public java.lang.String getRegistrationClass() {
		return _vrRegistration.getRegistrationClass();
	}

	/**
	* Returns the remarks of this vr registration.
	*
	* @return the remarks of this vr registration
	*/
	@Override
	public java.lang.String getRemarks() {
		return _vrRegistration.getRemarks();
	}

	/**
	* Returns the representative enterprise of this vr registration.
	*
	* @return the representative enterprise of this vr registration
	*/
	@Override
	public java.lang.String getRepresentativeEnterprise() {
		return _vrRegistration.getRepresentativeEnterprise();
	}

	/**
	* Returns the user uuid of this vr registration.
	*
	* @return the user uuid of this vr registration
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _vrRegistration.getUserUuid();
	}

	/**
	* Returns the uuid of this vr registration.
	*
	* @return the uuid of this vr registration
	*/
	@Override
	public java.lang.String getUuid() {
		return _vrRegistration.getUuid();
	}

	/**
	* Returns the ward code of this vr registration.
	*
	* @return the ward code of this vr registration
	*/
	@Override
	public java.lang.String getWardCode() {
		return _vrRegistration.getWardCode();
	}

	/**
	* Returns the ward name of this vr registration.
	*
	* @return the ward name of this vr registration
	*/
	@Override
	public java.lang.String getWardName() {
		return _vrRegistration.getWardName();
	}

	@Override
	public java.lang.String toString() {
		return _vrRegistration.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrRegistration.toXmlString();
	}

	/**
	* Returns the applicant ID date of this vr registration.
	*
	* @return the applicant ID date of this vr registration
	*/
	@Override
	public Date getApplicantIdDate() {
		return _vrRegistration.getApplicantIdDate();
	}

	/**
	* Returns the create date of this vr registration.
	*
	* @return the create date of this vr registration
	*/
	@Override
	public Date getCreateDate() {
		return _vrRegistration.getCreateDate();
	}

	/**
	* Returns the modified date of this vr registration.
	*
	* @return the modified date of this vr registration
	*/
	@Override
	public Date getModifiedDate() {
		return _vrRegistration.getModifiedDate();
	}

	/**
	* Returns the company ID of this vr registration.
	*
	* @return the company ID of this vr registration
	*/
	@Override
	public long getCompanyId() {
		return _vrRegistration.getCompanyId();
	}

	/**
	* Returns the group ID of this vr registration.
	*
	* @return the group ID of this vr registration
	*/
	@Override
	public long getGroupId() {
		return _vrRegistration.getGroupId();
	}

	/**
	* Returns the primary key of this vr registration.
	*
	* @return the primary key of this vr registration
	*/
	@Override
	public long getPrimaryKey() {
		return _vrRegistration.getPrimaryKey();
	}

	/**
	* Returns the registration ID of this vr registration.
	*
	* @return the registration ID of this vr registration
	*/
	@Override
	public long getRegistrationId() {
		return _vrRegistration.getRegistrationId();
	}

	/**
	* Returns the user ID of this vr registration.
	*
	* @return the user ID of this vr registration
	*/
	@Override
	public long getUserId() {
		return _vrRegistration.getUserId();
	}

	@Override
	public void persist() {
		_vrRegistration.persist();
	}

	/**
	* Sets the address of this vr registration.
	*
	* @param address the address of this vr registration
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_vrRegistration.setAddress(address);
	}

	/**
	* Sets the applicant ID date of this vr registration.
	*
	* @param applicantIdDate the applicant ID date of this vr registration
	*/
	@Override
	public void setApplicantIdDate(Date applicantIdDate) {
		_vrRegistration.setApplicantIdDate(applicantIdDate);
	}

	/**
	* Sets the applicant ID no of this vr registration.
	*
	* @param applicantIdNo the applicant ID no of this vr registration
	*/
	@Override
	public void setApplicantIdNo(java.lang.String applicantIdNo) {
		_vrRegistration.setApplicantIdNo(applicantIdNo);
	}

	/**
	* Sets the applicant ID type of this vr registration.
	*
	* @param applicantIdType the applicant ID type of this vr registration
	*/
	@Override
	public void setApplicantIdType(java.lang.String applicantIdType) {
		_vrRegistration.setApplicantIdType(applicantIdType);
	}

	/**
	* Sets the applicant name of this vr registration.
	*
	* @param applicantName the applicant name of this vr registration
	*/
	@Override
	public void setApplicantName(java.lang.String applicantName) {
		_vrRegistration.setApplicantName(applicantName);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrRegistration.setCachedModel(cachedModel);
	}

	/**
	* Sets the city code of this vr registration.
	*
	* @param cityCode the city code of this vr registration
	*/
	@Override
	public void setCityCode(java.lang.String cityCode) {
		_vrRegistration.setCityCode(cityCode);
	}

	/**
	* Sets the city name of this vr registration.
	*
	* @param cityName the city name of this vr registration
	*/
	@Override
	public void setCityName(java.lang.String cityName) {
		_vrRegistration.setCityName(cityName);
	}

	/**
	* Sets the company ID of this vr registration.
	*
	* @param companyId the company ID of this vr registration
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vrRegistration.setCompanyId(companyId);
	}

	/**
	* Sets the contact email of this vr registration.
	*
	* @param contactEmail the contact email of this vr registration
	*/
	@Override
	public void setContactEmail(java.lang.String contactEmail) {
		_vrRegistration.setContactEmail(contactEmail);
	}

	/**
	* Sets the contact name of this vr registration.
	*
	* @param contactName the contact name of this vr registration
	*/
	@Override
	public void setContactName(java.lang.String contactName) {
		_vrRegistration.setContactName(contactName);
	}

	/**
	* Sets the contact tel no of this vr registration.
	*
	* @param contactTelNo the contact tel no of this vr registration
	*/
	@Override
	public void setContactTelNo(java.lang.String contactTelNo) {
		_vrRegistration.setContactTelNo(contactTelNo);
	}

	/**
	* Sets the create date of this vr registration.
	*
	* @param createDate the create date of this vr registration
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_vrRegistration.setCreateDate(createDate);
	}

	/**
	* Sets the district code of this vr registration.
	*
	* @param districtCode the district code of this vr registration
	*/
	@Override
	public void setDistrictCode(java.lang.String districtCode) {
		_vrRegistration.setDistrictCode(districtCode);
	}

	/**
	* Sets the district name of this vr registration.
	*
	* @param districtName the district name of this vr registration
	*/
	@Override
	public void setDistrictName(java.lang.String districtName) {
		_vrRegistration.setDistrictName(districtName);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrRegistration.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrRegistration.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrRegistration.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the gov agency code of this vr registration.
	*
	* @param govAgencyCode the gov agency code of this vr registration
	*/
	@Override
	public void setGovAgencyCode(java.lang.String govAgencyCode) {
		_vrRegistration.setGovAgencyCode(govAgencyCode);
	}

	/**
	* Sets the gov agency name of this vr registration.
	*
	* @param govAgencyName the gov agency name of this vr registration
	*/
	@Override
	public void setGovAgencyName(java.lang.String govAgencyName) {
		_vrRegistration.setGovAgencyName(govAgencyName);
	}

	/**
	* Sets the group ID of this vr registration.
	*
	* @param groupId the group ID of this vr registration
	*/
	@Override
	public void setGroupId(long groupId) {
		_vrRegistration.setGroupId(groupId);
	}

	/**
	* Sets the markasdeleted of this vr registration.
	*
	* @param markasdeleted the markasdeleted of this vr registration
	*/
	@Override
	public void setMarkasdeleted(int markasdeleted) {
		_vrRegistration.setMarkasdeleted(markasdeleted);
	}

	/**
	* Sets the modified date of this vr registration.
	*
	* @param modifiedDate the modified date of this vr registration
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vrRegistration.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_vrRegistration.setNew(n);
	}

	/**
	* Sets the primary key of this vr registration.
	*
	* @param primaryKey the primary key of this vr registration
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrRegistration.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrRegistration.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the registration class of this vr registration.
	*
	* @param registrationClass the registration class of this vr registration
	*/
	@Override
	public void setRegistrationClass(java.lang.String registrationClass) {
		_vrRegistration.setRegistrationClass(registrationClass);
	}

	/**
	* Sets the registration ID of this vr registration.
	*
	* @param registrationId the registration ID of this vr registration
	*/
	@Override
	public void setRegistrationId(long registrationId) {
		_vrRegistration.setRegistrationId(registrationId);
	}

	/**
	* Sets the registration state of this vr registration.
	*
	* @param registrationState the registration state of this vr registration
	*/
	@Override
	public void setRegistrationState(int registrationState) {
		_vrRegistration.setRegistrationState(registrationState);
	}

	/**
	* Sets the remarks of this vr registration.
	*
	* @param remarks the remarks of this vr registration
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_vrRegistration.setRemarks(remarks);
	}

	/**
	* Sets the representative enterprise of this vr registration.
	*
	* @param representativeEnterprise the representative enterprise of this vr registration
	*/
	@Override
	public void setRepresentativeEnterprise(
		java.lang.String representativeEnterprise) {
		_vrRegistration.setRepresentativeEnterprise(representativeEnterprise);
	}

	/**
	* Sets whether this vr registration is submitting.
	*
	* @param submitting the submitting of this vr registration
	*/
	@Override
	public void setSubmitting(boolean submitting) {
		_vrRegistration.setSubmitting(submitting);
	}

	/**
	* Sets the user ID of this vr registration.
	*
	* @param userId the user ID of this vr registration
	*/
	@Override
	public void setUserId(long userId) {
		_vrRegistration.setUserId(userId);
	}

	/**
	* Sets the user uuid of this vr registration.
	*
	* @param userUuid the user uuid of this vr registration
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vrRegistration.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this vr registration.
	*
	* @param uuid the uuid of this vr registration
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_vrRegistration.setUuid(uuid);
	}

	/**
	* Sets the ward code of this vr registration.
	*
	* @param wardCode the ward code of this vr registration
	*/
	@Override
	public void setWardCode(java.lang.String wardCode) {
		_vrRegistration.setWardCode(wardCode);
	}

	/**
	* Sets the ward name of this vr registration.
	*
	* @param wardName the ward name of this vr registration
	*/
	@Override
	public void setWardName(java.lang.String wardName) {
		_vrRegistration.setWardName(wardName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRRegistrationWrapper)) {
			return false;
		}

		VRRegistrationWrapper vrRegistrationWrapper = (VRRegistrationWrapper)obj;

		if (Objects.equals(_vrRegistration,
					vrRegistrationWrapper._vrRegistration)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _vrRegistration.getStagedModelType();
	}

	@Override
	public VRRegistration getWrappedModel() {
		return _vrRegistration;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrRegistration.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrRegistration.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrRegistration.resetOriginalValues();
	}

	private final VRRegistration _vrRegistration;
}