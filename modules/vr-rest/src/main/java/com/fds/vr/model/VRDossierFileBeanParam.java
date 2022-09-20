package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "dossierfileid", "groupid", "companyid", "userid", "username", "createdate",
		"modifieddate", "dossierid", "referenceuid", "dossiertemplateno", "dossierpartno", "dossierparttype",
		"filetemplateno", "displayname", "formdata", "fileentryid", "original", "eform", "isnew", "removed",
		"signcheck", "signinfo", "formscript", "formreport", "formschema", "deliverablecode", "keyword", "start", "end",
		"order_asc", "order_desc" })
@XmlRootElement(name = "VRDossierFileBeanParam")
public class VRDossierFileBeanParam {
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
	@QueryParam(value = "dossierfileid")
	protected Long dossierFileId;
	@QueryParam(value = "groupid")
	protected Long groupId;
	@QueryParam(value = "companyid")
	protected Long companyId;
	@QueryParam(value = "userid")
	protected Long userId;
	@QueryParam(value = "username")
	protected String userName;
	@QueryParam(value = "createdate")
	protected String createDate;
	@QueryParam(value = "modifieddate")
	protected String modifiedDate;
	@QueryParam(value = "dossierid")
	protected Long dossierId;
	@QueryParam(value = "referenceuid")
	protected String referenceUid;
	@QueryParam(value = "dossiertemplateno")
	protected String dossierTemplateNo;
	@QueryParam(value = "dossierpartno")
	protected String dossierPartNo;
	@QueryParam(value = "dossierparttype")
	protected Integer dossierPartType;
	@QueryParam(value = "filetemplateno")
	protected String fileTemplateNo;
	@QueryParam(value = "displayname")
	protected String displayName;
	@QueryParam(value = "formdata")
	protected String formData;
	@QueryParam(value = "fileentryid")
	protected Long fileEntryId;
	@QueryParam(value = "original")
	protected Boolean original;
	@QueryParam(value = "eform")
	protected Boolean eForm;
	@QueryParam(value = "isnew")
	protected Boolean isNew;
	@QueryParam(value = "removed")
	protected Boolean removed;
	@QueryParam(value = "signcheck")
	protected Integer signCheck;
	@QueryParam(value = "signinfo")
	protected String signInfo;
	@QueryParam(value = "formscript")
	protected String formScript;
	@QueryParam(value = "formreport")
	protected String formReport;
	@QueryParam(value = "formschema")
	protected String formSchema;
	@QueryParam(value = "deliverablecode")
	protected String deliverableCode;

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

	public Long getDossierFileId() {
		return dossierFileId;
	}

	public void setDossierFileId(Long dossierFileId) {
		this.dossierFileId = dossierFileId;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Long getDossierId() {
		return dossierId;
	}

	public void setDossierId(Long dossierId) {
		this.dossierId = dossierId;
	}

	public String getReferenceUid() {
		return referenceUid;
	}

	public void setReferenceUid(String referenceUid) {
		this.referenceUid = referenceUid;
	}

	public String getDossierTemplateNo() {
		return dossierTemplateNo;
	}

	public void setDossierTemplateNo(String dossierTemplateNo) {
		this.dossierTemplateNo = dossierTemplateNo;
	}

	public String getDossierPartNo() {
		return dossierPartNo;
	}

	public void setDossierPartNo(String dossierPartNo) {
		this.dossierPartNo = dossierPartNo;
	}

	public Integer getDossierPartType() {
		return dossierPartType;
	}

	public void setDossierPartType(Integer dossierPartType) {
		this.dossierPartType = dossierPartType;
	}

	public String getFileTemplateNo() {
		return fileTemplateNo;
	}

	public void setFileTemplateNo(String fileTemplateNo) {
		this.fileTemplateNo = fileTemplateNo;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getFormData() {
		return formData;
	}

	public void setFormData(String formData) {
		this.formData = formData;
	}

	public Long getFileEntryId() {
		return fileEntryId;
	}

	public void setFileEntryId(Long fileEntryId) {
		this.fileEntryId = fileEntryId;
	}

	public Boolean getOriginal() {
		return original;
	}

	public void setOriginal(Boolean original) {
		this.original = original;
	}

	public Boolean geteForm() {
		return eForm;
	}

	public void seteForm(Boolean eForm) {
		this.eForm = eForm;
	}

	public Boolean getIsNew() {
		return isNew;
	}

	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	public Boolean getRemoved() {
		return removed;
	}

	public void setRemoved(Boolean removed) {
		this.removed = removed;
	}

	public Integer getSignCheck() {
		return signCheck;
	}

	public void setSignCheck(Integer signCheck) {
		this.signCheck = signCheck;
	}

	public String getSignInfo() {
		return signInfo;
	}

	public void setSignInfo(String signInfo) {
		this.signInfo = signInfo;
	}

	public String getFormScript() {
		return formScript;
	}

	public void setFormScript(String formScript) {
		this.formScript = formScript;
	}

	public String getFormReport() {
		return formReport;
	}

	public void setFormReport(String formReport) {
		this.formReport = formReport;
	}

	public String getFormSchema() {
		return formSchema;
	}

	public void setFormSchema(String formSchema) {
		this.formSchema = formSchema;
	}

	public String getDeliverableCode() {
		return deliverableCode;
	}

	public void setDeliverableCode(String deliverableCode) {
		this.deliverableCode = deliverableCode;
	}

}
