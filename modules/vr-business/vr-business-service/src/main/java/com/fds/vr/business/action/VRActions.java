package com.fds.vr.business.action;

import java.util.List;

import com.fds.vr.business.model.VRCorporationAttendee;
import com.liferay.portal.kernel.json.JSONObject;

public interface VRActions {
	public JSONObject getTechSpecByVehicleClass(long groupId, String module, long dossierId, long dossierFileId,
			String vehicleClass, String flag);

	public JSONObject getTechSpecLimit(long groupId, String module, long dossierId, long dossierFileId,
			String vehicleClass, String vehicleType, long fomulaType);

	public JSONObject getTechSpecByVehicleClassType(long groupId, String module, long dossierId, long dossierFileId,
			String vehicleClass, String vehicleType, String flag);

	public JSONObject getDictItem(long groupId, String dictCollectionCode, String dictCollectionType);

	public JSONObject getTechSpecByVehicleClassExt(long groupId, String module, long dossierId, long dossierFileId,
			String fileTemplateNo, String vehicleClass, String flag);

	public JSONObject getTechSpecByVehicleType(long groupId, String module, long dossierId, long dossierFileId,
			String fileTemplateNo, String vehicleClass, String vehicleType, String flag);

	public List<VRCorporationAttendee> getVRCorporationByUserId(int mtCore, long userId, String fromDateConvert, String toDateConvert);
}
