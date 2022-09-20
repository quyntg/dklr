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

import org.opencps.dossiermgt.model.RegistrationTemplates;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RegistrationTemplates in entity cache.
 *
 * @author huymq
 * @see RegistrationTemplates
 * @generated
 */
@ProviderType
public class RegistrationTemplatesCacheModel implements CacheModel<RegistrationTemplates>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RegistrationTemplatesCacheModel)) {
			return false;
		}

		RegistrationTemplatesCacheModel registrationTemplatesCacheModel = (RegistrationTemplatesCacheModel)obj;

		if (registrationTemplateId == registrationTemplatesCacheModel.registrationTemplateId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, registrationTemplateId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", registrationTemplateId=");
		sb.append(registrationTemplateId);
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
		sb.append(", govAgencyCode=");
		sb.append(govAgencyCode);
		sb.append(", govAgencyName=");
		sb.append(govAgencyName);
		sb.append(", formNo=");
		sb.append(formNo);
		sb.append(", formName=");
		sb.append(formName);
		sb.append(", multiple=");
		sb.append(multiple);
		sb.append(", formScript=");
		sb.append(formScript);
		sb.append(", formReport=");
		sb.append(formReport);
		sb.append(", sampleData=");
		sb.append(sampleData);
		sb.append(", formScriptOfficial=");
		sb.append(formScriptOfficial);
		sb.append(", formReportOfficial=");
		sb.append(formReportOfficial);
		sb.append(", sampleDataOfficial=");
		sb.append(sampleDataOfficial);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RegistrationTemplates toEntityModel() {
		RegistrationTemplatesImpl registrationTemplatesImpl = new RegistrationTemplatesImpl();

		if (uuid == null) {
			registrationTemplatesImpl.setUuid(StringPool.BLANK);
		}
		else {
			registrationTemplatesImpl.setUuid(uuid);
		}

		registrationTemplatesImpl.setRegistrationTemplateId(registrationTemplateId);
		registrationTemplatesImpl.setGroupId(groupId);
		registrationTemplatesImpl.setUserId(userId);

		if (userName == null) {
			registrationTemplatesImpl.setUserName(StringPool.BLANK);
		}
		else {
			registrationTemplatesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			registrationTemplatesImpl.setCreateDate(null);
		}
		else {
			registrationTemplatesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			registrationTemplatesImpl.setModifiedDate(null);
		}
		else {
			registrationTemplatesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (govAgencyCode == null) {
			registrationTemplatesImpl.setGovAgencyCode(StringPool.BLANK);
		}
		else {
			registrationTemplatesImpl.setGovAgencyCode(govAgencyCode);
		}

		if (govAgencyName == null) {
			registrationTemplatesImpl.setGovAgencyName(StringPool.BLANK);
		}
		else {
			registrationTemplatesImpl.setGovAgencyName(govAgencyName);
		}

		if (formNo == null) {
			registrationTemplatesImpl.setFormNo(StringPool.BLANK);
		}
		else {
			registrationTemplatesImpl.setFormNo(formNo);
		}

		if (formName == null) {
			registrationTemplatesImpl.setFormName(StringPool.BLANK);
		}
		else {
			registrationTemplatesImpl.setFormName(formName);
		}

		registrationTemplatesImpl.setMultiple(multiple);

		if (formScript == null) {
			registrationTemplatesImpl.setFormScript(StringPool.BLANK);
		}
		else {
			registrationTemplatesImpl.setFormScript(formScript);
		}

		if (formReport == null) {
			registrationTemplatesImpl.setFormReport(StringPool.BLANK);
		}
		else {
			registrationTemplatesImpl.setFormReport(formReport);
		}

		if (sampleData == null) {
			registrationTemplatesImpl.setSampleData(StringPool.BLANK);
		}
		else {
			registrationTemplatesImpl.setSampleData(sampleData);
		}

		if (formScriptOfficial == null) {
			registrationTemplatesImpl.setFormScriptOfficial(StringPool.BLANK);
		}
		else {
			registrationTemplatesImpl.setFormScriptOfficial(formScriptOfficial);
		}

		if (formReportOfficial == null) {
			registrationTemplatesImpl.setFormReportOfficial(StringPool.BLANK);
		}
		else {
			registrationTemplatesImpl.setFormReportOfficial(formReportOfficial);
		}

		if (sampleDataOfficial == null) {
			registrationTemplatesImpl.setSampleDataOfficial(StringPool.BLANK);
		}
		else {
			registrationTemplatesImpl.setSampleDataOfficial(sampleDataOfficial);
		}

		registrationTemplatesImpl.resetOriginalValues();

		return registrationTemplatesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		registrationTemplateId = objectInput.readLong();

		groupId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		govAgencyCode = objectInput.readUTF();
		govAgencyName = objectInput.readUTF();
		formNo = objectInput.readUTF();
		formName = objectInput.readUTF();

		multiple = objectInput.readBoolean();
		formScript = objectInput.readUTF();
		formReport = objectInput.readUTF();
		sampleData = objectInput.readUTF();
		formScriptOfficial = objectInput.readUTF();
		formReportOfficial = objectInput.readUTF();
		sampleDataOfficial = objectInput.readUTF();
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

		objectOutput.writeLong(registrationTemplateId);

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

		if (formNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(formNo);
		}

		if (formName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(formName);
		}

		objectOutput.writeBoolean(multiple);

		if (formScript == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(formScript);
		}

		if (formReport == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(formReport);
		}

		if (sampleData == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sampleData);
		}

		if (formScriptOfficial == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(formScriptOfficial);
		}

		if (formReportOfficial == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(formReportOfficial);
		}

		if (sampleDataOfficial == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sampleDataOfficial);
		}
	}

	public String uuid;
	public long registrationTemplateId;
	public long groupId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String govAgencyCode;
	public String govAgencyName;
	public String formNo;
	public String formName;
	public boolean multiple;
	public String formScript;
	public String formReport;
	public String sampleData;
	public String formScriptOfficial;
	public String formReportOfficial;
	public String sampleDataOfficial;
}