package com.fds.vr.business.action;

import com.fds.vr.business.model.VRIssue;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.File;
import java.util.LinkedHashMap;

/**
 * @author trungnt
 *
 */
public interface VRIssueAction {
	public long countVRIssue(User user, ServiceContext serviceContext, LinkedHashMap<String, Object> params);

	public JSONObject createVRIssue(VRIssue object);

	public JSONObject deleteVRIssue(long id);

	public File doExportVRIssue(User user, ServiceContext serviceContext, LinkedHashMap<String, Object> params,
			String headercodes, String headerlabels);

	public JSONObject findVRIssue(User user, ServiceContext serviceContext, LinkedHashMap<String, Object> params);

	public JSONObject updateVRIssue(VRIssue object);

	public void indexing(VRIssue vrIssue, Company company) throws SystemException, PortalException;

	public JSONObject findByPrimaryKey(User user, ServiceContext serviceContext, long issueId);
}
