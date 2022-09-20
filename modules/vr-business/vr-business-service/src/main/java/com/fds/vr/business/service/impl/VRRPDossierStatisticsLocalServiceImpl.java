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

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRRPDossierStatistics;
import com.fds.vr.business.service.base.VRRPDossierStatisticsLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the vrrp dossier statistics local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRRPDossierStatisticsLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRRPDossierStatisticsLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRRPDossierStatisticsLocalServiceUtil
 */
@ProviderType
public class VRRPDossierStatisticsLocalServiceImpl extends VRRPDossierStatisticsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRRPDossierStatisticsLocalServiceUtil} to access
	 * the vrrp dossier statistics local service.
	 */
	public List<VRRPDossierStatistics> findByDossierIdCTN(long dossierid, String dossierIdCTN)
			throws PortalException, SystemException {
		try {
			return vrrpDossierStatisticsPersistence.findByDossierIdCTN(dossierid, dossierIdCTN);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRRPDossierStatistics>();

	}

	public List<VRRPDossierStatistics> findByDossierId(long dossierid) {
		try {
			return vrrpDossierStatisticsPersistence.findByDossierId(dossierid);
		} catch (Exception e) {
			return null;
		}
	}

	public List<VRRPDossierStatistics> findByDossierNo(String DossierNo) throws PortalException, SystemException {
		try {
			return vrrpDossierStatisticsPersistence.findByDossierNo(DossierNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRRPDossierStatistics>();

	}

	public List<VRRPDossierStatistics> findByApplicantNo(String applicantNo) throws PortalException, SystemException {
		try {
			return vrrpDossierStatisticsPersistence.findByApplicantNo(applicantNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRRPDossierStatistics>();

	}

	public List<VRRPDossierStatistics> findByCorporationId(String corporationId)
			throws PortalException, SystemException {
		try {
			return vrrpDossierStatisticsPersistence.findByCorporationId(corporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRRPDossierStatistics>();

	}

	public List<VRRPDossierStatistics> findByInspectorcode(String inspectorcode)
			throws PortalException, SystemException {
		try {
			return vrrpDossierStatisticsPersistence.findByInspectorcode(inspectorcode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRRPDossierStatistics>();

	}
	
	public VRRPDossierStatistics findBydossierIdCTN(String dossierIdCTN){
		try {
			return vrrpDossierStatisticsPersistence.findByF_dossierIdCTN(dossierIdCTN);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;

	}

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrrpDossierStatisticsFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start,
				end);
	}

	public long counData(String sql) throws SystemException {

		return vrrpDossierStatisticsFinder.countData(sql);
	}
	
	public Iterator<Object[]> findDataReport(String sqlQuery) throws SystemException {
		return vrrpDossierStatisticsFinder.findDataReport(sqlQuery);
	}

	private Log _log = LogFactoryUtil.getLog(VRRPDossierStatisticsLocalServiceImpl.class);
}