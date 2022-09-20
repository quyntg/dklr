package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "mtcore", "corporationid", "inspectorid", "inspectorname", "inspectorphone",
		"inspectoremail", "contactcode", "regulartthc", "searchvehicle", "teamid", "markupteamleader", "markupboss",
		"executedictionary", "place", "title", "filechukyid", "keyword", "start", "end", "order_asc", "order_desc" })
@XmlRootElement(name = "VRCorporationInspectorBeanParam")
public class VRCorporationInspectorBeanParam {
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
	@QueryParam(value = "corporationid")
	protected String corporationId;
	@QueryParam(value = "inspectorid")
	protected Long inspectorid;
	@QueryParam(value = "inspectorname")
	protected String inspectorName;
	@QueryParam(value = "inspectorphone")
	protected String inspectorPhone;
	@QueryParam(value = "inspectoremail")
	protected String inspectorEmail;
	@QueryParam(value = "contactcode")
	protected String contactcode;
	@QueryParam(value = "regulartthc")
	protected Long regularTthc;
	@QueryParam(value = "searchvehicle")
	protected Integer searchVehicle;
	@QueryParam(value = "teamid")
	protected Long teamId;
	@QueryParam(value = "markupteamleader")
	protected Integer markupTeamLeader;
	@QueryParam(value = "markupboss")
	protected Integer markUpBoss;
	@QueryParam(value = "executedictionary")
	protected String executedictionary;
	@QueryParam(value = "place")
	protected String place;
	@QueryParam(value = "title")
	protected String title;
	@QueryParam(value = "filechukyid")
	protected Long filechukyId;

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

	public String getCorporationId() {
		return corporationId;
	}

	public void setCorporationId(String corporationId) {
		this.corporationId = corporationId;
	}

	public Long getInspectorid() {
		return inspectorid;
	}

	public void setInspectorid(Long inspectorid) {
		this.inspectorid = inspectorid;
	}

	public String getInspectorName() {
		return inspectorName;
	}

	public void setInspectorName(String inspectorName) {
		this.inspectorName = inspectorName;
	}

	public String getInspectorPhone() {
		return inspectorPhone;
	}

	public void setInspectorPhone(String inspectorPhone) {
		this.inspectorPhone = inspectorPhone;
	}

	public String getInspectorEmail() {
		return inspectorEmail;
	}

	public void setInspectorEmail(String inspectorEmail) {
		this.inspectorEmail = inspectorEmail;
	}

	public String getContactcode() {
		return contactcode;
	}

	public void setContactcode(String contactcode) {
		this.contactcode = contactcode;
	}

	public Long getRegularTthc() {
		return regularTthc;
	}

	public void setRegularTthc(Long regularTthc) {
		this.regularTthc = regularTthc;
	}

	public Integer getSearchVehicle() {
		return searchVehicle;
	}

	public void setSearchVehicle(Integer searchVehicle) {
		this.searchVehicle = searchVehicle;
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public Integer getMarkupTeamLeader() {
		return markupTeamLeader;
	}

	public void setMarkupTeamLeader(Integer markupTeamLeader) {
		this.markupTeamLeader = markupTeamLeader;
	}

	public Integer getMarkUpBoss() {
		return markUpBoss;
	}

	public void setMarkUpBoss(Integer markUpBoss) {
		this.markUpBoss = markUpBoss;
	}

	public String getExecutedictionary() {
		return executedictionary;
	}

	public void setExecutedictionary(String executedictionary) {
		this.executedictionary = executedictionary;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getFilechukyId() {
		return filechukyId;
	}

	public void setFilechukyId(Long filechukyId) {
		this.filechukyId = filechukyId;
	}

}
