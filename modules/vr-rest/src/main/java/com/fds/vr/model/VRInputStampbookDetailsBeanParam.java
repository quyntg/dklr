package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "mtcore", "stampserialno", "sequenceno", "dossierid", "certificateid",
		"certificatenumber", "certificatedate", "vehiclerecordid", "frameno", "boxno", "vinno", "engineno", "qrcode",
		"copies", "markupfulfill", "replacedserialno", "remark", "inputsheetid", "bookid", "purchaserid",
		"corporationid", "issuingstatus", "clearingstatus", "stampstatus", "issuingdate", "printingdate",
		"noticeoflostdate", "noticeofcanceldate", "noticeofreturndate", "clearingdate", "clearingadvancepaymentid",
		"modifydate", "syncdate", "keyword", "start", "end", "order_asc", "order_desc" })
@XmlRootElement(name = "VRInputStampbookDetailsBeanParam")
public class VRInputStampbookDetailsBeanParam {
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
	@QueryParam(value = "stampserialno")
	protected String stampSerialNo;
	@QueryParam(value = "sequenceno")
	protected Long sequenceNo;
	@QueryParam(value = "dossierid")
	protected Long dossierId;
	@QueryParam(value = "certificateid")
	protected Long certificateId;
	@QueryParam(value = "certificatenumber")
	protected String certificateNumber;
	@QueryParam(value = "certificatedate")
	protected String certificateDate;
	@QueryParam(value = "vehiclerecordid")
	protected Long vehicleRecordId;
	@QueryParam(value = "frameno")
	protected String frameNo;
	@QueryParam(value = "boxno")
	protected String boxNo;
	@QueryParam(value = "vinno")
	protected String vinNo;
	@QueryParam(value = "engineno")
	protected String engineNo;
	@QueryParam(value = "qrcode")
	protected String qrCode;
	@QueryParam(value = "copies")
	protected Long copies;
	@QueryParam(value = "markupfulfill")
	protected Long markupFulfill;
	@QueryParam(value = "replacedserialno")
	protected String replacedSerialNo;
	@QueryParam(value = "remark")
	protected String remark;
	@QueryParam(value = "inputsheetid")
	protected Long inputSheetId;
	@QueryParam(value = "bookid")
	protected Long bookId;
	@QueryParam(value = "purchaserid")
	protected Long purchaserId;
	@QueryParam(value = "corporationid")
	protected Long corporationId;
	@QueryParam(value = "issuingstatus")
	protected Long issuingStatus;
	@QueryParam(value = "clearingstatus")
	protected Long clearingStatus;
	@QueryParam(value = "stampstatus")
	protected Long stampStatus;
	@QueryParam(value = "issuingdate")
	protected String issuingDate;
	@QueryParam(value = "printingdate")
	protected String printingDate;
	@QueryParam(value = "noticeoflostdate")
	protected String noticeofLostDate;
	@QueryParam(value = "noticeofcanceldate")
	protected String noticeofCancelDate;
	@QueryParam(value = "noticeofreturndate")
	protected String noticeofReturnDate;
	@QueryParam(value = "clearingdate")
	protected String clearingDate;
	@QueryParam(value = "clearingadvancepaymentid")
	protected Long clearingAdvancePaymentID;
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

	public String getStampSerialNo() {
		return stampSerialNo;
	}

	public void setStampSerialNo(String stampSerialNo) {
		this.stampSerialNo = stampSerialNo;
	}

	public Long getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(Long sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public Long getDossierId() {
		return dossierId;
	}

	public void setDossierId(Long dossierId) {
		this.dossierId = dossierId;
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

	public Long getVehicleRecordId() {
		return vehicleRecordId;
	}

	public void setVehicleRecordId(Long vehicleRecordId) {
		this.vehicleRecordId = vehicleRecordId;
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

	public String getVinNo() {
		return vinNo;
	}

	public void setVinNo(String vinNo) {
		this.vinNo = vinNo;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public Long getCopies() {
		return copies;
	}

	public void setCopies(Long copies) {
		this.copies = copies;
	}

	public Long getMarkupFulfill() {
		return markupFulfill;
	}

	public void setMarkupFulfill(Long markupFulfill) {
		this.markupFulfill = markupFulfill;
	}

	public String getReplacedSerialNo() {
		return replacedSerialNo;
	}

	public void setReplacedSerialNo(String replacedSerialNo) {
		this.replacedSerialNo = replacedSerialNo;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getInputSheetId() {
		return inputSheetId;
	}

	public void setInputSheetId(Long inputSheetId) {
		this.inputSheetId = inputSheetId;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public Long getPurchaserId() {
		return purchaserId;
	}

	public void setPurchaserId(Long purchaserId) {
		this.purchaserId = purchaserId;
	}

	public Long getCorporationId() {
		return corporationId;
	}

	public void setCorporationId(Long corporationId) {
		this.corporationId = corporationId;
	}

	public Long getIssuingStatus() {
		return issuingStatus;
	}

	public void setIssuingStatus(Long issuingStatus) {
		this.issuingStatus = issuingStatus;
	}

	public Long getClearingStatus() {
		return clearingStatus;
	}

	public void setClearingStatus(Long clearingStatus) {
		this.clearingStatus = clearingStatus;
	}

	public Long getStampStatus() {
		return stampStatus;
	}

	public void setStampStatus(Long stampStatus) {
		this.stampStatus = stampStatus;
	}

	public String getIssuingDate() {
		return issuingDate;
	}

	public void setIssuingDate(String issuingDate) {
		this.issuingDate = issuingDate;
	}

	public String getPrintingDate() {
		return printingDate;
	}

	public void setPrintingDate(String printingDate) {
		this.printingDate = printingDate;
	}

	public String getNoticeofLostDate() {
		return noticeofLostDate;
	}

	public void setNoticeofLostDate(String noticeofLostDate) {
		this.noticeofLostDate = noticeofLostDate;
	}

	public String getNoticeofCancelDate() {
		return noticeofCancelDate;
	}

	public void setNoticeofCancelDate(String noticeofCancelDate) {
		this.noticeofCancelDate = noticeofCancelDate;
	}

	public String getNoticeofReturnDate() {
		return noticeofReturnDate;
	}

	public void setNoticeofReturnDate(String noticeofReturnDate) {
		this.noticeofReturnDate = noticeofReturnDate;
	}

	public String getClearingDate() {
		return clearingDate;
	}

	public void setClearingDate(String clearingDate) {
		this.clearingDate = clearingDate;
	}

	public Long getClearingAdvancePaymentID() {
		return clearingAdvancePaymentID;
	}

	public void setClearingAdvancePaymentID(Long clearingAdvancePaymentID) {
		this.clearingAdvancePaymentID = clearingAdvancePaymentID;
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
