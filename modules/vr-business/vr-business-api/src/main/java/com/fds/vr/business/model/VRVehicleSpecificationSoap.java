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
public class VRVehicleSpecificationSoap implements Serializable {
	public static VRVehicleSpecificationSoap toSoapModel(
		VRVehicleSpecification model) {
		VRVehicleSpecificationSoap soapModel = new VRVehicleSpecificationSoap();

		soapModel.setId(model.getId());
		soapModel.setVehicleCertificateId(model.getVehicleCertificateId());
		soapModel.setSpecificationCode(model.getSpecificationCode());
		soapModel.setSpecificationName(model.getSpecificationName());
		soapModel.setSpecificationValue(model.getSpecificationValue());
		soapModel.setSpecificationValueDescription(model.getSpecificationValueDescription());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setSpecificationBasicUnit(model.getSpecificationBasicUnit());
		soapModel.setSpecificationStandard(model.getSpecificationStandard());
		soapModel.setSpecificationGroup(model.getSpecificationGroup());
		soapModel.setSpecificationDataCollectionID(model.getSpecificationDataCollectionID());
		soapModel.setSpecificationResult(model.getSpecificationResult());
		soapModel.setDeliverableCode(model.getDeliverableCode());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDossierNo(model.getDossierNo());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRVehicleSpecificationSoap[] toSoapModels(
		VRVehicleSpecification[] models) {
		VRVehicleSpecificationSoap[] soapModels = new VRVehicleSpecificationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRVehicleSpecificationSoap[][] toSoapModels(
		VRVehicleSpecification[][] models) {
		VRVehicleSpecificationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRVehicleSpecificationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRVehicleSpecificationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRVehicleSpecificationSoap[] toSoapModels(
		List<VRVehicleSpecification> models) {
		List<VRVehicleSpecificationSoap> soapModels = new ArrayList<VRVehicleSpecificationSoap>(models.size());

		for (VRVehicleSpecification model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRVehicleSpecificationSoap[soapModels.size()]);
	}

	public VRVehicleSpecificationSoap() {
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

	public long getVehicleCertificateId() {
		return _vehicleCertificateId;
	}

	public void setVehicleCertificateId(long vehicleCertificateId) {
		_vehicleCertificateId = vehicleCertificateId;
	}

	public String getSpecificationCode() {
		return _specificationCode;
	}

	public void setSpecificationCode(String specificationCode) {
		_specificationCode = specificationCode;
	}

	public String getSpecificationName() {
		return _specificationName;
	}

	public void setSpecificationName(String specificationName) {
		_specificationName = specificationName;
	}

	public String getSpecificationValue() {
		return _specificationValue;
	}

	public void setSpecificationValue(String specificationValue) {
		_specificationValue = specificationValue;
	}

	public String getSpecificationValueDescription() {
		return _specificationValueDescription;
	}

	public void setSpecificationValueDescription(
		String specificationValueDescription) {
		_specificationValueDescription = specificationValueDescription;
	}

	public long getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public String getSpecificationBasicUnit() {
		return _specificationBasicUnit;
	}

	public void setSpecificationBasicUnit(String specificationBasicUnit) {
		_specificationBasicUnit = specificationBasicUnit;
	}

	public String getSpecificationStandard() {
		return _specificationStandard;
	}

	public void setSpecificationStandard(String specificationStandard) {
		_specificationStandard = specificationStandard;
	}

	public String getSpecificationGroup() {
		return _specificationGroup;
	}

	public void setSpecificationGroup(String specificationGroup) {
		_specificationGroup = specificationGroup;
	}

	public String getSpecificationDataCollectionID() {
		return _specificationDataCollectionID;
	}

	public void setSpecificationDataCollectionID(
		String specificationDataCollectionID) {
		_specificationDataCollectionID = specificationDataCollectionID;
	}

	public String getSpecificationResult() {
		return _specificationResult;
	}

	public void setSpecificationResult(String specificationResult) {
		_specificationResult = specificationResult;
	}

	public String getDeliverableCode() {
		return _deliverableCode;
	}

	public void setDeliverableCode(String deliverableCode) {
		_deliverableCode = deliverableCode;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public String getDossierIdCTN() {
		return _dossierIdCTN;
	}

	public void setDossierIdCTN(String dossierIdCTN) {
		_dossierIdCTN = dossierIdCTN;
	}

	public String getDossierNo() {
		return _dossierNo;
	}

	public void setDossierNo(String dossierNo) {
		_dossierNo = dossierNo;
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
	private long _vehicleCertificateId;
	private String _specificationCode;
	private String _specificationName;
	private String _specificationValue;
	private String _specificationValueDescription;
	private long _sequenceNo;
	private String _specificationBasicUnit;
	private String _specificationStandard;
	private String _specificationGroup;
	private String _specificationDataCollectionID;
	private String _specificationResult;
	private String _deliverableCode;
	private long _dossierId;
	private String _dossierIdCTN;
	private String _dossierNo;
	private Date _modifyDate;
	private Date _syncDate;
}