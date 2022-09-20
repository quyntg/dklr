package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRApplicantProfileAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.constant.VRKeys;
import com.fds.vr.business.engine.SQLQueryBuilder;
import com.fds.vr.business.model.VRApplicantProfile;
import com.fds.vr.business.model.VRES;
import com.fds.vr.business.model.VRProductionPlant;
import com.fds.vr.business.model.impl.VRApplicantProfileImpl;
import com.fds.vr.business.model.impl.VRApplicantProfileModelImpl;
import com.fds.vr.business.model.impl.VRProductionPlantModelImpl;
import com.fds.vr.business.service.VRApplicantProfileLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantLocalServiceUtil;
import com.fds.vr.business.service.indexer.ElasticQueryWrapUtil;
import com.fds.vr.service.util.BusinessUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.opencps.usermgt.model.Applicant;
import org.opencps.usermgt.service.ApplicantLocalServiceUtil;
import org.opencps.usermgt.service.util.DateTimeUtils;

/**
 * @author trungnt
 *
 */
public class VRApplicantProfileActionImpl implements VRApplicantProfileAction {
	private Log _log = LogFactoryUtil.getLog(VRApplicantProfileActionImpl.class);

	@Override
	public JSONObject findVRApplicantProfile(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {

		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		String keyword = ActionUtil.getKeyword(params);
		Long id = null;
		Long mtCore = null;
		// String mappingMA_CTY = null;
		// String mappingTEN_CTY = null;
		// String mappingDIA_CHI_CTY = null;
		// String mappingNote = null;
		// String mappingStatus = null;
		String applicantCode = null;
		// String applicantName = null;
		// String applicantAddress = null;
		// String applicantPhone = null;
		// String applicantEmail = null;
		// String applicantFax = null;
		// String applicantRepresentative = null;
		// String applicantRepresentativeTitle = null;
		// String applicantContactName = null;
		// String applicantContactEmail = null;
		// String applicantContactPhone = null;
		// String applicantNationality = null;
		// String applicantRegion = null;
		// String applicantCity = null;
		// String markupCorporation = null;
		String corporationId = null;
		// String markupDesigner = null;
		// String markupOverseasManufacturer = null;
		String markupDomesticsManufacturer = null;
		String markupImporter = null;
		String markupComponentXCG = null;
		String markupComponentXMY = null;
		String markupComponentXCD = null;
		String markupComponentXDD = null;
		String markupComponentXCN = null;
		String markupComponentXCH = null;
		String markupXCG = null;
		String markupXMY = null;
		String markupXCD = null;
		String markupXDD = null;
		String markupXCN = null;
		String markupXCH = null;
		String issueTypeXCG = null;
		String issueTypeXMY = null;
		String issueTypeXCD = null;
		String issueTypeXDD = null;
		String issueTypeXCN = null;
		String issueTypeXCH = null;
		// String issueTypeDescription = null;
		// String applicantCeremonyDate = null;
		// String applicantOperationPeriod = null;
		String applicantBusinessType = null;
		// String applicantMetadata = null;
		String applicantStatus = null;
		// String modifyDate = null;
		// String syncDate = null;
		if (params != null) {
			if (params.containsKey("id")) {
				id = GetterUtil.getLong(params.get("id"));
			}
			if (params.containsKey("mtcore")) {
				mtCore = GetterUtil.getLong(params.get("mtcore"));
			}
			/*
			 * if (params.containsKey("mappingma_cty")) { mappingMA_CTY =
			 * GetterUtil.getString(params.get("mappingma_cty")); } if
			 * (params.containsKey("mappingten_cty")) { mappingTEN_CTY =
			 * GetterUtil.getString(params.get("mappingten_cty")); } if
			 * (params.containsKey("mappingdia_chi_cty")) { mappingDIA_CHI_CTY =
			 * GetterUtil.getString(params.get("mappingdia_chi_cty")); } if
			 * (params.containsKey("mappingnote")) { mappingNote =
			 * GetterUtil.getString(params.get("mappingnote")); } if
			 * (params.containsKey("mappingstatus")) { mappingStatus =
			 * GetterUtil.getString(params.get("mappingstatus")); }
			 */
			if (params.containsKey("applicantcode")) {
				applicantCode = GetterUtil.getString(params.get("applicantcode"));
			}
			/*
			 * if (params.containsKey("applicantname")) { applicantName =
			 * GetterUtil.getString(params.get("applicantname")); } if
			 * (params.containsKey("applicantaddress")) { applicantAddress =
			 * GetterUtil.getString(params.get("applicantaddress")); } if
			 * (params.containsKey("applicantphone")) { applicantPhone =
			 * GetterUtil.getString(params.get("applicantphone")); } if
			 * (params.containsKey("applicantemail")) { applicantEmail =
			 * GetterUtil.getString(params.get("applicantemail")); } if
			 * (params.containsKey("applicantfax")) { applicantFax =
			 * GetterUtil.getString(params.get("applicantfax")); } if
			 * (params.containsKey("applicantrepresentative")) { applicantRepresentative =
			 * GetterUtil.getString(params.get("applicantrepresentative")); } if
			 * (params.containsKey("applicantrepresentativetitle")) {
			 * applicantRepresentativeTitle =
			 * GetterUtil.getString(params.get("applicantrepresentativetitle")); } if
			 * (params.containsKey("applicantcontactname")) { applicantContactName =
			 * GetterUtil.getString(params.get("applicantcontactname")); } if
			 * (params.containsKey("applicantcontactemail")) { applicantContactEmail =
			 * GetterUtil.getString(params.get("applicantcontactemail")); } if
			 * (params.containsKey("applicantcontactphone")) { applicantContactPhone =
			 * GetterUtil.getString(params.get("applicantcontactphone")); } if
			 * (params.containsKey("applicantnationality")) { applicantNationality =
			 * GetterUtil.getString(params.get("applicantnationality")); } if
			 * (params.containsKey("applicantregion")) { applicantRegion =
			 * GetterUtil.getString(params.get("applicantregion")); } if
			 * (params.containsKey("applicantcity")) { applicantCity =
			 * GetterUtil.getString(params.get("applicantcity")); } if
			 * (params.containsKey("markupcorporation")) { markupCorporation =
			 * GetterUtil.getString(params.get("markupcorporation")); }
			 */
			if (params.containsKey("corporationid")) {
				corporationId = GetterUtil.getString(params.get("corporationid"));
			}
			/*
			 * if (params.containsKey("markupdesigner")) { markupDesigner =
			 * GetterUtil.getString(params.get("markupdesigner")); } if
			 * (params.containsKey("markupoverseasmanufacturer")) {
			 * markupOverseasManufacturer =
			 * GetterUtil.getString(params.get("markupoverseasmanufacturer")); } if
			 * (params.containsKey("markupdomesticsmanufacturer")) {
			 * markupDomesticsManufacturer =
			 * GetterUtil.getString(params.get("markupdomesticsmanufacturer")); }
			 */
			if (params.containsKey("markupdomesticsmanufacturer")) {
				markupDomesticsManufacturer = GetterUtil.getString(params.get("markupdomesticsmanufacturer"));
			}
			if (params.containsKey("markupimporter")) {
				markupImporter = GetterUtil.getString(params.get("markupimporter"));
			}
			if (params.containsKey("markupcomponentxcg")) {
				markupComponentXCG = GetterUtil.getString(params.get("markupcomponentxcg"));
			}
			if (params.containsKey("markupcomponentxmy")) {
				markupComponentXMY = GetterUtil.getString(params.get("markupcomponentxmy"));
			}
			if (params.containsKey("markupcomponentxcd")) {
				markupComponentXCD = GetterUtil.getString(params.get("markupcomponentxcd"));
			}
			if (params.containsKey("markupcomponentxdd")) {
				markupComponentXDD = GetterUtil.getString(params.get("markupcomponentxdd"));
			}
			if (params.containsKey("markupcomponentxcn")) {
				markupComponentXCN = GetterUtil.getString(params.get("markupcomponentxcn"));
			}
			if (params.containsKey("markupcomponentxch")) {
				markupComponentXCH = GetterUtil.getString(params.get("markupcomponentxch"));
			}
			if (params.containsKey("markupxcg")) {
				markupXCG = GetterUtil.getString(params.get("markupxcg"));
			}
			if (params.containsKey("markupxmy")) {
				markupXMY = GetterUtil.getString(params.get("markupxmy"));
			}
			if (params.containsKey("markupxcd")) {
				markupXCD = GetterUtil.getString(params.get("markupxcd"));
			}
			if (params.containsKey("markupxdd")) {
				markupXDD = GetterUtil.getString(params.get("markupxdd"));
			}
			if (params.containsKey("markupxcn")) {
				markupXCN = GetterUtil.getString(params.get("markupxcn"));
			}
			if (params.containsKey("markupxch")) {
				markupXCH = GetterUtil.getString(params.get("markupxch"));
			}
			if (params.containsKey("issuetypexcg")) {
				issueTypeXCG = GetterUtil.getString(params.get("issuetypexcg"));
			}
			if (params.containsKey("issuetypexmy")) {
				issueTypeXMY = GetterUtil.getString(params.get("issuetypexmy"));
			}
			if (params.containsKey("issuetypexcd")) {
				issueTypeXCD = GetterUtil.getString(params.get("issuetypexcd"));
			}
			if (params.containsKey("issuetypexdd")) {
				issueTypeXDD = GetterUtil.getString(params.get("issuetypexdd"));
			}
			if (params.containsKey("issuetypexcn")) {
				issueTypeXCN = GetterUtil.getString(params.get("issuetypexcn"));
			}
			if (params.containsKey("issuetypexch")) {
				issueTypeXCH = GetterUtil.getString(params.get("issuetypexch"));
			}
			/*
			 * if (params.containsKey("issuetypedescription")) { issueTypeDescription =
			 * GetterUtil.getString(params.get("issuetypedescription")); } if
			 * (params.containsKey("applicantceremonydate")) { applicantCeremonyDate =
			 * GetterUtil.getString(params.get("applicantceremonydate")); } if
			 * (params.containsKey("applicantoperationperiod")) { applicantOperationPeriod =
			 * GetterUtil.getString(params.get("applicantoperationperiod")); }
			 */
			if (params.containsKey("applicantbusinesstype")) {
				applicantBusinessType = GetterUtil.getString(params.get("applicantbusinesstype"));
			}
			/*
			 * if (params.containsKey("applicantmetadata")) { applicantMetadata =
			 * GetterUtil.getString(params.get("applicantmetadata")); }
			 */
			if (params.containsKey("applicantstatus")) {
				applicantStatus = GetterUtil.getString(params.get("applicantstatus"));
			}
			/*
			 * if (params.containsKey("modifydate")) { modifyDate =
			 * GetterUtil.getString(params.get("modifydate")); } if
			 * (params.containsKey("syncdate")) { syncDate =
			 * GetterUtil.getString(params.get("syncdate")); }
			 */
		}
		String _keywordSearchCondition = ActionUtil.buildSQLCondition("mappingMA_CTY", keyword, "", StringPool.LIKE, "")
				// + ActionUtil.buildSQLCondition("mappingTEN_CTY", keyword, "OR",
				// StringPool.LIKE, "")
				// + ActionUtil.buildSQLCondition("mappingDIA_CHI_CTY", keyword, "OR",
				// StringPool.LIKE, "")
				// + ActionUtil.buildSQLCondition("mappingNote", keyword, "OR", StringPool.LIKE,
				// "")
				// + ActionUtil.buildSQLCondition("mappingStatus", keyword, "OR",
				// StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantAddress", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantPhone", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantEmail", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantFax", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantRepresentative", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantRepresentativeTitle", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantContactName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantContactEmail", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantContactPhone", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantNationality", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantRegion", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantCity", keyword, "OR", StringPool.LIKE, "");
		// + ActionUtil.buildSQLCondition("markupCorporation", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("corporationId", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupDesigner", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupOverseasManufacturer", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupDomesticsManufacturer", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupImporter", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupComponentXCG", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupComponentXMY", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupComponentXCD", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupComponentXDD", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupComponentXCN", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupComponentXCH", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupXCG", keyword, "OR", StringPool.LIKE,
		// "")
		// + ActionUtil.buildSQLCondition("markupXMY", keyword, "OR", StringPool.LIKE,
		// "")
		// + ActionUtil.buildSQLCondition("markupXCD", keyword, "OR", StringPool.LIKE,
		// "")
		// + ActionUtil.buildSQLCondition("markupXDD", keyword, "OR", StringPool.LIKE,
		// "")
		// + ActionUtil.buildSQLCondition("markupXCN", keyword, "OR", StringPool.LIKE,
		// "")
		// + ActionUtil.buildSQLCondition("markupXCH", keyword, "OR", StringPool.LIKE,
		// "")
		// + ActionUtil.buildSQLCondition("issueTypeXCG", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("issueTypeXMY", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("issueTypeXCD", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("issueTypeXDD", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("issueTypeXCN", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("issueTypeXCH", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("issueTypeDescription", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("applicantCeremonyDate", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("applicantOperationPeriod", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("applicantBusinessType", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("applicantMetadata", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("applicantStatus", keyword, "OR",
		// StringPool.LIKE, "");
		SQLQueryBuilder builder = new SQLQueryBuilder();
		builder.selectAll().from("vr_applicantprofile").where("id", id, "AND", StringPool.EQUAL)
				.where("mtcore", mtCore, "AND", StringPool.EQUAL)
				// .where("mappingma_cty", mappingMA_CTY, "AND", StringPool.EQUAL)
				// .where("mappingten_cty", mappingTEN_CTY, "AND", StringPool.EQUAL)
				// .where("mappingdia_chi_cty", mappingDIA_CHI_CTY, "AND", StringPool.EQUAL)
				// .where("mappingnote", mappingNote, "AND", StringPool.EQUAL)
				// .where("mappingstatus", mappingStatus, "AND", StringPool.EQUAL)
				.where("applicantcode", applicantCode, "AND", StringPool.EQUAL)
				// .where("applicantname", applicantName, "AND", StringPool.EQUAL)
				// .where("applicantaddress", applicantAddress, "AND", StringPool.EQUAL)
				// .where("applicantphone", applicantPhone, "AND", StringPool.EQUAL)
				// .where("applicantemail", applicantEmail, "AND", StringPool.EQUAL)
				// .where("applicantfax", applicantFax, "AND", StringPool.EQUAL)
				// .where("applicantrepresentative", applicantRepresentative, "AND",
				// StringPool.EQUAL)
				// .where("applicantrepresentativetitle", applicantRepresentativeTitle, "AND",
				// StringPool.EQUAL)
				// .where("applicantcontactname", applicantContactName, "AND", StringPool.EQUAL)
				// .where("applicantcontactemail", applicantContactEmail, "AND",
				// StringPool.EQUAL)
				// .where("applicantcontactphone", applicantContactPhone, "AND",
				// StringPool.EQUAL)
				// .where("applicantnationality", applicantNationality, "AND", StringPool.EQUAL)
				// .where("applicantregion", applicantRegion, "AND", StringPool.EQUAL)
				// .where("applicantcity", applicantCity, "AND", StringPool.EQUAL)
				// .where("markupcorporation", markupCorporation, "AND", StringPool.EQUAL)
				.where("corporationid", corporationId, "AND", StringPool.EQUAL)
				// .where("markupdesigner", markupDesigner, "AND", StringPool.EQUAL)
				// .where("markupoverseasmanufacturer", markupOverseasManufacturer, "AND",
				// StringPool.EQUAL)
				.where("markupdomesticsmanufacturer", markupDomesticsManufacturer, "AND", StringPool.EQUAL)
				.where("markupimporter", markupImporter, "AND", StringPool.EQUAL)
				.where("markupcomponentxcg", markupComponentXCG, "AND", StringPool.EQUAL)
				.where("markupcomponentxmy", markupComponentXMY, "AND", StringPool.EQUAL)
				.where("markupcomponentxcd", markupComponentXCD, "AND", StringPool.EQUAL)
				.where("markupcomponentxdd", markupComponentXDD, "AND", StringPool.EQUAL)
				.where("markupcomponentxcn", markupComponentXCN, "AND", StringPool.EQUAL)
				.where("markupcomponentxch", markupComponentXCH, "AND", StringPool.EQUAL)
				.where("markupxcg", markupXCG, "AND", StringPool.EQUAL)
				.where("markupxmy", markupXMY, "AND", StringPool.EQUAL)
				.where("markupxcd", markupXCD, "AND", StringPool.EQUAL)
				.where("markupxdd", markupXDD, "AND", StringPool.EQUAL)
				.where("markupxcn", markupXCN, "AND", StringPool.EQUAL)
				.where("markupxch", markupXCH, "AND", StringPool.EQUAL)
				.where("issuetypexcg", issueTypeXCG, "AND", StringPool.EQUAL)
				.where("issuetypexmy", issueTypeXMY, "AND", StringPool.EQUAL)
				.where("issuetypexcd", issueTypeXCD, "AND", StringPool.EQUAL)
				.where("issuetypexdd", issueTypeXDD, "AND", StringPool.EQUAL)
				.where("issuetypexcn", issueTypeXCN, "AND", StringPool.EQUAL)
				.where("issuetypexch", issueTypeXCH, "AND", StringPool.EQUAL)
				// .where("issuetypedescription", issueTypeDescription, "AND", StringPool.EQUAL)
				// .where("applicantceremonydate", applicantCeremonyDate, "AND",
				// StringPool.EQUAL)
				// .where("applicantoperationperiod", applicantOperationPeriod, "AND",
				// StringPool.EQUAL)
				.where("applicantbusinesstype", applicantBusinessType, "AND", StringPool.EQUAL)
				// .where("applicantmetadata", applicantMetadata, "AND", StringPool.EQUAL)
				.where("applicantstatus", applicantStatus, "AND", "IN")
				// .where("modifydate", modifyDate, "AND", StringPool.EQUAL)
				// .where("syncdate", syncDate, "AND", StringPool.EQUAL)
				.where(_keywordSearchCondition, null, "AND", "", true).build();
		JSONObject result = JSONFactoryUtil.createJSONObject();
		long total = VRApplicantProfileLocalServiceUtil.countVRAppicantProfile(builder.getCountQuery());
		JSONArray data = VRApplicantProfileLocalServiceUtil.findVRAppicantProfile(builder.getSelectQuery(), null, null,
				VRApplicantProfileImpl.class, "VRApplicantProfile", start, end);
		result.put("total", total);
		result.put("data", data);
		return result;
	}

	@Override
	public JSONObject findVRApplicantProfileDetail(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {
		Long id = null;
		String applicantCode = StringPool.BLANK;
		VRApplicantProfile applicantProfile = null;
		JSONObject result = JSONFactoryUtil.createJSONObject();
		if (params != null) {
			if (params.containsKey("applicantcode")) {
				applicantCode = GetterUtil.getString(params.get("applicantcode"));
				applicantProfile = VRApplicantProfileLocalServiceUtil.findByApplicantCode(applicantCode);
			} else if (params.containsKey("id")) {
				id = GetterUtil.getLong(params.get("id"));
				applicantProfile = VRApplicantProfileLocalServiceUtil.fetchVRApplicantProfile(id);
			}
		}
		try {
			result = BusinessUtil.object2Json_originColumnName(applicantProfile, VRApplicantProfileModelImpl.class,
					StringPool.BLANK);
		} catch (JSONException e) {
			_log.error(e);
		}
		return result;
	}

	public JSONObject updateVRApplicantProfile(VRApplicantProfile object) {

		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}

		if (object.getId() <= 0) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}

		VRApplicantProfile _tmp = VRApplicantProfileLocalServiceUtil.fetchVRApplicantProfile(object.getId());

		if (_tmp == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}

		try {

			_tmp = (VRApplicantProfile) ActionUtil.mergeObject(object, _tmp);

			_tmp = VRApplicantProfileLocalServiceUtil.updateVRApplicantProfile(_tmp);

			// JSONObject result = ActionUtil.object2Json(object, VRApplicantProfile.class,
			// StringPool.BLANK);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, _tmp);

		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);
		}
	}

	@Override
	public VRApplicantProfile adminProcessData(JSONObject objectData, long mtCore, String applicantCode,
			String postStatus, ServiceContext serviceContext) throws Exception {
		VRApplicantProfile vrApplicantProfile = null;
		if (postStatus.equals("send") && serviceContext.getScopeGroupId() == 55217) {
			vrApplicantProfile = VRApplicantProfileLocalServiceUtil.findByApplicantCode(applicantCode);
			if (vrApplicantProfile != null) {
				String applicantStatus = vrApplicantProfile.getApplicantStatus();
				if (applicantStatus.equals(VRKeys.CHO_DUYET) || applicantStatus.equals(VRKeys.DA_DUYET)) {
					throw new Exception(
							"Error: Khong duoc sua thong tin neu doanh nghiep dang cho duyet hoac da duyet");
				}
			}
			vrApplicantProfile = VRApplicantProfileLocalServiceUtil.adminProcessData(objectData, mtCore, applicantCode);
			Applicant applicant = ApplicantLocalServiceUtil.fetchByAppId(vrApplicantProfile.getApplicantCode());
			if (applicant != null) {
				String applicantIdDate = DateTimeUtils.dateToString(applicant.getApplicantIdDate());
				applicant.setRepresentativeEnterprise(vrApplicantProfile.getApplicantRepresentativeTitle());
				applicant = ApplicantLocalServiceUtil.updateApplicant(applicant);
				applicant = ApplicantLocalServiceUtil.updateApplication(serviceContext, applicant.getGroupId(),
						applicant.getApplicantId(), vrApplicantProfile.getApplicantName(),
						applicant.getApplicantIdType(), vrApplicantProfile.getApplicantCode(), applicantIdDate,
						vrApplicantProfile.getApplicantAddress(), vrApplicantProfile.getApplicantCityCode(),
						vrApplicantProfile.getApplicantCity(), vrApplicantProfile.getApplicantDistrictCode(),
						vrApplicantProfile.getApplicantDistrictName(), vrApplicantProfile.getApplicantWardCode(),
						vrApplicantProfile.getApplicantWardName(), vrApplicantProfile.getApplicantRepresentative(),
						vrApplicantProfile.getApplicantRepresentativePhone(), applicant.getContactEmail(),
						applicant.getProfile(), applicant.getTmpPass());
			}
		} else {
			vrApplicantProfile = VRApplicantProfileLocalServiceUtil.adminProcessData(objectData, mtCore, applicantCode);
		}
		return vrApplicantProfile;
	}

	@Override
	public long countVrApplicantProfile(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {

		String keyword = ActionUtil.getKeyword(params);
		Long id = null;
		Long mtCore = null;
		// String mappingMA_CTY = null;
		// String mappingTEN_CTY = null;
		// String mappingDIA_CHI_CTY = null;
		// String mappingNote = null;
		// String mappingStatus = null;
		String applicantCode = null;
		// String applicantName = null;
		// String applicantAddress = null;
		// String applicantPhone = null;
		// String applicantEmail = null;
		// String applicantFax = null;
		// String applicantRepresentative = null;
		// String applicantRepresentativeTitle = null;
		// String applicantContactName = null;
		// String applicantContactEmail = null;
		// String applicantContactPhone = null;
		// String applicantNationality = null;
		// String applicantRegion = null;
		// String applicantCity = null;
		// String markupCorporation = null;
		String corporationId = null;
		// String markupDesigner = null;
		// String markupOverseasManufacturer = null;
		String markupDomesticsManufacturer = null;
		String markupImporter = null;
		String markupComponentXCG = null;
		String markupComponentXMY = null;
		String markupComponentXCD = null;
		String markupComponentXDD = null;
		String markupComponentXCN = null;
		String markupComponentXCH = null;
		String markupXCG = null;
		String markupXMY = null;
		String markupXCD = null;
		String markupXDD = null;
		String markupXCN = null;
		String markupXCH = null;
		String issueTypeXCG = null;
		String issueTypeXMY = null;
		String issueTypeXCD = null;
		String issueTypeXDD = null;
		String issueTypeXCN = null;
		String issueTypeXCH = null;
		// String issueTypeDescription = null;
		// String applicantCeremonyDate = null;
		// String applicantOperationPeriod = null;
		String applicantBusinessType = null;
		// String applicantMetadata = null;
		String applicantStatus = null;
		// String modifyDate = null;
		// String syncDate = null;
		if (params != null) {
			if (params.containsKey("id")) {
				id = GetterUtil.getLong(params.get("id"));
			}
			if (params.containsKey("mtcore")) {
				mtCore = GetterUtil.getLong(params.get("mtcore"));
			}
			/*
			 * if (params.containsKey("mappingma_cty")) { mappingMA_CTY =
			 * GetterUtil.getString(params.get("mappingma_cty")); } if
			 * (params.containsKey("mappingten_cty")) { mappingTEN_CTY =
			 * GetterUtil.getString(params.get("mappingten_cty")); } if
			 * (params.containsKey("mappingdia_chi_cty")) { mappingDIA_CHI_CTY =
			 * GetterUtil.getString(params.get("mappingdia_chi_cty")); } if
			 * (params.containsKey("mappingnote")) { mappingNote =
			 * GetterUtil.getString(params.get("mappingnote")); } if
			 * (params.containsKey("mappingstatus")) { mappingStatus =
			 * GetterUtil.getString(params.get("mappingstatus")); }
			 */
			if (params.containsKey("applicantcode")) {
				applicantCode = GetterUtil.getString(params.get("applicantcode"));
			}
			/*
			 * if (params.containsKey("applicantname")) { applicantName =
			 * GetterUtil.getString(params.get("applicantname")); } if
			 * (params.containsKey("applicantaddress")) { applicantAddress =
			 * GetterUtil.getString(params.get("applicantaddress")); } if
			 * (params.containsKey("applicantphone")) { applicantPhone =
			 * GetterUtil.getString(params.get("applicantphone")); } if
			 * (params.containsKey("applicantemail")) { applicantEmail =
			 * GetterUtil.getString(params.get("applicantemail")); } if
			 * (params.containsKey("applicantfax")) { applicantFax =
			 * GetterUtil.getString(params.get("applicantfax")); } if
			 * (params.containsKey("applicantrepresentative")) { applicantRepresentative =
			 * GetterUtil.getString(params.get("applicantrepresentative")); } if
			 * (params.containsKey("applicantrepresentativetitle")) {
			 * applicantRepresentativeTitle =
			 * GetterUtil.getString(params.get("applicantrepresentativetitle")); } if
			 * (params.containsKey("applicantcontactname")) { applicantContactName =
			 * GetterUtil.getString(params.get("applicantcontactname")); } if
			 * (params.containsKey("applicantcontactemail")) { applicantContactEmail =
			 * GetterUtil.getString(params.get("applicantcontactemail")); } if
			 * (params.containsKey("applicantcontactphone")) { applicantContactPhone =
			 * GetterUtil.getString(params.get("applicantcontactphone")); } if
			 * (params.containsKey("applicantnationality")) { applicantNationality =
			 * GetterUtil.getString(params.get("applicantnationality")); } if
			 * (params.containsKey("applicantregion")) { applicantRegion =
			 * GetterUtil.getString(params.get("applicantregion")); } if
			 * (params.containsKey("applicantcity")) { applicantCity =
			 * GetterUtil.getString(params.get("applicantcity")); } if
			 * (params.containsKey("markupcorporation")) { markupCorporation =
			 * GetterUtil.getString(params.get("markupcorporation")); }
			 */
			if (params.containsKey("corporationid")) {
				corporationId = GetterUtil.getString(params.get("corporationid"));
			}
			/*
			 * if (params.containsKey("markupdesigner")) { markupDesigner =
			 * GetterUtil.getString(params.get("markupdesigner")); } if
			 * (params.containsKey("markupoverseasmanufacturer")) {
			 * markupOverseasManufacturer =
			 * GetterUtil.getString(params.get("markupoverseasmanufacturer")); } if
			 * (params.containsKey("markupdomesticsmanufacturer")) {
			 * markupDomesticsManufacturer =
			 * GetterUtil.getString(params.get("markupdomesticsmanufacturer")); }
			 */
			if (params.containsKey("markupdomesticsmanufacturer")) {
				markupDomesticsManufacturer = GetterUtil.getString(params.get("markupdomesticsmanufacturer"));
			}
			if (params.containsKey("markupimporter")) {
				markupImporter = GetterUtil.getString(params.get("markupimporter"));
			}
			if (params.containsKey("markupcomponentxcg")) {
				markupComponentXCG = GetterUtil.getString(params.get("markupcomponentxcg"));
			}
			if (params.containsKey("markupcomponentxmy")) {
				markupComponentXMY = GetterUtil.getString(params.get("markupcomponentxmy"));
			}
			if (params.containsKey("markupcomponentxcd")) {
				markupComponentXCD = GetterUtil.getString(params.get("markupcomponentxcd"));
			}
			if (params.containsKey("markupcomponentxdd")) {
				markupComponentXDD = GetterUtil.getString(params.get("markupcomponentxdd"));
			}
			if (params.containsKey("markupcomponentxcn")) {
				markupComponentXCN = GetterUtil.getString(params.get("markupcomponentxcn"));
			}
			if (params.containsKey("markupcomponentxch")) {
				markupComponentXCH = GetterUtil.getString(params.get("markupcomponentxch"));
			}
			if (params.containsKey("markupxcg")) {
				markupXCG = GetterUtil.getString(params.get("markupxcg"));
			}
			if (params.containsKey("markupxmy")) {
				markupXMY = GetterUtil.getString(params.get("markupxmy"));
			}
			if (params.containsKey("markupxcd")) {
				markupXCD = GetterUtil.getString(params.get("markupxcd"));
			}
			if (params.containsKey("markupxdd")) {
				markupXDD = GetterUtil.getString(params.get("markupxdd"));
			}
			if (params.containsKey("markupxcn")) {
				markupXCN = GetterUtil.getString(params.get("markupxcn"));
			}
			if (params.containsKey("markupxch")) {
				markupXCH = GetterUtil.getString(params.get("markupxch"));
			}
			if (params.containsKey("issuetypexcg")) {
				issueTypeXCG = GetterUtil.getString(params.get("issuetypexcg"));
			}
			if (params.containsKey("issuetypexmy")) {
				issueTypeXMY = GetterUtil.getString(params.get("issuetypexmy"));
			}
			if (params.containsKey("issuetypexcd")) {
				issueTypeXCD = GetterUtil.getString(params.get("issuetypexcd"));
			}
			if (params.containsKey("issuetypexdd")) {
				issueTypeXDD = GetterUtil.getString(params.get("issuetypexdd"));
			}
			if (params.containsKey("issuetypexcn")) {
				issueTypeXCN = GetterUtil.getString(params.get("issuetypexcn"));
			}
			if (params.containsKey("issuetypexch")) {
				issueTypeXCH = GetterUtil.getString(params.get("issuetypexch"));
			}
			/*
			 * if (params.containsKey("issuetypedescription")) { issueTypeDescription =
			 * GetterUtil.getString(params.get("issuetypedescription")); } if
			 * (params.containsKey("applicantceremonydate")) { applicantCeremonyDate =
			 * GetterUtil.getString(params.get("applicantceremonydate")); } if
			 * (params.containsKey("applicantoperationperiod")) { applicantOperationPeriod =
			 * GetterUtil.getString(params.get("applicantoperationperiod")); }
			 */
			if (params.containsKey("applicantbusinesstype")) {
				applicantBusinessType = GetterUtil.getString(params.get("applicantbusinesstype"));
			}
			/*
			 * if (params.containsKey("applicantmetadata")) { applicantMetadata =
			 * GetterUtil.getString(params.get("applicantmetadata")); }
			 */
			if (params.containsKey("applicantstatus")) {
				applicantStatus = GetterUtil.getString(params.get("applicantstatus"));
			}
			/*
			 * if (params.containsKey("modifydate")) { modifyDate =
			 * GetterUtil.getString(params.get("modifydate")); } if
			 * (params.containsKey("syncdate")) { syncDate =
			 * GetterUtil.getString(params.get("syncdate")); }
			 */
		}
		String _keywordSearchCondition = ActionUtil.buildSQLCondition("mappingMA_CTY", keyword, "", StringPool.LIKE, "")
				// + ActionUtil.buildSQLCondition("mappingTEN_CTY", keyword, "OR",
				// StringPool.LIKE, "")
				// + ActionUtil.buildSQLCondition("mappingDIA_CHI_CTY", keyword, "OR",
				// StringPool.LIKE, "")
				// + ActionUtil.buildSQLCondition("mappingNote", keyword, "OR", StringPool.LIKE,
				// "")
				// + ActionUtil.buildSQLCondition("mappingStatus", keyword, "OR",
				// StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantAddress", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantPhone", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantEmail", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantFax", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantRepresentative", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantRepresentativeTitle", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantContactName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantContactEmail", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantContactPhone", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantNationality", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantRegion", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantCity", keyword, "OR", StringPool.LIKE, "");
		// + ActionUtil.buildSQLCondition("markupCorporation", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("corporationId", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupDesigner", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupOverseasManufacturer", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupDomesticsManufacturer", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupImporter", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupComponentXCG", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupComponentXMY", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupComponentXCD", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupComponentXDD", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupComponentXCN", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupComponentXCH", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("markupXCG", keyword, "OR", StringPool.LIKE,
		// "")
		// + ActionUtil.buildSQLCondition("markupXMY", keyword, "OR", StringPool.LIKE,
		// "")
		// + ActionUtil.buildSQLCondition("markupXCD", keyword, "OR", StringPool.LIKE,
		// "")
		// + ActionUtil.buildSQLCondition("markupXDD", keyword, "OR", StringPool.LIKE,
		// "")
		// + ActionUtil.buildSQLCondition("markupXCN", keyword, "OR", StringPool.LIKE,
		// "")
		// + ActionUtil.buildSQLCondition("markupXCH", keyword, "OR", StringPool.LIKE,
		// "")
		// + ActionUtil.buildSQLCondition("issueTypeXCG", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("issueTypeXMY", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("issueTypeXCD", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("issueTypeXDD", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("issueTypeXCN", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("issueTypeXCH", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("issueTypeDescription", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("applicantCeremonyDate", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("applicantOperationPeriod", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("applicantBusinessType", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("applicantMetadata", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("applicantStatus", keyword, "OR",
		// StringPool.LIKE, "");
		SQLQueryBuilder builder = new SQLQueryBuilder();
		builder.selectAll().from("vr_applicantprofile").where("id", id, "AND", StringPool.EQUAL)
				.where("mtcore", mtCore, "AND", StringPool.EQUAL)
				// .where("mappingma_cty", mappingMA_CTY, "AND", StringPool.EQUAL)
				// .where("mappingten_cty", mappingTEN_CTY, "AND", StringPool.EQUAL)
				// .where("mappingdia_chi_cty", mappingDIA_CHI_CTY, "AND", StringPool.EQUAL)
				// .where("mappingnote", mappingNote, "AND", StringPool.EQUAL)
				// .where("mappingstatus", mappingStatus, "AND", StringPool.EQUAL)
				.where("applicantcode", applicantCode, "AND", StringPool.EQUAL)
				// .where("applicantname", applicantName, "AND", StringPool.EQUAL)
				// .where("applicantaddress", applicantAddress, "AND", StringPool.EQUAL)
				// .where("applicantphone", applicantPhone, "AND", StringPool.EQUAL)
				// .where("applicantemail", applicantEmail, "AND", StringPool.EQUAL)
				// .where("applicantfax", applicantFax, "AND", StringPool.EQUAL)
				// .where("applicantrepresentative", applicantRepresentative, "AND",
				// StringPool.EQUAL)
				// .where("applicantrepresentativetitle", applicantRepresentativeTitle, "AND",
				// StringPool.EQUAL)
				// .where("applicantcontactname", applicantContactName, "AND", StringPool.EQUAL)
				// .where("applicantcontactemail", applicantContactEmail, "AND",
				// StringPool.EQUAL)
				// .where("applicantcontactphone", applicantContactPhone, "AND",
				// StringPool.EQUAL)
				// .where("applicantnationality", applicantNationality, "AND", StringPool.EQUAL)
				// .where("applicantregion", applicantRegion, "AND", StringPool.EQUAL)
				// .where("applicantcity", applicantCity, "AND", StringPool.EQUAL)
				// .where("markupcorporation", markupCorporation, "AND", StringPool.EQUAL)
				.where("corporationid", corporationId, "AND", StringPool.EQUAL)
				// .where("markupdesigner", markupDesigner, "AND", StringPool.EQUAL)
				// .where("markupoverseasmanufacturer", markupOverseasManufacturer, "AND",
				// StringPool.EQUAL)
				.where("markupdomesticsmanufacturer", markupDomesticsManufacturer, "AND", StringPool.EQUAL)
				.where("markupimporter", markupImporter, "AND", StringPool.EQUAL)
				.where("markupcomponentxcg", markupComponentXCG, "AND", StringPool.EQUAL)
				.where("markupcomponentxmy", markupComponentXMY, "AND", StringPool.EQUAL)
				.where("markupcomponentxcd", markupComponentXCD, "AND", StringPool.EQUAL)
				.where("markupcomponentxdd", markupComponentXDD, "AND", StringPool.EQUAL)
				.where("markupcomponentxcn", markupComponentXCN, "AND", StringPool.EQUAL)
				.where("markupcomponentxch", markupComponentXCH, "AND", StringPool.EQUAL)
				.where("markupxcg", markupXCG, "AND", StringPool.EQUAL)
				.where("markupxmy", markupXMY, "AND", StringPool.EQUAL)
				.where("markupxcd", markupXCD, "AND", StringPool.EQUAL)
				.where("markupxdd", markupXDD, "AND", StringPool.EQUAL)
				.where("markupxcn", markupXCN, "AND", StringPool.EQUAL)
				.where("markupxch", markupXCH, "AND", StringPool.EQUAL)
				.where("issuetypexcg", issueTypeXCG, "AND", StringPool.EQUAL)
				.where("issuetypexmy", issueTypeXMY, "AND", StringPool.EQUAL)
				.where("issuetypexcd", issueTypeXCD, "AND", StringPool.EQUAL)
				.where("issuetypexdd", issueTypeXDD, "AND", StringPool.EQUAL)
				.where("issuetypexcn", issueTypeXCN, "AND", StringPool.EQUAL)
				.where("issuetypexch", issueTypeXCH, "AND", StringPool.EQUAL)
				// .where("issuetypedescription", issueTypeDescription, "AND", StringPool.EQUAL)
				// .where("applicantceremonydate", applicantCeremonyDate, "AND",
				// StringPool.EQUAL)
				// .where("applicantoperationperiod", applicantOperationPeriod, "AND",
				// StringPool.EQUAL)
				.where("applicantbusinesstype", applicantBusinessType, "AND", StringPool.EQUAL)
				// .where("applicantmetadata", applicantMetadata, "AND", StringPool.EQUAL)
				.where("applicantstatus", applicantStatus, "AND", "IN")
				// .where("modifydate", modifyDate, "AND", StringPool.EQUAL)
				// .where("syncdate", syncDate, "AND", StringPool.EQUAL)
				.where(_keywordSearchCondition, null, "AND", "", true).build();
		return VRApplicantProfileLocalServiceUtil.countVRAppicantProfile(builder.getCountQuery());
	}

	@Override
	public void indexing(VRApplicantProfile vrApplicantProfile, Company company) {
		final String CLASS_NAME = VRES.class.getName();

		JSONObject object = JSONFactoryUtil.createJSONObject();
		JSONObject jVRApplicantProfile = null;
		try {
			jVRApplicantProfile = BusinessUtil.object2Json_originValue(vrApplicantProfile,
					VRApplicantProfileModelImpl.class, StringPool.BLANK);
		} catch (Exception e) {
			_log.error(e);
		}
		if (jVRApplicantProfile != null) {
			object.put("vr_ApplicantProfile", jVRApplicantProfile);
			String applicantCode = vrApplicantProfile.getApplicantCode();
			long applicantId = vrApplicantProfile.getId();

			List<VRProductionPlant> vrProductionPlants = VRProductionPlantLocalServiceUtil
					.findByApplicantId(applicantId, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			object = BusinessUtil.array2JSON(vrProductionPlants, VRProductionPlantModelImpl.class, object,
					"vr_ProductionPlant");

			JSONObject esData = JSONFactoryUtil.createJSONObject();
			esData.put(Field.MODIFIED_DATE + "_es", new Date().getTime());
			esData.put("applicantCode", applicantCode);
			esData.put("type_es", "vr_applicantprofile");
			esData.put("id", String.valueOf(vrApplicantProfile.getId()));
			esData.put("data", object);
			esData.put(Field.COMPANY_ID, String.valueOf(company.getCompanyId()));
			int deletex = ElasticQueryWrapUtil.DELETE("applicantCode", applicantCode, company.getCompanyId(),
					"vr_applicantprofile");
			if (deletex == 0) {
				ElasticQueryWrapUtil.POST(esData.toJSONString(), CLASS_NAME, company.getCompanyId());
			}

			_log.info("---> DocumentId: " + vrApplicantProfile.getApplicantCode());
		}
	}

	@Override
	public JSONObject findByApplicantCode(User user, ServiceContext serviceContext, String applicantCode) {
		VRApplicantProfile vrApplicantProfile = VRApplicantProfileLocalServiceUtil.findByApplicantCode(applicantCode);
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			result = BusinessUtil.object2Json_originColumnName(vrApplicantProfile, VRApplicantProfileModelImpl.class,
					StringPool.BLANK);
		} catch (JSONException e) {
			_log.error(e);
		}

		return result;
	}

}
