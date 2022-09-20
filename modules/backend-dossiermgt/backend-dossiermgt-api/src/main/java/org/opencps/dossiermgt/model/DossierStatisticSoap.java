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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author huymq
 * @generated
 */
@ProviderType
public class DossierStatisticSoap implements Serializable {
	public static DossierStatisticSoap toSoapModel(DossierStatistic model) {
		DossierStatisticSoap soapModel = new DossierStatisticSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setDossierStatisticId(model.getDossierStatisticId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setMonth(model.getMonth());
		soapModel.setYear(model.getYear());
		soapModel.setRemainingCount(model.getRemainingCount());
		soapModel.setReceivedCount(model.getReceivedCount());
		soapModel.setOnlineCount(model.getOnlineCount());
		soapModel.setUndueCount(model.getUndueCount());
		soapModel.setOverdueCount(model.getOverdueCount());
		soapModel.setOntimeCount(model.getOntimeCount());
		soapModel.setOvertimeCount(model.getOvertimeCount());
		soapModel.setGovAgencyCode(model.getGovAgencyCode());
		soapModel.setGovAgencyName(model.getGovAgencyName());
		soapModel.setDomainCode(model.getDomainCode());
		soapModel.setDomainName(model.getDomainName());
		soapModel.setAdministrationLevel(model.getAdministrationLevel());
		soapModel.setReporting(model.getReporting());

		return soapModel;
	}

	public static DossierStatisticSoap[] toSoapModels(DossierStatistic[] models) {
		DossierStatisticSoap[] soapModels = new DossierStatisticSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DossierStatisticSoap[][] toSoapModels(
		DossierStatistic[][] models) {
		DossierStatisticSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DossierStatisticSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DossierStatisticSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DossierStatisticSoap[] toSoapModels(
		List<DossierStatistic> models) {
		List<DossierStatisticSoap> soapModels = new ArrayList<DossierStatisticSoap>(models.size());

		for (DossierStatistic model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DossierStatisticSoap[soapModels.size()]);
	}

	public DossierStatisticSoap() {
	}

	public long getPrimaryKey() {
		return _dossierStatisticId;
	}

	public void setPrimaryKey(long pk) {
		setDossierStatisticId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getDossierStatisticId() {
		return _dossierStatisticId;
	}

	public void setDossierStatisticId(long dossierStatisticId) {
		_dossierStatisticId = dossierStatisticId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public int getMonth() {
		return _month;
	}

	public void setMonth(int month) {
		_month = month;
	}

	public int getYear() {
		return _year;
	}

	public void setYear(int year) {
		_year = year;
	}

	public int getRemainingCount() {
		return _remainingCount;
	}

	public void setRemainingCount(int remainingCount) {
		_remainingCount = remainingCount;
	}

	public int getReceivedCount() {
		return _receivedCount;
	}

	public void setReceivedCount(int receivedCount) {
		_receivedCount = receivedCount;
	}

	public int getOnlineCount() {
		return _onlineCount;
	}

	public void setOnlineCount(int onlineCount) {
		_onlineCount = onlineCount;
	}

	public int getUndueCount() {
		return _undueCount;
	}

	public void setUndueCount(int undueCount) {
		_undueCount = undueCount;
	}

	public int getOverdueCount() {
		return _overdueCount;
	}

	public void setOverdueCount(int overdueCount) {
		_overdueCount = overdueCount;
	}

	public int getOntimeCount() {
		return _ontimeCount;
	}

	public void setOntimeCount(int ontimeCount) {
		_ontimeCount = ontimeCount;
	}

	public int getOvertimeCount() {
		return _overtimeCount;
	}

	public void setOvertimeCount(int overtimeCount) {
		_overtimeCount = overtimeCount;
	}

	public String getGovAgencyCode() {
		return _govAgencyCode;
	}

	public void setGovAgencyCode(String govAgencyCode) {
		_govAgencyCode = govAgencyCode;
	}

	public String getGovAgencyName() {
		return _govAgencyName;
	}

	public void setGovAgencyName(String govAgencyName) {
		_govAgencyName = govAgencyName;
	}

	public String getDomainCode() {
		return _domainCode;
	}

	public void setDomainCode(String domainCode) {
		_domainCode = domainCode;
	}

	public String getDomainName() {
		return _domainName;
	}

	public void setDomainName(String domainName) {
		_domainName = domainName;
	}

	public int getAdministrationLevel() {
		return _administrationLevel;
	}

	public void setAdministrationLevel(int administrationLevel) {
		_administrationLevel = administrationLevel;
	}

	public boolean getReporting() {
		return _reporting;
	}

	public boolean isReporting() {
		return _reporting;
	}

	public void setReporting(boolean reporting) {
		_reporting = reporting;
	}

	private String _uuid;
	private long _dossierStatisticId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _month;
	private int _year;
	private int _remainingCount;
	private int _receivedCount;
	private int _onlineCount;
	private int _undueCount;
	private int _overdueCount;
	private int _ontimeCount;
	private int _overtimeCount;
	private String _govAgencyCode;
	private String _govAgencyName;
	private String _domainCode;
	private String _domainName;
	private int _administrationLevel;
	private boolean _reporting;
}