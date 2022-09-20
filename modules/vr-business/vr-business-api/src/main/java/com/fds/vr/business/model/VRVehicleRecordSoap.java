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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LamTV
 * @generated
 */
@ProviderType
public class VRVehicleRecordSoap implements Serializable {
	public static VRVehicleRecordSoap toSoapModel(VRVehicleRecord model) {
		VRVehicleRecordSoap soapModel = new VRVehicleRecordSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setIssueId(model.getIssueId());
		soapModel.setIssueVehicleCertificateId(model.getIssueVehicleCertificateId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setApplicantProfileId(model.getApplicantProfileId());
		soapModel.setApplicantName(model.getApplicantName());
		soapModel.setApplicantAddress(model.getApplicantAddress());
		soapModel.setCertificateId(model.getCertificateId());
		soapModel.setProductionNumber(model.getProductionNumber());
		soapModel.setProductionDate(model.getProductionDate());
		soapModel.setFrameNo(model.getFrameNo());
		soapModel.setBoxNo(model.getBoxNo());
		soapModel.setEngineNo(model.getEngineNo());
		soapModel.setColor(model.getColor());
		soapModel.setStampShortNo(model.getStampShortNo());
		soapModel.setSerialNo(model.getSerialNo());
		soapModel.setVehicleRecordStatus(model.getVehicleRecordStatus());
		soapModel.setPrintingStatus(model.getPrintingStatus());
		soapModel.setAttachedFile(model.getAttachedFile());
		soapModel.setSignName(model.getSignName());
		soapModel.setSignTitle(model.getSignTitle());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());
		soapModel.setCertificateRecordDate(model.getCertificateRecordDate());
		soapModel.setIssueInspectionRecordId(model.getIssueInspectionRecordId());
		soapModel.setCertificaterecordno(model.getCertificaterecordno());
		soapModel.setPostPrintingStatus(model.getPostPrintingStatus());
		soapModel.setQrCode(model.getQrCode());

		return soapModel;
	}

	public static VRVehicleRecordSoap[] toSoapModels(VRVehicleRecord[] models) {
		VRVehicleRecordSoap[] soapModels = new VRVehicleRecordSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRVehicleRecordSoap[][] toSoapModels(
		VRVehicleRecord[][] models) {
		VRVehicleRecordSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRVehicleRecordSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRVehicleRecordSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRVehicleRecordSoap[] toSoapModels(
		List<VRVehicleRecord> models) {
		List<VRVehicleRecordSoap> soapModels = new ArrayList<VRVehicleRecordSoap>(models.size());

		for (VRVehicleRecord model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRVehicleRecordSoap[soapModels.size()]);
	}

	public VRVehicleRecordSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getMtCore() {
		return _mtCore;
	}

	public void setMtCore(long mtCore) {
		_mtCore = mtCore;
	}

	public long getIssueId() {
		return _issueId;
	}

	public void setIssueId(long issueId) {
		_issueId = issueId;
	}

	public long getIssueVehicleCertificateId() {
		return _issueVehicleCertificateId;
	}

	public void setIssueVehicleCertificateId(long issueVehicleCertificateId) {
		_issueVehicleCertificateId = issueVehicleCertificateId;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public long getApplicantProfileId() {
		return _applicantProfileId;
	}

	public void setApplicantProfileId(long applicantProfileId) {
		_applicantProfileId = applicantProfileId;
	}

	public String getApplicantName() {
		return _applicantName;
	}

	public void setApplicantName(String applicantName) {
		_applicantName = applicantName;
	}

	public String getApplicantAddress() {
		return _applicantAddress;
	}

	public void setApplicantAddress(String applicantAddress) {
		_applicantAddress = applicantAddress;
	}

	public long getCertificateId() {
		return _certificateId;
	}

	public void setCertificateId(long certificateId) {
		_certificateId = certificateId;
	}

	public String getProductionNumber() {
		return _productionNumber;
	}

	public void setProductionNumber(String productionNumber) {
		_productionNumber = productionNumber;
	}

	public Date getProductionDate() {
		return _productionDate;
	}

	public void setProductionDate(Date productionDate) {
		_productionDate = productionDate;
	}

	public String getFrameNo() {
		return _frameNo;
	}

	public void setFrameNo(String frameNo) {
		_frameNo = frameNo;
	}

	public String getBoxNo() {
		return _boxNo;
	}

	public void setBoxNo(String boxNo) {
		_boxNo = boxNo;
	}

	public String getEngineNo() {
		return _engineNo;
	}

	public void setEngineNo(String engineNo) {
		_engineNo = engineNo;
	}

	public String getColor() {
		return _color;
	}

	public void setColor(String color) {
		_color = color;
	}

	public String getStampShortNo() {
		return _stampShortNo;
	}

	public void setStampShortNo(String stampShortNo) {
		_stampShortNo = stampShortNo;
	}

	public String getSerialNo() {
		return _serialNo;
	}

	public void setSerialNo(String serialNo) {
		_serialNo = serialNo;
	}

	public long getVehicleRecordStatus() {
		return _vehicleRecordStatus;
	}

	public void setVehicleRecordStatus(long vehicleRecordStatus) {
		_vehicleRecordStatus = vehicleRecordStatus;
	}

	public long getPrintingStatus() {
		return _printingStatus;
	}

	public void setPrintingStatus(long printingStatus) {
		_printingStatus = printingStatus;
	}

	public long getAttachedFile() {
		return _attachedFile;
	}

	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
	}

	public String getSignName() {
		return _signName;
	}

	public void setSignName(String signName) {
		_signName = signName;
	}

	public String getSignTitle() {
		return _signTitle;
	}

	public void setSignTitle(String signTitle) {
		_signTitle = signTitle;
	}

	public String getSignPlace() {
		return _signPlace;
	}

	public void setSignPlace(String signPlace) {
		_signPlace = signPlace;
	}

	public Date getSignDate() {
		return _signDate;
	}

	public void setSignDate(Date signDate) {
		_signDate = signDate;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	public Date getCertificateRecordDate() {
		return _certificateRecordDate;
	}

	public void setCertificateRecordDate(Date certificateRecordDate) {
		_certificateRecordDate = certificateRecordDate;
	}

	public long getIssueInspectionRecordId() {
		return _issueInspectionRecordId;
	}

	public void setIssueInspectionRecordId(long issueInspectionRecordId) {
		_issueInspectionRecordId = issueInspectionRecordId;
	}

	public String getCertificaterecordno() {
		return _certificaterecordno;
	}

	public void setCertificaterecordno(String certificaterecordno) {
		_certificaterecordno = certificaterecordno;
	}

	public int getPostPrintingStatus() {
		return _postPrintingStatus;
	}

	public void setPostPrintingStatus(int postPrintingStatus) {
		_postPrintingStatus = postPrintingStatus;
	}

	public String getQrCode() {
		return _qrCode;
	}

	public void setQrCode(String qrCode) {
		_qrCode = qrCode;
	}

	private long _id;
	private long _mtCore;
	private long _issueId;
	private long _issueVehicleCertificateId;
	private long _dossierId;
	private long _applicantProfileId;
	private String _applicantName;
	private String _applicantAddress;
	private long _certificateId;
	private String _productionNumber;
	private Date _productionDate;
	private String _frameNo;
	private String _boxNo;
	private String _engineNo;
	private String _color;
	private String _stampShortNo;
	private String _serialNo;
	private long _vehicleRecordStatus;
	private long _printingStatus;
	private long _attachedFile;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
	private Date _modifyDate;
	private Date _syncDate;
	private Date _certificateRecordDate;
	private long _issueInspectionRecordId;
	private String _certificaterecordno;
	private int _postPrintingStatus;
	private String _qrCode;
}