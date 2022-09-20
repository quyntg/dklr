package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRProductionPlantEmployeeAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.model.VRProductionPlantEmployee;
import com.fds.vr.business.model.impl.VRProductionPlantEmployeeImpl;
import com.fds.vr.business.service.VRProductionPlantEmployeeLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.util.List;

/**
 * @author trungnt
 *
 */
public class VRProductionPlantEmployeeActionImpl implements VRProductionPlantEmployeeAction {
	private Log _log = LogFactoryUtil.getLog(VRProductionPlantEmployeeActionImpl.class);

	@Override
	public JSONArray findVRProductionPlantEmployee(String productionPlantCode) {
		JSONArray result = JSONFactoryUtil.createJSONArray();
		try {
			List<VRProductionPlantEmployee> vrProductionPlantEmployees = VRProductionPlantEmployeeLocalServiceUtil
					.findByProductionPlanCode(productionPlantCode);

			for (VRProductionPlantEmployee vrProductionPlantEmployee : vrProductionPlantEmployees) {

				result.put(ActionUtil.object2Json(vrProductionPlantEmployee, VRProductionPlantEmployeeImpl.class,
						StringPool.BLANK));
			}
		} catch (Exception e) {
			_log.error(e);
		}
		return result;
	}

	@Override
	public List<VRProductionPlantEmployee> adminProcessData(JSONArray arrayData, String productionPlantCode) {
		return VRProductionPlantEmployeeLocalServiceUtil.adminProcessData(arrayData, productionPlantCode);
	}
}
