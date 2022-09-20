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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LamTV
 * @generated
 */
@ProviderType
public class VRMethodOfIssueSoap implements Serializable {
	public static VRMethodOfIssueSoap toSoapModel(VRMethodOfIssue model) {
		VRMethodOfIssueSoap soapModel = new VRMethodOfIssueSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setVehicleClass(model.getVehicleClass());
		soapModel.setCertifiedAssemblyType(model.getCertifiedAssemblyType());
		soapModel.setCertifiedAssemblyTypeDescription(model.getCertifiedAssemblyTypeDescription());
		soapModel.setApplicantProfileId(model.getApplicantProfileId());
		soapModel.setApplicantName(model.getApplicantName());
		soapModel.setApplicantAddress(model.getApplicantAddress());
		soapModel.setProductionPlantId(model.getProductionPlantId());
		soapModel.setProductionPlantCode(model.getProductionPlantCode());
		soapModel.setProductionPlantName(model.getProductionPlantName());
		soapModel.setProductionPlantAddress(model.getProductionPlantAddress());
		soapModel.setMethodOfIssue(model.getMethodOfIssue());
		soapModel.setMethodApproved(model.getMethodApproved());
		soapModel.setMethodInMonth(model.getMethodInMonth());
		soapModel.setMethodInYear(model.getMethodInYear());
		soapModel.setPeriodDuration(model.getPeriodDuration());
		soapModel.setFrequencyIndex(model.getFrequencyIndex());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setAverageStbQuantityIndex(model.getAverageStbQuantityIndex());
		soapModel.setMaxMonthQuantityIndex(model.getMaxMonthQuantityIndex());
		soapModel.setAverageStmQuantityIndex(model.getAverageStmQuantityIndex());
		soapModel.setAccumulatedMonthQuantityIndex(model.getAccumulatedMonthQuantityIndex());
		soapModel.setLatestOtherIndex1(model.getLatestOtherIndex1());
		soapModel.setLatestOtherIndex2(model.getLatestOtherIndex2());
		soapModel.setLatestOtherIndex3(model.getLatestOtherIndex3());
		soapModel.setLatestCOPReportDate(model.getLatestCOPReportDate());
		soapModel.setLatestInspectionRecordDate(model.getLatestInspectionRecordDate());
		soapModel.setLatestNumberOfInspectionInYear(model.getLatestNumberOfInspectionInYear());
		soapModel.setLatestNumberOfInspectionInMonth(model.getLatestNumberOfInspectionInMonth());
		soapModel.setLatestNumberOfStampInMonth(model.getLatestNumberOfStampInMonth());
		soapModel.setPeriodStartFrom(model.getPeriodStartFrom());
		soapModel.setTotalInspection(model.getTotalInspection());
		soapModel.setFlowIndex(model.getFlowIndex());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRMethodOfIssueSoap[] toSoapModels(VRMethodOfIssue[] models) {
		VRMethodOfIssueSoap[] soapModels = new VRMethodOfIssueSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRMethodOfIssueSoap[][] toSoapModels(
		VRMethodOfIssue[][] models) {
		VRMethodOfIssueSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRMethodOfIssueSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRMethodOfIssueSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRMethodOfIssueSoap[] toSoapModels(
		List<VRMethodOfIssue> models) {
		List<VRMethodOfIssueSoap> soapModels = new ArrayList<VRMethodOfIssueSoap>(models.size());

		for (VRMethodOfIssue model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRMethodOfIssueSoap[soapModels.size()]);
	}

	public VRMethodOfIssueSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getMtCore() {
		return _mtCore;
	}

	public void setMtCore(long mtCore) {
		_mtCore = mtCore;
	}

	public String getVehicleClass() {
		return _vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		_vehicleClass = vehicleClass;
	}

	public String getCertifiedAssemblyType() {
		return _certifiedAssemblyType;
	}

	public void setCertifiedAssemblyType(String certifiedAssemblyType) {
		_certifiedAssemblyType = certifiedAssemblyType;
	}

	public String getCertifiedAssemblyTypeDescription() {
		return _certifiedAssemblyTypeDescription;
	}

	public void setCertifiedAssemblyTypeDescription(
		String certifiedAssemblyTypeDescription) {
		_certifiedAssemblyTypeDescription = certifiedAssemblyTypeDescription;
	}

	public long getApplicantProfileId() {
		return _applicantProfileId;
	}

	public void setApplicantProfileId(long applicantProfileId) {
		_applicantProfileId = applicantProfileId;
	}

	public String getApplicantName() {
		return _applicantName;
	}

	public void setApplicantName(String applicantName) {
		_applicantName = applicantName;
	}

	public String getApplicantAddress() {
		return _applicantAddress;
	}

	public void setApplicantAddress(String applicantAddress) {
		_applicantAddress = applicantAddress;
	}

	public long getProductionPlantId() {
		return _productionPlantId;
	}

	public void setProductionPlantId(long productionPlantId) {
		_productionPlantId = productionPlantId;
	}

	public String getProductionPlantCode() {
		return _productionPlantCode;
	}

	public void setProductionPlantCode(String productionPlantCode) {
		_productionPlantCode = productionPlantCode;
	}

	public String getProductionPlantName() {
		return _productionPlantName;
	}

	public void setProductionPlantName(String productionPlantName) {
		_productionPlantName = productionPlantName;
	}

	public String getProductionPlantAddress() {
		return _productionPlantAddress;
	}

	public void setProductionPlantAddress(String productionPlantAddress) {
		_productionPlantAddress = productionPlantAddress;
	}

	public String getMethodOfIssue() {
		return _methodOfIssue;
	}

	public void setMethodOfIssue(String methodOfIssue) {
		_methodOfIssue = methodOfIssue;
	}

	public int getMethodApproved() {
		return _methodApproved;
	}

	public void setMethodApproved(int methodApproved) {
		_methodApproved = methodApproved;
	}

	public int getMethodInMonth() {
		return _methodInMonth;
	}

	public void setMethodInMonth(int methodInMonth) {
		_methodInMonth = methodInMonth;
	}

	public int getMethodInYear() {
		return _methodInYear;
	}

	public void setMethodInYear(int methodInYear) {
		_methodInYear = methodInYear;
	}

	public int getPeriodDuration() {
		return _periodDuration;
	}

	public void setPeriodDuration(int periodDuration) {
		_periodDuration = periodDuration;
	}

	public int getFrequencyIndex() {
		return _frequencyIndex;
	}

	public void setFrequencyIndex(int frequencyIndex) {
		_frequencyIndex = frequencyIndex;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public int getAverageStbQuantityIndex() {
		return _averageStbQuantityIndex;
	}

	public void setAverageStbQuantityIndex(int averageStbQuantityIndex) {
		_averageStbQuantityIndex = averageStbQuantityIndex;
	}

	public int getMaxMonthQuantityIndex() {
		return _maxMonthQuantityIndex;
	}

	public void setMaxMonthQuantityIndex(int maxMonthQuantityIndex) {
		_maxMonthQuantityIndex = maxMonthQuantityIndex;
	}

	public int getAverageStmQuantityIndex() {
		return _averageStmQuantityIndex;
	}

	public void setAverageStmQuantityIndex(int averageStmQuantityIndex) {
		_averageStmQuantityIndex = averageStmQuantityIndex;
	}

	public int getAccumulatedMonthQuantityIndex() {
		return _accumulatedMonthQuantityIndex;
	}

	public void setAccumulatedMonthQuantityIndex(
		int accumulatedMonthQuantityIndex) {
		_accumulatedMonthQuantityIndex = accumulatedMonthQuantityIndex;
	}

	public int getLatestOtherIndex1() {
		return _latestOtherIndex1;
	}

	public void setLatestOtherIndex1(int latestOtherIndex1) {
		_latestOtherIndex1 = latestOtherIndex1;
	}

	public int getLatestOtherIndex2() {
		return _latestOtherIndex2;
	}

	public void setLatestOtherIndex2(int latestOtherIndex2) {
		_latestOtherIndex2 = latestOtherIndex2;
	}

	public int getLatestOtherIndex3() {
		return _latestOtherIndex3;
	}

	public void setLatestOtherIndex3(int latestOtherIndex3) {
		_latestOtherIndex3 = latestOtherIndex3;
	}

	public Date getLatestCOPReportDate() {
		return _latestCOPReportDate;
	}

	public void setLatestCOPReportDate(Date latestCOPReportDate) {
		_latestCOPReportDate = latestCOPReportDate;
	}

	public Date getLatestInspectionRecordDate() {
		return _latestInspectionRecordDate;
	}

	public void setLatestInspectionRecordDate(Date latestInspectionRecordDate) {
		_latestInspectionRecordDate = latestInspectionRecordDate;
	}

	public int getLatestNumberOfInspectionInYear() {
		return _latestNumberOfInspectionInYear;
	}

	public void setLatestNumberOfInspectionInYear(
		int latestNumberOfInspectionInYear) {
		_latestNumberOfInspectionInYear = latestNumberOfInspectionInYear;
	}

	public int getLatestNumberOfInspectionInMonth() {
		return _latestNumberOfInspectionInMonth;
	}

	public void setLatestNumberOfInspectionInMonth(
		int latestNumberOfInspectionInMonth) {
		_latestNumberOfInspectionInMonth = latestNumberOfInspectionInMonth;
	}

	public int getLatestNumberOfStampInMonth() {
		return _latestNumberOfStampInMonth;
	}

	public void setLatestNumberOfStampInMonth(int latestNumberOfStampInMonth) {
		_latestNumberOfStampInMonth = latestNumberOfStampInMonth;
	}

	public Date getPeriodStartFrom() {
		return _periodStartFrom;
	}

	public void setPeriodStartFrom(Date periodStartFrom) {
		_periodStartFrom = periodStartFrom;
	}

	public int getTotalInspection() {
		return _totalInspection;
	}

	public void setTotalInspection(int totalInspection) {
		_totalInspection = totalInspection;
	}

	public String getFlowIndex() {
		return _flowIndex;
	}

	public void setFlowIndex(String flowIndex) {
		_flowIndex = flowIndex;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	private long _id;
	private long _mtCore;
	private String _vehicleClass;
	private String _certifiedAssemblyType;
	private String _certifiedAssemblyTypeDescription;
	private long _applicantProfileId;
	private String _applicantName;
	private String _applicantAddress;
	private long _productionPlantId;
	private String _productionPlantCode;
	private String _productionPlantName;
	private String _productionPlantAddress;
	private String _methodOfIssue;
	private int _methodApproved;
	private int _methodInMonth;
	private int _methodInYear;
	private int _periodDuration;
	private int _frequencyIndex;
	private String _remarks;
	private int _averageStbQuantityIndex;
	private int _maxMonthQuantityIndex;
	private int _averageStmQuantityIndex;
	private int _accumulatedMonthQuantityIndex;
	private int _latestOtherIndex1;
	private int _latestOtherIndex2;
	private int _latestOtherIndex3;
	private Date _latestCOPReportDate;
	private Date _latestInspectionRecordDate;
	private int _latestNumberOfInspectionInYear;
	private int _latestNumberOfInspectionInMonth;
	private int _latestNumberOfStampInMonth;
	private Date _periodStartFrom;
	private int _totalInspection;
	private String _flowIndex;
	private Date _modifyDate;
	private Date _syncDate;
}