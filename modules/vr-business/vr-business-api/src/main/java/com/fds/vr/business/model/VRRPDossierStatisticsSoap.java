/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.fds.vr.business.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LamTV
 * @generated
 */
@ProviderType
public class VRRPDossierStatisticsSoap implements Serializable {
	public static VRRPDossierStatisticsSoap toSoapModel(
		VRRPDossierStatistics model) {
		VRRPDossierStatisticsSoap soapModel = new VRRPDossierStatisticsSoap();

		soapModel.setId(model.getId());
		soapModel.setDossierid(model.getDossierid());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDossierno(model.getDossierno());
		soapModel.setDossiersendingdate(model.getDossiersendingdate());
		soapModel.setDossierreceivingdate(model.getDossierreceivingdate());
		soapModel.setDossierfirstupdatingdate(model.getDossierfirstupdatingdate());
		soapModel.setDossierlastupdatingdate(model.getDossierlastupdatingdate());
		soapModel.setDossierendorsementdate(model.getDossierendorsementdate());
		soapModel.setDossiersubmittingdate(model.getDossiersubmittingdate());
		soapModel.setDossierfirstcertificatesigndate(model.getDossierfirstcertificatesigndate());
		soapModel.setDossierfirstassignmentdate(model.getDossierfirstassignmentdate());
		soapModel.setDossierfirstreviewdate(model.getDossierfirstreviewdate());
		soapModel.setDossiernexttreviewdate(model.getDossiernexttreviewdate());
		soapModel.setDossierlastassignmentdate(model.getDossierlastassignmentdate());
		soapModel.setDossierreviewadjustdate(model.getDossierreviewadjustdate());
		soapModel.setDossierlastreviewadjustdate(model.getDossierlastreviewadjustdate());
		soapModel.setDossierlastcertificatesigndate(model.getDossierlastcertificatesigndate());
		soapModel.setDossierdeadline(model.getDossierdeadline());
		soapModel.setDossierfinisheddate(model.getDossierfinisheddate());
		soapModel.setDossiercancellingdate(model.getDossiercancellingdate());
		soapModel.setDossierexpiredate(model.getDossierexpiredate());
		soapModel.setDossierviolatingdate(model.getDossierviolatingdate());
		soapModel.setDossierviolatingfromdate(model.getDossierviolatingfromdate());
		soapModel.setDossierviolatingtodate(model.getDossierviolatingtodate());
		soapModel.setDossiertype(model.getDossiertype());
		soapModel.setDossiertype_endorsed(model.getDossiertype_endorsed());
		soapModel.setDossiertype_expired(model.getDossiertype_expired());
		soapModel.setDossiertype_updated(model.getDossiertype_updated());
		soapModel.setDossiertype_delayed(model.getDossiertype_delayed());
		soapModel.setDossierdelayday(model.getDossierdelayday());
		soapModel.setDossierdelayreason(model.getDossierdelayreason());
		soapModel.setDossierstatus_processing(model.getDossierstatus_processing());
		soapModel.setDossiersubstatus(model.getDossiersubstatus());
		soapModel.setDossierresult(model.getDossierresult());
		soapModel.setRemarkToUpdate(model.getRemarkToUpdate());
		soapModel.setRemarkToResult(model.getRemarkToResult());
		soapModel.setResultdescription1(model.getResultdescription1());
		soapModel.setResultdescription2(model.getResultdescription2());
		soapModel.setResultdescription3(model.getResultdescription3());
		soapModel.setApplicantNo(model.getApplicantNo());
		soapModel.setApplicantname(model.getApplicantname());
		soapModel.setApplicantaddress(model.getApplicantaddress());
		soapModel.setProductionplantname(model.getProductionplantname());
		soapModel.setProductionplantaddress(model.getProductionplantaddress());
		soapModel.setDomesticFDI(model.getDomesticFDI());
		soapModel.setVehicleclass(model.getVehicleclass());
		soapModel.setCertifiedvehicletype(model.getCertifiedvehicletype());
		soapModel.setCertifiedvehicletypedescription(model.getCertifiedvehicletypedescription());
		soapModel.setCertifiedtrademark(model.getCertifiedtrademark());
		soapModel.setCertifiedtrademarkname(model.getCertifiedtrademarkname());
		soapModel.setCertifiedcommercialname(model.getCertifiedcommercialname());
		soapModel.setCertifiedmodelcode(model.getCertifiedmodelcode());
		soapModel.setCertifiedassemblytype(model.getCertifiedassemblytype());
		soapModel.setCertifiedassemblytypedescription(model.getCertifiedassemblytypedescription());
		soapModel.setEquipmentimportquantity(model.getEquipmentimportquantity());
		soapModel.setSeatNumber(model.getSeatNumber());
		soapModel.setEngineType(model.getEngineType());
		soapModel.setEngineTypeDescription(model.getEngineTypeDescription());
		soapModel.setCertificaterecordno_new(model.getCertificaterecordno_new());
		soapModel.setCertificaterecordno_renew(model.getCertificaterecordno_renew());
		soapModel.setCertificateyear(model.getCertificateyear());
		soapModel.setCertificatemonth(model.getCertificatemonth());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setInspectorcode(model.getInspectorcode());
		soapModel.setInspectorname(model.getInspectorname());
		soapModel.setLeadername(model.getLeadername());
		soapModel.setMen2receiving(model.getMen2receiving());
		soapModel.setMen2firstupdating(model.getMen2firstupdating());
		soapModel.setMen2lastupdating(model.getMen2lastupdating());
		soapModel.setMen2endorsement(model.getMen2endorsement());
		soapModel.setMen2submitting(model.getMen2submitting());
		soapModel.setMen2firstcertificate(model.getMen2firstcertificate());
		soapModel.setMen2firstassignment(model.getMen2firstassignment());
		soapModel.setMen2firstreview(model.getMen2firstreview());
		soapModel.setMen2nexttreview(model.getMen2nexttreview());
		soapModel.setMen2lastassignment(model.getMen2lastassignment());
		soapModel.setMen2reviewadjust(model.getMen2reviewadjust());
		soapModel.setMen2lastreviewadjust(model.getMen2lastreviewadjust());
		soapModel.setMen2lastcertificatesign(model.getMen2lastcertificatesign());
		soapModel.setMen2finished(model.getMen2finished());
		soapModel.setMen2cancelled(model.getMen2cancelled());
		soapModel.setMen2expired(model.getMen2expired());
		soapModel.setMen2violated(model.getMen2violated());
		soapModel.setDossierPaymentDate(model.getDossierPaymentDate());
		soapModel.setMen2PaymentApproval(model.getMen2PaymentApproval());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRRPDossierStatisticsSoap[] toSoapModels(
		VRRPDossierStatistics[] models) {
		VRRPDossierStatisticsSoap[] soapModels = new VRRPDossierStatisticsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRRPDossierStatisticsSoap[][] toSoapModels(
		VRRPDossierStatistics[][] models) {
		VRRPDossierStatisticsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRRPDossierStatisticsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRRPDossierStatisticsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRRPDossierStatisticsSoap[] toSoapModels(
		List<VRRPDossierStatistics> models) {
		List<VRRPDossierStatisticsSoap> soapModels = new ArrayList<VRRPDossierStatisticsSoap>(models.size());

		for (VRRPDossierStatistics model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRRPDossierStatisticsSoap[soapModels.size()]);
	}

	public VRRPDossierStatisticsSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getDossierid() {
		return _dossierid;
	}

	public void setDossierid(long dossierid) {
		_dossierid = dossierid;
	}

	public String getDossierIdCTN() {
		return _dossierIdCTN;
	}

	public void setDossierIdCTN(String dossierIdCTN) {
		_dossierIdCTN = dossierIdCTN;
	}

	public String getDossierno() {
		return _dossierno;
	}

	public void setDossierno(String dossierno) {
		_dossierno = dossierno;
	}

	public Date getDossiersendingdate() {
		return _dossiersendingdate;
	}

	public void setDossiersendingdate(Date dossiersendingdate) {
		_dossiersendingdate = dossiersendingdate;
	}

	public Date getDossierreceivingdate() {
		return _dossierreceivingdate;
	}

	public void setDossierreceivingdate(Date dossierreceivingdate) {
		_dossierreceivingdate = dossierreceivingdate;
	}

	public Date getDossierfirstupdatingdate() {
		return _dossierfirstupdatingdate;
	}

	public void setDossierfirstupdatingdate(Date dossierfirstupdatingdate) {
		_dossierfirstupdatingdate = dossierfirstupdatingdate;
	}

	public Date getDossierlastupdatingdate() {
		return _dossierlastupdatingdate;
	}

	public void setDossierlastupdatingdate(Date dossierlastupdatingdate) {
		_dossierlastupdatingdate = dossierlastupdatingdate;
	}

	public Date getDossierendorsementdate() {
		return _dossierendorsementdate;
	}

	public void setDossierendorsementdate(Date dossierendorsementdate) {
		_dossierendorsementdate = dossierendorsementdate;
	}

	public Date getDossiersubmittingdate() {
		return _dossiersubmittingdate;
	}

	public void setDossiersubmittingdate(Date dossiersubmittingdate) {
		_dossiersubmittingdate = dossiersubmittingdate;
	}

	public Date getDossierfirstcertificatesigndate() {
		return _dossierfirstcertificatesigndate;
	}

	public void setDossierfirstcertificatesigndate(
		Date dossierfirstcertificatesigndate) {
		_dossierfirstcertificatesigndate = dossierfirstcertificatesigndate;
	}

	public Date getDossierfirstassignmentdate() {
		return _dossierfirstassignmentdate;
	}

	public void setDossierfirstassignmentdate(Date dossierfirstassignmentdate) {
		_dossierfirstassignmentdate = dossierfirstassignmentdate;
	}

	public Date getDossierfirstreviewdate() {
		return _dossierfirstreviewdate;
	}

	public void setDossierfirstreviewdate(Date dossierfirstreviewdate) {
		_dossierfirstreviewdate = dossierfirstreviewdate;
	}

	public Date getDossiernexttreviewdate() {
		return _dossiernexttreviewdate;
	}

	public void setDossiernexttreviewdate(Date dossiernexttreviewdate) {
		_dossiernexttreviewdate = dossiernexttreviewdate;
	}

	public Date getDossierlastassignmentdate() {
		return _dossierlastassignmentdate;
	}

	public void setDossierlastassignmentdate(Date dossierlastassignmentdate) {
		_dossierlastassignmentdate = dossierlastassignmentdate;
	}

	public Date getDossierreviewadjustdate() {
		return _dossierreviewadjustdate;
	}

	public void setDossierreviewadjustdate(Date dossierreviewadjustdate) {
		_dossierreviewadjustdate = dossierreviewadjustdate;
	}

	public Date getDossierlastreviewadjustdate() {
		return _dossierlastreviewadjustdate;
	}

	public void setDossierlastreviewadjustdate(Date dossierlastreviewadjustdate) {
		_dossierlastreviewadjustdate = dossierlastreviewadjustdate;
	}

	public Date getDossierlastcertificatesigndate() {
		return _dossierlastcertificatesigndate;
	}

	public void setDossierlastcertificatesigndate(
		Date dossierlastcertificatesigndate) {
		_dossierlastcertificatesigndate = dossierlastcertificatesigndate;
	}

	public Date getDossierdeadline() {
		return _dossierdeadline;
	}

	public void setDossierdeadline(Date dossierdeadline) {
		_dossierdeadline = dossierdeadline;
	}

	public Date getDossierfinisheddate() {
		return _dossierfinisheddate;
	}

	public void setDossierfinisheddate(Date dossierfinisheddate) {
		_dossierfinisheddate = dossierfinisheddate;
	}

	public Date getDossiercancellingdate() {
		return _dossiercancellingdate;
	}

	public void setDossiercancellingdate(Date dossiercancellingdate) {
		_dossiercancellingdate = dossiercancellingdate;
	}

	public Date getDossierexpiredate() {
		return _dossierexpiredate;
	}

	public void setDossierexpiredate(Date dossierexpiredate) {
		_dossierexpiredate = dossierexpiredate;
	}

	public Date getDossierviolatingdate() {
		return _dossierviolatingdate;
	}

	public void setDossierviolatingdate(Date dossierviolatingdate) {
		_dossierviolatingdate = dossierviolatingdate;
	}

	public Date getDossierviolatingfromdate() {
		return _dossierviolatingfromdate;
	}

	public void setDossierviolatingfromdate(Date dossierviolatingfromdate) {
		_dossierviolatingfromdate = dossierviolatingfromdate;
	}

	public Date getDossierviolatingtodate() {
		return _dossierviolatingtodate;
	}

	public void setDossierviolatingtodate(Date dossierviolatingtodate) {
		_dossierviolatingtodate = dossierviolatingtodate;
	}

	public String getDossiertype() {
		return _dossiertype;
	}

	public void setDossiertype(String dossiertype) {
		_dossiertype = dossiertype;
	}

	public String getDossiertype_endorsed() {
		return _dossiertype_endorsed;
	}

	public void setDossiertype_endorsed(String dossiertype_endorsed) {
		_dossiertype_endorsed = dossiertype_endorsed;
	}

	public String getDossiertype_expired() {
		return _dossiertype_expired;
	}

	public void setDossiertype_expired(String dossiertype_expired) {
		_dossiertype_expired = dossiertype_expired;
	}

	public String getDossiertype_updated() {
		return _dossiertype_updated;
	}

	public void setDossiertype_updated(String dossiertype_updated) {
		_dossiertype_updated = dossiertype_updated;
	}

	public String getDossiertype_delayed() {
		return _dossiertype_delayed;
	}

	public void setDossiertype_delayed(String dossiertype_delayed) {
		_dossiertype_delayed = dossiertype_delayed;
	}

	public int getDossierdelayday() {
		return _dossierdelayday;
	}

	public void setDossierdelayday(int dossierdelayday) {
		_dossierdelayday = dossierdelayday;
	}

	public String getDossierdelayreason() {
		return _dossierdelayreason;
	}

	public void setDossierdelayreason(String dossierdelayreason) {
		_dossierdelayreason = dossierdelayreason;
	}

	public String getDossierstatus_processing() {
		return _dossierstatus_processing;
	}

	public void setDossierstatus_processing(String dossierstatus_processing) {
		_dossierstatus_processing = dossierstatus_processing;
	}

	public String getDossiersubstatus() {
		return _dossiersubstatus;
	}

	public void setDossiersubstatus(String dossiersubstatus) {
		_dossiersubstatus = dossiersubstatus;
	}

	public String getDossierresult() {
		return _dossierresult;
	}

	public void setDossierresult(String dossierresult) {
		_dossierresult = dossierresult;
	}

	public String getRemarkToUpdate() {
		return _remarkToUpdate;
	}

	public void setRemarkToUpdate(String remarkToUpdate) {
		_remarkToUpdate = remarkToUpdate;
	}

	public String getRemarkToResult() {
		return _remarkToResult;
	}

	public void setRemarkToResult(String remarkToResult) {
		_remarkToResult = remarkToResult;
	}

	public String getResultdescription1() {
		return _resultdescription1;
	}

	public void setResultdescription1(String resultdescription1) {
		_resultdescription1 = resultdescription1;
	}

	public String getResultdescription2() {
		return _resultdescription2;
	}

	public void setResultdescription2(String resultdescription2) {
		_resultdescription2 = resultdescription2;
	}

	public String getResultdescription3() {
		return _resultdescription3;
	}

	public void setResultdescription3(String resultdescription3) {
		_resultdescription3 = resultdescription3;
	}

	public String getApplicantNo() {
		return _applicantNo;
	}

	public void setApplicantNo(String applicantNo) {
		_applicantNo = applicantNo;
	}

	public String getApplicantname() {
		return _applicantname;
	}

	public void setApplicantname(String applicantname) {
		_applicantname = applicantname;
	}

	public String getApplicantaddress() {
		return _applicantaddress;
	}

	public void setApplicantaddress(String applicantaddress) {
		_applicantaddress = applicantaddress;
	}

	public String getProductionplantname() {
		return _productionplantname;
	}

	public void setProductionplantname(String productionplantname) {
		_productionplantname = productionplantname;
	}

	public String getProductionplantaddress() {
		return _productionplantaddress;
	}

	public void setProductionplantaddress(String productionplantaddress) {
		_productionplantaddress = productionplantaddress;
	}

	public String getDomesticFDI() {
		return _domesticFDI;
	}

	public void setDomesticFDI(String domesticFDI) {
		_domesticFDI = domesticFDI;
	}

	public String getVehicleclass() {
		return _vehicleclass;
	}

	public void setVehicleclass(String vehicleclass) {
		_vehicleclass = vehicleclass;
	}

	public String getCertifiedvehicletype() {
		return _certifiedvehicletype;
	}

	public void setCertifiedvehicletype(String certifiedvehicletype) {
		_certifiedvehicletype = certifiedvehicletype;
	}

	public String getCertifiedvehicletypedescription() {
		return _certifiedvehicletypedescription;
	}

	public void setCertifiedvehicletypedescription(
		String certifiedvehicletypedescription) {
		_certifiedvehicletypedescription = certifiedvehicletypedescription;
	}

	public String getCertifiedtrademark() {
		return _certifiedtrademark;
	}

	public void setCertifiedtrademark(String certifiedtrademark) {
		_certifiedtrademark = certifiedtrademark;
	}

	public String getCertifiedtrademarkname() {
		return _certifiedtrademarkname;
	}

	public void setCertifiedtrademarkname(String certifiedtrademarkname) {
		_certifiedtrademarkname = certifiedtrademarkname;
	}

	public String getCertifiedcommercialname() {
		return _certifiedcommercialname;
	}

	public void setCertifiedcommercialname(String certifiedcommercialname) {
		_certifiedcommercialname = certifiedcommercialname;
	}

	public String getCertifiedmodelcode() {
		return _certifiedmodelcode;
	}

	public void setCertifiedmodelcode(String certifiedmodelcode) {
		_certifiedmodelcode = certifiedmodelcode;
	}

	public String getCertifiedassemblytype() {
		return _certifiedassemblytype;
	}

	public void setCertifiedassemblytype(String certifiedassemblytype) {
		_certifiedassemblytype = certifiedassemblytype;
	}

	public String getCertifiedassemblytypedescription() {
		return _certifiedassemblytypedescription;
	}

	public void setCertifiedassemblytypedescription(
		String certifiedassemblytypedescription) {
		_certifiedassemblytypedescription = certifiedassemblytypedescription;
	}

	public int getEquipmentimportquantity() {
		return _equipmentimportquantity;
	}

	public void setEquipmentimportquantity(int equipmentimportquantity) {
		_equipmentimportquantity = equipmentimportquantity;
	}

	public String getSeatNumber() {
		return _SeatNumber;
	}

	public void setSeatNumber(String SeatNumber) {
		_SeatNumber = SeatNumber;
	}

	public String getEngineType() {
		return _EngineType;
	}

	public void setEngineType(String EngineType) {
		_EngineType = EngineType;
	}

	public String getEngineTypeDescription() {
		return _EngineTypeDescription;
	}

	public void setEngineTypeDescription(String EngineTypeDescription) {
		_EngineTypeDescription = EngineTypeDescription;
	}

	public String getCertificaterecordno_new() {
		return _certificaterecordno_new;
	}

	public void setCertificaterecordno_new(String certificaterecordno_new) {
		_certificaterecordno_new = certificaterecordno_new;
	}

	public String getCertificaterecordno_renew() {
		return _certificaterecordno_renew;
	}

	public void setCertificaterecordno_renew(String certificaterecordno_renew) {
		_certificaterecordno_renew = certificaterecordno_renew;
	}

	public String getCertificateyear() {
		return _certificateyear;
	}

	public void setCertificateyear(String certificateyear) {
		_certificateyear = certificateyear;
	}

	public int getCertificatemonth() {
		return _certificatemonth;
	}

	public void setCertificatemonth(int certificatemonth) {
		_certificatemonth = certificatemonth;
	}

	public String getCorporationId() {
		return _corporationId;
	}

	public void setCorporationId(String corporationId) {
		_corporationId = corporationId;
	}

	public String getInspectorcode() {
		return _inspectorcode;
	}

	public void setInspectorcode(String inspectorcode) {
		_inspectorcode = inspectorcode;
	}

	public String getInspectorname() {
		return _inspectorname;
	}

	public void setInspectorname(String inspectorname) {
		_inspectorname = inspectorname;
	}

	public String getLeadername() {
		return _leadername;
	}

	public void setLeadername(String leadername) {
		_leadername = leadername;
	}

	public String getMen2receiving() {
		return _men2receiving;
	}

	public void setMen2receiving(String men2receiving) {
		_men2receiving = men2receiving;
	}

	public String getMen2firstupdating() {
		return _men2firstupdating;
	}

	public void setMen2firstupdating(String men2firstupdating) {
		_men2firstupdating = men2firstupdating;
	}

	public String getMen2lastupdating() {
		return _men2lastupdating;
	}

	public void setMen2lastupdating(String men2lastupdating) {
		_men2lastupdating = men2lastupdating;
	}

	public String getMen2endorsement() {
		return _men2endorsement;
	}

	public void setMen2endorsement(String men2endorsement) {
		_men2endorsement = men2endorsement;
	}

	public String getMen2submitting() {
		return _men2submitting;
	}

	public void setMen2submitting(String men2submitting) {
		_men2submitting = men2submitting;
	}

	public String getMen2firstcertificate() {
		return _men2firstcertificate;
	}

	public void setMen2firstcertificate(String men2firstcertificate) {
		_men2firstcertificate = men2firstcertificate;
	}

	public String getMen2firstassignment() {
		return _men2firstassignment;
	}

	public void setMen2firstassignment(String men2firstassignment) {
		_men2firstassignment = men2firstassignment;
	}

	public String getMen2firstreview() {
		return _men2firstreview;
	}

	public void setMen2firstreview(String men2firstreview) {
		_men2firstreview = men2firstreview;
	}

	public String getMen2nexttreview() {
		return _men2nexttreview;
	}

	public void setMen2nexttreview(String men2nexttreview) {
		_men2nexttreview = men2nexttreview;
	}

	public String getMen2lastassignment() {
		return _men2lastassignment;
	}

	public void setMen2lastassignment(String men2lastassignment) {
		_men2lastassignment = men2lastassignment;
	}

	public String getMen2reviewadjust() {
		return _men2reviewadjust;
	}

	public void setMen2reviewadjust(String men2reviewadjust) {
		_men2reviewadjust = men2reviewadjust;
	}

	public String getMen2lastreviewadjust() {
		return _men2lastreviewadjust;
	}

	public void setMen2lastreviewadjust(String men2lastreviewadjust) {
		_men2lastreviewadjust = men2lastreviewadjust;
	}

	public String getMen2lastcertificatesign() {
		return _men2lastcertificatesign;
	}

	public void setMen2lastcertificatesign(String men2lastcertificatesign) {
		_men2lastcertificatesign = men2lastcertificatesign;
	}

	public String getMen2finished() {
		return _men2finished;
	}

	public void setMen2finished(String men2finished) {
		_men2finished = men2finished;
	}

	public String getMen2cancelled() {
		return _men2cancelled;
	}

	public void setMen2cancelled(String men2cancelled) {
		_men2cancelled = men2cancelled;
	}

	public String getMen2expired() {
		return _men2expired;
	}

	public void setMen2expired(String men2expired) {
		_men2expired = men2expired;
	}

	public String getMen2violated() {
		return _men2violated;
	}

	public void setMen2violated(String men2violated) {
		_men2violated = men2violated;
	}

	public Date getDossierPaymentDate() {
		return _dossierPaymentDate;
	}

	public void setDossierPaymentDate(Date dossierPaymentDate) {
		_dossierPaymentDate = dossierPaymentDate;
	}

	public String getMen2PaymentApproval() {
		return _men2PaymentApproval;
	}

	public void setMen2PaymentApproval(String men2PaymentApproval) {
		_men2PaymentApproval = men2PaymentApproval;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	private long _id;
	private long _dossierid;
	private String _dossierIdCTN;
	private String _dossierno;
	private Date _dossiersendingdate;
	private Date _dossierreceivingdate;
	private Date _dossierfirstupdatingdate;
	private Date _dossierlastupdatingdate;
	private Date _dossierendorsementdate;
	private Date _dossiersubmittingdate;
	private Date _dossierfirstcertificatesigndate;
	private Date _dossierfirstassignmentdate;
	private Date _dossierfirstreviewdate;
	private Date _dossiernexttreviewdate;
	private Date _dossierlastassignmentdate;
	private Date _dossierreviewadjustdate;
	private Date _dossierlastreviewadjustdate;
	private Date _dossierlastcertificatesigndate;
	private Date _dossierdeadline;
	private Date _dossierfinisheddate;
	private Date _dossiercancellingdate;
	private Date _dossierexpiredate;
	private Date _dossierviolatingdate;
	private Date _dossierviolatingfromdate;
	private Date _dossierviolatingtodate;
	private String _dossiertype;
	private String _dossiertype_endorsed;
	private String _dossiertype_expired;
	private String _dossiertype_updated;
	private String _dossiertype_delayed;
	private int _dossierdelayday;
	private String _dossierdelayreason;
	private String _dossierstatus_processing;
	private String _dossiersubstatus;
	private String _dossierresult;
	private String _remarkToUpdate;
	private String _remarkToResult;
	private String _resultdescription1;
	private String _resultdescription2;
	private String _resultdescription3;
	private String _applicantNo;
	private String _applicantname;
	private String _applicantaddress;
	private String _productionplantname;
	private String _productionplantaddress;
	private String _domesticFDI;
	private String _vehicleclass;
	private String _certifiedvehicletype;
	private String _certifiedvehicletypedescription;
	private String _certifiedtrademark;
	private String _certifiedtrademarkname;
	private String _certifiedcommercialname;
	private String _certifiedmodelcode;
	private String _certifiedassemblytype;
	private String _certifiedassemblytypedescription;
	private int _equipmentimportquantity;
	private String _SeatNumber;
	private String _EngineType;
	private String _EngineTypeDescription;
	private String _certificaterecordno_new;
	private String _certificaterecordno_renew;
	private String _certificateyear;
	private int _certificatemonth;
	private String _corporationId;
	private String _inspectorcode;
	private String _inspectorname;
	private String _leadername;
	private String _men2receiving;
	private String _men2firstupdating;
	private String _men2lastupdating;
	private String _men2endorsement;
	private String _men2submitting;
	private String _men2firstcertificate;
	private String _men2firstassignment;
	private String _men2firstreview;
	private String _men2nexttreview;
	private String _men2lastassignment;
	private String _men2reviewadjust;
	private String _men2lastreviewadjust;
	private String _men2lastcertificatesign;
	private String _men2finished;
	private String _men2cancelled;
	private String _men2expired;
	private String _men2violated;
	private Date _dossierPaymentDate;
	private String _men2PaymentApproval;
	private Date _modifyDate;
	private Date _syncDate;
}