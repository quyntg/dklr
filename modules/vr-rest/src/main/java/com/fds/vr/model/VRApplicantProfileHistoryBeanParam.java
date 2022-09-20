package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "mtcore", "mappingma_cty", "mappingten_cty", "mappingdia_chi_cty",
		"mappingnote", "mappingstatus", "applicantcode", "applicantname", "applicantaddress", "applicantrepresentative",
		"applicantrepresentativetitle", "applicantphone", "applicantemail", "applicantfax", "applicantcontactname",
		"applicantcontactemail", "applicantcontactphone", "applicantnationality", "applicantregion", "applicantcity",
		"markupcorporation", "corporationid", "markupdesigner", "markupoverseasmanufacturer",
		"markupdomesticsmanufacturer", "markupimporter", "markupcomponentxcg", "markupcomponentxmy",
		"markupcomponentxcd", "markupcomponentxdd", "markupcomponentxcn", "markupcomponentxch", "markupxcg",
		"markupxmy", "markupxcd", "markupxdd", "markupxcn", "markupxch", "issuetypexcg", "issuetypexmy", "issuetypexcd",
		"issuetypexdd", "issuetypexcn", "issuetypexch", "issuetypedescription", "applicantceremonydate",
		"applicantoperationperiod", "applicantbusinesstype", "applicantmetadata", "applicantstatus", "modifydate",
		"syncdate", "keyword", "start", "end", "order_asc", "order_desc" })
@XmlRootElement(name = "VRApplicantProfileHistoryBeanParam")
public class VRApplicantProfileHistoryBeanParam {
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
	@QueryParam(value = "mappingma_cty")
	protected String mappingMA_CTY;
	@QueryParam(value = "mappingten_cty")
	protected String mappingTEN_CTY;
	@QueryParam(value = "mappingdia_chi_cty")
	protected String mappingDIA_CHI_CTY;
	@QueryParam(value = "mappingnote")
	protected String mappingNote;
	@QueryParam(value = "mappingstatus")
	protected String mappingStatus;
	@QueryParam(value = "applicantcode")
	protected String applicantCode;
	@QueryParam(value = "applicantname")
	protected String applicantName;
	@QueryParam(value = "applicantaddress")
	protected String applicantAddress;
	@QueryParam(value = "applicantrepresentative")
	protected String applicantRepresentative;
	@QueryParam(value = "applicantrepresentativetitle")
	protected String applicantRepresentativeTitle;
	@QueryParam(value = "applicantphone")
	protected String applicantPhone;
	@QueryParam(value = "applicantemail")
	protected String applicantEmail;
	@QueryParam(value = "applicantfax")
	protected String applicantFax;
	@QueryParam(value = "applicantcontactname")
	protected String applicantContactName;
	@QueryParam(value = "applicantcontactemail")
	protected String applicantContactEmail;
	@QueryParam(value = "applicantcontactphone")
	protected String applicantContactPhone;
	@QueryParam(value = "applicantnationality")
	protected String applicantNationality;
	@QueryParam(value = "applicantregion")
	protected String applicantRegion;
	@QueryParam(value = "applicantcity")
	protected String applicantCity;
	@QueryParam(value = "markupcorporation")
	protected String markupCorporation;
	@QueryParam(value = "corporationid")
	protected String corporationId;
	@QueryParam(value = "markupdesigner")
	protected String markupDesigner;
	@QueryParam(value = "markupoverseasmanufacturer")
	protected String markupOverseasManufacturer;
	@QueryParam(value = "markupdomesticsmanufacturer")
	protected String markupDomesticsManufacturer;
	@QueryParam(value = "markupimporter")
	protected String markupImporter;
	@QueryParam(value = "markupcomponentxcg")
	protected String markupComponentXCG;
	@QueryParam(value = "markupcomponentxmy")
	protected String markupComponentXMY;
	@QueryParam(value = "markupcomponentxcd")
	protected String markupComponentXCD;
	@QueryParam(value = "markupcomponentxdd")
	protected String markupComponentXDD;
	@QueryParam(value = "markupcomponentxcn")
	protected String markupComponentXCN;
	@QueryParam(value = "markupcomponentxch")
	protected String markupComponentXCH;
	@QueryParam(value = "markupxcg")
	protected String markupXCG;
	@QueryParam(value = "markupxmy")
	protected String markupXMY;
	@QueryParam(value = "markupxcd")
	protected String markupXCD;
	@QueryParam(value = "markupxdd")
	protected String markupXDD;
	@QueryParam(value = "markupxcn")
	protected String markupXCN;
	@QueryParam(value = "markupxch")
	protected String markupXCH;
	@QueryParam(value = "issuetypexcg")
	protected String issueTypeXCG;
	@QueryParam(value = "issuetypexmy")
	protected String issueTypeXMY;
	@QueryParam(value = "issuetypexcd")
	protected String issueTypeXCD;
	@QueryParam(value = "issuetypexdd")
	protected String issueTypeXDD;
	@QueryParam(value = "issuetypexcn")
	protected String issueTypeXCN;
	@QueryParam(value = "issuetypexch")
	protected String issueTypeXCH;
	@QueryParam(value = "issuetypedescription")
	protected String issueTypeDescription;
	@QueryParam(value = "applicantceremonydate")
	protected String applicantCeremonyDate;
	@QueryParam(value = "applicantoperationperiod")
	protected String applicantOperationPeriod;
	@QueryParam(value = "applicantbusinesstype")
	protected String applicantBusinessType;
	@QueryParam(value = "applicantmetadata")
	protected String applicantMetadata;
	@QueryParam(value = "applicantstatus")
	protected String applicantStatus;
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

	public String getMappingMA_CTY() {
		return mappingMA_CTY;
	}

	public void setMappingMA_CTY(String mappingMA_CTY) {
		this.mappingMA_CTY = mappingMA_CTY;
	}

	public String getMappingTEN_CTY() {
		return mappingTEN_CTY;
	}

	public void setMappingTEN_CTY(String mappingTEN_CTY) {
		this.mappingTEN_CTY = mappingTEN_CTY;
	}

	public String getMappingDIA_CHI_CTY() {
		return mappingDIA_CHI_CTY;
	}

	public void setMappingDIA_CHI_CTY(String mappingDIA_CHI_CTY) {
		this.mappingDIA_CHI_CTY = mappingDIA_CHI_CTY;
	}

	public String getMappingNote() {
		return mappingNote;
	}

	public void setMappingNote(String mappingNote) {
		this.mappingNote = mappingNote;
	}

	public String getMappingStatus() {
		return mappingStatus;
	}

	public void setMappingStatus(String mappingStatus) {
		this.mappingStatus = mappingStatus;
	}

	public String getApplicantCode() {
		return applicantCode;
	}

	public void setApplicantCode(String applicantCode) {
		this.applicantCode = applicantCode;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantAddress() {
		return applicantAddress;
	}

	public void setApplicantAddress(String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}

	public String getApplicantRepresentative() {
		return applicantRepresentative;
	}

	public void setApplicantRepresentative(String applicantRepresentative) {
		this.applicantRepresentative = applicantRepresentative;
	}

	public String getApplicantRepresentativeTitle() {
		return applicantRepresentativeTitle;
	}

	public void setApplicantRepresentativeTitle(String applicantRepresentativeTitle) {
		this.applicantRepresentativeTitle = applicantRepresentativeTitle;
	}

	public String getApplicantPhone() {
		return applicantPhone;
	}

	public void setApplicantPhone(String applicantPhone) {
		this.applicantPhone = applicantPhone;
	}

	public String getApplicantEmail() {
		return applicantEmail;
	}

	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}

	public String getApplicantFax() {
		return applicantFax;
	}

	public void setApplicantFax(String applicantFax) {
		this.applicantFax = applicantFax;
	}

	public String getApplicantContactName() {
		return applicantContactName;
	}

	public void setApplicantContactName(String applicantContactName) {
		this.applicantContactName = applicantContactName;
	}

	public String getApplicantContactEmail() {
		return applicantContactEmail;
	}

	public void setApplicantContactEmail(String applicantContactEmail) {
		this.applicantContactEmail = applicantContactEmail;
	}

	public String getApplicantContactPhone() {
		return applicantContactPhone;
	}

	public void setApplicantContactPhone(String applicantContactPhone) {
		this.applicantContactPhone = applicantContactPhone;
	}

	public String getApplicantNationality() {
		return applicantNationality;
	}

	public void setApplicantNationality(String applicantNationality) {
		this.applicantNationality = applicantNationality;
	}

	public String getApplicantRegion() {
		return applicantRegion;
	}

	public void setApplicantRegion(String applicantRegion) {
		this.applicantRegion = applicantRegion;
	}

	public String getApplicantCity() {
		return applicantCity;
	}

	public void setApplicantCity(String applicantCity) {
		this.applicantCity = applicantCity;
	}

	public String getMarkupCorporation() {
		return markupCorporation;
	}

	public void setMarkupCorporation(String markupCorporation) {
		this.markupCorporation = markupCorporation;
	}

	public String getCorporationId() {
		return corporationId;
	}

	public void setCorporationId(String corporationId) {
		this.corporationId = corporationId;
	}

	public String getMarkupDesigner() {
		return markupDesigner;
	}

	public void setMarkupDesigner(String markupDesigner) {
		this.markupDesigner = markupDesigner;
	}

	public String getMarkupOverseasManufacturer() {
		return markupOverseasManufacturer;
	}

	public void setMarkupOverseasManufacturer(String markupOverseasManufacturer) {
		this.markupOverseasManufacturer = markupOverseasManufacturer;
	}

	public String getMarkupDomesticsManufacturer() {
		return markupDomesticsManufacturer;
	}

	public void setMarkupDomesticsManufacturer(String markupDomesticsManufacturer) {
		this.markupDomesticsManufacturer = markupDomesticsManufacturer;
	}

	public String getMarkupImporter() {
		return markupImporter;
	}

	public void setMarkupImporter(String markupImporter) {
		this.markupImporter = markupImporter;
	}

	public String getMarkupComponentXCG() {
		return markupComponentXCG;
	}

	public void setMarkupComponentXCG(String markupComponentXCG) {
		this.markupComponentXCG = markupComponentXCG;
	}

	public String getMarkupComponentXMY() {
		return markupComponentXMY;
	}

	public void setMarkupComponentXMY(String markupComponentXMY) {
		this.markupComponentXMY = markupComponentXMY;
	}

	public String getMarkupComponentXCD() {
		return markupComponentXCD;
	}

	public void setMarkupComponentXCD(String markupComponentXCD) {
		this.markupComponentXCD = markupComponentXCD;
	}

	public String getMarkupComponentXDD() {
		return markupComponentXDD;
	}

	public void setMarkupComponentXDD(String markupComponentXDD) {
		this.markupComponentXDD = markupComponentXDD;
	}

	public String getMarkupComponentXCN() {
		return markupComponentXCN;
	}

	public void setMarkupComponentXCN(String markupComponentXCN) {
		this.markupComponentXCN = markupComponentXCN;
	}

	public String getMarkupComponentXCH() {
		return markupComponentXCH;
	}

	public void setMarkupComponentXCH(String markupComponentXCH) {
		this.markupComponentXCH = markupComponentXCH;
	}

	public String getMarkupXCG() {
		return markupXCG;
	}

	public void setMarkupXCG(String markupXCG) {
		this.markupXCG = markupXCG;
	}

	public String getMarkupXMY() {
		return markupXMY;
	}

	public void setMarkupXMY(String markupXMY) {
		this.markupXMY = markupXMY;
	}

	public String getMarkupXCD() {
		return markupXCD;
	}

	public void setMarkupXCD(String markupXCD) {
		this.markupXCD = markupXCD;
	}

	public String getMarkupXDD() {
		return markupXDD;
	}

	public void setMarkupXDD(String markupXDD) {
		this.markupXDD = markupXDD;
	}

	public String getMarkupXCN() {
		return markupXCN;
	}

	public void setMarkupXCN(String markupXCN) {
		this.markupXCN = markupXCN;
	}

	public String getMarkupXCH() {
		return markupXCH;
	}

	public void setMarkupXCH(String markupXCH) {
		this.markupXCH = markupXCH;
	}

	public String getIssueTypeXCG() {
		return issueTypeXCG;
	}

	public void setIssueTypeXCG(String issueTypeXCG) {
		this.issueTypeXCG = issueTypeXCG;
	}

	public String getIssueTypeXMY() {
		return issueTypeXMY;
	}

	public void setIssueTypeXMY(String issueTypeXMY) {
		this.issueTypeXMY = issueTypeXMY;
	}

	public String getIssueTypeXCD() {
		return issueTypeXCD;
	}

	public void setIssueTypeXCD(String issueTypeXCD) {
		this.issueTypeXCD = issueTypeXCD;
	}

	public String getIssueTypeXDD() {
		return issueTypeXDD;
	}

	public void setIssueTypeXDD(String issueTypeXDD) {
		this.issueTypeXDD = issueTypeXDD;
	}

	public String getIssueTypeXCN() {
		return issueTypeXCN;
	}

	public void setIssueTypeXCN(String issueTypeXCN) {
		this.issueTypeXCN = issueTypeXCN;
	}

	public String getIssueTypeXCH() {
		return issueTypeXCH;
	}

	public void setIssueTypeXCH(String issueTypeXCH) {
		this.issueTypeXCH = issueTypeXCH;
	}

	public String getIssueTypeDescription() {
		return issueTypeDescription;
	}

	public void setIssueTypeDescription(String issueTypeDescription) {
		this.issueTypeDescription = issueTypeDescription;
	}

	public String getApplicantCeremonyDate() {
		return applicantCeremonyDate;
	}

	public void setApplicantCeremonyDate(String applicantCeremonyDate) {
		this.applicantCeremonyDate = applicantCeremonyDate;
	}

	public String getApplicantOperationPeriod() {
		return applicantOperationPeriod;
	}

	public void setApplicantOperationPeriod(String applicantOperationPeriod) {
		this.applicantOperationPeriod = applicantOperationPeriod;
	}

	public String getApplicantBusinessType() {
		return applicantBusinessType;
	}

	public void setApplicantBusinessType(String applicantBusinessType) {
		this.applicantBusinessType = applicantBusinessType;
	}

	public String getApplicantMetadata() {
		return applicantMetadata;
	}

	public void setApplicantMetadata(String applicantMetadata) {
		this.applicantMetadata = applicantMetadata;
	}

	public String getApplicantStatus() {
		return applicantStatus;
	}

	public void setApplicantStatus(String applicantStatus) {
		this.applicantStatus = applicantStatus;
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
