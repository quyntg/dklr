package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "mtcore", "inputsheetid", "outputsheetid", "bookid",
		"issuevehiclecertificateid", "certificateid", "certificatenumber", "certificatedate", "vehicleclass",
		"stamptype", "stampshortno", "serialstartno", "serialendno", "subtotalindocument", "subtotalquantities",
		"unitprice", "totalamount", "totalinuse", "totalnotused", "totallost", "totalcancelled", "totalreturned",
		"remark", "modifydate", "syncdate", "keyword", "start", "end", "order_asc", "order_desc" })
@XmlRootElement(name = "VROutputSheetDetailsBeanParam")
public class VROutputSheetDetailsBeanParam {
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
	@QueryParam(value = "inputsheetid")
	protected Long inputSheetId;
	@QueryParam(value = "outputsheetid")
	protected Long outputSheetId;
	@QueryParam(value = "bookid")
	protected Long bookId;
	@QueryParam(value = "issuevehiclecertificateid")
	protected Long issueVehicleCertificateId;
	@QueryParam(value = "certificateid")
	protected Long certificateId;
	@QueryParam(value = "certificatenumber")
	protected String certificateNumber;
	@QueryParam(value = "certificatedate")
	protected String certificateDate;
	@QueryParam(value = "vehicleclass")
	protected String vehicleClass;
	@QueryParam(value = "stamptype")
	protected String stampType;
	@QueryParam(value = "stampshortno")
	protected String stampShortNo;
	@QueryParam(value = "serialstartno")
	protected Long serialStartNo;
	@QueryParam(value = "serialendno")
	protected Long serialEndNo;
	@QueryParam(value = "subtotalindocument")
	protected Long subTotalInDocument;
	@QueryParam(value = "subtotalquantities")
	protected Long subTotalQuantities;
	@QueryParam(value = "unitprice")
	protected Long unitPrice;
	@QueryParam(value = "totalamount")
	protected Long totalAmount;
	@QueryParam(value = "totalinuse")
	protected Long totalInUse;
	@QueryParam(value = "totalnotused")
	protected Long totalNotUsed;
	@QueryParam(value = "totallost")
	protected Long totalLost;
	@QueryParam(value = "totalcancelled")
	protected Long totalCancelled;
	@QueryParam(value = "totalreturned")
	protected Long totalReturned;
	@QueryParam(value = "remark")
	protected String remark;
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

	public Long getMtCore() {
		return mtCore;
	}

	public void setMtCore(Long mtCore) {
		this.mtCore = mtCore;
	}

	public Long getInputSheetId() {
		return inputSheetId;
	}

	public void setInputSheetId(Long inputSheetId) {
		this.inputSheetId = inputSheetId;
	}

	public Long getOutputSheetId() {
		return outputSheetId;
	}

	public void setOutputSheetId(Long outputSheetId) {
		this.outputSheetId = outputSheetId;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public Long getIssueVehicleCertificateId() {
		return issueVehicleCertificateId;
	}

	public void setIssueVehicleCertificateId(Long issueVehicleCertificateId) {
		this.issueVehicleCertificateId = issueVehicleCertificateId;
	}

	public Long getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(Long certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public String getCertificateDate() {
		return certificateDate;
	}

	public void setCertificateDate(String certificateDate) {
		this.certificateDate = certificateDate;
	}

	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	public String getStampType() {
		return stampType;
	}

	public void setStampType(String stampType) {
		this.stampType = stampType;
	}

	public String getStampShortNo() {
		return stampShortNo;
	}

	public void setStampShortNo(String stampShortNo) {
		this.stampShortNo = stampShortNo;
	}

	public Long getSerialStartNo() {
		return serialStartNo;
	}

	public void setSerialStartNo(Long serialStartNo) {
		this.serialStartNo = serialStartNo;
	}

	public Long getSerialEndNo() {
		return serialEndNo;
	}

	public void setSerialEndNo(Long serialEndNo) {
		this.serialEndNo = serialEndNo;
	}

	public Long getSubTotalInDocument() {
		return subTotalInDocument;
	}

	public void setSubTotalInDocument(Long subTotalInDocument) {
		this.subTotalInDocument = subTotalInDocument;
	}

	public Long getSubTotalQuantities() {
		return subTotalQuantities;
	}

	public void setSubTotalQuantities(Long subTotalQuantities) {
		this.subTotalQuantities = subTotalQuantities;
	}

	public Long getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Long unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getTotalInUse() {
		return totalInUse;
	}

	public void setTotalInUse(Long totalInUse) {
		this.totalInUse = totalInUse;
	}

	public Long getTotalNotUsed() {
		return totalNotUsed;
	}

	public void setTotalNotUsed(Long totalNotUsed) {
		this.totalNotUsed = totalNotUsed;
	}

	public Long getTotalLost() {
		return totalLost;
	}

	public void setTotalLost(Long totalLost) {
		this.totalLost = totalLost;
	}

	public Long getTotalCancelled() {
		return totalCancelled;
	}

	public void setTotalCancelled(Long totalCancelled) {
		this.totalCancelled = totalCancelled;
	}

	public Long getTotalReturned() {
		return totalReturned;
	}

	public void setTotalReturned(Long totalReturned) {
		this.totalReturned = totalReturned;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
