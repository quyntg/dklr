package com.fds.vr.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Date;

@XmlRootElement(name = "VRProductTypeApiModel")
public class VRProductTypeApiModel {
	public static final Map<String, String> TABLE_COLUMNS_MAP = new LinkedHashMap<String, String>();
	public static final Map<String, Class<?>> TABLE_COLUMNS_DATA_MAP = new LinkedHashMap<String, Class<?>>();
	static {
		TABLE_COLUMNS_MAP.put("id", "id");
		TABLE_COLUMNS_DATA_MAP.put("id", long.class);
		TABLE_COLUMNS_MAP.put("mtCore", "mtcore");
		TABLE_COLUMNS_DATA_MAP.put("mtcore", long.class);
		TABLE_COLUMNS_MAP.put("sequenceNo", "sequenceno");
		TABLE_COLUMNS_DATA_MAP.put("sequenceno", long.class);
		TABLE_COLUMNS_MAP.put("vehicleClass", "vehicleclass");
		TABLE_COLUMNS_DATA_MAP.put("vehicleclass", String.class);
		TABLE_COLUMNS_MAP.put("vehicleTypeCode", "vehicletypecode");
		TABLE_COLUMNS_DATA_MAP.put("vehicletypecode", String.class);
		TABLE_COLUMNS_MAP.put("vehicleTypeDescription", "vehicletypedescription");
		TABLE_COLUMNS_DATA_MAP.put("vehicletypedescription", String.class);
		TABLE_COLUMNS_MAP.put("productClassificationCode", "productclassificationcode");
		TABLE_COLUMNS_DATA_MAP.put("productclassificationcode", String.class);
		TABLE_COLUMNS_MAP.put("productClassificationDescription", "productclassificationdescription");
		TABLE_COLUMNS_DATA_MAP.put("productclassificationdescription", String.class);
		TABLE_COLUMNS_MAP.put("trademark", "trademark");
		TABLE_COLUMNS_DATA_MAP.put("trademark", String.class);
		TABLE_COLUMNS_MAP.put("trademarkName", "trademarkname");
		TABLE_COLUMNS_DATA_MAP.put("trademarkname", String.class);
		TABLE_COLUMNS_MAP.put("commercialName", "commercialname");
		TABLE_COLUMNS_DATA_MAP.put("commercialname", String.class);
		TABLE_COLUMNS_MAP.put("modelCode", "modelcode");
		TABLE_COLUMNS_DATA_MAP.put("modelcode", String.class);
		TABLE_COLUMNS_MAP.put("designSymbolNo", "designsymbolno");
		TABLE_COLUMNS_DATA_MAP.put("designsymbolno", String.class);
		TABLE_COLUMNS_MAP.put("modifyDate", "modifydate");
		TABLE_COLUMNS_DATA_MAP.put("modifydate", Date.class);
		TABLE_COLUMNS_MAP.put("syncDate", "syncdate");
		TABLE_COLUMNS_DATA_MAP.put("syncdate", Date.class);
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
	@ApiModelProperty(name = "vehicleclass", example = "null", value = "")
	protected String vehicleClass;
	@ApiModelProperty(name = "vehicletypecode", example = "null", value = "")
	protected String vehicleTypeCode;
	@ApiModelProperty(name = "vehicletypedescription", example = "null", value = "")
	protected String vehicleTypeDescription;
	@ApiModelProperty(name = "productclassificationcode", example = "null", value = "")
	protected String productClassificationCode;
	@ApiModelProperty(name = "productclassificationdescription", example = "null", value = "")
	protected String productClassificationDescription;
	@ApiModelProperty(name = "trademark", example = "null", value = "")
	protected String trademark;
	@ApiModelProperty(name = "trademarkname", example = "null", value = "")
	protected String trademarkName;
	@ApiModelProperty(name = "commercialname", example = "null", value = "")
	protected String commercialName;
	@ApiModelProperty(name = "modelcode", example = "null", value = "")
	protected String modelCode;
	@ApiModelProperty(name = "designsymbolno", example = "null", value = "")
	protected String designSymbolNo;
	@ApiModelProperty(name = "modifydate", example = "null", value = "")
	protected String modifyDate;
	@ApiModelProperty(name = "syncdate", example = "null", value = "")
	protected String syncDate;
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

	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	public String getVehicleTypeCode() {
		return vehicleTypeCode;
	}

	public void setVehicleTypeCode(String vehicleTypeCode) {
		this.vehicleTypeCode = vehicleTypeCode;
	}

	public String getVehicleTypeDescription() {
		return vehicleTypeDescription;
	}

	public void setVehicleTypeDescription(String vehicleTypeDescription) {
		this.vehicleTypeDescription = vehicleTypeDescription;
	}

	public String getProductClassificationCode() {
		return productClassificationCode;
	}

	public void setProductClassificationCode(String productClassificationCode) {
		this.productClassificationCode = productClassificationCode;
	}

	public String getProductClassificationDescription() {
		return productClassificationDescription;
	}

	public void setProductClassificationDescription(String productClassificationDescription) {
		this.productClassificationDescription = productClassificationDescription;
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

	public String getDesignSymbolNo() {
		return designSymbolNo;
	}

	public void setDesignSymbolNo(String designSymbolNo) {
		this.designSymbolNo = designSymbolNo;
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
