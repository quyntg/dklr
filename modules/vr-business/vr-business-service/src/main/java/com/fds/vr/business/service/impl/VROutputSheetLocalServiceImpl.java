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

import com.fds.vr.business.action.VROutputSheetAction;
import com.fds.vr.business.action.impl.VROutputSheetActionImpl;
import com.fds.vr.business.model.VROutputSheet;
import com.fds.vr.business.service.base.VROutputSheetLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr output sheet local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VROutputSheetLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VROutputSheetLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VROutputSheetLocalServiceUtil
 */
@ProviderType
public class VROutputSheetLocalServiceImpl extends VROutputSheetLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VROutputSheetLocalServiceUtil} to access the vr output sheet local service.
	 */

	public VROutputSheet updateOutputSheet(long id, long mtCore, String outputSheetNo, Date outputSheetDate,
			String originalDocumentNo, Long supplierCorporationId, Long outputSheetType, String maker, String checker,
			String approver, String receiverName, String receiverPlace, String receiverRequest, String inventoryName,
			String inventoryPlace, Date inventoryDate, Long dossierId, Long issueId, Long purchaserId,
			Long purchaserCorporationId, String bookIDList, Long isApproval, Long totalQuantities, Long totalAmount,
			String amountInWords, String remark, String details, Company company) throws PortalException, SystemException {

		VROutputSheet outputSheet = null;

		if (id > 0) {
			outputSheet = vrOutputSheetPersistence.findByPrimaryKey(id);
		} else {
			id = counterLocalService.increment(VROutputSheet.class.getName());
			outputSheet = vrOutputSheetPersistence.create(id);
		}

		outputSheet.setModifyDate(new Date());
		outputSheet.setMtCore(mtCore);

		if (Validator.isNotNull(outputSheetNo))
			outputSheet.setOutputSheetNo(outputSheetNo);

		if (Validator.isNotNull(outputSheetDate))
			outputSheet.setOutputSheetDate(outputSheetDate);

		if (Validator.isNotNull(originalDocumentNo))
			outputSheet.setOriginalDocumentNo(originalDocumentNo);

		if (Validator.isNotNull(supplierCorporationId))
			outputSheet.setSupplierCorporationId(supplierCorporationId);

		if (Validator.isNotNull(outputSheetType))
			outputSheet.setOutputSheetType(outputSheetType);

		if (Validator.isNotNull(maker))
			outputSheet.setMaker(maker);

		if (Validator.isNotNull(checker))
			outputSheet.setChecker(checker);

		if (Validator.isNotNull(approver))
			outputSheet.setApprover(approver);

		if (Validator.isNotNull(receiverName))
			outputSheet.setReceiverName(receiverName);

		if (Validator.isNotNull(receiverPlace))
			outputSheet.setReceiverPlace(receiverPlace);

		if (Validator.isNotNull(receiverRequest))
			outputSheet.setReceiverRequest(receiverRequest);

		if (Validator.isNotNull(inventoryName))
			outputSheet.setInventoryName(inventoryName);

		if (Validator.isNotNull(inventoryPlace))
			outputSheet.setInventoryPlace(inventoryPlace);

		if (Validator.isNotNull(inventoryDate))
			outputSheet.setInventoryDate(inventoryDate);

		if (Validator.isNotNull(dossierId))
			outputSheet.setDossierId(dossierId);

		if (Validator.isNotNull(issueId))
			outputSheet.setIssueId(issueId);

		if (Validator.isNotNull(purchaserId))
			outputSheet.setPurchaserId(purchaserId);

		if (Validator.isNotNull(purchaserCorporationId))
			outputSheet.setPurchaserCorporationId(purchaserCorporationId);

		if (Validator.isNotNull(bookIDList))
			outputSheet.setBookIDList(bookIDList);

		if (Validator.isNotNull(isApproval))
			outputSheet.setIsApproval(isApproval);

		if (Validator.isNotNull(totalQuantities))
			outputSheet.setTotalQuantities(totalQuantities);

		if (Validator.isNotNull(totalAmount))
			outputSheet.setTotalAmount(totalAmount);

		if (Validator.isNotNull(amountInWords))
			outputSheet.setAmountInWords(amountInWords);

		if (Validator.isNotNull(remark))
			outputSheet.setRemark(remark);

		if (isApproval == 1) {
			Long corporationId = (outputSheetType != null && outputSheetType == 5) ? purchaserCorporationId
					: purchaserId;
			vrOutputSheetDetailsLocalService.updateJSONArray(id, corporationId, outputSheetType, details, isApproval);

			if (outputSheetType == 4 || outputSheetType == 6) {
				vrIssueLocalService.updateDigitalIssueStatus(issueId, 9, company);
			}
		}

		outputSheet = vrOutputSheetPersistence.update(outputSheet);
		if (outputSheet != null) {
			VROutputSheetAction action = new VROutputSheetActionImpl();
			action.indexing(outputSheet, company);
		}
		return outputSheet;
	}

	public List<VROutputSheet> findByinputSheetNo(long mtCore, String outputSheetNo)
			throws PortalException, SystemException {
		try {
			return vrOutputSheetPersistence.findByinputSheetNo(mtCore, outputSheetNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VROutputSheet>();

	}

	public List<VROutputSheet> findBypurchaserCorporationId(long mtCore, long purchaserCorporationId)
			throws PortalException, SystemException {
		try {
			return vrOutputSheetPersistence.findBypurchaserCorporationId(mtCore, purchaserCorporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VROutputSheet>();

	}

	public List<VROutputSheet> findBysupplierCorporationId(long mtCore, long supplierCorporationId)
			throws PortalException, SystemException {
		try {
			return vrOutputSheetPersistence.findBysupplierCorporationId(mtCore, supplierCorporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VROutputSheet>();

	}

	public List<VROutputSheet> findBydossierId(long mtCore, long dossierId) throws PortalException, SystemException {
		try {
			return vrOutputSheetPersistence.findBydossierId(mtCore, dossierId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VROutputSheet>();

	}

	public List<VROutputSheet> findByoutputSheetType(long mtCore, long outputSheetType)
			throws PortalException, SystemException {
		try {
			return vrOutputSheetPersistence.findByoutputSheetType(mtCore, outputSheetType);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VROutputSheet>();

	}

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrOutputSheetFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrOutputSheetFinder.countData(sql);
	}

	public VROutputSheet createVROutputSheet(VROutputSheet object) throws SystemException {

		long id = counterLocalService.increment(VROutputSheet.class.getName());

		object.setId(id);

		Date now = new Date();

		object.setModifyDate(now);

		return vrOutputSheetPersistence.update(object);
	}

	public VROutputSheet updateVROutputSheet(VROutputSheet object, Company company) throws SystemException, PortalException {

		Date now = new Date();

		object.setModifyDate(now);

		object = vrOutputSheetPersistence.update(object);
		if (object != null) {
			VROutputSheetAction action = new VROutputSheetActionImpl();
			action.indexing(object, company);
		}
		return object;
	}

	private Log _log = LogFactoryUtil.getLog(VROutputSheetLocalServiceImpl.class);
}