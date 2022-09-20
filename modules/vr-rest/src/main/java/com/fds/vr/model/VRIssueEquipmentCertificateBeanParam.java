package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "mtcore", "issueid", "issuevehiclecertificateid", "vehiclecertificaterecordno",
		"equipmentname", "equipmenttype", "equipmentcertificatetype", "equipmentdocumentno",
		"equipmentcertificaterecordno", "equipmentexamrecordno", "equipmentcertificaterecordid", "totalquantity",
		"totalproductused", "totalinuse", "totalnotused", "applicantno", "applicantname", "applicantaddress",
		"productionplantname", "productionplantaddress", "modifydate", "syncdate", "keyword", "start", "end",
		"order_asc", "order_desc" })
@XmlRootElement(name = "VRIssueEquipmentCertificateBeanParam")
public class VRIssueEquipmentCertificateBeanParam {
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
	protected Integer mtcore;
	@QueryParam(value = "issueid")
	protected Long issueId;
	@QueryParam(value = "issuevehiclecertificateid")
	protected Long issueVehicleCertificateId;
	@QueryParam(value = "vehiclecertificaterecordno")
	protected String vehiclecertificaterecordno;
	@QueryParam(value = "equipmentname")
	protected String equipmentName;
	@QueryParam(value = "equipmenttype")
	protected String equipmentType;
	@QueryParam(value = "equipmentcertificatetype")
	protected String equipmentCertificateType;
	@QueryParam(value = "equipmentdocumentno")
	protected String equipmentDocumentNo;
	@QueryParam(value = "equipmentcertificaterecordno")
	protected String equipmentCertificateRecordNo;
	@QueryParam(value = "equipmentexamrecordno")
	protected String equipmentExamRecordNo;
	@QueryParam(value = "equipmentcertificaterecordid")
	protected Integer EquipmentCertificateRecordId;
	@QueryParam(value = "totalquantity")
	protected Integer TotalQuantity;
	@QueryParam(value = "totalproductused")
	protected Integer TotalProductUsed;
	@QueryParam(value = "totalinuse")
	protected Integer TotalInUse;
	@QueryParam(value = "totalnotused")
	protected Integer TotalNotUsed;
	@QueryParam(value = "applicantno")
	protected String applicantNo;
	@QueryParam(value = "applicantname")
	protected String applicantname;
	@QueryParam(value = "applicantaddress")
	protected String applicantaddress;
	@QueryParam(value = "productionplantname")
	protected String productionplantname;
	@QueryParam(value = "productionplantaddress")
	protected String productionplantaddress;
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

	public Integer getMtcore() {
		return mtcore;
	}

	public void setMtcore(Integer mtcore) {
		this.mtcore = mtcore;
	}

	public Long getIssueId() {
		return issueId;
	}

	public void setIssueId(Long issueId) {
		this.issueId = issueId;
	}

	public Long getIssueVehicleCertificateId() {
		return issueVehicleCertificateId;
	}

	public void setIssueVehicleCertificateId(Long issueVehicleCertificateId) {
		this.issueVehicleCertificateId = issueVehicleCertificateId;
	}

	public String getVehiclecertificaterecordno() {
		return vehiclecertificaterecordno;
	}

	public void setVehiclecertificaterecordno(String vehiclecertificaterecordno) {
		this.vehiclecertificaterecordno = vehiclecertificaterecordno;
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}

	public String getEquipmentCertificateType() {
		return equipmentCertificateType;
	}

	public void setEquipmentCertificateType(String equipmentCertificateType) {
		this.equipmentCertificateType = equipmentCertificateType;
	}

	public String getEquipmentDocumentNo() {
		return equipmentDocumentNo;
	}

	public void setEquipmentDocumentNo(String equipmentDocumentNo) {
		this.equipmentDocumentNo = equipmentDocumentNo;
	}

	public String getEquipmentCertificateRecordNo() {
		return equipmentCertificateRecordNo;
	}

	public void setEquipmentCertificateRecordNo(String equipmentCertificateRecordNo) {
		this.equipmentCertificateRecordNo = equipmentCertificateRecordNo;
	}

	public String getEquipmentExamRecordNo() {
		return equipmentExamRecordNo;
	}

	public void setEquipmentExamRecordNo(String equipmentExamRecordNo) {
		this.equipmentExamRecordNo = equipmentExamRecordNo;
	}

	public Integer getEquipmentCertificateRecordId() {
		return EquipmentCertificateRecordId;
	}

	public void setEquipmentCertificateRecordId(Integer equipmentCertificateRecordId) {
		EquipmentCertificateRecordId = equipmentCertificateRecordId;
	}

	public Integer getTotalQuantity() {
		return TotalQuantity;
	}

	public void setTotalQuantity(Integer totalQuantity) {
		TotalQuantity = totalQuantity;
	}

	public Integer getTotalProductUsed() {
		return TotalProductUsed;
	}

	public void setTotalProductUsed(Integer totalProductUsed) {
		TotalProductUsed = totalProductUsed;
	}

	public Integer getTotalInUse() {
		return TotalInUse;
	}

	public void setTotalInUse(Integer totalInUse) {
		TotalInUse = totalInUse;
	}

	public Integer getTotalNotUsed() {
		return TotalNotUsed;
	}

	public void setTotalNotUsed(Integer totalNotUsed) {
		TotalNotUsed = totalNotUsed;
	}

	public String getApplicantNo() {
		return applicantNo;
	}

	public void setApplicantNo(String applicantNo) {
		this.applicantNo = applicantNo;
	}

	public String getApplicantname() {
		return applicantname;
	}

	public void setApplicantname(String applicantname) {
		this.applicantname = applicantname;
	}

	public String getApplicantaddress() {
		return applicantaddress;
	}

	public void setApplicantaddress(String applicantaddress) {
		this.applicantaddress = applicantaddress;
	}

	public String getProductionplantname() {
		return productionplantname;
	}

	public void setProductionplantname(String productionplantname) {
		this.productionplantname = productionplantname;
	}

	public String getProductionplantaddress() {
		return productionplantaddress;
	}

	public void setProductionplantaddress(String productionplantaddress) {
		this.productionplantaddress = productionplantaddress;
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
