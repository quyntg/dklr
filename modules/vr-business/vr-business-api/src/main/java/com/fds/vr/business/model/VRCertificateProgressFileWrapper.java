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
 * This class is a wrapper for {@link VRCertificateProgressFile}.
 * </p>
 *
 * @author LamTV
 * @see VRCertificateProgressFile
 * @generated
 */
@ProviderType
public class VRCertificateProgressFileWrapper
	implements VRCertificateProgressFile,
		ModelWrapper<VRCertificateProgressFile> {
	public VRCertificateProgressFileWrapper(
		VRCertificateProgressFile vrCertificateProgressFile) {
		_vrCertificateProgressFile = vrCertificateProgressFile;
	}

	@Override
	public Class<?> getModelClass() {
		return VRCertificateProgressFile.class;
	}

	@Override
	public String getModelClassName() {
		return VRCertificateProgressFile.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("certificateProgressID", getCertificateProgressID());
		attributes.put("attachedFileID", getAttachedFileID());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long certificateProgressID = (Long)attributes.get(
				"certificateProgressID");

		if (certificateProgressID != null) {
			setCertificateProgressID(certificateProgressID);
		}

		Long attachedFileID = (Long)attributes.get("attachedFileID");

		if (attachedFileID != null) {
			setAttachedFileID(attachedFileID);
		}
	}

	@Override
	public VRCertificateProgressFile toEscapedModel() {
		return new VRCertificateProgressFileWrapper(_vrCertificateProgressFile.toEscapedModel());
	}

	@Override
	public VRCertificateProgressFile toUnescapedModel() {
		return new VRCertificateProgressFileWrapper(_vrCertificateProgressFile.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrCertificateProgressFile.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrCertificateProgressFile.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrCertificateProgressFile.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrCertificateProgressFile.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRCertificateProgressFile> toCacheModel() {
		return _vrCertificateProgressFile.toCacheModel();
	}

	@Override
	public int compareTo(VRCertificateProgressFile vrCertificateProgressFile) {
		return _vrCertificateProgressFile.compareTo(vrCertificateProgressFile);
	}

	@Override
	public int hashCode() {
		return _vrCertificateProgressFile.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrCertificateProgressFile.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRCertificateProgressFileWrapper((VRCertificateProgressFile)_vrCertificateProgressFile.clone());
	}

	@Override
	public java.lang.String toString() {
		return _vrCertificateProgressFile.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrCertificateProgressFile.toXmlString();
	}

	/**
	* Returns the attached file ID of this vr certificate progress file.
	*
	* @return the attached file ID of this vr certificate progress file
	*/
	@Override
	public long getAttachedFileID() {
		return _vrCertificateProgressFile.getAttachedFileID();
	}

	/**
	* Returns the certificate progress ID of this vr certificate progress file.
	*
	* @return the certificate progress ID of this vr certificate progress file
	*/
	@Override
	public long getCertificateProgressID() {
		return _vrCertificateProgressFile.getCertificateProgressID();
	}

	/**
	* Returns the ID of this vr certificate progress file.
	*
	* @return the ID of this vr certificate progress file
	*/
	@Override
	public long getId() {
		return _vrCertificateProgressFile.getId();
	}

	/**
	* Returns the primary key of this vr certificate progress file.
	*
	* @return the primary key of this vr certificate progress file
	*/
	@Override
	public long getPrimaryKey() {
		return _vrCertificateProgressFile.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vrCertificateProgressFile.persist();
	}

	/**
	* Sets the attached file ID of this vr certificate progress file.
	*
	* @param attachedFileID the attached file ID of this vr certificate progress file
	*/
	@Override
	public void setAttachedFileID(long attachedFileID) {
		_vrCertificateProgressFile.setAttachedFileID(attachedFileID);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrCertificateProgressFile.setCachedModel(cachedModel);
	}

	/**
	* Sets the certificate progress ID of this vr certificate progress file.
	*
	* @param certificateProgressID the certificate progress ID of this vr certificate progress file
	*/
	@Override
	public void setCertificateProgressID(long certificateProgressID) {
		_vrCertificateProgressFile.setCertificateProgressID(certificateProgressID);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrCertificateProgressFile.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrCertificateProgressFile.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrCertificateProgressFile.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr certificate progress file.
	*
	* @param id the ID of this vr certificate progress file
	*/
	@Override
	public void setId(long id) {
		_vrCertificateProgressFile.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_vrCertificateProgressFile.setNew(n);
	}

	/**
	* Sets the primary key of this vr certificate progress file.
	*
	* @param primaryKey the primary key of this vr certificate progress file
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrCertificateProgressFile.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrCertificateProgressFile.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCertificateProgressFileWrapper)) {
			return false;
		}

		VRCertificateProgressFileWrapper vrCertificateProgressFileWrapper = (VRCertificateProgressFileWrapper)obj;

		if (Objects.equals(_vrCertificateProgressFile,
					vrCertificateProgressFileWrapper._vrCertificateProgressFile)) {
			return true;
		}

		return false;
	}

	@Override
	public VRCertificateProgressFile getWrappedModel() {
		return _vrCertificateProgressFile;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrCertificateProgressFile.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrCertificateProgressFile.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrCertificateProgressFile.resetOriginalValues();
	}

	private final VRCertificateProgressFile _vrCertificateProgressFile;
}