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
 * This class is a wrapper for {@link VRMethodOfIssue}.
 * </p>
 *
 * @author LamTV
 * @see VRMethodOfIssue
 * @generated
 */
@ProviderType
public class VRMethodOfIssueWrapper implements VRMethodOfIssue,
	ModelWrapper<VRMethodOfIssue> {
	public VRMethodOfIssueWrapper(VRMethodOfIssue vrMethodOfIssue) {
		_vrMethodOfIssue = vrMethodOfIssue;
	}

	@Override
	public Class<?> getModelClass() {
		return VRMethodOfIssue.class;
	}

	@Override
	public String getModelClassName() {
		return VRMethodOfIssue.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("vehicleClass", getVehicleClass());
		attributes.put("certifiedAssemblyType", getCertifiedAssemblyType());
		attributes.put("certifiedAssemblyTypeDescription",
			getCertifiedAssemblyTypeDescription());
		attributes.put("applicantProfileId", getApplicantProfileId());
		attributes.put("applicantName", getApplicantName());
		attributes.put("applicantAddress", getApplicantAddress());
		attributes.put("productionPlantId", getProductionPlantId());
		attributes.put("productionPlantCode", getProductionPlantCode());
		attributes.put("productionPlantName", getProductionPlantName());
		attributes.put("productionPlantAddress", getProductionPlantAddress());
		attributes.put("methodOfIssue", getMethodOfIssue());
		attributes.put("methodApproved", getMethodApproved());
		attributes.put("methodInMonth", getMethodInMonth());
		attributes.put("methodInYear", getMethodInYear());
		attributes.put("periodDuration", getPeriodDuration());
		attributes.put("frequencyIndex", getFrequencyIndex());
		attributes.put("remarks", getRemarks());
		attributes.put("averageStbQuantityIndex", getAverageStbQuantityIndex());
		attributes.put("maxMonthQuantityIndex", getMaxMonthQuantityIndex());
		attributes.put("averageStmQuantityIndex", getAverageStmQuantityIndex());
		attributes.put("accumulatedMonthQuantityIndex",
			getAccumulatedMonthQuantityIndex());
		attributes.put("latestOtherIndex1", getLatestOtherIndex1());
		attributes.put("latestOtherIndex2", getLatestOtherIndex2());
		attributes.put("latestOtherIndex3", getLatestOtherIndex3());
		attributes.put("latestCOPReportDate", getLatestCOPReportDate());
		attributes.put("latestInspectionRecordDate",
			getLatestInspectionRecordDate());
		attributes.put("latestNumberOfInspectionInYear",
			getLatestNumberOfInspectionInYear());
		attributes.put("latestNumberOfInspectionInMonth",
			getLatestNumberOfInspectionInMonth());
		attributes.put("latestNumberOfStampInMonth",
			getLatestNumberOfStampInMonth());
		attributes.put("periodStartFrom", getPeriodStartFrom());
		attributes.put("totalInspection", getTotalInspection());
		attributes.put("flowIndex", getFlowIndex());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long mtCore = (Long)attributes.get("mtCore");

		if (mtCore != null) {
			setMtCore(mtCore);
		}

		String vehicleClass = (String)attributes.get("vehicleClass");

		if (vehicleClass != null) {
			setVehicleClass(vehicleClass);
		}

		String certifiedAssemblyType = (String)attributes.get(
				"certifiedAssemblyType");

		if (certifiedAssemblyType != null) {
			setCertifiedAssemblyType(certifiedAssemblyType);
		}

		String certifiedAssemblyTypeDescription = (String)attributes.get(
				"certifiedAssemblyTypeDescription");

		if (certifiedAssemblyTypeDescription != null) {
			setCertifiedAssemblyTypeDescription(certifiedAssemblyTypeDescription);
		}

		Long applicantProfileId = (Long)attributes.get("applicantProfileId");

		if (applicantProfileId != null) {
			setApplicantProfileId(applicantProfileId);
		}

		String applicantName = (String)attributes.get("applicantName");

		if (applicantName != null) {
			setApplicantName(applicantName);
		}

		String applicantAddress = (String)attributes.get("applicantAddress");

		if (applicantAddress != null) {
			setApplicantAddress(applicantAddress);
		}

		Long productionPlantId = (Long)attributes.get("productionPlantId");

		if (productionPlantId != null) {
			setProductionPlantId(productionPlantId);
		}

		String productionPlantCode = (String)attributes.get(
				"productionPlantCode");

		if (productionPlantCode != null) {
			setProductionPlantCode(productionPlantCode);
		}

		String productionPlantName = (String)attributes.get(
				"productionPlantName");

		if (productionPlantName != null) {
			setProductionPlantName(productionPlantName);
		}

		String productionPlantAddress = (String)attributes.get(
				"productionPlantAddress");

		if (productionPlantAddress != null) {
			setProductionPlantAddress(productionPlantAddress);
		}

		String methodOfIssue = (String)attributes.get("methodOfIssue");

		if (methodOfIssue != null) {
			setMethodOfIssue(methodOfIssue);
		}

		Integer methodApproved = (Integer)attributes.get("methodApproved");

		if (methodApproved != null) {
			setMethodApproved(methodApproved);
		}

		Integer methodInMonth = (Integer)attributes.get("methodInMonth");

		if (methodInMonth != null) {
			setMethodInMonth(methodInMonth);
		}

		Integer methodInYear = (Integer)attributes.get("methodInYear");

		if (methodInYear != null) {
			setMethodInYear(methodInYear);
		}

		Integer periodDuration = (Integer)attributes.get("periodDuration");

		if (periodDuration != null) {
			setPeriodDuration(periodDuration);
		}

		Integer frequencyIndex = (Integer)attributes.get("frequencyIndex");

		if (frequencyIndex != null) {
			setFrequencyIndex(frequencyIndex);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Integer averageStbQuantityIndex = (Integer)attributes.get(
				"averageStbQuantityIndex");

		if (averageStbQuantityIndex != null) {
			setAverageStbQuantityIndex(averageStbQuantityIndex);
		}

		Integer maxMonthQuantityIndex = (Integer)attributes.get(
				"maxMonthQuantityIndex");

		if (maxMonthQuantityIndex != null) {
			setMaxMonthQuantityIndex(maxMonthQuantityIndex);
		}

		Integer averageStmQuantityIndex = (Integer)attributes.get(
				"averageStmQuantityIndex");

		if (averageStmQuantityIndex != null) {
			setAverageStmQuantityIndex(averageStmQuantityIndex);
		}

		Integer accumulatedMonthQuantityIndex = (Integer)attributes.get(
				"accumulatedMonthQuantityIndex");

		if (accumulatedMonthQuantityIndex != null) {
			setAccumulatedMonthQuantityIndex(accumulatedMonthQuantityIndex);
		}

		Integer latestOtherIndex1 = (Integer)attributes.get("latestOtherIndex1");

		if (latestOtherIndex1 != null) {
			setLatestOtherIndex1(latestOtherIndex1);
		}

		Integer latestOtherIndex2 = (Integer)attributes.get("latestOtherIndex2");

		if (latestOtherIndex2 != null) {
			setLatestOtherIndex2(latestOtherIndex2);
		}

		Integer latestOtherIndex3 = (Integer)attributes.get("latestOtherIndex3");

		if (latestOtherIndex3 != null) {
			setLatestOtherIndex3(latestOtherIndex3);
		}

		Date latestCOPReportDate = (Date)attributes.get("latestCOPReportDate");

		if (latestCOPReportDate != null) {
			setLatestCOPReportDate(latestCOPReportDate);
		}

		Date latestInspectionRecordDate = (Date)attributes.get(
				"latestInspectionRecordDate");

		if (latestInspectionRecordDate != null) {
			setLatestInspectionRecordDate(latestInspectionRecordDate);
		}

		Integer latestNumberOfInspectionInYear = (Integer)attributes.get(
				"latestNumberOfInspectionInYear");

		if (latestNumberOfInspectionInYear != null) {
			setLatestNumberOfInspectionInYear(latestNumberOfInspectionInYear);
		}

		Integer latestNumberOfInspectionInMonth = (Integer)attributes.get(
				"latestNumberOfInspectionInMonth");

		if (latestNumberOfInspectionInMonth != null) {
			setLatestNumberOfInspectionInMonth(latestNumberOfInspectionInMonth);
		}

		Integer latestNumberOfStampInMonth = (Integer)attributes.get(
				"latestNumberOfStampInMonth");

		if (latestNumberOfStampInMonth != null) {
			setLatestNumberOfStampInMonth(latestNumberOfStampInMonth);
		}

		Date periodStartFrom = (Date)attributes.get("periodStartFrom");

		if (periodStartFrom != null) {
			setPeriodStartFrom(periodStartFrom);
		}

		Integer totalInspection = (Integer)attributes.get("totalInspection");

		if (totalInspection != null) {
			setTotalInspection(totalInspection);
		}

		String flowIndex = (String)attributes.get("flowIndex");

		if (flowIndex != null) {
			setFlowIndex(flowIndex);
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
	public VRMethodOfIssue toEscapedModel() {
		return new VRMethodOfIssueWrapper(_vrMethodOfIssue.toEscapedModel());
	}

	@Override
	public VRMethodOfIssue toUnescapedModel() {
		return new VRMethodOfIssueWrapper(_vrMethodOfIssue.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrMethodOfIssue.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrMethodOfIssue.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrMethodOfIssue.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrMethodOfIssue.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRMethodOfIssue> toCacheModel() {
		return _vrMethodOfIssue.toCacheModel();
	}

	@Override
	public int compareTo(VRMethodOfIssue vrMethodOfIssue) {
		return _vrMethodOfIssue.compareTo(vrMethodOfIssue);
	}

	/**
	* Returns the accumulated month quantity index of this vr method of issue.
	*
	* @return the accumulated month quantity index of this vr method of issue
	*/
	@Override
	public int getAccumulatedMonthQuantityIndex() {
		return _vrMethodOfIssue.getAccumulatedMonthQuantityIndex();
	}

	/**
	* Returns the average stb quantity index of this vr method of issue.
	*
	* @return the average stb quantity index of this vr method of issue
	*/
	@Override
	public int getAverageStbQuantityIndex() {
		return _vrMethodOfIssue.getAverageStbQuantityIndex();
	}

	/**
	* Returns the average stm quantity index of this vr method of issue.
	*
	* @return the average stm quantity index of this vr method of issue
	*/
	@Override
	public int getAverageStmQuantityIndex() {
		return _vrMethodOfIssue.getAverageStmQuantityIndex();
	}

	/**
	* Returns the frequency index of this vr method of issue.
	*
	* @return the frequency index of this vr method of issue
	*/
	@Override
	public int getFrequencyIndex() {
		return _vrMethodOfIssue.getFrequencyIndex();
	}

	/**
	* Returns the latest number of inspection in month of this vr method of issue.
	*
	* @return the latest number of inspection in month of this vr method of issue
	*/
	@Override
	public int getLatestNumberOfInspectionInMonth() {
		return _vrMethodOfIssue.getLatestNumberOfInspectionInMonth();
	}

	/**
	* Returns the latest number of inspection in year of this vr method of issue.
	*
	* @return the latest number of inspection in year of this vr method of issue
	*/
	@Override
	public int getLatestNumberOfInspectionInYear() {
		return _vrMethodOfIssue.getLatestNumberOfInspectionInYear();
	}

	/**
	* Returns the latest number of stamp in month of this vr method of issue.
	*
	* @return the latest number of stamp in month of this vr method of issue
	*/
	@Override
	public int getLatestNumberOfStampInMonth() {
		return _vrMethodOfIssue.getLatestNumberOfStampInMonth();
	}

	/**
	* Returns the latest other index1 of this vr method of issue.
	*
	* @return the latest other index1 of this vr method of issue
	*/
	@Override
	public int getLatestOtherIndex1() {
		return _vrMethodOfIssue.getLatestOtherIndex1();
	}

	/**
	* Returns the latest other index2 of this vr method of issue.
	*
	* @return the latest other index2 of this vr method of issue
	*/
	@Override
	public int getLatestOtherIndex2() {
		return _vrMethodOfIssue.getLatestOtherIndex2();
	}

	/**
	* Returns the latest other index3 of this vr method of issue.
	*
	* @return the latest other index3 of this vr method of issue
	*/
	@Override
	public int getLatestOtherIndex3() {
		return _vrMethodOfIssue.getLatestOtherIndex3();
	}

	/**
	* Returns the max month quantity index of this vr method of issue.
	*
	* @return the max month quantity index of this vr method of issue
	*/
	@Override
	public int getMaxMonthQuantityIndex() {
		return _vrMethodOfIssue.getMaxMonthQuantityIndex();
	}

	/**
	* Returns the method approved of this vr method of issue.
	*
	* @return the method approved of this vr method of issue
	*/
	@Override
	public int getMethodApproved() {
		return _vrMethodOfIssue.getMethodApproved();
	}

	/**
	* Returns the method in month of this vr method of issue.
	*
	* @return the method in month of this vr method of issue
	*/
	@Override
	public int getMethodInMonth() {
		return _vrMethodOfIssue.getMethodInMonth();
	}

	/**
	* Returns the method in year of this vr method of issue.
	*
	* @return the method in year of this vr method of issue
	*/
	@Override
	public int getMethodInYear() {
		return _vrMethodOfIssue.getMethodInYear();
	}

	/**
	* Returns the period duration of this vr method of issue.
	*
	* @return the period duration of this vr method of issue
	*/
	@Override
	public int getPeriodDuration() {
		return _vrMethodOfIssue.getPeriodDuration();
	}

	/**
	* Returns the total inspection of this vr method of issue.
	*
	* @return the total inspection of this vr method of issue
	*/
	@Override
	public int getTotalInspection() {
		return _vrMethodOfIssue.getTotalInspection();
	}

	@Override
	public int hashCode() {
		return _vrMethodOfIssue.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrMethodOfIssue.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRMethodOfIssueWrapper((VRMethodOfIssue)_vrMethodOfIssue.clone());
	}

	/**
	* Returns the applicant address of this vr method of issue.
	*
	* @return the applicant address of this vr method of issue
	*/
	@Override
	public java.lang.String getApplicantAddress() {
		return _vrMethodOfIssue.getApplicantAddress();
	}

	/**
	* Returns the applicant name of this vr method of issue.
	*
	* @return the applicant name of this vr method of issue
	*/
	@Override
	public java.lang.String getApplicantName() {
		return _vrMethodOfIssue.getApplicantName();
	}

	/**
	* Returns the certified assembly type of this vr method of issue.
	*
	* @return the certified assembly type of this vr method of issue
	*/
	@Override
	public java.lang.String getCertifiedAssemblyType() {
		return _vrMethodOfIssue.getCertifiedAssemblyType();
	}

	/**
	* Returns the certified assembly type description of this vr method of issue.
	*
	* @return the certified assembly type description of this vr method of issue
	*/
	@Override
	public java.lang.String getCertifiedAssemblyTypeDescription() {
		return _vrMethodOfIssue.getCertifiedAssemblyTypeDescription();
	}

	/**
	* Returns the flow index of this vr method of issue.
	*
	* @return the flow index of this vr method of issue
	*/
	@Override
	public java.lang.String getFlowIndex() {
		return _vrMethodOfIssue.getFlowIndex();
	}

	/**
	* Returns the method of issue of this vr method of issue.
	*
	* @return the method of issue of this vr method of issue
	*/
	@Override
	public java.lang.String getMethodOfIssue() {
		return _vrMethodOfIssue.getMethodOfIssue();
	}

	/**
	* Returns the production plant address of this vr method of issue.
	*
	* @return the production plant address of this vr method of issue
	*/
	@Override
	public java.lang.String getProductionPlantAddress() {
		return _vrMethodOfIssue.getProductionPlantAddress();
	}

	/**
	* Returns the production plant code of this vr method of issue.
	*
	* @return the production plant code of this vr method of issue
	*/
	@Override
	public java.lang.String getProductionPlantCode() {
		return _vrMethodOfIssue.getProductionPlantCode();
	}

	/**
	* Returns the production plant name of this vr method of issue.
	*
	* @return the production plant name of this vr method of issue
	*/
	@Override
	public java.lang.String getProductionPlantName() {
		return _vrMethodOfIssue.getProductionPlantName();
	}

	/**
	* Returns the remarks of this vr method of issue.
	*
	* @return the remarks of this vr method of issue
	*/
	@Override
	public java.lang.String getRemarks() {
		return _vrMethodOfIssue.getRemarks();
	}

	/**
	* Returns the vehicle class of this vr method of issue.
	*
	* @return the vehicle class of this vr method of issue
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _vrMethodOfIssue.getVehicleClass();
	}

	@Override
	public java.lang.String toString() {
		return _vrMethodOfIssue.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrMethodOfIssue.toXmlString();
	}

	/**
	* Returns the latest cop report date of this vr method of issue.
	*
	* @return the latest cop report date of this vr method of issue
	*/
	@Override
	public Date getLatestCOPReportDate() {
		return _vrMethodOfIssue.getLatestCOPReportDate();
	}

	/**
	* Returns the latest inspection record date of this vr method of issue.
	*
	* @return the latest inspection record date of this vr method of issue
	*/
	@Override
	public Date getLatestInspectionRecordDate() {
		return _vrMethodOfIssue.getLatestInspectionRecordDate();
	}

	/**
	* Returns the modify date of this vr method of issue.
	*
	* @return the modify date of this vr method of issue
	*/
	@Override
	public Date getModifyDate() {
		return _vrMethodOfIssue.getModifyDate();
	}

	/**
	* Returns the period start from of this vr method of issue.
	*
	* @return the period start from of this vr method of issue
	*/
	@Override
	public Date getPeriodStartFrom() {
		return _vrMethodOfIssue.getPeriodStartFrom();
	}

	/**
	* Returns the sync date of this vr method of issue.
	*
	* @return the sync date of this vr method of issue
	*/
	@Override
	public Date getSyncDate() {
		return _vrMethodOfIssue.getSyncDate();
	}

	/**
	* Returns the applicant profile ID of this vr method of issue.
	*
	* @return the applicant profile ID of this vr method of issue
	*/
	@Override
	public long getApplicantProfileId() {
		return _vrMethodOfIssue.getApplicantProfileId();
	}

	/**
	* Returns the ID of this vr method of issue.
	*
	* @return the ID of this vr method of issue
	*/
	@Override
	public long getId() {
		return _vrMethodOfIssue.getId();
	}

	/**
	* Returns the mt core of this vr method of issue.
	*
	* @return the mt core of this vr method of issue
	*/
	@Override
	public long getMtCore() {
		return _vrMethodOfIssue.getMtCore();
	}

	/**
	* Returns the primary key of this vr method of issue.
	*
	* @return the primary key of this vr method of issue
	*/
	@Override
	public long getPrimaryKey() {
		return _vrMethodOfIssue.getPrimaryKey();
	}

	/**
	* Returns the production plant ID of this vr method of issue.
	*
	* @return the production plant ID of this vr method of issue
	*/
	@Override
	public long getProductionPlantId() {
		return _vrMethodOfIssue.getProductionPlantId();
	}

	@Override
	public void persist() {
		_vrMethodOfIssue.persist();
	}

	/**
	* Sets the accumulated month quantity index of this vr method of issue.
	*
	* @param accumulatedMonthQuantityIndex the accumulated month quantity index of this vr method of issue
	*/
	@Override
	public void setAccumulatedMonthQuantityIndex(
		int accumulatedMonthQuantityIndex) {
		_vrMethodOfIssue.setAccumulatedMonthQuantityIndex(accumulatedMonthQuantityIndex);
	}

	/**
	* Sets the applicant address of this vr method of issue.
	*
	* @param applicantAddress the applicant address of this vr method of issue
	*/
	@Override
	public void setApplicantAddress(java.lang.String applicantAddress) {
		_vrMethodOfIssue.setApplicantAddress(applicantAddress);
	}

	/**
	* Sets the applicant name of this vr method of issue.
	*
	* @param applicantName the applicant name of this vr method of issue
	*/
	@Override
	public void setApplicantName(java.lang.String applicantName) {
		_vrMethodOfIssue.setApplicantName(applicantName);
	}

	/**
	* Sets the applicant profile ID of this vr method of issue.
	*
	* @param applicantProfileId the applicant profile ID of this vr method of issue
	*/
	@Override
	public void setApplicantProfileId(long applicantProfileId) {
		_vrMethodOfIssue.setApplicantProfileId(applicantProfileId);
	}

	/**
	* Sets the average stb quantity index of this vr method of issue.
	*
	* @param averageStbQuantityIndex the average stb quantity index of this vr method of issue
	*/
	@Override
	public void setAverageStbQuantityIndex(int averageStbQuantityIndex) {
		_vrMethodOfIssue.setAverageStbQuantityIndex(averageStbQuantityIndex);
	}

	/**
	* Sets the average stm quantity index of this vr method of issue.
	*
	* @param averageStmQuantityIndex the average stm quantity index of this vr method of issue
	*/
	@Override
	public void setAverageStmQuantityIndex(int averageStmQuantityIndex) {
		_vrMethodOfIssue.setAverageStmQuantityIndex(averageStmQuantityIndex);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrMethodOfIssue.setCachedModel(cachedModel);
	}

	/**
	* Sets the certified assembly type of this vr method of issue.
	*
	* @param certifiedAssemblyType the certified assembly type of this vr method of issue
	*/
	@Override
	public void setCertifiedAssemblyType(java.lang.String certifiedAssemblyType) {
		_vrMethodOfIssue.setCertifiedAssemblyType(certifiedAssemblyType);
	}

	/**
	* Sets the certified assembly type description of this vr method of issue.
	*
	* @param certifiedAssemblyTypeDescription the certified assembly type description of this vr method of issue
	*/
	@Override
	public void setCertifiedAssemblyTypeDescription(
		java.lang.String certifiedAssemblyTypeDescription) {
		_vrMethodOfIssue.setCertifiedAssemblyTypeDescription(certifiedAssemblyTypeDescription);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrMethodOfIssue.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrMethodOfIssue.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrMethodOfIssue.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the flow index of this vr method of issue.
	*
	* @param flowIndex the flow index of this vr method of issue
	*/
	@Override
	public void setFlowIndex(java.lang.String flowIndex) {
		_vrMethodOfIssue.setFlowIndex(flowIndex);
	}

	/**
	* Sets the frequency index of this vr method of issue.
	*
	* @param frequencyIndex the frequency index of this vr method of issue
	*/
	@Override
	public void setFrequencyIndex(int frequencyIndex) {
		_vrMethodOfIssue.setFrequencyIndex(frequencyIndex);
	}

	/**
	* Sets the ID of this vr method of issue.
	*
	* @param id the ID of this vr method of issue
	*/
	@Override
	public void setId(long id) {
		_vrMethodOfIssue.setId(id);
	}

	/**
	* Sets the latest cop report date of this vr method of issue.
	*
	* @param latestCOPReportDate the latest cop report date of this vr method of issue
	*/
	@Override
	public void setLatestCOPReportDate(Date latestCOPReportDate) {
		_vrMethodOfIssue.setLatestCOPReportDate(latestCOPReportDate);
	}

	/**
	* Sets the latest inspection record date of this vr method of issue.
	*
	* @param latestInspectionRecordDate the latest inspection record date of this vr method of issue
	*/
	@Override
	public void setLatestInspectionRecordDate(Date latestInspectionRecordDate) {
		_vrMethodOfIssue.setLatestInspectionRecordDate(latestInspectionRecordDate);
	}

	/**
	* Sets the latest number of inspection in month of this vr method of issue.
	*
	* @param latestNumberOfInspectionInMonth the latest number of inspection in month of this vr method of issue
	*/
	@Override
	public void setLatestNumberOfInspectionInMonth(
		int latestNumberOfInspectionInMonth) {
		_vrMethodOfIssue.setLatestNumberOfInspectionInMonth(latestNumberOfInspectionInMonth);
	}

	/**
	* Sets the latest number of inspection in year of this vr method of issue.
	*
	* @param latestNumberOfInspectionInYear the latest number of inspection in year of this vr method of issue
	*/
	@Override
	public void setLatestNumberOfInspectionInYear(
		int latestNumberOfInspectionInYear) {
		_vrMethodOfIssue.setLatestNumberOfInspectionInYear(latestNumberOfInspectionInYear);
	}

	/**
	* Sets the latest number of stamp in month of this vr method of issue.
	*
	* @param latestNumberOfStampInMonth the latest number of stamp in month of this vr method of issue
	*/
	@Override
	public void setLatestNumberOfStampInMonth(int latestNumberOfStampInMonth) {
		_vrMethodOfIssue.setLatestNumberOfStampInMonth(latestNumberOfStampInMonth);
	}

	/**
	* Sets the latest other index1 of this vr method of issue.
	*
	* @param latestOtherIndex1 the latest other index1 of this vr method of issue
	*/
	@Override
	public void setLatestOtherIndex1(int latestOtherIndex1) {
		_vrMethodOfIssue.setLatestOtherIndex1(latestOtherIndex1);
	}

	/**
	* Sets the latest other index2 of this vr method of issue.
	*
	* @param latestOtherIndex2 the latest other index2 of this vr method of issue
	*/
	@Override
	public void setLatestOtherIndex2(int latestOtherIndex2) {
		_vrMethodOfIssue.setLatestOtherIndex2(latestOtherIndex2);
	}

	/**
	* Sets the latest other index3 of this vr method of issue.
	*
	* @param latestOtherIndex3 the latest other index3 of this vr method of issue
	*/
	@Override
	public void setLatestOtherIndex3(int latestOtherIndex3) {
		_vrMethodOfIssue.setLatestOtherIndex3(latestOtherIndex3);
	}

	/**
	* Sets the max month quantity index of this vr method of issue.
	*
	* @param maxMonthQuantityIndex the max month quantity index of this vr method of issue
	*/
	@Override
	public void setMaxMonthQuantityIndex(int maxMonthQuantityIndex) {
		_vrMethodOfIssue.setMaxMonthQuantityIndex(maxMonthQuantityIndex);
	}

	/**
	* Sets the method approved of this vr method of issue.
	*
	* @param methodApproved the method approved of this vr method of issue
	*/
	@Override
	public void setMethodApproved(int methodApproved) {
		_vrMethodOfIssue.setMethodApproved(methodApproved);
	}

	/**
	* Sets the method in month of this vr method of issue.
	*
	* @param methodInMonth the method in month of this vr method of issue
	*/
	@Override
	public void setMethodInMonth(int methodInMonth) {
		_vrMethodOfIssue.setMethodInMonth(methodInMonth);
	}

	/**
	* Sets the method in year of this vr method of issue.
	*
	* @param methodInYear the method in year of this vr method of issue
	*/
	@Override
	public void setMethodInYear(int methodInYear) {
		_vrMethodOfIssue.setMethodInYear(methodInYear);
	}

	/**
	* Sets the method of issue of this vr method of issue.
	*
	* @param methodOfIssue the method of issue of this vr method of issue
	*/
	@Override
	public void setMethodOfIssue(java.lang.String methodOfIssue) {
		_vrMethodOfIssue.setMethodOfIssue(methodOfIssue);
	}

	/**
	* Sets the modify date of this vr method of issue.
	*
	* @param modifyDate the modify date of this vr method of issue
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrMethodOfIssue.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr method of issue.
	*
	* @param mtCore the mt core of this vr method of issue
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrMethodOfIssue.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrMethodOfIssue.setNew(n);
	}

	/**
	* Sets the period duration of this vr method of issue.
	*
	* @param periodDuration the period duration of this vr method of issue
	*/
	@Override
	public void setPeriodDuration(int periodDuration) {
		_vrMethodOfIssue.setPeriodDuration(periodDuration);
	}

	/**
	* Sets the period start from of this vr method of issue.
	*
	* @param periodStartFrom the period start from of this vr method of issue
	*/
	@Override
	public void setPeriodStartFrom(Date periodStartFrom) {
		_vrMethodOfIssue.setPeriodStartFrom(periodStartFrom);
	}

	/**
	* Sets the primary key of this vr method of issue.
	*
	* @param primaryKey the primary key of this vr method of issue
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrMethodOfIssue.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrMethodOfIssue.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the production plant address of this vr method of issue.
	*
	* @param productionPlantAddress the production plant address of this vr method of issue
	*/
	@Override
	public void setProductionPlantAddress(
		java.lang.String productionPlantAddress) {
		_vrMethodOfIssue.setProductionPlantAddress(productionPlantAddress);
	}

	/**
	* Sets the production plant code of this vr method of issue.
	*
	* @param productionPlantCode the production plant code of this vr method of issue
	*/
	@Override
	public void setProductionPlantCode(java.lang.String productionPlantCode) {
		_vrMethodOfIssue.setProductionPlantCode(productionPlantCode);
	}

	/**
	* Sets the production plant ID of this vr method of issue.
	*
	* @param productionPlantId the production plant ID of this vr method of issue
	*/
	@Override
	public void setProductionPlantId(long productionPlantId) {
		_vrMethodOfIssue.setProductionPlantId(productionPlantId);
	}

	/**
	* Sets the production plant name of this vr method of issue.
	*
	* @param productionPlantName the production plant name of this vr method of issue
	*/
	@Override
	public void setProductionPlantName(java.lang.String productionPlantName) {
		_vrMethodOfIssue.setProductionPlantName(productionPlantName);
	}

	/**
	* Sets the remarks of this vr method of issue.
	*
	* @param remarks the remarks of this vr method of issue
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_vrMethodOfIssue.setRemarks(remarks);
	}

	/**
	* Sets the sync date of this vr method of issue.
	*
	* @param syncDate the sync date of this vr method of issue
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrMethodOfIssue.setSyncDate(syncDate);
	}

	/**
	* Sets the total inspection of this vr method of issue.
	*
	* @param totalInspection the total inspection of this vr method of issue
	*/
	@Override
	public void setTotalInspection(int totalInspection) {
		_vrMethodOfIssue.setTotalInspection(totalInspection);
	}

	/**
	* Sets the vehicle class of this vr method of issue.
	*
	* @param vehicleClass the vehicle class of this vr method of issue
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_vrMethodOfIssue.setVehicleClass(vehicleClass);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRMethodOfIssueWrapper)) {
			return false;
		}

		VRMethodOfIssueWrapper vrMethodOfIssueWrapper = (VRMethodOfIssueWrapper)obj;

		if (Objects.equals(_vrMethodOfIssue,
					vrMethodOfIssueWrapper._vrMethodOfIssue)) {
			return true;
		}

		return false;
	}

	@Override
	public VRMethodOfIssue getWrappedModel() {
		return _vrMethodOfIssue;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrMethodOfIssue.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrMethodOfIssue.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrMethodOfIssue.resetOriginalValues();
	}

	private final VRMethodOfIssue _vrMethodOfIssue;
}