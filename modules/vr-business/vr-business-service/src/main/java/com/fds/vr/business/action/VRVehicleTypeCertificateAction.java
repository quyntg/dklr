package com.fds.vr.business.action;

import com.fds.vr.business.model.VRVehicleTypeCertificate;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author trungnt
 *
 */
public interface VRVehicleTypeCertificateAction {
	public JSONObject findVehicleTypeCertificateYear(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);

	public JSONObject findVehicleTypeCertificate(User user, ServiceContext serviceContext, Integer year,
			LinkedHashMap<String, Object> params, String advancesearchParams);

	public JSONObject createVRVehicleTypeCertificate(VRVehicleTypeCertificate object);

	public JSONObject deleteVRVehicleTypeCertificate(long id);

	public JSONObject findVRVehicleTypeCertificate(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);

	public JSONObject updateVRVehicleTypeCertificate(VRVehicleTypeCertificate object, ServiceContext serviceContext);

	public JSONObject findByDossierId_MTCore(long dossierId, long mtCore, ServiceContext serviceContext);

	public void indexing(VRVehicleTypeCertificate vrVehicleTypeCertificate, Company company);

	public JSONObject findSpecificationByCertificateRecordNo(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);
}
