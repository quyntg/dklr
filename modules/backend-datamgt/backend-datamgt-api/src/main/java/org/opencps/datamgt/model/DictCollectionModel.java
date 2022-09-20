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

package org.opencps.datamgt.model;

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
 * The base model interface for the DictCollection service. Represents a row in the &quot;opencps_dictcollection&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.opencps.datamgt.model.impl.DictCollectionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.opencps.datamgt.model.impl.DictCollectionImpl}.
 * </p>
 *
 * @author khoavu
 * @see DictCollection
 * @see org.opencps.datamgt.model.impl.DictCollectionImpl
 * @see org.opencps.datamgt.model.impl.DictCollectionModelImpl
 * @generated
 */
@ProviderType
public interface DictCollectionModel extends BaseModel<DictCollection>,
	GroupedModel, ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dict collection model instance should use the {@link DictCollection} interface instead.
	 */

	/**
	 * Returns the primary key of this dict collection.
	 *
	 * @return the primary key of this dict collection
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dict collection.
	 *
	 * @param primaryKey the primary key of this dict collection
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this dict collection.
	 *
	 * @return the uuid of this dict collection
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this dict collection.
	 *
	 * @param uuid the uuid of this dict collection
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the dict collection ID of this dict collection.
	 *
	 * @return the dict collection ID of this dict collection
	 */
	public long getDictCollectionId();

	/**
	 * Sets the dict collection ID of this dict collection.
	 *
	 * @param dictCollectionId the dict collection ID of this dict collection
	 */
	public void setDictCollectionId(long dictCollectionId);

	/**
	 * Returns the company ID of this dict collection.
	 *
	 * @return the company ID of this dict collection
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this dict collection.
	 *
	 * @param companyId the company ID of this dict collection
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this dict collection.
	 *
	 * @return the group ID of this dict collection
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this dict collection.
	 *
	 * @param groupId the group ID of this dict collection
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this dict collection.
	 *
	 * @return the user ID of this dict collection
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this dict collection.
	 *
	 * @param userId the user ID of this dict collection
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this dict collection.
	 *
	 * @return the user uuid of this dict collection
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this dict collection.
	 *
	 * @param userUuid the user uuid of this dict collection
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this dict collection.
	 *
	 * @return the user name of this dict collection
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this dict collection.
	 *
	 * @param userName the user name of this dict collection
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this dict collection.
	 *
	 * @return the create date of this dict collection
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this dict collection.
	 *
	 * @param createDate the create date of this dict collection
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this dict collection.
	 *
	 * @return the modified date of this dict collection
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dict collection.
	 *
	 * @param modifiedDate the modified date of this dict collection
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the collection code of this dict collection.
	 *
	 * @return the collection code of this dict collection
	 */
	@AutoEscape
	public String getCollectionCode();

	/**
	 * Sets the collection code of this dict collection.
	 *
	 * @param collectionCode the collection code of this dict collection
	 */
	public void setCollectionCode(String collectionCode);

	/**
	 * Returns the collection name of this dict collection.
	 *
	 * @return the collection name of this dict collection
	 */
	@AutoEscape
	public String getCollectionName();

	/**
	 * Sets the collection name of this dict collection.
	 *
	 * @param collectionName the collection name of this dict collection
	 */
	public void setCollectionName(String collectionName);

	/**
	 * Returns the collection name en of this dict collection.
	 *
	 * @return the collection name en of this dict collection
	 */
	@AutoEscape
	public String getCollectionNameEN();

	/**
	 * Sets the collection name en of this dict collection.
	 *
	 * @param collectionNameEN the collection name en of this dict collection
	 */
	public void setCollectionNameEN(String collectionNameEN);

	/**
	 * Returns the description of this dict collection.
	 *
	 * @return the description of this dict collection
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this dict collection.
	 *
	 * @param description the description of this dict collection
	 */
	public void setDescription(String description);

	/**
	 * Returns the data form of this dict collection.
	 *
	 * @return the data form of this dict collection
	 */
	@AutoEscape
	public String getDataForm();

	/**
	 * Sets the data form of this dict collection.
	 *
	 * @param dataForm the data form of this dict collection
	 */
	public void setDataForm(String dataForm);

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
	public int compareTo(DictCollection dictCollection);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DictCollection> toCacheModel();

	@Override
	public DictCollection toEscapedModel();

	@Override
	public DictCollection toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}