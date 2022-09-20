package com.fds.vr.filterconfig.action.impl;
import com.fds.vr.filterconfig.action.DMDataAction;
import com.fds.vr.filterconfig.model.DMDataItem;
import com.fds.vr.filterconfig.service.DMDataItemLocalServiceUtil;
import com.fds.vr.filterconfig.service.DMDataItemUtils;
import com.fds.vr.filterconfig.xmlmodel.DMDataItemModel;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.ArrayList;
import java.util.List;

public class DMDataActionImpl implements DMDataAction {
	
	private static Log _log = LogFactoryUtil.getLog(DMDataActionImpl.class);

	
//	public JSONObject getDMData(long[] dataGroupIds,int[] levels ) throws SystemException  {
//
//		JSONObject jsonData = JSONFactoryUtil.createJSONObject();
//		
//		_log.info("dataGroupIds.length:"+dataGroupIds.length);
//		_log.info("dataGroupIds[0]:"+dataGroupIds[0]);
//		_log.info("levels.length:"+levels.length);
//		_log.info("levels[0]:"+levels[0]);
//		
//		List<DMDataItem> dataList = DMDataItemLocalServiceUtil.getDMData(dataGroupIds, levels);
//			
//		
//		jsonData.put("data", DMDataItemUtils.mapperHolidayModel(dataList).toString());
//		jsonData.put("data2", dataList.toString());
//		jsonData.put("total", dataList.size());
//		
//
//		return jsonData;
//	}
	
	public List<DMDataItemModel> getDMData(long[] dataGroupIds,int[] levels ) throws SystemException  {

		List<DMDataItemModel> list = new ArrayList<DMDataItemModel>();
		
		List<DMDataItem> dataList = DMDataItemLocalServiceUtil.getDMData(dataGroupIds, levels);
			
		list = DMDataItemUtils.mapperHolidayModel(dataList);
		
		

		return list;
	}



}
