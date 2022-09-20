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

import com.fds.vr.business.model.VROutputSheetDetails;
import com.fds.vr.business.service.base.VROutputSheetDetailsLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.opencps.datamgt.utils.DateTimeUtils;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr output sheet details local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VROutputSheetDetailsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VROutputSheetDetailsLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VROutputSheetDetailsLocalServiceUtil
 */
@ProviderType
public class VROutputSheetDetailsLocalServiceImpl
	extends VROutputSheetDetailsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VROutputSheetDetailsLocalServiceUtil} to access the vr output sheet details local service.
	 */
	
	public VROutputSheetDetails updateOutputSheetDetails(long id, long mtCore, Long inputSheetId, 
			Long outputSheetId, Long bookId, Long issueVehicleCertificateId, Long certificateId,
			String certificateNumber, Date certificateDate, String vehicleClass, String stampType,
			String stampShortNo, Long serialStartNo, Long serialEndNo, Long subTotalInDocument,
			Long subTotalQuantities, Long unitPrice, Long totalAmount, Long totalInUse, Long totalNotUsed,
			Long totalLost, Long totalCancelled, Long totalReturned, String remark)
		throws PortalException, SystemException {
		
		VROutputSheetDetails outputSheetDetails = null;
		
		if(id > 0) {
			outputSheetDetails = vrOutputSheetDetailsPersistence.findByPrimaryKey(id);
		} else {
			id = counterLocalService.increment(VROutputSheetDetails.class.getName());
			outputSheetDetails = vrOutputSheetDetailsPersistence.create(id);
		}
		
		outputSheetDetails.setModifyDate(new Date());
		outputSheetDetails.setMtCore(mtCore);
		outputSheetDetails.setOutputSheetId(outputSheetId);
		
		if(Validator.isNotNull(inputSheetId))
			outputSheetDetails.setInputSheetId(inputSheetId);
		
		if(Validator.isNotNull(bookId))
			outputSheetDetails.setBookId(bookId);
		
		if(Validator.isNotNull(issueVehicleCertificateId))
			outputSheetDetails.setIssueVehicleCertificateId(issueVehicleCertificateId);
		
		if(Validator.isNotNull(certificateId))
			outputSheetDetails.setCertificateId(certificateId);
		
		if(Validator.isNotNull(certificateNumber))
			outputSheetDetails.setCertificateNumber(certificateNumber);
		
		if(Validator.isNotNull(certificateDate))
			outputSheetDetails.setCertificateDate(certificateDate);
		
		if(Validator.isNotNull(vehicleClass))
			outputSheetDetails.setVehicleClass(vehicleClass);

		if(Validator.isNotNull(stampType))
			outputSheetDetails.setStampType(stampType);
		
		if(Validator.isNotNull(stampShortNo))
			outputSheetDetails.setStampShortNo(stampShortNo);
		
		if(Validator.isNotNull(serialStartNo))
			outputSheetDetails.setSerialStartNo(serialStartNo);
		
		if(Validator.isNotNull(serialEndNo))
			outputSheetDetails.setSerialEndNo(serialEndNo);
		
		if(Validator.isNotNull(subTotalInDocument))
			outputSheetDetails.setSubTotalInDocument(subTotalInDocument);
		
		if(Validator.isNotNull(subTotalQuantities))
			outputSheetDetails.setSubTotalQuantities(subTotalQuantities);
		
		if(Validator.isNotNull(unitPrice))
			outputSheetDetails.setUnitPrice(unitPrice);
		
		if(Validator.isNotNull(totalAmount))
			outputSheetDetails.setTotalAmount(totalAmount);
		
		if(Validator.isNotNull(totalInUse))
			outputSheetDetails.setTotalInUse(totalInUse);
		
		if(Validator.isNotNull(totalNotUsed))
			outputSheetDetails.setTotalNotUsed(totalNotUsed);
		
		if(Validator.isNotNull(totalLost))
			outputSheetDetails.setTotalLost(totalLost);
		
		if(Validator.isNotNull(totalCancelled))
			outputSheetDetails.setTotalCancelled(totalCancelled);
		
		if(Validator.isNotNull(totalReturned))
			outputSheetDetails.setTotalReturned(totalReturned);
		
		if(Validator.isNotNull(remark))
			outputSheetDetails.setRemark(remark);
		
		return vrOutputSheetDetailsPersistence.update(outputSheetDetails);
	}
	
	public void updateJSONArray(long outputSheetId, Long corporationId, 
			Long outputSheetType, String details, Long isApproval)
			throws PortalException, SystemException {
		
		if(Validator.isNotNull(details)) {
			JSONArray detailsArr = JSONFactoryUtil.createJSONArray(details);
			
			List<VROutputSheetDetails> outputSheetDetails = vrOutputSheetDetailsLocalService.findByOutputSheetId(1l, outputSheetId);
			
			// them moi
			long year = Calendar.getInstance().get(Calendar.YEAR);
			for (int i = 0; i < detailsArr.length(); ++i) {
				JSONObject json = detailsArr.getJSONObject(i);
	
				Long bookId = json.getLong("bookId");
				Long inputSheetId = json.getLong("inputSheetId");
				Long issueVehicleCertificateId = json.getLong("issueVehicleCertificateId");
				Long issueApplicationProfileId = json.getLong("issueApplicationProfileId");
				Long certificateId = json.getLong("certificateId");
				String certificateNumber = json.getString("certificateNumber");
				Date certificateDate = DateTimeUtils.convertStringToDateAPI(json.getString("certificateDate"));
				String vehicleClass = json.getString("vehicleClass");
				String stampType = json.getString("stampType");
				String stampShortNo = json.getString("stampShortNo");
				Long serialStartNo = json.getLong("serialStartNo");
				Long serialEndNo = json.getLong("serialEndNo");
				Long subTotalInDocument = json.getLong("subTotalInDocument");
				Long subTotalQuantities = json.getLong("subTotalQuantities");
				Long unitPrice = json.getLong("unitPrice");
				Long totalAmount = json.getLong("totalAmount");
				Long totalInUse = json.getLong("totalInUse");
				Long totalNotUsed = json.getLong("totalNotUsed");
				Long totalLost = json.getLong("totalLost");
				Long totalCancelled = json.getLong("totalCancelled");
				Long totalReturned = json.getLong("totalReturned");
				String remark = json.getString("remark");
	
				vrOutputSheetDetailsLocalService.updateOutputSheetDetails(0l, 1l, inputSheetId, outputSheetId,
						bookId, issueVehicleCertificateId, certificateId, certificateNumber, certificateDate,
						vehicleClass, stampType, stampShortNo, serialStartNo, serialEndNo, subTotalInDocument,
						subTotalQuantities, unitPrice, totalAmount, totalInUse, totalNotUsed, totalLost, totalCancelled,
						totalReturned, remark);
				
				if(isApproval == 1) { 
					// Khi can bo duyet thi them vao inventory dong thoi tru so luong tuong ung o stampbook
					vrInventoryLocalService.updateInventory(0l, 1l, year, null,
							null, bookId, vehicleClass, stampType, stampShortNo, serialStartNo,
							serialEndNo, subTotalInDocument, totalInUse, totalNotUsed, remark, corporationId, outputSheetType,
							null);
					
					// update stampbook
					vrInputStampbookLocalService.updateByOutputSheet(bookId, subTotalInDocument, serialStartNo, serialEndNo, issueApplicationProfileId, corporationId, outputSheetType);
				}
			}
			
			// xoa cu
			for(VROutputSheetDetails outputSheetDetail : outputSheetDetails) {
				vrOutputSheetDetailsPersistence.remove(outputSheetDetail);
			}
		}
	}
	
	public List<VROutputSheetDetails> findByInputSheetId(long mtCore, long inputSheetId) throws PortalException, SystemException {
		try {
			return vrOutputSheetDetailsPersistence.findByInputSheetId(mtCore, inputSheetId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VROutputSheetDetails>();
		
	}


	public List<VROutputSheetDetails> findByInputSheetIdAndBookId(long mtCore, long inputSheetId, long bookId) throws PortalException, SystemException {
		try {
			return vrOutputSheetDetailsPersistence.findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VROutputSheetDetails>();
		
	}
	
	public List<VROutputSheetDetails> findByOutputSheetId(long mtCore, long outputSheetId) throws PortalException, SystemException {
		try {
			return vrOutputSheetDetailsPersistence.findByOutputSheetId(mtCore, outputSheetId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VROutputSheetDetails>();
		
	}
	
	public List<VROutputSheetDetails> findByOutputSheetIdAndBookId(long mtCore, long outputSheetId, long bookId) throws PortalException, SystemException {
		try {
			return vrOutputSheetDetailsPersistence.findByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VROutputSheetDetails>();
		
	}
	
	public List<VROutputSheetDetails> findByInputSheetIdAndBookIdAndStampType(long mtCore, long inputSheetId, long bookId, String stampType) throws PortalException, SystemException {
		try {
			return vrOutputSheetDetailsPersistence.findByInputSheetIdAndBookIdAndStampType(mtCore, inputSheetId, bookId, stampType);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VROutputSheetDetails>();
		
	}
	
	public List<VROutputSheetDetails> findByOutputSheetIdAndBookIdAndStampType(long mtCore, long outputSheetId, long bookId, String stampType) throws PortalException, SystemException {
		try {
			return vrOutputSheetDetailsPersistence.findByOutputSheetIdAndBookIdAndStampType(mtCore, outputSheetId, bookId, stampType);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VROutputSheetDetails>();
		
	}
	
	public List<VROutputSheetDetails> findBycertificateId(long mtCore, long certificateId) throws PortalException, SystemException {
		try {
			return vrOutputSheetDetailsPersistence.findBycertificateId(mtCore, certificateId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VROutputSheetDetails>();
		
	}


	public List<VROutputSheetDetails> findBycertificateNumber(long mtCore, String certificateNumber) throws PortalException, SystemException {
		try {
			return vrOutputSheetDetailsPersistence.findBycertificateNumber(mtCore, certificateNumber);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VROutputSheetDetails>();
		
	}
	
	public List<VROutputSheetDetails> findByissueVehicleCertificateId(long mtCore, long issueVehicleCertificateId) throws PortalException, SystemException {
		try {
			return vrOutputSheetDetailsPersistence.findByissueVehicleCertificateId(mtCore, issueVehicleCertificateId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VROutputSheetDetails>();
		
	}
	
	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrOutputSheetDetailsFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrOutputSheetDetailsFinder.countData(sql);
	}
	
	public VROutputSheetDetails createVROutputSheetDetails(VROutputSheetDetails object) throws SystemException {

		long id = counterLocalService.increment(VROutputSheetDetails.class.getName());

		object.setId(id);

		Date now = new Date();

		object.setModifyDate(now);

		return vrOutputSheetDetailsPersistence.update(object);
	}

	public VROutputSheetDetails updateVROutputSheetDetails(VROutputSheetDetails object) throws SystemException {

		Date now = new Date();

		object.setModifyDate(now);

		return vrOutputSheetDetailsPersistence.update(object);
	}
	
	private Log _log = LogFactoryUtil.getLog(VROutputSheetDetailsLocalServiceImpl.class);
}