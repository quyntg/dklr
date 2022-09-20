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

import com.fds.vr.business.action.VRIssueAction;
import com.fds.vr.business.action.impl.VRIssueActionImpl;
import com.fds.vr.business.constant.VRKeys;
import com.fds.vr.business.model.VRInputStampbook;
import com.fds.vr.business.model.VRInputStampbookDetails;
import com.fds.vr.business.model.VRIssue;
import com.fds.vr.business.model.VRVehicleRecord;
import com.fds.vr.business.service.base.VRVehicleRecordLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr vehicle record local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRVehicleRecordLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRVehicleRecordLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRVehicleRecordLocalServiceUtil
 */
@ProviderType
public class VRVehicleRecordLocalServiceImpl extends VRVehicleRecordLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRVehicleRecordLocalServiceUtil} to access the vr
	 * vehicle record local service.
	 */

	public VRVehicleRecord createVRVehicleRecord(VRVehicleRecord vrVehicleRecord) {
		long id = counterLocalService.increment(VRVehicleRecord.class.getName());
		vrVehicleRecord.setPrimaryKey(id);
		vrVehicleRecord.setModifyDate(new Date());
		return vrVehicleRecordPersistence.update(vrVehicleRecord);
	}

	public VRVehicleRecord updateVRVehicleRecord(VRVehicleRecord vrVehicleRecord) {
		vrVehicleRecord.setModifyDate(new Date());
		return vrVehicleRecordPersistence.update(vrVehicleRecord);
	}

	public List<VRVehicleRecord> findByissueVehicleCertificateId(long mtCore, long issueVehicleCertificateId)
			throws PortalException, SystemException {
		try {
			return vrVehicleRecordPersistence.findByissueVehicleCertificateId(mtCore, issueVehicleCertificateId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleRecord>();

	}

	public List<VRVehicleRecord> findBydossierId(long mtCore, long dossierId) throws PortalException, SystemException {
		try {
			return vrVehicleRecordPersistence.findBydossierId(mtCore, dossierId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleRecord>();
	}

	public List<VRVehicleRecord> findByIssueId(long issueId, int start, int end) {
		return vrVehicleRecordPersistence.findByissueId(issueId, start, end);
	}

	public void deleteBydossierId(long mtCore, long dossierId) throws PortalException, SystemException {

		vrVehicleRecordPersistence.removeBydossierId(mtCore, dossierId);
	}

	public List<VRVehicleRecord> findBycertificateId(long mtCore, long certificateId)
			throws PortalException, SystemException {
		try {
			return vrVehicleRecordPersistence.findBycertificateId(mtCore, certificateId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleRecord>();

	}

	public List<VRVehicleRecord> findByapplicantProfileId(long mtCore, long applicantProfileId)
			throws PortalException, SystemException {
		try {
			return vrVehicleRecordPersistence.findByapplicantProfileId(mtCore, applicantProfileId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleRecord>();

	}

	public List<VRVehicleRecord> findByapplicantProfileIdAndPrintingStatus(long mtCore, long applicantProfileId,
			long printingStatus) throws PortalException, SystemException {
		try {
			return vrVehicleRecordPersistence.findByapplicantProfileIdAndPrintingStatus(mtCore, applicantProfileId,
					printingStatus);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleRecord>();

	}

	public List<VRVehicleRecord> findByapplicantProfileIdAndVehicleRecordStatus(long mtCore, long applicantProfileId,
			long vehicleRecordStatus) throws PortalException, SystemException {
		try {
			return vrVehicleRecordPersistence.findByapplicantProfileIdAndVehicleRecordStatus(mtCore, applicantProfileId,
					vehicleRecordStatus);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleRecord>();
	}

	public VRVehicleRecord updateVRVehicleRecord(Map<String, String> mapValue, int mtCore) {

		long idVRRecord = CounterLocalServiceUtil.increment(VRVehicleRecord.class.getName());
		VRVehicleRecord object = vrVehicleRecordPersistence.create(idVRRecord);

		// create objVRIssue
		object.setModifyDate(new Date());
		object.setSyncDate(new Date());

		object.setMtCore(mtCore);
		object.setIssueVehicleCertificateId(GetterUtil.getLong(mapValue.get("issueVehicleCertificateId")));
		object.setDossierId(GetterUtil.getLong(mapValue.get("dossierId")));
		object.setApplicantProfileId(GetterUtil.getLong(mapValue.get("applicantProfileId")));
		object.setApplicantName(mapValue.get("applicantName"));
		object.setApplicantAddress(mapValue.get("applicantAddress"));
		object.setCertificateId(GetterUtil.getLong(mapValue.get("certificateId")));
		object.setCertificaterecordno(mapValue.get("certificaterecordno"));
		object.setFrameNo(mapValue.get("frameNo"));
		object.setBoxNo(mapValue.get("boxNo"));
		object.setEngineNo(mapValue.get("engineNo"));
		object.setColor(mapValue.get("color"));
		object.setVehicleRecordStatus(GetterUtil.getLong(mapValue.get("vehicleRecordStatus")));
		object.setPrintingStatus(GetterUtil.getLong(mapValue.get("printingStatus")));

		return vrVehicleRecordPersistence.update(object);
	}

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrVehicleRecordFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrVehicleRecordFinder.countData(sql);
	}

	private final String PATTERN_DATE = "dd-MM-yyyy HH:mm:ss";
	private final String PATTERN_DATE_2 = "dd/MM/yyyy HH:mm:ss";
	private final String PATTERN_DATE_3 = "dd/MM/yyyy";

	private Date parseStringToDate(String strDate) {

		try {
			SimpleDateFormat df = new SimpleDateFormat(PATTERN_DATE);
			return df.parse(strDate);
		} catch (ParseException e) {

			try {
				SimpleDateFormat df = new SimpleDateFormat(PATTERN_DATE_2);
				return df.parse(strDate);
			} catch (Exception e2) {
				try {
					SimpleDateFormat df = new SimpleDateFormat(PATTERN_DATE_3);
					return df.parse(strDate);
				} catch (Exception e3) {

				}
			}
			return null;
		}
	}

	public VRVehicleRecord updateVRVehicleRecord(VRVehicleRecord object, Company company)
			throws SystemException, PortalException {
		Date now = new Date();

		object.setModifyDate(now);
		object = vrVehicleRecordPersistence.update(object);
		if (object != null) {
			VRIssue vrIssue = vrIssuePersistence.fetchByPrimaryKey(object.getIssueId());
			VRIssueAction action = new VRIssueActionImpl();
			action.indexing(vrIssue, company);
		}
		return object;
	}

	public VRVehicleRecord updateVRVehicleRecord(long vehicleRecordId, int printingStatus, int postPrintingStatus)
			throws SystemException, PortalException {

		Date now = new Date();
		VRVehicleRecord vrVehicleRecord = vrVehicleRecordPersistence.fetchByPrimaryKey(vehicleRecordId);

		vrVehicleRecord.setPrintingStatus(postPrintingStatus);
		vrVehicleRecord.setPostPrintingStatus(postPrintingStatus);
		if (printingStatus == VRKeys.DA_IN) {
			List<VRInputStampbookDetails> vrInputStampbookDetails = vrInputStampbookDetailsLocalService
					.findByvehicleRecordId(vrVehicleRecord.getMtCore(), vehicleRecordId);
			int counter = 0;
			for (VRInputStampbookDetails vrInputStampbookDetail : vrInputStampbookDetails) {
				VRInputStampbookDetails object = vrInputStampbookDetailsLocalService.updateInputStampbookDetails(
						vrInputStampbookDetail.getPrimaryKey(), vrVehicleRecord.getMtCore(), null, null,
						vrVehicleRecord.getDossierId(), vrVehicleRecord.getCertificateId(), null, null, vehicleRecordId,
						vrVehicleRecord.getFrameNo(), vrVehicleRecord.getBoxNo(), null, vrVehicleRecord.getEngineNo(),
						1L, null, null, null, null, null, null, null, null, null,
						vrInputStampbookDetail.getStampStatus() + 1 < 5L ? vrInputStampbookDetail.getStampStatus() + 1
								: 5L,
						null, now, null, null, null, null, null);
				if (object != null) {
					counter++;
				}
			}
			if (vrInputStampbookDetails != null && !vrInputStampbookDetails.isEmpty()) {
				VRInputStampbook vrInputStampbook = vrInputStampbookLocalService
						.fetchVRInputStampbook(vrInputStampbookDetails.get(0).getBookId());
				long subTotalQuantities = vrInputStampbook.getSubTotalQuantities();
				vrInputStampbook.setSubTotalQuantities(subTotalQuantities - counter);
				vrInputStampbookLocalService.updateVRInputStampbook(vrInputStampbook);

				// Chua biet update OutputSheetDetail
			}

		}
		return vrVehicleRecordPersistence.update(vrVehicleRecord);
	}

	private boolean validateFirstAllocation(String frameNo, String engineNo, List<VRVehicleRecord> vrVehicleRecords) {
		boolean frameNoExists = vrVehicleRecords.parallelStream()
				.anyMatch(vrVehicleRecord -> frameNo.equals(vrVehicleRecord.getFrameNo()));
		return frameNoExists;
	}

	private boolean validateReplacementAllocation_FrameNo(String frameNo, String engineNo) {
		VRVehicleRecord vrVehicleRecord = vrVehicleRecordPersistence.fetchByframeNo(frameNo);
		if (Validator.isNull(vrVehicleRecord)) {
			return true;
		} else {
			return false;
		}
	}

	private boolean validateReplacementAllocation_SerialNo(String serialNo, long applicantProfileId) {
		VRInputStampbookDetails vrInputStampbookDetails = vrInputStampbookDetailsPersistence
				.fetchBystampSerialNo_purchaserId(applicantProfileId, serialNo);
		if (Validator.isNull(vrInputStampbookDetails)) {
			return true;
		} else {
			return false;
		}
	}

	public List<VRVehicleRecord> adminProcess(JSONArray arrayData, long dossierId, long issueId, long mtCore,
			long issueVehicleCertificateId, String issueType) throws Exception {

		List<VRVehicleRecord> vrVehicleRecords = vrVehicleRecordPersistence.findBydossierId(mtCore, dossierId);

		vrVehicleRecordPersistence.removeBydossierId(mtCore, dossierId);
		List<VRVehicleRecord> result = new ArrayList<VRVehicleRecord>();
		Date now = new Date();
		for (int i = 0; i < arrayData.length(); i++) {
			JSONObject objectData = arrayData.getJSONObject(i);

			if (issueType.equals("1")) { // Cap lan dau
				if (validateFirstAllocation(objectData.getString("frameNo"), objectData.getString("engineNo"),
						vrVehicleRecords)) {
					throw new Exception("505"); // 505 = Trung so khung
				}
			} else if (issueType.contains("2, 3, 4")) { // Cap thay the
				if (validateReplacementAllocation_SerialNo(objectData.getString("serialNo"), objectData.getLong("applicantProfileId"))) {
					throw new Exception("507"); // 507 = Phieu khong ton tai
				}
				if (validateReplacementAllocation_FrameNo(objectData.getString("frameNo"),
						objectData.getString("engineNo"))) {
					throw new Exception("506"); // 506 = Xe khong ton tai
				}
			}

			long vehicleRecordId = counterLocalService.increment(VRVehicleRecord.class.getName());

			VRVehicleRecord object = vrVehicleRecordPersistence.create(vehicleRecordId);

			object.setMtCore(mtCore);
			object.setIssueId(issueId);
			object.setIssueVehicleCertificateId(issueVehicleCertificateId);
			object.setDossierId(dossierId);
			object.setApplicantProfileId(objectData.getLong("applicantProfileId"));
			object.setApplicantName(objectData.getString("applicantName"));
			object.setApplicantAddress(objectData.getString("applicantAddress"));
			object.setCertificateId(objectData.getLong("certificateId"));
			object.setProductionNumber(objectData.getString("productionNumber"));
			object.setProductionDate(parseStringToDate(objectData.getString("productionDate")));
			object.setFrameNo(objectData.getString("frameNo"));
			object.setBoxNo(objectData.getString("boxNo"));
			object.setEngineNo(objectData.getString("engineNo"));
			object.setColor(objectData.getString("color"));
			object.setStampShortNo(objectData.getString("stampShortNo"));
			object.setSerialNo(objectData.getString("serialNo"));
			object.setVehicleRecordStatus(objectData.getLong("vehicleRecordStatus"));
			object.setPrintingStatus(objectData.getLong("printingStatus"));
			object.setSignName(objectData.getString("signName"));
			object.setSignTitle(objectData.getString("signTitle"));
			object.setSignPlace(objectData.getString("signPlace"));
			object.setSignDate(parseStringToDate(objectData.getString("signDate")));
			object.setModifyDate(now);
			object.setSyncDate(now);
			object.setCertificaterecordno(objectData.getString("certificateRecordNo"));
			object.setPostPrintingStatus(objectData.getInt("postPrintingStatus"));
			object.setQrCode(objectData.getString("qrCode"));
			object.setCertificateRecordDate(parseStringToDate(objectData.getString("certificateRecordDate")));
			object.setIssueInspectionRecordId(objectData.getLong("issueInspectionRecordId"));

			object = vrVehicleRecordPersistence.update(object);
			if (object != null) {
				result.add(object);
			}
		}

		return result;
	}

	private Log _log = LogFactoryUtil.getLog(VRVehicleRecordLocalServiceImpl.class);
}