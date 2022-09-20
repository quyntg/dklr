package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "vehicleclass", "vehicletype", "vehicletypename", "sequenceno",
		"specificationname", "specificationcode", "specificationdisplayname", "speccategory", "specificationgroup",
		"specificationdatacollectionid", "specificationbasicunit", "specificationstandard", "specificationentrytype",
		"specificationentryplaceholder", "specificationmandatory", "module", "synchdate", "keyword", "start", "end",
		"order_asc", "order_desc" })
@XmlRootElement(name = "VRConfigTechSpecBeanParam")
public class VRConfigTechSpecBeanParam {
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
	@QueryParam(value = "vehicleclass")
	protected String vehicleClass;
	@QueryParam(value = "vehicletype")
	protected String vehicleType;
	@QueryParam(value = "vehicletypename")
	protected String vehicletypeName;
	@QueryParam(value = "sequenceno")
	protected Integer sequenceNo;
	@QueryParam(value = "specificationname")
	protected String specificationName;
	@QueryParam(value = "specificationcode")
	protected String specificationCode;
	@QueryParam(value = "specificationdisplayname")
	protected String specificationDisplayName;
	@QueryParam(value = "speccategory")
	protected String specCategory;
	@QueryParam(value = "specificationgroup")
	protected Integer specificationGroup;
	@QueryParam(value = "specificationdatacollectionid")
	protected String specificationDataCollectionId;
	@QueryParam(value = "specificationbasicunit")
	protected String specificationBasicUnit;
	@QueryParam(value = "specificationstandard")
	protected String specificationStandard;
	@QueryParam(value = "specificationentrytype")
	protected String specificationEntryType;
	@QueryParam(value = "specificationentryplaceholder")
	protected String specificationEntryPlaceholder;
	@QueryParam(value = "specificationmandatory")
	protected Integer specificationMandatory;
	@QueryParam(value = "module")
	protected String module;
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

	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicletypeName() {
		return vehicletypeName;
	}

	public void setVehicletypeName(String vehicletypeName) {
		this.vehicletypeName = vehicletypeName;
	}

	public Integer getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(Integer sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public String getSpecificationName() {
		return specificationName;
	}

	public void setSpecificationName(String specificationName) {
		this.specificationName = specificationName;
	}

	public String getSpecificationCode() {
		return specificationCode;
	}

	public void setSpecificationCode(String specificationCode) {
		this.specificationCode = specificationCode;
	}

	public String getSpecificationDisplayName() {
		return specificationDisplayName;
	}

	public void setSpecificationDisplayName(String specificationDisplayName) {
		this.specificationDisplayName = specificationDisplayName;
	}

	public String getSpecCategory() {
		return specCategory;
	}

	public void setSpecCategory(String specCategory) {
		this.specCategory = specCategory;
	}

	public Integer getSpecificationGroup() {
		return specificationGroup;
	}

	public void setSpecificationGroup(Integer specificationGroup) {
		this.specificationGroup = specificationGroup;
	}

	public String getSpecificationDataCollectionId() {
		return specificationDataCollectionId;
	}

	public void setSpecificationDataCollectionId(String specificationDataCollectionId) {
		this.specificationDataCollectionId = specificationDataCollectionId;
	}

	public String getSpecificationBasicUnit() {
		return specificationBasicUnit;
	}

	public void setSpecificationBasicUnit(String specificationBasicUnit) {
		this.specificationBasicUnit = specificationBasicUnit;
	}

	public String getSpecificationStandard() {
		return specificationStandard;
	}

	public void setSpecificationStandard(String specificationStandard) {
		this.specificationStandard = specificationStandard;
	}

	public String getSpecificationEntryType() {
		return specificationEntryType;
	}

	public void setSpecificationEntryType(String specificationEntryType) {
		this.specificationEntryType = specificationEntryType;
	}

	public String getSpecificationEntryPlaceholder() {
		return specificationEntryPlaceholder;
	}

	public void setSpecificationEntryPlaceholder(String specificationEntryPlaceholder) {
		this.specificationEntryPlaceholder = specificationEntryPlaceholder;
	}

	public Integer getSpecificationMandatory() {
		return specificationMandatory;
	}

	public void setSpecificationMandatory(Integer specificationMandatory) {
		this.specificationMandatory = specificationMandatory;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getSynchDate() {
		return synchDate;
	}

	public void setSynchDate(String synchDate) {
		this.synchDate = synchDate;
	}

}
