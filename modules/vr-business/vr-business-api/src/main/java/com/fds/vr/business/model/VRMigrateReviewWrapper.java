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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VRMigrateReview}.
 * </p>
 *
 * @author LamTV
 * @see VRMigrateReview
 * @generated
 */
@ProviderType
public class VRMigrateReviewWrapper implements VRMigrateReview,
	ModelWrapper<VRMigrateReview> {
	public VRMigrateReviewWrapper(VRMigrateReview vrMigrateReview) {
		_vrMigrateReview = vrMigrateReview;
	}

	@Override
	public Class<?> getModelClass() {
		return VRMigrateReview.class;
	}

	@Override
	public String getModelClassName() {
		return VRMigrateReview.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("dataGroupID", getDataGroupID());
		attributes.put("migrateTableName", getMigrateTableName());
		attributes.put("migrationConfiguration", getMigrationConfiguration());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("taskMigrationID", getTaskMigrationID());
		attributes.put("migrateRows", getMigrateRows());
		attributes.put("migrateRemarks", getMigrateRemarks());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer dataGroupID = (Integer)attributes.get("dataGroupID");

		if (dataGroupID != null) {
			setDataGroupID(dataGroupID);
		}

		String migrateTableName = (String)attributes.get("migrateTableName");

		if (migrateTableName != null) {
			setMigrateTableName(migrateTableName);
		}

		String migrationConfiguration = (String)attributes.get(
				"migrationConfiguration");

		if (migrationConfiguration != null) {
			setMigrationConfiguration(migrationConfiguration);
		}

		Integer sequenceNo = (Integer)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		Integer taskMigrationID = (Integer)attributes.get("taskMigrationID");

		if (taskMigrationID != null) {
			setTaskMigrationID(taskMigrationID);
		}

		String migrateRows = (String)attributes.get("migrateRows");

		if (migrateRows != null) {
			setMigrateRows(migrateRows);
		}

		String migrateRemarks = (String)attributes.get("migrateRemarks");

		if (migrateRemarks != null) {
			setMigrateRemarks(migrateRemarks);
		}
	}

	@Override
	public VRMigrateReview toEscapedModel() {
		return new VRMigrateReviewWrapper(_vrMigrateReview.toEscapedModel());
	}

	@Override
	public VRMigrateReview toUnescapedModel() {
		return new VRMigrateReviewWrapper(_vrMigrateReview.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrMigrateReview.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrMigrateReview.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrMigrateReview.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrMigrateReview.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRMigrateReview> toCacheModel() {
		return _vrMigrateReview.toCacheModel();
	}

	@Override
	public int compareTo(VRMigrateReview vrMigrateReview) {
		return _vrMigrateReview.compareTo(vrMigrateReview);
	}

	/**
	* Returns the data group ID of this vr migrate review.
	*
	* @return the data group ID of this vr migrate review
	*/
	@Override
	public int getDataGroupID() {
		return _vrMigrateReview.getDataGroupID();
	}

	/**
	* Returns the sequence no of this vr migrate review.
	*
	* @return the sequence no of this vr migrate review
	*/
	@Override
	public int getSequenceNo() {
		return _vrMigrateReview.getSequenceNo();
	}

	/**
	* Returns the task migration ID of this vr migrate review.
	*
	* @return the task migration ID of this vr migrate review
	*/
	@Override
	public int getTaskMigrationID() {
		return _vrMigrateReview.getTaskMigrationID();
	}

	@Override
	public int hashCode() {
		return _vrMigrateReview.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrMigrateReview.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRMigrateReviewWrapper((VRMigrateReview)_vrMigrateReview.clone());
	}

	/**
	* Returns the migrate remarks of this vr migrate review.
	*
	* @return the migrate remarks of this vr migrate review
	*/
	@Override
	public java.lang.String getMigrateRemarks() {
		return _vrMigrateReview.getMigrateRemarks();
	}

	/**
	* Returns the migrate rows of this vr migrate review.
	*
	* @return the migrate rows of this vr migrate review
	*/
	@Override
	public java.lang.String getMigrateRows() {
		return _vrMigrateReview.getMigrateRows();
	}

	/**
	* Returns the migrate table name of this vr migrate review.
	*
	* @return the migrate table name of this vr migrate review
	*/
	@Override
	public java.lang.String getMigrateTableName() {
		return _vrMigrateReview.getMigrateTableName();
	}

	/**
	* Returns the migration configuration of this vr migrate review.
	*
	* @return the migration configuration of this vr migrate review
	*/
	@Override
	public java.lang.String getMigrationConfiguration() {
		return _vrMigrateReview.getMigrationConfiguration();
	}

	@Override
	public java.lang.String toString() {
		return _vrMigrateReview.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrMigrateReview.toXmlString();
	}

	/**
	* Returns the ID of this vr migrate review.
	*
	* @return the ID of this vr migrate review
	*/
	@Override
	public long getId() {
		return _vrMigrateReview.getId();
	}

	/**
	* Returns the primary key of this vr migrate review.
	*
	* @return the primary key of this vr migrate review
	*/
	@Override
	public long getPrimaryKey() {
		return _vrMigrateReview.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vrMigrateReview.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrMigrateReview.setCachedModel(cachedModel);
	}

	/**
	* Sets the data group ID of this vr migrate review.
	*
	* @param dataGroupID the data group ID of this vr migrate review
	*/
	@Override
	public void setDataGroupID(int dataGroupID) {
		_vrMigrateReview.setDataGroupID(dataGroupID);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrMigrateReview.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrMigrateReview.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrMigrateReview.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr migrate review.
	*
	* @param id the ID of this vr migrate review
	*/
	@Override
	public void setId(long id) {
		_vrMigrateReview.setId(id);
	}

	/**
	* Sets the migrate remarks of this vr migrate review.
	*
	* @param migrateRemarks the migrate remarks of this vr migrate review
	*/
	@Override
	public void setMigrateRemarks(java.lang.String migrateRemarks) {
		_vrMigrateReview.setMigrateRemarks(migrateRemarks);
	}

	/**
	* Sets the migrate rows of this vr migrate review.
	*
	* @param migrateRows the migrate rows of this vr migrate review
	*/
	@Override
	public void setMigrateRows(java.lang.String migrateRows) {
		_vrMigrateReview.setMigrateRows(migrateRows);
	}

	/**
	* Sets the migrate table name of this vr migrate review.
	*
	* @param migrateTableName the migrate table name of this vr migrate review
	*/
	@Override
	public void setMigrateTableName(java.lang.String migrateTableName) {
		_vrMigrateReview.setMigrateTableName(migrateTableName);
	}

	/**
	* Sets the migration configuration of this vr migrate review.
	*
	* @param migrationConfiguration the migration configuration of this vr migrate review
	*/
	@Override
	public void setMigrationConfiguration(
		java.lang.String migrationConfiguration) {
		_vrMigrateReview.setMigrationConfiguration(migrationConfiguration);
	}

	@Override
	public void setNew(boolean n) {
		_vrMigrateReview.setNew(n);
	}

	/**
	* Sets the primary key of this vr migrate review.
	*
	* @param primaryKey the primary key of this vr migrate review
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrMigrateReview.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrMigrateReview.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sequence no of this vr migrate review.
	*
	* @param sequenceNo the sequence no of this vr migrate review
	*/
	@Override
	public void setSequenceNo(int sequenceNo) {
		_vrMigrateReview.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the task migration ID of this vr migrate review.
	*
	* @param taskMigrationID the task migration ID of this vr migrate review
	*/
	@Override
	public void setTaskMigrationID(int taskMigrationID) {
		_vrMigrateReview.setTaskMigrationID(taskMigrationID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRMigrateReviewWrapper)) {
			return false;
		}

		VRMigrateReviewWrapper vrMigrateReviewWrapper = (VRMigrateReviewWrapper)obj;

		if (Objects.equals(_vrMigrateReview,
					vrMigrateReviewWrapper._vrMigrateReview)) {
			return true;
		}

		return false;
	}

	@Override
	public VRMigrateReview getWrappedModel() {
		return _vrMigrateReview;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrMigrateReview.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrMigrateReview.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrMigrateReview.resetOriginalValues();
	}

	private final VRMigrateReview _vrMigrateReview;
}