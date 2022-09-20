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

package com.fds.vr.business.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRCorporationAttendee;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VRCorporationAttendee in entity cache.
 *
 * @author LamTV
 * @see VRCorporationAttendee
 * @generated
 */
@ProviderType
public class VRCorporationAttendeeCacheModel implements CacheModel<VRCorporationAttendee>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCorporationAttendeeCacheModel)) {
			return false;
		}

		VRCorporationAttendeeCacheModel vrCorporationAttendeeCacheModel = (VRCorporationAttendeeCacheModel)obj;

		if (id == vrCorporationAttendeeCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(151);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append(", corporationCode=");
		sb.append(corporationCode);
		sb.append(", corporationName=");
		sb.append(corporationName);
		sb.append(", inspectionDate=");
		sb.append(inspectionDate);
		sb.append(", registerednumber=");
		sb.append(registerednumber);
		sb.append(", testingRegisteredPlace=");
		sb.append(testingRegisteredPlace);
		sb.append(", testingPlaceDistrict=");
		sb.append(testingPlaceDistrict);
		sb.append(", testingPlaceCity=");
		sb.append(testingPlaceCity);
		sb.append(", testingPlaceRegion=");
		sb.append(testingPlaceRegion);
		sb.append(", testingPlaceCountry=");
		sb.append(testingPlaceCountry);
		sb.append(", testingRemarks=");
		sb.append(testingRemarks);
		sb.append(", activityId=");
		sb.append(activityId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", activityType=");
		sb.append(activityType);
		sb.append(", activityCatetory=");
		sb.append(activityCatetory);
		sb.append(", categoryName=");
		sb.append(categoryName);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", serviceName=");
		sb.append(serviceName);
		sb.append(", subject=");
		sb.append(subject);
		sb.append(", hostingId=");
		sb.append(hostingId);
		sb.append(", hosting=");
		sb.append(hosting);
		sb.append(", locationId=");
		sb.append(locationId);
		sb.append(", location=");
		sb.append(location);
		sb.append(", geolocation=");
		sb.append(geolocation);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append(", finishDate=");
		sb.append(finishDate);
		sb.append(", state=");
		sb.append(state);
		sb.append(", stateName=");
		sb.append(stateName);
		sb.append(", stateColor=");
		sb.append(stateColor);
		sb.append(", priority=");
		sb.append(priority);
		sb.append(", overdue=");
		sb.append(overdue);
		sb.append(", managerId=");
		sb.append(managerId);
		sb.append(", managerName=");
		sb.append(managerName);
		sb.append(", leaderId=");
		sb.append(leaderId);
		sb.append(", leaderName=");
		sb.append(leaderName);
		sb.append(", leaderJobTitle=");
		sb.append(leaderJobTitle);
		sb.append(", description=");
		sb.append(description);
		sb.append(", permission=");
		sb.append(permission);
		sb.append(", resultNote=");
		sb.append(resultNote);
		sb.append(", progress=");
		sb.append(progress);
		sb.append(", assignType=");
		sb.append(assignType);
		sb.append(", jobPosId=");
		sb.append(jobPosId);
		sb.append(", jobPosTitle=");
		sb.append(jobPosTitle);
		sb.append(", invitation=");
		sb.append(invitation);
		sb.append(", editable=");
		sb.append(editable);
		sb.append(", vaqcontactname=");
		sb.append(vaqcontactname);
		sb.append(", vaqcontactphone=");
		sb.append(vaqcontactphone);
		sb.append(", applicantIdNo=");
		sb.append(applicantIdNo);
		sb.append(", importercontactname=");
		sb.append(importercontactname);
		sb.append(", importercontactphone=");
		sb.append(importercontactphone);
		sb.append(", importercontactemail=");
		sb.append(importercontactemail);
		sb.append(", importerfax=");
		sb.append(importerfax);
		sb.append(", soTKHQ=");
		sb.append(soTKHQ);
		sb.append(", ngayTKHQ=");
		sb.append(ngayTKHQ);
		sb.append(", maChiCucHQ=");
		sb.append(maChiCucHQ);
		sb.append(", nhanHieu=");
		sb.append(nhanHieu);
		sb.append(", tenThuongMai=");
		sb.append(tenThuongMai);
		sb.append(", maKieuLoai=");
		sb.append(maKieuLoai);
		sb.append(", loaiPhuongTien=");
		sb.append(loaiPhuongTien);
		sb.append(", soKhung=");
		sb.append(soKhung);
		sb.append(", soDongCo=");
		sb.append(soDongCo);
		sb.append(", tinhTrangPhuongTien=");
		sb.append(tinhTrangPhuongTien);
		sb.append(", kyHieuThietKe=");
		sb.append(kyHieuThietKe);
		sb.append(", soGCNThamDinhThietKe=");
		sb.append(soGCNThamDinhThietKe);
		sb.append(", soGCNPheDuyetKieuLoaiNuocNgoai=");
		sb.append(soGCNPheDuyetKieuLoaiNuocNgoai);
		sb.append(", tenCoSoSanXuat=");
		sb.append(tenCoSoSanXuat);
		sb.append(", diaChiCoSoSanXuat=");
		sb.append(diaChiCoSoSanXuat);
		sb.append(", tenXuongSanXuat=");
		sb.append(tenXuongSanXuat);
		sb.append(", diaChiXuongSanXuat=");
		sb.append(diaChiXuongSanXuat);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRCorporationAttendee toEntityModel() {
		VRCorporationAttendeeImpl vrCorporationAttendeeImpl = new VRCorporationAttendeeImpl();

		vrCorporationAttendeeImpl.setId(id);
		vrCorporationAttendeeImpl.setMtCore(mtCore);

		if (createDate == Long.MIN_VALUE) {
			vrCorporationAttendeeImpl.setCreateDate(null);
		}
		else {
			vrCorporationAttendeeImpl.setCreateDate(new Date(createDate));
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrCorporationAttendeeImpl.setModifyDate(null);
		}
		else {
			vrCorporationAttendeeImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrCorporationAttendeeImpl.setSyncDate(null);
		}
		else {
			vrCorporationAttendeeImpl.setSyncDate(new Date(syncDate));
		}

		if (corporationCode == null) {
			vrCorporationAttendeeImpl.setCorporationCode(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setCorporationCode(corporationCode);
		}

		if (corporationName == null) {
			vrCorporationAttendeeImpl.setCorporationName(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setCorporationName(corporationName);
		}

		if (inspectionDate == Long.MIN_VALUE) {
			vrCorporationAttendeeImpl.setInspectionDate(null);
		}
		else {
			vrCorporationAttendeeImpl.setInspectionDate(new Date(inspectionDate));
		}

		if (registerednumber == null) {
			vrCorporationAttendeeImpl.setRegisterednumber(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setRegisterednumber(registerednumber);
		}

		if (testingRegisteredPlace == null) {
			vrCorporationAttendeeImpl.setTestingRegisteredPlace(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setTestingRegisteredPlace(testingRegisteredPlace);
		}

		if (testingPlaceDistrict == null) {
			vrCorporationAttendeeImpl.setTestingPlaceDistrict(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setTestingPlaceDistrict(testingPlaceDistrict);
		}

		if (testingPlaceCity == null) {
			vrCorporationAttendeeImpl.setTestingPlaceCity(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setTestingPlaceCity(testingPlaceCity);
		}

		if (testingPlaceRegion == null) {
			vrCorporationAttendeeImpl.setTestingPlaceRegion(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setTestingPlaceRegion(testingPlaceRegion);
		}

		if (testingPlaceCountry == null) {
			vrCorporationAttendeeImpl.setTestingPlaceCountry(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setTestingPlaceCountry(testingPlaceCountry);
		}

		if (testingRemarks == null) {
			vrCorporationAttendeeImpl.setTestingRemarks(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setTestingRemarks(testingRemarks);
		}

		vrCorporationAttendeeImpl.setActivityId(activityId);
		vrCorporationAttendeeImpl.setUserId(userId);

		if (userName == null) {
			vrCorporationAttendeeImpl.setUserName(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setUserName(userName);
		}

		if (activityType == null) {
			vrCorporationAttendeeImpl.setActivityType(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setActivityType(activityType);
		}

		if (activityCatetory == null) {
			vrCorporationAttendeeImpl.setActivityCatetory(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setActivityCatetory(activityCatetory);
		}

		if (categoryName == null) {
			vrCorporationAttendeeImpl.setCategoryName(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setCategoryName(categoryName);
		}

		vrCorporationAttendeeImpl.setDossierId(dossierId);

		if (serviceName == null) {
			vrCorporationAttendeeImpl.setServiceName(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setServiceName(serviceName);
		}

		if (subject == null) {
			vrCorporationAttendeeImpl.setSubject(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setSubject(subject);
		}

		vrCorporationAttendeeImpl.setHostingId(hostingId);

		if (hosting == null) {
			vrCorporationAttendeeImpl.setHosting(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setHosting(hosting);
		}

		vrCorporationAttendeeImpl.setLocationId(locationId);

		if (location == null) {
			vrCorporationAttendeeImpl.setLocation(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setLocation(location);
		}

		if (geolocation == null) {
			vrCorporationAttendeeImpl.setGeolocation(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setGeolocation(geolocation);
		}

		if (startDate == Long.MIN_VALUE) {
			vrCorporationAttendeeImpl.setStartDate(null);
		}
		else {
			vrCorporationAttendeeImpl.setStartDate(new Date(startDate));
		}

		if (endDate == Long.MIN_VALUE) {
			vrCorporationAttendeeImpl.setEndDate(null);
		}
		else {
			vrCorporationAttendeeImpl.setEndDate(new Date(endDate));
		}

		if (finishDate == Long.MIN_VALUE) {
			vrCorporationAttendeeImpl.setFinishDate(null);
		}
		else {
			vrCorporationAttendeeImpl.setFinishDate(new Date(finishDate));
		}

		if (state == null) {
			vrCorporationAttendeeImpl.setState(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setState(state);
		}

		if (stateName == null) {
			vrCorporationAttendeeImpl.setStateName(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setStateName(stateName);
		}

		if (stateColor == null) {
			vrCorporationAttendeeImpl.setStateColor(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setStateColor(stateColor);
		}

		if (priority == null) {
			vrCorporationAttendeeImpl.setPriority(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setPriority(priority);
		}

		if (overdue == null) {
			vrCorporationAttendeeImpl.setOverdue(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setOverdue(overdue);
		}

		vrCorporationAttendeeImpl.setManagerId(managerId);

		if (managerName == null) {
			vrCorporationAttendeeImpl.setManagerName(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setManagerName(managerName);
		}

		vrCorporationAttendeeImpl.setLeaderId(leaderId);

		if (leaderName == null) {
			vrCorporationAttendeeImpl.setLeaderName(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setLeaderName(leaderName);
		}

		if (leaderJobTitle == null) {
			vrCorporationAttendeeImpl.setLeaderJobTitle(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setLeaderJobTitle(leaderJobTitle);
		}

		if (description == null) {
			vrCorporationAttendeeImpl.setDescription(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setDescription(description);
		}

		if (permission == null) {
			vrCorporationAttendeeImpl.setPermission(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setPermission(permission);
		}

		if (resultNote == null) {
			vrCorporationAttendeeImpl.setResultNote(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setResultNote(resultNote);
		}

		if (progress == null) {
			vrCorporationAttendeeImpl.setProgress(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setProgress(progress);
		}

		if (assignType == null) {
			vrCorporationAttendeeImpl.setAssignType(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setAssignType(assignType);
		}

		vrCorporationAttendeeImpl.setJobPosId(jobPosId);

		if (jobPosTitle == null) {
			vrCorporationAttendeeImpl.setJobPosTitle(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setJobPosTitle(jobPosTitle);
		}

		if (invitation == null) {
			vrCorporationAttendeeImpl.setInvitation(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setInvitation(invitation);
		}

		if (editable == null) {
			vrCorporationAttendeeImpl.setEditable(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setEditable(editable);
		}

		if (vaqcontactname == null) {
			vrCorporationAttendeeImpl.setVaqcontactname(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setVaqcontactname(vaqcontactname);
		}

		if (vaqcontactphone == null) {
			vrCorporationAttendeeImpl.setVaqcontactphone(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setVaqcontactphone(vaqcontactphone);
		}

		if (applicantIdNo == null) {
			vrCorporationAttendeeImpl.setApplicantIdNo(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setApplicantIdNo(applicantIdNo);
		}

		if (importercontactname == null) {
			vrCorporationAttendeeImpl.setImportercontactname(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setImportercontactname(importercontactname);
		}

		if (importercontactphone == null) {
			vrCorporationAttendeeImpl.setImportercontactphone(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setImportercontactphone(importercontactphone);
		}

		if (importercontactemail == null) {
			vrCorporationAttendeeImpl.setImportercontactemail(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setImportercontactemail(importercontactemail);
		}

		if (importerfax == null) {
			vrCorporationAttendeeImpl.setImporterfax(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setImporterfax(importerfax);
		}

		if (soTKHQ == null) {
			vrCorporationAttendeeImpl.setSoTKHQ(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setSoTKHQ(soTKHQ);
		}

		if (ngayTKHQ == null) {
			vrCorporationAttendeeImpl.setNgayTKHQ(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setNgayTKHQ(ngayTKHQ);
		}

		if (maChiCucHQ == null) {
			vrCorporationAttendeeImpl.setMaChiCucHQ(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setMaChiCucHQ(maChiCucHQ);
		}

		if (nhanHieu == null) {
			vrCorporationAttendeeImpl.setNhanHieu(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setNhanHieu(nhanHieu);
		}

		if (tenThuongMai == null) {
			vrCorporationAttendeeImpl.setTenThuongMai(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setTenThuongMai(tenThuongMai);
		}

		if (maKieuLoai == null) {
			vrCorporationAttendeeImpl.setMaKieuLoai(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setMaKieuLoai(maKieuLoai);
		}

		if (loaiPhuongTien == null) {
			vrCorporationAttendeeImpl.setLoaiPhuongTien(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setLoaiPhuongTien(loaiPhuongTien);
		}

		if (soKhung == null) {
			vrCorporationAttendeeImpl.setSoKhung(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setSoKhung(soKhung);
		}

		if (soDongCo == null) {
			vrCorporationAttendeeImpl.setSoDongCo(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setSoDongCo(soDongCo);
		}

		if (tinhTrangPhuongTien == null) {
			vrCorporationAttendeeImpl.setTinhTrangPhuongTien(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setTinhTrangPhuongTien(tinhTrangPhuongTien);
		}

		if (kyHieuThietKe == null) {
			vrCorporationAttendeeImpl.setKyHieuThietKe(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setKyHieuThietKe(kyHieuThietKe);
		}

		if (soGCNThamDinhThietKe == null) {
			vrCorporationAttendeeImpl.setSoGCNThamDinhThietKe(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setSoGCNThamDinhThietKe(soGCNThamDinhThietKe);
		}

		if (soGCNPheDuyetKieuLoaiNuocNgoai == null) {
			vrCorporationAttendeeImpl.setSoGCNPheDuyetKieuLoaiNuocNgoai(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setSoGCNPheDuyetKieuLoaiNuocNgoai(soGCNPheDuyetKieuLoaiNuocNgoai);
		}

		if (tenCoSoSanXuat == null) {
			vrCorporationAttendeeImpl.setTenCoSoSanXuat(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setTenCoSoSanXuat(tenCoSoSanXuat);
		}

		if (diaChiCoSoSanXuat == null) {
			vrCorporationAttendeeImpl.setDiaChiCoSoSanXuat(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setDiaChiCoSoSanXuat(diaChiCoSoSanXuat);
		}

		if (tenXuongSanXuat == null) {
			vrCorporationAttendeeImpl.setTenXuongSanXuat(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setTenXuongSanXuat(tenXuongSanXuat);
		}

		if (diaChiXuongSanXuat == null) {
			vrCorporationAttendeeImpl.setDiaChiXuongSanXuat(StringPool.BLANK);
		}
		else {
			vrCorporationAttendeeImpl.setDiaChiXuongSanXuat(diaChiXuongSanXuat);
		}

		vrCorporationAttendeeImpl.resetOriginalValues();

		return vrCorporationAttendeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();
		createDate = objectInput.readLong();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
		corporationCode = objectInput.readUTF();
		corporationName = objectInput.readUTF();
		inspectionDate = objectInput.readLong();
		registerednumber = objectInput.readUTF();
		testingRegisteredPlace = objectInput.readUTF();
		testingPlaceDistrict = objectInput.readUTF();
		testingPlaceCity = objectInput.readUTF();
		testingPlaceRegion = objectInput.readUTF();
		testingPlaceCountry = objectInput.readUTF();
		testingRemarks = objectInput.readUTF();

		activityId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		activityType = objectInput.readUTF();
		activityCatetory = objectInput.readUTF();
		categoryName = objectInput.readUTF();

		dossierId = objectInput.readLong();
		serviceName = objectInput.readUTF();
		subject = objectInput.readUTF();

		hostingId = objectInput.readInt();
		hosting = objectInput.readUTF();

		locationId = objectInput.readInt();
		location = objectInput.readUTF();
		geolocation = objectInput.readUTF();
		startDate = objectInput.readLong();
		endDate = objectInput.readLong();
		finishDate = objectInput.readLong();
		state = objectInput.readUTF();
		stateName = objectInput.readUTF();
		stateColor = objectInput.readUTF();
		priority = objectInput.readUTF();
		overdue = objectInput.readUTF();

		managerId = objectInput.readLong();
		managerName = objectInput.readUTF();

		leaderId = objectInput.readLong();
		leaderName = objectInput.readUTF();
		leaderJobTitle = objectInput.readUTF();
		description = objectInput.readUTF();
		permission = objectInput.readUTF();
		resultNote = objectInput.readUTF();
		progress = objectInput.readUTF();
		assignType = objectInput.readUTF();

		jobPosId = objectInput.readLong();
		jobPosTitle = objectInput.readUTF();
		invitation = objectInput.readUTF();
		editable = objectInput.readUTF();
		vaqcontactname = objectInput.readUTF();
		vaqcontactphone = objectInput.readUTF();
		applicantIdNo = objectInput.readUTF();
		importercontactname = objectInput.readUTF();
		importercontactphone = objectInput.readUTF();
		importercontactemail = objectInput.readUTF();
		importerfax = objectInput.readUTF();
		soTKHQ = objectInput.readUTF();
		ngayTKHQ = objectInput.readUTF();
		maChiCucHQ = objectInput.readUTF();
		nhanHieu = objectInput.readUTF();
		tenThuongMai = objectInput.readUTF();
		maKieuLoai = objectInput.readUTF();
		loaiPhuongTien = objectInput.readUTF();
		soKhung = objectInput.readUTF();
		soDongCo = objectInput.readUTF();
		tinhTrangPhuongTien = objectInput.readUTF();
		kyHieuThietKe = objectInput.readUTF();
		soGCNThamDinhThietKe = objectInput.readUTF();
		soGCNPheDuyetKieuLoaiNuocNgoai = objectInput.readUTF();
		tenCoSoSanXuat = objectInput.readUTF();
		diaChiCoSoSanXuat = objectInput.readUTF();
		tenXuongSanXuat = objectInput.readUTF();
		diaChiXuongSanXuat = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);

		if (corporationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationCode);
		}

		if (corporationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationName);
		}

		objectOutput.writeLong(inspectionDate);

		if (registerednumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(registerednumber);
		}

		if (testingRegisteredPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(testingRegisteredPlace);
		}

		if (testingPlaceDistrict == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(testingPlaceDistrict);
		}

		if (testingPlaceCity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(testingPlaceCity);
		}

		if (testingPlaceRegion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(testingPlaceRegion);
		}

		if (testingPlaceCountry == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(testingPlaceCountry);
		}

		if (testingRemarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(testingRemarks);
		}

		objectOutput.writeLong(activityId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		if (activityType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(activityType);
		}

		if (activityCatetory == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(activityCatetory);
		}

		if (categoryName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(categoryName);
		}

		objectOutput.writeLong(dossierId);

		if (serviceName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(serviceName);
		}

		if (subject == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subject);
		}

		objectOutput.writeInt(hostingId);

		if (hosting == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hosting);
		}

		objectOutput.writeInt(locationId);

		if (location == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (geolocation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(geolocation);
		}

		objectOutput.writeLong(startDate);
		objectOutput.writeLong(endDate);
		objectOutput.writeLong(finishDate);

		if (state == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(state);
		}

		if (stateName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stateName);
		}

		if (stateColor == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stateColor);
		}

		if (priority == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(priority);
		}

		if (overdue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(overdue);
		}

		objectOutput.writeLong(managerId);

		if (managerName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(managerName);
		}

		objectOutput.writeLong(leaderId);

		if (leaderName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(leaderName);
		}

		if (leaderJobTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(leaderJobTitle);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (permission == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(permission);
		}

		if (resultNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(resultNote);
		}

		if (progress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(progress);
		}

		if (assignType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(assignType);
		}

		objectOutput.writeLong(jobPosId);

		if (jobPosTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(jobPosTitle);
		}

		if (invitation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(invitation);
		}

		if (editable == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(editable);
		}

		if (vaqcontactname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vaqcontactname);
		}

		if (vaqcontactphone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vaqcontactphone);
		}

		if (applicantIdNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantIdNo);
		}

		if (importercontactname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importercontactname);
		}

		if (importercontactphone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importercontactphone);
		}

		if (importercontactemail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importercontactemail);
		}

		if (importerfax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importerfax);
		}

		if (soTKHQ == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soTKHQ);
		}

		if (ngayTKHQ == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ngayTKHQ);
		}

		if (maChiCucHQ == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maChiCucHQ);
		}

		if (nhanHieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nhanHieu);
		}

		if (tenThuongMai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenThuongMai);
		}

		if (maKieuLoai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maKieuLoai);
		}

		if (loaiPhuongTien == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loaiPhuongTien);
		}

		if (soKhung == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soKhung);
		}

		if (soDongCo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soDongCo);
		}

		if (tinhTrangPhuongTien == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tinhTrangPhuongTien);
		}

		if (kyHieuThietKe == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kyHieuThietKe);
		}

		if (soGCNThamDinhThietKe == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soGCNThamDinhThietKe);
		}

		if (soGCNPheDuyetKieuLoaiNuocNgoai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soGCNPheDuyetKieuLoaiNuocNgoai);
		}

		if (tenCoSoSanXuat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenCoSoSanXuat);
		}

		if (diaChiCoSoSanXuat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(diaChiCoSoSanXuat);
		}

		if (tenXuongSanXuat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenXuongSanXuat);
		}

		if (diaChiXuongSanXuat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(diaChiXuongSanXuat);
		}
	}

	public long id;
	public long mtCore;
	public long createDate;
	public long modifyDate;
	public long syncDate;
	public String corporationCode;
	public String corporationName;
	public long inspectionDate;
	public String registerednumber;
	public String testingRegisteredPlace;
	public String testingPlaceDistrict;
	public String testingPlaceCity;
	public String testingPlaceRegion;
	public String testingPlaceCountry;
	public String testingRemarks;
	public long activityId;
	public long userId;
	public String userName;
	public String activityType;
	public String activityCatetory;
	public String categoryName;
	public long dossierId;
	public String serviceName;
	public String subject;
	public int hostingId;
	public String hosting;
	public int locationId;
	public String location;
	public String geolocation;
	public long startDate;
	public long endDate;
	public long finishDate;
	public String state;
	public String stateName;
	public String stateColor;
	public String priority;
	public String overdue;
	public long managerId;
	public String managerName;
	public long leaderId;
	public String leaderName;
	public String leaderJobTitle;
	public String description;
	public String permission;
	public String resultNote;
	public String progress;
	public String assignType;
	public long jobPosId;
	public String jobPosTitle;
	public String invitation;
	public String editable;
	public String vaqcontactname;
	public String vaqcontactphone;
	public String applicantIdNo;
	public String importercontactname;
	public String importercontactphone;
	public String importercontactemail;
	public String importerfax;
	public String soTKHQ;
	public String ngayTKHQ;
	public String maChiCucHQ;
	public String nhanHieu;
	public String tenThuongMai;
	public String maKieuLoai;
	public String loaiPhuongTien;
	public String soKhung;
	public String soDongCo;
	public String tinhTrangPhuongTien;
	public String kyHieuThietKe;
	public String soGCNThamDinhThietKe;
	public String soGCNPheDuyetKieuLoaiNuocNgoai;
	public String tenCoSoSanXuat;
	public String diaChiCoSoSanXuat;
	public String tenXuongSanXuat;
	public String diaChiXuongSanXuat;
}