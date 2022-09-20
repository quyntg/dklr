/**
 * 
 */
package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRTrackchangesAction;
import com.fds.vr.business.model.VRTrackchanges;
import com.fds.vr.business.model.impl.VRTrackchangesModelImpl;
import com.fds.vr.business.service.VRTrackchangesLocalServiceUtil;
import com.fds.vr.service.util.BusinessUtil;
import com.fds.vr.service.util.FileUploadUtils;
import com.liferay.portal.kernel.json.JSONException;
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

/**
 * @author ddung
 *
 */
public class VRTrackchangesActionImpl implements VRTrackchangesAction {

	private static final Log _log = LogFactoryUtil.getLog(VRTrackchangesActionImpl.class);

	@Override
	public VRTrackchanges updateVRTrackchanges(long id, String applicantCode, String productionPlantCode,
			long dossierId, String dossierIdCTN, String dossierNo, String contentType, String contentFileTemplate,
			long fileEntryId, Date syncDate, ServiceContext serviceContext) throws IOException {

		return VRTrackchangesLocalServiceUtil.updateVRTrackchanges(id, applicantCode, productionPlantCode, dossierId,
				dossierIdCTN, dossierNo, contentType, contentFileTemplate, fileEntryId, syncDate, serviceContext);
	}

	@Override
	public JSONObject findByApplicantCode(String applicantCode, ServiceContext serviceContext) {
		VRTrackchanges vrTrackchanges = VRTrackchangesLocalServiceUtil.findByApplicantCode(applicantCode);
		return getResult(vrTrackchanges);
	}

	@Override
	public JSONObject findByProductionPlantCode(String productionPlantCode, ServiceContext serviceContext) {
		VRTrackchanges vrTrackchanges = VRTrackchangesLocalServiceUtil.findByProductionPlantCode(productionPlantCode);
		return getResult(vrTrackchanges);
	}

	@Override
	public JSONObject findByDossierIdOrDossierIdCTN(String dossierIdCTN, long dossierId, String contentFileTemplate,
			ServiceContext serviceContext) {
		VRTrackchanges vrTrackchanges = null;
		if (dossierId > 0) {
			vrTrackchanges = VRTrackchangesLocalServiceUtil.findByDossierId_ContentFileTemplate(dossierId, contentFileTemplate);
		}
		if (vrTrackchanges == null && Validator.isNotNull(dossierIdCTN)) {
			vrTrackchanges = VRTrackchangesLocalServiceUtil.findByDossierIdCTN_ContentFileTemplate(dossierIdCTN, contentFileTemplate);
		}
		return getResult(vrTrackchanges);
	}

	private JSONObject getResult(VRTrackchanges vrTrackchanges) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			result = BusinessUtil.object2Json_originColumnName(vrTrackchanges, VRTrackchangesModelImpl.class,
					StringPool.BLANK);
			if (result != null && result.length() > 0) {
				if (result.getLong("previousContentFileEntryId") > 0) {
					File previousFile = FileUploadUtils.getFile(result.getLong("previousContentFileEntryId"));
					if (previousFile != null) {
						String previousContent = FileUploadUtils.fileToString(previousFile);
						result.put("previousContentFileEntryId", previousContent);
					}
				} else {
					result.put("previousContentFileEntryId", 0);
				}
				
				if (result.getLong("currentContentFileEntryId") > 0) {
					File currentFile = FileUploadUtils.getFile(result.getLong("currentContentFileEntryId"));
					if (currentFile != null) {
						String currentContent = FileUploadUtils.fileToString(currentFile);
						result.put("currentContentFileEntryId", currentContent);
					}
				} else {
					result.put("currentContentFileEntryId", 0);
				}
				
				if (result.getLong("nextContentFileEntryId") > 0) {
					File nextFile = FileUploadUtils.getFile(result.getLong("nextContentFileEntryId"));
					if (nextFile != null) {
						String nextContent = FileUploadUtils.fileToString(nextFile);
						result.put("nextContentFileEntryId", nextContent);
					}
				} else {
					result.put("nextContentFileEntryId", 0);
				}
			}
		} catch (JSONException e) {
			_log.error(e);
		}
		return result;
	}

}
