/**
 * 
 */
package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRReportCategoryActions;
import com.fds.vr.business.model.VRReportCategory;
import com.fds.vr.business.model.impl.VRReportCategoryModelImpl;
import com.fds.vr.business.service.VRReportCategoryLocalServiceUtil;
import com.fds.vr.service.util.BusinessUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.StringPool;

import java.util.List;

/**
 * @author ddung
 *
 */
public class VRReportCategoryActionsImpl implements VRReportCategoryActions {

	@Override
	public JSONObject findByRptCode(String rptCode) throws JSONException {

		JSONObject result = JSONFactoryUtil.createJSONObject();
		VRReportCategory vrReportCategory = VRReportCategoryLocalServiceUtil.findByRptCode(rptCode);
		result = BusinessUtil.object2Json_originColumnName(vrReportCategory, VRReportCategoryModelImpl.class,
				StringPool.BLANK);
		return result;
	}

	@Override
	public JSONObject findByRptDescription(String rptDescription) throws JSONException {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		VRReportCategory vrReportCategory = VRReportCategoryLocalServiceUtil.findByRptDescription(rptDescription);
		result = BusinessUtil.object2Json_originColumnName(vrReportCategory, VRReportCategoryModelImpl.class,
				StringPool.BLANK);
		return result;
	}

	@Override
	public JSONObject findByRptGroup(String rptGroup, int start, int end) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		List<VRReportCategory> vrReportCategories = VRReportCategoryLocalServiceUtil.findByRptGroup(rptGroup, start,
				end);
		JSONArray array = JSONFactoryUtil.createJSONArray();
		vrReportCategories.parallelStream().forEach(vrReportCategory -> {
			try {
				JSONObject obj = BusinessUtil.object2Json_originColumnName(vrReportCategory,
						VRReportCategoryModelImpl.class, StringPool.BLANK);
				array.put(obj);
			} catch (Exception e) {
			}
		});
		result.put("data", array);
		result.put("total", VRReportCategoryLocalServiceUtil.findByRptGroup(rptGroup, -1, -1).size());

		return result;
	}

	@Override
	public JSONObject findByRptLevel(int rptLevel, int start, int end) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		List<VRReportCategory> vrReportCategories = VRReportCategoryLocalServiceUtil.findByRptLevel(rptLevel, start,
				end);
		JSONArray array = JSONFactoryUtil.createJSONArray();
		vrReportCategories.parallelStream().forEach(vrReportCategory -> {
			try {
				JSONObject obj = BusinessUtil.object2Json_originColumnName(vrReportCategory,
						VRReportCategoryModelImpl.class, StringPool.BLANK);
				array.put(obj);
			} catch (Exception e) {
			}
		});
		result.put("data", array);
		result.put("total", VRReportCategoryLocalServiceUtil.findByRptLevel(rptLevel, -1, -1).size());

		return result;
	}

}
