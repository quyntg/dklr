package com.fds.vr.business.action;

import com.fds.vr.business.model.VRProductionPlantEquipment;
import com.fds.vr.business.model.VRProductionPlantEquipmentMarkup;
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
public interface VRProductionPlantEquipmentAction {
	public JSONArray findByProductionPlanCode_ProductClassificationCode(String productionPlantCode,
			String productClassificationCode);

	public JSONObject createVRProductionPlantEquiptment(VRProductionPlantEquipment object);

	public JSONObject deleteVRProductionPlantEquiptment(long id);

	public JSONObject findVRProductionPlantEquipment(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);

	public JSONObject updateVRProductionPlantEquiptment(VRProductionPlantEquipment object,
			List<VRProductionPlantEquipmentMarkup> vrProductionPlantEquipmentMarkups);

	public List<VRProductionPlantEquipment> adminProcessData(JSONArray arrayData, String productionPlantCode);

}
