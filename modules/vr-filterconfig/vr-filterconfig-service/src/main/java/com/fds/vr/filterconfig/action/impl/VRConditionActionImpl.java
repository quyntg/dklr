package com.fds.vr.filterconfig.action.impl;

import com.fds.vr.filterconfig.action.VRConditionAction;
import com.fds.vr.filterconfig.exception.NoSuchVRConditionException;
import com.fds.vr.filterconfig.model.VRCondition;
import com.fds.vr.filterconfig.service.VRConditionLocalServiceUtil;
import com.fds.vr.filterconfig.service.VRConditionUtils;
import com.fds.vr.filterconfig.xmlmodel.VRConditionModel;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.ArrayList;
import java.util.List;

public class VRConditionActionImpl implements VRConditionAction {

	private static Log _log = LogFactoryUtil.getLog(VRConditionActionImpl.class);

	public List<VRConditionModel> getVRConditions(int start, int end) throws SystemException {

		List<VRConditionModel> list = new ArrayList<VRConditionModel>();

		List<VRCondition> dataList = VRConditionLocalServiceUtil.getVRConditions(start, end);

		list = VRConditionUtils.mapperModel(dataList);

		return list;
	}
	
	public VRConditionModel getVRCondition(String specificationCode) throws NoSuchVRConditionException {

		VRConditionModel result = new VRConditionModel();

		VRCondition vrCondition = VRConditionLocalServiceUtil.getVRCondition(specificationCode);

		result = VRConditionUtils.mapperModel(vrCondition);

		return result;
	}
	
	public List<VRConditionModel> getVRConditionByFilterModuleCode(String filterModuleCode) throws SystemException {

		List<VRConditionModel> list = new ArrayList<VRConditionModel>();

		List<VRCondition> dataList = VRConditionLocalServiceUtil.getVRConditionByFilterModuleCode(filterModuleCode);
		
		list = VRConditionUtils.mapperModel(dataList);

		return list;
	}

}
