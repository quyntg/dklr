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

package org.opencps.dossiermgt.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import org.opencps.dossiermgt.model.DossierStatistic;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DossierStatistic in entity cache.
 *
 * @author huymq
 * @see DossierStatistic
 * @generated
 */
@ProviderType
public class DossierStatisticCacheModel implements CacheModel<DossierStatistic>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierStatisticCacheModel)) {
			return false;
		}

		DossierStatisticCacheModel dossierStatisticCacheModel = (DossierStatisticCacheModel)obj;

		if (dossierStatisticId == dossierStatisticCacheModel.dossierStatisticId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, dossierStatisticId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", dossierStatisticId=");
		sb.append(dossierStatisticId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", month=");
		sb.append(month);
		sb.append(", year=");
		sb.append(year);
		sb.append(", remainingCount=");
		sb.append(remainingCount);
		sb.append(", receivedCount=");
		sb.append(receivedCount);
		sb.append(", onlineCount=");
		sb.append(onlineCount);
		sb.append(", undueCount=");
		sb.append(undueCount);
		sb.append(", overdueCount=");
		sb.append(overdueCount);
		sb.append(", ontimeCount=");
		sb.append(ontimeCount);
		sb.append(", overtimeCount=");
		sb.append(overtimeCount);
		sb.append(", govAgencyCode=");
		sb.append(govAgencyCode);
		sb.append(", govAgencyName=");
		sb.append(govAgencyName);
		sb.append(", domainCode=");
		sb.append(domainCode);
		sb.append(", domainName=");
		sb.append(domainName);
		sb.append(", administrationLevel=");
		sb.append(administrationLevel);
		sb.append(", reporting=");
		sb.append(reporting);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierStatistic toEntityModel() {
		DossierStatisticImpl dossierStatisticImpl = new DossierStatisticImpl();

		if (uuid == null) {
			dossierStatisticImpl.setUuid(StringPool.BLANK);
		}
		else {
			dossierStatisticImpl.setUuid(uuid);
		}

		dossierStatisticImpl.setDossierStatisticId(dossierStatisticId);
		dossierStatisticImpl.setCompanyId(companyId);
		dossierStatisticImpl.setGroupId(groupId);
		dossierStatisticImpl.setUserId(userId);

		if (userName == null) {
			dossierStatisticImpl.setUserName(StringPool.BLANK);
		}
		else {
			dossierStatisticImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			dossierStatisticImpl.setCreateDate(null);
		}
		else {
			dossierStatisticImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dossierStatisticImpl.setModifiedDate(null);
		}
		else {
			dossierStatisticImpl.setModifiedDate(new Date(modifiedDate));
		}

		dossierStatisticImpl.setMonth(month);
		dossierStatisticImpl.setYear(year);
		dossierStatisticImpl.setRemainingCount(remainingCount);
		dossierStatisticImpl.setReceivedCount(receivedCount);
		dossierStatisticImpl.setOnlineCount(onlineCount);
		dossierStatisticImpl.setUndueCount(undueCount);
		dossierStatisticImpl.setOverdueCount(overdueCount);
		dossierStatisticImpl.setOntimeCount(ontimeCount);
		dossierStatisticImpl.setOvertimeCount(overtimeCount);

		if (govAgencyCode == null) {
			dossierStatisticImpl.setGovAgencyCode(StringPool.BLANK);
		}
		else {
			dossierStatisticImpl.setGovAgencyCode(govAgencyCode);
		}

		if (govAgencyName == null) {
			dossierStatisticImpl.setGovAgencyName(StringPool.BLANK);
		}
		else {
			dossierStatisticImpl.setGovAgencyName(govAgencyName);
		}

		if (domainCode == null) {
			dossierStatisticImpl.setDomainCode(StringPool.BLANK);
		}
		else {
			dossierStatisticImpl.setDomainCode(domainCode);
		}

		if (domainName == null) {
			dossierStatisticImpl.setDomainName(StringPool.BLANK);
		}
		else {
			dossierStatisticImpl.setDomainName(domainName);
		}

		dossierStatisticImpl.setAdministrationLevel(administrationLevel);
		dossierStatisticImpl.setReporting(reporting);

		dossierStatisticImpl.resetOriginalValues();

		return dossierStatisticImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		dossierStatisticId = objectInput.readLong();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		month = objectInput.readInt();

		year = objectInput.readInt();

		remainingCount = objectInput.readInt();

		receivedCount = objectInput.readInt();

		onlineCount = objectInput.readInt();

		undueCount = objectInput.readInt();

		overdueCount = objectInput.readInt();

		ontimeCount = objectInput.readInt();

		overtimeCount = objectInput.readInt();
		govAgencyCode = objectInput.readUTF();
		govAgencyName = objectInput.readUTF();
		domainCode = objectInput.readUTF();
		domainName = objectInput.readUTF();

		administrationLevel = objectInput.readInt();

		reporting = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(dossierStatisticId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(month);

		objectOutput.writeInt(year);

		objectOutput.writeInt(remainingCount);

		objectOutput.writeInt(receivedCount);

		objectOutput.writeInt(onlineCount);

		objectOutput.writeInt(undueCount);

		objectOutput.writeInt(overdueCount);

		objectOutput.writeInt(ontimeCount);

		objectOutput.writeInt(overtimeCount);

		if (govAgencyCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgencyCode);
		}

		if (govAgencyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgencyName);
		}

		if (domainCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(domainCode);
		}

		if (domainName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(domainName);
		}

		objectOutput.writeInt(administrationLevel);

		objectOutput.writeBoolean(reporting);
	}

	public String uuid;
	public long dossierStatisticId;
	public long companyId;
	public long groupId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int month;
	public int year;
	public int remainingCount;
	public int receivedCount;
	public int onlineCount;
	public int undueCount;
	public int overdueCount;
	public int ontimeCount;
	public int overtimeCount;
	public String govAgencyCode;
	public String govAgencyName;
	public String domainCode;
	public String domainName;
	public int administrationLevel;
	public boolean reporting;
}