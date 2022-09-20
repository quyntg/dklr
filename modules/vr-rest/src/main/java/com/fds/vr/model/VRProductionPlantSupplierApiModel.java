package com.fds.vr.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Date;

@XmlRootElement(name = "VRProductionPlantSupplierApiModel")
public class VRProductionPlantSupplierApiModel {
	public static final Map<String, String> TABLE_COLUMNS_MAP = new LinkedHashMap<String, String>();
	public static final Map<String, Class<?>> TABLE_COLUMNS_DATA_MAP = new LinkedHashMap<String, Class<?>>();
	static {
		TABLE_COLUMNS_MAP.put("id", "id");
		TABLE_COLUMNS_DATA_MAP.put("id", long.class);
		TABLE_COLUMNS_MAP.put("mtCore", "mtcore");
		TABLE_COLUMNS_DATA_MAP.put("mtcore", long.class);
		TABLE_COLUMNS_MAP.put("supplierId", "supplierid");
		TABLE_COLUMNS_DATA_MAP.put("supplierid", String.class);
		TABLE_COLUMNS_MAP.put("supplierName", "suppliername");
		TABLE_COLUMNS_DATA_MAP.put("suppliername", String.class);
		TABLE_COLUMNS_MAP.put("supplieraddress", "supplieraddress");
		TABLE_COLUMNS_DATA_MAP.put("supplieraddress", String.class);
		TABLE_COLUMNS_MAP.put("corporationCode", "corporationcode");
		TABLE_COLUMNS_DATA_MAP.put("corporationcode", String.class);
		TABLE_COLUMNS_MAP.put("corporationName", "corporationname");
		TABLE_COLUMNS_DATA_MAP.put("corporationname", String.class);
		TABLE_COLUMNS_MAP.put("corporationAddress", "corporationaddress");
		TABLE_COLUMNS_DATA_MAP.put("corporationaddress", String.class);
		TABLE_COLUMNS_MAP.put("applicantprofileId", "applicantprofileid");
		TABLE_COLUMNS_DATA_MAP.put("applicantprofileid", long.class);
		TABLE_COLUMNS_MAP.put("productPlantID", "productplantid");
		TABLE_COLUMNS_DATA_MAP.put("productplantid", long.class);
		TABLE_COLUMNS_MAP.put("productionPlantCode", "productionplantcode");
		TABLE_COLUMNS_DATA_MAP.put("productionplantcode", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantName", "productionplantname");
		TABLE_COLUMNS_DATA_MAP.put("productionplantname", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantAddress", "productionplantaddress");
		TABLE_COLUMNS_DATA_MAP.put("productionplantaddress", String.class);
		TABLE_COLUMNS_MAP.put("markupImporter", "markupimporter");
		TABLE_COLUMNS_DATA_MAP.put("markupimporter", int.class);
		TABLE_COLUMNS_MAP.put("mappingMA_CTY", "mappingma_cty");
		TABLE_COLUMNS_DATA_MAP.put("mappingma_cty", String.class);
		TABLE_COLUMNS_MAP.put("mappingTEN_CTY", "mappingten_cty");
		TABLE_COLUMNS_DATA_MAP.put("mappingten_cty", String.class);
		TABLE_COLUMNS_MAP.put("mappingDIA_CHI_CTY", "mappingdia_chi_cty");
		TABLE_COLUMNS_DATA_MAP.put("mappingdia_chi_cty", String.class);
		TABLE_COLUMNS_MAP.put("mappingMA_XUONG_LR", "mappingma_xuong_lr");
		TABLE_COLUMNS_DATA_MAP.put("mappingma_xuong_lr", String.class);
		TABLE_COLUMNS_MAP.put("mappingTEN_XUONG_LR", "mappingten_xuong_lr");
		TABLE_COLUMNS_DATA_MAP.put("mappingten_xuong_lr", String.class);
		TABLE_COLUMNS_MAP.put("mappingDIA_CHI_XUONG_LR", "mappingdia_chi_xuong_lr");
		TABLE_COLUMNS_DATA_MAP.put("mappingdia_chi_xuong_lr", String.class);
		TABLE_COLUMNS_MAP.put("modifyDate", "modifydate");
		TABLE_COLUMNS_DATA_MAP.put("modifydate", Date.class);
		TABLE_COLUMNS_MAP.put("syncDate", "syncdate");
		TABLE_COLUMNS_DATA_MAP.put("syncdate", Date.class);
	}
	@ApiModelProperty(name = "id", example = "null", value = "")
	protected Long id;
	@ApiModelProperty(name = "mtcore", example = "null", value = "")
	protected Long mtCore;
	@ApiModelProperty(name = "supplierid", example = "null", value = "")
	protected String supplierId;
	@ApiModelProperty(name = "suppliername", example = "null", value = "")
	protected String supplierName;
	@ApiModelProperty(name = "supplieraddress", example = "null", value = "")
	protected String supplieraddress;
	@ApiModelProperty(name = "corporationcode", example = "null", value = "")
	protected String corporationCode;
	@ApiModelProperty(name = "corporationname", example = "null", value = "")
	protected String corporationName;
	@ApiModelProperty(name = "corporationaddress", example = "null", value = "")
	protected String corporationAddress;
	@ApiModelProperty(name = "applicantprofileid", example = "null", value = "")
	protected Long applicantprofileId;
	@ApiModelProperty(name = "productplantid", example = "null", value = "")
	protected Long productPlantID;
	@ApiModelProperty(name = "productionplantcode", example = "null", value = "")
	protected String productionPlantCode;
	@ApiModelProperty(name = "productionplantname", example = "null", value = "")
	protected String productionPlantName;
	@ApiModelProperty(name = "productionplantaddress", example = "null", value = "")
	protected String productionPlantAddress;
	@ApiModelProperty(name = "markupimporter", example = "null", value = "")
	protected Integer markupImporter;
	@ApiModelProperty(name = "mappingma_cty", example = "null", value = "")
	protected String mappingMA_CTY;
	@ApiModelProperty(name = "mappingten_cty", example = "null", value = "")
	protected String mappingTEN_CTY;
	@ApiModelProperty(name = "mappingdia_chi_cty", example = "null", value = "")
	protected String mappingDIA_CHI_CTY;
	@ApiModelProperty(name = "mappingma_xuong_lr", example = "null", value = "")
	protected String mappingMA_XUONG_LR;
	@ApiModelProperty(name = "mappingten_xuong_lr", example = "null", value = "")
	protected String mappingTEN_XUONG_LR;
	@ApiModelProperty(name = "mappingdia_chi_xuong_lr", example = "null", value = "")
	protected String mappingDIA_CHI_XUONG_LR;
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

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplieraddress() {
		return supplieraddress;
	}

	public void setSupplieraddress(String supplieraddress) {
		this.supplieraddress = supplieraddress;
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

	public String getCorporationAddress() {
		return corporationAddress;
	}

	public void setCorporationAddress(String corporationAddress) {
		this.corporationAddress = corporationAddress;
	}

	public Long getApplicantprofileId() {
		return applicantprofileId;
	}

	public void setApplicantprofileId(Long applicantprofileId) {
		this.applicantprofileId = applicantprofileId;
	}

	public Long getProductPlantID() {
		return productPlantID;
	}

	public void setProductPlantID(Long productPlantID) {
		this.productPlantID = productPlantID;
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

	public Integer getMarkupImporter() {
		return markupImporter;
	}

	public void setMarkupImporter(Integer markupImporter) {
		this.markupImporter = markupImporter;
	}

	public String getMappingMA_CTY() {
		return mappingMA_CTY;
	}

	public void setMappingMA_CTY(String mappingMA_CTY) {
		this.mappingMA_CTY = mappingMA_CTY;
	}

	public String getMappingTEN_CTY() {
		return mappingTEN_CTY;
	}

	public void setMappingTEN_CTY(String mappingTEN_CTY) {
		this.mappingTEN_CTY = mappingTEN_CTY;
	}

	public String getMappingDIA_CHI_CTY() {
		return mappingDIA_CHI_CTY;
	}

	public void setMappingDIA_CHI_CTY(String mappingDIA_CHI_CTY) {
		this.mappingDIA_CHI_CTY = mappingDIA_CHI_CTY;
	}

	public String getMappingMA_XUONG_LR() {
		return mappingMA_XUONG_LR;
	}

	public void setMappingMA_XUONG_LR(String mappingMA_XUONG_LR) {
		this.mappingMA_XUONG_LR = mappingMA_XUONG_LR;
	}

	public String getMappingTEN_XUONG_LR() {
		return mappingTEN_XUONG_LR;
	}

	public void setMappingTEN_XUONG_LR(String mappingTEN_XUONG_LR) {
		this.mappingTEN_XUONG_LR = mappingTEN_XUONG_LR;
	}

	public String getMappingDIA_CHI_XUONG_LR() {
		return mappingDIA_CHI_XUONG_LR;
	}

	public void setMappingDIA_CHI_XUONG_LR(String mappingDIA_CHI_XUONG_LR) {
		this.mappingDIA_CHI_XUONG_LR = mappingDIA_CHI_XUONG_LR;
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
