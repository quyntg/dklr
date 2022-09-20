package com.fds.vr.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Date;

@XmlRootElement(name = "VRProductionPlantEquipmentApiModel")
public class VRProductionPlantEquipmentApiModel {
	public static final Map<String, String> TABLE_COLUMNS_MAP = new LinkedHashMap<String, String>();
	public static final Map<String, Class<?>> TABLE_COLUMNS_DATA_MAP = new LinkedHashMap<String, Class<?>>();
	static {
		TABLE_COLUMNS_MAP.put("id", "id");
		TABLE_COLUMNS_DATA_MAP.put("id", long.class);
		TABLE_COLUMNS_MAP.put("mtCore", "mtcore");
		TABLE_COLUMNS_DATA_MAP.put("mtcore", long.class);
		TABLE_COLUMNS_MAP.put("sequenceNo", "sequenceno");
		TABLE_COLUMNS_DATA_MAP.put("sequenceno", long.class);
		TABLE_COLUMNS_MAP.put("equipmentCode", "equipmentcode");
		TABLE_COLUMNS_DATA_MAP.put("equipmentcode", String.class);
		TABLE_COLUMNS_MAP.put("equipmentName", "equipmentname");
		TABLE_COLUMNS_DATA_MAP.put("equipmentname", String.class);
		TABLE_COLUMNS_MAP.put("equipmentType", "equipmenttype");
		TABLE_COLUMNS_DATA_MAP.put("equipmenttype", String.class);
		TABLE_COLUMNS_MAP.put("trademark", "trademark");
		TABLE_COLUMNS_DATA_MAP.put("trademark", String.class);
		TABLE_COLUMNS_MAP.put("trademarkName", "trademarkname");
		TABLE_COLUMNS_DATA_MAP.put("trademarkname", String.class);
		TABLE_COLUMNS_MAP.put("commercialName", "commercialname");
		TABLE_COLUMNS_DATA_MAP.put("commercialname", String.class);
		TABLE_COLUMNS_MAP.put("modelCode", "modelcode");
		TABLE_COLUMNS_DATA_MAP.put("modelcode", String.class);
		TABLE_COLUMNS_MAP.put("productionCountryCode", "productioncountrycode");
		TABLE_COLUMNS_DATA_MAP.put("productioncountrycode", String.class);
		TABLE_COLUMNS_MAP.put("equipmentStatus", "equipmentstatus");
		TABLE_COLUMNS_DATA_MAP.put("equipmentstatus", String.class);
		TABLE_COLUMNS_MAP.put("expireDate", "expiredate");
		TABLE_COLUMNS_DATA_MAP.put("expiredate", Date.class);
		TABLE_COLUMNS_MAP.put("notes", "notes");
		TABLE_COLUMNS_DATA_MAP.put("notes", String.class);
		TABLE_COLUMNS_MAP.put("modifyDate", "modifydate");
		TABLE_COLUMNS_DATA_MAP.put("modifydate", Date.class);
		TABLE_COLUMNS_MAP.put("syncDate", "syncdate");
		TABLE_COLUMNS_DATA_MAP.put("syncdate", Date.class);
		TABLE_COLUMNS_MAP.put("equipmentSerialNo", "equipmentserialno");
		TABLE_COLUMNS_DATA_MAP.put("equipmentserialno", String.class);
		TABLE_COLUMNS_MAP.put("productionYear", "productionyear");
		TABLE_COLUMNS_DATA_MAP.put("productionyear", String.class);
		TABLE_COLUMNS_MAP.put("registrationYear", "registrationyear");
		TABLE_COLUMNS_DATA_MAP.put("registrationyear", String.class);
		TABLE_COLUMNS_MAP.put("markupXCG", "markupxcg");
		TABLE_COLUMNS_DATA_MAP.put("markupxcg", long.class);
		TABLE_COLUMNS_MAP.put("markupXCGNK", "markupxcgnk");
		TABLE_COLUMNS_DATA_MAP.put("markupxcgnk", long.class);
		TABLE_COLUMNS_MAP.put("markupSMRM", "markupsmrm");
		TABLE_COLUMNS_DATA_MAP.put("markupsmrm", long.class);
		TABLE_COLUMNS_MAP.put("markupXCH", "markupxch");
		TABLE_COLUMNS_DATA_MAP.put("markupxch", long.class);
		TABLE_COLUMNS_MAP.put("markupXCN", "markupxcn");
		TABLE_COLUMNS_DATA_MAP.put("markupxcn", long.class);
		TABLE_COLUMNS_MAP.put("markupXMY", "markupxmy");
		TABLE_COLUMNS_DATA_MAP.put("markupxmy", long.class);
		TABLE_COLUMNS_MAP.put("markupXDD", "markupxdd");
		TABLE_COLUMNS_DATA_MAP.put("markupxdd", long.class);
		TABLE_COLUMNS_MAP.put("testingResult", "testingresult");
		TABLE_COLUMNS_DATA_MAP.put("testingresult", int.class);
		TABLE_COLUMNS_MAP.put("description", "description");
		TABLE_COLUMNS_DATA_MAP.put("description", String.class);
		TABLE_COLUMNS_MAP.put("inspectionRecordNumber", "inspectionrecordnumber");
		TABLE_COLUMNS_DATA_MAP.put("inspectionrecordnumber", String.class);
		TABLE_COLUMNS_MAP.put("inspectionRecordDate", "inspectionrecorddate");
		TABLE_COLUMNS_DATA_MAP.put("inspectionrecorddate", Date.class);
		TABLE_COLUMNS_MAP.put("stampTestingNo", "stamptestingno");
		TABLE_COLUMNS_DATA_MAP.put("stamptestingno", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantId", "productionplantid");
		TABLE_COLUMNS_DATA_MAP.put("productionplantid", long.class);
		TABLE_COLUMNS_MAP.put("productionPlantCode", "productionplantcode");
		TABLE_COLUMNS_DATA_MAP.put("productionplantcode", String.class);
	}
	@ApiModelProperty(name = "id", example = "null", value = "")
	protected Long id;
	@ApiModelProperty(name = "mtcore", example = "null", value = "")
	protected Long mtCore;
	@ApiModelProperty(name = "sequenceno", example = "null", value = "")
	protected Long sequenceNo;
	@ApiModelProperty(name = "equipmentcode", example = "null", value = "")
	protected String equipmentCode;
	@ApiModelProperty(name = "equipmentname", example = "null", value = "")
	protected String equipmentName;
	@ApiModelProperty(name = "equipmenttype", example = "null", value = "")
	protected String equipmentType;
	@ApiModelProperty(name = "trademark", example = "null", value = "")
	protected String trademark;
	@ApiModelProperty(name = "trademarkname", example = "null", value = "")
	protected String trademarkName;
	@ApiModelProperty(name = "commercialname", example = "null", value = "")
	protected String commercialName;
	@ApiModelProperty(name = "modelcode", example = "null", value = "")
	protected String modelCode;
	@ApiModelProperty(name = "productioncountrycode", example = "null", value = "")
	protected String productionCountryCode;
	@ApiModelProperty(name = "equipmentstatus", example = "null", value = "")
	protected String equipmentStatus;
	@ApiModelProperty(name = "expiredate", example = "null", value = "")
	protected String expireDate;
	@ApiModelProperty(name = "notes", example = "null", value = "")
	protected String notes;
	@ApiModelProperty(name = "modifydate", example = "null", value = "")
	protected String modifyDate;
	@ApiModelProperty(name = "syncdate", example = "null", value = "")
	protected String syncDate;
	@ApiModelProperty(name = "equipmentserialno", example = "null", value = "")
	protected String equipmentSerialNo;
	@ApiModelProperty(name = "productionyear", example = "null", value = "")
	protected String productionYear;
	@ApiModelProperty(name = "registrationyear", example = "null", value = "")
	protected String registrationYear;
	@ApiModelProperty(name = "markupxcg", example = "null", value = "")
	protected Long markupXCG;
	@ApiModelProperty(name = "markupxcgnk", example = "null", value = "")
	protected Long markupXCGNK;
	@ApiModelProperty(name = "markupsmrm", example = "null", value = "")
	protected Long markupSMRM;
	@ApiModelProperty(name = "markupxch", example = "null", value = "")
	protected Long markupXCH;
	@ApiModelProperty(name = "markupxcn", example = "null", value = "")
	protected Long markupXCN;
	@ApiModelProperty(name = "markupxmy", example = "null", value = "")
	protected Long markupXMY;
	@ApiModelProperty(name = "markupxdd", example = "null", value = "")
	protected Long markupXDD;
	@ApiModelProperty(name = "testingresult", example = "null", value = "")
	protected Integer testingResult;
	@ApiModelProperty(name = "description", example = "null", value = "")
	protected String description;
	@ApiModelProperty(name = "inspectionrecordnumber", example = "null", value = "")
	protected String inspectionRecordNumber;
	@ApiModelProperty(name = "inspectionrecorddate", example = "null", value = "")
	protected String inspectionRecordDate;
	@ApiModelProperty(name = "stamptestingno", example = "null", value = "")
	protected String stampTestingNo;
	@ApiModelProperty(name = "productionplantid", example = "null", value = "")
	protected Long productionPlantId;
	@ApiModelProperty(name = "productionplantcode", example = "null", value = "")
	protected String productionPlantCode;

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

}
