/**
 * 
 */
package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRMigrateReviewAction;
import com.fds.vr.business.model.VRMigrateReview;
import com.fds.vr.business.model.impl.VRMigrateReviewModelImpl;
import com.fds.vr.business.service.VRMigrateReviewLocalServiceUtil;
import com.fds.vr.service.util.BusinessUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.StringPool;

import java.util.List;

/**
 * @author ddung
 *
 */
public class VRMigrateReviewActionImpl implements VRMigrateReviewAction {

	@Override
	public JSONObject findByTaskMigrateId(int taskMigrationID, int start, int end) {
		List<VRMigrateReview> vrMigrateReviews = VRMigrateReviewLocalServiceUtil.findByTaskMigrateId(taskMigrationID,
				start, end);
		JSONArray array = JSONFactoryUtil.createJSONArray();
		vrMigrateReviews.parallelStream().forEach(el -> {
			try {
				JSONObject obj = BusinessUtil.object2Json_originColumnName(el, VRMigrateReviewModelImpl.class,
						StringPool.BLANK);
				array.put(obj);
			} catch (Exception e) {
			}
		});
		JSONObject result = JSONFactoryUtil.createJSONObject();
		result.put("data", array);
		result.put("total", vrMigrateReviews.size());

		return result;
	}

}
