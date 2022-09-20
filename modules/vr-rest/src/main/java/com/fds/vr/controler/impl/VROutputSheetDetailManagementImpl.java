package com.fds.vr.controler.impl;

import com.fds.vr.business.action.impl.VROutputSheetDetailActionImpl;
import com.fds.vr.controler.VROutputSheetDetailManagement;
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
 * @author trungnt
 *
 */

public class VROutputSheetDetailManagementImpl implements VROutputSheetDetailManagement{
	private Log _log = LogFactoryUtil.getLog(VROutputSheetDetailManagementImpl.class);
	@Override
	public Response getVROutputSheetDetail(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, Long id) {
		try {
			VROutputSheetDetailActionImpl actionImpl = new VROutputSheetDetailActionImpl();
			JSONObject result = actionImpl.getVROutputSheetDetail(id);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get vroutputsheetdetail").toJSONString())
					.build();
		}
	}
}
