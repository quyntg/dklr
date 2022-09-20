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
public class VRTechnicalSpec_XCGSoap implements Serializable {
	public static VRTechnicalSpec_XCGSoap toSoapModel(VRTechnicalSpec_XCG model) {
		VRTechnicalSpec_XCGSoap soapModel = new VRTechnicalSpec_XCGSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setConvertAssembleId(model.getConvertAssembleId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierNo(model.getDossierNo());
		soapModel.setReferenceUid(model.getReferenceUid());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDeliverableCode(model.getDeliverableCode());
		soapModel.setVehicleTypeCertificateId(model.getVehicleTypeCertificateId());
		soapModel.setXCG01070(model.getXCG01070());
		soapModel.setXCG01072(model.getXCG01072());
		soapModel.setXCG01083(model.getXCG01083());
		soapModel.setXCG01084(model.getXCG01084());
		soapModel.setXCG01085(model.getXCG01085());
		soapModel.setXCG01086(model.getXCG01086());
		soapModel.setXCG01087(model.getXCG01087());
		soapModel.setXCG01088(model.getXCG01088());
		soapModel.setXCG01090(model.getXCG01090());
		soapModel.setXCG01091(model.getXCG01091());
		soapModel.setXCG01092(model.getXCG01092());
		soapModel.setXCG01123(model.getXCG01123());
		soapModel.setXCG01124(model.getXCG01124());
		soapModel.setXCG01125(model.getXCG01125());
		soapModel.setXCG01156(model.getXCG01156());
		soapModel.setXCG01157(model.getXCG01157());
		soapModel.setXCG01163(model.getXCG01163());
		soapModel.setXCG01169(model.getXCG01169());
		soapModel.setXCG01170(model.getXCG01170());
		soapModel.setXCG01171(model.getXCG01171());
		soapModel.setXCG01172(model.getXCG01172());
		soapModel.setXCG01173(model.getXCG01173());
		soapModel.setXCG01182(model.getXCG01182());
		soapModel.setXCG01183(model.getXCG01183());
		soapModel.setXCG01192(model.getXCG01192());
		soapModel.setLoai_dong_co(model.getLoai_dong_co());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRTechnicalSpec_XCGSoap[] toSoapModels(
		VRTechnicalSpec_XCG[] models) {
		VRTechnicalSpec_XCGSoap[] soapModels = new VRTechnicalSpec_XCGSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XCGSoap[][] toSoapModels(
		VRTechnicalSpec_XCG[][] models) {
		VRTechnicalSpec_XCGSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRTechnicalSpec_XCGSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRTechnicalSpec_XCGSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XCGSoap[] toSoapModels(
		List<VRTechnicalSpec_XCG> models) {
		List<VRTechnicalSpec_XCGSoap> soapModels = new ArrayList<VRTechnicalSpec_XCGSoap>(models.size());

		for (VRTechnicalSpec_XCG model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRTechnicalSpec_XCGSoap[soapModels.size()]);
	}

	public VRTechnicalSpec_XCGSoap() {
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

	public long getConvertAssembleId() {
		return _convertAssembleId;
	}

	public void setConvertAssembleId(long convertAssembleId) {
		_convertAssembleId = convertAssembleId;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public String getDossierNo() {
		return _dossierNo;
	}

	public void setDossierNo(String dossierNo) {
		_dossierNo = dossierNo;
	}

	public String getReferenceUid() {
		return _referenceUid;
	}

	public void setReferenceUid(String referenceUid) {
		_referenceUid = referenceUid;
	}

	public String getDossierIdCTN() {
		return _dossierIdCTN;
	}

	public void setDossierIdCTN(String dossierIdCTN) {
		_dossierIdCTN = dossierIdCTN;
	}

	public String getDeliverableCode() {
		return _deliverableCode;
	}

	public void setDeliverableCode(String deliverableCode) {
		_deliverableCode = deliverableCode;
	}

	public long getVehicleTypeCertificateId() {
		return _vehicleTypeCertificateId;
	}

	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vehicleTypeCertificateId = vehicleTypeCertificateId;
	}

	public String getXCG01070() {
		return _XCG01070;
	}

	public void setXCG01070(String XCG01070) {
		_XCG01070 = XCG01070;
	}

	public String getXCG01072() {
		return _XCG01072;
	}

	public void setXCG01072(String XCG01072) {
		_XCG01072 = XCG01072;
	}

	public String getXCG01083() {
		return _XCG01083;
	}

	public void setXCG01083(String XCG01083) {
		_XCG01083 = XCG01083;
	}

	public String getXCG01084() {
		return _XCG01084;
	}

	public void setXCG01084(String XCG01084) {
		_XCG01084 = XCG01084;
	}

	public String getXCG01085() {
		return _XCG01085;
	}

	public void setXCG01085(String XCG01085) {
		_XCG01085 = XCG01085;
	}

	public String getXCG01086() {
		return _XCG01086;
	}

	public void setXCG01086(String XCG01086) {
		_XCG01086 = XCG01086;
	}

	public String getXCG01087() {
		return _XCG01087;
	}

	public void setXCG01087(String XCG01087) {
		_XCG01087 = XCG01087;
	}

	public String getXCG01088() {
		return _XCG01088;
	}

	public void setXCG01088(String XCG01088) {
		_XCG01088 = XCG01088;
	}

	public String getXCG01090() {
		return _XCG01090;
	}

	public void setXCG01090(String XCG01090) {
		_XCG01090 = XCG01090;
	}

	public String getXCG01091() {
		return _XCG01091;
	}

	public void setXCG01091(String XCG01091) {
		_XCG01091 = XCG01091;
	}

	public String getXCG01092() {
		return _XCG01092;
	}

	public void setXCG01092(String XCG01092) {
		_XCG01092 = XCG01092;
	}

	public String getXCG01123() {
		return _XCG01123;
	}

	public void setXCG01123(String XCG01123) {
		_XCG01123 = XCG01123;
	}

	public String getXCG01124() {
		return _XCG01124;
	}

	public void setXCG01124(String XCG01124) {
		_XCG01124 = XCG01124;
	}

	public String getXCG01125() {
		return _XCG01125;
	}

	public void setXCG01125(String XCG01125) {
		_XCG01125 = XCG01125;
	}

	public String getXCG01156() {
		return _XCG01156;
	}

	public void setXCG01156(String XCG01156) {
		_XCG01156 = XCG01156;
	}

	public String getXCG01157() {
		return _XCG01157;
	}

	public void setXCG01157(String XCG01157) {
		_XCG01157 = XCG01157;
	}

	public String getXCG01163() {
		return _XCG01163;
	}

	public void setXCG01163(String XCG01163) {
		_XCG01163 = XCG01163;
	}

	public String getXCG01169() {
		return _XCG01169;
	}

	public void setXCG01169(String XCG01169) {
		_XCG01169 = XCG01169;
	}

	public String getXCG01170() {
		return _XCG01170;
	}

	public void setXCG01170(String XCG01170) {
		_XCG01170 = XCG01170;
	}

	public String getXCG01171() {
		return _XCG01171;
	}

	public void setXCG01171(String XCG01171) {
		_XCG01171 = XCG01171;
	}

	public String getXCG01172() {
		return _XCG01172;
	}

	public void setXCG01172(String XCG01172) {
		_XCG01172 = XCG01172;
	}

	public String getXCG01173() {
		return _XCG01173;
	}

	public void setXCG01173(String XCG01173) {
		_XCG01173 = XCG01173;
	}

	public String getXCG01182() {
		return _XCG01182;
	}

	public void setXCG01182(String XCG01182) {
		_XCG01182 = XCG01182;
	}

	public String getXCG01183() {
		return _XCG01183;
	}

	public void setXCG01183(String XCG01183) {
		_XCG01183 = XCG01183;
	}

	public String getXCG01192() {
		return _XCG01192;
	}

	public void setXCG01192(String XCG01192) {
		_XCG01192 = XCG01192;
	}

	public String getLoai_dong_co() {
		return _loai_dong_co;
	}

	public void setLoai_dong_co(String loai_dong_co) {
		_loai_dong_co = loai_dong_co;
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
	private long _convertAssembleId;
	private long _dossierId;
	private String _dossierNo;
	private String _referenceUid;
	private String _dossierIdCTN;
	private String _deliverableCode;
	private long _vehicleTypeCertificateId;
	private String _XCG01070;
	private String _XCG01072;
	private String _XCG01083;
	private String _XCG01084;
	private String _XCG01085;
	private String _XCG01086;
	private String _XCG01087;
	private String _XCG01088;
	private String _XCG01090;
	private String _XCG01091;
	private String _XCG01092;
	private String _XCG01123;
	private String _XCG01124;
	private String _XCG01125;
	private String _XCG01156;
	private String _XCG01157;
	private String _XCG01163;
	private String _XCG01169;
	private String _XCG01170;
	private String _XCG01171;
	private String _XCG01172;
	private String _XCG01173;
	private String _XCG01182;
	private String _XCG01183;
	private String _XCG01192;
	private String _loai_dong_co;
	private Date _modifyDate;
	private Date _syncDate;
}