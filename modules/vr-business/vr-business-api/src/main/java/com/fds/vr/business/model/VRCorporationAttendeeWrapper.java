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

package com.fds.vr.business.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VRCorporationAttendee}.
 * </p>
 *
 * @author LamTV
 * @see VRCorporationAttendee
 * @generated
 */
@ProviderType
public class VRCorporationAttendeeWrapper implements VRCorporationAttendee,
	ModelWrapper<VRCorporationAttendee> {
	public VRCorporationAttendeeWrapper(
		VRCorporationAttendee vrCorporationAttendee) {
		_vrCorporationAttendee = vrCorporationAttendee;
	}

	@Override
	public Class<?> getModelClass() {
		return VRCorporationAttendee.class;
	}

	@Override
	public String getModelClassName() {
		return VRCorporationAttendee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());
		attributes.put("corporationCode", getCorporationCode());
		attributes.put("corporationName", getCorporationName());
		attributes.put("inspectionDate", getInspectionDate());
		attributes.put("registerednumber", getRegisterednumber());
		attributes.put("testingRegisteredPlace", getTestingRegisteredPlace());
		attributes.put("testingPlaceDistrict", getTestingPlaceDistrict());
		attributes.put("testingPlaceCity", getTestingPlaceCity());
		attributes.put("testingPlaceRegion", getTestingPlaceRegion());
		attributes.put("testingPlaceCountry", getTestingPlaceCountry());
		attributes.put("testingRemarks", getTestingRemarks());
		attributes.put("activityId", getActivityId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("activityType", getActivityType());
		attributes.put("activityCatetory", getActivityCatetory());
		attributes.put("categoryName", getCategoryName());
		attributes.put("dossierId", getDossierId());
		attributes.put("serviceName", getServiceName());
		attributes.put("subject", getSubject());
		attributes.put("hostingId", getHostingId());
		attributes.put("hosting", getHosting());
		attributes.put("locationId", getLocationId());
		attributes.put("location", getLocation());
		attributes.put("geolocation", getGeolocation());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("finishDate", getFinishDate());
		attributes.put("state", getState());
		attributes.put("stateName", getStateName());
		attributes.put("stateColor", getStateColor());
		attributes.put("priority", getPriority());
		attributes.put("overdue", getOverdue());
		attributes.put("managerId", getManagerId());
		attributes.put("managerName", getManagerName());
		attributes.put("leaderId", getLeaderId());
		attributes.put("leaderName", getLeaderName());
		attributes.put("leaderJobTitle", getLeaderJobTitle());
		attributes.put("description", getDescription());
		attributes.put("permission", getPermission());
		attributes.put("resultNote", getResultNote());
		attributes.put("progress", getProgress());
		attributes.put("assignType", getAssignType());
		attributes.put("jobPosId", getJobPosId());
		attributes.put("jobPosTitle", getJobPosTitle());
		attributes.put("invitation", getInvitation());
		attributes.put("editable", getEditable());
		attributes.put("vaqcontactname", getVaqcontactname());
		attributes.put("vaqcontactphone", getVaqcontactphone());
		attributes.put("applicantIdNo", getApplicantIdNo());
		attributes.put("importercontactname", getImportercontactname());
		attributes.put("importercontactphone", getImportercontactphone());
		attributes.put("importercontactemail", getImportercontactemail());
		attributes.put("importerfax", getImporterfax());
		attributes.put("soTKHQ", getSoTKHQ());
		attributes.put("ngayTKHQ", getNgayTKHQ());
		attributes.put("maChiCucHQ", getMaChiCucHQ());
		attributes.put("nhanHieu", getNhanHieu());
		attributes.put("tenThuongMai", getTenThuongMai());
		attributes.put("maKieuLoai", getMaKieuLoai());
		attributes.put("loaiPhuongTien", getLoaiPhuongTien());
		attributes.put("soKhung", getSoKhung());
		attributes.put("soDongCo", getSoDongCo());
		attributes.put("tinhTrangPhuongTien", getTinhTrangPhuongTien());
		attributes.put("kyHieuThietKe", getKyHieuThietKe());
		attributes.put("soGCNThamDinhThietKe", getSoGCNThamDinhThietKe());
		attributes.put("soGCNPheDuyetKieuLoaiNuocNgoai",
			getSoGCNPheDuyetKieuLoaiNuocNgoai());
		attributes.put("tenCoSoSanXuat", getTenCoSoSanXuat());
		attributes.put("diaChiCoSoSanXuat", getDiaChiCoSoSanXuat());
		attributes.put("tenXuongSanXuat", getTenXuongSanXuat());
		attributes.put("diaChiXuongSanXuat", getDiaChiXuongSanXuat());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long mtCore = (Long)attributes.get("mtCore");

		if (mtCore != null) {
			setMtCore(mtCore);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}

		String corporationCode = (String)attributes.get("corporationCode");

		if (corporationCode != null) {
			setCorporationCode(corporationCode);
		}

		String corporationName = (String)attributes.get("corporationName");

		if (corporationName != null) {
			setCorporationName(corporationName);
		}

		Date inspectionDate = (Date)attributes.get("inspectionDate");

		if (inspectionDate != null) {
			setInspectionDate(inspectionDate);
		}

		String registerednumber = (String)attributes.get("registerednumber");

		if (registerednumber != null) {
			setRegisterednumber(registerednumber);
		}

		String testingRegisteredPlace = (String)attributes.get(
				"testingRegisteredPlace");

		if (testingRegisteredPlace != null) {
			setTestingRegisteredPlace(testingRegisteredPlace);
		}

		String testingPlaceDistrict = (String)attributes.get(
				"testingPlaceDistrict");

		if (testingPlaceDistrict != null) {
			setTestingPlaceDistrict(testingPlaceDistrict);
		}

		String testingPlaceCity = (String)attributes.get("testingPlaceCity");

		if (testingPlaceCity != null) {
			setTestingPlaceCity(testingPlaceCity);
		}

		String testingPlaceRegion = (String)attributes.get("testingPlaceRegion");

		if (testingPlaceRegion != null) {
			setTestingPlaceRegion(testingPlaceRegion);
		}

		String testingPlaceCountry = (String)attributes.get(
				"testingPlaceCountry");

		if (testingPlaceCountry != null) {
			setTestingPlaceCountry(testingPlaceCountry);
		}

		String testingRemarks = (String)attributes.get("testingRemarks");

		if (testingRemarks != null) {
			setTestingRemarks(testingRemarks);
		}

		Long activityId = (Long)attributes.get("activityId");

		if (activityId != null) {
			setActivityId(activityId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String activityType = (String)attributes.get("activityType");

		if (activityType != null) {
			setActivityType(activityType);
		}

		String activityCatetory = (String)attributes.get("activityCatetory");

		if (activityCatetory != null) {
			setActivityCatetory(activityCatetory);
		}

		String categoryName = (String)attributes.get("categoryName");

		if (categoryName != null) {
			setCategoryName(categoryName);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		String serviceName = (String)attributes.get("serviceName");

		if (serviceName != null) {
			setServiceName(serviceName);
		}

		String subject = (String)attributes.get("subject");

		if (subject != null) {
			setSubject(subject);
		}

		Integer hostingId = (Integer)attributes.get("hostingId");

		if (hostingId != null) {
			setHostingId(hostingId);
		}

		String hosting = (String)attributes.get("hosting");

		if (hosting != null) {
			setHosting(hosting);
		}

		Integer locationId = (Integer)attributes.get("locationId");

		if (locationId != null) {
			setLocationId(locationId);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String geolocation = (String)attributes.get("geolocation");

		if (geolocation != null) {
			setGeolocation(geolocation);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		Date finishDate = (Date)attributes.get("finishDate");

		if (finishDate != null) {
			setFinishDate(finishDate);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String stateName = (String)attributes.get("stateName");

		if (stateName != null) {
			setStateName(stateName);
		}

		String stateColor = (String)attributes.get("stateColor");

		if (stateColor != null) {
			setStateColor(stateColor);
		}

		String priority = (String)attributes.get("priority");

		if (priority != null) {
			setPriority(priority);
		}

		String overdue = (String)attributes.get("overdue");

		if (overdue != null) {
			setOverdue(overdue);
		}

		Long managerId = (Long)attributes.get("managerId");

		if (managerId != null) {
			setManagerId(managerId);
		}

		String managerName = (String)attributes.get("managerName");

		if (managerName != null) {
			setManagerName(managerName);
		}

		Long leaderId = (Long)attributes.get("leaderId");

		if (leaderId != null) {
			setLeaderId(leaderId);
		}

		String leaderName = (String)attributes.get("leaderName");

		if (leaderName != null) {
			setLeaderName(leaderName);
		}

		String leaderJobTitle = (String)attributes.get("leaderJobTitle");

		if (leaderJobTitle != null) {
			setLeaderJobTitle(leaderJobTitle);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String permission = (String)attributes.get("permission");

		if (permission != null) {
			setPermission(permission);
		}

		String resultNote = (String)attributes.get("resultNote");

		if (resultNote != null) {
			setResultNote(resultNote);
		}

		String progress = (String)attributes.get("progress");

		if (progress != null) {
			setProgress(progress);
		}

		String assignType = (String)attributes.get("assignType");

		if (assignType != null) {
			setAssignType(assignType);
		}

		Long jobPosId = (Long)attributes.get("jobPosId");

		if (jobPosId != null) {
			setJobPosId(jobPosId);
		}

		String jobPosTitle = (String)attributes.get("jobPosTitle");

		if (jobPosTitle != null) {
			setJobPosTitle(jobPosTitle);
		}

		String invitation = (String)attributes.get("invitation");

		if (invitation != null) {
			setInvitation(invitation);
		}

		String editable = (String)attributes.get("editable");

		if (editable != null) {
			setEditable(editable);
		}

		String vaqcontactname = (String)attributes.get("vaqcontactname");

		if (vaqcontactname != null) {
			setVaqcontactname(vaqcontactname);
		}

		String vaqcontactphone = (String)attributes.get("vaqcontactphone");

		if (vaqcontactphone != null) {
			setVaqcontactphone(vaqcontactphone);
		}

		String applicantIdNo = (String)attributes.get("applicantIdNo");

		if (applicantIdNo != null) {
			setApplicantIdNo(applicantIdNo);
		}

		String importercontactname = (String)attributes.get(
				"importercontactname");

		if (importercontactname != null) {
			setImportercontactname(importercontactname);
		}

		String importercontactphone = (String)attributes.get(
				"importercontactphone");

		if (importercontactphone != null) {
			setImportercontactphone(importercontactphone);
		}

		String importercontactemail = (String)attributes.get(
				"importercontactemail");

		if (importercontactemail != null) {
			setImportercontactemail(importercontactemail);
		}

		String importerfax = (String)attributes.get("importerfax");

		if (importerfax != null) {
			setImporterfax(importerfax);
		}

		String soTKHQ = (String)attributes.get("soTKHQ");

		if (soTKHQ != null) {
			setSoTKHQ(soTKHQ);
		}

		String ngayTKHQ = (String)attributes.get("ngayTKHQ");

		if (ngayTKHQ != null) {
			setNgayTKHQ(ngayTKHQ);
		}

		String maChiCucHQ = (String)attributes.get("maChiCucHQ");

		if (maChiCucHQ != null) {
			setMaChiCucHQ(maChiCucHQ);
		}

		String nhanHieu = (String)attributes.get("nhanHieu");

		if (nhanHieu != null) {
			setNhanHieu(nhanHieu);
		}

		String tenThuongMai = (String)attributes.get("tenThuongMai");

		if (tenThuongMai != null) {
			setTenThuongMai(tenThuongMai);
		}

		String maKieuLoai = (String)attributes.get("maKieuLoai");

		if (maKieuLoai != null) {
			setMaKieuLoai(maKieuLoai);
		}

		String loaiPhuongTien = (String)attributes.get("loaiPhuongTien");

		if (loaiPhuongTien != null) {
			setLoaiPhuongTien(loaiPhuongTien);
		}

		String soKhung = (String)attributes.get("soKhung");

		if (soKhung != null) {
			setSoKhung(soKhung);
		}

		String soDongCo = (String)attributes.get("soDongCo");

		if (soDongCo != null) {
			setSoDongCo(soDongCo);
		}

		String tinhTrangPhuongTien = (String)attributes.get(
				"tinhTrangPhuongTien");

		if (tinhTrangPhuongTien != null) {
			setTinhTrangPhuongTien(tinhTrangPhuongTien);
		}

		String kyHieuThietKe = (String)attributes.get("kyHieuThietKe");

		if (kyHieuThietKe != null) {
			setKyHieuThietKe(kyHieuThietKe);
		}

		String soGCNThamDinhThietKe = (String)attributes.get(
				"soGCNThamDinhThietKe");

		if (soGCNThamDinhThietKe != null) {
			setSoGCNThamDinhThietKe(soGCNThamDinhThietKe);
		}

		String soGCNPheDuyetKieuLoaiNuocNgoai = (String)attributes.get(
				"soGCNPheDuyetKieuLoaiNuocNgoai");

		if (soGCNPheDuyetKieuLoaiNuocNgoai != null) {
			setSoGCNPheDuyetKieuLoaiNuocNgoai(soGCNPheDuyetKieuLoaiNuocNgoai);
		}

		String tenCoSoSanXuat = (String)attributes.get("tenCoSoSanXuat");

		if (tenCoSoSanXuat != null) {
			setTenCoSoSanXuat(tenCoSoSanXuat);
		}

		String diaChiCoSoSanXuat = (String)attributes.get("diaChiCoSoSanXuat");

		if (diaChiCoSoSanXuat != null) {
			setDiaChiCoSoSanXuat(diaChiCoSoSanXuat);
		}

		String tenXuongSanXuat = (String)attributes.get("tenXuongSanXuat");

		if (tenXuongSanXuat != null) {
			setTenXuongSanXuat(tenXuongSanXuat);
		}

		String diaChiXuongSanXuat = (String)attributes.get("diaChiXuongSanXuat");

		if (diaChiXuongSanXuat != null) {
			setDiaChiXuongSanXuat(diaChiXuongSanXuat);
		}
	}

	@Override
	public VRCorporationAttendee toEscapedModel() {
		return new VRCorporationAttendeeWrapper(_vrCorporationAttendee.toEscapedModel());
	}

	@Override
	public VRCorporationAttendee toUnescapedModel() {
		return new VRCorporationAttendeeWrapper(_vrCorporationAttendee.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrCorporationAttendee.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrCorporationAttendee.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrCorporationAttendee.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrCorporationAttendee.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRCorporationAttendee> toCacheModel() {
		return _vrCorporationAttendee.toCacheModel();
	}

	@Override
	public int compareTo(VRCorporationAttendee vrCorporationAttendee) {
		return _vrCorporationAttendee.compareTo(vrCorporationAttendee);
	}

	/**
	* Returns the hosting ID of this vr corporation attendee.
	*
	* @return the hosting ID of this vr corporation attendee
	*/
	@Override
	public int getHostingId() {
		return _vrCorporationAttendee.getHostingId();
	}

	/**
	* Returns the location ID of this vr corporation attendee.
	*
	* @return the location ID of this vr corporation attendee
	*/
	@Override
	public int getLocationId() {
		return _vrCorporationAttendee.getLocationId();
	}

	@Override
	public int hashCode() {
		return _vrCorporationAttendee.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrCorporationAttendee.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRCorporationAttendeeWrapper((VRCorporationAttendee)_vrCorporationAttendee.clone());
	}

	/**
	* Returns the activity catetory of this vr corporation attendee.
	*
	* @return the activity catetory of this vr corporation attendee
	*/
	@Override
	public java.lang.String getActivityCatetory() {
		return _vrCorporationAttendee.getActivityCatetory();
	}

	/**
	* Returns the activity type of this vr corporation attendee.
	*
	* @return the activity type of this vr corporation attendee
	*/
	@Override
	public java.lang.String getActivityType() {
		return _vrCorporationAttendee.getActivityType();
	}

	/**
	* Returns the applicant ID no of this vr corporation attendee.
	*
	* @return the applicant ID no of this vr corporation attendee
	*/
	@Override
	public java.lang.String getApplicantIdNo() {
		return _vrCorporationAttendee.getApplicantIdNo();
	}

	/**
	* Returns the assign type of this vr corporation attendee.
	*
	* @return the assign type of this vr corporation attendee
	*/
	@Override
	public java.lang.String getAssignType() {
		return _vrCorporationAttendee.getAssignType();
	}

	/**
	* Returns the category name of this vr corporation attendee.
	*
	* @return the category name of this vr corporation attendee
	*/
	@Override
	public java.lang.String getCategoryName() {
		return _vrCorporationAttendee.getCategoryName();
	}

	/**
	* Returns the corporation code of this vr corporation attendee.
	*
	* @return the corporation code of this vr corporation attendee
	*/
	@Override
	public java.lang.String getCorporationCode() {
		return _vrCorporationAttendee.getCorporationCode();
	}

	/**
	* Returns the corporation name of this vr corporation attendee.
	*
	* @return the corporation name of this vr corporation attendee
	*/
	@Override
	public java.lang.String getCorporationName() {
		return _vrCorporationAttendee.getCorporationName();
	}

	/**
	* Returns the description of this vr corporation attendee.
	*
	* @return the description of this vr corporation attendee
	*/
	@Override
	public java.lang.String getDescription() {
		return _vrCorporationAttendee.getDescription();
	}

	/**
	* Returns the dia chi co so san xuat of this vr corporation attendee.
	*
	* @return the dia chi co so san xuat of this vr corporation attendee
	*/
	@Override
	public java.lang.String getDiaChiCoSoSanXuat() {
		return _vrCorporationAttendee.getDiaChiCoSoSanXuat();
	}

	/**
	* Returns the dia chi xuong san xuat of this vr corporation attendee.
	*
	* @return the dia chi xuong san xuat of this vr corporation attendee
	*/
	@Override
	public java.lang.String getDiaChiXuongSanXuat() {
		return _vrCorporationAttendee.getDiaChiXuongSanXuat();
	}

	/**
	* Returns the editable of this vr corporation attendee.
	*
	* @return the editable of this vr corporation attendee
	*/
	@Override
	public java.lang.String getEditable() {
		return _vrCorporationAttendee.getEditable();
	}

	/**
	* Returns the geolocation of this vr corporation attendee.
	*
	* @return the geolocation of this vr corporation attendee
	*/
	@Override
	public java.lang.String getGeolocation() {
		return _vrCorporationAttendee.getGeolocation();
	}

	/**
	* Returns the hosting of this vr corporation attendee.
	*
	* @return the hosting of this vr corporation attendee
	*/
	@Override
	public java.lang.String getHosting() {
		return _vrCorporationAttendee.getHosting();
	}

	/**
	* Returns the importercontactemail of this vr corporation attendee.
	*
	* @return the importercontactemail of this vr corporation attendee
	*/
	@Override
	public java.lang.String getImportercontactemail() {
		return _vrCorporationAttendee.getImportercontactemail();
	}

	/**
	* Returns the importercontactname of this vr corporation attendee.
	*
	* @return the importercontactname of this vr corporation attendee
	*/
	@Override
	public java.lang.String getImportercontactname() {
		return _vrCorporationAttendee.getImportercontactname();
	}

	/**
	* Returns the importercontactphone of this vr corporation attendee.
	*
	* @return the importercontactphone of this vr corporation attendee
	*/
	@Override
	public java.lang.String getImportercontactphone() {
		return _vrCorporationAttendee.getImportercontactphone();
	}

	/**
	* Returns the importerfax of this vr corporation attendee.
	*
	* @return the importerfax of this vr corporation attendee
	*/
	@Override
	public java.lang.String getImporterfax() {
		return _vrCorporationAttendee.getImporterfax();
	}

	/**
	* Returns the invitation of this vr corporation attendee.
	*
	* @return the invitation of this vr corporation attendee
	*/
	@Override
	public java.lang.String getInvitation() {
		return _vrCorporationAttendee.getInvitation();
	}

	/**
	* Returns the job pos title of this vr corporation attendee.
	*
	* @return the job pos title of this vr corporation attendee
	*/
	@Override
	public java.lang.String getJobPosTitle() {
		return _vrCorporationAttendee.getJobPosTitle();
	}

	/**
	* Returns the ky hieu thiet ke of this vr corporation attendee.
	*
	* @return the ky hieu thiet ke of this vr corporation attendee
	*/
	@Override
	public java.lang.String getKyHieuThietKe() {
		return _vrCorporationAttendee.getKyHieuThietKe();
	}

	/**
	* Returns the leader job title of this vr corporation attendee.
	*
	* @return the leader job title of this vr corporation attendee
	*/
	@Override
	public java.lang.String getLeaderJobTitle() {
		return _vrCorporationAttendee.getLeaderJobTitle();
	}

	/**
	* Returns the leader name of this vr corporation attendee.
	*
	* @return the leader name of this vr corporation attendee
	*/
	@Override
	public java.lang.String getLeaderName() {
		return _vrCorporationAttendee.getLeaderName();
	}

	/**
	* Returns the loai phuong tien of this vr corporation attendee.
	*
	* @return the loai phuong tien of this vr corporation attendee
	*/
	@Override
	public java.lang.String getLoaiPhuongTien() {
		return _vrCorporationAttendee.getLoaiPhuongTien();
	}

	/**
	* Returns the location of this vr corporation attendee.
	*
	* @return the location of this vr corporation attendee
	*/
	@Override
	public java.lang.String getLocation() {
		return _vrCorporationAttendee.getLocation();
	}

	/**
	* Returns the ma chi cuc hq of this vr corporation attendee.
	*
	* @return the ma chi cuc hq of this vr corporation attendee
	*/
	@Override
	public java.lang.String getMaChiCucHQ() {
		return _vrCorporationAttendee.getMaChiCucHQ();
	}

	/**
	* Returns the ma kieu loai of this vr corporation attendee.
	*
	* @return the ma kieu loai of this vr corporation attendee
	*/
	@Override
	public java.lang.String getMaKieuLoai() {
		return _vrCorporationAttendee.getMaKieuLoai();
	}

	/**
	* Returns the manager name of this vr corporation attendee.
	*
	* @return the manager name of this vr corporation attendee
	*/
	@Override
	public java.lang.String getManagerName() {
		return _vrCorporationAttendee.getManagerName();
	}

	/**
	* Returns the ngay tkhq of this vr corporation attendee.
	*
	* @return the ngay tkhq of this vr corporation attendee
	*/
	@Override
	public java.lang.String getNgayTKHQ() {
		return _vrCorporationAttendee.getNgayTKHQ();
	}

	/**
	* Returns the nhan hieu of this vr corporation attendee.
	*
	* @return the nhan hieu of this vr corporation attendee
	*/
	@Override
	public java.lang.String getNhanHieu() {
		return _vrCorporationAttendee.getNhanHieu();
	}

	/**
	* Returns the overdue of this vr corporation attendee.
	*
	* @return the overdue of this vr corporation attendee
	*/
	@Override
	public java.lang.String getOverdue() {
		return _vrCorporationAttendee.getOverdue();
	}

	/**
	* Returns the permission of this vr corporation attendee.
	*
	* @return the permission of this vr corporation attendee
	*/
	@Override
	public java.lang.String getPermission() {
		return _vrCorporationAttendee.getPermission();
	}

	/**
	* Returns the priority of this vr corporation attendee.
	*
	* @return the priority of this vr corporation attendee
	*/
	@Override
	public java.lang.String getPriority() {
		return _vrCorporationAttendee.getPriority();
	}

	/**
	* Returns the progress of this vr corporation attendee.
	*
	* @return the progress of this vr corporation attendee
	*/
	@Override
	public java.lang.String getProgress() {
		return _vrCorporationAttendee.getProgress();
	}

	/**
	* Returns the registerednumber of this vr corporation attendee.
	*
	* @return the registerednumber of this vr corporation attendee
	*/
	@Override
	public java.lang.String getRegisterednumber() {
		return _vrCorporationAttendee.getRegisterednumber();
	}

	/**
	* Returns the result note of this vr corporation attendee.
	*
	* @return the result note of this vr corporation attendee
	*/
	@Override
	public java.lang.String getResultNote() {
		return _vrCorporationAttendee.getResultNote();
	}

	/**
	* Returns the service name of this vr corporation attendee.
	*
	* @return the service name of this vr corporation attendee
	*/
	@Override
	public java.lang.String getServiceName() {
		return _vrCorporationAttendee.getServiceName();
	}

	/**
	* Returns the so dong co of this vr corporation attendee.
	*
	* @return the so dong co of this vr corporation attendee
	*/
	@Override
	public java.lang.String getSoDongCo() {
		return _vrCorporationAttendee.getSoDongCo();
	}

	/**
	* Returns the so gcn phe duyet kieu loai nuoc ngoai of this vr corporation attendee.
	*
	* @return the so gcn phe duyet kieu loai nuoc ngoai of this vr corporation attendee
	*/
	@Override
	public java.lang.String getSoGCNPheDuyetKieuLoaiNuocNgoai() {
		return _vrCorporationAttendee.getSoGCNPheDuyetKieuLoaiNuocNgoai();
	}

	/**
	* Returns the so gcn tham dinh thiet ke of this vr corporation attendee.
	*
	* @return the so gcn tham dinh thiet ke of this vr corporation attendee
	*/
	@Override
	public java.lang.String getSoGCNThamDinhThietKe() {
		return _vrCorporationAttendee.getSoGCNThamDinhThietKe();
	}

	/**
	* Returns the so khung of this vr corporation attendee.
	*
	* @return the so khung of this vr corporation attendee
	*/
	@Override
	public java.lang.String getSoKhung() {
		return _vrCorporationAttendee.getSoKhung();
	}

	/**
	* Returns the so tkhq of this vr corporation attendee.
	*
	* @return the so tkhq of this vr corporation attendee
	*/
	@Override
	public java.lang.String getSoTKHQ() {
		return _vrCorporationAttendee.getSoTKHQ();
	}

	/**
	* Returns the state of this vr corporation attendee.
	*
	* @return the state of this vr corporation attendee
	*/
	@Override
	public java.lang.String getState() {
		return _vrCorporationAttendee.getState();
	}

	/**
	* Returns the state color of this vr corporation attendee.
	*
	* @return the state color of this vr corporation attendee
	*/
	@Override
	public java.lang.String getStateColor() {
		return _vrCorporationAttendee.getStateColor();
	}

	/**
	* Returns the state name of this vr corporation attendee.
	*
	* @return the state name of this vr corporation attendee
	*/
	@Override
	public java.lang.String getStateName() {
		return _vrCorporationAttendee.getStateName();
	}

	/**
	* Returns the subject of this vr corporation attendee.
	*
	* @return the subject of this vr corporation attendee
	*/
	@Override
	public java.lang.String getSubject() {
		return _vrCorporationAttendee.getSubject();
	}

	/**
	* Returns the ten co so san xuat of this vr corporation attendee.
	*
	* @return the ten co so san xuat of this vr corporation attendee
	*/
	@Override
	public java.lang.String getTenCoSoSanXuat() {
		return _vrCorporationAttendee.getTenCoSoSanXuat();
	}

	/**
	* Returns the ten thuong mai of this vr corporation attendee.
	*
	* @return the ten thuong mai of this vr corporation attendee
	*/
	@Override
	public java.lang.String getTenThuongMai() {
		return _vrCorporationAttendee.getTenThuongMai();
	}

	/**
	* Returns the ten xuong san xuat of this vr corporation attendee.
	*
	* @return the ten xuong san xuat of this vr corporation attendee
	*/
	@Override
	public java.lang.String getTenXuongSanXuat() {
		return _vrCorporationAttendee.getTenXuongSanXuat();
	}

	/**
	* Returns the testing place city of this vr corporation attendee.
	*
	* @return the testing place city of this vr corporation attendee
	*/
	@Override
	public java.lang.String getTestingPlaceCity() {
		return _vrCorporationAttendee.getTestingPlaceCity();
	}

	/**
	* Returns the testing place country of this vr corporation attendee.
	*
	* @return the testing place country of this vr corporation attendee
	*/
	@Override
	public java.lang.String getTestingPlaceCountry() {
		return _vrCorporationAttendee.getTestingPlaceCountry();
	}

	/**
	* Returns the testing place district of this vr corporation attendee.
	*
	* @return the testing place district of this vr corporation attendee
	*/
	@Override
	public java.lang.String getTestingPlaceDistrict() {
		return _vrCorporationAttendee.getTestingPlaceDistrict();
	}

	/**
	* Returns the testing place region of this vr corporation attendee.
	*
	* @return the testing place region of this vr corporation attendee
	*/
	@Override
	public java.lang.String getTestingPlaceRegion() {
		return _vrCorporationAttendee.getTestingPlaceRegion();
	}

	/**
	* Returns the testing registered place of this vr corporation attendee.
	*
	* @return the testing registered place of this vr corporation attendee
	*/
	@Override
	public java.lang.String getTestingRegisteredPlace() {
		return _vrCorporationAttendee.getTestingRegisteredPlace();
	}

	/**
	* Returns the testing remarks of this vr corporation attendee.
	*
	* @return the testing remarks of this vr corporation attendee
	*/
	@Override
	public java.lang.String getTestingRemarks() {
		return _vrCorporationAttendee.getTestingRemarks();
	}

	/**
	* Returns the tinh trang phuong tien of this vr corporation attendee.
	*
	* @return the tinh trang phuong tien of this vr corporation attendee
	*/
	@Override
	public java.lang.String getTinhTrangPhuongTien() {
		return _vrCorporationAttendee.getTinhTrangPhuongTien();
	}

	/**
	* Returns the user name of this vr corporation attendee.
	*
	* @return the user name of this vr corporation attendee
	*/
	@Override
	public java.lang.String getUserName() {
		return _vrCorporationAttendee.getUserName();
	}

	/**
	* Returns the user uuid of this vr corporation attendee.
	*
	* @return the user uuid of this vr corporation attendee
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _vrCorporationAttendee.getUserUuid();
	}

	/**
	* Returns the vaqcontactname of this vr corporation attendee.
	*
	* @return the vaqcontactname of this vr corporation attendee
	*/
	@Override
	public java.lang.String getVaqcontactname() {
		return _vrCorporationAttendee.getVaqcontactname();
	}

	/**
	* Returns the vaqcontactphone of this vr corporation attendee.
	*
	* @return the vaqcontactphone of this vr corporation attendee
	*/
	@Override
	public java.lang.String getVaqcontactphone() {
		return _vrCorporationAttendee.getVaqcontactphone();
	}

	@Override
	public java.lang.String toString() {
		return _vrCorporationAttendee.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrCorporationAttendee.toXmlString();
	}

	/**
	* Returns the create date of this vr corporation attendee.
	*
	* @return the create date of this vr corporation attendee
	*/
	@Override
	public Date getCreateDate() {
		return _vrCorporationAttendee.getCreateDate();
	}

	/**
	* Returns the end date of this vr corporation attendee.
	*
	* @return the end date of this vr corporation attendee
	*/
	@Override
	public Date getEndDate() {
		return _vrCorporationAttendee.getEndDate();
	}

	/**
	* Returns the finish date of this vr corporation attendee.
	*
	* @return the finish date of this vr corporation attendee
	*/
	@Override
	public Date getFinishDate() {
		return _vrCorporationAttendee.getFinishDate();
	}

	/**
	* Returns the inspection date of this vr corporation attendee.
	*
	* @return the inspection date of this vr corporation attendee
	*/
	@Override
	public Date getInspectionDate() {
		return _vrCorporationAttendee.getInspectionDate();
	}

	/**
	* Returns the modify date of this vr corporation attendee.
	*
	* @return the modify date of this vr corporation attendee
	*/
	@Override
	public Date getModifyDate() {
		return _vrCorporationAttendee.getModifyDate();
	}

	/**
	* Returns the start date of this vr corporation attendee.
	*
	* @return the start date of this vr corporation attendee
	*/
	@Override
	public Date getStartDate() {
		return _vrCorporationAttendee.getStartDate();
	}

	/**
	* Returns the sync date of this vr corporation attendee.
	*
	* @return the sync date of this vr corporation attendee
	*/
	@Override
	public Date getSyncDate() {
		return _vrCorporationAttendee.getSyncDate();
	}

	/**
	* Returns the activity ID of this vr corporation attendee.
	*
	* @return the activity ID of this vr corporation attendee
	*/
	@Override
	public long getActivityId() {
		return _vrCorporationAttendee.getActivityId();
	}

	/**
	* Returns the dossier ID of this vr corporation attendee.
	*
	* @return the dossier ID of this vr corporation attendee
	*/
	@Override
	public long getDossierId() {
		return _vrCorporationAttendee.getDossierId();
	}

	/**
	* Returns the ID of this vr corporation attendee.
	*
	* @return the ID of this vr corporation attendee
	*/
	@Override
	public long getId() {
		return _vrCorporationAttendee.getId();
	}

	/**
	* Returns the job pos ID of this vr corporation attendee.
	*
	* @return the job pos ID of this vr corporation attendee
	*/
	@Override
	public long getJobPosId() {
		return _vrCorporationAttendee.getJobPosId();
	}

	/**
	* Returns the leader ID of this vr corporation attendee.
	*
	* @return the leader ID of this vr corporation attendee
	*/
	@Override
	public long getLeaderId() {
		return _vrCorporationAttendee.getLeaderId();
	}

	/**
	* Returns the manager ID of this vr corporation attendee.
	*
	* @return the manager ID of this vr corporation attendee
	*/
	@Override
	public long getManagerId() {
		return _vrCorporationAttendee.getManagerId();
	}

	/**
	* Returns the mt core of this vr corporation attendee.
	*
	* @return the mt core of this vr corporation attendee
	*/
	@Override
	public long getMtCore() {
		return _vrCorporationAttendee.getMtCore();
	}

	/**
	* Returns the primary key of this vr corporation attendee.
	*
	* @return the primary key of this vr corporation attendee
	*/
	@Override
	public long getPrimaryKey() {
		return _vrCorporationAttendee.getPrimaryKey();
	}

	/**
	* Returns the user ID of this vr corporation attendee.
	*
	* @return the user ID of this vr corporation attendee
	*/
	@Override
	public long getUserId() {
		return _vrCorporationAttendee.getUserId();
	}

	@Override
	public void persist() {
		_vrCorporationAttendee.persist();
	}

	/**
	* Sets the activity catetory of this vr corporation attendee.
	*
	* @param activityCatetory the activity catetory of this vr corporation attendee
	*/
	@Override
	public void setActivityCatetory(java.lang.String activityCatetory) {
		_vrCorporationAttendee.setActivityCatetory(activityCatetory);
	}

	/**
	* Sets the activity ID of this vr corporation attendee.
	*
	* @param activityId the activity ID of this vr corporation attendee
	*/
	@Override
	public void setActivityId(long activityId) {
		_vrCorporationAttendee.setActivityId(activityId);
	}

	/**
	* Sets the activity type of this vr corporation attendee.
	*
	* @param activityType the activity type of this vr corporation attendee
	*/
	@Override
	public void setActivityType(java.lang.String activityType) {
		_vrCorporationAttendee.setActivityType(activityType);
	}

	/**
	* Sets the applicant ID no of this vr corporation attendee.
	*
	* @param applicantIdNo the applicant ID no of this vr corporation attendee
	*/
	@Override
	public void setApplicantIdNo(java.lang.String applicantIdNo) {
		_vrCorporationAttendee.setApplicantIdNo(applicantIdNo);
	}

	/**
	* Sets the assign type of this vr corporation attendee.
	*
	* @param assignType the assign type of this vr corporation attendee
	*/
	@Override
	public void setAssignType(java.lang.String assignType) {
		_vrCorporationAttendee.setAssignType(assignType);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrCorporationAttendee.setCachedModel(cachedModel);
	}

	/**
	* Sets the category name of this vr corporation attendee.
	*
	* @param categoryName the category name of this vr corporation attendee
	*/
	@Override
	public void setCategoryName(java.lang.String categoryName) {
		_vrCorporationAttendee.setCategoryName(categoryName);
	}

	/**
	* Sets the corporation code of this vr corporation attendee.
	*
	* @param corporationCode the corporation code of this vr corporation attendee
	*/
	@Override
	public void setCorporationCode(java.lang.String corporationCode) {
		_vrCorporationAttendee.setCorporationCode(corporationCode);
	}

	/**
	* Sets the corporation name of this vr corporation attendee.
	*
	* @param corporationName the corporation name of this vr corporation attendee
	*/
	@Override
	public void setCorporationName(java.lang.String corporationName) {
		_vrCorporationAttendee.setCorporationName(corporationName);
	}

	/**
	* Sets the create date of this vr corporation attendee.
	*
	* @param createDate the create date of this vr corporation attendee
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_vrCorporationAttendee.setCreateDate(createDate);
	}

	/**
	* Sets the description of this vr corporation attendee.
	*
	* @param description the description of this vr corporation attendee
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_vrCorporationAttendee.setDescription(description);
	}

	/**
	* Sets the dia chi co so san xuat of this vr corporation attendee.
	*
	* @param diaChiCoSoSanXuat the dia chi co so san xuat of this vr corporation attendee
	*/
	@Override
	public void setDiaChiCoSoSanXuat(java.lang.String diaChiCoSoSanXuat) {
		_vrCorporationAttendee.setDiaChiCoSoSanXuat(diaChiCoSoSanXuat);
	}

	/**
	* Sets the dia chi xuong san xuat of this vr corporation attendee.
	*
	* @param diaChiXuongSanXuat the dia chi xuong san xuat of this vr corporation attendee
	*/
	@Override
	public void setDiaChiXuongSanXuat(java.lang.String diaChiXuongSanXuat) {
		_vrCorporationAttendee.setDiaChiXuongSanXuat(diaChiXuongSanXuat);
	}

	/**
	* Sets the dossier ID of this vr corporation attendee.
	*
	* @param dossierId the dossier ID of this vr corporation attendee
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrCorporationAttendee.setDossierId(dossierId);
	}

	/**
	* Sets the editable of this vr corporation attendee.
	*
	* @param editable the editable of this vr corporation attendee
	*/
	@Override
	public void setEditable(java.lang.String editable) {
		_vrCorporationAttendee.setEditable(editable);
	}

	/**
	* Sets the end date of this vr corporation attendee.
	*
	* @param endDate the end date of this vr corporation attendee
	*/
	@Override
	public void setEndDate(Date endDate) {
		_vrCorporationAttendee.setEndDate(endDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrCorporationAttendee.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrCorporationAttendee.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrCorporationAttendee.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the finish date of this vr corporation attendee.
	*
	* @param finishDate the finish date of this vr corporation attendee
	*/
	@Override
	public void setFinishDate(Date finishDate) {
		_vrCorporationAttendee.setFinishDate(finishDate);
	}

	/**
	* Sets the geolocation of this vr corporation attendee.
	*
	* @param geolocation the geolocation of this vr corporation attendee
	*/
	@Override
	public void setGeolocation(java.lang.String geolocation) {
		_vrCorporationAttendee.setGeolocation(geolocation);
	}

	/**
	* Sets the hosting of this vr corporation attendee.
	*
	* @param hosting the hosting of this vr corporation attendee
	*/
	@Override
	public void setHosting(java.lang.String hosting) {
		_vrCorporationAttendee.setHosting(hosting);
	}

	/**
	* Sets the hosting ID of this vr corporation attendee.
	*
	* @param hostingId the hosting ID of this vr corporation attendee
	*/
	@Override
	public void setHostingId(int hostingId) {
		_vrCorporationAttendee.setHostingId(hostingId);
	}

	/**
	* Sets the ID of this vr corporation attendee.
	*
	* @param id the ID of this vr corporation attendee
	*/
	@Override
	public void setId(long id) {
		_vrCorporationAttendee.setId(id);
	}

	/**
	* Sets the importercontactemail of this vr corporation attendee.
	*
	* @param importercontactemail the importercontactemail of this vr corporation attendee
	*/
	@Override
	public void setImportercontactemail(java.lang.String importercontactemail) {
		_vrCorporationAttendee.setImportercontactemail(importercontactemail);
	}

	/**
	* Sets the importercontactname of this vr corporation attendee.
	*
	* @param importercontactname the importercontactname of this vr corporation attendee
	*/
	@Override
	public void setImportercontactname(java.lang.String importercontactname) {
		_vrCorporationAttendee.setImportercontactname(importercontactname);
	}

	/**
	* Sets the importercontactphone of this vr corporation attendee.
	*
	* @param importercontactphone the importercontactphone of this vr corporation attendee
	*/
	@Override
	public void setImportercontactphone(java.lang.String importercontactphone) {
		_vrCorporationAttendee.setImportercontactphone(importercontactphone);
	}

	/**
	* Sets the importerfax of this vr corporation attendee.
	*
	* @param importerfax the importerfax of this vr corporation attendee
	*/
	@Override
	public void setImporterfax(java.lang.String importerfax) {
		_vrCorporationAttendee.setImporterfax(importerfax);
	}

	/**
	* Sets the inspection date of this vr corporation attendee.
	*
	* @param inspectionDate the inspection date of this vr corporation attendee
	*/
	@Override
	public void setInspectionDate(Date inspectionDate) {
		_vrCorporationAttendee.setInspectionDate(inspectionDate);
	}

	/**
	* Sets the invitation of this vr corporation attendee.
	*
	* @param invitation the invitation of this vr corporation attendee
	*/
	@Override
	public void setInvitation(java.lang.String invitation) {
		_vrCorporationAttendee.setInvitation(invitation);
	}

	/**
	* Sets the job pos ID of this vr corporation attendee.
	*
	* @param jobPosId the job pos ID of this vr corporation attendee
	*/
	@Override
	public void setJobPosId(long jobPosId) {
		_vrCorporationAttendee.setJobPosId(jobPosId);
	}

	/**
	* Sets the job pos title of this vr corporation attendee.
	*
	* @param jobPosTitle the job pos title of this vr corporation attendee
	*/
	@Override
	public void setJobPosTitle(java.lang.String jobPosTitle) {
		_vrCorporationAttendee.setJobPosTitle(jobPosTitle);
	}

	/**
	* Sets the ky hieu thiet ke of this vr corporation attendee.
	*
	* @param kyHieuThietKe the ky hieu thiet ke of this vr corporation attendee
	*/
	@Override
	public void setKyHieuThietKe(java.lang.String kyHieuThietKe) {
		_vrCorporationAttendee.setKyHieuThietKe(kyHieuThietKe);
	}

	/**
	* Sets the leader ID of this vr corporation attendee.
	*
	* @param leaderId the leader ID of this vr corporation attendee
	*/
	@Override
	public void setLeaderId(long leaderId) {
		_vrCorporationAttendee.setLeaderId(leaderId);
	}

	/**
	* Sets the leader job title of this vr corporation attendee.
	*
	* @param leaderJobTitle the leader job title of this vr corporation attendee
	*/
	@Override
	public void setLeaderJobTitle(java.lang.String leaderJobTitle) {
		_vrCorporationAttendee.setLeaderJobTitle(leaderJobTitle);
	}

	/**
	* Sets the leader name of this vr corporation attendee.
	*
	* @param leaderName the leader name of this vr corporation attendee
	*/
	@Override
	public void setLeaderName(java.lang.String leaderName) {
		_vrCorporationAttendee.setLeaderName(leaderName);
	}

	/**
	* Sets the loai phuong tien of this vr corporation attendee.
	*
	* @param loaiPhuongTien the loai phuong tien of this vr corporation attendee
	*/
	@Override
	public void setLoaiPhuongTien(java.lang.String loaiPhuongTien) {
		_vrCorporationAttendee.setLoaiPhuongTien(loaiPhuongTien);
	}

	/**
	* Sets the location of this vr corporation attendee.
	*
	* @param location the location of this vr corporation attendee
	*/
	@Override
	public void setLocation(java.lang.String location) {
		_vrCorporationAttendee.setLocation(location);
	}

	/**
	* Sets the location ID of this vr corporation attendee.
	*
	* @param locationId the location ID of this vr corporation attendee
	*/
	@Override
	public void setLocationId(int locationId) {
		_vrCorporationAttendee.setLocationId(locationId);
	}

	/**
	* Sets the ma chi cuc hq of this vr corporation attendee.
	*
	* @param maChiCucHQ the ma chi cuc hq of this vr corporation attendee
	*/
	@Override
	public void setMaChiCucHQ(java.lang.String maChiCucHQ) {
		_vrCorporationAttendee.setMaChiCucHQ(maChiCucHQ);
	}

	/**
	* Sets the ma kieu loai of this vr corporation attendee.
	*
	* @param maKieuLoai the ma kieu loai of this vr corporation attendee
	*/
	@Override
	public void setMaKieuLoai(java.lang.String maKieuLoai) {
		_vrCorporationAttendee.setMaKieuLoai(maKieuLoai);
	}

	/**
	* Sets the manager ID of this vr corporation attendee.
	*
	* @param managerId the manager ID of this vr corporation attendee
	*/
	@Override
	public void setManagerId(long managerId) {
		_vrCorporationAttendee.setManagerId(managerId);
	}

	/**
	* Sets the manager name of this vr corporation attendee.
	*
	* @param managerName the manager name of this vr corporation attendee
	*/
	@Override
	public void setManagerName(java.lang.String managerName) {
		_vrCorporationAttendee.setManagerName(managerName);
	}

	/**
	* Sets the modify date of this vr corporation attendee.
	*
	* @param modifyDate the modify date of this vr corporation attendee
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrCorporationAttendee.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr corporation attendee.
	*
	* @param mtCore the mt core of this vr corporation attendee
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrCorporationAttendee.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrCorporationAttendee.setNew(n);
	}

	/**
	* Sets the ngay tkhq of this vr corporation attendee.
	*
	* @param ngayTKHQ the ngay tkhq of this vr corporation attendee
	*/
	@Override
	public void setNgayTKHQ(java.lang.String ngayTKHQ) {
		_vrCorporationAttendee.setNgayTKHQ(ngayTKHQ);
	}

	/**
	* Sets the nhan hieu of this vr corporation attendee.
	*
	* @param nhanHieu the nhan hieu of this vr corporation attendee
	*/
	@Override
	public void setNhanHieu(java.lang.String nhanHieu) {
		_vrCorporationAttendee.setNhanHieu(nhanHieu);
	}

	/**
	* Sets the overdue of this vr corporation attendee.
	*
	* @param overdue the overdue of this vr corporation attendee
	*/
	@Override
	public void setOverdue(java.lang.String overdue) {
		_vrCorporationAttendee.setOverdue(overdue);
	}

	/**
	* Sets the permission of this vr corporation attendee.
	*
	* @param permission the permission of this vr corporation attendee
	*/
	@Override
	public void setPermission(java.lang.String permission) {
		_vrCorporationAttendee.setPermission(permission);
	}

	/**
	* Sets the primary key of this vr corporation attendee.
	*
	* @param primaryKey the primary key of this vr corporation attendee
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrCorporationAttendee.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrCorporationAttendee.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the priority of this vr corporation attendee.
	*
	* @param priority the priority of this vr corporation attendee
	*/
	@Override
	public void setPriority(java.lang.String priority) {
		_vrCorporationAttendee.setPriority(priority);
	}

	/**
	* Sets the progress of this vr corporation attendee.
	*
	* @param progress the progress of this vr corporation attendee
	*/
	@Override
	public void setProgress(java.lang.String progress) {
		_vrCorporationAttendee.setProgress(progress);
	}

	/**
	* Sets the registerednumber of this vr corporation attendee.
	*
	* @param registerednumber the registerednumber of this vr corporation attendee
	*/
	@Override
	public void setRegisterednumber(java.lang.String registerednumber) {
		_vrCorporationAttendee.setRegisterednumber(registerednumber);
	}

	/**
	* Sets the result note of this vr corporation attendee.
	*
	* @param resultNote the result note of this vr corporation attendee
	*/
	@Override
	public void setResultNote(java.lang.String resultNote) {
		_vrCorporationAttendee.setResultNote(resultNote);
	}

	/**
	* Sets the service name of this vr corporation attendee.
	*
	* @param serviceName the service name of this vr corporation attendee
	*/
	@Override
	public void setServiceName(java.lang.String serviceName) {
		_vrCorporationAttendee.setServiceName(serviceName);
	}

	/**
	* Sets the so dong co of this vr corporation attendee.
	*
	* @param soDongCo the so dong co of this vr corporation attendee
	*/
	@Override
	public void setSoDongCo(java.lang.String soDongCo) {
		_vrCorporationAttendee.setSoDongCo(soDongCo);
	}

	/**
	* Sets the so gcn phe duyet kieu loai nuoc ngoai of this vr corporation attendee.
	*
	* @param soGCNPheDuyetKieuLoaiNuocNgoai the so gcn phe duyet kieu loai nuoc ngoai of this vr corporation attendee
	*/
	@Override
	public void setSoGCNPheDuyetKieuLoaiNuocNgoai(
		java.lang.String soGCNPheDuyetKieuLoaiNuocNgoai) {
		_vrCorporationAttendee.setSoGCNPheDuyetKieuLoaiNuocNgoai(soGCNPheDuyetKieuLoaiNuocNgoai);
	}

	/**
	* Sets the so gcn tham dinh thiet ke of this vr corporation attendee.
	*
	* @param soGCNThamDinhThietKe the so gcn tham dinh thiet ke of this vr corporation attendee
	*/
	@Override
	public void setSoGCNThamDinhThietKe(java.lang.String soGCNThamDinhThietKe) {
		_vrCorporationAttendee.setSoGCNThamDinhThietKe(soGCNThamDinhThietKe);
	}

	/**
	* Sets the so khung of this vr corporation attendee.
	*
	* @param soKhung the so khung of this vr corporation attendee
	*/
	@Override
	public void setSoKhung(java.lang.String soKhung) {
		_vrCorporationAttendee.setSoKhung(soKhung);
	}

	/**
	* Sets the so tkhq of this vr corporation attendee.
	*
	* @param soTKHQ the so tkhq of this vr corporation attendee
	*/
	@Override
	public void setSoTKHQ(java.lang.String soTKHQ) {
		_vrCorporationAttendee.setSoTKHQ(soTKHQ);
	}

	/**
	* Sets the start date of this vr corporation attendee.
	*
	* @param startDate the start date of this vr corporation attendee
	*/
	@Override
	public void setStartDate(Date startDate) {
		_vrCorporationAttendee.setStartDate(startDate);
	}

	/**
	* Sets the state of this vr corporation attendee.
	*
	* @param state the state of this vr corporation attendee
	*/
	@Override
	public void setState(java.lang.String state) {
		_vrCorporationAttendee.setState(state);
	}

	/**
	* Sets the state color of this vr corporation attendee.
	*
	* @param stateColor the state color of this vr corporation attendee
	*/
	@Override
	public void setStateColor(java.lang.String stateColor) {
		_vrCorporationAttendee.setStateColor(stateColor);
	}

	/**
	* Sets the state name of this vr corporation attendee.
	*
	* @param stateName the state name of this vr corporation attendee
	*/
	@Override
	public void setStateName(java.lang.String stateName) {
		_vrCorporationAttendee.setStateName(stateName);
	}

	/**
	* Sets the subject of this vr corporation attendee.
	*
	* @param subject the subject of this vr corporation attendee
	*/
	@Override
	public void setSubject(java.lang.String subject) {
		_vrCorporationAttendee.setSubject(subject);
	}

	/**
	* Sets the sync date of this vr corporation attendee.
	*
	* @param syncDate the sync date of this vr corporation attendee
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrCorporationAttendee.setSyncDate(syncDate);
	}

	/**
	* Sets the ten co so san xuat of this vr corporation attendee.
	*
	* @param tenCoSoSanXuat the ten co so san xuat of this vr corporation attendee
	*/
	@Override
	public void setTenCoSoSanXuat(java.lang.String tenCoSoSanXuat) {
		_vrCorporationAttendee.setTenCoSoSanXuat(tenCoSoSanXuat);
	}

	/**
	* Sets the ten thuong mai of this vr corporation attendee.
	*
	* @param tenThuongMai the ten thuong mai of this vr corporation attendee
	*/
	@Override
	public void setTenThuongMai(java.lang.String tenThuongMai) {
		_vrCorporationAttendee.setTenThuongMai(tenThuongMai);
	}

	/**
	* Sets the ten xuong san xuat of this vr corporation attendee.
	*
	* @param tenXuongSanXuat the ten xuong san xuat of this vr corporation attendee
	*/
	@Override
	public void setTenXuongSanXuat(java.lang.String tenXuongSanXuat) {
		_vrCorporationAttendee.setTenXuongSanXuat(tenXuongSanXuat);
	}

	/**
	* Sets the testing place city of this vr corporation attendee.
	*
	* @param testingPlaceCity the testing place city of this vr corporation attendee
	*/
	@Override
	public void setTestingPlaceCity(java.lang.String testingPlaceCity) {
		_vrCorporationAttendee.setTestingPlaceCity(testingPlaceCity);
	}

	/**
	* Sets the testing place country of this vr corporation attendee.
	*
	* @param testingPlaceCountry the testing place country of this vr corporation attendee
	*/
	@Override
	public void setTestingPlaceCountry(java.lang.String testingPlaceCountry) {
		_vrCorporationAttendee.setTestingPlaceCountry(testingPlaceCountry);
	}

	/**
	* Sets the testing place district of this vr corporation attendee.
	*
	* @param testingPlaceDistrict the testing place district of this vr corporation attendee
	*/
	@Override
	public void setTestingPlaceDistrict(java.lang.String testingPlaceDistrict) {
		_vrCorporationAttendee.setTestingPlaceDistrict(testingPlaceDistrict);
	}

	/**
	* Sets the testing place region of this vr corporation attendee.
	*
	* @param testingPlaceRegion the testing place region of this vr corporation attendee
	*/
	@Override
	public void setTestingPlaceRegion(java.lang.String testingPlaceRegion) {
		_vrCorporationAttendee.setTestingPlaceRegion(testingPlaceRegion);
	}

	/**
	* Sets the testing registered place of this vr corporation attendee.
	*
	* @param testingRegisteredPlace the testing registered place of this vr corporation attendee
	*/
	@Override
	public void setTestingRegisteredPlace(
		java.lang.String testingRegisteredPlace) {
		_vrCorporationAttendee.setTestingRegisteredPlace(testingRegisteredPlace);
	}

	/**
	* Sets the testing remarks of this vr corporation attendee.
	*
	* @param testingRemarks the testing remarks of this vr corporation attendee
	*/
	@Override
	public void setTestingRemarks(java.lang.String testingRemarks) {
		_vrCorporationAttendee.setTestingRemarks(testingRemarks);
	}

	/**
	* Sets the tinh trang phuong tien of this vr corporation attendee.
	*
	* @param tinhTrangPhuongTien the tinh trang phuong tien of this vr corporation attendee
	*/
	@Override
	public void setTinhTrangPhuongTien(java.lang.String tinhTrangPhuongTien) {
		_vrCorporationAttendee.setTinhTrangPhuongTien(tinhTrangPhuongTien);
	}

	/**
	* Sets the user ID of this vr corporation attendee.
	*
	* @param userId the user ID of this vr corporation attendee
	*/
	@Override
	public void setUserId(long userId) {
		_vrCorporationAttendee.setUserId(userId);
	}

	/**
	* Sets the user name of this vr corporation attendee.
	*
	* @param userName the user name of this vr corporation attendee
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_vrCorporationAttendee.setUserName(userName);
	}

	/**
	* Sets the user uuid of this vr corporation attendee.
	*
	* @param userUuid the user uuid of this vr corporation attendee
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vrCorporationAttendee.setUserUuid(userUuid);
	}

	/**
	* Sets the vaqcontactname of this vr corporation attendee.
	*
	* @param vaqcontactname the vaqcontactname of this vr corporation attendee
	*/
	@Override
	public void setVaqcontactname(java.lang.String vaqcontactname) {
		_vrCorporationAttendee.setVaqcontactname(vaqcontactname);
	}

	/**
	* Sets the vaqcontactphone of this vr corporation attendee.
	*
	* @param vaqcontactphone the vaqcontactphone of this vr corporation attendee
	*/
	@Override
	public void setVaqcontactphone(java.lang.String vaqcontactphone) {
		_vrCorporationAttendee.setVaqcontactphone(vaqcontactphone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCorporationAttendeeWrapper)) {
			return false;
		}

		VRCorporationAttendeeWrapper vrCorporationAttendeeWrapper = (VRCorporationAttendeeWrapper)obj;

		if (Objects.equals(_vrCorporationAttendee,
					vrCorporationAttendeeWrapper._vrCorporationAttendee)) {
			return true;
		}

		return false;
	}

	@Override
	public VRCorporationAttendee getWrappedModel() {
		return _vrCorporationAttendee;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrCorporationAttendee.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrCorporationAttendee.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrCorporationAttendee.resetOriginalValues();
	}

	private final VRCorporationAttendee _vrCorporationAttendee;
}