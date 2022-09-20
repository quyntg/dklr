/**
 * 
 */
package com.fds.vr.business.action;

import com.liferay.portal.kernel.json.JSONObject;

/**
 * @author ddung
 *
 */
public interface VRMigrateReviewAction {
	public JSONObject findByTaskMigrateId(int taskMigrationID, int start, int end);
}
