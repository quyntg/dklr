package com.fds.vr.business.action;

import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONObject;

public interface VRRPDossierStatisticsAction {
	public JSONObject findBydossierIdCTN(String dossierIdCTN) throws JSONException;
}
