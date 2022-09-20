package com.fds.vr.util;

import java.util.ArrayList;
import java.util.List;

import com.fds.vr.business.model.VRCorporationAttendee;
import com.fds.vr.model.VRCorporationAttendeeModel;

public class VRCorporationAttendeeUtils {

	public static List<VRCorporationAttendeeModel> mappingToResultCorporation (List<VRCorporationAttendee> corporationList) {

		if (corporationList != null && corporationList.size() > 0) {
			List<VRCorporationAttendeeModel> corporationModelList = new ArrayList<VRCorporationAttendeeModel>();
			for (VRCorporationAttendee corporationInfo : corporationList) {
				VRCorporationAttendeeModel model = mappingToDetailCorporation(corporationInfo);

				corporationModelList.add(model);
			}
			return corporationModelList;
		} else {
			return null;
		}
	}

	public static VRCorporationAttendeeModel mappingToDetailCorporation (VRCorporationAttendee corporationInfo) {

		VRCorporationAttendeeModel model = new VRCorporationAttendeeModel();
		//
		model.setSubject(corporationInfo.getSubject());
		model.setInspectionDate(corporationInfo.getInspectionDate() != null? corporationInfo.getInspectionDate().getTime(): 0);
		model.setTestingRegisteredPlace(corporationInfo.getTestingRegisteredPlace());
		model.setLeaderName(corporationInfo.getLeaderName());
		model.setInvitation(corporationInfo.getInvitation());
		model.setRegisterednumber(corporationInfo.getRegisterednumber());
		model.setLocation(corporationInfo.getLocation());

		return model;
	}

}
