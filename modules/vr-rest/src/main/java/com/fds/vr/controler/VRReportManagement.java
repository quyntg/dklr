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
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author ddung
 *
 */
public interface VRReportManagement {

	@GET
	@Path("/report/{rptDescription}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response reportData(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @PathParam("rptDescription") String rptDescription, String params);

	@GET
	@Path("/reportcategory/rptgroup/{rptGroup}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findByRPTGroup(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @PathParam("rptGroup") String rptGroup);

	@GET
	@Path("/reportcategory/rptlevel/{rptLevel}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findByRPTLevel(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @PathParam("rptLevel") int rptLevel);

	@GET
	@Path("/reportcategory/rptcode/{rptCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findByRPTCode(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @PathParam("rptCode") String rptCode);

}
