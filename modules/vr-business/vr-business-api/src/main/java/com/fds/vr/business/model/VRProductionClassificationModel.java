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
 * The base model interface for the VRProductionClassification service. Represents a row in the &quot;vr_productclassification&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRProductionClassificationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRProductionClassificationImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRProductionClassification
 * @see com.fds.vr.business.model.impl.VRProductionClassificationImpl
 * @see com.fds.vr.business.model.impl.VRProductionClassificationModelImpl
 * @generated
 */
@ProviderType
public interface VRProductionClassificationModel extends BaseModel<VRProductionClassification> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vr production classification model instance should use the {@link VRProductionClassification} interface instead.
	 */

	/**
	 * Returns the primary key of this vr production classification.
	 *
	 * @return the primary key of this vr production classification
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vr production classification.
	 *
	 * @param primaryKey the primary key of this vr production classification
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vr production classification.
	 *
	 * @return the ID of this vr production classification
	 */
	public long getId();

	/**
	 * Sets the ID of this vr production classification.
	 *
	 * @param id the ID of this vr production classification
	 */
	public void setId(long id);

	/**
	 * Returns the mt core of this vr production classification.
	 *
	 * @return the mt core of this vr production classification
	 */
	public long getMtCore();

	/**
	 * Sets the mt core of this vr production classification.
	 *
	 * @param mtCore the mt core of this vr production classification
	 */
	public void setMtCore(long mtCore);

	/**
	 * Returns the applicant profile ID of this vr production classification.
	 *
	 * @return the applicant profile ID of this vr production classification
	 */
	public long getApplicantProfileId();

	/**
	 * Sets the applicant profile ID of this vr production classification.
	 *
	 * @param applicantProfileId the applicant profile ID of this vr production classification
	 */
	public void setApplicantProfileId(long applicantProfileId);

	/**
	 * Returns the applicant code of this vr production classification.
	 *
	 * @return the applicant code of this vr production classification
	 */
	@AutoEscape
	public String getApplicantCode();

	/**
	 * Sets the applicant code of this vr production classification.
	 *
	 * @param applicantCode the applicant code of this vr production classification
	 */
	public void setApplicantCode(String applicantCode);

	/**
	 * Returns the production plant ID of this vr production classification.
	 *
	 * @return the production plant ID of this vr production classification
	 */
	public long getProductionPlantId();

	/**
	 * Sets the production plant ID of this vr production classification.
	 *
	 * @param productionPlantId the production plant ID of this vr production classification
	 */
	public void setProductionPlantId(long productionPlantId);

	/**
	 * Returns the production plant code of this vr production classification.
	 *
	 * @return the production plant code of this vr production classification
	 */
	@AutoEscape
	public String getProductionPlantCode();

	/**
	 * Sets the production plant code of this vr production classification.
	 *
	 * @param productionPlantCode the production plant code of this vr production classification
	 */
	public void setProductionPlantCode(String productionPlantCode);

	/**
	 * Returns the sequence no of this vr production classification.
	 *
	 * @return the sequence no of this vr production classification
	 */
	public int getSequenceNo();

	/**
	 * Sets the sequence no of this vr production classification.
	 *
	 * @param sequenceNo the sequence no of this vr production classification
	 */
	public void setSequenceNo(int sequenceNo);

	/**
	 * Returns the product classification code of this vr production classification.
	 *
	 * @return the product classification code of this vr production classification
	 */
	@AutoEscape
	public String getProductClassificationCode();

	/**
	 * Sets the product classification code of this vr production classification.
	 *
	 * @param productClassificationCode the product classification code of this vr production classification
	 */
	public void setProductClassificationCode(String productClassificationCode);

	/**
	 * Returns the product classification description of this vr production classification.
	 *
	 * @return the product classification description of this vr production classification
	 */
	@AutoEscape
	public String getProductClassificationDescription();

	/**
	 * Sets the product classification description of this vr production classification.
	 *
	 * @param productClassificationDescription the product classification description of this vr production classification
	 */
	public void setProductClassificationDescription(
		String productClassificationDescription);

	/**
	 * Returns the classification mode of this vr production classification.
	 *
	 * @return the classification mode of this vr production classification
	 */
	@AutoEscape
	public String getClassificationMode();

	/**
	 * Sets the classification mode of this vr production classification.
	 *
	 * @param classificationMode the classification mode of this vr production classification
	 */
	public void setClassificationMode(String classificationMode);

	/**
	 * Returns the remarks of this vr production classification.
	 *
	 * @return the remarks of this vr production classification
	 */
	@AutoEscape
	public String getRemarks();

	/**
	 * Sets the remarks of this vr production classification.
	 *
	 * @param remarks the remarks of this vr production classification
	 */
	public void setRemarks(String remarks);

	/**
	 * Returns the status of this vr production classification.
	 *
	 * @return the status of this vr production classification
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this vr production classification.
	 *
	 * @param status the status of this vr production classification
	 */
	public void setStatus(String status);

	/**
	 * Returns the modify date of this vr production classification.
	 *
	 * @return the modify date of this vr production classification
	 */
	public Date getModifyDate();

	/**
	 * Sets the modify date of this vr production classification.
	 *
	 * @param modifyDate the modify date of this vr production classification
	 */
	public void setModifyDate(Date modifyDate);

	/**
	 * Returns the sync date of this vr production classification.
	 *
	 * @return the sync date of this vr production classification
	 */
	public Date getSyncDate();

	/**
	 * Sets the sync date of this vr production classification.
	 *
	 * @param syncDate the sync date of this vr production classification
	 */
	public void setSyncDate(Date syncDate);

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
	public int compareTo(VRProductionClassification vrProductionClassification);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRProductionClassification> toCacheModel();

	@Override
	public VRProductionClassification toEscapedModel();

	@Override
	public VRProductionClassification toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}