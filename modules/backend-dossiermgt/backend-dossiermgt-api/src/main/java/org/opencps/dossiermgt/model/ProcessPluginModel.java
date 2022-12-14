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

package org.opencps.dossiermgt.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ProcessPlugin service. Represents a row in the &quot;opencps_process_plugin&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.opencps.dossiermgt.model.impl.ProcessPluginModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.opencps.dossiermgt.model.impl.ProcessPluginImpl}.
 * </p>
 *
 * @author huymq
 * @see ProcessPlugin
 * @see org.opencps.dossiermgt.model.impl.ProcessPluginImpl
 * @see org.opencps.dossiermgt.model.impl.ProcessPluginModelImpl
 * @generated
 */
@ProviderType
public interface ProcessPluginModel extends BaseModel<ProcessPlugin>,
	GroupedModel, ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a process plugin model instance should use the {@link ProcessPlugin} interface instead.
	 */

	/**
	 * Returns the primary key of this process plugin.
	 *
	 * @return the primary key of this process plugin
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this process plugin.
	 *
	 * @param primaryKey the primary key of this process plugin
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this process plugin.
	 *
	 * @return the uuid of this process plugin
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this process plugin.
	 *
	 * @param uuid the uuid of this process plugin
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the process plugin ID of this process plugin.
	 *
	 * @return the process plugin ID of this process plugin
	 */
	public long getProcessPluginId();

	/**
	 * Sets the process plugin ID of this process plugin.
	 *
	 * @param processPluginId the process plugin ID of this process plugin
	 */
	public void setProcessPluginId(long processPluginId);

	/**
	 * Returns the company ID of this process plugin.
	 *
	 * @return the company ID of this process plugin
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this process plugin.
	 *
	 * @param companyId the company ID of this process plugin
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this process plugin.
	 *
	 * @return the group ID of this process plugin
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this process plugin.
	 *
	 * @param groupId the group ID of this process plugin
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this process plugin.
	 *
	 * @return the user ID of this process plugin
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this process plugin.
	 *
	 * @param userId the user ID of this process plugin
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this process plugin.
	 *
	 * @return the user uuid of this process plugin
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this process plugin.
	 *
	 * @param userUuid the user uuid of this process plugin
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this process plugin.
	 *
	 * @return the user name of this process plugin
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this process plugin.
	 *
	 * @param userName the user name of this process plugin
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this process plugin.
	 *
	 * @return the create date of this process plugin
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this process plugin.
	 *
	 * @param createDate the create date of this process plugin
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this process plugin.
	 *
	 * @return the modified date of this process plugin
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this process plugin.
	 *
	 * @param modifiedDate the modified date of this process plugin
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the step code of this process plugin.
	 *
	 * @return the step code of this process plugin
	 */
	@AutoEscape
	public String getStepCode();

	/**
	 * Sets the step code of this process plugin.
	 *
	 * @param stepCode the step code of this process plugin
	 */
	public void setStepCode(String stepCode);

	/**
	 * Returns the service process ID of this process plugin.
	 *
	 * @return the service process ID of this process plugin
	 */
	public long getServiceProcessId();

	/**
	 * Sets the service process ID of this process plugin.
	 *
	 * @param serviceProcessId the service process ID of this process plugin
	 */
	public void setServiceProcessId(long serviceProcessId);

	/**
	 * Returns the plugin name of this process plugin.
	 *
	 * @return the plugin name of this process plugin
	 */
	@AutoEscape
	public String getPluginName();

	/**
	 * Sets the plugin name of this process plugin.
	 *
	 * @param pluginName the plugin name of this process plugin
	 */
	public void setPluginName(String pluginName);

	/**
	 * Returns the sequence no of this process plugin.
	 *
	 * @return the sequence no of this process plugin
	 */
	@AutoEscape
	public String getSequenceNo();

	/**
	 * Sets the sequence no of this process plugin.
	 *
	 * @param sequenceNo the sequence no of this process plugin
	 */
	public void setSequenceNo(String sequenceNo);

	/**
	 * Returns the plugin form of this process plugin.
	 *
	 * @return the plugin form of this process plugin
	 */
	@AutoEscape
	public String getPluginForm();

	/**
	 * Sets the plugin form of this process plugin.
	 *
	 * @param pluginForm the plugin form of this process plugin
	 */
	public void setPluginForm(String pluginForm);

	/**
	 * Returns the sample data of this process plugin.
	 *
	 * @return the sample data of this process plugin
	 */
	@AutoEscape
	public String getSampleData();

	/**
	 * Sets the sample data of this process plugin.
	 *
	 * @param sampleData the sample data of this process plugin
	 */
	public void setSampleData(String sampleData);

	/**
	 * Returns the auto run of this process plugin.
	 *
	 * @return the auto run of this process plugin
	 */
	public boolean getAutoRun();

	/**
	 * Returns <code>true</code> if this process plugin is auto run.
	 *
	 * @return <code>true</code> if this process plugin is auto run; <code>false</code> otherwise
	 */
	public boolean isAutoRun();

	/**
	 * Sets whether this process plugin is auto run.
	 *
	 * @param autoRun the auto run of this process plugin
	 */
	public void setAutoRun(boolean autoRun);

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
	public int compareTo(ProcessPlugin processPlugin);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ProcessPlugin> toCacheModel();

	@Override
	public ProcessPlugin toEscapedModel();

	@Override
	public ProcessPlugin toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}