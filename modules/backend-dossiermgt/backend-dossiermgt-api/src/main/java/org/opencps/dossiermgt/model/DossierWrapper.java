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
 * This class is a wrapper for {@link Dossier}.
 * </p>
 *
 * @author huymq
 * @see Dossier
 * @generated
 */
@ProviderType
public class DossierWrapper implements Dossier, ModelWrapper<Dossier> {
	public DossierWrapper(Dossier dossier) {
		_dossier = dossier;
	}

	@Override
	public Class<?> getModelClass() {
		return Dossier.class;
	}

	@Override
	public String getModelClassName() {
		return Dossier.class.getName();
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
	public Dossier toEscapedModel() {
		return new DossierWrapper(_dossier.toEscapedModel());
	}

	@Override
	public Dossier toUnescapedModel() {
		return new DossierWrapper(_dossier.toUnescapedModel());
	}

	/**
	* Returns the notification of this dossier.
	*
	* @return the notification of this dossier
	*/
	@Override
	public boolean getNotification() {
		return _dossier.getNotification();
	}

	/**
	* Returns the online of this dossier.
	*
	* @return the online of this dossier
	*/
	@Override
	public boolean getOnline() {
		return _dossier.getOnline();
	}

	/**
	* Returns the submitting of this dossier.
	*
	* @return the submitting of this dossier
	*/
	@Override
	public boolean getSubmitting() {
		return _dossier.getSubmitting();
	}

	@Override
	public boolean isCachedModel() {
		return _dossier.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _dossier.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _dossier.isNew();
	}

	/**
	* Returns <code>true</code> if this dossier is notification.
	*
	* @return <code>true</code> if this dossier is notification; <code>false</code> otherwise
	*/
	@Override
	public boolean isNotification() {
		return _dossier.isNotification();
	}

	/**
	* Returns <code>true</code> if this dossier is online.
	*
	* @return <code>true</code> if this dossier is online; <code>false</code> otherwise
	*/
	@Override
	public boolean isOnline() {
		return _dossier.isOnline();
	}

	/**
	* Returns <code>true</code> if this dossier is submitting.
	*
	* @return <code>true</code> if this dossier is submitting; <code>false</code> otherwise
	*/
	@Override
	public boolean isSubmitting() {
		return _dossier.isSubmitting();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _dossier.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Dossier> toCacheModel() {
		return _dossier.toCacheModel();
	}

	@Override
	public int compareTo(Dossier dossier) {
		return _dossier.compareTo(dossier);
	}

	/**
	* Returns the counter of this dossier.
	*
	* @return the counter of this dossier
	*/
	@Override
	public int getCounter() {
		return _dossier.getCounter();
	}

	/**
	* Returns the via postal of this dossier.
	*
	* @return the via postal of this dossier
	*/
	@Override
	public int getViaPostal() {
		return _dossier.getViaPostal();
	}

	@Override
	public int hashCode() {
		return _dossier.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dossier.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new DossierWrapper((Dossier)_dossier.clone());
	}

	/**
	* Returns the address of this dossier.
	*
	* @return the address of this dossier
	*/
	@Override
	public java.lang.String getAddress() {
		return _dossier.getAddress();
	}

	/**
	* Returns the applicant ID no of this dossier.
	*
	* @return the applicant ID no of this dossier
	*/
	@Override
	public java.lang.String getApplicantIdNo() {
		return _dossier.getApplicantIdNo();
	}

	/**
	* Returns the applicant ID type of this dossier.
	*
	* @return the applicant ID type of this dossier
	*/
	@Override
	public java.lang.String getApplicantIdType() {
		return _dossier.getApplicantIdType();
	}

	/**
	* Returns the applicant name of this dossier.
	*
	* @return the applicant name of this dossier
	*/
	@Override
	public java.lang.String getApplicantName() {
		return _dossier.getApplicantName();
	}

	/**
	* Returns the applicant note of this dossier.
	*
	* @return the applicant note of this dossier
	*/
	@Override
	public java.lang.String getApplicantNote() {
		return _dossier.getApplicantNote();
	}

	/**
	* Returns the brief note of this dossier.
	*
	* @return the brief note of this dossier
	*/
	@Override
	public java.lang.String getBriefNote() {
		return _dossier.getBriefNote();
	}

	/**
	* Returns the city code of this dossier.
	*
	* @return the city code of this dossier
	*/
	@Override
	public java.lang.String getCityCode() {
		return _dossier.getCityCode();
	}

	/**
	* Returns the city name of this dossier.
	*
	* @return the city name of this dossier
	*/
	@Override
	public java.lang.String getCityName() {
		return _dossier.getCityName();
	}

	/**
	* Returns the contact email of this dossier.
	*
	* @return the contact email of this dossier
	*/
	@Override
	public java.lang.String getContactEmail() {
		return _dossier.getContactEmail();
	}

	/**
	* Returns the contact name of this dossier.
	*
	* @return the contact name of this dossier
	*/
	@Override
	public java.lang.String getContactName() {
		return _dossier.getContactName();
	}

	/**
	* Returns the contact tel no of this dossier.
	*
	* @return the contact tel no of this dossier
	*/
	@Override
	public java.lang.String getContactTelNo() {
		return _dossier.getContactTelNo();
	}

	/**
	* Returns the district code of this dossier.
	*
	* @return the district code of this dossier
	*/
	@Override
	public java.lang.String getDistrictCode() {
		return _dossier.getDistrictCode();
	}

	/**
	* Returns the district name of this dossier.
	*
	* @return the district name of this dossier
	*/
	@Override
	public java.lang.String getDistrictName() {
		return _dossier.getDistrictName();
	}

	/**
	* Returns the dossier no of this dossier.
	*
	* @return the dossier no of this dossier
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _dossier.getDossierNo();
	}

	/**
	* Returns the dossier note of this dossier.
	*
	* @return the dossier note of this dossier
	*/
	@Override
	public java.lang.String getDossierNote() {
		return _dossier.getDossierNote();
	}

	/**
	* Returns the dossier status of this dossier.
	*
	* @return the dossier status of this dossier
	*/
	@Override
	public java.lang.String getDossierStatus() {
		return _dossier.getDossierStatus();
	}

	/**
	* Returns the dossier status text of this dossier.
	*
	* @return the dossier status text of this dossier
	*/
	@Override
	public java.lang.String getDossierStatusText() {
		return _dossier.getDossierStatusText();
	}

	/**
	* Returns the dossier sub status of this dossier.
	*
	* @return the dossier sub status of this dossier
	*/
	@Override
	public java.lang.String getDossierSubStatus() {
		return _dossier.getDossierSubStatus();
	}

	/**
	* Returns the dossier sub status text of this dossier.
	*
	* @return the dossier sub status text of this dossier
	*/
	@Override
	public java.lang.String getDossierSubStatusText() {
		return _dossier.getDossierSubStatusText();
	}

	/**
	* Returns the dossier template name of this dossier.
	*
	* @return the dossier template name of this dossier
	*/
	@Override
	public java.lang.String getDossierTemplateName() {
		return _dossier.getDossierTemplateName();
	}

	/**
	* Returns the dossier template no of this dossier.
	*
	* @return the dossier template no of this dossier
	*/
	@Override
	public java.lang.String getDossierTemplateNo() {
		return _dossier.getDossierTemplateNo();
	}

	/**
	* Returns the gov agency code of this dossier.
	*
	* @return the gov agency code of this dossier
	*/
	@Override
	public java.lang.String getGovAgencyCode() {
		return _dossier.getGovAgencyCode();
	}

	/**
	* Returns the gov agency name of this dossier.
	*
	* @return the gov agency name of this dossier
	*/
	@Override
	public java.lang.String getGovAgencyName() {
		return _dossier.getGovAgencyName();
	}

	/**
	* Returns the lock state of this dossier.
	*
	* @return the lock state of this dossier
	*/
	@Override
	public java.lang.String getLockState() {
		return _dossier.getLockState();
	}

	/**
	* Returns the password of this dossier.
	*
	* @return the password of this dossier
	*/
	@Override
	public java.lang.String getPassword() {
		return _dossier.getPassword();
	}

	/**
	* Returns the postal address of this dossier.
	*
	* @return the postal address of this dossier
	*/
	@Override
	public java.lang.String getPostalAddress() {
		return _dossier.getPostalAddress();
	}

	/**
	* Returns the postal city code of this dossier.
	*
	* @return the postal city code of this dossier
	*/
	@Override
	public java.lang.String getPostalCityCode() {
		return _dossier.getPostalCityCode();
	}

	/**
	* Returns the postal city name of this dossier.
	*
	* @return the postal city name of this dossier
	*/
	@Override
	public java.lang.String getPostalCityName() {
		return _dossier.getPostalCityName();
	}

	/**
	* Returns the postal tel no of this dossier.
	*
	* @return the postal tel no of this dossier
	*/
	@Override
	public java.lang.String getPostalTelNo() {
		return _dossier.getPostalTelNo();
	}

	/**
	* Returns the reference uid of this dossier.
	*
	* @return the reference uid of this dossier
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _dossier.getReferenceUid();
	}

	/**
	* Returns the server no of this dossier.
	*
	* @return the server no of this dossier
	*/
	@Override
	public java.lang.String getServerNo() {
		return _dossier.getServerNo();
	}

	/**
	* Returns the service code of this dossier.
	*
	* @return the service code of this dossier
	*/
	@Override
	public java.lang.String getServiceCode() {
		return _dossier.getServiceCode();
	}

	/**
	* Returns the service name of this dossier.
	*
	* @return the service name of this dossier
	*/
	@Override
	public java.lang.String getServiceName() {
		return _dossier.getServiceName();
	}

	/**
	* Returns the submission note of this dossier.
	*
	* @return the submission note of this dossier
	*/
	@Override
	public java.lang.String getSubmissionNote() {
		return _dossier.getSubmissionNote();
	}

	/**
	* Returns the user name of this dossier.
	*
	* @return the user name of this dossier
	*/
	@Override
	public java.lang.String getUserName() {
		return _dossier.getUserName();
	}

	/**
	* Returns the user uuid of this dossier.
	*
	* @return the user uuid of this dossier
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _dossier.getUserUuid();
	}

	/**
	* Returns the uuid of this dossier.
	*
	* @return the uuid of this dossier
	*/
	@Override
	public java.lang.String getUuid() {
		return _dossier.getUuid();
	}

	/**
	* Returns the ward code of this dossier.
	*
	* @return the ward code of this dossier
	*/
	@Override
	public java.lang.String getWardCode() {
		return _dossier.getWardCode();
	}

	/**
	* Returns the ward name of this dossier.
	*
	* @return the ward name of this dossier
	*/
	@Override
	public java.lang.String getWardName() {
		return _dossier.getWardName();
	}

	@Override
	public java.lang.String toString() {
		return _dossier.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dossier.toXmlString();
	}

	/**
	* Returns the applicant ID date of this dossier.
	*
	* @return the applicant ID date of this dossier
	*/
	@Override
	public Date getApplicantIdDate() {
		return _dossier.getApplicantIdDate();
	}

	/**
	* Returns the cancelling date of this dossier.
	*
	* @return the cancelling date of this dossier
	*/
	@Override
	public Date getCancellingDate() {
		return _dossier.getCancellingDate();
	}

	/**
	* Returns the correctting date of this dossier.
	*
	* @return the correctting date of this dossier
	*/
	@Override
	public Date getCorrecttingDate() {
		return _dossier.getCorrecttingDate();
	}

	/**
	* Returns the create date of this dossier.
	*
	* @return the create date of this dossier
	*/
	@Override
	public Date getCreateDate() {
		return _dossier.getCreateDate();
	}

	/**
	* Returns the due date of this dossier.
	*
	* @return the due date of this dossier
	*/
	@Override
	public Date getDueDate() {
		return _dossier.getDueDate();
	}

	/**
	* Returns the endorsement date of this dossier.
	*
	* @return the endorsement date of this dossier
	*/
	@Override
	public Date getEndorsementDate() {
		return _dossier.getEndorsementDate();
	}

	/**
	* Returns the finish date of this dossier.
	*
	* @return the finish date of this dossier
	*/
	@Override
	public Date getFinishDate() {
		return _dossier.getFinishDate();
	}

	/**
	* Returns the modified date of this dossier.
	*
	* @return the modified date of this dossier
	*/
	@Override
	public Date getModifiedDate() {
		return _dossier.getModifiedDate();
	}

	/**
	* Returns the receive date of this dossier.
	*
	* @return the receive date of this dossier
	*/
	@Override
	public Date getReceiveDate() {
		return _dossier.getReceiveDate();
	}

	/**
	* Returns the release date of this dossier.
	*
	* @return the release date of this dossier
	*/
	@Override
	public Date getReleaseDate() {
		return _dossier.getReleaseDate();
	}

	/**
	* Returns the submit date of this dossier.
	*
	* @return the submit date of this dossier
	*/
	@Override
	public Date getSubmitDate() {
		return _dossier.getSubmitDate();
	}

	/**
	* Returns the company ID of this dossier.
	*
	* @return the company ID of this dossier
	*/
	@Override
	public long getCompanyId() {
		return _dossier.getCompanyId();
	}

	/**
	* Returns the dossier action ID of this dossier.
	*
	* @return the dossier action ID of this dossier
	*/
	@Override
	public long getDossierActionId() {
		return _dossier.getDossierActionId();
	}

	/**
	* Returns the dossier ID of this dossier.
	*
	* @return the dossier ID of this dossier
	*/
	@Override
	public long getDossierId() {
		return _dossier.getDossierId();
	}

	/**
	* Returns the folder ID of this dossier.
	*
	* @return the folder ID of this dossier
	*/
	@Override
	public long getFolderId() {
		return _dossier.getFolderId();
	}

	/**
	* Returns the group ID of this dossier.
	*
	* @return the group ID of this dossier
	*/
	@Override
	public long getGroupId() {
		return _dossier.getGroupId();
	}

	/**
	* Returns the primary key of this dossier.
	*
	* @return the primary key of this dossier
	*/
	@Override
	public long getPrimaryKey() {
		return _dossier.getPrimaryKey();
	}

	/**
	* Returns the user ID of this dossier.
	*
	* @return the user ID of this dossier
	*/
	@Override
	public long getUserId() {
		return _dossier.getUserId();
	}

	@Override
	public void persist() {
		_dossier.persist();
	}

	/**
	* Sets the address of this dossier.
	*
	* @param address the address of this dossier
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_dossier.setAddress(address);
	}

	/**
	* Sets the applicant ID date of this dossier.
	*
	* @param applicantIdDate the applicant ID date of this dossier
	*/
	@Override
	public void setApplicantIdDate(Date applicantIdDate) {
		_dossier.setApplicantIdDate(applicantIdDate);
	}

	/**
	* Sets the applicant ID no of this dossier.
	*
	* @param applicantIdNo the applicant ID no of this dossier
	*/
	@Override
	public void setApplicantIdNo(java.lang.String applicantIdNo) {
		_dossier.setApplicantIdNo(applicantIdNo);
	}

	/**
	* Sets the applicant ID type of this dossier.
	*
	* @param applicantIdType the applicant ID type of this dossier
	*/
	@Override
	public void setApplicantIdType(java.lang.String applicantIdType) {
		_dossier.setApplicantIdType(applicantIdType);
	}

	/**
	* Sets the applicant name of this dossier.
	*
	* @param applicantName the applicant name of this dossier
	*/
	@Override
	public void setApplicantName(java.lang.String applicantName) {
		_dossier.setApplicantName(applicantName);
	}

	/**
	* Sets the applicant note of this dossier.
	*
	* @param applicantNote the applicant note of this dossier
	*/
	@Override
	public void setApplicantNote(java.lang.String applicantNote) {
		_dossier.setApplicantNote(applicantNote);
	}

	/**
	* Sets the brief note of this dossier.
	*
	* @param briefNote the brief note of this dossier
	*/
	@Override
	public void setBriefNote(java.lang.String briefNote) {
		_dossier.setBriefNote(briefNote);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dossier.setCachedModel(cachedModel);
	}

	/**
	* Sets the cancelling date of this dossier.
	*
	* @param cancellingDate the cancelling date of this dossier
	*/
	@Override
	public void setCancellingDate(Date cancellingDate) {
		_dossier.setCancellingDate(cancellingDate);
	}

	/**
	* Sets the city code of this dossier.
	*
	* @param cityCode the city code of this dossier
	*/
	@Override
	public void setCityCode(java.lang.String cityCode) {
		_dossier.setCityCode(cityCode);
	}

	/**
	* Sets the city name of this dossier.
	*
	* @param cityName the city name of this dossier
	*/
	@Override
	public void setCityName(java.lang.String cityName) {
		_dossier.setCityName(cityName);
	}

	/**
	* Sets the company ID of this dossier.
	*
	* @param companyId the company ID of this dossier
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dossier.setCompanyId(companyId);
	}

	/**
	* Sets the contact email of this dossier.
	*
	* @param contactEmail the contact email of this dossier
	*/
	@Override
	public void setContactEmail(java.lang.String contactEmail) {
		_dossier.setContactEmail(contactEmail);
	}

	/**
	* Sets the contact name of this dossier.
	*
	* @param contactName the contact name of this dossier
	*/
	@Override
	public void setContactName(java.lang.String contactName) {
		_dossier.setContactName(contactName);
	}

	/**
	* Sets the contact tel no of this dossier.
	*
	* @param contactTelNo the contact tel no of this dossier
	*/
	@Override
	public void setContactTelNo(java.lang.String contactTelNo) {
		_dossier.setContactTelNo(contactTelNo);
	}

	/**
	* Sets the correctting date of this dossier.
	*
	* @param correcttingDate the correctting date of this dossier
	*/
	@Override
	public void setCorrecttingDate(Date correcttingDate) {
		_dossier.setCorrecttingDate(correcttingDate);
	}

	/**
	* Sets the counter of this dossier.
	*
	* @param counter the counter of this dossier
	*/
	@Override
	public void setCounter(int counter) {
		_dossier.setCounter(counter);
	}

	/**
	* Sets the create date of this dossier.
	*
	* @param createDate the create date of this dossier
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_dossier.setCreateDate(createDate);
	}

	/**
	* Sets the district code of this dossier.
	*
	* @param districtCode the district code of this dossier
	*/
	@Override
	public void setDistrictCode(java.lang.String districtCode) {
		_dossier.setDistrictCode(districtCode);
	}

	/**
	* Sets the district name of this dossier.
	*
	* @param districtName the district name of this dossier
	*/
	@Override
	public void setDistrictName(java.lang.String districtName) {
		_dossier.setDistrictName(districtName);
	}

	/**
	* Sets the dossier action ID of this dossier.
	*
	* @param dossierActionId the dossier action ID of this dossier
	*/
	@Override
	public void setDossierActionId(long dossierActionId) {
		_dossier.setDossierActionId(dossierActionId);
	}

	/**
	* Sets the dossier ID of this dossier.
	*
	* @param dossierId the dossier ID of this dossier
	*/
	@Override
	public void setDossierId(long dossierId) {
		_dossier.setDossierId(dossierId);
	}

	/**
	* Sets the dossier no of this dossier.
	*
	* @param dossierNo the dossier no of this dossier
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_dossier.setDossierNo(dossierNo);
	}

	/**
	* Sets the dossier note of this dossier.
	*
	* @param dossierNote the dossier note of this dossier
	*/
	@Override
	public void setDossierNote(java.lang.String dossierNote) {
		_dossier.setDossierNote(dossierNote);
	}

	/**
	* Sets the dossier status of this dossier.
	*
	* @param dossierStatus the dossier status of this dossier
	*/
	@Override
	public void setDossierStatus(java.lang.String dossierStatus) {
		_dossier.setDossierStatus(dossierStatus);
	}

	/**
	* Sets the dossier status text of this dossier.
	*
	* @param dossierStatusText the dossier status text of this dossier
	*/
	@Override
	public void setDossierStatusText(java.lang.String dossierStatusText) {
		_dossier.setDossierStatusText(dossierStatusText);
	}

	/**
	* Sets the dossier sub status of this dossier.
	*
	* @param dossierSubStatus the dossier sub status of this dossier
	*/
	@Override
	public void setDossierSubStatus(java.lang.String dossierSubStatus) {
		_dossier.setDossierSubStatus(dossierSubStatus);
	}

	/**
	* Sets the dossier sub status text of this dossier.
	*
	* @param dossierSubStatusText the dossier sub status text of this dossier
	*/
	@Override
	public void setDossierSubStatusText(java.lang.String dossierSubStatusText) {
		_dossier.setDossierSubStatusText(dossierSubStatusText);
	}

	/**
	* Sets the dossier template name of this dossier.
	*
	* @param dossierTemplateName the dossier template name of this dossier
	*/
	@Override
	public void setDossierTemplateName(java.lang.String dossierTemplateName) {
		_dossier.setDossierTemplateName(dossierTemplateName);
	}

	/**
	* Sets the dossier template no of this dossier.
	*
	* @param dossierTemplateNo the dossier template no of this dossier
	*/
	@Override
	public void setDossierTemplateNo(java.lang.String dossierTemplateNo) {
		_dossier.setDossierTemplateNo(dossierTemplateNo);
	}

	/**
	* Sets the due date of this dossier.
	*
	* @param dueDate the due date of this dossier
	*/
	@Override
	public void setDueDate(Date dueDate) {
		_dossier.setDueDate(dueDate);
	}

	/**
	* Sets the endorsement date of this dossier.
	*
	* @param endorsementDate the endorsement date of this dossier
	*/
	@Override
	public void setEndorsementDate(Date endorsementDate) {
		_dossier.setEndorsementDate(endorsementDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_dossier.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_dossier.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_dossier.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the finish date of this dossier.
	*
	* @param finishDate the finish date of this dossier
	*/
	@Override
	public void setFinishDate(Date finishDate) {
		_dossier.setFinishDate(finishDate);
	}

	/**
	* Sets the folder ID of this dossier.
	*
	* @param folderId the folder ID of this dossier
	*/
	@Override
	public void setFolderId(long folderId) {
		_dossier.setFolderId(folderId);
	}

	/**
	* Sets the gov agency code of this dossier.
	*
	* @param govAgencyCode the gov agency code of this dossier
	*/
	@Override
	public void setGovAgencyCode(java.lang.String govAgencyCode) {
		_dossier.setGovAgencyCode(govAgencyCode);
	}

	/**
	* Sets the gov agency name of this dossier.
	*
	* @param govAgencyName the gov agency name of this dossier
	*/
	@Override
	public void setGovAgencyName(java.lang.String govAgencyName) {
		_dossier.setGovAgencyName(govAgencyName);
	}

	/**
	* Sets the group ID of this dossier.
	*
	* @param groupId the group ID of this dossier
	*/
	@Override
	public void setGroupId(long groupId) {
		_dossier.setGroupId(groupId);
	}

	/**
	* Sets the lock state of this dossier.
	*
	* @param lockState the lock state of this dossier
	*/
	@Override
	public void setLockState(java.lang.String lockState) {
		_dossier.setLockState(lockState);
	}

	/**
	* Sets the modified date of this dossier.
	*
	* @param modifiedDate the modified date of this dossier
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_dossier.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_dossier.setNew(n);
	}

	/**
	* Sets whether this dossier is notification.
	*
	* @param notification the notification of this dossier
	*/
	@Override
	public void setNotification(boolean notification) {
		_dossier.setNotification(notification);
	}

	/**
	* Sets whether this dossier is online.
	*
	* @param online the online of this dossier
	*/
	@Override
	public void setOnline(boolean online) {
		_dossier.setOnline(online);
	}

	/**
	* Sets the password of this dossier.
	*
	* @param password the password of this dossier
	*/
	@Override
	public void setPassword(java.lang.String password) {
		_dossier.setPassword(password);
	}

	/**
	* Sets the postal address of this dossier.
	*
	* @param postalAddress the postal address of this dossier
	*/
	@Override
	public void setPostalAddress(java.lang.String postalAddress) {
		_dossier.setPostalAddress(postalAddress);
	}

	/**
	* Sets the postal city code of this dossier.
	*
	* @param postalCityCode the postal city code of this dossier
	*/
	@Override
	public void setPostalCityCode(java.lang.String postalCityCode) {
		_dossier.setPostalCityCode(postalCityCode);
	}

	/**
	* Sets the postal city name of this dossier.
	*
	* @param postalCityName the postal city name of this dossier
	*/
	@Override
	public void setPostalCityName(java.lang.String postalCityName) {
		_dossier.setPostalCityName(postalCityName);
	}

	/**
	* Sets the postal tel no of this dossier.
	*
	* @param postalTelNo the postal tel no of this dossier
	*/
	@Override
	public void setPostalTelNo(java.lang.String postalTelNo) {
		_dossier.setPostalTelNo(postalTelNo);
	}

	/**
	* Sets the primary key of this dossier.
	*
	* @param primaryKey the primary key of this dossier
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dossier.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_dossier.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the receive date of this dossier.
	*
	* @param receiveDate the receive date of this dossier
	*/
	@Override
	public void setReceiveDate(Date receiveDate) {
		_dossier.setReceiveDate(receiveDate);
	}

	/**
	* Sets the reference uid of this dossier.
	*
	* @param referenceUid the reference uid of this dossier
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_dossier.setReferenceUid(referenceUid);
	}

	/**
	* Sets the release date of this dossier.
	*
	* @param releaseDate the release date of this dossier
	*/
	@Override
	public void setReleaseDate(Date releaseDate) {
		_dossier.setReleaseDate(releaseDate);
	}

	/**
	* Sets the server no of this dossier.
	*
	* @param serverNo the server no of this dossier
	*/
	@Override
	public void setServerNo(java.lang.String serverNo) {
		_dossier.setServerNo(serverNo);
	}

	/**
	* Sets the service code of this dossier.
	*
	* @param serviceCode the service code of this dossier
	*/
	@Override
	public void setServiceCode(java.lang.String serviceCode) {
		_dossier.setServiceCode(serviceCode);
	}

	/**
	* Sets the service name of this dossier.
	*
	* @param serviceName the service name of this dossier
	*/
	@Override
	public void setServiceName(java.lang.String serviceName) {
		_dossier.setServiceName(serviceName);
	}

	/**
	* Sets the submission note of this dossier.
	*
	* @param submissionNote the submission note of this dossier
	*/
	@Override
	public void setSubmissionNote(java.lang.String submissionNote) {
		_dossier.setSubmissionNote(submissionNote);
	}

	/**
	* Sets the submit date of this dossier.
	*
	* @param submitDate the submit date of this dossier
	*/
	@Override
	public void setSubmitDate(Date submitDate) {
		_dossier.setSubmitDate(submitDate);
	}

	/**
	* Sets whether this dossier is submitting.
	*
	* @param submitting the submitting of this dossier
	*/
	@Override
	public void setSubmitting(boolean submitting) {
		_dossier.setSubmitting(submitting);
	}

	/**
	* Sets the user ID of this dossier.
	*
	* @param userId the user ID of this dossier
	*/
	@Override
	public void setUserId(long userId) {
		_dossier.setUserId(userId);
	}

	/**
	* Sets the user name of this dossier.
	*
	* @param userName the user name of this dossier
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_dossier.setUserName(userName);
	}

	/**
	* Sets the user uuid of this dossier.
	*
	* @param userUuid the user uuid of this dossier
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dossier.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this dossier.
	*
	* @param uuid the uuid of this dossier
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_dossier.setUuid(uuid);
	}

	/**
	* Sets the via postal of this dossier.
	*
	* @param viaPostal the via postal of this dossier
	*/
	@Override
	public void setViaPostal(int viaPostal) {
		_dossier.setViaPostal(viaPostal);
	}

	/**
	* Sets the ward code of this dossier.
	*
	* @param wardCode the ward code of this dossier
	*/
	@Override
	public void setWardCode(java.lang.String wardCode) {
		_dossier.setWardCode(wardCode);
	}

	/**
	* Sets the ward name of this dossier.
	*
	* @param wardName the ward name of this dossier
	*/
	@Override
	public void setWardName(java.lang.String wardName) {
		_dossier.setWardName(wardName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierWrapper)) {
			return false;
		}

		DossierWrapper dossierWrapper = (DossierWrapper)obj;

		if (Objects.equals(_dossier, dossierWrapper._dossier)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _dossier.getStagedModelType();
	}

	@Override
	public Dossier getWrappedModel() {
		return _dossier;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _dossier.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _dossier.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_dossier.resetOriginalValues();
	}

	private final Dossier _dossier;
}