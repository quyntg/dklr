package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRProductionClassificationAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.engine.SQLQueryBuilder;
import com.fds.vr.business.model.VRProductionClassification;
import com.fds.vr.business.model.impl.VRProductionClassificationImpl;
import com.fds.vr.business.service.VRProductionClassificationLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.util.LinkedHashMap;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

/**
 * @author trungnt
 *
 */
public class VRProductionClassificationActionImpl implements VRProductionClassificationAction {
	private Log _log = LogFactoryUtil.getLog(VRProductionClassificationActionImpl.class);

	public JSONObject createVRProductionClassification(VRProductionClassification object) {
		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		try {
			object = VRProductionClassificationLocalServiceUtil.createVRProductionClassification(object);

			JSONObject result = ActionUtil.object2Json(object, VRProductionClassification.class, StringPool.BLANK);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, result);

		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}
	}

	@Override
	public JSONArray findVRProductionClassification(String productionPlantCode) {
		JSONArray result = JSONFactoryUtil.createJSONArray();
		try {
			List<VRProductionClassification> vrProductionClassifications = VRProductionClassificationLocalServiceUtil
					.findByProductionPlantCode(productionPlantCode);

			for (VRProductionClassification vrProductionClassification : vrProductionClassifications) {

				result.put(ActionUtil.object2Json(vrProductionClassification, VRProductionClassificationImpl.class,
						StringPool.BLANK));
			}
		} catch (Exception e) {
			_log.error(e);
		}
		return result;
	}

	@Override
	public JSONObject findVRProductionClassification(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		String keyword = ActionUtil.getKeyword(params);
		Long id = null;
		Long mtCore = null;
		Long applicantProfileId = null;
		String applicantCode = null;
		Long productionPlantId = null;
		String productionPlantCode = null;
		Integer sequenceNo = null;
		String productClassificationCode = null;
		String productClassificationDescription = null;
		String classificationMode = null;
		String remarks = null;
		String status = null;
		String modifyDate = null;
		String syncDate = null;
		if (params != null) {
			if (params.containsKey("id")) {
				id = GetterUtil.getLong(params.get("id"));
			}
			if (params.containsKey("mtcore")) {
				mtCore = GetterUtil.getLong(params.get("mtcore"));
			}
			if (params.containsKey("applicantprofileid")) {
				applicantProfileId = GetterUtil.getLong(params.get("applicantprofileid"));
			}
			if (params.containsKey("applicantcode")) {
				applicantCode = GetterUtil.getString(params.get("applicantcode"));
			}
			if (params.containsKey("productionplantid")) {
				productionPlantId = GetterUtil.getLong(params.get("productionplantid"));
			}
			if (params.containsKey("productionplantcode")) {
				productionPlantCode = GetterUtil.getString(params.get("productionplantcode"));
			}
			if (params.containsKey("sequenceno")) {
				sequenceNo = GetterUtil.getInteger(params.get("sequenceno"));
			}
			if (params.containsKey("productclassificationcode")) {
				productClassificationCode = GetterUtil.getString(params.get("productclassificationcode"));
			}
			if (params.containsKey("productclassificationdescription")) {
				productClassificationDescription = GetterUtil.getString(params.get("productclassificationdescription"));
			}
			if (params.containsKey("classificationmode")) {
				classificationMode = GetterUtil.getString(params.get("classificationmode"));
			}
			if (params.containsKey("remarks")) {
				remarks = GetterUtil.getString(params.get("remarks"));
			}
			if (params.containsKey("status")) {
				status = GetterUtil.getString(params.get("status"));
			}
			if (params.containsKey("modifydate")) {
				modifyDate = GetterUtil.getString(params.get("modifydate"));
			}
			if (params.containsKey("syncdate")) {
				syncDate = GetterUtil.getString(params.get("syncdate"));
			}
		}
		String _keywordSearchCondition = ActionUtil.buildSQLCondition("applicantCode", keyword, "", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionPlantCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productClassificationCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productClassificationDescription", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("classificationMode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("remarks", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("status", keyword, "OR", StringPool.LIKE, "");
		SQLQueryBuilder builder = new SQLQueryBuilder();

		builder.selectAll().from("vr_productclassification").where("id", id, "AND", StringPool.EQUAL)
				.where("mtcore", mtCore, "AND", StringPool.EQUAL)
				.where("applicantprofileid", applicantProfileId, "AND", StringPool.EQUAL)
				.where("applicantcode", applicantCode, "AND", StringPool.EQUAL)
				.where("productionplantid", productionPlantId, "AND", StringPool.EQUAL)
				.where("productionplantcode", productionPlantCode, "AND", StringPool.EQUAL)
				.where("sequenceno", sequenceNo, "AND", StringPool.EQUAL)
				.where("productclassificationcode", productClassificationCode, "AND", StringPool.EQUAL)
				.where("productclassificationdescription", productClassificationDescription, "AND", StringPool.EQUAL)
				.where("classificationmode", classificationMode, "AND", StringPool.EQUAL)
				.where("remarks", remarks, "AND", StringPool.EQUAL).where("status", status, "AND", StringPool.EQUAL)
				.where("modifydate", modifyDate, "AND", StringPool.EQUAL)
				.where("syncdate", syncDate, "AND", StringPool.EQUAL)
				.where(_keywordSearchCondition, null, "AND", "", true).build();
		JSONObject result = JSONFactoryUtil.createJSONObject();
		long total = VRProductionClassificationLocalServiceUtil.counData(builder.getCountQuery());
		JSONArray data = VRProductionClassificationLocalServiceUtil.findData(builder.getSelectQuery(), null, null,
				VRProductionClassificationImpl.class, "VRProductionClassification", start, end);
		result.put("total", total);
		result.put("data", data);
		return result;
	}

	public JSONObject updateVRProductionClassification(VRProductionClassification object) {

		// validate

		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}

		if (object.getId() <= 0) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}

		VRProductionClassification _tmp = VRProductionClassificationLocalServiceUtil
				.fetchVRProductionClassification(object.getId());
		if (_tmp == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}

		try {
			_tmp = (VRProductionClassification) ActionUtil.mergeObject(object, _tmp);

			_tmp = VRProductionClassificationLocalServiceUtil.updateVRProductionClassification(_tmp);

			// JSONObject result = ActionUtil.object2Json(object,
			// VRProductionClassification.class, StringPool.BLANK);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, _tmp);

		} catch (Exception e) {
			_log.error(e);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}
	}

	@Override
	public List<VRProductionClassification> adminProcessData(JSONArray arrayData, String productionPlantCode) {
		return VRProductionClassificationLocalServiceUtil.adminProcessData(arrayData, productionPlantCode);
	}
}
