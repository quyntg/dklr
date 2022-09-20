package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRProductionPlantProdEquipmentAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.engine.SQLQueryBuilder;
import com.fds.vr.business.model.VRProductionPlantProdEquipment;
import com.fds.vr.business.model.impl.VRProductionPlantProdEquipmentImpl;
import com.fds.vr.business.service.VRProductionPlantProdEquipmentLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.LinkedHashMap;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

/**
 * @author trungnt
 *
 */
public class VRProductionPlantProdEquipmentActionImpl implements VRProductionPlantProdEquipmentAction {
	private Log _log = LogFactoryUtil.getLog(VRProductionPlantProdEquipmentActionImpl.class.getName());

	public JSONObject createVRProductionPlantProdEquipment(VRProductionPlantProdEquipment object) {
		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		try {

			object = VRProductionPlantProdEquipmentLocalServiceUtil.createVRProductionPlantProdEquipment(object);

			JSONObject result = ActionUtil.object2Json(object, VRProductionPlantProdEquipment.class, StringPool.BLANK);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, result);

		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}

	}

	@Override
	public JSONArray findByProductionPlanCode(String productionPlantCodes) {
		JSONArray result = JSONFactoryUtil.createJSONArray();
		if (Validator.isNotNull(productionPlantCodes)) {
			String[] arrProductionPlantCodes = StringUtil.split(productionPlantCodes);
			if (arrProductionPlantCodes != null && arrProductionPlantCodes.length > 0) {
				for (String productionPlantCode : arrProductionPlantCodes) {
					try {
						List<VRProductionPlantProdEquipment> productionPlantProdEquipments = VRProductionPlantProdEquipmentLocalServiceUtil
								.findByProductionPlanCode(productionPlantCode);
						for (VRProductionPlantProdEquipment productionPlantProdEquipment : productionPlantProdEquipments) {
							result.put(ActionUtil.object2Json(productionPlantProdEquipment,
									VRProductionPlantProdEquipmentImpl.class, StringPool.BLANK));
						}
					} catch (Exception e) {
						_log.info("can't find VRProductionPlantProdEquipment by productionPlantCode: "
								+ productionPlantCode);
						continue;
					}
				}
			}
		}
		return result;
	}

	@Override
	public JSONObject findVRProductionPlantProdEquipment(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		String keyword = ActionUtil.getKeyword(params);
		Long id = null;
		Long mtCore = null;
		Long sequenceNo = null;
		String equipmentCode = null;
		String equipmentName = null;
		String equipmentType = null;
		String trademark = null;
		String trademarkName = null;
		String commercialName = null;
		String modelCode = null;
		String productionCountryCode = null;
		String equipmentStatus = null;
		String notes = null;
		//String modifyDate = null;
		//String syncDate = null;
		String productionPlantCode = null;
		Long productionPlantId = null;
		Long quantity = null;
		if (params != null) {
			if (params.containsKey("id")) {
				id = GetterUtil.getLong(params.get("id"));
			}
			if (params.containsKey("mtcore")) {
				mtCore = GetterUtil.getLong(params.get("mtcore"));
			}
			if (params.containsKey("sequenceno")) {
				sequenceNo = GetterUtil.getLong(params.get("sequenceno"));
			}
			if (params.containsKey("equipmentcode")) {
				equipmentCode = GetterUtil.getString(params.get("equipmentcode"));
			}
			if (params.containsKey("equipmentname")) {
				equipmentName = GetterUtil.getString(params.get("equipmentname"));
			}
			if (params.containsKey("equipmenttype")) {
				equipmentType = GetterUtil.getString(params.get("equipmenttype"));
			}
			if (params.containsKey("trademark")) {
				trademark = GetterUtil.getString(params.get("trademark"));
			}
			if (params.containsKey("trademarkname")) {
				trademarkName = GetterUtil.getString(params.get("trademarkname"));
			}
			if (params.containsKey("commercialname")) {
				commercialName = GetterUtil.getString(params.get("commercialname"));
			}
			if (params.containsKey("modelcode")) {
				modelCode = GetterUtil.getString(params.get("modelcode"));
			}
			if (params.containsKey("productioncountrycode")) {
				productionCountryCode = GetterUtil.getString(params.get("productioncountrycode"));
			}
			if (params.containsKey("equipmentstatus")) {
				equipmentStatus = GetterUtil.getString(params.get("equipmentstatus"));
			}
			if (params.containsKey("notes")) {
				notes = GetterUtil.getString(params.get("notes"));
			}
			/*if (params.containsKey("modifydate")) {
				modifyDate = GetterUtil.getString(params.get("modifydate"));
			}
			if (params.containsKey("syncdate")) {
				syncDate = GetterUtil.getString(params.get("syncdate"));
			}*/
			if (params.containsKey("productionplantcode")) {
				productionPlantCode = GetterUtil.getString(params.get("productionplantcode"));
			}
			if (params.containsKey("productionplantid")) {
				productionPlantId = GetterUtil.getLong(params.get("productionplantid"));
			}
			if (params.containsKey("quantity")) {
				quantity = GetterUtil.getLong(params.get("quantity"));
			}
		}
		String _keywordSearchCondition = ActionUtil.buildSQLCondition("equipmentName", keyword, "", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("equipmentType", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("trademark", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("trademarkName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("commercialName", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("modelCode", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("productionCountryCode", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("equipmentStatus", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("notes", keyword, "OR", StringPool.LIKE, "");
		//+ ActionUtil.buildSQLCondition("productionPlantCode", keyword, "OR", StringPool.LIKE, "");
		SQLQueryBuilder builder = new SQLQueryBuilder();
		builder.selectAll().from("vr_productionplantprodequipment").where("id", id, "AND", StringPool.EQUAL)
				.where("mtcore", mtCore, "AND", StringPool.EQUAL)
				.where("sequenceno", sequenceNo, "AND", StringPool.EQUAL)
				.where("equipmentcode", equipmentCode, "AND", StringPool.EQUAL)
				//.where("equipmentname", equipmentName, "AND", StringPool.EQUAL)
				.where("equipmenttype", equipmentType, "AND", StringPool.EQUAL)
				//.where("trademark", trademark, "AND", StringPool.EQUAL)
				//.where("trademarkname", trademarkName, "AND", StringPool.EQUAL)
				//.where("commercialname", commercialName, "AND", StringPool.EQUAL)
				.where("modelcode", modelCode, "AND", StringPool.EQUAL)
				.where("productioncountrycode", productionCountryCode, "AND", StringPool.EQUAL)
				.where("equipmentstatus", equipmentStatus, "AND", StringPool.EQUAL)
				//.where("notes", notes, "AND", StringPool.EQUAL)
				//.where("modifydate", modifyDate, "AND", StringPool.EQUAL)
				//.where("syncdate", syncDate, "AND", StringPool.EQUAL)
				.where("productionplantcode", productionPlantCode, "AND", StringPool.EQUAL)
				.where("productionplantid", productionPlantId, "AND", StringPool.EQUAL)
				.where("quantity", quantity, "AND", StringPool.EQUAL)
				.where(_keywordSearchCondition, null, "AND", "", true).build();
		JSONObject result = JSONFactoryUtil.createJSONObject();
		long total = VRProductionPlantProdEquipmentLocalServiceUtil.counData(builder.getCountQuery());
		JSONArray data = VRProductionPlantProdEquipmentLocalServiceUtil.findData(builder.getSelectQuery(), null, null,
				VRProductionPlantProdEquipmentImpl.class, "VRProductionPlantProdEquipment", start, end);
		result.put("total", total);
		result.put("data", data);
		return result;
	}

	@Override
	public List<VRProductionPlantProdEquipment> adminProcessData(JSONArray arrayData, String productionPlantCode) {
		return VRProductionPlantProdEquipmentLocalServiceUtil.adminProcessData(arrayData, productionPlantCode);
	}

}
