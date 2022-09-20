package com.fds.vr.business.action;

import com.fds.vr.business.model.VRApplicantProfile;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.LinkedHashMap;

/**
 * @author trungnt
 *
 */
public interface VRApplicantProfileAction {
	public JSONObject findVRApplicantProfile(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);

	public JSONObject findVRApplicantProfileDetail(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);

	public VRApplicantProfile adminProcessData(JSONObject objectData, long mtCore, String applicantCode,
			String postStatus, ServiceContext serviceContext) throws Exception;

	public long countVrApplicantProfile(User user, ServiceContext serviceContext, LinkedHashMap<String, Object> params);

	public void indexing(VRApplicantProfile vrApplicantProfile, Company company);
	
	public JSONObject findByApplicantCode(User user, ServiceContext serviceContext, String applicantCode);
}
