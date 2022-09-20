/**
 * 
 */
package com.fds.vr.business.action;

import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.Company;

import java.util.Date;

/**
 * @author ddung
 *
 */
public interface VRExpiredCertificateActions {
	public JSONObject updateVRExpiredCertificate(long id, long mtCore, long convertAssembleId, long validDossierId,
			String validDossierIdCTN, String validDossierNo, long vehicleTypeCertificateId, long dossierId,
			String dossierIdCTN, String dossierNo, String dossierStatus, Date previousExpireDate,
			String certificateRecordNo, Date certificateRecordDate, Date certificateRecordExpireDate, int expiredStatus,
			String vehicleClass, String certifiedVehicleType, String certifiedVehicleTypeDescription,
			String certifiedTrademark, String certifiedTrademarkName, String certifiedCommercialName,
			String certifiedModelCode, String productionCountry, String safetytestReportNo, Date safetytestReportDate,
			String emissionTestReportNo, Date emissionTestReportDate, String commonSafetyStandard,
			String commonSafetyDescription, String emissionStandard, String emissionDescription,
			String othertestReportNo, Date othertestReportDate, String copReportNo, Date copReportDate,
			Date copReportExpireDate, String validRequestNo, Date validRequestDate, String validInspectionRecordNo,
			Date validInspectionRecordDate, long validCorporationId, long validInspectorId, String validInspectorName,
			String validRemarks, String validInspectionNote, long deliverableFileEntryId, long documentFileEntryId,
			Date syncDate, String typeUpdate, Company company) throws JSONException;
}
