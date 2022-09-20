package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRProductionPlantAction;
import com.fds.vr.business.action.VRProductionPlantEquipmentAction;
import com.fds.vr.business.action.impl.VRProductionClassificationActionImpl;
import com.fds.vr.business.action.impl.VRProductionPlantActionImpl;
import com.fds.vr.business.action.impl.VRProductionPlantEmployeeActionImpl;
import com.fds.vr.business.action.impl.VRProductionPlantEquipmentActionImpl;
import com.fds.vr.business.action.impl.VRProductionPlantProdEquipmentActionImpl;
import com.fds.vr.business.action.impl.VRProductionPlantSupplierActionImpl;
import com.fds.vr.business.action.impl.VRProductionTypeActionImpl;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.model.VRProductType;
import com.fds.vr.business.model.VRProductionClassification;
import com.fds.vr.business.model.VRProductionPlant;
import com.fds.vr.business.model.VRProductionPlantEmployee;
import com.fds.vr.business.model.VRProductionPlantEquipment;
import com.fds.vr.business.model.VRProductionPlantEquipmentMarkup;
import com.fds.vr.business.model.VRProductionPlantProdEquipment;
import com.fds.vr.business.model.impl.VRProductTypeImpl;
import com.fds.vr.business.model.impl.VRProductionClassificationImpl;
import com.fds.vr.business.model.impl.VRProductionPlantEmployeeImpl;
import com.fds.vr.business.model.impl.VRProductionPlantEquipmentImpl;
import com.fds.vr.business.model.impl.VRProductionPlantEquipmentMarkupImpl;
import com.fds.vr.business.model.impl.VRProductionPlantImpl;
import com.fds.vr.business.model.impl.VRProductionPlantProdEquipmentImpl;
import com.fds.vr.business.service.VRProductionPlantEquipmentLocalServiceUtil;
import com.fds.vr.controler.VRProductionManagement;
import com.fds.vr.model.VRProductTypeApiModel;
import com.fds.vr.model.VRProductionClassificationApiModel;
import com.fds.vr.model.VRProductionClassificationBeanParam;
import com.fds.vr.model.VRProductionPlantApiModel;
import com.fds.vr.model.VRProductionPlantBeanParam;
import com.fds.vr.model.VRProductionPlantEmployeeApiModel;
import com.fds.vr.model.VRProductionPlantEquipmentBeanParam;
import com.fds.vr.model.VRProductionPlantProdEquipmentApiModel;
import com.fds.vr.model.VRProductionPlantSupplierBeanParam;
import com.fds.vr.util.VRRestUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringPool;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

/**
 * @author trungnt
 *
 */
public class VRProductionManagementImpl implements VRProductionManagement {
	private Log _log = LogFactoryUtil.getLog(VRProductionManagementImpl.class);

	@Override
	public Response createVRProductionClassification(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String data) {

		try {

			/*VRProductionClassification object = (VRProductionClassification) VRRestUtil.mappingModel(model,
					new VRProductionClassificationImpl());
			
			VRProductionPlantAction action = new VRProductionPlantActionImpl();
			
			JSONObject result = action.createVRProductionClassification(object);
			
			return Response.status(result.getInt("status")).entity(result.getString("content")).build();*/

			JSONObject object = JSONFactoryUtil.createJSONObject(data);

			Map<String, Object> map = VRRestUtil.json2Object(object,
					new Object[] { new VRProductionClassificationImpl() });

			Object entity = map.get(VRProductionClassificationImpl.class.getName());

			_log.info(ActionUtil.object2Json(entity, VRProductionClassificationImpl.class, ""));

			VRProductionClassificationActionImpl actionImpl = new VRProductionClassificationActionImpl();

			JSONObject result = actionImpl.createVRProductionClassification((VRProductionClassification) entity);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (Exception e) {
			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}

	}

	@Override
	public Response createVRProductionPlant(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantApiModel model) {

		try {

			VRProductionPlant object = (VRProductionPlant) VRRestUtil.mappingModel(model, new VRProductionPlantImpl());

			VRProductionPlantActionImpl actionImpl = new VRProductionPlantActionImpl();

			JSONObject result = actionImpl.createVRProductionPlant(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();
		} catch (Exception e) {
			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}

	}

	@Override
	public Response createVRProductionPlantEmployee(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantEmployeeApiModel model) {

		try {

			VRProductionPlantEmployee object = (VRProductionPlantEmployee) VRRestUtil.mappingModel(model,
					new VRProductionPlantEmployeeImpl());

			VRProductionPlantActionImpl actionImpl = new VRProductionPlantActionImpl();

			JSONObject result = actionImpl.createVRProductionPlantEmployee(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (Exception e) {
			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}

	}

	@Override
	public Response createVRProductionPlantEquiptment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String data) {

		try {
			JSONObject object = JSONFactoryUtil.createJSONObject(data);
			List<VRProductionPlantEquipmentMarkup> vrProductionPlantEquipmentMarkups = new ArrayList<VRProductionPlantEquipmentMarkup>();
			if (object.has("productionplantequipmentmarkup")) {
				JSONArray arrayProductionPlantEquipmentMarkup = object.getJSONArray("productionplantequipmentmarkup");
				if (arrayProductionPlantEquipmentMarkup != null) {
					for (int i = 0; i < arrayProductionPlantEquipmentMarkup.length(); i++) {
						Map<String, Object> map = VRRestUtil.json2Object(
								arrayProductionPlantEquipmentMarkup.getJSONObject(i),
								new Object[] { new VRProductionPlantEquipmentMarkupImpl() });
						vrProductionPlantEquipmentMarkups.add((VRProductionPlantEquipmentMarkup) map
								.get(VRProductionPlantEquipmentMarkupImpl.class.getName()));
					}
				}
			}

			Map<String, Object> map = VRRestUtil.json2Object(object,
					new Object[] { new VRProductionPlantEquipmentImpl() });

			Object entity = map.get(VRProductionPlantEquipmentImpl.class.getName());

			_log.info(ActionUtil.object2Json(entity, VRProductionPlantEquipmentImpl.class, ""));

			VRProductionPlantEquipmentActionImpl actionImpl = new VRProductionPlantEquipmentActionImpl();

			JSONObject result = actionImpl.createVRProductionPlantEquiptment((VRProductionPlantEquipment) entity,
					vrProductionPlantEquipmentMarkups);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();
		} catch (Exception e) {
			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}

	}

	@Override
	public Response createVRProductionPlantProdEquiment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantProdEquipmentApiModel model) {

		try {

			VRProductionPlantProdEquipment object = (VRProductionPlantProdEquipment) VRRestUtil.mappingModel(model,
					new VRProductionPlantProdEquipmentImpl());

			VRProductionPlantProdEquipmentActionImpl actionImpl = new VRProductionPlantProdEquipmentActionImpl();

			JSONObject result = actionImpl.createVRProductionPlantProdEquipment(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();
		} catch (Exception e) {
			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}

	}

	@Override
	public Response createVRProductType(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, VRProductTypeApiModel model) {

		try {

			VRProductType object = (VRProductType) VRRestUtil.mappingModel(model, new VRProductTypeImpl());

			VRProductionPlantAction action = new VRProductionPlantActionImpl();

			JSONObject result = action.createVRProductType(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();
		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}

	}

	@Override
	public Response findProductionPlant(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, VRProductionPlantBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			VRProductionPlantAction actionImpl = new VRProductionPlantActionImpl();
			result = actionImpl.findVRProductionPlant(user, serviceContext, params);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get vrproductionplant").toJSONString())
					.build();
		}
	}

	@Override
	public Response findVRProductclassification(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String productionPlantCode) {
		try {

			VRProductionClassificationActionImpl actionImpl = new VRProductionClassificationActionImpl();

			JSONArray result = actionImpl.findVRProductionClassification(productionPlantCode);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}
	}

	@Override
	public Response findVRProductionPlantEmployee(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String productionPlantCode) {

		try {
			VRProductionPlantEmployeeActionImpl actionImpl = new VRProductionPlantEmployeeActionImpl();
			JSONArray result = actionImpl.findVRProductionPlantEmployee(productionPlantCode);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}
	}

	@Override
	public Response findVRProductionPlantEquipment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String productionPlantCode,
			String productClassificationCode) {

		try {

			VRProductionPlantEquipmentActionImpl actionImpl = new VRProductionPlantEquipmentActionImpl();

			JSONArray result = actionImpl.findByProductionPlanCode_ProductClassificationCode(productionPlantCode,
					productClassificationCode);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}
	}

	@Override
	public Response findVRProductionPlantProdEquipment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String productionPlantCodes) {

		try {
			VRProductionPlantProdEquipmentActionImpl actionImpl = new VRProductionPlantProdEquipmentActionImpl();

			JSONArray result = actionImpl.findByProductionPlanCode(productionPlantCodes);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}
	}

	@Override
	public Response findVRProductType(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String productionPlantCode, String productClassificationCode) {

		try {
			VRProductionTypeActionImpl actionImpl = new VRProductionTypeActionImpl();
			JSONArray result = actionImpl.findProductType(productionPlantCode, productClassificationCode);
			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}
	}

	@Override
	public Response updateVRProductionClassification(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionClassificationApiModel model) {

		try {
			VRProductionClassification object = (VRProductionClassification) VRRestUtil.mappingModel(model,
					new VRProductionClassificationImpl());

			VRProductionClassificationActionImpl action = new VRProductionClassificationActionImpl();

			JSONObject result = action.updateVRProductionClassification(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}

	}

	@Override
	public Response updateVRProductionPlant(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantApiModel model) {

		try {

			VRProductionPlantActionImpl actionImpl = new VRProductionPlantActionImpl();

			VRProductionPlant object = (VRProductionPlant) VRRestUtil.mappingModel(model, new VRProductionPlantImpl());

			JSONObject result = actionImpl.updateVRProductionPlant(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}

	}

	@Override
	public Response updateVRProductionPlantEmployee(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantEmployeeApiModel model) {

		try {

			VRProductionPlantEmployee object = (VRProductionPlantEmployee) VRRestUtil.mappingModel(model,
					new VRProductionPlantEmployeeImpl());

			VRProductionPlantActionImpl actionImpl = new VRProductionPlantActionImpl();

			JSONObject result = actionImpl.updateVRProductionPlantEmployee(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}

	}

	@Override
	public Response updateVRProductionPlantEquiptment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String data) {

		try {
			JSONObject object = JSONFactoryUtil.createJSONObject(data);

			List<VRProductionPlantEquipmentMarkup> vrProductionPlantEquipmentMarkups = new ArrayList<VRProductionPlantEquipmentMarkup>();

			if (object.has("productionplantequipmentmarkup")) {
				JSONArray arrayProductionPlantEquipmentMarkup = object.getJSONArray("productionplantequipmentmarkup");
				if (arrayProductionPlantEquipmentMarkup != null) {
					for (int i = 0; i < arrayProductionPlantEquipmentMarkup.length(); i++) {
						Map<String, Object> map = VRRestUtil.json2Object(arrayProductionPlantEquipmentMarkup.getJSONObject(i),
								new Object[] { new VRProductionPlantEquipmentMarkupImpl() });
						vrProductionPlantEquipmentMarkups.add((VRProductionPlantEquipmentMarkup) map
								.get(VRProductionPlantEquipmentMarkupImpl.class.getName()));
					}
				}
			}

			JSONObject result = JSONFactoryUtil.createJSONObject();

			long id = object.getLong("id");

			if (id <= 0) {
				result = ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);

				return Response.status(result.getInt("status")).entity(result.getString("content")).build();
			}

			VRProductionPlantEquipment vrProductionPlantEquipment = VRProductionPlantEquipmentLocalServiceUtil
					.fetchVRProductionPlantEquipment(id);

			if (vrProductionPlantEquipment == null) {
				result = ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);

				return Response.status(result.getInt("status")).entity(result.getString("content")).build();
			}

			Map<String, Object> map = VRRestUtil.json2Object(object, new Object[] { vrProductionPlantEquipment });

			Object entity = map.get(VRProductionPlantEquipmentImpl.class.getName());

			_log.info(ActionUtil.object2Json(entity, VRProductionPlantEquipmentImpl.class, ""));

			VRProductionPlantEquipmentActionImpl actionImpl = new VRProductionPlantEquipmentActionImpl();

			result = actionImpl.updateVRProductionPlantEquiptment((VRProductionPlantEquipment) entity,
					vrProductionPlantEquipmentMarkups);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();
		} catch (Exception e) {
			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}
	}

	@Override
	public Response updateVRProductionPlantProdEquiment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantProdEquipmentApiModel model) {

		try {

			JSONObject result = JSONFactoryUtil.createJSONObject();

			VRProductionPlantProdEquipment object = (VRProductionPlantProdEquipment) VRRestUtil.mappingModel(model,
					new VRProductionPlantProdEquipmentImpl());

			VRProductionPlantActionImpl actionImpl = new VRProductionPlantActionImpl();

			result = actionImpl.updateVRProductionPlantProdEquipment(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (Exception e) {
			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}

	}

	@Override
	public Response updateVRProductType(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, VRProductTypeApiModel model) {

		try {

			VRProductType object = (VRProductType) VRRestUtil.mappingModel(model, new VRProductTypeImpl());

			VRProductionPlantActionImpl actionImpl = new VRProductionPlantActionImpl();

			JSONObject result = actionImpl.updateVRProductType(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}

	}

	@Override
	public Response deleteProductionPlantEquipment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long id) {

		try {

			VRProductionPlantEquipmentAction actionImpl = new VRProductionPlantEquipmentActionImpl();
			JSONObject result = actionImpl.deleteVRProductionPlantEquiptment(id);
			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}
	}

	@Override
	public Response searchVRProductionPlantEquipment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantEquipmentBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);

			VRProductionPlantEquipmentAction actionImpl = new VRProductionPlantEquipmentActionImpl();

			result = actionImpl.findVRProductionPlantEquipment(user, serviceContext, params);

			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get vrproductionplant").toJSONString())
					.build();
		}
	}

	@Override
	public Response findProductionPlantSupplier(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantSupplierBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);

			VRProductionPlantSupplierActionImpl actionImpl = new VRProductionPlantSupplierActionImpl();

			result = actionImpl.findVRProductionPlantSupplier(user, serviceContext, params);

			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500)
					.entity(VRRestUtil.errorMessage("Can't get vrproductionplantsupplier").toJSONString()).build();
		}
	}

	@Override
	public Response findVRProductclassification(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionClassificationBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);

			VRProductionClassificationActionImpl actionImpl = new VRProductionClassificationActionImpl();

			result = actionImpl.findVRProductionClassification(user, serviceContext, params);

			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500)
					.entity(VRRestUtil.errorMessage("Can't get vrproductionplantsupplier").toJSONString()).build();
		}
	}

	@Override
	public Response getVRProductionPlant(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String productionplantcode) {
		try {

			VRProductionPlantAction actionImpl = new VRProductionPlantActionImpl();

			JSONObject result = actionImpl.getVRProductionPlant(productionplantcode, serviceContext);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!").toJSONString())
					.build();
		}
	}

	@Override
	public Response countProductionPlant(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, VRProductionPlantBeanParam query) {
		long total = 0;
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			VRProductionPlantAction actionImpl = new VRProductionPlantActionImpl();
			total = actionImpl.countVRProductionPlant(user, serviceContext, params);
			return Response.status(200).entity(total).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get vrproductionplant").toJSONString())
					.build();
		}
	}

}
