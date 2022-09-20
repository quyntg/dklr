/**
 * 
 */
package com.fds.vr.controler;

import com.fds.vr.model.VRTrackchangesBeanParam;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.BeanParam;
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
public interface VRTrackchangesManagement {
	@GET
	@Path("/trackchanges/applicantprofile/{applicantcode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findVRTrackchangesApplicantProfile(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @PathParam("applicantcode") String applicantCode);

	@GET
	@Path("/trackchanges/productionplant/{productionplantcode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findVRTrackchangesProductionPlant(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @PathParam("productionplantcode") String productionPlantCode);
	
	@GET
	@Path("/trackchanges/dossier")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findVRTrackchangesDossier(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @BeanParam VRTrackchangesBeanParam vrTrackchangesBeanParam);
}
