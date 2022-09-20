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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LamTV
 * @generated
 */
@ProviderType
public class VRCorporationAttendeeSoap implements Serializable {
	public static VRCorporationAttendeeSoap toSoapModel(
		VRCorporationAttendee model) {
		VRCorporationAttendeeSoap soapModel = new VRCorporationAttendeeSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());
		soapModel.setCorporationCode(model.getCorporationCode());
		soapModel.setCorporationName(model.getCorporationName());
		soapModel.setInspectionDate(model.getInspectionDate());
		soapModel.setRegisterednumber(model.getRegisterednumber());
		soapModel.setTestingRegisteredPlace(model.getTestingRegisteredPlace());
		soapModel.setTestingPlaceDistrict(model.getTestingPlaceDistrict());
		soapModel.setTestingPlaceCity(model.getTestingPlaceCity());
		soapModel.setTestingPlaceRegion(model.getTestingPlaceRegion());
		soapModel.setTestingPlaceCountry(model.getTestingPlaceCountry());
		soapModel.setTestingRemarks(model.getTestingRemarks());
		soapModel.setActivityId(model.getActivityId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setActivityType(model.getActivityType());
		soapModel.setActivityCatetory(model.getActivityCatetory());
		soapModel.setCategoryName(model.getCategoryName());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setServiceName(model.getServiceName());
		soapModel.setSubject(model.getSubject());
		soapModel.setHostingId(model.getHostingId());
		soapModel.setHosting(model.getHosting());
		soapModel.setLocationId(model.getLocationId());
		soapModel.setLocation(model.getLocation());
		soapModel.setGeolocation(model.getGeolocation());
		soapModel.setStartDate(model.getStartDate());
		soapModel.setEndDate(model.getEndDate());
		soapModel.setFinishDate(model.getFinishDate());
		soapModel.setState(model.getState());
		soapModel.setStateName(model.getStateName());
		soapModel.setStateColor(model.getStateColor());
		soapModel.setPriority(model.getPriority());
		soapModel.setOverdue(model.getOverdue());
		soapModel.setManagerId(model.getManagerId());
		soapModel.setManagerName(model.getManagerName());
		soapModel.setLeaderId(model.getLeaderId());
		soapModel.setLeaderName(model.getLeaderName());
		soapModel.setLeaderJobTitle(model.getLeaderJobTitle());
		soapModel.setDescription(model.getDescription());
		soapModel.setPermission(model.getPermission());
		soapModel.setResultNote(model.getResultNote());
		soapModel.setProgress(model.getProgress());
		soapModel.setAssignType(model.getAssignType());
		soapModel.setJobPosId(model.getJobPosId());
		soapModel.setJobPosTitle(model.getJobPosTitle());
		soapModel.setInvitation(model.getInvitation());
		soapModel.setEditable(model.getEditable());
		soapModel.setVaqcontactname(model.getVaqcontactname());
		soapModel.setVaqcontactphone(model.getVaqcontactphone());
		soapModel.setApplicantIdNo(model.getApplicantIdNo());
		soapModel.setImportercontactname(model.getImportercontactname());
		soapModel.setImportercontactphone(model.getImportercontactphone());
		soapModel.setImportercontactemail(model.getImportercontactemail());
		soapModel.setImporterfax(model.getImporterfax());
		soapModel.setSoTKHQ(model.getSoTKHQ());
		soapModel.setNgayTKHQ(model.getNgayTKHQ());
		soapModel.setMaChiCucHQ(model.getMaChiCucHQ());
		soapModel.setNhanHieu(model.getNhanHieu());
		soapModel.setTenThuongMai(model.getTenThuongMai());
		soapModel.setMaKieuLoai(model.getMaKieuLoai());
		soapModel.setLoaiPhuongTien(model.getLoaiPhuongTien());
		soapModel.setSoKhung(model.getSoKhung());
		soapModel.setSoDongCo(model.getSoDongCo());
		soapModel.setTinhTrangPhuongTien(model.getTinhTrangPhuongTien());
		soapModel.setKyHieuThietKe(model.getKyHieuThietKe());
		soapModel.setSoGCNThamDinhThietKe(model.getSoGCNThamDinhThietKe());
		soapModel.setSoGCNPheDuyetKieuLoaiNuocNgoai(model.getSoGCNPheDuyetKieuLoaiNuocNgoai());
		soapModel.setTenCoSoSanXuat(model.getTenCoSoSanXuat());
		soapModel.setDiaChiCoSoSanXuat(model.getDiaChiCoSoSanXuat());
		soapModel.setTenXuongSanXuat(model.getTenXuongSanXuat());
		soapModel.setDiaChiXuongSanXuat(model.getDiaChiXuongSanXuat());

		return soapModel;
	}

	public static VRCorporationAttendeeSoap[] toSoapModels(
		VRCorporationAttendee[] models) {
		VRCorporationAttendeeSoap[] soapModels = new VRCorporationAttendeeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRCorporationAttendeeSoap[][] toSoapModels(
		VRCorporationAttendee[][] models) {
		VRCorporationAttendeeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRCorporationAttendeeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRCorporationAttendeeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRCorporationAttendeeSoap[] toSoapModels(
		List<VRCorporationAttendee> models) {
		List<VRCorporationAttendeeSoap> soapModels = new ArrayList<VRCorporationAttendeeSoap>(models.size());

		for (VRCorporationAttendee model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRCorporationAttendeeSoap[soapModels.size()]);
	}

	public VRCorporationAttendeeSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getMtCore() {
		return _mtCore;
	}

	public void setMtCore(long mtCore) {
		_mtCore = mtCore;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	public String getCorporationCode() {
		return _corporationCode;
	}

	public void setCorporationCode(String corporationCode) {
		_corporationCode = corporationCode;
	}

	public String getCorporationName() {
		return _corporationName;
	}

	public void setCorporationName(String corporationName) {
		_corporationName = corporationName;
	}

	public Date getInspectionDate() {
		return _inspectionDate;
	}

	public void setInspectionDate(Date inspectionDate) {
		_inspectionDate = inspectionDate;
	}

	public String getRegisterednumber() {
		return _registerednumber;
	}

	public void setRegisterednumber(String registerednumber) {
		_registerednumber = registerednumber;
	}

	public String getTestingRegisteredPlace() {
		return _testingRegisteredPlace;
	}

	public void setTestingRegisteredPlace(String testingRegisteredPlace) {
		_testingRegisteredPlace = testingRegisteredPlace;
	}

	public String getTestingPlaceDistrict() {
		return _testingPlaceDistrict;
	}

	public void setTestingPlaceDistrict(String testingPlaceDistrict) {
		_testingPlaceDistrict = testingPlaceDistrict;
	}

	public String getTestingPlaceCity() {
		return _testingPlaceCity;
	}

	public void setTestingPlaceCity(String testingPlaceCity) {
		_testingPlaceCity = testingPlaceCity;
	}

	public String getTestingPlaceRegion() {
		return _testingPlaceRegion;
	}

	public void setTestingPlaceRegion(String testingPlaceRegion) {
		_testingPlaceRegion = testingPlaceRegion;
	}

	public String getTestingPlaceCountry() {
		return _testingPlaceCountry;
	}

	public void setTestingPlaceCountry(String testingPlaceCountry) {
		_testingPlaceCountry = testingPlaceCountry;
	}

	public String getTestingRemarks() {
		return _testingRemarks;
	}

	public void setTestingRemarks(String testingRemarks) {
		_testingRemarks = testingRemarks;
	}

	public long getActivityId() {
		return _activityId;
	}

	public void setActivityId(long activityId) {
		_activityId = activityId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public String getActivityType() {
		return _activityType;
	}

	public void setActivityType(String activityType) {
		_activityType = activityType;
	}

	public String getActivityCatetory() {
		return _activityCatetory;
	}

	public void setActivityCatetory(String activityCatetory) {
		_activityCatetory = activityCatetory;
	}

	public String getCategoryName() {
		return _categoryName;
	}

	public void setCategoryName(String categoryName) {
		_categoryName = categoryName;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public String getServiceName() {
		return _serviceName;
	}

	public void setServiceName(String serviceName) {
		_serviceName = serviceName;
	}

	public String getSubject() {
		return _subject;
	}

	public void setSubject(String subject) {
		_subject = subject;
	}

	public int getHostingId() {
		return _hostingId;
	}

	public void setHostingId(int hostingId) {
		_hostingId = hostingId;
	}

	public String getHosting() {
		return _hosting;
	}

	public void setHosting(String hosting) {
		_hosting = hosting;
	}

	public int getLocationId() {
		return _locationId;
	}

	public void setLocationId(int locationId) {
		_locationId = locationId;
	}

	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		_location = location;
	}

	public String getGeolocation() {
		return _geolocation;
	}

	public void setGeolocation(String geolocation) {
		_geolocation = geolocation;
	}

	public Date getStartDate() {
		return _startDate;
	}

	public void setStartDate(Date startDate) {
		_startDate = startDate;
	}

	public Date getEndDate() {
		return _endDate;
	}

	public void setEndDate(Date endDate) {
		_endDate = endDate;
	}

	public Date getFinishDate() {
		return _finishDate;
	}

	public void setFinishDate(Date finishDate) {
		_finishDate = finishDate;
	}

	public String getState() {
		return _state;
	}

	public void setState(String state) {
		_state = state;
	}

	public String getStateName() {
		return _stateName;
	}

	public void setStateName(String stateName) {
		_stateName = stateName;
	}

	public String getStateColor() {
		return _stateColor;
	}

	public void setStateColor(String stateColor) {
		_stateColor = stateColor;
	}

	public String getPriority() {
		return _priority;
	}

	public void setPriority(String priority) {
		_priority = priority;
	}

	public String getOverdue() {
		return _overdue;
	}

	public void setOverdue(String overdue) {
		_overdue = overdue;
	}

	public long getManagerId() {
		return _managerId;
	}

	public void setManagerId(long managerId) {
		_managerId = managerId;
	}

	public String getManagerName() {
		return _managerName;
	}

	public void setManagerName(String managerName) {
		_managerName = managerName;
	}

	public long getLeaderId() {
		return _leaderId;
	}

	public void setLeaderId(long leaderId) {
		_leaderId = leaderId;
	}

	public String getLeaderName() {
		return _leaderName;
	}

	public void setLeaderName(String leaderName) {
		_leaderName = leaderName;
	}

	public String getLeaderJobTitle() {
		return _leaderJobTitle;
	}

	public void setLeaderJobTitle(String leaderJobTitle) {
		_leaderJobTitle = leaderJobTitle;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getPermission() {
		return _permission;
	}

	public void setPermission(String permission) {
		_permission = permission;
	}

	public String getResultNote() {
		return _resultNote;
	}

	public void setResultNote(String resultNote) {
		_resultNote = resultNote;
	}

	public String getProgress() {
		return _progress;
	}

	public void setProgress(String progress) {
		_progress = progress;
	}

	public String getAssignType() {
		return _assignType;
	}

	public void setAssignType(String assignType) {
		_assignType = assignType;
	}

	public long getJobPosId() {
		return _jobPosId;
	}

	public void setJobPosId(long jobPosId) {
		_jobPosId = jobPosId;
	}

	public String getJobPosTitle() {
		return _jobPosTitle;
	}

	public void setJobPosTitle(String jobPosTitle) {
		_jobPosTitle = jobPosTitle;
	}

	public String getInvitation() {
		return _invitation;
	}

	public void setInvitation(String invitation) {
		_invitation = invitation;
	}

	public String getEditable() {
		return _editable;
	}

	public void setEditable(String editable) {
		_editable = editable;
	}

	public String getVaqcontactname() {
		return _vaqcontactname;
	}

	public void setVaqcontactname(String vaqcontactname) {
		_vaqcontactname = vaqcontactname;
	}

	public String getVaqcontactphone() {
		return _vaqcontactphone;
	}

	public void setVaqcontactphone(String vaqcontactphone) {
		_vaqcontactphone = vaqcontactphone;
	}

	public String getApplicantIdNo() {
		return _applicantIdNo;
	}

	public void setApplicantIdNo(String applicantIdNo) {
		_applicantIdNo = applicantIdNo;
	}

	public String getImportercontactname() {
		return _importercontactname;
	}

	public void setImportercontactname(String importercontactname) {
		_importercontactname = importercontactname;
	}

	public String getImportercontactphone() {
		return _importercontactphone;
	}

	public void setImportercontactphone(String importercontactphone) {
		_importercontactphone = importercontactphone;
	}

	public String getImportercontactemail() {
		return _importercontactemail;
	}

	public void setImportercontactemail(String importercontactemail) {
		_importercontactemail = importercontactemail;
	}

	public String getImporterfax() {
		return _importerfax;
	}

	public void setImporterfax(String importerfax) {
		_importerfax = importerfax;
	}

	public String getSoTKHQ() {
		return _soTKHQ;
	}

	public void setSoTKHQ(String soTKHQ) {
		_soTKHQ = soTKHQ;
	}

	public String getNgayTKHQ() {
		return _ngayTKHQ;
	}

	public void setNgayTKHQ(String ngayTKHQ) {
		_ngayTKHQ = ngayTKHQ;
	}

	public String getMaChiCucHQ() {
		return _maChiCucHQ;
	}

	public void setMaChiCucHQ(String maChiCucHQ) {
		_maChiCucHQ = maChiCucHQ;
	}

	public String getNhanHieu() {
		return _nhanHieu;
	}

	public void setNhanHieu(String nhanHieu) {
		_nhanHieu = nhanHieu;
	}

	public String getTenThuongMai() {
		return _tenThuongMai;
	}

	public void setTenThuongMai(String tenThuongMai) {
		_tenThuongMai = tenThuongMai;
	}

	public String getMaKieuLoai() {
		return _maKieuLoai;
	}

	public void setMaKieuLoai(String maKieuLoai) {
		_maKieuLoai = maKieuLoai;
	}

	public String getLoaiPhuongTien() {
		return _loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		_loaiPhuongTien = loaiPhuongTien;
	}

	public String getSoKhung() {
		return _soKhung;
	}

	public void setSoKhung(String soKhung) {
		_soKhung = soKhung;
	}

	public String getSoDongCo() {
		return _soDongCo;
	}

	public void setSoDongCo(String soDongCo) {
		_soDongCo = soDongCo;
	}

	public String getTinhTrangPhuongTien() {
		return _tinhTrangPhuongTien;
	}

	public void setTinhTrangPhuongTien(String tinhTrangPhuongTien) {
		_tinhTrangPhuongTien = tinhTrangPhuongTien;
	}

	public String getKyHieuThietKe() {
		return _kyHieuThietKe;
	}

	public void setKyHieuThietKe(String kyHieuThietKe) {
		_kyHieuThietKe = kyHieuThietKe;
	}

	public String getSoGCNThamDinhThietKe() {
		return _soGCNThamDinhThietKe;
	}

	public void setSoGCNThamDinhThietKe(String soGCNThamDinhThietKe) {
		_soGCNThamDinhThietKe = soGCNThamDinhThietKe;
	}

	public String getSoGCNPheDuyetKieuLoaiNuocNgoai() {
		return _soGCNPheDuyetKieuLoaiNuocNgoai;
	}

	public void setSoGCNPheDuyetKieuLoaiNuocNgoai(
		String soGCNPheDuyetKieuLoaiNuocNgoai) {
		_soGCNPheDuyetKieuLoaiNuocNgoai = soGCNPheDuyetKieuLoaiNuocNgoai;
	}

	public String getTenCoSoSanXuat() {
		return _tenCoSoSanXuat;
	}

	public void setTenCoSoSanXuat(String tenCoSoSanXuat) {
		_tenCoSoSanXuat = tenCoSoSanXuat;
	}

	public String getDiaChiCoSoSanXuat() {
		return _diaChiCoSoSanXuat;
	}

	public void setDiaChiCoSoSanXuat(String diaChiCoSoSanXuat) {
		_diaChiCoSoSanXuat = diaChiCoSoSanXuat;
	}

	public String getTenXuongSanXuat() {
		return _tenXuongSanXuat;
	}

	public void setTenXuongSanXuat(String tenXuongSanXuat) {
		_tenXuongSanXuat = tenXuongSanXuat;
	}

	public String getDiaChiXuongSanXuat() {
		return _diaChiXuongSanXuat;
	}

	public void setDiaChiXuongSanXuat(String diaChiXuongSanXuat) {
		_diaChiXuongSanXuat = diaChiXuongSanXuat;
	}

	private long _id;
	private long _mtCore;
	private Date _createDate;
	private Date _modifyDate;
	private Date _syncDate;
	private String _corporationCode;
	private String _corporationName;
	private Date _inspectionDate;
	private String _registerednumber;
	private String _testingRegisteredPlace;
	private String _testingPlaceDistrict;
	private String _testingPlaceCity;
	private String _testingPlaceRegion;
	private String _testingPlaceCountry;
	private String _testingRemarks;
	private long _activityId;
	private long _userId;
	private String _userName;
	private String _activityType;
	private String _activityCatetory;
	private String _categoryName;
	private long _dossierId;
	private String _serviceName;
	private String _subject;
	private int _hostingId;
	private String _hosting;
	private int _locationId;
	private String _location;
	private String _geolocation;
	private Date _startDate;
	private Date _endDate;
	private Date _finishDate;
	private String _state;
	private String _stateName;
	private String _stateColor;
	private String _priority;
	private String _overdue;
	private long _managerId;
	private String _managerName;
	private long _leaderId;
	private String _leaderName;
	private String _leaderJobTitle;
	private String _description;
	private String _permission;
	private String _resultNote;
	private String _progress;
	private String _assignType;
	private long _jobPosId;
	private String _jobPosTitle;
	private String _invitation;
	private String _editable;
	private String _vaqcontactname;
	private String _vaqcontactphone;
	private String _applicantIdNo;
	private String _importercontactname;
	private String _importercontactphone;
	private String _importercontactemail;
	private String _importerfax;
	private String _soTKHQ;
	private String _ngayTKHQ;
	private String _maChiCucHQ;
	private String _nhanHieu;
	private String _tenThuongMai;
	private String _maKieuLoai;
	private String _loaiPhuongTien;
	private String _soKhung;
	private String _soDongCo;
	private String _tinhTrangPhuongTien;
	private String _kyHieuThietKe;
	private String _soGCNThamDinhThietKe;
	private String _soGCNPheDuyetKieuLoaiNuocNgoai;
	private String _tenCoSoSanXuat;
	private String _diaChiCoSoSanXuat;
	private String _tenXuongSanXuat;
	private String _diaChiXuongSanXuat;
}