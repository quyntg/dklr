/**
 * 
 */
package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRHistoryProfileAction;
import com.fds.vr.business.model.VRHistoryProfile;
import com.fds.vr.business.model.impl.VRHistoryProfileModelImpl;
import com.fds.vr.business.service.VRHistoryProfileLocalServiceUtil;
import com.fds.vr.service.util.BusinessUtil;
import com.fds.vr.service.util.FileUploadUtils;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @author ddung
 *
 */
public class VRHistoryProfileActionImpl implements VRHistoryProfileAction {

	private static final Log _log = LogFactoryUtil.getLog(VRHistoryProfileActionImpl.class);

	@Override
	public VRHistoryProfile updateVRHistoryProfile(long id, String applicantCode, String productionPlantCode,
			long dossierId, String dossierIdCTN, String dossierNo, String contentType, String contentFileTemplate,
			long jsonFileEntryId, long pdfFileEntryId, Date syncDate, ServiceContext serviceContext)
			throws IOException {
		return VRHistoryProfileLocalServiceUtil.updateVRHistoryProfile(dossierId, applicantCode, productionPlantCode,
				dossierId, dossierIdCTN, dossierNo, contentType, contentFileTemplate, jsonFileEntryId, pdfFileEntryId,
				syncDate, serviceContext);
	}

	@Override
	public JSONObject findVRHistoryProfileApplicantCode(String applicantCode, int start, int end,
			ServiceContext serviceContext) {
		List<VRHistoryProfile> vrHistoryProfiles = VRHistoryProfileLocalServiceUtil.findByApplicantCode(applicantCode,
				start, end);
		return getResult(vrHistoryProfiles);
	}

	@Override
	public JSONObject findVRHitoryProfiles(String applicantCode, String productionPlantCode, long dossierId,
			String dossierIdCTN, String dossierNo, String contentType, String contentFileTemplate, int start, int end) {
		List<VRHistoryProfile> vrHistoryProfiles = VRHistoryProfileLocalServiceUtil.findVRHitoryProfiles(applicantCode,
				productionPlantCode, dossierId, dossierIdCTN, dossierNo, contentType, contentFileTemplate, start, end);
		return getResult(vrHistoryProfiles);
	}

	private JSONObject getResult(List<VRHistoryProfile> vrHistoryProfiles) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		JSONArray array = JSONFactoryUtil.createJSONArray();
		for (VRHistoryProfile vrHistoryProfile : vrHistoryProfiles) {
			try {
				JSONObject obj = BusinessUtil.object2Json_originColumnName(vrHistoryProfile,
						VRHistoryProfileModelImpl.class, StringPool.BLANK);
				if (Validator.isNotNull(obj) && obj.getLong("contentjsonFileEntryId") > 0) {
					File file = FileUploadUtils.getFile(obj.getLong("contentjsonFileEntryId"));
					if (file != null) {
						String stringFile = FileUploadUtils.fileToString(file);
						obj.put("contentjsonFileEntryId", stringFile);
					}
				}
				
				array.put(obj);
			} catch (Exception e) {
				_log.error(e);
			}
		}
		result.put("total", vrHistoryProfiles.size());
		result.put("data", array);
		return result;
	}

}
