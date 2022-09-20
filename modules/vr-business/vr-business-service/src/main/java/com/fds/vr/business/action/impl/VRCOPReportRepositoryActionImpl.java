package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRCOPReportRepositoryAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.engine.SQLQueryBuilder;
import com.fds.vr.business.engine.SQLQueryInstance;
import com.fds.vr.business.model.VRCOPProdEquipment;
import com.fds.vr.business.model.VRCOPProductType;
import com.fds.vr.business.model.VRCOPProductionPlantEmployee;
import com.fds.vr.business.model.VRCOPProductionPlantEquipment;
import com.fds.vr.business.model.VRCOPReportAttach;
import com.fds.vr.business.model.VRCOPReportRepository;
import com.fds.vr.business.model.VRES;
import com.fds.vr.business.model.impl.VRCOPProdEquipmentModelImpl;
import com.fds.vr.business.model.impl.VRCOPProductTypeModelImpl;
import com.fds.vr.business.model.impl.VRCOPProductionPlantEmployeeModelImpl;
import com.fds.vr.business.model.impl.VRCOPProductionPlantEquipmentModelImpl;
import com.fds.vr.business.model.impl.VRCOPReportAttachModelImpl;
import com.fds.vr.business.model.impl.VRCOPReportRepositoryImpl;
import com.fds.vr.business.model.impl.VRCOPReportRepositoryModelImpl;
import com.fds.vr.business.service.VRCOPProdEquipmentLocalServiceUtil;
import com.fds.vr.business.service.VRCOPProductTypeLocalServiceUtil;
import com.fds.vr.business.service.VRCOPProductionPlantEmployeeLocalServiceUtil;
import com.fds.vr.business.service.VRCOPProductionPlantEquipmentLocalServiceUtil;
import com.fds.vr.business.service.VRCOPReportAttachLocalServiceUtil;
import com.fds.vr.business.service.VRCOPReportRepositoryLocalServiceUtil;
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
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author trungnt
 *
 */
public class VRCOPReportRepositoryActionImpl implements VRCOPReportRepositoryAction {

	@Override
	public JSONObject findVRCOPReportRepositoryYear(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		Integer mtcore = null;
		Long productionplantid = null;
		String module = StringPool.BLANK;
		String productionPlantCode = StringPool.BLANK;
		if (params != null) {

			if (params.containsKey("mtcore")) {
				mtcore = (Integer) params.get("mtcore");
			}
			if (params.containsKey("productionplantid")) {
				productionplantid = (Long) params.get("productionplantid");
			}
			if (params.containsKey("module")) {
				module = (String) params.get("module");
			}
			if (params.containsKey("productionplantcode")) {
				productionPlantCode = (String) params.get("productionplantcode");
			}
		}

		String tableAlias = StringPool.BLANK;

		String sqlStatementPattern = "SELECT [$STATEMENT_COLUMN$] FROM vr_copreportrepository"
				+ (Validator.isNotNull(tableAlias) ? " AS " + tableAlias : StringPool.BLANK)
				+ " [$CONDITION$] ORDER BY report_year DESC";

		LinkedHashMap<String, String> columnStatementMap = new LinkedHashMap<String, String>();
		columnStatementMap.put(ActionUtil.createSCNWTAS("year(COPReportDate) AS report_year", ""), int.class.getName());
		StringBuilder conditions = new StringBuilder();

		conditions.append(" WHERE year(COPReportDate) > 0 ");

		if (mtcore != null) {
			conditions.append(ActionUtil.buildSQLCondition("mtcore", mtcore, " AND ", StringPool.EQUAL, tableAlias));
		}

		if (Validator.isNotNull(productionplantid)) {
			conditions.append(ActionUtil.buildSQLCondition("productionplantid", productionplantid, " AND ",
					StringPool.EQUAL, tableAlias));
		}

		if (Validator.isNotNull(module)) {
			conditions.append(
					ActionUtil.buildSQLCondition("module", "'" + module + "'", " AND ", StringPool.EQUAL, tableAlias));
		}

		if (Validator.isNotNull(productionPlantCode)) {
			conditions.append(ActionUtil.buildSQLCondition("productionplantcode", "'" + productionPlantCode + "'",
					" AND ", StringPool.EQUAL, tableAlias));
		}

		conditions.append(" GROUP BY year(COPReportDate) ");

		LinkedHashMap<String, String> sortedby = ActionUtil.getOrderFiledMap(params, columnStatementMap);

		SQLQueryInstance instance = ActionUtil.createSQLQueryInstance(sqlStatementPattern, columnStatementMap,
				conditions, sortedby, VRCOPReportRepositoryImpl.class, StringPool.BLANK, tableAlias, StringPool.BLANK);

		// System.out.println("SQL Statement:" + instance.getSqlStatemanent());

		JSONArray array = VRCOPReportRepositoryLocalServiceUtil.findData(instance.getSqlStatemanent(),
				instance.getColumnAliasNames(), instance.getColumnDataTypes(), instance.getReturnClassName(),
				instance.getClassName(), start, end);

		long total = array != null ? array.length() : 0;

		JSONObject result = JSONFactoryUtil.createJSONObject();

		result.put("total", total);
		result.put("data", array);
		return result;
	}

	@Override
	public JSONObject findVRCOPReportRepository(User user, ServiceContext serviceContext, Integer year,
			LinkedHashMap<String, Object> params, String advancesearchParams) {
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		String module = StringPool.BLANK;
		String productionPlantCode = StringPool.BLANK;
		Integer mtcore = null;
		Long productionplantid = null;

		if (params != null) {

			if (params.containsKey("mtcore")) {
				mtcore = (Integer) params.get("mtcore");
			}
			if (params.containsKey("productionplantid")) {
				productionplantid = (Long) params.get("productionplantid");
			}
			if (params.containsKey("module")) {
				module = (String) params.get("module");
			}
			if (params.containsKey("productionplantcode")) {
				productionPlantCode = (String) params.get("productionplantcode");
			}
		}

		String joinStatements = ActionUtil.buildJoinCondition(advancesearchParams);

		String tableAlias = StringPool.BLANK;

		if (Validator.isNotNull(joinStatements)) {
			tableAlias = "vr_copreportrepository";
		}

		String sqlStatementPattern = "SELECT [$STATEMENT_COLUMN$] FROM vr_copreportrepository"
				+ (Validator.isNotNull(tableAlias) ? " AS " + tableAlias : StringPool.BLANK)
				+ " [$STATEMENT_JOIN$] [$CONDITION$] [$ORDERBY$]";

		LinkedHashMap<String, String> columnStatementMap = new LinkedHashMap<String, String>();

		StringBuilder conditions = new StringBuilder();

		conditions.append(" WHERE 1 = 1 ");

		if (mtcore != null) {
			conditions.append(ActionUtil.buildSQLCondition("mtcore", mtcore, " AND ", StringPool.EQUAL, tableAlias));
		}

		if (Validator.isNotNull(productionplantid)) {
			conditions.append(ActionUtil.buildSQLCondition("productionplantid", productionplantid, " AND ",
					StringPool.EQUAL, tableAlias));
		}

		if (year != null && year > 0) {
			conditions.append(" AND year(COPReportDate) = " + year);
		}

		if (Validator.isNotNull(module)) {
			conditions.append(
					ActionUtil.buildSQLCondition("module", "'" + module + "'", " AND ", StringPool.EQUAL, tableAlias));
		}

		if (Validator.isNotNull(productionPlantCode)) {
			conditions.append(ActionUtil.buildSQLCondition("productionplantcode", "'" + productionPlantCode + "'",
					" AND ", StringPool.EQUAL, tableAlias));
		}

		LinkedHashMap<String, String> sortedby = ActionUtil.getOrderFiledMap(params, columnStatementMap);

		SQLQueryInstance instance = ActionUtil.createSQLQueryInstance(sqlStatementPattern, columnStatementMap,
				conditions, sortedby, VRCOPReportRepositoryImpl.class, "VRCOPReportRepository", tableAlias,
				joinStatements);

		// System.out.println("SQL Statement:" + instance.getSqlStatemanent());

		JSONArray array = VRCOPReportRepositoryLocalServiceUtil.findData(instance.getSqlStatemanent(),
				instance.getColumnAliasNames(), instance.getColumnDataTypes(), instance.getReturnClassName(),
				instance.getClassName(), start, end);

		long total = VRCOPReportRepositoryLocalServiceUtil.counData(instance.getCountStatemanent());

		JSONObject result = JSONFactoryUtil.createJSONObject();

		result.put("total", total);
		result.put("data", array);

		return result;
	}

	@Override
	public JSONObject findByMtCore_ProductionPlantCode_COPClassification(long mtCore, String productionPlantCode,
			String copClassification, int start, int end) {
		List<VRCOPReportRepository> vrcopReportRepositories = VRCOPReportRepositoryLocalServiceUtil
				.findByMtCore_ProductionPlantCode_COPClassification(mtCore, productionPlantCode, copClassification,
						start, end);
		JSONArray array = JSONFactoryUtil.createJSONArray();
		vrcopReportRepositories.stream().forEach(cop -> {
			JSONObject obj = null;
			try {
				obj = BusinessUtil.object2Json_originColumnName(cop, VRCOPReportRepositoryModelImpl.class,
						StringPool.BLANK);
			} catch (JSONException e) {
			}
			if (obj != null) {
				array.put(obj);
			}
		});
		JSONObject result = JSONFactoryUtil.createJSONObject();
		result.put("total", vrcopReportRepositories.size());
		result.put("data", array);
		return result;
	}

	@Override
	public long countVRCOPReportRepositories(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {
		long total = 0;
		String applicantCode = StringPool.BLANK;
		String productionPlantCode = StringPool.BLANK;
		String copClassification = StringPool.BLANK;
		long year = 0;
		if (params != null) {

			if (params.containsKey("applicantcode")) {
				applicantCode = GetterUtil.getString(params.get("applicantcode"));
			}
			if (params.containsKey("productionplantcode")) {
				productionPlantCode = GetterUtil.getString(params.get("productionplantcode"));
			}
			if (params.containsKey("copclassification")) {
				copClassification = GetterUtil.getString(params.get("copclassification"));
			}
			if (params.containsKey("copreportdate")) {
				year = GetterUtil.getLong(params.get("copreportdate"));
			}
		}

		SQLQueryBuilder builder = new SQLQueryBuilder();
		builder.selectAll().from("vr_copreportrepository")
				.where("applicantCode", applicantCode, "AND", StringPool.EQUAL)
				.where("productionPlantCode", productionPlantCode, "AND", StringPool.EQUAL)
				.where("copClassification", copClassification, "AND", StringPool.EQUAL)
				.where("year(COPReportDate)", year, "AND", StringPool.EQUAL).build();
		total = VRCOPReportRepositoryLocalServiceUtil.counData(builder.getCountQuery());

		return total;
	}

	private static final Log _log = LogFactoryUtil.getLog(VRCOPReportRepositoryActionImpl.class);

	@Override
	public void indexing(VRCOPReportRepository vrcopReportRepository, Company company) {
		final String CLASS_NAME = VRES.class.getName();

		JSONObject object = JSONFactoryUtil.createJSONObject();
		JSONObject jVRCOPReportRepository = null;
		try {
			jVRCOPReportRepository = BusinessUtil.object2Json_originValue(vrcopReportRepository,
					VRCOPReportRepositoryModelImpl.class, StringPool.BLANK);
		} catch (Exception e) {
			_log.error(e);
		}
		if (jVRCOPReportRepository != null) {
			object.put("vr_COPReportRepository", jVRCOPReportRepository);
			long mtCore = vrcopReportRepository.getMtCore();
			if (mtCore == 1L) {
				long dossierId = vrcopReportRepository.getDossierId();

				List<VRCOPProductionPlantEmployee> vrcopProductionPlantEmployees = VRCOPReportRepositoryLocalServiceUtil
						.findVRCOPProductionPlantEmployeesByDossierId(dossierId, mtCore, QueryUtil.ALL_POS,
								QueryUtil.ALL_POS);
				object = BusinessUtil.array2JSON(vrcopProductionPlantEmployees,
						VRCOPProductionPlantEmployeeModelImpl.class, object, "vr_ProductionPlantEmployee");

				List<VRCOPProductionPlantEquipment> vrcopProductionPlantEquipments = VRCOPReportRepositoryLocalServiceUtil
						.findVRCOPProductionPlantEquipmentsByDossierId(dossierId, mtCore, QueryUtil.ALL_POS,
								QueryUtil.ALL_POS);
				object = BusinessUtil.array2JSON(vrcopProductionPlantEquipments,
						VRCOPProductionPlantEquipmentModelImpl.class, object, "vr_ProductionPlantEquipment");

				List<VRCOPProdEquipment> vrcopProdEquipments = VRCOPReportRepositoryLocalServiceUtil
						.findVRCOPProdEquipmentsByDossierId(dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				object = BusinessUtil.array2JSON(vrcopProdEquipments, VRCOPProdEquipmentModelImpl.class, object,
						"vr_ProductionPlantProdEquipment");

				List<VRCOPProductType> vrcopProductTypes = VRCOPReportRepositoryLocalServiceUtil
						.findVRCOPProductTypesByDossierId(dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				object = BusinessUtil.array2JSON(vrcopProductTypes, VRCOPProductTypeModelImpl.class, object,
						"vr_ProductType");

				List<VRCOPReportAttach> vrcopReportAttachs = VRCOPReportRepositoryLocalServiceUtil
						.findVRCOPReportAttachsByDossierId(dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				object = BusinessUtil.array2JSON(vrcopReportAttachs, VRCOPReportAttachModelImpl.class, object,
						"vr_COPReport_attach");

				JSONObject esData = JSONFactoryUtil.createJSONObject();
				esData.put("dossierId", String.valueOf(vrcopReportRepository.getDossierId()));
				esData.put("dossierIdCTN", vrcopReportRepository.getDossierIdCTN());
				esData.put("dossierNo", vrcopReportRepository.getDossierNo());
				esData.put("type_es", "vr_copreportrepository");
				esData.put(Field.MODIFIED_DATE + "_es", new Date().getTime());
				esData.put(Field.COMPANY_ID, String.valueOf(company.getCompanyId()));
				esData.put("id", String.valueOf(vrcopReportRepository.getId()));
				esData.put("data", object);

				int deletex = 0;
				if (dossierId > 0L) {
					deletex = ElasticQueryWrapUtil.DELETE("dossierId",
							String.valueOf(vrcopReportRepository.getDossierId()), company.getCompanyId(),
							"vr_copreportrepository");
				}
				if (deletex == 0) {
					ElasticQueryWrapUtil.POST(esData.toJSONString(), CLASS_NAME, company.getCompanyId());
				}
				_log.info("---> DocumentId - DossierId: " + vrcopReportRepository.getDossierId());
			} else if (mtCore == 0L) {
				long vrCOPReportRepositoryId = vrcopReportRepository.getPrimaryKey();

				try {
					List<VRCOPProductionPlantEmployee> vrcopProductionPlantEmployees = VRCOPProductionPlantEmployeeLocalServiceUtil
							.findBycopReportRepositoryID_MtCore(mtCore, vrCOPReportRepositoryId, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					object = BusinessUtil.array2JSON(vrcopProductionPlantEmployees,
							VRCOPProductionPlantEmployeeModelImpl.class, object, "vr_ProductionPlantEmployee");
				} catch (Exception e) {
					_log.error(e);
				}
				try {
					List<VRCOPProductionPlantEquipment> vrcopProductionPlantEquipments = VRCOPProductionPlantEquipmentLocalServiceUtil
							.findBycopReportRepositoryID_MtCore(mtCore, vrCOPReportRepositoryId, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					object = BusinessUtil.array2JSON(vrcopProductionPlantEquipments,
							VRCOPProductionPlantEquipmentModelImpl.class, object, "vr_ProductionPlantEquipment");
				} catch (Exception e) {
					_log.error(e);
				}
				try {
					List<VRCOPProdEquipment> vrcopProdEquipments = VRCOPProdEquipmentLocalServiceUtil
							.findBycopReportRepositoryID_MtCore(mtCore, vrCOPReportRepositoryId, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					object = BusinessUtil.array2JSON(vrcopProdEquipments, VRCOPProdEquipmentModelImpl.class, object,
							"vr_ProductionPlantProdEquipment");
				} catch (Exception e) {
					_log.error(e);
				}
				try {
					List<VRCOPProductType> vrcopProductTypes = VRCOPProductTypeLocalServiceUtil
							.findBycopReportRepositoryID_MtCore(mtCore, vrCOPReportRepositoryId, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					object = BusinessUtil.array2JSON(vrcopProductTypes, VRCOPProductTypeModelImpl.class, object,
							"vr_ProductType");
				} catch (Exception e) {
					_log.error(e);
				}
				try {
					List<VRCOPReportAttach> vrcopReportAttachs = VRCOPReportAttachLocalServiceUtil
							.findBycopReportRepositoryID_MtCore(mtCore, vrCOPReportRepositoryId, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					object = BusinessUtil.array2JSON(vrcopReportAttachs, VRCOPReportAttachModelImpl.class, object,
							"vr_COPReport_attach");
				} catch (Exception e) {
					_log.error(e);
				}

				JSONObject esData = JSONFactoryUtil.createJSONObject();
				esData.put("dossierId", String.valueOf(vrcopReportRepository.getDossierId()));
				esData.put("dossierIdCTN", vrcopReportRepository.getDossierIdCTN());
				esData.put("dossierNo", vrcopReportRepository.getDossierNo());
				esData.put("type_es", "vr_copreportrepository");
				esData.put(Field.MODIFIED_DATE + "_es", new Date().getTime());
				esData.put(Field.COMPANY_ID, String.valueOf(company.getCompanyId()));
				esData.put("id", String.valueOf(vrcopReportRepository.getId()));
				esData.put("data", object);

				int deletex = ElasticQueryWrapUtil.DELETE("id", String.valueOf(vrcopReportRepository.getPrimaryKey()),
						company.getCompanyId(), "vr_copreportrepository");
				if (deletex == 0) {
					ElasticQueryWrapUtil.POST(esData.toJSONString(), CLASS_NAME, company.getCompanyId());
				}
				_log.info("---> DocumentId - VRCOPReportRepositoryId: " + vrcopReportRepository.getPrimaryKey());
			}

		}
	}

	@Override
	public JSONObject findByDossierId(long dossierId, long mtCore, ServiceContext serviceContext) {
		VRCOPReportRepository vrcopReportRepository = VRCOPReportRepositoryLocalServiceUtil
				.findByDossierId_MTCore(dossierId, mtCore);
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			result = BusinessUtil.object2Json_originColumnName(vrcopReportRepository,
					VRCOPReportRepositoryModelImpl.class, StringPool.BLANK);
		} catch (Exception e) {
		}
		return result;
	}

	@Override
	public JSONObject findCOPProductionPlantEquipmentByDossierId(User user, ServiceContext serviceContext,
			long dossierId, long mtCore, int start, int end) {
		List<VRCOPProductionPlantEquipment> vrcopProductionPlantEquipments = VRCOPProductionPlantEquipmentLocalServiceUtil
				.findByDossierId_MtCore(mtCore, dossierId, start, end);
		JSONArray array = JSONFactoryUtil.createJSONArray();
		JSONObject result = JSONFactoryUtil.createJSONObject();
		for(VRCOPProductionPlantEquipment vrcopProductionPlantEquipment : vrcopProductionPlantEquipments) {
			try {
				JSONObject object = BusinessUtil.object2Json_originColumnName(vrcopProductionPlantEquipment, 
						VRCOPProductionPlantEquipmentModelImpl.class, StringPool.BLANK);
				object.put("sequenceNo", vrcopProductionPlantEquipment.getSequenceNo());
				object.put("name", vrcopProductionPlantEquipment.getEquipmentCode());
				object.put("name_text", vrcopProductionPlantEquipment.getEquipmentName());
				object.put("mark", vrcopProductionPlantEquipment.getTrademarkName());
				object.put("model", vrcopProductionPlantEquipment.getModelCode());
				object.put("seri", vrcopProductionPlantEquipment.getEquipmentSerialNo());
				object.put("year", vrcopProductionPlantEquipment.getProductionYear());
				object.put("country", vrcopProductionPlantEquipment.getProductionCountryCode());
				object.put("temp", vrcopProductionPlantEquipment.getStampTestingNo());
				object.put("status", vrcopProductionPlantEquipment.getExpiredStatus());
				object.put("note", vrcopProductionPlantEquipment.getNotes());
				array.put(object);
			} catch (Exception e) {
			}
		}
		result.put("total", vrcopProductionPlantEquipments.size());
		result.put("data", array);
		return result;
	}
}
