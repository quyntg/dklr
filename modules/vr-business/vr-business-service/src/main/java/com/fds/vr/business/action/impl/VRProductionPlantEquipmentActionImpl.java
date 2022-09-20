package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRProductionPlantEquipmentAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.engine.SQLQueryBuilder;
import com.fds.vr.business.model.VRProductionPlantEquipment;
import com.fds.vr.business.model.VRProductionPlantEquipmentMarkup;
import com.fds.vr.business.model.impl.VRProductionPlantEquipmentImpl;
import com.fds.vr.business.model.impl.VRProductionPlantEquipmentMarkupModelImpl;
import com.fds.vr.business.model.impl.VRProductionPlantEquipmentModelImpl;
import com.fds.vr.business.service.VRProductionPlantEquipmentLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantEquipmentMarkupLocalServiceUtil;
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

public class VRProductionPlantEquipmentActionImpl implements VRProductionPlantEquipmentAction {

	private static Log _log = LogFactoryUtil.getLog(VRProductionPlantEquipmentActionImpl.class);

	public JSONObject createVRProductionPlantEquiptment(VRProductionPlantEquipment object) {

		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		try {
			object = VRProductionPlantEquipmentLocalServiceUtil.createVRProductionPlantEquipment(object);

			JSONObject result = ActionUtil.object2Json(object, VRProductionPlantEquipmentModelImpl.class,
					StringPool.BLANK);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, result);

		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}
	}

	public JSONObject createVRProductionPlantEquiptment(VRProductionPlantEquipment vrProductionPlantEquipment,
			List<VRProductionPlantEquipmentMarkup> vrProductionPlantEquipmentMarkups) {

		// validate
		if (vrProductionPlantEquipment == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		try {
			vrProductionPlantEquipment = VRProductionPlantEquipmentLocalServiceUtil
					.createVRProductionPlantEquipment(vrProductionPlantEquipment);
			JSONArray _tmpVRProductionPlantEquipmentMarkups = JSONFactoryUtil.createJSONArray();
			for (VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup : vrProductionPlantEquipmentMarkups) {
				vrProductionPlantEquipmentMarkup.setProductionPlantEquipmentId(vrProductionPlantEquipment.getId());
				vrProductionPlantEquipmentMarkup = VRProductionPlantEquipmentMarkupLocalServiceUtil
						.createVRProductionPlantEquipmentMarkup(vrProductionPlantEquipmentMarkup);
				_tmpVRProductionPlantEquipmentMarkups.put(ActionUtil.object2Json(vrProductionPlantEquipmentMarkup,
						VRProductionPlantEquipmentMarkupModelImpl.class, StringPool.BLANK));
			}

			JSONObject result = ActionUtil.object2Json(vrProductionPlantEquipment,
					VRProductionPlantEquipmentModelImpl.class, StringPool.BLANK);

			result.put("vrproductionplantequipmentmarkup", _tmpVRProductionPlantEquipmentMarkups);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, result);

		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}
	}

	public JSONObject deleteVRProductionPlantEquiptment(long id) {

		VRProductionPlantEquipment vrProductionPlantEquipment = VRProductionPlantEquipmentLocalServiceUtil
				.fetchVRProductionPlantEquipment(id);
		if (vrProductionPlantEquipment == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}

		List<VRProductionPlantEquipmentMarkup> vrProductionPlantEquipmentMarkups = VRProductionPlantEquipmentMarkupLocalServiceUtil
				.findByproductionPlantEquipmentId(id);

		if (vrProductionPlantEquipmentMarkups != null) {
			try {
				for (VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup : vrProductionPlantEquipmentMarkups) {
					VRProductionPlantEquipmentMarkupLocalServiceUtil
							.deleteVRProductionPlantEquipmentMarkup(vrProductionPlantEquipmentMarkup.getId());
				}
			} catch (Exception e) {
				_log.error(e);
				return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);
			}

		}

		try {
			VRProductionPlantEquipmentLocalServiceUtil.deleteVRProductionPlantEquipment(id);
		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);
		}

		return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, StringPool.BLANK);
	}

	@Override
	public JSONArray findByProductionPlanCode_ProductClassificationCode(String productionPlantCode,
			String productClassificationCode) {

		JSONArray result = JSONFactoryUtil.createJSONArray();

		try {
			List<VRProductionPlantEquipment> dataList = VRProductionPlantEquipmentLocalServiceUtil
					.findByProductionPlanCode(productionPlantCode);

			if (Validator.isNotNull(productClassificationCode)) {
				switch (productClassificationCode) {
				case "XCG":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupXCG() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				case "XCGNK":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupXCGNK() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				case "SMRM":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupSMRM() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				case "XCH":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupXCH() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				case "XCN":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupXCN() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				case "XMY":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupXMY() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				case "XDD":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupXDD() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				default:
					for (VRProductionPlantEquipment data : dataList) {

						result.put(
								ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class, StringPool.BLANK));

					}
					break;
				}
			} else {
				for (VRProductionPlantEquipment data : dataList) {

					result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class, StringPool.BLANK));

				}

			}
		} catch (Exception e) {
			_log.error(e);
		}

		return result;
	}

	private String createMarkUpParam(String productClassificationCodes) {

		StringBuilder result = new StringBuilder();
		StringBuilder condition = new StringBuilder();

		String[] productClassificationCodesArray = StringUtil.split(productClassificationCodes);

		for (String productClassificationCode : productClassificationCodesArray) {

			if (productClassificationCode.equals("XCG")) {

				condition.append(ActionUtil.buildSQLCondition("markupXCG", 1, StringPool.BLANK, StringPool.EQUAL,
						StringPool.BLANK));
				break;

			} else if (productClassificationCode.equals("XCGNK")) {

				condition.append(ActionUtil.buildSQLCondition("markupXCGNK", 1, StringPool.BLANK, StringPool.EQUAL,
						StringPool.BLANK));
				break;

			} else if (productClassificationCode.equals("SMRM")) {

				condition.append(ActionUtil.buildSQLCondition("markupSMRM", 1, StringPool.BLANK, StringPool.EQUAL,
						StringPool.BLANK));
				break;

			} else if (productClassificationCode.equals("XCH")) {

				condition.append(ActionUtil.buildSQLCondition("markupXCH", 1, StringPool.BLANK, StringPool.EQUAL,
						StringPool.BLANK));
				break;

			} else if (productClassificationCode.equals("XCN")) {

				condition.append(ActionUtil.buildSQLCondition("markupXCN", 1, StringPool.BLANK, StringPool.EQUAL,
						StringPool.BLANK));
				break;

			} else if (productClassificationCode.equals("XMY")) {

				condition.append(ActionUtil.buildSQLCondition("markupXMY", 1, StringPool.BLANK, StringPool.EQUAL,
						StringPool.BLANK));
				break;

			} else if (productClassificationCode.equals("XDD")) {

				condition.append(ActionUtil.buildSQLCondition("markupXDD", 1, StringPool.BLANK, StringPool.EQUAL,
						StringPool.BLANK));
				break;
			}
		}

		for (String productClassificationCode : productClassificationCodesArray) {

			if (productClassificationCode.equals("XCG")) {

				condition.append(
						ActionUtil.buildSQLCondition("markupXCG", 1, " OR ", StringPool.EQUAL, StringPool.BLANK));
			} else if (productClassificationCode.equals("XCGNK")) {

				condition.append(
						ActionUtil.buildSQLCondition("markupXCGNK", 1, " OR ", StringPool.EQUAL, StringPool.BLANK));
			} else if (productClassificationCode.equals("SMRM")) {

				condition.append(
						ActionUtil.buildSQLCondition("markupSMRM", 1, " OR ", StringPool.EQUAL, StringPool.BLANK));
			} else if (productClassificationCode.equals("XCH")) {

				condition.append(
						ActionUtil.buildSQLCondition("markupXCH", 1, " OR ", StringPool.EQUAL, StringPool.BLANK));
			} else if (productClassificationCode.equals("XCN")) {

				condition.append(
						ActionUtil.buildSQLCondition("markupXCN", 1, " OR ", StringPool.EQUAL, StringPool.BLANK));
			} else if (productClassificationCode.equals("XMY")) {

				condition.append(
						ActionUtil.buildSQLCondition("markupXMY", 1, " OR ", StringPool.EQUAL, StringPool.BLANK));
			} else if (productClassificationCode.equals("XDD")) {

				condition.append(
						ActionUtil.buildSQLCondition("markupXDD", 1, " OR ", StringPool.EQUAL, StringPool.BLANK));
			}

		}

		if (condition.length() > 0) {
			result.append(StringPool.OPEN_PARENTHESIS);
			result.append(condition);
			result.append(StringPool.CLOSE_PARENTHESIS);
		}

		return result.toString();
	}

	@Override
	public JSONObject findVRProductionPlantEquipment(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		String keyword = ActionUtil.getKeyword(params);
		Long id = null;
		Long mtCore = null;
		Long sequenceNo = null;
		String equipmentCode = null;
		// String equipmentName = null;
		String equipmentType = null;
		// String trademark = null;
		// String trademarkName = null;
		// String commercialName = null;
		String modelCode = null;
		String productionCountryCode = null;
		String equipmentStatus = null;
		// String expireDate = null;
		// String notes = null;
		// String modifyDate = null;
		// String syncDate = null;
		String equipmentSerialNo = null;
		// String productionYear = null;
		// String registrationYear = null;
		// Long markupXCG = null;
		// Long markupXCGNK = null;
		// Long markupSMRM = null;
		// Long markupXCH = null;
		// Long markupXCN = null;
		// Long markupXMY = null;
		// Long markupXDD = null;
		// Integer testingResult = null;
		// String description = null;
		String inspectionRecordNumber = null;
		// String inspectionRecordDate = null;
		String stampTestingNo = null;
		Long productionPlantId = null;
		String productionPlantCode = null;
		String productclassificationcode = null;
		if (params != null) {
			if (params.containsKey("productclassificationcode")) {
				productclassificationcode = GetterUtil.getString(params.get("productclassificationcode"));
			}
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
			/*
			 * if (params.containsKey("equipmentname")) { equipmentName =
			 * GetterUtil.getString(params.get("equipmentname")); }
			 */
			if (params.containsKey("equipmenttype")) {
				equipmentType = GetterUtil.getString(params.get("equipmenttype"));
			}
			/*
			 * if (params.containsKey("trademark")) { trademark =
			 * GetterUtil.getString(params.get("trademark")); } if
			 * (params.containsKey("trademarkname")) { trademarkName =
			 * GetterUtil.getString(params.get("trademarkname")); } if
			 * (params.containsKey("commercialname")) { commercialName =
			 * GetterUtil.getString(params.get("commercialname")); }
			 */
			if (params.containsKey("modelcode")) {
				modelCode = GetterUtil.getString(params.get("modelcode"));
			}
			if (params.containsKey("productioncountrycode")) {
				productionCountryCode = GetterUtil.getString(params.get("productioncountrycode"));
			}
			if (params.containsKey("equipmentstatus")) {
				equipmentStatus = GetterUtil.getString(params.get("equipmentstatus"));
			}
			/*
			 * if (params.containsKey("expiredate")) { expireDate =
			 * GetterUtil.getString(params.get("expiredate")); } if
			 * (params.containsKey("notes")) { notes =
			 * GetterUtil.getString(params.get("notes")); } if
			 * (params.containsKey("modifydate")) { modifyDate =
			 * GetterUtil.getString(params.get("modifydate")); } if
			 * (params.containsKey("syncdate")) { syncDate =
			 * GetterUtil.getString(params.get("syncdate")); }
			 */
			if (params.containsKey("equipmentserialno")) {
				equipmentSerialNo = GetterUtil.getString(params.get("equipmentserialno"));
			}
			/*
			 * if (params.containsKey("productionyear")) { productionYear =
			 * GetterUtil.getString(params.get("productionyear")); } if
			 * (params.containsKey("registrationyear")) { registrationYear =
			 * GetterUtil.getString(params.get("registrationyear")); } if
			 * (params.containsKey("markupxcg")) { markupXCG =
			 * GetterUtil.getLong(params.get("markupxcg")); } if
			 * (params.containsKey("markupxcgnk")) { markupXCGNK =
			 * GetterUtil.getLong(params.get("markupxcgnk")); } if
			 * (params.containsKey("markupsmrm")) { markupSMRM =
			 * GetterUtil.getLong(params.get("markupsmrm")); } if
			 * (params.containsKey("markupxch")) { markupXCH =
			 * GetterUtil.getLong(params.get("markupxch")); } if
			 * (params.containsKey("markupxcn")) { markupXCN =
			 * GetterUtil.getLong(params.get("markupxcn")); } if
			 * (params.containsKey("markupxmy")) { markupXMY =
			 * GetterUtil.getLong(params.get("markupxmy")); } if
			 * (params.containsKey("markupxdd")) { markupXDD =
			 * GetterUtil.getLong(params.get("markupxdd")); } if
			 * (params.containsKey("testingresult")) { testingResult =
			 * GetterUtil.getInteger(params.get("testingresult")); } if
			 * (params.containsKey("description")) { description =
			 * GetterUtil.getString(params.get("description")); }
			 */
			if (params.containsKey("inspectionrecordnumber")) {
				inspectionRecordNumber = GetterUtil.getString(params.get("inspectionrecordnumber"));
			}
			/*
			 * if (params.containsKey("inspectionrecorddate")) { inspectionRecordDate =
			 * GetterUtil.getString(params.get("inspectionrecorddate")); }
			 */
			if (params.containsKey("stamptestingno")) {
				stampTestingNo = GetterUtil.getString(params.get("stamptestingno"));
			}
			if (params.containsKey("productionplantid")) {
				productionPlantId = GetterUtil.getLong(params.get("productionplantid"));
			}
			if (params.containsKey("productionplantcode")) {
				productionPlantCode = GetterUtil.getString(params.get("productionplantcode"));
			}
		}
		String _keywordSearchCondition = ActionUtil.buildSQLCondition("equipmentName", keyword, "", StringPool.LIKE, "")
				// + ActionUtil.buildSQLCondition("equipmentType", keyword, "OR",
				// StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("trademark", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("trademarkName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("commercialName", keyword, "OR", StringPool.LIKE, "")
				// + ActionUtil.buildSQLCondition("modelCode", keyword, "OR", StringPool.LIKE,
				// "")
				// + ActionUtil.buildSQLCondition("productionCountryCode", keyword, "OR",
				// StringPool.LIKE, "")
				// + ActionUtil.buildSQLCondition("equipmentStatus", keyword, "OR",
				// StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("notes", keyword, "OR", StringPool.LIKE, "")
				// + ActionUtil.buildSQLCondition("equipmentSerialNo", keyword, "OR",
				// StringPool.LIKE, "")
				// + ActionUtil.buildSQLCondition("productionYear", keyword, "OR",
				// StringPool.LIKE, "")
				// + ActionUtil.buildSQLCondition("registrationYear", keyword, "OR",
				// StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("description", keyword, "OR", StringPool.LIKE, "");
		// + ActionUtil.buildSQLCondition("inspectionRecordNumber", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("stampTestingNo", keyword, "OR",
		// StringPool.LIKE, "")
		// + ActionUtil.buildSQLCondition("productionPlantCode", keyword, "OR",
		// StringPool.LIKE, "");
		SQLQueryBuilder builder = new SQLQueryBuilder();
		builder.selectAll().from("vr_productionplantequipment").where("id", id, "AND", StringPool.EQUAL)
				.where("mtcore", mtCore, "AND", StringPool.EQUAL)
				.where("sequenceno", sequenceNo, "AND", StringPool.EQUAL)
				.where("equipmentcode", equipmentCode, "AND", StringPool.EQUAL)
				// .where("equipmentname", equipmentName, "AND", StringPool.EQUAL)
				.where("equipmenttype", equipmentType, "AND", StringPool.EQUAL)
				// .where("trademark", trademark, "AND", StringPool.EQUAL)
				// .where("trademarkname", trademarkName, "AND", StringPool.EQUAL)
				// .where("commercialname", commercialName, "AND", StringPool.EQUAL)
				.where("modelcode", modelCode, "AND", StringPool.EQUAL)
				.where("productioncountrycode", productionCountryCode, "AND", StringPool.EQUAL)
				.where("equipmentstatus", equipmentStatus, "AND", StringPool.EQUAL)
				// .where("expiredate", expireDate, "AND", StringPool.EQUAL).where("notes",
				// notes, "AND", StringPool.EQUAL)
				// .where("modifydate", modifyDate, "AND", StringPool.EQUAL)
				// .where("syncdate", syncDate, "AND", StringPool.EQUAL)
				.where("equipmentserialno", equipmentSerialNo, "AND", StringPool.EQUAL)
				// .where("productionyear", productionYear, "AND", StringPool.EQUAL)
				// .where("registrationyear", registrationYear, "AND", StringPool.EQUAL)
				// .where("markupxcg", markupXCG, "AND", StringPool.EQUAL)
				// .where("markupxcgnk", markupXCGNK, "AND", StringPool.EQUAL)
				// .where("markupsmrm", markupSMRM, "AND", StringPool.EQUAL)
				// .where("markupxch", markupXCH, "AND", StringPool.EQUAL)
				// .where("markupxcn", markupXCN, "AND", StringPool.EQUAL)
				// .where("markupxmy", markupXMY, "AND", StringPool.EQUAL)
				// .where("markupxdd", markupXDD, "AND", StringPool.EQUAL)
				// .where("testingresult", testingResult, "AND", StringPool.EQUAL)
				// .where("description", description, "AND", StringPool.EQUAL)
				.where("inspectionrecordnumber", inspectionRecordNumber, "AND", StringPool.EQUAL)
				// .where("inspectionrecorddate", inspectionRecordDate, "AND", StringPool.EQUAL)
				.where("stamptestingno", stampTestingNo, "AND", StringPool.EQUAL)
				.where("productionplantid", productionPlantId, "AND", StringPool.EQUAL)
				.where("productionplantcode", productionPlantCode, "AND", StringPool.EQUAL)
				.where(_keywordSearchCondition, null, "AND", "", true);

		if (Validator.isNotNull(productclassificationcode)) {
			builder.join("INNER JOIN", "vr_productionplantequipment", "id", "vr_productionplantequipmentmarkup",
					"productionplantequipmentid")
					.joinwhere("vr_productionplantequipmentmarkup.productclassificationcode", productclassificationcode,
							"AND", StringPool.EQUAL)
					.build();

		} else {
			builder.build();

		}

		JSONArray data = VRProductionPlantEquipmentLocalServiceUtil.findData(builder.getSelectQuery(), null, null,
				VRProductionPlantEquipmentImpl.class, "VRProductionPlantEquipment", start, end);

		if (data != null && data.length() > 0) {
			for (int i = 0; i < data.length(); i++) {

				id = data.getJSONObject(i).getLong("id");
				if (id > 0) {
					List<VRProductionPlantEquipmentMarkup> vrProductionPlantEquipmentMarkups = null;
					try {
						vrProductionPlantEquipmentMarkups = VRProductionPlantEquipmentMarkupLocalServiceUtil
								.findByproductionPlantEquipmentId(id);
					} catch (Exception e) {
						// nothing todo
					}

					JSONArray _tmpArray = JSONFactoryUtil.createJSONArray();

					for (VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup : vrProductionPlantEquipmentMarkups) {
						try {
							JSONObject object = ActionUtil.object2Json(vrProductionPlantEquipmentMarkup,
									VRProductionPlantEquipmentMarkupModelImpl.class, StringPool.BLANK);
							_tmpArray.put(object);
						} catch (Exception e) {

						}
					}

					data.getJSONObject(i).put("vrproductionplantequipmentmarkup", _tmpArray);

				}
			}
		}

		long total = VRProductionPlantEquipmentLocalServiceUtil.counData(builder.getCountQuery());

		JSONObject result = JSONFactoryUtil.createJSONObject();

		result.put("total", total);
		result.put("data", data);
		return result;
	}

	public JSONObject updateVRProductionPlantEquiptment(VRProductionPlantEquipment object,
			List<VRProductionPlantEquipmentMarkup> vrProductionPlantEquipmentMarkups) {

		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		if (object.getId() <= 0) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}

		/*
		 * VRProductionPlantEquipment _tmp = VRProductionPlantEquipmentLocalServiceUtil
		 * .fetchVRProductionPlantEquipment(object.getId()); if (_tmp == null) { return
		 * ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND,
		 * StringPool.BLANK); }
		 */

		try {

			// _tmp = (VRProductionPlantEquipment) ActionUtil.mergeObject(object, _tmp);

			// _tmp =
			// VRProductionPlantEquipmentLocalServiceUtil.updateVRProductionPlantEquipment(_tmp);

			List<VRProductionPlantEquipmentMarkup> _tmpVRProductionPlantEquipmentMarkups = VRProductionPlantEquipmentMarkupLocalServiceUtil
					.findByproductionPlantEquipmentId(object.getId());

			if (_tmpVRProductionPlantEquipmentMarkups != null) {
				for (VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup : _tmpVRProductionPlantEquipmentMarkups) {
					VRProductionPlantEquipmentMarkupLocalServiceUtil
							.deleteVRProductionPlantEquipmentMarkup(vrProductionPlantEquipmentMarkup.getId());
				}
			}

			object = VRProductionPlantEquipmentLocalServiceUtil.updateVRProductionPlantEquipment(object);

			JSONArray _tmpArrayVRProductionPlantEquipmentMarkups = JSONFactoryUtil.createJSONArray();
			for (VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup : vrProductionPlantEquipmentMarkups) {
				vrProductionPlantEquipmentMarkup.setProductionPlantEquipmentId(object.getId());
				vrProductionPlantEquipmentMarkup = VRProductionPlantEquipmentMarkupLocalServiceUtil
						.createVRProductionPlantEquipmentMarkup(vrProductionPlantEquipmentMarkup);
				_tmpArrayVRProductionPlantEquipmentMarkups.put(ActionUtil.object2Json(vrProductionPlantEquipmentMarkup,
						VRProductionPlantEquipmentMarkupModelImpl.class, StringPool.BLANK));
			}

			JSONObject result = ActionUtil.object2Json(object, VRProductionPlantEquipmentModelImpl.class,
					StringPool.BLANK);

			result.put("vrproductionplantequipmentmarkup", _tmpArrayVRProductionPlantEquipmentMarkups);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, result);

		} catch (Exception e) {
			_log.error(e);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}
	}

	@Override
	public List<VRProductionPlantEquipment> adminProcessData(JSONArray arrayData, String productionPlantCode) {
		return VRProductionPlantEquipmentLocalServiceUtil.adminProcessData(arrayData, productionPlantCode);
	}

}
