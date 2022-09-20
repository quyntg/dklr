/**
 * 
 */
package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRInputStampbookAction;
import com.fds.vr.business.model.VRInputStampbook;
import com.fds.vr.business.model.impl.VRInputStampbookModelImpl;
import com.fds.vr.business.service.VRInputStampbookLocalServiceUtil;
import com.fds.vr.service.util.BusinessUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringPool;

import java.util.List;

/**
 * @author ddung
 *
 */
public class VRInputStampbookActionImpl implements VRInputStampbookAction {

	@Override
	public JSONObject findInputStampbookInventorys(User user, ServiceContext serviceContext, String vehicleClass,
			String stampType, int start, int end) {
		List<VRInputStampbook> vrInputStampbooks = VRInputStampbookLocalServiceUtil
				.findByVRInputStampBookInventorys(vehicleClass, stampType, start, end);
		JSONObject result = JSONFactoryUtil.createJSONObject();
		JSONArray array = JSONFactoryUtil.createJSONArray();
		for (VRInputStampbook vrInputStampbook : vrInputStampbooks) {
			try {
				JSONObject obj = BusinessUtil.object2Json_originColumnName(vrInputStampbook,
						VRInputStampbookModelImpl.class, StringPool.BLANK);
				array.put(obj);
			} catch (JSONException e) {
			}
		}
		result.put("data", array);
		result.put("total", vrInputStampbooks.size());
		return result;
	}

}
