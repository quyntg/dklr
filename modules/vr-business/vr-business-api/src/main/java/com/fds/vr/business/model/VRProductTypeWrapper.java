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
 * This class is a wrapper for {@link VRProductType}.
 * </p>
 *
 * @author LamTV
 * @see VRProductType
 * @generated
 */
@ProviderType
public class VRProductTypeWrapper implements VRProductType,
	ModelWrapper<VRProductType> {
	public VRProductTypeWrapper(VRProductType vrProductType) {
		_vrProductType = vrProductType;
	}

	@Override
	public Class<?> getModelClass() {
		return VRProductType.class;
	}

	@Override
	public String getModelClassName() {
		return VRProductType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("vehicleClass", getVehicleClass());
		attributes.put("vehicleTypeCode", getVehicleTypeCode());
		attributes.put("vehicleTypeDescription", getVehicleTypeDescription());
		attributes.put("productClassificationCode",
			getProductClassificationCode());
		attributes.put("productClassificationDescription",
			getProductClassificationDescription());
		attributes.put("trademark", getTrademark());
		attributes.put("trademarkName", getTrademarkName());
		attributes.put("commercialName", getCommercialName());
		attributes.put("modelCode", getModelCode());
		attributes.put("designSymbolNo", getDesignSymbolNo());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());
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

		String vehicleClass = (String)attributes.get("vehicleClass");

		if (vehicleClass != null) {
			setVehicleClass(vehicleClass);
		}

		String vehicleTypeCode = (String)attributes.get("vehicleTypeCode");

		if (vehicleTypeCode != null) {
			setVehicleTypeCode(vehicleTypeCode);
		}

		String vehicleTypeDescription = (String)attributes.get(
				"vehicleTypeDescription");

		if (vehicleTypeDescription != null) {
			setVehicleTypeDescription(vehicleTypeDescription);
		}

		String productClassificationCode = (String)attributes.get(
				"productClassificationCode");

		if (productClassificationCode != null) {
			setProductClassificationCode(productClassificationCode);
		}

		String productClassificationDescription = (String)attributes.get(
				"productClassificationDescription");

		if (productClassificationDescription != null) {
			setProductClassificationDescription(productClassificationDescription);
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

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
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
	public VRProductType toEscapedModel() {
		return new VRProductTypeWrapper(_vrProductType.toEscapedModel());
	}

	@Override
	public VRProductType toUnescapedModel() {
		return new VRProductTypeWrapper(_vrProductType.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrProductType.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrProductType.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrProductType.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrProductType.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRProductType> toCacheModel() {
		return _vrProductType.toCacheModel();
	}

	@Override
	public int compareTo(VRProductType vrProductType) {
		return _vrProductType.compareTo(vrProductType);
	}

	@Override
	public int hashCode() {
		return _vrProductType.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrProductType.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRProductTypeWrapper((VRProductType)_vrProductType.clone());
	}

	/**
	* Returns the commercial name of this vr product type.
	*
	* @return the commercial name of this vr product type
	*/
	@Override
	public java.lang.String getCommercialName() {
		return _vrProductType.getCommercialName();
	}

	/**
	* Returns the design symbol no of this vr product type.
	*
	* @return the design symbol no of this vr product type
	*/
	@Override
	public java.lang.String getDesignSymbolNo() {
		return _vrProductType.getDesignSymbolNo();
	}

	/**
	* Returns the model code of this vr product type.
	*
	* @return the model code of this vr product type
	*/
	@Override
	public java.lang.String getModelCode() {
		return _vrProductType.getModelCode();
	}

	/**
	* Returns the product classification code of this vr product type.
	*
	* @return the product classification code of this vr product type
	*/
	@Override
	public java.lang.String getProductClassificationCode() {
		return _vrProductType.getProductClassificationCode();
	}

	/**
	* Returns the product classification description of this vr product type.
	*
	* @return the product classification description of this vr product type
	*/
	@Override
	public java.lang.String getProductClassificationDescription() {
		return _vrProductType.getProductClassificationDescription();
	}

	/**
	* Returns the production plant code of this vr product type.
	*
	* @return the production plant code of this vr product type
	*/
	@Override
	public java.lang.String getProductionPlantCode() {
		return _vrProductType.getProductionPlantCode();
	}

	/**
	* Returns the trademark of this vr product type.
	*
	* @return the trademark of this vr product type
	*/
	@Override
	public java.lang.String getTrademark() {
		return _vrProductType.getTrademark();
	}

	/**
	* Returns the trademark name of this vr product type.
	*
	* @return the trademark name of this vr product type
	*/
	@Override
	public java.lang.String getTrademarkName() {
		return _vrProductType.getTrademarkName();
	}

	/**
	* Returns the vehicle class of this vr product type.
	*
	* @return the vehicle class of this vr product type
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _vrProductType.getVehicleClass();
	}

	/**
	* Returns the vehicle type code of this vr product type.
	*
	* @return the vehicle type code of this vr product type
	*/
	@Override
	public java.lang.String getVehicleTypeCode() {
		return _vrProductType.getVehicleTypeCode();
	}

	/**
	* Returns the vehicle type description of this vr product type.
	*
	* @return the vehicle type description of this vr product type
	*/
	@Override
	public java.lang.String getVehicleTypeDescription() {
		return _vrProductType.getVehicleTypeDescription();
	}

	@Override
	public java.lang.String toString() {
		return _vrProductType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrProductType.toXmlString();
	}

	/**
	* Returns the modify date of this vr product type.
	*
	* @return the modify date of this vr product type
	*/
	@Override
	public Date getModifyDate() {
		return _vrProductType.getModifyDate();
	}

	/**
	* Returns the sync date of this vr product type.
	*
	* @return the sync date of this vr product type
	*/
	@Override
	public Date getSyncDate() {
		return _vrProductType.getSyncDate();
	}

	/**
	* Returns the ID of this vr product type.
	*
	* @return the ID of this vr product type
	*/
	@Override
	public long getId() {
		return _vrProductType.getId();
	}

	/**
	* Returns the mt core of this vr product type.
	*
	* @return the mt core of this vr product type
	*/
	@Override
	public long getMtCore() {
		return _vrProductType.getMtCore();
	}

	/**
	* Returns the primary key of this vr product type.
	*
	* @return the primary key of this vr product type
	*/
	@Override
	public long getPrimaryKey() {
		return _vrProductType.getPrimaryKey();
	}

	/**
	* Returns the production plant ID of this vr product type.
	*
	* @return the production plant ID of this vr product type
	*/
	@Override
	public long getProductionPlantId() {
		return _vrProductType.getProductionPlantId();
	}

	/**
	* Returns the sequence no of this vr product type.
	*
	* @return the sequence no of this vr product type
	*/
	@Override
	public long getSequenceNo() {
		return _vrProductType.getSequenceNo();
	}

	@Override
	public void persist() {
		_vrProductType.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrProductType.setCachedModel(cachedModel);
	}

	/**
	* Sets the commercial name of this vr product type.
	*
	* @param commercialName the commercial name of this vr product type
	*/
	@Override
	public void setCommercialName(java.lang.String commercialName) {
		_vrProductType.setCommercialName(commercialName);
	}

	/**
	* Sets the design symbol no of this vr product type.
	*
	* @param designSymbolNo the design symbol no of this vr product type
	*/
	@Override
	public void setDesignSymbolNo(java.lang.String designSymbolNo) {
		_vrProductType.setDesignSymbolNo(designSymbolNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrProductType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrProductType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrProductType.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr product type.
	*
	* @param id the ID of this vr product type
	*/
	@Override
	public void setId(long id) {
		_vrProductType.setId(id);
	}

	/**
	* Sets the model code of this vr product type.
	*
	* @param modelCode the model code of this vr product type
	*/
	@Override
	public void setModelCode(java.lang.String modelCode) {
		_vrProductType.setModelCode(modelCode);
	}

	/**
	* Sets the modify date of this vr product type.
	*
	* @param modifyDate the modify date of this vr product type
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrProductType.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr product type.
	*
	* @param mtCore the mt core of this vr product type
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrProductType.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrProductType.setNew(n);
	}

	/**
	* Sets the primary key of this vr product type.
	*
	* @param primaryKey the primary key of this vr product type
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrProductType.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrProductType.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product classification code of this vr product type.
	*
	* @param productClassificationCode the product classification code of this vr product type
	*/
	@Override
	public void setProductClassificationCode(
		java.lang.String productClassificationCode) {
		_vrProductType.setProductClassificationCode(productClassificationCode);
	}

	/**
	* Sets the product classification description of this vr product type.
	*
	* @param productClassificationDescription the product classification description of this vr product type
	*/
	@Override
	public void setProductClassificationDescription(
		java.lang.String productClassificationDescription) {
		_vrProductType.setProductClassificationDescription(productClassificationDescription);
	}

	/**
	* Sets the production plant code of this vr product type.
	*
	* @param productionPlantCode the production plant code of this vr product type
	*/
	@Override
	public void setProductionPlantCode(java.lang.String productionPlantCode) {
		_vrProductType.setProductionPlantCode(productionPlantCode);
	}

	/**
	* Sets the production plant ID of this vr product type.
	*
	* @param productionPlantId the production plant ID of this vr product type
	*/
	@Override
	public void setProductionPlantId(long productionPlantId) {
		_vrProductType.setProductionPlantId(productionPlantId);
	}

	/**
	* Sets the sequence no of this vr product type.
	*
	* @param sequenceNo the sequence no of this vr product type
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vrProductType.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the sync date of this vr product type.
	*
	* @param syncDate the sync date of this vr product type
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrProductType.setSyncDate(syncDate);
	}

	/**
	* Sets the trademark of this vr product type.
	*
	* @param trademark the trademark of this vr product type
	*/
	@Override
	public void setTrademark(java.lang.String trademark) {
		_vrProductType.setTrademark(trademark);
	}

	/**
	* Sets the trademark name of this vr product type.
	*
	* @param trademarkName the trademark name of this vr product type
	*/
	@Override
	public void setTrademarkName(java.lang.String trademarkName) {
		_vrProductType.setTrademarkName(trademarkName);
	}

	/**
	* Sets the vehicle class of this vr product type.
	*
	* @param vehicleClass the vehicle class of this vr product type
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_vrProductType.setVehicleClass(vehicleClass);
	}

	/**
	* Sets the vehicle type code of this vr product type.
	*
	* @param vehicleTypeCode the vehicle type code of this vr product type
	*/
	@Override
	public void setVehicleTypeCode(java.lang.String vehicleTypeCode) {
		_vrProductType.setVehicleTypeCode(vehicleTypeCode);
	}

	/**
	* Sets the vehicle type description of this vr product type.
	*
	* @param vehicleTypeDescription the vehicle type description of this vr product type
	*/
	@Override
	public void setVehicleTypeDescription(
		java.lang.String vehicleTypeDescription) {
		_vrProductType.setVehicleTypeDescription(vehicleTypeDescription);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRProductTypeWrapper)) {
			return false;
		}

		VRProductTypeWrapper vrProductTypeWrapper = (VRProductTypeWrapper)obj;

		if (Objects.equals(_vrProductType, vrProductTypeWrapper._vrProductType)) {
			return true;
		}

		return false;
	}

	@Override
	public VRProductType getWrappedModel() {
		return _vrProductType;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrProductType.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrProductType.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrProductType.resetOriginalValues();
	}

	private final VRProductType _vrProductType;
}