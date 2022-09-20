/**
 * 
 */
package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRHistoryProfileAction;
import com.fds.vr.business.action.impl.VRHistoryProfileActionImpl;
import com.fds.vr.controler.VRHistoryProfileManagement;
import com.fds.vr.model.VRHistoryProfileBeanParam;
import com.fds.vr.util.VRRestUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
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
public class VRHistoryProfileManagementImpl implements VRHistoryProfileManagement {

	@Override
	public Response findVRHistoryProfileApplicantCode(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String applicantCode) {
		VRHistoryProfileAction action = new VRHistoryProfileActionImpl();
		JSONObject result = action.findVRHistoryProfileApplicantCode(applicantCode, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, serviceContext);

		if (result != null && result.length() > 0) {
			return Response.status(200).entity(result.toJSONString()).build();
		} else {
			return Response.status(204).entity(VRRestUtil.errorMessage("No content").toJSONString()).build();
		}
	}

	@Override
	public Response findVRHistoryProfileDossier(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRHistoryProfileBeanParam vrHistoryProfile) {
		VRHistoryProfileAction action = new VRHistoryProfileActionImpl();
		JSONObject result = action.findVRHitoryProfiles(vrHistoryProfile.getApplicantCode(),
				vrHistoryProfile.getProductionPlantCode(), vrHistoryProfile.getDossierId(),
				vrHistoryProfile.getDossierIdCTN(), vrHistoryProfile.getDossierNo(), vrHistoryProfile.getContentType(),
				vrHistoryProfile.getContentFileTemplate(), vrHistoryProfile.getStart(), vrHistoryProfile.getEnd());

		if (result != null && result.length() > 0) {
			return Response.status(200).entity(result.toJSONString()).build();
		} else {
			return Response.status(204).entity(VRRestUtil.errorMessage("No content").toJSONString()).build();
		}
	}

}
