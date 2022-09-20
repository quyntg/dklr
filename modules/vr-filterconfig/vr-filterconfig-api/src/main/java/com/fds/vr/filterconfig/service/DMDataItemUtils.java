package com.fds.vr.filterconfig.service;

import com.fds.vr.filterconfig.model.DMDataItem;
import com.fds.vr.filterconfig.xmlmodel.DMDataItemModel;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.List;

import org.common.APIDateTimeUtils;



public class DMDataItemUtils {
	
	public static DMDataItemModel mapperHolidayModel(DMDataItem dmDataItem) {

		DMDataItemModel object = new DMDataItemModel();

		try {
	
			object.setId(dmDataItem.getId());
			object.setDataGroupId(dmDataItem.getDataGroupId());
			object.setCode0(dmDataItem.getCode_0());
			object.setCode1(dmDataItem.getCode_1());
			object.setCode2(dmDataItem.getCode_2());
			object.setCode3(dmDataItem.getCode_3());
			object.setLevel(dmDataItem.getLevel());
			object.setName(dmDataItem.getName());
			object.setAltername(dmDataItem.getAltername());
			object.setDescription(dmDataItem.getDescription());
			object.setStatus(dmDataItem.getStatus());
			
			object.setValidatedFrom(Validator.isNotNull(dmDataItem.getValidatedFrom()) ? APIDateTimeUtils
					.convertDateToString(dmDataItem.getValidatedFrom(), APIDateTimeUtils._NORMAL_PARTTERN)
					: StringPool.BLANK);
			object.setValidatedTo(Validator.isNotNull(dmDataItem.getValidatedTo()) ? APIDateTimeUtils
					.convertDateToString(dmDataItem.getValidatedTo(), APIDateTimeUtils._NORMAL_PARTTERN)
					: StringPool.BLANK);
			
			object.setSyncDate(Validator.isNotNull(dmDataItem.getSyncDate()) ? APIDateTimeUtils
					.convertDateToString(dmDataItem.getSyncDate(), APIDateTimeUtils._NORMAL_PARTTERN)
					: StringPool.BLANK);
			

		} catch (Exception e) {
			_log.error(e);
		}

		return object;
	}
	
	public static List<DMDataItemModel> mapperHolidayModel(List<DMDataItem> dmDataItems) {

		List<DMDataItemModel> list = new ArrayList<DMDataItemModel>();
		
		for(DMDataItem  dmDataItem:dmDataItems) {
			list.add(mapperHolidayModel(dmDataItem));
		}
		
		return list;
	}


	static Log _log = LogFactoryUtil.getLog(DMDataItemUtils.class);

}
