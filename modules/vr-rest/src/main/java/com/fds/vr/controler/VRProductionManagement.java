package com.fds.vr.controler;

import com.fds.vr.model.VRProductTypeApiModel;
import com.fds.vr.model.VRProductionClassificationApiModel;
import com.fds.vr.model.VRProductionClassificationBeanParam;
import com.fds.vr.model.VRProductionPlantApiModel;
import com.fds.vr.model.VRProductionPlantBeanParam;
import com.fds.vr.model.VRProductionPlantEmployeeApiModel;
import com.fds.vr.model.VRProductionPlantEquipmentBeanParam;
import com.fds.vr.model.VRProductionPlantProdEquipmentApiModel;
import com.fds.vr.model.VRProductionPlantSupplierBeanParam;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.swagger.annotations.ApiOperation;

/**
 * @author trungnt
 *
 */
@Path("/production/")
public interface VRProductionManagement {

	@POST
	@Path("/classification/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	//@ApiOperation(value = "create VRProductionClassification", tags={ "vrproductionclassificationapimodel"})
	public Response createVRProductionClassification(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, String data);
	@POST
	@Path("/plant/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "create VRProductionPlant", tags={ "vrproductionplantapimodel"})
	public Response createVRProductionPlant(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRProductionPlantApiModel model);
	
	
	@POST
	@Path("/employee/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "create VRProductionPlantEmployee", tags={ "vrproductionplantemployeeapimodel"})
	public Response createVRProductionPlantEmployee(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRProductionPlantEmployeeApiModel model);

	@POST
	@Path("/equipment/create")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Response createVRProductionPlantEquiptment(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, String data);
	
	@POST
	@Path("/prodequipment/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "create VRProductionPlantProdEquiment", tags={ "vrproductionplantprodequipmentapimodel"})
	public Response createVRProductionPlantProdEquiment(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRProductionPlantProdEquipmentApiModel model);


	@POST
	@Path("/type/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "create VRProductType", tags={ "vrproducttypeapimodel"})
	public Response createVRProductType(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRProductTypeApiModel model);

	@DELETE
	@Path("/equipment/remove")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteProductionPlantEquipment(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext,@QueryParam("id") long id);
	
	
	@GET
	@Path("/plant/search")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findProductionPlant(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @BeanParam VRProductionPlantBeanParam query);
	
	@GET
	@Path("/plant/count")
	@Produces(MediaType.APPLICATION_JSON)
	public Response countProductionPlant(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @BeanParam VRProductionPlantBeanParam query);

	@GET
	@Path("/plantsupplier/search")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findProductionPlantSupplier(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @BeanParam VRProductionPlantSupplierBeanParam query);

	@GET
	@Path("/classification/{productionplantcode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findVRProductclassification(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext,
			@DefaultValue("") @PathParam("productionplantcode") String productionPlantCode);
	
	@GET
	@Path("/plant/{productionplantcode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getVRProductionPlant(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext,
			@DefaultValue("") @PathParam("productionplantcode") String productionplantcode);
	
	@GET
	@Path("/classification/search")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findVRProductclassification(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @BeanParam VRProductionClassificationBeanParam query);
	
	@GET
	@Path("/employee/{productionplantcode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findVRProductionPlantEmployee(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext,
			@DefaultValue("") @PathParam("productionplantcode") String productionPlantCode);
	
	@GET
	@Path("/equipment/{productionplantcode}/{productclassificationcode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findVRProductionPlantEquipment(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext,
			@DefaultValue("") @PathParam("productionplantcode") String productionPlantCode,
			@DefaultValue("") @PathParam("productclassificationcode") String productClassificationCode);
	
	
	@GET
	@Path("/prodequipment/{productionplantcode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findVRProductionPlantProdEquipment(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext,
			@DefaultValue("") @PathParam("productionplantcode") String productionPlantCode);
	
	@GET
	@Path("/type/{productionplantcode}/{productclassificationcode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findVRProductType(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext,
			@DefaultValue("") @PathParam("productionplantcode") String productionPlantCode,
			@DefaultValue("") @PathParam("productclassificationcode") String productClassificationCode);
	
	@GET
	@Path("/equipment/search")
	@Produces(MediaType.APPLICATION_JSON)
	public Response searchVRProductionPlantEquipment(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext,
			@BeanParam VRProductionPlantEquipmentBeanParam query);
	
	@PUT
	@Path("/classification/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "update VRProductionClassification", tags={ "vrproductionclassificationapimodel"})
	public Response updateVRProductionClassification(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRProductionClassificationApiModel model);
	
	@PUT
	@Path("/plant/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "update VRProductionPlant", tags={ "vrproductionplantapimodel"})
	public Response updateVRProductionPlant(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRProductionPlantApiModel model);
	
	@PUT
	@Path("/employee/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "update VRProductionPlantEmployee", tags={ "vrproductionplantemployeeapimodel"})
	public Response updateVRProductionPlantEmployee(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRProductionPlantEmployeeApiModel model);
	
	@PUT
	@Path("/equipment/update")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "update VRProductionPlantEquiptment", tags={ "vrproductionplantequipmentapimodel"})
	public Response updateVRProductionPlantEquiptment(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, String data);
	
	@PUT
	@Path("/prodequipment/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "update VRProductionPlantProdEquiment", tags={ "vrproductionplantprodequipmentapimodel"})
	public Response updateVRProductionPlantProdEquiment(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRProductionPlantProdEquipmentApiModel model);
	
	@PUT
	@Path("/type/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "create VRProductType", tags={ "vrproducttypeapimodel"})
	public Response updateVRProductType(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRProductTypeApiModel model);
	
}
