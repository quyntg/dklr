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
public class VRInspectionStandardSoap implements Serializable {
	public static VRInspectionStandardSoap toSoapModel(
		VRInspectionStandard model) {
		VRInspectionStandardSoap soapModel = new VRInspectionStandardSoap();

		soapModel.setId(model.getId());
		soapModel.setVehicleCertificateId(model.getVehicleCertificateId());
		soapModel.setDeliverableCode(model.getDeliverableCode());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setCircularno(model.getCircularno());
		soapModel.setCirculardate(model.getCirculardate());
		soapModel.setMarkupstatus(model.getMarkupstatus());
		soapModel.setModule(model.getModule());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDossierNo(model.getDossierNo());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRInspectionStandardSoap[] toSoapModels(
		VRInspectionStandard[] models) {
		VRInspectionStandardSoap[] soapModels = new VRInspectionStandardSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRInspectionStandardSoap[][] toSoapModels(
		VRInspectionStandard[][] models) {
		VRInspectionStandardSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRInspectionStandardSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRInspectionStandardSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRInspectionStandardSoap[] toSoapModels(
		List<VRInspectionStandard> models) {
		List<VRInspectionStandardSoap> soapModels = new ArrayList<VRInspectionStandardSoap>(models.size());

		for (VRInspectionStandard model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRInspectionStandardSoap[soapModels.size()]);
	}

	public VRInspectionStandardSoap() {
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

	public String getDeliverableCode() {
		return _deliverableCode;
	}

	public void setDeliverableCode(String deliverableCode) {
		_deliverableCode = deliverableCode;
	}

	public long getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public String getCircularno() {
		return _circularno;
	}

	public void setCircularno(String circularno) {
		_circularno = circularno;
	}

	public Date getCirculardate() {
		return _circulardate;
	}

	public void setCirculardate(Date circulardate) {
		_circulardate = circulardate;
	}

	public long getMarkupstatus() {
		return _markupstatus;
	}

	public void setMarkupstatus(long markupstatus) {
		_markupstatus = markupstatus;
	}

	public String getModule() {
		return _module;
	}

	public void setModule(String module) {
		_module = module;
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
	private String _deliverableCode;
	private long _sequenceNo;
	private String _circularno;
	private Date _circulardate;
	private long _markupstatus;
	private String _module;
	private long _dossierId;
	private String _dossierIdCTN;
	private String _dossierNo;
	private Date _modifyDate;
	private Date _syncDate;
}