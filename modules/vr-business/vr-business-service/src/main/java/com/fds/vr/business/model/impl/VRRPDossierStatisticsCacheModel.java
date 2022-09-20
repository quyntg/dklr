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

package com.fds.vr.business.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRRPDossierStatistics;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VRRPDossierStatistics in entity cache.
 *
 * @author LamTV
 * @see VRRPDossierStatistics
 * @generated
 */
@ProviderType
public class VRRPDossierStatisticsCacheModel implements CacheModel<VRRPDossierStatistics>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRRPDossierStatisticsCacheModel)) {
			return false;
		}

		VRRPDossierStatisticsCacheModel vrrpDossierStatisticsCacheModel = (VRRPDossierStatisticsCacheModel)obj;

		if (id == vrrpDossierStatisticsCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(177);

		sb.append("{id=");
		sb.append(id);
		sb.append(", dossierid=");
		sb.append(dossierid);
		sb.append(", dossierIdCTN=");
		sb.append(dossierIdCTN);
		sb.append(", dossierno=");
		sb.append(dossierno);
		sb.append(", dossiersendingdate=");
		sb.append(dossiersendingdate);
		sb.append(", dossierreceivingdate=");
		sb.append(dossierreceivingdate);
		sb.append(", dossierfirstupdatingdate=");
		sb.append(dossierfirstupdatingdate);
		sb.append(", dossierlastupdatingdate=");
		sb.append(dossierlastupdatingdate);
		sb.append(", dossierendorsementdate=");
		sb.append(dossierendorsementdate);
		sb.append(", dossiersubmittingdate=");
		sb.append(dossiersubmittingdate);
		sb.append(", dossierfirstcertificatesigndate=");
		sb.append(dossierfirstcertificatesigndate);
		sb.append(", dossierfirstassignmentdate=");
		sb.append(dossierfirstassignmentdate);
		sb.append(", dossierfirstreviewdate=");
		sb.append(dossierfirstreviewdate);
		sb.append(", dossiernexttreviewdate=");
		sb.append(dossiernexttreviewdate);
		sb.append(", dossierlastassignmentdate=");
		sb.append(dossierlastassignmentdate);
		sb.append(", dossierreviewadjustdate=");
		sb.append(dossierreviewadjustdate);
		sb.append(", dossierlastreviewadjustdate=");
		sb.append(dossierlastreviewadjustdate);
		sb.append(", dossierlastcertificatesigndate=");
		sb.append(dossierlastcertificatesigndate);
		sb.append(", dossierdeadline=");
		sb.append(dossierdeadline);
		sb.append(", dossierfinisheddate=");
		sb.append(dossierfinisheddate);
		sb.append(", dossiercancellingdate=");
		sb.append(dossiercancellingdate);
		sb.append(", dossierexpiredate=");
		sb.append(dossierexpiredate);
		sb.append(", dossierviolatingdate=");
		sb.append(dossierviolatingdate);
		sb.append(", dossierviolatingfromdate=");
		sb.append(dossierviolatingfromdate);
		sb.append(", dossierviolatingtodate=");
		sb.append(dossierviolatingtodate);
		sb.append(", dossiertype=");
		sb.append(dossiertype);
		sb.append(", dossiertype_endorsed=");
		sb.append(dossiertype_endorsed);
		sb.append(", dossiertype_expired=");
		sb.append(dossiertype_expired);
		sb.append(", dossiertype_updated=");
		sb.append(dossiertype_updated);
		sb.append(", dossiertype_delayed=");
		sb.append(dossiertype_delayed);
		sb.append(", dossierdelayday=");
		sb.append(dossierdelayday);
		sb.append(", dossierdelayreason=");
		sb.append(dossierdelayreason);
		sb.append(", dossierstatus_processing=");
		sb.append(dossierstatus_processing);
		sb.append(", dossiersubstatus=");
		sb.append(dossiersubstatus);
		sb.append(", dossierresult=");
		sb.append(dossierresult);
		sb.append(", remarkToUpdate=");
		sb.append(remarkToUpdate);
		sb.append(", remarkToResult=");
		sb.append(remarkToResult);
		sb.append(", resultdescription1=");
		sb.append(resultdescription1);
		sb.append(", resultdescription2=");
		sb.append(resultdescription2);
		sb.append(", resultdescription3=");
		sb.append(resultdescription3);
		sb.append(", applicantNo=");
		sb.append(applicantNo);
		sb.append(", applicantname=");
		sb.append(applicantname);
		sb.append(", applicantaddress=");
		sb.append(applicantaddress);
		sb.append(", productionplantname=");
		sb.append(productionplantname);
		sb.append(", productionplantaddress=");
		sb.append(productionplantaddress);
		sb.append(", domesticFDI=");
		sb.append(domesticFDI);
		sb.append(", vehicleclass=");
		sb.append(vehicleclass);
		sb.append(", certifiedvehicletype=");
		sb.append(certifiedvehicletype);
		sb.append(", certifiedvehicletypedescription=");
		sb.append(certifiedvehicletypedescription);
		sb.append(", certifiedtrademark=");
		sb.append(certifiedtrademark);
		sb.append(", certifiedtrademarkname=");
		sb.append(certifiedtrademarkname);
		sb.append(", certifiedcommercialname=");
		sb.append(certifiedcommercialname);
		sb.append(", certifiedmodelcode=");
		sb.append(certifiedmodelcode);
		sb.append(", certifiedassemblytype=");
		sb.append(certifiedassemblytype);
		sb.append(", certifiedassemblytypedescription=");
		sb.append(certifiedassemblytypedescription);
		sb.append(", equipmentimportquantity=");
		sb.append(equipmentimportquantity);
		sb.append(", SeatNumber=");
		sb.append(SeatNumber);
		sb.append(", EngineType=");
		sb.append(EngineType);
		sb.append(", EngineTypeDescription=");
		sb.append(EngineTypeDescription);
		sb.append(", certificaterecordno_new=");
		sb.append(certificaterecordno_new);
		sb.append(", certificaterecordno_renew=");
		sb.append(certificaterecordno_renew);
		sb.append(", certificateyear=");
		sb.append(certificateyear);
		sb.append(", certificatemonth=");
		sb.append(certificatemonth);
		sb.append(", corporationId=");
		sb.append(corporationId);
		sb.append(", inspectorcode=");
		sb.append(inspectorcode);
		sb.append(", inspectorname=");
		sb.append(inspectorname);
		sb.append(", leadername=");
		sb.append(leadername);
		sb.append(", men2receiving=");
		sb.append(men2receiving);
		sb.append(", men2firstupdating=");
		sb.append(men2firstupdating);
		sb.append(", men2lastupdating=");
		sb.append(men2lastupdating);
		sb.append(", men2endorsement=");
		sb.append(men2endorsement);
		sb.append(", men2submitting=");
		sb.append(men2submitting);
		sb.append(", men2firstcertificate=");
		sb.append(men2firstcertificate);
		sb.append(", men2firstassignment=");
		sb.append(men2firstassignment);
		sb.append(", men2firstreview=");
		sb.append(men2firstreview);
		sb.append(", men2nexttreview=");
		sb.append(men2nexttreview);
		sb.append(", men2lastassignment=");
		sb.append(men2lastassignment);
		sb.append(", men2reviewadjust=");
		sb.append(men2reviewadjust);
		sb.append(", men2lastreviewadjust=");
		sb.append(men2lastreviewadjust);
		sb.append(", men2lastcertificatesign=");
		sb.append(men2lastcertificatesign);
		sb.append(", men2finished=");
		sb.append(men2finished);
		sb.append(", men2cancelled=");
		sb.append(men2cancelled);
		sb.append(", men2expired=");
		sb.append(men2expired);
		sb.append(", men2violated=");
		sb.append(men2violated);
		sb.append(", dossierPaymentDate=");
		sb.append(dossierPaymentDate);
		sb.append(", men2PaymentApproval=");
		sb.append(men2PaymentApproval);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRRPDossierStatistics toEntityModel() {
		VRRPDossierStatisticsImpl vrrpDossierStatisticsImpl = new VRRPDossierStatisticsImpl();

		vrrpDossierStatisticsImpl.setId(id);
		vrrpDossierStatisticsImpl.setDossierid(dossierid);

		if (dossierIdCTN == null) {
			vrrpDossierStatisticsImpl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierIdCTN(dossierIdCTN);
		}

		if (dossierno == null) {
			vrrpDossierStatisticsImpl.setDossierno(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierno(dossierno);
		}

		if (dossiersendingdate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossiersendingdate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossiersendingdate(new Date(
					dossiersendingdate));
		}

		if (dossierreceivingdate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossierreceivingdate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierreceivingdate(new Date(
					dossierreceivingdate));
		}

		if (dossierfirstupdatingdate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossierfirstupdatingdate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierfirstupdatingdate(new Date(
					dossierfirstupdatingdate));
		}

		if (dossierlastupdatingdate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossierlastupdatingdate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierlastupdatingdate(new Date(
					dossierlastupdatingdate));
		}

		if (dossierendorsementdate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossierendorsementdate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierendorsementdate(new Date(
					dossierendorsementdate));
		}

		if (dossiersubmittingdate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossiersubmittingdate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossiersubmittingdate(new Date(
					dossiersubmittingdate));
		}

		if (dossierfirstcertificatesigndate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossierfirstcertificatesigndate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierfirstcertificatesigndate(new Date(
					dossierfirstcertificatesigndate));
		}

		if (dossierfirstassignmentdate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossierfirstassignmentdate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierfirstassignmentdate(new Date(
					dossierfirstassignmentdate));
		}

		if (dossierfirstreviewdate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossierfirstreviewdate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierfirstreviewdate(new Date(
					dossierfirstreviewdate));
		}

		if (dossiernexttreviewdate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossiernexttreviewdate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossiernexttreviewdate(new Date(
					dossiernexttreviewdate));
		}

		if (dossierlastassignmentdate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossierlastassignmentdate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierlastassignmentdate(new Date(
					dossierlastassignmentdate));
		}

		if (dossierreviewadjustdate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossierreviewadjustdate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierreviewadjustdate(new Date(
					dossierreviewadjustdate));
		}

		if (dossierlastreviewadjustdate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossierlastreviewadjustdate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierlastreviewadjustdate(new Date(
					dossierlastreviewadjustdate));
		}

		if (dossierlastcertificatesigndate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossierlastcertificatesigndate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierlastcertificatesigndate(new Date(
					dossierlastcertificatesigndate));
		}

		if (dossierdeadline == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossierdeadline(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierdeadline(new Date(
					dossierdeadline));
		}

		if (dossierfinisheddate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossierfinisheddate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierfinisheddate(new Date(
					dossierfinisheddate));
		}

		if (dossiercancellingdate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossiercancellingdate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossiercancellingdate(new Date(
					dossiercancellingdate));
		}

		if (dossierexpiredate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossierexpiredate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierexpiredate(new Date(
					dossierexpiredate));
		}

		if (dossierviolatingdate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossierviolatingdate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierviolatingdate(new Date(
					dossierviolatingdate));
		}

		if (dossierviolatingfromdate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossierviolatingfromdate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierviolatingfromdate(new Date(
					dossierviolatingfromdate));
		}

		if (dossierviolatingtodate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossierviolatingtodate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierviolatingtodate(new Date(
					dossierviolatingtodate));
		}

		if (dossiertype == null) {
			vrrpDossierStatisticsImpl.setDossiertype(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setDossiertype(dossiertype);
		}

		if (dossiertype_endorsed == null) {
			vrrpDossierStatisticsImpl.setDossiertype_endorsed(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setDossiertype_endorsed(dossiertype_endorsed);
		}

		if (dossiertype_expired == null) {
			vrrpDossierStatisticsImpl.setDossiertype_expired(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setDossiertype_expired(dossiertype_expired);
		}

		if (dossiertype_updated == null) {
			vrrpDossierStatisticsImpl.setDossiertype_updated(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setDossiertype_updated(dossiertype_updated);
		}

		if (dossiertype_delayed == null) {
			vrrpDossierStatisticsImpl.setDossiertype_delayed(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setDossiertype_delayed(dossiertype_delayed);
		}

		vrrpDossierStatisticsImpl.setDossierdelayday(dossierdelayday);

		if (dossierdelayreason == null) {
			vrrpDossierStatisticsImpl.setDossierdelayreason(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierdelayreason(dossierdelayreason);
		}

		if (dossierstatus_processing == null) {
			vrrpDossierStatisticsImpl.setDossierstatus_processing(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierstatus_processing(dossierstatus_processing);
		}

		if (dossiersubstatus == null) {
			vrrpDossierStatisticsImpl.setDossiersubstatus(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setDossiersubstatus(dossiersubstatus);
		}

		if (dossierresult == null) {
			vrrpDossierStatisticsImpl.setDossierresult(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierresult(dossierresult);
		}

		if (remarkToUpdate == null) {
			vrrpDossierStatisticsImpl.setRemarkToUpdate(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setRemarkToUpdate(remarkToUpdate);
		}

		if (remarkToResult == null) {
			vrrpDossierStatisticsImpl.setRemarkToResult(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setRemarkToResult(remarkToResult);
		}

		if (resultdescription1 == null) {
			vrrpDossierStatisticsImpl.setResultdescription1(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setResultdescription1(resultdescription1);
		}

		if (resultdescription2 == null) {
			vrrpDossierStatisticsImpl.setResultdescription2(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setResultdescription2(resultdescription2);
		}

		if (resultdescription3 == null) {
			vrrpDossierStatisticsImpl.setResultdescription3(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setResultdescription3(resultdescription3);
		}

		if (applicantNo == null) {
			vrrpDossierStatisticsImpl.setApplicantNo(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setApplicantNo(applicantNo);
		}

		if (applicantname == null) {
			vrrpDossierStatisticsImpl.setApplicantname(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setApplicantname(applicantname);
		}

		if (applicantaddress == null) {
			vrrpDossierStatisticsImpl.setApplicantaddress(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setApplicantaddress(applicantaddress);
		}

		if (productionplantname == null) {
			vrrpDossierStatisticsImpl.setProductionplantname(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setProductionplantname(productionplantname);
		}

		if (productionplantaddress == null) {
			vrrpDossierStatisticsImpl.setProductionplantaddress(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setProductionplantaddress(productionplantaddress);
		}

		if (domesticFDI == null) {
			vrrpDossierStatisticsImpl.setDomesticFDI(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setDomesticFDI(domesticFDI);
		}

		if (vehicleclass == null) {
			vrrpDossierStatisticsImpl.setVehicleclass(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setVehicleclass(vehicleclass);
		}

		if (certifiedvehicletype == null) {
			vrrpDossierStatisticsImpl.setCertifiedvehicletype(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setCertifiedvehicletype(certifiedvehicletype);
		}

		if (certifiedvehicletypedescription == null) {
			vrrpDossierStatisticsImpl.setCertifiedvehicletypedescription(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setCertifiedvehicletypedescription(certifiedvehicletypedescription);
		}

		if (certifiedtrademark == null) {
			vrrpDossierStatisticsImpl.setCertifiedtrademark(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setCertifiedtrademark(certifiedtrademark);
		}

		if (certifiedtrademarkname == null) {
			vrrpDossierStatisticsImpl.setCertifiedtrademarkname(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setCertifiedtrademarkname(certifiedtrademarkname);
		}

		if (certifiedcommercialname == null) {
			vrrpDossierStatisticsImpl.setCertifiedcommercialname(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setCertifiedcommercialname(certifiedcommercialname);
		}

		if (certifiedmodelcode == null) {
			vrrpDossierStatisticsImpl.setCertifiedmodelcode(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setCertifiedmodelcode(certifiedmodelcode);
		}

		if (certifiedassemblytype == null) {
			vrrpDossierStatisticsImpl.setCertifiedassemblytype(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setCertifiedassemblytype(certifiedassemblytype);
		}

		if (certifiedassemblytypedescription == null) {
			vrrpDossierStatisticsImpl.setCertifiedassemblytypedescription(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setCertifiedassemblytypedescription(certifiedassemblytypedescription);
		}

		vrrpDossierStatisticsImpl.setEquipmentimportquantity(equipmentimportquantity);

		if (SeatNumber == null) {
			vrrpDossierStatisticsImpl.setSeatNumber(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setSeatNumber(SeatNumber);
		}

		if (EngineType == null) {
			vrrpDossierStatisticsImpl.setEngineType(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setEngineType(EngineType);
		}

		if (EngineTypeDescription == null) {
			vrrpDossierStatisticsImpl.setEngineTypeDescription(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setEngineTypeDescription(EngineTypeDescription);
		}

		if (certificaterecordno_new == null) {
			vrrpDossierStatisticsImpl.setCertificaterecordno_new(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setCertificaterecordno_new(certificaterecordno_new);
		}

		if (certificaterecordno_renew == null) {
			vrrpDossierStatisticsImpl.setCertificaterecordno_renew(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setCertificaterecordno_renew(certificaterecordno_renew);
		}

		if (certificateyear == null) {
			vrrpDossierStatisticsImpl.setCertificateyear(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setCertificateyear(certificateyear);
		}

		vrrpDossierStatisticsImpl.setCertificatemonth(certificatemonth);

		if (corporationId == null) {
			vrrpDossierStatisticsImpl.setCorporationId(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setCorporationId(corporationId);
		}

		if (inspectorcode == null) {
			vrrpDossierStatisticsImpl.setInspectorcode(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setInspectorcode(inspectorcode);
		}

		if (inspectorname == null) {
			vrrpDossierStatisticsImpl.setInspectorname(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setInspectorname(inspectorname);
		}

		if (leadername == null) {
			vrrpDossierStatisticsImpl.setLeadername(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setLeadername(leadername);
		}

		if (men2receiving == null) {
			vrrpDossierStatisticsImpl.setMen2receiving(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setMen2receiving(men2receiving);
		}

		if (men2firstupdating == null) {
			vrrpDossierStatisticsImpl.setMen2firstupdating(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setMen2firstupdating(men2firstupdating);
		}

		if (men2lastupdating == null) {
			vrrpDossierStatisticsImpl.setMen2lastupdating(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setMen2lastupdating(men2lastupdating);
		}

		if (men2endorsement == null) {
			vrrpDossierStatisticsImpl.setMen2endorsement(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setMen2endorsement(men2endorsement);
		}

		if (men2submitting == null) {
			vrrpDossierStatisticsImpl.setMen2submitting(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setMen2submitting(men2submitting);
		}

		if (men2firstcertificate == null) {
			vrrpDossierStatisticsImpl.setMen2firstcertificate(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setMen2firstcertificate(men2firstcertificate);
		}

		if (men2firstassignment == null) {
			vrrpDossierStatisticsImpl.setMen2firstassignment(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setMen2firstassignment(men2firstassignment);
		}

		if (men2firstreview == null) {
			vrrpDossierStatisticsImpl.setMen2firstreview(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setMen2firstreview(men2firstreview);
		}

		if (men2nexttreview == null) {
			vrrpDossierStatisticsImpl.setMen2nexttreview(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setMen2nexttreview(men2nexttreview);
		}

		if (men2lastassignment == null) {
			vrrpDossierStatisticsImpl.setMen2lastassignment(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setMen2lastassignment(men2lastassignment);
		}

		if (men2reviewadjust == null) {
			vrrpDossierStatisticsImpl.setMen2reviewadjust(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setMen2reviewadjust(men2reviewadjust);
		}

		if (men2lastreviewadjust == null) {
			vrrpDossierStatisticsImpl.setMen2lastreviewadjust(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setMen2lastreviewadjust(men2lastreviewadjust);
		}

		if (men2lastcertificatesign == null) {
			vrrpDossierStatisticsImpl.setMen2lastcertificatesign(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setMen2lastcertificatesign(men2lastcertificatesign);
		}

		if (men2finished == null) {
			vrrpDossierStatisticsImpl.setMen2finished(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setMen2finished(men2finished);
		}

		if (men2cancelled == null) {
			vrrpDossierStatisticsImpl.setMen2cancelled(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setMen2cancelled(men2cancelled);
		}

		if (men2expired == null) {
			vrrpDossierStatisticsImpl.setMen2expired(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setMen2expired(men2expired);
		}

		if (men2violated == null) {
			vrrpDossierStatisticsImpl.setMen2violated(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setMen2violated(men2violated);
		}

		if (dossierPaymentDate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setDossierPaymentDate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setDossierPaymentDate(new Date(
					dossierPaymentDate));
		}

		if (men2PaymentApproval == null) {
			vrrpDossierStatisticsImpl.setMen2PaymentApproval(StringPool.BLANK);
		}
		else {
			vrrpDossierStatisticsImpl.setMen2PaymentApproval(men2PaymentApproval);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setModifyDate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrrpDossierStatisticsImpl.setSyncDate(null);
		}
		else {
			vrrpDossierStatisticsImpl.setSyncDate(new Date(syncDate));
		}

		vrrpDossierStatisticsImpl.resetOriginalValues();

		return vrrpDossierStatisticsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		dossierid = objectInput.readLong();
		dossierIdCTN = objectInput.readUTF();
		dossierno = objectInput.readUTF();
		dossiersendingdate = objectInput.readLong();
		dossierreceivingdate = objectInput.readLong();
		dossierfirstupdatingdate = objectInput.readLong();
		dossierlastupdatingdate = objectInput.readLong();
		dossierendorsementdate = objectInput.readLong();
		dossiersubmittingdate = objectInput.readLong();
		dossierfirstcertificatesigndate = objectInput.readLong();
		dossierfirstassignmentdate = objectInput.readLong();
		dossierfirstreviewdate = objectInput.readLong();
		dossiernexttreviewdate = objectInput.readLong();
		dossierlastassignmentdate = objectInput.readLong();
		dossierreviewadjustdate = objectInput.readLong();
		dossierlastreviewadjustdate = objectInput.readLong();
		dossierlastcertificatesigndate = objectInput.readLong();
		dossierdeadline = objectInput.readLong();
		dossierfinisheddate = objectInput.readLong();
		dossiercancellingdate = objectInput.readLong();
		dossierexpiredate = objectInput.readLong();
		dossierviolatingdate = objectInput.readLong();
		dossierviolatingfromdate = objectInput.readLong();
		dossierviolatingtodate = objectInput.readLong();
		dossiertype = objectInput.readUTF();
		dossiertype_endorsed = objectInput.readUTF();
		dossiertype_expired = objectInput.readUTF();
		dossiertype_updated = objectInput.readUTF();
		dossiertype_delayed = objectInput.readUTF();

		dossierdelayday = objectInput.readInt();
		dossierdelayreason = objectInput.readUTF();
		dossierstatus_processing = objectInput.readUTF();
		dossiersubstatus = objectInput.readUTF();
		dossierresult = objectInput.readUTF();
		remarkToUpdate = objectInput.readUTF();
		remarkToResult = objectInput.readUTF();
		resultdescription1 = objectInput.readUTF();
		resultdescription2 = objectInput.readUTF();
		resultdescription3 = objectInput.readUTF();
		applicantNo = objectInput.readUTF();
		applicantname = objectInput.readUTF();
		applicantaddress = objectInput.readUTF();
		productionplantname = objectInput.readUTF();
		productionplantaddress = objectInput.readUTF();
		domesticFDI = objectInput.readUTF();
		vehicleclass = objectInput.readUTF();
		certifiedvehicletype = objectInput.readUTF();
		certifiedvehicletypedescription = objectInput.readUTF();
		certifiedtrademark = objectInput.readUTF();
		certifiedtrademarkname = objectInput.readUTF();
		certifiedcommercialname = objectInput.readUTF();
		certifiedmodelcode = objectInput.readUTF();
		certifiedassemblytype = objectInput.readUTF();
		certifiedassemblytypedescription = objectInput.readUTF();

		equipmentimportquantity = objectInput.readInt();
		SeatNumber = objectInput.readUTF();
		EngineType = objectInput.readUTF();
		EngineTypeDescription = objectInput.readUTF();
		certificaterecordno_new = objectInput.readUTF();
		certificaterecordno_renew = objectInput.readUTF();
		certificateyear = objectInput.readUTF();

		certificatemonth = objectInput.readInt();
		corporationId = objectInput.readUTF();
		inspectorcode = objectInput.readUTF();
		inspectorname = objectInput.readUTF();
		leadername = objectInput.readUTF();
		men2receiving = objectInput.readUTF();
		men2firstupdating = objectInput.readUTF();
		men2lastupdating = objectInput.readUTF();
		men2endorsement = objectInput.readUTF();
		men2submitting = objectInput.readUTF();
		men2firstcertificate = objectInput.readUTF();
		men2firstassignment = objectInput.readUTF();
		men2firstreview = objectInput.readUTF();
		men2nexttreview = objectInput.readUTF();
		men2lastassignment = objectInput.readUTF();
		men2reviewadjust = objectInput.readUTF();
		men2lastreviewadjust = objectInput.readUTF();
		men2lastcertificatesign = objectInput.readUTF();
		men2finished = objectInput.readUTF();
		men2cancelled = objectInput.readUTF();
		men2expired = objectInput.readUTF();
		men2violated = objectInput.readUTF();
		dossierPaymentDate = objectInput.readLong();
		men2PaymentApproval = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(dossierid);

		if (dossierIdCTN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierIdCTN);
		}

		if (dossierno == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierno);
		}

		objectOutput.writeLong(dossiersendingdate);
		objectOutput.writeLong(dossierreceivingdate);
		objectOutput.writeLong(dossierfirstupdatingdate);
		objectOutput.writeLong(dossierlastupdatingdate);
		objectOutput.writeLong(dossierendorsementdate);
		objectOutput.writeLong(dossiersubmittingdate);
		objectOutput.writeLong(dossierfirstcertificatesigndate);
		objectOutput.writeLong(dossierfirstassignmentdate);
		objectOutput.writeLong(dossierfirstreviewdate);
		objectOutput.writeLong(dossiernexttreviewdate);
		objectOutput.writeLong(dossierlastassignmentdate);
		objectOutput.writeLong(dossierreviewadjustdate);
		objectOutput.writeLong(dossierlastreviewadjustdate);
		objectOutput.writeLong(dossierlastcertificatesigndate);
		objectOutput.writeLong(dossierdeadline);
		objectOutput.writeLong(dossierfinisheddate);
		objectOutput.writeLong(dossiercancellingdate);
		objectOutput.writeLong(dossierexpiredate);
		objectOutput.writeLong(dossierviolatingdate);
		objectOutput.writeLong(dossierviolatingfromdate);
		objectOutput.writeLong(dossierviolatingtodate);

		if (dossiertype == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossiertype);
		}

		if (dossiertype_endorsed == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossiertype_endorsed);
		}

		if (dossiertype_expired == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossiertype_expired);
		}

		if (dossiertype_updated == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossiertype_updated);
		}

		if (dossiertype_delayed == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossiertype_delayed);
		}

		objectOutput.writeInt(dossierdelayday);

		if (dossierdelayreason == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierdelayreason);
		}

		if (dossierstatus_processing == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierstatus_processing);
		}

		if (dossiersubstatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossiersubstatus);
		}

		if (dossierresult == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierresult);
		}

		if (remarkToUpdate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarkToUpdate);
		}

		if (remarkToResult == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarkToResult);
		}

		if (resultdescription1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(resultdescription1);
		}

		if (resultdescription2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(resultdescription2);
		}

		if (resultdescription3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(resultdescription3);
		}

		if (applicantNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantNo);
		}

		if (applicantname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantname);
		}

		if (applicantaddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantaddress);
		}

		if (productionplantname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionplantname);
		}

		if (productionplantaddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionplantaddress);
		}

		if (domesticFDI == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(domesticFDI);
		}

		if (vehicleclass == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleclass);
		}

		if (certifiedvehicletype == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedvehicletype);
		}

		if (certifiedvehicletypedescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedvehicletypedescription);
		}

		if (certifiedtrademark == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedtrademark);
		}

		if (certifiedtrademarkname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedtrademarkname);
		}

		if (certifiedcommercialname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedcommercialname);
		}

		if (certifiedmodelcode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedmodelcode);
		}

		if (certifiedassemblytype == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedassemblytype);
		}

		if (certifiedassemblytypedescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certifiedassemblytypedescription);
		}

		objectOutput.writeInt(equipmentimportquantity);

		if (SeatNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SeatNumber);
		}

		if (EngineType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(EngineType);
		}

		if (EngineTypeDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(EngineTypeDescription);
		}

		if (certificaterecordno_new == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificaterecordno_new);
		}

		if (certificaterecordno_renew == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificaterecordno_renew);
		}

		if (certificateyear == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateyear);
		}

		objectOutput.writeInt(certificatemonth);

		if (corporationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationId);
		}

		if (inspectorcode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorcode);
		}

		if (inspectorname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorname);
		}

		if (leadername == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(leadername);
		}

		if (men2receiving == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(men2receiving);
		}

		if (men2firstupdating == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(men2firstupdating);
		}

		if (men2lastupdating == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(men2lastupdating);
		}

		if (men2endorsement == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(men2endorsement);
		}

		if (men2submitting == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(men2submitting);
		}

		if (men2firstcertificate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(men2firstcertificate);
		}

		if (men2firstassignment == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(men2firstassignment);
		}

		if (men2firstreview == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(men2firstreview);
		}

		if (men2nexttreview == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(men2nexttreview);
		}

		if (men2lastassignment == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(men2lastassignment);
		}

		if (men2reviewadjust == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(men2reviewadjust);
		}

		if (men2lastreviewadjust == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(men2lastreviewadjust);
		}

		if (men2lastcertificatesign == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(men2lastcertificatesign);
		}

		if (men2finished == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(men2finished);
		}

		if (men2cancelled == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(men2cancelled);
		}

		if (men2expired == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(men2expired);
		}

		if (men2violated == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(men2violated);
		}

		objectOutput.writeLong(dossierPaymentDate);

		if (men2PaymentApproval == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(men2PaymentApproval);
		}

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long dossierid;
	public String dossierIdCTN;
	public String dossierno;
	public long dossiersendingdate;
	public long dossierreceivingdate;
	public long dossierfirstupdatingdate;
	public long dossierlastupdatingdate;
	public long dossierendorsementdate;
	public long dossiersubmittingdate;
	public long dossierfirstcertificatesigndate;
	public long dossierfirstassignmentdate;
	public long dossierfirstreviewdate;
	public long dossiernexttreviewdate;
	public long dossierlastassignmentdate;
	public long dossierreviewadjustdate;
	public long dossierlastreviewadjustdate;
	public long dossierlastcertificatesigndate;
	public long dossierdeadline;
	public long dossierfinisheddate;
	public long dossiercancellingdate;
	public long dossierexpiredate;
	public long dossierviolatingdate;
	public long dossierviolatingfromdate;
	public long dossierviolatingtodate;
	public String dossiertype;
	public String dossiertype_endorsed;
	public String dossiertype_expired;
	public String dossiertype_updated;
	public String dossiertype_delayed;
	public int dossierdelayday;
	public String dossierdelayreason;
	public String dossierstatus_processing;
	public String dossiersubstatus;
	public String dossierresult;
	public String remarkToUpdate;
	public String remarkToResult;
	public String resultdescription1;
	public String resultdescription2;
	public String resultdescription3;
	public String applicantNo;
	public String applicantname;
	public String applicantaddress;
	public String productionplantname;
	public String productionplantaddress;
	public String domesticFDI;
	public String vehicleclass;
	public String certifiedvehicletype;
	public String certifiedvehicletypedescription;
	public String certifiedtrademark;
	public String certifiedtrademarkname;
	public String certifiedcommercialname;
	public String certifiedmodelcode;
	public String certifiedassemblytype;
	public String certifiedassemblytypedescription;
	public int equipmentimportquantity;
	public String SeatNumber;
	public String EngineType;
	public String EngineTypeDescription;
	public String certificaterecordno_new;
	public String certificaterecordno_renew;
	public String certificateyear;
	public int certificatemonth;
	public String corporationId;
	public String inspectorcode;
	public String inspectorname;
	public String leadername;
	public String men2receiving;
	public String men2firstupdating;
	public String men2lastupdating;
	public String men2endorsement;
	public String men2submitting;
	public String men2firstcertificate;
	public String men2firstassignment;
	public String men2firstreview;
	public String men2nexttreview;
	public String men2lastassignment;
	public String men2reviewadjust;
	public String men2lastreviewadjust;
	public String men2lastcertificatesign;
	public String men2finished;
	public String men2cancelled;
	public String men2expired;
	public String men2violated;
	public long dossierPaymentDate;
	public String men2PaymentApproval;
	public long modifyDate;
	public long syncDate;
}