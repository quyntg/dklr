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
public class VRIssueEquipmentCertificateSoap implements Serializable {
	public static VRIssueEquipmentCertificateSoap toSoapModel(
		VRIssueEquipmentCertificate model) {
		VRIssueEquipmentCertificateSoap soapModel = new VRIssueEquipmentCertificateSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setIssueId(model.getIssueId());
		soapModel.setIssueVehicleCertificateId(model.getIssueVehicleCertificateId());
		soapModel.setVehicleCertificateRecordNo(model.getVehicleCertificateRecordNo());
		soapModel.setEquipmentName(model.getEquipmentName());
		soapModel.setEquipmentType(model.getEquipmentType());
		soapModel.setEquipmentCertificateType(model.getEquipmentCertificateType());
		soapModel.setEquipmentDocumentNo(model.getEquipmentDocumentNo());
		soapModel.setEquipmentCertificateRecordNo(model.getEquipmentCertificateRecordNo());
		soapModel.setEquipmentExamRecordNo(model.getEquipmentExamRecordNo());
		soapModel.setEquipmentCertificateRecordId(model.getEquipmentCertificateRecordId());
		soapModel.setTotalQuantity(model.getTotalQuantity());
		soapModel.setTotalProductUsed(model.getTotalProductUsed());
		soapModel.setTotalInUse(model.getTotalInUse());
		soapModel.setTotalNotUsed(model.getTotalNotUsed());
		soapModel.setApplicantNo(model.getApplicantNo());
		soapModel.setApplicantName(model.getApplicantName());
		soapModel.setApplicantAddress(model.getApplicantAddress());
		soapModel.setProductionPlantName(model.getProductionPlantName());
		soapModel.setProductionPlantAddress(model.getProductionPlantAddress());
		soapModel.setVehicleCertificateRecordDate(model.getVehicleCertificateRecordDate());
		soapModel.setEquipmentCertificateRecordDate(model.getEquipmentCertificateRecordDate());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRIssueEquipmentCertificateSoap[] toSoapModels(
		VRIssueEquipmentCertificate[] models) {
		VRIssueEquipmentCertificateSoap[] soapModels = new VRIssueEquipmentCertificateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRIssueEquipmentCertificateSoap[][] toSoapModels(
		VRIssueEquipmentCertificate[][] models) {
		VRIssueEquipmentCertificateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRIssueEquipmentCertificateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRIssueEquipmentCertificateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRIssueEquipmentCertificateSoap[] toSoapModels(
		List<VRIssueEquipmentCertificate> models) {
		List<VRIssueEquipmentCertificateSoap> soapModels = new ArrayList<VRIssueEquipmentCertificateSoap>(models.size());

		for (VRIssueEquipmentCertificate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRIssueEquipmentCertificateSoap[soapModels.size()]);
	}

	public VRIssueEquipmentCertificateSoap() {
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

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
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

	public String getVehicleCertificateRecordNo() {
		return _vehicleCertificateRecordNo;
	}

	public void setVehicleCertificateRecordNo(String vehicleCertificateRecordNo) {
		_vehicleCertificateRecordNo = vehicleCertificateRecordNo;
	}

	public String getEquipmentName() {
		return _equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		_equipmentName = equipmentName;
	}

	public String getEquipmentType() {
		return _equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		_equipmentType = equipmentType;
	}

	public String getEquipmentCertificateType() {
		return _equipmentCertificateType;
	}

	public void setEquipmentCertificateType(String equipmentCertificateType) {
		_equipmentCertificateType = equipmentCertificateType;
	}

	public String getEquipmentDocumentNo() {
		return _equipmentDocumentNo;
	}

	public void setEquipmentDocumentNo(String equipmentDocumentNo) {
		_equipmentDocumentNo = equipmentDocumentNo;
	}

	public String getEquipmentCertificateRecordNo() {
		return _equipmentCertificateRecordNo;
	}

	public void setEquipmentCertificateRecordNo(
		String equipmentCertificateRecordNo) {
		_equipmentCertificateRecordNo = equipmentCertificateRecordNo;
	}

	public String getEquipmentExamRecordNo() {
		return _equipmentExamRecordNo;
	}

	public void setEquipmentExamRecordNo(String equipmentExamRecordNo) {
		_equipmentExamRecordNo = equipmentExamRecordNo;
	}

	public int getEquipmentCertificateRecordId() {
		return _EquipmentCertificateRecordId;
	}

	public void setEquipmentCertificateRecordId(
		int EquipmentCertificateRecordId) {
		_EquipmentCertificateRecordId = EquipmentCertificateRecordId;
	}

	public int getTotalQuantity() {
		return _TotalQuantity;
	}

	public void setTotalQuantity(int TotalQuantity) {
		_TotalQuantity = TotalQuantity;
	}

	public int getTotalProductUsed() {
		return _TotalProductUsed;
	}

	public void setTotalProductUsed(int TotalProductUsed) {
		_TotalProductUsed = TotalProductUsed;
	}

	public int getTotalInUse() {
		return _TotalInUse;
	}

	public void setTotalInUse(int TotalInUse) {
		_TotalInUse = TotalInUse;
	}

	public int getTotalNotUsed() {
		return _TotalNotUsed;
	}

	public void setTotalNotUsed(int TotalNotUsed) {
		_TotalNotUsed = TotalNotUsed;
	}

	public String getApplicantNo() {
		return _applicantNo;
	}

	public void setApplicantNo(String applicantNo) {
		_applicantNo = applicantNo;
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

	public String getProductionPlantName() {
		return _productionPlantName;
	}

	public void setProductionPlantName(String productionPlantName) {
		_productionPlantName = productionPlantName;
	}

	public String getProductionPlantAddress() {
		return _productionPlantAddress;
	}

	public void setProductionPlantAddress(String productionPlantAddress) {
		_productionPlantAddress = productionPlantAddress;
	}

	public Date getVehicleCertificateRecordDate() {
		return _vehicleCertificateRecordDate;
	}

	public void setVehicleCertificateRecordDate(
		Date vehicleCertificateRecordDate) {
		_vehicleCertificateRecordDate = vehicleCertificateRecordDate;
	}

	public Date getEquipmentCertificateRecordDate() {
		return _equipmentCertificateRecordDate;
	}

	public void setEquipmentCertificateRecordDate(
		Date equipmentCertificateRecordDate) {
		_equipmentCertificateRecordDate = equipmentCertificateRecordDate;
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

	private long _id;
	private long _mtCore;
	private long _dossierId;
	private long _issueId;
	private long _issueVehicleCertificateId;
	private String _vehicleCertificateRecordNo;
	private String _equipmentName;
	private String _equipmentType;
	private String _equipmentCertificateType;
	private String _equipmentDocumentNo;
	private String _equipmentCertificateRecordNo;
	private String _equipmentExamRecordNo;
	private int _EquipmentCertificateRecordId;
	private int _TotalQuantity;
	private int _TotalProductUsed;
	private int _TotalInUse;
	private int _TotalNotUsed;
	private String _applicantNo;
	private String _applicantName;
	private String _applicantAddress;
	private String _productionPlantName;
	private String _productionPlantAddress;
	private Date _vehicleCertificateRecordDate;
	private Date _equipmentCertificateRecordDate;
	private Date _modifyDate;
	private Date _syncDate;
}