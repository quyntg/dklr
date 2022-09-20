package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VROutputSheetDetailAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.engine.SQLQueryBuilder;
import com.fds.vr.business.model.VROutputSheet;
import com.fds.vr.business.model.VROutputSheetDetails;
import com.fds.vr.business.model.impl.VROutputSheetDetailsImpl;
import com.fds.vr.business.model.impl.VROutputSheetDetailsModelImpl;
import com.fds.vr.business.service.VROutputSheetDetailsLocalServiceUtil;
import com.fds.vr.business.service.VROutputSheetLocalServiceUtil;
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

import javax.net.ssl.HttpsURLConnection;

/**
 * @author trungnt
 *
 */
public class VROutputSheetDetailActionImpl implements VROutputSheetDetailAction {

	@Override
	public JSONObject findVROutputSheetDetails(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		String keyword = ActionUtil.getKeyword(params);
		Long id = null;
		Long mtCore = null;
		Long inputSheetId = null;
		Long outputSheetId = null;
		Long bookId = null;
		Long issueVehicleCertificateId = null;
		Long certificateId = null;
		String certificateNumber = null;
		String certificateDate = null;
		String vehicleClass = null;
		String stampType = null;
		String stampShortNo = null;
		Long serialStartNo = null;
		Long serialEndNo = null;
		Long subTotalInDocument = null;
		Long subTotalQuantities = null;
		Long unitPrice = null;
		Long totalAmount = null;
		Long totalInUse = null;
		Long totalNotUsed = null;
		Long totalLost = null;
		Long totalCancelled = null;
		Long totalReturned = null;
		String remark = null;
		//String modifyDate = null;
		//String syncDate = null;
		if (params != null) {
			if (params.containsKey("id")) {
				id = GetterUtil.getLong(params.get("id"));
			}
			if (params.containsKey("mtcore")) {
				mtCore = GetterUtil.getLong(params.get("mtcore"));
			}
			if (params.containsKey("inputsheetid")) {
				inputSheetId = GetterUtil.getLong(params.get("inputsheetid"));
			}
			if (params.containsKey("outputsheetid")) {
				outputSheetId = GetterUtil.getLong(params.get("outputsheetid"));
			}
			if (params.containsKey("bookid")) {
				bookId = GetterUtil.getLong(params.get("bookid"));
			}
			if (params.containsKey("issuevehiclecertificateid")) {
				issueVehicleCertificateId = GetterUtil.getLong(params.get("issuevehiclecertificateid"));
			}
			if (params.containsKey("certificateid")) {
				certificateId = GetterUtil.getLong(params.get("certificateid"));
			}
			if (params.containsKey("certificatenumber")) {
				certificateNumber = GetterUtil.getString(params.get("certificatenumber"));
			}
			if (params.containsKey("certificatedate")) {
				certificateDate = GetterUtil.getString(params.get("certificatedate"));
			}
			if (params.containsKey("vehicleclass")) {
				vehicleClass = GetterUtil.getString(params.get("vehicleclass"));
			}
			if (params.containsKey("stamptype")) {
				stampType = GetterUtil.getString(params.get("stamptype"));
			}
			if (params.containsKey("stampshortno")) {
				stampShortNo = GetterUtil.getString(params.get("stampshortno"));
			}
			if (params.containsKey("serialstartno")) {
				serialStartNo = GetterUtil.getLong(params.get("serialstartno"));
			}
			if (params.containsKey("serialendno")) {
				serialEndNo = GetterUtil.getLong(params.get("serialendno"));
			}
			if (params.containsKey("subtotalindocument")) {
				subTotalInDocument = GetterUtil.getLong(params.get("subtotalindocument"));
			}
			if (params.containsKey("subtotalquantities")) {
				subTotalQuantities = GetterUtil.getLong(params.get("subtotalquantities"));
			}
			if (params.containsKey("unitprice")) {
				unitPrice = GetterUtil.getLong(params.get("unitprice"));
			}
			if (params.containsKey("totalamount")) {
				totalAmount = GetterUtil.getLong(params.get("totalamount"));
			}
			if (params.containsKey("totalinuse")) {
				totalInUse = GetterUtil.getLong(params.get("totalinuse"));
			}
			if (params.containsKey("totalnotused")) {
				totalNotUsed = GetterUtil.getLong(params.get("totalnotused"));
			}
			if (params.containsKey("totallost")) {
				totalLost = GetterUtil.getLong(params.get("totallost"));
			}
			if (params.containsKey("totalcancelled")) {
				totalCancelled = GetterUtil.getLong(params.get("totalcancelled"));
			}
			if (params.containsKey("totalreturned")) {
				totalReturned = GetterUtil.getLong(params.get("totalreturned"));
			}
			if (params.containsKey("remark")) {
				remark = GetterUtil.getString(params.get("remark"));
			}
			/*if (params.containsKey("modifydate")) {
				modifyDate = GetterUtil.getString(params.get("modifydate"));
			}
			if (params.containsKey("syncdate")) {
				syncDate = GetterUtil.getString(params.get("syncdate"));
			}*/
		}
		String _keywordSearchCondition = ActionUtil.buildSQLCondition("certificateNumber", keyword, "", StringPool.LIKE,
				"") + ActionUtil.buildSQLCondition("vehicleClass", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("stampType", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("stampShortNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("remark", keyword, "OR", StringPool.LIKE, "");
		SQLQueryBuilder builder = new SQLQueryBuilder();
		builder.selectAll().from("vr_outputsheetdetails").where("id", id, "AND", StringPool.EQUAL)
				.where("mtcore", mtCore, "AND", StringPool.EQUAL)
				.where("inputsheetid", inputSheetId, "AND", StringPool.EQUAL)
				.where("outputsheetid", outputSheetId, "AND", StringPool.EQUAL)
				.where("bookid", bookId, "AND", StringPool.EQUAL)
				.where("issuevehiclecertificateid", issueVehicleCertificateId, "AND", StringPool.EQUAL)
				.where("certificateid", certificateId, "AND", StringPool.EQUAL)
				.where("certificatenumber", certificateNumber, "AND", StringPool.EQUAL)
				.where("certificatedate", certificateDate, "AND", StringPool.EQUAL)
				.where("vehicleclass", vehicleClass, "AND", StringPool.EQUAL)
				.where("stamptype", stampType, "AND", StringPool.EQUAL)
				.where("stampshortno", stampShortNo, "AND", StringPool.EQUAL)
				.where("serialstartno", serialStartNo, "AND", StringPool.EQUAL)
				.where("serialendno", serialEndNo, "AND", StringPool.EQUAL)
				.where("subtotalindocument", subTotalInDocument, "AND", StringPool.EQUAL)
				.where("subtotalquantities", subTotalQuantities, "AND", StringPool.EQUAL)
				.where("unitprice", unitPrice, "AND", StringPool.EQUAL)
				.where("totalamount", totalAmount, "AND", StringPool.EQUAL)
				.where("totalinuse", totalInUse, "AND", StringPool.EQUAL)
				.where("totalnotused", totalNotUsed, "AND", StringPool.EQUAL)
				.where("totallost", totalLost, "AND", StringPool.EQUAL)
				.where("totalcancelled", totalCancelled, "AND", StringPool.EQUAL)
				.where("totalreturned", totalReturned, "AND", StringPool.EQUAL)
				.where("remark", remark, "AND", StringPool.EQUAL)
				//.where("modifydate", modifyDate, "AND", StringPool.EQUAL)
				//.where("syncdate", syncDate, "AND", StringPool.EQUAL)
				.where(_keywordSearchCondition, null, "AND", "", true).build();
		JSONObject result = JSONFactoryUtil.createJSONObject();
		long total = VROutputSheetDetailsLocalServiceUtil.counData(builder.getCountQuery());
		JSONArray data = VROutputSheetDetailsLocalServiceUtil.findData(builder.getSelectQuery(), null, null,
				VROutputSheetDetailsImpl.class, "VROutputSheetDetails", start, end);
		result.put("total", total);
		result.put("data", data);
		return result;
	}

	@Override
	public JSONObject createVROutputSheetDetail(VROutputSheetDetails object) {
		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		try {
			object = VROutputSheetDetailsLocalServiceUtil.createVROutputSheetDetails(object);

			JSONObject result = ActionUtil.object2Json(object, VROutputSheetDetailsModelImpl.class, StringPool.BLANK);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, result);

		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}
	}

	@Override
	public JSONObject deleteVROutputSheetDetails(long id) {
		VROutputSheet vrIssue = VROutputSheetLocalServiceUtil.fetchVROutputSheet(id);
		if (vrIssue == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}
		try {
			VROutputSheetDetailsLocalServiceUtil.deleteVROutputSheetDetails(id);
		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);
		}

		return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, StringPool.BLANK);
	}

	@Override
	public JSONObject updateVROutputSheetDetails(VROutputSheetDetails object) {
		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		if (object.getId() <= 0) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}

		try {

			object = VROutputSheetDetailsLocalServiceUtil.updateVROutputSheetDetails(object);

			JSONObject result = ActionUtil.object2Json(object, VROutputSheetDetailsModelImpl.class, StringPool.BLANK);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, result);

		} catch (Exception e) {
			_log.error(e);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);
		}
	}

	private Log _log = LogFactoryUtil.getLog(VROutputSheetDetailActionImpl.class);

	@Override
	public JSONObject getVROutputSheetDetail(long id) {
		VROutputSheetDetails outputSheetDetails = VROutputSheetDetailsLocalServiceUtil.fetchVROutputSheetDetails(id);

		if (id <= 0) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}

		if (outputSheetDetails == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}

		try {

			JSONObject result = ActionUtil.object2Json(outputSheetDetails, VROutputSheetDetailsModelImpl.class,
					StringPool.BLANK);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, result);

		} catch (Exception e) {
			_log.error(e);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);
		}
	}
}
