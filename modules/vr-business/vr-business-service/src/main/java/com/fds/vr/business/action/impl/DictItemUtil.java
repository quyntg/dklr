package com.fds.vr.business.action.impl;

import java.util.List;

import org.opencps.datamgt.model.DictCollection;
import org.opencps.datamgt.model.DictItem;
import org.opencps.datamgt.model.DictItemGroup;
import org.opencps.datamgt.service.DictCollectionLocalServiceUtil;
import org.opencps.datamgt.service.DictItemLocalServiceUtil;
import org.opencps.datamgt.service.persistence.impl.DictItemFinderImpl;
import org.opencps.datamgt.service.DictItemGroupLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

public class DictItemUtil {
	private static Log log = LogFactoryUtil.getLog(DictItemUtil.class);
	
	public long getCollectionId(String code, long groupId) {
		long collectionId = 0l;

		DictCollection collection = DictCollectionLocalServiceUtil.fetchByF_dictCollectionCode(code, groupId);

		if (Validator.isNotNull(collection)) {
			collectionId = collection.getPrimaryKey();
		}

		return collectionId;
	}
	
	public JSONArray getDictItem(List<DictItem> items, String code) {
		JSONArray array = JSONFactoryUtil
				.createJSONArray();
		try {
			List <DictItem> dictItemparent = DictItemLocalServiceUtil.findByF_dictCollectionId(items.get(0).getDictCollectionId());
			for (DictItem dictItem : items) {
				
				JSONObject input = JSONFactoryUtil.createJSONObject();
	
				if (dictItem.getItemCode().toLowerCase().contains(
					code.toLowerCase())) {
	
					input.put("key", dictItem.getItemCode());
	
					input.put("value", dictItem.getItemName());
					
					String parentCode = StringPool.BLANK;
					for (DictItem dictItemParent : dictItemparent) {
						if (dictItemParent.getDictItemId()== dictItem .getDictItemId()) {
							parentCode = dictItemParent.getItemCode();
							
							break;
						}
					}
					input.put("parent", parentCode );
	
					array.put(input);
				}
	
			}
		} catch (Exception e) {
			log.error(e);
		} 
		return array;
	}
	
	
	public JSONArray getDictItemByCollection_Parent_Level_OrderBy(List<DictItem> items, long groupId, String collectionCode, String parentItemCode, String level, String OrderBy) {
		JSONArray array = JSONFactoryUtil
				.createJSONArray();
		try {
			List <DictItem> dictItems = DictItemLocalServiceUtil.findByCollection_Parent_Level_OrderBy(groupId, collectionCode, parentItemCode, level, OrderBy );
			for (DictItem dictItem : dictItems) {
				
				JSONObject input = JSONFactoryUtil.createJSONObject();
	
				input.put("key", dictItem.getItemCode());
	
				input.put("value", dictItem.getItemName());
				
				String parentCode = StringPool.BLANK;
				String parentName = StringPool.BLANK;
				for (DictItem dictItemParent : items) {
					if (dictItemParent.getDictItemId()== dictItem .getParentItemId()) {
						parentCode = dictItemParent.getItemCode();
						parentName = dictItemParent.getItemName();
						break;
					}
				}
				input.put("parentkey", parentCode );
				input.put("parentvalue", parentName );
	
				List <DictItemGroup> lsItemgroup = DictItemGroupLocalServiceUtil.findByF_dictItemId(groupId, dictItem.getDictItemId());
				if (lsItemgroup != null && lsItemgroup.size() > 0 ) {
					JSONObject inputItemGroup = JSONFactoryUtil.createJSONObject();
					for (DictItemGroup Itemgroup : lsItemgroup) {												
						inputItemGroup.put("groupvalue", Validator.isNotNull(Itemgroup.getDictGroupName()) ? Itemgroup.getDictGroupName() : StringPool.BLANK);						
					}
					input.put("itemgroup", Validator.isNotNull(inputItemGroup.toJSONString()) ? inputItemGroup.toJSONString() : StringPool.BLANK);
				}
				array.put(input);
	
			}

		} catch (Exception e) {
			log.error(e);
		} 
		return array;
	}
}
