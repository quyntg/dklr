package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "mtcore", "dossierid", "dossiertype", "dossierno", "referenceuid",
		"servicecode", "servicename", "convertassembleid", "applicantidno", "applicantname", "applicantiddate",
		"applicantaddress", "applicantrepresentative", "applicantrepresentativetitle", "applicantemail",
		"applicantphone", "applicantfax", "applicantcontactname", "applicantcontactemail", "applicantcontactphone",
		"citycode", "manufacturerforeigncode", "manufacturername", "manufactureraddress", "manufacturerrepresentative",
		"manufacturerrepresentativetitle", "manufactureremail", "manufacturerphone", "manufacturerfax",
		"productionplantcode", "productionplantname", "productionplantaddress", "productionplantrepresentative",
		"productionplantrepresentativetitle", "copreportno", "copreportdate", "copreportexpiredate", "designercode",
		"designername", "designeraddress", "designerrepresentative", "designerrepresentativetitle", "designeremail",
		"designerphone", "designerfax", "verificationcertificateno", "verificationcertificatedate", "verificationrefno",
		"verificationrefdate", "typeapprovalcertificateno", "typeapprovalcertificatedate", "designmodelcode",
		"designmodeldescription", "designsymbol", "registerednumber", "inspectorreceivedate", "inspectorsubmitdate",
		"inspectorendorsementdate", "inspectordeadline", "inspectorfinishdate", "inspectorcanceldate",
		"inspectororganization", "inspectordivision", "inspectorsignname", "inspectorsigntitle", "inspectorsignplace",
		"certificatetype", "referencecertificateno", "referencecertificatedate", "certificaterecordno",
		"certificatesignname", "certificatesigntitle", "certificatesignplace", "certificaterecorddate",
		"certificaterecordexpiredate", "expiredstatus", "certificaterecordstatus", "digitalissuestatus", "vehicleclass",
		"certifiedvehicletype", "certifiedvehicletypedescription", "certifiedtrademark", "certifiedtrademarkname",
		"certifiedcommercialname", "certifiedmodelcode", "certifiedassemblytype", "certifiedassemblytypedescription",
		"certifiedvinno", "certifiedvinposition", "certifiedframeno", "certifiedframeattachplace",
		"certifiedframeposition", "certifiedengineno", "certifiedengineattachplace", "certifiedengineposition",
		"safetytestreportno", "safetytestreportdate", "emissiontestreportno", "emissiontestreportdate",
		"commonsafetystandard", "emissionstandard", "commonsafetydescription", "emissiondescription",
		"othertestreportno", "othertestreportdate", "sampleframeno", "samplevinno", "sampleengineno",
		"samplevehicletype", "samplevehicletypedescription", "sampletrademark", "sampletrademarkname",
		"samplecommercialname", "samplemodelcode", "customsdeclarationno", "customsdeclarationdate",
		"productioncountry", "importerquantity", "inspectionrecordno", "inspectiondate", "inspectionsite",
		"inspectiondistrictcode", "inspectiondistrictname", "inspectionprovincecode", "inspectionprovincename",
		"corporationid", "inspectorid", "remarks", "inspectionnote", "certificatenote", "deliverablecode", "module",
		"modifydate", "syncdate", "keyword", "start", "end", "order_asc", "order_desc" })
@XmlRootElement(name = "VRVehicleTypeCertificateBeanParam")
public class VRVehicleTypeCertificateBeanParam {
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
	@QueryParam(value = "dossierid")
	protected Long dossierId;
	@QueryParam(value = "dossiertype")
	protected String dossierType;
	@QueryParam(value = "dossierno")
	protected String dossierNo;
	@QueryParam(value = "referenceuid")
	protected String referenceUid;
	@QueryParam(value = "servicecode")
	protected String serviceCode;
	@QueryParam(value = "servicename")
	protected String serviceName;
	@QueryParam(value = "convertassembleid")
	protected Long convertassembleId;
	@QueryParam(value = "applicantidno")
	protected String applicantIdNo;
	@QueryParam(value = "applicantname")
	protected String applicantName;
	@QueryParam(value = "applicantiddate")
	protected String applicantIdDate;
	@QueryParam(value = "applicantaddress")
	protected String applicantAddress;
	@QueryParam(value = "applicantrepresentative")
	protected String applicantRepresentative;
	@QueryParam(value = "applicantrepresentativetitle")
	protected String applicantRepresentativeTitle;
	@QueryParam(value = "applicantemail")
	protected String applicantEmail;
	@QueryParam(value = "applicantphone")
	protected String applicantPhone;
	@QueryParam(value = "applicantfax")
	protected String applicantFax;
	@QueryParam(value = "applicantcontactname")
	protected String applicantContactName;
	@QueryParam(value = "applicantcontactemail")
	protected String applicantContactEmail;
	@QueryParam(value = "applicantcontactphone")
	protected String applicantcontactPhone;
	@QueryParam(value = "citycode")
	protected String cityCode;
	@QueryParam(value = "manufacturerforeigncode")
	protected String manufacturerForeignCode;
	@QueryParam(value = "manufacturername")
	protected String manufacturerName;
	@QueryParam(value = "manufactureraddress")
	protected String manufacturerAddress;
	@QueryParam(value = "manufacturerrepresentative")
	protected String manufacturerRepresentative;
	@QueryParam(value = "manufacturerrepresentativetitle")
	protected String manufacturerRepresentativeTitle;
	@QueryParam(value = "manufactureremail")
	protected String manufacturerEmail;
	@QueryParam(value = "manufacturerphone")
	protected String manufacturerPhone;
	@QueryParam(value = "manufacturerfax")
	protected String manufacturerFax;
	@QueryParam(value = "productionplantcode")
	protected String productionPlantCode;
	@QueryParam(value = "productionplantname")
	protected String productionPlantName;
	@QueryParam(value = "productionplantaddress")
	protected String productionPlantAddress;
	@QueryParam(value = "productionplantrepresentative")
	protected String productionPlantRepresentative;
	@QueryParam(value = "productionplantrepresentativetitle")
	protected String productionPlantRepresentativeTitle;
	@QueryParam(value = "copreportno")
	protected String copReportNo;
	@QueryParam(value = "copreportdate")
	protected String copReportDate;
	@QueryParam(value = "copreportexpiredate")
	protected String copReportExpireDate;
	@QueryParam(value = "designercode")
	protected String designerCode;
	@QueryParam(value = "designername")
	protected String designerName;
	@QueryParam(value = "designeraddress")
	protected String designerAddress;
	@QueryParam(value = "designerrepresentative")
	protected String designerRepresentative;
	@QueryParam(value = "designerrepresentativetitle")
	protected String designerRepresentativeTitle;
	@QueryParam(value = "designeremail")
	protected String designerEmail;
	@QueryParam(value = "designerphone")
	protected String designerPhone;
	@QueryParam(value = "designerfax")
	protected String designerFax;
	@QueryParam(value = "verificationcertificateno")
	protected String verificationCertificateNo;
	@QueryParam(value = "verificationcertificatedate")
	protected String verificationCertificateDate;
	@QueryParam(value = "verificationrefno")
	protected String verificationRefNo;
	@QueryParam(value = "verificationrefdate")
	protected String verificationRefDate;
	@QueryParam(value = "typeapprovalcertificateno")
	protected String typeApprovalCertificateNo;
	@QueryParam(value = "typeapprovalcertificatedate")
	protected String typeApprovalCertificateDate;
	@QueryParam(value = "designmodelcode")
	protected String designModelCode;
	@QueryParam(value = "designmodeldescription")
	protected String designModelDescription;
	@QueryParam(value = "designsymbol")
	protected String designSymbol;
	@QueryParam(value = "registerednumber")
	protected String registeredNumber;
	@QueryParam(value = "inspectorreceivedate")
	protected String inspectorReceiveDate;
	@QueryParam(value = "inspectorsubmitdate")
	protected String inspectorSubmitDate;
	@QueryParam(value = "inspectorendorsementdate")
	protected String inspectorendorSementDate;
	@QueryParam(value = "inspectordeadline")
	protected String inspectorDeadline;
	@QueryParam(value = "inspectorfinishdate")
	protected String inspectorFinishDate;
	@QueryParam(value = "inspectorcanceldate")
	protected String inspectorCancelDate;
	@QueryParam(value = "inspectororganization")
	protected String inspectorOrganization;
	@QueryParam(value = "inspectordivision")
	protected String inspectorDivision;
	@QueryParam(value = "inspectorsignname")
	protected String inspectorSignName;
	@QueryParam(value = "inspectorsigntitle")
	protected String inspectorSignTitle;
	@QueryParam(value = "inspectorsignplace")
	protected String inspectorSignPlace;
	@QueryParam(value = "certificatetype")
	protected String certificateType;
	@QueryParam(value = "referencecertificateno")
	protected String referenceCertificateNo;
	@QueryParam(value = "referencecertificatedate")
	protected String referenceCertificateDate;
	@QueryParam(value = "certificaterecordno")
	protected String certificateRecordNo;
	@QueryParam(value = "certificatesignname")
	protected String certificateSignName;
	@QueryParam(value = "certificatesigntitle")
	protected String certificateSignTitle;
	@QueryParam(value = "certificatesignplace")
	protected String certificateSignPlace;
	@QueryParam(value = "certificaterecorddate")
	protected String certificateRecordDate;
	@QueryParam(value = "certificaterecordexpiredate")
	protected String certificateRecordExpireDate;
	@QueryParam(value = "expiredstatus")
	protected String expiredStatus;
	@QueryParam(value = "certificaterecordstatus")
	protected String certificateRecordStatus;
	@QueryParam(value = "digitalissuestatus")
	protected String digitalIssueStatus;
	@QueryParam(value = "vehicleclass")
	protected String vehicleClass;
	@QueryParam(value = "certifiedvehicletype")
	protected String certifiedVehicleType;
	@QueryParam(value = "certifiedvehicletypedescription")
	protected String certifiedVehicleTypeDescription;
	@QueryParam(value = "certifiedtrademark")
	protected String certifiedTrademark;
	@QueryParam(value = "certifiedtrademarkname")
	protected String certifiedTrademarkName;
	@QueryParam(value = "certifiedcommercialname")
	protected String certifiedCommercialName;
	@QueryParam(value = "certifiedmodelcode")
	protected String certifiedModelCode;
	@QueryParam(value = "certifiedassemblytype")
	protected String certifiedAssemblyType;
	@QueryParam(value = "certifiedassemblytypedescription")
	protected String certifiedAssemblyTypeDescription;
	@QueryParam(value = "certifiedvinno")
	protected String certifiedVINNo;
	@QueryParam(value = "certifiedvinposition")
	protected String certifiedVINPosition;
	@QueryParam(value = "certifiedframeno")
	protected String certifiedFrameNo;
	@QueryParam(value = "certifiedframeattachplace")
	protected String certifiedFrameAttachPlace;
	@QueryParam(value = "certifiedframeposition")
	protected String certifiedFramePosition;
	@QueryParam(value = "certifiedengineno")
	protected String certifiedEngineNo;
	@QueryParam(value = "certifiedengineattachplace")
	protected String certifiedEngineAttachPlace;
	@QueryParam(value = "certifiedengineposition")
	protected String certifiedEnginePosition;
	@QueryParam(value = "safetytestreportno")
	protected String safetyTestReportNo;
	@QueryParam(value = "safetytestreportdate")
	protected String safetyTestReportDate;
	@QueryParam(value = "emissiontestreportno")
	protected String emissionTestReportNo;
	@QueryParam(value = "emissiontestreportdate")
	protected String emissionTestReportDate;
	@QueryParam(value = "commonsafetystandard")
	protected String commonSafetyStandard;
	@QueryParam(value = "emissionstandard")
	protected String emissionStandard;
	@QueryParam(value = "commonsafetydescription")
	protected String commonSafetyDescription;
	@QueryParam(value = "emissiondescription")
	protected String emissionDescription;
	@QueryParam(value = "othertestreportno")
	protected String otherTestReportNo;
	@QueryParam(value = "othertestreportdate")
	protected String otherTestReportDate;
	@QueryParam(value = "sampleframeno")
	protected String sampleFrameNo;
	@QueryParam(value = "samplevinno")
	protected String sampleVINNo;
	@QueryParam(value = "sampleengineno")
	protected String sampleEngineNo;
	@QueryParam(value = "samplevehicletype")
	protected String sampleVehicleType;
	@QueryParam(value = "samplevehicletypedescription")
	protected String sampleVehicleTypeDescription;
	@QueryParam(value = "sampletrademark")
	protected String sampleTrademark;
	@QueryParam(value = "sampletrademarkname")
	protected String sampleTrademarkName;
	@QueryParam(value = "samplecommercialname")
	protected String sampleCommercialName;
	@QueryParam(value = "samplemodelcode")
	protected String sampleModelCode;
	@QueryParam(value = "customsdeclarationno")
	protected String customsDeclarationNo;
	@QueryParam(value = "customsdeclarationdate")
	protected String customsDeclarationDate;
	@QueryParam(value = "productioncountry")
	protected String productionCountry;
	@QueryParam(value = "importerquantity")
	protected Long importerQuantity;
	@QueryParam(value = "inspectionrecordno")
	protected String inspectionRecordNo;
	@QueryParam(value = "inspectiondate")
	protected String inspectionDate;
	@QueryParam(value = "inspectionsite")
	protected String inspectionSite;
	@QueryParam(value = "inspectiondistrictcode")
	protected String inspectionDistrictCode;
	@QueryParam(value = "inspectiondistrictname")
	protected String inspectionDistrictName;
	@QueryParam(value = "inspectionprovincecode")
	protected String inspectionProvinceCode;
	@QueryParam(value = "inspectionprovincename")
	protected String inspectionProvinceName;
	@QueryParam(value = "corporationid")
	protected String corporationId;
	@QueryParam(value = "inspectorid")
	protected Long inspectorId;
	@QueryParam(value = "remarks")
	protected String remarks;
	@QueryParam(value = "inspectionnote")
	protected String inspectionNote;
	@QueryParam(value = "certificatenote")
	protected String certificateNote;
	@QueryParam(value = "deliverablecode")
	protected String deliverableCode;
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

	public Long getMtCore() {
		return mtCore;
	}

	public void setMtCore(Long mtCore) {
		this.mtCore = mtCore;
	}

	public Long getDossierId() {
		return dossierId;
	}

	public void setDossierId(Long dossierId) {
		this.dossierId = dossierId;
	}

	public String getDossierType() {
		return dossierType;
	}

	public void setDossierType(String dossierType) {
		this.dossierType = dossierType;
	}

	public String getDossierNo() {
		return dossierNo;
	}

	public void setDossierNo(String dossierNo) {
		this.dossierNo = dossierNo;
	}

	public String getReferenceUid() {
		return referenceUid;
	}

	public void setReferenceUid(String referenceUid) {
		this.referenceUid = referenceUid;
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

	public Long getConvertassembleId() {
		return convertassembleId;
	}

	public void setConvertassembleId(Long convertassembleId) {
		this.convertassembleId = convertassembleId;
	}

	public String getApplicantIdNo() {
		return applicantIdNo;
	}

	public void setApplicantIdNo(String applicantIdNo) {
		this.applicantIdNo = applicantIdNo;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantIdDate() {
		return applicantIdDate;
	}

	public void setApplicantIdDate(String applicantIdDate) {
		this.applicantIdDate = applicantIdDate;
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

	public String getApplicantEmail() {
		return applicantEmail;
	}

	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}

	public String getApplicantPhone() {
		return applicantPhone;
	}

	public void setApplicantPhone(String applicantPhone) {
		this.applicantPhone = applicantPhone;
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

	public String getApplicantcontactPhone() {
		return applicantcontactPhone;
	}

	public void setApplicantcontactPhone(String applicantcontactPhone) {
		this.applicantcontactPhone = applicantcontactPhone;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getManufacturerForeignCode() {
		return manufacturerForeignCode;
	}

	public void setManufacturerForeignCode(String manufacturerForeignCode) {
		this.manufacturerForeignCode = manufacturerForeignCode;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getManufacturerAddress() {
		return manufacturerAddress;
	}

	public void setManufacturerAddress(String manufacturerAddress) {
		this.manufacturerAddress = manufacturerAddress;
	}

	public String getManufacturerRepresentative() {
		return manufacturerRepresentative;
	}

	public void setManufacturerRepresentative(String manufacturerRepresentative) {
		this.manufacturerRepresentative = manufacturerRepresentative;
	}

	public String getManufacturerRepresentativeTitle() {
		return manufacturerRepresentativeTitle;
	}

	public void setManufacturerRepresentativeTitle(String manufacturerRepresentativeTitle) {
		this.manufacturerRepresentativeTitle = manufacturerRepresentativeTitle;
	}

	public String getManufacturerEmail() {
		return manufacturerEmail;
	}

	public void setManufacturerEmail(String manufacturerEmail) {
		this.manufacturerEmail = manufacturerEmail;
	}

	public String getManufacturerPhone() {
		return manufacturerPhone;
	}

	public void setManufacturerPhone(String manufacturerPhone) {
		this.manufacturerPhone = manufacturerPhone;
	}

	public String getManufacturerFax() {
		return manufacturerFax;
	}

	public void setManufacturerFax(String manufacturerFax) {
		this.manufacturerFax = manufacturerFax;
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

	public String getCopReportNo() {
		return copReportNo;
	}

	public void setCopReportNo(String copReportNo) {
		this.copReportNo = copReportNo;
	}

	public String getCopReportDate() {
		return copReportDate;
	}

	public void setCopReportDate(String copReportDate) {
		this.copReportDate = copReportDate;
	}

	public String getCopReportExpireDate() {
		return copReportExpireDate;
	}

	public void setCopReportExpireDate(String copReportExpireDate) {
		this.copReportExpireDate = copReportExpireDate;
	}

	public String getDesignerCode() {
		return designerCode;
	}

	public void setDesignerCode(String designerCode) {
		this.designerCode = designerCode;
	}

	public String getDesignerName() {
		return designerName;
	}

	public void setDesignerName(String designerName) {
		this.designerName = designerName;
	}

	public String getDesignerAddress() {
		return designerAddress;
	}

	public void setDesignerAddress(String designerAddress) {
		this.designerAddress = designerAddress;
	}

	public String getDesignerRepresentative() {
		return designerRepresentative;
	}

	public void setDesignerRepresentative(String designerRepresentative) {
		this.designerRepresentative = designerRepresentative;
	}

	public String getDesignerRepresentativeTitle() {
		return designerRepresentativeTitle;
	}

	public void setDesignerRepresentativeTitle(String designerRepresentativeTitle) {
		this.designerRepresentativeTitle = designerRepresentativeTitle;
	}

	public String getDesignerEmail() {
		return designerEmail;
	}

	public void setDesignerEmail(String designerEmail) {
		this.designerEmail = designerEmail;
	}

	public String getDesignerPhone() {
		return designerPhone;
	}

	public void setDesignerPhone(String designerPhone) {
		this.designerPhone = designerPhone;
	}

	public String getDesignerFax() {
		return designerFax;
	}

	public void setDesignerFax(String designerFax) {
		this.designerFax = designerFax;
	}

	public String getVerificationCertificateNo() {
		return verificationCertificateNo;
	}

	public void setVerificationCertificateNo(String verificationCertificateNo) {
		this.verificationCertificateNo = verificationCertificateNo;
	}

	public String getVerificationCertificateDate() {
		return verificationCertificateDate;
	}

	public void setVerificationCertificateDate(String verificationCertificateDate) {
		this.verificationCertificateDate = verificationCertificateDate;
	}

	public String getVerificationRefNo() {
		return verificationRefNo;
	}

	public void setVerificationRefNo(String verificationRefNo) {
		this.verificationRefNo = verificationRefNo;
	}

	public String getVerificationRefDate() {
		return verificationRefDate;
	}

	public void setVerificationRefDate(String verificationRefDate) {
		this.verificationRefDate = verificationRefDate;
	}

	public String getTypeApprovalCertificateNo() {
		return typeApprovalCertificateNo;
	}

	public void setTypeApprovalCertificateNo(String typeApprovalCertificateNo) {
		this.typeApprovalCertificateNo = typeApprovalCertificateNo;
	}

	public String getTypeApprovalCertificateDate() {
		return typeApprovalCertificateDate;
	}

	public void setTypeApprovalCertificateDate(String typeApprovalCertificateDate) {
		this.typeApprovalCertificateDate = typeApprovalCertificateDate;
	}

	public String getDesignModelCode() {
		return designModelCode;
	}

	public void setDesignModelCode(String designModelCode) {
		this.designModelCode = designModelCode;
	}

	public String getDesignModelDescription() {
		return designModelDescription;
	}

	public void setDesignModelDescription(String designModelDescription) {
		this.designModelDescription = designModelDescription;
	}

	public String getDesignSymbol() {
		return designSymbol;
	}

	public void setDesignSymbol(String designSymbol) {
		this.designSymbol = designSymbol;
	}

	public String getRegisteredNumber() {
		return registeredNumber;
	}

	public void setRegisteredNumber(String registeredNumber) {
		this.registeredNumber = registeredNumber;
	}

	public String getInspectorReceiveDate() {
		return inspectorReceiveDate;
	}

	public void setInspectorReceiveDate(String inspectorReceiveDate) {
		this.inspectorReceiveDate = inspectorReceiveDate;
	}

	public String getInspectorSubmitDate() {
		return inspectorSubmitDate;
	}

	public void setInspectorSubmitDate(String inspectorSubmitDate) {
		this.inspectorSubmitDate = inspectorSubmitDate;
	}

	public String getInspectorendorSementDate() {
		return inspectorendorSementDate;
	}

	public void setInspectorendorSementDate(String inspectorendorSementDate) {
		this.inspectorendorSementDate = inspectorendorSementDate;
	}

	public String getInspectorDeadline() {
		return inspectorDeadline;
	}

	public void setInspectorDeadline(String inspectorDeadline) {
		this.inspectorDeadline = inspectorDeadline;
	}

	public String getInspectorFinishDate() {
		return inspectorFinishDate;
	}

	public void setInspectorFinishDate(String inspectorFinishDate) {
		this.inspectorFinishDate = inspectorFinishDate;
	}

	public String getInspectorCancelDate() {
		return inspectorCancelDate;
	}

	public void setInspectorCancelDate(String inspectorCancelDate) {
		this.inspectorCancelDate = inspectorCancelDate;
	}

	public String getInspectorOrganization() {
		return inspectorOrganization;
	}

	public void setInspectorOrganization(String inspectorOrganization) {
		this.inspectorOrganization = inspectorOrganization;
	}

	public String getInspectorDivision() {
		return inspectorDivision;
	}

	public void setInspectorDivision(String inspectorDivision) {
		this.inspectorDivision = inspectorDivision;
	}

	public String getInspectorSignName() {
		return inspectorSignName;
	}

	public void setInspectorSignName(String inspectorSignName) {
		this.inspectorSignName = inspectorSignName;
	}

	public String getInspectorSignTitle() {
		return inspectorSignTitle;
	}

	public void setInspectorSignTitle(String inspectorSignTitle) {
		this.inspectorSignTitle = inspectorSignTitle;
	}

	public String getInspectorSignPlace() {
		return inspectorSignPlace;
	}

	public void setInspectorSignPlace(String inspectorSignPlace) {
		this.inspectorSignPlace = inspectorSignPlace;
	}

	public String getCertificateType() {
		return certificateType;
	}

	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public String getReferenceCertificateNo() {
		return referenceCertificateNo;
	}

	public void setReferenceCertificateNo(String referenceCertificateNo) {
		this.referenceCertificateNo = referenceCertificateNo;
	}

	public String getReferenceCertificateDate() {
		return referenceCertificateDate;
	}

	public void setReferenceCertificateDate(String referenceCertificateDate) {
		this.referenceCertificateDate = referenceCertificateDate;
	}

	public String getCertificateRecordNo() {
		return certificateRecordNo;
	}

	public void setCertificateRecordNo(String certificateRecordNo) {
		this.certificateRecordNo = certificateRecordNo;
	}

	public String getCertificateSignName() {
		return certificateSignName;
	}

	public void setCertificateSignName(String certificateSignName) {
		this.certificateSignName = certificateSignName;
	}

	public String getCertificateSignTitle() {
		return certificateSignTitle;
	}

	public void setCertificateSignTitle(String certificateSignTitle) {
		this.certificateSignTitle = certificateSignTitle;
	}

	public String getCertificateSignPlace() {
		return certificateSignPlace;
	}

	public void setCertificateSignPlace(String certificateSignPlace) {
		this.certificateSignPlace = certificateSignPlace;
	}

	public String getCertificateRecordDate() {
		return certificateRecordDate;
	}

	public void setCertificateRecordDate(String certificateRecordDate) {
		this.certificateRecordDate = certificateRecordDate;
	}

	public String getCertificateRecordExpireDate() {
		return certificateRecordExpireDate;
	}

	public void setCertificateRecordExpireDate(String certificateRecordExpireDate) {
		this.certificateRecordExpireDate = certificateRecordExpireDate;
	}

	public String getExpiredStatus() {
		return expiredStatus;
	}

	public void setExpiredStatus(String expiredStatus) {
		this.expiredStatus = expiredStatus;
	}

	public String getCertificateRecordStatus() {
		return certificateRecordStatus;
	}

	public void setCertificateRecordStatus(String certificateRecordStatus) {
		this.certificateRecordStatus = certificateRecordStatus;
	}

	public String getDigitalIssueStatus() {
		return digitalIssueStatus;
	}

	public void setDigitalIssueStatus(String digitalIssueStatus) {
		this.digitalIssueStatus = digitalIssueStatus;
	}

	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	public String getCertifiedVehicleType() {
		return certifiedVehicleType;
	}

	public void setCertifiedVehicleType(String certifiedVehicleType) {
		this.certifiedVehicleType = certifiedVehicleType;
	}

	public String getCertifiedVehicleTypeDescription() {
		return certifiedVehicleTypeDescription;
	}

	public void setCertifiedVehicleTypeDescription(String certifiedVehicleTypeDescription) {
		this.certifiedVehicleTypeDescription = certifiedVehicleTypeDescription;
	}

	public String getCertifiedTrademark() {
		return certifiedTrademark;
	}

	public void setCertifiedTrademark(String certifiedTrademark) {
		this.certifiedTrademark = certifiedTrademark;
	}

	public String getCertifiedTrademarkName() {
		return certifiedTrademarkName;
	}

	public void setCertifiedTrademarkName(String certifiedTrademarkName) {
		this.certifiedTrademarkName = certifiedTrademarkName;
	}

	public String getCertifiedCommercialName() {
		return certifiedCommercialName;
	}

	public void setCertifiedCommercialName(String certifiedCommercialName) {
		this.certifiedCommercialName = certifiedCommercialName;
	}

	public String getCertifiedModelCode() {
		return certifiedModelCode;
	}

	public void setCertifiedModelCode(String certifiedModelCode) {
		this.certifiedModelCode = certifiedModelCode;
	}

	public String getCertifiedAssemblyType() {
		return certifiedAssemblyType;
	}

	public void setCertifiedAssemblyType(String certifiedAssemblyType) {
		this.certifiedAssemblyType = certifiedAssemblyType;
	}

	public String getCertifiedAssemblyTypeDescription() {
		return certifiedAssemblyTypeDescription;
	}

	public void setCertifiedAssemblyTypeDescription(String certifiedAssemblyTypeDescription) {
		this.certifiedAssemblyTypeDescription = certifiedAssemblyTypeDescription;
	}

	public String getCertifiedVINNo() {
		return certifiedVINNo;
	}

	public void setCertifiedVINNo(String certifiedVINNo) {
		this.certifiedVINNo = certifiedVINNo;
	}

	public String getCertifiedVINPosition() {
		return certifiedVINPosition;
	}

	public void setCertifiedVINPosition(String certifiedVINPosition) {
		this.certifiedVINPosition = certifiedVINPosition;
	}

	public String getCertifiedFrameNo() {
		return certifiedFrameNo;
	}

	public void setCertifiedFrameNo(String certifiedFrameNo) {
		this.certifiedFrameNo = certifiedFrameNo;
	}

	public String getCertifiedFrameAttachPlace() {
		return certifiedFrameAttachPlace;
	}

	public void setCertifiedFrameAttachPlace(String certifiedFrameAttachPlace) {
		this.certifiedFrameAttachPlace = certifiedFrameAttachPlace;
	}

	public String getCertifiedFramePosition() {
		return certifiedFramePosition;
	}

	public void setCertifiedFramePosition(String certifiedFramePosition) {
		this.certifiedFramePosition = certifiedFramePosition;
	}

	public String getCertifiedEngineNo() {
		return certifiedEngineNo;
	}

	public void setCertifiedEngineNo(String certifiedEngineNo) {
		this.certifiedEngineNo = certifiedEngineNo;
	}

	public String getCertifiedEngineAttachPlace() {
		return certifiedEngineAttachPlace;
	}

	public void setCertifiedEngineAttachPlace(String certifiedEngineAttachPlace) {
		this.certifiedEngineAttachPlace = certifiedEngineAttachPlace;
	}

	public String getCertifiedEnginePosition() {
		return certifiedEnginePosition;
	}

	public void setCertifiedEnginePosition(String certifiedEnginePosition) {
		this.certifiedEnginePosition = certifiedEnginePosition;
	}

	public String getSafetyTestReportNo() {
		return safetyTestReportNo;
	}

	public void setSafetyTestReportNo(String safetyTestReportNo) {
		this.safetyTestReportNo = safetyTestReportNo;
	}

	public String getSafetyTestReportDate() {
		return safetyTestReportDate;
	}

	public void setSafetyTestReportDate(String safetyTestReportDate) {
		this.safetyTestReportDate = safetyTestReportDate;
	}

	public String getEmissionTestReportNo() {
		return emissionTestReportNo;
	}

	public void setEmissionTestReportNo(String emissionTestReportNo) {
		this.emissionTestReportNo = emissionTestReportNo;
	}

	public String getEmissionTestReportDate() {
		return emissionTestReportDate;
	}

	public void setEmissionTestReportDate(String emissionTestReportDate) {
		this.emissionTestReportDate = emissionTestReportDate;
	}

	public String getCommonSafetyStandard() {
		return commonSafetyStandard;
	}

	public void setCommonSafetyStandard(String commonSafetyStandard) {
		this.commonSafetyStandard = commonSafetyStandard;
	}

	public String getEmissionStandard() {
		return emissionStandard;
	}

	public void setEmissionStandard(String emissionStandard) {
		this.emissionStandard = emissionStandard;
	}

	public String getCommonSafetyDescription() {
		return commonSafetyDescription;
	}

	public void setCommonSafetyDescription(String commonSafetyDescription) {
		this.commonSafetyDescription = commonSafetyDescription;
	}

	public String getEmissionDescription() {
		return emissionDescription;
	}

	public void setEmissionDescription(String emissionDescription) {
		this.emissionDescription = emissionDescription;
	}

	public String getOtherTestReportNo() {
		return otherTestReportNo;
	}

	public void setOtherTestReportNo(String otherTestReportNo) {
		this.otherTestReportNo = otherTestReportNo;
	}

	public String getOtherTestReportDate() {
		return otherTestReportDate;
	}

	public void setOtherTestReportDate(String otherTestReportDate) {
		this.otherTestReportDate = otherTestReportDate;
	}

	public String getSampleFrameNo() {
		return sampleFrameNo;
	}

	public void setSampleFrameNo(String sampleFrameNo) {
		this.sampleFrameNo = sampleFrameNo;
	}

	public String getSampleVINNo() {
		return sampleVINNo;
	}

	public void setSampleVINNo(String sampleVINNo) {
		this.sampleVINNo = sampleVINNo;
	}

	public String getSampleEngineNo() {
		return sampleEngineNo;
	}

	public void setSampleEngineNo(String sampleEngineNo) {
		this.sampleEngineNo = sampleEngineNo;
	}

	public String getSampleVehicleType() {
		return sampleVehicleType;
	}

	public void setSampleVehicleType(String sampleVehicleType) {
		this.sampleVehicleType = sampleVehicleType;
	}

	public String getSampleVehicleTypeDescription() {
		return sampleVehicleTypeDescription;
	}

	public void setSampleVehicleTypeDescription(String sampleVehicleTypeDescription) {
		this.sampleVehicleTypeDescription = sampleVehicleTypeDescription;
	}

	public String getSampleTrademark() {
		return sampleTrademark;
	}

	public void setSampleTrademark(String sampleTrademark) {
		this.sampleTrademark = sampleTrademark;
	}

	public String getSampleTrademarkName() {
		return sampleTrademarkName;
	}

	public void setSampleTrademarkName(String sampleTrademarkName) {
		this.sampleTrademarkName = sampleTrademarkName;
	}

	public String getSampleCommercialName() {
		return sampleCommercialName;
	}

	public void setSampleCommercialName(String sampleCommercialName) {
		this.sampleCommercialName = sampleCommercialName;
	}

	public String getSampleModelCode() {
		return sampleModelCode;
	}

	public void setSampleModelCode(String sampleModelCode) {
		this.sampleModelCode = sampleModelCode;
	}

	public String getCustomsDeclarationNo() {
		return customsDeclarationNo;
	}

	public void setCustomsDeclarationNo(String customsDeclarationNo) {
		this.customsDeclarationNo = customsDeclarationNo;
	}

	public String getCustomsDeclarationDate() {
		return customsDeclarationDate;
	}

	public void setCustomsDeclarationDate(String customsDeclarationDate) {
		this.customsDeclarationDate = customsDeclarationDate;
	}

	public String getProductionCountry() {
		return productionCountry;
	}

	public void setProductionCountry(String productionCountry) {
		this.productionCountry = productionCountry;
	}

	public Long getImporterQuantity() {
		return importerQuantity;
	}

	public void setImporterQuantity(Long importerQuantity) {
		this.importerQuantity = importerQuantity;
	}

	public String getInspectionRecordNo() {
		return inspectionRecordNo;
	}

	public void setInspectionRecordNo(String inspectionRecordNo) {
		this.inspectionRecordNo = inspectionRecordNo;
	}

	public String getInspectionDate() {
		return inspectionDate;
	}

	public void setInspectionDate(String inspectionDate) {
		this.inspectionDate = inspectionDate;
	}

	public String getInspectionSite() {
		return inspectionSite;
	}

	public void setInspectionSite(String inspectionSite) {
		this.inspectionSite = inspectionSite;
	}

	public String getInspectionDistrictCode() {
		return inspectionDistrictCode;
	}

	public void setInspectionDistrictCode(String inspectionDistrictCode) {
		this.inspectionDistrictCode = inspectionDistrictCode;
	}

	public String getInspectionDistrictName() {
		return inspectionDistrictName;
	}

	public void setInspectionDistrictName(String inspectionDistrictName) {
		this.inspectionDistrictName = inspectionDistrictName;
	}

	public String getInspectionProvinceCode() {
		return inspectionProvinceCode;
	}

	public void setInspectionProvinceCode(String inspectionProvinceCode) {
		this.inspectionProvinceCode = inspectionProvinceCode;
	}

	public String getInspectionProvinceName() {
		return inspectionProvinceName;
	}

	public void setInspectionProvinceName(String inspectionProvinceName) {
		this.inspectionProvinceName = inspectionProvinceName;
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

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getInspectionNote() {
		return inspectionNote;
	}

	public void setInspectionNote(String inspectionNote) {
		this.inspectionNote = inspectionNote;
	}

	public String getCertificateNote() {
		return certificateNote;
	}

	public void setCertificateNote(String certificateNote) {
		this.certificateNote = certificateNote;
	}

	public String getDeliverableCode() {
		return deliverableCode;
	}

	public void setDeliverableCode(String deliverableCode) {
		this.deliverableCode = deliverableCode;
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
