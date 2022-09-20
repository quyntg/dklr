package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "vehiclecertificateid", "corporationid", "inspectorid", "actioncode",
		"progresstime", "remarks", "keyword", "start", "end", "order_asc", "order_desc" })
@XmlRootElement(name = "VRCertificateProgressBeanParam")
public class VRCertificateProgressBeanParam {
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
	@QueryParam(value = "corporationid")
	protected String corporationId;
	@QueryParam(value = "inspectorid")
	protected Long inspectorId;
	@QueryParam(value = "actioncode")
	protected String actionCode;
	@QueryParam(value = "progresstime")
	protected String progressTime;
	@QueryParam(value = "remarks")
	protected String remarks;

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

	public String getCorporationId() {
		return corporationId;
	}

	public void setCorporationId(String corporationId) {
		this.corporationId = corporationId;
	}

	public Long getInspectorId() {
		return inspectorId;
	}

	public void setInspectorId(Long inspectorId) {
		this.inspectorId = inspectorId;
	}

	public String getActionCode() {
		return actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public String getProgressTime() {
		return progressTime;
	}

	public void setProgressTime(String progressTime) {
		this.progressTime = progressTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
