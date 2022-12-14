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

import com.fds.vr.business.model.VRTechnicalSpec_LKXMYPart2;
import com.fds.vr.business.service.base.VRTechnicalSpec_LKXMYPart2LocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.ArrayList;
import java.util.List;

import aQute.bnd.annotation.ProviderType;
/**
 * The implementation of the vr technical spec_lkxmy part2 local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRTechnicalSpec_LKXMYPart2LocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_LKXMYPart2LocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRTechnicalSpec_LKXMYPart2LocalServiceUtil
 */
@ProviderType
public class VRTechnicalSpec_LKXMYPart2LocalServiceImpl
	extends VRTechnicalSpec_LKXMYPart2LocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRTechnicalSpec_LKXMYPart2LocalServiceUtil} to access the vr technical spec_lkxmy part2 local service.
	 */
	
	public List<VRTechnicalSpec_LKXMYPart2> findByVehicleCertificateId(long vehicleCertificateId, int start, int end) {
		return vrTechnicalSpec_LKXMYPart2Persistence.findByvehicleTypeCertificateId(vehicleCertificateId, start, end);
	}
	
	public List<VRTechnicalSpec_LKXMYPart2> findByDossierId(long dossierId, int start, int end) {
		return vrTechnicalSpec_LKXMYPart2Persistence.findBy_DossierId(dossierId, start, end);
	}
	
	public List<VRTechnicalSpec_LKXMYPart2> findByConvertAssembleId(long convertAssembleId) throws SystemException {
		try {
			return vrTechnicalSpec_LKXMYPart2Persistence.findByConvertAssembleId(convertAssembleId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_LKXMYPart2>();
		
	}
	
	public List<VRTechnicalSpec_LKXMYPart2> findByReferenceUid(String referenceUid) throws SystemException {
		try {
			return vrTechnicalSpec_LKXMYPart2Persistence.findByReferenceUid(referenceUid);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_LKXMYPart2>();
		
	}
	
	public List<VRTechnicalSpec_LKXMYPart2> findByDossierNo(String dossierNo, long mtCore) throws SystemException {
		try {
			return vrTechnicalSpec_LKXMYPart2Persistence.findByDossierNo(dossierNo, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_LKXMYPart2>();
		
	}
	
	public List<VRTechnicalSpec_LKXMYPart2> findByDossierId(long dossierId, long mtCore) throws SystemException {
		try {
			return vrTechnicalSpec_LKXMYPart2Persistence.findByDossierId(dossierId, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_LKXMYPart2>();
		
	}
	
	public List<VRTechnicalSpec_LKXMYPart2> findByDossierIdCTN(String dossierIdCTN) throws SystemException {
		try {
			return vrTechnicalSpec_LKXMYPart2Persistence.findByDossierIdCTN(dossierIdCTN);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_LKXMYPart2>();
		
	}
	
	public List<VRTechnicalSpec_LKXMYPart2> findByDeliverableCode(String deliverableCode) throws SystemException {
		try {
			return vrTechnicalSpec_LKXMYPart2Persistence.findByDeliverableCode(deliverableCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRTechnicalSpec_LKXMYPart2>();
		
	}
	
	private Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_LKXMYPart2LocalServiceImpl.class);
}