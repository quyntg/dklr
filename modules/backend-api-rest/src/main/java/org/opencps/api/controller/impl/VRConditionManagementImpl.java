package org.opencps.api.controller.impl;

import com.fds.vr.filterconfig.action.VRConditionAction;
import com.fds.vr.filterconfig.action.impl.VRConditionActionImpl;
import com.fds.vr.filterconfig.xmlmodel.VRConditionModel;
import com.fds.vr.filterconfig.xmlmodel.VRConditionResultModel;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

import org.apache.commons.httpclient.util.HttpURLConnection;
import org.opencps.api.controller.VRConditionManagement;
import org.opencps.api.controller.exception.ErrorMsg;
import org.opencps.auth.api.exception.UnauthenticationException;
import org.opencps.auth.api.exception.UnauthorizationException;

public class VRConditionManagementImpl implements VRConditionManagement {

	private Log _log = LogFactoryUtil.getLog(VRConditionManagementImpl.class);

	@Override
	public Response getVRConditions(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, int start,int end ) {
		
		VRConditionAction actions = new VRConditionActionImpl();
		
		try {
			
			_log.debug("===getVRCondition===");
			_log.debug("start:"+start);
			_log.debug("end:"+end);

			List<VRConditionModel> list = actions.getVRConditions(start, end);
			
			VRConditionResultModel results = new VRConditionResultModel();
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
	
	@Override
	public Response getVRCondition(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String specificationCode ) {
		
		VRConditionAction actions = new VRConditionActionImpl();
		
		try {
			
			_log.debug("===getVRCondition===");
			_log.debug("specificationCode:" + specificationCode);

			VRConditionModel vrCondition = actions.getVRCondition(specificationCode);
			VRConditionResultModel result = new VRConditionResultModel();
			result.getData().add(vrCondition);
			
			_log.debug("vrCondition:" + specificationCode);

			return Response.status(200).entity(result).build();

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
	
	@Override
	public Response getVRConditionByFilterModuleCode(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String filterModuleCode ) {
		
		VRConditionAction actions = new VRConditionActionImpl();
		
		try {
			
			_log.debug("===getVRCondition===");
			_log.debug("filterModuleCode:"+filterModuleCode);
			

			List<VRConditionModel> list = actions.getVRConditionByFilterModuleCode(filterModuleCode);
			
			VRConditionResultModel results = new VRConditionResultModel();
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
