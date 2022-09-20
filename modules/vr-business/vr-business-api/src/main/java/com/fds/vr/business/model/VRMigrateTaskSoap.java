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
public class VRMigrateTaskSoap implements Serializable {
	public static VRMigrateTaskSoap toSoapModel(VRMigrateTask model) {
		VRMigrateTaskSoap soapModel = new VRMigrateTaskSoap();

		soapModel.setTask_id(model.getTask_id());
		soapModel.setTask_name(model.getTask_name());
		soapModel.setTaskMigrationID(model.getTaskMigrationID());
		soapModel.setSource_config(model.getSource_config());
		soapModel.setTarget_config(model.getTarget_config());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static VRMigrateTaskSoap[] toSoapModels(VRMigrateTask[] models) {
		VRMigrateTaskSoap[] soapModels = new VRMigrateTaskSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRMigrateTaskSoap[][] toSoapModels(VRMigrateTask[][] models) {
		VRMigrateTaskSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRMigrateTaskSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRMigrateTaskSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRMigrateTaskSoap[] toSoapModels(List<VRMigrateTask> models) {
		List<VRMigrateTaskSoap> soapModels = new ArrayList<VRMigrateTaskSoap>(models.size());

		for (VRMigrateTask model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRMigrateTaskSoap[soapModels.size()]);
	}

	public VRMigrateTaskSoap() {
	}

	public long getPrimaryKey() {
		return _task_id;
	}

	public void setPrimaryKey(long pk) {
		setTask_id(pk);
	}

	public long getTask_id() {
		return _task_id;
	}

	public void setTask_id(long task_id) {
		_task_id = task_id;
	}

	public String getTask_name() {
		return _task_name;
	}

	public void setTask_name(String task_name) {
		_task_name = task_name;
	}

	public int getTaskMigrationID() {
		return _taskMigrationID;
	}

	public void setTaskMigrationID(int taskMigrationID) {
		_taskMigrationID = taskMigrationID;
	}

	public String getSource_config() {
		return _source_config;
	}

	public void setSource_config(String source_config) {
		_source_config = source_config;
	}

	public String getTarget_config() {
		return _target_config;
	}

	public void setTarget_config(String target_config) {
		_target_config = target_config;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	private long _task_id;
	private String _task_name;
	private int _taskMigrationID;
	private String _source_config;
	private String _target_config;
	private String _remarks;
	private int _status;
}