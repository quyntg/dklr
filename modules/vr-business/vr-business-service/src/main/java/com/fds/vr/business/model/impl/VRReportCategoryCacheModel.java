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

import com.fds.vr.business.model.VRReportCategory;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VRReportCategory in entity cache.
 *
 * @author LamTV
 * @see VRReportCategory
 * @generated
 */
@ProviderType
public class VRReportCategoryCacheModel implements CacheModel<VRReportCategory>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRReportCategoryCacheModel)) {
			return false;
		}

		VRReportCategoryCacheModel vrReportCategoryCacheModel = (VRReportCategoryCacheModel)obj;

		if (id == vrReportCategoryCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", rptCode=");
		sb.append(rptCode);
		sb.append(", rptName=");
		sb.append(rptName);
		sb.append(", rptDescription=");
		sb.append(rptDescription);
		sb.append(", rptGroup=");
		sb.append(rptGroup);
		sb.append(", rptLevel=");
		sb.append(rptLevel);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", jasperFileTemplate=");
		sb.append(jasperFileTemplate);
		sb.append(", excelFileTemplate=");
		sb.append(excelFileTemplate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRReportCategory toEntityModel() {
		VRReportCategoryImpl vrReportCategoryImpl = new VRReportCategoryImpl();

		vrReportCategoryImpl.setId(id);

		if (rptCode == null) {
			vrReportCategoryImpl.setRptCode(StringPool.BLANK);
		}
		else {
			vrReportCategoryImpl.setRptCode(rptCode);
		}

		if (rptName == null) {
			vrReportCategoryImpl.setRptName(StringPool.BLANK);
		}
		else {
			vrReportCategoryImpl.setRptName(rptName);
		}

		if (rptDescription == null) {
			vrReportCategoryImpl.setRptDescription(StringPool.BLANK);
		}
		else {
			vrReportCategoryImpl.setRptDescription(rptDescription);
		}

		if (rptGroup == null) {
			vrReportCategoryImpl.setRptGroup(StringPool.BLANK);
		}
		else {
			vrReportCategoryImpl.setRptGroup(rptGroup);
		}

		vrReportCategoryImpl.setRptLevel(rptLevel);
		vrReportCategoryImpl.setSequenceNo(sequenceNo);

		if (jasperFileTemplate == null) {
			vrReportCategoryImpl.setJasperFileTemplate(StringPool.BLANK);
		}
		else {
			vrReportCategoryImpl.setJasperFileTemplate(jasperFileTemplate);
		}

		if (excelFileTemplate == null) {
			vrReportCategoryImpl.setExcelFileTemplate(StringPool.BLANK);
		}
		else {
			vrReportCategoryImpl.setExcelFileTemplate(excelFileTemplate);
		}

		if (modifiedDate == Long.MIN_VALUE) {
			vrReportCategoryImpl.setModifiedDate(null);
		}
		else {
			vrReportCategoryImpl.setModifiedDate(new Date(modifiedDate));
		}

		vrReportCategoryImpl.resetOriginalValues();

		return vrReportCategoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		rptCode = objectInput.readUTF();
		rptName = objectInput.readUTF();
		rptDescription = objectInput.readUTF();
		rptGroup = objectInput.readUTF();

		rptLevel = objectInput.readInt();

		sequenceNo = objectInput.readInt();
		jasperFileTemplate = objectInput.readUTF();
		excelFileTemplate = objectInput.readUTF();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);

		if (rptCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(rptCode);
		}

		if (rptName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(rptName);
		}

		if (rptDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(rptDescription);
		}

		if (rptGroup == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(rptGroup);
		}

		objectOutput.writeInt(rptLevel);

		objectOutput.writeInt(sequenceNo);

		if (jasperFileTemplate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(jasperFileTemplate);
		}

		if (excelFileTemplate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(excelFileTemplate);
		}

		objectOutput.writeLong(modifiedDate);
	}

	public int id;
	public String rptCode;
	public String rptName;
	public String rptDescription;
	public String rptGroup;
	public int rptLevel;
	public int sequenceNo;
	public String jasperFileTemplate;
	public String excelFileTemplate;
	public long modifiedDate;
}