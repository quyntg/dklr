package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "vehiclecertificateid", "specificationcode", "specificationname",
		"specificationvalue", "specificationvaluedescription", "sequenceno", "specificationbasicunit",
		"specificationstandard", "specificationgroup", "specificationdatacollectionid", "specificationresult",
		"deliverablecode", "modifydate", "syncdate", "keyword", "start", "end", "order_asc", "order_desc" })
@XmlRootElement(name = "VRVehicleSpecificationBeanParam")
public class VRVehicleSpecificationBeanParam {
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
	@QueryParam(value = "vehiclecertificateid")
	protected Long vehicleCertificateId;
	@QueryParam(value = "specificationcode")
	protected String specificationCode;
	@QueryParam(value = "specificationname")
	protected String specificationName;
	@QueryParam(value = "specificationvalue")
	protected String specificationValue;
	@QueryParam(value = "specificationvaluedescription")
	protected String specificationValueDescription;
	@QueryParam(value = "sequenceno")
	protected Long sequenceNo;
	@QueryParam(value = "specificationbasicunit")
	protected String specificationBasicUnit;
	@QueryParam(value = "specificationstandard")
	protected String specificationStandard;
	@QueryParam(value = "specificationgroup")
	protected String specificationGroup;
	@QueryParam(value = "specificationdatacollectionid")
	protected String specificationDataCollectionID;
	@QueryParam(value = "specificationresult")
	protected String specificationResult;
	@QueryParam(value = "deliverablecode")
	protected String deliverableCode;
	@QueryParam(value = "modifydate")
	protected String modifyDate;
	@QueryParam(value = "syncdate")
	protected String syncDate;

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

	public Long getVehicleCertificateId() {
		return vehicleCertificateId;
	}

	public void setVehicleCertificateId(Long vehicleCertificateId) {
		this.vehicleCertificateId = vehicleCertificateId;
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

	public String getSpecificationValue() {
		return specificationValue;
	}

	public void setSpecificationValue(String specificationValue) {
		this.specificationValue = specificationValue;
	}

	public String getSpecificationValueDescription() {
		return specificationValueDescription;
	}

	public void setSpecificationValueDescription(String specificationValueDescription) {
		this.specificationValueDescription = specificationValueDescription;
	}

	public Long getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(Long sequenceNo) {
		this.sequenceNo = sequenceNo;
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

	public String getSpecificationGroup() {
		return specificationGroup;
	}

	public void setSpecificationGroup(String specificationGroup) {
		this.specificationGroup = specificationGroup;
	}

	public String getSpecificationDataCollectionID() {
		return specificationDataCollectionID;
	}

	public void setSpecificationDataCollectionID(String specificationDataCollectionID) {
		this.specificationDataCollectionID = specificationDataCollectionID;
	}

	public String getSpecificationResult() {
		return specificationResult;
	}

	public void setSpecificationResult(String specificationResult) {
		this.specificationResult = specificationResult;
	}

	public String getDeliverableCode() {
		return deliverableCode;
	}

	public void setDeliverableCode(String deliverableCode) {
		this.deliverableCode = deliverableCode;
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

}
