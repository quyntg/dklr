/**
 * 
 */
package com.fds.vr.business.action;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

/**
 * @author ddung
 *
 */
public interface VRInputStampbookAction {

	public JSONObject findInputStampbookInventorys(User user, ServiceContext serviceContext, String vehicleClass,
			String stampType, int start, int end);
}
