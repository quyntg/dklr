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

import com.fds.vr.business.model.VRVehicleSpecification;
import com.fds.vr.business.model.VRVehicleSpecificationModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
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
 * The base model implementation for the VRVehicleSpecification service. Represents a row in the &quot;vr_vehiclespecification&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link VRVehicleSpecificationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VRVehicleSpecificationImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRVehicleSpecificationImpl
 * @see VRVehicleSpecification
 * @see VRVehicleSpecificationModel
 * @generated
 */
@ProviderType
public class VRVehicleSpecificationModelImpl extends BaseModelImpl<VRVehicleSpecification>
	implements VRVehicleSpecificationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vr vehicle specification model instance should use the {@link VRVehicleSpecification} interface instead.
	 */
	public static final String TABLE_NAME = "vr_vehiclespecification";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "vehicleCertificateId", Types.BIGINT },
			{ "specificationCode", Types.VARCHAR },
			{ "specificationName", Types.VARCHAR },
			{ "specificationValue", Types.VARCHAR },
			{ "specificationValueDescription", Types.VARCHAR },
			{ "sequenceNo", Types.BIGINT },
			{ "specificationBasicUnit", Types.VARCHAR },
			{ "specificationStandard", Types.VARCHAR },
			{ "specificationGroup", Types.VARCHAR },
			{ "specificationDataCollectionID", Types.VARCHAR },
			{ "specificationResult", Types.VARCHAR },
			{ "deliverableCode", Types.VARCHAR },
			{ "dossierid", Types.BIGINT },
			{ "dossierIdCTN", Types.VARCHAR },
			{ "dossierno", Types.VARCHAR },
			{ "modifyDate", Types.TIMESTAMP },
			{ "syncDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("vehicleCertificateId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("specificationCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("specificationName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("specificationValue", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("specificationValueDescription", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sequenceNo", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("specificationBasicUnit", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("specificationStandard", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("specificationGroup", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("specificationDataCollectionID", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("specificationResult", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("deliverableCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dossierid", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("dossierIdCTN", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dossierno", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("modifyDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("syncDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table vr_vehiclespecification (id LONG not null primary key,vehicleCertificateId LONG,specificationCode VARCHAR(75) null,specificationName VARCHAR(75) null,specificationValue VARCHAR(75) null,specificationValueDescription VARCHAR(75) null,sequenceNo LONG,specificationBasicUnit VARCHAR(75) null,specificationStandard VARCHAR(75) null,specificationGroup VARCHAR(75) null,specificationDataCollectionID VARCHAR(75) null,specificationResult VARCHAR(75) null,deliverableCode VARCHAR(75) null,dossierid LONG,dossierIdCTN VARCHAR(75) null,dossierno VARCHAR(75) null,modifyDate DATE null,syncDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table vr_vehiclespecification";
	public static final String ORDER_BY_JPQL = " ORDER BY vrVehicleSpecification.vehicleCertificateId DESC, vrVehicleSpecification.sequenceNo ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_vehiclespecification.vehicleCertificateId DESC, vr_vehiclespecification.sequenceNo ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.fds.vr.business.model.VRVehicleSpecification"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.fds.vr.business.model.VRVehicleSpecification"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.fds.vr.business.model.VRVehicleSpecification"),
			true);
	public static final long DELIVERABLECODE_COLUMN_BITMASK = 1L;
	public static final long DOSSIERID_COLUMN_BITMASK = 2L;
	public static final long SPECIFICATIONCODE_COLUMN_BITMASK = 4L;
	public static final long VEHICLECERTIFICATEID_COLUMN_BITMASK = 8L;
	public static final long SEQUENCENO_COLUMN_BITMASK = 16L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.fds.vr.service.util.ServiceProps.get(
				"lock.expiration.time.com.fds.vr.business.model.VRVehicleSpecification"));

	public VRVehicleSpecificationModelImpl() {
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
		return VRVehicleSpecification.class;
	}

	@Override
	public String getModelClassName() {
		return VRVehicleSpecification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleCertificateId", getVehicleCertificateId());
		attributes.put("specificationCode", getSpecificationCode());
		attributes.put("specificationName", getSpecificationName());
		attributes.put("specificationValue", getSpecificationValue());
		attributes.put("specificationValueDescription",
			getSpecificationValueDescription());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("specificationBasicUnit", getSpecificationBasicUnit());
		attributes.put("specificationStandard", getSpecificationStandard());
		attributes.put("specificationGroup", getSpecificationGroup());
		attributes.put("specificationDataCollectionID",
			getSpecificationDataCollectionID());
		attributes.put("specificationResult", getSpecificationResult());
		attributes.put("deliverableCode", getDeliverableCode());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierIdCTN", getDossierIdCTN());
		attributes.put("dossierNo", getDossierNo());
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

		Long vehicleCertificateId = (Long)attributes.get("vehicleCertificateId");

		if (vehicleCertificateId != null) {
			setVehicleCertificateId(vehicleCertificateId);
		}

		String specificationCode = (String)attributes.get("specificationCode");

		if (specificationCode != null) {
			setSpecificationCode(specificationCode);
		}

		String specificationName = (String)attributes.get("specificationName");

		if (specificationName != null) {
			setSpecificationName(specificationName);
		}

		String specificationValue = (String)attributes.get("specificationValue");

		if (specificationValue != null) {
			setSpecificationValue(specificationValue);
		}

		String specificationValueDescription = (String)attributes.get(
				"specificationValueDescription");

		if (specificationValueDescription != null) {
			setSpecificationValueDescription(specificationValueDescription);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String specificationBasicUnit = (String)attributes.get(
				"specificationBasicUnit");

		if (specificationBasicUnit != null) {
			setSpecificationBasicUnit(specificationBasicUnit);
		}

		String specificationStandard = (String)attributes.get(
				"specificationStandard");

		if (specificationStandard != null) {
			setSpecificationStandard(specificationStandard);
		}

		String specificationGroup = (String)attributes.get("specificationGroup");

		if (specificationGroup != null) {
			setSpecificationGroup(specificationGroup);
		}

		String specificationDataCollectionID = (String)attributes.get(
				"specificationDataCollectionID");

		if (specificationDataCollectionID != null) {
			setSpecificationDataCollectionID(specificationDataCollectionID);
		}

		String specificationResult = (String)attributes.get(
				"specificationResult");

		if (specificationResult != null) {
			setSpecificationResult(specificationResult);
		}

		String deliverableCode = (String)attributes.get("deliverableCode");

		if (deliverableCode != null) {
			setDeliverableCode(deliverableCode);
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
	public long getVehicleCertificateId() {
		return _vehicleCertificateId;
	}

	@Override
	public void setVehicleCertificateId(long vehicleCertificateId) {
		_columnBitmask = -1L;

		if (!_setOriginalVehicleCertificateId) {
			_setOriginalVehicleCertificateId = true;

			_originalVehicleCertificateId = _vehicleCertificateId;
		}

		_vehicleCertificateId = vehicleCertificateId;
	}

	public long getOriginalVehicleCertificateId() {
		return _originalVehicleCertificateId;
	}

	@Override
	public String getSpecificationCode() {
		if (_specificationCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _specificationCode;
		}
	}

	@Override
	public void setSpecificationCode(String specificationCode) {
		_columnBitmask |= SPECIFICATIONCODE_COLUMN_BITMASK;

		if (_originalSpecificationCode == null) {
			_originalSpecificationCode = _specificationCode;
		}

		_specificationCode = specificationCode;
	}

	public String getOriginalSpecificationCode() {
		return GetterUtil.getString(_originalSpecificationCode);
	}

	@Override
	public String getSpecificationName() {
		if (_specificationName == null) {
			return StringPool.BLANK;
		}
		else {
			return _specificationName;
		}
	}

	@Override
	public void setSpecificationName(String specificationName) {
		_specificationName = specificationName;
	}

	@Override
	public String getSpecificationValue() {
		if (_specificationValue == null) {
			return StringPool.BLANK;
		}
		else {
			return _specificationValue;
		}
	}

	@Override
	public void setSpecificationValue(String specificationValue) {
		_specificationValue = specificationValue;
	}

	@Override
	public String getSpecificationValueDescription() {
		if (_specificationValueDescription == null) {
			return StringPool.BLANK;
		}
		else {
			return _specificationValueDescription;
		}
	}

	@Override
	public void setSpecificationValueDescription(
		String specificationValueDescription) {
		_specificationValueDescription = specificationValueDescription;
	}

	@Override
	public long getSequenceNo() {
		return _sequenceNo;
	}

	@Override
	public void setSequenceNo(long sequenceNo) {
		_columnBitmask = -1L;

		_sequenceNo = sequenceNo;
	}

	@Override
	public String getSpecificationBasicUnit() {
		if (_specificationBasicUnit == null) {
			return StringPool.BLANK;
		}
		else {
			return _specificationBasicUnit;
		}
	}

	@Override
	public void setSpecificationBasicUnit(String specificationBasicUnit) {
		_specificationBasicUnit = specificationBasicUnit;
	}

	@Override
	public String getSpecificationStandard() {
		if (_specificationStandard == null) {
			return StringPool.BLANK;
		}
		else {
			return _specificationStandard;
		}
	}

	@Override
	public void setSpecificationStandard(String specificationStandard) {
		_specificationStandard = specificationStandard;
	}

	@Override
	public String getSpecificationGroup() {
		if (_specificationGroup == null) {
			return StringPool.BLANK;
		}
		else {
			return _specificationGroup;
		}
	}

	@Override
	public void setSpecificationGroup(String specificationGroup) {
		_specificationGroup = specificationGroup;
	}

	@Override
	public String getSpecificationDataCollectionID() {
		if (_specificationDataCollectionID == null) {
			return StringPool.BLANK;
		}
		else {
			return _specificationDataCollectionID;
		}
	}

	@Override
	public void setSpecificationDataCollectionID(
		String specificationDataCollectionID) {
		_specificationDataCollectionID = specificationDataCollectionID;
	}

	@Override
	public String getSpecificationResult() {
		if (_specificationResult == null) {
			return StringPool.BLANK;
		}
		else {
			return _specificationResult;
		}
	}

	@Override
	public void setSpecificationResult(String specificationResult) {
		_specificationResult = specificationResult;
	}

	@Override
	public String getDeliverableCode() {
		if (_deliverableCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _deliverableCode;
		}
	}

	@Override
	public void setDeliverableCode(String deliverableCode) {
		_columnBitmask |= DELIVERABLECODE_COLUMN_BITMASK;

		if (_originalDeliverableCode == null) {
			_originalDeliverableCode = _deliverableCode;
		}

		_deliverableCode = deliverableCode;
	}

	public String getOriginalDeliverableCode() {
		return GetterUtil.getString(_originalDeliverableCode);
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
		_dossierIdCTN = dossierIdCTN;
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
	public Date getModifyDate() {
		return _modifyDate;
	}

	@Override
	public void setModifyDate(Date modifyDate) {
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
			VRVehicleSpecification.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public VRVehicleSpecification toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VRVehicleSpecification)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VRVehicleSpecificationImpl vrVehicleSpecificationImpl = new VRVehicleSpecificationImpl();

		vrVehicleSpecificationImpl.setId(getId());
		vrVehicleSpecificationImpl.setVehicleCertificateId(getVehicleCertificateId());
		vrVehicleSpecificationImpl.setSpecificationCode(getSpecificationCode());
		vrVehicleSpecificationImpl.setSpecificationName(getSpecificationName());
		vrVehicleSpecificationImpl.setSpecificationValue(getSpecificationValue());
		vrVehicleSpecificationImpl.setSpecificationValueDescription(getSpecificationValueDescription());
		vrVehicleSpecificationImpl.setSequenceNo(getSequenceNo());
		vrVehicleSpecificationImpl.setSpecificationBasicUnit(getSpecificationBasicUnit());
		vrVehicleSpecificationImpl.setSpecificationStandard(getSpecificationStandard());
		vrVehicleSpecificationImpl.setSpecificationGroup(getSpecificationGroup());
		vrVehicleSpecificationImpl.setSpecificationDataCollectionID(getSpecificationDataCollectionID());
		vrVehicleSpecificationImpl.setSpecificationResult(getSpecificationResult());
		vrVehicleSpecificationImpl.setDeliverableCode(getDeliverableCode());
		vrVehicleSpecificationImpl.setDossierId(getDossierId());
		vrVehicleSpecificationImpl.setDossierIdCTN(getDossierIdCTN());
		vrVehicleSpecificationImpl.setDossierNo(getDossierNo());
		vrVehicleSpecificationImpl.setModifyDate(getModifyDate());
		vrVehicleSpecificationImpl.setSyncDate(getSyncDate());

		vrVehicleSpecificationImpl.resetOriginalValues();

		return vrVehicleSpecificationImpl;
	}

	@Override
	public int compareTo(VRVehicleSpecification vrVehicleSpecification) {
		int value = 0;

		if (getVehicleCertificateId() < vrVehicleSpecification.getVehicleCertificateId()) {
			value = -1;
		}
		else if (getVehicleCertificateId() > vrVehicleSpecification.getVehicleCertificateId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		if (getSequenceNo() < vrVehicleSpecification.getSequenceNo()) {
			value = -1;
		}
		else if (getSequenceNo() > vrVehicleSpecification.getSequenceNo()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof VRVehicleSpecification)) {
			return false;
		}

		VRVehicleSpecification vrVehicleSpecification = (VRVehicleSpecification)obj;

		long primaryKey = vrVehicleSpecification.getPrimaryKey();

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
		VRVehicleSpecificationModelImpl vrVehicleSpecificationModelImpl = this;

		vrVehicleSpecificationModelImpl._originalVehicleCertificateId = vrVehicleSpecificationModelImpl._vehicleCertificateId;

		vrVehicleSpecificationModelImpl._setOriginalVehicleCertificateId = false;

		vrVehicleSpecificationModelImpl._originalSpecificationCode = vrVehicleSpecificationModelImpl._specificationCode;

		vrVehicleSpecificationModelImpl._originalDeliverableCode = vrVehicleSpecificationModelImpl._deliverableCode;

		vrVehicleSpecificationModelImpl._originalDossierId = vrVehicleSpecificationModelImpl._dossierId;

		vrVehicleSpecificationModelImpl._setOriginalDossierId = false;

		vrVehicleSpecificationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<VRVehicleSpecification> toCacheModel() {
		VRVehicleSpecificationCacheModel vrVehicleSpecificationCacheModel = new VRVehicleSpecificationCacheModel();

		vrVehicleSpecificationCacheModel.id = getId();

		vrVehicleSpecificationCacheModel.vehicleCertificateId = getVehicleCertificateId();

		vrVehicleSpecificationCacheModel.specificationCode = getSpecificationCode();

		String specificationCode = vrVehicleSpecificationCacheModel.specificationCode;

		if ((specificationCode != null) && (specificationCode.length() == 0)) {
			vrVehicleSpecificationCacheModel.specificationCode = null;
		}

		vrVehicleSpecificationCacheModel.specificationName = getSpecificationName();

		String specificationName = vrVehicleSpecificationCacheModel.specificationName;

		if ((specificationName != null) && (specificationName.length() == 0)) {
			vrVehicleSpecificationCacheModel.specificationName = null;
		}

		vrVehicleSpecificationCacheModel.specificationValue = getSpecificationValue();

		String specificationValue = vrVehicleSpecificationCacheModel.specificationValue;

		if ((specificationValue != null) && (specificationValue.length() == 0)) {
			vrVehicleSpecificationCacheModel.specificationValue = null;
		}

		vrVehicleSpecificationCacheModel.specificationValueDescription = getSpecificationValueDescription();

		String specificationValueDescription = vrVehicleSpecificationCacheModel.specificationValueDescription;

		if ((specificationValueDescription != null) &&
				(specificationValueDescription.length() == 0)) {
			vrVehicleSpecificationCacheModel.specificationValueDescription = null;
		}

		vrVehicleSpecificationCacheModel.sequenceNo = getSequenceNo();

		vrVehicleSpecificationCacheModel.specificationBasicUnit = getSpecificationBasicUnit();

		String specificationBasicUnit = vrVehicleSpecificationCacheModel.specificationBasicUnit;

		if ((specificationBasicUnit != null) &&
				(specificationBasicUnit.length() == 0)) {
			vrVehicleSpecificationCacheModel.specificationBasicUnit = null;
		}

		vrVehicleSpecificationCacheModel.specificationStandard = getSpecificationStandard();

		String specificationStandard = vrVehicleSpecificationCacheModel.specificationStandard;

		if ((specificationStandard != null) &&
				(specificationStandard.length() == 0)) {
			vrVehicleSpecificationCacheModel.specificationStandard = null;
		}

		vrVehicleSpecificationCacheModel.specificationGroup = getSpecificationGroup();

		String specificationGroup = vrVehicleSpecificationCacheModel.specificationGroup;

		if ((specificationGroup != null) && (specificationGroup.length() == 0)) {
			vrVehicleSpecificationCacheModel.specificationGroup = null;
		}

		vrVehicleSpecificationCacheModel.specificationDataCollectionID = getSpecificationDataCollectionID();

		String specificationDataCollectionID = vrVehicleSpecificationCacheModel.specificationDataCollectionID;

		if ((specificationDataCollectionID != null) &&
				(specificationDataCollectionID.length() == 0)) {
			vrVehicleSpecificationCacheModel.specificationDataCollectionID = null;
		}

		vrVehicleSpecificationCacheModel.specificationResult = getSpecificationResult();

		String specificationResult = vrVehicleSpecificationCacheModel.specificationResult;

		if ((specificationResult != null) &&
				(specificationResult.length() == 0)) {
			vrVehicleSpecificationCacheModel.specificationResult = null;
		}

		vrVehicleSpecificationCacheModel.deliverableCode = getDeliverableCode();

		String deliverableCode = vrVehicleSpecificationCacheModel.deliverableCode;

		if ((deliverableCode != null) && (deliverableCode.length() == 0)) {
			vrVehicleSpecificationCacheModel.deliverableCode = null;
		}

		vrVehicleSpecificationCacheModel.dossierId = getDossierId();

		vrVehicleSpecificationCacheModel.dossierIdCTN = getDossierIdCTN();

		String dossierIdCTN = vrVehicleSpecificationCacheModel.dossierIdCTN;

		if ((dossierIdCTN != null) && (dossierIdCTN.length() == 0)) {
			vrVehicleSpecificationCacheModel.dossierIdCTN = null;
		}

		vrVehicleSpecificationCacheModel.dossierNo = getDossierNo();

		String dossierNo = vrVehicleSpecificationCacheModel.dossierNo;

		if ((dossierNo != null) && (dossierNo.length() == 0)) {
			vrVehicleSpecificationCacheModel.dossierNo = null;
		}

		Date modifyDate = getModifyDate();

		if (modifyDate != null) {
			vrVehicleSpecificationCacheModel.modifyDate = modifyDate.getTime();
		}
		else {
			vrVehicleSpecificationCacheModel.modifyDate = Long.MIN_VALUE;
		}

		Date syncDate = getSyncDate();

		if (syncDate != null) {
			vrVehicleSpecificationCacheModel.syncDate = syncDate.getTime();
		}
		else {
			vrVehicleSpecificationCacheModel.syncDate = Long.MIN_VALUE;
		}

		return vrVehicleSpecificationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", vehicleCertificateId=");
		sb.append(getVehicleCertificateId());
		sb.append(", specificationCode=");
		sb.append(getSpecificationCode());
		sb.append(", specificationName=");
		sb.append(getSpecificationName());
		sb.append(", specificationValue=");
		sb.append(getSpecificationValue());
		sb.append(", specificationValueDescription=");
		sb.append(getSpecificationValueDescription());
		sb.append(", sequenceNo=");
		sb.append(getSequenceNo());
		sb.append(", specificationBasicUnit=");
		sb.append(getSpecificationBasicUnit());
		sb.append(", specificationStandard=");
		sb.append(getSpecificationStandard());
		sb.append(", specificationGroup=");
		sb.append(getSpecificationGroup());
		sb.append(", specificationDataCollectionID=");
		sb.append(getSpecificationDataCollectionID());
		sb.append(", specificationResult=");
		sb.append(getSpecificationResult());
		sb.append(", deliverableCode=");
		sb.append(getDeliverableCode());
		sb.append(", dossierId=");
		sb.append(getDossierId());
		sb.append(", dossierIdCTN=");
		sb.append(getDossierIdCTN());
		sb.append(", dossierNo=");
		sb.append(getDossierNo());
		sb.append(", modifyDate=");
		sb.append(getModifyDate());
		sb.append(", syncDate=");
		sb.append(getSyncDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("com.fds.vr.business.model.VRVehicleSpecification");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleCertificateId</column-name><column-value><![CDATA[");
		sb.append(getVehicleCertificateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationCode</column-name><column-value><![CDATA[");
		sb.append(getSpecificationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationName</column-name><column-value><![CDATA[");
		sb.append(getSpecificationName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationValue</column-name><column-value><![CDATA[");
		sb.append(getSpecificationValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationValueDescription</column-name><column-value><![CDATA[");
		sb.append(getSpecificationValueDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequenceNo</column-name><column-value><![CDATA[");
		sb.append(getSequenceNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationBasicUnit</column-name><column-value><![CDATA[");
		sb.append(getSpecificationBasicUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationStandard</column-name><column-value><![CDATA[");
		sb.append(getSpecificationStandard());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationGroup</column-name><column-value><![CDATA[");
		sb.append(getSpecificationGroup());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationDataCollectionID</column-name><column-value><![CDATA[");
		sb.append(getSpecificationDataCollectionID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationResult</column-name><column-value><![CDATA[");
		sb.append(getSpecificationResult());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deliverableCode</column-name><column-value><![CDATA[");
		sb.append(getDeliverableCode());
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

	private static final ClassLoader _classLoader = VRVehicleSpecification.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			VRVehicleSpecification.class
		};
	private long _id;
	private long _vehicleCertificateId;
	private long _originalVehicleCertificateId;
	private boolean _setOriginalVehicleCertificateId;
	private String _specificationCode;
	private String _originalSpecificationCode;
	private String _specificationName;
	private String _specificationValue;
	private String _specificationValueDescription;
	private long _sequenceNo;
	private String _specificationBasicUnit;
	private String _specificationStandard;
	private String _specificationGroup;
	private String _specificationDataCollectionID;
	private String _specificationResult;
	private String _deliverableCode;
	private String _originalDeliverableCode;
	private long _dossierId;
	private long _originalDossierId;
	private boolean _setOriginalDossierId;
	private String _dossierIdCTN;
	private String _dossierNo;
	private Date _modifyDate;
	private Date _syncDate;
	private long _columnBitmask;
	private VRVehicleSpecification _escapedModel;
}