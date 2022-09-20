/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.fds.vr.business.service.impl;

import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.model.VRCOPReportAttach;
import com.fds.vr.business.model.impl.VRCOPReportAttachImpl;
import com.fds.vr.business.model.impl.VRCOPReportAttachModelImpl;
import com.fds.vr.business.service.base.VRCOPReportAttachLocalServiceBaseImpl;
import com.fds.vr.service.util.BusinessUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vrcop report attach local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRCOPReportAttachLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRCOPReportAttachLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRCOPReportAttachLocalServiceUtil
 */
@ProviderType
public class VRCOPReportAttachLocalServiceImpl extends VRCOPReportAttachLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRCOPReportAttachLocalServiceUtil} to access the
	 * vrcop report attach local service.
	 */

	public List<VRCOPReportAttach> findBycopReportRepositoryID_MtCore(long mtCore, long copReportRepositoryID,
			int start, int end) {
		return vrcopReportAttachPersistence.findBycopReportRepositoryID(mtCore, copReportRepositoryID, start, end);
	}

	public List<VRCOPReportAttach> findBycopReportNo(long mtCore, String copReportNo)
			throws PortalException, SystemException {
		try {
			return vrcopReportAttachPersistence.findBycopReportNo(mtCore, copReportNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCOPReportAttach>();

	}

	public VRCOPReportAttach updateCOPReportAttach(Map<String, String> mapValues, int mtCore) {

		Date now = new Date();

		long vrCOPReportAttachId = counterLocalService.increment(VRCOPReportAttach.class.getName());

		VRCOPReportAttach object = vrcopReportAttachPersistence.create(vrCOPReportAttachId);

		/// Add audit fields
		object.setSyncDate(now);
		object.setModifyDate(now);

		// Add other fields
		object.setMtCore(mtCore);
		object.setCopReportRepositoryID(Long.valueOf(mapValues.get("copReportRepositoryId")));
		object.setCopReportNo(mapValues.get("copReportNo"));
		object.setSequenceNo(Long.valueOf(mapValues.get("sequenceNo")));
		object.setDocNo(mapValues.get("docNo"));
		object.setDocName(mapValues.get("docName"));
		object.setRemarks(mapValues.get("remarks"));

		return vrcopReportAttachPersistence.update(object);
	}

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrcopReportAttachFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrcopReportAttachFinder.countData(sql);
	}

	public JSONArray getByCOPReportNo(long mtcore, String COPReportNo) throws SystemException, PortalException {

		JSONArray result = JSONFactoryUtil.createJSONArray();
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		List<VRCOPReportAttach> dataList = findBycopReportNo(mtcore, COPReportNo);

		for (VRCOPReportAttach data : dataList) {

			jsonObject = JSONFactoryUtil.createJSONObject();

			jsonObject = ActionUtil.object2Json(data, VRCOPReportAttachImpl.class, StringPool.BLANK);

			if (Validator.isNotNull(jsonObject)) {
				result.put(jsonObject);
			}
		}
		return result;
	}

	public JSONArray adminProcessData(JSONArray arrayData, long mtCore, long vrcopReportRepositoryId, long dossierId,
			String dossierIdCTN, String dossierNo) {

		JSONArray array = JSONFactoryUtil.createJSONArray();
		vrcopReportAttachPersistence.removeBycopDossierId(dossierId);

		Date now = new Date();

		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject objectData = arrayData.getJSONObject(i);

			VRCOPReportAttach object = null;

			long id = counterLocalService.increment(VRCOPReportAttach.class.getName());

			object = vrcopReportAttachPersistence.create(id);

			object.setModifyDate(now);
			object.setMtCore(mtCore);

			object.setCopReportRepositoryID(vrcopReportRepositoryId);
			object.setCopReportNo(objectData.getString("copReportNo"));
			object.setSequenceNo(objectData.getLong("sequenceNo"));
			object.setDocName(objectData.getString("docName"));
			object.setDocNo(objectData.getString("docNo"));
			object.setRemarks(objectData.getString("remarks"));
			object.setSyncDate(now);

			object.setDossierId(dossierId);
			object.setDossierIdCTN(dossierIdCTN);
			object.setDossierNo(dossierNo);

			vrcopReportAttachPersistence.update(object);
			try {
				JSONObject obj = BusinessUtil.object2Json_originColumnName(object, VRCOPReportAttachModelImpl.class,
						StringPool.BLANK);
				array.put(obj);
			} catch (JSONException e) {
			}
		}

		return array;
	}

	private Log _log = LogFactoryUtil.getLog(VRCOPReportAttachLocalServiceImpl.class);
}