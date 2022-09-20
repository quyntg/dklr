package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRIssueAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.engine.DBField;
import com.fds.vr.business.engine.SQLQueryBuilder;
import com.fds.vr.business.model.VRES;
import com.fds.vr.business.model.VRIssue;
import com.fds.vr.business.model.VRIssueEquipmentCertificate;
import com.fds.vr.business.model.VRIssueVehiclecertificate;
import com.fds.vr.business.model.VRVehicleRecord;
import com.fds.vr.business.model.impl.VRIssueEquipmentCertificateModelImpl;
import com.fds.vr.business.model.impl.VRIssueModelImpl;
import com.fds.vr.business.model.impl.VRIssueVehiclecertificateModelImpl;
import com.fds.vr.business.model.impl.VRVehicleRecordModelImpl;
import com.fds.vr.business.service.VRIssueEquipmentCertificateLocalServiceUtil;
import com.fds.vr.business.service.VRIssueLocalServiceUtil;
import com.fds.vr.business.service.VRIssueVehiclecertificateLocalServiceUtil;
import com.fds.vr.business.service.VRVehicleRecordLocalServiceUtil;
import com.fds.vr.business.service.indexer.ElasticQueryWrapUtil;
import com.fds.vr.service.util.BusinessUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.File;
import java.sql.Types;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.opencps.datamgt.utils.DateTimeUtils;

/**
 * @author trungnt
 *
 */
public class VRIssueActionImpl implements VRIssueAction {

	private Log _log = LogFactoryUtil.getLog(VRIssueActionImpl.class);

	@Override
	public long countVRIssue(User user, ServiceContext serviceContext, LinkedHashMap<String, Object> params) {
		SQLQueryBuilder builder = getBuilder(params);

		return VRIssueLocalServiceUtil.counData(builder.getCountQuery());
	}

	@Override
	public JSONObject createVRIssue(VRIssue object) {
		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		try {
			object = VRIssueLocalServiceUtil.createVRIssue(object);

			JSONObject result = ActionUtil.object2Json(object, VRIssueModelImpl.class, StringPool.BLANK);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, result);

		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}
	}

	@Override
	public JSONObject deleteVRIssue(long id) {
		VRIssue vrIssue = VRIssueLocalServiceUtil.fetchVRIssue(id);
		if (vrIssue == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}
		try {
			VRIssueLocalServiceUtil.deleteVRIssue(id);
		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);
		}

		return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, StringPool.BLANK);
	}

	@Override
	public File doExportVRIssue(User user, ServiceContext serviceContext, LinkedHashMap<String, Object> params,
			String headercodes, String headerlabels) {
		if (Validator.isNull(headercodes)) {
			return null;
		}

		try {

			int start = -1;

			int end = -1;

			SQLQueryBuilder builder = getBuilder(params);

			String[] arrHeaderCodes = StringUtil.split(headercodes);

			String[] arrHeadeLabels = StringUtil.split(headerlabels);

			JSONArray data = VRIssueLocalServiceUtil.findData(builder.getSelectQuery(), builder.getColumnInstances(),
					builder.getDataTypes(), null, null, start, end);

			return ActionUtil.doExportExcelFile("VRIssue", arrHeaderCodes, arrHeadeLabels, data);

		} catch (Exception e) {
			_log.error(e);

			return null;
		}
	}

	@Override
	public JSONObject findVRIssue(User user, ServiceContext serviceContext, LinkedHashMap<String, Object> params) {
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		SQLQueryBuilder builder = getBuilder(params);

		JSONObject result = JSONFactoryUtil.createJSONObject();
		long total = VRIssueLocalServiceUtil.counData(builder.getCountQuery());
		JSONArray data = VRIssueLocalServiceUtil.findData(builder.getSelectQuery(), builder.getColumnInstances(),
				builder.getDataTypes(), null, null, start, end);
		result.put("total", total);
		result.put("data", data);
		return result;
	}

	private SQLQueryBuilder getBuilder(LinkedHashMap<String, Object> params) {

		String keyword = ActionUtil.getKeyword(params);
		Long id = null;
		Long mtCore = null;
		Long dossierId = null;
		String stampIssueNo = null;
		// String appliedDate = null;
		String appliedDateFrom = null;
		String appliedDateTo = null;
		Integer appliedYear = null;
		// String approvedDate = null;
		String stampShortNo = null;
		String vehicleClass = null;
		Long applicantProfileId = null;
		String stampSerialNo = null;
		Integer stampStatus = null;
		/*
		 * String applicantName = null; String applicantAddress = null; String
		 * applicantRepresentative = null; String applicantRepresentativeTitle = null;
		 * String applicantEmail = null; String applicantPhone = null; String
		 * applicantFax = null; String applicantContactName = null; String
		 * applicantContactEmail = null; String applicantContactPhone = null; Long
		 * productionPlantId = null; String productionPlantCode = null; String
		 * productionPlantName = null; String productionPlantAddress = null; String
		 * remarks = null; String methodOfIssue = null; Long totalInDocument = null;
		 * Long issueCorporationId = null; String verifyCorporationId = null; Integer
		 * digitalissuestatus = null;
		 */
		String issueType = null;
		/*
		 * Integer averageSTBQuantity = null; Integer maxMonthQuantity = null; Integer
		 * averageSTMQuantity = null; Integer accumulatedMonthQuantity = null; Integer
		 * totalInUse = null; Integer totalCancelled = null; Integer totalLost = null;
		 * Integer totalNotUsed = null; Integer totalReturned = null;
		 */
		String flow = null;
		/*
		 * String examinationRequired = null; String examinationPeriod = null; String
		 * examinationLastTime = null; String copresult = null; String copreportno =
		 * null; String copreportdate = null; String postreview = null; String
		 * postreviewrecordno = null; String postreviewrecorddate = null; String
		 * corporationId = null; String inspectorcode = null; String inspectorname =
		 * null; String leadername = null; String applicantmaker = null; String
		 * applicantchecker = null; Long inspectorId = null; Long issueInspectorId =
		 * null; Long verifyInspectorId = null; String modifyDate = null; String
		 * syncDate = null;
		 */
		if (params != null) {

			if (params.containsKey("stampserialno")) {
				stampSerialNo = (String) params.get("stampserialno");
			}

			if (params.containsKey("stampstatus")) {
				stampStatus = (Integer) params.get("stampstatus");
			}

			if (params.containsKey("applieddatefrom")) {
				appliedDateFrom = (String) params.get("applieddatefrom");
			}

			if (params.containsKey("applieddateto")) {
				appliedDateTo = (String) params.get("applieddateto");
			}

			if (params.containsKey("stampshortno")) {
				stampShortNo = (String) params.get("stampshortno");
			}

			if (params.containsKey("appliedyear")) {
				appliedYear = (Integer) params.get("appliedyear");
			}

			if (params.containsKey("id")) {
				id = (Long) params.get("id");
			}
			if (params.containsKey("mtcore")) {
				mtCore = (Long) params.get("mtcore");
			}
			if (params.containsKey("dossierid")) {
				dossierId = (Long) params.get("dossierid");
			}
			if (params.containsKey("stampissueno")) {
				stampIssueNo = (String) params.get("stampissueno");
			}
			/*
			 * if (params.containsKey("applieddate")) { appliedDate =
			 * (String)params.get("applieddate"); } if (params.containsKey("approveddate"))
			 * { approvedDate = (String)params.get("approveddate"); }
			 */
			if (params.containsKey("vehicleclass")) {
				vehicleClass = (String) params.get("vehicleclass");
			}
			if (params.containsKey("applicantprofileid")) {
				applicantProfileId = (Long) params.get("applicantprofileid");
			}
			/*
			 * if (params.containsKey("applicantname")) { applicantName =
			 * (String)params.get("applicantname"); } if
			 * (params.containsKey("applicantaddress")) { applicantAddress =
			 * (String)params.get("applicantaddress"); } if
			 * (params.containsKey("applicantrepresentative")) { applicantRepresentative =
			 * (String)params.get("applicantrepresentative"); } if
			 * (params.containsKey("applicantrepresentativetitle")) {
			 * applicantRepresentativeTitle =
			 * (String)params.get("applicantrepresentativetitle"); } if
			 * (params.containsKey("applicantemail")) { applicantEmail =
			 * (String)params.get("applicantemail"); } if
			 * (params.containsKey("applicantphone")) { applicantPhone =
			 * (String)params.get("applicantphone"); } if
			 * (params.containsKey("applicantfax")) { applicantFax =
			 * (String)params.get("applicantfax"); } if
			 * (params.containsKey("applicantcontactname")) { applicantContactName =
			 * (String)params.get("applicantcontactname"); } if
			 * (params.containsKey("applicantcontactemail")) { applicantContactEmail =
			 * (String)params.get("applicantcontactemail"); } if
			 * (params.containsKey("applicantcontactphone")) { applicantContactPhone =
			 * (String)params.get("applicantcontactphone"); } if
			 * (params.containsKey("productionplantid")) { productionPlantId =
			 * (Long)params.get("productionplantid"); } if
			 * (params.containsKey("productionplantcode")) { productionPlantCode =
			 * (String)params.get("productionplantcode"); } if
			 * (params.containsKey("productionplantname")) { productionPlantName =
			 * (String)params.get("productionplantname"); } if
			 * (params.containsKey("productionplantaddress")) { productionPlantAddress =
			 * (String)params.get("productionplantaddress"); } if
			 * (params.containsKey("remarks")) { remarks = (String)params.get("remarks"); }
			 * if (params.containsKey("methodofissue")) { methodOfIssue =
			 * (String)params.get("methodofissue"); } if
			 * (params.containsKey("totalindocument")) { totalInDocument =
			 * (Long)params.get("totalindocument"); } if
			 * (params.containsKey("issuecorporationid")) { issueCorporationId =
			 * (Long)params.get("issuecorporationid"); } if
			 * (params.containsKey("verifycorporationid")) { verifyCorporationId =
			 * (String)params.get("verifycorporationid"); } if
			 * (params.containsKey("digitalissuestatus")) { digitalissuestatus =
			 * (Integer)params.get("digitalissuestatus"); }
			 */
			if (params.containsKey("issuetype")) {
				issueType = (String) params.get("issuetype");
			}
			/*
			 * if (params.containsKey("averagestbquantity")) { averageSTBQuantity =
			 * (Integer)params.get("averagestbquantity"); } if
			 * (params.containsKey("maxmonthquantity")) { maxMonthQuantity =
			 * (Integer)params.get("maxmonthquantity"); } if
			 * (params.containsKey("averagestmquantity")) { averageSTMQuantity =
			 * (Integer)params.get("averagestmquantity"); } if
			 * (params.containsKey("accumulatedmonthquantity")) { accumulatedMonthQuantity =
			 * (Integer)params.get("accumulatedmonthquantity"); } if
			 * (params.containsKey("totalinuse")) { totalInUse =
			 * (Integer)params.get("totalinuse"); } if
			 * (params.containsKey("totalcancelled")) { totalCancelled =
			 * (Integer)params.get("totalcancelled"); } if (params.containsKey("totallost"))
			 * { totalLost = (Integer)params.get("totallost"); } if
			 * (params.containsKey("totalnotused")) { totalNotUsed =
			 * (Integer)params.get("totalnotused"); } if
			 * (params.containsKey("totalreturned")) { totalReturned =
			 * (Integer)params.get("totalreturned"); }
			 */
			if (params.containsKey("flow")) {
				flow = (String) params.get("flow");
			}
			/*
			 * if (params.containsKey("examinationrequired")) { examinationRequired =
			 * (String)params.get("examinationrequired"); } if
			 * (params.containsKey("examinationperiod")) { examinationPeriod =
			 * (String)params.get("examinationperiod"); } if
			 * (params.containsKey("examinationlasttime")) { examinationLastTime =
			 * (String)params.get("examinationlasttime"); } if
			 * (params.containsKey("copresult")) { copresult =
			 * (String)params.get("copresult"); } if (params.containsKey("copreportno")) {
			 * copreportno = (String)params.get("copreportno"); } if
			 * (params.containsKey("copreportdate")) { copreportdate =
			 * (String)params.get("copreportdate"); } if (params.containsKey("postreview"))
			 * { postreview = (String)params.get("postreview"); } if
			 * (params.containsKey("postreviewrecordno")) { postreviewrecordno =
			 * (String)params.get("postreviewrecordno"); } if
			 * (params.containsKey("postreviewrecorddate")) { postreviewrecorddate =
			 * (String)params.get("postreviewrecorddate"); } if
			 * (params.containsKey("corporationid")) { corporationId =
			 * (String)params.get("corporationid"); } if
			 * (params.containsKey("inspectorcode")) { inspectorcode =
			 * (String)params.get("inspectorcode"); } if
			 * (params.containsKey("inspectorname")) { inspectorname =
			 * (String)params.get("inspectorname"); } if (params.containsKey("leadername"))
			 * { leadername = (String)params.get("leadername"); } if
			 * (params.containsKey("applicantmaker")) { applicantmaker =
			 * (String)params.get("applicantmaker"); } if
			 * (params.containsKey("applicantchecker")) { applicantchecker =
			 * (String)params.get("applicantchecker"); } if
			 * (params.containsKey("inspectorid")) { inspectorId =
			 * (Long)params.get("inspectorid"); } if
			 * (params.containsKey("issueinspectorid")) { issueInspectorId =
			 * (Long)params.get("issueinspectorid"); } if
			 * (params.containsKey("verifyinspectorid")) { verifyInspectorId =
			 * (Long)params.get("verifyinspectorid"); } if
			 * (params.containsKey("modifydate")) { modifyDate =
			 * (String)params.get("modifydate"); } if (params.containsKey("syncdate")) {
			 * syncDate = (String)params.get("syncdate"); }
			 */
		}
		String _keywordSearchCondition =
				// + ActionUtil.buildSQLCondition("vehicleClass", keyword, "OR",
				// StringPool.LIKE, "")
				ActionUtil.buildSQLCondition("applicantName", keyword, "", StringPool.LIKE, "")
						+ ActionUtil.buildSQLCondition("applicantAddress", keyword, "OR", StringPool.LIKE, "");
		// + ActionUtil.buildSQLCondition("applicantRepresentative", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("applicantRepresentativeTitle", keyword, "OR",
		// StringPool.LIKE,"")
		// + ActionUtil.buildSQLCondition("applicantEmail", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("applicantPhone", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("applicantFax", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("applicantContactName", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("applicantContactEmail", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("applicantContactPhone", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("productionPlantCode", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("productionPlantName", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("productionPlantAddress", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("remarks", keyword, "OR", StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("methodOfIssue", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("verifyCorporationId", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("issueType", keyword, "OR", StringPool.LIKE,
		// "")
		// + ActionUtil.buildSQLCondition("flow", keyword, "OR", StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("examinationRequired", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("examinationPeriod", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("copresult", keyword, "OR", StringPool.LIKE,
		// "")
		// + ActionUtil.buildSQLCondition("copreportno", keyword, "OR", StringPool.LIKE,
		// "")
		// + ActionUtil.buildSQLCondition("postreview", keyword, "OR", StringPool.LIKE,
		// "")
		// + ActionUtil.buildSQLCondition("postreviewrecordno", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("corporationId", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("inspectorcode", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("inspectorname", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("leadername", keyword, "OR", StringPool.LIKE,
		// "")
		// + ActionUtil.buildSQLCondition("applicantmaker", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("applicantchecker", keyword, "OR",
		// StringPool.LIKE, "");
		SQLQueryBuilder builder = new SQLQueryBuilder();
		// builder.selectAll(VRIssueModelImpl.class, VROutputSheetModelImpl.class,
		// VROutputSheetDetailsModelImpl.class, VRInputStampbookDetailsModelImpl.class)
		builder.select(DBField.ins("vr_issue.inspectorId AS inspectorId", Types.BIGINT),
				DBField.ins("vr_issue.id AS issueid", Types.BIGINT),
				DBField.ins("vr_issue.applicantName AS applicantName", Types.VARCHAR),
				DBField.ins("vr_issue.approvedDate AS approvedDate", Types.DATE),
				DBField.ins("vr_issue.issueCorporationId AS issueCorporationId", Types.BIGINT),
				DBField.ins("vr_issue.issueType AS issueType", Types.BIGINT),
				DBField.ins("vr_issue.issueInspectorId AS issueInspectorId", Types.BIGINT),
				DBField.ins("vr_issue.dossierId AS dossierId", Types.BIGINT),
				DBField.ins("vr_issue.copreportno AS copreportno", Types.VARCHAR),
				DBField.ins("vr_issue.applicantProfileId AS applicantProfileId", Types.BIGINT),
				DBField.ins("vr_issue.productionPlantCode AS productionPlantCode", Types.VARCHAR),
				DBField.ins("vr_issue.vehicleClass AS vehicleClass", Types.VARCHAR),
				DBField.ins("vr_issue.mtCore AS mtCore", Types.INTEGER),
				DBField.ins("vr_issue.appliedDate AS appliedDate", Types.DATE),
				DBField.ins("vr_issue.stampIssueNo AS stampIssueNo", Types.VARCHAR),
				DBField.ins("vr_issue.productionPlantId AS productionPlantId", Types.BIGINT),
				DBField.ins("vr_issue.verifyCorporationId AS verifyCorporationId", Types.BIGINT),
				DBField.ins("vr_outputsheet.isApproval AS isApproval", Types.INTEGER),
				DBField.ins("vr_outputsheet.outputSheetNo AS outputSheetNo", Types.VARCHAR),
				DBField.ins("vr_outputsheet.supplierCorporationId AS supplierCorporationId", Types.BIGINT),
				DBField.ins("vr_outputsheet.bookIDList AS bookIDList", Types.VARCHAR),
				DBField.ins("vr_outputsheet.id AS outputsheetid", Types.BIGINT),
				DBField.ins("vr_outputsheet.outputSheetDate AS outputSheetDate", Types.DATE),
				DBField.ins("vr_outputsheet.outputSheetType AS outputSheetType", Types.VARCHAR),
				DBField.ins("vr_outputsheet.purchaserCorporationId AS purchaserCorporationId", Types.BIGINT),
				DBField.ins("vr_outputsheetdetails.stampShortNo AS stampShortNo", Types.VARCHAR),
				DBField.ins("vr_outputsheetdetails.certificateId AS certificateId", Types.BIGINT),
				DBField.ins("vr_outputsheetdetails.stampType AS stampType", Types.VARCHAR),
				DBField.ins("vr_outputsheetdetails.issueVehicleCertificateId AS issueVehicleCertificateId",
						Types.BIGINT),
				DBField.ins("vr_outputsheetdetails.serialStartNo AS serialStartNo", Types.VARCHAR),
				DBField.ins("vr_outputsheetdetails.id AS outputsheetdetailid", Types.BIGINT),
				DBField.ins("vr_outputsheetdetails.inputSheetId AS inputSheetId", Types.BIGINT),
				DBField.ins("vr_outputsheetdetails.bookId AS bookId", Types.BIGINT),
				DBField.ins("vr_outputsheetdetails.certificateNumber AS certificateNumber", Types.VARCHAR),
				DBField.ins("vr_outputsheetdetails.outputSheetId AS outputSheetId", Types.BIGINT),
				DBField.ins("vr_outputsheetdetails.serialEndNo AS serialEndNo", Types.VARCHAR),
				DBField.ins("vr_inputstampbookdetails.frameNo AS frameNo", Types.VARCHAR),
				DBField.ins("vr_inputstampbookdetails.vehicleRecordId AS vehicleRecordId", Types.BIGINT),
				DBField.ins("vr_inputstampbookdetails.vinNo AS vinNo", Types.VARCHAR),
				DBField.ins("vr_inputstampbookdetails.qrCode AS qrCode", Types.VARCHAR),
				DBField.ins("vr_inputstampbookdetails.issuingStatus AS issuingStatus", Types.INTEGER),
				DBField.ins("vr_inputstampbookdetails.BoxNo AS BoxNo", Types.VARCHAR),
				DBField.ins("vr_inputstampbookdetails.id AS inputstampbookdetailid", Types.BIGINT),
				DBField.ins("vr_inputstampbookdetails.engineNo AS engineNo", Types.VARCHAR),
				DBField.ins("vr_inputstampbookdetails.clearingStatus AS clearingStatus", Types.INTEGER),
				DBField.ins("vr_inputstampbookdetails.stampStatus AS stampStatus", Types.INTEGER),
				DBField.ins("vr_inputstampbookdetails.stampSerialNo AS stampSerialNo", Types.VARCHAR),
				DBField.ins("vr_inputstampbookdetails.clearingAdvancePaymentID AS clearingAdvancePaymentID",
						Types.BIGINT),
				DBField.ins("vr_inputstampbookdetails.replacedSerialNo AS replacedSerialNo", Types.VARCHAR))

				.from("vr_issue").join("INNER JOIN", "vr_issue", "applicantprofileid", "vr_applicantprofile", "id")
				.join("INNER JOIN", "vr_issue", "id", "vr_outputsheet", "issueid")
				.join("INNER JOIN", "vr_outputsheet", "id", "vr_outputsheetdetails", "outputsheetid")
				.join("INNER JOIN", "vr_outputsheetdetails", "bookid", "vr_inputstampbookdetails", "bookid")
				.where("id", id, "AND", StringPool.EQUAL).where("mtcore", mtCore, "AND", StringPool.EQUAL)
				.where("dossierid", dossierId, "AND", StringPool.EQUAL)
				.where("stampissueno", stampIssueNo, "AND", StringPool.EQUAL)
				// .where("applieddate", appliedDate, "AND", StringPool.EQUAL)
				// .where("approveddate", approvedDate, "AND", StringPool.EQUAL)
				.where("vehicleclass", vehicleClass, "AND", StringPool.EQUAL, "vr_issue")
				// .where("applicantprofileid", applicantProfileId, "AND", StringPool.EQUAL)
				// .where("applicantname", applicantName, "AND", StringPool.EQUAL)
				// .where("applicantaddress", applicantAddress, "AND", StringPool.EQUAL)
				// .where("applicantrepresentative", applicantRepresentative, "AND",
				// StringPool.EQUAL)
				// .where("applicantrepresentativetitle", applicantRepresentativeTitle, "AND",
				// StringPool.EQUAL)
				// .where("applicantemail", applicantEmail, "AND", StringPool.EQUAL)
				// .where("applicantphone", applicantPhone, "AND", StringPool.EQUAL)
				// .where("applicantfax", applicantFax, "AND", StringPool.EQUAL)
				// .where("applicantcontactname", applicantContactName, "AND", StringPool.EQUAL)
				// .where("applicantcontactemail", applicantContactEmail, "AND",
				// StringPool.EQUAL)
				// .where("applicantcontactphone", applicantContactPhone, "AND",
				// StringPool.EQUAL)
				// .where("productionplantid", productionPlantId, "AND", StringPool.EQUAL)
				// .where("productionplantcode", productionPlantCode, "AND", StringPool.EQUAL)
				// .where("productionplantname", productionPlantName, "AND", StringPool.EQUAL)
				// .where("productionplantaddress", productionPlantAddress, "AND",
				// StringPool.EQUAL)
				// .where("remarks", remarks, "AND", StringPool.EQUAL)
				// .where("methodofissue", methodOfIssue, "AND", StringPool.EQUAL)
				// .where("totalindocument", totalInDocument, "AND", StringPool.EQUAL)
				// .where("issuecorporationid", issueCorporationId, "AND", StringPool.EQUAL)
				// .where("verifycorporationid", verifyCorporationId, "AND", StringPool.EQUAL)
				// .where("digitalissuestatus", digitalissuestatus, "AND", StringPool.EQUAL)
				.where("issuetype", issueType, "AND", StringPool.EQUAL)
				// .where("averagestbquantity", averageSTBQuantity, "AND", StringPool.EQUAL)
				// .where("maxmonthquantity", maxMonthQuantity, "AND", StringPool.EQUAL)
				// .where("averagestmquantity", averageSTMQuantity, "AND", StringPool.EQUAL)
				// .where("accumulatedmonthquantity", accumulatedMonthQuantity, "AND",
				// StringPool.EQUAL)
				// .where("totalinuse", totalInUse, "AND", StringPool.EQUAL)
				// .where("totalcancelled", totalCancelled, "AND", StringPool.EQUAL)
				// .where("totallost", totalLost, "AND", StringPool.EQUAL)
				// .where("totalnotused", totalNotUsed, "AND", StringPool.EQUAL)
				// .where("totalreturned", totalReturned, "AND", StringPool.EQUAL)
				.where("flow", flow, "AND", StringPool.EQUAL)
				// .where("examinationrequired", examinationRequired, "AND", StringPool.EQUAL)
				// .where("examinationperiod", examinationPeriod, "AND", StringPool.EQUAL)
				// .where("examinationlasttime", examinationLastTime, "AND", StringPool.EQUAL)
				// .where("copresult", copresult, "AND", StringPool.EQUAL)
				// .where("copreportno", copreportno, "AND", StringPool.EQUAL)
				// .where("copreportdate", copreportdate, "AND", StringPool.EQUAL)
				// .where("postreview", postreview, "AND", StringPool.EQUAL)
				// .where("postreviewrecordno", postreviewrecordno, "AND", StringPool.EQUAL)
				// .where("postreviewrecorddate", postreviewrecorddate, "AND", StringPool.EQUAL)
				// .where("corporationid", corporationId, "AND", StringPool.EQUAL)
				// .where("inspectorcode", inspectorcode, "AND", StringPool.EQUAL)
				// .where("inspectorname", inspectorname, "AND", StringPool.EQUAL)
				// .where("leadername", leadername, "AND", StringPool.EQUAL)
				// .where("applicantmaker", applicantmaker, "AND", StringPool.EQUAL)
				// .where("applicantchecker", applicantchecker, "AND", StringPool.EQUAL)
				// .where("inspectorid", inspectorId, "AND", StringPool.EQUAL)
				// .where("issueinspectorid", issueInspectorId, "AND", StringPool.EQUAL)
				// .where("verifyinspectorid", verifyInspectorId, "AND", StringPool.EQUAL)
				// .where("modifydate", modifyDate, "AND", StringPool.EQUAL)
				// .where("syncdate", syncDate, "AND", StringPool.EQUAL)
				.where(_keywordSearchCondition, null, "AND", "", true);

		if (Validator.isNotNull(stampSerialNo)) {
			builder.joinwhere("vr_inputstampbookdetails.stampSerialNo", stampSerialNo, " AND ", StringPool.EQUAL);
		}

		if (stampStatus != null) {
			builder.joinwhere("vr_inputstampbookdetails.stampStatus", stampSerialNo, " AND ", StringPool.EQUAL);
		}

		if (applicantProfileId != null) {
			builder.joinwhere("vr_issue.applicantprofileid", applicantProfileId, " AND ", StringPool.EQUAL);
		}

		if (Validator.isNotNull(stampShortNo)) {
			builder.joinwhere("vr_outputsheetdetails.stampshortno", stampShortNo, " AND ", StringPool.LIKE);
		}

		if (appliedYear != null && appliedYear > 0) {
			builder.where("year(vr_issue.appliedDate)", appliedYear, " AND ", StringPool.EQUAL);
		} else {
			if (Validator.isNotNull(appliedDateFrom) || Validator.isNotNull(appliedDateTo)) {
				if (Validator.isNotNull(appliedDateFrom)) {
					Date dateFrom = DateTimeUtils.convertStringToDate(appliedDateFrom,
							DateTimeUtils._MYSQL_TIME_FORMAT);
					if (dateFrom != null) {
						Calendar cf = Calendar.getInstance();
						cf.setTime(dateFrom);
						cf.set(Calendar.HOUR_OF_DAY, 0);
						cf.set(Calendar.MINUTE, 0);
						cf.set(Calendar.SECOND, 0);
						// 2019-11-28 14:05:34
						String strDateFrom = DateTimeUtils.convertDateToString(cf.getTime(),
								DateTimeUtils._MYSQL_TIME_FORMAT);

						builder.where("applieddate", strDateFrom, " AND ", ">=", "vr_issue");
					}
				}

				if (Validator.isNotNull(appliedDateTo)) {
					Date dateTo = DateTimeUtils.convertStringToDate(appliedDateTo, DateTimeUtils._MYSQL_TIME_FORMAT);
					if (dateTo != null) {
						Calendar ct = Calendar.getInstance();
						ct.setTime(dateTo);
						ct.set(Calendar.HOUR_OF_DAY, 23);
						ct.set(Calendar.MINUTE, 59);
						ct.set(Calendar.SECOND, 59);
						// 2019-11-28 14:05:34
						String strDateTo = DateTimeUtils.convertDateToString(ct.getTime(),
								DateTimeUtils._MYSQL_TIME_FORMAT);

						builder.where("applieddate", strDateTo, " AND ", "<=", "vr_issue");
					}
				}
			}
		}

		return builder.build();
	}

	@Override
	public JSONObject updateVRIssue(VRIssue object) {
		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		if (object.getId() <= 0) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}

		try {

			object = VRIssueLocalServiceUtil.updateVRIssue(object);

			JSONObject result = ActionUtil.object2Json(object, VRIssueModelImpl.class, StringPool.BLANK);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, result);

		} catch (Exception e) {
			_log.error(e);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}
	}

	@Override
	public void indexing(VRIssue vrIssue, Company company) throws SystemException, PortalException {
		final String CLASS_NAME = VRES.class.getName();
		JSONObject object = JSONFactoryUtil.createJSONObject();
		JSONObject jVRIssue = BusinessUtil.object2Json_originValue(vrIssue, VRIssueModelImpl.class, StringPool.BLANK);
		object.put("vr_Issue", jVRIssue);
		Long mtCore = vrIssue.getMtCore();

		if (mtCore == 1L) {
			long dossierId = vrIssue.getDossierId();

			List<VRVehicleRecord> vrVehicleRecords = VRVehicleRecordLocalServiceUtil.findBydossierId(mtCore, dossierId);
			object = BusinessUtil.array2JSON(vrVehicleRecords, VRVehicleRecordModelImpl.class, object,
					"vr_VehicleRecord");

			List<VRIssueVehiclecertificate> vrIssueVehiclecertificates = VRIssueVehiclecertificateLocalServiceUtil
					.findBydossierId(mtCore, dossierId);
			object = BusinessUtil.array2JSON(vrIssueVehiclecertificates, VRIssueVehiclecertificateModelImpl.class,
					object, "vr_Issue_VehicleCertificate");

			List<VRIssueEquipmentCertificate> vrIssueEquipmentCertificates = VRIssueEquipmentCertificateLocalServiceUtil
					.findByDossierId_MtCore(dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			object = BusinessUtil.array2JSON(vrIssueEquipmentCertificates, VRIssueEquipmentCertificateModelImpl.class,
					object, "vr_Issue_EquipmentCertificate");

			JSONObject esData = JSONFactoryUtil.createJSONObject();
			esData.put("dossierId", String.valueOf(vrIssue.getDossierId()));
			esData.put("type_es", "vr_issue");
			esData.put(Field.MODIFIED_DATE + "_es", new Date().getTime());
			esData.put(Field.COMPANY_ID, String.valueOf(company.getCompanyId()));
			esData.put("id", String.valueOf(vrIssue.getId()));
			esData.put("data", object);

			int deletex = ElasticQueryWrapUtil.DELETE("dossierId", String.valueOf(vrIssue.getDossierId()),
					company.getCompanyId(), "vr_issue");
			if (deletex == 0) {
				ElasticQueryWrapUtil.POST(esData.toJSONString(), CLASS_NAME, company.getCompanyId());
			}
			_log.info("---> DocumentId - DossierId: " + vrIssue.getDossierId());
		} else if (mtCore == 0L) {
			long issueId = vrIssue.getPrimaryKey();

			List<VRVehicleRecord> vrVehicleRecords = VRVehicleRecordLocalServiceUtil.findByIssueId(issueId,
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			object = BusinessUtil.array2JSON(vrVehicleRecords, VRVehicleRecordModelImpl.class, object,
					"vr_VehicleRecord");

			List<VRIssueVehiclecertificate> vrIssueVehiclecertificates = VRIssueVehiclecertificateLocalServiceUtil
					.findByIssueId(issueId, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			object = BusinessUtil.array2JSON(vrIssueVehiclecertificates, VRIssueVehiclecertificateModelImpl.class,
					object, "vr_Issue_VehicleCertificate");

			List<VRIssueEquipmentCertificate> vrIssueEquipmentCertificates = VRIssueEquipmentCertificateLocalServiceUtil
					.findByIssueId(issueId, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			object = BusinessUtil.array2JSON(vrIssueEquipmentCertificates, VRIssueEquipmentCertificateModelImpl.class,
					object, "vr_Issue_EquipmentCertificate");

			JSONObject esData = JSONFactoryUtil.createJSONObject();
			esData.put("dossierId", String.valueOf(vrIssue.getDossierId()));
			esData.put("type_es", "vr_issue");
			esData.put(Field.MODIFIED_DATE + "_es", new Date().getTime());
			esData.put(Field.COMPANY_ID, String.valueOf(company.getCompanyId()));
			esData.put("id", String.valueOf(vrIssue.getId()));
			esData.put("data", object);

			int deletex = ElasticQueryWrapUtil.DELETE("id", String.valueOf(vrIssue.getPrimaryKey()),
					company.getCompanyId(), "vr_issue");
			if (deletex == 0) {
				ElasticQueryWrapUtil.POST(esData.toJSONString(), CLASS_NAME, company.getCompanyId());
			}
			_log.info("---> DocumentId - IssueId: " + vrIssue.getPrimaryKey());
		}

		_log.info("=== DONE INDEXING ===");
	}

	@Override
	public JSONObject findByPrimaryKey(User user, ServiceContext serviceContext, long issueId) {
		VRIssue vrIssue = VRIssueLocalServiceUtil.fetchVRIssue(issueId);
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			result = BusinessUtil.object2Json_originColumnName(vrIssue, VRIssueModelImpl.class, StringPool.BLANK);
		} catch (JSONException e) {
			_log.error(e);
		}
		return result;
	}
}
