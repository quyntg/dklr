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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VRReportCategory}.
 * </p>
 *
 * @author LamTV
 * @see VRReportCategory
 * @generated
 */
@ProviderType
public class VRReportCategoryWrapper implements VRReportCategory,
	ModelWrapper<VRReportCategory> {
	public VRReportCategoryWrapper(VRReportCategory vrReportCategory) {
		_vrReportCategory = vrReportCategory;
	}

	@Override
	public Class<?> getModelClass() {
		return VRReportCategory.class;
	}

	@Override
	public String getModelClassName() {
		return VRReportCategory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("rptCode", getRptCode());
		attributes.put("rptName", getRptName());
		attributes.put("rptDescription", getRptDescription());
		attributes.put("rptGroup", getRptGroup());
		attributes.put("rptLevel", getRptLevel());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("jasperFileTemplate", getJasperFileTemplate());
		attributes.put("excelFileTemplate", getExcelFileTemplate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String rptCode = (String)attributes.get("rptCode");

		if (rptCode != null) {
			setRptCode(rptCode);
		}

		String rptName = (String)attributes.get("rptName");

		if (rptName != null) {
			setRptName(rptName);
		}

		String rptDescription = (String)attributes.get("rptDescription");

		if (rptDescription != null) {
			setRptDescription(rptDescription);
		}

		String rptGroup = (String)attributes.get("rptGroup");

		if (rptGroup != null) {
			setRptGroup(rptGroup);
		}

		Integer rptLevel = (Integer)attributes.get("rptLevel");

		if (rptLevel != null) {
			setRptLevel(rptLevel);
		}

		Integer sequenceNo = (Integer)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String jasperFileTemplate = (String)attributes.get("jasperFileTemplate");

		if (jasperFileTemplate != null) {
			setJasperFileTemplate(jasperFileTemplate);
		}

		String excelFileTemplate = (String)attributes.get("excelFileTemplate");

		if (excelFileTemplate != null) {
			setExcelFileTemplate(excelFileTemplate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public VRReportCategory toEscapedModel() {
		return new VRReportCategoryWrapper(_vrReportCategory.toEscapedModel());
	}

	@Override
	public VRReportCategory toUnescapedModel() {
		return new VRReportCategoryWrapper(_vrReportCategory.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrReportCategory.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrReportCategory.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrReportCategory.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrReportCategory.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRReportCategory> toCacheModel() {
		return _vrReportCategory.toCacheModel();
	}

	@Override
	public int compareTo(VRReportCategory vrReportCategory) {
		return _vrReportCategory.compareTo(vrReportCategory);
	}

	/**
	* Returns the ID of this vr report category.
	*
	* @return the ID of this vr report category
	*/
	@Override
	public int getId() {
		return _vrReportCategory.getId();
	}

	/**
	* Returns the primary key of this vr report category.
	*
	* @return the primary key of this vr report category
	*/
	@Override
	public int getPrimaryKey() {
		return _vrReportCategory.getPrimaryKey();
	}

	/**
	* Returns the rpt level of this vr report category.
	*
	* @return the rpt level of this vr report category
	*/
	@Override
	public int getRptLevel() {
		return _vrReportCategory.getRptLevel();
	}

	/**
	* Returns the sequence no of this vr report category.
	*
	* @return the sequence no of this vr report category
	*/
	@Override
	public int getSequenceNo() {
		return _vrReportCategory.getSequenceNo();
	}

	@Override
	public int hashCode() {
		return _vrReportCategory.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrReportCategory.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRReportCategoryWrapper((VRReportCategory)_vrReportCategory.clone());
	}

	/**
	* Returns the excel file template of this vr report category.
	*
	* @return the excel file template of this vr report category
	*/
	@Override
	public java.lang.String getExcelFileTemplate() {
		return _vrReportCategory.getExcelFileTemplate();
	}

	/**
	* Returns the jasper file template of this vr report category.
	*
	* @return the jasper file template of this vr report category
	*/
	@Override
	public java.lang.String getJasperFileTemplate() {
		return _vrReportCategory.getJasperFileTemplate();
	}

	/**
	* Returns the rpt code of this vr report category.
	*
	* @return the rpt code of this vr report category
	*/
	@Override
	public java.lang.String getRptCode() {
		return _vrReportCategory.getRptCode();
	}

	/**
	* Returns the rpt description of this vr report category.
	*
	* @return the rpt description of this vr report category
	*/
	@Override
	public java.lang.String getRptDescription() {
		return _vrReportCategory.getRptDescription();
	}

	/**
	* Returns the rpt group of this vr report category.
	*
	* @return the rpt group of this vr report category
	*/
	@Override
	public java.lang.String getRptGroup() {
		return _vrReportCategory.getRptGroup();
	}

	/**
	* Returns the rpt name of this vr report category.
	*
	* @return the rpt name of this vr report category
	*/
	@Override
	public java.lang.String getRptName() {
		return _vrReportCategory.getRptName();
	}

	@Override
	public java.lang.String toString() {
		return _vrReportCategory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrReportCategory.toXmlString();
	}

	/**
	* Returns the modified date of this vr report category.
	*
	* @return the modified date of this vr report category
	*/
	@Override
	public Date getModifiedDate() {
		return _vrReportCategory.getModifiedDate();
	}

	@Override
	public void persist() {
		_vrReportCategory.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrReportCategory.setCachedModel(cachedModel);
	}

	/**
	* Sets the excel file template of this vr report category.
	*
	* @param excelFileTemplate the excel file template of this vr report category
	*/
	@Override
	public void setExcelFileTemplate(java.lang.String excelFileTemplate) {
		_vrReportCategory.setExcelFileTemplate(excelFileTemplate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrReportCategory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrReportCategory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrReportCategory.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr report category.
	*
	* @param id the ID of this vr report category
	*/
	@Override
	public void setId(int id) {
		_vrReportCategory.setId(id);
	}

	/**
	* Sets the jasper file template of this vr report category.
	*
	* @param jasperFileTemplate the jasper file template of this vr report category
	*/
	@Override
	public void setJasperFileTemplate(java.lang.String jasperFileTemplate) {
		_vrReportCategory.setJasperFileTemplate(jasperFileTemplate);
	}

	/**
	* Sets the modified date of this vr report category.
	*
	* @param modifiedDate the modified date of this vr report category
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vrReportCategory.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_vrReportCategory.setNew(n);
	}

	/**
	* Sets the primary key of this vr report category.
	*
	* @param primaryKey the primary key of this vr report category
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_vrReportCategory.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrReportCategory.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the rpt code of this vr report category.
	*
	* @param rptCode the rpt code of this vr report category
	*/
	@Override
	public void setRptCode(java.lang.String rptCode) {
		_vrReportCategory.setRptCode(rptCode);
	}

	/**
	* Sets the rpt description of this vr report category.
	*
	* @param rptDescription the rpt description of this vr report category
	*/
	@Override
	public void setRptDescription(java.lang.String rptDescription) {
		_vrReportCategory.setRptDescription(rptDescription);
	}

	/**
	* Sets the rpt group of this vr report category.
	*
	* @param rptGroup the rpt group of this vr report category
	*/
	@Override
	public void setRptGroup(java.lang.String rptGroup) {
		_vrReportCategory.setRptGroup(rptGroup);
	}

	/**
	* Sets the rpt level of this vr report category.
	*
	* @param rptLevel the rpt level of this vr report category
	*/
	@Override
	public void setRptLevel(int rptLevel) {
		_vrReportCategory.setRptLevel(rptLevel);
	}

	/**
	* Sets the rpt name of this vr report category.
	*
	* @param rptName the rpt name of this vr report category
	*/
	@Override
	public void setRptName(java.lang.String rptName) {
		_vrReportCategory.setRptName(rptName);
	}

	/**
	* Sets the sequence no of this vr report category.
	*
	* @param sequenceNo the sequence no of this vr report category
	*/
	@Override
	public void setSequenceNo(int sequenceNo) {
		_vrReportCategory.setSequenceNo(sequenceNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRReportCategoryWrapper)) {
			return false;
		}

		VRReportCategoryWrapper vrReportCategoryWrapper = (VRReportCategoryWrapper)obj;

		if (Objects.equals(_vrReportCategory,
					vrReportCategoryWrapper._vrReportCategory)) {
			return true;
		}

		return false;
	}

	@Override
	public VRReportCategory getWrappedModel() {
		return _vrReportCategory;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrReportCategory.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrReportCategory.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrReportCategory.resetOriginalValues();
	}

	private final VRReportCategory _vrReportCategory;
}