/**
 * 
 */
package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRInputSheetActions;
import com.fds.vr.business.model.VRES;
import com.fds.vr.business.model.VRInputSheet;
import com.fds.vr.business.model.VRInputStampbook;
import com.fds.vr.business.model.VRInputStampbookDetails;
import com.fds.vr.business.model.VROutputSheetDetails;
import com.fds.vr.business.model.impl.VRInputSheetModelImpl;
import com.fds.vr.business.model.impl.VRInputStampbookDetailsModelImpl;
import com.fds.vr.business.model.impl.VRInputStampbookModelImpl;
import com.fds.vr.business.model.impl.VROutputSheetDetailsModelImpl;
import com.fds.vr.business.model.impl.VROutputSheetModelImpl;
import com.fds.vr.business.service.VRInputStampbookDetailsLocalServiceUtil;
import com.fds.vr.business.service.VRInputStampbookLocalServiceUtil;
import com.fds.vr.business.service.VROutputSheetDetailsLocalServiceUtil;
import com.fds.vr.business.service.indexer.ElasticQueryWrapUtil;
import com.fds.vr.service.util.BusinessUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.util.StringPool;

import java.util.Date;
import java.util.List;

/**
 * @author ddung
 *
 */
public class VRInputSheetActionsImpl implements VRInputSheetActions {

	private Log _log = LogFactoryUtil.getLog(VRInputSheetActionsImpl.class);

	@Override
	public void indexing(VRInputSheet vrInputSheet, Company company) throws SystemException, PortalException {
		final String CLASS_NAME = VRES.class.getName();
		JSONObject object = JSONFactoryUtil.createJSONObject();
		JSONObject jVRInputSheet = BusinessUtil.object2Json_originValue(vrInputSheet, VRInputSheetModelImpl.class,
				StringPool.BLANK);
		object.put("vr_InputSheet", jVRInputSheet);

		List<VRInputStampbook> vrInputStampbooks = VRInputStampbookLocalServiceUtil
				.findByInputSheetId(vrInputSheet.getMtCore(), vrInputSheet.getPrimaryKey());
		object = BusinessUtil.array2JSON(vrInputStampbooks, VRInputStampbookModelImpl.class, object,
				"vr_InputStampbook");

		List<VRInputStampbookDetails> vrInputStampbookDetails = VRInputStampbookDetailsLocalServiceUtil
				.findByInputSheetId(vrInputSheet.getMtCore(), vrInputSheet.getPrimaryKey());
		object = BusinessUtil.array2JSON(vrInputStampbookDetails, VRInputStampbookDetailsModelImpl.class, object,
				"vr_InputStampbookDetails");

		JSONObject esData = JSONFactoryUtil.createJSONObject();
		esData.put("type_es", "vr_inputsheet");
		esData.put(Field.MODIFIED_DATE + "_es", new Date().getTime());
		esData.put(Field.COMPANY_ID, String.valueOf(company.getCompanyId()));
		esData.put("id", String.valueOf(vrInputSheet.getId()));
		esData.put("data", object);

		int deletex = ElasticQueryWrapUtil.DELETE("id", String.valueOf(vrInputSheet.getPrimaryKey()),
				company.getCompanyId(), "vr_inputsheet");
		if (deletex == 0) {
			ElasticQueryWrapUtil.POST(esData.toJSONString(), CLASS_NAME, company.getCompanyId());
		}
		_log.info("---> DocumentId - outputSheetId: " + vrInputSheet.getPrimaryKey());

		_log.info("=== DONE INDEXING ===");
	}

}
