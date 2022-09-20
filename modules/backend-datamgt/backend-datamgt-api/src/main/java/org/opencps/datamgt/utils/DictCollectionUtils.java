package org.opencps.datamgt.utils;

import org.opencps.datamgt.model.DictCollection;
import org.opencps.datamgt.model.DictItem;
import org.opencps.datamgt.service.DictCollectionLocalServiceUtil;
import org.opencps.datamgt.service.DictItemLocalServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class DictCollectionUtils {
	/**
	 * @author khoavu
	 * @param collectionCode
	 * @param itemCode
	 * @param groupId
	 * @return
	 */
	public static DictItem getDictItemByCode(String collectionCode, String itemCode, long groupId) {
		DictItem item = null;

		try {

			DictCollection dc = DictCollectionLocalServiceUtil.fetchByF_dictCollectionCode(collectionCode, groupId);

			item = DictItemLocalServiceUtil.fetchByF_dictItemCode(itemCode, dc.getDictCollectionId(), groupId);
		} catch (Exception e) {
		}

		return item;
	}
	
	static Log _log = LogFactoryUtil.getLog(DictCollectionUtils.class);
	
}
