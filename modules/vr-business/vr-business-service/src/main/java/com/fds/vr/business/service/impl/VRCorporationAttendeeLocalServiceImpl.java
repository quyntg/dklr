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

import aQute.bnd.annotation.ProviderType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;


import com.fds.vr.business.action.util.ConvertJONObjectUtils;
import com.fds.vr.business.model.VRCorporationAttendee;
import com.fds.vr.business.model.VRProductionPlant;
import com.fds.vr.business.model.impl.VRCorporationAttendeeImpl;
import com.fds.vr.business.service.VRCorporationAttendeeLocalServiceUtil;
import com.fds.vr.business.service.base.VRCorporationAttendeeLocalServiceBaseImpl;
import com.fds.vr.business.service.persistence.VRCorporationAttendeeFinder;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr corporation attendee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRCorporationAttendeeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRCorporationAttendeeLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRCorporationAttendeeLocalServiceUtil
 */
@ProviderType
public class VRCorporationAttendeeLocalServiceImpl
	extends VRCorporationAttendeeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRCorporationAttendeeLocalServiceUtil} to access the vr corporation attendee local service.
	 */
	private Log _log = LogFactoryUtil.getLog(VRVehicleTypeCertificateLocalServiceImpl.class);
	private final String PATTERN_DATE = "dd-MM-yyyy HH:mm:ss";
	private final String PATTERN_DATE_2 = "dd/MM/yyyy HH:mm:ss";
	private final String PATTERN_DATE_3 = "dd/MM/yyyy";
	
	public List<VRCorporationAttendee> findByCorporationCode(String corporationCode){
		return vrCorporationAttendeePersistence.findByCorporationCode(corporationCode);
	}
	
	public List<VRCorporationAttendee> findByManagerId(Integer managerId){
		return vrCorporationAttendeePersistence.findByManagerId(managerId);
	}
	
	public List<VRCorporationAttendee> findByLeaderId(Integer leaderId){
		return vrCorporationAttendeePersistence.findByLeaderId(leaderId);
	}
	
	public List<VRCorporationAttendee> findByApplicantIdNo(String applicantIdNo){
		return vrCorporationAttendeePersistence.findByApplicantIdNo(applicantIdNo);
	}
	
	public List<VRCorporationAttendee> findByCorporationCodeInspectionDate(String corporationCode, Date inspectionDate){
		return vrCorporationAttendeePersistence.findByCorporationCodeInspectionDate(corporationCode, inspectionDate);
	}
	
	public List<VRCorporationAttendee> findByManagerIdInspectionDate(Integer managerId, Date inspectionDate){
		return vrCorporationAttendeePersistence.findByManagerIdInspectionDate(managerId, inspectionDate);
	}
	
	public List<VRCorporationAttendee> findByInspectionDate(Integer leaderId, Date inspectionDate){
		return vrCorporationAttendeePersistence.findByLeaderIdInspectionDate(leaderId, inspectionDate);
	}
	
	public List<VRCorporationAttendee> findByApplicantIdNoInspectionDate(String applicantIdNo, Date inspectionDate){
		return vrCorporationAttendeePersistence.findByApplicantIdNoInspectionDate(applicantIdNo, inspectionDate);
	}
	
	public List<VRCorporationAttendee> findByDossierId(long dossierId){
		return vrCorporationAttendeePersistence.findByDossierId(dossierId);
	}
	
	public List<VRCorporationAttendee> findByDossierIdActivityCategory(long dossierId, String activityCatetory){
		return vrCorporationAttendeePersistence.findByDossierIdActivityCategory(dossierId, activityCatetory);
	}
	
	public List<VRCorporationAttendee> findByDossierIdAssignType(long dossierId, String assignType){
		return vrCorporationAttendeePersistence.findByDossierIdAssignType(dossierId, assignType);
	}

	public List<VRCorporationAttendee> getVRCorporationByUserId(int mtCore, long userId, String fromDateConvert, String toDateConvert) {

		return vrCorporationAttendeeFinder.findByUserId(mtCore, userId, fromDateConvert, toDateConvert);
	}

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrCorporationAttendeeFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrCorporationAttendeeFinder.countData(sql);
	}

}