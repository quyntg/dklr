package com.fds.vr.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Date;

@XmlRootElement(name = "VRProductionClassificationApiModel")
public class VRProductionClassificationApiModel {
	public static final Map<String, String> TABLE_COLUMNS_MAP = new LinkedHashMap<String, String>();
	public static final Map<String, Class<?>> TABLE_COLUMNS_DATA_MAP = new LinkedHashMap<String, Class<?>>();
	static {
		TABLE_COLUMNS_MAP.put("id", "id");
		TABLE_COLUMNS_DATA_MAP.put("id", long.class);
		TABLE_COLUMNS_MAP.put("mtCore", "mtcore");
		TABLE_COLUMNS_DATA_MAP.put("mtcore", long.class);
		TABLE_COLUMNS_MAP.put("applicantProfileId", "applicantprofileid");
		TABLE_COLUMNS_DATA_MAP.put("applicantprofileid", long.class);
		TABLE_COLUMNS_MAP.put("applicantCode", "applicantcode");
		TABLE_COLUMNS_DATA_MAP.put("applicantcode", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantId", "productionplantid");
		TABLE_COLUMNS_DATA_MAP.put("productionplantid", long.class);
		TABLE_COLUMNS_MAP.put("productionPlantCode", "productionplantcode");
		TABLE_COLUMNS_DATA_MAP.put("productionplantcode", String.class);
		TABLE_COLUMNS_MAP.put("sequenceNo", "sequenceno");
		TABLE_COLUMNS_DATA_MAP.put("sequenceno", int.class);
		TABLE_COLUMNS_MAP.put("productClassificationCode", "productclassificationcode");
		TABLE_COLUMNS_DATA_MAP.put("productclassificationcode", String.class);
		TABLE_COLUMNS_MAP.put("productClassificationDescription", "productclassificationdescription");
		TABLE_COLUMNS_DATA_MAP.put("productclassificationdescription", String.class);
		TABLE_COLUMNS_MAP.put("classificationMode", "classificationmode");
		TABLE_COLUMNS_DATA_MAP.put("classificationmode", String.class);
		TABLE_COLUMNS_MAP.put("remarks", "remarks");
		TABLE_COLUMNS_DATA_MAP.put("remarks", String.class);
		TABLE_COLUMNS_MAP.put("status", "status");
		TABLE_COLUMNS_DATA_MAP.put("status", String.class);
		TABLE_COLUMNS_MAP.put("modifyDate", "modifydate");
		TABLE_COLUMNS_DATA_MAP.put("modifydate", Date.class);
		TABLE_COLUMNS_MAP.put("syncDate", "syncdate");
		TABLE_COLUMNS_DATA_MAP.put("syncdate", Date.class);
	}
	@ApiModelProperty(name = "id", example = "null", value = "")
	protected Long id;
	@ApiModelProperty(name = "mtcore", example = "null", value = "")
	protected Long mtCore;
	@ApiModelProperty(name = "applicantprofileid", example = "null", value = "")
	protected Long applicantProfileId;
	@ApiModelProperty(name = "applicantcode", example = "null", value = "")
	protected String applicantCode;
	@ApiModelProperty(name = "productionplantid", example = "null", value = "")
	protected Long productionPlantId;
	@ApiModelProperty(name = "productionplantcode", example = "null", value = "")
	protected String productionPlantCode;
	@ApiModelProperty(name = "sequenceno", example = "null", value = "")
	protected Integer sequenceNo;
	@ApiModelProperty(name = "productclassificationcode", example = "null", value = "")
	protected String productClassificationCode;
	@ApiModelProperty(name = "productclassificationdescription", example = "null", value = "")
	protected String productClassificationDescription;
	@ApiModelProperty(name = "classificationmode", example = "null", value = "")
	protected String classificationMode;
	@ApiModelProperty(name = "remarks", example = "null", value = "")
	protected String remarks;
	@ApiModelProperty(name = "status", example = "null", value = "")
	protected String status;
	@ApiModelProperty(name = "modifydate", example = "null", value = "")
	protected String modifyDate;
	@ApiModelProperty(name = "syncdate", example = "null", value = "")
	protected String syncDate;

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

	public Long getApplicantProfileId() {
		return applicantProfileId;
	}

	public void setApplicantProfileId(Long applicantProfileId) {
		this.applicantProfileId = applicantProfileId;
	}

	public String getApplicantCode() {
		return applicantCode;
	}

	public void setApplicantCode(String applicantCode) {
		this.applicantCode = applicantCode;
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

	public Integer getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(Integer sequenceNo) {
		this.sequenceNo = sequenceNo;
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

	public String getClassificationMode() {
		return classificationMode;
	}

	public void setClassificationMode(String classificationMode) {
		this.classificationMode = classificationMode;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

}
