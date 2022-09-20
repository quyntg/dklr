package com.fds.vr.business.action;

import com.fds.vr.business.model.VRVehicleSpecification;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author trungnt
 *
 */
public interface VRVehicleSpecificationAction {

	//public JSONObject createVRVehicleRecord(VRVehicleRecord object);

	//public JSONObject deleteVRVehicleRecord(long id);

	//public JSONObject importVRVehicleRecord(User user, ServiceContext serviceContext, InputStream inputStream);

	//public JSONObject updateVRVehicleRecord(VRVehicleRecord object);

	public JSONObject findVRVehicleSpecification(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);
	
	public List<VRVehicleSpecification> findByDossierId(long dossierId, int start, int end);

}
