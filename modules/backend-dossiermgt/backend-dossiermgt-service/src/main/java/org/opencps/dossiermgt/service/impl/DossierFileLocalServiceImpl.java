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

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.opencps.dossiermgt.action.FileUploadUtils;
import org.opencps.dossiermgt.action.util.AutoFillFormData;
import org.opencps.dossiermgt.action.util.DossierFileUtils;
import org.opencps.dossiermgt.constants.DossierFileTerm;
import org.opencps.dossiermgt.exception.DuplicateDossierFileException;
import org.opencps.dossiermgt.exception.InvalidDossierStatusException;
import org.opencps.dossiermgt.exception.NoSuchDossierFileException;
import org.opencps.dossiermgt.exception.NoSuchDossierPartException;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.DossierPart;
import org.opencps.dossiermgt.service.base.DossierFileLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBusUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.search.BooleanClauseOccur;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.BooleanQueryFactoryUtil;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.IndexSearcherHelperUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.ParseException;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.generic.MultiMatchQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PwdGenerator;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the dossier file local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link org.opencps.dossiermgt.service.DossierFileLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author huymq
 * @see DossierFileLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.DossierFileLocalServiceUtil
 */
@ProviderType
public class DossierFileLocalServiceImpl extends DossierFileLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * org.opencps.dossiermgt.service.DossierFileLocalServiceUtil} to access the
	 * dossier file local service.
	 */
	
	Log _log = LogFactoryUtil.getLog(DossierFileLocalServiceImpl.class);
	
	public DossierFile getByRefAndGroupId(long groupId, String referenceUid) throws PortalException {
		return dossierFilePersistence.fetchByGID_REF(groupId, referenceUid);
	}
	
	/**
	 * POST /dossiers/{id|referenceUid}/files
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DossierFile addDossierFile(long groupId, long dossierId, String referenceUid, String dossierTemplateNo,
			String dossierPartNo, String fileTemplateNo, String displayName, String sourceFileName, long fileSize,
			InputStream inputStream, String fileType, String isSync, long dossierActionId, ServiceContext serviceContext)
			throws PortalException, SystemException {

		long userId = serviceContext.getUserId();
		
		_log.info("****Start add file at:" + new Date());

		validateAddDossierFile(groupId, dossierId, referenceUid, dossierTemplateNo, dossierPartNo, fileTemplateNo);
		
		_log.info("****End validator file at:" + new Date());

		DossierPart dossierPart = dossierPartPersistence.findByTP_NO_PART(groupId, dossierTemplateNo, dossierPartNo);

		long fileEntryId = 0;

		try {
			FileEntry fileEntry = FileUploadUtils.uploadDossierFile(userId, groupId, inputStream, sourceFileName,
					fileType, fileSize, serviceContext);

			if (fileEntry != null) {
				fileEntryId = fileEntry.getFileEntryId();
			}
		} catch (Exception e) {
			throw new SystemException(e);
		}
		_log.info("****End uploadFile file at:" + new Date());

		Date now = new Date();

		User userAction = null;

		if (userId != 0) {
			userAction = userLocalService.getUser(userId);
		}

		long dossierFileId = counterLocalService.increment(DossierFile.class.getName());

		DossierFile object = dossierFilePersistence.create(dossierFileId);

		// Add audit fields
		object.setCompanyId(serviceContext.getCompanyId());
		object.setGroupId(groupId);
		object.setCreateDate(now);
		object.setModifiedDate(now);
		object.setUserId(Validator.isNotNull(userAction) ? userAction.getUserId() : 0l);
		object.setUserName(Validator.isNotNull(userAction) ? userAction.getFullName() : StringPool.BLANK);

		// Add other fields

		object.setDossierId(dossierId);
		if (Validator.isNull(referenceUid)) {
			referenceUid = PortalUUIDUtil.generate();
		}

		object.setReferenceUid(referenceUid);
		object.setDossierTemplateNo(dossierTemplateNo);
		object.setFileEntryId(fileEntryId);
		object.setDossierPartNo(dossierPartNo);
		object.setFileTemplateNo(fileTemplateNo);
		object.setDossierPartType(dossierPart.getPartType());

		if (Validator.isNull(displayName)) {
			displayName = sourceFileName;
		}

		if (Validator.isNotNull(dossierPart.getFormScript())) {
			object.setEForm(true);
			object.setFormScript(dossierPart.getFormScript());
		}

		if (Validator.isNotNull(dossierPart.getFormReport())) {
			object.setFormReport(dossierPart.getFormReport());
		}
		_log.info("****Start autofill file at:" + new Date());

		if (Validator.isNotNull(dossierPart.getSampleData())) {
			String formData = AutoFillFormData.sampleDataBinding(dossierPart.getSampleData(), dossierId, serviceContext);
			//Comment by Dungnv
			//object.setFormData(formData);
			if(!formData.isEmpty()) {
				long fileEntryIdFormData = 0;
				try {
					FileEntry fileEntry = com.fds.vr.service.util.FileUploadUtils.uploadFileJSON(JSONFactoryUtil.createJSONObject(formData), serviceContext);

					fileEntryIdFormData = fileEntry.getFileEntryId();
				} catch (Exception e) {
					_log.error(e);
				}
				object.setFormDataDossierFile(fileEntryIdFormData);
			}
		}
		_log.info("****End autofill file at:" + new Date());

		object.setDisplayName(displayName);
		object.setOriginal(true);
		
		if (Boolean.parseBoolean(isSync)) {
			object.setIsNew(true);
		}
		
		String deliverableCode = PwdGenerator.getPassword(10);
		
		if (Validator.isNotNull(dossierPart.getDeliverableType())) {
			object.setDeliverableCode(deliverableCode);
		}

		dossierActionId = dossierPart.getPartType() > 1 ? dossierActionId : 0;
		object.setDossierActionId(dossierActionId);

		return dossierFilePersistence.update(object);
	}
	
	//Dungnv: Sync theo co che 1 server
	@Indexable(type = IndexableType.REINDEX)
	public DossierFile addDossierFileBySingleServer(long groupId, long dossierId, String referenceUid, String dossierTemplateNo,
			String dossierPartNo, String fileTemplateNo, String displayName, String sourceFileName, long fileSize,
			long fileEntryId, String fileType, String isSync, long dossierActionId, ServiceContext serviceContext)
			throws PortalException, SystemException {

		long userId = serviceContext.getUserId();
		
		_log.info("****Start add file at:" + new Date());

		validateAddDossierFile(groupId, dossierId, referenceUid, dossierTemplateNo, dossierPartNo, fileTemplateNo);
		
		_log.info("****End validator file at:" + new Date());

		DossierPart dossierPart = dossierPartPersistence.findByTP_NO_PART(groupId, dossierTemplateNo, dossierPartNo);

		_log.info("****FileEntryId ==== : " + fileEntryId);
		
		_log.info("****End uploadFile file at:" + new Date());

		Date now = new Date();

		User userAction = null;

		if (userId != 0) {
			userAction = userLocalService.getUser(userId);
		}

		long dossierFileId = counterLocalService.increment(DossierFile.class.getName());

		DossierFile object = dossierFilePersistence.create(dossierFileId);

		// Add audit fields
		object.setCompanyId(serviceContext.getCompanyId());
		object.setGroupId(groupId);
		object.setCreateDate(now);
		object.setModifiedDate(now);
		object.setUserId(Validator.isNotNull(userAction) ? userAction.getUserId() : 0l);
		object.setUserName(Validator.isNotNull(userAction) ? userAction.getFullName() : StringPool.BLANK);

		// Add other fields

		object.setDossierId(dossierId);
		if (Validator.isNull(referenceUid)) {
			referenceUid = PortalUUIDUtil.generate();
		}

		object.setReferenceUid(referenceUid);
		object.setDossierTemplateNo(dossierTemplateNo);
		object.setFileEntryId(fileEntryId);
		object.setDossierPartNo(dossierPartNo);
		object.setFileTemplateNo(fileTemplateNo);
		object.setDossierPartType(dossierPart.getPartType());

		if (Validator.isNull(displayName)) {
			displayName = sourceFileName;
		}

		if (Validator.isNotNull(dossierPart.getFormScript())) {
			object.setEForm(true);
			object.setFormScript(dossierPart.getFormScript());
		}

		if (Validator.isNotNull(dossierPart.getFormReport())) {
			object.setFormReport(dossierPart.getFormReport());
		}
		_log.info("****Start autofill file at:" + new Date());

		if (Validator.isNotNull(dossierPart.getSampleData())) {
			String formData = AutoFillFormData.sampleDataBinding(dossierPart.getSampleData(), dossierId, serviceContext);
			//Comment by Dungnv
			//object.setFormData(formData);
			if(!formData.isEmpty()) {
				long fileEntryIdFormData = 0;
				try {
					FileEntry fileEntry = com.fds.vr.service.util.FileUploadUtils.uploadFileJSON(JSONFactoryUtil.createJSONObject(formData), serviceContext);

					fileEntryIdFormData = fileEntry.getFileEntryId();
				} catch (Exception e) {
					_log.error(e);
				}
				object.setFormDataDossierFile(fileEntryIdFormData);
			}
		}
		_log.info("****End autofill file at:" + new Date());

		object.setDisplayName(displayName);
		object.setOriginal(true);
		
		if (Boolean.parseBoolean(isSync)) {
			object.setIsNew(true);
		}
		
		String deliverableCode = PwdGenerator.getPassword(10);
		
		if (Validator.isNotNull(dossierPart.getDeliverableType())) {
			object.setDeliverableCode(deliverableCode);
		}

		dossierActionId = dossierPart.getPartType() > 1 ? dossierActionId : 0;
		object.setDossierActionId(dossierActionId);

		return dossierFilePersistence.update(object);
	}
	//========

	public static Map<String, Object> toMap(JSONObject object) throws JSONException {
		Map<String, Object> map = new HashMap<String, Object>();

		Iterator<String> keysItr = object.keys();
		while (keysItr.hasNext()) {
			String key = keysItr.next();
			Object value = null;
			if (Validator.isNotNull(object.getJSONArray(key))) {
				value = (JSONArray) object.getJSONArray(key);
				map.put(key, value);
			}

			else if (Validator.isNotNull(object.getJSONObject(key))) {
				value = (JSONObject) object.getJSONObject(key);
				map.put(key, value);
			}

			else {
				value = object.getString(key);
				map.put(key, value);
			}
		}
		return map;
	}

	public static List<Object> toList(JSONArray array) throws JSONException {
		List<Object> list = new ArrayList<Object>();
		for (int i = 0; i < array.length(); i++) {
			Object value = array.getJSONObject(i);

			if (value instanceof JSONObject) {
				value = toMap((JSONObject) value);
			}
			list.add(value);
		}
		return list;
	}

	/**
	 * POST /dossiers/{id}/files/copyfile
	 * 
	 * @param groupId
	 * @param dossierId
	 * @param dossierFileId
	 * @param dossierTemplateNo
	 * @param dossierPartNo
	 * @param serviceContext
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DossierFile cloneDossierFile(long groupId, long dossierId, long dossierFileId, String dossierTemplateNo,
			String dossierPartNo, ServiceContext serviceContext) throws PortalException, SystemException {

		DossierFile sourceDossierFile = dossierFilePersistence.findByPrimaryKey(dossierFileId);

		User user = userPersistence.findByPrimaryKey(serviceContext.getUserId());

		DossierPart dossierPart = dossierPartPersistence.findByTP_NO_PART(groupId, dossierTemplateNo, dossierPartNo);

		long fileEntryId = 0;

		if (sourceDossierFile.getFileEntryId() > 0) {
			try {
				FileEntry fileEntry = FileUploadUtils.cloneDossierFile(user.getPrimaryKey(), groupId,
						sourceDossierFile.getFileEntryId(), serviceContext);

				fileEntryId = fileEntry.getFileEntryId();
			} catch (Exception e) {
				throw new SystemException(e);
			}
		}

		long newDossierFileId = counterLocalService.increment(DossierFile.class.getName());

		DossierFile object = dossierFilePersistence.create(newDossierFileId);

		Date now = new Date();

		// Add audit fields
		object.setCompanyId(serviceContext.getCompanyId());
		object.setGroupId(groupId);
		object.setCreateDate(now);
		object.setModifiedDate(now);
		object.setUserId(user.getPrimaryKey());
		object.setUserName(user.getFullName());

		// Add other fields

		object.setDossierId(dossierId);
		object.setReferenceUid(PortalUUIDUtil.generate());
		object.setDossierTemplateNo(dossierTemplateNo);
		object.setFileEntryId(fileEntryId);
		object.setDossierPartNo(dossierPartNo);
		object.setFileTemplateNo(sourceDossierFile.getFileTemplateNo());
		object.setDossierPartType(dossierPart.getPartType());
		object.setDisplayName(sourceDossierFile.getDisplayName());
		//Add by Dungnv
		long fileEntryIdFormData = 0;
		try {
			FileEntry fileEntry = com.fds.vr.service.util.FileUploadUtils.uploadFileJSON(JSONFactoryUtil.createJSONObject(sourceDossierFile.getFormData()), serviceContext);

			fileEntryIdFormData = fileEntry.getFileEntryId();
		} catch (Exception e) {
			_log.error(e);
		}
		object.setFormDataDossierFile(fileEntryIdFormData);
		//Comment by Dungnv
		//object.setFormData(sourceDossierFile.getFormData());
		object.setOriginal(false);
		object.setIsNew(true);
		object.setFormScript(sourceDossierFile.getFormScript());
		object.setFormReport(sourceDossierFile.getFormReport());

		return dossierFilePersistence.update(object);
	}

	/**
	 * for POST /dossiers/{id}/cloning
	 * 
	 * @param groupId
	 * @param newDossierId
	 * @param oldDossierId
	 * @param dossierPartType
	 * @param serviceContext
	 * @throws PortalException
	 * @throws SystemException
	 */
	public void cloneDossierFilesByDossierId(long groupId, long newDossierId, long oldDossierId, int dossierPartType,
			ServiceContext serviceContext) throws PortalException, SystemException {

		List<DossierFile> dossierFiles = dossierFileLocalService.getDossierFilesByD_DP(oldDossierId, dossierPartType);

		for (DossierFile dossierFile : dossierFiles) {
			cloneDossierFile(groupId, newDossierId, dossierFile.getDossierFileId(), dossierFile.getDossierTemplateNo(),
					dossierFile.getDossierPartNo(), serviceContext);
		}
	}

	/**
	 * POST /dossiers/{id|referenceUid}/files/{referenceUid}
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DossierFile updateDossierFile(long groupId, long dossierId, String referenceUid, String displayName,
			String sourceFileName, InputStream inputStream, ServiceContext serviceContext)
			throws PortalException, SystemException {

		long userId = serviceContext.getUserId();

		DossierFile dossierFile = dossierFileLocalService.getDossierFileByReferenceUid(dossierId, referenceUid);

		long fileEntryId = 0;

		try {
			FileEntry fileEntry = FileUploadUtils.uploadDossierFile(userId, groupId, dossierFile.getFileEntryId(),
					inputStream, sourceFileName, null, 0, serviceContext);

			if (fileEntry != null) {
				fileEntryId = fileEntry.getFileEntryId();
			}
		} catch (Exception e) {
			throw new SystemException(e);
		}

		Date now = new Date();

		User userAction = userLocalService.getUser(userId);

		// Add audit fields
		dossierFile.setModifiedDate(now);
		dossierFile.setUserId(userAction.getUserId());
		dossierFile.setUserName(userAction.getFullName());

		// Add other fields

		dossierFile.setDossierId(dossierId);
		if (Validator.isNull(referenceUid)) {
			referenceUid = PortalUUIDUtil.generate();
		}

		dossierFile.setFileEntryId(fileEntryId);
		if (Validator.isNull(displayName)) {
			displayName = sourceFileName;
		}

		dossierFile.setDisplayName(displayName);
		dossierFile.setOriginal(true);
		dossierFile.setIsNew(true);

		return dossierFilePersistence.update(dossierFile);
	}
	
	//Dungnv: Sync theo co che 1 server
	@Indexable(type = IndexableType.REINDEX)
	public DossierFile updateDossierFileBySingleServer(long groupId, long dossierId, String referenceUid, String displayName,
			String sourceFileName, long fileEntryId, ServiceContext serviceContext)
			throws PortalException, SystemException {

		long userId = serviceContext.getUserId();

		DossierFile dossierFile = dossierFileLocalService.getDossierFileByReferenceUid(dossierId, referenceUid);

		Date now = new Date();

		User userAction = userLocalService.getUser(userId);

		// Add audit fields
		dossierFile.setModifiedDate(now);
		dossierFile.setUserId(userAction.getUserId());
		dossierFile.setUserName(userAction.getFullName());

		// Add other fields

		dossierFile.setDossierId(dossierId);
		if (Validator.isNull(referenceUid)) {
			referenceUid = PortalUUIDUtil.generate();
		}

		dossierFile.setFileEntryId(fileEntryId);
		if (Validator.isNull(displayName)) {
			displayName = sourceFileName;
		}

		dossierFile.setDisplayName(displayName);
		dossierFile.setOriginal(true);
		dossierFile.setIsNew(true);

		return dossierFilePersistence.update(dossierFile);
	}
	//==

	@Indexable(type = IndexableType.REINDEX)
	public DossierFile updateFormData(long groupId, long dossierId, long dossierActionId, String referenceUid, String formData,
			ServiceContext serviceContext) throws PortalException, SystemException {

		try {
			long now = System.currentTimeMillis();
			//
			DossierFile dossierFile = dossierFilePersistence.fetchByD_RUID(dossierId, referenceUid, false);
	
			String jrxmlTemplate = dossierFile != null ? dossierFile.getFormReport() : StringPool.BLANK;
	
			if (Validator.isNull(jrxmlTemplate)) {
				DossierPart dossierPart = dossierPartLocalService.fetchByTemplatePartNo(groupId,
						dossierFile.getDossierTemplateNo(), dossierFile.getDossierPartNo());
	
				if (dossierPart == null) {
					throw new NoSuchDossierPartException();
				}
	
				jrxmlTemplate = dossierPart.getFormReport();
			}
	
			// NEW_DOSSIER
			//FileEntry fileEntry = null;
			try {
				ServiceContext serviceContextFile = new ServiceContext();
				long userId = 20164;
				long companyId = 20116;
				
				serviceContextFile.setUserId(userId);
				serviceContextFile.setCompanyId(companyId);
				serviceContextFile.setScopeGroupId(groupId);
				
				//_log.info("NEW CODE FILES_FROM_FORM_UPDATEDDDDD: "+(System.currentTimeMillis() - now));
				DossierFileUtils fileUtils = new DossierFileUtils();
				
				fileUtils.uploadFileEntry(userId, groupId, formData, "FORM_FILE_DATA_STORE",
						serviceContextFile);
				//FileEntry fileEntry = fileUtils.uploadFileEntry(userId, groupId, formData, "FORM_FILE_DATA_STORE",
				//		serviceContextFile);
				//String urlFile = fileUtils.getFileContent(fileEntry.getFileEntryId());
				//_log.info(urlFile);
				//_log.info("SEND TO UPLOAD FILE ENTRY END: "+(System.currentTimeMillis() - now));
				
			} catch (Exception e) {
				_log.debug(e);
			}
	
			long userActionId = serviceContext.getUserId();
			User userAction = null;
			if (userActionId != 0) {
				userAction = userLocalService.getUser(userActionId);
			}
	
			//DossierFile dossierFileAction = dossierFilePersistence.fetchByF_DID_REF_DAID(dossierId, referenceUid, dossierActionId);
			DossierFile dossierFileAction = dossierFilePersistence.fetchByDID_REF(dossierId, referenceUid);
			if (dossierFileAction == null) {
				long dossierFileId = counterLocalService.increment(DossierFile.class.getName());
				dossierFileAction = dossierFilePersistence.create(dossierFileId);

				dossierFileAction.setCompanyId(serviceContext.getCompanyId());
				dossierFileAction.setGroupId(groupId);
				dossierFileAction.setDossierFileId(dossierFileId);
				dossierFileAction.setCreateDate(new Date());
				dossierFileAction.setModifiedDate(new Date());
				dossierFileAction.setUserId(userActionId);
				dossierFileAction.setUserName(Validator.isNotNull(userAction) ? userAction.getFullName() : StringPool.BLANK);
				dossierFileAction.setReferenceUid(PortalUUIDUtil.generate());
				dossierFileAction.setIsNew(true);
				dossierFileAction.setOriginal(true);
				dossierFileAction.setDossierActionId(dossierActionId);
				dossierFileAction.setFormReport(jrxmlTemplate);
				//Add by Dungnv
				long fileEntryIdFormData = 0;
				try {
					FileEntry fileEntry = com.fds.vr.service.util.FileUploadUtils.uploadFileJSON(JSONFactoryUtil.createJSONObject(formData), serviceContext);

					fileEntryIdFormData = fileEntry.getFileEntryId();
				} catch (Exception e) {
					_log.error(e);
				}
				dossierFileAction.setFormDataDossierFile(fileEntryIdFormData);
				//Comment by Dungnv
				//dossierFileAction.setFormData(formData);
				dossierFileAction.setDossierId(dossierId);
				//Generate referenceUid
				String referenceUidAction = PortalUUIDUtil.generate();
				dossierFileAction.setReferenceUid(referenceUidAction);
	
				dossierFileAction.setDossierTemplateNo(dossierFile.getDossierTemplateNo());
	//			object.setFileEntryId(fileEntryId);
				dossierFileAction.setDossierPartNo(dossierFile.getDossierPartNo());
				dossierFileAction.setFileTemplateNo(dossierFile.getFileTemplateNo());
				dossierFileAction.setDossierPartType(dossierFile.getDossierPartType());
				dossierFileAction.setEForm(true);
				dossierFileAction.setDeliverableCode(dossierFile.getDeliverableCode());
				dossierFileAction.setDisplayName(dossierFile.getDisplayName());
				dossierFileAction.setFormScript(dossierFile.getFormScript());
	
				dossierFileAction = dossierFilePersistence.update(dossierFileAction);
			} else {
				dossierFile.setFormReport(jrxmlTemplate);
				//Add by Dungnv
				if(!formData.isEmpty()) {
					long fileEntryIdFormData = 0;
					try {
						FileEntry fileEntry = com.fds.vr.service.util.FileUploadUtils.uploadFileJSON(JSONFactoryUtil.createJSONObject(formData), serviceContext);

						fileEntryIdFormData = fileEntry.getFileEntryId();
					} catch (Exception e) {
						_log.error(e);
					}
					dossierFile.setFormDataDossierFile(fileEntryIdFormData);
				}
				//Comment by Dungnv
				//dossierFile.setFormData(formData);
				dossierFile.setIsNew(true);
	
				dossierFile = dossierFilePersistence.update(dossierFile);
			}
	
			// Binhth add message bus to processing jasper file
			Message message = new Message();
	
			JSONObject msgData = JSONFactoryUtil.createJSONObject();
			msgData.put("className", DossierFile.class.getName());
			msgData.put("classPK",
					dossierFileAction != null ? dossierFileAction.getDossierFileId() : dossierFile.getDossierFileId());
			msgData.put("jrxmlTemplate", jrxmlTemplate);
			msgData.put("formData", formData);
			msgData.put("userId", serviceContext.getUserId());
	
			message.put("msgToEngine", msgData);
			MessageBusUtil.sendMessage("jasper/engine/out/destination", message);
	
			_log.info("SEND TO CREATED FILE MODEL END: "+(System.currentTimeMillis() - now));

			return dossierFile;
		} catch (Exception e) {
			_log.error(e);
			return null;
		}
	}

	//@Indexable(type = IndexableType.REINDEX)
	public DossierFile updateFormDataPlugin(long groupId, long dossierId, String referenceUid, String formData,
			ServiceContext serviceContext) throws PortalException, SystemException {

		long now = System.currentTimeMillis();
		//
		DossierFile dossierFile = dossierFilePersistence.findByDID_REF(dossierId, referenceUid);

		String jrxmlTemplate = dossierFile.getFormReport();

		if (Validator.isNull(jrxmlTemplate)) {
			DossierPart dossierPart = dossierPartLocalService.fetchByTemplatePartNo(groupId,
					dossierFile.getDossierTemplateNo(), dossierFile.getDossierPartNo());

			if (dossierPart == null) {
				throw new NoSuchDossierPartException();
			}

			jrxmlTemplate = dossierPart.getFormReport();
		}
		// NEW_DOSSIER
		try {
			
			ServiceContext serviceContextFile = new ServiceContext();
			long userId = 20164;
			long companyId = 20116;
			
			serviceContextFile.setUserId(userId);
			serviceContextFile.setCompanyId(companyId);
			serviceContextFile.setScopeGroupId(groupId);

			DossierFileUtils fileUtils = new DossierFileUtils();

			fileUtils.uploadFileEntry(userId, groupId, formData, "FORM_FILE_DATA_STORE",
					serviceContextFile);

		} catch (Exception e) {
			_log.debug(e);
		}

		_log.info("SEND TO CREATED FILE MODEL END: "+(System.currentTimeMillis() - now));
		
		long userActionId = serviceContext.getUserId();
		User userAction = null;
		if (userActionId != 0) {
			userAction = userLocalService.getUser(userActionId);
		}
		if (userActionId != dossierFile.getUserId()) {
			// add new Dossier File
			long dossierFileId = counterLocalService.increment(DossierFile.class.getName());
			DossierFile newDossierFile = dossierFilePersistence.create(dossierFileId);

			newDossierFile.setDossierFileId(dossierFileId);
			newDossierFile.setCreateDate(new Date());
			newDossierFile.setModifiedDate(new Date());
			newDossierFile.setUserId(userActionId);
			newDossierFile.setUserName(Validator.isNotNull(userAction) ? userAction.getFullName() : StringPool.BLANK);
			newDossierFile.setReferenceUid(PortalUUIDUtil.generate());
			newDossierFile.setIsNew(true);
			dossierFile.setFormReport(jrxmlTemplate);
			if(!formData.isEmpty()) {
				long fileEntryIdFormData = 0;
				try {
					FileEntry fileEntry = com.fds.vr.service.util.FileUploadUtils.uploadFileJSON(JSONFactoryUtil.createJSONObject(formData), serviceContext);

					fileEntryIdFormData = fileEntry.getFileEntryId();
				} catch (Exception e) {
					_log.error(e);
				}
				dossierFile.setFormDataDossierFile(fileEntryIdFormData);
			}
			//Comment by Dungnv
			//dossierFile.setFormData(formData);
			newDossierFile.setOriginal(true);

			_log.info("SEND TO CREATED NEW DOSSIER FILE 111: "+(System.currentTimeMillis() - now));
			return dossierFilePersistence.update(newDossierFile);
		} else {
			dossierFile.setFormReport(jrxmlTemplate);
			if(!formData.isEmpty()) {
				long fileEntryIdFormData = 0;
				try {
					FileEntry fileEntry = com.fds.vr.service.util.FileUploadUtils.uploadFileJSON(JSONFactoryUtil.createJSONObject(formData), serviceContext);

					fileEntryIdFormData = fileEntry.getFileEntryId();
				} catch (Exception e) {
					_log.error(e);
				}
				dossierFile.setFormDataDossierFile(fileEntryIdFormData);
			}
			//Comment by Dungnv
			//dossierFile.setFormData(formData);
			dossierFile.setIsNew(true);

			_log.info("SEND TO CREATED UPDATE DOSSIER FILE 2222: "+(System.currentTimeMillis() - now));
			return dossierFilePersistence.update(dossierFile);
		}
	}

	@Indexable(type = IndexableType.DELETE)
	public DossierFile deleteDossierFile(long dossierFileId) throws PortalException {
		DossierFile dossierFile = dossierFilePersistence.findByPrimaryKey(dossierFileId);

		return deleteDossierFile(dossierFile);
	}

	@Indexable(type = IndexableType.REINDEX)
	public DossierFile removeDossierFile(long dossierId, String referenceUid, ServiceContext serviceContext)
			throws PortalException {
		User user = userPersistence.findByPrimaryKey(serviceContext.getUserId());

		DossierFile dossierFile = dossierFileLocalService.getDossierFileByReferenceUid(dossierId, referenceUid);

		Date now = new Date();

		dossierFile.setUserId(user.getUserId());
		dossierFile.setModifiedDate(now);
		dossierFile.setRemoved(true);
		dossierFile.setUserName(user.getFullName());
		
		//set submitting = true
		dossierFile.setIsNew(true);

		return dossierFileLocalService.updateDossierFile(dossierFile);
	}

	@Indexable(type = IndexableType.DELETE)
	public DossierFile deleteDossierFile(long dossierId, String referenceUid) throws PortalException {
		DossierFile dossierFile = dossierFileLocalService.getDossierFileByReferenceUid(dossierId, referenceUid);
		return deleteDossierFile(dossierFile);
	}

	@Indexable(type = IndexableType.REINDEX)
	public DossierFile resetDossierFile(long dossierFileId) {
		DossierFile dossierFile = dossierFilePersistence.fetchByPrimaryKey(dossierFileId);

		dossierFile.setIsNew(false);

		dossierFilePersistence.update(dossierFile);

		return dossierFile;
	}

	@Indexable(type = IndexableType.DELETE)
	public DossierFile deleteDossierFile(DossierFile dossierFile) throws PortalException {

		// TODO: validate remove delete dossier file
		validateDeleteDossierFile(dossierFile);

		dossierFile.setModifiedDate(new Date());
		dossierFile.setRemoved(true);

		return dossierFilePersistence.update(dossierFile);
	}

	@Indexable(type = IndexableType.DELETE)
	public DossierFile deletePermanentDossierFile(DossierFile dossierFile) {

		return dossierFilePersistence.remove(dossierFile);
	}

	public List<DossierFile> getDossierFilesByDossierId(long dossierId) {

		return dossierFilePersistence.findByDossierId(dossierId, false);

	}

	// Get all dossierFile by dossierId
	public List<DossierFile> getAllDossierFile(long dossierId) {

		return dossierFilePersistence.findByDID_(dossierId);

	}

	// Get all dossierFile by dossierId
	public List<DossierFile> getByReferenceUid(String referenceUid) {

		return dossierFilePersistence.findByREF_UID(referenceUid);

	}

	public List<DossierFile> getDossierFilesByD_DP(long dossierId, int dossierPartType) {
		return dossierFilePersistence.findByD_DPT(dossierId, dossierPartType, false);
	}

	// TODO: POST /dossiers/{id|referenceUid}/files/{referenceUid}

	public DossierFile getDossierFileByReferenceUid(long dossierId, String referenceUid) {

		return dossierFilePersistence.fetchByDID_REF(dossierId, referenceUid);
	}

	public Hits searchLucene(LinkedHashMap<String, Object> params, Sort[] sorts, int start, int end,
			SearchContext searchContext) throws ParseException, SearchException {

		String keywords = (String) params.get(Field.KEYWORD_SEARCH);
		String groupId = (String) params.get(Field.GROUP_ID);

		Indexer<DossierFile> indexer = IndexerRegistryUtil.nullSafeGetIndexer(DossierFile.class);

		searchContext.addFullQueryEntryClassName(CLASS_NAME);
		searchContext.setEntryClassNames(new String[] { CLASS_NAME });
		searchContext.setAttribute("paginationType", "regular");
		searchContext.setLike(true);
		searchContext.setStart(start);
		searchContext.setEnd(end);
		searchContext.setAndSearch(true);
		searchContext.setSorts(sorts);

		BooleanQuery booleanQuery = null;

		if (Validator.isNotNull(keywords)) {
			booleanQuery = BooleanQueryFactoryUtil.create(searchContext);
		} else {
			booleanQuery = indexer.getFullQuery(searchContext);
		}

		if (Validator.isNotNull(keywords)) {

			String[] keyword = keywords.split(StringPool.SPACE);

			for (String string : keyword) {

				MultiMatchQuery query = new MultiMatchQuery(string);

				query.addFields(DossierFileTerm.FILE_TEMPLATE_NO);

				booleanQuery.add(query, BooleanClauseOccur.MUST);

			}
		}

		if (Validator.isNotNull(groupId)) {
			MultiMatchQuery query = new MultiMatchQuery(groupId);

			query.addFields(Field.GROUP_ID);

			booleanQuery.add(query, BooleanClauseOccur.MUST);
		}

		String fileTemplateNo = GetterUtil.getString(params.get(DossierFileTerm.FILE_TEMPLATE_NO));
		String dossierPartType = GetterUtil.getString(params.get(DossierFileTerm.DOSSIER_PART_TYPE));
		String user_id = GetterUtil.getString(params.get(DossierFileTerm.USER_ID));
		String original = GetterUtil.getString(params.get(DossierFileTerm.ORIGINAL));
		String removed = GetterUtil.getString(params.get(DossierFileTerm.REMOVED));

		if (Validator.isNotNull(fileTemplateNo)) {
			MultiMatchQuery query = new MultiMatchQuery(fileTemplateNo);

			query.addFields(DossierFileTerm.FILE_TEMPLATE_NO);

			booleanQuery.add(query, BooleanClauseOccur.MUST);
		}

		if (Validator.isNotNull(dossierPartType)) {
			MultiMatchQuery query = new MultiMatchQuery(dossierPartType);

			query.addFields(DossierFileTerm.DOSSIER_PART_TYPE);

			booleanQuery.add(query, BooleanClauseOccur.MUST);
		}

		if (Validator.isNotNull(user_id)) {
			MultiMatchQuery query = new MultiMatchQuery(user_id);

			query.addFields(DossierFileTerm.USER_ID);

			booleanQuery.add(query, BooleanClauseOccur.MUST);
		}

		if (Validator.isNotNull(original)) {
			MultiMatchQuery query = new MultiMatchQuery(original);

			query.addFields(DossierFileTerm.ORIGINAL);

			booleanQuery.add(query, BooleanClauseOccur.MUST);
		}

		if (Validator.isNotNull(removed)) {
			MultiMatchQuery query = new MultiMatchQuery(removed);

			query.addFields(DossierFileTerm.REMOVED);

			booleanQuery.add(query, BooleanClauseOccur.MUST);
		}

		booleanQuery.addRequiredTerm(Field.ENTRY_CLASS_NAME, CLASS_NAME);

		return IndexSearcherHelperUtil.search(searchContext, booleanQuery);
	}

	public long countLucene(LinkedHashMap<String, Object> params, SearchContext searchContext)
			throws ParseException, SearchException {

		String keywords = (String) params.get(Field.KEYWORD_SEARCH);
		String groupId = (String) params.get(Field.GROUP_ID);

		Indexer<DossierFile> indexer = IndexerRegistryUtil.nullSafeGetIndexer(DossierFile.class);

		searchContext.addFullQueryEntryClassName(CLASS_NAME);
		searchContext.setEntryClassNames(new String[] { CLASS_NAME });
		searchContext.setAttribute("paginationType", "regular");
		searchContext.setLike(true);
		searchContext.setAndSearch(true);

		BooleanQuery booleanQuery = null;

		if (Validator.isNotNull(keywords)) {
			booleanQuery = BooleanQueryFactoryUtil.create(searchContext);
		} else {
			booleanQuery = indexer.getFullQuery(searchContext);
		}

		if (Validator.isNotNull(keywords)) {

			String[] keyword = keywords.split(StringPool.SPACE);

			for (String string : keyword) {

				MultiMatchQuery query = new MultiMatchQuery(string);

				query.addFields(DossierFileTerm.FILE_TEMPLATE_NO);

				booleanQuery.add(query, BooleanClauseOccur.MUST);

			}
		}

		if (Validator.isNotNull(groupId)) {
			MultiMatchQuery query = new MultiMatchQuery(groupId);

			query.addFields(Field.GROUP_ID);

			booleanQuery.add(query, BooleanClauseOccur.MUST);
		}

		String fileTemplateNo = GetterUtil.getString(params.get(DossierFileTerm.FILE_TEMPLATE_NO));
		String dossierPartType = GetterUtil.getString(params.get(DossierFileTerm.DOSSIER_PART_TYPE));
		String user_id = GetterUtil.getString(params.get(DossierFileTerm.USER_ID));
		String original = GetterUtil.getString(params.get(DossierFileTerm.ORIGINAL));
		String removed = GetterUtil.getString(params.get(DossierFileTerm.REMOVED));

		if (Validator.isNotNull(fileTemplateNo)) {
			MultiMatchQuery query = new MultiMatchQuery(fileTemplateNo);

			query.addFields(DossierFileTerm.FILE_TEMPLATE_NO);

			booleanQuery.add(query, BooleanClauseOccur.MUST);
		}

		if (Validator.isNotNull(dossierPartType)) {
			MultiMatchQuery query = new MultiMatchQuery(dossierPartType);

			query.addFields(DossierFileTerm.DOSSIER_PART_TYPE);

			booleanQuery.add(query, BooleanClauseOccur.MUST);
		}

		if (Validator.isNotNull(user_id)) {
			MultiMatchQuery query = new MultiMatchQuery(user_id);

			query.addFields(DossierFileTerm.USER_ID);

			booleanQuery.add(query, BooleanClauseOccur.MUST);
		}

		if (Validator.isNotNull(original)) {
			MultiMatchQuery query = new MultiMatchQuery(original);

			query.addFields(DossierFileTerm.ORIGINAL);

			booleanQuery.add(query, BooleanClauseOccur.MUST);
		}

		if (Validator.isNotNull(removed)) {
			MultiMatchQuery query = new MultiMatchQuery(removed);

			query.addFields(DossierFileTerm.REMOVED);

			booleanQuery.add(query, BooleanClauseOccur.MUST);
		}

		booleanQuery.addRequiredTerm(Field.ENTRY_CLASS_NAME, CLASS_NAME);

		return IndexSearcherHelperUtil.searchCount(searchContext, booleanQuery);
	}

	public List<DossierFile> getByDossierIdAndIsNew(long dossierId, boolean isNew) {
		return dossierFilePersistence.findByDID_ISN(dossierId, isNew, false);
	}

	/**
	 * Deny if status of dossier not new or waiting
	 * 
	 * @param dossierFile
	 * @throws PortalException
	 */
	private void validateDeleteDossierFile(DossierFile dossierFile) throws PortalException {

		Dossier dossier = dossierPersistence.fetchByPrimaryKey(dossierFile.getDossierId());

		if (dossier != null) {
			if (Validator.isNotNull(dossier.getDossierStatus()) && (!dossier.getDossierStatus().equalsIgnoreCase("new")
					|| !dossier.getDossierStatus().equalsIgnoreCase("waiting"))) {

				throw new InvalidDossierStatusException();
			}
		}
	}

	private void validateAddDossierFile(long groupId, long dossierId, String referenceUid, String dossierTemplateNo,
			String dossierPartNo, String fileTemplateNo) throws PortalException {

		// TODO add more logic here

		//dossierPersistence.findByPrimaryKey(dossierId);

		if (Validator.isNotNull(referenceUid)) {
			//DossierFile dossierFile = dossierFilePersistence.fetchByD_RUID(dossierId, referenceUid, false);
			DossierFile dossierFile = null;
			if (dossierFile != null) {
				throw new DuplicateDossierFileException("dossierId= " + dossierId + "|referenceUid=" + referenceUid);
			}
		}
	}

	public List<DossierFile> getDossierFileByDID_DPNO(long dossierId, String dossierPartNo, boolean removed) {
		return dossierFilePersistence.findByDID_DPNO(dossierId, dossierPartNo, removed);
	}
	
	public List<DossierFile> getDossierFileByDID_FTN(long dossierId, String fileTemplateNo) {
		return dossierFilePersistence.findByDID_FTN(dossierId, fileTemplateNo);
	}

	public DossierFile getDossierFileByDID_FTNO_DPT_First(long dossierId, String fileTemplateNo, int dossierPartType,
			boolean removed, OrderByComparator orderByComparator) throws NoSuchDossierFileException {
		try {
			return dossierFilePersistence.findByDID_FTNO_DPT_First(dossierId, fileTemplateNo, dossierPartType, removed,
					orderByComparator);
		} catch (NoSuchDossierFileException e) {
			_log.debug(e);
			return null;
		}
	}

	public List<DossierFile> getDossierFileByDID_FTNO(long dossierId, String fileTemplateNo, boolean removed) {
		return dossierFilePersistence.findByDID_FTNO(dossierId, fileTemplateNo, removed);
	}

	public DossierFile getDossierFileByDID_FTNO_First(long dossierId, String fileTemplateNo, boolean removed,
			OrderByComparator orderByComparator) {
		return dossierFilePersistence.fetchByDID_FTNO_First(dossierId, fileTemplateNo, removed, orderByComparator);
	}

	public List<DossierFile> getDossierFileByDID_FTNO_DPT(long dossierId, String fileTemplateNo, int dossierPartType,
			boolean removed) {
		return dossierFilePersistence.findByDID_FTNO_DPT(dossierId, fileTemplateNo, dossierPartType, removed);
	}

	public List<DossierFile> getDossierFileByDID_FTNO_DPT(long dossierId, String fileTemplateNo, int dossierPartType,
			boolean removed, int start, int end, OrderByComparator orderByComparator) {
		return dossierFilePersistence.findByDID_FTNO_DPT(dossierId, fileTemplateNo, dossierPartType, removed, start,
				end, orderByComparator);
	}

	public List<DossierFile> getDossierFileByDID_FTNO_DPT_NOT_NULL_FID(long dossierId, String fileTemplateNo,
			int dossierPartType, long fileEntryId, boolean removed) {
		return dossierFilePersistence.findByDID_FTNO_DPT_NOT_NULL_FID(dossierId, fileTemplateNo, dossierPartType,
				fileEntryId, removed);
	}

	public int countDossierFileByDID_FTNO_DPT_NOT_NULL_FID(long dossierId, String fileTemplateNo,
			int dossierPartType, long fileEntryId, boolean removed) {
		return dossierFilePersistence.countByDID_FTNO_DPT_NOT_NULL_FID(dossierId, fileTemplateNo, dossierPartType, fileEntryId, removed);
	}

	public List<DossierFile> getDossierFileByDID_FTNO_DPT_NOT_NULL_FID(long dossierId, String fileTemplateNo,
			int dossierPartType, long fileEntryId, boolean removed, int start, int end,
			OrderByComparator orderByComparator) {
		return dossierFilePersistence.findByDID_FTNO_DPT_NOT_NULL_FID(dossierId, fileTemplateNo, dossierPartType,
				fileEntryId, removed, start, end, orderByComparator);
	}

	/**
	 * Get dossierFile by deliverable Code using output DB
	 */
	public DossierFile getByDeliverableCode(String deliverableCode) {
		try {
			return dossierFilePersistence.findByDE_CODE(deliverableCode);
		} catch (Exception e) {
			return null;
		}
	}

	//TODO: get follow PPC
	public DossierFile getByFileTemplateNo(long id, String fileTemplateNo) {
		try {
			return deliverableFinder.findFileTemplateNo(id, fileTemplateNo);
		} catch (Exception e) {
			return null;
		}
	}

	//Get dossierFile follow fileEntryId
	public DossierFile getByFileEntryId(long fileEntryId) {
		return dossierFilePersistence.fetchByFILE_ID(fileEntryId);
	}

	public List<DossierFile> getByTemplateNoAndIsNew(long dossierId, boolean isNew, String[] fileTemplateNoArr) {
		return dossierFilePersistence.findByDID_ISN_TEMP(dossierId, isNew, fileTemplateNoArr);
	}

	public DossierFile getByF_DID_REF_DAID(long dossierId, String referenceUid, long dossierActionId) {
		return dossierFilePersistence.fetchByF_DID_REF_DAID(dossierId, referenceUid, dossierActionId);
	}
	
	public static final String CLASS_NAME = DossierFile.class.getName();
}