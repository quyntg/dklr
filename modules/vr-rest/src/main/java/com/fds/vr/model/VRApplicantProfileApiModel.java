package com.fds.vr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModelProperty;

@XmlRootElement(name = "VRApplicantProfileApiModel")
public class VRApplicantProfileApiModel {
	public static final Map<String, String> TABLE_COLUMNS_MAP = new LinkedHashMap<String, String>();
	public static final Map<String, Class<?>> TABLE_COLUMNS_DATA_MAP = new LinkedHashMap<String, Class<?>>();
	static {
		TABLE_COLUMNS_MAP.put("id", "id");
		TABLE_COLUMNS_DATA_MAP.put("id", long.class);
		TABLE_COLUMNS_MAP.put("mtCore", "mtcore");
		TABLE_COLUMNS_DATA_MAP.put("mtcore", long.class);
		TABLE_COLUMNS_MAP.put("mappingMA_CTY", "mappingma_cty");
		TABLE_COLUMNS_DATA_MAP.put("mappingma_cty", String.class);
		TABLE_COLUMNS_MAP.put("mappingTEN_CTY", "mappingten_cty");
		TABLE_COLUMNS_DATA_MAP.put("mappingten_cty", String.class);
		TABLE_COLUMNS_MAP.put("mappingDIA_CHI_CTY", "mappingdia_chi_cty");
		TABLE_COLUMNS_DATA_MAP.put("mappingdia_chi_cty", String.class);
		TABLE_COLUMNS_MAP.put("mappingNote", "mappingnote");
		TABLE_COLUMNS_DATA_MAP.put("mappingnote", String.class);
		TABLE_COLUMNS_MAP.put("mappingStatus", "mappingstatus");
		TABLE_COLUMNS_DATA_MAP.put("mappingstatus", String.class);
		TABLE_COLUMNS_MAP.put("applicantCode", "applicantcode");
		TABLE_COLUMNS_DATA_MAP.put("applicantcode", String.class);
		TABLE_COLUMNS_MAP.put("applicantName", "applicantname");
		TABLE_COLUMNS_DATA_MAP.put("applicantname", String.class);
		TABLE_COLUMNS_MAP.put("applicantAddress", "applicantaddress");
		TABLE_COLUMNS_DATA_MAP.put("applicantaddress", String.class);
		TABLE_COLUMNS_MAP.put("applicantPhone", "applicantphone");
		TABLE_COLUMNS_DATA_MAP.put("applicantphone", String.class);
		TABLE_COLUMNS_MAP.put("applicantEmail", "applicantemail");
		TABLE_COLUMNS_DATA_MAP.put("applicantemail", String.class);
		TABLE_COLUMNS_MAP.put("applicantFax", "applicantfax");
		TABLE_COLUMNS_DATA_MAP.put("applicantfax", String.class);
		TABLE_COLUMNS_MAP.put("applicantRepresentative", "applicantrepresentative");
		TABLE_COLUMNS_DATA_MAP.put("applicantrepresentative", String.class);
		TABLE_COLUMNS_MAP.put("applicantRepresentativeTitle", "applicantrepresentativetitle");
		TABLE_COLUMNS_DATA_MAP.put("applicantrepresentativetitle", String.class);
		TABLE_COLUMNS_MAP.put("applicantContactName", "applicantcontactname");
		TABLE_COLUMNS_DATA_MAP.put("applicantcontactname", String.class);
		TABLE_COLUMNS_MAP.put("applicantContactEmail", "applicantcontactemail");
		TABLE_COLUMNS_DATA_MAP.put("applicantcontactemail", String.class);
		TABLE_COLUMNS_MAP.put("applicantContactPhone", "applicantcontactphone");
		TABLE_COLUMNS_DATA_MAP.put("applicantcontactphone", String.class);
		TABLE_COLUMNS_MAP.put("applicantNationality", "applicantnationality");
		TABLE_COLUMNS_DATA_MAP.put("applicantnationality", String.class);
		TABLE_COLUMNS_MAP.put("applicantRegion", "applicantregion");
		TABLE_COLUMNS_DATA_MAP.put("applicantregion", String.class);
		TABLE_COLUMNS_MAP.put("applicantCity", "applicantcity");
		TABLE_COLUMNS_DATA_MAP.put("applicantcity", String.class);
		TABLE_COLUMNS_MAP.put("markupCorporation", "markupcorporation");
		TABLE_COLUMNS_DATA_MAP.put("markupcorporation", String.class);
		TABLE_COLUMNS_MAP.put("corporationId", "corporationid");
		TABLE_COLUMNS_DATA_MAP.put("corporationid", String.class);
		TABLE_COLUMNS_MAP.put("markupDesigner", "markupdesigner");
		TABLE_COLUMNS_DATA_MAP.put("markupdesigner", String.class);
		TABLE_COLUMNS_MAP.put("markupOverseasManufacturer", "markupoverseasmanufacturer");
		TABLE_COLUMNS_DATA_MAP.put("markupoverseasmanufacturer", String.class);
		TABLE_COLUMNS_MAP.put("markupDomesticsManufacturer", "markupdomesticsmanufacturer");
		TABLE_COLUMNS_DATA_MAP.put("markupdomesticsmanufacturer", String.class);
		TABLE_COLUMNS_MAP.put("markupImporter", "markupimporter");
		TABLE_COLUMNS_DATA_MAP.put("markupimporter", String.class);
		TABLE_COLUMNS_MAP.put("markupComponentXCG", "markupcomponentxcg");
		TABLE_COLUMNS_DATA_MAP.put("markupcomponentxcg", String.class);
		TABLE_COLUMNS_MAP.put("markupComponentXMY", "markupcomponentxmy");
		TABLE_COLUMNS_DATA_MAP.put("markupcomponentxmy", String.class);
		TABLE_COLUMNS_MAP.put("markupComponentXCD", "markupcomponentxcd");
		TABLE_COLUMNS_DATA_MAP.put("markupcomponentxcd", String.class);
		TABLE_COLUMNS_MAP.put("markupComponentXDD", "markupcomponentxdd");
		TABLE_COLUMNS_DATA_MAP.put("markupcomponentxdd", String.class);
		TABLE_COLUMNS_MAP.put("markupComponentXCN", "markupcomponentxcn");
		TABLE_COLUMNS_DATA_MAP.put("markupcomponentxcn", String.class);
		TABLE_COLUMNS_MAP.put("markupComponentXCH", "markupcomponentxch");
		TABLE_COLUMNS_DATA_MAP.put("markupcomponentxch", String.class);
		TABLE_COLUMNS_MAP.put("markupXCG", "markupxcg");
		TABLE_COLUMNS_DATA_MAP.put("markupxcg", String.class);
		TABLE_COLUMNS_MAP.put("markupXMY", "markupxmy");
		TABLE_COLUMNS_DATA_MAP.put("markupxmy", String.class);
		TABLE_COLUMNS_MAP.put("markupXCD", "markupxcd");
		TABLE_COLUMNS_DATA_MAP.put("markupxcd", String.class);
		TABLE_COLUMNS_MAP.put("markupXDD", "markupxdd");
		TABLE_COLUMNS_DATA_MAP.put("markupxdd", String.class);
		TABLE_COLUMNS_MAP.put("markupXCN", "markupxcn");
		TABLE_COLUMNS_DATA_MAP.put("markupxcn", String.class);
		TABLE_COLUMNS_MAP.put("markupXCH", "markupxch");
		TABLE_COLUMNS_DATA_MAP.put("markupxch", String.class);
		TABLE_COLUMNS_MAP.put("issueTypeXCG", "issuetypexcg");
		TABLE_COLUMNS_DATA_MAP.put("issuetypexcg", String.class);
		TABLE_COLUMNS_MAP.put("issueTypeXMY", "issuetypexmy");
		TABLE_COLUMNS_DATA_MAP.put("issuetypexmy", String.class);
		TABLE_COLUMNS_MAP.put("issueTypeXCD", "issuetypexcd");
		TABLE_COLUMNS_DATA_MAP.put("issuetypexcd", String.class);
		TABLE_COLUMNS_MAP.put("issueTypeXDD", "issuetypexdd");
		TABLE_COLUMNS_DATA_MAP.put("issuetypexdd", String.class);
		TABLE_COLUMNS_MAP.put("issueTypeXCN", "issuetypexcn");
		TABLE_COLUMNS_DATA_MAP.put("issuetypexcn", String.class);
		TABLE_COLUMNS_MAP.put("issueTypeXCH", "issuetypexch");
		TABLE_COLUMNS_DATA_MAP.put("issuetypexch", String.class);
		TABLE_COLUMNS_MAP.put("issueTypeDescription", "issuetypedescription");
		TABLE_COLUMNS_DATA_MAP.put("issuetypedescription", String.class);
		TABLE_COLUMNS_MAP.put("applicantCeremonyDate", "applicantceremonydate");
		TABLE_COLUMNS_DATA_MAP.put("applicantceremonydate", String.class);
		TABLE_COLUMNS_MAP.put("applicantOperationPeriod", "applicantoperationperiod");
		TABLE_COLUMNS_DATA_MAP.put("applicantoperationperiod", String.class);
		TABLE_COLUMNS_MAP.put("applicantBusinessType", "applicantbusinesstype");
		TABLE_COLUMNS_DATA_MAP.put("applicantbusinesstype", String.class);
		TABLE_COLUMNS_MAP.put("applicantMetadata", "applicantmetadata");
		TABLE_COLUMNS_DATA_MAP.put("applicantmetadata", String.class);
		TABLE_COLUMNS_MAP.put("applicantStatus", "applicantstatus");
		TABLE_COLUMNS_DATA_MAP.put("applicantstatus", String.class);
		TABLE_COLUMNS_MAP.put("modifyDate", "modifydate");
		TABLE_COLUMNS_DATA_MAP.put("modifydate", Date.class);
		TABLE_COLUMNS_MAP.put("syncDate", "syncdate");
		TABLE_COLUMNS_DATA_MAP.put("syncdate", Date.class);
	}
	@ApiModelProperty(name = "id", example = "null", value = "")
	protected Long id;
	@ApiModelProperty(name = "mtcore", example = "null", value = "")
	protected Long mtCore;
	@ApiModelProperty(name = "mappingma_cty", example = "null", value = "")
	protected String mappingMA_CTY;
	@ApiModelProperty(name = "mappingten_cty", example = "null", value = "")
	protected String mappingTEN_CTY;
	@ApiModelProperty(name = "mappingdia_chi_cty", example = "null", value = "")
	protected String mappingDIA_CHI_CTY;
	@ApiModelProperty(name = "mappingnote", example = "null", value = "")
	protected String mappingNote;
	@ApiModelProperty(name = "mappingstatus", example = "null", value = "")
	protected String mappingStatus;
	@ApiModelProperty(name = "applicantcode", example = "null", value = "")
	protected String applicantCode;
	@ApiModelProperty(name = "applicantname", example = "null", value = "")
	protected String applicantName;
	@ApiModelProperty(name = "applicantaddress", example = "null", value = "")
	protected String applicantAddress;
	@ApiModelProperty(name = "applicantphone", example = "null", value = "")
	protected String applicantPhone;
	@ApiModelProperty(name = "applicantemail", example = "null", value = "")
	protected String applicantEmail;
	@ApiModelProperty(name = "applicantfax", example = "null", value = "")
	protected String applicantFax;
	@ApiModelProperty(name = "applicantrepresentative", example = "null", value = "")
	protected String applicantRepresentative;
	@ApiModelProperty(name = "applicantrepresentativetitle", example = "null", value = "")
	protected String applicantRepresentativeTitle;
	@ApiModelProperty(name = "applicantcontactname", example = "null", value = "")
	protected String applicantContactName;
	@ApiModelProperty(name = "applicantcontactemail", example = "null", value = "")
	protected String applicantContactEmail;
	@ApiModelProperty(name = "applicantcontactphone", example = "null", value = "")
	protected String applicantContactPhone;
	@ApiModelProperty(name = "applicantnationality", example = "null", value = "")
	protected String applicantNationality;
	@ApiModelProperty(name = "applicantregion", example = "null", value = "")
	protected String applicantRegion;
	@ApiModelProperty(name = "applicantcity", example = "null", value = "")
	protected String applicantCity;
	@ApiModelProperty(name = "markupcorporation", example = "null", value = "")
	protected String markupCorporation;
	@ApiModelProperty(name = "corporationid", example = "null", value = "")
	protected String corporationId;
	@ApiModelProperty(name = "markupdesigner", example = "null", value = "")
	protected String markupDesigner;
	@ApiModelProperty(name = "markupoverseasmanufacturer", example = "null", value = "")
	protected String markupOverseasManufacturer;
	@ApiModelProperty(name = "markupdomesticsmanufacturer", example = "null", value = "")
	protected String markupDomesticsManufacturer;
	@ApiModelProperty(name = "markupimporter", example = "null", value = "")
	protected String markupImporter;
	@ApiModelProperty(name = "markupcomponentxcg", example = "null", value = "")
	protected String markupComponentXCG;
	@ApiModelProperty(name = "markupcomponentxmy", example = "null", value = "")
	protected String markupComponentXMY;
	@ApiModelProperty(name = "markupcomponentxcd", example = "null", value = "")
	protected String markupComponentXCD;
	@ApiModelProperty(name = "markupcomponentxdd", example = "null", value = "")
	protected String markupComponentXDD;
	@ApiModelProperty(name = "markupcomponentxcn", example = "null", value = "")
	protected String markupComponentXCN;
	@ApiModelProperty(name = "markupcomponentxch", example = "null", value = "")
	protected String markupComponentXCH;
	@ApiModelProperty(name = "markupxcg", example = "null", value = "")
	protected String markupXCG;
	@ApiModelProperty(name = "markupxmy", example = "null", value = "")
	protected String markupXMY;
	@ApiModelProperty(name = "markupxcd", example = "null", value = "")
	protected String markupXCD;
	@ApiModelProperty(name = "markupxdd", example = "null", value = "")
	protected String markupXDD;
	@ApiModelProperty(name = "markupxcn", example = "null", value = "")
	protected String markupXCN;
	@ApiModelProperty(name = "markupxch", example = "null", value = "")
	protected String markupXCH;
	@ApiModelProperty(name = "issuetypexcg", example = "null", value = "")
	protected String issueTypeXCG;
	@ApiModelProperty(name = "issuetypexmy", example = "null", value = "")
	protected String issueTypeXMY;
	@ApiModelProperty(name = "issuetypexcd", example = "null", value = "")
	protected String issueTypeXCD;
	@ApiModelProperty(name = "issuetypexdd", example = "null", value = "")
	protected String issueTypeXDD;
	@ApiModelProperty(name = "issuetypexcn", example = "null", value = "")
	protected String issueTypeXCN;
	@ApiModelProperty(name = "issuetypexch", example = "null", value = "")
	protected String issueTypeXCH;
	@ApiModelProperty(name = "issuetypedescription", example = "null", value = "")
	protected String issueTypeDescription;
	@ApiModelProperty(name = "applicantceremonydate", example = "null", value = "")
	protected String applicantCeremonyDate;
	@ApiModelProperty(name = "applicantoperationperiod", example = "null", value = "")
	protected String applicantOperationPeriod;
	@ApiModelProperty(name = "applicantbusinesstype", example = "null", value = "")
	protected String applicantBusinessType;
	@ApiModelProperty(name = "applicantmetadata", example = "null", value = "")
	protected String applicantMetadata;
	@ApiModelProperty(name = "applicantstatus", example = "null", value = "")
	protected String applicantStatus;
	@ApiModelProperty(name = "modifydate", example = "null", value = "")
	protected String modifyDate;
	
	@JsonProperty("syncdate")
	@ApiModelProperty(name = "syncdate", example = "null", value = "")
	protected String syncDate;

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
