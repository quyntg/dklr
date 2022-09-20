package com.fds.vr.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Date;

@XmlRootElement(name = "VRProductionPlantProdEquipmentApiModel")
public class VRProductionPlantProdEquipmentApiModel {
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
		TABLE_COLUMNS_MAP.put("notes", "notes");
		TABLE_COLUMNS_DATA_MAP.put("notes", String.class);
		TABLE_COLUMNS_MAP.put("modifyDate", "modifydate");
		TABLE_COLUMNS_DATA_MAP.put("modifydate", Date.class);
		TABLE_COLUMNS_MAP.put("syncDate", "syncdate");
		TABLE_COLUMNS_DATA_MAP.put("syncdate", Date.class);
		TABLE_COLUMNS_MAP.put("productionPlantCode", "productionplantcode");
		TABLE_COLUMNS_DATA_MAP.put("productionplantcode", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantId", "productionplantid");
		TABLE_COLUMNS_DATA_MAP.put("productionplantid", long.class);
		TABLE_COLUMNS_MAP.put("quantity", "quantity");
		TABLE_COLUMNS_DATA_MAP.put("quantity", long.class);
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
	@ApiModelProperty(name = "notes", example = "null", value = "")
	protected String notes;
	@ApiModelProperty(name = "modifydate", example = "null", value = "")
	protected String modifyDate;
	@ApiModelProperty(name = "syncdate", example = "null", value = "")
	protected String syncDate;
	@ApiModelProperty(name = "productionplantcode", example = "null", value = "")
	protected String productionPlantCode;
	@ApiModelProperty(name = "productionplantid", example = "null", value = "")
	protected Long productionPlantId;
	@ApiModelProperty(name = "quantity", example = "null", value = "")
	protected Long quantity;

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

	public String getProductionPlantCode() {
		return productionPlantCode;
	}

	public void setProductionPlantCode(String productionPlantCode) {
		this.productionPlantCode = productionPlantCode;
	}

	public Long getProductionPlantId() {
		return productionPlantId;
	}

	public void setProductionPlantId(Long productionPlantId) {
		this.productionPlantId = productionPlantId;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
