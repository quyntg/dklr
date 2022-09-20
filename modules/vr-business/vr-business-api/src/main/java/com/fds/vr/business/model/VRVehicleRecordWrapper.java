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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VRVehicleRecord}.
 * </p>
 *
 * @author LamTV
 * @see VRVehicleRecord
 * @generated
 */
@ProviderType
public class VRVehicleRecordWrapper implements VRVehicleRecord,
	ModelWrapper<VRVehicleRecord> {
	public VRVehicleRecordWrapper(VRVehicleRecord vrVehicleRecord) {
		_vrVehicleRecord = vrVehicleRecord;
	}

	@Override
	public Class<?> getModelClass() {
		return VRVehicleRecord.class;
	}

	@Override
	public String getModelClassName() {
		return VRVehicleRecord.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("issueId", getIssueId());
		attributes.put("issueVehicleCertificateId",
			getIssueVehicleCertificateId());
		attributes.put("dossierId", getDossierId());
		attributes.put("applicantProfileId", getApplicantProfileId());
		attributes.put("applicantName", getApplicantName());
		attributes.put("applicantAddress", getApplicantAddress());
		attributes.put("certificateId", getCertificateId());
		attributes.put("productionNumber", getProductionNumber());
		attributes.put("productionDate", getProductionDate());
		attributes.put("frameNo", getFrameNo());
		attributes.put("boxNo", getBoxNo());
		attributes.put("engineNo", getEngineNo());
		attributes.put("color", getColor());
		attributes.put("stampShortNo", getStampShortNo());
		attributes.put("serialNo", getSerialNo());
		attributes.put("vehicleRecordStatus", getVehicleRecordStatus());
		attributes.put("printingStatus", getPrintingStatus());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("signName", getSignName());
		attributes.put("signTitle", getSignTitle());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());
		attributes.put("certificateRecordDate", getCertificateRecordDate());
		attributes.put("issueInspectionRecordId", getIssueInspectionRecordId());
		attributes.put("certificaterecordno", getCertificaterecordno());
		attributes.put("postPrintingStatus", getPostPrintingStatus());
		attributes.put("qrCode", getQrCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long mtCore = (Long)attributes.get("mtCore");

		if (mtCore != null) {
			setMtCore(mtCore);
		}

		Long issueId = (Long)attributes.get("issueId");

		if (issueId != null) {
			setIssueId(issueId);
		}

		Long issueVehicleCertificateId = (Long)attributes.get(
				"issueVehicleCertificateId");

		if (issueVehicleCertificateId != null) {
			setIssueVehicleCertificateId(issueVehicleCertificateId);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long applicantProfileId = (Long)attributes.get("applicantProfileId");

		if (applicantProfileId != null) {
			setApplicantProfileId(applicantProfileId);
		}

		String applicantName = (String)attributes.get("applicantName");

		if (applicantName != null) {
			setApplicantName(applicantName);
		}

		String applicantAddress = (String)attributes.get("applicantAddress");

		if (applicantAddress != null) {
			setApplicantAddress(applicantAddress);
		}

		Long certificateId = (Long)attributes.get("certificateId");

		if (certificateId != null) {
			setCertificateId(certificateId);
		}

		String productionNumber = (String)attributes.get("productionNumber");

		if (productionNumber != null) {
			setProductionNumber(productionNumber);
		}

		Date productionDate = (Date)attributes.get("productionDate");

		if (productionDate != null) {
			setProductionDate(productionDate);
		}

		String frameNo = (String)attributes.get("frameNo");

		if (frameNo != null) {
			setFrameNo(frameNo);
		}

		String boxNo = (String)attributes.get("boxNo");

		if (boxNo != null) {
			setBoxNo(boxNo);
		}

		String engineNo = (String)attributes.get("engineNo");

		if (engineNo != null) {
			setEngineNo(engineNo);
		}

		String color = (String)attributes.get("color");

		if (color != null) {
			setColor(color);
		}

		String stampShortNo = (String)attributes.get("stampShortNo");

		if (stampShortNo != null) {
			setStampShortNo(stampShortNo);
		}

		String serialNo = (String)attributes.get("serialNo");

		if (serialNo != null) {
			setSerialNo(serialNo);
		}

		Long vehicleRecordStatus = (Long)attributes.get("vehicleRecordStatus");

		if (vehicleRecordStatus != null) {
			setVehicleRecordStatus(vehicleRecordStatus);
		}

		Long printingStatus = (Long)attributes.get("printingStatus");

		if (printingStatus != null) {
			setPrintingStatus(printingStatus);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		String signName = (String)attributes.get("signName");

		if (signName != null) {
			setSignName(signName);
		}

		String signTitle = (String)attributes.get("signTitle");

		if (signTitle != null) {
			setSignTitle(signTitle);
		}

		String signPlace = (String)attributes.get("signPlace");

		if (signPlace != null) {
			setSignPlace(signPlace);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}

		Date certificateRecordDate = (Date)attributes.get(
				"certificateRecordDate");

		if (certificateRecordDate != null) {
			setCertificateRecordDate(certificateRecordDate);
		}

		Long issueInspectionRecordId = (Long)attributes.get(
				"issueInspectionRecordId");

		if (issueInspectionRecordId != null) {
			setIssueInspectionRecordId(issueInspectionRecordId);
		}

		String certificaterecordno = (String)attributes.get(
				"certificaterecordno");

		if (certificaterecordno != null) {
			setCertificaterecordno(certificaterecordno);
		}

		Integer postPrintingStatus = (Integer)attributes.get(
				"postPrintingStatus");

		if (postPrintingStatus != null) {
			setPostPrintingStatus(postPrintingStatus);
		}

		String qrCode = (String)attributes.get("qrCode");

		if (qrCode != null) {
			setQrCode(qrCode);
		}
	}

	@Override
	public VRVehicleRecord toEscapedModel() {
		return new VRVehicleRecordWrapper(_vrVehicleRecord.toEscapedModel());
	}

	@Override
	public VRVehicleRecord toUnescapedModel() {
		return new VRVehicleRecordWrapper(_vrVehicleRecord.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrVehicleRecord.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrVehicleRecord.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrVehicleRecord.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrVehicleRecord.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRVehicleRecord> toCacheModel() {
		return _vrVehicleRecord.toCacheModel();
	}

	@Override
	public int compareTo(VRVehicleRecord vrVehicleRecord) {
		return _vrVehicleRecord.compareTo(vrVehicleRecord);
	}

	/**
	* Returns the post printing status of this vr vehicle record.
	*
	* @return the post printing status of this vr vehicle record
	*/
	@Override
	public int getPostPrintingStatus() {
		return _vrVehicleRecord.getPostPrintingStatus();
	}

	@Override
	public int hashCode() {
		return _vrVehicleRecord.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrVehicleRecord.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRVehicleRecordWrapper((VRVehicleRecord)_vrVehicleRecord.clone());
	}

	/**
	* Returns the applicant address of this vr vehicle record.
	*
	* @return the applicant address of this vr vehicle record
	*/
	@Override
	public java.lang.String getApplicantAddress() {
		return _vrVehicleRecord.getApplicantAddress();
	}

	/**
	* Returns the applicant name of this vr vehicle record.
	*
	* @return the applicant name of this vr vehicle record
	*/
	@Override
	public java.lang.String getApplicantName() {
		return _vrVehicleRecord.getApplicantName();
	}

	/**
	* Returns the box no of this vr vehicle record.
	*
	* @return the box no of this vr vehicle record
	*/
	@Override
	public java.lang.String getBoxNo() {
		return _vrVehicleRecord.getBoxNo();
	}

	/**
	* Returns the certificaterecordno of this vr vehicle record.
	*
	* @return the certificaterecordno of this vr vehicle record
	*/
	@Override
	public java.lang.String getCertificaterecordno() {
		return _vrVehicleRecord.getCertificaterecordno();
	}

	/**
	* Returns the color of this vr vehicle record.
	*
	* @return the color of this vr vehicle record
	*/
	@Override
	public java.lang.String getColor() {
		return _vrVehicleRecord.getColor();
	}

	/**
	* Returns the engine no of this vr vehicle record.
	*
	* @return the engine no of this vr vehicle record
	*/
	@Override
	public java.lang.String getEngineNo() {
		return _vrVehicleRecord.getEngineNo();
	}

	/**
	* Returns the frame no of this vr vehicle record.
	*
	* @return the frame no of this vr vehicle record
	*/
	@Override
	public java.lang.String getFrameNo() {
		return _vrVehicleRecord.getFrameNo();
	}

	/**
	* Returns the production number of this vr vehicle record.
	*
	* @return the production number of this vr vehicle record
	*/
	@Override
	public java.lang.String getProductionNumber() {
		return _vrVehicleRecord.getProductionNumber();
	}

	/**
	* Returns the qr code of this vr vehicle record.
	*
	* @return the qr code of this vr vehicle record
	*/
	@Override
	public java.lang.String getQrCode() {
		return _vrVehicleRecord.getQrCode();
	}

	/**
	* Returns the serial no of this vr vehicle record.
	*
	* @return the serial no of this vr vehicle record
	*/
	@Override
	public java.lang.String getSerialNo() {
		return _vrVehicleRecord.getSerialNo();
	}

	/**
	* Returns the sign name of this vr vehicle record.
	*
	* @return the sign name of this vr vehicle record
	*/
	@Override
	public java.lang.String getSignName() {
		return _vrVehicleRecord.getSignName();
	}

	/**
	* Returns the sign place of this vr vehicle record.
	*
	* @return the sign place of this vr vehicle record
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _vrVehicleRecord.getSignPlace();
	}

	/**
	* Returns the sign title of this vr vehicle record.
	*
	* @return the sign title of this vr vehicle record
	*/
	@Override
	public java.lang.String getSignTitle() {
		return _vrVehicleRecord.getSignTitle();
	}

	/**
	* Returns the stamp short no of this vr vehicle record.
	*
	* @return the stamp short no of this vr vehicle record
	*/
	@Override
	public java.lang.String getStampShortNo() {
		return _vrVehicleRecord.getStampShortNo();
	}

	@Override
	public java.lang.String toString() {
		return _vrVehicleRecord.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrVehicleRecord.toXmlString();
	}

	/**
	* Returns the certificate record date of this vr vehicle record.
	*
	* @return the certificate record date of this vr vehicle record
	*/
	@Override
	public Date getCertificateRecordDate() {
		return _vrVehicleRecord.getCertificateRecordDate();
	}

	/**
	* Returns the modify date of this vr vehicle record.
	*
	* @return the modify date of this vr vehicle record
	*/
	@Override
	public Date getModifyDate() {
		return _vrVehicleRecord.getModifyDate();
	}

	/**
	* Returns the production date of this vr vehicle record.
	*
	* @return the production date of this vr vehicle record
	*/
	@Override
	public Date getProductionDate() {
		return _vrVehicleRecord.getProductionDate();
	}

	/**
	* Returns the sign date of this vr vehicle record.
	*
	* @return the sign date of this vr vehicle record
	*/
	@Override
	public Date getSignDate() {
		return _vrVehicleRecord.getSignDate();
	}

	/**
	* Returns the sync date of this vr vehicle record.
	*
	* @return the sync date of this vr vehicle record
	*/
	@Override
	public Date getSyncDate() {
		return _vrVehicleRecord.getSyncDate();
	}

	/**
	* Returns the applicant profile ID of this vr vehicle record.
	*
	* @return the applicant profile ID of this vr vehicle record
	*/
	@Override
	public long getApplicantProfileId() {
		return _vrVehicleRecord.getApplicantProfileId();
	}

	/**
	* Returns the attached file of this vr vehicle record.
	*
	* @return the attached file of this vr vehicle record
	*/
	@Override
	public long getAttachedFile() {
		return _vrVehicleRecord.getAttachedFile();
	}

	/**
	* Returns the certificate ID of this vr vehicle record.
	*
	* @return the certificate ID of this vr vehicle record
	*/
	@Override
	public long getCertificateId() {
		return _vrVehicleRecord.getCertificateId();
	}

	/**
	* Returns the dossier ID of this vr vehicle record.
	*
	* @return the dossier ID of this vr vehicle record
	*/
	@Override
	public long getDossierId() {
		return _vrVehicleRecord.getDossierId();
	}

	/**
	* Returns the ID of this vr vehicle record.
	*
	* @return the ID of this vr vehicle record
	*/
	@Override
	public long getId() {
		return _vrVehicleRecord.getId();
	}

	/**
	* Returns the issue ID of this vr vehicle record.
	*
	* @return the issue ID of this vr vehicle record
	*/
	@Override
	public long getIssueId() {
		return _vrVehicleRecord.getIssueId();
	}

	/**
	* Returns the issue inspection record ID of this vr vehicle record.
	*
	* @return the issue inspection record ID of this vr vehicle record
	*/
	@Override
	public long getIssueInspectionRecordId() {
		return _vrVehicleRecord.getIssueInspectionRecordId();
	}

	/**
	* Returns the issue vehicle certificate ID of this vr vehicle record.
	*
	* @return the issue vehicle certificate ID of this vr vehicle record
	*/
	@Override
	public long getIssueVehicleCertificateId() {
		return _vrVehicleRecord.getIssueVehicleCertificateId();
	}

	/**
	* Returns the mt core of this vr vehicle record.
	*
	* @return the mt core of this vr vehicle record
	*/
	@Override
	public long getMtCore() {
		return _vrVehicleRecord.getMtCore();
	}

	/**
	* Returns the primary key of this vr vehicle record.
	*
	* @return the primary key of this vr vehicle record
	*/
	@Override
	public long getPrimaryKey() {
		return _vrVehicleRecord.getPrimaryKey();
	}

	/**
	* Returns the printing status of this vr vehicle record.
	*
	* @return the printing status of this vr vehicle record
	*/
	@Override
	public long getPrintingStatus() {
		return _vrVehicleRecord.getPrintingStatus();
	}

	/**
	* Returns the vehicle record status of this vr vehicle record.
	*
	* @return the vehicle record status of this vr vehicle record
	*/
	@Override
	public long getVehicleRecordStatus() {
		return _vrVehicleRecord.getVehicleRecordStatus();
	}

	@Override
	public void persist() {
		_vrVehicleRecord.persist();
	}

	/**
	* Sets the applicant address of this vr vehicle record.
	*
	* @param applicantAddress the applicant address of this vr vehicle record
	*/
	@Override
	public void setApplicantAddress(java.lang.String applicantAddress) {
		_vrVehicleRecord.setApplicantAddress(applicantAddress);
	}

	/**
	* Sets the applicant name of this vr vehicle record.
	*
	* @param applicantName the applicant name of this vr vehicle record
	*/
	@Override
	public void setApplicantName(java.lang.String applicantName) {
		_vrVehicleRecord.setApplicantName(applicantName);
	}

	/**
	* Sets the applicant profile ID of this vr vehicle record.
	*
	* @param applicantProfileId the applicant profile ID of this vr vehicle record
	*/
	@Override
	public void setApplicantProfileId(long applicantProfileId) {
		_vrVehicleRecord.setApplicantProfileId(applicantProfileId);
	}

	/**
	* Sets the attached file of this vr vehicle record.
	*
	* @param attachedFile the attached file of this vr vehicle record
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_vrVehicleRecord.setAttachedFile(attachedFile);
	}

	/**
	* Sets the box no of this vr vehicle record.
	*
	* @param boxNo the box no of this vr vehicle record
	*/
	@Override
	public void setBoxNo(java.lang.String boxNo) {
		_vrVehicleRecord.setBoxNo(boxNo);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrVehicleRecord.setCachedModel(cachedModel);
	}

	/**
	* Sets the certificate ID of this vr vehicle record.
	*
	* @param certificateId the certificate ID of this vr vehicle record
	*/
	@Override
	public void setCertificateId(long certificateId) {
		_vrVehicleRecord.setCertificateId(certificateId);
	}

	/**
	* Sets the certificate record date of this vr vehicle record.
	*
	* @param certificateRecordDate the certificate record date of this vr vehicle record
	*/
	@Override
	public void setCertificateRecordDate(Date certificateRecordDate) {
		_vrVehicleRecord.setCertificateRecordDate(certificateRecordDate);
	}

	/**
	* Sets the certificaterecordno of this vr vehicle record.
	*
	* @param certificaterecordno the certificaterecordno of this vr vehicle record
	*/
	@Override
	public void setCertificaterecordno(java.lang.String certificaterecordno) {
		_vrVehicleRecord.setCertificaterecordno(certificaterecordno);
	}

	/**
	* Sets the color of this vr vehicle record.
	*
	* @param color the color of this vr vehicle record
	*/
	@Override
	public void setColor(java.lang.String color) {
		_vrVehicleRecord.setColor(color);
	}

	/**
	* Sets the dossier ID of this vr vehicle record.
	*
	* @param dossierId the dossier ID of this vr vehicle record
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrVehicleRecord.setDossierId(dossierId);
	}

	/**
	* Sets the engine no of this vr vehicle record.
	*
	* @param engineNo the engine no of this vr vehicle record
	*/
	@Override
	public void setEngineNo(java.lang.String engineNo) {
		_vrVehicleRecord.setEngineNo(engineNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrVehicleRecord.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrVehicleRecord.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrVehicleRecord.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the frame no of this vr vehicle record.
	*
	* @param frameNo the frame no of this vr vehicle record
	*/
	@Override
	public void setFrameNo(java.lang.String frameNo) {
		_vrVehicleRecord.setFrameNo(frameNo);
	}

	/**
	* Sets the ID of this vr vehicle record.
	*
	* @param id the ID of this vr vehicle record
	*/
	@Override
	public void setId(long id) {
		_vrVehicleRecord.setId(id);
	}

	/**
	* Sets the issue ID of this vr vehicle record.
	*
	* @param issueId the issue ID of this vr vehicle record
	*/
	@Override
	public void setIssueId(long issueId) {
		_vrVehicleRecord.setIssueId(issueId);
	}

	/**
	* Sets the issue inspection record ID of this vr vehicle record.
	*
	* @param issueInspectionRecordId the issue inspection record ID of this vr vehicle record
	*/
	@Override
	public void setIssueInspectionRecordId(long issueInspectionRecordId) {
		_vrVehicleRecord.setIssueInspectionRecordId(issueInspectionRecordId);
	}

	/**
	* Sets the issue vehicle certificate ID of this vr vehicle record.
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID of this vr vehicle record
	*/
	@Override
	public void setIssueVehicleCertificateId(long issueVehicleCertificateId) {
		_vrVehicleRecord.setIssueVehicleCertificateId(issueVehicleCertificateId);
	}

	/**
	* Sets the modify date of this vr vehicle record.
	*
	* @param modifyDate the modify date of this vr vehicle record
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrVehicleRecord.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr vehicle record.
	*
	* @param mtCore the mt core of this vr vehicle record
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrVehicleRecord.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrVehicleRecord.setNew(n);
	}

	/**
	* Sets the post printing status of this vr vehicle record.
	*
	* @param postPrintingStatus the post printing status of this vr vehicle record
	*/
	@Override
	public void setPostPrintingStatus(int postPrintingStatus) {
		_vrVehicleRecord.setPostPrintingStatus(postPrintingStatus);
	}

	/**
	* Sets the primary key of this vr vehicle record.
	*
	* @param primaryKey the primary key of this vr vehicle record
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrVehicleRecord.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrVehicleRecord.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the printing status of this vr vehicle record.
	*
	* @param printingStatus the printing status of this vr vehicle record
	*/
	@Override
	public void setPrintingStatus(long printingStatus) {
		_vrVehicleRecord.setPrintingStatus(printingStatus);
	}

	/**
	* Sets the production date of this vr vehicle record.
	*
	* @param productionDate the production date of this vr vehicle record
	*/
	@Override
	public void setProductionDate(Date productionDate) {
		_vrVehicleRecord.setProductionDate(productionDate);
	}

	/**
	* Sets the production number of this vr vehicle record.
	*
	* @param productionNumber the production number of this vr vehicle record
	*/
	@Override
	public void setProductionNumber(java.lang.String productionNumber) {
		_vrVehicleRecord.setProductionNumber(productionNumber);
	}

	/**
	* Sets the qr code of this vr vehicle record.
	*
	* @param qrCode the qr code of this vr vehicle record
	*/
	@Override
	public void setQrCode(java.lang.String qrCode) {
		_vrVehicleRecord.setQrCode(qrCode);
	}

	/**
	* Sets the serial no of this vr vehicle record.
	*
	* @param serialNo the serial no of this vr vehicle record
	*/
	@Override
	public void setSerialNo(java.lang.String serialNo) {
		_vrVehicleRecord.setSerialNo(serialNo);
	}

	/**
	* Sets the sign date of this vr vehicle record.
	*
	* @param signDate the sign date of this vr vehicle record
	*/
	@Override
	public void setSignDate(Date signDate) {
		_vrVehicleRecord.setSignDate(signDate);
	}

	/**
	* Sets the sign name of this vr vehicle record.
	*
	* @param signName the sign name of this vr vehicle record
	*/
	@Override
	public void setSignName(java.lang.String signName) {
		_vrVehicleRecord.setSignName(signName);
	}

	/**
	* Sets the sign place of this vr vehicle record.
	*
	* @param signPlace the sign place of this vr vehicle record
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_vrVehicleRecord.setSignPlace(signPlace);
	}

	/**
	* Sets the sign title of this vr vehicle record.
	*
	* @param signTitle the sign title of this vr vehicle record
	*/
	@Override
	public void setSignTitle(java.lang.String signTitle) {
		_vrVehicleRecord.setSignTitle(signTitle);
	}

	/**
	* Sets the stamp short no of this vr vehicle record.
	*
	* @param stampShortNo the stamp short no of this vr vehicle record
	*/
	@Override
	public void setStampShortNo(java.lang.String stampShortNo) {
		_vrVehicleRecord.setStampShortNo(stampShortNo);
	}

	/**
	* Sets the sync date of this vr vehicle record.
	*
	* @param syncDate the sync date of this vr vehicle record
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrVehicleRecord.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle record status of this vr vehicle record.
	*
	* @param vehicleRecordStatus the vehicle record status of this vr vehicle record
	*/
	@Override
	public void setVehicleRecordStatus(long vehicleRecordStatus) {
		_vrVehicleRecord.setVehicleRecordStatus(vehicleRecordStatus);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRVehicleRecordWrapper)) {
			return false;
		}

		VRVehicleRecordWrapper vrVehicleRecordWrapper = (VRVehicleRecordWrapper)obj;

		if (Objects.equals(_vrVehicleRecord,
					vrVehicleRecordWrapper._vrVehicleRecord)) {
			return true;
		}

		return false;
	}

	@Override
	public VRVehicleRecord getWrappedModel() {
		return _vrVehicleRecord;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrVehicleRecord.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrVehicleRecord.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrVehicleRecord.resetOriginalValues();
	}

	private final VRVehicleRecord _vrVehicleRecord;
}