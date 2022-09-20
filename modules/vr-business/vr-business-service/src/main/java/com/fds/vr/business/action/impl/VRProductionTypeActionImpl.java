package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRProductionTypeAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.model.VRProductType;
import com.fds.vr.business.model.impl.VRProductTypeImpl;
import com.fds.vr.business.service.VRProductTypeLocalServiceUtil;
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
public class VRProductionTypeActionImpl implements VRProductionTypeAction {
	private Log _log = LogFactoryUtil.getLog(VRProductionTypeActionImpl.class);

	@Override
	public JSONArray findProductType(String productionPlantCode, String productClassificationCode) {
		JSONArray result = JSONFactoryUtil.createJSONArray();
		try {
			List<VRProductType> vrProductTypes = VRProductTypeLocalServiceUtil
					.findByProductionPlantCode_ProductClassificationCode(productionPlantCode,
							productClassificationCode);

			for (VRProductType vrProductType : vrProductTypes) {

				result.put(ActionUtil.object2Json(vrProductType, VRProductTypeImpl.class, StringPool.BLANK));
			}
		} catch (Exception e) {
			_log.error(e);
		}
		return result;
	}

	@Override
	public List<VRProductType> adminProcessData(JSONArray arrayData, String productionPlantCode) {
		return VRProductTypeLocalServiceUtil.adminProcessData(arrayData, productionPlantCode);
	}

}
