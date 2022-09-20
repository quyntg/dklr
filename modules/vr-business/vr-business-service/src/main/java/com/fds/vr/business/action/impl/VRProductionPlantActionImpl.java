package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRProductionPlantAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.constant.VRKeys;
import com.fds.vr.business.engine.SQLQueryBuilder;
import com.fds.vr.business.model.VRApplicantProfile;
import com.fds.vr.business.model.VRProductType;
import com.fds.vr.business.model.VRProductionPlant;
import com.fds.vr.business.model.VRProductionPlantEmployee;
import com.fds.vr.business.model.VRProductionPlantProdEquipment;
import com.fds.vr.business.model.impl.VRProductionPlantImpl;
import com.fds.vr.business.service.VRApplicantProfileLocalServiceUtil;
import com.fds.vr.business.service.VRProductTypeLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantEmployeeLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantProdEquipmentLocalServiceUtil;
import com.fds.vr.service.util.BusinessUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

/**
 * @author trungnt
 *
 */
public class VRProductionPlantActionImpl implements VRProductionPlantAction {

	private static Log _log = LogFactoryUtil.getLog(VRProductionPlantActionImpl.class);

	public JSONObject createVRProductionPlant(VRProductionPlant object) {
		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		try {

			object = VRProductionPlantLocalServiceUtil.createVRProductionPlant(object);

			JSONObject result = ActionUtil.object2Json(object, VRProductionPlant.class, StringPool.BLANK);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, result);

		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}
	}

	public JSONObject createVRProductionPlantEmployee(VRProductionPlantEmployee object) {
		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		try {
			object = VRProductionPlantEmployeeLocalServiceUtil.createVRProductionPlantEmployee(object);

			JSONObject result = ActionUtil.object2Json(object, VRProductionPlantEmployee.class, StringPool.BLANK);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, result);

		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}
	}

	public JSONObject createVRProductType(VRProductType object) {
		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		try {
			object = VRProductTypeLocalServiceUtil.createVRProductType(object);

			JSONObject result = ActionUtil.object2Json(object, VRProductType.class, StringPool.BLANK);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, result);

		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}
	}

	@Override
	public JSONObject findVRProductionPlant(long id) {

		try {

			VRProductionPlant vrProductionPlant = VRProductionPlantLocalServiceUtil.getVRProductionPlant(id);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, vrProductionPlant);

		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);

		}

	}

	public JSONObject findVRProductionPlant(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		String keyword = ActionUtil.getKeyword(params);
		// Long id = null;
		Long mtCore = null;
		String mappingMA_CTY = null;
		String mappingTEN_CTY = null;
		String mappingDIA_CHI_CTY = null;
		String mappingMA_XUONG_LR = null;
		String mappingTEN_XUONG_LR = null;
		String mappingDIA_CHI_XUONG_LR = null;
		String mappingNote = null;
		String mappingStatus = null;
		String productionPlantCode = null;
		String productionPlantName = null;
		String productionPlantAddress = null;
		String productionPlantStateCode = null;
		String productionPlantStateName = null;
		String productionPlantProvinceCode = null;
		String productionPlantProvinceName = null;
		String productionPlantDistrictCode = null;
		String productionPlantDistrictName = null;
		String productionPlantEmail = null;
		String productionPlantPhone = null;
		String productionPlantFax = null;
		String productionPlantRepresentative = null;
		String productionPlantRepresentativeTitle = null;
		String productionPlantContactName = null;
		String productionPlantContactEmail = null;
		String productionPlantContactPhone = null;
		String productionPlantType = null;
		String productionPlantStatus = null;
		String productionPlantEmployeesNote = null;
		String productionPlantEquipmentsNote = null;
		String productionPlantProdEquipmentsNote = null;
		Long registrationId = null;
		Long registrationFormId = null;
		Long applicantProfileId = null;
		Long supplierId = null;
		String applicantCode = null;
		// String modifyDate = "";
		// String syncDate = "";
		if (params != null) {
			/*
			 * if (params.containsKey("id")) { id = GetterUtil.getLong(params.get("id")); }
			 */
			if (params.containsKey("mtcore")) {
				mtCore = GetterUtil.getLong(params.get("mtcore"));
			}
			if (params.containsKey("mappingma_cty")) {
				mappingMA_CTY = GetterUtil.getString(params.get("mappingma_cty"));
			}
			if (params.containsKey("mappingten_cty")) {
				mappingTEN_CTY = GetterUtil.getString(params.get("mappingten_cty"));
			}
			if (params.containsKey("mappingdia_chi_cty")) {
				mappingDIA_CHI_CTY = GetterUtil.getString(params.get("mappingdia_chi_cty"));
			}
			if (params.containsKey("mappingma_xuong_lr")) {
				mappingMA_XUONG_LR = GetterUtil.getString(params.get("mappingma_xuong_lr"));
			}
			if (params.containsKey("mappingten_xuong_lr")) {
				mappingTEN_XUONG_LR = GetterUtil.getString(params.get("mappingten_xuong_lr"));
			}
			if (params.containsKey("mappingdia_chi_xuong_lr")) {
				mappingDIA_CHI_XUONG_LR = GetterUtil.getString(params.get("mappingdia_chi_xuong_lr"));
			}
			if (params.containsKey("mappingnote")) {
				mappingNote = GetterUtil.getString(params.get("mappingnote"));
			}
			if (params.containsKey("mappingstatus")) {
				mappingStatus = GetterUtil.getString(params.get("mappingstatus"));
			}
			if (params.containsKey("productionplantcode")) {
				productionPlantCode = GetterUtil.getString(params.get("productionplantcode"));
			}
			if (params.containsKey("productionplantname")) {
				productionPlantName = GetterUtil.getString(params.get("productionplantname"));
			}
			if (params.containsKey("productionplantaddress")) {
				productionPlantAddress = GetterUtil.getString(params.get("productionplantaddress"));
			}
			if (params.containsKey("productionplantstatecode")) {
				productionPlantStateCode = GetterUtil.getString(params.get("productionplantstatecode"));
			}
			if (params.containsKey("productionplantstatename")) {
				productionPlantStateName = GetterUtil.getString(params.get("productionplantstatename"));
			}
			if (params.containsKey("productionplantprovincecode")) {
				productionPlantProvinceCode = GetterUtil.getString(params.get("productionplantprovincecode"));
			}
			if (params.containsKey("productionplantprovincename")) {
				productionPlantProvinceName = GetterUtil.getString(params.get("productionplantprovincename"));
			}
			if (params.containsKey("productionplantdistrictcode")) {
				productionPlantDistrictCode = GetterUtil.getString(params.get("productionplantdistrictcode"));
			}
			if (params.containsKey("productionplantdistrictname")) {
				productionPlantDistrictName = GetterUtil.getString(params.get("productionplantdistrictname"));
			}
			if (params.containsKey("productionplantemail")) {
				productionPlantEmail = GetterUtil.getString(params.get("productionplantemail"));
			}
			if (params.containsKey("productionplantphone")) {
				productionPlantPhone = GetterUtil.getString(params.get("productionplantphone"));
			}
			if (params.containsKey("productionplantfax")) {
				productionPlantFax = GetterUtil.getString(params.get("productionplantfax"));
			}
			if (params.containsKey("productionplantrepresentative")) {
				productionPlantRepresentative = GetterUtil.getString(params.get("productionplantrepresentative"));
			}
			if (params.containsKey("productionplantrepresentativetitle")) {
				productionPlantRepresentativeTitle = GetterUtil
						.getString(params.get("productionplantrepresentativetitle"));
			}
			if (params.containsKey("productionplantcontactname")) {
				productionPlantContactName = GetterUtil.getString(params.get("productionplantcontactname"));
			}
			if (params.containsKey("productionplantcontactemail")) {
				productionPlantContactEmail = GetterUtil.getString(params.get("productionplantcontactemail"));
			}
			if (params.containsKey("productionplantcontactphone")) {
				productionPlantContactPhone = GetterUtil.getString(params.get("productionplantcontactphone"));
			}
			if (params.containsKey("productionplanttype")) {
				productionPlantType = GetterUtil.getString(params.get("productionplanttype"));
			}
			if (params.containsKey("productionplantstatus")) {
				productionPlantStatus = GetterUtil.getString(params.get("productionplantstatus"));
			}
			if (params.containsKey("productionplantemployeesnote")) {
				productionPlantEmployeesNote = GetterUtil.getString(params.get("productionplantemployeesnote"));
			}
			if (params.containsKey("productionplantequipmentsnote")) {
				productionPlantEquipmentsNote = GetterUtil.getString(params.get("productionplantequipmentsnote"));
			}
			if (params.containsKey("productionplantprodequipmentsnote")) {
				productionPlantProdEquipmentsNote = GetterUtil
						.getString(params.get("productionplantprodequipmentsnote"));
			}
			if (params.containsKey("registrationid")) {
				registrationId = GetterUtil.getLong(params.get("registrationid"));
			}
			if (params.containsKey("registrationformid")) {
				registrationFormId = GetterUtil.getLong(params.get("registrationformid"));
			}
			if (params.containsKey("applicantprofileid")) {
				applicantProfileId = GetterUtil.getLong(params.get("applicantprofileid"));
			}
			if (params.containsKey("supplierid")) {
				supplierId = GetterUtil.getLong(params.get("supplierid"));
			}
			if (params.containsKey("applicantcode")) {
				applicantCode = GetterUtil.getString(params.get("applicantcode"));
			}
			/*
			 * if (params.containsKey("modifydate")) { modifyDate =
			 * GetterUtil.getString(params.get("modifydate")); } if
			 * (params.containsKey("syncdate")) { syncDate =
			 * GetterUtil.getString(params.get("syncdate")); }
			 */
		}

		String _keywordSearchCondition = ActionUtil.buildSQLCondition("mappingma_cty", keyword, "", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("mappingten_cty", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("mappingdia_chi_cty", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("mappingma_xuong_lr", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("mappingten_xuong_lr", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("mappingdia_chi_xuong_lr", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionplantcode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionplantname", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionplantaddress", keyword, "OR", StringPool.LIKE, "");

		SQLQueryBuilder builder = new SQLQueryBuilder();

		builder.selectAll().from("vr_productionplant")
				// .where("id", id, "AND", StringPool.EQUAL)
				.where("mtcore", mtCore, "AND", StringPool.EQUAL)
				// .where("mappingma_cty", mappingMA_CTY, "AND", StringPool.EQUAL)
				// .where("mappingten_cty", mappingTEN_CTY, "AND", StringPool.EQUAL)
				// .where("mappingdia_chi_cty", mappingDIA_CHI_CTY, "AND", StringPool.EQUAL)
				// .where("mappingma_xuong_lr", mappingMA_XUONG_LR, "AND", StringPool.EQUAL)
				// .where("mappingten_xuong_lr", mappingTEN_XUONG_LR, "AND", StringPool.EQUAL)
				// .where("mappingdia_chi_xuong_lr", mappingDIA_CHI_XUONG_LR, "AND",
				// StringPool.EQUAL)
				// .where("mappingnote", mappingNote, "AND", StringPool.EQUAL)
				// .where("mappingstatus", mappingStatus, "AND", StringPool.EQUAL)
				.where("productionplantcode", productionPlantCode, "AND", StringPool.EQUAL)
				.where("productionplantname", productionPlantName, "AND", StringPool.EQUAL)
				.where("productionplantaddress", productionPlantAddress, "AND", StringPool.EQUAL)
				.where("productionplantstatecode", productionPlantStateCode, "AND", StringPool.EQUAL)
				.where("productionplantstatename", productionPlantStateName, "AND", StringPool.EQUAL)
				.where("productionplantprovincecode", productionPlantProvinceCode, "AND", StringPool.EQUAL)
				.where("productionplantprovincename", productionPlantProvinceName, "AND", StringPool.EQUAL)
				.where("productionplantdistrictcode", productionPlantDistrictCode, "AND", StringPool.EQUAL)
				.where("productionplantdistrictname", productionPlantDistrictName, "AND", StringPool.EQUAL)
				.where("productionplantemail", productionPlantEmail, "AND", StringPool.EQUAL)
				.where("productionplantphone", productionPlantPhone, "AND", StringPool.EQUAL)
				.where("productionplantfax", productionPlantFax, "AND", StringPool.EQUAL)
				.where("productionplantrepresentative", productionPlantRepresentative, "AND", StringPool.EQUAL)
				.where("productionplantrepresentativetitle", productionPlantRepresentativeTitle, "AND",
						StringPool.EQUAL)
				// .where("productionplantcontactname", productionPlantContactName, "AND",
				// StringPool.EQUAL)
				// .where("productionplantcontactemail", productionPlantContactEmail, "AND",
				// StringPool.EQUAL)
				// .where("productionplantcontactphone", productionPlantContactPhone, "AND",
				// StringPool.EQUAL)
				.where("productionplanttype", productionPlantType, "AND", StringPool.EQUAL)
				.where("productionplantstatus", productionPlantStatus, "AND", StringPool.EQUAL)
				// .where("productionplantemployeesnote", productionPlantEmployeesNote, "AND",
				// StringPool.EQUAL)
				// .where("productionplantequipmentsnote", productionPlantEquipmentsNote, "AND",
				// StringPool.EQUAL)
				// .where("productionplantprodequipmentsnote",
				// productionPlantProdEquipmentsNote, "AND", StringPool.EQUAL)
				.where("registrationid", registrationId, "AND", StringPool.EQUAL)
				.where("registrationformid", registrationFormId, "AND", StringPool.EQUAL)
				.where("applicantprofileid", applicantProfileId, "AND", StringPool.EQUAL)
				.where("supplierid", supplierId, "AND", StringPool.EQUAL)
				.where("applicantcode", applicantCode, "AND", StringPool.EQUAL)
				.where(_keywordSearchCondition, null, "AND", "", true)
				// .where("modifydate", modifyDate, "AND", StringPool.EQUAL)
				// .where("syncdate", syncDate, "AND", StringPool.EQUAL)
				.build();
		JSONObject result = JSONFactoryUtil.createJSONObject();
		long total = VRProductionPlantLocalServiceUtil.counData(builder.getCountQuery());
		JSONArray data = VRProductionPlantLocalServiceUtil.findData(builder.getSelectQuery(), null, null,
				VRProductionPlantImpl.class, "VRProductionPlant", start, end);
		result.put("total", total);
		result.put("data", data);
		return result;
	}

	public JSONObject updateVRProductionPlant(VRProductionPlant object) {

		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		if (object.getId() <= 0) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}
		VRProductionPlant _tmp = VRProductionPlantLocalServiceUtil.fetchVRProductionPlant(object.getId());
		if (_tmp == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}

		try {
			_tmp = (VRProductionPlant) ActionUtil.mergeObject(object, _tmp);

			_tmp = VRProductionPlantLocalServiceUtil.updateVRProductionPlant(_tmp);

			// JSONObject result = ActionUtil.object2Json(object, VRProductionPlant.class,
			// StringPool.BLANK);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, _tmp);

		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}

	}

	public JSONObject updateVRProductionPlantEmployee(VRProductionPlantEmployee object) {

		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		if (object.getId() <= 0) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}

		VRProductionPlantEmployee _tmp = VRProductionPlantEmployeeLocalServiceUtil
				.fetchVRProductionPlantEmployee(object.getId());
		if (_tmp == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}

		try {

			_tmp = (VRProductionPlantEmployee) ActionUtil.mergeObject(object, _tmp);

			_tmp = VRProductionPlantEmployeeLocalServiceUtil.updateVRProductionPlantEmployee(_tmp);

			// JSONObject result = ActionUtil.object2Json(object,
			// VRProductionPlantEmployee.class, StringPool.BLANK);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, _tmp);

		} catch (Exception e) {
			_log.error(e);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}

	}

	public JSONObject updateVRProductionPlantProdEquipment(VRProductionPlantProdEquipment object) {

		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		if (object.getId() <= 0) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}

		VRProductionPlantProdEquipment _tmp = VRProductionPlantProdEquipmentLocalServiceUtil
				.fetchVRProductionPlantProdEquipment(object.getId());

		if (_tmp == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}

		try {
			_tmp = (VRProductionPlantProdEquipment) ActionUtil.mergeObject(object, _tmp);

			_tmp = VRProductionPlantProdEquipmentLocalServiceUtil.updateVRProductionPlantProdEquipment(_tmp);

			// JSONObject result = ActionUtil.object2Json(object,
			// VRProductionPlantProdEquipment.class, StringPool.BLANK);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, _tmp);

		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}
	}

	public JSONObject updateVRProductType(VRProductType object) {
		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}

		if (object.getId() <= 0) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}

		VRProductType _tmp = VRProductTypeLocalServiceUtil.fetchVRProductType(object.getId());
		if (_tmp == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}

		try {
			_tmp = (VRProductType) ActionUtil.mergeObject(object, _tmp);

			_tmp = VRProductTypeLocalServiceUtil.updateVRProductType(_tmp);

			// JSONObject result = ActionUtil.object2Json(object, VRProductType.class,
			// StringPool.BLANK);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, _tmp);

		} catch (Exception e) {
			_log.error(e);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}
	}

	@Override
	public VRProductionPlant adminProcessData(JSONObject objectData, long mtCore, long applicantProfileId,
			String productionPlantCode) {
		return VRProductionPlantLocalServiceUtil.adminProcessData(objectData, mtCore, applicantProfileId,
				productionPlantCode);
	}

	@Override
	public List<VRProductionPlant> adminProcessData(JSONArray arrayData) throws Exception {
		List<VRProductionPlant> vrProductionPlants = new ArrayList<VRProductionPlant>();
		if(arrayData.length() > 0) {
			VRApplicantProfile vrApplicantProfile = VRApplicantProfileLocalServiceUtil.fetchVRApplicantProfile(arrayData.getJSONObject(0).getLong("applicantProfileId"));
			if (Validator.isNotNull(vrApplicantProfile)) {
				String applicantStatus = vrApplicantProfile.getApplicantStatus();
				if(applicantStatus.equals(VRKeys.CHO_DUYET) || applicantStatus.equals(VRKeys.DA_DUYET)) {
					throw new Exception("Error: Khong duoc sua thong tin neu doanh nghiep dang cho duyet hoac da duyet");
				}
			}
		}

		for(int i = 0; i < arrayData.length(); i++) {
			JSONObject object = arrayData.getJSONObject(i);
			
			VRProductionPlant vrProductionPlant = VRProductionPlantLocalServiceUtil.adminProcessData(object, object.getLong("mtCore"), object.getLong("applicantProfileId"), object.getString("productionPlantCode"));
			if(vrProductionPlant != null) {
				vrProductionPlants.add(vrProductionPlant);
			}
		}
		return vrProductionPlants;
	}

	@Override
	public JSONObject getVRProductionPlant(String productionplantcode, ServiceContext serviceContext) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		VRProductionPlant vrProductionPlant = VRProductionPlantLocalServiceUtil.findByproductionPlantCode(productionplantcode);
		try {
			result = BusinessUtil.object2Json_originColumnName(vrProductionPlant, VRProductionPlantImpl.class, StringPool.BLANK);
		} catch (JSONException e) {
			_log.error(e);
		}
		return result;
	}

	@Override
	public long countVRProductionPlant(User user, ServiceContext serviceContext, LinkedHashMap<String, Object> params) {
		String keyword = ActionUtil.getKeyword(params);
		// Long id = null;
		Long mtCore = null;
		String mappingMA_CTY = null;
		String mappingTEN_CTY = null;
		String mappingDIA_CHI_CTY = null;
		String mappingMA_XUONG_LR = null;
		String mappingTEN_XUONG_LR = null;
		String mappingDIA_CHI_XUONG_LR = null;
		String mappingNote = null;
		String mappingStatus = null;
		String productionPlantCode = null;
		String productionPlantName = null;
		String productionPlantAddress = null;
		String productionPlantStateCode = null;
		String productionPlantStateName = null;
		String productionPlantProvinceCode = null;
		String productionPlantProvinceName = null;
		String productionPlantDistrictCode = null;
		String productionPlantDistrictName = null;
		String productionPlantEmail = null;
		String productionPlantPhone = null;
		String productionPlantFax = null;
		String productionPlantRepresentative = null;
		String productionPlantRepresentativeTitle = null;
		String productionPlantContactName = null;
		String productionPlantContactEmail = null;
		String productionPlantContactPhone = null;
		String productionPlantType = null;
		String productionPlantStatus = null;
		String productionPlantEmployeesNote = null;
		String productionPlantEquipmentsNote = null;
		String productionPlantProdEquipmentsNote = null;
		Long registrationId = null;
		Long registrationFormId = null;
		Long applicantProfileId = null;
		Long supplierId = null;
		// String modifyDate = "";
		// String syncDate = "";
		if (params != null) {
			/*
			 * if (params.containsKey("id")) { id = GetterUtil.getLong(params.get("id")); }
			 */
			if (params.containsKey("mtcore")) {
				mtCore = GetterUtil.getLong(params.get("mtcore"));
			}
			if (params.containsKey("mappingma_cty")) {
				mappingMA_CTY = GetterUtil.getString(params.get("mappingma_cty"));
			}
			if (params.containsKey("mappingten_cty")) {
				mappingTEN_CTY = GetterUtil.getString(params.get("mappingten_cty"));
			}
			if (params.containsKey("mappingdia_chi_cty")) {
				mappingDIA_CHI_CTY = GetterUtil.getString(params.get("mappingdia_chi_cty"));
			}
			if (params.containsKey("mappingma_xuong_lr")) {
				mappingMA_XUONG_LR = GetterUtil.getString(params.get("mappingma_xuong_lr"));
			}
			if (params.containsKey("mappingten_xuong_lr")) {
				mappingTEN_XUONG_LR = GetterUtil.getString(params.get("mappingten_xuong_lr"));
			}
			if (params.containsKey("mappingdia_chi_xuong_lr")) {
				mappingDIA_CHI_XUONG_LR = GetterUtil.getString(params.get("mappingdia_chi_xuong_lr"));
			}
			if (params.containsKey("mappingnote")) {
				mappingNote = GetterUtil.getString(params.get("mappingnote"));
			}
			if (params.containsKey("mappingstatus")) {
				mappingStatus = GetterUtil.getString(params.get("mappingstatus"));
			}
			if (params.containsKey("productionplantcode")) {
				productionPlantCode = GetterUtil.getString(params.get("productionplantcode"));
			}
			if (params.containsKey("productionplantname")) {
				productionPlantName = GetterUtil.getString(params.get("productionplantname"));
			}
			if (params.containsKey("productionplantaddress")) {
				productionPlantAddress = GetterUtil.getString(params.get("productionplantaddress"));
			}
			if (params.containsKey("productionplantstatecode")) {
				productionPlantStateCode = GetterUtil.getString(params.get("productionplantstatecode"));
			}
			if (params.containsKey("productionplantstatename")) {
				productionPlantStateName = GetterUtil.getString(params.get("productionplantstatename"));
			}
			if (params.containsKey("productionplantprovincecode")) {
				productionPlantProvinceCode = GetterUtil.getString(params.get("productionplantprovincecode"));
			}
			if (params.containsKey("productionplantprovincename")) {
				productionPlantProvinceName = GetterUtil.getString(params.get("productionplantprovincename"));
			}
			if (params.containsKey("productionplantdistrictcode")) {
				productionPlantDistrictCode = GetterUtil.getString(params.get("productionplantdistrictcode"));
			}
			if (params.containsKey("productionplantdistrictname")) {
				productionPlantDistrictName = GetterUtil.getString(params.get("productionplantdistrictname"));
			}
			if (params.containsKey("productionplantemail")) {
				productionPlantEmail = GetterUtil.getString(params.get("productionplantemail"));
			}
			if (params.containsKey("productionplantphone")) {
				productionPlantPhone = GetterUtil.getString(params.get("productionplantphone"));
			}
			if (params.containsKey("productionplantfax")) {
				productionPlantFax = GetterUtil.getString(params.get("productionplantfax"));
			}
			if (params.containsKey("productionplantrepresentative")) {
				productionPlantRepresentative = GetterUtil.getString(params.get("productionplantrepresentative"));
			}
			if (params.containsKey("productionplantrepresentativetitle")) {
				productionPlantRepresentativeTitle = GetterUtil
						.getString(params.get("productionplantrepresentativetitle"));
			}
			if (params.containsKey("productionplantcontactname")) {
				productionPlantContactName = GetterUtil.getString(params.get("productionplantcontactname"));
			}
			if (params.containsKey("productionplantcontactemail")) {
				productionPlantContactEmail = GetterUtil.getString(params.get("productionplantcontactemail"));
			}
			if (params.containsKey("productionplantcontactphone")) {
				productionPlantContactPhone = GetterUtil.getString(params.get("productionplantcontactphone"));
			}
			if (params.containsKey("productionplanttype")) {
				productionPlantType = GetterUtil.getString(params.get("productionplanttype"));
			}
			if (params.containsKey("productionplantstatus")) {
				productionPlantStatus = GetterUtil.getString(params.get("productionplantstatus"));
			}
			if (params.containsKey("productionplantemployeesnote")) {
				productionPlantEmployeesNote = GetterUtil.getString(params.get("productionplantemployeesnote"));
			}
			if (params.containsKey("productionplantequipmentsnote")) {
				productionPlantEquipmentsNote = GetterUtil.getString(params.get("productionplantequipmentsnote"));
			}
			if (params.containsKey("productionplantprodequipmentsnote")) {
				productionPlantProdEquipmentsNote = GetterUtil
						.getString(params.get("productionplantprodequipmentsnote"));
			}
			if (params.containsKey("registrationid")) {
				registrationId = GetterUtil.getLong(params.get("registrationid"));
			}
			if (params.containsKey("registrationformid")) {
				registrationFormId = GetterUtil.getLong(params.get("registrationformid"));
			}
			if (params.containsKey("applicantprofileid")) {
				applicantProfileId = GetterUtil.getLong(params.get("applicantprofileid"));
			}
			if (params.containsKey("supplierid")) {
				supplierId = GetterUtil.getLong(params.get("supplierid"));
			}
			/*
			 * if (params.containsKey("modifydate")) { modifyDate =
			 * GetterUtil.getString(params.get("modifydate")); } if
			 * (params.containsKey("syncdate")) { syncDate =
			 * GetterUtil.getString(params.get("syncdate")); }
			 */
		}

		String _keywordSearchCondition = ActionUtil.buildSQLCondition("mappingma_cty", keyword, "", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("mappingten_cty", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("mappingdia_chi_cty", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("mappingma_xuong_lr", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("mappingten_xuong_lr", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("mappingdia_chi_xuong_lr", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionplantcode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionplantname", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionplantaddress", keyword, "OR", StringPool.LIKE, "");

		SQLQueryBuilder builder = new SQLQueryBuilder();

		builder.selectAll().from("vr_productionplant")
				// .where("id", id, "AND", StringPool.EQUAL)
				.where("mtcore", mtCore, "AND", StringPool.EQUAL)
				// .where("mappingma_cty", mappingMA_CTY, "AND", StringPool.EQUAL)
				// .where("mappingten_cty", mappingTEN_CTY, "AND", StringPool.EQUAL)
				// .where("mappingdia_chi_cty", mappingDIA_CHI_CTY, "AND", StringPool.EQUAL)
				// .where("mappingma_xuong_lr", mappingMA_XUONG_LR, "AND", StringPool.EQUAL)
				// .where("mappingten_xuong_lr", mappingTEN_XUONG_LR, "AND", StringPool.EQUAL)
				// .where("mappingdia_chi_xuong_lr", mappingDIA_CHI_XUONG_LR, "AND",
				// StringPool.EQUAL)
				// .where("mappingnote", mappingNote, "AND", StringPool.EQUAL)
				// .where("mappingstatus", mappingStatus, "AND", StringPool.EQUAL)
				.where("productionplantcode", productionPlantCode, "AND", StringPool.EQUAL)
				.where("productionplantname", productionPlantName, "AND", StringPool.EQUAL)
				.where("productionplantaddress", productionPlantAddress, "AND", StringPool.EQUAL)
				.where("productionplantstatecode", productionPlantStateCode, "AND", StringPool.EQUAL)
				.where("productionplantstatename", productionPlantStateName, "AND", StringPool.EQUAL)
				.where("productionplantprovincecode", productionPlantProvinceCode, "AND", StringPool.EQUAL)
				.where("productionplantprovincename", productionPlantProvinceName, "AND", StringPool.EQUAL)
				.where("productionplantdistrictcode", productionPlantDistrictCode, "AND", StringPool.EQUAL)
				.where("productionplantdistrictname", productionPlantDistrictName, "AND", StringPool.EQUAL)
				.where("productionplantemail", productionPlantEmail, "AND", StringPool.EQUAL)
				.where("productionplantphone", productionPlantPhone, "AND", StringPool.EQUAL)
				.where("productionplantfax", productionPlantFax, "AND", StringPool.EQUAL)
				.where("productionplantrepresentative", productionPlantRepresentative, "AND", StringPool.EQUAL)
				.where("productionplantrepresentativetitle", productionPlantRepresentativeTitle, "AND",
						StringPool.EQUAL)
				// .where("productionplantcontactname", productionPlantContactName, "AND",
				// StringPool.EQUAL)
				// .where("productionplantcontactemail", productionPlantContactEmail, "AND",
				// StringPool.EQUAL)
				// .where("productionplantcontactphone", productionPlantContactPhone, "AND",
				// StringPool.EQUAL)
				.where("productionplanttype", productionPlantType, "AND", StringPool.EQUAL)
				.where("productionplantstatus", productionPlantStatus, "AND", StringPool.EQUAL)
				// .where("productionplantemployeesnote", productionPlantEmployeesNote, "AND",
				// StringPool.EQUAL)
				// .where("productionplantequipmentsnote", productionPlantEquipmentsNote, "AND",
				// StringPool.EQUAL)
				// .where("productionplantprodequipmentsnote",
				// productionPlantProdEquipmentsNote, "AND", StringPool.EQUAL)
				.where("registrationid", registrationId, "AND", StringPool.EQUAL)
				.where("registrationformid", registrationFormId, "AND", StringPool.EQUAL)
				.where("applicantprofileid", applicantProfileId, "AND", StringPool.EQUAL)
				.where("supplierid", supplierId, "AND", StringPool.EQUAL)
				.where(_keywordSearchCondition, null, "AND", "", true)
				// .where("modifydate", modifyDate, "AND", StringPool.EQUAL)
				// .where("syncdate", syncDate, "AND", StringPool.EQUAL)
				.build();
		return VRProductionPlantLocalServiceUtil.counData(builder.getCountQuery());
	}
	
	

}
