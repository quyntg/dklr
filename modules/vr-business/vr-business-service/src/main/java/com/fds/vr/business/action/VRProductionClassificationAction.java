package com.fds.vr.business.action;

import com.fds.vr.business.model.VRProductionClassification;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author trungnt
 *
 */
public interface VRProductionClassificationAction {

	public JSONObject createVRProductionClassification(VRProductionClassification object);

	public JSONArray findVRProductionClassification(String productionPlantCode);

	public JSONObject findVRProductionClassification(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);

	public JSONObject updateVRProductionClassification(VRProductionClassification object);

	public List<VRProductionClassification> adminProcessData(JSONArray arrayData, String productionPlantCode);
}
