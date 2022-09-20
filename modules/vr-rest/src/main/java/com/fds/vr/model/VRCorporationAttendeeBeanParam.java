package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "mtcore", "createdate", "modifydate", "syncdate", "corporationcode",
		"corporationname", "inspectiondate", "registerednumber", "testingregisteredplace", "testingplacedistrict",
		"testingplacecity", "testingplaceregion", "testingplacecountry", "testingremarks", "activityid", "userid",
		"username", "activitytype", "activitycatetory", "categoryname", "dossierid", "servicename", "subject",
		"hostingid", "hosting", "locationid", "location", "geolocation", "startdate", "enddate", "finishdate", "state",
		"statename", "statecolor", "priority", "overdue", "managerid", "managername", "leaderid", "leadername",
		"leaderjobtitle", "description", "permission", "resultnote", "progress", "assigntype", "jobposid",
		"jobpostitle", "invitation", "editable", "vaqcontactname", "vaqcontactphone", "applicantidno",
		"importercontactname", "importercontactphone", "importercontactemail", "importerfax", "sotkhq", "ngaytkhq",
		"machicuchq", "nhanhieu", "tenthuongmai", "makieuloai", "loaiphuongtien", "sokhung", "sodongco",
		"tinhtrangphuongtien", "kyhieuthietke", "sogcnthamdinhthietke", "sogcnpheduyetkieuloainuocngoai",
		"tencososanxuat", "diachicososanxuat", "tenxuongsanxuat", "diachixuongsanxuat", "keyword", "start", "end",
		"order_asc", "order_desc" })
@XmlRootElement(name = "VRCorporationAttendeeBeanParam")
public class VRCorporationAttendeeBeanParam {
	@QueryParam(value = "keyword")
	protected String keyword;
	@DefaultValue("0")
	@QueryParam(value = "start")
	protected int start;
	@DefaultValue("20")
	@QueryParam(value = "end")
	protected int end;
	@QueryParam(value = "order_asc")
	protected String order_asc;
	@QueryParam(value = "order_desc")
	protected String order_desc;
	@QueryParam(value = "id")
	protected Long id;
	@QueryParam(value = "mtcore")
	protected Long mtCore;
	@QueryParam(value = "createdate")
	protected String createDate;
	@QueryParam(value = "modifydate")
	protected String modifyDate;
	@QueryParam(value = "syncdate")
	protected String syncDate;
	@QueryParam(value = "corporationcode")
	protected String corporationCode;
	@QueryParam(value = "corporationname")
	protected String corporationName;
	@QueryParam(value = "inspectiondate")
	protected String inspectionDate;
	@QueryParam(value = "registerednumber")
	protected String registerednumber;
	@QueryParam(value = "testingregisteredplace")
	protected String testingRegisteredPlace;
	@QueryParam(value = "testingplacedistrict")
	protected String testingPlaceDistrict;
	@QueryParam(value = "testingplacecity")
	protected String testingPlaceCity;
	@QueryParam(value = "testingplaceregion")
	protected String testingPlaceRegion;
	@QueryParam(value = "testingplacecountry")
	protected String testingPlaceCountry;
	@QueryParam(value = "testingremarks")
	protected String testingRemarks;
	@QueryParam(value = "activityid")
	protected Long activityId;
	@QueryParam(value = "userid")
	protected Long userId;
	@QueryParam(value = "username")
	protected String userName;
	@QueryParam(value = "activitytype")
	protected String activityType;
	@QueryParam(value = "activitycatetory")
	protected String activityCatetory;
	@QueryParam(value = "categoryname")
	protected String categoryName;
	@QueryParam(value = "dossierid")
	protected Long dossierId;
	@QueryParam(value = "servicename")
	protected String serviceName;
	@QueryParam(value = "subject")
	protected String subject;
	@QueryParam(value = "hostingid")
	protected Integer hostingId;
	@QueryParam(value = "hosting")
	protected String hosting;
	@QueryParam(value = "locationid")
	protected Integer locationId;
	@QueryParam(value = "location")
	protected String location;
	@QueryParam(value = "geolocation")
	protected String geolocation;
	@QueryParam(value = "startdate")
	protected String startDate;
	@QueryParam(value = "enddate")
	protected String endDate;
	@QueryParam(value = "finishdate")
	protected String finishDate;
	@QueryParam(value = "state")
	protected String state;
	@QueryParam(value = "statename")
	protected String stateName;
	@QueryParam(value = "statecolor")
	protected String stateColor;
	@QueryParam(value = "priority")
	protected String priority;
	@QueryParam(value = "overdue")
	protected String overdue;
	@QueryParam(value = "managerid")
	protected Long managerId;
	@QueryParam(value = "managername")
	protected String managerName;
	@QueryParam(value = "leaderid")
	protected Long leaderId;
	@QueryParam(value = "leadername")
	protected String leaderName;
	@QueryParam(value = "leaderjobtitle")
	protected String leaderJobTitle;
	@QueryParam(value = "description")
	protected String description;
	@QueryParam(value = "permission")
	protected String permission;
	@QueryParam(value = "resultnote")
	protected String resultNote;
	@QueryParam(value = "progress")
	protected String progress;
	@QueryParam(value = "assigntype")
	protected String assignType;
	@QueryParam(value = "jobposid")
	protected Long jobPosId;
	@QueryParam(value = "jobpostitle")
	protected String jobPosTitle;
	@QueryParam(value = "invitation")
	protected String invitation;
	@QueryParam(value = "editable")
	protected String editable;
	@QueryParam(value = "vaqcontactname")
	protected String vaqcontactname;
	@QueryParam(value = "vaqcontactphone")
	protected String vaqcontactphone;
	@QueryParam(value = "applicantidno")
	protected String applicantIdNo;
	@QueryParam(value = "importercontactname")
	protected String importercontactname;
	@QueryParam(value = "importercontactphone")
	protected String importercontactphone;
	@QueryParam(value = "importercontactemail")
	protected String importercontactemail;
	@QueryParam(value = "importerfax")
	protected String importerfax;
	@QueryParam(value = "sotkhq")
	protected String soTKHQ;
	@QueryParam(value = "ngaytkhq")
	protected String ngayTKHQ;
	@QueryParam(value = "machicuchq")
	protected String maChiCucHQ;
	@QueryParam(value = "nhanhieu")
	protected String nhanHieu;
	@QueryParam(value = "tenthuongmai")
	protected String tenThuongMai;
	@QueryParam(value = "makieuloai")
	protected String maKieuLoai;
	@QueryParam(value = "loaiphuongtien")
	protected String loaiPhuongTien;
	@QueryParam(value = "sokhung")
	protected String soKhung;
	@QueryParam(value = "sodongco")
	protected String soDongCo;
	@QueryParam(value = "tinhtrangphuongtien")
	protected String tinhTrangPhuongTien;
	@QueryParam(value = "kyhieuthietke")
	protected String kyHieuThietKe;
	@QueryParam(value = "sogcnthamdinhthietke")
	protected String soGCNThamDinhThietKe;
	@QueryParam(value = "sogcnpheduyetkieuloainuocngoai")
	protected String soGCNPheDuyetKieuLoaiNuocNgoai;
	@QueryParam(value = "tencososanxuat")
	protected String tenCoSoSanXuat;
	@QueryParam(value = "diachicososanxuat")
	protected String diaChiCoSoSanXuat;
	@QueryParam(value = "tenxuongsanxuat")
	protected String tenXuongSanXuat;
	@QueryParam(value = "diachixuongsanxuat")
	protected String diaChiXuongSanXuat;

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public String getOrder_asc() {
		return order_asc;
	}

	public void setOrder_asc(String order_asc) {
		this.order_asc = order_asc;
	}

	public String getOrder_desc() {
		return order_desc;
	}

	public void setOrder_desc(String order_desc) {
		this.order_desc = order_desc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMtCore() {
		return mtCore;
	}

	public void setMtCore(Long mtCore) {
		this.mtCore = mtCore;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getSyncDate() {
		return syncDate;
	}

	public void setSyncDate(String syncDate) {
		this.syncDate = syncDate;
	}

	public String getCorporationCode() {
		return corporationCode;
	}

	public void setCorporationCode(String corporationCode) {
		this.corporationCode = corporationCode;
	}

	public String getCorporationName() {
		return corporationName;
	}

	public void setCorporationName(String corporationName) {
		this.corporationName = corporationName;
	}

	public String getInspectionDate() {
		return inspectionDate;
	}

	public void setInspectionDate(String inspectionDate) {
		this.inspectionDate = inspectionDate;
	}

	public String getRegisterednumber() {
		return registerednumber;
	}

	public void setRegisterednumber(String registerednumber) {
		this.registerednumber = registerednumber;
	}

	public String getTestingRegisteredPlace() {
		return testingRegisteredPlace;
	}

	public void setTestingRegisteredPlace(String testingRegisteredPlace) {
		this.testingRegisteredPlace = testingRegisteredPlace;
	}

	public String getTestingPlaceDistrict() {
		return testingPlaceDistrict;
	}

	public void setTestingPlaceDistrict(String testingPlaceDistrict) {
		this.testingPlaceDistrict = testingPlaceDistrict;
	}

	public String getTestingPlaceCity() {
		return testingPlaceCity;
	}

	public void setTestingPlaceCity(String testingPlaceCity) {
		this.testingPlaceCity = testingPlaceCity;
	}

	public String getTestingPlaceRegion() {
		return testingPlaceRegion;
	}

	public void setTestingPlaceRegion(String testingPlaceRegion) {
		this.testingPlaceRegion = testingPlaceRegion;
	}

	public String getTestingPlaceCountry() {
		return testingPlaceCountry;
	}

	public void setTestingPlaceCountry(String testingPlaceCountry) {
		this.testingPlaceCountry = testingPlaceCountry;
	}

	public String getTestingRemarks() {
		return testingRemarks;
	}

	public void setTestingRemarks(String testingRemarks) {
		this.testingRemarks = testingRemarks;
	}

	public Long getActivityId() {
		return activityId;
	}

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getActivityCatetory() {
		return activityCatetory;
	}

	public void setActivityCatetory(String activityCatetory) {
		this.activityCatetory = activityCatetory;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Long getDossierId() {
		return dossierId;
	}

	public void setDossierId(Long dossierId) {
		this.dossierId = dossierId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Integer getHostingId() {
		return hostingId;
	}

	public void setHostingId(Integer hostingId) {
		this.hostingId = hostingId;
	}

	public String getHosting() {
		return hosting;
	}

	public void setHosting(String hosting) {
		this.hosting = hosting;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGeolocation() {
		return geolocation;
	}

	public void setGeolocation(String geolocation) {
		this.geolocation = geolocation;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(String finishDate) {
		this.finishDate = finishDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateColor() {
		return stateColor;
	}

	public void setStateColor(String stateColor) {
		this.stateColor = stateColor;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getOverdue() {
		return overdue;
	}

	public void setOverdue(String overdue) {
		this.overdue = overdue;
	}

	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public Long getLeaderId() {
		return leaderId;
	}

	public void setLeaderId(Long leaderId) {
		this.leaderId = leaderId;
	}

	public String getLeaderName() {
		return leaderName;
	}

	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}

	public String getLeaderJobTitle() {
		return leaderJobTitle;
	}

	public void setLeaderJobTitle(String leaderJobTitle) {
		this.leaderJobTitle = leaderJobTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public String getResultNote() {
		return resultNote;
	}

	public void setResultNote(String resultNote) {
		this.resultNote = resultNote;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	public String getAssignType() {
		return assignType;
	}

	public void setAssignType(String assignType) {
		this.assignType = assignType;
	}

	public Long getJobPosId() {
		return jobPosId;
	}

	public void setJobPosId(Long jobPosId) {
		this.jobPosId = jobPosId;
	}

	public String getJobPosTitle() {
		return jobPosTitle;
	}

	public void setJobPosTitle(String jobPosTitle) {
		this.jobPosTitle = jobPosTitle;
	}

	public String getInvitation() {
		return invitation;
	}

	public void setInvitation(String invitation) {
		this.invitation = invitation;
	}

	public String getEditable() {
		return editable;
	}

	public void setEditable(String editable) {
		this.editable = editable;
	}

	public String getVaqcontactname() {
		return vaqcontactname;
	}

	public void setVaqcontactname(String vaqcontactname) {
		this.vaqcontactname = vaqcontactname;
	}

	public String getVaqcontactphone() {
		return vaqcontactphone;
	}

	public void setVaqcontactphone(String vaqcontactphone) {
		this.vaqcontactphone = vaqcontactphone;
	}

	public String getApplicantIdNo() {
		return applicantIdNo;
	}

	public void setApplicantIdNo(String applicantIdNo) {
		this.applicantIdNo = applicantIdNo;
	}

	public String getImportercontactname() {
		return importercontactname;
	}

	public void setImportercontactname(String importercontactname) {
		this.importercontactname = importercontactname;
	}

	public String getImportercontactphone() {
		return importercontactphone;
	}

	public void setImportercontactphone(String importercontactphone) {
		this.importercontactphone = importercontactphone;
	}

	public String getImportercontactemail() {
		return importercontactemail;
	}

	public void setImportercontactemail(String importercontactemail) {
		this.importercontactemail = importercontactemail;
	}

	public String getImporterfax() {
		return importerfax;
	}

	public void setImporterfax(String importerfax) {
		this.importerfax = importerfax;
	}

	public String getSoTKHQ() {
		return soTKHQ;
	}

	public void setSoTKHQ(String soTKHQ) {
		this.soTKHQ = soTKHQ;
	}

	public String getNgayTKHQ() {
		return ngayTKHQ;
	}

	public void setNgayTKHQ(String ngayTKHQ) {
		this.ngayTKHQ = ngayTKHQ;
	}

	public String getMaChiCucHQ() {
		return maChiCucHQ;
	}

	public void setMaChiCucHQ(String maChiCucHQ) {
		this.maChiCucHQ = maChiCucHQ;
	}

	public String getNhanHieu() {
		return nhanHieu;
	}

	public void setNhanHieu(String nhanHieu) {
		this.nhanHieu = nhanHieu;
	}

	public String getTenThuongMai() {
		return tenThuongMai;
	}

	public void setTenThuongMai(String tenThuongMai) {
		this.tenThuongMai = tenThuongMai;
	}

	public String getMaKieuLoai() {
		return maKieuLoai;
	}

	public void setMaKieuLoai(String maKieuLoai) {
		this.maKieuLoai = maKieuLoai;
	}

	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}

	public String getSoKhung() {
		return soKhung;
	}

	public void setSoKhung(String soKhung) {
		this.soKhung = soKhung;
	}

	public String getSoDongCo() {
		return soDongCo;
	}

	public void setSoDongCo(String soDongCo) {
		this.soDongCo = soDongCo;
	}

	public String getTinhTrangPhuongTien() {
		return tinhTrangPhuongTien;
	}

	public void setTinhTrangPhuongTien(String tinhTrangPhuongTien) {
		this.tinhTrangPhuongTien = tinhTrangPhuongTien;
	}

	public String getKyHieuThietKe() {
		return kyHieuThietKe;
	}

	public void setKyHieuThietKe(String kyHieuThietKe) {
		this.kyHieuThietKe = kyHieuThietKe;
	}

	public String getSoGCNThamDinhThietKe() {
		return soGCNThamDinhThietKe;
	}

	public void setSoGCNThamDinhThietKe(String soGCNThamDinhThietKe) {
		this.soGCNThamDinhThietKe = soGCNThamDinhThietKe;
	}

	public String getSoGCNPheDuyetKieuLoaiNuocNgoai() {
		return soGCNPheDuyetKieuLoaiNuocNgoai;
	}

	public void setSoGCNPheDuyetKieuLoaiNuocNgoai(String soGCNPheDuyetKieuLoaiNuocNgoai) {
		this.soGCNPheDuyetKieuLoaiNuocNgoai = soGCNPheDuyetKieuLoaiNuocNgoai;
	}

	public String getTenCoSoSanXuat() {
		return tenCoSoSanXuat;
	}

	public void setTenCoSoSanXuat(String tenCoSoSanXuat) {
		this.tenCoSoSanXuat = tenCoSoSanXuat;
	}

	public String getDiaChiCoSoSanXuat() {
		return diaChiCoSoSanXuat;
	}

	public void setDiaChiCoSoSanXuat(String diaChiCoSoSanXuat) {
		this.diaChiCoSoSanXuat = diaChiCoSoSanXuat;
	}

	public String getTenXuongSanXuat() {
		return tenXuongSanXuat;
	}

	public void setTenXuongSanXuat(String tenXuongSanXuat) {
		this.tenXuongSanXuat = tenXuongSanXuat;
	}

	public String getDiaChiXuongSanXuat() {
		return diaChiXuongSanXuat;
	}

	public void setDiaChiXuongSanXuat(String diaChiXuongSanXuat) {
		this.diaChiXuongSanXuat = diaChiXuongSanXuat;
	}

}
