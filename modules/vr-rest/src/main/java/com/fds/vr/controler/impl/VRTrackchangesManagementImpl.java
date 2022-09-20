/**
 * 
 */
package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRTrackchangesAction;
import com.fds.vr.business.action.impl.VRTrackchangesActionImpl;
import com.fds.vr.controler.VRTrackchangesManagement;
import com.fds.vr.model.VRTrackchangesBeanParam;
import com.fds.vr.util.VRRestUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

/**
 * @author ddung
 *
 */
public class VRTrackchangesManagementImpl implements VRTrackchangesManagement {
	@Override
	public Response findVRTrackchangesApplicantProfile(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String applicantCode) {
		VRTrackchangesAction action = new VRTrackchangesActionImpl();
		JSONObject result = action.findByApplicantCode(applicantCode, serviceContext);

		if (result != null && result.length() > 0) {
			return Response.status(200).entity(result.toJSONString()).build();
		} else {
			return Response.status(204).entity(VRRestUtil.errorMessage("No content").toJSONString()).build();
		}
	}

	@Override
	public Response findVRTrackchangesProductionPlant(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String productionPlantCode) {
		VRTrackchangesAction action = new VRTrackchangesActionImpl();
		JSONObject result = action.findByProductionPlantCode(productionPlantCode, serviceContext);

		if (result != null && result.length() > 0) {
			return Response.status(200).entity(result.toJSONString()).build();
		} else {
			return Response.status(204).entity(VRRestUtil.errorMessage("No content").toJSONString()).build();
		}
	}

	@Override
	public Response findVRTrackchangesDossier(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRTrackchangesBeanParam vrTrackchangesBeanParam) {
		VRTrackchangesAction action = new VRTrackchangesActionImpl();
		JSONObject result = action.findByDossierIdOrDossierIdCTN(vrTrackchangesBeanParam.getDossierIdCTN(),
				vrTrackchangesBeanParam.getDossierId(), vrTrackchangesBeanParam.getContentFileTemplate(),
				serviceContext);

		if (result != null && result.length() > 0) {
			return Response.status(200).entity(result.toJSONString()).build();
		} else {
			return Response.status(204).entity(VRRestUtil.errorMessage("No content").toJSONString()).build();
		}
	}

}
