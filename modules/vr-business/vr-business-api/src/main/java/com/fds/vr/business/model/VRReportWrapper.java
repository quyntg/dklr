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
 * This class is a wrapper for {@link VRReport}.
 * </p>
 *
 * @author LamTV
 * @see VRReport
 * @generated
 */
@ProviderType
public class VRReportWrapper implements VRReport, ModelWrapper<VRReport> {
	public VRReportWrapper(VRReport vrReport) {
		_vrReport = vrReport;
	}

	@Override
	public Class<?> getModelClass() {
		return VRReport.class;
	}

	@Override
	public String getModelClassName() {
		return VRReport.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("reportCode", getReportCode());
		attributes.put("reportName", getReportName());
		attributes.put("formReport", getFormReport());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String reportCode = (String)attributes.get("reportCode");

		if (reportCode != null) {
			setReportCode(reportCode);
		}

		String reportName = (String)attributes.get("reportName");

		if (reportName != null) {
			setReportName(reportName);
		}

		String formReport = (String)attributes.get("formReport");

		if (formReport != null) {
			setFormReport(formReport);
		}
	}

	@Override
	public VRReport toEscapedModel() {
		return new VRReportWrapper(_vrReport.toEscapedModel());
	}

	@Override
	public VRReport toUnescapedModel() {
		return new VRReportWrapper(_vrReport.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrReport.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrReport.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrReport.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrReport.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRReport> toCacheModel() {
		return _vrReport.toCacheModel();
	}

	@Override
	public int compareTo(VRReport vrReport) {
		return _vrReport.compareTo(vrReport);
	}

	@Override
	public int hashCode() {
		return _vrReport.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrReport.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRReportWrapper((VRReport)_vrReport.clone());
	}

	/**
	* Returns the form report of this vr report.
	*
	* @return the form report of this vr report
	*/
	@Override
	public java.lang.String getFormReport() {
		return _vrReport.getFormReport();
	}

	/**
	* Returns the report code of this vr report.
	*
	* @return the report code of this vr report
	*/
	@Override
	public java.lang.String getReportCode() {
		return _vrReport.getReportCode();
	}

	/**
	* Returns the report name of this vr report.
	*
	* @return the report name of this vr report
	*/
	@Override
	public java.lang.String getReportName() {
		return _vrReport.getReportName();
	}

	@Override
	public java.lang.String toString() {
		return _vrReport.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrReport.toXmlString();
	}

	/**
	* Returns the ID of this vr report.
	*
	* @return the ID of this vr report
	*/
	@Override
	public long getId() {
		return _vrReport.getId();
	}

	/**
	* Returns the primary key of this vr report.
	*
	* @return the primary key of this vr report
	*/
	@Override
	public long getPrimaryKey() {
		return _vrReport.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vrReport.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrReport.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrReport.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrReport.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrReport.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the form report of this vr report.
	*
	* @param formReport the form report of this vr report
	*/
	@Override
	public void setFormReport(java.lang.String formReport) {
		_vrReport.setFormReport(formReport);
	}

	/**
	* Sets the ID of this vr report.
	*
	* @param id the ID of this vr report
	*/
	@Override
	public void setId(long id) {
		_vrReport.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_vrReport.setNew(n);
	}

	/**
	* Sets the primary key of this vr report.
	*
	* @param primaryKey the primary key of this vr report
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrReport.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrReport.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the report code of this vr report.
	*
	* @param reportCode the report code of this vr report
	*/
	@Override
	public void setReportCode(java.lang.String reportCode) {
		_vrReport.setReportCode(reportCode);
	}

	/**
	* Sets the report name of this vr report.
	*
	* @param reportName the report name of this vr report
	*/
	@Override
	public void setReportName(java.lang.String reportName) {
		_vrReport.setReportName(reportName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRReportWrapper)) {
			return false;
		}

		VRReportWrapper vrReportWrapper = (VRReportWrapper)obj;

		if (Objects.equals(_vrReport, vrReportWrapper._vrReport)) {
			return true;
		}

		return false;
	}

	@Override
	public VRReport getWrappedModel() {
		return _vrReport;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrReport.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrReport.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrReport.resetOriginalValues();
	}

	private final VRReport _vrReport;
}