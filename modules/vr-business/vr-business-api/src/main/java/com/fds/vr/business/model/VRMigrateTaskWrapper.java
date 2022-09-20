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
 * This class is a wrapper for {@link VRMigrateTask}.
 * </p>
 *
 * @author LamTV
 * @see VRMigrateTask
 * @generated
 */
@ProviderType
public class VRMigrateTaskWrapper implements VRMigrateTask,
	ModelWrapper<VRMigrateTask> {
	public VRMigrateTaskWrapper(VRMigrateTask vrMigrateTask) {
		_vrMigrateTask = vrMigrateTask;
	}

	@Override
	public Class<?> getModelClass() {
		return VRMigrateTask.class;
	}

	@Override
	public String getModelClassName() {
		return VRMigrateTask.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("task_id", getTask_id());
		attributes.put("task_name", getTask_name());
		attributes.put("taskMigrationID", getTaskMigrationID());
		attributes.put("source_config", getSource_config());
		attributes.put("target_config", getTarget_config());
		attributes.put("remarks", getRemarks());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long task_id = (Long)attributes.get("task_id");

		if (task_id != null) {
			setTask_id(task_id);
		}

		String task_name = (String)attributes.get("task_name");

		if (task_name != null) {
			setTask_name(task_name);
		}

		Integer taskMigrationID = (Integer)attributes.get("taskMigrationID");

		if (taskMigrationID != null) {
			setTaskMigrationID(taskMigrationID);
		}

		String source_config = (String)attributes.get("source_config");

		if (source_config != null) {
			setSource_config(source_config);
		}

		String target_config = (String)attributes.get("target_config");

		if (target_config != null) {
			setTarget_config(target_config);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public VRMigrateTask toEscapedModel() {
		return new VRMigrateTaskWrapper(_vrMigrateTask.toEscapedModel());
	}

	@Override
	public VRMigrateTask toUnescapedModel() {
		return new VRMigrateTaskWrapper(_vrMigrateTask.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrMigrateTask.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrMigrateTask.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrMigrateTask.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrMigrateTask.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRMigrateTask> toCacheModel() {
		return _vrMigrateTask.toCacheModel();
	}

	@Override
	public int compareTo(VRMigrateTask vrMigrateTask) {
		return _vrMigrateTask.compareTo(vrMigrateTask);
	}

	/**
	* Returns the status of this vr migrate task.
	*
	* @return the status of this vr migrate task
	*/
	@Override
	public int getStatus() {
		return _vrMigrateTask.getStatus();
	}

	/**
	* Returns the task migration ID of this vr migrate task.
	*
	* @return the task migration ID of this vr migrate task
	*/
	@Override
	public int getTaskMigrationID() {
		return _vrMigrateTask.getTaskMigrationID();
	}

	@Override
	public int hashCode() {
		return _vrMigrateTask.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrMigrateTask.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRMigrateTaskWrapper((VRMigrateTask)_vrMigrateTask.clone());
	}

	/**
	* Returns the remarks of this vr migrate task.
	*
	* @return the remarks of this vr migrate task
	*/
	@Override
	public java.lang.String getRemarks() {
		return _vrMigrateTask.getRemarks();
	}

	/**
	* Returns the source_config of this vr migrate task.
	*
	* @return the source_config of this vr migrate task
	*/
	@Override
	public java.lang.String getSource_config() {
		return _vrMigrateTask.getSource_config();
	}

	/**
	* Returns the target_config of this vr migrate task.
	*
	* @return the target_config of this vr migrate task
	*/
	@Override
	public java.lang.String getTarget_config() {
		return _vrMigrateTask.getTarget_config();
	}

	/**
	* Returns the task_name of this vr migrate task.
	*
	* @return the task_name of this vr migrate task
	*/
	@Override
	public java.lang.String getTask_name() {
		return _vrMigrateTask.getTask_name();
	}

	@Override
	public java.lang.String toString() {
		return _vrMigrateTask.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrMigrateTask.toXmlString();
	}

	/**
	* Returns the primary key of this vr migrate task.
	*
	* @return the primary key of this vr migrate task
	*/
	@Override
	public long getPrimaryKey() {
		return _vrMigrateTask.getPrimaryKey();
	}

	/**
	* Returns the task_id of this vr migrate task.
	*
	* @return the task_id of this vr migrate task
	*/
	@Override
	public long getTask_id() {
		return _vrMigrateTask.getTask_id();
	}

	@Override
	public void persist() {
		_vrMigrateTask.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrMigrateTask.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrMigrateTask.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrMigrateTask.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrMigrateTask.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_vrMigrateTask.setNew(n);
	}

	/**
	* Sets the primary key of this vr migrate task.
	*
	* @param primaryKey the primary key of this vr migrate task
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrMigrateTask.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrMigrateTask.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the remarks of this vr migrate task.
	*
	* @param remarks the remarks of this vr migrate task
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_vrMigrateTask.setRemarks(remarks);
	}

	/**
	* Sets the source_config of this vr migrate task.
	*
	* @param source_config the source_config of this vr migrate task
	*/
	@Override
	public void setSource_config(java.lang.String source_config) {
		_vrMigrateTask.setSource_config(source_config);
	}

	/**
	* Sets the status of this vr migrate task.
	*
	* @param status the status of this vr migrate task
	*/
	@Override
	public void setStatus(int status) {
		_vrMigrateTask.setStatus(status);
	}

	/**
	* Sets the target_config of this vr migrate task.
	*
	* @param target_config the target_config of this vr migrate task
	*/
	@Override
	public void setTarget_config(java.lang.String target_config) {
		_vrMigrateTask.setTarget_config(target_config);
	}

	/**
	* Sets the task migration ID of this vr migrate task.
	*
	* @param taskMigrationID the task migration ID of this vr migrate task
	*/
	@Override
	public void setTaskMigrationID(int taskMigrationID) {
		_vrMigrateTask.setTaskMigrationID(taskMigrationID);
	}

	/**
	* Sets the task_id of this vr migrate task.
	*
	* @param task_id the task_id of this vr migrate task
	*/
	@Override
	public void setTask_id(long task_id) {
		_vrMigrateTask.setTask_id(task_id);
	}

	/**
	* Sets the task_name of this vr migrate task.
	*
	* @param task_name the task_name of this vr migrate task
	*/
	@Override
	public void setTask_name(java.lang.String task_name) {
		_vrMigrateTask.setTask_name(task_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRMigrateTaskWrapper)) {
			return false;
		}

		VRMigrateTaskWrapper vrMigrateTaskWrapper = (VRMigrateTaskWrapper)obj;

		if (Objects.equals(_vrMigrateTask, vrMigrateTaskWrapper._vrMigrateTask)) {
			return true;
		}

		return false;
	}

	@Override
	public VRMigrateTask getWrappedModel() {
		return _vrMigrateTask;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrMigrateTask.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrMigrateTask.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrMigrateTask.resetOriginalValues();
	}

	private final VRMigrateTask _vrMigrateTask;
}