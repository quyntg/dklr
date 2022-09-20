package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRVehicleRecordAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.constant.VRKeys;
import com.fds.vr.business.engine.DBField;
import com.fds.vr.business.engine.SQLQueryBuilder;
import com.fds.vr.business.model.VRDossier;
import com.fds.vr.business.model.VRVehicleRecord;
import com.fds.vr.business.model.VRVehicleSpecification;
import com.fds.vr.business.model.VRVehicleTypeCertificate;
import com.fds.vr.business.model.impl.VRProductionPlantEquipmentModelImpl;
import com.fds.vr.business.model.impl.VRVehicleRecordImpl;
import com.fds.vr.business.model.impl.VRVehicleRecordModelImpl;
import com.fds.vr.business.model.impl.VRVehicleTypeCertificateModelImpl;
import com.fds.vr.business.service.VRDossierLocalServiceUtil;
import com.fds.vr.business.service.VRVehicleRecordLocalServiceUtil;
import com.fds.vr.business.service.VRVehicleSpecificationLocalServiceUtil;
import com.fds.vr.business.service.VRVehicleTypeCertificateLocalServiceUtil;
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
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.net.ssl.HttpsURLConnection;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.opencps.datamgt.utils.DateTimeUtils;

/**
 * @author trungnt
 *
 */
public class VRVehicleRecordActionImpl implements VRVehicleRecordAction {
	private Log _log = LogFactoryUtil.getLog(VRVehicleRecordActionImpl.class);

	@Override
	public long countVRVehicleRecord(User user, ServiceContext serviceContext, LinkedHashMap<String, Object> params) {

		SQLQueryBuilder builder = getBuilder(params);

		return VRVehicleRecordLocalServiceUtil.counData(builder.getCountQuery());
	}

	public JSONObject createVRVehicleRecord(VRVehicleRecord object) {

		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		try {
			object = VRVehicleRecordLocalServiceUtil.createVRVehicleRecord(object);

			JSONObject result = ActionUtil.object2Json(object, VRVehicleRecordModelImpl.class, StringPool.BLANK);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, result);

		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}
	}

	@Override
	public JSONObject deleteVRVehicleRecord(long id) {
		VRVehicleRecord vrVehicleRecord = VRVehicleRecordLocalServiceUtil.fetchVRVehicleRecord(id);
		if (vrVehicleRecord == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}
		try {
			VRVehicleRecordLocalServiceUtil.deleteVRVehicleRecord(id);
		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);
		}

		return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, StringPool.BLANK);
	}

	@Override
	public File doExportVRVehicleRecord(User user, ServiceContext serviceContext, LinkedHashMap<String, Object> params,
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

			JSONArray data = VRVehicleRecordLocalServiceUtil.findData(builder.getSelectQuery(),
					builder.getColumnInstances(), builder.getDataTypes(), null, null, start, end);

			return ActionUtil.doExportExcelFile("VRVehicleRecord", arrHeaderCodes, arrHeadeLabels, data);

		} catch (Exception e) {
			_log.error(e);

			return null;

		}
	}

	@Override
	public JSONObject findVRVehicleRecord(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {

		int start = ActionUtil.getStart(params);

		int end = ActionUtil.getEnd(params);

		SQLQueryBuilder builder = getBuilder(params);

		JSONObject result = JSONFactoryUtil.createJSONObject();

		long total = VRVehicleRecordLocalServiceUtil.counData(builder.getCountQuery());
		JSONArray data = VRVehicleRecordLocalServiceUtil.findData(builder.getSelectQuery(),
				builder.getColumnInstances(), builder.getDataTypes(), null, null, start, end);
		result.put("total", total);
		result.put("data", data);
		return result;
	}

	private SQLQueryBuilder getBuilder(LinkedHashMap<String, Object> params) {
		String keyword = ActionUtil.getKeyword(params);
		Long id = null;
		// Long mtCore = null;
		// Long issueId = null;
		// Long issueVehicleCertificateId = null;
		// Long dossierId = null;
		Long applicantProfileId = null;
		// String applicantName = null;
		// String applicantAddress = null;
		// Long certificateId = null;
		String productionNumber = null;
		String productionDate = null;
		String frameNo = null;
		String boxNo = null;
		String engineNo = null;
		String color = null;
		String stampShortNo = null;
		String serialNo = null;
		Long vehicleRecordStatus = null;
		Long printingStatus = null;
		// Long attachedFile = null;
		// String signName = null;
		// String signTitle = null;
		// String signPlace = null;
		// String signDate = null;
		// String modifyDate = null;
		// String syncDate = null;
		String certificaterecordno = null;
		Integer postPrintingStatus = null;
		String qrCode = null;
		String stampIssueNo = null;
		String vehicleclass = null;
		if (params != null) {

			if (params.containsKey("id")) {
				id = (Long) params.get("id");
			}
			/*
			 * if (params.containsKey("mtcore")) { mtCore = (Long)params.get("mtcore"); } if
			 * (params.containsKey("issueid")) { issueId = (Long)params.get("issueid"); } if
			 * (params.containsKey("issuevehiclecertificateid")) { issueVehicleCertificateId
			 * = (Long)params.get("issuevehiclecertificateid"); } if
			 * (params.containsKey("dossierid")) { dossierId =
			 * (Long)params.get("dossierid"); }
			 */
			if (params.containsKey("applicantprofileid")) {
				applicantProfileId = (Long) params.get("applicantprofileid");
			}
			/*
			 * if (params.containsKey("applicantname")) { applicantName =
			 * (String)params.get("applicantname"); } if
			 * (params.containsKey("applicantaddress")) { applicantAddress =
			 * (String)params.get("applicantaddress"); } if
			 * (params.containsKey("certificateid")) { certificateId =
			 * (Long)params.get("certificateid"); }
			 */
			if (params.containsKey("productionnumber")) {
				productionNumber = (String) params.get("productionnumber");
			}
			if (params.containsKey("productiondate")) {
				productionDate = (String) params.get("productiondate");
			}
			if (params.containsKey("frameno")) {
				frameNo = (String) params.get("frameno");
			}
			if (params.containsKey("boxno")) {
				boxNo = (String) params.get("boxno");
			}
			if (params.containsKey("engineno")) {
				engineNo = (String) params.get("engineno");
			}
			if (params.containsKey("color")) {
				color = (String) params.get("color");
			}
			if (params.containsKey("stampshortno")) {
				stampShortNo = (String) params.get("stampshortno");
			}
			if (params.containsKey("serialno")) {
				serialNo = (String) params.get("serialno");
			}
			if (params.containsKey("vehiclerecordstatus")) {
				vehicleRecordStatus = (Long) params.get("vehiclerecordstatus");
			}
			if (params.containsKey("printingstatus")) {
				printingStatus = (Long) params.get("printingstatus");
			}
			/*
			 * if (params.containsKey("attachedfile")) { attachedFile =
			 * (Long)params.get("attachedfile"); } if (params.containsKey("signname")) {
			 * signName = (String)params.get("signname"); } if
			 * (params.containsKey("signtitle")) { signTitle =
			 * (String)params.get("signtitle"); } if (params.containsKey("signplace")) {
			 * signPlace = (String)params.get("signplace"); } if
			 * (params.containsKey("signdate")) { signDate = (String)params.get("signdate");
			 * } if (params.containsKey("modifydate")) { modifyDate =
			 * (String)params.get("modifydate"); } if (params.containsKey("syncdate")) {
			 * syncDate = (String)params.get("syncdate"); }
			 */
			if (params.containsKey("certificaterecordno")) {
				certificaterecordno = (String) params.get("certificaterecordno");
			}
			if (params.containsKey("postprintingstatus")) {
				postPrintingStatus = (Integer) params.get("postprintingstatus");
			}
			if (params.containsKey("qrcode")) {
				qrCode = (String) params.get("qrcode");
			}

			if (params.containsKey("stampissueno")) {
				stampIssueNo = (String) params.get("stampissueno");
			}

			if (params.containsKey("vehicleclass")) {
				vehicleclass = (String) params.get("vehicleclass");
			}
		}
		String _keywordSearchCondition = ActionUtil.buildSQLCondition("applicantName", keyword, "", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantAddress", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionNumber", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("frameNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("boxNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("engineNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("color", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("stampShortNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("serialNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("signName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("signTitle", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("signPlace", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certificaterecordno", keyword, "OR", StringPool.LIKE, "");
		// + ActionUtil.buildSQLCondition("qrCode", keyword, "OR", StringPool.LIKE, "");
		SQLQueryBuilder builder = new SQLQueryBuilder();
		builder.select(VRVehicleRecordModelImpl.class,
				DBField.ins("vr_issue.vehicleclass AS vehicleclass", Types.VARCHAR),
				DBField.ins("vr_issue.stampissueno AS stampissueno", Types.VARCHAR)).from("vr_vehiclerecord")
				.join("INNER JOIN", "vr_vehiclerecord", "issueid", "vr_issue", "id")
				.where("id", id, "AND", StringPool.EQUAL, "vr_vehiclerecord")
				// .where("mtcore", mtCore, "AND", StringPool.EQUAL).where("issueid", issueId,
				// "AND", StringPool.EQUAL)
				// .where("issuevehiclecertificateid", issueVehicleCertificateId, "AND",
				// StringPool.EQUAL)
				// .where("dossierid", dossierId, "AND", StringPool.EQUAL)
				.where("applicantprofileid", applicantProfileId, "AND", StringPool.EQUAL, "vr_vehiclerecord")
				// .where("applicantname", applicantName, "AND", StringPool.EQUAL)
				// .where("applicantaddress", applicantAddress, "AND", StringPool.EQUAL)
				// .where("certificateid", certificateId, "AND", StringPool.EQUAL)
				.where("productionnumber", productionNumber, "AND", StringPool.EQUAL)

				.where("frameno", frameNo, "AND", StringPool.EQUAL).where("boxno", boxNo, "AND", StringPool.EQUAL)
				.where("engineno", engineNo, "AND", StringPool.EQUAL).where("color", color, "AND", StringPool.EQUAL)
				.where("stampshortno", stampShortNo, "AND", StringPool.EQUAL)
				.where("serialno", serialNo, "AND", StringPool.EQUAL)
				.where("vehiclerecordstatus", vehicleRecordStatus, "AND", StringPool.EQUAL)
				.where("printingstatus", printingStatus, "AND", StringPool.EQUAL)
				// .where("attachedfile", attachedFile, "AND", StringPool.EQUAL)
				// .where("signname", signName, "AND", StringPool.EQUAL)
				// .where("signtitle", signTitle, "AND", StringPool.EQUAL)
				// .where("signplace", signPlace, "AND", StringPool.EQUAL)
				// .where("signdate", signDate, "AND", StringPool.EQUAL)
				// .where("modifydate", modifyDate, "AND", StringPool.EQUAL)
				// .where("syncdate", syncDate, "AND", StringPool.EQUAL)
				.where("certificaterecordno", certificaterecordno, "AND", StringPool.EQUAL)
				.where("postprintingstatus", postPrintingStatus, "AND", StringPool.EQUAL)
				.where("qrcode", qrCode, "AND", StringPool.EQUAL).where(_keywordSearchCondition, null, "AND", "", true);

		if (Validator.isNotNull(productionDate)) {
			Date date = DateTimeUtils.convertStringToDate(productionDate, DateTimeUtils._VN_DATE_FORMAT);
			if (date != null) {
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(date);
				calendar.set(Calendar.HOUR_OF_DAY, 0);
				calendar.set(Calendar.MINUTE, 0);
				calendar.set(Calendar.SECOND, 0);
				// 2019-11-28 14:05:34
				String fromDate = DateTimeUtils.convertDateToString(calendar.getTime(),
						DateTimeUtils._MYSQL_TIME_FORMAT);

				calendar.set(Calendar.HOUR_OF_DAY, 23);
				calendar.set(Calendar.MINUTE, 59);
				calendar.set(Calendar.SECOND, 59);

				String toDate = DateTimeUtils.convertDateToString(calendar.getTime(), DateTimeUtils._MYSQL_TIME_FORMAT);

				builder.where("productionDate", "'" + fromDate + "'" + " AND " + "'" + toDate + "'", " AND ",
						"BETWEEN");
			}
		}

		if (Validator.isNotNull(stampIssueNo) || Validator.isNotNull(vehicleclass)) {
			if (Validator.isNotNull(stampIssueNo)) {
				builder.joinwhere("vr_issue.stampissueno", stampIssueNo, " AND ", StringPool.LIKE);
			}

			if (Validator.isNotNull(vehicleclass)) {
				builder.joinwhere("vr_issue.vehicleclass", vehicleclass, " AND ", StringPool.EQUAL);
			}

		}

		return builder.build();
	}

	@Override
	public JSONObject importVRVehicleRecord(User user, ServiceContext serviceContext, InputStream inputStream) {

		try {
			ZipInputStream source = new ZipInputStream(inputStream);
			File destDir = FileUtil.createTempFolder();
			byte[] buffer = new byte[1024];
			ZipEntry ze = source.getNextEntry();
			List<File> files = new ArrayList<File>();
			while (ze != null) {
				File newFile = ActionUtil.newFile(destDir, ze);
				_log.info("newFile ====>>> " + newFile.getAbsolutePath() + "|" + newFile.getName());
				FileOutputStream fos = new FileOutputStream(newFile);
				int len;
				while ((len = source.read(buffer)) > 0) {
					fos.write(buffer, 0, len);
				}
				fos.close();
				files.add(newFile);
				ze = source.getNextEntry();
			}
			source.closeEntry();
			source.close();

			if (!files.isEmpty()) {
				for (File file : files) {
					OPCPackage pkg = OPCPackage.open(file);
					// XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
					XSSFWorkbook workbook = new XSSFWorkbook(pkg);

					XSSFSheet sheet = workbook.getSheetAt(0);
					int count = 0;
					Iterator<Row> rowIterator = sheet.iterator();
					while (rowIterator.hasNext()) {
						Row row = rowIterator.next();
						if (count >= 3) {
							Iterator<Cell> cellIterator = row.cellIterator();
							int colCount = 0;
							VRVehicleRecord vrVehicleRecord = new VRVehicleRecordImpl();
							while (cellIterator.hasNext()) {

								Cell cell = cellIterator.next();
								DataFormatter formatter = new DataFormatter();
								System.out.println(formatter.formatCellValue(cell) + "|" + colCount);
								switch (colCount) {
								case 1:
									vrVehicleRecord.setCertificaterecordno(formatter.formatCellValue(cell));
									break;
								case 2:
									vrVehicleRecord.setFrameNo(formatter.formatCellValue(cell));
									break;
								case 3:
									vrVehicleRecord.setEngineNo(formatter.formatCellValue(cell));
									break;
								case 4:
									vrVehicleRecord.setColor(formatter.formatCellValue(cell));
									break;
								default:
									break;
								}
								colCount++;
							}

							VRVehicleRecordLocalServiceUtil.createVRVehicleRecord(vrVehicleRecord);

						}

						count++;
					}
				}

			}

		} catch (Exception e) {
			_log.error(e);
		}

		return null;
	}

	@Override
	public JSONObject updateVRVehicleRecord(VRVehicleRecord object) {
		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		if (object.getId() <= 0) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}

		try {

			object = VRVehicleRecordLocalServiceUtil.updateVRVehicleRecord(object);

			JSONObject result = ActionUtil.object2Json(object, VRProductionPlantEquipmentModelImpl.class,
					StringPool.BLANK);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, result);

		} catch (Exception e) {
			_log.error(e);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}
	}

	@Override
	public JSONObject findVRVehicleRecordPrintDetails(long vehicleRecordId, User user, ServiceContext serviceContext)
			throws JSONException {

		JSONObject result = JSONFactoryUtil.createJSONObject();
		VRVehicleRecord vrVehicleRecord = VRVehicleRecordLocalServiceUtil.fetchVRVehicleRecord(vehicleRecordId);
		JSONObject jVRVehicleRecord = BusinessUtil.object2Json_originColumnName(vrVehicleRecord,
				VRVehicleRecordModelImpl.class, StringPool.BLANK);
		
		long vehicleTypeCertificateId = vrVehicleRecord.getCertificateId();
		VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
				.fetchVRVehicleTypeCertificate(vehicleTypeCertificateId);
		JSONObject jVRVehicleTypeCertificate = BusinessUtil.object2Json_originColumnName(vrVehicleTypeCertificate,
				VRVehicleTypeCertificateModelImpl.class, StringPool.BLANK);
		
		List<VRVehicleSpecification> vrVehicleSpecifications = VRVehicleSpecificationLocalServiceUtil
				.findByVehicleCertificateId(vehicleTypeCertificateId);
		JSONObject jVRVehicleSpecification = JSONFactoryUtil.createJSONObject();
		jVRVehicleSpecification.put("dossierId", vrVehicleTypeCertificate.getDossierId());
		jVRVehicleSpecification.put("vehicleCertificateId", vehicleTypeCertificateId);
		vrVehicleSpecifications.parallelStream().forEach(vrVehicleSpecification -> {
			String specificationCode = vrVehicleSpecification.getSpecificationCode();
			String specificationValue = vrVehicleSpecification.getSpecificationValue();
			jVRVehicleSpecification.put(specificationCode, specificationValue);
		});
		
		result.put("vrVehicleRecord", jVRVehicleRecord);
		result.put("vrVehicleTypeCertificate", jVRVehicleTypeCertificate);
		result.put("vrVehicleSpecification", jVRVehicleSpecification);
		
		return result;
	}

	@Override
	public JSONObject updateStatusAfterPrint(long vehicleRecordId, User user, ServiceContext serviceContext) throws SystemException, PortalException {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		VRVehicleRecord vrVehicleRecord = VRVehicleRecordLocalServiceUtil.updateVRVehicleRecord(vehicleRecordId, VRKeys.DA_IN, VRKeys.BINH_THUONG);
		result = BusinessUtil.object2Json_originColumnName(vrVehicleRecord, VRVehicleRecordModelImpl.class, StringPool.BLANK);
		return result;
	}

}
