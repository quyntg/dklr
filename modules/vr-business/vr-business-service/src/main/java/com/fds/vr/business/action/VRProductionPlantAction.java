package com.fds.vr.business.action;

import com.fds.vr.business.model.VRProductType;
import com.fds.vr.business.model.VRProductionPlant;
import com.fds.vr.business.model.VRProductionPlantEmployee;
import com.fds.vr.business.model.VRProductionPlantProdEquipment;
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
public interface VRProductionPlantAction {

	public JSONObject createVRProductionPlant(VRProductionPlant object);

	public JSONObject createVRProductionPlantEmployee(VRProductionPlantEmployee object);

	public JSONObject createVRProductType(VRProductType object);

	public JSONObject findVRProductionPlant(long id);

	public JSONObject findVRProductionPlant(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);
	
	public long countVRProductionPlant(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);

	public JSONObject updateVRProductionPlant(VRProductionPlant object);

	public JSONObject updateVRProductionPlantEmployee(VRProductionPlantEmployee object);

	public JSONObject updateVRProductionPlantProdEquipment(VRProductionPlantProdEquipment object);

	public JSONObject updateVRProductType(VRProductType object);

	public VRProductionPlant adminProcessData(JSONObject objectData, long mtCore, long applicantProfileId,
			String productionPlantCode);
	
	public List<VRProductionPlant> adminProcessData(JSONArray arrayData) throws Exception;
	
	public JSONObject getVRProductionPlant(String productionplantcode, ServiceContext serviceContext);

}
