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
public class VRMigrateReviewSoap implements Serializable {
	public static VRMigrateReviewSoap toSoapModel(VRMigrateReview model) {
		VRMigrateReviewSoap soapModel = new VRMigrateReviewSoap();

		soapModel.setId(model.getId());
		soapModel.setDataGroupID(model.getDataGroupID());
		soapModel.setMigrateTableName(model.getMigrateTableName());
		soapModel.setMigrationConfiguration(model.getMigrationConfiguration());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setTaskMigrationID(model.getTaskMigrationID());
		soapModel.setMigrateRows(model.getMigrateRows());
		soapModel.setMigrateRemarks(model.getMigrateRemarks());

		return soapModel;
	}

	public static VRMigrateReviewSoap[] toSoapModels(VRMigrateReview[] models) {
		VRMigrateReviewSoap[] soapModels = new VRMigrateReviewSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRMigrateReviewSoap[][] toSoapModels(
		VRMigrateReview[][] models) {
		VRMigrateReviewSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRMigrateReviewSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRMigrateReviewSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRMigrateReviewSoap[] toSoapModels(
		List<VRMigrateReview> models) {
		List<VRMigrateReviewSoap> soapModels = new ArrayList<VRMigrateReviewSoap>(models.size());

		for (VRMigrateReview model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRMigrateReviewSoap[soapModels.size()]);
	}

	public VRMigrateReviewSoap() {
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

	public int getDataGroupID() {
		return _dataGroupID;
	}

	public void setDataGroupID(int dataGroupID) {
		_dataGroupID = dataGroupID;
	}

	public String getMigrateTableName() {
		return _migrateTableName;
	}

	public void setMigrateTableName(String migrateTableName) {
		_migrateTableName = migrateTableName;
	}

	public String getMigrationConfiguration() {
		return _migrationConfiguration;
	}

	public void setMigrationConfiguration(String migrationConfiguration) {
		_migrationConfiguration = migrationConfiguration;
	}

	public int getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(int sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public int getTaskMigrationID() {
		return _taskMigrationID;
	}

	public void setTaskMigrationID(int taskMigrationID) {
		_taskMigrationID = taskMigrationID;
	}

	public String getMigrateRows() {
		return _migrateRows;
	}

	public void setMigrateRows(String migrateRows) {
		_migrateRows = migrateRows;
	}

	public String getMigrateRemarks() {
		return _migrateRemarks;
	}

	public void setMigrateRemarks(String migrateRemarks) {
		_migrateRemarks = migrateRemarks;
	}

	private long _id;
	private int _dataGroupID;
	private String _migrateTableName;
	private String _migrationConfiguration;
	private int _sequenceNo;
	private int _taskMigrationID;
	private String _migrateRows;
	private String _migrateRemarks;
}