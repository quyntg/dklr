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
import com.liferay.portal.kernel.service.ServiceContext;

import org.opencps.dossiermgt.service.persistence.ServiceProcessRolePK;

import java.io.Serializable;

/**
 * The base model interface for the ServiceProcessRole service. Represents a row in the &quot;opencps_serviceprocessrole&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.opencps.dossiermgt.model.impl.ServiceProcessRoleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.opencps.dossiermgt.model.impl.ServiceProcessRoleImpl}.
 * </p>
 *
 * @author huymq
 * @see ServiceProcessRole
 * @see org.opencps.dossiermgt.model.impl.ServiceProcessRoleImpl
 * @see org.opencps.dossiermgt.model.impl.ServiceProcessRoleModelImpl
 * @generated
 */
@ProviderType
public interface ServiceProcessRoleModel extends BaseModel<ServiceProcessRole> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a service process role model instance should use the {@link ServiceProcessRole} interface instead.
	 */

	/**
	 * Returns the primary key of this service process role.
	 *
	 * @return the primary key of this service process role
	 */
	public ServiceProcessRolePK getPrimaryKey();

	/**
	 * Sets the primary key of this service process role.
	 *
	 * @param primaryKey the primary key of this service process role
	 */
	public void setPrimaryKey(ServiceProcessRolePK primaryKey);

	/**
	 * Returns the uuid of this service process role.
	 *
	 * @return the uuid of this service process role
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this service process role.
	 *
	 * @param uuid the uuid of this service process role
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the service process ID of this service process role.
	 *
	 * @return the service process ID of this service process role
	 */
	public long getServiceProcessId();

	/**
	 * Sets the service process ID of this service process role.
	 *
	 * @param serviceProcessId the service process ID of this service process role
	 */
	public void setServiceProcessId(long serviceProcessId);

	/**
	 * Returns the role ID of this service process role.
	 *
	 * @return the role ID of this service process role
	 */
	public long getRoleId();

	/**
	 * Sets the role ID of this service process role.
	 *
	 * @param roleId the role ID of this service process role
	 */
	public void setRoleId(long roleId);

	/**
	 * Returns the moderator of this service process role.
	 *
	 * @return the moderator of this service process role
	 */
	public boolean getModerator();

	/**
	 * Returns <code>true</code> if this service process role is moderator.
	 *
	 * @return <code>true</code> if this service process role is moderator; <code>false</code> otherwise
	 */
	public boolean isModerator();

	/**
	 * Sets whether this service process role is moderator.
	 *
	 * @param moderator the moderator of this service process role
	 */
	public void setModerator(boolean moderator);

	/**
	 * Returns the condition of this service process role.
	 *
	 * @return the condition of this service process role
	 */
	@AutoEscape
	public String getCondition();

	/**
	 * Sets the condition of this service process role.
	 *
	 * @param condition the condition of this service process role
	 */
	public void setCondition(String condition);

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
	public int compareTo(ServiceProcessRole serviceProcessRole);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ServiceProcessRole> toCacheModel();

	@Override
	public ServiceProcessRole toEscapedModel();

	@Override
	public ServiceProcessRole toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}