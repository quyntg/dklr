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
 * This class is a wrapper for {@link VRCOPProductionPlantEquipment}.
 * </p>
 *
 * @author LamTV
 * @see VRCOPProductionPlantEquipment
 * @generated
 */
@ProviderType
public class VRCOPProductionPlantEquipmentWrapper
	implements VRCOPProductionPlantEquipment,
		ModelWrapper<VRCOPProductionPlantEquipment> {
	public VRCOPProductionPlantEquipmentWrapper(
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment) {
		_vrcopProductionPlantEquipment = vrcopProductionPlantEquipment;
	}

	@Override
	public Class<?> getModelClass() {
		return VRCOPProductionPlantEquipment.class;
	}

	@Override
	public String getModelClassName() {
		return VRCOPProductionPlantEquipment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("copReportRepositoryID", getCopReportRepositoryID());
		attributes.put("copReportNo", getCopReportNo());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("equipmentCode", getEquipmentCode());
		attributes.put("equipmentName", getEquipmentName());
		attributes.put("equipmentType", getEquipmentType());
		attributes.put("trademark", getTrademark());
		attributes.put("trademarkName", getTrademarkName());
		attributes.put("commercialName", getCommercialName());
		attributes.put("modelCode", getModelCode());
		attributes.put("productionCountryCode", getProductionCountryCode());
		attributes.put("equipmentStatus", getEquipmentStatus());
		attributes.put("expireDate", getExpireDate());
		attributes.put("notes", getNotes());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());
		attributes.put("equipmentSerialNo", getEquipmentSerialNo());
		attributes.put("productionYear", getProductionYear());
		attributes.put("registrationYear", getRegistrationYear());
		attributes.put("markupXCG", getMarkupXCG());
		attributes.put("markupXCGNK", getMarkupXCGNK());
		attributes.put("markupSMRM", getMarkupSMRM());
		attributes.put("markupXCH", getMarkupXCH());
		attributes.put("markupXCN", getMarkupXCN());
		attributes.put("markupXMY", getMarkupXMY());
		attributes.put("markupXDD", getMarkupXDD());
		attributes.put("testingResult", getTestingResult());
		attributes.put("description", getDescription());
		attributes.put("inspectionRecordNumber", getInspectionRecordNumber());
		attributes.put("inspectionRecordDate", getInspectionRecordDate());
		attributes.put("expiredDate", getExpiredDate());
		attributes.put("expiredStatus", getExpiredStatus());
		attributes.put("stampTestingNo", getStampTestingNo());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierIdCTN", getDossierIdCTN());
		attributes.put("dossierNo", getDossierNo());
		attributes.put("productionPlantId", getProductionPlantId());
		attributes.put("productionPlantCode", getProductionPlantCode());

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

		Long copReportRepositoryID = (Long)attributes.get(
				"copReportRepositoryID");

		if (copReportRepositoryID != null) {
			setCopReportRepositoryID(copReportRepositoryID);
		}

		String copReportNo = (String)attributes.get("copReportNo");

		if (copReportNo != null) {
			setCopReportNo(copReportNo);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String equipmentCode = (String)attributes.get("equipmentCode");

		if (equipmentCode != null) {
			setEquipmentCode(equipmentCode);
		}

		String equipmentName = (String)attributes.get("equipmentName");

		if (equipmentName != null) {
			setEquipmentName(equipmentName);
		}

		String equipmentType = (String)attributes.get("equipmentType");

		if (equipmentType != null) {
			setEquipmentType(equipmentType);
		}

		String trademark = (String)attributes.get("trademark");

		if (trademark != null) {
			setTrademark(trademark);
		}

		String trademarkName = (String)attributes.get("trademarkName");

		if (trademarkName != null) {
			setTrademarkName(trademarkName);
		}

		String commercialName = (String)attributes.get("commercialName");

		if (commercialName != null) {
			setCommercialName(commercialName);
		}

		String modelCode = (String)attributes.get("modelCode");

		if (modelCode != null) {
			setModelCode(modelCode);
		}

		String productionCountryCode = (String)attributes.get(
				"productionCountryCode");

		if (productionCountryCode != null) {
			setProductionCountryCode(productionCountryCode);
		}

		String equipmentStatus = (String)attributes.get("equipmentStatus");

		if (equipmentStatus != null) {
			setEquipmentStatus(equipmentStatus);
		}

		Date expireDate = (Date)attributes.get("expireDate");

		if (expireDate != null) {
			setExpireDate(expireDate);
		}

		String notes = (String)attributes.get("notes");

		if (notes != null) {
			setNotes(notes);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}

		String equipmentSerialNo = (String)attributes.get("equipmentSerialNo");

		if (equipmentSerialNo != null) {
			setEquipmentSerialNo(equipmentSerialNo);
		}

		String productionYear = (String)attributes.get("productionYear");

		if (productionYear != null) {
			setProductionYear(productionYear);
		}

		String registrationYear = (String)attributes.get("registrationYear");

		if (registrationYear != null) {
			setRegistrationYear(registrationYear);
		}

		Long markupXCG = (Long)attributes.get("markupXCG");

		if (markupXCG != null) {
			setMarkupXCG(markupXCG);
		}

		Long markupXCGNK = (Long)attributes.get("markupXCGNK");

		if (markupXCGNK != null) {
			setMarkupXCGNK(markupXCGNK);
		}

		Long markupSMRM = (Long)attributes.get("markupSMRM");

		if (markupSMRM != null) {
			setMarkupSMRM(markupSMRM);
		}

		Long markupXCH = (Long)attributes.get("markupXCH");

		if (markupXCH != null) {
			setMarkupXCH(markupXCH);
		}

		Long markupXCN = (Long)attributes.get("markupXCN");

		if (markupXCN != null) {
			setMarkupXCN(markupXCN);
		}

		Long markupXMY = (Long)attributes.get("markupXMY");

		if (markupXMY != null) {
			setMarkupXMY(markupXMY);
		}

		Long markupXDD = (Long)attributes.get("markupXDD");

		if (markupXDD != null) {
			setMarkupXDD(markupXDD);
		}

		Integer testingResult = (Integer)attributes.get("testingResult");

		if (testingResult != null) {
			setTestingResult(testingResult);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String inspectionRecordNumber = (String)attributes.get(
				"inspectionRecordNumber");

		if (inspectionRecordNumber != null) {
			setInspectionRecordNumber(inspectionRecordNumber);
		}

		Date inspectionRecordDate = (Date)attributes.get("inspectionRecordDate");

		if (inspectionRecordDate != null) {
			setInspectionRecordDate(inspectionRecordDate);
		}

		Date expiredDate = (Date)attributes.get("expiredDate");

		if (expiredDate != null) {
			setExpiredDate(expiredDate);
		}

		Integer expiredStatus = (Integer)attributes.get("expiredStatus");

		if (expiredStatus != null) {
			setExpiredStatus(expiredStatus);
		}

		String stampTestingNo = (String)attributes.get("stampTestingNo");

		if (stampTestingNo != null) {
			setStampTestingNo(stampTestingNo);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		String dossierIdCTN = (String)attributes.get("dossierIdCTN");

		if (dossierIdCTN != null) {
			setDossierIdCTN(dossierIdCTN);
		}

		String dossierNo = (String)attributes.get("dossierNo");

		if (dossierNo != null) {
			setDossierNo(dossierNo);
		}

		Long productionPlantId = (Long)attributes.get("productionPlantId");

		if (productionPlantId != null) {
			setProductionPlantId(productionPlantId);
		}

		String productionPlantCode = (String)attributes.get(
				"productionPlantCode");

		if (productionPlantCode != null) {
			setProductionPlantCode(productionPlantCode);
		}
	}

	@Override
	public VRCOPProductionPlantEquipment toEscapedModel() {
		return new VRCOPProductionPlantEquipmentWrapper(_vrcopProductionPlantEquipment.toEscapedModel());
	}

	@Override
	public VRCOPProductionPlantEquipment toUnescapedModel() {
		return new VRCOPProductionPlantEquipmentWrapper(_vrcopProductionPlantEquipment.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrcopProductionPlantEquipment.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrcopProductionPlantEquipment.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrcopProductionPlantEquipment.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrcopProductionPlantEquipment.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRCOPProductionPlantEquipment> toCacheModel() {
		return _vrcopProductionPlantEquipment.toCacheModel();
	}

	@Override
	public int compareTo(
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment) {
		return _vrcopProductionPlantEquipment.compareTo(vrcopProductionPlantEquipment);
	}

	/**
	* Returns the expired status of this vrcop production plant equipment.
	*
	* @return the expired status of this vrcop production plant equipment
	*/
	@Override
	public int getExpiredStatus() {
		return _vrcopProductionPlantEquipment.getExpiredStatus();
	}

	/**
	* Returns the testing result of this vrcop production plant equipment.
	*
	* @return the testing result of this vrcop production plant equipment
	*/
	@Override
	public int getTestingResult() {
		return _vrcopProductionPlantEquipment.getTestingResult();
	}

	@Override
	public int hashCode() {
		return _vrcopProductionPlantEquipment.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrcopProductionPlantEquipment.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRCOPProductionPlantEquipmentWrapper((VRCOPProductionPlantEquipment)_vrcopProductionPlantEquipment.clone());
	}

	/**
	* Returns the commercial name of this vrcop production plant equipment.
	*
	* @return the commercial name of this vrcop production plant equipment
	*/
	@Override
	public java.lang.String getCommercialName() {
		return _vrcopProductionPlantEquipment.getCommercialName();
	}

	/**
	* Returns the cop report no of this vrcop production plant equipment.
	*
	* @return the cop report no of this vrcop production plant equipment
	*/
	@Override
	public java.lang.String getCopReportNo() {
		return _vrcopProductionPlantEquipment.getCopReportNo();
	}

	/**
	* Returns the description of this vrcop production plant equipment.
	*
	* @return the description of this vrcop production plant equipment
	*/
	@Override
	public java.lang.String getDescription() {
		return _vrcopProductionPlantEquipment.getDescription();
	}

	/**
	* Returns the dossier ID ctn of this vrcop production plant equipment.
	*
	* @return the dossier ID ctn of this vrcop production plant equipment
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrcopProductionPlantEquipment.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vrcop production plant equipment.
	*
	* @return the dossier no of this vrcop production plant equipment
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrcopProductionPlantEquipment.getDossierNo();
	}

	/**
	* Returns the equipment code of this vrcop production plant equipment.
	*
	* @return the equipment code of this vrcop production plant equipment
	*/
	@Override
	public java.lang.String getEquipmentCode() {
		return _vrcopProductionPlantEquipment.getEquipmentCode();
	}

	/**
	* Returns the equipment name of this vrcop production plant equipment.
	*
	* @return the equipment name of this vrcop production plant equipment
	*/
	@Override
	public java.lang.String getEquipmentName() {
		return _vrcopProductionPlantEquipment.getEquipmentName();
	}

	/**
	* Returns the equipment serial no of this vrcop production plant equipment.
	*
	* @return the equipment serial no of this vrcop production plant equipment
	*/
	@Override
	public java.lang.String getEquipmentSerialNo() {
		return _vrcopProductionPlantEquipment.getEquipmentSerialNo();
	}

	/**
	* Returns the equipment status of this vrcop production plant equipment.
	*
	* @return the equipment status of this vrcop production plant equipment
	*/
	@Override
	public java.lang.String getEquipmentStatus() {
		return _vrcopProductionPlantEquipment.getEquipmentStatus();
	}

	/**
	* Returns the equipment type of this vrcop production plant equipment.
	*
	* @return the equipment type of this vrcop production plant equipment
	*/
	@Override
	public java.lang.String getEquipmentType() {
		return _vrcopProductionPlantEquipment.getEquipmentType();
	}

	/**
	* Returns the inspection record number of this vrcop production plant equipment.
	*
	* @return the inspection record number of this vrcop production plant equipment
	*/
	@Override
	public java.lang.String getInspectionRecordNumber() {
		return _vrcopProductionPlantEquipment.getInspectionRecordNumber();
	}

	/**
	* Returns the model code of this vrcop production plant equipment.
	*
	* @return the model code of this vrcop production plant equipment
	*/
	@Override
	public java.lang.String getModelCode() {
		return _vrcopProductionPlantEquipment.getModelCode();
	}

	/**
	* Returns the notes of this vrcop production plant equipment.
	*
	* @return the notes of this vrcop production plant equipment
	*/
	@Override
	public java.lang.String getNotes() {
		return _vrcopProductionPlantEquipment.getNotes();
	}

	/**
	* Returns the production country code of this vrcop production plant equipment.
	*
	* @return the production country code of this vrcop production plant equipment
	*/
	@Override
	public java.lang.String getProductionCountryCode() {
		return _vrcopProductionPlantEquipment.getProductionCountryCode();
	}

	/**
	* Returns the production plant code of this vrcop production plant equipment.
	*
	* @return the production plant code of this vrcop production plant equipment
	*/
	@Override
	public java.lang.String getProductionPlantCode() {
		return _vrcopProductionPlantEquipment.getProductionPlantCode();
	}

	/**
	* Returns the production year of this vrcop production plant equipment.
	*
	* @return the production year of this vrcop production plant equipment
	*/
	@Override
	public java.lang.String getProductionYear() {
		return _vrcopProductionPlantEquipment.getProductionYear();
	}

	/**
	* Returns the registration year of this vrcop production plant equipment.
	*
	* @return the registration year of this vrcop production plant equipment
	*/
	@Override
	public java.lang.String getRegistrationYear() {
		return _vrcopProductionPlantEquipment.getRegistrationYear();
	}

	/**
	* Returns the stamp testing no of this vrcop production plant equipment.
	*
	* @return the stamp testing no of this vrcop production plant equipment
	*/
	@Override
	public java.lang.String getStampTestingNo() {
		return _vrcopProductionPlantEquipment.getStampTestingNo();
	}

	/**
	* Returns the trademark of this vrcop production plant equipment.
	*
	* @return the trademark of this vrcop production plant equipment
	*/
	@Override
	public java.lang.String getTrademark() {
		return _vrcopProductionPlantEquipment.getTrademark();
	}

	/**
	* Returns the trademark name of this vrcop production plant equipment.
	*
	* @return the trademark name of this vrcop production plant equipment
	*/
	@Override
	public java.lang.String getTrademarkName() {
		return _vrcopProductionPlantEquipment.getTrademarkName();
	}

	@Override
	public java.lang.String toString() {
		return _vrcopProductionPlantEquipment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrcopProductionPlantEquipment.toXmlString();
	}

	/**
	* Returns the expire date of this vrcop production plant equipment.
	*
	* @return the expire date of this vrcop production plant equipment
	*/
	@Override
	public Date getExpireDate() {
		return _vrcopProductionPlantEquipment.getExpireDate();
	}

	/**
	* Returns the expired date of this vrcop production plant equipment.
	*
	* @return the expired date of this vrcop production plant equipment
	*/
	@Override
	public Date getExpiredDate() {
		return _vrcopProductionPlantEquipment.getExpiredDate();
	}

	/**
	* Returns the inspection record date of this vrcop production plant equipment.
	*
	* @return the inspection record date of this vrcop production plant equipment
	*/
	@Override
	public Date getInspectionRecordDate() {
		return _vrcopProductionPlantEquipment.getInspectionRecordDate();
	}

	/**
	* Returns the modify date of this vrcop production plant equipment.
	*
	* @return the modify date of this vrcop production plant equipment
	*/
	@Override
	public Date getModifyDate() {
		return _vrcopProductionPlantEquipment.getModifyDate();
	}

	/**
	* Returns the sync date of this vrcop production plant equipment.
	*
	* @return the sync date of this vrcop production plant equipment
	*/
	@Override
	public Date getSyncDate() {
		return _vrcopProductionPlantEquipment.getSyncDate();
	}

	/**
	* Returns the cop report repository ID of this vrcop production plant equipment.
	*
	* @return the cop report repository ID of this vrcop production plant equipment
	*/
	@Override
	public long getCopReportRepositoryID() {
		return _vrcopProductionPlantEquipment.getCopReportRepositoryID();
	}

	/**
	* Returns the dossier ID of this vrcop production plant equipment.
	*
	* @return the dossier ID of this vrcop production plant equipment
	*/
	@Override
	public long getDossierId() {
		return _vrcopProductionPlantEquipment.getDossierId();
	}

	/**
	* Returns the ID of this vrcop production plant equipment.
	*
	* @return the ID of this vrcop production plant equipment
	*/
	@Override
	public long getId() {
		return _vrcopProductionPlantEquipment.getId();
	}

	/**
	* Returns the markup smrm of this vrcop production plant equipment.
	*
	* @return the markup smrm of this vrcop production plant equipment
	*/
	@Override
	public long getMarkupSMRM() {
		return _vrcopProductionPlantEquipment.getMarkupSMRM();
	}

	/**
	* Returns the markup xcg of this vrcop production plant equipment.
	*
	* @return the markup xcg of this vrcop production plant equipment
	*/
	@Override
	public long getMarkupXCG() {
		return _vrcopProductionPlantEquipment.getMarkupXCG();
	}

	/**
	* Returns the markup xcgnk of this vrcop production plant equipment.
	*
	* @return the markup xcgnk of this vrcop production plant equipment
	*/
	@Override
	public long getMarkupXCGNK() {
		return _vrcopProductionPlantEquipment.getMarkupXCGNK();
	}

	/**
	* Returns the markup xch of this vrcop production plant equipment.
	*
	* @return the markup xch of this vrcop production plant equipment
	*/
	@Override
	public long getMarkupXCH() {
		return _vrcopProductionPlantEquipment.getMarkupXCH();
	}

	/**
	* Returns the markup xcn of this vrcop production plant equipment.
	*
	* @return the markup xcn of this vrcop production plant equipment
	*/
	@Override
	public long getMarkupXCN() {
		return _vrcopProductionPlantEquipment.getMarkupXCN();
	}

	/**
	* Returns the markup xdd of this vrcop production plant equipment.
	*
	* @return the markup xdd of this vrcop production plant equipment
	*/
	@Override
	public long getMarkupXDD() {
		return _vrcopProductionPlantEquipment.getMarkupXDD();
	}

	/**
	* Returns the markup xmy of this vrcop production plant equipment.
	*
	* @return the markup xmy of this vrcop production plant equipment
	*/
	@Override
	public long getMarkupXMY() {
		return _vrcopProductionPlantEquipment.getMarkupXMY();
	}

	/**
	* Returns the mt core of this vrcop production plant equipment.
	*
	* @return the mt core of this vrcop production plant equipment
	*/
	@Override
	public long getMtCore() {
		return _vrcopProductionPlantEquipment.getMtCore();
	}

	/**
	* Returns the primary key of this vrcop production plant equipment.
	*
	* @return the primary key of this vrcop production plant equipment
	*/
	@Override
	public long getPrimaryKey() {
		return _vrcopProductionPlantEquipment.getPrimaryKey();
	}

	/**
	* Returns the production plant ID of this vrcop production plant equipment.
	*
	* @return the production plant ID of this vrcop production plant equipment
	*/
	@Override
	public long getProductionPlantId() {
		return _vrcopProductionPlantEquipment.getProductionPlantId();
	}

	/**
	* Returns the sequence no of this vrcop production plant equipment.
	*
	* @return the sequence no of this vrcop production plant equipment
	*/
	@Override
	public long getSequenceNo() {
		return _vrcopProductionPlantEquipment.getSequenceNo();
	}

	@Override
	public void persist() {
		_vrcopProductionPlantEquipment.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrcopProductionPlantEquipment.setCachedModel(cachedModel);
	}

	/**
	* Sets the commercial name of this vrcop production plant equipment.
	*
	* @param commercialName the commercial name of this vrcop production plant equipment
	*/
	@Override
	public void setCommercialName(java.lang.String commercialName) {
		_vrcopProductionPlantEquipment.setCommercialName(commercialName);
	}

	/**
	* Sets the cop report no of this vrcop production plant equipment.
	*
	* @param copReportNo the cop report no of this vrcop production plant equipment
	*/
	@Override
	public void setCopReportNo(java.lang.String copReportNo) {
		_vrcopProductionPlantEquipment.setCopReportNo(copReportNo);
	}

	/**
	* Sets the cop report repository ID of this vrcop production plant equipment.
	*
	* @param copReportRepositoryID the cop report repository ID of this vrcop production plant equipment
	*/
	@Override
	public void setCopReportRepositoryID(long copReportRepositoryID) {
		_vrcopProductionPlantEquipment.setCopReportRepositoryID(copReportRepositoryID);
	}

	/**
	* Sets the description of this vrcop production plant equipment.
	*
	* @param description the description of this vrcop production plant equipment
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_vrcopProductionPlantEquipment.setDescription(description);
	}

	/**
	* Sets the dossier ID of this vrcop production plant equipment.
	*
	* @param dossierId the dossier ID of this vrcop production plant equipment
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrcopProductionPlantEquipment.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vrcop production plant equipment.
	*
	* @param dossierIdCTN the dossier ID ctn of this vrcop production plant equipment
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrcopProductionPlantEquipment.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vrcop production plant equipment.
	*
	* @param dossierNo the dossier no of this vrcop production plant equipment
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrcopProductionPlantEquipment.setDossierNo(dossierNo);
	}

	/**
	* Sets the equipment code of this vrcop production plant equipment.
	*
	* @param equipmentCode the equipment code of this vrcop production plant equipment
	*/
	@Override
	public void setEquipmentCode(java.lang.String equipmentCode) {
		_vrcopProductionPlantEquipment.setEquipmentCode(equipmentCode);
	}

	/**
	* Sets the equipment name of this vrcop production plant equipment.
	*
	* @param equipmentName the equipment name of this vrcop production plant equipment
	*/
	@Override
	public void setEquipmentName(java.lang.String equipmentName) {
		_vrcopProductionPlantEquipment.setEquipmentName(equipmentName);
	}

	/**
	* Sets the equipment serial no of this vrcop production plant equipment.
	*
	* @param equipmentSerialNo the equipment serial no of this vrcop production plant equipment
	*/
	@Override
	public void setEquipmentSerialNo(java.lang.String equipmentSerialNo) {
		_vrcopProductionPlantEquipment.setEquipmentSerialNo(equipmentSerialNo);
	}

	/**
	* Sets the equipment status of this vrcop production plant equipment.
	*
	* @param equipmentStatus the equipment status of this vrcop production plant equipment
	*/
	@Override
	public void setEquipmentStatus(java.lang.String equipmentStatus) {
		_vrcopProductionPlantEquipment.setEquipmentStatus(equipmentStatus);
	}

	/**
	* Sets the equipment type of this vrcop production plant equipment.
	*
	* @param equipmentType the equipment type of this vrcop production plant equipment
	*/
	@Override
	public void setEquipmentType(java.lang.String equipmentType) {
		_vrcopProductionPlantEquipment.setEquipmentType(equipmentType);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrcopProductionPlantEquipment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrcopProductionPlantEquipment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrcopProductionPlantEquipment.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the expire date of this vrcop production plant equipment.
	*
	* @param expireDate the expire date of this vrcop production plant equipment
	*/
	@Override
	public void setExpireDate(Date expireDate) {
		_vrcopProductionPlantEquipment.setExpireDate(expireDate);
	}

	/**
	* Sets the expired date of this vrcop production plant equipment.
	*
	* @param expiredDate the expired date of this vrcop production plant equipment
	*/
	@Override
	public void setExpiredDate(Date expiredDate) {
		_vrcopProductionPlantEquipment.setExpiredDate(expiredDate);
	}

	/**
	* Sets the expired status of this vrcop production plant equipment.
	*
	* @param expiredStatus the expired status of this vrcop production plant equipment
	*/
	@Override
	public void setExpiredStatus(int expiredStatus) {
		_vrcopProductionPlantEquipment.setExpiredStatus(expiredStatus);
	}

	/**
	* Sets the ID of this vrcop production plant equipment.
	*
	* @param id the ID of this vrcop production plant equipment
	*/
	@Override
	public void setId(long id) {
		_vrcopProductionPlantEquipment.setId(id);
	}

	/**
	* Sets the inspection record date of this vrcop production plant equipment.
	*
	* @param inspectionRecordDate the inspection record date of this vrcop production plant equipment
	*/
	@Override
	public void setInspectionRecordDate(Date inspectionRecordDate) {
		_vrcopProductionPlantEquipment.setInspectionRecordDate(inspectionRecordDate);
	}

	/**
	* Sets the inspection record number of this vrcop production plant equipment.
	*
	* @param inspectionRecordNumber the inspection record number of this vrcop production plant equipment
	*/
	@Override
	public void setInspectionRecordNumber(
		java.lang.String inspectionRecordNumber) {
		_vrcopProductionPlantEquipment.setInspectionRecordNumber(inspectionRecordNumber);
	}

	/**
	* Sets the markup smrm of this vrcop production plant equipment.
	*
	* @param markupSMRM the markup smrm of this vrcop production plant equipment
	*/
	@Override
	public void setMarkupSMRM(long markupSMRM) {
		_vrcopProductionPlantEquipment.setMarkupSMRM(markupSMRM);
	}

	/**
	* Sets the markup xcg of this vrcop production plant equipment.
	*
	* @param markupXCG the markup xcg of this vrcop production plant equipment
	*/
	@Override
	public void setMarkupXCG(long markupXCG) {
		_vrcopProductionPlantEquipment.setMarkupXCG(markupXCG);
	}

	/**
	* Sets the markup xcgnk of this vrcop production plant equipment.
	*
	* @param markupXCGNK the markup xcgnk of this vrcop production plant equipment
	*/
	@Override
	public void setMarkupXCGNK(long markupXCGNK) {
		_vrcopProductionPlantEquipment.setMarkupXCGNK(markupXCGNK);
	}

	/**
	* Sets the markup xch of this vrcop production plant equipment.
	*
	* @param markupXCH the markup xch of this vrcop production plant equipment
	*/
	@Override
	public void setMarkupXCH(long markupXCH) {
		_vrcopProductionPlantEquipment.setMarkupXCH(markupXCH);
	}

	/**
	* Sets the markup xcn of this vrcop production plant equipment.
	*
	* @param markupXCN the markup xcn of this vrcop production plant equipment
	*/
	@Override
	public void setMarkupXCN(long markupXCN) {
		_vrcopProductionPlantEquipment.setMarkupXCN(markupXCN);
	}

	/**
	* Sets the markup xdd of this vrcop production plant equipment.
	*
	* @param markupXDD the markup xdd of this vrcop production plant equipment
	*/
	@Override
	public void setMarkupXDD(long markupXDD) {
		_vrcopProductionPlantEquipment.setMarkupXDD(markupXDD);
	}

	/**
	* Sets the markup xmy of this vrcop production plant equipment.
	*
	* @param markupXMY the markup xmy of this vrcop production plant equipment
	*/
	@Override
	public void setMarkupXMY(long markupXMY) {
		_vrcopProductionPlantEquipment.setMarkupXMY(markupXMY);
	}

	/**
	* Sets the model code of this vrcop production plant equipment.
	*
	* @param modelCode the model code of this vrcop production plant equipment
	*/
	@Override
	public void setModelCode(java.lang.String modelCode) {
		_vrcopProductionPlantEquipment.setModelCode(modelCode);
	}

	/**
	* Sets the modify date of this vrcop production plant equipment.
	*
	* @param modifyDate the modify date of this vrcop production plant equipment
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrcopProductionPlantEquipment.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vrcop production plant equipment.
	*
	* @param mtCore the mt core of this vrcop production plant equipment
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrcopProductionPlantEquipment.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrcopProductionPlantEquipment.setNew(n);
	}

	/**
	* Sets the notes of this vrcop production plant equipment.
	*
	* @param notes the notes of this vrcop production plant equipment
	*/
	@Override
	public void setNotes(java.lang.String notes) {
		_vrcopProductionPlantEquipment.setNotes(notes);
	}

	/**
	* Sets the primary key of this vrcop production plant equipment.
	*
	* @param primaryKey the primary key of this vrcop production plant equipment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrcopProductionPlantEquipment.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrcopProductionPlantEquipment.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the production country code of this vrcop production plant equipment.
	*
	* @param productionCountryCode the production country code of this vrcop production plant equipment
	*/
	@Override
	public void setProductionCountryCode(java.lang.String productionCountryCode) {
		_vrcopProductionPlantEquipment.setProductionCountryCode(productionCountryCode);
	}

	/**
	* Sets the production plant code of this vrcop production plant equipment.
	*
	* @param productionPlantCode the production plant code of this vrcop production plant equipment
	*/
	@Override
	public void setProductionPlantCode(java.lang.String productionPlantCode) {
		_vrcopProductionPlantEquipment.setProductionPlantCode(productionPlantCode);
	}

	/**
	* Sets the production plant ID of this vrcop production plant equipment.
	*
	* @param productionPlantId the production plant ID of this vrcop production plant equipment
	*/
	@Override
	public void setProductionPlantId(long productionPlantId) {
		_vrcopProductionPlantEquipment.setProductionPlantId(productionPlantId);
	}

	/**
	* Sets the production year of this vrcop production plant equipment.
	*
	* @param productionYear the production year of this vrcop production plant equipment
	*/
	@Override
	public void setProductionYear(java.lang.String productionYear) {
		_vrcopProductionPlantEquipment.setProductionYear(productionYear);
	}

	/**
	* Sets the registration year of this vrcop production plant equipment.
	*
	* @param registrationYear the registration year of this vrcop production plant equipment
	*/
	@Override
	public void setRegistrationYear(java.lang.String registrationYear) {
		_vrcopProductionPlantEquipment.setRegistrationYear(registrationYear);
	}

	/**
	* Sets the sequence no of this vrcop production plant equipment.
	*
	* @param sequenceNo the sequence no of this vrcop production plant equipment
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vrcopProductionPlantEquipment.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the stamp testing no of this vrcop production plant equipment.
	*
	* @param stampTestingNo the stamp testing no of this vrcop production plant equipment
	*/
	@Override
	public void setStampTestingNo(java.lang.String stampTestingNo) {
		_vrcopProductionPlantEquipment.setStampTestingNo(stampTestingNo);
	}

	/**
	* Sets the sync date of this vrcop production plant equipment.
	*
	* @param syncDate the sync date of this vrcop production plant equipment
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrcopProductionPlantEquipment.setSyncDate(syncDate);
	}

	/**
	* Sets the testing result of this vrcop production plant equipment.
	*
	* @param testingResult the testing result of this vrcop production plant equipment
	*/
	@Override
	public void setTestingResult(int testingResult) {
		_vrcopProductionPlantEquipment.setTestingResult(testingResult);
	}

	/**
	* Sets the trademark of this vrcop production plant equipment.
	*
	* @param trademark the trademark of this vrcop production plant equipment
	*/
	@Override
	public void setTrademark(java.lang.String trademark) {
		_vrcopProductionPlantEquipment.setTrademark(trademark);
	}

	/**
	* Sets the trademark name of this vrcop production plant equipment.
	*
	* @param trademarkName the trademark name of this vrcop production plant equipment
	*/
	@Override
	public void setTrademarkName(java.lang.String trademarkName) {
		_vrcopProductionPlantEquipment.setTrademarkName(trademarkName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPProductionPlantEquipmentWrapper)) {
			return false;
		}

		VRCOPProductionPlantEquipmentWrapper vrcopProductionPlantEquipmentWrapper =
			(VRCOPProductionPlantEquipmentWrapper)obj;

		if (Objects.equals(_vrcopProductionPlantEquipment,
					vrcopProductionPlantEquipmentWrapper._vrcopProductionPlantEquipment)) {
			return true;
		}

		return false;
	}

	@Override
	public VRCOPProductionPlantEquipment getWrappedModel() {
		return _vrcopProductionPlantEquipment;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrcopProductionPlantEquipment.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrcopProductionPlantEquipment.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrcopProductionPlantEquipment.resetOriginalValues();
	}

	private final VRCOPProductionPlantEquipment _vrcopProductionPlantEquipment;
}