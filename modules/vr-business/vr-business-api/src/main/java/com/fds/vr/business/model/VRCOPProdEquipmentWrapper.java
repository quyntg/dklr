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
 * This class is a wrapper for {@link VRCOPProdEquipment}.
 * </p>
 *
 * @author LamTV
 * @see VRCOPProdEquipment
 * @generated
 */
@ProviderType
public class VRCOPProdEquipmentWrapper implements VRCOPProdEquipment,
	ModelWrapper<VRCOPProdEquipment> {
	public VRCOPProdEquipmentWrapper(VRCOPProdEquipment vrcopProdEquipment) {
		_vrcopProdEquipment = vrcopProdEquipment;
	}

	@Override
	public Class<?> getModelClass() {
		return VRCOPProdEquipment.class;
	}

	@Override
	public String getModelClassName() {
		return VRCOPProdEquipment.class.getName();
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
		attributes.put("designSymbolNo", getDesignSymbolNo());
		attributes.put("productionCountryCode", getProductionCountryCode());
		attributes.put("equipmentStatus", getEquipmentStatus());
		attributes.put("notes", getNotes());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());
		attributes.put("quantity", getQuantity());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierIdCTN", getDossierIdCTN());
		attributes.put("dossierNo", getDossierNo());

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

		String designSymbolNo = (String)attributes.get("designSymbolNo");

		if (designSymbolNo != null) {
			setDesignSymbolNo(designSymbolNo);
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

		Integer quantity = (Integer)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
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
	}

	@Override
	public VRCOPProdEquipment toEscapedModel() {
		return new VRCOPProdEquipmentWrapper(_vrcopProdEquipment.toEscapedModel());
	}

	@Override
	public VRCOPProdEquipment toUnescapedModel() {
		return new VRCOPProdEquipmentWrapper(_vrcopProdEquipment.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrcopProdEquipment.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrcopProdEquipment.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrcopProdEquipment.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrcopProdEquipment.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRCOPProdEquipment> toCacheModel() {
		return _vrcopProdEquipment.toCacheModel();
	}

	@Override
	public int compareTo(VRCOPProdEquipment vrcopProdEquipment) {
		return _vrcopProdEquipment.compareTo(vrcopProdEquipment);
	}

	/**
	* Returns the quantity of this vrcop prod equipment.
	*
	* @return the quantity of this vrcop prod equipment
	*/
	@Override
	public int getQuantity() {
		return _vrcopProdEquipment.getQuantity();
	}

	@Override
	public int hashCode() {
		return _vrcopProdEquipment.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrcopProdEquipment.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRCOPProdEquipmentWrapper((VRCOPProdEquipment)_vrcopProdEquipment.clone());
	}

	/**
	* Returns the commercial name of this vrcop prod equipment.
	*
	* @return the commercial name of this vrcop prod equipment
	*/
	@Override
	public java.lang.String getCommercialName() {
		return _vrcopProdEquipment.getCommercialName();
	}

	/**
	* Returns the cop report no of this vrcop prod equipment.
	*
	* @return the cop report no of this vrcop prod equipment
	*/
	@Override
	public java.lang.String getCopReportNo() {
		return _vrcopProdEquipment.getCopReportNo();
	}

	/**
	* Returns the design symbol no of this vrcop prod equipment.
	*
	* @return the design symbol no of this vrcop prod equipment
	*/
	@Override
	public java.lang.String getDesignSymbolNo() {
		return _vrcopProdEquipment.getDesignSymbolNo();
	}

	/**
	* Returns the dossier ID ctn of this vrcop prod equipment.
	*
	* @return the dossier ID ctn of this vrcop prod equipment
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrcopProdEquipment.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vrcop prod equipment.
	*
	* @return the dossier no of this vrcop prod equipment
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrcopProdEquipment.getDossierNo();
	}

	/**
	* Returns the equipment code of this vrcop prod equipment.
	*
	* @return the equipment code of this vrcop prod equipment
	*/
	@Override
	public java.lang.String getEquipmentCode() {
		return _vrcopProdEquipment.getEquipmentCode();
	}

	/**
	* Returns the equipment name of this vrcop prod equipment.
	*
	* @return the equipment name of this vrcop prod equipment
	*/
	@Override
	public java.lang.String getEquipmentName() {
		return _vrcopProdEquipment.getEquipmentName();
	}

	/**
	* Returns the equipment status of this vrcop prod equipment.
	*
	* @return the equipment status of this vrcop prod equipment
	*/
	@Override
	public java.lang.String getEquipmentStatus() {
		return _vrcopProdEquipment.getEquipmentStatus();
	}

	/**
	* Returns the equipment type of this vrcop prod equipment.
	*
	* @return the equipment type of this vrcop prod equipment
	*/
	@Override
	public java.lang.String getEquipmentType() {
		return _vrcopProdEquipment.getEquipmentType();
	}

	/**
	* Returns the model code of this vrcop prod equipment.
	*
	* @return the model code of this vrcop prod equipment
	*/
	@Override
	public java.lang.String getModelCode() {
		return _vrcopProdEquipment.getModelCode();
	}

	/**
	* Returns the notes of this vrcop prod equipment.
	*
	* @return the notes of this vrcop prod equipment
	*/
	@Override
	public java.lang.String getNotes() {
		return _vrcopProdEquipment.getNotes();
	}

	/**
	* Returns the production country code of this vrcop prod equipment.
	*
	* @return the production country code of this vrcop prod equipment
	*/
	@Override
	public java.lang.String getProductionCountryCode() {
		return _vrcopProdEquipment.getProductionCountryCode();
	}

	/**
	* Returns the trademark of this vrcop prod equipment.
	*
	* @return the trademark of this vrcop prod equipment
	*/
	@Override
	public java.lang.String getTrademark() {
		return _vrcopProdEquipment.getTrademark();
	}

	/**
	* Returns the trademark name of this vrcop prod equipment.
	*
	* @return the trademark name of this vrcop prod equipment
	*/
	@Override
	public java.lang.String getTrademarkName() {
		return _vrcopProdEquipment.getTrademarkName();
	}

	@Override
	public java.lang.String toString() {
		return _vrcopProdEquipment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrcopProdEquipment.toXmlString();
	}

	/**
	* Returns the modify date of this vrcop prod equipment.
	*
	* @return the modify date of this vrcop prod equipment
	*/
	@Override
	public Date getModifyDate() {
		return _vrcopProdEquipment.getModifyDate();
	}

	/**
	* Returns the sync date of this vrcop prod equipment.
	*
	* @return the sync date of this vrcop prod equipment
	*/
	@Override
	public Date getSyncDate() {
		return _vrcopProdEquipment.getSyncDate();
	}

	/**
	* Returns the cop report repository ID of this vrcop prod equipment.
	*
	* @return the cop report repository ID of this vrcop prod equipment
	*/
	@Override
	public long getCopReportRepositoryID() {
		return _vrcopProdEquipment.getCopReportRepositoryID();
	}

	/**
	* Returns the dossier ID of this vrcop prod equipment.
	*
	* @return the dossier ID of this vrcop prod equipment
	*/
	@Override
	public long getDossierId() {
		return _vrcopProdEquipment.getDossierId();
	}

	/**
	* Returns the ID of this vrcop prod equipment.
	*
	* @return the ID of this vrcop prod equipment
	*/
	@Override
	public long getId() {
		return _vrcopProdEquipment.getId();
	}

	/**
	* Returns the mt core of this vrcop prod equipment.
	*
	* @return the mt core of this vrcop prod equipment
	*/
	@Override
	public long getMtCore() {
		return _vrcopProdEquipment.getMtCore();
	}

	/**
	* Returns the primary key of this vrcop prod equipment.
	*
	* @return the primary key of this vrcop prod equipment
	*/
	@Override
	public long getPrimaryKey() {
		return _vrcopProdEquipment.getPrimaryKey();
	}

	/**
	* Returns the sequence no of this vrcop prod equipment.
	*
	* @return the sequence no of this vrcop prod equipment
	*/
	@Override
	public long getSequenceNo() {
		return _vrcopProdEquipment.getSequenceNo();
	}

	@Override
	public void persist() {
		_vrcopProdEquipment.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrcopProdEquipment.setCachedModel(cachedModel);
	}

	/**
	* Sets the commercial name of this vrcop prod equipment.
	*
	* @param commercialName the commercial name of this vrcop prod equipment
	*/
	@Override
	public void setCommercialName(java.lang.String commercialName) {
		_vrcopProdEquipment.setCommercialName(commercialName);
	}

	/**
	* Sets the cop report no of this vrcop prod equipment.
	*
	* @param copReportNo the cop report no of this vrcop prod equipment
	*/
	@Override
	public void setCopReportNo(java.lang.String copReportNo) {
		_vrcopProdEquipment.setCopReportNo(copReportNo);
	}

	/**
	* Sets the cop report repository ID of this vrcop prod equipment.
	*
	* @param copReportRepositoryID the cop report repository ID of this vrcop prod equipment
	*/
	@Override
	public void setCopReportRepositoryID(long copReportRepositoryID) {
		_vrcopProdEquipment.setCopReportRepositoryID(copReportRepositoryID);
	}

	/**
	* Sets the design symbol no of this vrcop prod equipment.
	*
	* @param designSymbolNo the design symbol no of this vrcop prod equipment
	*/
	@Override
	public void setDesignSymbolNo(java.lang.String designSymbolNo) {
		_vrcopProdEquipment.setDesignSymbolNo(designSymbolNo);
	}

	/**
	* Sets the dossier ID of this vrcop prod equipment.
	*
	* @param dossierId the dossier ID of this vrcop prod equipment
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrcopProdEquipment.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vrcop prod equipment.
	*
	* @param dossierIdCTN the dossier ID ctn of this vrcop prod equipment
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrcopProdEquipment.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vrcop prod equipment.
	*
	* @param dossierNo the dossier no of this vrcop prod equipment
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrcopProdEquipment.setDossierNo(dossierNo);
	}

	/**
	* Sets the equipment code of this vrcop prod equipment.
	*
	* @param equipmentCode the equipment code of this vrcop prod equipment
	*/
	@Override
	public void setEquipmentCode(java.lang.String equipmentCode) {
		_vrcopProdEquipment.setEquipmentCode(equipmentCode);
	}

	/**
	* Sets the equipment name of this vrcop prod equipment.
	*
	* @param equipmentName the equipment name of this vrcop prod equipment
	*/
	@Override
	public void setEquipmentName(java.lang.String equipmentName) {
		_vrcopProdEquipment.setEquipmentName(equipmentName);
	}

	/**
	* Sets the equipment status of this vrcop prod equipment.
	*
	* @param equipmentStatus the equipment status of this vrcop prod equipment
	*/
	@Override
	public void setEquipmentStatus(java.lang.String equipmentStatus) {
		_vrcopProdEquipment.setEquipmentStatus(equipmentStatus);
	}

	/**
	* Sets the equipment type of this vrcop prod equipment.
	*
	* @param equipmentType the equipment type of this vrcop prod equipment
	*/
	@Override
	public void setEquipmentType(java.lang.String equipmentType) {
		_vrcopProdEquipment.setEquipmentType(equipmentType);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrcopProdEquipment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrcopProdEquipment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrcopProdEquipment.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vrcop prod equipment.
	*
	* @param id the ID of this vrcop prod equipment
	*/
	@Override
	public void setId(long id) {
		_vrcopProdEquipment.setId(id);
	}

	/**
	* Sets the model code of this vrcop prod equipment.
	*
	* @param modelCode the model code of this vrcop prod equipment
	*/
	@Override
	public void setModelCode(java.lang.String modelCode) {
		_vrcopProdEquipment.setModelCode(modelCode);
	}

	/**
	* Sets the modify date of this vrcop prod equipment.
	*
	* @param modifyDate the modify date of this vrcop prod equipment
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrcopProdEquipment.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vrcop prod equipment.
	*
	* @param mtCore the mt core of this vrcop prod equipment
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrcopProdEquipment.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrcopProdEquipment.setNew(n);
	}

	/**
	* Sets the notes of this vrcop prod equipment.
	*
	* @param notes the notes of this vrcop prod equipment
	*/
	@Override
	public void setNotes(java.lang.String notes) {
		_vrcopProdEquipment.setNotes(notes);
	}

	/**
	* Sets the primary key of this vrcop prod equipment.
	*
	* @param primaryKey the primary key of this vrcop prod equipment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrcopProdEquipment.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrcopProdEquipment.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the production country code of this vrcop prod equipment.
	*
	* @param productionCountryCode the production country code of this vrcop prod equipment
	*/
	@Override
	public void setProductionCountryCode(java.lang.String productionCountryCode) {
		_vrcopProdEquipment.setProductionCountryCode(productionCountryCode);
	}

	/**
	* Sets the quantity of this vrcop prod equipment.
	*
	* @param quantity the quantity of this vrcop prod equipment
	*/
	@Override
	public void setQuantity(int quantity) {
		_vrcopProdEquipment.setQuantity(quantity);
	}

	/**
	* Sets the sequence no of this vrcop prod equipment.
	*
	* @param sequenceNo the sequence no of this vrcop prod equipment
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vrcopProdEquipment.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the sync date of this vrcop prod equipment.
	*
	* @param syncDate the sync date of this vrcop prod equipment
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrcopProdEquipment.setSyncDate(syncDate);
	}

	/**
	* Sets the trademark of this vrcop prod equipment.
	*
	* @param trademark the trademark of this vrcop prod equipment
	*/
	@Override
	public void setTrademark(java.lang.String trademark) {
		_vrcopProdEquipment.setTrademark(trademark);
	}

	/**
	* Sets the trademark name of this vrcop prod equipment.
	*
	* @param trademarkName the trademark name of this vrcop prod equipment
	*/
	@Override
	public void setTrademarkName(java.lang.String trademarkName) {
		_vrcopProdEquipment.setTrademarkName(trademarkName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPProdEquipmentWrapper)) {
			return false;
		}

		VRCOPProdEquipmentWrapper vrcopProdEquipmentWrapper = (VRCOPProdEquipmentWrapper)obj;

		if (Objects.equals(_vrcopProdEquipment,
					vrcopProdEquipmentWrapper._vrcopProdEquipment)) {
			return true;
		}

		return false;
	}

	@Override
	public VRCOPProdEquipment getWrappedModel() {
		return _vrcopProdEquipment;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrcopProdEquipment.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrcopProdEquipment.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrcopProdEquipment.resetOriginalValues();
	}

	private final VRCOPProdEquipment _vrcopProdEquipment;
}