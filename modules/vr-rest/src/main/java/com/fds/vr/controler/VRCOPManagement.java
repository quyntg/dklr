package com.fds.vr.controler;

import com.fds.vr.model.VRCOPReportRepositoryBeanParam;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author trungnt
 *
 */
@Path("/cop/")
public interface VRCOPManagement {
	@GET
	@Path("/reportrepository/year")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Response findReportRepositoryYear(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @BeanParam VRCOPReportRepositoryBeanParam query);

	@GET
	@Path("/reportrepository/{dossierId}/{mtCore}")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Response findByDossierId(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @PathParam("dossierId") long dossierId,
			@PathParam("mtCore") long mtCore);

	@GET
	@Path("/reportrepository/count")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Response countReportRepositories(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @BeanParam VRCOPReportRepositoryBeanParam query);

	@POST
	@Path("/reportrepository/{year}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_PLAIN,
			MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_PLAIN,
			MediaType.APPLICATION_FORM_URLENCODED })
	public Response findReportRepository(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @PathParam("year") Integer year,
			@BeanParam VRCOPReportRepositoryBeanParam query, @FormParam("payload") String payload);

	@GET
	@Path("/reportrepository")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response getVRCOPReportRepository(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @DefaultValue(" ") @QueryParam("mtcore") long mtCore,
			@DefaultValue(" ") @QueryParam("copreportno") String copReportNo);

	@GET
	@Path("/reportrepository/productionplant")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response findByMtCore_ProductionPlantCode_COPClassification(@Context HttpServletRequest request,
			@Context HttpHeaders header, @Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @BeanParam VRCOPReportRepositoryBeanParam query);

	@GET
	@Path("/roductionplant/employee")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response getVRCOPProductionPlantEmployeeList(@Context HttpServletRequest request,
			@Context HttpHeaders header, @Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @DefaultValue(" ") @QueryParam("mtcore") long mtCore,
			@DefaultValue(" ") @QueryParam("copreportno") String copReportNo);

	@GET
	@Path("/productionplant/equipment")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response getVRCOPProductionPlantEquipmentList(@Context HttpServletRequest request,
			@Context HttpHeaders header, @Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @DefaultValue(" ") @QueryParam("mtcore") long mtCore,
			@DefaultValue(" ") @QueryParam("copreportno") String copReportNo);

	@GET
	@Path("/productionplant/prodequipment")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response getVRCOPProductionPlantProdEquipmentList(@Context HttpServletRequest request,
			@Context HttpHeaders header, @Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @DefaultValue(" ") @QueryParam("mtcore") long mtCore,
			@DefaultValue(" ") @QueryParam("copreportno") String copReportNo);

	@GET
	@Path("/producttype")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response getVRCOPProductTypeList(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @DefaultValue(" ") @QueryParam("mtcore") long mtCore,
			@DefaultValue(" ") @QueryParam("copreportno") String copReportNo);

	@GET
	@Path("/reportattach")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response getVRCOPReportAttachList(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @DefaultValue(" ") @QueryParam("mtcore") long mtCore,
			@DefaultValue(" ") @QueryParam("copreportno") String copReportNo);

	@GET
	@Path("/datatemplate")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response getVRCOPDataTemplate(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @DefaultValue(" ") @QueryParam("mtcore") long mtCore,
			@DefaultValue(" ") @QueryParam("copreportno") String copReportNo);

	@GET
	@Path("/productionplant/prodequipment/{dossierId}/{mtCore}")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response findVRCOPProductionPlantProdEquipmentByDossierId(@Context HttpServletRequest request,
			@Context HttpHeaders header, @Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @PathParam("dossierId") long dossierId,
			@PathParam("mtCore") long mtCore, @DefaultValue("0") @QueryParam("start") int start,
			@DefaultValue("10") @QueryParam("end") int end);

}
