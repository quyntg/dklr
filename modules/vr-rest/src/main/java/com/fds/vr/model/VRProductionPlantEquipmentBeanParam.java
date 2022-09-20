package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "mtcore", "sequenceno", "equipmentcode", "equipmentname", "equipmenttype",
		"trademark", "trademarkname", "commercialname", "modelcode", "productioncountrycode", "equipmentstatus",
		"expiredate", "notes", "modifydate", "syncdate", "equipmentserialno", "productionyear", "registrationyear",
		"markupxcg", "markupxcgnk", "markupsmrm", "markupxch", "markupxcn", "markupxmy", "markupxdd", "testingresult",
		"description", "inspectionrecordnumber", "inspectionrecorddate", "stamptestingno", "productionplantid",
		"productionplantcode", "keyword", "start", "end", "order_asc", "order_desc", "productclassificationcode" })
@XmlRootElement(name = "VRProductionPlantEquipmentBeanParam")
public class VRProductionPlantEquipmentBeanParam {
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
	@QueryParam(value = "sequenceno")
	protected Long sequenceNo;
	@QueryParam(value = "equipmentcode")
	protected String equipmentCode;
	@QueryParam(value = "equipmentname")
	protected String equipmentName;
	@QueryParam(value = "equipmenttype")
	protected String equipmentType;
	@QueryParam(value = "trademark")
	protected String trademark;
	@QueryParam(value = "trademarkname")
	protected String trademarkName;
	@QueryParam(value = "commercialname")
	protected String commercialName;
	@QueryParam(value = "modelcode")
	protected String modelCode;
	@QueryParam(value = "productioncountrycode")
	protected String productionCountryCode;
	@QueryParam(value = "equipmentstatus")
	protected String equipmentStatus;
	@QueryParam(value = "expiredate")
	protected String expireDate;
	@QueryParam(value = "notes")
	protected String notes;
	@QueryParam(value = "modifydate")
	protected String modifyDate;
	@QueryParam(value = "syncdate")
	protected String syncDate;
	@QueryParam(value = "equipmentserialno")
	protected String equipmentSerialNo;
	@QueryParam(value = "productionyear")
	protected String productionYear;
	@QueryParam(value = "registrationyear")
	protected String registrationYear;
	@QueryParam(value = "markupxcg")
	protected Long markupXCG;
	@QueryParam(value = "markupxcgnk")
	protected Long markupXCGNK;
	@QueryParam(value = "markupsmrm")
	protected Long markupSMRM;
	@QueryParam(value = "markupxch")
	protected Long markupXCH;
	@QueryParam(value = "markupxcn")
	protected Long markupXCN;
	@QueryParam(value = "markupxmy")
	protected Long markupXMY;
	@QueryParam(value = "markupxdd")
	protected Long markupXDD;
	@QueryParam(value = "testingresult")
	protected Integer testingResult;
	@QueryParam(value = "description")
	protected String description;
	@QueryParam(value = "inspectionrecordnumber")
	protected String inspectionRecordNumber;
	@QueryParam(value = "inspectionrecorddate")
	protected String inspectionRecordDate;
	@QueryParam(value = "stamptestingno")
	protected String stampTestingNo;
	@QueryParam(value = "productionplantid")
	protected Long productionPlantId;
	@QueryParam(value = "productionplantcode")
	protected String productionPlantCode;
	@QueryParam(value = "productclassificationcode")
	protected String productclassificationcode;

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

	public Long getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(Long sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public String getEquipmentCode() {
		return equipmentCode;
	}

	public void setEquipmentCode(String equipmentCode) {
		this.equipmentCode = equipmentCode;
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}

	public String getTrademark() {
		return trademark;
	}

	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}

	public String getTrademarkName() {
		return trademarkName;
	}

	public void setTrademarkName(String trademarkName) {
		this.trademarkName = trademarkName;
	}

	public String getCommercialName() {
		return commercialName;
	}

	public void setCommercialName(String commercialName) {
		this.commercialName = commercialName;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getProductionCountryCode() {
		return productionCountryCode;
	}

	public void setProductionCountryCode(String productionCountryCode) {
		this.productionCountryCode = productionCountryCode;
	}

	public String getEquipmentStatus() {
		return equipmentStatus;
	}

	public void setEquipmentStatus(String equipmentStatus) {
		this.equipmentStatus = equipmentStatus;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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

	public String getEquipmentSerialNo() {
		return equipmentSerialNo;
	}

	public void setEquipmentSerialNo(String equipmentSerialNo) {
		this.equipmentSerialNo = equipmentSerialNo;
	}

	public String getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(String productionYear) {
		this.productionYear = productionYear;
	}

	public String getRegistrationYear() {
		return registrationYear;
	}

	public void setRegistrationYear(String registrationYear) {
		this.registrationYear = registrationYear;
	}

	public Long getMarkupXCG() {
		return markupXCG;
	}

	public void setMarkupXCG(Long markupXCG) {
		this.markupXCG = markupXCG;
	}

	public Long getMarkupXCGNK() {
		return markupXCGNK;
	}

	public void setMarkupXCGNK(Long markupXCGNK) {
		this.markupXCGNK = markupXCGNK;
	}

	public Long getMarkupSMRM() {
		return markupSMRM;
	}

	public void setMarkupSMRM(Long markupSMRM) {
		this.markupSMRM = markupSMRM;
	}

	public Long getMarkupXCH() {
		return markupXCH;
	}

	public void setMarkupXCH(Long markupXCH) {
		this.markupXCH = markupXCH;
	}

	public Long getMarkupXCN() {
		return markupXCN;
	}

	public void setMarkupXCN(Long markupXCN) {
		this.markupXCN = markupXCN;
	}

	public Long getMarkupXMY() {
		return markupXMY;
	}

	public void setMarkupXMY(Long markupXMY) {
		this.markupXMY = markupXMY;
	}

	public Long getMarkupXDD() {
		return markupXDD;
	}

	public void setMarkupXDD(Long markupXDD) {
		this.markupXDD = markupXDD;
	}

	public Integer getTestingResult() {
		return testingResult;
	}

	public void setTestingResult(Integer testingResult) {
		this.testingResult = testingResult;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInspectionRecordNumber() {
		return inspectionRecordNumber;
	}

	public void setInspectionRecordNumber(String inspectionRecordNumber) {
		this.inspectionRecordNumber = inspectionRecordNumber;
	}

	public String getInspectionRecordDate() {
		return inspectionRecordDate;
	}

	public void setInspectionRecordDate(String inspectionRecordDate) {
		this.inspectionRecordDate = inspectionRecordDate;
	}

	public String getStampTestingNo() {
		return stampTestingNo;
	}

	public void setStampTestingNo(String stampTestingNo) {
		this.stampTestingNo = stampTestingNo;
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

	public String getProductclassificationcode() {
		return productclassificationcode;
	}

	public void setProductclassificationcode(String productclassificationcode) {
		this.productclassificationcode = productclassificationcode;
	}

}
