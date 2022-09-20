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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the VRProductType service. Represents a row in the &quot;vr_producttype&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRProductTypeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRProductTypeImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRProductType
 * @see com.fds.vr.business.model.impl.VRProductTypeImpl
 * @see com.fds.vr.business.model.impl.VRProductTypeModelImpl
 * @generated
 */
@ProviderType
public interface VRProductTypeModel extends BaseModel<VRProductType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vr product type model instance should use the {@link VRProductType} interface instead.
	 */

	/**
	 * Returns the primary key of this vr product type.
	 *
	 * @return the primary key of this vr product type
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vr product type.
	 *
	 * @param primaryKey the primary key of this vr product type
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vr product type.
	 *
	 * @return the ID of this vr product type
	 */
	public long getId();

	/**
	 * Sets the ID of this vr product type.
	 *
	 * @param id the ID of this vr product type
	 */
	public void setId(long id);

	/**
	 * Returns the mt core of this vr product type.
	 *
	 * @return the mt core of this vr product type
	 */
	public long getMtCore();

	/**
	 * Sets the mt core of this vr product type.
	 *
	 * @param mtCore the mt core of this vr product type
	 */
	public void setMtCore(long mtCore);

	/**
	 * Returns the sequence no of this vr product type.
	 *
	 * @return the sequence no of this vr product type
	 */
	public long getSequenceNo();

	/**
	 * Sets the sequence no of this vr product type.
	 *
	 * @param sequenceNo the sequence no of this vr product type
	 */
	public void setSequenceNo(long sequenceNo);

	/**
	 * Returns the vehicle class of this vr product type.
	 *
	 * @return the vehicle class of this vr product type
	 */
	@AutoEscape
	public String getVehicleClass();

	/**
	 * Sets the vehicle class of this vr product type.
	 *
	 * @param vehicleClass the vehicle class of this vr product type
	 */
	public void setVehicleClass(String vehicleClass);

	/**
	 * Returns the vehicle type code of this vr product type.
	 *
	 * @return the vehicle type code of this vr product type
	 */
	@AutoEscape
	public String getVehicleTypeCode();

	/**
	 * Sets the vehicle type code of this vr product type.
	 *
	 * @param vehicleTypeCode the vehicle type code of this vr product type
	 */
	public void setVehicleTypeCode(String vehicleTypeCode);

	/**
	 * Returns the vehicle type description of this vr product type.
	 *
	 * @return the vehicle type description of this vr product type
	 */
	@AutoEscape
	public String getVehicleTypeDescription();

	/**
	 * Sets the vehicle type description of this vr product type.
	 *
	 * @param vehicleTypeDescription the vehicle type description of this vr product type
	 */
	public void setVehicleTypeDescription(String vehicleTypeDescription);

	/**
	 * Returns the product classification code of this vr product type.
	 *
	 * @return the product classification code of this vr product type
	 */
	@AutoEscape
	public String getProductClassificationCode();

	/**
	 * Sets the product classification code of this vr product type.
	 *
	 * @param productClassificationCode the product classification code of this vr product type
	 */
	public void setProductClassificationCode(String productClassificationCode);

	/**
	 * Returns the product classification description of this vr product type.
	 *
	 * @return the product classification description of this vr product type
	 */
	@AutoEscape
	public String getProductClassificationDescription();

	/**
	 * Sets the product classification description of this vr product type.
	 *
	 * @param productClassificationDescription the product classification description of this vr product type
	 */
	public void setProductClassificationDescription(
		String productClassificationDescription);

	/**
	 * Returns the trademark of this vr product type.
	 *
	 * @return the trademark of this vr product type
	 */
	@AutoEscape
	public String getTrademark();

	/**
	 * Sets the trademark of this vr product type.
	 *
	 * @param trademark the trademark of this vr product type
	 */
	public void setTrademark(String trademark);

	/**
	 * Returns the trademark name of this vr product type.
	 *
	 * @return the trademark name of this vr product type
	 */
	@AutoEscape
	public String getTrademarkName();

	/**
	 * Sets the trademark name of this vr product type.
	 *
	 * @param trademarkName the trademark name of this vr product type
	 */
	public void setTrademarkName(String trademarkName);

	/**
	 * Returns the commercial name of this vr product type.
	 *
	 * @return the commercial name of this vr product type
	 */
	@AutoEscape
	public String getCommercialName();

	/**
	 * Sets the commercial name of this vr product type.
	 *
	 * @param commercialName the commercial name of this vr product type
	 */
	public void setCommercialName(String commercialName);

	/**
	 * Returns the model code of this vr product type.
	 *
	 * @return the model code of this vr product type
	 */
	@AutoEscape
	public String getModelCode();

	/**
	 * Sets the model code of this vr product type.
	 *
	 * @param modelCode the model code of this vr product type
	 */
	public void setModelCode(String modelCode);

	/**
	 * Returns the design symbol no of this vr product type.
	 *
	 * @return the design symbol no of this vr product type
	 */
	@AutoEscape
	public String getDesignSymbolNo();

	/**
	 * Sets the design symbol no of this vr product type.
	 *
	 * @param designSymbolNo the design symbol no of this vr product type
	 */
	public void setDesignSymbolNo(String designSymbolNo);

	/**
	 * Returns the modify date of this vr product type.
	 *
	 * @return the modify date of this vr product type
	 */
	public Date getModifyDate();

	/**
	 * Sets the modify date of this vr product type.
	 *
	 * @param modifyDate the modify date of this vr product type
	 */
	public void setModifyDate(Date modifyDate);

	/**
	 * Returns the sync date of this vr product type.
	 *
	 * @return the sync date of this vr product type
	 */
	public Date getSyncDate();

	/**
	 * Sets the sync date of this vr product type.
	 *
	 * @param syncDate the sync date of this vr product type
	 */
	public void setSyncDate(Date syncDate);

	/**
	 * Returns the production plant ID of this vr product type.
	 *
	 * @return the production plant ID of this vr product type
	 */
	public long getProductionPlantId();

	/**
	 * Sets the production plant ID of this vr product type.
	 *
	 * @param productionPlantId the production plant ID of this vr product type
	 */
	public void setProductionPlantId(long productionPlantId);

	/**
	 * Returns the production plant code of this vr product type.
	 *
	 * @return the production plant code of this vr product type
	 */
	@AutoEscape
	public String getProductionPlantCode();

	/**
	 * Sets the production plant code of this vr product type.
	 *
	 * @param productionPlantCode the production plant code of this vr product type
	 */
	public void setProductionPlantCode(String productionPlantCode);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(VRProductType vrProductType);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRProductType> toCacheModel();

	@Override
	public VRProductType toEscapedModel();

	@Override
	public VRProductType toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}