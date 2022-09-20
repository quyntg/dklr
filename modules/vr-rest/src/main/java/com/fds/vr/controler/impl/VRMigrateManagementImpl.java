/**
 * 
 */
package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRMigrateMappingsAction;
import com.fds.vr.business.action.VRMigrateReviewAction;
import com.fds.vr.business.action.VRMigrateTaskAction;
import com.fds.vr.business.action.impl.VRMigrateMappingsActionImpl;
import com.fds.vr.business.action.impl.VRMigrateReviewActionImpl;
import com.fds.vr.business.action.impl.VRMigrateTaskActionImpl;
import com.fds.vr.controler.VRMigrateManagement;
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

/**
 * @author ddung
 *
 */
public class VRMigrateManagementImpl implements VRMigrateManagement {

	private static final Log _log = LogFactoryUtil.getLog(VRMigrateManagementImpl.class);

	@Override
	public Response findVRMigrateTasks(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, int start, int end) {
		try {
			VRMigrateTaskAction vrMigrateTaskAction = new VRMigrateTaskActionImpl();

			JSONObject result = vrMigrateTaskAction.findVRMigrateTasks(start, end);

			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}
	}

	@Override
	public Response findVRMigrateMappings(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, int start, int end, int taskMigrationId,
			int dataGroupId, int sequenceNo) {
		try {
			VRMigrateMappingsAction vrMigrateMappingsAction = new VRMigrateMappingsActionImpl();

			JSONObject result = vrMigrateMappingsAction.findByTaskId_DataGroupId_SeqNo(taskMigrationId, dataGroupId,
					sequenceNo, start, end);

			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}
	}

	@Override
	public Response findVRMigrateReviews(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, int start, int end, int taskMigrationId) {
		try {
			VRMigrateReviewAction vrMigrateReviewAction = new VRMigrateReviewActionImpl();

			JSONObject result = vrMigrateReviewAction.findByTaskMigrateId(taskMigrationId, start, end);

			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}
	}

}
