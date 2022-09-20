/**
 * 
 */
package com.fds.vr.controler;

import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author ddung
 *
 */
public interface VRExpiredCertificateManagement {
	@GET
	@Path("/expiredcertificates/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findByPrimary(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @PathParam("id") long id);

	@POST
	@Path("/expiredcertificate")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response updateExpireCertificate(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @FormParam("id") long id, @FormParam("mtCore") long mtCore,
			@FormParam("convertAssembleId") long convertAssembleId, @FormParam("validDossierId") long validDossierId,
			@FormParam("validDossierIdCTN") String validDossierIdCTN,
			@FormParam("validDossierNo") String validDossierNo,
			@FormParam("vehicleTypeCertificateId") long vehicleTypeCertificateId,
			@FormParam("dossierId") long dossierId, @FormParam("dossierIdCTN") String dossierIdCTN,
			@FormParam("dossierNo") String dossierNo, @FormParam("dossierStatus") String dossierStatus,
			@FormParam("previousExpireDate") String previousExpireDate,
			@FormParam("certificateRecordNo") String certificateRecordNo,
			@FormParam("certificateRecordDate") String certificateRecordDate,
			@FormParam("certificateRecordExpireDate") String certificateRecordExpireDate,
			@FormParam("expiredStatus") int expiredStatus, @FormParam("vehicleClass") String vehicleClass,
			@FormParam("certifiedVehicleType") String certifiedVehicleType,
			@FormParam("certifiedVehicleTypeDescription") String certifiedVehicleTypeDescription,
			@FormParam("certifiedTrademark") String certifiedTrademark,
			@FormParam("certifiedTrademarkName") String certifiedTrademarkName,
			@FormParam("certifiedCommercialName") String certifiedCommercialName,
			@FormParam("certifiedModelCode") String certifiedModelCode,
			@FormParam("productionCountry") String productionCountry,
			@FormParam("safetytestReportNo") String safetytestReportNo,
			@FormParam("safetytestReportDate") String safetytestReportDate,
			@FormParam("emissionTestReportNo") String emissionTestReportNo,
			@FormParam("emissionTestReportDate") String emissionTestReportDate,
			@FormParam("commonSafetyStandard") String commonSafetyStandard,
			@FormParam("commonSafetyDescription") String commonSafetyDescription,
			@FormParam("emissionStandard") String emissionStandard,
			@FormParam("emissionDescription") String emissionDescription,
			@FormParam("othertestReportNo") String othertestReportNo,
			@FormParam("othertestReportDate") String othertestReportDate, @FormParam("copReportNo") String copReportNo,
			@FormParam("copReportDate") String copReportDate,
			@FormParam("copReportExpireDate") String copReportExpireDate,
			@FormParam("validRequestNo") String validRequestNo, @FormParam("validRequestDate") String validRequestDate,
			@FormParam("validInspectionRecordNo") String validInspectionRecordNo,
			@FormParam("validInspectionRecordDate") String validInspectionRecordDate,
			@FormParam("validCorporationId") long validCorporationId,
			@FormParam("validInspectorId") long validInspectorId,
			@FormParam("validInspectorName") String validInspectorName, @FormParam("validRemarks") String validRemarks,
			@FormParam("validInspectionNote") String validInspectionNote,
			@FormParam("deliverableFileEntryId") long deliverableFileEntryId,
			@FormParam("documentFileEntryId") long documentFileEntryId, @FormParam("syncDate") String syncDate,
			@FormParam("typeUpdate") String typeUpdate);
}
