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
 * This class is a wrapper for {@link VRMigrateMappings}.
 * </p>
 *
 * @author LamTV
 * @see VRMigrateMappings
 * @generated
 */
@ProviderType
public class VRMigrateMappingsWrapper implements VRMigrateMappings,
	ModelWrapper<VRMigrateMappings> {
	public VRMigrateMappingsWrapper(VRMigrateMappings vrMigrateMappings) {
		_vrMigrateMappings = vrMigrateMappings;
	}

	@Override
	public Class<?> getModelClass() {
		return VRMigrateMappings.class;
	}

	@Override
	public String getModelClassName() {
		return VRMigrateMappings.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("dataGroupId", getDataGroupId());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("migrateTableName", getMigrateTableName());
		attributes.put("dataItemID", getDataItemID());
		attributes.put("itemCode", getItemCode());
		attributes.put("itemName", getItemName());
		attributes.put("itemShortName", getItemShortName());
		attributes.put("itemDescription", getItemDescription());
		attributes.put("code_0", getCode_0());
		attributes.put("code_1", getCode_1());
		attributes.put("code_2", getCode_2());
		attributes.put("code_3", getCode_3());
		attributes.put("level", getLevel());
		attributes.put("seqNo", getSeqNo());
		attributes.put("markedAsRestore", getMarkedAsRestore());
		attributes.put("markedAsDelete", getMarkedAsDelete());
		attributes.put("alterCollectionCode", getAlterCollectionCode());
		attributes.put("alterItemCode", getAlterItemCode());
		attributes.put("alterItemName", getAlterItemName());
		attributes.put("alterGroupCode", getAlterGroupCode());
		attributes.put("alterLevel", getAlterLevel());
		attributes.put("taskMigrationID", getTaskMigrationID());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer dataGroupId = (Integer)attributes.get("dataGroupId");

		if (dataGroupId != null) {
			setDataGroupId(dataGroupId);
		}

		Integer sequenceNo = (Integer)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String migrateTableName = (String)attributes.get("migrateTableName");

		if (migrateTableName != null) {
			setMigrateTableName(migrateTableName);
		}

		Integer dataItemID = (Integer)attributes.get("dataItemID");

		if (dataItemID != null) {
			setDataItemID(dataItemID);
		}

		String itemCode = (String)attributes.get("itemCode");

		if (itemCode != null) {
			setItemCode(itemCode);
		}

		String itemName = (String)attributes.get("itemName");

		if (itemName != null) {
			setItemName(itemName);
		}

		String itemShortName = (String)attributes.get("itemShortName");

		if (itemShortName != null) {
			setItemShortName(itemShortName);
		}

		String itemDescription = (String)attributes.get("itemDescription");

		if (itemDescription != null) {
			setItemDescription(itemDescription);
		}

		String code_0 = (String)attributes.get("code_0");

		if (code_0 != null) {
			setCode_0(code_0);
		}

		String code_1 = (String)attributes.get("code_1");

		if (code_1 != null) {
			setCode_1(code_1);
		}

		String code_2 = (String)attributes.get("code_2");

		if (code_2 != null) {
			setCode_2(code_2);
		}

		String code_3 = (String)attributes.get("code_3");

		if (code_3 != null) {
			setCode_3(code_3);
		}

		Integer level = (Integer)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}

		Integer seqNo = (Integer)attributes.get("seqNo");

		if (seqNo != null) {
			setSeqNo(seqNo);
		}

		Integer markedAsRestore = (Integer)attributes.get("markedAsRestore");

		if (markedAsRestore != null) {
			setMarkedAsRestore(markedAsRestore);
		}

		Integer markedAsDelete = (Integer)attributes.get("markedAsDelete");

		if (markedAsDelete != null) {
			setMarkedAsDelete(markedAsDelete);
		}

		String alterCollectionCode = (String)attributes.get(
				"alterCollectionCode");

		if (alterCollectionCode != null) {
			setAlterCollectionCode(alterCollectionCode);
		}

		String alterItemCode = (String)attributes.get("alterItemCode");

		if (alterItemCode != null) {
			setAlterItemCode(alterItemCode);
		}

		String alterItemName = (String)attributes.get("alterItemName");

		if (alterItemName != null) {
			setAlterItemName(alterItemName);
		}

		String alterGroupCode = (String)attributes.get("alterGroupCode");

		if (alterGroupCode != null) {
			setAlterGroupCode(alterGroupCode);
		}

		String alterLevel = (String)attributes.get("alterLevel");

		if (alterLevel != null) {
			setAlterLevel(alterLevel);
		}

		Integer taskMigrationID = (Integer)attributes.get("taskMigrationID");

		if (taskMigrationID != null) {
			setTaskMigrationID(taskMigrationID);
		}
	}

	@Override
	public VRMigrateMappings toEscapedModel() {
		return new VRMigrateMappingsWrapper(_vrMigrateMappings.toEscapedModel());
	}

	@Override
	public VRMigrateMappings toUnescapedModel() {
		return new VRMigrateMappingsWrapper(_vrMigrateMappings.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrMigrateMappings.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrMigrateMappings.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrMigrateMappings.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrMigrateMappings.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRMigrateMappings> toCacheModel() {
		return _vrMigrateMappings.toCacheModel();
	}

	@Override
	public int compareTo(VRMigrateMappings vrMigrateMappings) {
		return _vrMigrateMappings.compareTo(vrMigrateMappings);
	}

	/**
	* Returns the data group ID of this vr migrate mappings.
	*
	* @return the data group ID of this vr migrate mappings
	*/
	@Override
	public int getDataGroupId() {
		return _vrMigrateMappings.getDataGroupId();
	}

	/**
	* Returns the data item ID of this vr migrate mappings.
	*
	* @return the data item ID of this vr migrate mappings
	*/
	@Override
	public int getDataItemID() {
		return _vrMigrateMappings.getDataItemID();
	}

	/**
	* Returns the level of this vr migrate mappings.
	*
	* @return the level of this vr migrate mappings
	*/
	@Override
	public int getLevel() {
		return _vrMigrateMappings.getLevel();
	}

	/**
	* Returns the marked as delete of this vr migrate mappings.
	*
	* @return the marked as delete of this vr migrate mappings
	*/
	@Override
	public int getMarkedAsDelete() {
		return _vrMigrateMappings.getMarkedAsDelete();
	}

	/**
	* Returns the marked as restore of this vr migrate mappings.
	*
	* @return the marked as restore of this vr migrate mappings
	*/
	@Override
	public int getMarkedAsRestore() {
		return _vrMigrateMappings.getMarkedAsRestore();
	}

	/**
	* Returns the seq no of this vr migrate mappings.
	*
	* @return the seq no of this vr migrate mappings
	*/
	@Override
	public int getSeqNo() {
		return _vrMigrateMappings.getSeqNo();
	}

	/**
	* Returns the sequence no of this vr migrate mappings.
	*
	* @return the sequence no of this vr migrate mappings
	*/
	@Override
	public int getSequenceNo() {
		return _vrMigrateMappings.getSequenceNo();
	}

	/**
	* Returns the task migration ID of this vr migrate mappings.
	*
	* @return the task migration ID of this vr migrate mappings
	*/
	@Override
	public int getTaskMigrationID() {
		return _vrMigrateMappings.getTaskMigrationID();
	}

	@Override
	public int hashCode() {
		return _vrMigrateMappings.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrMigrateMappings.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRMigrateMappingsWrapper((VRMigrateMappings)_vrMigrateMappings.clone());
	}

	/**
	* Returns the alter collection code of this vr migrate mappings.
	*
	* @return the alter collection code of this vr migrate mappings
	*/
	@Override
	public java.lang.String getAlterCollectionCode() {
		return _vrMigrateMappings.getAlterCollectionCode();
	}

	/**
	* Returns the alter group code of this vr migrate mappings.
	*
	* @return the alter group code of this vr migrate mappings
	*/
	@Override
	public java.lang.String getAlterGroupCode() {
		return _vrMigrateMappings.getAlterGroupCode();
	}

	/**
	* Returns the alter item code of this vr migrate mappings.
	*
	* @return the alter item code of this vr migrate mappings
	*/
	@Override
	public java.lang.String getAlterItemCode() {
		return _vrMigrateMappings.getAlterItemCode();
	}

	/**
	* Returns the alter item name of this vr migrate mappings.
	*
	* @return the alter item name of this vr migrate mappings
	*/
	@Override
	public java.lang.String getAlterItemName() {
		return _vrMigrateMappings.getAlterItemName();
	}

	/**
	* Returns the alter level of this vr migrate mappings.
	*
	* @return the alter level of this vr migrate mappings
	*/
	@Override
	public java.lang.String getAlterLevel() {
		return _vrMigrateMappings.getAlterLevel();
	}

	/**
	* Returns the code_0 of this vr migrate mappings.
	*
	* @return the code_0 of this vr migrate mappings
	*/
	@Override
	public java.lang.String getCode_0() {
		return _vrMigrateMappings.getCode_0();
	}

	/**
	* Returns the code_1 of this vr migrate mappings.
	*
	* @return the code_1 of this vr migrate mappings
	*/
	@Override
	public java.lang.String getCode_1() {
		return _vrMigrateMappings.getCode_1();
	}

	/**
	* Returns the code_2 of this vr migrate mappings.
	*
	* @return the code_2 of this vr migrate mappings
	*/
	@Override
	public java.lang.String getCode_2() {
		return _vrMigrateMappings.getCode_2();
	}

	/**
	* Returns the code_3 of this vr migrate mappings.
	*
	* @return the code_3 of this vr migrate mappings
	*/
	@Override
	public java.lang.String getCode_3() {
		return _vrMigrateMappings.getCode_3();
	}

	/**
	* Returns the item code of this vr migrate mappings.
	*
	* @return the item code of this vr migrate mappings
	*/
	@Override
	public java.lang.String getItemCode() {
		return _vrMigrateMappings.getItemCode();
	}

	/**
	* Returns the item description of this vr migrate mappings.
	*
	* @return the item description of this vr migrate mappings
	*/
	@Override
	public java.lang.String getItemDescription() {
		return _vrMigrateMappings.getItemDescription();
	}

	/**
	* Returns the item name of this vr migrate mappings.
	*
	* @return the item name of this vr migrate mappings
	*/
	@Override
	public java.lang.String getItemName() {
		return _vrMigrateMappings.getItemName();
	}

	/**
	* Returns the item short name of this vr migrate mappings.
	*
	* @return the item short name of this vr migrate mappings
	*/
	@Override
	public java.lang.String getItemShortName() {
		return _vrMigrateMappings.getItemShortName();
	}

	/**
	* Returns the migrate table name of this vr migrate mappings.
	*
	* @return the migrate table name of this vr migrate mappings
	*/
	@Override
	public java.lang.String getMigrateTableName() {
		return _vrMigrateMappings.getMigrateTableName();
	}

	@Override
	public java.lang.String toString() {
		return _vrMigrateMappings.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrMigrateMappings.toXmlString();
	}

	/**
	* Returns the ID of this vr migrate mappings.
	*
	* @return the ID of this vr migrate mappings
	*/
	@Override
	public long getId() {
		return _vrMigrateMappings.getId();
	}

	/**
	* Returns the primary key of this vr migrate mappings.
	*
	* @return the primary key of this vr migrate mappings
	*/
	@Override
	public long getPrimaryKey() {
		return _vrMigrateMappings.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vrMigrateMappings.persist();
	}

	/**
	* Sets the alter collection code of this vr migrate mappings.
	*
	* @param alterCollectionCode the alter collection code of this vr migrate mappings
	*/
	@Override
	public void setAlterCollectionCode(java.lang.String alterCollectionCode) {
		_vrMigrateMappings.setAlterCollectionCode(alterCollectionCode);
	}

	/**
	* Sets the alter group code of this vr migrate mappings.
	*
	* @param alterGroupCode the alter group code of this vr migrate mappings
	*/
	@Override
	public void setAlterGroupCode(java.lang.String alterGroupCode) {
		_vrMigrateMappings.setAlterGroupCode(alterGroupCode);
	}

	/**
	* Sets the alter item code of this vr migrate mappings.
	*
	* @param alterItemCode the alter item code of this vr migrate mappings
	*/
	@Override
	public void setAlterItemCode(java.lang.String alterItemCode) {
		_vrMigrateMappings.setAlterItemCode(alterItemCode);
	}

	/**
	* Sets the alter item name of this vr migrate mappings.
	*
	* @param alterItemName the alter item name of this vr migrate mappings
	*/
	@Override
	public void setAlterItemName(java.lang.String alterItemName) {
		_vrMigrateMappings.setAlterItemName(alterItemName);
	}

	/**
	* Sets the alter level of this vr migrate mappings.
	*
	* @param alterLevel the alter level of this vr migrate mappings
	*/
	@Override
	public void setAlterLevel(java.lang.String alterLevel) {
		_vrMigrateMappings.setAlterLevel(alterLevel);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrMigrateMappings.setCachedModel(cachedModel);
	}

	/**
	* Sets the code_0 of this vr migrate mappings.
	*
	* @param code_0 the code_0 of this vr migrate mappings
	*/
	@Override
	public void setCode_0(java.lang.String code_0) {
		_vrMigrateMappings.setCode_0(code_0);
	}

	/**
	* Sets the code_1 of this vr migrate mappings.
	*
	* @param code_1 the code_1 of this vr migrate mappings
	*/
	@Override
	public void setCode_1(java.lang.String code_1) {
		_vrMigrateMappings.setCode_1(code_1);
	}

	/**
	* Sets the code_2 of this vr migrate mappings.
	*
	* @param code_2 the code_2 of this vr migrate mappings
	*/
	@Override
	public void setCode_2(java.lang.String code_2) {
		_vrMigrateMappings.setCode_2(code_2);
	}

	/**
	* Sets the code_3 of this vr migrate mappings.
	*
	* @param code_3 the code_3 of this vr migrate mappings
	*/
	@Override
	public void setCode_3(java.lang.String code_3) {
		_vrMigrateMappings.setCode_3(code_3);
	}

	/**
	* Sets the data group ID of this vr migrate mappings.
	*
	* @param dataGroupId the data group ID of this vr migrate mappings
	*/
	@Override
	public void setDataGroupId(int dataGroupId) {
		_vrMigrateMappings.setDataGroupId(dataGroupId);
	}

	/**
	* Sets the data item ID of this vr migrate mappings.
	*
	* @param dataItemID the data item ID of this vr migrate mappings
	*/
	@Override
	public void setDataItemID(int dataItemID) {
		_vrMigrateMappings.setDataItemID(dataItemID);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrMigrateMappings.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrMigrateMappings.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrMigrateMappings.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr migrate mappings.
	*
	* @param id the ID of this vr migrate mappings
	*/
	@Override
	public void setId(long id) {
		_vrMigrateMappings.setId(id);
	}

	/**
	* Sets the item code of this vr migrate mappings.
	*
	* @param itemCode the item code of this vr migrate mappings
	*/
	@Override
	public void setItemCode(java.lang.String itemCode) {
		_vrMigrateMappings.setItemCode(itemCode);
	}

	/**
	* Sets the item description of this vr migrate mappings.
	*
	* @param itemDescription the item description of this vr migrate mappings
	*/
	@Override
	public void setItemDescription(java.lang.String itemDescription) {
		_vrMigrateMappings.setItemDescription(itemDescription);
	}

	/**
	* Sets the item name of this vr migrate mappings.
	*
	* @param itemName the item name of this vr migrate mappings
	*/
	@Override
	public void setItemName(java.lang.String itemName) {
		_vrMigrateMappings.setItemName(itemName);
	}

	/**
	* Sets the item short name of this vr migrate mappings.
	*
	* @param itemShortName the item short name of this vr migrate mappings
	*/
	@Override
	public void setItemShortName(java.lang.String itemShortName) {
		_vrMigrateMappings.setItemShortName(itemShortName);
	}

	/**
	* Sets the level of this vr migrate mappings.
	*
	* @param level the level of this vr migrate mappings
	*/
	@Override
	public void setLevel(int level) {
		_vrMigrateMappings.setLevel(level);
	}

	/**
	* Sets the marked as delete of this vr migrate mappings.
	*
	* @param markedAsDelete the marked as delete of this vr migrate mappings
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_vrMigrateMappings.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Sets the marked as restore of this vr migrate mappings.
	*
	* @param markedAsRestore the marked as restore of this vr migrate mappings
	*/
	@Override
	public void setMarkedAsRestore(int markedAsRestore) {
		_vrMigrateMappings.setMarkedAsRestore(markedAsRestore);
	}

	/**
	* Sets the migrate table name of this vr migrate mappings.
	*
	* @param migrateTableName the migrate table name of this vr migrate mappings
	*/
	@Override
	public void setMigrateTableName(java.lang.String migrateTableName) {
		_vrMigrateMappings.setMigrateTableName(migrateTableName);
	}

	@Override
	public void setNew(boolean n) {
		_vrMigrateMappings.setNew(n);
	}

	/**
	* Sets the primary key of this vr migrate mappings.
	*
	* @param primaryKey the primary key of this vr migrate mappings
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrMigrateMappings.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrMigrateMappings.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the seq no of this vr migrate mappings.
	*
	* @param seqNo the seq no of this vr migrate mappings
	*/
	@Override
	public void setSeqNo(int seqNo) {
		_vrMigrateMappings.setSeqNo(seqNo);
	}

	/**
	* Sets the sequence no of this vr migrate mappings.
	*
	* @param sequenceNo the sequence no of this vr migrate mappings
	*/
	@Override
	public void setSequenceNo(int sequenceNo) {
		_vrMigrateMappings.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the task migration ID of this vr migrate mappings.
	*
	* @param taskMigrationID the task migration ID of this vr migrate mappings
	*/
	@Override
	public void setTaskMigrationID(int taskMigrationID) {
		_vrMigrateMappings.setTaskMigrationID(taskMigrationID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRMigrateMappingsWrapper)) {
			return false;
		}

		VRMigrateMappingsWrapper vrMigrateMappingsWrapper = (VRMigrateMappingsWrapper)obj;

		if (Objects.equals(_vrMigrateMappings,
					vrMigrateMappingsWrapper._vrMigrateMappings)) {
			return true;
		}

		return false;
	}

	@Override
	public VRMigrateMappings getWrappedModel() {
		return _vrMigrateMappings;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrMigrateMappings.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrMigrateMappings.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrMigrateMappings.resetOriginalValues();
	}

	private final VRMigrateMappings _vrMigrateMappings;
}