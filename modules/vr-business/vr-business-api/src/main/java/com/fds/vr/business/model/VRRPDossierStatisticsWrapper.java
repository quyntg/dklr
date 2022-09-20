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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VRRPDossierStatistics}.
 * </p>
 *
 * @author LamTV
 * @see VRRPDossierStatistics
 * @generated
 */
@ProviderType
public class VRRPDossierStatisticsWrapper implements VRRPDossierStatistics,
	ModelWrapper<VRRPDossierStatistics> {
	public VRRPDossierStatisticsWrapper(
		VRRPDossierStatistics vrrpDossierStatistics) {
		_vrrpDossierStatistics = vrrpDossierStatistics;
	}

	@Override
	public Class<?> getModelClass() {
		return VRRPDossierStatistics.class;
	}

	@Override
	public String getModelClassName() {
		return VRRPDossierStatistics.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("dossierid", getDossierid());
		attributes.put("dossierIdCTN", getDossierIdCTN());
		attributes.put("dossierno", getDossierno());
		attributes.put("dossiersendingdate", getDossiersendingdate());
		attributes.put("dossierreceivingdate", getDossierreceivingdate());
		attributes.put("dossierfirstupdatingdate", getDossierfirstupdatingdate());
		attributes.put("dossierlastupdatingdate", getDossierlastupdatingdate());
		attributes.put("dossierendorsementdate", getDossierendorsementdate());
		attributes.put("dossiersubmittingdate", getDossiersubmittingdate());
		attributes.put("dossierfirstcertificatesigndate",
			getDossierfirstcertificatesigndate());
		attributes.put("dossierfirstassignmentdate",
			getDossierfirstassignmentdate());
		attributes.put("dossierfirstreviewdate", getDossierfirstreviewdate());
		attributes.put("dossiernexttreviewdate", getDossiernexttreviewdate());
		attributes.put("dossierlastassignmentdate",
			getDossierlastassignmentdate());
		attributes.put("dossierreviewadjustdate", getDossierreviewadjustdate());
		attributes.put("dossierlastreviewadjustdate",
			getDossierlastreviewadjustdate());
		attributes.put("dossierlastcertificatesigndate",
			getDossierlastcertificatesigndate());
		attributes.put("dossierdeadline", getDossierdeadline());
		attributes.put("dossierfinisheddate", getDossierfinisheddate());
		attributes.put("dossiercancellingdate", getDossiercancellingdate());
		attributes.put("dossierexpiredate", getDossierexpiredate());
		attributes.put("dossierviolatingdate", getDossierviolatingdate());
		attributes.put("dossierviolatingfromdate", getDossierviolatingfromdate());
		attributes.put("dossierviolatingtodate", getDossierviolatingtodate());
		attributes.put("dossiertype", getDossiertype());
		attributes.put("dossiertype_endorsed", getDossiertype_endorsed());
		attributes.put("dossiertype_expired", getDossiertype_expired());
		attributes.put("dossiertype_updated", getDossiertype_updated());
		attributes.put("dossiertype_delayed", getDossiertype_delayed());
		attributes.put("dossierdelayday", getDossierdelayday());
		attributes.put("dossierdelayreason", getDossierdelayreason());
		attributes.put("dossierstatus_processing", getDossierstatus_processing());
		attributes.put("dossiersubstatus", getDossiersubstatus());
		attributes.put("dossierresult", getDossierresult());
		attributes.put("remarkToUpdate", getRemarkToUpdate());
		attributes.put("remarkToResult", getRemarkToResult());
		attributes.put("resultdescription1", getResultdescription1());
		attributes.put("resultdescription2", getResultdescription2());
		attributes.put("resultdescription3", getResultdescription3());
		attributes.put("applicantNo", getApplicantNo());
		attributes.put("applicantname", getApplicantname());
		attributes.put("applicantaddress", getApplicantaddress());
		attributes.put("productionplantname", getProductionplantname());
		attributes.put("productionplantaddress", getProductionplantaddress());
		attributes.put("domesticFDI", getDomesticFDI());
		attributes.put("vehicleclass", getVehicleclass());
		attributes.put("certifiedvehicletype", getCertifiedvehicletype());
		attributes.put("certifiedvehicletypedescription",
			getCertifiedvehicletypedescription());
		attributes.put("certifiedtrademark", getCertifiedtrademark());
		attributes.put("certifiedtrademarkname", getCertifiedtrademarkname());
		attributes.put("certifiedcommercialname", getCertifiedcommercialname());
		attributes.put("certifiedmodelcode", getCertifiedmodelcode());
		attributes.put("certifiedassemblytype", getCertifiedassemblytype());
		attributes.put("certifiedassemblytypedescription",
			getCertifiedassemblytypedescription());
		attributes.put("equipmentimportquantity", getEquipmentimportquantity());
		attributes.put("SeatNumber", getSeatNumber());
		attributes.put("EngineType", getEngineType());
		attributes.put("EngineTypeDescription", getEngineTypeDescription());
		attributes.put("certificaterecordno_new", getCertificaterecordno_new());
		attributes.put("certificaterecordno_renew",
			getCertificaterecordno_renew());
		attributes.put("certificateyear", getCertificateyear());
		attributes.put("certificatemonth", getCertificatemonth());
		attributes.put("corporationId", getCorporationId());
		attributes.put("inspectorcode", getInspectorcode());
		attributes.put("inspectorname", getInspectorname());
		attributes.put("leadername", getLeadername());
		attributes.put("men2receiving", getMen2receiving());
		attributes.put("men2firstupdating", getMen2firstupdating());
		attributes.put("men2lastupdating", getMen2lastupdating());
		attributes.put("men2endorsement", getMen2endorsement());
		attributes.put("men2submitting", getMen2submitting());
		attributes.put("men2firstcertificate", getMen2firstcertificate());
		attributes.put("men2firstassignment", getMen2firstassignment());
		attributes.put("men2firstreview", getMen2firstreview());
		attributes.put("men2nexttreview", getMen2nexttreview());
		attributes.put("men2lastassignment", getMen2lastassignment());
		attributes.put("men2reviewadjust", getMen2reviewadjust());
		attributes.put("men2lastreviewadjust", getMen2lastreviewadjust());
		attributes.put("men2lastcertificatesign", getMen2lastcertificatesign());
		attributes.put("men2finished", getMen2finished());
		attributes.put("men2cancelled", getMen2cancelled());
		attributes.put("men2expired", getMen2expired());
		attributes.put("men2violated", getMen2violated());
		attributes.put("dossierPaymentDate", getDossierPaymentDate());
		attributes.put("men2PaymentApproval", getMen2PaymentApproval());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long dossierid = (Long)attributes.get("dossierid");

		if (dossierid != null) {
			setDossierid(dossierid);
		}

		String dossierIdCTN = (String)attributes.get("dossierIdCTN");

		if (dossierIdCTN != null) {
			setDossierIdCTN(dossierIdCTN);
		}

		String dossierno = (String)attributes.get("dossierno");

		if (dossierno != null) {
			setDossierno(dossierno);
		}

		Date dossiersendingdate = (Date)attributes.get("dossiersendingdate");

		if (dossiersendingdate != null) {
			setDossiersendingdate(dossiersendingdate);
		}

		Date dossierreceivingdate = (Date)attributes.get("dossierreceivingdate");

		if (dossierreceivingdate != null) {
			setDossierreceivingdate(dossierreceivingdate);
		}

		Date dossierfirstupdatingdate = (Date)attributes.get(
				"dossierfirstupdatingdate");

		if (dossierfirstupdatingdate != null) {
			setDossierfirstupdatingdate(dossierfirstupdatingdate);
		}

		Date dossierlastupdatingdate = (Date)attributes.get(
				"dossierlastupdatingdate");

		if (dossierlastupdatingdate != null) {
			setDossierlastupdatingdate(dossierlastupdatingdate);
		}

		Date dossierendorsementdate = (Date)attributes.get(
				"dossierendorsementdate");

		if (dossierendorsementdate != null) {
			setDossierendorsementdate(dossierendorsementdate);
		}

		Date dossiersubmittingdate = (Date)attributes.get(
				"dossiersubmittingdate");

		if (dossiersubmittingdate != null) {
			setDossiersubmittingdate(dossiersubmittingdate);
		}

		Date dossierfirstcertificatesigndate = (Date)attributes.get(
				"dossierfirstcertificatesigndate");

		if (dossierfirstcertificatesigndate != null) {
			setDossierfirstcertificatesigndate(dossierfirstcertificatesigndate);
		}

		Date dossierfirstassignmentdate = (Date)attributes.get(
				"dossierfirstassignmentdate");

		if (dossierfirstassignmentdate != null) {
			setDossierfirstassignmentdate(dossierfirstassignmentdate);
		}

		Date dossierfirstreviewdate = (Date)attributes.get(
				"dossierfirstreviewdate");

		if (dossierfirstreviewdate != null) {
			setDossierfirstreviewdate(dossierfirstreviewdate);
		}

		Date dossiernexttreviewdate = (Date)attributes.get(
				"dossiernexttreviewdate");

		if (dossiernexttreviewdate != null) {
			setDossiernexttreviewdate(dossiernexttreviewdate);
		}

		Date dossierlastassignmentdate = (Date)attributes.get(
				"dossierlastassignmentdate");

		if (dossierlastassignmentdate != null) {
			setDossierlastassignmentdate(dossierlastassignmentdate);
		}

		Date dossierreviewadjustdate = (Date)attributes.get(
				"dossierreviewadjustdate");

		if (dossierreviewadjustdate != null) {
			setDossierreviewadjustdate(dossierreviewadjustdate);
		}

		Date dossierlastreviewadjustdate = (Date)attributes.get(
				"dossierlastreviewadjustdate");

		if (dossierlastreviewadjustdate != null) {
			setDossierlastreviewadjustdate(dossierlastreviewadjustdate);
		}

		Date dossierlastcertificatesigndate = (Date)attributes.get(
				"dossierlastcertificatesigndate");

		if (dossierlastcertificatesigndate != null) {
			setDossierlastcertificatesigndate(dossierlastcertificatesigndate);
		}

		Date dossierdeadline = (Date)attributes.get("dossierdeadline");

		if (dossierdeadline != null) {
			setDossierdeadline(dossierdeadline);
		}

		Date dossierfinisheddate = (Date)attributes.get("dossierfinisheddate");

		if (dossierfinisheddate != null) {
			setDossierfinisheddate(dossierfinisheddate);
		}

		Date dossiercancellingdate = (Date)attributes.get(
				"dossiercancellingdate");

		if (dossiercancellingdate != null) {
			setDossiercancellingdate(dossiercancellingdate);
		}

		Date dossierexpiredate = (Date)attributes.get("dossierexpiredate");

		if (dossierexpiredate != null) {
			setDossierexpiredate(dossierexpiredate);
		}

		Date dossierviolatingdate = (Date)attributes.get("dossierviolatingdate");

		if (dossierviolatingdate != null) {
			setDossierviolatingdate(dossierviolatingdate);
		}

		Date dossierviolatingfromdate = (Date)attributes.get(
				"dossierviolatingfromdate");

		if (dossierviolatingfromdate != null) {
			setDossierviolatingfromdate(dossierviolatingfromdate);
		}

		Date dossierviolatingtodate = (Date)attributes.get(
				"dossierviolatingtodate");

		if (dossierviolatingtodate != null) {
			setDossierviolatingtodate(dossierviolatingtodate);
		}

		String dossiertype = (String)attributes.get("dossiertype");

		if (dossiertype != null) {
			setDossiertype(dossiertype);
		}

		String dossiertype_endorsed = (String)attributes.get(
				"dossiertype_endorsed");

		if (dossiertype_endorsed != null) {
			setDossiertype_endorsed(dossiertype_endorsed);
		}

		String dossiertype_expired = (String)attributes.get(
				"dossiertype_expired");

		if (dossiertype_expired != null) {
			setDossiertype_expired(dossiertype_expired);
		}

		String dossiertype_updated = (String)attributes.get(
				"dossiertype_updated");

		if (dossiertype_updated != null) {
			setDossiertype_updated(dossiertype_updated);
		}

		String dossiertype_delayed = (String)attributes.get(
				"dossiertype_delayed");

		if (dossiertype_delayed != null) {
			setDossiertype_delayed(dossiertype_delayed);
		}

		Integer dossierdelayday = (Integer)attributes.get("dossierdelayday");

		if (dossierdelayday != null) {
			setDossierdelayday(dossierdelayday);
		}

		String dossierdelayreason = (String)attributes.get("dossierdelayreason");

		if (dossierdelayreason != null) {
			setDossierdelayreason(dossierdelayreason);
		}

		String dossierstatus_processing = (String)attributes.get(
				"dossierstatus_processing");

		if (dossierstatus_processing != null) {
			setDossierstatus_processing(dossierstatus_processing);
		}

		String dossiersubstatus = (String)attributes.get("dossiersubstatus");

		if (dossiersubstatus != null) {
			setDossiersubstatus(dossiersubstatus);
		}

		String dossierresult = (String)attributes.get("dossierresult");

		if (dossierresult != null) {
			setDossierresult(dossierresult);
		}

		String remarkToUpdate = (String)attributes.get("remarkToUpdate");

		if (remarkToUpdate != null) {
			setRemarkToUpdate(remarkToUpdate);
		}

		String remarkToResult = (String)attributes.get("remarkToResult");

		if (remarkToResult != null) {
			setRemarkToResult(remarkToResult);
		}

		String resultdescription1 = (String)attributes.get("resultdescription1");

		if (resultdescription1 != null) {
			setResultdescription1(resultdescription1);
		}

		String resultdescription2 = (String)attributes.get("resultdescription2");

		if (resultdescription2 != null) {
			setResultdescription2(resultdescription2);
		}

		String resultdescription3 = (String)attributes.get("resultdescription3");

		if (resultdescription3 != null) {
			setResultdescription3(resultdescription3);
		}

		String applicantNo = (String)attributes.get("applicantNo");

		if (applicantNo != null) {
			setApplicantNo(applicantNo);
		}

		String applicantname = (String)attributes.get("applicantname");

		if (applicantname != null) {
			setApplicantname(applicantname);
		}

		String applicantaddress = (String)attributes.get("applicantaddress");

		if (applicantaddress != null) {
			setApplicantaddress(applicantaddress);
		}

		String productionplantname = (String)attributes.get(
				"productionplantname");

		if (productionplantname != null) {
			setProductionplantname(productionplantname);
		}

		String productionplantaddress = (String)attributes.get(
				"productionplantaddress");

		if (productionplantaddress != null) {
			setProductionplantaddress(productionplantaddress);
		}

		String domesticFDI = (String)attributes.get("domesticFDI");

		if (domesticFDI != null) {
			setDomesticFDI(domesticFDI);
		}

		String vehicleclass = (String)attributes.get("vehicleclass");

		if (vehicleclass != null) {
			setVehicleclass(vehicleclass);
		}

		String certifiedvehicletype = (String)attributes.get(
				"certifiedvehicletype");

		if (certifiedvehicletype != null) {
			setCertifiedvehicletype(certifiedvehicletype);
		}

		String certifiedvehicletypedescription = (String)attributes.get(
				"certifiedvehicletypedescription");

		if (certifiedvehicletypedescription != null) {
			setCertifiedvehicletypedescription(certifiedvehicletypedescription);
		}

		String certifiedtrademark = (String)attributes.get("certifiedtrademark");

		if (certifiedtrademark != null) {
			setCertifiedtrademark(certifiedtrademark);
		}

		String certifiedtrademarkname = (String)attributes.get(
				"certifiedtrademarkname");

		if (certifiedtrademarkname != null) {
			setCertifiedtrademarkname(certifiedtrademarkname);
		}

		String certifiedcommercialname = (String)attributes.get(
				"certifiedcommercialname");

		if (certifiedcommercialname != null) {
			setCertifiedcommercialname(certifiedcommercialname);
		}

		String certifiedmodelcode = (String)attributes.get("certifiedmodelcode");

		if (certifiedmodelcode != null) {
			setCertifiedmodelcode(certifiedmodelcode);
		}

		String certifiedassemblytype = (String)attributes.get(
				"certifiedassemblytype");

		if (certifiedassemblytype != null) {
			setCertifiedassemblytype(certifiedassemblytype);
		}

		String certifiedassemblytypedescription = (String)attributes.get(
				"certifiedassemblytypedescription");

		if (certifiedassemblytypedescription != null) {
			setCertifiedassemblytypedescription(certifiedassemblytypedescription);
		}

		Integer equipmentimportquantity = (Integer)attributes.get(
				"equipmentimportquantity");

		if (equipmentimportquantity != null) {
			setEquipmentimportquantity(equipmentimportquantity);
		}

		String SeatNumber = (String)attributes.get("SeatNumber");

		if (SeatNumber != null) {
			setSeatNumber(SeatNumber);
		}

		String EngineType = (String)attributes.get("EngineType");

		if (EngineType != null) {
			setEngineType(EngineType);
		}

		String EngineTypeDescription = (String)attributes.get(
				"EngineTypeDescription");

		if (EngineTypeDescription != null) {
			setEngineTypeDescription(EngineTypeDescription);
		}

		String certificaterecordno_new = (String)attributes.get(
				"certificaterecordno_new");

		if (certificaterecordno_new != null) {
			setCertificaterecordno_new(certificaterecordno_new);
		}

		String certificaterecordno_renew = (String)attributes.get(
				"certificaterecordno_renew");

		if (certificaterecordno_renew != null) {
			setCertificaterecordno_renew(certificaterecordno_renew);
		}

		String certificateyear = (String)attributes.get("certificateyear");

		if (certificateyear != null) {
			setCertificateyear(certificateyear);
		}

		Integer certificatemonth = (Integer)attributes.get("certificatemonth");

		if (certificatemonth != null) {
			setCertificatemonth(certificatemonth);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		String inspectorcode = (String)attributes.get("inspectorcode");

		if (inspectorcode != null) {
			setInspectorcode(inspectorcode);
		}

		String inspectorname = (String)attributes.get("inspectorname");

		if (inspectorname != null) {
			setInspectorname(inspectorname);
		}

		String leadername = (String)attributes.get("leadername");

		if (leadername != null) {
			setLeadername(leadername);
		}

		String men2receiving = (String)attributes.get("men2receiving");

		if (men2receiving != null) {
			setMen2receiving(men2receiving);
		}

		String men2firstupdating = (String)attributes.get("men2firstupdating");

		if (men2firstupdating != null) {
			setMen2firstupdating(men2firstupdating);
		}

		String men2lastupdating = (String)attributes.get("men2lastupdating");

		if (men2lastupdating != null) {
			setMen2lastupdating(men2lastupdating);
		}

		String men2endorsement = (String)attributes.get("men2endorsement");

		if (men2endorsement != null) {
			setMen2endorsement(men2endorsement);
		}

		String men2submitting = (String)attributes.get("men2submitting");

		if (men2submitting != null) {
			setMen2submitting(men2submitting);
		}

		String men2firstcertificate = (String)attributes.get(
				"men2firstcertificate");

		if (men2firstcertificate != null) {
			setMen2firstcertificate(men2firstcertificate);
		}

		String men2firstassignment = (String)attributes.get(
				"men2firstassignment");

		if (men2firstassignment != null) {
			setMen2firstassignment(men2firstassignment);
		}

		String men2firstreview = (String)attributes.get("men2firstreview");

		if (men2firstreview != null) {
			setMen2firstreview(men2firstreview);
		}

		String men2nexttreview = (String)attributes.get("men2nexttreview");

		if (men2nexttreview != null) {
			setMen2nexttreview(men2nexttreview);
		}

		String men2lastassignment = (String)attributes.get("men2lastassignment");

		if (men2lastassignment != null) {
			setMen2lastassignment(men2lastassignment);
		}

		String men2reviewadjust = (String)attributes.get("men2reviewadjust");

		if (men2reviewadjust != null) {
			setMen2reviewadjust(men2reviewadjust);
		}

		String men2lastreviewadjust = (String)attributes.get(
				"men2lastreviewadjust");

		if (men2lastreviewadjust != null) {
			setMen2lastreviewadjust(men2lastreviewadjust);
		}

		String men2lastcertificatesign = (String)attributes.get(
				"men2lastcertificatesign");

		if (men2lastcertificatesign != null) {
			setMen2lastcertificatesign(men2lastcertificatesign);
		}

		String men2finished = (String)attributes.get("men2finished");

		if (men2finished != null) {
			setMen2finished(men2finished);
		}

		String men2cancelled = (String)attributes.get("men2cancelled");

		if (men2cancelled != null) {
			setMen2cancelled(men2cancelled);
		}

		String men2expired = (String)attributes.get("men2expired");

		if (men2expired != null) {
			setMen2expired(men2expired);
		}

		String men2violated = (String)attributes.get("men2violated");

		if (men2violated != null) {
			setMen2violated(men2violated);
		}

		Date dossierPaymentDate = (Date)attributes.get("dossierPaymentDate");

		if (dossierPaymentDate != null) {
			setDossierPaymentDate(dossierPaymentDate);
		}

		String men2PaymentApproval = (String)attributes.get(
				"men2PaymentApproval");

		if (men2PaymentApproval != null) {
			setMen2PaymentApproval(men2PaymentApproval);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public VRRPDossierStatistics toEscapedModel() {
		return new VRRPDossierStatisticsWrapper(_vrrpDossierStatistics.toEscapedModel());
	}

	@Override
	public VRRPDossierStatistics toUnescapedModel() {
		return new VRRPDossierStatisticsWrapper(_vrrpDossierStatistics.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrrpDossierStatistics.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrrpDossierStatistics.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrrpDossierStatistics.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrrpDossierStatistics.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRRPDossierStatistics> toCacheModel() {
		return _vrrpDossierStatistics.toCacheModel();
	}

	@Override
	public int compareTo(VRRPDossierStatistics vrrpDossierStatistics) {
		return _vrrpDossierStatistics.compareTo(vrrpDossierStatistics);
	}

	/**
	* Returns the certificatemonth of this vrrp dossier statistics.
	*
	* @return the certificatemonth of this vrrp dossier statistics
	*/
	@Override
	public int getCertificatemonth() {
		return _vrrpDossierStatistics.getCertificatemonth();
	}

	/**
	* Returns the dossierdelayday of this vrrp dossier statistics.
	*
	* @return the dossierdelayday of this vrrp dossier statistics
	*/
	@Override
	public int getDossierdelayday() {
		return _vrrpDossierStatistics.getDossierdelayday();
	}

	/**
	* Returns the equipmentimportquantity of this vrrp dossier statistics.
	*
	* @return the equipmentimportquantity of this vrrp dossier statistics
	*/
	@Override
	public int getEquipmentimportquantity() {
		return _vrrpDossierStatistics.getEquipmentimportquantity();
	}

	@Override
	public int hashCode() {
		return _vrrpDossierStatistics.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrrpDossierStatistics.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRRPDossierStatisticsWrapper((VRRPDossierStatistics)_vrrpDossierStatistics.clone());
	}

	/**
	* Returns the applicant no of this vrrp dossier statistics.
	*
	* @return the applicant no of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getApplicantNo() {
		return _vrrpDossierStatistics.getApplicantNo();
	}

	/**
	* Returns the applicantaddress of this vrrp dossier statistics.
	*
	* @return the applicantaddress of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getApplicantaddress() {
		return _vrrpDossierStatistics.getApplicantaddress();
	}

	/**
	* Returns the applicantname of this vrrp dossier statistics.
	*
	* @return the applicantname of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getApplicantname() {
		return _vrrpDossierStatistics.getApplicantname();
	}

	/**
	* Returns the certificaterecordno_new of this vrrp dossier statistics.
	*
	* @return the certificaterecordno_new of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getCertificaterecordno_new() {
		return _vrrpDossierStatistics.getCertificaterecordno_new();
	}

	/**
	* Returns the certificaterecordno_renew of this vrrp dossier statistics.
	*
	* @return the certificaterecordno_renew of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getCertificaterecordno_renew() {
		return _vrrpDossierStatistics.getCertificaterecordno_renew();
	}

	/**
	* Returns the certificateyear of this vrrp dossier statistics.
	*
	* @return the certificateyear of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getCertificateyear() {
		return _vrrpDossierStatistics.getCertificateyear();
	}

	/**
	* Returns the certifiedassemblytype of this vrrp dossier statistics.
	*
	* @return the certifiedassemblytype of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getCertifiedassemblytype() {
		return _vrrpDossierStatistics.getCertifiedassemblytype();
	}

	/**
	* Returns the certifiedassemblytypedescription of this vrrp dossier statistics.
	*
	* @return the certifiedassemblytypedescription of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getCertifiedassemblytypedescription() {
		return _vrrpDossierStatistics.getCertifiedassemblytypedescription();
	}

	/**
	* Returns the certifiedcommercialname of this vrrp dossier statistics.
	*
	* @return the certifiedcommercialname of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getCertifiedcommercialname() {
		return _vrrpDossierStatistics.getCertifiedcommercialname();
	}

	/**
	* Returns the certifiedmodelcode of this vrrp dossier statistics.
	*
	* @return the certifiedmodelcode of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getCertifiedmodelcode() {
		return _vrrpDossierStatistics.getCertifiedmodelcode();
	}

	/**
	* Returns the certifiedtrademark of this vrrp dossier statistics.
	*
	* @return the certifiedtrademark of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getCertifiedtrademark() {
		return _vrrpDossierStatistics.getCertifiedtrademark();
	}

	/**
	* Returns the certifiedtrademarkname of this vrrp dossier statistics.
	*
	* @return the certifiedtrademarkname of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getCertifiedtrademarkname() {
		return _vrrpDossierStatistics.getCertifiedtrademarkname();
	}

	/**
	* Returns the certifiedvehicletype of this vrrp dossier statistics.
	*
	* @return the certifiedvehicletype of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getCertifiedvehicletype() {
		return _vrrpDossierStatistics.getCertifiedvehicletype();
	}

	/**
	* Returns the certifiedvehicletypedescription of this vrrp dossier statistics.
	*
	* @return the certifiedvehicletypedescription of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getCertifiedvehicletypedescription() {
		return _vrrpDossierStatistics.getCertifiedvehicletypedescription();
	}

	/**
	* Returns the corporation ID of this vrrp dossier statistics.
	*
	* @return the corporation ID of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getCorporationId() {
		return _vrrpDossierStatistics.getCorporationId();
	}

	/**
	* Returns the domestic fdi of this vrrp dossier statistics.
	*
	* @return the domestic fdi of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getDomesticFDI() {
		return _vrrpDossierStatistics.getDomesticFDI();
	}

	/**
	* Returns the dossier ID ctn of this vrrp dossier statistics.
	*
	* @return the dossier ID ctn of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrrpDossierStatistics.getDossierIdCTN();
	}

	/**
	* Returns the dossierdelayreason of this vrrp dossier statistics.
	*
	* @return the dossierdelayreason of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getDossierdelayreason() {
		return _vrrpDossierStatistics.getDossierdelayreason();
	}

	/**
	* Returns the dossierno of this vrrp dossier statistics.
	*
	* @return the dossierno of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getDossierno() {
		return _vrrpDossierStatistics.getDossierno();
	}

	/**
	* Returns the dossierresult of this vrrp dossier statistics.
	*
	* @return the dossierresult of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getDossierresult() {
		return _vrrpDossierStatistics.getDossierresult();
	}

	/**
	* Returns the dossierstatus_processing of this vrrp dossier statistics.
	*
	* @return the dossierstatus_processing of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getDossierstatus_processing() {
		return _vrrpDossierStatistics.getDossierstatus_processing();
	}

	/**
	* Returns the dossiersubstatus of this vrrp dossier statistics.
	*
	* @return the dossiersubstatus of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getDossiersubstatus() {
		return _vrrpDossierStatistics.getDossiersubstatus();
	}

	/**
	* Returns the dossiertype of this vrrp dossier statistics.
	*
	* @return the dossiertype of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getDossiertype() {
		return _vrrpDossierStatistics.getDossiertype();
	}

	/**
	* Returns the dossiertype_delayed of this vrrp dossier statistics.
	*
	* @return the dossiertype_delayed of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getDossiertype_delayed() {
		return _vrrpDossierStatistics.getDossiertype_delayed();
	}

	/**
	* Returns the dossiertype_endorsed of this vrrp dossier statistics.
	*
	* @return the dossiertype_endorsed of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getDossiertype_endorsed() {
		return _vrrpDossierStatistics.getDossiertype_endorsed();
	}

	/**
	* Returns the dossiertype_expired of this vrrp dossier statistics.
	*
	* @return the dossiertype_expired of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getDossiertype_expired() {
		return _vrrpDossierStatistics.getDossiertype_expired();
	}

	/**
	* Returns the dossiertype_updated of this vrrp dossier statistics.
	*
	* @return the dossiertype_updated of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getDossiertype_updated() {
		return _vrrpDossierStatistics.getDossiertype_updated();
	}

	/**
	* Returns the engine type of this vrrp dossier statistics.
	*
	* @return the engine type of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getEngineType() {
		return _vrrpDossierStatistics.getEngineType();
	}

	/**
	* Returns the engine type description of this vrrp dossier statistics.
	*
	* @return the engine type description of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getEngineTypeDescription() {
		return _vrrpDossierStatistics.getEngineTypeDescription();
	}

	/**
	* Returns the inspectorcode of this vrrp dossier statistics.
	*
	* @return the inspectorcode of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getInspectorcode() {
		return _vrrpDossierStatistics.getInspectorcode();
	}

	/**
	* Returns the inspectorname of this vrrp dossier statistics.
	*
	* @return the inspectorname of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getInspectorname() {
		return _vrrpDossierStatistics.getInspectorname();
	}

	/**
	* Returns the leadername of this vrrp dossier statistics.
	*
	* @return the leadername of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getLeadername() {
		return _vrrpDossierStatistics.getLeadername();
	}

	/**
	* Returns the men2 payment approval of this vrrp dossier statistics.
	*
	* @return the men2 payment approval of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getMen2PaymentApproval() {
		return _vrrpDossierStatistics.getMen2PaymentApproval();
	}

	/**
	* Returns the men2cancelled of this vrrp dossier statistics.
	*
	* @return the men2cancelled of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getMen2cancelled() {
		return _vrrpDossierStatistics.getMen2cancelled();
	}

	/**
	* Returns the men2endorsement of this vrrp dossier statistics.
	*
	* @return the men2endorsement of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getMen2endorsement() {
		return _vrrpDossierStatistics.getMen2endorsement();
	}

	/**
	* Returns the men2expired of this vrrp dossier statistics.
	*
	* @return the men2expired of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getMen2expired() {
		return _vrrpDossierStatistics.getMen2expired();
	}

	/**
	* Returns the men2finished of this vrrp dossier statistics.
	*
	* @return the men2finished of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getMen2finished() {
		return _vrrpDossierStatistics.getMen2finished();
	}

	/**
	* Returns the men2firstassignment of this vrrp dossier statistics.
	*
	* @return the men2firstassignment of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getMen2firstassignment() {
		return _vrrpDossierStatistics.getMen2firstassignment();
	}

	/**
	* Returns the men2firstcertificate of this vrrp dossier statistics.
	*
	* @return the men2firstcertificate of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getMen2firstcertificate() {
		return _vrrpDossierStatistics.getMen2firstcertificate();
	}

	/**
	* Returns the men2firstreview of this vrrp dossier statistics.
	*
	* @return the men2firstreview of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getMen2firstreview() {
		return _vrrpDossierStatistics.getMen2firstreview();
	}

	/**
	* Returns the men2firstupdating of this vrrp dossier statistics.
	*
	* @return the men2firstupdating of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getMen2firstupdating() {
		return _vrrpDossierStatistics.getMen2firstupdating();
	}

	/**
	* Returns the men2lastassignment of this vrrp dossier statistics.
	*
	* @return the men2lastassignment of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getMen2lastassignment() {
		return _vrrpDossierStatistics.getMen2lastassignment();
	}

	/**
	* Returns the men2lastcertificatesign of this vrrp dossier statistics.
	*
	* @return the men2lastcertificatesign of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getMen2lastcertificatesign() {
		return _vrrpDossierStatistics.getMen2lastcertificatesign();
	}

	/**
	* Returns the men2lastreviewadjust of this vrrp dossier statistics.
	*
	* @return the men2lastreviewadjust of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getMen2lastreviewadjust() {
		return _vrrpDossierStatistics.getMen2lastreviewadjust();
	}

	/**
	* Returns the men2lastupdating of this vrrp dossier statistics.
	*
	* @return the men2lastupdating of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getMen2lastupdating() {
		return _vrrpDossierStatistics.getMen2lastupdating();
	}

	/**
	* Returns the men2nexttreview of this vrrp dossier statistics.
	*
	* @return the men2nexttreview of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getMen2nexttreview() {
		return _vrrpDossierStatistics.getMen2nexttreview();
	}

	/**
	* Returns the men2receiving of this vrrp dossier statistics.
	*
	* @return the men2receiving of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getMen2receiving() {
		return _vrrpDossierStatistics.getMen2receiving();
	}

	/**
	* Returns the men2reviewadjust of this vrrp dossier statistics.
	*
	* @return the men2reviewadjust of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getMen2reviewadjust() {
		return _vrrpDossierStatistics.getMen2reviewadjust();
	}

	/**
	* Returns the men2submitting of this vrrp dossier statistics.
	*
	* @return the men2submitting of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getMen2submitting() {
		return _vrrpDossierStatistics.getMen2submitting();
	}

	/**
	* Returns the men2violated of this vrrp dossier statistics.
	*
	* @return the men2violated of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getMen2violated() {
		return _vrrpDossierStatistics.getMen2violated();
	}

	/**
	* Returns the productionplantaddress of this vrrp dossier statistics.
	*
	* @return the productionplantaddress of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getProductionplantaddress() {
		return _vrrpDossierStatistics.getProductionplantaddress();
	}

	/**
	* Returns the productionplantname of this vrrp dossier statistics.
	*
	* @return the productionplantname of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getProductionplantname() {
		return _vrrpDossierStatistics.getProductionplantname();
	}

	/**
	* Returns the remark to result of this vrrp dossier statistics.
	*
	* @return the remark to result of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getRemarkToResult() {
		return _vrrpDossierStatistics.getRemarkToResult();
	}

	/**
	* Returns the remark to update of this vrrp dossier statistics.
	*
	* @return the remark to update of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getRemarkToUpdate() {
		return _vrrpDossierStatistics.getRemarkToUpdate();
	}

	/**
	* Returns the resultdescription1 of this vrrp dossier statistics.
	*
	* @return the resultdescription1 of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getResultdescription1() {
		return _vrrpDossierStatistics.getResultdescription1();
	}

	/**
	* Returns the resultdescription2 of this vrrp dossier statistics.
	*
	* @return the resultdescription2 of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getResultdescription2() {
		return _vrrpDossierStatistics.getResultdescription2();
	}

	/**
	* Returns the resultdescription3 of this vrrp dossier statistics.
	*
	* @return the resultdescription3 of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getResultdescription3() {
		return _vrrpDossierStatistics.getResultdescription3();
	}

	/**
	* Returns the seat number of this vrrp dossier statistics.
	*
	* @return the seat number of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getSeatNumber() {
		return _vrrpDossierStatistics.getSeatNumber();
	}

	/**
	* Returns the vehicleclass of this vrrp dossier statistics.
	*
	* @return the vehicleclass of this vrrp dossier statistics
	*/
	@Override
	public java.lang.String getVehicleclass() {
		return _vrrpDossierStatistics.getVehicleclass();
	}

	@Override
	public java.lang.String toString() {
		return _vrrpDossierStatistics.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrrpDossierStatistics.toXmlString();
	}

	/**
	* Returns the dossier payment date of this vrrp dossier statistics.
	*
	* @return the dossier payment date of this vrrp dossier statistics
	*/
	@Override
	public Date getDossierPaymentDate() {
		return _vrrpDossierStatistics.getDossierPaymentDate();
	}

	/**
	* Returns the dossiercancellingdate of this vrrp dossier statistics.
	*
	* @return the dossiercancellingdate of this vrrp dossier statistics
	*/
	@Override
	public Date getDossiercancellingdate() {
		return _vrrpDossierStatistics.getDossiercancellingdate();
	}

	/**
	* Returns the dossierdeadline of this vrrp dossier statistics.
	*
	* @return the dossierdeadline of this vrrp dossier statistics
	*/
	@Override
	public Date getDossierdeadline() {
		return _vrrpDossierStatistics.getDossierdeadline();
	}

	/**
	* Returns the dossierendorsementdate of this vrrp dossier statistics.
	*
	* @return the dossierendorsementdate of this vrrp dossier statistics
	*/
	@Override
	public Date getDossierendorsementdate() {
		return _vrrpDossierStatistics.getDossierendorsementdate();
	}

	/**
	* Returns the dossierexpiredate of this vrrp dossier statistics.
	*
	* @return the dossierexpiredate of this vrrp dossier statistics
	*/
	@Override
	public Date getDossierexpiredate() {
		return _vrrpDossierStatistics.getDossierexpiredate();
	}

	/**
	* Returns the dossierfinisheddate of this vrrp dossier statistics.
	*
	* @return the dossierfinisheddate of this vrrp dossier statistics
	*/
	@Override
	public Date getDossierfinisheddate() {
		return _vrrpDossierStatistics.getDossierfinisheddate();
	}

	/**
	* Returns the dossierfirstassignmentdate of this vrrp dossier statistics.
	*
	* @return the dossierfirstassignmentdate of this vrrp dossier statistics
	*/
	@Override
	public Date getDossierfirstassignmentdate() {
		return _vrrpDossierStatistics.getDossierfirstassignmentdate();
	}

	/**
	* Returns the dossierfirstcertificatesigndate of this vrrp dossier statistics.
	*
	* @return the dossierfirstcertificatesigndate of this vrrp dossier statistics
	*/
	@Override
	public Date getDossierfirstcertificatesigndate() {
		return _vrrpDossierStatistics.getDossierfirstcertificatesigndate();
	}

	/**
	* Returns the dossierfirstreviewdate of this vrrp dossier statistics.
	*
	* @return the dossierfirstreviewdate of this vrrp dossier statistics
	*/
	@Override
	public Date getDossierfirstreviewdate() {
		return _vrrpDossierStatistics.getDossierfirstreviewdate();
	}

	/**
	* Returns the dossierfirstupdatingdate of this vrrp dossier statistics.
	*
	* @return the dossierfirstupdatingdate of this vrrp dossier statistics
	*/
	@Override
	public Date getDossierfirstupdatingdate() {
		return _vrrpDossierStatistics.getDossierfirstupdatingdate();
	}

	/**
	* Returns the dossierlastassignmentdate of this vrrp dossier statistics.
	*
	* @return the dossierlastassignmentdate of this vrrp dossier statistics
	*/
	@Override
	public Date getDossierlastassignmentdate() {
		return _vrrpDossierStatistics.getDossierlastassignmentdate();
	}

	/**
	* Returns the dossierlastcertificatesigndate of this vrrp dossier statistics.
	*
	* @return the dossierlastcertificatesigndate of this vrrp dossier statistics
	*/
	@Override
	public Date getDossierlastcertificatesigndate() {
		return _vrrpDossierStatistics.getDossierlastcertificatesigndate();
	}

	/**
	* Returns the dossierlastreviewadjustdate of this vrrp dossier statistics.
	*
	* @return the dossierlastreviewadjustdate of this vrrp dossier statistics
	*/
	@Override
	public Date getDossierlastreviewadjustdate() {
		return _vrrpDossierStatistics.getDossierlastreviewadjustdate();
	}

	/**
	* Returns the dossierlastupdatingdate of this vrrp dossier statistics.
	*
	* @return the dossierlastupdatingdate of this vrrp dossier statistics
	*/
	@Override
	public Date getDossierlastupdatingdate() {
		return _vrrpDossierStatistics.getDossierlastupdatingdate();
	}

	/**
	* Returns the dossiernexttreviewdate of this vrrp dossier statistics.
	*
	* @return the dossiernexttreviewdate of this vrrp dossier statistics
	*/
	@Override
	public Date getDossiernexttreviewdate() {
		return _vrrpDossierStatistics.getDossiernexttreviewdate();
	}

	/**
	* Returns the dossierreceivingdate of this vrrp dossier statistics.
	*
	* @return the dossierreceivingdate of this vrrp dossier statistics
	*/
	@Override
	public Date getDossierreceivingdate() {
		return _vrrpDossierStatistics.getDossierreceivingdate();
	}

	/**
	* Returns the dossierreviewadjustdate of this vrrp dossier statistics.
	*
	* @return the dossierreviewadjustdate of this vrrp dossier statistics
	*/
	@Override
	public Date getDossierreviewadjustdate() {
		return _vrrpDossierStatistics.getDossierreviewadjustdate();
	}

	/**
	* Returns the dossiersendingdate of this vrrp dossier statistics.
	*
	* @return the dossiersendingdate of this vrrp dossier statistics
	*/
	@Override
	public Date getDossiersendingdate() {
		return _vrrpDossierStatistics.getDossiersendingdate();
	}

	/**
	* Returns the dossiersubmittingdate of this vrrp dossier statistics.
	*
	* @return the dossiersubmittingdate of this vrrp dossier statistics
	*/
	@Override
	public Date getDossiersubmittingdate() {
		return _vrrpDossierStatistics.getDossiersubmittingdate();
	}

	/**
	* Returns the dossierviolatingdate of this vrrp dossier statistics.
	*
	* @return the dossierviolatingdate of this vrrp dossier statistics
	*/
	@Override
	public Date getDossierviolatingdate() {
		return _vrrpDossierStatistics.getDossierviolatingdate();
	}

	/**
	* Returns the dossierviolatingfromdate of this vrrp dossier statistics.
	*
	* @return the dossierviolatingfromdate of this vrrp dossier statistics
	*/
	@Override
	public Date getDossierviolatingfromdate() {
		return _vrrpDossierStatistics.getDossierviolatingfromdate();
	}

	/**
	* Returns the dossierviolatingtodate of this vrrp dossier statistics.
	*
	* @return the dossierviolatingtodate of this vrrp dossier statistics
	*/
	@Override
	public Date getDossierviolatingtodate() {
		return _vrrpDossierStatistics.getDossierviolatingtodate();
	}

	/**
	* Returns the modify date of this vrrp dossier statistics.
	*
	* @return the modify date of this vrrp dossier statistics
	*/
	@Override
	public Date getModifyDate() {
		return _vrrpDossierStatistics.getModifyDate();
	}

	/**
	* Returns the sync date of this vrrp dossier statistics.
	*
	* @return the sync date of this vrrp dossier statistics
	*/
	@Override
	public Date getSyncDate() {
		return _vrrpDossierStatistics.getSyncDate();
	}

	/**
	* Returns the dossierid of this vrrp dossier statistics.
	*
	* @return the dossierid of this vrrp dossier statistics
	*/
	@Override
	public long getDossierid() {
		return _vrrpDossierStatistics.getDossierid();
	}

	/**
	* Returns the ID of this vrrp dossier statistics.
	*
	* @return the ID of this vrrp dossier statistics
	*/
	@Override
	public long getId() {
		return _vrrpDossierStatistics.getId();
	}

	/**
	* Returns the primary key of this vrrp dossier statistics.
	*
	* @return the primary key of this vrrp dossier statistics
	*/
	@Override
	public long getPrimaryKey() {
		return _vrrpDossierStatistics.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vrrpDossierStatistics.persist();
	}

	/**
	* Sets the applicant no of this vrrp dossier statistics.
	*
	* @param applicantNo the applicant no of this vrrp dossier statistics
	*/
	@Override
	public void setApplicantNo(java.lang.String applicantNo) {
		_vrrpDossierStatistics.setApplicantNo(applicantNo);
	}

	/**
	* Sets the applicantaddress of this vrrp dossier statistics.
	*
	* @param applicantaddress the applicantaddress of this vrrp dossier statistics
	*/
	@Override
	public void setApplicantaddress(java.lang.String applicantaddress) {
		_vrrpDossierStatistics.setApplicantaddress(applicantaddress);
	}

	/**
	* Sets the applicantname of this vrrp dossier statistics.
	*
	* @param applicantname the applicantname of this vrrp dossier statistics
	*/
	@Override
	public void setApplicantname(java.lang.String applicantname) {
		_vrrpDossierStatistics.setApplicantname(applicantname);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrrpDossierStatistics.setCachedModel(cachedModel);
	}

	/**
	* Sets the certificatemonth of this vrrp dossier statistics.
	*
	* @param certificatemonth the certificatemonth of this vrrp dossier statistics
	*/
	@Override
	public void setCertificatemonth(int certificatemonth) {
		_vrrpDossierStatistics.setCertificatemonth(certificatemonth);
	}

	/**
	* Sets the certificaterecordno_new of this vrrp dossier statistics.
	*
	* @param certificaterecordno_new the certificaterecordno_new of this vrrp dossier statistics
	*/
	@Override
	public void setCertificaterecordno_new(
		java.lang.String certificaterecordno_new) {
		_vrrpDossierStatistics.setCertificaterecordno_new(certificaterecordno_new);
	}

	/**
	* Sets the certificaterecordno_renew of this vrrp dossier statistics.
	*
	* @param certificaterecordno_renew the certificaterecordno_renew of this vrrp dossier statistics
	*/
	@Override
	public void setCertificaterecordno_renew(
		java.lang.String certificaterecordno_renew) {
		_vrrpDossierStatistics.setCertificaterecordno_renew(certificaterecordno_renew);
	}

	/**
	* Sets the certificateyear of this vrrp dossier statistics.
	*
	* @param certificateyear the certificateyear of this vrrp dossier statistics
	*/
	@Override
	public void setCertificateyear(java.lang.String certificateyear) {
		_vrrpDossierStatistics.setCertificateyear(certificateyear);
	}

	/**
	* Sets the certifiedassemblytype of this vrrp dossier statistics.
	*
	* @param certifiedassemblytype the certifiedassemblytype of this vrrp dossier statistics
	*/
	@Override
	public void setCertifiedassemblytype(java.lang.String certifiedassemblytype) {
		_vrrpDossierStatistics.setCertifiedassemblytype(certifiedassemblytype);
	}

	/**
	* Sets the certifiedassemblytypedescription of this vrrp dossier statistics.
	*
	* @param certifiedassemblytypedescription the certifiedassemblytypedescription of this vrrp dossier statistics
	*/
	@Override
	public void setCertifiedassemblytypedescription(
		java.lang.String certifiedassemblytypedescription) {
		_vrrpDossierStatistics.setCertifiedassemblytypedescription(certifiedassemblytypedescription);
	}

	/**
	* Sets the certifiedcommercialname of this vrrp dossier statistics.
	*
	* @param certifiedcommercialname the certifiedcommercialname of this vrrp dossier statistics
	*/
	@Override
	public void setCertifiedcommercialname(
		java.lang.String certifiedcommercialname) {
		_vrrpDossierStatistics.setCertifiedcommercialname(certifiedcommercialname);
	}

	/**
	* Sets the certifiedmodelcode of this vrrp dossier statistics.
	*
	* @param certifiedmodelcode the certifiedmodelcode of this vrrp dossier statistics
	*/
	@Override
	public void setCertifiedmodelcode(java.lang.String certifiedmodelcode) {
		_vrrpDossierStatistics.setCertifiedmodelcode(certifiedmodelcode);
	}

	/**
	* Sets the certifiedtrademark of this vrrp dossier statistics.
	*
	* @param certifiedtrademark the certifiedtrademark of this vrrp dossier statistics
	*/
	@Override
	public void setCertifiedtrademark(java.lang.String certifiedtrademark) {
		_vrrpDossierStatistics.setCertifiedtrademark(certifiedtrademark);
	}

	/**
	* Sets the certifiedtrademarkname of this vrrp dossier statistics.
	*
	* @param certifiedtrademarkname the certifiedtrademarkname of this vrrp dossier statistics
	*/
	@Override
	public void setCertifiedtrademarkname(
		java.lang.String certifiedtrademarkname) {
		_vrrpDossierStatistics.setCertifiedtrademarkname(certifiedtrademarkname);
	}

	/**
	* Sets the certifiedvehicletype of this vrrp dossier statistics.
	*
	* @param certifiedvehicletype the certifiedvehicletype of this vrrp dossier statistics
	*/
	@Override
	public void setCertifiedvehicletype(java.lang.String certifiedvehicletype) {
		_vrrpDossierStatistics.setCertifiedvehicletype(certifiedvehicletype);
	}

	/**
	* Sets the certifiedvehicletypedescription of this vrrp dossier statistics.
	*
	* @param certifiedvehicletypedescription the certifiedvehicletypedescription of this vrrp dossier statistics
	*/
	@Override
	public void setCertifiedvehicletypedescription(
		java.lang.String certifiedvehicletypedescription) {
		_vrrpDossierStatistics.setCertifiedvehicletypedescription(certifiedvehicletypedescription);
	}

	/**
	* Sets the corporation ID of this vrrp dossier statistics.
	*
	* @param corporationId the corporation ID of this vrrp dossier statistics
	*/
	@Override
	public void setCorporationId(java.lang.String corporationId) {
		_vrrpDossierStatistics.setCorporationId(corporationId);
	}

	/**
	* Sets the domestic fdi of this vrrp dossier statistics.
	*
	* @param domesticFDI the domestic fdi of this vrrp dossier statistics
	*/
	@Override
	public void setDomesticFDI(java.lang.String domesticFDI) {
		_vrrpDossierStatistics.setDomesticFDI(domesticFDI);
	}

	/**
	* Sets the dossier ID ctn of this vrrp dossier statistics.
	*
	* @param dossierIdCTN the dossier ID ctn of this vrrp dossier statistics
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrrpDossierStatistics.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier payment date of this vrrp dossier statistics.
	*
	* @param dossierPaymentDate the dossier payment date of this vrrp dossier statistics
	*/
	@Override
	public void setDossierPaymentDate(Date dossierPaymentDate) {
		_vrrpDossierStatistics.setDossierPaymentDate(dossierPaymentDate);
	}

	/**
	* Sets the dossiercancellingdate of this vrrp dossier statistics.
	*
	* @param dossiercancellingdate the dossiercancellingdate of this vrrp dossier statistics
	*/
	@Override
	public void setDossiercancellingdate(Date dossiercancellingdate) {
		_vrrpDossierStatistics.setDossiercancellingdate(dossiercancellingdate);
	}

	/**
	* Sets the dossierdeadline of this vrrp dossier statistics.
	*
	* @param dossierdeadline the dossierdeadline of this vrrp dossier statistics
	*/
	@Override
	public void setDossierdeadline(Date dossierdeadline) {
		_vrrpDossierStatistics.setDossierdeadline(dossierdeadline);
	}

	/**
	* Sets the dossierdelayday of this vrrp dossier statistics.
	*
	* @param dossierdelayday the dossierdelayday of this vrrp dossier statistics
	*/
	@Override
	public void setDossierdelayday(int dossierdelayday) {
		_vrrpDossierStatistics.setDossierdelayday(dossierdelayday);
	}

	/**
	* Sets the dossierdelayreason of this vrrp dossier statistics.
	*
	* @param dossierdelayreason the dossierdelayreason of this vrrp dossier statistics
	*/
	@Override
	public void setDossierdelayreason(java.lang.String dossierdelayreason) {
		_vrrpDossierStatistics.setDossierdelayreason(dossierdelayreason);
	}

	/**
	* Sets the dossierendorsementdate of this vrrp dossier statistics.
	*
	* @param dossierendorsementdate the dossierendorsementdate of this vrrp dossier statistics
	*/
	@Override
	public void setDossierendorsementdate(Date dossierendorsementdate) {
		_vrrpDossierStatistics.setDossierendorsementdate(dossierendorsementdate);
	}

	/**
	* Sets the dossierexpiredate of this vrrp dossier statistics.
	*
	* @param dossierexpiredate the dossierexpiredate of this vrrp dossier statistics
	*/
	@Override
	public void setDossierexpiredate(Date dossierexpiredate) {
		_vrrpDossierStatistics.setDossierexpiredate(dossierexpiredate);
	}

	/**
	* Sets the dossierfinisheddate of this vrrp dossier statistics.
	*
	* @param dossierfinisheddate the dossierfinisheddate of this vrrp dossier statistics
	*/
	@Override
	public void setDossierfinisheddate(Date dossierfinisheddate) {
		_vrrpDossierStatistics.setDossierfinisheddate(dossierfinisheddate);
	}

	/**
	* Sets the dossierfirstassignmentdate of this vrrp dossier statistics.
	*
	* @param dossierfirstassignmentdate the dossierfirstassignmentdate of this vrrp dossier statistics
	*/
	@Override
	public void setDossierfirstassignmentdate(Date dossierfirstassignmentdate) {
		_vrrpDossierStatistics.setDossierfirstassignmentdate(dossierfirstassignmentdate);
	}

	/**
	* Sets the dossierfirstcertificatesigndate of this vrrp dossier statistics.
	*
	* @param dossierfirstcertificatesigndate the dossierfirstcertificatesigndate of this vrrp dossier statistics
	*/
	@Override
	public void setDossierfirstcertificatesigndate(
		Date dossierfirstcertificatesigndate) {
		_vrrpDossierStatistics.setDossierfirstcertificatesigndate(dossierfirstcertificatesigndate);
	}

	/**
	* Sets the dossierfirstreviewdate of this vrrp dossier statistics.
	*
	* @param dossierfirstreviewdate the dossierfirstreviewdate of this vrrp dossier statistics
	*/
	@Override
	public void setDossierfirstreviewdate(Date dossierfirstreviewdate) {
		_vrrpDossierStatistics.setDossierfirstreviewdate(dossierfirstreviewdate);
	}

	/**
	* Sets the dossierfirstupdatingdate of this vrrp dossier statistics.
	*
	* @param dossierfirstupdatingdate the dossierfirstupdatingdate of this vrrp dossier statistics
	*/
	@Override
	public void setDossierfirstupdatingdate(Date dossierfirstupdatingdate) {
		_vrrpDossierStatistics.setDossierfirstupdatingdate(dossierfirstupdatingdate);
	}

	/**
	* Sets the dossierid of this vrrp dossier statistics.
	*
	* @param dossierid the dossierid of this vrrp dossier statistics
	*/
	@Override
	public void setDossierid(long dossierid) {
		_vrrpDossierStatistics.setDossierid(dossierid);
	}

	/**
	* Sets the dossierlastassignmentdate of this vrrp dossier statistics.
	*
	* @param dossierlastassignmentdate the dossierlastassignmentdate of this vrrp dossier statistics
	*/
	@Override
	public void setDossierlastassignmentdate(Date dossierlastassignmentdate) {
		_vrrpDossierStatistics.setDossierlastassignmentdate(dossierlastassignmentdate);
	}

	/**
	* Sets the dossierlastcertificatesigndate of this vrrp dossier statistics.
	*
	* @param dossierlastcertificatesigndate the dossierlastcertificatesigndate of this vrrp dossier statistics
	*/
	@Override
	public void setDossierlastcertificatesigndate(
		Date dossierlastcertificatesigndate) {
		_vrrpDossierStatistics.setDossierlastcertificatesigndate(dossierlastcertificatesigndate);
	}

	/**
	* Sets the dossierlastreviewadjustdate of this vrrp dossier statistics.
	*
	* @param dossierlastreviewadjustdate the dossierlastreviewadjustdate of this vrrp dossier statistics
	*/
	@Override
	public void setDossierlastreviewadjustdate(Date dossierlastreviewadjustdate) {
		_vrrpDossierStatistics.setDossierlastreviewadjustdate(dossierlastreviewadjustdate);
	}

	/**
	* Sets the dossierlastupdatingdate of this vrrp dossier statistics.
	*
	* @param dossierlastupdatingdate the dossierlastupdatingdate of this vrrp dossier statistics
	*/
	@Override
	public void setDossierlastupdatingdate(Date dossierlastupdatingdate) {
		_vrrpDossierStatistics.setDossierlastupdatingdate(dossierlastupdatingdate);
	}

	/**
	* Sets the dossiernexttreviewdate of this vrrp dossier statistics.
	*
	* @param dossiernexttreviewdate the dossiernexttreviewdate of this vrrp dossier statistics
	*/
	@Override
	public void setDossiernexttreviewdate(Date dossiernexttreviewdate) {
		_vrrpDossierStatistics.setDossiernexttreviewdate(dossiernexttreviewdate);
	}

	/**
	* Sets the dossierno of this vrrp dossier statistics.
	*
	* @param dossierno the dossierno of this vrrp dossier statistics
	*/
	@Override
	public void setDossierno(java.lang.String dossierno) {
		_vrrpDossierStatistics.setDossierno(dossierno);
	}

	/**
	* Sets the dossierreceivingdate of this vrrp dossier statistics.
	*
	* @param dossierreceivingdate the dossierreceivingdate of this vrrp dossier statistics
	*/
	@Override
	public void setDossierreceivingdate(Date dossierreceivingdate) {
		_vrrpDossierStatistics.setDossierreceivingdate(dossierreceivingdate);
	}

	/**
	* Sets the dossierresult of this vrrp dossier statistics.
	*
	* @param dossierresult the dossierresult of this vrrp dossier statistics
	*/
	@Override
	public void setDossierresult(java.lang.String dossierresult) {
		_vrrpDossierStatistics.setDossierresult(dossierresult);
	}

	/**
	* Sets the dossierreviewadjustdate of this vrrp dossier statistics.
	*
	* @param dossierreviewadjustdate the dossierreviewadjustdate of this vrrp dossier statistics
	*/
	@Override
	public void setDossierreviewadjustdate(Date dossierreviewadjustdate) {
		_vrrpDossierStatistics.setDossierreviewadjustdate(dossierreviewadjustdate);
	}

	/**
	* Sets the dossiersendingdate of this vrrp dossier statistics.
	*
	* @param dossiersendingdate the dossiersendingdate of this vrrp dossier statistics
	*/
	@Override
	public void setDossiersendingdate(Date dossiersendingdate) {
		_vrrpDossierStatistics.setDossiersendingdate(dossiersendingdate);
	}

	/**
	* Sets the dossierstatus_processing of this vrrp dossier statistics.
	*
	* @param dossierstatus_processing the dossierstatus_processing of this vrrp dossier statistics
	*/
	@Override
	public void setDossierstatus_processing(
		java.lang.String dossierstatus_processing) {
		_vrrpDossierStatistics.setDossierstatus_processing(dossierstatus_processing);
	}

	/**
	* Sets the dossiersubmittingdate of this vrrp dossier statistics.
	*
	* @param dossiersubmittingdate the dossiersubmittingdate of this vrrp dossier statistics
	*/
	@Override
	public void setDossiersubmittingdate(Date dossiersubmittingdate) {
		_vrrpDossierStatistics.setDossiersubmittingdate(dossiersubmittingdate);
	}

	/**
	* Sets the dossiersubstatus of this vrrp dossier statistics.
	*
	* @param dossiersubstatus the dossiersubstatus of this vrrp dossier statistics
	*/
	@Override
	public void setDossiersubstatus(java.lang.String dossiersubstatus) {
		_vrrpDossierStatistics.setDossiersubstatus(dossiersubstatus);
	}

	/**
	* Sets the dossiertype of this vrrp dossier statistics.
	*
	* @param dossiertype the dossiertype of this vrrp dossier statistics
	*/
	@Override
	public void setDossiertype(java.lang.String dossiertype) {
		_vrrpDossierStatistics.setDossiertype(dossiertype);
	}

	/**
	* Sets the dossiertype_delayed of this vrrp dossier statistics.
	*
	* @param dossiertype_delayed the dossiertype_delayed of this vrrp dossier statistics
	*/
	@Override
	public void setDossiertype_delayed(java.lang.String dossiertype_delayed) {
		_vrrpDossierStatistics.setDossiertype_delayed(dossiertype_delayed);
	}

	/**
	* Sets the dossiertype_endorsed of this vrrp dossier statistics.
	*
	* @param dossiertype_endorsed the dossiertype_endorsed of this vrrp dossier statistics
	*/
	@Override
	public void setDossiertype_endorsed(java.lang.String dossiertype_endorsed) {
		_vrrpDossierStatistics.setDossiertype_endorsed(dossiertype_endorsed);
	}

	/**
	* Sets the dossiertype_expired of this vrrp dossier statistics.
	*
	* @param dossiertype_expired the dossiertype_expired of this vrrp dossier statistics
	*/
	@Override
	public void setDossiertype_expired(java.lang.String dossiertype_expired) {
		_vrrpDossierStatistics.setDossiertype_expired(dossiertype_expired);
	}

	/**
	* Sets the dossiertype_updated of this vrrp dossier statistics.
	*
	* @param dossiertype_updated the dossiertype_updated of this vrrp dossier statistics
	*/
	@Override
	public void setDossiertype_updated(java.lang.String dossiertype_updated) {
		_vrrpDossierStatistics.setDossiertype_updated(dossiertype_updated);
	}

	/**
	* Sets the dossierviolatingdate of this vrrp dossier statistics.
	*
	* @param dossierviolatingdate the dossierviolatingdate of this vrrp dossier statistics
	*/
	@Override
	public void setDossierviolatingdate(Date dossierviolatingdate) {
		_vrrpDossierStatistics.setDossierviolatingdate(dossierviolatingdate);
	}

	/**
	* Sets the dossierviolatingfromdate of this vrrp dossier statistics.
	*
	* @param dossierviolatingfromdate the dossierviolatingfromdate of this vrrp dossier statistics
	*/
	@Override
	public void setDossierviolatingfromdate(Date dossierviolatingfromdate) {
		_vrrpDossierStatistics.setDossierviolatingfromdate(dossierviolatingfromdate);
	}

	/**
	* Sets the dossierviolatingtodate of this vrrp dossier statistics.
	*
	* @param dossierviolatingtodate the dossierviolatingtodate of this vrrp dossier statistics
	*/
	@Override
	public void setDossierviolatingtodate(Date dossierviolatingtodate) {
		_vrrpDossierStatistics.setDossierviolatingtodate(dossierviolatingtodate);
	}

	/**
	* Sets the engine type of this vrrp dossier statistics.
	*
	* @param EngineType the engine type of this vrrp dossier statistics
	*/
	@Override
	public void setEngineType(java.lang.String EngineType) {
		_vrrpDossierStatistics.setEngineType(EngineType);
	}

	/**
	* Sets the engine type description of this vrrp dossier statistics.
	*
	* @param EngineTypeDescription the engine type description of this vrrp dossier statistics
	*/
	@Override
	public void setEngineTypeDescription(java.lang.String EngineTypeDescription) {
		_vrrpDossierStatistics.setEngineTypeDescription(EngineTypeDescription);
	}

	/**
	* Sets the equipmentimportquantity of this vrrp dossier statistics.
	*
	* @param equipmentimportquantity the equipmentimportquantity of this vrrp dossier statistics
	*/
	@Override
	public void setEquipmentimportquantity(int equipmentimportquantity) {
		_vrrpDossierStatistics.setEquipmentimportquantity(equipmentimportquantity);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrrpDossierStatistics.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrrpDossierStatistics.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrrpDossierStatistics.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vrrp dossier statistics.
	*
	* @param id the ID of this vrrp dossier statistics
	*/
	@Override
	public void setId(long id) {
		_vrrpDossierStatistics.setId(id);
	}

	/**
	* Sets the inspectorcode of this vrrp dossier statistics.
	*
	* @param inspectorcode the inspectorcode of this vrrp dossier statistics
	*/
	@Override
	public void setInspectorcode(java.lang.String inspectorcode) {
		_vrrpDossierStatistics.setInspectorcode(inspectorcode);
	}

	/**
	* Sets the inspectorname of this vrrp dossier statistics.
	*
	* @param inspectorname the inspectorname of this vrrp dossier statistics
	*/
	@Override
	public void setInspectorname(java.lang.String inspectorname) {
		_vrrpDossierStatistics.setInspectorname(inspectorname);
	}

	/**
	* Sets the leadername of this vrrp dossier statistics.
	*
	* @param leadername the leadername of this vrrp dossier statistics
	*/
	@Override
	public void setLeadername(java.lang.String leadername) {
		_vrrpDossierStatistics.setLeadername(leadername);
	}

	/**
	* Sets the men2 payment approval of this vrrp dossier statistics.
	*
	* @param men2PaymentApproval the men2 payment approval of this vrrp dossier statistics
	*/
	@Override
	public void setMen2PaymentApproval(java.lang.String men2PaymentApproval) {
		_vrrpDossierStatistics.setMen2PaymentApproval(men2PaymentApproval);
	}

	/**
	* Sets the men2cancelled of this vrrp dossier statistics.
	*
	* @param men2cancelled the men2cancelled of this vrrp dossier statistics
	*/
	@Override
	public void setMen2cancelled(java.lang.String men2cancelled) {
		_vrrpDossierStatistics.setMen2cancelled(men2cancelled);
	}

	/**
	* Sets the men2endorsement of this vrrp dossier statistics.
	*
	* @param men2endorsement the men2endorsement of this vrrp dossier statistics
	*/
	@Override
	public void setMen2endorsement(java.lang.String men2endorsement) {
		_vrrpDossierStatistics.setMen2endorsement(men2endorsement);
	}

	/**
	* Sets the men2expired of this vrrp dossier statistics.
	*
	* @param men2expired the men2expired of this vrrp dossier statistics
	*/
	@Override
	public void setMen2expired(java.lang.String men2expired) {
		_vrrpDossierStatistics.setMen2expired(men2expired);
	}

	/**
	* Sets the men2finished of this vrrp dossier statistics.
	*
	* @param men2finished the men2finished of this vrrp dossier statistics
	*/
	@Override
	public void setMen2finished(java.lang.String men2finished) {
		_vrrpDossierStatistics.setMen2finished(men2finished);
	}

	/**
	* Sets the men2firstassignment of this vrrp dossier statistics.
	*
	* @param men2firstassignment the men2firstassignment of this vrrp dossier statistics
	*/
	@Override
	public void setMen2firstassignment(java.lang.String men2firstassignment) {
		_vrrpDossierStatistics.setMen2firstassignment(men2firstassignment);
	}

	/**
	* Sets the men2firstcertificate of this vrrp dossier statistics.
	*
	* @param men2firstcertificate the men2firstcertificate of this vrrp dossier statistics
	*/
	@Override
	public void setMen2firstcertificate(java.lang.String men2firstcertificate) {
		_vrrpDossierStatistics.setMen2firstcertificate(men2firstcertificate);
	}

	/**
	* Sets the men2firstreview of this vrrp dossier statistics.
	*
	* @param men2firstreview the men2firstreview of this vrrp dossier statistics
	*/
	@Override
	public void setMen2firstreview(java.lang.String men2firstreview) {
		_vrrpDossierStatistics.setMen2firstreview(men2firstreview);
	}

	/**
	* Sets the men2firstupdating of this vrrp dossier statistics.
	*
	* @param men2firstupdating the men2firstupdating of this vrrp dossier statistics
	*/
	@Override
	public void setMen2firstupdating(java.lang.String men2firstupdating) {
		_vrrpDossierStatistics.setMen2firstupdating(men2firstupdating);
	}

	/**
	* Sets the men2lastassignment of this vrrp dossier statistics.
	*
	* @param men2lastassignment the men2lastassignment of this vrrp dossier statistics
	*/
	@Override
	public void setMen2lastassignment(java.lang.String men2lastassignment) {
		_vrrpDossierStatistics.setMen2lastassignment(men2lastassignment);
	}

	/**
	* Sets the men2lastcertificatesign of this vrrp dossier statistics.
	*
	* @param men2lastcertificatesign the men2lastcertificatesign of this vrrp dossier statistics
	*/
	@Override
	public void setMen2lastcertificatesign(
		java.lang.String men2lastcertificatesign) {
		_vrrpDossierStatistics.setMen2lastcertificatesign(men2lastcertificatesign);
	}

	/**
	* Sets the men2lastreviewadjust of this vrrp dossier statistics.
	*
	* @param men2lastreviewadjust the men2lastreviewadjust of this vrrp dossier statistics
	*/
	@Override
	public void setMen2lastreviewadjust(java.lang.String men2lastreviewadjust) {
		_vrrpDossierStatistics.setMen2lastreviewadjust(men2lastreviewadjust);
	}

	/**
	* Sets the men2lastupdating of this vrrp dossier statistics.
	*
	* @param men2lastupdating the men2lastupdating of this vrrp dossier statistics
	*/
	@Override
	public void setMen2lastupdating(java.lang.String men2lastupdating) {
		_vrrpDossierStatistics.setMen2lastupdating(men2lastupdating);
	}

	/**
	* Sets the men2nexttreview of this vrrp dossier statistics.
	*
	* @param men2nexttreview the men2nexttreview of this vrrp dossier statistics
	*/
	@Override
	public void setMen2nexttreview(java.lang.String men2nexttreview) {
		_vrrpDossierStatistics.setMen2nexttreview(men2nexttreview);
	}

	/**
	* Sets the men2receiving of this vrrp dossier statistics.
	*
	* @param men2receiving the men2receiving of this vrrp dossier statistics
	*/
	@Override
	public void setMen2receiving(java.lang.String men2receiving) {
		_vrrpDossierStatistics.setMen2receiving(men2receiving);
	}

	/**
	* Sets the men2reviewadjust of this vrrp dossier statistics.
	*
	* @param men2reviewadjust the men2reviewadjust of this vrrp dossier statistics
	*/
	@Override
	public void setMen2reviewadjust(java.lang.String men2reviewadjust) {
		_vrrpDossierStatistics.setMen2reviewadjust(men2reviewadjust);
	}

	/**
	* Sets the men2submitting of this vrrp dossier statistics.
	*
	* @param men2submitting the men2submitting of this vrrp dossier statistics
	*/
	@Override
	public void setMen2submitting(java.lang.String men2submitting) {
		_vrrpDossierStatistics.setMen2submitting(men2submitting);
	}

	/**
	* Sets the men2violated of this vrrp dossier statistics.
	*
	* @param men2violated the men2violated of this vrrp dossier statistics
	*/
	@Override
	public void setMen2violated(java.lang.String men2violated) {
		_vrrpDossierStatistics.setMen2violated(men2violated);
	}

	/**
	* Sets the modify date of this vrrp dossier statistics.
	*
	* @param modifyDate the modify date of this vrrp dossier statistics
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrrpDossierStatistics.setModifyDate(modifyDate);
	}

	@Override
	public void setNew(boolean n) {
		_vrrpDossierStatistics.setNew(n);
	}

	/**
	* Sets the primary key of this vrrp dossier statistics.
	*
	* @param primaryKey the primary key of this vrrp dossier statistics
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrrpDossierStatistics.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrrpDossierStatistics.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the productionplantaddress of this vrrp dossier statistics.
	*
	* @param productionplantaddress the productionplantaddress of this vrrp dossier statistics
	*/
	@Override
	public void setProductionplantaddress(
		java.lang.String productionplantaddress) {
		_vrrpDossierStatistics.setProductionplantaddress(productionplantaddress);
	}

	/**
	* Sets the productionplantname of this vrrp dossier statistics.
	*
	* @param productionplantname the productionplantname of this vrrp dossier statistics
	*/
	@Override
	public void setProductionplantname(java.lang.String productionplantname) {
		_vrrpDossierStatistics.setProductionplantname(productionplantname);
	}

	/**
	* Sets the remark to result of this vrrp dossier statistics.
	*
	* @param remarkToResult the remark to result of this vrrp dossier statistics
	*/
	@Override
	public void setRemarkToResult(java.lang.String remarkToResult) {
		_vrrpDossierStatistics.setRemarkToResult(remarkToResult);
	}

	/**
	* Sets the remark to update of this vrrp dossier statistics.
	*
	* @param remarkToUpdate the remark to update of this vrrp dossier statistics
	*/
	@Override
	public void setRemarkToUpdate(java.lang.String remarkToUpdate) {
		_vrrpDossierStatistics.setRemarkToUpdate(remarkToUpdate);
	}

	/**
	* Sets the resultdescription1 of this vrrp dossier statistics.
	*
	* @param resultdescription1 the resultdescription1 of this vrrp dossier statistics
	*/
	@Override
	public void setResultdescription1(java.lang.String resultdescription1) {
		_vrrpDossierStatistics.setResultdescription1(resultdescription1);
	}

	/**
	* Sets the resultdescription2 of this vrrp dossier statistics.
	*
	* @param resultdescription2 the resultdescription2 of this vrrp dossier statistics
	*/
	@Override
	public void setResultdescription2(java.lang.String resultdescription2) {
		_vrrpDossierStatistics.setResultdescription2(resultdescription2);
	}

	/**
	* Sets the resultdescription3 of this vrrp dossier statistics.
	*
	* @param resultdescription3 the resultdescription3 of this vrrp dossier statistics
	*/
	@Override
	public void setResultdescription3(java.lang.String resultdescription3) {
		_vrrpDossierStatistics.setResultdescription3(resultdescription3);
	}

	/**
	* Sets the seat number of this vrrp dossier statistics.
	*
	* @param SeatNumber the seat number of this vrrp dossier statistics
	*/
	@Override
	public void setSeatNumber(java.lang.String SeatNumber) {
		_vrrpDossierStatistics.setSeatNumber(SeatNumber);
	}

	/**
	* Sets the sync date of this vrrp dossier statistics.
	*
	* @param syncDate the sync date of this vrrp dossier statistics
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrrpDossierStatistics.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicleclass of this vrrp dossier statistics.
	*
	* @param vehicleclass the vehicleclass of this vrrp dossier statistics
	*/
	@Override
	public void setVehicleclass(java.lang.String vehicleclass) {
		_vrrpDossierStatistics.setVehicleclass(vehicleclass);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRRPDossierStatisticsWrapper)) {
			return false;
		}

		VRRPDossierStatisticsWrapper vrrpDossierStatisticsWrapper = (VRRPDossierStatisticsWrapper)obj;

		if (Objects.equals(_vrrpDossierStatistics,
					vrrpDossierStatisticsWrapper._vrrpDossierStatistics)) {
			return true;
		}

		return false;
	}

	@Override
	public VRRPDossierStatistics getWrappedModel() {
		return _vrrpDossierStatistics;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrrpDossierStatistics.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrrpDossierStatistics.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrrpDossierStatistics.resetOriginalValues();
	}

	private final VRRPDossierStatistics _vrrpDossierStatistics;
}