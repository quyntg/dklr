package com.fds.vr.filterconfig.service;

import com.fds.vr.filterconfig.model.DMDataItem;
import com.fds.vr.filterconfig.model.VRCondition;
import com.fds.vr.filterconfig.xmlmodel.DMDataItemModel;
import com.fds.vr.filterconfig.xmlmodel.VRConditionModel;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.List;

import org.common.APIDateTimeUtils;



public class VRConditionUtils {
	
	public static VRConditionModel mapperModel(VRCondition vrcondition) {

		VRConditionModel object = new VRConditionModel();
		
		try {
	
			object.setId(vrcondition.getId());
			object.setFilterModuleCode(vrcondition.getFilterModuleCode());
			object.setFilterTableField(vrcondition.getFilterTableField());
			object.setFilterTableName(vrcondition.getFilterTableName());
			object.setSpecificationCode(vrcondition.getSpecificationCode());
			object.setSpecificationDisplayName(vrcondition.getSpecificationDisplayName());
			object.setSpecificationDataCollectionId(vrcondition.getSpecificationDataCollectionID());
			object.setSequenceNo(vrcondition.getSequenceNo());
			object.setSpecificationBasicUnit(vrcondition.getSpecificationBasicUnit());
			object.setSpecificationStandard(vrcondition.getSpecificationStandard());
			object.setSpecificationGroup(vrcondition.getSpecificationGroup());
			
			
			object.setModifyDate(Validator.isNotNull(vrcondition.getModifyDate()) ? APIDateTimeUtils
					.convertDateToString(vrcondition.getModifyDate(), APIDateTimeUtils._NORMAL_PARTTERN)
					: StringPool.BLANK);
			
			
			object.setSyncDate(Validator.isNotNull(vrcondition.getSyncDate()) ? APIDateTimeUtils
					.convertDateToString(vrcondition.getSyncDate(), APIDateTimeUtils._NORMAL_PARTTERN)
					: StringPool.BLANK);
			

		} catch (Exception e) {
			_log.error(e);
		}

		return object;
	}
	
	public static List<VRConditionModel> mapperModel(List<VRCondition> vrConditionList) {

		List<VRConditionModel> list = new ArrayList<VRConditionModel>();
		
		for(VRCondition  dmDataItem:vrConditionList) {
			list.add(mapperModel(dmDataItem));
		}
		
		return list;
	}


	static Log _log = LogFactoryUtil.getLog(VRConditionUtils.class);

}
