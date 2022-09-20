/**
 * 
 */
package com.fds.vr.business.action;

import com.liferay.portal.kernel.json.JSONObject;

/**
 * @author ddung
 *
 */
public interface VRMigrateMappingsAction {
	public JSONObject findByTaskId_DataGroupId_SeqNo(int taskMigrationID, int dataGroupId, int seqNo, int start,
			int end);
}
