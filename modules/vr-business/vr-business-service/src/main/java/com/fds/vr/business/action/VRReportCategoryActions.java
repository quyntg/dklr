/**
 * 
 */
package com.fds.vr.business.action;

import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONObject;

/**
 * @author ddung
 *
 */
public interface VRReportCategoryActions {

	public JSONObject findByRptCode(String rptCode) throws JSONException;

	public JSONObject findByRptDescription(String rptDescription) throws JSONException;

	public JSONObject findByRptGroup(String rptGroup, int start, int end);

	public JSONObject findByRptLevel(int rptLevel, int start, int end);
}
