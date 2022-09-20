package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "mtCore", "issueId", "issueVehiclecertificateId", "dossierId",
		"applicantProfileId", "applicantName", "applicantAddress", "certificateId", "productionNumber",
		"productionDate", "frameNo", "boxNo", "engineNo", "color", "stampShortNo", "serialNo", "vehicleRecordStatus",
		"printingStatus", "attachedFile", "signName", "signTitle", "signPlace", "signDate", "modifyDate", "syncDate",
		"certificateRecordNo", "keyword", "start", "end", "order_asc", "order_desc", "stampIssueNo", "vehicleClass" })
@XmlRootElement(name = "VRVehicleRecordBeanParam")
public class VRVehicleRecordBeanParam {
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
	@QueryParam(value = "mtCore")
	protected Long mtCore;
	@QueryParam(value = "issueId")
	protected Long issueId;
	@QueryParam(value = "issueVehiclecertificateId")
	protected Long issueVehiclecertificateId;
	@QueryParam(value = "dossierId")
	protected Long dossierId;
	@QueryParam(value = "applicantProfileId")
	protected Long applicantProfileId;
	@QueryParam(value = "applicantName")
	protected String applicantName;
	@QueryParam(value = "applicantAddress")
	protected String applicantAddress;
	@QueryParam(value = "certificateId")
	protected Long certificateId;
	@QueryParam(value = "productionNumber")
	protected String productionNumber;
	@QueryParam(value = "productionDate")
	protected String productionDate;
	@QueryParam(value = "frameNo")
	protected String frameNo;
	@QueryParam(value = "boxNo")
	protected String boxNo;
	@QueryParam(value = "engineNo")
	protected String engineNo;
	@QueryParam(value = "color")
	protected String color;
	@QueryParam(value = "stampShortNo")
	protected String stampShortNo;
	@QueryParam(value = "serialNo")
	protected String serialNo;
	@QueryParam(value = "vehicleRecordStatus")
	protected Long vehicleRecordStatus;
	@QueryParam(value = "printingStatus")
	protected Long printingStatus;
	@QueryParam(value = "attachedFile")
	protected Long attachedFile;
	@QueryParam(value = "signName")
	protected String signName;
	@QueryParam(value = "signTitle")
	protected String signTitle;
	@QueryParam(value = "signPlace")
	protected String signPlace;
	@QueryParam(value = "signDate")
	protected String signDate;
	@QueryParam(value = "modifyDate")
	protected String modifyDate;
	@QueryParam(value = "syncDate")
	protected String syncDate;
	@QueryParam(value = "certificateRecordNo")
	protected String certificateRecordNo;
	@QueryParam(value = "stampIssueNo")
	protected String stampIssueNo;
	@QueryParam(value = "vehicleClass")
	protected String vehicleClass;

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

	public Long getIssueId() {
		return issueId;
	}

	public void setIssueId(Long issueId) {
		this.issueId = issueId;
	}

	public Long getIssueVehiclecertificateId() {
		return issueVehiclecertificateId;
	}

	public void setIssueVehiclecertificateId(Long issueVehiclecertificateId) {
		this.issueVehiclecertificateId = issueVehiclecertificateId;
	}

	public Long getDossierId() {
		return dossierId;
	}

	public void setDossierId(Long dossierId) {
		this.dossierId = dossierId;
	}

	public Long getApplicantProfileId() {
		return applicantProfileId;
	}

	public void setApplicantProfileId(Long applicantProfileId) {
		this.applicantProfileId = applicantProfileId;
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

	public Long getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(Long certificateId) {
		this.certificateId = certificateId;
	}

	public String getProductionNumber() {
		return productionNumber;
	}

	public void setProductionNumber(String productionNumber) {
		this.productionNumber = productionNumber;
	}

	public String getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}

	public String getFrameNo() {
		return frameNo;
	}

	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}

	public String getBoxNo() {
		return boxNo;
	}

	public void setBoxNo(String boxNo) {
		this.boxNo = boxNo;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getStampShortNo() {
		return stampShortNo;
	}

	public void setStampShortNo(String stampShortNo) {
		this.stampShortNo = stampShortNo;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public Long getVehicleRecordStatus() {
		return vehicleRecordStatus;
	}

	public void setVehicleRecordStatus(Long vehicleRecordStatus) {
		this.vehicleRecordStatus = vehicleRecordStatus;
	}

	public Long getPrintingStatus() {
		return printingStatus;
	}

	public void setPrintingStatus(Long printingStatus) {
		this.printingStatus = printingStatus;
	}

	public Long getAttachedFile() {
		return attachedFile;
	}

	public void setAttachedFile(Long attachedFile) {
		this.attachedFile = attachedFile;
	}

	public String getSignName() {
		return signName;
	}

	public void setSignName(String signName) {
		this.signName = signName;
	}

	public String getSignTitle() {
		return signTitle;
	}

	public void setSignTitle(String signTitle) {
		this.signTitle = signTitle;
	}

	public String getSignPlace() {
		return signPlace;
	}

	public void setSignPlace(String signPlace) {
		this.signPlace = signPlace;
	}

	public String getSignDate() {
		return signDate;
	}

	public void setSignDate(String signDate) {
		this.signDate = signDate;
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

	public String getCertificateRecordNo() {
		return certificateRecordNo;
	}

	public void setCertificateRecordNo(String certificateRecordNo) {
		this.certificateRecordNo = certificateRecordNo;
	}

	public String getStampIssueNo() {
		return stampIssueNo;
	}

	public void setStampIssueNo(String stampIssueNo) {
		this.stampIssueNo = stampIssueNo;
	}

	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

}
