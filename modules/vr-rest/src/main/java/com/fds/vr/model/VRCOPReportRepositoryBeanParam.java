package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "mtcore", "applicantprofileid", "applicantcode", "applicantname",
		"applicantaddress", "overseasmanufacturercode", "overseasmanufacturername", "overseasmanufactureraddress",
		"productionplantid", "productionplantcode", "productionplantname", "productionplantaddress", "copreportno",
		"copreportstatus", "copreporttype", "copreportmetadata", "copreportsignname", "copreportsigntitle",
		"copreportsignplace", "copreportdate", "copreportapproveddate", "copreportexpireddate", "copfileentryid",
		"modifydate", "syncdate", "keyword", "start", "end", "order_asc", "order_desc", "advance_search", "module", "copclassification" })
@XmlRootElement(name = "VRCOPReportRepositoryBeanParam")
public class VRCOPReportRepositoryBeanParam {
	@QueryParam(value = "keyword")
	protected String keyword;
	@DefaultValue("0")
	@QueryParam(value = "start")
	protected int start;
	@DefaultValue("20")
	@QueryParam(value = "end")
	protected int end;
	@QueryParam(value = "order_asc")
	protected String order_asc;
	@QueryParam(value = "order_desc")
	protected String order_desc;
	@QueryParam(value = "id")
	protected Long id;
	@QueryParam(value = "mtcore")
	protected Long mtCore;
	@QueryParam(value = "applicantprofileid")
	protected Long applicantProfileId;
	@QueryParam(value = "applicantcode")
	protected String applicantCode;
	@QueryParam(value = "applicantname")
	protected String applicantName;
	@QueryParam(value = "applicantaddress")
	protected String applicantAddress;
	@QueryParam(value = "overseasmanufacturercode")
	protected String overseasManufacturerCode;
	@QueryParam(value = "overseasmanufacturername")
	protected String overseasManufacturerName;
	@QueryParam(value = "overseasmanufactureraddress")
	protected String overseasManufacturerAddress;
	@QueryParam(value = "productionplantid")
	protected Long productionPlantId;
	@QueryParam(value = "productionplantcode")
	protected String productionPlantCode;
	@QueryParam(value = "productionplantname")
	protected String productionPlantName;
	@QueryParam(value = "productionplantaddress")
	protected String productionPlantAddress;
	@QueryParam(value = "copreportno")
	protected String copReportNo;
	@QueryParam(value = "copreportstatus")
	protected String copReportStatus;
	@QueryParam(value = "copreporttype")
	protected String copReportType;
	@QueryParam(value = "copreportmetadata")
	protected String copReportMetadata;
	@QueryParam(value = "copreportsignname")
	protected String copReportSignName;
	@QueryParam(value = "copreportsigntitle")
	protected String copReportSignTitle;
	@QueryParam(value = "copreportsignplace")
	protected String copReportSignPlace;
	@QueryParam(value = "copreportdate")
	protected String copReportDate;
	@QueryParam(value = "copreportapproveddate")
	protected String copReportApprovedDate;
	@QueryParam(value = "copreportexpireddate")
	protected String copReportExpiredDate;
	@QueryParam(value = "copfileentryid")
	protected Long COPFileEntryId;
	@QueryParam(value = "modifydate")
	protected String modifyDate;
	@QueryParam(value = "syncdate")
	protected String syncDate;
	@QueryParam(value = "advance_search")
	protected String advance_search;
	@QueryParam(value = "module")
	protected String module;
	@QueryParam(value = "copclassification")
	protected String copclassification;

	public String getCopclassification() {
		return copclassification;
	}

	public void setCopclassification(String copclassification) {
		this.copclassification = copclassification;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public String getOrder_asc() {
		return order_asc;
	}

	public void setOrder_asc(String order_asc) {
		this.order_asc = order_asc;
	}

	public String getOrder_desc() {
		return order_desc;
	}

	public void setOrder_desc(String order_desc) {
		this.order_desc = order_desc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMtCore() {
		return mtCore;
	}

	public void setMtCore(Long mtCore) {
		this.mtCore = mtCore;
	}

	public Long getApplicantProfileId() {
		return applicantProfileId;
	}

	public void setApplicantProfileId(Long applicantProfileId) {
		this.applicantProfileId = applicantProfileId;
	}

	public String getApplicantCode() {
		return applicantCode;
	}

	public void setApplicantCode(String applicantCode) {
		this.applicantCode = applicantCode;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantAddress() {
		return applicantAddress;
	}

	public void setApplicantAddress(String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}

	public String getOverseasManufacturerCode() {
		return overseasManufacturerCode;
	}

	public void setOverseasManufacturerCode(String overseasManufacturerCode) {
		this.overseasManufacturerCode = overseasManufacturerCode;
	}

	public String getOverseasManufacturerName() {
		return overseasManufacturerName;
	}

	public void setOverseasManufacturerName(String overseasManufacturerName) {
		this.overseasManufacturerName = overseasManufacturerName;
	}

	public String getOverseasManufacturerAddress() {
		return overseasManufacturerAddress;
	}

	public void setOverseasManufacturerAddress(String overseasManufacturerAddress) {
		this.overseasManufacturerAddress = overseasManufacturerAddress;
	}

	public Long getProductionPlantId() {
		return productionPlantId;
	}

	public void setProductionPlantId(Long productionPlantId) {
		this.productionPlantId = productionPlantId;
	}

	public String getProductionPlantCode() {
		return productionPlantCode;
	}

	public void setProductionPlantCode(String productionPlantCode) {
		this.productionPlantCode = productionPlantCode;
	}

	public String getProductionPlantName() {
		return productionPlantName;
	}

	public void setProductionPlantName(String productionPlantName) {
		this.productionPlantName = productionPlantName;
	}

	public String getProductionPlantAddress() {
		return productionPlantAddress;
	}

	public void setProductionPlantAddress(String productionPlantAddress) {
		this.productionPlantAddress = productionPlantAddress;
	}

	public String getCopReportNo() {
		return copReportNo;
	}

	public void setCopReportNo(String copReportNo) {
		this.copReportNo = copReportNo;
	}

	public String getCopReportStatus() {
		return copReportStatus;
	}

	public void setCopReportStatus(String copReportStatus) {
		this.copReportStatus = copReportStatus;
	}

	public String getCopReportType() {
		return copReportType;
	}

	public void setCopReportType(String copReportType) {
		this.copReportType = copReportType;
	}

	public String getCopReportMetadata() {
		return copReportMetadata;
	}

	public void setCopReportMetadata(String copReportMetadata) {
		this.copReportMetadata = copReportMetadata;
	}

	public String getCopReportSignName() {
		return copReportSignName;
	}

	public void setCopReportSignName(String copReportSignName) {
		this.copReportSignName = copReportSignName;
	}

	public String getCopReportSignTitle() {
		return copReportSignTitle;
	}

	public void setCopReportSignTitle(String copReportSignTitle) {
		this.copReportSignTitle = copReportSignTitle;
	}

	public String getCopReportSignPlace() {
		return copReportSignPlace;
	}

	public void setCopReportSignPlace(String copReportSignPlace) {
		this.copReportSignPlace = copReportSignPlace;
	}

	public String getCopReportDate() {
		return copReportDate;
	}

	public void setCopReportDate(String copReportDate) {
		this.copReportDate = copReportDate;
	}

	public String getCopReportApprovedDate() {
		return copReportApprovedDate;
	}

	public void setCopReportApprovedDate(String copReportApprovedDate) {
		this.copReportApprovedDate = copReportApprovedDate;
	}

	public String getCopReportExpiredDate() {
		return copReportExpiredDate;
	}

	public void setCopReportExpiredDate(String copReportExpiredDate) {
		this.copReportExpiredDate = copReportExpiredDate;
	}

	public Long getCOPFileEntryId() {
		return COPFileEntryId;
	}

	public void setCOPFileEntryId(Long cOPFileEntryId) {
		COPFileEntryId = cOPFileEntryId;
	}

	public String getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getSyncDate() {
		return syncDate;
	}

	public void setSyncDate(String syncDate) {
		this.syncDate = syncDate;
	}

	public String getAdvance_search() {
		return advance_search;
	}

	public void setAdvance_search(String advance_search) {
		this.advance_search = advance_search;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
