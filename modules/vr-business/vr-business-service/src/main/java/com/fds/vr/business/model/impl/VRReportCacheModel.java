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

import com.fds.vr.business.model.VRReport;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VRReport in entity cache.
 *
 * @author LamTV
 * @see VRReport
 * @generated
 */
@ProviderType
public class VRReportCacheModel implements CacheModel<VRReport>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRReportCacheModel)) {
			return false;
		}

		VRReportCacheModel vrReportCacheModel = (VRReportCacheModel)obj;

		if (id == vrReportCacheModel.id) {
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
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", reportCode=");
		sb.append(reportCode);
		sb.append(", reportName=");
		sb.append(reportName);
		sb.append(", formReport=");
		sb.append(formReport);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRReport toEntityModel() {
		VRReportImpl vrReportImpl = new VRReportImpl();

		vrReportImpl.setId(id);

		if (reportCode == null) {
			vrReportImpl.setReportCode(StringPool.BLANK);
		}
		else {
			vrReportImpl.setReportCode(reportCode);
		}

		if (reportName == null) {
			vrReportImpl.setReportName(StringPool.BLANK);
		}
		else {
			vrReportImpl.setReportName(reportName);
		}

		if (formReport == null) {
			vrReportImpl.setFormReport(StringPool.BLANK);
		}
		else {
			vrReportImpl.setFormReport(formReport);
		}

		vrReportImpl.resetOriginalValues();

		return vrReportImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		reportCode = objectInput.readUTF();
		reportName = objectInput.readUTF();
		formReport = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (reportCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reportCode);
		}

		if (reportName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reportName);
		}

		if (formReport == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(formReport);
		}
	}

	public long id;
	public String reportCode;
	public String reportName;
	public String formReport;
}