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
public class VRCOPProdEquipmentSoap implements Serializable {
	public static VRCOPProdEquipmentSoap toSoapModel(VRCOPProdEquipment model) {
		VRCOPProdEquipmentSoap soapModel = new VRCOPProdEquipmentSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setCopReportRepositoryID(model.getCopReportRepositoryID());
		soapModel.setCopReportNo(model.getCopReportNo());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setEquipmentCode(model.getEquipmentCode());
		soapModel.setEquipmentName(model.getEquipmentName());
		soapModel.setEquipmentType(model.getEquipmentType());
		soapModel.setTrademark(model.getTrademark());
		soapModel.setTrademarkName(model.getTrademarkName());
		soapModel.setCommercialName(model.getCommercialName());
		soapModel.setModelCode(model.getModelCode());
		soapModel.setDesignSymbolNo(model.getDesignSymbolNo());
		soapModel.setProductionCountryCode(model.getProductionCountryCode());
		soapModel.setEquipmentStatus(model.getEquipmentStatus());
		soapModel.setNotes(model.getNotes());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());
		soapModel.setQuantity(model.getQuantity());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDossierNo(model.getDossierNo());

		return soapModel;
	}

	public static VRCOPProdEquipmentSoap[] toSoapModels(
		VRCOPProdEquipment[] models) {
		VRCOPProdEquipmentSoap[] soapModels = new VRCOPProdEquipmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRCOPProdEquipmentSoap[][] toSoapModels(
		VRCOPProdEquipment[][] models) {
		VRCOPProdEquipmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRCOPProdEquipmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRCOPProdEquipmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRCOPProdEquipmentSoap[] toSoapModels(
		List<VRCOPProdEquipment> models) {
		List<VRCOPProdEquipmentSoap> soapModels = new ArrayList<VRCOPProdEquipmentSoap>(models.size());

		for (VRCOPProdEquipment model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRCOPProdEquipmentSoap[soapModels.size()]);
	}

	public VRCOPProdEquipmentSoap() {
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

	public long getCopReportRepositoryID() {
		return _copReportRepositoryID;
	}

	public void setCopReportRepositoryID(long copReportRepositoryID) {
		_copReportRepositoryID = copReportRepositoryID;
	}

	public String getCopReportNo() {
		return _copReportNo;
	}

	public void setCopReportNo(String copReportNo) {
		_copReportNo = copReportNo;
	}

	public long getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public String getEquipmentCode() {
		return _equipmentCode;
	}

	public void setEquipmentCode(String equipmentCode) {
		_equipmentCode = equipmentCode;
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

	public String getTrademark() {
		return _trademark;
	}

	public void setTrademark(String trademark) {
		_trademark = trademark;
	}

	public String getTrademarkName() {
		return _trademarkName;
	}

	public void setTrademarkName(String trademarkName) {
		_trademarkName = trademarkName;
	}

	public String getCommercialName() {
		return _commercialName;
	}

	public void setCommercialName(String commercialName) {
		_commercialName = commercialName;
	}

	public String getModelCode() {
		return _modelCode;
	}

	public void setModelCode(String modelCode) {
		_modelCode = modelCode;
	}

	public String getDesignSymbolNo() {
		return _designSymbolNo;
	}

	public void setDesignSymbolNo(String designSymbolNo) {
		_designSymbolNo = designSymbolNo;
	}

	public String getProductionCountryCode() {
		return _productionCountryCode;
	}

	public void setProductionCountryCode(String productionCountryCode) {
		_productionCountryCode = productionCountryCode;
	}

	public String getEquipmentStatus() {
		return _equipmentStatus;
	}

	public void setEquipmentStatus(String equipmentStatus) {
		_equipmentStatus = equipmentStatus;
	}

	public String getNotes() {
		return _notes;
	}

	public void setNotes(String notes) {
		_notes = notes;
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

	public int getQuantity() {
		return _quantity;
	}

	public void setQuantity(int quantity) {
		_quantity = quantity;
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

	private long _id;
	private long _mtCore;
	private long _copReportRepositoryID;
	private String _copReportNo;
	private long _sequenceNo;
	private String _equipmentCode;
	private String _equipmentName;
	private String _equipmentType;
	private String _trademark;
	private String _trademarkName;
	private String _commercialName;
	private String _modelCode;
	private String _designSymbolNo;
	private String _productionCountryCode;
	private String _equipmentStatus;
	private String _notes;
	private Date _modifyDate;
	private Date _syncDate;
	private int _quantity;
	private long _dossierId;
	private String _dossierIdCTN;
	private String _dossierNo;
}