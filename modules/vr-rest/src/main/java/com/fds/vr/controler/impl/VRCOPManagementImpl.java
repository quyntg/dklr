package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRCOPReportRepositoryAction;
import com.fds.vr.business.action.impl.VRCOPReportRepositoryActionImpl;
import com.fds.vr.business.service.VRCOPProdEquipmentLocalServiceUtil;
import com.fds.vr.business.service.VRCOPProductTypeLocalServiceUtil;
import com.fds.vr.business.service.VRCOPProductionPlantEmployeeLocalServiceUtil;
import com.fds.vr.business.service.VRCOPProductionPlantEquipmentLocalServiceUtil;
import com.fds.vr.business.service.VRCOPReportAttachLocalServiceUtil;
import com.fds.vr.business.service.VRCOPReportRepositoryLocalServiceUtil;
import com.fds.vr.controler.VRCOPManagement;
import com.fds.vr.model.VRCOPReportRepositoryBeanParam;
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

import java.util.LinkedHashMap;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

/**
 * @author trungnt
 *
 */
public class VRCOPManagementImpl implements VRCOPManagement {
	private Log _log = LogFactoryUtil.getLog(VRCOPManagementImpl.class);

	@Override
	public Response findReportRepositoryYear(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRCOPReportRepositoryBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		_log.info("rest method:findReportRepositoryYear");
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			VRCOPReportRepositoryAction actionImpl = new VRCOPReportRepositoryActionImpl();
			result = actionImpl.findVRCOPReportRepositoryYear(user, serviceContext, params);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get reportrepositoryyear").toJSONString())
					.build();
		}
	}

	@Override
	public Response findReportRepository(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, Integer year, VRCOPReportRepositoryBeanParam query,
			String payload) {
		_log.info("rest method:findReportRepository");
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {

			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			VRCOPReportRepositoryAction actionImpl = new VRCOPReportRepositoryActionImpl();
			result = actionImpl.findVRCOPReportRepository(user, serviceContext, year, params, payload);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get reportrepository").toJSONString())
					.build();
		}
	}

	@Override
	public Response getVRCOPReportRepository(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long mtCore, String COPReportNo) {
		_log.info("rest method:getVRCOPReportRepository");
		try {

			JSONObject result = VRCOPReportRepositoryLocalServiceUtil.getByCOPReportNo(mtCore, COPReportNo);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage(StringPool.BLANK).toJSONString()).build();
		}
	}

	@Override
	public Response getVRCOPProductionPlantEmployeeList(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long mtCore, String COPReportNo) {
		_log.info("rest method:getVRCOPProductionPlantEmployeeList");
		try {

			JSONArray result = VRCOPProductionPlantEmployeeLocalServiceUtil.getByCOPReportNo(mtCore, COPReportNo);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage(StringPool.BLANK).toJSONString()).build();
		}
	}

	@Override
	public Response getVRCOPProductionPlantEquipmentList(HttpServletRequest request, HttpHeaders header,
			Company company, Locale locale, User user, ServiceContext serviceContext, long mtCore, String COPReportNo) {
		_log.info("rest method:getVRCOPProductionPlantEquipmentList");
		try {

			JSONArray result = VRCOPProductionPlantEquipmentLocalServiceUtil.getByCOPReportNo(mtCore, COPReportNo);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage(StringPool.BLANK).toJSONString()).build();
		}
	}

	@Override
	public Response getVRCOPProductionPlantProdEquipmentList(HttpServletRequest request, HttpHeaders header,
			Company company, Locale locale, User user, ServiceContext serviceContext, long mtCore, String COPReportNo) {
		_log.info("rest method:getVRCOPProductionPlantProdEquipmentList");
		try {

			JSONArray result = VRCOPProdEquipmentLocalServiceUtil.getByCOPReportNo(mtCore, COPReportNo);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage(StringPool.BLANK).toJSONString()).build();
		}
	}

	@Override
	public Response getVRCOPProductTypeList(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long mtCore, String COPReportNo) {
		_log.info("rest method:getVRCOPProductTypeList");
		try {

			JSONArray result = VRCOPProductTypeLocalServiceUtil.getByCOPReportNo(mtCore, COPReportNo);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage(StringPool.BLANK).toJSONString()).build();
		}
	}

	@Override
	public Response getVRCOPReportAttachList(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long mtCore, String COPReportNo) {
		_log.info("rest method:getVRCOPReportAttachList");
		try {

			JSONArray result = VRCOPReportAttachLocalServiceUtil.getByCOPReportNo(mtCore, COPReportNo);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage(StringPool.BLANK).toJSONString()).build();
		}
	}

	@Override
	public Response getVRCOPDataTemplate(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, long mtCore, String COPReportNo) {
		_log.info("rest method:getVRCOPDataTemplate");
		JSONObject result = JSONFactoryUtil.createJSONObject();

		try {

			JSONObject VRCOPReportRepository = VRCOPReportRepositoryLocalServiceUtil.getByCOPReportNo(mtCore,
					COPReportNo);
			JSONArray VRCOPReportAttach = VRCOPReportAttachLocalServiceUtil.getByCOPReportNo(mtCore, COPReportNo);
			JSONArray VRCOPProductType = VRCOPProductTypeLocalServiceUtil.getByCOPReportNo(mtCore, COPReportNo);
			JSONArray VRCOPProductionPlantEquipment = VRCOPProductionPlantEquipmentLocalServiceUtil
					.getByCOPReportNo(mtCore, COPReportNo);
			JSONArray VRCOPProductionPlantEmployee = VRCOPProductionPlantEmployeeLocalServiceUtil
					.getByCOPReportNo(mtCore, COPReportNo);
			JSONArray VRCOPProdEquipment = VRCOPProdEquipmentLocalServiceUtil.getByCOPReportNo(mtCore, COPReportNo);

			result.put("vrcopreportrepository", VRCOPReportRepository);
			result.put("vrcopreportattach", VRCOPReportAttach);
			result.put("vrcopproducttype", VRCOPProductType);
			result.put("vrcopproductionplantequipment", VRCOPProductionPlantEquipment);
			result.put("vrcopproductionplantemployee", VRCOPProductionPlantEmployee);
			result.put("vrcopprodequipment", VRCOPProdEquipment);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage(StringPool.BLANK).toJSONString()).build();
		}
	}

	@Override
	public Response findByMtCore_ProductionPlantCode_COPClassification(HttpServletRequest request, HttpHeaders header,
			Company company, Locale locale, User user, ServiceContext serviceContext,
			VRCOPReportRepositoryBeanParam query) {
		try {

			VRCOPReportRepositoryAction action = new VRCOPReportRepositoryActionImpl();

			JSONObject result = action.findByMtCore_ProductionPlantCode_COPClassification(query.getMtCore(),
					query.getProductionPlantCode(), query.getCopclassification(), query.getStart(), query.getEnd());

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage(StringPool.BLANK).toJSONString()).build();
		}
	}

	@Override
	public Response countReportRepositories(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRCOPReportRepositoryBeanParam query) {
		try {

			VRCOPReportRepositoryAction action = new VRCOPReportRepositoryActionImpl();
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			long total = action.countVRCOPReportRepositories(user, serviceContext, params);

			return Response.status(200).entity(total).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("Can't count").toJSONString()).build();
		}
	}

	@Override
	public Response findByDossierId(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, long dossierId, long mtCore) {
		try {

			VRCOPReportRepositoryAction action = new VRCOPReportRepositoryActionImpl();
			JSONObject result = action.findByDossierId(dossierId, mtCore, serviceContext);

			return Response.status(200).entity(result.toJSONString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("Can't find COP").toJSONString()).build();
		}
	}

	@Override
	public Response findVRCOPProductionPlantProdEquipmentByDossierId(HttpServletRequest request, HttpHeaders header,
			Company company, Locale locale, User user, ServiceContext serviceContext, long dossierId, long mtCore,
			int start, int end) {
		try {

			VRCOPReportRepositoryAction action = new VRCOPReportRepositoryActionImpl();
			JSONObject result = action.findCOPProductionPlantEquipmentByDossierId(user, serviceContext, dossierId,
					mtCore, start, end);

			return Response.status(200).entity(result.toJSONString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500)
					.entity(VRRestUtil.errorMessage("Can't find VRCOPProductionPlantEquipment").toJSONString()).build();
		}
	}

}
