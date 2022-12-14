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

package com.fds.vr.business.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRHistoryProfile;
import com.fds.vr.business.model.VRHistoryProfileModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the VRHistoryProfile service. Represents a row in the &quot;vr_history_profile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link VRHistoryProfileModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VRHistoryProfileImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRHistoryProfileImpl
 * @see VRHistoryProfile
 * @see VRHistoryProfileModel
 * @generated
 */
@ProviderType
public class VRHistoryProfileModelImpl extends BaseModelImpl<VRHistoryProfile>
	implements VRHistoryProfileModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vr history profile model instance should use the {@link VRHistoryProfile} interface instead.
	 */
	public static final String TABLE_NAME = "vr_history_profile";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "applicantCode", Types.VARCHAR },
			{ "productionPlantCode", Types.VARCHAR },
			{ "contentType", Types.VARCHAR },
			{ "contentFileTemplate", Types.VARCHAR },
			{ "contentFileEntryId", Types.BIGINT },
			{ "contentjsonFileEntryId", Types.BIGINT },
			{ "dossierId", Types.BIGINT },
			{ "dossierIdCTN", Types.VARCHAR },
			{ "dossierNo", Types.VARCHAR },
			{ "modifyUserId", Types.BIGINT },
			{ "createdDate", Types.TIMESTAMP },
			{ "modifyDate", Types.TIMESTAMP },
			{ "syncDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("applicantCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("productionPlantCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("contentType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("contentFileTemplate", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("contentFileEntryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("contentjsonFileEntryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("dossierId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("dossierIdCTN", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dossierNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("modifyUserId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createdDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifyDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("syncDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table vr_history_profile (id LONG not null primary key,applicantCode VARCHAR(75) null,productionPlantCode VARCHAR(75) null,contentType VARCHAR(75) null,contentFileTemplate VARCHAR(75) null,contentFileEntryId LONG,contentjsonFileEntryId LONG,dossierId LONG,dossierIdCTN VARCHAR(75) null,dossierNo VARCHAR(75) null,modifyUserId LONG,createdDate DATE null,modifyDate DATE null,syncDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table vr_history_profile";
	public static final String ORDER_BY_JPQL = " ORDER BY vrHistoryProfile.modifyDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_history_profile.modifyDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.fds.vr.business.model.VRHistoryProfile"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.fds.vr.business.model.VRHistoryProfile"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.fds.vr.business.model.VRHistoryProfile"),
			true);
	public static final long APPLICANTCODE_COLUMN_BITMASK = 1L;
	public static final long CONTENTFILETEMPLATE_COLUMN_BITMASK = 2L;
	public static final long CONTENTTYPE_COLUMN_BITMASK = 4L;
	public static final long DOSSIERID_COLUMN_BITMASK = 8L;
	public static final long DOSSIERIDCTN_COLUMN_BITMASK = 16L;
	public static final long PRODUCTIONPLANTCODE_COLUMN_BITMASK = 32L;
	public static final long MODIFYDATE_COLUMN_BITMASK = 64L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.fds.vr.service.util.ServiceProps.get(
				"lock.expiration.time.com.fds.vr.business.model.VRHistoryProfile"));

	public VRHistoryProfileModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return VRHistoryProfile.class;
	}

	@Override
	public String getModelClassName() {
		return VRHistoryProfile.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("applicantCode", getApplicantCode());
		attributes.put("productionPlantCode", getProductionPlantCode());
		attributes.put("contentType", getContentType());
		attributes.put("contentFileTemplate", getContentFileTemplate());
		attributes.put("contentFileEntryId", getContentFileEntryId());
		attributes.put("contentjsonFileEntryId", getContentjsonFileEntryId());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierIdCTN", getDossierIdCTN());
		attributes.put("dossierNo", getDossierNo());
		attributes.put("modifyUserId", getModifyUserId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String applicantCode = (String)attributes.get("applicantCode");

		if (applicantCode != null) {
			setApplicantCode(applicantCode);
		}

		String productionPlantCode = (String)attributes.get(
				"productionPlantCode");

		if (productionPlantCode != null) {
			setProductionPlantCode(productionPlantCode);
		}

		String contentType = (String)attributes.get("contentType");

		if (contentType != null) {
			setContentType(contentType);
		}

		String contentFileTemplate = (String)attributes.get(
				"contentFileTemplate");

		if (contentFileTemplate != null) {
			setContentFileTemplate(contentFileTemplate);
		}

		Long contentFileEntryId = (Long)attributes.get("contentFileEntryId");

		if (contentFileEntryId != null) {
			setContentFileEntryId(contentFileEntryId);
		}

		Long contentjsonFileEntryId = (Long)attributes.get(
				"contentjsonFileEntryId");

		if (contentjsonFileEntryId != null) {
			setContentjsonFileEntryId(contentjsonFileEntryId);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		String dossierIdCTN = (String)attributes.get("dossierIdCTN");

		if (dossierIdCTN != null) {
			setDossierIdCTN(dossierIdCTN);
		}

		String dossierNo = (String)attributes.get("dossierNo");

		if (dossierNo != null) {
			setDossierNo(dossierNo);
		}

		Long modifyUserId = (Long)attributes.get("modifyUserId");

		if (modifyUserId != null) {
			setModifyUserId(modifyUserId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@Override
	public String getApplicantCode() {
		if (_applicantCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _applicantCode;
		}
	}

	@Override
	public void setApplicantCode(String applicantCode) {
		_columnBitmask |= APPLICANTCODE_COLUMN_BITMASK;

		if (_originalApplicantCode == null) {
			_originalApplicantCode = _applicantCode;
		}

		_applicantCode = applicantCode;
	}

	public String getOriginalApplicantCode() {
		return GetterUtil.getString(_originalApplicantCode);
	}

	@Override
	public String getProductionPlantCode() {
		if (_productionPlantCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _productionPlantCode;
		}
	}

	@Override
	public void setProductionPlantCode(String productionPlantCode) {
		_columnBitmask |= PRODUCTIONPLANTCODE_COLUMN_BITMASK;

		if (_originalProductionPlantCode == null) {
			_originalProductionPlantCode = _productionPlantCode;
		}

		_productionPlantCode = productionPlantCode;
	}

	public String getOriginalProductionPlantCode() {
		return GetterUtil.getString(_originalProductionPlantCode);
	}

	@Override
	public String getContentType() {
		if (_contentType == null) {
			return StringPool.BLANK;
		}
		else {
			return _contentType;
		}
	}

	@Override
	public void setContentType(String contentType) {
		_columnBitmask |= CONTENTTYPE_COLUMN_BITMASK;

		if (_originalContentType == null) {
			_originalContentType = _contentType;
		}

		_contentType = contentType;
	}

	public String getOriginalContentType() {
		return GetterUtil.getString(_originalContentType);
	}

	@Override
	public String getContentFileTemplate() {
		if (_contentFileTemplate == null) {
			return StringPool.BLANK;
		}
		else {
			return _contentFileTemplate;
		}
	}

	@Override
	public void setContentFileTemplate(String contentFileTemplate) {
		_columnBitmask |= CONTENTFILETEMPLATE_COLUMN_BITMASK;

		if (_originalContentFileTemplate == null) {
			_originalContentFileTemplate = _contentFileTemplate;
		}

		_contentFileTemplate = contentFileTemplate;
	}

	public String getOriginalContentFileTemplate() {
		return GetterUtil.getString(_originalContentFileTemplate);
	}

	@Override
	public long getContentFileEntryId() {
		return _contentFileEntryId;
	}

	@Override
	public void setContentFileEntryId(long contentFileEntryId) {
		_contentFileEntryId = contentFileEntryId;
	}

	@Override
	public long getContentjsonFileEntryId() {
		return _contentjsonFileEntryId;
	}

	@Override
	public void setContentjsonFileEntryId(long contentjsonFileEntryId) {
		_contentjsonFileEntryId = contentjsonFileEntryId;
	}

	@Override
	public long getDossierId() {
		return _dossierId;
	}

	@Override
	public void setDossierId(long dossierId) {
		_columnBitmask |= DOSSIERID_COLUMN_BITMASK;

		if (!_setOriginalDossierId) {
			_setOriginalDossierId = true;

			_originalDossierId = _dossierId;
		}

		_dossierId = dossierId;
	}

	public long getOriginalDossierId() {
		return _originalDossierId;
	}

	@Override
	public String getDossierIdCTN() {
		if (_dossierIdCTN == null) {
			return StringPool.BLANK;
		}
		else {
			return _dossierIdCTN;
		}
	}

	@Override
	public void setDossierIdCTN(String dossierIdCTN) {
		_columnBitmask |= DOSSIERIDCTN_COLUMN_BITMASK;

		if (_originalDossierIdCTN == null) {
			_originalDossierIdCTN = _dossierIdCTN;
		}

		_dossierIdCTN = dossierIdCTN;
	}

	public String getOriginalDossierIdCTN() {
		return GetterUtil.getString(_originalDossierIdCTN);
	}

	@Override
	public String getDossierNo() {
		if (_dossierNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _dossierNo;
		}
	}

	@Override
	public void setDossierNo(String dossierNo) {
		_dossierNo = dossierNo;
	}

	@Override
	public long getModifyUserId() {
		return _modifyUserId;
	}

	@Override
	public void setModifyUserId(long modifyUserId) {
		_modifyUserId = modifyUserId;
	}

	@Override
	public String getModifyUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getModifyUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setModifyUserUuid(String modifyUserUuid) {
	}

	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	@Override
	public Date getModifyDate() {
		return _modifyDate;
	}

	@Override
	public void setModifyDate(Date modifyDate) {
		_columnBitmask = -1L;

		_modifyDate = modifyDate;
	}

	@Override
	public Date getSyncDate() {
		return _syncDate;
	}

	@Override
	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			VRHistoryProfile.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public VRHistoryProfile toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VRHistoryProfile)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VRHistoryProfileImpl vrHistoryProfileImpl = new VRHistoryProfileImpl();

		vrHistoryProfileImpl.setId(getId());
		vrHistoryProfileImpl.setApplicantCode(getApplicantCode());
		vrHistoryProfileImpl.setProductionPlantCode(getProductionPlantCode());
		vrHistoryProfileImpl.setContentType(getContentType());
		vrHistoryProfileImpl.setContentFileTemplate(getContentFileTemplate());
		vrHistoryProfileImpl.setContentFileEntryId(getContentFileEntryId());
		vrHistoryProfileImpl.setContentjsonFileEntryId(getContentjsonFileEntryId());
		vrHistoryProfileImpl.setDossierId(getDossierId());
		vrHistoryProfileImpl.setDossierIdCTN(getDossierIdCTN());
		vrHistoryProfileImpl.setDossierNo(getDossierNo());
		vrHistoryProfileImpl.setModifyUserId(getModifyUserId());
		vrHistoryProfileImpl.setCreatedDate(getCreatedDate());
		vrHistoryProfileImpl.setModifyDate(getModifyDate());
		vrHistoryProfileImpl.setSyncDate(getSyncDate());

		vrHistoryProfileImpl.resetOriginalValues();

		return vrHistoryProfileImpl;
	}

	@Override
	public int compareTo(VRHistoryProfile vrHistoryProfile) {
		int value = 0;

		value = DateUtil.compareTo(getModifyDate(),
				vrHistoryProfile.getModifyDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRHistoryProfile)) {
			return false;
		}

		VRHistoryProfile vrHistoryProfile = (VRHistoryProfile)obj;

		long primaryKey = vrHistoryProfile.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		VRHistoryProfileModelImpl vrHistoryProfileModelImpl = this;

		vrHistoryProfileModelImpl._originalApplicantCode = vrHistoryProfileModelImpl._applicantCode;

		vrHistoryProfileModelImpl._originalProductionPlantCode = vrHistoryProfileModelImpl._productionPlantCode;

		vrHistoryProfileModelImpl._originalContentType = vrHistoryProfileModelImpl._contentType;

		vrHistoryProfileModelImpl._originalContentFileTemplate = vrHistoryProfileModelImpl._contentFileTemplate;

		vrHistoryProfileModelImpl._originalDossierId = vrHistoryProfileModelImpl._dossierId;

		vrHistoryProfileModelImpl._setOriginalDossierId = false;

		vrHistoryProfileModelImpl._originalDossierIdCTN = vrHistoryProfileModelImpl._dossierIdCTN;

		vrHistoryProfileModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<VRHistoryProfile> toCacheModel() {
		VRHistoryProfileCacheModel vrHistoryProfileCacheModel = new VRHistoryProfileCacheModel();

		vrHistoryProfileCacheModel.id = getId();

		vrHistoryProfileCacheModel.applicantCode = getApplicantCode();

		String applicantCode = vrHistoryProfileCacheModel.applicantCode;

		if ((applicantCode != null) && (applicantCode.length() == 0)) {
			vrHistoryProfileCacheModel.applicantCode = null;
		}

		vrHistoryProfileCacheModel.productionPlantCode = getProductionPlantCode();

		String productionPlantCode = vrHistoryProfileCacheModel.productionPlantCode;

		if ((productionPlantCode != null) &&
				(productionPlantCode.length() == 0)) {
			vrHistoryProfileCacheModel.productionPlantCode = null;
		}

		vrHistoryProfileCacheModel.contentType = getContentType();

		String contentType = vrHistoryProfileCacheModel.contentType;

		if ((contentType != null) && (contentType.length() == 0)) {
			vrHistoryProfileCacheModel.contentType = null;
		}

		vrHistoryProfileCacheModel.contentFileTemplate = getContentFileTemplate();

		String contentFileTemplate = vrHistoryProfileCacheModel.contentFileTemplate;

		if ((contentFileTemplate != null) &&
				(contentFileTemplate.length() == 0)) {
			vrHistoryProfileCacheModel.contentFileTemplate = null;
		}

		vrHistoryProfileCacheModel.contentFileEntryId = getContentFileEntryId();

		vrHistoryProfileCacheModel.contentjsonFileEntryId = getContentjsonFileEntryId();

		vrHistoryProfileCacheModel.dossierId = getDossierId();

		vrHistoryProfileCacheModel.dossierIdCTN = getDossierIdCTN();

		String dossierIdCTN = vrHistoryProfileCacheModel.dossierIdCTN;

		if ((dossierIdCTN != null) && (dossierIdCTN.length() == 0)) {
			vrHistoryProfileCacheModel.dossierIdCTN = null;
		}

		vrHistoryProfileCacheModel.dossierNo = getDossierNo();

		String dossierNo = vrHistoryProfileCacheModel.dossierNo;

		if ((dossierNo != null) && (dossierNo.length() == 0)) {
			vrHistoryProfileCacheModel.dossierNo = null;
		}

		vrHistoryProfileCacheModel.modifyUserId = getModifyUserId();

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			vrHistoryProfileCacheModel.createdDate = createdDate.getTime();
		}
		else {
			vrHistoryProfileCacheModel.createdDate = Long.MIN_VALUE;
		}

		Date modifyDate = getModifyDate();

		if (modifyDate != null) {
			vrHistoryProfileCacheModel.modifyDate = modifyDate.getTime();
		}
		else {
			vrHistoryProfileCacheModel.modifyDate = Long.MIN_VALUE;
		}

		Date syncDate = getSyncDate();

		if (syncDate != null) {
			vrHistoryProfileCacheModel.syncDate = syncDate.getTime();
		}
		else {
			vrHistoryProfileCacheModel.syncDate = Long.MIN_VALUE;
		}

		return vrHistoryProfileCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", applicantCode=");
		sb.append(getApplicantCode());
		sb.append(", productionPlantCode=");
		sb.append(getProductionPlantCode());
		sb.append(", contentType=");
		sb.append(getContentType());
		sb.append(", contentFileTemplate=");
		sb.append(getContentFileTemplate());
		sb.append(", contentFileEntryId=");
		sb.append(getContentFileEntryId());
		sb.append(", contentjsonFileEntryId=");
		sb.append(getContentjsonFileEntryId());
		sb.append(", dossierId=");
		sb.append(getDossierId());
		sb.append(", dossierIdCTN=");
		sb.append(getDossierIdCTN());
		sb.append(", dossierNo=");
		sb.append(getDossierNo());
		sb.append(", modifyUserId=");
		sb.append(getModifyUserId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", modifyDate=");
		sb.append(getModifyDate());
		sb.append(", syncDate=");
		sb.append(getSyncDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.fds.vr.business.model.VRHistoryProfile");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicantCode</column-name><column-value><![CDATA[");
		sb.append(getApplicantCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productionPlantCode</column-name><column-value><![CDATA[");
		sb.append(getProductionPlantCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contentType</column-name><column-value><![CDATA[");
		sb.append(getContentType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contentFileTemplate</column-name><column-value><![CDATA[");
		sb.append(getContentFileTemplate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contentFileEntryId</column-name><column-value><![CDATA[");
		sb.append(getContentFileEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contentjsonFileEntryId</column-name><column-value><![CDATA[");
		sb.append(getContentjsonFileEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierId</column-name><column-value><![CDATA[");
		sb.append(getDossierId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierIdCTN</column-name><column-value><![CDATA[");
		sb.append(getDossierIdCTN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierNo</column-name><column-value><![CDATA[");
		sb.append(getDossierNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyUserId</column-name><column-value><![CDATA[");
		sb.append(getModifyUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyDate</column-name><column-value><![CDATA[");
		sb.append(getModifyDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncDate</column-name><column-value><![CDATA[");
		sb.append(getSyncDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = VRHistoryProfile.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			VRHistoryProfile.class
		};
	private long _id;
	private String _applicantCode;
	private String _originalApplicantCode;
	private String _productionPlantCode;
	private String _originalProductionPlantCode;
	private String _contentType;
	private String _originalContentType;
	private String _contentFileTemplate;
	private String _originalContentFileTemplate;
	private long _contentFileEntryId;
	private long _contentjsonFileEntryId;
	private long _dossierId;
	private long _originalDossierId;
	private boolean _setOriginalDossierId;
	private String _dossierIdCTN;
	private String _originalDossierIdCTN;
	private String _dossierNo;
	private long _modifyUserId;
	private Date _createdDate;
	private Date _modifyDate;
	private Date _syncDate;
	private long _columnBitmask;
	private VRHistoryProfile _escapedModel;
}