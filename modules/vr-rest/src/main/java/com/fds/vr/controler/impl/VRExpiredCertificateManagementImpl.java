/**
 * 
 */
package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRExpiredCertificateActions;
import com.fds.vr.business.action.impl.VRExpiredCertificateActionsImpl;
import com.fds.vr.business.model.VRExpireCertificate;
import com.fds.vr.business.model.impl.VRExpireCertificateModelImpl;
import com.fds.vr.business.service.VRExpireCertificateLocalServiceUtil;
import com.fds.vr.controler.VRExpiredCertificateManagement;
import com.fds.vr.service.util.BusinessUtil;
import com.fds.vr.util.DateTimeUtils;
import com.fds.vr.util.VRRestUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringPool;

import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

/**
 * @author ddung
 *
 */
public class VRExpiredCertificateManagementImpl implements VRExpiredCertificateManagement {

	private static final Log _log = LogFactoryUtil.getLog(VRExpiredCertificateManagementImpl.class);

	@Override
	public Response updateExpireCertificate(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long id, long mtCore, long convertAssembleId,
			long validDossierId, String validDossierIdCTN, String validDossierNo, long vehicleTypeCertificateId,
			long dossierId, String dossierIdCTN, String dossierNo, String dossierStatus, String previousExpireDate,
			String certificateRecordNo, String certificateRecordDate, String certificateRecordExpireDate,
			int expiredStatus, String vehicleClass, String certifiedVehicleType, String certifiedVehicleTypeDescription,
			String certifiedTrademark, String certifiedTrademarkName, String certifiedCommercialName,
			String certifiedModelCode, String productionCountry, String safetytestReportNo, String safetytestReportDate,
			String emissionTestReportNo, String emissionTestReportDate, String commonSafetyStandard,
			String commonSafetyDescription, String emissionStandard, String emissionDescription,
			String othertestReportNo, String othertestReportDate, String copReportNo, String copReportDate,
			String copReportExpireDate, String validRequestNo, String validRequestDate, String validInspectionRecordNo,
			String validInspectionRecordDate, long validCorporationId, long validInspectorId, String validInspectorName,
			String validRemarks, String validInspectionNote, long deliverableFileEntryId, long documentFileEntryId,
			String syncDate, String typeUpdate) {

		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			VRExpiredCertificateActions actions = new VRExpiredCertificateActionsImpl();

			Date _previousExpireDate = DateTimeUtils.stringToDate(previousExpireDate);
			Date _certificateRecordExpireDate = DateTimeUtils.stringToDate(certificateRecordExpireDate);
			Date _certificateRecordDate = DateTimeUtils.stringToDate(certificateRecordDate);
			Date _safetytestReportDate = DateTimeUtils.stringToDate(safetytestReportDate);
			Date _emissionTestReportDate = DateTimeUtils.stringToDate(emissionTestReportDate);
			Date _othertestReportDate = DateTimeUtils.stringToDate(othertestReportDate);
			Date _copReportDate = DateTimeUtils.stringToDate(copReportDate);
			Date _copReportExpireDate = DateTimeUtils.stringToDate(copReportExpireDate);
			Date _validRequestDate = DateTimeUtils.stringToDate(validRequestDate);
			Date _validInspectionRecordDate = DateTimeUtils.stringToDate(validInspectionRecordDate);
			Date _syncDate = DateTimeUtils.stringToDate(syncDate);

			result = actions.updateVRExpiredCertificate(id, mtCore, convertAssembleId, validDossierId,
					validDossierIdCTN, validDossierNo, vehicleTypeCertificateId, dossierId, dossierIdCTN, dossierNo,
					dossierStatus, _previousExpireDate, certificateRecordNo, _certificateRecordDate,
					_certificateRecordExpireDate, expiredStatus, vehicleClass, certifiedVehicleType,
					certifiedVehicleTypeDescription, certifiedTrademark, certifiedTrademarkName,
					certifiedCommercialName, certifiedModelCode, productionCountry, safetytestReportNo,
					_safetytestReportDate, emissionTestReportNo, _emissionTestReportDate, commonSafetyStandard,
					commonSafetyDescription, emissionStandard, emissionDescription, othertestReportNo,
					_othertestReportDate, copReportNo, _copReportDate, _copReportExpireDate, validRequestNo,
					_validRequestDate, validInspectionRecordNo, _validInspectionRecordDate, validCorporationId,
					validInspectorId, validInspectorName, validRemarks, validInspectionNote, deliverableFileEntryId,
					documentFileEntryId, _syncDate, typeUpdate, company);

			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil
					.errorMessage("Can't update VRExpiredCertificate - " + e.getClass().getName()).toJSONString())
					.build();
		}
	}

	@Override
	public Response findByPrimary(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, long id) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			VRExpireCertificate vrExpireCertificate = VRExpireCertificateLocalServiceUtil.fetchVRExpireCertificate(id);
			if (vrExpireCertificate != null) {
				result = BusinessUtil.object2Json_originColumnName(vrExpireCertificate,
						VRExpireCertificateModelImpl.class, StringPool.BLANK);
			}

			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			return Response
					.status(500).entity(VRRestUtil
							.errorMessage("Can't get VRExpiredCertificate - " + e.getClass().getName()).toJSONString())
					.build();
		}
	}

}
