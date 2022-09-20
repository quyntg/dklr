/**
 * 
 */
package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author ddung
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "start", "end", "order_asc", "order_desc", "id", "applicantcode",
		"productionplantcode", "contenttype", "contentfiletemplate", "contentfileentryid", "dossierid", "dossieridctn",
		"dossierno", "modifyuserid", "createdate", "modifydate", "syncdate" })
@XmlRootElement(name = "VRHistoryProfileBeanParam")
public class VRHistoryProfileBeanParam {
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
	protected long id;
	@QueryParam(value = "applicantcode")
	protected String applicantCode;
	@QueryParam(value = "productionplantcode")
	protected String productionPlantCode;
	@QueryParam(value = "contenttype")
	protected String contentType;
	@QueryParam(value = "contentfiletemplate")
	protected String contentFileTemplate;
	@QueryParam(value = "contentfileentryid")
	protected String contentFileEntryId;
	@QueryParam(value = "dossierid")
	protected long dossierId;
	@QueryParam(value = "dossieridctn")
	protected String dossierIdCTN;
	@QueryParam(value = "dossierno")
	protected String dossierNo;
	@QueryParam(value = "modifyuserid")
	protected long modifyUserId;
	@QueryParam(value = "createdate")
	protected String createDate;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getApplicantCode() {
		return applicantCode;
	}

	public void setApplicantCode(String applicantCode) {
		this.applicantCode = applicantCode;
	}

	public String getProductionPlantCode() {
		return productionPlantCode;
	}

	public void setProductionPlantCode(String productionPlantCode) {
		this.productionPlantCode = productionPlantCode;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getContentFileTemplate() {
		return contentFileTemplate;
	}

	public void setContentFileTemplate(String contentFileTemplate) {
		this.contentFileTemplate = contentFileTemplate;
	}

	public String getContentFileEntryId() {
		return contentFileEntryId;
	}

	public void setContentFileEntryId(String contentFileEntryId) {
		this.contentFileEntryId = contentFileEntryId;
	}

	public long getDossierId() {
		return dossierId;
	}

	public void setDossierId(long dossierId) {
		this.dossierId = dossierId;
	}

	public String getDossierIdCTN() {
		return dossierIdCTN;
	}

	public void setDossierIdCTN(String dossierIdCTN) {
		this.dossierIdCTN = dossierIdCTN;
	}

	public String getDossierNo() {
		return dossierNo;
	}

	public void setDossierNo(String dossierNo) {
		this.dossierNo = dossierNo;
	}

	public long getModifyUserId() {
		return modifyUserId;
	}

	public void setModifyUserId(long modifyUserId) {
		this.modifyUserId = modifyUserId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
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
