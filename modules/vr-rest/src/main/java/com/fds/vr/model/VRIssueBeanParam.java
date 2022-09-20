package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "mtcore", "dossierid", "stampissueno", "applieddate", "approveddate",
		"vehicleclass", "applicantprofileid", "applicantname", "applicantaddress", "applicantrepresentative",
		"applicantrepresentativetitle", "applicantemail", "applicantphone", "applicantfax", "applicantcontactname",
		"applicantcontactemail", "applicantcontactphone", "productionplantid", "productionplantcode",
		"productionplantname", "productionplantaddress", "remarks", "methodofissue", "totalindocument",
		"issuecorporationid", "verifycorporationid", "digitalissuestatus", "issuetype", "averagestbquantity",
		"maxmonthquantity", "averagestmquantity", "accumulatedmonthquantity", "totalinuse", "totalcancelled",
		"totallost", "totalnotused", "totalreturned", "flow", "examinationrequired", "examinationperiod",
		"examinationlasttime", "copresult", "copreportno", "copreportdate", "postreview", "postreviewrecordno",
		"postreviewrecorddate", "corporationid", "inspectorcode", "inspectorname", "leadername", "applicantmaker",
		"applicantchecker", "inspectorid", "issueinspectorid", "verifyinspectorid", "modifydate", "syncdate", "keyword",
		"start", "end", "order_asc", "order_desc", "applieddatefrom", "applieddateto", "appliedyear", "stampshortno",
		"stampserialno", "stampstatus" })

@XmlRootElement(name = "VRIssueBeanParam")
public class VRIssueBeanParam {
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
	@QueryParam(value = "dossierid")
	protected Long dossierId;
	@QueryParam(value = "stampissueno")
	protected String stampIssueNo;
	@QueryParam(value = "applieddate")
	protected String appliedDate;
	@QueryParam(value = "approveddate")
	protected String approvedDate;
	@QueryParam(value = "vehicleclass")
	protected String vehicleClass;
	@QueryParam(value = "applicantprofileid")
	protected Long applicantProfileId;
	@QueryParam(value = "applicantname")
	protected String applicantName;
	@QueryParam(value = "applicantaddress")
	protected String applicantAddress;
	@QueryParam(value = "applicantrepresentative")
	protected String applicantRepresentative;
	@QueryParam(value = "applicantrepresentativetitle")
	protected String applicantRepresentativeTitle;
	@QueryParam(value = "applicantemail")
	protected String applicantEmail;
	@QueryParam(value = "applicantphone")
	protected String applicantPhone;
	@QueryParam(value = "applicantfax")
	protected String applicantFax;
	@QueryParam(value = "applicantcontactname")
	protected String applicantContactName;
	@QueryParam(value = "applicantcontactemail")
	protected String applicantContactEmail;
	@QueryParam(value = "applicantcontactphone")
	protected String applicantContactPhone;
	@QueryParam(value = "productionplantid")
	protected Long productionPlantId;
	@QueryParam(value = "productionplantcode")
	protected String productionPlantCode;
	@QueryParam(value = "productionplantname")
	protected String productionPlantName;
	@QueryParam(value = "productionplantaddress")
	protected String productionPlantAddress;
	@QueryParam(value = "remarks")
	protected String remarks;
	@QueryParam(value = "methodofissue")
	protected String methodOfIssue;
	@QueryParam(value = "totalindocument")
	protected Long totalInDocument;
	@QueryParam(value = "issuecorporationid")
	protected Long issueCorporationId;
	@QueryParam(value = "verifycorporationid")
	protected String verifyCorporationId;
	@QueryParam(value = "digitalissuestatus")
	protected Integer digitalissuestatus;
	@QueryParam(value = "issuetype")
	protected String issueType;
	@QueryParam(value = "averagestbquantity")
	protected Integer averageSTBQuantity;
	@QueryParam(value = "maxmonthquantity")
	protected Integer maxMonthQuantity;
	@QueryParam(value = "averagestmquantity")
	protected Integer averageSTMQuantity;
	@QueryParam(value = "accumulatedmonthquantity")
	protected Integer accumulatedMonthQuantity;
	@QueryParam(value = "totalinuse")
	protected Integer totalInUse;
	@QueryParam(value = "totalcancelled")
	protected Integer totalCancelled;
	@QueryParam(value = "totallost")
	protected Integer totalLost;
	@QueryParam(value = "totalnotused")
	protected Integer totalNotUsed;
	@QueryParam(value = "totalreturned")
	protected Integer totalReturned;
	@QueryParam(value = "flow")
	protected String flow;
	@QueryParam(value = "examinationrequired")
	protected String examinationRequired;
	@QueryParam(value = "examinationperiod")
	protected String examinationPeriod;
	@QueryParam(value = "examinationlasttime")
	protected String examinationLastTime;
	@QueryParam(value = "copresult")
	protected String copresult;
	@QueryParam(value = "copreportno")
	protected String copreportno;
	@QueryParam(value = "copreportdate")
	protected String copreportdate;
	@QueryParam(value = "postreview")
	protected String postreview;
	@QueryParam(value = "postreviewrecordno")
	protected String postreviewrecordno;
	@QueryParam(value = "postreviewrecorddate")
	protected String postreviewrecorddate;
	@QueryParam(value = "corporationid")
	protected String corporationId;
	@QueryParam(value = "inspectorcode")
	protected String inspectorcode;
	@QueryParam(value = "inspectorname")
	protected String inspectorname;
	@QueryParam(value = "leadername")
	protected String leadername;
	@QueryParam(value = "applicantmaker")
	protected String applicantmaker;
	@QueryParam(value = "applicantchecker")
	protected String applicantchecker;
	@QueryParam(value = "inspectorid")
	protected Long inspectorId;
	@QueryParam(value = "issueinspectorid")
	protected Long issueInspectorId;
	@QueryParam(value = "verifyinspectorid")
	protected Long verifyInspectorId;
	@QueryParam(value = "modifydate")
	protected String modifyDate;
	@QueryParam(value = "syncdate")
	protected String syncDate;
	@QueryParam(value = "applieddatefrom")
	protected String appliedDateFrom;
	@QueryParam(value = "applieddateto")
	protected String appliedDateTo;
	@QueryParam(value = "appliedyear")
	protected Integer appliedYear;
	@QueryParam(value = "stampshortno")
	protected String stampShortNo;
	@QueryParam(value = "stampSerialNo")
	protected String stampserialno;
	@QueryParam(value = "stampStatus")
	protected Integer stampstatus;

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

	public Long getDossierId() {
		return dossierId;
	}

	public void setDossierId(Long dossierId) {
		this.dossierId = dossierId;
	}

	public String getStampIssueNo() {
		return stampIssueNo;
	}

	public void setStampIssueNo(String stampIssueNo) {
		this.stampIssueNo = stampIssueNo;
	}

	public String getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(String appliedDate) {
		this.appliedDate = appliedDate;
	}

	public String getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(String approvedDate) {
		this.approvedDate = approvedDate;
	}

	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	public Long getApplicantProfileId() {
		return applicantProfileId;
	}

	public void setApplicantProfileId(Long applicantProfileId) {
		this.applicantProfileId = applicantProfileId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantAddress() {
		return applicantAddress;
	}

	public void setApplicantAddress(String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}

	public String getApplicantRepresentative() {
		return applicantRepresentative;
	}

	public void setApplicantRepresentative(String applicantRepresentative) {
		this.applicantRepresentative = applicantRepresentative;
	}

	public String getApplicantRepresentativeTitle() {
		return applicantRepresentativeTitle;
	}

	public void setApplicantRepresentativeTitle(String applicantRepresentativeTitle) {
		this.applicantRepresentativeTitle = applicantRepresentativeTitle;
	}

	public String getApplicantEmail() {
		return applicantEmail;
	}

	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}

	public String getApplicantPhone() {
		return applicantPhone;
	}

	public void setApplicantPhone(String applicantPhone) {
		this.applicantPhone = applicantPhone;
	}

	public String getApplicantFax() {
		return applicantFax;
	}

	public void setApplicantFax(String applicantFax) {
		this.applicantFax = applicantFax;
	}

	public String getApplicantContactName() {
		return applicantContactName;
	}

	public void setApplicantContactName(String applicantContactName) {
		this.applicantContactName = applicantContactName;
	}

	public String getApplicantContactEmail() {
		return applicantContactEmail;
	}

	public void setApplicantContactEmail(String applicantContactEmail) {
		this.applicantContactEmail = applicantContactEmail;
	}

	public String getApplicantContactPhone() {
		return applicantContactPhone;
	}

	public void setApplicantContactPhone(String applicantContactPhone) {
		this.applicantContactPhone = applicantContactPhone;
	}

	public Long getProductionPlantId() {
		return productionPlantId;
	}

	public void setProductionPlantId(Long productionPlantId) {
		this.productionPlantId = productionPlantId;
	}

	public String getProductionPlantCode() {
		return productionPlantCode;
	}

	public void setProductionPlantCode(String productionPlantCode) {
		this.productionPlantCode = productionPlantCode;
	}

	public String getProductionPlantName() {
		return productionPlantName;
	}

	public void setProductionPlantName(String productionPlantName) {
		this.productionPlantName = productionPlantName;
	}

	public String getProductionPlantAddress() {
		return productionPlantAddress;
	}

	public void setProductionPlantAddress(String productionPlantAddress) {
		this.productionPlantAddress = productionPlantAddress;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getMethodOfIssue() {
		return methodOfIssue;
	}

	public void setMethodOfIssue(String methodOfIssue) {
		this.methodOfIssue = methodOfIssue;
	}

	public Long getTotalInDocument() {
		return totalInDocument;
	}

	public void setTotalInDocument(Long totalInDocument) {
		this.totalInDocument = totalInDocument;
	}

	public Long getIssueCorporationId() {
		return issueCorporationId;
	}

	public void setIssueCorporationId(Long issueCorporationId) {
		this.issueCorporationId = issueCorporationId;
	}

	public String getVerifyCorporationId() {
		return verifyCorporationId;
	}

	public void setVerifyCorporationId(String verifyCorporationId) {
		this.verifyCorporationId = verifyCorporationId;
	}

	public Integer getDigitalissuestatus() {
		return digitalissuestatus;
	}

	public void setDigitalissuestatus(Integer digitalissuestatus) {
		this.digitalissuestatus = digitalissuestatus;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public Integer getAverageSTBQuantity() {
		return averageSTBQuantity;
	}

	public void setAverageSTBQuantity(Integer averageSTBQuantity) {
		this.averageSTBQuantity = averageSTBQuantity;
	}

	public Integer getMaxMonthQuantity() {
		return maxMonthQuantity;
	}

	public void setMaxMonthQuantity(Integer maxMonthQuantity) {
		this.maxMonthQuantity = maxMonthQuantity;
	}

	public Integer getAverageSTMQuantity() {
		return averageSTMQuantity;
	}

	public void setAverageSTMQuantity(Integer averageSTMQuantity) {
		this.averageSTMQuantity = averageSTMQuantity;
	}

	public Integer getAccumulatedMonthQuantity() {
		return accumulatedMonthQuantity;
	}

	public void setAccumulatedMonthQuantity(Integer accumulatedMonthQuantity) {
		this.accumulatedMonthQuantity = accumulatedMonthQuantity;
	}

	public Integer getTotalInUse() {
		return totalInUse;
	}

	public void setTotalInUse(Integer totalInUse) {
		this.totalInUse = totalInUse;
	}

	public Integer getTotalCancelled() {
		return totalCancelled;
	}

	public void setTotalCancelled(Integer totalCancelled) {
		this.totalCancelled = totalCancelled;
	}

	public Integer getTotalLost() {
		return totalLost;
	}

	public void setTotalLost(Integer totalLost) {
		this.totalLost = totalLost;
	}

	public Integer getTotalNotUsed() {
		return totalNotUsed;
	}

	public void setTotalNotUsed(Integer totalNotUsed) {
		this.totalNotUsed = totalNotUsed;
	}

	public Integer getTotalReturned() {
		return totalReturned;
	}

	public void setTotalReturned(Integer totalReturned) {
		this.totalReturned = totalReturned;
	}

	public String getFlow() {
		return flow;
	}

	public void setFlow(String flow) {
		this.flow = flow;
	}

	public String getExaminationRequired() {
		return examinationRequired;
	}

	public void setExaminationRequired(String examinationRequired) {
		this.examinationRequired = examinationRequired;
	}

	public String getExaminationPeriod() {
		return examinationPeriod;
	}

	public void setExaminationPeriod(String examinationPeriod) {
		this.examinationPeriod = examinationPeriod;
	}

	public String getExaminationLastTime() {
		return examinationLastTime;
	}

	public void setExaminationLastTime(String examinationLastTime) {
		this.examinationLastTime = examinationLastTime;
	}

	public String getCopresult() {
		return copresult;
	}

	public void setCopresult(String copresult) {
		this.copresult = copresult;
	}

	public String getCopreportno() {
		return copreportno;
	}

	public void setCopreportno(String copreportno) {
		this.copreportno = copreportno;
	}

	public String getCopreportdate() {
		return copreportdate;
	}

	public void setCopreportdate(String copreportdate) {
		this.copreportdate = copreportdate;
	}

	public String getPostreview() {
		return postreview;
	}

	public void setPostreview(String postreview) {
		this.postreview = postreview;
	}

	public String getPostreviewrecordno() {
		return postreviewrecordno;
	}

	public void setPostreviewrecordno(String postreviewrecordno) {
		this.postreviewrecordno = postreviewrecordno;
	}

	public String getPostreviewrecorddate() {
		return postreviewrecorddate;
	}

	public void setPostreviewrecorddate(String postreviewrecorddate) {
		this.postreviewrecorddate = postreviewrecorddate;
	}

	public String getCorporationId() {
		return corporationId;
	}

	public void setCorporationId(String corporationId) {
		this.corporationId = corporationId;
	}

	public String getInspectorcode() {
		return inspectorcode;
	}

	public void setInspectorcode(String inspectorcode) {
		this.inspectorcode = inspectorcode;
	}

	public String getInspectorname() {
		return inspectorname;
	}

	public void setInspectorname(String inspectorname) {
		this.inspectorname = inspectorname;
	}

	public String getLeadername() {
		return leadername;
	}

	public void setLeadername(String leadername) {
		this.leadername = leadername;
	}

	public String getApplicantmaker() {
		return applicantmaker;
	}

	public void setApplicantmaker(String applicantmaker) {
		this.applicantmaker = applicantmaker;
	}

	public String getApplicantchecker() {
		return applicantchecker;
	}

	public void setApplicantchecker(String applicantchecker) {
		this.applicantchecker = applicantchecker;
	}

	public Long getInspectorId() {
		return inspectorId;
	}

	public void setInspectorId(Long inspectorId) {
		this.inspectorId = inspectorId;
	}

	public Long getIssueInspectorId() {
		return issueInspectorId;
	}

	public void setIssueInspectorId(Long issueInspectorId) {
		this.issueInspectorId = issueInspectorId;
	}

	public Long getVerifyInspectorId() {
		return verifyInspectorId;
	}

	public void setVerifyInspectorId(Long verifyInspectorId) {
		this.verifyInspectorId = verifyInspectorId;
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

	public String getAppliedDateFrom() {
		return appliedDateFrom;
	}

	public void setAppliedDateFrom(String appliedDateFrom) {
		this.appliedDateFrom = appliedDateFrom;
	}

	public String getAppliedDateTo() {
		return appliedDateTo;
	}

	public void setAppliedDateTo(String appliedDateTo) {
		this.appliedDateTo = appliedDateTo;
	}

	public Integer getAppliedYear() {
		return appliedYear;
	}

	public void setAppliedYear(Integer appliedYear) {
		this.appliedYear = appliedYear;
	}

	public String getStampShortNo() {
		return stampShortNo;
	}

	public void setStampShortNo(String stampShortNo) {
		this.stampShortNo = stampShortNo;
	}

	public String getStampserialno() {
		return stampserialno;
	}

	public void setStampserialno(String stampserialno) {
		this.stampserialno = stampserialno;
	}

	public Integer getStampstatus() {
		return stampstatus;
	}

	public void setStampstatus(Integer stampstatus) {
		this.stampstatus = stampstatus;
	}

}
