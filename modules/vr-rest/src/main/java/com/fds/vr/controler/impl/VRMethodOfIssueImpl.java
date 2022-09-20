/**
 * 
 */
package com.fds.vr.controler.impl;

import com.fds.vr.business.model.VRMethodOfIssue;
import com.fds.vr.business.model.impl.VRMethodOfIssueModelImpl;
import com.fds.vr.business.service.VRMethodOfIssueLocalServiceUtil;
import com.fds.vr.controler.VRMethodOfIssueManagement;
import com.fds.vr.service.util.BusinessUtil;
import com.fds.vr.util.VRRestUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringPool;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

/**
 * @author ddung
 *
 */
public class VRMethodOfIssueImpl implements VRMethodOfIssueManagement {
	private static final Log _log = LogFactoryUtil.getLog(VRMethodOfIssueImpl.class);

	@Override
	public Response getMethodOfIssue(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String certifiedAssemblyType, String productionPlantCode,
			String vehicleClass, long applicantProfileId) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			VRMethodOfIssue vrMethodOfIssue = VRMethodOfIssueLocalServiceUtil
					.fetchByCertifiedAssemblyTypeProductionPlantCodeVehicleClassApplicantProfileId(
							certifiedAssemblyType, productionPlantCode, vehicleClass, applicantProfileId);

			if (vrMethodOfIssue != null) {
				result = BusinessUtil.object2Json_originColumnName(vrMethodOfIssue, VRMethodOfIssueModelImpl.class,
						StringPool.BLANK);
			}
			return Response.status(200).entity(result.toJSONString()).build();

		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't count VRMethodOfIssue").toJSONString())
					.build();
		}
	}

}
