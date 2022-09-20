package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "mtcore", "yearofperiod", "previousperiod", "previousperiodcode", "bookid",
		"vehicleclass", "stamptype", "stampshortno", "serialstartno", "serialendno", "totalquantities", "totalinuse",
		"totalnotused", "remark", "corporationid", "checktype", "checkstatus", "modifydate", "syncdate", "keyword",
		"start", "end", "order_asc", "order_desc" })
@XmlRootElement(name = "VRInventoryBeanParam")
public class VRInventoryBeanParam {
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
	@QueryParam(value = "yearofperiod")
	protected Long yearofPeriod;
	@QueryParam(value = "previousperiod")
	protected String previousPeriod;
	@QueryParam(value = "previousperiodcode")
	protected String previousPeriodCode;
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
	@QueryParam(value = "totalquantities")
	protected Long totalQuantities;
	@QueryParam(value = "totalinuse")
	protected Long totalInUse;
	@QueryParam(value = "totalnotused")
	protected Long totalNotUsed;
	@QueryParam(value = "remark")
	protected String remark;
	@QueryParam(value = "corporationid")
	protected Long corporationId;
	@QueryParam(value = "checktype")
	protected Long checkType;
	@QueryParam(value = "checkstatus")
	protected Long checkStatus;
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

	public Long getYearofPeriod() {
		return yearofPeriod;
	}

	public void setYearofPeriod(Long yearofPeriod) {
		this.yearofPeriod = yearofPeriod;
	}

	public String getPreviousPeriod() {
		return previousPeriod;
	}

	public void setPreviousPeriod(String previousPeriod) {
		this.previousPeriod = previousPeriod;
	}

	public String getPreviousPeriodCode() {
		return previousPeriodCode;
	}

	public void setPreviousPeriodCode(String previousPeriodCode) {
		this.previousPeriodCode = previousPeriodCode;
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

	public Long getTotalQuantities() {
		return totalQuantities;
	}

	public void setTotalQuantities(Long totalQuantities) {
		this.totalQuantities = totalQuantities;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getCorporationId() {
		return corporationId;
	}

	public void setCorporationId(Long corporationId) {
		this.corporationId = corporationId;
	}

	public Long getCheckType() {
		return checkType;
	}

	public void setCheckType(Long checkType) {
		this.checkType = checkType;
	}

	public Long getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(Long checkStatus) {
		this.checkStatus = checkStatus;
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
