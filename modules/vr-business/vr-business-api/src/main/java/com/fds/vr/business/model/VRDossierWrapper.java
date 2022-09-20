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
 * This class is a wrapper for {@link VRDossier}.
 * </p>
 *
 * @author LamTV
 * @see VRDossier
 * @generated
 */
@ProviderType
public class VRDossierWrapper implements VRDossier, ModelWrapper<VRDossier> {
	public VRDossierWrapper(VRDossier vrDossier) {
		_vrDossier = vrDossier;
	}

	@Override
	public Class<?> getModelClass() {
		return VRDossier.class;
	}

	@Override
	public String getModelClassName() {
		return VRDossier.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("dossierId", getDossierId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("referenceUid", getReferenceUid());
		attributes.put("counter", getCounter());
		attributes.put("serviceCode", getServiceCode());
		attributes.put("serviceName", getServiceName());
		attributes.put("govAgencyCode", getGovAgencyCode());
		attributes.put("govAgencyName", getGovAgencyName());
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
		attributes.put("dossierTemplateNo", getDossierTemplateNo());
		attributes.put("dossierTemplateName", getDossierTemplateName());
		attributes.put("dossierNote", getDossierNote());
		attributes.put("submissionNote", getSubmissionNote());
		attributes.put("applicantNote", getApplicantNote());
		attributes.put("briefNote", getBriefNote());
		attributes.put("dossierNo", getDossierNo());
		attributes.put("submitting", getSubmitting());
		attributes.put("submitDate", getSubmitDate());
		attributes.put("receiveDate", getReceiveDate());
		attributes.put("dueDate", getDueDate());
		attributes.put("releaseDate", getReleaseDate());
		attributes.put("finishDate", getFinishDate());
		attributes.put("cancellingDate", getCancellingDate());
		attributes.put("correcttingDate", getCorrecttingDate());
		attributes.put("dossierStatus", getDossierStatus());
		attributes.put("dossierStatusText", getDossierStatusText());
		attributes.put("dossierSubStatus", getDossierSubStatus());
		attributes.put("dossierSubStatusText", getDossierSubStatusText());
		attributes.put("folderId", getFolderId());
		attributes.put("dossierActionId", getDossierActionId());
		attributes.put("viaPostal", getViaPostal());
		attributes.put("postalAddress", getPostalAddress());
		attributes.put("postalCityCode", getPostalCityCode());
		attributes.put("postalCityName", getPostalCityName());
		attributes.put("postalTelNo", getPostalTelNo());
		attributes.put("password", getPassword());
		attributes.put("notification", getNotification());
		attributes.put("online", getOnline());
		attributes.put("serverNo", getServerNo());
		attributes.put("endorsementDate", getEndorsementDate());
		attributes.put("lockState", getLockState());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
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

		String referenceUid = (String)attributes.get("referenceUid");

		if (referenceUid != null) {
			setReferenceUid(referenceUid);
		}

		Integer counter = (Integer)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		String serviceCode = (String)attributes.get("serviceCode");

		if (serviceCode != null) {
			setServiceCode(serviceCode);
		}

		String serviceName = (String)attributes.get("serviceName");

		if (serviceName != null) {
			setServiceName(serviceName);
		}

		String govAgencyCode = (String)attributes.get("govAgencyCode");

		if (govAgencyCode != null) {
			setGovAgencyCode(govAgencyCode);
		}

		String govAgencyName = (String)attributes.get("govAgencyName");

		if (govAgencyName != null) {
			setGovAgencyName(govAgencyName);
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

		String dossierTemplateNo = (String)attributes.get("dossierTemplateNo");

		if (dossierTemplateNo != null) {
			setDossierTemplateNo(dossierTemplateNo);
		}

		String dossierTemplateName = (String)attributes.get(
				"dossierTemplateName");

		if (dossierTemplateName != null) {
			setDossierTemplateName(dossierTemplateName);
		}

		String dossierNote = (String)attributes.get("dossierNote");

		if (dossierNote != null) {
			setDossierNote(dossierNote);
		}

		String submissionNote = (String)attributes.get("submissionNote");

		if (submissionNote != null) {
			setSubmissionNote(submissionNote);
		}

		String applicantNote = (String)attributes.get("applicantNote");

		if (applicantNote != null) {
			setApplicantNote(applicantNote);
		}

		String briefNote = (String)attributes.get("briefNote");

		if (briefNote != null) {
			setBriefNote(briefNote);
		}

		String dossierNo = (String)attributes.get("dossierNo");

		if (dossierNo != null) {
			setDossierNo(dossierNo);
		}

		Boolean submitting = (Boolean)attributes.get("submitting");

		if (submitting != null) {
			setSubmitting(submitting);
		}

		Date submitDate = (Date)attributes.get("submitDate");

		if (submitDate != null) {
			setSubmitDate(submitDate);
		}

		Date receiveDate = (Date)attributes.get("receiveDate");

		if (receiveDate != null) {
			setReceiveDate(receiveDate);
		}

		Date dueDate = (Date)attributes.get("dueDate");

		if (dueDate != null) {
			setDueDate(dueDate);
		}

		Date releaseDate = (Date)attributes.get("releaseDate");

		if (releaseDate != null) {
			setReleaseDate(releaseDate);
		}

		Date finishDate = (Date)attributes.get("finishDate");

		if (finishDate != null) {
			setFinishDate(finishDate);
		}

		Date cancellingDate = (Date)attributes.get("cancellingDate");

		if (cancellingDate != null) {
			setCancellingDate(cancellingDate);
		}

		Date correcttingDate = (Date)attributes.get("correcttingDate");

		if (correcttingDate != null) {
			setCorrecttingDate(correcttingDate);
		}

		String dossierStatus = (String)attributes.get("dossierStatus");

		if (dossierStatus != null) {
			setDossierStatus(dossierStatus);
		}

		String dossierStatusText = (String)attributes.get("dossierStatusText");

		if (dossierStatusText != null) {
			setDossierStatusText(dossierStatusText);
		}

		String dossierSubStatus = (String)attributes.get("dossierSubStatus");

		if (dossierSubStatus != null) {
			setDossierSubStatus(dossierSubStatus);
		}

		String dossierSubStatusText = (String)attributes.get(
				"dossierSubStatusText");

		if (dossierSubStatusText != null) {
			setDossierSubStatusText(dossierSubStatusText);
		}

		Long folderId = (Long)attributes.get("folderId");

		if (folderId != null) {
			setFolderId(folderId);
		}

		Long dossierActionId = (Long)attributes.get("dossierActionId");

		if (dossierActionId != null) {
			setDossierActionId(dossierActionId);
		}

		Integer viaPostal = (Integer)attributes.get("viaPostal");

		if (viaPostal != null) {
			setViaPostal(viaPostal);
		}

		String postalAddress = (String)attributes.get("postalAddress");

		if (postalAddress != null) {
			setPostalAddress(postalAddress);
		}

		String postalCityCode = (String)attributes.get("postalCityCode");

		if (postalCityCode != null) {
			setPostalCityCode(postalCityCode);
		}

		String postalCityName = (String)attributes.get("postalCityName");

		if (postalCityName != null) {
			setPostalCityName(postalCityName);
		}

		String postalTelNo = (String)attributes.get("postalTelNo");

		if (postalTelNo != null) {
			setPostalTelNo(postalTelNo);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		Boolean notification = (Boolean)attributes.get("notification");

		if (notification != null) {
			setNotification(notification);
		}

		Boolean online = (Boolean)attributes.get("online");

		if (online != null) {
			setOnline(online);
		}

		String serverNo = (String)attributes.get("serverNo");

		if (serverNo != null) {
			setServerNo(serverNo);
		}

		Date endorsementDate = (Date)attributes.get("endorsementDate");

		if (endorsementDate != null) {
			setEndorsementDate(endorsementDate);
		}

		String lockState = (String)attributes.get("lockState");

		if (lockState != null) {
			setLockState(lockState);
		}
	}

	@Override
	public VRDossier toEscapedModel() {
		return new VRDossierWrapper(_vrDossier.toEscapedModel());
	}

	@Override
	public VRDossier toUnescapedModel() {
		return new VRDossierWrapper(_vrDossier.toUnescapedModel());
	}

	/**
	* Returns the notification of this vr dossier.
	*
	* @return the notification of this vr dossier
	*/
	@Override
	public boolean getNotification() {
		return _vrDossier.getNotification();
	}

	/**
	* Returns the online of this vr dossier.
	*
	* @return the online of this vr dossier
	*/
	@Override
	public boolean getOnline() {
		return _vrDossier.getOnline();
	}

	/**
	* Returns the submitting of this vr dossier.
	*
	* @return the submitting of this vr dossier
	*/
	@Override
	public boolean getSubmitting() {
		return _vrDossier.getSubmitting();
	}

	@Override
	public boolean isCachedModel() {
		return _vrDossier.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrDossier.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrDossier.isNew();
	}

	/**
	* Returns <code>true</code> if this vr dossier is notification.
	*
	* @return <code>true</code> if this vr dossier is notification; <code>false</code> otherwise
	*/
	@Override
	public boolean isNotification() {
		return _vrDossier.isNotification();
	}

	/**
	* Returns <code>true</code> if this vr dossier is online.
	*
	* @return <code>true</code> if this vr dossier is online; <code>false</code> otherwise
	*/
	@Override
	public boolean isOnline() {
		return _vrDossier.isOnline();
	}

	/**
	* Returns <code>true</code> if this vr dossier is submitting.
	*
	* @return <code>true</code> if this vr dossier is submitting; <code>false</code> otherwise
	*/
	@Override
	public boolean isSubmitting() {
		return _vrDossier.isSubmitting();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrDossier.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRDossier> toCacheModel() {
		return _vrDossier.toCacheModel();
	}

	@Override
	public int compareTo(VRDossier vrDossier) {
		return _vrDossier.compareTo(vrDossier);
	}

	/**
	* Returns the counter of this vr dossier.
	*
	* @return the counter of this vr dossier
	*/
	@Override
	public int getCounter() {
		return _vrDossier.getCounter();
	}

	/**
	* Returns the via postal of this vr dossier.
	*
	* @return the via postal of this vr dossier
	*/
	@Override
	public int getViaPostal() {
		return _vrDossier.getViaPostal();
	}

	@Override
	public int hashCode() {
		return _vrDossier.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrDossier.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRDossierWrapper((VRDossier)_vrDossier.clone());
	}

	/**
	* Returns the address of this vr dossier.
	*
	* @return the address of this vr dossier
	*/
	@Override
	public java.lang.String getAddress() {
		return _vrDossier.getAddress();
	}

	/**
	* Returns the applicant ID no of this vr dossier.
	*
	* @return the applicant ID no of this vr dossier
	*/
	@Override
	public java.lang.String getApplicantIdNo() {
		return _vrDossier.getApplicantIdNo();
	}

	/**
	* Returns the applicant ID type of this vr dossier.
	*
	* @return the applicant ID type of this vr dossier
	*/
	@Override
	public java.lang.String getApplicantIdType() {
		return _vrDossier.getApplicantIdType();
	}

	/**
	* Returns the applicant name of this vr dossier.
	*
	* @return the applicant name of this vr dossier
	*/
	@Override
	public java.lang.String getApplicantName() {
		return _vrDossier.getApplicantName();
	}

	/**
	* Returns the applicant note of this vr dossier.
	*
	* @return the applicant note of this vr dossier
	*/
	@Override
	public java.lang.String getApplicantNote() {
		return _vrDossier.getApplicantNote();
	}

	/**
	* Returns the brief note of this vr dossier.
	*
	* @return the brief note of this vr dossier
	*/
	@Override
	public java.lang.String getBriefNote() {
		return _vrDossier.getBriefNote();
	}

	/**
	* Returns the city code of this vr dossier.
	*
	* @return the city code of this vr dossier
	*/
	@Override
	public java.lang.String getCityCode() {
		return _vrDossier.getCityCode();
	}

	/**
	* Returns the city name of this vr dossier.
	*
	* @return the city name of this vr dossier
	*/
	@Override
	public java.lang.String getCityName() {
		return _vrDossier.getCityName();
	}

	/**
	* Returns the contact email of this vr dossier.
	*
	* @return the contact email of this vr dossier
	*/
	@Override
	public java.lang.String getContactEmail() {
		return _vrDossier.getContactEmail();
	}

	/**
	* Returns the contact name of this vr dossier.
	*
	* @return the contact name of this vr dossier
	*/
	@Override
	public java.lang.String getContactName() {
		return _vrDossier.getContactName();
	}

	/**
	* Returns the contact tel no of this vr dossier.
	*
	* @return the contact tel no of this vr dossier
	*/
	@Override
	public java.lang.String getContactTelNo() {
		return _vrDossier.getContactTelNo();
	}

	/**
	* Returns the district code of this vr dossier.
	*
	* @return the district code of this vr dossier
	*/
	@Override
	public java.lang.String getDistrictCode() {
		return _vrDossier.getDistrictCode();
	}

	/**
	* Returns the district name of this vr dossier.
	*
	* @return the district name of this vr dossier
	*/
	@Override
	public java.lang.String getDistrictName() {
		return _vrDossier.getDistrictName();
	}

	/**
	* Returns the dossier no of this vr dossier.
	*
	* @return the dossier no of this vr dossier
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrDossier.getDossierNo();
	}

	/**
	* Returns the dossier note of this vr dossier.
	*
	* @return the dossier note of this vr dossier
	*/
	@Override
	public java.lang.String getDossierNote() {
		return _vrDossier.getDossierNote();
	}

	/**
	* Returns the dossier status of this vr dossier.
	*
	* @return the dossier status of this vr dossier
	*/
	@Override
	public java.lang.String getDossierStatus() {
		return _vrDossier.getDossierStatus();
	}

	/**
	* Returns the dossier status text of this vr dossier.
	*
	* @return the dossier status text of this vr dossier
	*/
	@Override
	public java.lang.String getDossierStatusText() {
		return _vrDossier.getDossierStatusText();
	}

	/**
	* Returns the dossier sub status of this vr dossier.
	*
	* @return the dossier sub status of this vr dossier
	*/
	@Override
	public java.lang.String getDossierSubStatus() {
		return _vrDossier.getDossierSubStatus();
	}

	/**
	* Returns the dossier sub status text of this vr dossier.
	*
	* @return the dossier sub status text of this vr dossier
	*/
	@Override
	public java.lang.String getDossierSubStatusText() {
		return _vrDossier.getDossierSubStatusText();
	}

	/**
	* Returns the dossier template name of this vr dossier.
	*
	* @return the dossier template name of this vr dossier
	*/
	@Override
	public java.lang.String getDossierTemplateName() {
		return _vrDossier.getDossierTemplateName();
	}

	/**
	* Returns the dossier template no of this vr dossier.
	*
	* @return the dossier template no of this vr dossier
	*/
	@Override
	public java.lang.String getDossierTemplateNo() {
		return _vrDossier.getDossierTemplateNo();
	}

	/**
	* Returns the gov agency code of this vr dossier.
	*
	* @return the gov agency code of this vr dossier
	*/
	@Override
	public java.lang.String getGovAgencyCode() {
		return _vrDossier.getGovAgencyCode();
	}

	/**
	* Returns the gov agency name of this vr dossier.
	*
	* @return the gov agency name of this vr dossier
	*/
	@Override
	public java.lang.String getGovAgencyName() {
		return _vrDossier.getGovAgencyName();
	}

	/**
	* Returns the lock state of this vr dossier.
	*
	* @return the lock state of this vr dossier
	*/
	@Override
	public java.lang.String getLockState() {
		return _vrDossier.getLockState();
	}

	/**
	* Returns the password of this vr dossier.
	*
	* @return the password of this vr dossier
	*/
	@Override
	public java.lang.String getPassword() {
		return _vrDossier.getPassword();
	}

	/**
	* Returns the postal address of this vr dossier.
	*
	* @return the postal address of this vr dossier
	*/
	@Override
	public java.lang.String getPostalAddress() {
		return _vrDossier.getPostalAddress();
	}

	/**
	* Returns the postal city code of this vr dossier.
	*
	* @return the postal city code of this vr dossier
	*/
	@Override
	public java.lang.String getPostalCityCode() {
		return _vrDossier.getPostalCityCode();
	}

	/**
	* Returns the postal city name of this vr dossier.
	*
	* @return the postal city name of this vr dossier
	*/
	@Override
	public java.lang.String getPostalCityName() {
		return _vrDossier.getPostalCityName();
	}

	/**
	* Returns the postal tel no of this vr dossier.
	*
	* @return the postal tel no of this vr dossier
	*/
	@Override
	public java.lang.String getPostalTelNo() {
		return _vrDossier.getPostalTelNo();
	}

	/**
	* Returns the reference uid of this vr dossier.
	*
	* @return the reference uid of this vr dossier
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrDossier.getReferenceUid();
	}

	/**
	* Returns the server no of this vr dossier.
	*
	* @return the server no of this vr dossier
	*/
	@Override
	public java.lang.String getServerNo() {
		return _vrDossier.getServerNo();
	}

	/**
	* Returns the service code of this vr dossier.
	*
	* @return the service code of this vr dossier
	*/
	@Override
	public java.lang.String getServiceCode() {
		return _vrDossier.getServiceCode();
	}

	/**
	* Returns the service name of this vr dossier.
	*
	* @return the service name of this vr dossier
	*/
	@Override
	public java.lang.String getServiceName() {
		return _vrDossier.getServiceName();
	}

	/**
	* Returns the submission note of this vr dossier.
	*
	* @return the submission note of this vr dossier
	*/
	@Override
	public java.lang.String getSubmissionNote() {
		return _vrDossier.getSubmissionNote();
	}

	/**
	* Returns the user name of this vr dossier.
	*
	* @return the user name of this vr dossier
	*/
	@Override
	public java.lang.String getUserName() {
		return _vrDossier.getUserName();
	}

	/**
	* Returns the user uuid of this vr dossier.
	*
	* @return the user uuid of this vr dossier
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _vrDossier.getUserUuid();
	}

	/**
	* Returns the uuid of this vr dossier.
	*
	* @return the uuid of this vr dossier
	*/
	@Override
	public java.lang.String getUuid() {
		return _vrDossier.getUuid();
	}

	/**
	* Returns the ward code of this vr dossier.
	*
	* @return the ward code of this vr dossier
	*/
	@Override
	public java.lang.String getWardCode() {
		return _vrDossier.getWardCode();
	}

	/**
	* Returns the ward name of this vr dossier.
	*
	* @return the ward name of this vr dossier
	*/
	@Override
	public java.lang.String getWardName() {
		return _vrDossier.getWardName();
	}

	@Override
	public java.lang.String toString() {
		return _vrDossier.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrDossier.toXmlString();
	}

	/**
	* Returns the applicant ID date of this vr dossier.
	*
	* @return the applicant ID date of this vr dossier
	*/
	@Override
	public Date getApplicantIdDate() {
		return _vrDossier.getApplicantIdDate();
	}

	/**
	* Returns the cancelling date of this vr dossier.
	*
	* @return the cancelling date of this vr dossier
	*/
	@Override
	public Date getCancellingDate() {
		return _vrDossier.getCancellingDate();
	}

	/**
	* Returns the correctting date of this vr dossier.
	*
	* @return the correctting date of this vr dossier
	*/
	@Override
	public Date getCorrecttingDate() {
		return _vrDossier.getCorrecttingDate();
	}

	/**
	* Returns the create date of this vr dossier.
	*
	* @return the create date of this vr dossier
	*/
	@Override
	public Date getCreateDate() {
		return _vrDossier.getCreateDate();
	}

	/**
	* Returns the due date of this vr dossier.
	*
	* @return the due date of this vr dossier
	*/
	@Override
	public Date getDueDate() {
		return _vrDossier.getDueDate();
	}

	/**
	* Returns the endorsement date of this vr dossier.
	*
	* @return the endorsement date of this vr dossier
	*/
	@Override
	public Date getEndorsementDate() {
		return _vrDossier.getEndorsementDate();
	}

	/**
	* Returns the finish date of this vr dossier.
	*
	* @return the finish date of this vr dossier
	*/
	@Override
	public Date getFinishDate() {
		return _vrDossier.getFinishDate();
	}

	/**
	* Returns the modified date of this vr dossier.
	*
	* @return the modified date of this vr dossier
	*/
	@Override
	public Date getModifiedDate() {
		return _vrDossier.getModifiedDate();
	}

	/**
	* Returns the receive date of this vr dossier.
	*
	* @return the receive date of this vr dossier
	*/
	@Override
	public Date getReceiveDate() {
		return _vrDossier.getReceiveDate();
	}

	/**
	* Returns the release date of this vr dossier.
	*
	* @return the release date of this vr dossier
	*/
	@Override
	public Date getReleaseDate() {
		return _vrDossier.getReleaseDate();
	}

	/**
	* Returns the submit date of this vr dossier.
	*
	* @return the submit date of this vr dossier
	*/
	@Override
	public Date getSubmitDate() {
		return _vrDossier.getSubmitDate();
	}

	/**
	* Returns the company ID of this vr dossier.
	*
	* @return the company ID of this vr dossier
	*/
	@Override
	public long getCompanyId() {
		return _vrDossier.getCompanyId();
	}

	/**
	* Returns the dossier action ID of this vr dossier.
	*
	* @return the dossier action ID of this vr dossier
	*/
	@Override
	public long getDossierActionId() {
		return _vrDossier.getDossierActionId();
	}

	/**
	* Returns the dossier ID of this vr dossier.
	*
	* @return the dossier ID of this vr dossier
	*/
	@Override
	public long getDossierId() {
		return _vrDossier.getDossierId();
	}

	/**
	* Returns the folder ID of this vr dossier.
	*
	* @return the folder ID of this vr dossier
	*/
	@Override
	public long getFolderId() {
		return _vrDossier.getFolderId();
	}

	/**
	* Returns the group ID of this vr dossier.
	*
	* @return the group ID of this vr dossier
	*/
	@Override
	public long getGroupId() {
		return _vrDossier.getGroupId();
	}

	/**
	* Returns the primary key of this vr dossier.
	*
	* @return the primary key of this vr dossier
	*/
	@Override
	public long getPrimaryKey() {
		return _vrDossier.getPrimaryKey();
	}

	/**
	* Returns the user ID of this vr dossier.
	*
	* @return the user ID of this vr dossier
	*/
	@Override
	public long getUserId() {
		return _vrDossier.getUserId();
	}

	@Override
	public void persist() {
		_vrDossier.persist();
	}

	/**
	* Sets the address of this vr dossier.
	*
	* @param address the address of this vr dossier
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_vrDossier.setAddress(address);
	}

	/**
	* Sets the applicant ID date of this vr dossier.
	*
	* @param applicantIdDate the applicant ID date of this vr dossier
	*/
	@Override
	public void setApplicantIdDate(Date applicantIdDate) {
		_vrDossier.setApplicantIdDate(applicantIdDate);
	}

	/**
	* Sets the applicant ID no of this vr dossier.
	*
	* @param applicantIdNo the applicant ID no of this vr dossier
	*/
	@Override
	public void setApplicantIdNo(java.lang.String applicantIdNo) {
		_vrDossier.setApplicantIdNo(applicantIdNo);
	}

	/**
	* Sets the applicant ID type of this vr dossier.
	*
	* @param applicantIdType the applicant ID type of this vr dossier
	*/
	@Override
	public void setApplicantIdType(java.lang.String applicantIdType) {
		_vrDossier.setApplicantIdType(applicantIdType);
	}

	/**
	* Sets the applicant name of this vr dossier.
	*
	* @param applicantName the applicant name of this vr dossier
	*/
	@Override
	public void setApplicantName(java.lang.String applicantName) {
		_vrDossier.setApplicantName(applicantName);
	}

	/**
	* Sets the applicant note of this vr dossier.
	*
	* @param applicantNote the applicant note of this vr dossier
	*/
	@Override
	public void setApplicantNote(java.lang.String applicantNote) {
		_vrDossier.setApplicantNote(applicantNote);
	}

	/**
	* Sets the brief note of this vr dossier.
	*
	* @param briefNote the brief note of this vr dossier
	*/
	@Override
	public void setBriefNote(java.lang.String briefNote) {
		_vrDossier.setBriefNote(briefNote);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrDossier.setCachedModel(cachedModel);
	}

	/**
	* Sets the cancelling date of this vr dossier.
	*
	* @param cancellingDate the cancelling date of this vr dossier
	*/
	@Override
	public void setCancellingDate(Date cancellingDate) {
		_vrDossier.setCancellingDate(cancellingDate);
	}

	/**
	* Sets the city code of this vr dossier.
	*
	* @param cityCode the city code of this vr dossier
	*/
	@Override
	public void setCityCode(java.lang.String cityCode) {
		_vrDossier.setCityCode(cityCode);
	}

	/**
	* Sets the city name of this vr dossier.
	*
	* @param cityName the city name of this vr dossier
	*/
	@Override
	public void setCityName(java.lang.String cityName) {
		_vrDossier.setCityName(cityName);
	}

	/**
	* Sets the company ID of this vr dossier.
	*
	* @param companyId the company ID of this vr dossier
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vrDossier.setCompanyId(companyId);
	}

	/**
	* Sets the contact email of this vr dossier.
	*
	* @param contactEmail the contact email of this vr dossier
	*/
	@Override
	public void setContactEmail(java.lang.String contactEmail) {
		_vrDossier.setContactEmail(contactEmail);
	}

	/**
	* Sets the contact name of this vr dossier.
	*
	* @param contactName the contact name of this vr dossier
	*/
	@Override
	public void setContactName(java.lang.String contactName) {
		_vrDossier.setContactName(contactName);
	}

	/**
	* Sets the contact tel no of this vr dossier.
	*
	* @param contactTelNo the contact tel no of this vr dossier
	*/
	@Override
	public void setContactTelNo(java.lang.String contactTelNo) {
		_vrDossier.setContactTelNo(contactTelNo);
	}

	/**
	* Sets the correctting date of this vr dossier.
	*
	* @param correcttingDate the correctting date of this vr dossier
	*/
	@Override
	public void setCorrecttingDate(Date correcttingDate) {
		_vrDossier.setCorrecttingDate(correcttingDate);
	}

	/**
	* Sets the counter of this vr dossier.
	*
	* @param counter the counter of this vr dossier
	*/
	@Override
	public void setCounter(int counter) {
		_vrDossier.setCounter(counter);
	}

	/**
	* Sets the create date of this vr dossier.
	*
	* @param createDate the create date of this vr dossier
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_vrDossier.setCreateDate(createDate);
	}

	/**
	* Sets the district code of this vr dossier.
	*
	* @param districtCode the district code of this vr dossier
	*/
	@Override
	public void setDistrictCode(java.lang.String districtCode) {
		_vrDossier.setDistrictCode(districtCode);
	}

	/**
	* Sets the district name of this vr dossier.
	*
	* @param districtName the district name of this vr dossier
	*/
	@Override
	public void setDistrictName(java.lang.String districtName) {
		_vrDossier.setDistrictName(districtName);
	}

	/**
	* Sets the dossier action ID of this vr dossier.
	*
	* @param dossierActionId the dossier action ID of this vr dossier
	*/
	@Override
	public void setDossierActionId(long dossierActionId) {
		_vrDossier.setDossierActionId(dossierActionId);
	}

	/**
	* Sets the dossier ID of this vr dossier.
	*
	* @param dossierId the dossier ID of this vr dossier
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrDossier.setDossierId(dossierId);
	}

	/**
	* Sets the dossier no of this vr dossier.
	*
	* @param dossierNo the dossier no of this vr dossier
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrDossier.setDossierNo(dossierNo);
	}

	/**
	* Sets the dossier note of this vr dossier.
	*
	* @param dossierNote the dossier note of this vr dossier
	*/
	@Override
	public void setDossierNote(java.lang.String dossierNote) {
		_vrDossier.setDossierNote(dossierNote);
	}

	/**
	* Sets the dossier status of this vr dossier.
	*
	* @param dossierStatus the dossier status of this vr dossier
	*/
	@Override
	public void setDossierStatus(java.lang.String dossierStatus) {
		_vrDossier.setDossierStatus(dossierStatus);
	}

	/**
	* Sets the dossier status text of this vr dossier.
	*
	* @param dossierStatusText the dossier status text of this vr dossier
	*/
	@Override
	public void setDossierStatusText(java.lang.String dossierStatusText) {
		_vrDossier.setDossierStatusText(dossierStatusText);
	}

	/**
	* Sets the dossier sub status of this vr dossier.
	*
	* @param dossierSubStatus the dossier sub status of this vr dossier
	*/
	@Override
	public void setDossierSubStatus(java.lang.String dossierSubStatus) {
		_vrDossier.setDossierSubStatus(dossierSubStatus);
	}

	/**
	* Sets the dossier sub status text of this vr dossier.
	*
	* @param dossierSubStatusText the dossier sub status text of this vr dossier
	*/
	@Override
	public void setDossierSubStatusText(java.lang.String dossierSubStatusText) {
		_vrDossier.setDossierSubStatusText(dossierSubStatusText);
	}

	/**
	* Sets the dossier template name of this vr dossier.
	*
	* @param dossierTemplateName the dossier template name of this vr dossier
	*/
	@Override
	public void setDossierTemplateName(java.lang.String dossierTemplateName) {
		_vrDossier.setDossierTemplateName(dossierTemplateName);
	}

	/**
	* Sets the dossier template no of this vr dossier.
	*
	* @param dossierTemplateNo the dossier template no of this vr dossier
	*/
	@Override
	public void setDossierTemplateNo(java.lang.String dossierTemplateNo) {
		_vrDossier.setDossierTemplateNo(dossierTemplateNo);
	}

	/**
	* Sets the due date of this vr dossier.
	*
	* @param dueDate the due date of this vr dossier
	*/
	@Override
	public void setDueDate(Date dueDate) {
		_vrDossier.setDueDate(dueDate);
	}

	/**
	* Sets the endorsement date of this vr dossier.
	*
	* @param endorsementDate the endorsement date of this vr dossier
	*/
	@Override
	public void setEndorsementDate(Date endorsementDate) {
		_vrDossier.setEndorsementDate(endorsementDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrDossier.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrDossier.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrDossier.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the finish date of this vr dossier.
	*
	* @param finishDate the finish date of this vr dossier
	*/
	@Override
	public void setFinishDate(Date finishDate) {
		_vrDossier.setFinishDate(finishDate);
	}

	/**
	* Sets the folder ID of this vr dossier.
	*
	* @param folderId the folder ID of this vr dossier
	*/
	@Override
	public void setFolderId(long folderId) {
		_vrDossier.setFolderId(folderId);
	}

	/**
	* Sets the gov agency code of this vr dossier.
	*
	* @param govAgencyCode the gov agency code of this vr dossier
	*/
	@Override
	public void setGovAgencyCode(java.lang.String govAgencyCode) {
		_vrDossier.setGovAgencyCode(govAgencyCode);
	}

	/**
	* Sets the gov agency name of this vr dossier.
	*
	* @param govAgencyName the gov agency name of this vr dossier
	*/
	@Override
	public void setGovAgencyName(java.lang.String govAgencyName) {
		_vrDossier.setGovAgencyName(govAgencyName);
	}

	/**
	* Sets the group ID of this vr dossier.
	*
	* @param groupId the group ID of this vr dossier
	*/
	@Override
	public void setGroupId(long groupId) {
		_vrDossier.setGroupId(groupId);
	}

	/**
	* Sets the lock state of this vr dossier.
	*
	* @param lockState the lock state of this vr dossier
	*/
	@Override
	public void setLockState(java.lang.String lockState) {
		_vrDossier.setLockState(lockState);
	}

	/**
	* Sets the modified date of this vr dossier.
	*
	* @param modifiedDate the modified date of this vr dossier
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vrDossier.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_vrDossier.setNew(n);
	}

	/**
	* Sets whether this vr dossier is notification.
	*
	* @param notification the notification of this vr dossier
	*/
	@Override
	public void setNotification(boolean notification) {
		_vrDossier.setNotification(notification);
	}

	/**
	* Sets whether this vr dossier is online.
	*
	* @param online the online of this vr dossier
	*/
	@Override
	public void setOnline(boolean online) {
		_vrDossier.setOnline(online);
	}

	/**
	* Sets the password of this vr dossier.
	*
	* @param password the password of this vr dossier
	*/
	@Override
	public void setPassword(java.lang.String password) {
		_vrDossier.setPassword(password);
	}

	/**
	* Sets the postal address of this vr dossier.
	*
	* @param postalAddress the postal address of this vr dossier
	*/
	@Override
	public void setPostalAddress(java.lang.String postalAddress) {
		_vrDossier.setPostalAddress(postalAddress);
	}

	/**
	* Sets the postal city code of this vr dossier.
	*
	* @param postalCityCode the postal city code of this vr dossier
	*/
	@Override
	public void setPostalCityCode(java.lang.String postalCityCode) {
		_vrDossier.setPostalCityCode(postalCityCode);
	}

	/**
	* Sets the postal city name of this vr dossier.
	*
	* @param postalCityName the postal city name of this vr dossier
	*/
	@Override
	public void setPostalCityName(java.lang.String postalCityName) {
		_vrDossier.setPostalCityName(postalCityName);
	}

	/**
	* Sets the postal tel no of this vr dossier.
	*
	* @param postalTelNo the postal tel no of this vr dossier
	*/
	@Override
	public void setPostalTelNo(java.lang.String postalTelNo) {
		_vrDossier.setPostalTelNo(postalTelNo);
	}

	/**
	* Sets the primary key of this vr dossier.
	*
	* @param primaryKey the primary key of this vr dossier
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrDossier.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrDossier.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the receive date of this vr dossier.
	*
	* @param receiveDate the receive date of this vr dossier
	*/
	@Override
	public void setReceiveDate(Date receiveDate) {
		_vrDossier.setReceiveDate(receiveDate);
	}

	/**
	* Sets the reference uid of this vr dossier.
	*
	* @param referenceUid the reference uid of this vr dossier
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrDossier.setReferenceUid(referenceUid);
	}

	/**
	* Sets the release date of this vr dossier.
	*
	* @param releaseDate the release date of this vr dossier
	*/
	@Override
	public void setReleaseDate(Date releaseDate) {
		_vrDossier.setReleaseDate(releaseDate);
	}

	/**
	* Sets the server no of this vr dossier.
	*
	* @param serverNo the server no of this vr dossier
	*/
	@Override
	public void setServerNo(java.lang.String serverNo) {
		_vrDossier.setServerNo(serverNo);
	}

	/**
	* Sets the service code of this vr dossier.
	*
	* @param serviceCode the service code of this vr dossier
	*/
	@Override
	public void setServiceCode(java.lang.String serviceCode) {
		_vrDossier.setServiceCode(serviceCode);
	}

	/**
	* Sets the service name of this vr dossier.
	*
	* @param serviceName the service name of this vr dossier
	*/
	@Override
	public void setServiceName(java.lang.String serviceName) {
		_vrDossier.setServiceName(serviceName);
	}

	/**
	* Sets the submission note of this vr dossier.
	*
	* @param submissionNote the submission note of this vr dossier
	*/
	@Override
	public void setSubmissionNote(java.lang.String submissionNote) {
		_vrDossier.setSubmissionNote(submissionNote);
	}

	/**
	* Sets the submit date of this vr dossier.
	*
	* @param submitDate the submit date of this vr dossier
	*/
	@Override
	public void setSubmitDate(Date submitDate) {
		_vrDossier.setSubmitDate(submitDate);
	}

	/**
	* Sets whether this vr dossier is submitting.
	*
	* @param submitting the submitting of this vr dossier
	*/
	@Override
	public void setSubmitting(boolean submitting) {
		_vrDossier.setSubmitting(submitting);
	}

	/**
	* Sets the user ID of this vr dossier.
	*
	* @param userId the user ID of this vr dossier
	*/
	@Override
	public void setUserId(long userId) {
		_vrDossier.setUserId(userId);
	}

	/**
	* Sets the user name of this vr dossier.
	*
	* @param userName the user name of this vr dossier
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_vrDossier.setUserName(userName);
	}

	/**
	* Sets the user uuid of this vr dossier.
	*
	* @param userUuid the user uuid of this vr dossier
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vrDossier.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this vr dossier.
	*
	* @param uuid the uuid of this vr dossier
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_vrDossier.setUuid(uuid);
	}

	/**
	* Sets the via postal of this vr dossier.
	*
	* @param viaPostal the via postal of this vr dossier
	*/
	@Override
	public void setViaPostal(int viaPostal) {
		_vrDossier.setViaPostal(viaPostal);
	}

	/**
	* Sets the ward code of this vr dossier.
	*
	* @param wardCode the ward code of this vr dossier
	*/
	@Override
	public void setWardCode(java.lang.String wardCode) {
		_vrDossier.setWardCode(wardCode);
	}

	/**
	* Sets the ward name of this vr dossier.
	*
	* @param wardName the ward name of this vr dossier
	*/
	@Override
	public void setWardName(java.lang.String wardName) {
		_vrDossier.setWardName(wardName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRDossierWrapper)) {
			return false;
		}

		VRDossierWrapper vrDossierWrapper = (VRDossierWrapper)obj;

		if (Objects.equals(_vrDossier, vrDossierWrapper._vrDossier)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _vrDossier.getStagedModelType();
	}

	@Override
	public VRDossier getWrappedModel() {
		return _vrDossier;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrDossier.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrDossier.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrDossier.resetOriginalValues();
	}

	private final VRDossier _vrDossier;
}