package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "mtcore", "mappingma_cty", "mappingten_cty", "mappingdia_chi_cty",
		"mappingma_xuong_lr", "mappingten_xuong_lr", "mappingdia_chi_xuong_lr", "mappingnote", "mappingstatus",
		"productionplantcode", "productionplantname", "productionplantaddress", "productionplantstatecode",
		"productionplantstatename", "productionplantprovincecode", "productionplantprovincename",
		"productionplantdistrictcode", "productionplantdistrictname", "productionplantemail", "productionplantphone",
		"productionplantfax", "productionplantrepresentative", "productionplantrepresentativetitle",
		"productionplantcontactname", "productionplantcontactemail", "productionplantcontactphone",
		"productionplanttype", "productionplantstatus", "productionplantemployeesnote", "productionplantequipmentsnote",
		"productionplantprodequipmentsnote", "registrationid", "registrationformid", "applicantprofileid",
		"latestcopreportdate", "latestcopreportresult", "nextcopreportdate", "modifydate", "syncdate", "keyword","applicantcode",
		"supplierid",
		"start", "end", "order_asc", "order_desc" })
@XmlRootElement(name = "VRProductionPlantBeanParam")
public class VRProductionPlantBeanParam {
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
	@QueryParam(value = "mappingma_xuong_lr")
	protected String mappingMA_XUONG_LR;
	@QueryParam(value = "mappingten_xuong_lr")
	protected String mappingTEN_XUONG_LR;
	@QueryParam(value = "mappingdia_chi_xuong_lr")
	protected String mappingDIA_CHI_XUONG_LR;
	@QueryParam(value = "mappingnote")
	protected String mappingNote;
	@QueryParam(value = "mappingstatus")
	protected String mappingStatus;
	@QueryParam(value = "productionplantcode")
	protected String productionPlantCode;
	@QueryParam(value = "productionplantname")
	protected String productionPlantName;
	@QueryParam(value = "productionplantaddress")
	protected String productionPlantAddress;
	@QueryParam(value = "productionplantstatecode")
	protected String productionPlantStateCode;
	@QueryParam(value = "productionplantstatename")
	protected String productionPlantStateName;
	@QueryParam(value = "productionplantprovincecode")
	protected String productionPlantProvinceCode;
	@QueryParam(value = "productionplantprovincename")
	protected String productionPlantProvinceName;
	@QueryParam(value = "productionplantdistrictcode")
	protected String productionPlantDistrictCode;
	@QueryParam(value = "productionplantdistrictname")
	protected String productionPlantDistrictName;
	@QueryParam(value = "productionplantemail")
	protected String productionPlantEmail;
	@QueryParam(value = "productionplantphone")
	protected String productionPlantPhone;
	@QueryParam(value = "productionplantfax")
	protected String productionPlantFax;
	@QueryParam(value = "productionplantrepresentative")
	protected String productionPlantRepresentative;
	@QueryParam(value = "productionplantrepresentativetitle")
	protected String productionPlantRepresentativeTitle;
	@QueryParam(value = "productionplantcontactname")
	protected String productionPlantContactName;
	@QueryParam(value = "productionplantcontactemail")
	protected String productionPlantContactEmail;
	@QueryParam(value = "productionplantcontactphone")
	protected String productionPlantContactPhone;
	@QueryParam(value = "productionplanttype")
	protected String productionPlantType;
	@QueryParam(value = "productionplantstatus")
	protected String productionPlantStatus;
	@QueryParam(value = "productionplantemployeesnote")
	protected String productionPlantEmployeesNote;
	@QueryParam(value = "productionplantequipmentsnote")
	protected String productionPlantEquipmentsNote;
	@QueryParam(value = "productionplantprodequipmentsnote")
	protected String productionPlantProdEquipmentsNote;
	@QueryParam(value = "registrationid")
	protected Long registrationId;
	@QueryParam(value = "registrationformid")
	protected Long registrationFormId;
	@QueryParam(value = "applicantprofileid")
	protected Long applicantProfileId;
	@QueryParam(value = "latestcopreportdate")
	protected String latestCOPReportDate;
	@QueryParam(value = "latestcopreportresult")
	protected String latestCOPReportResult;
	@QueryParam(value = "nextcopreportdate")
	protected String nextCOPReportDate;
	@QueryParam(value = "modifydate")
	protected String modifyDate;
	@QueryParam(value = "syncdate")
	protected String syncDate;
	@QueryParam(value = "applicantcode")
	protected String applicantCode;
	@QueryParam(value = "supplierid")
	protected Long supplierId;
	

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getApplicantCode() {
		return applicantCode;
	}

	public void setApplicantCode(String applicantCode) {
		this.applicantCode = applicantCode;
	}

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

	public String getMappingMA_XUONG_LR() {
		return mappingMA_XUONG_LR;
	}

	public void setMappingMA_XUONG_LR(String mappingMA_XUONG_LR) {
		this.mappingMA_XUONG_LR = mappingMA_XUONG_LR;
	}

	public String getMappingTEN_XUONG_LR() {
		return mappingTEN_XUONG_LR;
	}

	public void setMappingTEN_XUONG_LR(String mappingTEN_XUONG_LR) {
		this.mappingTEN_XUONG_LR = mappingTEN_XUONG_LR;
	}

	public String getMappingDIA_CHI_XUONG_LR() {
		return mappingDIA_CHI_XUONG_LR;
	}

	public void setMappingDIA_CHI_XUONG_LR(String mappingDIA_CHI_XUONG_LR) {
		this.mappingDIA_CHI_XUONG_LR = mappingDIA_CHI_XUONG_LR;
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

	public String getProductionPlantCode() {
		return productionPlantCode;
	}

	public void setProductionPlantCode(String productionPlantCode) {
		this.productionPlantCode = productionPlantCode;
	}

	public String getProductionPlantName() {
		return productionPlantName;
	}

	public void setProductionPlantName(String productionPlantName) {
		this.productionPlantName = productionPlantName;
	}

	public String getProductionPlantAddress() {
		return productionPlantAddress;
	}

	public void setProductionPlantAddress(String productionPlantAddress) {
		this.productionPlantAddress = productionPlantAddress;
	}

	public String getProductionPlantStateCode() {
		return productionPlantStateCode;
	}

	public void setProductionPlantStateCode(String productionPlantStateCode) {
		this.productionPlantStateCode = productionPlantStateCode;
	}

	public String getProductionPlantStateName() {
		return productionPlantStateName;
	}

	public void setProductionPlantStateName(String productionPlantStateName) {
		this.productionPlantStateName = productionPlantStateName;
	}

	public String getProductionPlantProvinceCode() {
		return productionPlantProvinceCode;
	}

	public void setProductionPlantProvinceCode(String productionPlantProvinceCode) {
		this.productionPlantProvinceCode = productionPlantProvinceCode;
	}

	public String getProductionPlantProvinceName() {
		return productionPlantProvinceName;
	}

	public void setProductionPlantProvinceName(String productionPlantProvinceName) {
		this.productionPlantProvinceName = productionPlantProvinceName;
	}

	public String getProductionPlantDistrictCode() {
		return productionPlantDistrictCode;
	}

	public void setProductionPlantDistrictCode(String productionPlantDistrictCode) {
		this.productionPlantDistrictCode = productionPlantDistrictCode;
	}

	public String getProductionPlantDistrictName() {
		return productionPlantDistrictName;
	}

	public void setProductionPlantDistrictName(String productionPlantDistrictName) {
		this.productionPlantDistrictName = productionPlantDistrictName;
	}

	public String getProductionPlantEmail() {
		return productionPlantEmail;
	}

	public void setProductionPlantEmail(String productionPlantEmail) {
		this.productionPlantEmail = productionPlantEmail;
	}

	public String getProductionPlantPhone() {
		return productionPlantPhone;
	}

	public void setProductionPlantPhone(String productionPlantPhone) {
		this.productionPlantPhone = productionPlantPhone;
	}

	public String getProductionPlantFax() {
		return productionPlantFax;
	}

	public void setProductionPlantFax(String productionPlantFax) {
		this.productionPlantFax = productionPlantFax;
	}

	public String getProductionPlantRepresentative() {
		return productionPlantRepresentative;
	}

	public void setProductionPlantRepresentative(String productionPlantRepresentative) {
		this.productionPlantRepresentative = productionPlantRepresentative;
	}

	public String getProductionPlantRepresentativeTitle() {
		return productionPlantRepresentativeTitle;
	}

	public void setProductionPlantRepresentativeTitle(String productionPlantRepresentativeTitle) {
		this.productionPlantRepresentativeTitle = productionPlantRepresentativeTitle;
	}

	public String getProductionPlantContactName() {
		return productionPlantContactName;
	}

	public void setProductionPlantContactName(String productionPlantContactName) {
		this.productionPlantContactName = productionPlantContactName;
	}

	public String getProductionPlantContactEmail() {
		return productionPlantContactEmail;
	}

	public void setProductionPlantContactEmail(String productionPlantContactEmail) {
		this.productionPlantContactEmail = productionPlantContactEmail;
	}

	public String getProductionPlantContactPhone() {
		return productionPlantContactPhone;
	}

	public void setProductionPlantContactPhone(String productionPlantContactPhone) {
		this.productionPlantContactPhone = productionPlantContactPhone;
	}

	public String getProductionPlantType() {
		return productionPlantType;
	}

	public void setProductionPlantType(String productionPlantType) {
		this.productionPlantType = productionPlantType;
	}

	public String getProductionPlantStatus() {
		return productionPlantStatus;
	}

	public void setProductionPlantStatus(String productionPlantStatus) {
		this.productionPlantStatus = productionPlantStatus;
	}

	public String getProductionPlantEmployeesNote() {
		return productionPlantEmployeesNote;
	}

	public void setProductionPlantEmployeesNote(String productionPlantEmployeesNote) {
		this.productionPlantEmployeesNote = productionPlantEmployeesNote;
	}

	public String getProductionPlantEquipmentsNote() {
		return productionPlantEquipmentsNote;
	}

	public void setProductionPlantEquipmentsNote(String productionPlantEquipmentsNote) {
		this.productionPlantEquipmentsNote = productionPlantEquipmentsNote;
	}

	public String getProductionPlantProdEquipmentsNote() {
		return productionPlantProdEquipmentsNote;
	}

	public void setProductionPlantProdEquipmentsNote(String productionPlantProdEquipmentsNote) {
		this.productionPlantProdEquipmentsNote = productionPlantProdEquipmentsNote;
	}

	public Long getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(Long registrationId) {
		this.registrationId = registrationId;
	}

	public Long getRegistrationFormId() {
		return registrationFormId;
	}

	public void setRegistrationFormId(Long registrationFormId) {
		this.registrationFormId = registrationFormId;
	}

	public Long getApplicantProfileId() {
		return applicantProfileId;
	}

	public void setApplicantProfileId(Long applicantProfileId) {
		this.applicantProfileId = applicantProfileId;
	}

	public String getLatestCOPReportDate() {
		return latestCOPReportDate;
	}

	public void setLatestCOPReportDate(String latestCOPReportDate) {
		this.latestCOPReportDate = latestCOPReportDate;
	}

	public String getLatestCOPReportResult() {
		return latestCOPReportResult;
	}

	public void setLatestCOPReportResult(String latestCOPReportResult) {
		this.latestCOPReportResult = latestCOPReportResult;
	}

	public String getNextCOPReportDate() {
		return nextCOPReportDate;
	}

	public void setNextCOPReportDate(String nextCOPReportDate) {
		this.nextCOPReportDate = nextCOPReportDate;
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
