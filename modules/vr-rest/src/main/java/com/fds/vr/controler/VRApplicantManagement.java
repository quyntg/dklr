package com.fds.vr.controler;

import com.fds.vr.model.VRApplicantProfileBeanParam;
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
 * @author trungnt
 *
 */
public interface VRApplicantManagement {

	@GET
	@Path("/applicant/profile/search")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findApplicantProfile(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @BeanParam VRApplicantProfileBeanParam query);

	@GET
	@Path("/applicant/profile/count")
	@Produces(MediaType.APPLICATION_JSON)
	public Response countApplicantProfile(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @BeanParam VRApplicantProfileBeanParam query);

	@GET
	@Path("/applicant/profile/detail")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findApplicantProfileDetail(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @BeanParam VRApplicantProfileBeanParam query);
	
	@GET
	@Path("/applicant/profile/{applicantCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findByApplicantCode(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @PathParam("applicantCode") String applicantCode);

}
