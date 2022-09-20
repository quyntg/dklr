package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRProductionPlantSupplierAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.engine.SQLQueryBuilder;
import com.fds.vr.business.model.VRProductionPlantSupplier;
import com.fds.vr.business.model.impl.VRProductionPlantSupplierImpl;
import com.fds.vr.business.service.VRProductionPlantSupplierLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author trungnt
 *
 */
public class VRProductionPlantSupplierActionImpl implements VRProductionPlantSupplierAction {

	@Override
	public JSONObject findVRProductionPlantSupplier(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		String keyword = ActionUtil.getKeyword(params);
		Long id = null;
		Long mtCore = null;
		String corporationCode = null;
		String corporationName = null;
		String corporationAddress = null;
		String modifyDate = null;
		String syncDate = null;
		if (params != null) {
			if (params.containsKey("id")) {
				id = GetterUtil.getLong(params.get("id"));
			}
			if (params.containsKey("mtcore")) {
				mtCore = GetterUtil.getLong(params.get("mtcore"));
			}
			if (params.containsKey("corporationcode")) {
				corporationCode = GetterUtil.getString(params.get("corporationcode"));
			}
			if (params.containsKey("corporationname")) {
				corporationName = GetterUtil.getString(params.get("corporationname"));
			}
			if (params.containsKey("corporationaddress")) {
				corporationAddress = GetterUtil.getString(params.get("corporationaddress"));
			}
			if (params.containsKey("modifydate")) {
				modifyDate = GetterUtil.getString(params.get("modifydate"));
			}
			if (params.containsKey("syncdate")) {
				syncDate = GetterUtil.getString(params.get("syncdate"));
			}
		}
		String _keywordSearchCondition = ActionUtil.buildSQLCondition("corporationCode", keyword, "", StringPool.LIKE,
				"") + ActionUtil.buildSQLCondition("corporationName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("corporationAddress", keyword, "OR", StringPool.LIKE, "");
		SQLQueryBuilder builder = new SQLQueryBuilder();
		builder.selectAll().from("vr_productionplantsupplier").where("id", id, "AND", StringPool.EQUAL)
				.where("mtcore", mtCore, "AND", StringPool.EQUAL)
				.where("corporationcode", corporationCode, "AND", StringPool.EQUAL)
				.where("corporationname", corporationName, "AND", StringPool.EQUAL)
				.where("corporationaddress", corporationAddress, "AND", StringPool.EQUAL)
				.where("modifydate", modifyDate, "AND", StringPool.EQUAL)
				.where("syncdate", syncDate, "AND", StringPool.EQUAL)
				.where(_keywordSearchCondition, null, "AND", "", true).build();
		JSONObject result = JSONFactoryUtil.createJSONObject();
		long total = VRProductionPlantSupplierLocalServiceUtil.counData(builder.getCountQuery());
		JSONArray data = VRProductionPlantSupplierLocalServiceUtil.findData(builder.getSelectQuery(), null, null,
				VRProductionPlantSupplierImpl.class, "VRProductionPlantSupplier", start, end);
		result.put("total", total);
		result.put("data", data);
		return result;
	}

	@Override
	public List<VRProductionPlantSupplier> adminProcessData(JSONArray arrayData, String productionPlantCode) {
		return VRProductionPlantSupplierLocalServiceUtil.adminProcessData(arrayData, productionPlantCode);
	}

}
