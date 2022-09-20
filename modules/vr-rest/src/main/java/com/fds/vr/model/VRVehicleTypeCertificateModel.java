package com.fds.vr.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VRVehicleCertificateModel", propOrder = {
	"certificateId",
	"mtCore",
    "dossierId",
    "dossierNo",
    "serviceCode",
    "serviceName",
	"convertassembleId",
    "applicantIdNo",
    "applicantName",
    "productionPlantCode",
    "productionPlantName",
    "productionPlantAddress",
    "copReportNo",
    "copReportDate",
    "copReportExpireDate",
    "certificateType",
    "certificateRecordNo",
    "certificateRecordDate",
    "certificateRecordExpireDate",
    "expiredStatus",
    "certificateRecordStatus",
    "vehicleClass",
    "certifiedVehicleType",
    "certifiedVehicleTypeDescription",
    "certifiedTrademark",
    "certifiedTrademarkName",
    "certifiedCommercialName",
    "certifiedModelCode",
    "safetyTestReportNo",
    "safetyTestReportDate",
    "emissionTestReportNo",
    "emissionTestReportDate",
    "commonSafetyStandard",
    "emissionStandard",
    "commonSafetyDescription",
    "emissionDescription",
    "otherTestReportNo",
    "otherTestReportDate",
    "customsDeclarationNo",
    "customsDeclarationDate",
    "productionCountry",
    "importerQuantity",
    "remarks",
    "inspectionNote",
    "certificateNote",
    "deliverableCode",
    "module"
})

@XmlRootElement(name = "VRVehicleCertificateModel")
public class VRVehicleTypeCertificateModel {
	protected long certificateId;
	protected long mtCore;
	protected long dossierId;
	protected String dossierNo;
	protected String serviceCode;
	protected String serviceName;
	protected long convertassembleId;
	protected String applicantIdNo;
	protected String applicantName;
	protected String productionPlantCode;
	protected String productionPlantName;
	protected String productionPlantAddress;
	protected String copReportNo;
	protected String copReportDate;
	protected String copReportExpireDate;
	protected String certificateType;
	protected String certificateRecordNo;
	protected String certificateRecordDate;
	protected String certificateRecordExpireDate;
	protected String expiredStatus;
	protected String certificateRecordStatus;
	protected String vehicleClass;
	protected String certifiedVehicleType;
	protected String certifiedVehicleTypeDescription;
	protected String certifiedTrademark;
	protected String certifiedTrademarkName;
	protected String certifiedCommercialName;
	protected String certifiedModelCode;
	protected String safetyTestReportNo;
	protected String safetyTestReportDate;
	protected String emissionTestReportNo;
	protected String emissionTestReportDate;
	protected String commonSafetyStandard;
	protected String emissionStandard;
	protected String commonSafetyDescription;
	protected String emissionDescription;
	protected String otherTestReportNo;
	protected String otherTestReportDate;
	protected String customsDeclarationNo;
	protected String customsDeclarationDate;
	protected String productionCountry;
	protected long importerQuantity;
	protected String remarks;
	protected String inspectionNote;
	protected String certificateNote;
	protected String deliverableCode;
	protected String module;

	public long getMtCore() {
		return mtCore;
	}
	public void setMtCore(long mtCore) {
		this.mtCore = mtCore;
	}
	public long getDossierId() {
		return dossierId;
	}
	public void setDossierId(long dossierId) {
		this.dossierId = dossierId;
	}
	public String getDossierNo() {
		return dossierNo;
	}
	public void setDossierNo(String dossierNo) {
		this.dossierNo = dossierNo;
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
	public long getConvertassembleId() {
		return convertassembleId;
	}
	public void setConvertassembleId(long convertassembleId) {
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
	public String getCertificateType() {
		return certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}
	public String getCertificateRecordNo() {
		return certificateRecordNo;
	}
	public void setCertificateRecordNo(String certificateRecordNo) {
		this.certificateRecordNo = certificateRecordNo;
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
	public long getImporterQuantity() {
		return importerQuantity;
	}
	public void setImporterQuantity(long importerQuantity) {
		this.importerQuantity = importerQuantity;
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
	public long getCertificateId() {
		return certificateId;
	}
	public void setCertificateId(long certificateId) {
		this.certificateId = certificateId;
	}

}
