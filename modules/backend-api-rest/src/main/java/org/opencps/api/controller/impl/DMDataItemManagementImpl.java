package org.opencps.api.controller.impl;

import com.fds.vr.filterconfig.action.DMDataAction;
import com.fds.vr.filterconfig.action.impl.DMDataActionImpl;
import com.fds.vr.filterconfig.xmlmodel.DMDataItemModel;
import com.fds.vr.filterconfig.xmlmodel.DMDataItemResultModel;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ArrayUtil;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

import org.apache.commons.httpclient.util.HttpURLConnection;
import org.opencps.api.controller.DMDataItemManagement;
import org.opencps.api.controller.exception.ErrorMsg;
import org.opencps.auth.api.exception.UnauthenticationException;
import org.opencps.auth.api.exception.UnauthorizationException;

public class DMDataItemManagementImpl implements DMDataItemManagement {

	private Log _log = LogFactoryUtil.getLog(DMDataItemManagementImpl.class);

	@Override
	public Response getDMDataItem(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String dataGroupId,String level ) {
//		JSONObject results = JSONFactoryUtil.createJSONObject(); 
		
		DMDataAction actions = new DMDataActionImpl();
		
		try {
			
			_log.debug("===getDMDataItem===");
			_log.debug("dataGroupId:"+dataGroupId);
			_log.debug("level:"+level);

			List<DMDataItemModel> list = actions.getDMData(ArrayUtil.append(new long[0], Long.parseLong(dataGroupId)), ArrayUtil.append(new int[0], Integer.parseInt(level)));
			
			DMDataItemResultModel results = new DMDataItemResultModel();
			results.setTotal(list.size());
			results.getData().addAll(list);
			

			return Response.status(200).entity(results).build();

		} catch (Exception e) {
			
			_log.error(e);
			ErrorMsg error = new ErrorMsg();

			if (e instanceof UnauthenticationException) {
				error.setMessage("Non-Authoritative Information.");
				error.setCode(HttpURLConnection.HTTP_NOT_AUTHORITATIVE);
				error.setDescription("Non-Authoritative Information.");

				return Response.status(HttpURLConnection.HTTP_NOT_AUTHORITATIVE).entity(error).build();
			} else {
				if (e instanceof UnauthorizationException) {
					error.setMessage("Unauthorized.");
					error.setCode(HttpURLConnection.HTTP_UNAUTHORIZED);
					error.setDescription("Unauthorized.");

					return Response.status(HttpURLConnection.HTTP_UNAUTHORIZED).entity(error).build();

				} else {

					error.setMessage("Internal Server Error");
					error.setCode(HttpURLConnection.HTTP_INTERNAL_ERROR);
					error.setDescription(e.getMessage());

					return Response.status(HttpURLConnection.HTTP_INTERNAL_ERROR).entity(error).build();

				}
			}
		}
	}


}
