package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "vehiclecertificateid", "deliverablecode", "sequenceno", "circularno",
		"circulardate", "markupstatus", "module", "modifydate", "syncdate", "keyword", "start", "end", "order_asc",
		"order_desc" })
@XmlRootElement(name = "VRInspectionStandardBeanParam")
public class VRInspectionStandardBeanParam {
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
	@QueryParam(value = "deliverablecode")
	protected String deliverableCode;
	@QueryParam(value = "sequenceno")
	protected Long sequenceNo;
	@QueryParam(value = "circularno")
	protected String circularno;
	@QueryParam(value = "circulardate")
	protected String circulardate;
	@QueryParam(value = "markupstatus")
	protected Long markupstatus;
	@QueryParam(value = "module")
	protected String module;
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

	public String getDeliverableCode() {
		return deliverableCode;
	}

	public void setDeliverableCode(String deliverableCode) {
		this.deliverableCode = deliverableCode;
	}

	public Long getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(Long sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public String getCircularno() {
		return circularno;
	}

	public void setCircularno(String circularno) {
		this.circularno = circularno;
	}

	public String getCirculardate() {
		return circulardate;
	}

	public void setCirculardate(String circulardate) {
		this.circulardate = circulardate;
	}

	public Long getMarkupstatus() {
		return markupstatus;
	}

	public void setMarkupstatus(Long markupstatus) {
		this.markupstatus = markupstatus;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
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
