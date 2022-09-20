/**
 * 
 */
package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRReportCategoryActions;
import com.fds.vr.business.action.impl.VRReportCategoryActionsImpl;
import com.fds.vr.business.report.ReportBusinessImpl;
import com.fds.vr.controler.VRReportManagement;
import com.fds.vr.util.VRRestUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBusUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.File;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/**
 * @author ddung
 *
 */
public class VRReportManagementImpl implements VRReportManagement {

	private static final Log _log = LogFactoryUtil.getLog(VRReportManagementImpl.class);

	@Override
	public Response reportData(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String rptDescription, String params) {

		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			result = ReportBusinessImpl.report(rptDescription, params);
			Message message = new Message();

			message.put("formReport", result.getString("formReport"));

			message.put("formData", result.getString("formData"));

			message.setResponseId(result.getString("primaryKey"));
			message.setResponseDestinationName("jasper/engine/preview/callback");

			String previewResponse = (String) MessageBusUtil.sendSynchronousMessage("jasper/engine/preview/destination",
					message, 10000);

			File file = new File(previewResponse);

			ResponseBuilder responseBuilder = Response.ok((Object) file);

			responseBuilder.header("Content-Disposition", "attachment; filename=\"" + file.getName() + "\"");
			responseBuilder.header("Content-Type", "application/pdf");

			return responseBuilder.build();
		} catch (Exception e) {
			return Response.status(500).entity("error").build();
		}
	}

	@Override
	public Response findByRPTGroup(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String rptGroup) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			VRReportCategoryActions actions = new VRReportCategoryActionsImpl();
			result = actions.findByRptGroup(rptGroup, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get data").toJSONString()).build();
		}
	}

	@Override
	public Response findByRPTLevel(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, int rptLevel) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			VRReportCategoryActions actions = new VRReportCategoryActionsImpl();
			result = actions.findByRptLevel(rptLevel, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get data").toJSONString()).build();
		}
	}

	@Override
	public Response findByRPTCode(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String rptCode) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			VRReportCategoryActions actions = new VRReportCategoryActionsImpl();
			result = actions.findByRptCode(rptCode);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get data").toJSONString()).build();
		}
	}

}
