package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRRPDossierStatisticsAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.model.VRRPDossierStatistics;
import com.fds.vr.business.model.impl.VRRPDossierStatisticsModelImpl;
import com.fds.vr.business.service.VRRPDossierStatisticsLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.StringPool;

public class VRRPDossierStatisticsActionImpl implements VRRPDossierStatisticsAction {

	@Override
	public JSONObject findBydossierIdCTN(String dossierIdCTN) throws JSONException {
		VRRPDossierStatistics vrrpDossierStatistics = VRRPDossierStatisticsLocalServiceUtil
				.findBydossierIdCTN(dossierIdCTN);

		return ActionUtil.object2Json(vrrpDossierStatistics, VRRPDossierStatisticsModelImpl.class, StringPool.BLANK);
	}

}
