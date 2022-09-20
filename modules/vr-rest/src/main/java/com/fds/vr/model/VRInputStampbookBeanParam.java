package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "mtcore", "inputsheetid", "bookid", "vehicleclass", "stamptype", "stampshortno",
		"serialstartno", "serialendno", "subtotalindocument", "subtotalquantities", "units", "unitprice", "totalamount",
		"totalinuse", "totalnotused", "sum1", "sum2", "sum3", "remark", "modifydate", "syncdate", "keyword", "start",
		"end", "order_asc", "order_desc" })
@XmlRootElement(name = "VRInputStampbookBeanParam")
public class VRInputStampbookBeanParam {
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
	@QueryParam(value = "bookid")
	protected Long bookId;
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
	@QueryParam(value = "units")
	protected Long units;
	@QueryParam(value = "unitprice")
	protected Long unitPrice;
	@QueryParam(value = "totalamount")
	protected Long totalAmount;
	@QueryParam(value = "totalinuse")
	protected Long totalInUse;
	@QueryParam(value = "totalnotused")
	protected Long totalNotUsed;
	@QueryParam(value = "sum1")
	protected Long sum1;
	@QueryParam(value = "sum2")
	protected Long sum2;
	@QueryParam(value = "sum3")
	protected Long sum3;
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

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
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

	public Long getUnits() {
		return units;
	}

	public void setUnits(Long units) {
		this.units = units;
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

	public Long getSum1() {
		return sum1;
	}

	public void setSum1(Long sum1) {
		this.sum1 = sum1;
	}

	public Long getSum2() {
		return sum2;
	}

	public void setSum2(Long sum2) {
		this.sum2 = sum2;
	}

	public Long getSum3() {
		return sum3;
	}

	public void setSum3(Long sum3) {
		this.sum3 = sum3;
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
