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
 * The base model interface for the ProcessOption service. Represents a row in the &quot;opencps_processoption&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.opencps.dossiermgt.model.impl.ProcessOptionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.opencps.dossiermgt.model.impl.ProcessOptionImpl}.
 * </p>
 *
 * @author huymq
 * @see ProcessOption
 * @see org.opencps.dossiermgt.model.impl.ProcessOptionImpl
 * @see org.opencps.dossiermgt.model.impl.ProcessOptionModelImpl
 * @generated
 */
@ProviderType
public interface ProcessOptionModel extends BaseModel<ProcessOption>,
	GroupedModel, ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a process option model instance should use the {@link ProcessOption} interface instead.
	 */

	/**
	 * Returns the primary key of this process option.
	 *
	 * @return the primary key of this process option
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this process option.
	 *
	 * @param primaryKey the primary key of this process option
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this process option.
	 *
	 * @return the uuid of this process option
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this process option.
	 *
	 * @param uuid the uuid of this process option
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the process option ID of this process option.
	 *
	 * @return the process option ID of this process option
	 */
	public long getProcessOptionId();

	/**
	 * Sets the process option ID of this process option.
	 *
	 * @param processOptionId the process option ID of this process option
	 */
	public void setProcessOptionId(long processOptionId);

	/**
	 * Returns the group ID of this process option.
	 *
	 * @return the group ID of this process option
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this process option.
	 *
	 * @param groupId the group ID of this process option
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this process option.
	 *
	 * @return the company ID of this process option
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this process option.
	 *
	 * @param companyId the company ID of this process option
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this process option.
	 *
	 * @return the user ID of this process option
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this process option.
	 *
	 * @param userId the user ID of this process option
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this process option.
	 *
	 * @return the user uuid of this process option
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this process option.
	 *
	 * @param userUuid the user uuid of this process option
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this process option.
	 *
	 * @return the user name of this process option
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this process option.
	 *
	 * @param userName the user name of this process option
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this process option.
	 *
	 * @return the create date of this process option
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this process option.
	 *
	 * @param createDate the create date of this process option
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this process option.
	 *
	 * @return the modified date of this process option
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this process option.
	 *
	 * @param modifiedDate the modified date of this process option
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the service config ID of this process option.
	 *
	 * @return the service config ID of this process option
	 */
	public long getServiceConfigId();

	/**
	 * Sets the service config ID of this process option.
	 *
	 * @param serviceConfigId the service config ID of this process option
	 */
	public void setServiceConfigId(long serviceConfigId);

	/**
	 * Returns the option order of this process option.
	 *
	 * @return the option order of this process option
	 */
	public int getOptionOrder();

	/**
	 * Sets the option order of this process option.
	 *
	 * @param optionOrder the option order of this process option
	 */
	public void setOptionOrder(int optionOrder);

	/**
	 * Returns the option name of this process option.
	 *
	 * @return the option name of this process option
	 */
	@AutoEscape
	public String getOptionName();

	/**
	 * Sets the option name of this process option.
	 *
	 * @param optionName the option name of this process option
	 */
	public void setOptionName(String optionName);

	/**
	 * Returns the auto select of this process option.
	 *
	 * @return the auto select of this process option
	 */
	@AutoEscape
	public String getAutoSelect();

	/**
	 * Sets the auto select of this process option.
	 *
	 * @param autoSelect the auto select of this process option
	 */
	public void setAutoSelect(String autoSelect);

	/**
	 * Returns the dossier template ID of this process option.
	 *
	 * @return the dossier template ID of this process option
	 */
	public long getDossierTemplateId();

	/**
	 * Sets the dossier template ID of this process option.
	 *
	 * @param dossierTemplateId the dossier template ID of this process option
	 */
	public void setDossierTemplateId(long dossierTemplateId);

	/**
	 * Returns the service process ID of this process option.
	 *
	 * @return the service process ID of this process option
	 */
	public long getServiceProcessId();

	/**
	 * Sets the service process ID of this process option.
	 *
	 * @param serviceProcessId the service process ID of this process option
	 */
	public void setServiceProcessId(long serviceProcessId);

	/**
	 * Returns the instruction note of this process option.
	 *
	 * @return the instruction note of this process option
	 */
	@AutoEscape
	public String getInstructionNote();

	/**
	 * Sets the instruction note of this process option.
	 *
	 * @param instructionNote the instruction note of this process option
	 */
	public void setInstructionNote(String instructionNote);

	/**
	 * Returns the submission note of this process option.
	 *
	 * @return the submission note of this process option
	 */
	@AutoEscape
	public String getSubmissionNote();

	/**
	 * Sets the submission note of this process option.
	 *
	 * @param submissionNote the submission note of this process option
	 */
	public void setSubmissionNote(String submissionNote);

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
	public int compareTo(ProcessOption processOption);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ProcessOption> toCacheModel();

	@Override
	public ProcessOption toEscapedModel();

	@Override
	public ProcessOption toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}