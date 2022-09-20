package com.fds.vr.business.action;

import com.fds.vr.business.model.VRCOPReportRepository;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.LinkedHashMap;

/**
 * @author trungnt
 *
 */
public interface VRCOPReportRepositoryAction {
	public JSONObject findVRCOPReportRepositoryYear(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);

	public JSONObject findVRCOPReportRepository(User user, ServiceContext serviceContext, Integer year,
			LinkedHashMap<String, Object> params, String advancesearchParams);

	public JSONObject findByMtCore_ProductionPlantCode_COPClassification(long mtCore, String productionPlantCode,
			String copClassification, int start, int end);

	public long countVRCOPReportRepositories(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);

	public void indexing(VRCOPReportRepository vrcopReportRepository, Company company);

	public JSONObject findByDossierId(long dossierId, long mtCore, ServiceContext serviceContext);

	public JSONObject findCOPProductionPlantEquipmentByDossierId(User user, ServiceContext serviceContext,
			long dossierId, long mtCore, int start, int end);
}
