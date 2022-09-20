package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRRPDossierStatisticsAction;
import com.fds.vr.business.action.impl.VRRPDossierStatisticsActionImpl;
import com.fds.vr.controler.VRRPDossierStatisticsManagement;
import com.fds.vr.util.VRRestUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

public class VRRPDossierStatisticsManagementImpl implements VRRPDossierStatisticsManagement {

	private static final Log _log = LogFactoryUtil.getLog(VRRPDossierStatisticsManagementImpl.class);

	@Override
	public Response getVRRPDossierStatistics(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String dossierIdCTN) {
		try {
			VRRPDossierStatisticsAction vrrpDossierStatisticsAction = new VRRPDossierStatisticsActionImpl();
			JSONObject result = vrrpDossierStatisticsAction.findBydossierIdCTN(dossierIdCTN);

			return Response.status(200).entity(result.toString()).build();
		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}
	}

}
