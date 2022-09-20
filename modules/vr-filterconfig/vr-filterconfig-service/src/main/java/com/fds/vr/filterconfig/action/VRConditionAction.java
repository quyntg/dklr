package com.fds.vr.filterconfig.action;

import com.fds.vr.filterconfig.exception.NoSuchVRConditionException;
import com.fds.vr.filterconfig.xmlmodel.VRConditionModel;

import java.util.List;

public interface VRConditionAction {
	
	public List<VRConditionModel> getVRConditionByFilterModuleCode(String filterModuleCode);
	
	public List<VRConditionModel> getVRConditions(int start,int end);
	
	public VRConditionModel getVRCondition(String specificationCode) throws NoSuchVRConditionException;
}
