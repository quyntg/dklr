package com.fds.vr.business.action;

import com.fds.vr.business.model.VROutputSheet;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.LinkedHashMap;

/**
 * @author trungnt
 *
 */
public interface VROutputSheetAction {
	public JSONObject findVROutputSheet(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);

	public JSONObject createVROutputSheet(VROutputSheet object);
	
	public JSONObject deleteVROutputSheet(long id);
	
	public JSONObject updateVROutputSheet(VROutputSheet object);
	
	public void indexing(VROutputSheet vrOutputSheet, Company company) throws SystemException, PortalException;
}
