package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "dossierid", "groupid", "companyid", "userid", "username", "createdate",
		"modifieddate", "referenceuid", "counter", "servicecode", "servicename", "govagencycode", "govagencyname",
		"applicantname", "applicantidtype", "applicantidno", "applicantiddate", "address", "citycode", "cityname",
		"districtcode", "districtname", "wardcode", "wardname", "contactname", "contacttelno", "contactemail",
		"dossiertemplateno", "dossiertemplatename", "dossiernote", "submissionnote", "applicantnote", "briefnote",
		"dossierno", "submitting", "submitdate", "receivedate", "duedate", "releasedate", "finishdate",
		"cancellingdate", "correcttingdate", "dossierstatus", "dossierstatustext", "dossiersubstatus",
		"dossiersubstatustext", "folderid", "dossieractionid", "viapostal", "postaladdress", "postalcitycode",
		"postalcityname", "postaltelno", "password", "notification", "online", "serverno", "endorsementdate",
		"lockstate", "keyword", "start", "end", "order_asc", "order_desc" })
@XmlRootElement(name = "VRDossierBeanParam")
public class VRDossierBeanParam {
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
	@QueryParam(value = "dossierid")
	protected Long dossierId;
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
	@QueryParam(value = "referenceuid")
	protected String referenceUid;
	@QueryParam(value = "counter")
	protected Integer counter;
	@QueryParam(value = "servicecode")
	protected String serviceCode;
	@QueryParam(value = "servicename")
	protected String serviceName;
	@QueryParam(value = "govagencycode")
	protected String govAgencyCode;
	@QueryParam(value = "govagencyname")
	protected String govAgencyName;
	@QueryParam(value = "applicantname")
	protected String applicantName;
	@QueryParam(value = "applicantidtype")
	protected String applicantIdType;
	@QueryParam(value = "applicantidno")
	protected String applicantIdNo;
	@QueryParam(value = "applicantiddate")
	protected String applicantIdDate;
	@QueryParam(value = "address")
	protected String address;
	@QueryParam(value = "citycode")
	protected String cityCode;
	@QueryParam(value = "cityname")
	protected String cityName;
	@QueryParam(value = "districtcode")
	protected String districtCode;
	@QueryParam(value = "districtname")
	protected String districtName;
	@QueryParam(value = "wardcode")
	protected String wardCode;
	@QueryParam(value = "wardname")
	protected String wardName;
	@QueryParam(value = "contactname")
	protected String contactName;
	@QueryParam(value = "contacttelno")
	protected String contactTelNo;
	@QueryParam(value = "contactemail")
	protected String contactEmail;
	@QueryParam(value = "dossiertemplateno")
	protected String dossierTemplateNo;
	@QueryParam(value = "dossiertemplatename")
	protected String dossierTemplateName;
	@QueryParam(value = "dossiernote")
	protected String dossierNote;
	@QueryParam(value = "submissionnote")
	protected String submissionNote;
	@QueryParam(value = "applicantnote")
	protected String applicantNote;
	@QueryParam(value = "briefnote")
	protected String briefNote;
	@QueryParam(value = "dossierno")
	protected String dossierNo;
	@QueryParam(value = "submitting")
	protected Boolean submitting;
	@QueryParam(value = "submitdate")
	protected String submitDate;
	@QueryParam(value = "receivedate")
	protected String receiveDate;
	@QueryParam(value = "duedate")
	protected String dueDate;
	@QueryParam(value = "releasedate")
	protected String releaseDate;
	@QueryParam(value = "finishdate")
	protected String finishDate;
	@QueryParam(value = "cancellingdate")
	protected String cancellingDate;
	@QueryParam(value = "correcttingdate")
	protected String correcttingDate;
	@QueryParam(value = "dossierstatus")
	protected String dossierStatus;
	@QueryParam(value = "dossierstatustext")
	protected String dossierStatusText;
	@QueryParam(value = "dossiersubstatus")
	protected String dossierSubStatus;
	@QueryParam(value = "dossiersubstatustext")
	protected String dossierSubStatusText;
	@QueryParam(value = "folderid")
	protected Long folderId;
	@QueryParam(value = "dossieractionid")
	protected Long dossierActionId;
	@QueryParam(value = "viapostal")
	protected Integer viaPostal;
	@QueryParam(value = "postaladdress")
	protected String postalAddress;
	@QueryParam(value = "postalcitycode")
	protected String postalCityCode;
	@QueryParam(value = "postalcityname")
	protected String postalCityName;
	@QueryParam(value = "postaltelno")
	protected String postalTelNo;
	@QueryParam(value = "password")
	protected String password;
	@QueryParam(value = "notification")
	protected Boolean notification;
	@QueryParam(value = "online")
	protected Boolean online;
	@QueryParam(value = "serverno")
	protected String serverNo;
	@QueryParam(value = "endorsementdate")
	protected String endorsementDate;
	@QueryParam(value = "lockstate")
	protected String lockState;

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

	public Long getDossierId() {
		return dossierId;
	}

	public void setDossierId(Long dossierId) {
		this.dossierId = dossierId;
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

	public String getReferenceUid() {
		return referenceUid;
	}

	public void setReferenceUid(String referenceUid) {
		this.referenceUid = referenceUid;
	}

	public Integer getCounter() {
		return counter;
	}

	public void setCounter(Integer counter) {
		this.counter = counter;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getGovAgencyCode() {
		return govAgencyCode;
	}

	public void setGovAgencyCode(String govAgencyCode) {
		this.govAgencyCode = govAgencyCode;
	}

	public String getGovAgencyName() {
		return govAgencyName;
	}

	public void setGovAgencyName(String govAgencyName) {
		this.govAgencyName = govAgencyName;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantIdType() {
		return applicantIdType;
	}

	public void setApplicantIdType(String applicantIdType) {
		this.applicantIdType = applicantIdType;
	}

	public String getApplicantIdNo() {
		return applicantIdNo;
	}

	public void setApplicantIdNo(String applicantIdNo) {
		this.applicantIdNo = applicantIdNo;
	}

	public String getApplicantIdDate() {
		return applicantIdDate;
	}

	public void setApplicantIdDate(String applicantIdDate) {
		this.applicantIdDate = applicantIdDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getWardCode() {
		return wardCode;
	}

	public void setWardCode(String wardCode) {
		this.wardCode = wardCode;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactTelNo() {
		return contactTelNo;
	}

	public void setContactTelNo(String contactTelNo) {
		this.contactTelNo = contactTelNo;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getDossierTemplateNo() {
		return dossierTemplateNo;
	}

	public void setDossierTemplateNo(String dossierTemplateNo) {
		this.dossierTemplateNo = dossierTemplateNo;
	}

	public String getDossierTemplateName() {
		return dossierTemplateName;
	}

	public void setDossierTemplateName(String dossierTemplateName) {
		this.dossierTemplateName = dossierTemplateName;
	}

	public String getDossierNote() {
		return dossierNote;
	}

	public void setDossierNote(String dossierNote) {
		this.dossierNote = dossierNote;
	}

	public String getSubmissionNote() {
		return submissionNote;
	}

	public void setSubmissionNote(String submissionNote) {
		this.submissionNote = submissionNote;
	}

	public String getApplicantNote() {
		return applicantNote;
	}

	public void setApplicantNote(String applicantNote) {
		this.applicantNote = applicantNote;
	}

	public String getBriefNote() {
		return briefNote;
	}

	public void setBriefNote(String briefNote) {
		this.briefNote = briefNote;
	}

	public String getDossierNo() {
		return dossierNo;
	}

	public void setDossierNo(String dossierNo) {
		this.dossierNo = dossierNo;
	}

	public Boolean getSubmitting() {
		return submitting;
	}

	public void setSubmitting(Boolean submitting) {
		this.submitting = submitting;
	}

	public String getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(String submitDate) {
		this.submitDate = submitDate;
	}

	public String getReceiveDate() {
		return receiveDate;
	}

	public void setReceiveDate(String receiveDate) {
		this.receiveDate = receiveDate;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(String finishDate) {
		this.finishDate = finishDate;
	}

	public String getCancellingDate() {
		return cancellingDate;
	}

	public void setCancellingDate(String cancellingDate) {
		this.cancellingDate = cancellingDate;
	}

	public String getCorrecttingDate() {
		return correcttingDate;
	}

	public void setCorrecttingDate(String correcttingDate) {
		this.correcttingDate = correcttingDate;
	}

	public String getDossierStatus() {
		return dossierStatus;
	}

	public void setDossierStatus(String dossierStatus) {
		this.dossierStatus = dossierStatus;
	}

	public String getDossierStatusText() {
		return dossierStatusText;
	}

	public void setDossierStatusText(String dossierStatusText) {
		this.dossierStatusText = dossierStatusText;
	}

	public String getDossierSubStatus() {
		return dossierSubStatus;
	}

	public void setDossierSubStatus(String dossierSubStatus) {
		this.dossierSubStatus = dossierSubStatus;
	}

	public String getDossierSubStatusText() {
		return dossierSubStatusText;
	}

	public void setDossierSubStatusText(String dossierSubStatusText) {
		this.dossierSubStatusText = dossierSubStatusText;
	}

	public Long getFolderId() {
		return folderId;
	}

	public void setFolderId(Long folderId) {
		this.folderId = folderId;
	}

	public Long getDossierActionId() {
		return dossierActionId;
	}

	public void setDossierActionId(Long dossierActionId) {
		this.dossierActionId = dossierActionId;
	}

	public Integer getViaPostal() {
		return viaPostal;
	}

	public void setViaPostal(Integer viaPostal) {
		this.viaPostal = viaPostal;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

	public String getPostalCityCode() {
		return postalCityCode;
	}

	public void setPostalCityCode(String postalCityCode) {
		this.postalCityCode = postalCityCode;
	}

	public String getPostalCityName() {
		return postalCityName;
	}

	public void setPostalCityName(String postalCityName) {
		this.postalCityName = postalCityName;
	}

	public String getPostalTelNo() {
		return postalTelNo;
	}

	public void setPostalTelNo(String postalTelNo) {
		this.postalTelNo = postalTelNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getNotification() {
		return notification;
	}

	public void setNotification(Boolean notification) {
		this.notification = notification;
	}

	public Boolean getOnline() {
		return online;
	}

	public void setOnline(Boolean online) {
		this.online = online;
	}

	public String getServerNo() {
		return serverNo;
	}

	public void setServerNo(String serverNo) {
		this.serverNo = serverNo;
	}

	public String getEndorsementDate() {
		return endorsementDate;
	}

	public void setEndorsementDate(String endorsementDate) {
		this.endorsementDate = endorsementDate;
	}

	public String getLockState() {
		return lockState;
	}

	public void setLockState(String lockState) {
		this.lockState = lockState;
	}

}
