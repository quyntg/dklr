package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRVehicleRecordAction;
import com.fds.vr.business.action.VRVehicleTypeCertificateAction;
import com.fds.vr.business.action.impl.VRVehicleRecordActionImpl;
import com.fds.vr.business.action.impl.VRVehicleSpecificationActionImpl;
import com.fds.vr.business.action.impl.VRVehicleTypeCertificateActionImpl;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.model.VRVehicleEquipment;
import com.fds.vr.business.model.VRVehicleRecord;
import com.fds.vr.business.model.impl.VRVehicleEquipmentModelImpl;
import com.fds.vr.business.model.impl.VRVehicleRecordImpl;
import com.fds.vr.business.model.impl.VRVehicleRecordModelImpl;
import com.fds.vr.business.service.VRVehicleEquipmentLocalServiceUtil;
import com.fds.vr.controler.VRVehicleManagement;
import com.fds.vr.model.VRVehicleEquipmentBeanParam;
import com.fds.vr.model.VRVehicleRecordBeanParam;
import com.fds.vr.model.VRVehicleSpecificationBeanParam;
import com.fds.vr.model.VRVehicleTypeCertificateBeanParam;
import com.fds.vr.service.util.BusinessUtil;
import com.fds.vr.util.VRRestUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.activation.DataHandler;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

/**
 * @author trungnt
 *
 */
public class VRVehicleManagementImpl implements VRVehicleManagement {
	private Log _log = LogFactoryUtil.getLog(VRVehicleManagementImpl.class);

	@Override
	public Response createVRVehicleRecord(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String data) {
		try {
			JSONObject object = JSONFactoryUtil.createJSONObject(data);
			Map<String, Object> map = VRRestUtil.json2Object(object, new Object[] { new VRVehicleRecordImpl() });
			Object entity = map.get(VRVehicleRecordImpl.class.getName());
			_log.info(ActionUtil.object2Json(entity, VRVehicleRecordModelImpl.class, ""));
			VRVehicleRecordActionImpl actionImpl = new VRVehicleRecordActionImpl();
			JSONObject result = actionImpl.createVRVehicleRecord((VRVehicleRecord) entity);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't create VRVehicleRecord").toJSONString())
					.build();
		}

	}

	@Override
	public Response findVRVehicleCertificate(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, Integer year,
			VRVehicleTypeCertificateBeanParam query, String advancesearchParams) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		_log.info("rest method:findVRVehicleCertificate");
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			VRVehicleTypeCertificateAction actionImpl = new VRVehicleTypeCertificateActionImpl();
			result = actionImpl.findVehicleTypeCertificate(user, serviceContext, year, params, advancesearchParams);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get certificateYear").toJSONString())
					.build();
		}
	}

	@Override
	public Response findVRVehicleCertificateRecordYear(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRVehicleTypeCertificateBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		_log.info("rest method:findVRVehicleCertificateRecordYear");
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			VRVehicleTypeCertificateAction actionImpl = new VRVehicleTypeCertificateActionImpl();
			result = actionImpl.findVehicleTypeCertificateYear(user, serviceContext, params);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get certificateYear").toJSONString())
					.build();
		}
	}

	@Override
	public Response getVRVehicleCertificate(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long mtCore, String copReportNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response importVRVehiclerecord(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String data, Attachment attachment) {
		InputStream inputStream = null;

		try {

			_log.info(">>>>>>>>>>>>>>>>>>>>>>> data: " + data);

			DataHandler dataHandler = attachment.getDataHandler();

			inputStream = dataHandler.getInputStream();

			VRVehicleRecordActionImpl actionImpl = new VRVehicleRecordActionImpl();

			actionImpl.importVRVehicleRecord(user, serviceContext, inputStream);

			return Response.status(200).entity("").build();

		} catch (Exception e) {

			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't import vehiclerecord").toJSONString())
					.build();

		}

	}

	@Override
	public Response updateVRVehicleRecord(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response findVRVehicleRecord(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, VRVehicleRecordBeanParam query, String advancesearchParams) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);

			VRVehicleRecordActionImpl actionImpl = new VRVehicleRecordActionImpl();

			result = actionImpl.findVRVehicleRecord(user, serviceContext, params);

			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get vrvehiclerecord").toJSONString())
					.build();
		}

	}

	@Override
	public Response findVRVehicleSpecification(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRVehicleSpecificationBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);

			VRVehicleSpecificationActionImpl actionImpl = new VRVehicleSpecificationActionImpl();

			result = actionImpl.findVRVehicleSpecification(user, serviceContext, params);

			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500)
					.entity(VRRestUtil.errorMessage("Can't get vrvehiclespecification").toJSONString()).build();
		}

	}

	@Override
	public Response countVRVehicleRecord(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, VRVehicleRecordBeanParam query, String advancesearchParams) {
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);

			VRVehicleRecordActionImpl actionImpl = new VRVehicleRecordActionImpl();

			return Response.status(200).entity(actionImpl.countVRVehicleRecord(user, serviceContext, params)).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get vrvehiclerecord").toJSONString())
					.build();
		}
	}

	@Override
	public Response doExportVRVehicleRecord(HttpServletRequest request, HttpServletResponse response,
			HttpHeaders header, Company company, Locale locale, User user, ServiceContext serviceContext,
			VRVehicleRecordBeanParam query, String headercodes, String headerlabels) {
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);

			VRVehicleRecordActionImpl actionImpl = new VRVehicleRecordActionImpl();

			File file = actionImpl.doExportVRVehicleRecord(user, serviceContext, params, headercodes, headerlabels);

			if (file == null) {
				return Response.status(500)
						.entity(VRRestUtil.errorMessage("Can't export vrvehiclerecord").toJSONString()).build();
			} else {
				InputStream in = new FileInputStream(file);
				ServletResponseUtil.sendFile(request, response, file.getName(), in, "application/download");
				in.close();

				ResponseBuilder responseBuilder = Response.ok((Object) file);
				//
				// responseBuilder.header("Content-Disposition", "attachment;
				// filename=\"" + file.getName() + "\"")
				// .header("Content-Type", "application/zip");
				//
				return responseBuilder.build();
			}

		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get vrvehiclerecord").toJSONString())
					.build();
		}
	}

	@Override
	public Response findByDossierId(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, long dossierId, long mtCore) {
		try {
			JSONObject result = JSONFactoryUtil.createJSONObject();
			VRVehicleTypeCertificateAction vrVehicleTypeCertificateAction = new VRVehicleTypeCertificateActionImpl();
			result = vrVehicleTypeCertificateAction.findByDossierId_MTCore(dossierId, mtCore, serviceContext);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			return Response.status(500)
					.entity(VRRestUtil.errorMessage("Can't get vr_vehicletypecertificate").toJSONString()).build();
		}
	}

	@Override
	public Response findSpecificationByCertificateRecordNo(HttpServletRequest request, HttpHeaders header,
			Company company, Locale locale, User user, ServiceContext serviceContext,
			VRVehicleTypeCertificateBeanParam query) {
		try {
			JSONObject result = JSONFactoryUtil.createJSONObject();
			VRVehicleTypeCertificateAction vrVehicleTypeCertificateAction = new VRVehicleTypeCertificateActionImpl();
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			result = vrVehicleTypeCertificateAction.findSpecificationByCertificateRecordNo(user, serviceContext,
					params);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500)
					.entity(VRRestUtil.errorMessage("Can't get vr_vehicletypecertificate").toJSONString()).build();
		}
	}

	@Override
	public Response findVRVehicleRecordPrintDetails(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long vehicleRecordId) {
		try {
			VRVehicleRecordAction action = new VRVehicleRecordActionImpl();
			JSONObject result = action.findVRVehicleRecordPrintDetails(vehicleRecordId, user, serviceContext);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't find VRVehicleRecord").toJSONString())
					.build();
		}
	}

	@Override
	public Response updateStatusAfterPrint(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long vehicleRecordId) {
		try {
			VRVehicleRecordAction action = new VRVehicleRecordActionImpl();
			JSONObject result = action.updateStatusAfterPrint(vehicleRecordId, user, serviceContext);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500)
					.entity(VRRestUtil.errorMessage("Can't update status VRVehicleRecord").toJSONString()).build();
		}
	}

	@Override
	public Response findVRVehicleEquipmentByDossierId(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long dossierId, int start, int end) {
		try {
			JSONObject result = JSONFactoryUtil.createJSONObject();
			List<VRVehicleEquipment> vrVehicleEquipments = VRVehicleEquipmentLocalServiceUtil.findByDossierId(dossierId,
					start, end);
			JSONArray array = JSONFactoryUtil.createJSONArray();
			for (VRVehicleEquipment vrVehicleEquipment : vrVehicleEquipments) {
				try {
					JSONObject obj = BusinessUtil.object2Json_originColumnName(vrVehicleEquipment,
							VRVehicleEquipmentModelImpl.class, StringPool.BLANK);
					array.put(obj);
				} catch (Exception e) {
					_log.error(e);
				}
			}
			result.put("data", array);
			result.put("total", vrVehicleEquipments.size());
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't find VRVehicleEquipment").toJSONString())
					.build();
		}
	}

	@Override
	public Response createVRVehicleEquipment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long dossierId, String data) {
		try {
			JSONArray arrayData = JSONFactoryUtil.createJSONArray(data);
			
			List<VRVehicleEquipment> vrVehicleEquipments = VRVehicleEquipmentLocalServiceUtil
					.adminProcessData(arrayData, dossierId, 1L);

			JSONArray array = JSONFactoryUtil.createJSONArray();
			for (VRVehicleEquipment vrVehicleEquipment : vrVehicleEquipments) {
				try {
					JSONObject obj = BusinessUtil.object2Json_originColumnName(vrVehicleEquipment,
							VRVehicleEquipmentModelImpl.class, StringPool.BLANK);
					array.put(obj);
				} catch (Exception e) {
					_log.error(e);
				}
			}

			return Response.status(200).entity(array.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500)
					.entity(VRRestUtil.errorMessage("Can't create VRVehicleEquipment").toJSONString()).build();
		}
	}

	@Override
	public Response findVRVehicleEquipments(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRVehicleEquipmentBeanParam query) {
		// TODO Auto-generated method stub
		return null;
	}

}
