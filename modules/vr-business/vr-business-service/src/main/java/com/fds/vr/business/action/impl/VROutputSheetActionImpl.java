package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VROutputSheetAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.engine.SQLQueryBuilder;
import com.fds.vr.business.model.VRES;
import com.fds.vr.business.model.VROutputSheet;
import com.fds.vr.business.model.VROutputSheetDetails;
import com.fds.vr.business.model.impl.VROutputSheetDetailsModelImpl;
import com.fds.vr.business.model.impl.VROutputSheetImpl;
import com.fds.vr.business.model.impl.VROutputSheetModelImpl;
import com.fds.vr.business.service.VROutputSheetDetailsLocalServiceUtil;
import com.fds.vr.business.service.VROutputSheetLocalServiceUtil;
import com.fds.vr.business.service.indexer.ElasticQueryWrapUtil;
import com.fds.vr.service.util.BusinessUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

/**
 * @author trungnt
 *
 */
public class VROutputSheetActionImpl implements VROutputSheetAction {

	@Override
	public JSONObject findVROutputSheet(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		String keyword = ActionUtil.getKeyword(params);
		Long id = null;
		Long mtCore = null;
		String outputSheetNo = null;
		String outputSheetDate = null;
		String originalDocumentNo = null;
		Long supplierCorporationId = null;
		Long outputSheetType = null;
		String maker = null;
		String checker = null;
		String approver = null;
		String receiverName = null;
		String receiverPlace = null;
		String receiverRequest = null;
		String inventoryName = null;
		String inventoryPlace = null;
		String inventoryDate = null;
		Long dossierId = null;
		Long issueId = null;
		Long purchaserId = null;
		Long purchaserCorporationId = null;
		String bookIDList = null;
		Long isApproval = null;
		Long totalQuantities = null;
		Long totalAmount = null;
		String amountInWords = null;
		String remark = null;
		// String modifyDate = null;
		// String syncDate = null;
		if (params != null) {
			if (params.containsKey("id")) {
				id = GetterUtil.getLong(params.get("id"));
			}
			if (params.containsKey("mtcore")) {
				mtCore = GetterUtil.getLong(params.get("mtcore"));
			}
			if (params.containsKey("outputsheetno")) {
				outputSheetNo = GetterUtil.getString(params.get("outputsheetno"));
			}
			if (params.containsKey("outputsheetdate")) {
				outputSheetDate = GetterUtil.getString(params.get("outputsheetdate"));
			}
			if (params.containsKey("originaldocumentno")) {
				originalDocumentNo = GetterUtil.getString(params.get("originaldocumentno"));
			}
			if (params.containsKey("suppliercorporationid")) {
				supplierCorporationId = GetterUtil.getLong(params.get("suppliercorporationid"));
			}
			if (params.containsKey("outputsheettype")) {
				outputSheetType = GetterUtil.getLong(params.get("outputsheettype"));
			}
			if (params.containsKey("maker")) {
				maker = GetterUtil.getString(params.get("maker"));
			}
			if (params.containsKey("checker")) {
				checker = GetterUtil.getString(params.get("checker"));
			}
			if (params.containsKey("approver")) {
				approver = GetterUtil.getString(params.get("approver"));
			}
			if (params.containsKey("receivername")) {
				receiverName = GetterUtil.getString(params.get("receivername"));
			}
			if (params.containsKey("receiverplace")) {
				receiverPlace = GetterUtil.getString(params.get("receiverplace"));
			}
			if (params.containsKey("receiverrequest")) {
				receiverRequest = GetterUtil.getString(params.get("receiverrequest"));
			}
			if (params.containsKey("inventoryname")) {
				inventoryName = GetterUtil.getString(params.get("inventoryname"));
			}
			if (params.containsKey("inventoryplace")) {
				inventoryPlace = GetterUtil.getString(params.get("inventoryplace"));
			}
			if (params.containsKey("inventorydate")) {
				inventoryDate = GetterUtil.getString(params.get("inventorydate"));
			}
			if (params.containsKey("dossierid")) {
				dossierId = GetterUtil.getLong(params.get("dossierid"));
			}
			if (params.containsKey("issueid")) {
				issueId = GetterUtil.getLong(params.get("issueid"));
			}
			if (params.containsKey("purchaserid")) {
				purchaserId = GetterUtil.getLong(params.get("purchaserid"));
			}
			if (params.containsKey("purchasercorporationid")) {
				purchaserCorporationId = GetterUtil.getLong(params.get("purchasercorporationid"));
			}
			if (params.containsKey("bookidlist")) {
				bookIDList = GetterUtil.getString(params.get("bookidlist"));
			}
			if (params.containsKey("isapproval")) {
				isApproval = GetterUtil.getLong(params.get("isapproval"));
			}
			if (params.containsKey("totalquantities")) {
				totalQuantities = GetterUtil.getLong(params.get("totalquantities"));
			}
			if (params.containsKey("totalamount")) {
				totalAmount = GetterUtil.getLong(params.get("totalamount"));
			}
			if (params.containsKey("amountinwords")) {
				amountInWords = GetterUtil.getString(params.get("amountinwords"));
			}
			if (params.containsKey("remark")) {
				remark = GetterUtil.getString(params.get("remark"));
			}
			/*
			 * if (params.containsKey("modifydate")) { modifyDate =
			 * GetterUtil.getString(params.get("modifydate")); } if
			 * (params.containsKey("syncdate")) { syncDate =
			 * GetterUtil.getString(params.get("syncdate")); }
			 */
		}
		String _keywordSearchCondition = ActionUtil.buildSQLCondition("outputSheetNo", keyword, "", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("originalDocumentNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("maker", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("checker", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("approver", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("receiverName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("receiverPlace", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("receiverRequest", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("inventoryName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("inventoryPlace", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("bookIDList", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("amountInWords", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("remark", keyword, "OR", StringPool.LIKE, "");
		SQLQueryBuilder builder = new SQLQueryBuilder();
		builder.selectAll().from("vr_outputsheet").where("id", id, "AND", StringPool.EQUAL)
				.where("mtcore", mtCore, "AND", StringPool.EQUAL)
				.where("outputsheetno", outputSheetNo, "AND", StringPool.EQUAL)
				.where("outputsheetdate", outputSheetDate, "AND", StringPool.EQUAL)
				.where("originaldocumentno", originalDocumentNo, "AND", StringPool.EQUAL)
				.where("suppliercorporationid", supplierCorporationId, "AND", StringPool.EQUAL)
				.where("outputsheettype", outputSheetType, "AND", StringPool.EQUAL)
				.where("maker", maker, "AND", StringPool.EQUAL).where("checker", checker, "AND", StringPool.EQUAL)
				.where("approver", approver, "AND", StringPool.EQUAL)
				.where("receivername", receiverName, "AND", StringPool.EQUAL)
				.where("receiverplace", receiverPlace, "AND", StringPool.EQUAL)
				.where("receiverrequest", receiverRequest, "AND", StringPool.EQUAL)
				.where("inventoryname", inventoryName, "AND", StringPool.EQUAL)
				.where("inventoryplace", inventoryPlace, "AND", StringPool.EQUAL)
				.where("inventorydate", inventoryDate, "AND", StringPool.EQUAL)
				.where("dossierid", dossierId, "AND", StringPool.EQUAL)
				.where("issueid", issueId, "AND", StringPool.EQUAL)
				.where("purchaserid", purchaserId, "AND", StringPool.EQUAL)
				.where("purchasercorporationid", purchaserCorporationId, "AND", StringPool.EQUAL)
				.where("bookidlist", bookIDList, "AND", StringPool.EQUAL)
				.where("isapproval", isApproval, "AND", StringPool.EQUAL)
				.where("totalquantities", totalQuantities, "AND", StringPool.EQUAL)
				.where("totalamount", totalAmount, "AND", StringPool.EQUAL)
				.where("amountinwords", amountInWords, "AND", StringPool.EQUAL)
				.where("remark", remark, "AND", StringPool.EQUAL)
				// .where("modifydate", modifyDate, "AND", StringPool.EQUAL)
				// .where("syncdate", syncDate, "AND", StringPool.EQUAL)
				.where(_keywordSearchCondition, null, "AND", "", true).build();
		JSONObject result = JSONFactoryUtil.createJSONObject();
		long total = VROutputSheetLocalServiceUtil.counData(builder.getCountQuery());
		JSONArray data = VROutputSheetLocalServiceUtil.findData(builder.getSelectQuery(), null, null,
				VROutputSheetImpl.class, "VROutputSheet", start, end);
		result.put("total", total);
		result.put("data", data);
		return result;
	}

	@Override
	public JSONObject createVROutputSheet(VROutputSheet object) {
		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		try {
			object = VROutputSheetLocalServiceUtil.createVROutputSheet(object);

			JSONObject result = ActionUtil.object2Json(object, VROutputSheetModelImpl.class, StringPool.BLANK);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, result);

		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}
	}

	@Override
	public JSONObject deleteVROutputSheet(long id) {
		VROutputSheet vrIssue = VROutputSheetLocalServiceUtil.fetchVROutputSheet(id);
		if (vrIssue == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}
		try {
			VROutputSheetLocalServiceUtil.deleteVROutputSheet(id);
		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);
		}

		return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, StringPool.BLANK);
	}

	@Override
	public JSONObject updateVROutputSheet(VROutputSheet object) {
		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		if (object.getId() <= 0) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}

		try {

			object = VROutputSheetLocalServiceUtil.updateVROutputSheet(object);

			JSONObject result = ActionUtil.object2Json(object, VROutputSheetModelImpl.class, StringPool.BLANK);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, result);

		} catch (Exception e) {
			_log.error(e);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);
		}
	}

	private Log _log = LogFactoryUtil.getLog(VROutputSheetActionImpl.class);

	@Override
	public void indexing(VROutputSheet vrOutputSheet, Company company) throws SystemException, PortalException {
		final String CLASS_NAME = VRES.class.getName();
		JSONObject object = JSONFactoryUtil.createJSONObject();
		JSONObject jVROutputSheet = BusinessUtil.object2Json_originValue(vrOutputSheet, VROutputSheetModelImpl.class,
				StringPool.BLANK);
		object.put("vr_OutputSheet", jVROutputSheet);

		List<VROutputSheetDetails> vrOutputSheetDetails = VROutputSheetDetailsLocalServiceUtil
				.findByOutputSheetId(vrOutputSheet.getMtCore(), vrOutputSheet.getPrimaryKey());
		object = BusinessUtil.array2JSON(vrOutputSheetDetails, VROutputSheetDetailsModelImpl.class, object,
				"vr_OutputSheetDetails");

		JSONObject esData = JSONFactoryUtil.createJSONObject();
		esData.put("type_es", "vr_outputsheet");
		esData.put(Field.MODIFIED_DATE + "_es", new Date().getTime());
		esData.put(Field.COMPANY_ID, String.valueOf(company.getCompanyId()));
		esData.put("id", String.valueOf(vrOutputSheet.getId()));
		esData.put("data", object);

		int deletex = ElasticQueryWrapUtil.DELETE("id", String.valueOf(vrOutputSheet.getPrimaryKey()),
				company.getCompanyId(), "vr_outputsheet");
		if (deletex == 0) {
			ElasticQueryWrapUtil.POST(esData.toJSONString(), CLASS_NAME, company.getCompanyId());
		}
		_log.info("---> DocumentId - outputSheetId: " + vrOutputSheet.getPrimaryKey());

		_log.info("=== DONE INDEXING ===");
	}
}
