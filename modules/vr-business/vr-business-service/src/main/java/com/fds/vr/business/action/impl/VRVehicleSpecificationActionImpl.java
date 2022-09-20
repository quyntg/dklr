package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRVehicleSpecificationAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.engine.SQLQueryBuilder;
import com.fds.vr.business.model.VRVehicleSpecification;
import com.fds.vr.business.model.impl.VRVehicleSpecificationImpl;
import com.fds.vr.business.service.VRVehicleSpecificationLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringPool;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author trungnt
 *
 */
public class VRVehicleSpecificationActionImpl implements VRVehicleSpecificationAction {

	//public JSONObject createVRVehicleRecord(VRVehicleRecord object);

	//public JSONObject deleteVRVehicleRecord(long id);

	//public JSONObject importVRVehicleRecord(User user, ServiceContext serviceContext, InputStream inputStream);

	//public JSONObject updateVRVehicleRecord(VRVehicleRecord object);

	@Override
	public JSONObject findVRVehicleSpecification(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		String keyword = ActionUtil.getKeyword(params);
		Long id = null;
		Long vehicleCertificateId = null;
		String specificationCode = null;
		String specificationName = null;
		String specificationValue = null;
		String specificationValueDescription = null;
		Long sequenceNo = null;
		String specificationBasicUnit = null;
		String specificationStandard = null;
		String specificationGroup = null;
		String specificationDataCollectionID = null;
		String specificationResult = null;
		String deliverableCode = null;
		//String modifyDate = null;
		//String syncDate = null;
		if (params != null) {
			if (params.containsKey("id")) {
				id = (Long) params.get("id");
			}
			if (params.containsKey("vehiclecertificateid")) {
				vehicleCertificateId = (Long) params.get("vehiclecertificateid");
			}
			if (params.containsKey("specificationcode")) {
				specificationCode = (String) params.get("specificationcode");
			}
			if (params.containsKey("specificationname")) {
				specificationName = (String) params.get("specificationname");
			}
			if (params.containsKey("specificationvalue")) {
				specificationValue = (String) params.get("specificationvalue");
			}
			if (params.containsKey("specificationvaluedescription")) {
				specificationValueDescription = (String) params.get("specificationvaluedescription");
			}
			if (params.containsKey("sequenceno")) {
				sequenceNo = (Long) params.get("sequenceno");
			}
			if (params.containsKey("specificationbasicunit")) {
				specificationBasicUnit = (String) params.get("specificationbasicunit");
			}
			if (params.containsKey("specificationstandard")) {
				specificationStandard = (String) params.get("specificationstandard");
			}
			if (params.containsKey("specificationgroup")) {
				specificationGroup = (String) params.get("specificationgroup");
			}
			if (params.containsKey("specificationdatacollectionid")) {
				specificationDataCollectionID = (String) params.get("specificationdatacollectionid");
			}
			if (params.containsKey("specificationresult")) {
				specificationResult = (String) params.get("specificationresult");
			}
			if (params.containsKey("deliverablecode")) {
				deliverableCode = (String) params.get("deliverablecode");
			}
			/*if (params.containsKey("modifydate")) {
				modifyDate = (String) params.get("modifydate");
			}
			if (params.containsKey("syncdate")) {
				syncDate = (String) params.get("syncdate");
			}*/
		}
		String _keywordSearchCondition = ActionUtil.buildSQLCondition("specificationCode", keyword, "", StringPool.LIKE,
				"") + ActionUtil.buildSQLCondition("specificationName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("specificationValue", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("specificationValueDescription", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("specificationBasicUnit", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("specificationStandard", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("specificationGroup", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("specificationDataCollectionID", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("specificationResult", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("deliverableCode", keyword, "OR", StringPool.LIKE, "");
		SQLQueryBuilder builder = new SQLQueryBuilder();
		builder.selectAll().from("vr_vehiclespecification").where("id", id, "AND", StringPool.EQUAL)
				.where("vehiclecertificateid", vehicleCertificateId, "AND", StringPool.EQUAL)
				.where("specificationcode", specificationCode, "AND", StringPool.EQUAL)
				.where("specificationname", specificationName, "AND", StringPool.EQUAL)
				.where("specificationvalue", specificationValue, "AND", StringPool.EQUAL)
				.where("specificationvaluedescription", specificationValueDescription, "AND", StringPool.EQUAL)
				.where("sequenceno", sequenceNo, "AND", StringPool.EQUAL)
				.where("specificationbasicunit", specificationBasicUnit, "AND", StringPool.EQUAL)
				.where("specificationstandard", specificationStandard, "AND", StringPool.EQUAL)
				.where("specificationgroup", specificationGroup, "AND", StringPool.EQUAL)
				.where("specificationdatacollectionid", specificationDataCollectionID, "AND", StringPool.EQUAL)
				.where("specificationresult", specificationResult, "AND", StringPool.EQUAL)
				.where("deliverablecode", deliverableCode, "AND", StringPool.EQUAL)
				//.where("modifydate", modifyDate, "AND", StringPool.EQUAL)
				//.where("syncdate", syncDate, "AND", StringPool.EQUAL)
				.where(_keywordSearchCondition, null, "AND", "", true).build();
		JSONObject result = JSONFactoryUtil.createJSONObject();
		long total = VRVehicleSpecificationLocalServiceUtil.counData(builder.getCountQuery());
		JSONArray data = VRVehicleSpecificationLocalServiceUtil.findData(builder.getSelectQuery(), null, null,
				VRVehicleSpecificationImpl.class, "VRVehicleSpecification", start, end);
		result.put("total", total);
		result.put("data", data);
		return result;
	}

	@Override
	public List<VRVehicleSpecification> findByDossierId(long dossierId, int start, int end) {
		return VRVehicleSpecificationLocalServiceUtil.findByDossierId(dossierId, start, end);
	}

}
