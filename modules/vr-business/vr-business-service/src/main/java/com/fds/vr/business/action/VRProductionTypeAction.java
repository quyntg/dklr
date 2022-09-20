package com.fds.vr.business.action;

import com.fds.vr.business.model.VRProductType;
import com.liferay.portal.kernel.json.JSONArray;

import java.util.List;

/**
 * @author trungnt
 *
 */
public interface VRProductionTypeAction {
	public JSONArray findProductType(String productionPlantCode, String productClassificationCode);

	public List<VRProductType> adminProcessData(JSONArray arrayData, String productionPlantCode);
}
