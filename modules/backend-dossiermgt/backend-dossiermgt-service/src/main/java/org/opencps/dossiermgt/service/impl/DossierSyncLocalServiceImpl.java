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

package org.opencps.dossiermgt.service.impl;

import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.List;

import org.opencps.dossiermgt.model.DossierSync;
import org.opencps.dossiermgt.service.base.DossierSyncLocalServiceBaseImpl;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the dossier sync local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link org.opencps.dossiermgt.service.DossierSyncLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author huymq
 * @see DossierSyncLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.DossierSyncLocalServiceUtil
 */
@ProviderType
public class DossierSyncLocalServiceImpl extends DossierSyncLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * org.opencps.dossiermgt.service.DossierSyncLocalServiceUtil} to access the
	 * dossier sync local service.
	 */
	
	private static final Log _log = LogFactoryUtil.getLog(DossierSyncLocalServiceImpl.class);

	public DossierSync updateDossierSync(long groupId, long userId, long dossierId, String dossierReferenceUid,
			boolean createDossier, int method, long classPK, String fileReferenceUid, String serverNo) {

		DossierSync dossierSync = null;

		dossierSync = dossierSyncPersistence.fetchByF_D_M_CPK_FR(dossierId, method, classPK, fileReferenceUid);

		if (Validator.isNull(dossierSync)) {
			long dossierSyncId = counterLocalService.increment(DossierSync.class.getName());

			Date now = new Date();

			dossierSync = dossierSyncPersistence.create(dossierSyncId);

			dossierSync.setCreateDate(now);
			dossierSync.setModifiedDate(now);

			dossierSync.setGroupId(groupId);
			dossierSync.setUserId(userId);

			dossierSync.setDossierId(dossierId);
			dossierSync.setDossierReferenceUid(dossierReferenceUid);
			dossierSync.setCreateDossier(createDossier);
			dossierSync.setMethod(method);
			dossierSync.setClassPK(classPK);
			dossierSync.setFileReferenceUid(fileReferenceUid);
			dossierSync.setServerNo(serverNo);

			dossierSyncPersistence.update(dossierSync);

		}

		return dossierSync;
	}
	
	//add by Dungnv - Sync theo co che 1 record
	public DossierSync updateDossierSync(long groupId, long userId, long dossierId, String dossierReferenceUid,
			boolean createDossier, int method, long classPK, String fileReferenceUid, String serverNo, String payload, int retry, int state) throws JSONException {

		DossierSync dossierSync = null;
		
		User user = userLocalService.fetchUser(userId);

		List<DossierSync> dossierSyncs = dossierSyncPersistence.findByG_ID_DID(groupId, dossierId);
		if(Validator.isNotNull(dossierSyncs) && !dossierSyncs.isEmpty()) {
			for(DossierSync sync : dossierSyncs) {
				dossierSync = sync;
				break;
			}
		}
		//_log.info("Dungnv: --------------> dossierSync: " + dossierSync + " - payload: " + payload);
		Date now = new Date();
		if (Validator.isNull(dossierSync)) {
			long dossierSyncId = counterLocalService.increment(DossierSync.class.getName());
			dossierSync = dossierSyncPersistence.create(dossierSyncId);
		}
		
		dossierSync.setCreateDate(now);
		dossierSync.setModifiedDate(now);

		dossierSync.setGroupId(groupId);
		dossierSync.setUserId(userId);
		dossierSync.setUserName(user.getFullName());
		dossierSync.setCompanyId(user.getCompanyId());

		dossierSync.setDossierId(dossierId);
		dossierSync.setDossierReferenceUid(dossierReferenceUid);
		dossierSync.setCreateDossier(createDossier);
		dossierSync.setMethod(method);
		dossierSync.setClassPK(classPK);
		dossierSync.setFileReferenceUid(fileReferenceUid);
		dossierSync.setServerNo(serverNo);
		dossierSync.setPayload(payload);
		dossierSync.setRetry(retry);
		dossierSync.setState(state);

		dossierSync = dossierSyncPersistence.update(dossierSync);

		return dossierSync;
	}

	public DossierSync updateCreateDossierStatus(long dossierSyncId, boolean status) {

		DossierSync dossierSyn = dossierSyncPersistence.fetchByPrimaryKey(dossierSyncId);
		dossierSyn.setCreateDossier(status);

		return dossierSyncPersistence.update(dossierSyn);
	}

	public DossierSync shiftCreateDossierStatus(long dossierSyncId) {
		DossierSync dossierSyn = dossierSyncPersistence.fetchByPrimaryKey(dossierSyncId);

		boolean isCreate = dossierSyn.getCreateDossier();

		if (isCreate) {
			dossierSyn.setCreateDossier(false);
		} else {
			dossierSyn.setCreateDossier(true);
		}

		return dossierSyncPersistence.update(dossierSyn);
	}

	public List<DossierSync> fetchByServerNo(String serverNo, int start, int end) {
		return dossierSyncPersistence.findBySRV_NO(serverNo, start, end);
	}
	
	public List<DossierSync> fetchByServerNo(String serverNo, int state, int start, int end) {
		return dossierSyncPersistence.findBySRV_NO_STATE(serverNo, state, start, end);
	}

	public List<DossierSync> fetchByGroupId(long groupId, int start, int end) {
		return dossierSyncPersistence.findByG_ID(groupId, start, end);
	}

	public List<DossierSync> fetchByGroupDossierId(long groupId, long dossierId, int start, int end) {
		return dossierSyncPersistence.findByG_ID_DID(groupId, dossierId, start, end);
	}

	public List<DossierSync> fetchByGroupDossierRef(long groupId, String dossierRef, int start, int end) {
		return dossierSyncPersistence.findByG_ID_DRF(groupId, dossierRef, start, end);
	}

	public int countByGroupDossierId(long groupId, long dossierId) {
		return dossierSyncPersistence.countByG_ID_DID(groupId, dossierId);
	}

	public int countByGroupDossierRef(long groupId, String dossierRef) {
		return dossierSyncPersistence.countByG_ID_DRF(groupId, dossierRef);
	}

	public int countByDossierId(long dossierId) {
		return dossierSyncPersistence.countByDossierId(dossierId);
	}

}