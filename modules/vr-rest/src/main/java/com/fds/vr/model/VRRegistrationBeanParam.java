package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "registrationid", "companyid", "groupid", "userid", "createdate", "modifieddate",
		"applicantname", "applicantidtype", "applicantidno", "applicantiddate", "address", "citycode", "cityname",
		"districtcode", "districtname", "wardcode", "wardname", "contactname", "contacttelno", "contactemail",
		"govagencycode", "govagencyname", "registrationstate", "registrationclass", "submitting",
		"representativeenterprise", "remarks", "markasdeleted", "keyword", "start", "end", "order_asc", "order_desc" })
@XmlRootElement(name = "VRRegistrationBeanParam")
public class VRRegistrationBeanParam {
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
	@QueryParam(value = "registrationid")
	protected Long registrationId;
	@QueryParam(value = "companyid")
	protected Long companyId;
	@QueryParam(value = "groupid")
	protected Long groupId;
	@QueryParam(value = "userid")
	protected Long userId;
	@QueryParam(value = "createdate")
	protected String createDate;
	@QueryParam(value = "modifieddate")
	protected String modifiedDate;
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
	@QueryParam(value = "govagencycode")
	protected String govAgencyCode;
	@QueryParam(value = "govagencyname")
	protected String govAgencyName;
	@QueryParam(value = "registrationstate")
	protected Integer registrationState;
	@QueryParam(value = "registrationclass")
	protected String registrationClass;
	@QueryParam(value = "submitting")
	protected Boolean submitting;
	@QueryParam(value = "representativeenterprise")
	protected String representativeEnterprise;
	@QueryParam(value = "remarks")
	protected String remarks;
	@QueryParam(value = "markasdeleted")
	protected Integer markasdeleted;

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

	public Long getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(Long registrationId) {
		this.registrationId = registrationId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public Integer getRegistrationState() {
		return registrationState;
	}

	public void setRegistrationState(Integer registrationState) {
		this.registrationState = registrationState;
	}

	public String getRegistrationClass() {
		return registrationClass;
	}

	public void setRegistrationClass(String registrationClass) {
		this.registrationClass = registrationClass;
	}

	public Boolean getSubmitting() {
		return submitting;
	}

	public void setSubmitting(Boolean submitting) {
		this.submitting = submitting;
	}

	public String getRepresentativeEnterprise() {
		return representativeEnterprise;
	}

	public void setRepresentativeEnterprise(String representativeEnterprise) {
		this.representativeEnterprise = representativeEnterprise;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getMarkasdeleted() {
		return markasdeleted;
	}

	public void setMarkasdeleted(Integer markasdeleted) {
		this.markasdeleted = markasdeleted;
	}

}
