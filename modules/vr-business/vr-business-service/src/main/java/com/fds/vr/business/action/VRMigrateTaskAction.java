/**
 * 
 */
package com.fds.vr.business.action;

import com.liferay.portal.kernel.json.JSONObject;

/**
 * @author ddung
 *
 */
public interface VRMigrateTaskAction {
	public JSONObject findVRMigrateTasks(int start, int end);
}
