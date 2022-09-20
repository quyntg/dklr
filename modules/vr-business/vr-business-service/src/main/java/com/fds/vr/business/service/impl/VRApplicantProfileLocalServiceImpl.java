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

import com.fds.vr.business.action.util.ConvertFormatDate;
import com.fds.vr.business.model.VRApplicantProfile;
import com.fds.vr.business.service.base.VRApplicantProfileLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.util.Date;
import java.util.List;

import org.opencps.datamgt.model.DictCollection;
import org.opencps.datamgt.model.DictItem;
import org.opencps.datamgt.service.DictCollectionLocalServiceUtil;
import org.opencps.datamgt.service.DictItemLocalServiceUtil;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr applicant profile local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRApplicantProfileLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRApplicantProfileLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRApplicantProfileLocalServiceUtil
 */
@ProviderType
public class VRApplicantProfileLocalServiceImpl extends VRApplicantProfileLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRApplicantProfileLocalServiceUtil} to access the
	 * vr applicant profile local service.
	 */

	public VRApplicantProfile findByApplicantCode(String applicantCode) {
		return vrApplicantProfilePersistence.fetchByapplicantCode(applicantCode);
	}

	public JSONArray findVRAppicantProfile(String sql, List<String> columnNames, List<String> dataTypes,
			Class<?> modelClazz, String modelClassName, int start, int end) throws SystemException {

		return vrApplicantProfileFinder.findVRAppicantProfile(sql, columnNames, dataTypes, modelClazz, modelClassName,
				start, end);
	}

	public long countVRAppicantProfile(String sql) throws SystemException {

		return vrApplicantProfileFinder.countVRAppicantProfile(sql);
	}

	public VRApplicantProfile adminProcessData(JSONObject objectData, long mtCore, String applicantCode) {
		VRApplicantProfile object = null;

		object = vrApplicantProfilePersistence.fetchByapplicantCode(applicantCode);
		if (object == null) {
			long vrApplicantProfileId = counterLocalService.increment(VRApplicantProfile.class.getName());

			object = vrApplicantProfilePersistence.create(vrApplicantProfileId);
		}

		Date now = new Date();
		object.setModifyDate(now);
		object.setSyncDate(now);
		try {
			DictCollection dictCollection = DictCollectionLocalServiceUtil
					.fetchByF_dictCollectionCode("ADMINISTRATIVE_REGION", 55217L);
			DictItem dictItem_City = DictItemLocalServiceUtil.fetchByF_dictItemCode(
					objectData.getString("applicantCityCode"), dictCollection.getDictCollectionId(), 55217L);
			object.setApplicantCity(dictItem_City.getItemName());

			DictItem dictItem_District = DictItemLocalServiceUtil.fetchByF_dictItemCode(
					objectData.getString("applicantDistrictCode"), dictCollection.getDictCollectionId(), 55217L);
			object.setApplicantDistrictName(dictItem_District.getItemName());

			DictItem dictItem_Ward = DictItemLocalServiceUtil.fetchByF_dictItemCode(
					objectData.getString("applicantWardCode"), dictCollection.getDictCollectionId(), 55217L);
			object.setApplicantWardName(dictItem_Ward.getItemName());
		} catch (Exception e) {
		}

		object.setMtCore(objectData.getLong("mtCore"));
		object.setMappingMA_CTY(objectData.getString("mappingMA_CTY"));
		object.setMappingTEN_CTY(objectData.getString("mappingTEN_CTY"));
		object.setMappingDIA_CHI_CTY(objectData.getString("mappingDIA_CHI_CTY"));
		object.setMappingNote(objectData.getString("mappingNote"));
		object.setMappingStatus(objectData.getString("mappingStatus"));
		object.setApplicantCode(applicantCode);
		object.setApplicantName(objectData.getString("applicantName"));
		object.setApplicantAddress(objectData.getString("applicantAddress"));
		object.setApplicantPhone(objectData.getString("applicantPhone"));
		object.setApplicantEmail(objectData.getString("applicantEmail"));
		object.setApplicantFax(objectData.getString("applicantFax"));
		object.setApplicantWebsite(objectData.getString("applicantWebsite"));
		object.setApplicantRepresentativePhone(objectData.getString("applicantRepresentativePhone"));
		object.setApplicantRepresentative(objectData.getString("applicantRepresentative"));
		object.setApplicantRepresentativeTitle(objectData.getString("applicantRepresentativeTitle"));
		object.setApplicantContactName(objectData.getString("applicantContactName"));
		object.setApplicantContactEmail(objectData.getString("applicantContactEmail"));
		object.setApplicantContactPhone(objectData.getString("applicantContactPhone"));
		object.setApplicantNationality(objectData.getString("applicantNationality"));
		object.setApplicantRegion(objectData.getString("applicantRegion"));
		object.setApplicantCityCode(objectData.getString("applicantCityCode"));
		object.setApplicantDistrictCode(objectData.getString("applicantDistrictCode"));
		object.setApplicantWardCode(objectData.getString("applicantWardCode"));
		object.setApplicantRegionCode(objectData.getString("applicantRegionCode"));
		object.setApplicantNationalityCode(objectData.getString("applicantNationalityCode"));
		object.setMarkupCorporation(objectData.getString("markupCorporation"));
		object.setCorporationId(objectData.getString("corporationId"));
		object.setMarkupDesigner(objectData.getString("markupDesigner"));
		object.setMarkupOverseasManufacturer(objectData.getString("markupOverseasManufacturer"));
		object.setMarkupDomesticsManufacturer(objectData.getString("markupDomesticsManufacturer"));
		object.setMarkupMaintainer(objectData.getString("markupMaintainer"));
		object.setMarkupImporter(objectData.getString("markupImporter"));
		object.setMarkupComponentXCG(objectData.getString("markupComponentXCG"));
		object.setMarkupComponentXMY(objectData.getString("markupComponentXMY"));
		object.setMarkupComponentXCD(objectData.getString("markupComponentXCD"));
		object.setMarkupComponentXDD(objectData.getString("markupComponentXDD"));
		object.setMarkupComponentXCN(objectData.getString("markupComponentXCN"));
		object.setMarkupComponentXCH(objectData.getString("markupComponentXCH"));
		object.setMarkupXCG(objectData.getString("markupXCG"));
		object.setMarkupXMY(objectData.getString("markupXMY"));
		object.setMarkupXCD(objectData.getString("markupXCD"));
		object.setMarkupXDD(objectData.getString("markupXDD"));
		object.setMarkupXCN(objectData.getString("markupXCN"));
		object.setMarkupXCH(objectData.getString("markupXCH"));
		object.setIssueTypeXCG(objectData.getString("issueTypeXCG"));
		object.setIssueTypeXMY(objectData.getString("issueTypeXMY"));
		object.setIssueTypeXCD(objectData.getString("issueTypeXCD"));
		object.setIssueTypeXDD(objectData.getString("issueTypeXDD"));
		object.setIssueTypeXCN(objectData.getString("issueTypeXCN"));
		object.setIssueTypeXCH(objectData.getString("issueTypeXCH"));
		object.setIssueTypeDescription(objectData.getString("issueTypeDescription"));
		object.setApplicantCeremonyDate(objectData.getString("applicantCeremonyDate"));
		object.setApplicantOperationPeriod(objectData.getString("applicantOperationPeriod"));
		object.setApplicantBusinessType(objectData.getString("applicantBusinessType"));
		object.setApplicantIdentityType(objectData.getString("applicantIdentityType"));
		object.setApplicantIdentityDescription(objectData.getString("applicantIdentityDescription"));
		object.setApplicantIdentityFileName(objectData.getString("applicantIdentityFileName"));
		object.setApplicantIdentityFileEntryId(objectData.getLong("applicantIdentityFileEntryId"));
		object.setApplicantXcgFileName(objectData.getString("applicantXcgFileName"));
		object.setApplicantXcgFileEntryId(objectData.getLong("applicantXcgFileEntryId"));
		object.setApplicantMetadata(objectData.getString("applicantMetadata"));
		object.setApplicantStatus(objectData.getString("applicantStatus"));

		object = vrApplicantProfilePersistence.update(object);

		return object;
	}

	private Log _log = LogFactoryUtil.getLog(VRApplicantProfileLocalServiceImpl.class);

}