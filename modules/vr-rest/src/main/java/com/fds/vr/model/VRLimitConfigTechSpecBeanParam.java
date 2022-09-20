package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "vehicletype", "vehicletypename", "markupsmrm", "searchingdriveconfig",
		"searchingdriveconfigdesc", "sequenceno", "specificationcode", "specificationname", "synchdate", "keyword",
		"start", "end", "order_asc", "order_desc" })
@XmlRootElement(name = "VRLimitConfigTechSpecBeanParam")
public class VRLimitConfigTechSpecBeanParam {
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
	@QueryParam(value = "vehicletype")
	protected String vehicleType;
	@QueryParam(value = "vehicletypename")
	protected String vehicleTypeName;
	@QueryParam(value = "markupsmrm")
	protected String markupSMRM;
	@QueryParam(value = "searchingdriveconfig")
	protected Long searchingDriveConfig;
	@QueryParam(value = "searchingdriveconfigdesc")
	protected String searchingDriveConfigDesc;
	@QueryParam(value = "sequenceno")
	protected Integer sequenceNo;
	@QueryParam(value = "specificationcode")
	protected String specificationCode;
	@QueryParam(value = "specificationname")
	protected String specificationName;
	@QueryParam(value = "synchdate")
	protected String synchDate;

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

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleTypeName() {
		return vehicleTypeName;
	}

	public void setVehicleTypeName(String vehicleTypeName) {
		this.vehicleTypeName = vehicleTypeName;
	}

	public String getMarkupSMRM() {
		return markupSMRM;
	}

	public void setMarkupSMRM(String markupSMRM) {
		this.markupSMRM = markupSMRM;
	}

	public Long getSearchingDriveConfig() {
		return searchingDriveConfig;
	}

	public void setSearchingDriveConfig(Long searchingDriveConfig) {
		this.searchingDriveConfig = searchingDriveConfig;
	}

	public String getSearchingDriveConfigDesc() {
		return searchingDriveConfigDesc;
	}

	public void setSearchingDriveConfigDesc(String searchingDriveConfigDesc) {
		this.searchingDriveConfigDesc = searchingDriveConfigDesc;
	}

	public Integer getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(Integer sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public String getSpecificationCode() {
		return specificationCode;
	}

	public void setSpecificationCode(String specificationCode) {
		this.specificationCode = specificationCode;
	}

	public String getSpecificationName() {
		return specificationName;
	}

	public void setSpecificationName(String specificationName) {
		this.specificationName = specificationName;
	}

	public String getSynchDate() {
		return synchDate;
	}

	public void setSynchDate(String synchDate) {
		this.synchDate = synchDate;
	}

}
