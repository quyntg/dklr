package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "mtcore", "outputsheetno", "outputsheetdate", "originaldocumentno",
		"suppliercorporationid", "outputsheettype", "maker", "checker", "approver", "receivername", "receiverplace",
		"receiverrequest", "inventoryname", "inventoryplace", "inventorydate", "dossierid", "issueid", "purchaserid",
		"purchasercorporationid", "bookidlist", "isapproval", "totalquantities", "totalamount", "amountinwords",
		"remark", "modifydate", "syncdate", "keyword", "start", "end", "order_asc", "order_desc" })
@XmlRootElement(name = "VROutputSheetBeanParam")
public class VROutputSheetBeanParam {
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
	@QueryParam(value = "outputsheetno")
	protected String outputSheetNo;
	@QueryParam(value = "outputsheetdate")
	protected String outputSheetDate;
	@QueryParam(value = "originaldocumentno")
	protected String originalDocumentNo;
	@QueryParam(value = "suppliercorporationid")
	protected Long supplierCorporationId;
	@QueryParam(value = "outputsheettype")
	protected Long outputSheetType;
	@QueryParam(value = "maker")
	protected String maker;
	@QueryParam(value = "checker")
	protected String checker;
	@QueryParam(value = "approver")
	protected String approver;
	@QueryParam(value = "receivername")
	protected String receiverName;
	@QueryParam(value = "receiverplace")
	protected String receiverPlace;
	@QueryParam(value = "receiverrequest")
	protected String receiverRequest;
	@QueryParam(value = "inventoryname")
	protected String inventoryName;
	@QueryParam(value = "inventoryplace")
	protected String inventoryPlace;
	@QueryParam(value = "inventorydate")
	protected String inventoryDate;
	@QueryParam(value = "dossierid")
	protected Long dossierId;
	@QueryParam(value = "issueid")
	protected Long issueId;
	@QueryParam(value = "purchaserid")
	protected Long purchaserId;
	@QueryParam(value = "purchasercorporationid")
	protected Long purchaserCorporationId;
	@QueryParam(value = "bookidlist")
	protected String bookIDList;
	@QueryParam(value = "isapproval")
	protected Long isApproval;
	@QueryParam(value = "totalquantities")
	protected Long totalQuantities;
	@QueryParam(value = "totalamount")
	protected Long totalAmount;
	@QueryParam(value = "amountinwords")
	protected String amountInWords;
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

	public String getOutputSheetNo() {
		return outputSheetNo;
	}

	public void setOutputSheetNo(String outputSheetNo) {
		this.outputSheetNo = outputSheetNo;
	}

	public String getOutputSheetDate() {
		return outputSheetDate;
	}

	public void setOutputSheetDate(String outputSheetDate) {
		this.outputSheetDate = outputSheetDate;
	}

	public String getOriginalDocumentNo() {
		return originalDocumentNo;
	}

	public void setOriginalDocumentNo(String originalDocumentNo) {
		this.originalDocumentNo = originalDocumentNo;
	}

	public Long getSupplierCorporationId() {
		return supplierCorporationId;
	}

	public void setSupplierCorporationId(Long supplierCorporationId) {
		this.supplierCorporationId = supplierCorporationId;
	}

	public Long getOutputSheetType() {
		return outputSheetType;
	}

	public void setOutputSheetType(Long outputSheetType) {
		this.outputSheetType = outputSheetType;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getChecker() {
		return checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public String getApprover() {
		return approver;
	}

	public void setApprover(String approver) {
		this.approver = approver;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPlace() {
		return receiverPlace;
	}

	public void setReceiverPlace(String receiverPlace) {
		this.receiverPlace = receiverPlace;
	}

	public String getReceiverRequest() {
		return receiverRequest;
	}

	public void setReceiverRequest(String receiverRequest) {
		this.receiverRequest = receiverRequest;
	}

	public String getInventoryName() {
		return inventoryName;
	}

	public void setInventoryName(String inventoryName) {
		this.inventoryName = inventoryName;
	}

	public String getInventoryPlace() {
		return inventoryPlace;
	}

	public void setInventoryPlace(String inventoryPlace) {
		this.inventoryPlace = inventoryPlace;
	}

	public String getInventoryDate() {
		return inventoryDate;
	}

	public void setInventoryDate(String inventoryDate) {
		this.inventoryDate = inventoryDate;
	}

	public Long getDossierId() {
		return dossierId;
	}

	public void setDossierId(Long dossierId) {
		this.dossierId = dossierId;
	}

	public Long getIssueId() {
		return issueId;
	}

	public void setIssueId(Long issueId) {
		this.issueId = issueId;
	}

	public Long getPurchaserId() {
		return purchaserId;
	}

	public void setPurchaserId(Long purchaserId) {
		this.purchaserId = purchaserId;
	}

	public Long getPurchaserCorporationId() {
		return purchaserCorporationId;
	}

	public void setPurchaserCorporationId(Long purchaserCorporationId) {
		this.purchaserCorporationId = purchaserCorporationId;
	}

	public String getBookIDList() {
		return bookIDList;
	}

	public void setBookIDList(String bookIDList) {
		this.bookIDList = bookIDList;
	}

	public Long getIsApproval() {
		return isApproval;
	}

	public void setIsApproval(Long isApproval) {
		this.isApproval = isApproval;
	}

	public Long getTotalQuantities() {
		return totalQuantities;
	}

	public void setTotalQuantities(Long totalQuantities) {
		this.totalQuantities = totalQuantities;
	}

	public Long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getAmountInWords() {
		return amountInWords;
	}

	public void setAmountInWords(String amountInWords) {
		this.amountInWords = amountInWords;
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
