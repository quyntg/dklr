package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "dossierid", "dossieridctn", "dossierno", "dossiersendingdate",
		"dossierreceivingdate", "dossierfirstupdatingdate", "dossierlastupdatingdate", "dossierendorsementdate",
		"dossiersubmittingdate", "dossierfirstcertificatesigndate", "dossierfirstassignmentdate",
		"dossierfirstreviewdate", "dossiernexttreviewdate", "dossierlastassignmentdate", "dossierreviewadjustdate",
		"dossierlastreviewadjustdate", "dossierlastcertificatesigndate", "dossierdeadline", "dossierfinisheddate",
		"dossiercancellingdate", "dossierexpiredate", "dossierviolatingdate", "dossierviolatingfromdate",
		"dossierviolatingtodate", "dossiertype", "dossiertype_endorsed", "dossiertype_expired", "dossiertype_updated",
		"dossiertype_delayed", "dossierdelayday", "dossierdelayreason", "dossierstatus_processing", "dossiersubstatus",
		"dossierresult", "remarktoupdate", "remarktoresult", "resultdescription1", "resultdescription2",
		"resultdescription3", "applicantno", "applicantname", "applicantaddress", "productionplantname",
		"productionplantaddress", "domesticfdi", "vehicleclass", "certifiedvehicletype",
		"certifiedvehicletypedescription", "certifiedtrademark", "certifiedtrademarkname", "certifiedcommercialname",
		"certifiedmodelcode", "certifiedassemblytype", "certifiedassemblytypedescription", "equipmentimportquantity",
		"seatnumber", "enginetype", "enginetypedescription", "certificaterecordno_new", "certificaterecordno_renew",
		"certificateyear", "certificatemonth", "corporationid", "inspectorcode", "inspectorname", "leadername",
		"men2receiving", "men2firstupdating", "men2lastupdating", "men2endorsement", "men2submitting",
		"men2firstcertificate", "men2firstassignment", "men2firstreview", "men2nexttreview", "men2lastassignment",
		"men2reviewadjust", "men2lastreviewadjust", "men2lastcertificatesign", "men2finished", "men2cancelled",
		"men2expired", "men2violated", "modifydate", "syncdate", "keyword", "start", "end", "order_asc", "order_desc" })
@XmlRootElement(name = "VRRPDossierStatisticsBeanParam")
public class VRRPDossierStatisticsBeanParam {
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
	@QueryParam(value = "dossierid")
	protected Long dossierid;
	@QueryParam(value = "dossieridctn")
	protected String dossierIdCTN;
	@QueryParam(value = "dossierno")
	protected String dossierno;
	@QueryParam(value = "dossiersendingdate")
	protected String dossiersendingdate;
	@QueryParam(value = "dossierreceivingdate")
	protected String dossierreceivingdate;
	@QueryParam(value = "dossierfirstupdatingdate")
	protected String dossierfirstupdatingdate;
	@QueryParam(value = "dossierlastupdatingdate")
	protected String dossierlastupdatingdate;
	@QueryParam(value = "dossierendorsementdate")
	protected String dossierendorsementdate;
	@QueryParam(value = "dossiersubmittingdate")
	protected String dossiersubmittingdate;
	@QueryParam(value = "dossierfirstcertificatesigndate")
	protected String dossierfirstcertificatesigndate;
	@QueryParam(value = "dossierfirstassignmentdate")
	protected String dossierfirstassignmentdate;
	@QueryParam(value = "dossierfirstreviewdate")
	protected String dossierfirstreviewdate;
	@QueryParam(value = "dossiernexttreviewdate")
	protected String dossiernexttreviewdate;
	@QueryParam(value = "dossierlastassignmentdate")
	protected String dossierlastassignmentdate;
	@QueryParam(value = "dossierreviewadjustdate")
	protected String dossierreviewadjustdate;
	@QueryParam(value = "dossierlastreviewadjustdate")
	protected String dossierlastreviewadjustdate;
	@QueryParam(value = "dossierlastcertificatesigndate")
	protected String dossierlastcertificatesigndate;
	@QueryParam(value = "dossierdeadline")
	protected String dossierdeadline;
	@QueryParam(value = "dossierfinisheddate")
	protected String dossierfinisheddate;
	@QueryParam(value = "dossiercancellingdate")
	protected String dossiercancellingdate;
	@QueryParam(value = "dossierexpiredate")
	protected String dossierexpiredate;
	@QueryParam(value = "dossierviolatingdate")
	protected String dossierviolatingdate;
	@QueryParam(value = "dossierviolatingfromdate")
	protected String dossierviolatingfromdate;
	@QueryParam(value = "dossierviolatingtodate")
	protected String dossierviolatingtodate;
	@QueryParam(value = "dossiertype")
	protected String dossiertype;
	@QueryParam(value = "dossiertype_endorsed")
	protected String dossiertype_endorsed;
	@QueryParam(value = "dossiertype_expired")
	protected String dossiertype_expired;
	@QueryParam(value = "dossiertype_updated")
	protected String dossiertype_updated;
	@QueryParam(value = "dossiertype_delayed")
	protected String dossiertype_delayed;
	@QueryParam(value = "dossierdelayday")
	protected Integer dossierdelayday;
	@QueryParam(value = "dossierdelayreason")
	protected String dossierdelayreason;
	@QueryParam(value = "dossierstatus_processing")
	protected String dossierstatus_processing;
	@QueryParam(value = "dossiersubstatus")
	protected String dossiersubstatus;
	@QueryParam(value = "dossierresult")
	protected String dossierresult;
	@QueryParam(value = "remarktoupdate")
	protected String remarkToUpdate;
	@QueryParam(value = "remarktoresult")
	protected String remarkToResult;
	@QueryParam(value = "resultdescription1")
	protected String resultdescription1;
	@QueryParam(value = "resultdescription2")
	protected String resultdescription2;
	@QueryParam(value = "resultdescription3")
	protected String resultdescription3;
	@QueryParam(value = "applicantno")
	protected String applicantNo;
	@QueryParam(value = "applicantname")
	protected String applicantname;
	@QueryParam(value = "applicantaddress")
	protected String applicantaddress;
	@QueryParam(value = "productionplantname")
	protected String productionplantname;
	@QueryParam(value = "productionplantaddress")
	protected String productionplantaddress;
	@QueryParam(value = "domesticfdi")
	protected String domesticFDI;
	@QueryParam(value = "vehicleclass")
	protected String vehicleclass;
	@QueryParam(value = "certifiedvehicletype")
	protected String certifiedvehicletype;
	@QueryParam(value = "certifiedvehicletypedescription")
	protected String certifiedvehicletypedescription;
	@QueryParam(value = "certifiedtrademark")
	protected String certifiedtrademark;
	@QueryParam(value = "certifiedtrademarkname")
	protected String certifiedtrademarkname;
	@QueryParam(value = "certifiedcommercialname")
	protected String certifiedcommercialname;
	@QueryParam(value = "certifiedmodelcode")
	protected String certifiedmodelcode;
	@QueryParam(value = "certifiedassemblytype")
	protected String certifiedassemblytype;
	@QueryParam(value = "certifiedassemblytypedescription")
	protected String certifiedassemblytypedescription;
	@QueryParam(value = "equipmentimportquantity")
	protected Integer equipmentimportquantity;
	@QueryParam(value = "seatnumber")
	protected String SeatNumber;
	@QueryParam(value = "enginetype")
	protected String EngineType;
	@QueryParam(value = "enginetypedescription")
	protected String EngineTypeDescription;
	@QueryParam(value = "certificaterecordno_new")
	protected String certificaterecordno_new;
	@QueryParam(value = "certificaterecordno_renew")
	protected String certificaterecordno_renew;
	@QueryParam(value = "certificateyear")
	protected String certificateyear;
	@QueryParam(value = "certificatemonth")
	protected Integer certificatemonth;
	@QueryParam(value = "corporationid")
	protected String corporationId;
	@QueryParam(value = "inspectorcode")
	protected String inspectorcode;
	@QueryParam(value = "inspectorname")
	protected String inspectorname;
	@QueryParam(value = "leadername")
	protected String leadername;
	@QueryParam(value = "men2receiving")
	protected String men2receiving;
	@QueryParam(value = "men2firstupdating")
	protected String men2firstupdating;
	@QueryParam(value = "men2lastupdating")
	protected String men2lastupdating;
	@QueryParam(value = "men2endorsement")
	protected String men2endorsement;
	@QueryParam(value = "men2submitting")
	protected String men2submitting;
	@QueryParam(value = "men2firstcertificate")
	protected String men2firstcertificate;
	@QueryParam(value = "men2firstassignment")
	protected String men2firstassignment;
	@QueryParam(value = "men2firstreview")
	protected String men2firstreview;
	@QueryParam(value = "men2nexttreview")
	protected String men2nexttreview;
	@QueryParam(value = "men2lastassignment")
	protected String men2lastassignment;
	@QueryParam(value = "men2reviewadjust")
	protected String men2reviewadjust;
	@QueryParam(value = "men2lastreviewadjust")
	protected String men2lastreviewadjust;
	@QueryParam(value = "men2lastcertificatesign")
	protected String men2lastcertificatesign;
	@QueryParam(value = "men2finished")
	protected String men2finished;
	@QueryParam(value = "men2cancelled")
	protected String men2cancelled;
	@QueryParam(value = "men2expired")
	protected String men2expired;
	@QueryParam(value = "men2violated")
	protected String men2violated;
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

	public Long getDossierid() {
		return dossierid;
	}

	public void setDossierid(Long dossierid) {
		this.dossierid = dossierid;
	}

	public String getDossierIdCTN() {
		return dossierIdCTN;
	}

	public void setDossierIdCTN(String dossierIdCTN) {
		this.dossierIdCTN = dossierIdCTN;
	}

	public String getDossierno() {
		return dossierno;
	}

	public void setDossierno(String dossierno) {
		this.dossierno = dossierno;
	}

	public String getDossiersendingdate() {
		return dossiersendingdate;
	}

	public void setDossiersendingdate(String dossiersendingdate) {
		this.dossiersendingdate = dossiersendingdate;
	}

	public String getDossierreceivingdate() {
		return dossierreceivingdate;
	}

	public void setDossierreceivingdate(String dossierreceivingdate) {
		this.dossierreceivingdate = dossierreceivingdate;
	}

	public String getDossierfirstupdatingdate() {
		return dossierfirstupdatingdate;
	}

	public void setDossierfirstupdatingdate(String dossierfirstupdatingdate) {
		this.dossierfirstupdatingdate = dossierfirstupdatingdate;
	}

	public String getDossierlastupdatingdate() {
		return dossierlastupdatingdate;
	}

	public void setDossierlastupdatingdate(String dossierlastupdatingdate) {
		this.dossierlastupdatingdate = dossierlastupdatingdate;
	}

	public String getDossierendorsementdate() {
		return dossierendorsementdate;
	}

	public void setDossierendorsementdate(String dossierendorsementdate) {
		this.dossierendorsementdate = dossierendorsementdate;
	}

	public String getDossiersubmittingdate() {
		return dossiersubmittingdate;
	}

	public void setDossiersubmittingdate(String dossiersubmittingdate) {
		this.dossiersubmittingdate = dossiersubmittingdate;
	}

	public String getDossierfirstcertificatesigndate() {
		return dossierfirstcertificatesigndate;
	}

	public void setDossierfirstcertificatesigndate(String dossierfirstcertificatesigndate) {
		this.dossierfirstcertificatesigndate = dossierfirstcertificatesigndate;
	}

	public String getDossierfirstassignmentdate() {
		return dossierfirstassignmentdate;
	}

	public void setDossierfirstassignmentdate(String dossierfirstassignmentdate) {
		this.dossierfirstassignmentdate = dossierfirstassignmentdate;
	}

	public String getDossierfirstreviewdate() {
		return dossierfirstreviewdate;
	}

	public void setDossierfirstreviewdate(String dossierfirstreviewdate) {
		this.dossierfirstreviewdate = dossierfirstreviewdate;
	}

	public String getDossiernexttreviewdate() {
		return dossiernexttreviewdate;
	}

	public void setDossiernexttreviewdate(String dossiernexttreviewdate) {
		this.dossiernexttreviewdate = dossiernexttreviewdate;
	}

	public String getDossierlastassignmentdate() {
		return dossierlastassignmentdate;
	}

	public void setDossierlastassignmentdate(String dossierlastassignmentdate) {
		this.dossierlastassignmentdate = dossierlastassignmentdate;
	}

	public String getDossierreviewadjustdate() {
		return dossierreviewadjustdate;
	}

	public void setDossierreviewadjustdate(String dossierreviewadjustdate) {
		this.dossierreviewadjustdate = dossierreviewadjustdate;
	}

	public String getDossierlastreviewadjustdate() {
		return dossierlastreviewadjustdate;
	}

	public void setDossierlastreviewadjustdate(String dossierlastreviewadjustdate) {
		this.dossierlastreviewadjustdate = dossierlastreviewadjustdate;
	}

	public String getDossierlastcertificatesigndate() {
		return dossierlastcertificatesigndate;
	}

	public void setDossierlastcertificatesigndate(String dossierlastcertificatesigndate) {
		this.dossierlastcertificatesigndate = dossierlastcertificatesigndate;
	}

	public String getDossierdeadline() {
		return dossierdeadline;
	}

	public void setDossierdeadline(String dossierdeadline) {
		this.dossierdeadline = dossierdeadline;
	}

	public String getDossierfinisheddate() {
		return dossierfinisheddate;
	}

	public void setDossierfinisheddate(String dossierfinisheddate) {
		this.dossierfinisheddate = dossierfinisheddate;
	}

	public String getDossiercancellingdate() {
		return dossiercancellingdate;
	}

	public void setDossiercancellingdate(String dossiercancellingdate) {
		this.dossiercancellingdate = dossiercancellingdate;
	}

	public String getDossierexpiredate() {
		return dossierexpiredate;
	}

	public void setDossierexpiredate(String dossierexpiredate) {
		this.dossierexpiredate = dossierexpiredate;
	}

	public String getDossierviolatingdate() {
		return dossierviolatingdate;
	}

	public void setDossierviolatingdate(String dossierviolatingdate) {
		this.dossierviolatingdate = dossierviolatingdate;
	}

	public String getDossierviolatingfromdate() {
		return dossierviolatingfromdate;
	}

	public void setDossierviolatingfromdate(String dossierviolatingfromdate) {
		this.dossierviolatingfromdate = dossierviolatingfromdate;
	}

	public String getDossierviolatingtodate() {
		return dossierviolatingtodate;
	}

	public void setDossierviolatingtodate(String dossierviolatingtodate) {
		this.dossierviolatingtodate = dossierviolatingtodate;
	}

	public String getDossiertype() {
		return dossiertype;
	}

	public void setDossiertype(String dossiertype) {
		this.dossiertype = dossiertype;
	}

	public String getDossiertype_endorsed() {
		return dossiertype_endorsed;
	}

	public void setDossiertype_endorsed(String dossiertype_endorsed) {
		this.dossiertype_endorsed = dossiertype_endorsed;
	}

	public String getDossiertype_expired() {
		return dossiertype_expired;
	}

	public void setDossiertype_expired(String dossiertype_expired) {
		this.dossiertype_expired = dossiertype_expired;
	}

	public String getDossiertype_updated() {
		return dossiertype_updated;
	}

	public void setDossiertype_updated(String dossiertype_updated) {
		this.dossiertype_updated = dossiertype_updated;
	}

	public String getDossiertype_delayed() {
		return dossiertype_delayed;
	}

	public void setDossiertype_delayed(String dossiertype_delayed) {
		this.dossiertype_delayed = dossiertype_delayed;
	}

	public Integer getDossierdelayday() {
		return dossierdelayday;
	}

	public void setDossierdelayday(Integer dossierdelayday) {
		this.dossierdelayday = dossierdelayday;
	}

	public String getDossierdelayreason() {
		return dossierdelayreason;
	}

	public void setDossierdelayreason(String dossierdelayreason) {
		this.dossierdelayreason = dossierdelayreason;
	}

	public String getDossierstatus_processing() {
		return dossierstatus_processing;
	}

	public void setDossierstatus_processing(String dossierstatus_processing) {
		this.dossierstatus_processing = dossierstatus_processing;
	}

	public String getDossiersubstatus() {
		return dossiersubstatus;
	}

	public void setDossiersubstatus(String dossiersubstatus) {
		this.dossiersubstatus = dossiersubstatus;
	}

	public String getDossierresult() {
		return dossierresult;
	}

	public void setDossierresult(String dossierresult) {
		this.dossierresult = dossierresult;
	}

	public String getRemarkToUpdate() {
		return remarkToUpdate;
	}

	public void setRemarkToUpdate(String remarkToUpdate) {
		this.remarkToUpdate = remarkToUpdate;
	}

	public String getRemarkToResult() {
		return remarkToResult;
	}

	public void setRemarkToResult(String remarkToResult) {
		this.remarkToResult = remarkToResult;
	}

	public String getResultdescription1() {
		return resultdescription1;
	}

	public void setResultdescription1(String resultdescription1) {
		this.resultdescription1 = resultdescription1;
	}

	public String getResultdescription2() {
		return resultdescription2;
	}

	public void setResultdescription2(String resultdescription2) {
		this.resultdescription2 = resultdescription2;
	}

	public String getResultdescription3() {
		return resultdescription3;
	}

	public void setResultdescription3(String resultdescription3) {
		this.resultdescription3 = resultdescription3;
	}

	public String getApplicantNo() {
		return applicantNo;
	}

	public void setApplicantNo(String applicantNo) {
		this.applicantNo = applicantNo;
	}

	public String getApplicantname() {
		return applicantname;
	}

	public void setApplicantname(String applicantname) {
		this.applicantname = applicantname;
	}

	public String getApplicantaddress() {
		return applicantaddress;
	}

	public void setApplicantaddress(String applicantaddress) {
		this.applicantaddress = applicantaddress;
	}

	public String getProductionplantname() {
		return productionplantname;
	}

	public void setProductionplantname(String productionplantname) {
		this.productionplantname = productionplantname;
	}

	public String getProductionplantaddress() {
		return productionplantaddress;
	}

	public void setProductionplantaddress(String productionplantaddress) {
		this.productionplantaddress = productionplantaddress;
	}

	public String getDomesticFDI() {
		return domesticFDI;
	}

	public void setDomesticFDI(String domesticFDI) {
		this.domesticFDI = domesticFDI;
	}

	public String getVehicleclass() {
		return vehicleclass;
	}

	public void setVehicleclass(String vehicleclass) {
		this.vehicleclass = vehicleclass;
	}

	public String getCertifiedvehicletype() {
		return certifiedvehicletype;
	}

	public void setCertifiedvehicletype(String certifiedvehicletype) {
		this.certifiedvehicletype = certifiedvehicletype;
	}

	public String getCertifiedvehicletypedescription() {
		return certifiedvehicletypedescription;
	}

	public void setCertifiedvehicletypedescription(String certifiedvehicletypedescription) {
		this.certifiedvehicletypedescription = certifiedvehicletypedescription;
	}

	public String getCertifiedtrademark() {
		return certifiedtrademark;
	}

	public void setCertifiedtrademark(String certifiedtrademark) {
		this.certifiedtrademark = certifiedtrademark;
	}

	public String getCertifiedtrademarkname() {
		return certifiedtrademarkname;
	}

	public void setCertifiedtrademarkname(String certifiedtrademarkname) {
		this.certifiedtrademarkname = certifiedtrademarkname;
	}

	public String getCertifiedcommercialname() {
		return certifiedcommercialname;
	}

	public void setCertifiedcommercialname(String certifiedcommercialname) {
		this.certifiedcommercialname = certifiedcommercialname;
	}

	public String getCertifiedmodelcode() {
		return certifiedmodelcode;
	}

	public void setCertifiedmodelcode(String certifiedmodelcode) {
		this.certifiedmodelcode = certifiedmodelcode;
	}

	public String getCertifiedassemblytype() {
		return certifiedassemblytype;
	}

	public void setCertifiedassemblytype(String certifiedassemblytype) {
		this.certifiedassemblytype = certifiedassemblytype;
	}

	public String getCertifiedassemblytypedescription() {
		return certifiedassemblytypedescription;
	}

	public void setCertifiedassemblytypedescription(String certifiedassemblytypedescription) {
		this.certifiedassemblytypedescription = certifiedassemblytypedescription;
	}

	public Integer getEquipmentimportquantity() {
		return equipmentimportquantity;
	}

	public void setEquipmentimportquantity(Integer equipmentimportquantity) {
		this.equipmentimportquantity = equipmentimportquantity;
	}

	public String getSeatNumber() {
		return SeatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		SeatNumber = seatNumber;
	}

	public String getEngineType() {
		return EngineType;
	}

	public void setEngineType(String engineType) {
		EngineType = engineType;
	}

	public String getEngineTypeDescription() {
		return EngineTypeDescription;
	}

	public void setEngineTypeDescription(String engineTypeDescription) {
		EngineTypeDescription = engineTypeDescription;
	}

	public String getCertificaterecordno_new() {
		return certificaterecordno_new;
	}

	public void setCertificaterecordno_new(String certificaterecordno_new) {
		this.certificaterecordno_new = certificaterecordno_new;
	}

	public String getCertificaterecordno_renew() {
		return certificaterecordno_renew;
	}

	public void setCertificaterecordno_renew(String certificaterecordno_renew) {
		this.certificaterecordno_renew = certificaterecordno_renew;
	}

	public String getCertificateyear() {
		return certificateyear;
	}

	public void setCertificateyear(String certificateyear) {
		this.certificateyear = certificateyear;
	}

	public Integer getCertificatemonth() {
		return certificatemonth;
	}

	public void setCertificatemonth(Integer certificatemonth) {
		this.certificatemonth = certificatemonth;
	}

	public String getCorporationId() {
		return corporationId;
	}

	public void setCorporationId(String corporationId) {
		this.corporationId = corporationId;
	}

	public String getInspectorcode() {
		return inspectorcode;
	}

	public void setInspectorcode(String inspectorcode) {
		this.inspectorcode = inspectorcode;
	}

	public String getInspectorname() {
		return inspectorname;
	}

	public void setInspectorname(String inspectorname) {
		this.inspectorname = inspectorname;
	}

	public String getLeadername() {
		return leadername;
	}

	public void setLeadername(String leadername) {
		this.leadername = leadername;
	}

	public String getMen2receiving() {
		return men2receiving;
	}

	public void setMen2receiving(String men2receiving) {
		this.men2receiving = men2receiving;
	}

	public String getMen2firstupdating() {
		return men2firstupdating;
	}

	public void setMen2firstupdating(String men2firstupdating) {
		this.men2firstupdating = men2firstupdating;
	}

	public String getMen2lastupdating() {
		return men2lastupdating;
	}

	public void setMen2lastupdating(String men2lastupdating) {
		this.men2lastupdating = men2lastupdating;
	}

	public String getMen2endorsement() {
		return men2endorsement;
	}

	public void setMen2endorsement(String men2endorsement) {
		this.men2endorsement = men2endorsement;
	}

	public String getMen2submitting() {
		return men2submitting;
	}

	public void setMen2submitting(String men2submitting) {
		this.men2submitting = men2submitting;
	}

	public String getMen2firstcertificate() {
		return men2firstcertificate;
	}

	public void setMen2firstcertificate(String men2firstcertificate) {
		this.men2firstcertificate = men2firstcertificate;
	}

	public String getMen2firstassignment() {
		return men2firstassignment;
	}

	public void setMen2firstassignment(String men2firstassignment) {
		this.men2firstassignment = men2firstassignment;
	}

	public String getMen2firstreview() {
		return men2firstreview;
	}

	public void setMen2firstreview(String men2firstreview) {
		this.men2firstreview = men2firstreview;
	}

	public String getMen2nexttreview() {
		return men2nexttreview;
	}

	public void setMen2nexttreview(String men2nexttreview) {
		this.men2nexttreview = men2nexttreview;
	}

	public String getMen2lastassignment() {
		return men2lastassignment;
	}

	public void setMen2lastassignment(String men2lastassignment) {
		this.men2lastassignment = men2lastassignment;
	}

	public String getMen2reviewadjust() {
		return men2reviewadjust;
	}

	public void setMen2reviewadjust(String men2reviewadjust) {
		this.men2reviewadjust = men2reviewadjust;
	}

	public String getMen2lastreviewadjust() {
		return men2lastreviewadjust;
	}

	public void setMen2lastreviewadjust(String men2lastreviewadjust) {
		this.men2lastreviewadjust = men2lastreviewadjust;
	}

	public String getMen2lastcertificatesign() {
		return men2lastcertificatesign;
	}

	public void setMen2lastcertificatesign(String men2lastcertificatesign) {
		this.men2lastcertificatesign = men2lastcertificatesign;
	}

	public String getMen2finished() {
		return men2finished;
	}

	public void setMen2finished(String men2finished) {
		this.men2finished = men2finished;
	}

	public String getMen2cancelled() {
		return men2cancelled;
	}

	public void setMen2cancelled(String men2cancelled) {
		this.men2cancelled = men2cancelled;
	}

	public String getMen2expired() {
		return men2expired;
	}

	public void setMen2expired(String men2expired) {
		this.men2expired = men2expired;
	}

	public String getMen2violated() {
		return men2violated;
	}

	public void setMen2violated(String men2violated) {
		this.men2violated = men2violated;
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
