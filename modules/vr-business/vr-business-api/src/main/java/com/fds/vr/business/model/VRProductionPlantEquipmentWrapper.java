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
 * This class is a wrapper for {@link VRProductionPlantEquipment}.
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantEquipment
 * @generated
 */
@ProviderType
public class VRProductionPlantEquipmentWrapper
	implements VRProductionPlantEquipment,
		ModelWrapper<VRProductionPlantEquipment> {
	public VRProductionPlantEquipmentWrapper(
		VRProductionPlantEquipment vrProductionPlantEquipment) {
		_vrProductionPlantEquipment = vrProductionPlantEquipment;
	}

	@Override
	public Class<?> getModelClass() {
		return VRProductionPlantEquipment.class;
	}

	@Override
	public String getModelClassName() {
		return VRProductionPlantEquipment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
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
		attributes.put("stampTestingNo", getStampTestingNo());
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

		String stampTestingNo = (String)attributes.get("stampTestingNo");

		if (stampTestingNo != null) {
			setStampTestingNo(stampTestingNo);
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
	public VRProductionPlantEquipment toEscapedModel() {
		return new VRProductionPlantEquipmentWrapper(_vrProductionPlantEquipment.toEscapedModel());
	}

	@Override
	public VRProductionPlantEquipment toUnescapedModel() {
		return new VRProductionPlantEquipmentWrapper(_vrProductionPlantEquipment.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrProductionPlantEquipment.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrProductionPlantEquipment.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrProductionPlantEquipment.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrProductionPlantEquipment.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRProductionPlantEquipment> toCacheModel() {
		return _vrProductionPlantEquipment.toCacheModel();
	}

	@Override
	public int compareTo(VRProductionPlantEquipment vrProductionPlantEquipment) {
		return _vrProductionPlantEquipment.compareTo(vrProductionPlantEquipment);
	}

	/**
	* Returns the testing result of this vr production plant equipment.
	*
	* @return the testing result of this vr production plant equipment
	*/
	@Override
	public int getTestingResult() {
		return _vrProductionPlantEquipment.getTestingResult();
	}

	@Override
	public int hashCode() {
		return _vrProductionPlantEquipment.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrProductionPlantEquipment.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRProductionPlantEquipmentWrapper((VRProductionPlantEquipment)_vrProductionPlantEquipment.clone());
	}

	/**
	* Returns the commercial name of this vr production plant equipment.
	*
	* @return the commercial name of this vr production plant equipment
	*/
	@Override
	public java.lang.String getCommercialName() {
		return _vrProductionPlantEquipment.getCommercialName();
	}

	/**
	* Returns the description of this vr production plant equipment.
	*
	* @return the description of this vr production plant equipment
	*/
	@Override
	public java.lang.String getDescription() {
		return _vrProductionPlantEquipment.getDescription();
	}

	/**
	* Returns the equipment code of this vr production plant equipment.
	*
	* @return the equipment code of this vr production plant equipment
	*/
	@Override
	public java.lang.String getEquipmentCode() {
		return _vrProductionPlantEquipment.getEquipmentCode();
	}

	/**
	* Returns the equipment name of this vr production plant equipment.
	*
	* @return the equipment name of this vr production plant equipment
	*/
	@Override
	public java.lang.String getEquipmentName() {
		return _vrProductionPlantEquipment.getEquipmentName();
	}

	/**
	* Returns the equipment serial no of this vr production plant equipment.
	*
	* @return the equipment serial no of this vr production plant equipment
	*/
	@Override
	public java.lang.String getEquipmentSerialNo() {
		return _vrProductionPlantEquipment.getEquipmentSerialNo();
	}

	/**
	* Returns the equipment status of this vr production plant equipment.
	*
	* @return the equipment status of this vr production plant equipment
	*/
	@Override
	public java.lang.String getEquipmentStatus() {
		return _vrProductionPlantEquipment.getEquipmentStatus();
	}

	/**
	* Returns the equipment type of this vr production plant equipment.
	*
	* @return the equipment type of this vr production plant equipment
	*/
	@Override
	public java.lang.String getEquipmentType() {
		return _vrProductionPlantEquipment.getEquipmentType();
	}

	/**
	* Returns the inspection record number of this vr production plant equipment.
	*
	* @return the inspection record number of this vr production plant equipment
	*/
	@Override
	public java.lang.String getInspectionRecordNumber() {
		return _vrProductionPlantEquipment.getInspectionRecordNumber();
	}

	/**
	* Returns the model code of this vr production plant equipment.
	*
	* @return the model code of this vr production plant equipment
	*/
	@Override
	public java.lang.String getModelCode() {
		return _vrProductionPlantEquipment.getModelCode();
	}

	/**
	* Returns the notes of this vr production plant equipment.
	*
	* @return the notes of this vr production plant equipment
	*/
	@Override
	public java.lang.String getNotes() {
		return _vrProductionPlantEquipment.getNotes();
	}

	/**
	* Returns the production country code of this vr production plant equipment.
	*
	* @return the production country code of this vr production plant equipment
	*/
	@Override
	public java.lang.String getProductionCountryCode() {
		return _vrProductionPlantEquipment.getProductionCountryCode();
	}

	/**
	* Returns the production plant code of this vr production plant equipment.
	*
	* @return the production plant code of this vr production plant equipment
	*/
	@Override
	public java.lang.String getProductionPlantCode() {
		return _vrProductionPlantEquipment.getProductionPlantCode();
	}

	/**
	* Returns the production year of this vr production plant equipment.
	*
	* @return the production year of this vr production plant equipment
	*/
	@Override
	public java.lang.String getProductionYear() {
		return _vrProductionPlantEquipment.getProductionYear();
	}

	/**
	* Returns the registration year of this vr production plant equipment.
	*
	* @return the registration year of this vr production plant equipment
	*/
	@Override
	public java.lang.String getRegistrationYear() {
		return _vrProductionPlantEquipment.getRegistrationYear();
	}

	/**
	* Returns the stamp testing no of this vr production plant equipment.
	*
	* @return the stamp testing no of this vr production plant equipment
	*/
	@Override
	public java.lang.String getStampTestingNo() {
		return _vrProductionPlantEquipment.getStampTestingNo();
	}

	/**
	* Returns the trademark of this vr production plant equipment.
	*
	* @return the trademark of this vr production plant equipment
	*/
	@Override
	public java.lang.String getTrademark() {
		return _vrProductionPlantEquipment.getTrademark();
	}

	/**
	* Returns the trademark name of this vr production plant equipment.
	*
	* @return the trademark name of this vr production plant equipment
	*/
	@Override
	public java.lang.String getTrademarkName() {
		return _vrProductionPlantEquipment.getTrademarkName();
	}

	@Override
	public java.lang.String toString() {
		return _vrProductionPlantEquipment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrProductionPlantEquipment.toXmlString();
	}

	/**
	* Returns the expire date of this vr production plant equipment.
	*
	* @return the expire date of this vr production plant equipment
	*/
	@Override
	public Date getExpireDate() {
		return _vrProductionPlantEquipment.getExpireDate();
	}

	/**
	* Returns the inspection record date of this vr production plant equipment.
	*
	* @return the inspection record date of this vr production plant equipment
	*/
	@Override
	public Date getInspectionRecordDate() {
		return _vrProductionPlantEquipment.getInspectionRecordDate();
	}

	/**
	* Returns the modify date of this vr production plant equipment.
	*
	* @return the modify date of this vr production plant equipment
	*/
	@Override
	public Date getModifyDate() {
		return _vrProductionPlantEquipment.getModifyDate();
	}

	/**
	* Returns the sync date of this vr production plant equipment.
	*
	* @return the sync date of this vr production plant equipment
	*/
	@Override
	public Date getSyncDate() {
		return _vrProductionPlantEquipment.getSyncDate();
	}

	/**
	* Returns the ID of this vr production plant equipment.
	*
	* @return the ID of this vr production plant equipment
	*/
	@Override
	public long getId() {
		return _vrProductionPlantEquipment.getId();
	}

	/**
	* Returns the markup smrm of this vr production plant equipment.
	*
	* @return the markup smrm of this vr production plant equipment
	*/
	@Override
	public long getMarkupSMRM() {
		return _vrProductionPlantEquipment.getMarkupSMRM();
	}

	/**
	* Returns the markup xcg of this vr production plant equipment.
	*
	* @return the markup xcg of this vr production plant equipment
	*/
	@Override
	public long getMarkupXCG() {
		return _vrProductionPlantEquipment.getMarkupXCG();
	}

	/**
	* Returns the markup xcgnk of this vr production plant equipment.
	*
	* @return the markup xcgnk of this vr production plant equipment
	*/
	@Override
	public long getMarkupXCGNK() {
		return _vrProductionPlantEquipment.getMarkupXCGNK();
	}

	/**
	* Returns the markup xch of this vr production plant equipment.
	*
	* @return the markup xch of this vr production plant equipment
	*/
	@Override
	public long getMarkupXCH() {
		return _vrProductionPlantEquipment.getMarkupXCH();
	}

	/**
	* Returns the markup xcn of this vr production plant equipment.
	*
	* @return the markup xcn of this vr production plant equipment
	*/
	@Override
	public long getMarkupXCN() {
		return _vrProductionPlantEquipment.getMarkupXCN();
	}

	/**
	* Returns the markup xdd of this vr production plant equipment.
	*
	* @return the markup xdd of this vr production plant equipment
	*/
	@Override
	public long getMarkupXDD() {
		return _vrProductionPlantEquipment.getMarkupXDD();
	}

	/**
	* Returns the markup xmy of this vr production plant equipment.
	*
	* @return the markup xmy of this vr production plant equipment
	*/
	@Override
	public long getMarkupXMY() {
		return _vrProductionPlantEquipment.getMarkupXMY();
	}

	/**
	* Returns the mt core of this vr production plant equipment.
	*
	* @return the mt core of this vr production plant equipment
	*/
	@Override
	public long getMtCore() {
		return _vrProductionPlantEquipment.getMtCore();
	}

	/**
	* Returns the primary key of this vr production plant equipment.
	*
	* @return the primary key of this vr production plant equipment
	*/
	@Override
	public long getPrimaryKey() {
		return _vrProductionPlantEquipment.getPrimaryKey();
	}

	/**
	* Returns the production plant ID of this vr production plant equipment.
	*
	* @return the production plant ID of this vr production plant equipment
	*/
	@Override
	public long getProductionPlantId() {
		return _vrProductionPlantEquipment.getProductionPlantId();
	}

	/**
	* Returns the sequence no of this vr production plant equipment.
	*
	* @return the sequence no of this vr production plant equipment
	*/
	@Override
	public long getSequenceNo() {
		return _vrProductionPlantEquipment.getSequenceNo();
	}

	@Override
	public void persist() {
		_vrProductionPlantEquipment.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrProductionPlantEquipment.setCachedModel(cachedModel);
	}

	/**
	* Sets the commercial name of this vr production plant equipment.
	*
	* @param commercialName the commercial name of this vr production plant equipment
	*/
	@Override
	public void setCommercialName(java.lang.String commercialName) {
		_vrProductionPlantEquipment.setCommercialName(commercialName);
	}

	/**
	* Sets the description of this vr production plant equipment.
	*
	* @param description the description of this vr production plant equipment
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_vrProductionPlantEquipment.setDescription(description);
	}

	/**
	* Sets the equipment code of this vr production plant equipment.
	*
	* @param equipmentCode the equipment code of this vr production plant equipment
	*/
	@Override
	public void setEquipmentCode(java.lang.String equipmentCode) {
		_vrProductionPlantEquipment.setEquipmentCode(equipmentCode);
	}

	/**
	* Sets the equipment name of this vr production plant equipment.
	*
	* @param equipmentName the equipment name of this vr production plant equipment
	*/
	@Override
	public void setEquipmentName(java.lang.String equipmentName) {
		_vrProductionPlantEquipment.setEquipmentName(equipmentName);
	}

	/**
	* Sets the equipment serial no of this vr production plant equipment.
	*
	* @param equipmentSerialNo the equipment serial no of this vr production plant equipment
	*/
	@Override
	public void setEquipmentSerialNo(java.lang.String equipmentSerialNo) {
		_vrProductionPlantEquipment.setEquipmentSerialNo(equipmentSerialNo);
	}

	/**
	* Sets the equipment status of this vr production plant equipment.
	*
	* @param equipmentStatus the equipment status of this vr production plant equipment
	*/
	@Override
	public void setEquipmentStatus(java.lang.String equipmentStatus) {
		_vrProductionPlantEquipment.setEquipmentStatus(equipmentStatus);
	}

	/**
	* Sets the equipment type of this vr production plant equipment.
	*
	* @param equipmentType the equipment type of this vr production plant equipment
	*/
	@Override
	public void setEquipmentType(java.lang.String equipmentType) {
		_vrProductionPlantEquipment.setEquipmentType(equipmentType);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrProductionPlantEquipment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrProductionPlantEquipment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrProductionPlantEquipment.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the expire date of this vr production plant equipment.
	*
	* @param expireDate the expire date of this vr production plant equipment
	*/
	@Override
	public void setExpireDate(Date expireDate) {
		_vrProductionPlantEquipment.setExpireDate(expireDate);
	}

	/**
	* Sets the ID of this vr production plant equipment.
	*
	* @param id the ID of this vr production plant equipment
	*/
	@Override
	public void setId(long id) {
		_vrProductionPlantEquipment.setId(id);
	}

	/**
	* Sets the inspection record date of this vr production plant equipment.
	*
	* @param inspectionRecordDate the inspection record date of this vr production plant equipment
	*/
	@Override
	public void setInspectionRecordDate(Date inspectionRecordDate) {
		_vrProductionPlantEquipment.setInspectionRecordDate(inspectionRecordDate);
	}

	/**
	* Sets the inspection record number of this vr production plant equipment.
	*
	* @param inspectionRecordNumber the inspection record number of this vr production plant equipment
	*/
	@Override
	public void setInspectionRecordNumber(
		java.lang.String inspectionRecordNumber) {
		_vrProductionPlantEquipment.setInspectionRecordNumber(inspectionRecordNumber);
	}

	/**
	* Sets the markup smrm of this vr production plant equipment.
	*
	* @param markupSMRM the markup smrm of this vr production plant equipment
	*/
	@Override
	public void setMarkupSMRM(long markupSMRM) {
		_vrProductionPlantEquipment.setMarkupSMRM(markupSMRM);
	}

	/**
	* Sets the markup xcg of this vr production plant equipment.
	*
	* @param markupXCG the markup xcg of this vr production plant equipment
	*/
	@Override
	public void setMarkupXCG(long markupXCG) {
		_vrProductionPlantEquipment.setMarkupXCG(markupXCG);
	}

	/**
	* Sets the markup xcgnk of this vr production plant equipment.
	*
	* @param markupXCGNK the markup xcgnk of this vr production plant equipment
	*/
	@Override
	public void setMarkupXCGNK(long markupXCGNK) {
		_vrProductionPlantEquipment.setMarkupXCGNK(markupXCGNK);
	}

	/**
	* Sets the markup xch of this vr production plant equipment.
	*
	* @param markupXCH the markup xch of this vr production plant equipment
	*/
	@Override
	public void setMarkupXCH(long markupXCH) {
		_vrProductionPlantEquipment.setMarkupXCH(markupXCH);
	}

	/**
	* Sets the markup xcn of this vr production plant equipment.
	*
	* @param markupXCN the markup xcn of this vr production plant equipment
	*/
	@Override
	public void setMarkupXCN(long markupXCN) {
		_vrProductionPlantEquipment.setMarkupXCN(markupXCN);
	}

	/**
	* Sets the markup xdd of this vr production plant equipment.
	*
	* @param markupXDD the markup xdd of this vr production plant equipment
	*/
	@Override
	public void setMarkupXDD(long markupXDD) {
		_vrProductionPlantEquipment.setMarkupXDD(markupXDD);
	}

	/**
	* Sets the markup xmy of this vr production plant equipment.
	*
	* @param markupXMY the markup xmy of this vr production plant equipment
	*/
	@Override
	public void setMarkupXMY(long markupXMY) {
		_vrProductionPlantEquipment.setMarkupXMY(markupXMY);
	}

	/**
	* Sets the model code of this vr production plant equipment.
	*
	* @param modelCode the model code of this vr production plant equipment
	*/
	@Override
	public void setModelCode(java.lang.String modelCode) {
		_vrProductionPlantEquipment.setModelCode(modelCode);
	}

	/**
	* Sets the modify date of this vr production plant equipment.
	*
	* @param modifyDate the modify date of this vr production plant equipment
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrProductionPlantEquipment.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr production plant equipment.
	*
	* @param mtCore the mt core of this vr production plant equipment
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrProductionPlantEquipment.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrProductionPlantEquipment.setNew(n);
	}

	/**
	* Sets the notes of this vr production plant equipment.
	*
	* @param notes the notes of this vr production plant equipment
	*/
	@Override
	public void setNotes(java.lang.String notes) {
		_vrProductionPlantEquipment.setNotes(notes);
	}

	/**
	* Sets the primary key of this vr production plant equipment.
	*
	* @param primaryKey the primary key of this vr production plant equipment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrProductionPlantEquipment.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrProductionPlantEquipment.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the production country code of this vr production plant equipment.
	*
	* @param productionCountryCode the production country code of this vr production plant equipment
	*/
	@Override
	public void setProductionCountryCode(java.lang.String productionCountryCode) {
		_vrProductionPlantEquipment.setProductionCountryCode(productionCountryCode);
	}

	/**
	* Sets the production plant code of this vr production plant equipment.
	*
	* @param productionPlantCode the production plant code of this vr production plant equipment
	*/
	@Override
	public void setProductionPlantCode(java.lang.String productionPlantCode) {
		_vrProductionPlantEquipment.setProductionPlantCode(productionPlantCode);
	}

	/**
	* Sets the production plant ID of this vr production plant equipment.
	*
	* @param productionPlantId the production plant ID of this vr production plant equipment
	*/
	@Override
	public void setProductionPlantId(long productionPlantId) {
		_vrProductionPlantEquipment.setProductionPlantId(productionPlantId);
	}

	/**
	* Sets the production year of this vr production plant equipment.
	*
	* @param productionYear the production year of this vr production plant equipment
	*/
	@Override
	public void setProductionYear(java.lang.String productionYear) {
		_vrProductionPlantEquipment.setProductionYear(productionYear);
	}

	/**
	* Sets the registration year of this vr production plant equipment.
	*
	* @param registrationYear the registration year of this vr production plant equipment
	*/
	@Override
	public void setRegistrationYear(java.lang.String registrationYear) {
		_vrProductionPlantEquipment.setRegistrationYear(registrationYear);
	}

	/**
	* Sets the sequence no of this vr production plant equipment.
	*
	* @param sequenceNo the sequence no of this vr production plant equipment
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vrProductionPlantEquipment.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the stamp testing no of this vr production plant equipment.
	*
	* @param stampTestingNo the stamp testing no of this vr production plant equipment
	*/
	@Override
	public void setStampTestingNo(java.lang.String stampTestingNo) {
		_vrProductionPlantEquipment.setStampTestingNo(stampTestingNo);
	}

	/**
	* Sets the sync date of this vr production plant equipment.
	*
	* @param syncDate the sync date of this vr production plant equipment
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrProductionPlantEquipment.setSyncDate(syncDate);
	}

	/**
	* Sets the testing result of this vr production plant equipment.
	*
	* @param testingResult the testing result of this vr production plant equipment
	*/
	@Override
	public void setTestingResult(int testingResult) {
		_vrProductionPlantEquipment.setTestingResult(testingResult);
	}

	/**
	* Sets the trademark of this vr production plant equipment.
	*
	* @param trademark the trademark of this vr production plant equipment
	*/
	@Override
	public void setTrademark(java.lang.String trademark) {
		_vrProductionPlantEquipment.setTrademark(trademark);
	}

	/**
	* Sets the trademark name of this vr production plant equipment.
	*
	* @param trademarkName the trademark name of this vr production plant equipment
	*/
	@Override
	public void setTrademarkName(java.lang.String trademarkName) {
		_vrProductionPlantEquipment.setTrademarkName(trademarkName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRProductionPlantEquipmentWrapper)) {
			return false;
		}

		VRProductionPlantEquipmentWrapper vrProductionPlantEquipmentWrapper = (VRProductionPlantEquipmentWrapper)obj;

		if (Objects.equals(_vrProductionPlantEquipment,
					vrProductionPlantEquipmentWrapper._vrProductionPlantEquipment)) {
			return true;
		}

		return false;
	}

	@Override
	public VRProductionPlantEquipment getWrappedModel() {
		return _vrProductionPlantEquipment;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrProductionPlantEquipment.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrProductionPlantEquipment.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrProductionPlantEquipment.resetOriginalValues();
	}

	private final VRProductionPlantEquipment _vrProductionPlantEquipment;
}