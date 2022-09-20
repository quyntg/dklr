package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRIssueAction;
import com.fds.vr.business.action.impl.VRIssueActionImpl;
import com.fds.vr.business.model.VRIssueInspectionRecord;
import com.fds.vr.business.model.impl.VRIssueInspectionRecordModelImpl;
import com.fds.vr.business.service.VRIssueInspectionRecordLocalServiceUtil;
import com.fds.vr.controler.VRIssueManagement;
import com.fds.vr.model.VRIssueBeanParam;
import com.fds.vr.service.util.BusinessUtil;
import com.fds.vr.util.VRRestUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/**
 * @author trungnt
 *
 */

public class VRIssueManagementImpl implements VRIssueManagement {

	@Override
	public Response countVRIssue(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, VRIssueBeanParam query) {
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);

			VRIssueActionImpl actionImpl = new VRIssueActionImpl();

			return Response.status(200).entity(actionImpl.countVRIssue(user, serviceContext, params)).build();

		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't count vrissue").toJSONString()).build();
		}
	}

	@Override
	public Response searchVRIssue(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, VRIssueBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);

			VRIssueActionImpl actionImpl = new VRIssueActionImpl();

			result = actionImpl.findVRIssue(user, serviceContext, params);

			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't search vrissue").toJSONString()).build();
		}
	}

	private Log _log = LogFactoryUtil.getLog(VRIssueManagementImpl.class.getName());

	@Override
	public Response doExportVRIssue(HttpServletRequest request, HttpServletResponse response, HttpHeaders header,
			Company company, Locale locale, User user, ServiceContext serviceContext, VRIssueBeanParam query,
			String headercodes, String headerlabels) {
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);

			VRIssueActionImpl actionImpl = new VRIssueActionImpl();

			File file = actionImpl.doExportVRIssue(user, serviceContext, params, headercodes, headerlabels);

			if (file == null) {
				return Response.status(500).entity(VRRestUtil.errorMessage("Can't export vrissue").toJSONString())
						.build();
			} else {
				InputStream in = new FileInputStream(file);
				ServletResponseUtil.sendFile(request, response, file.getName(), in, "application/download");
				in.close();

				ResponseBuilder responseBuilder = Response.ok((Object) file);
				//
				// responseBuilder.header("Content-Disposition", "attachment;
				// filename=\"" + file.getName() + "\"")
				// .header("Content-Type", "application/zip");
				//
				return responseBuilder.build();
			}

		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get vrvehiclerecord").toJSONString())
					.build();
		}
	}

	@Override
	public Response findByPrimaryKey(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, long issueId) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			VRIssueAction action = new VRIssueActionImpl();

			result = action.findByPrimaryKey(user, serviceContext, issueId);

			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get vr_issue").toJSONString()).build();
		}
	}

	@Override
	public Response updateIssueInspectionrecord(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long dossierId, String data) {
		try {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject(data);
			_log.info("=====>JSONObject"+jsonObject);
			List<VRIssueInspectionRecord> vrIssueInspectionRecords = VRIssueInspectionRecordLocalServiceUtil
					.updateVRIssueInspectionRecord(jsonObject, dossierId);
			JSONArray array = JSONFactoryUtil.createJSONArray();
			for (VRIssueInspectionRecord vrIssueInspectionRecord : vrIssueInspectionRecords) {
				try {
					JSONObject obj = BusinessUtil.object2Json_originColumnName(vrIssueInspectionRecord,
							VRIssueInspectionRecordModelImpl.class, StringPool.BLANK);
					array.put(obj);
				} catch (JSONException e) {
				}
			}

			return Response.status(200).entity(array.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't update VRIssueInspectionRecord").toJSONString()).build();
		}
	}

}
