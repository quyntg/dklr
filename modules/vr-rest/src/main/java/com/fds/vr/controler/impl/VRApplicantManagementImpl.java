package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRApplicantProfileAction;
import com.fds.vr.business.action.impl.VRApplicantProfileActionImpl;
import com.fds.vr.controler.VRApplicantManagement;
import com.fds.vr.model.VRApplicantProfileBeanParam;
import com.fds.vr.util.VRRestUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.LinkedHashMap;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

/**
 * @author trungnt
 *
 */
public class VRApplicantManagementImpl implements VRApplicantManagement {
	private Log _log = LogFactoryUtil.getLog(VRApplicantManagementImpl.class);

	@Override
	public Response findApplicantProfile(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, VRApplicantProfileBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			VRApplicantProfileActionImpl actionImpl = new VRApplicantProfileActionImpl();
			result = actionImpl.findVRApplicantProfile(user, serviceContext, params);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get vrappicantprofile").toJSONString())
					.build();
		}
	}

	@Override
	public Response findApplicantProfileDetail(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRApplicantProfileBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			VRApplicantProfileActionImpl actionImpl = new VRApplicantProfileActionImpl();
			result = actionImpl.findVRApplicantProfileDetail(user, serviceContext, params);

			return Response.status(200).entity(result.toJSONString()).build();

		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get vrappicantprofile").toJSONString())
					.build();
		}
	}

	@Override
	public Response countApplicantProfile(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRApplicantProfileBeanParam query) {
		long total = 0;
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			VRApplicantProfileActionImpl actionImpl = new VRApplicantProfileActionImpl();
			total = actionImpl.countVrApplicantProfile(user, serviceContext, params);
			return Response.status(200).entity(total).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get vrappicantprofile").toJSONString())
					.build();
		}
	}

	@Override
	public Response findByApplicantCode(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String applicantCode) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			VRApplicantProfileAction action = new VRApplicantProfileActionImpl();
			result = action.findByApplicantCode(user, serviceContext, applicantCode);

			return Response.status(200).entity(result.toJSONString()).build();

		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get vrappicantprofile").toJSONString())
					.build();
		}
	}

}
