package com.fds.vr.filterconfig.action;

import com.fds.vr.filterconfig.xmlmodel.DMDataItemModel;
import com.liferay.portal.kernel.json.JSONObject;

import java.util.List;

public interface DMDataAction {
	
	
	public List<DMDataItemModel> getDMData(long[] dataGroupIds,int[] levels );
}
