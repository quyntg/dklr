package com.fds.vr.business.action;

import com.fds.vr.business.model.VRProductionPlantEmployee;
import com.liferay.portal.kernel.json.JSONArray;

import java.util.List;

/**
 * @author trungnt
 *
 */
public interface VRProductionPlantEmployeeAction {
	public JSONArray findVRProductionPlantEmployee(String productionPlantCode);

	public List<VRProductionPlantEmployee> adminProcessData(JSONArray arrayData, String productionPlantCode);
}
