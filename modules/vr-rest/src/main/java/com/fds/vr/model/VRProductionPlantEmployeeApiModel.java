package com.fds.vr.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Date;

@XmlRootElement(name = "VRProductionPlantEmployeeApiModel")
public class VRProductionPlantEmployeeApiModel {
	public static final Map<String, String> TABLE_COLUMNS_MAP = new LinkedHashMap<String, String>();
	public static final Map<String, Class<?>> TABLE_COLUMNS_DATA_MAP = new LinkedHashMap<String, Class<?>>();
	static {
		TABLE_COLUMNS_MAP.put("id", "id");
		TABLE_COLUMNS_DATA_MAP.put("id", long.class);
		TABLE_COLUMNS_MAP.put("mtCore", "mtcore");
		TABLE_COLUMNS_DATA_MAP.put("mtcore", long.class);
		TABLE_COLUMNS_MAP.put("sequenceNo", "sequenceno");
		TABLE_COLUMNS_DATA_MAP.put("sequenceno", long.class);
		TABLE_COLUMNS_MAP.put("employeeName", "employeename");
		TABLE_COLUMNS_DATA_MAP.put("employeename", String.class);
		TABLE_COLUMNS_MAP.put("employeeCertificateNo", "employeecertificateno");
		TABLE_COLUMNS_DATA_MAP.put("employeecertificateno", String.class);
		TABLE_COLUMNS_MAP.put("trainningAt", "trainningat");
		TABLE_COLUMNS_DATA_MAP.put("trainningat", String.class);
		TABLE_COLUMNS_MAP.put("workingPosition", "workingposition");
		TABLE_COLUMNS_DATA_MAP.put("workingposition", String.class);
		TABLE_COLUMNS_MAP.put("modifyDate", "modifydate");
		TABLE_COLUMNS_DATA_MAP.put("modifydate", Date.class);
		TABLE_COLUMNS_MAP.put("syncDate", "syncdate");
		TABLE_COLUMNS_DATA_MAP.put("syncdate", Date.class);
		TABLE_COLUMNS_MAP.put("productionPlantCode", "productionplantcode");
		TABLE_COLUMNS_DATA_MAP.put("productionplantcode", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantId", "productionplantid");
		TABLE_COLUMNS_DATA_MAP.put("productionplantid", long.class);
	}
	@ApiModelProperty(name = "id", example = "null", value = "")
	protected Long id;
	@ApiModelProperty(name = "mtcore", example = "null", value = "")
	protected Long mtCore;
	@ApiModelProperty(name = "sequenceno", example = "null", value = "")
	protected Long sequenceNo;
	@ApiModelProperty(name = "employeename", example = "null", value = "")
	protected String employeeName;
	@ApiModelProperty(name = "employeecertificateno", example = "null", value = "")
	protected String employeeCertificateNo;
	@ApiModelProperty(name = "trainningat", example = "null", value = "")
	protected String trainningAt;
	@ApiModelProperty(name = "workingposition", example = "null", value = "")
	protected String workingPosition;
	@ApiModelProperty(name = "modifydate", example = "null", value = "")
	protected String modifyDate;
	@ApiModelProperty(name = "syncdate", example = "null", value = "")
	protected String syncDate;
	@ApiModelProperty(name = "productionplantcode", example = "null", value = "")
	protected String productionPlantCode;
	@ApiModelProperty(name = "productionplantid", example = "null", value = "")
	protected Long productionPlantId;

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

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeCertificateNo() {
		return employeeCertificateNo;
	}

	public void setEmployeeCertificateNo(String employeeCertificateNo) {
		this.employeeCertificateNo = employeeCertificateNo;
	}

	public String getTrainningAt() {
		return trainningAt;
	}

	public void setTrainningAt(String trainningAt) {
		this.trainningAt = trainningAt;
	}

	public String getWorkingPosition() {
		return workingPosition;
	}

	public void setWorkingPosition(String workingPosition) {
		this.workingPosition = workingPosition;
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

}
