/**
 * 
 */
package com.fds.vr.controler;

import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author ddung
 *
 */
public interface VRMethodOfIssueManagement {
	@GET
	@Path("/methodofissue")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMethodOfIssue(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @QueryParam("certifiedAssemblyType") String certifiedAssemblyType,
			@QueryParam("productionPlantCode") String productionPlantCode,
			@QueryParam("vehicleClass") String vehicleClass,
			@QueryParam("applicantProfileId") long applicantProfileId);
}
