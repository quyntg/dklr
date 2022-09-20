/**
 * 
 */
package com.fds.vr.business.report;

import com.fds.vr.business.constant.VRKeys;
import com.fds.vr.business.model.VRReportCategory;
import com.fds.vr.business.service.VRRPDossierStatisticsLocalServiceUtil;
import com.fds.vr.business.service.VRReportCategoryLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author ddung
 *
 */
public class ReportBusinessImpl {

	private static final Log _log = LogFactoryUtil.getLog(ReportBusinessImpl.class);
	
	public static JSONObject report(String rptDescription, String params) throws JSONException, IOException {
		
		JSONObject jParams = JSONFactoryUtil.createJSONObject(params.trim());
		JSONObject result = JSONFactoryUtil.createJSONObject();
		
		JSONArray array = JSONFactoryUtil.createJSONArray();
		
		if(rptDescription.equals(VRKeys.BAO_CAO_HS_TDTK_CHUA_HOAN_THIEN)) {
			String sampleQuery = "SELECT dos.dossierno, dos.applicantName AS 'Co_so_thiet_ke', dos.certifiedvehicletypedescription AS 'Loai_phuong_tien', dos.certifiedtrademarkname AS 'Nhan_hieu', dos.certifiedcommercialname AS 'Ten_thuong_mai', dos.certifiedmodelcode AS 'Ma_kieu_loai', cer.designsymbol AS 'Ky_hieu_thiet_ke', cer.verificationCertificateNo As'So_GCN', cer.verificationCertificateDate As 'Ngay_ky_GCN', dos.dossiersubmittingdate AS 'Ngay_tiep_nhan', dos.dossierfirstupdatingdate AS 'Ngay_YCBS_lan_dau', dos.dossierfirstassignmentdate 'Ngay_phan_cong', dos.dossierfirstreviewdate AS 'Ngay_chuyen_to_truong', inspectorcode AS 'Ma', inspectorname AS 'Ngay_chuyen_to_truong', FROM vr_rp_dossierstatistics dos LEFT JOIN vr_vehicletypecertificate cer ON dos.dossierno = cer.dossierNo LEFT JOIN vr_technicalspec_xcg tec ON dos.dossierno = tec.dossierNo WHERE 1=1";
			
			StringBuilder sqlQuery = new StringBuilder();
			
			sqlQuery.append(sampleQuery);
			if(jParams.has("module") && !jParams.getString("module").equals(StringPool.BLANK)) {
				sqlQuery.append(" AND cer.module = '" + jParams.getString("module") + "'");
			}
			if(jParams.has("applicantName") && !jParams.getString("applicantName").equals(StringPool.BLANK)) {
				sqlQuery.append(" AND dos.applicantName like '%" + jParams.getString("applicantName") + "%'");
			}
			if(jParams.has("applicantNo") && !jParams.getString("applicantNo").equals(StringPool.BLANK)) {
				sqlQuery.append(" AND dos.applicantNo = '" + jParams.getString("applicantNo") + "'");
			}
			if(jParams.has("certifiedvehicletypedescription") && !jParams.getString("certifiedvehicletypedescription").equals(StringPool.BLANK)) {
				sqlQuery.append(" AND cer.certifiedvehicletypedescription like '%" + jParams.getString("certifiedvehicletypedescription") + "%'");
			}
			if(jParams.has("certifiedvehicletype") && !jParams.getString("certifiedvehicletype").equals(StringPool.BLANK)) {
				sqlQuery.append(" AND cer.certifiedvehicletype = '" + jParams.getString("certifiedvehicletype") + "'");
			}
			if(jParams.has("certifiedtrademarkname") && !jParams.getString("certifiedtrademarkname").equals(StringPool.BLANK)) {
				sqlQuery.append(" AND cer.certifiedtrademarkname like '%" + jParams.getString("certifiedtrademarkname") + "%'");
			}
			if(jParams.has("certifiedtrademark") && !jParams.getString("certifiedtrademark").equals(StringPool.BLANK)) {
				sqlQuery.append(" AND cer.certifiedtrademark = '" + jParams.getString("certifiedtrademark") + "'");
			}
			if(jParams.has("dossiersubmittingdate") && !jParams.getString("dossiersubmittingdate").equals(StringPool.BLANK)) {
				sqlQuery.append(" AND (dos.dossiersubmittingdate >= '" + jParams.getString("dossiersubmittingdate") + " 00:00:00' AND dos.dossiersubmittingdate <= '" + jParams.getString("dossiersubmittingdate") + " 23:59:59')");
			}
			if(jParams.has("dossierfirstupdatingdate") && !jParams.getString("dossierfirstupdatingdate").equals(StringPool.BLANK)) {
				sqlQuery.append(" AND (dos.dossierfirstupdatingdate >= '" + jParams.getString("dossierfirstupdatingdate") + " 00:00:00' AND dos.dossierfirstupdatingdate <= '" + jParams.getString("dossierfirstupdatingdate") + " 23:59:59')");
			}
			if(jParams.has("dossierfirstassignmentdate") && !jParams.getString("dossierfirstassignmentdate").equals(StringPool.BLANK)) {
				sqlQuery.append(" AND (dos.dossierfirstassignmentdate >= '" + jParams.getString("dossierfirstassignmentdate") + " 00:00:00' AND dos.dossierfirstassignmentdate <= '" + jParams.getString("dossierfirstassignmentdate") + " 23:59:59')");
			}
			if(jParams.has("dossierfirstreviewdate") && !jParams.getString("dossierfirstreviewdate").equals(StringPool.BLANK)) {
				sqlQuery.append(" AND (dos.dossierfirstreviewdate >= '" + jParams.getString("dossierfirstreviewdate") + " 00:00:00' AND dos.dossierfirstreviewdate <= '" + jParams.getString("dossierfirstreviewdate") + " 23:59:59')");
			}
			sqlQuery.append(" ORDER BY dos.dossiersubmittingdate, cer.verificationCertificateDate");
			
			array = getData(sqlQuery.toString());
		}
		VRReportCategory vrReportCategory = VRReportCategoryLocalServiceUtil.findByRptDescription(rptDescription);

		result.put("primaryKey", vrReportCategory.getPrimaryKey());
		result.put("formData", array);
		result.put("formReport", vrReportCategory.getJasperFileTemplate());
		return result;
	}

	public static JSONArray getData(String sqlQuery) {

		Iterator<Object[]> data = VRRPDossierStatisticsLocalServiceUtil.findDataReport(sqlQuery);

		List<String> fields = getFields(sqlQuery);
		JSONArray array = JSONFactoryUtil.createJSONArray();
		if (data.hasNext()) {
			while (data.hasNext()) {
				Object[] objects = data.next();
				JSONObject obj = JSONFactoryUtil.createJSONObject();
				for (int i = 0; i < fields.size() - 1; i++) {
					obj.put(fields.get(i), !String.valueOf(objects[i]).equals("null") ? String.valueOf(objects[i]) : StringPool.BLANK);
				}
				array.put(obj);
			}
		}
		
		return array;
	}

	private static List<String> getFields(String sqlQuery) {
		String[] normalizeStr = sqlQuery.toLowerCase().replace("select", StringPool.BLANK)
				.substring(0, sqlQuery.toLowerCase().replace("select", StringPool.BLANK).trim().indexOf("from")).trim()
				.split(",");
		Stream<String> stream = Arrays.stream(normalizeStr);
		List<String> keys = new ArrayList<String>();
		stream.map(String::trim).forEach(key -> {
			String[] temp = key.split("\\.");
			if (temp.length >= 2) {
				keys.add(temp[1]);
			} else {
				keys.add(temp[0]);
			}
		});
		return keys;
	}
}
