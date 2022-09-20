package com.fds.vr.business.action;

import com.fds.vr.business.model.VRProductionPlantSupplier;
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
public interface VRProductionPlantSupplierAction {
	public JSONObject findVRProductionPlantSupplier(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);

	public List<VRProductionPlantSupplier> adminProcessData(JSONArray arrayData, String productionPlantCode);
}
