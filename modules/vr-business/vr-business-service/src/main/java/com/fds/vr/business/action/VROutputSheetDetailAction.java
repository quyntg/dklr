package com.fds.vr.business.action;

import com.fds.vr.business.model.VROutputSheetDetails;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.LinkedHashMap;

/**
 * @author trungnt
 *
 */
public interface VROutputSheetDetailAction {
	public JSONObject findVROutputSheetDetails(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);

	public JSONObject createVROutputSheetDetail(VROutputSheetDetails object);
	
	public JSONObject getVROutputSheetDetail(long id);
	
	public JSONObject deleteVROutputSheetDetails(long id);
	
	public JSONObject updateVROutputSheetDetails(VROutputSheetDetails object);
}
