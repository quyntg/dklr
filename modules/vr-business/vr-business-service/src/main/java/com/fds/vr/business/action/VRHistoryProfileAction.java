/**
 * 
 */
package com.fds.vr.business.action;

import com.fds.vr.business.model.VRHistoryProfile;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.IOException;
import java.util.Date;

/**
 * @author ddung
 *
 */
public interface VRHistoryProfileAction {
	public VRHistoryProfile updateVRHistoryProfile(long id, String applicantCode, String productionPlantCode,
			long dossierId, String dossierIdCTN, String dossierNo, String contentType, String contentFileTemplate,
			long jsonFileEntryId, long pdfFileEntryId, Date syncDate, ServiceContext serviceContext) throws IOException;

	public JSONObject findVRHistoryProfileApplicantCode(String applicantCode, int start, int end,
			ServiceContext serviceContext);

	public JSONObject findVRHitoryProfiles(String applicantCode, String productionPlantCode, long dossierId,
			String dossierIdCTN, String dossierNo, String contentType, String contentFileTemplate, int start, int end);
}
