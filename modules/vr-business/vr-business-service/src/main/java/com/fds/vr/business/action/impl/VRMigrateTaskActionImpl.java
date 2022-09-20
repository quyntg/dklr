/**
 * 
 */
package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRMigrateTaskAction;
import com.fds.vr.business.model.VRMigrateTask;
import com.fds.vr.business.model.impl.VRMigrateTaskModelImpl;
import com.fds.vr.business.service.VRMigrateTaskLocalServiceUtil;
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
public class VRMigrateTaskActionImpl implements VRMigrateTaskAction {

	@Override
	public JSONObject findVRMigrateTasks(int start, int end) {
		List<VRMigrateTask> vrMigrateTasks = VRMigrateTaskLocalServiceUtil.findVRMigrateTasks(start, end);
		JSONArray array = JSONFactoryUtil.createJSONArray();
		vrMigrateTasks.parallelStream().forEach(el -> {
			try {
				JSONObject obj = BusinessUtil.object2Json_originColumnName(el, VRMigrateTaskModelImpl.class,
						StringPool.BLANK);
				array.put(obj);
			} catch (Exception e) {
			}
		});
		JSONObject result = JSONFactoryUtil.createJSONObject();
		result.put("data", array);
		result.put("total", vrMigrateTasks.size());

		return result;
	}

}
