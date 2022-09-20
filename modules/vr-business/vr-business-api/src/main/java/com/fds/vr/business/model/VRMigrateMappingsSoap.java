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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LamTV
 * @generated
 */
@ProviderType
public class VRMigrateMappingsSoap implements Serializable {
	public static VRMigrateMappingsSoap toSoapModel(VRMigrateMappings model) {
		VRMigrateMappingsSoap soapModel = new VRMigrateMappingsSoap();

		soapModel.setId(model.getId());
		soapModel.setDataGroupId(model.getDataGroupId());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setMigrateTableName(model.getMigrateTableName());
		soapModel.setDataItemID(model.getDataItemID());
		soapModel.setItemCode(model.getItemCode());
		soapModel.setItemName(model.getItemName());
		soapModel.setItemShortName(model.getItemShortName());
		soapModel.setItemDescription(model.getItemDescription());
		soapModel.setCode_0(model.getCode_0());
		soapModel.setCode_1(model.getCode_1());
		soapModel.setCode_2(model.getCode_2());
		soapModel.setCode_3(model.getCode_3());
		soapModel.setLevel(model.getLevel());
		soapModel.setSeqNo(model.getSeqNo());
		soapModel.setMarkedAsRestore(model.getMarkedAsRestore());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setAlterCollectionCode(model.getAlterCollectionCode());
		soapModel.setAlterItemCode(model.getAlterItemCode());
		soapModel.setAlterItemName(model.getAlterItemName());
		soapModel.setAlterGroupCode(model.getAlterGroupCode());
		soapModel.setAlterLevel(model.getAlterLevel());
		soapModel.setTaskMigrationID(model.getTaskMigrationID());

		return soapModel;
	}

	public static VRMigrateMappingsSoap[] toSoapModels(
		VRMigrateMappings[] models) {
		VRMigrateMappingsSoap[] soapModels = new VRMigrateMappingsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRMigrateMappingsSoap[][] toSoapModels(
		VRMigrateMappings[][] models) {
		VRMigrateMappingsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRMigrateMappingsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRMigrateMappingsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRMigrateMappingsSoap[] toSoapModels(
		List<VRMigrateMappings> models) {
		List<VRMigrateMappingsSoap> soapModels = new ArrayList<VRMigrateMappingsSoap>(models.size());

		for (VRMigrateMappings model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRMigrateMappingsSoap[soapModels.size()]);
	}

	public VRMigrateMappingsSoap() {
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

	public int getDataGroupId() {
		return _dataGroupId;
	}

	public void setDataGroupId(int dataGroupId) {
		_dataGroupId = dataGroupId;
	}

	public int getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(int sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public String getMigrateTableName() {
		return _migrateTableName;
	}

	public void setMigrateTableName(String migrateTableName) {
		_migrateTableName = migrateTableName;
	}

	public int getDataItemID() {
		return _dataItemID;
	}

	public void setDataItemID(int dataItemID) {
		_dataItemID = dataItemID;
	}

	public String getItemCode() {
		return _itemCode;
	}

	public void setItemCode(String itemCode) {
		_itemCode = itemCode;
	}

	public String getItemName() {
		return _itemName;
	}

	public void setItemName(String itemName) {
		_itemName = itemName;
	}

	public String getItemShortName() {
		return _itemShortName;
	}

	public void setItemShortName(String itemShortName) {
		_itemShortName = itemShortName;
	}

	public String getItemDescription() {
		return _itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		_itemDescription = itemDescription;
	}

	public String getCode_0() {
		return _code_0;
	}

	public void setCode_0(String code_0) {
		_code_0 = code_0;
	}

	public String getCode_1() {
		return _code_1;
	}

	public void setCode_1(String code_1) {
		_code_1 = code_1;
	}

	public String getCode_2() {
		return _code_2;
	}

	public void setCode_2(String code_2) {
		_code_2 = code_2;
	}

	public String getCode_3() {
		return _code_3;
	}

	public void setCode_3(String code_3) {
		_code_3 = code_3;
	}

	public int getLevel() {
		return _level;
	}

	public void setLevel(int level) {
		_level = level;
	}

	public int getSeqNo() {
		return _seqNo;
	}

	public void setSeqNo(int seqNo) {
		_seqNo = seqNo;
	}

	public int getMarkedAsRestore() {
		return _markedAsRestore;
	}

	public void setMarkedAsRestore(int markedAsRestore) {
		_markedAsRestore = markedAsRestore;
	}

	public int getMarkedAsDelete() {
		return _markedAsDelete;
	}

	public void setMarkedAsDelete(int markedAsDelete) {
		_markedAsDelete = markedAsDelete;
	}

	public String getAlterCollectionCode() {
		return _alterCollectionCode;
	}

	public void setAlterCollectionCode(String alterCollectionCode) {
		_alterCollectionCode = alterCollectionCode;
	}

	public String getAlterItemCode() {
		return _alterItemCode;
	}

	public void setAlterItemCode(String alterItemCode) {
		_alterItemCode = alterItemCode;
	}

	public String getAlterItemName() {
		return _alterItemName;
	}

	public void setAlterItemName(String alterItemName) {
		_alterItemName = alterItemName;
	}

	public String getAlterGroupCode() {
		return _alterGroupCode;
	}

	public void setAlterGroupCode(String alterGroupCode) {
		_alterGroupCode = alterGroupCode;
	}

	public String getAlterLevel() {
		return _alterLevel;
	}

	public void setAlterLevel(String alterLevel) {
		_alterLevel = alterLevel;
	}

	public int getTaskMigrationID() {
		return _taskMigrationID;
	}

	public void setTaskMigrationID(int taskMigrationID) {
		_taskMigrationID = taskMigrationID;
	}

	private long _id;
	private int _dataGroupId;
	private int _sequenceNo;
	private String _migrateTableName;
	private int _dataItemID;
	private String _itemCode;
	private String _itemName;
	private String _itemShortName;
	private String _itemDescription;
	private String _code_0;
	private String _code_1;
	private String _code_2;
	private String _code_3;
	private int _level;
	private int _seqNo;
	private int _markedAsRestore;
	private int _markedAsDelete;
	private String _alterCollectionCode;
	private String _alterItemCode;
	private String _alterItemName;
	private String _alterGroupCode;
	private String _alterLevel;
	private int _taskMigrationID;
}