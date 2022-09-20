/**
 * 
 */
package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRMigrateMappingsAction;
import com.fds.vr.business.model.VRMigrateMappings;
import com.fds.vr.business.model.impl.VRMigrateMappingsModelImpl;
import com.fds.vr.business.service.VRMigrateMappingsLocalServiceUtil;
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
public class VRMigrateMappingsActionImpl implements VRMigrateMappingsAction {

	@Override
	public JSONObject findByTaskId_DataGroupId_SeqNo(int taskMigrationID, int dataGroupId, int seqNo, int start,
			int end) {
		List<VRMigrateMappings> vrMigrateMappings = VRMigrateMappingsLocalServiceUtil
				.findByTaskId_DataGroupId_SeqNo(taskMigrationID, dataGroupId, seqNo, start, end);
		JSONArray array = JSONFactoryUtil.createJSONArray();
		vrMigrateMappings.parallelStream().forEach(el -> {
			try {
				JSONObject obj = BusinessUtil.object2Json_originColumnName(el, VRMigrateMappingsModelImpl.class,
						StringPool.BLANK);
				array.put(obj);
			} catch (Exception e) {
			}
		});
		JSONObject result = JSONFactoryUtil.createJSONObject();
		result.put("data", array);
		result.put("total", vrMigrateMappings.size());

		return result;
	}

}
