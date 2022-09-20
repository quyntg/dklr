package com.fds.vr.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Date;

@XmlRootElement(name = "VRProductionPlantApiModel")
public class VRProductionPlantApiModel {
	public static final Map<String, String> TABLE_COLUMNS_MAP = new LinkedHashMap<String, String>();
	public static final Map<String, Class<?>> TABLE_COLUMNS_DATA_MAP = new LinkedHashMap<String, Class<?>>();
	static {
		TABLE_COLUMNS_MAP.put("id", "id");
		TABLE_COLUMNS_DATA_MAP.put("id", long.class);
		TABLE_COLUMNS_MAP.put("mtCore", "mtcore");
		TABLE_COLUMNS_DATA_MAP.put("mtcore", long.class);
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
		TABLE_COLUMNS_MAP.put("mappingNote", "mappingnote");
		TABLE_COLUMNS_DATA_MAP.put("mappingnote", String.class);
		TABLE_COLUMNS_MAP.put("mappingStatus", "mappingstatus");
		TABLE_COLUMNS_DATA_MAP.put("mappingstatus", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantCode", "productionplantcode");
		TABLE_COLUMNS_DATA_MAP.put("productionplantcode", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantName", "productionplantname");
		TABLE_COLUMNS_DATA_MAP.put("productionplantname", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantAddress", "productionplantaddress");
		TABLE_COLUMNS_DATA_MAP.put("productionplantaddress", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantStateCode", "productionplantstatecode");
		TABLE_COLUMNS_DATA_MAP.put("productionplantstatecode", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantStateName", "productionplantstatename");
		TABLE_COLUMNS_DATA_MAP.put("productionplantstatename", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantProvinceCode", "productionplantprovincecode");
		TABLE_COLUMNS_DATA_MAP.put("productionplantprovincecode", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantProvinceName", "productionplantprovincename");
		TABLE_COLUMNS_DATA_MAP.put("productionplantprovincename", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantDistrictCode", "productionplantdistrictcode");
		TABLE_COLUMNS_DATA_MAP.put("productionplantdistrictcode", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantDistrictName", "productionplantdistrictname");
		TABLE_COLUMNS_DATA_MAP.put("productionplantdistrictname", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantEmail", "productionplantemail");
		TABLE_COLUMNS_DATA_MAP.put("productionplantemail", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantPhone", "productionplantphone");
		TABLE_COLUMNS_DATA_MAP.put("productionplantphone", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantFax", "productionplantfax");
		TABLE_COLUMNS_DATA_MAP.put("productionplantfax", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantRepresentative", "productionplantrepresentative");
		TABLE_COLUMNS_DATA_MAP.put("productionplantrepresentative", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantRepresentativeTitle", "productionplantrepresentativetitle");
		TABLE_COLUMNS_DATA_MAP.put("productionplantrepresentativetitle", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantContactName", "productionplantcontactname");
		TABLE_COLUMNS_DATA_MAP.put("productionplantcontactname", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantContactEmail", "productionplantcontactemail");
		TABLE_COLUMNS_DATA_MAP.put("productionplantcontactemail", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantContactPhone", "productionplantcontactphone");
		TABLE_COLUMNS_DATA_MAP.put("productionplantcontactphone", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantType", "productionplanttype");
		TABLE_COLUMNS_DATA_MAP.put("productionplanttype", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantStatus", "productionplantstatus");
		TABLE_COLUMNS_DATA_MAP.put("productionplantstatus", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantEmployeesNote", "productionplantemployeesnote");
		TABLE_COLUMNS_DATA_MAP.put("productionplantemployeesnote", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantEquipmentsNote", "productionplantequipmentsnote");
		TABLE_COLUMNS_DATA_MAP.put("productionplantequipmentsnote", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantProdEquipmentsNote", "productionplantprodequipmentsnote");
		TABLE_COLUMNS_DATA_MAP.put("productionplantprodequipmentsnote", String.class);
		TABLE_COLUMNS_MAP.put("registrationId", "registrationid");
		TABLE_COLUMNS_DATA_MAP.put("registrationid", long.class);
		TABLE_COLUMNS_MAP.put("registrationFormId", "registrationformid");
		TABLE_COLUMNS_DATA_MAP.put("registrationformid", long.class);
		TABLE_COLUMNS_MAP.put("applicantProfileId", "applicantprofileid");
		TABLE_COLUMNS_DATA_MAP.put("applicantprofileid", long.class);
		TABLE_COLUMNS_MAP.put("modifyDate", "modifydate");
		TABLE_COLUMNS_DATA_MAP.put("modifydate", Date.class);
		TABLE_COLUMNS_MAP.put("syncDate", "syncdate");
		TABLE_COLUMNS_DATA_MAP.put("syncdate", Date.class);
		TABLE_COLUMNS_MAP.put("supplierId", "supplierId");
		TABLE_COLUMNS_DATA_MAP.put("supplierId", Long.class);
	}
	@ApiModelProperty(name = "id", example = "null", value = "")
	protected Long id;
	@ApiModelProperty(name = "mtcore", example = "null", value = "")
	protected Long mtCore;
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
	@ApiModelProperty(name = "mappingnote", example = "null", value = "")
	protected String mappingNote;
	@ApiModelProperty(name = "mappingstatus", example = "null", value = "")
	protected String mappingStatus;
	@ApiModelProperty(name = "productionplantcode", example = "null", value = "")
	protected String productionPlantCode;
	@ApiModelProperty(name = "productionplantname", example = "null", value = "")
	protected String productionPlantName;
	@ApiModelProperty(name = "productionplantaddress", example = "null", value = "")
	protected String productionPlantAddress;
	@ApiModelProperty(name = "productionplantstatecode", example = "null", value = "")
	protected String productionPlantStateCode;
	@ApiModelProperty(name = "productionplantstatename", example = "null", value = "")
	protected String productionPlantStateName;
	@ApiModelProperty(name = "productionplantprovincecode", example = "null", value = "")
	protected String productionPlantProvinceCode;
	@ApiModelProperty(name = "productionplantprovincename", example = "null", value = "")
	protected String productionPlantProvinceName;
	@ApiModelProperty(name = "productionplantdistrictcode", example = "null", value = "")
	protected String productionPlantDistrictCode;
	@ApiModelProperty(name = "productionplantdistrictname", example = "null", value = "")
	protected String productionPlantDistrictName;
	@ApiModelProperty(name = "productionplantemail", example = "null", value = "")
	protected String productionPlantEmail;
	@ApiModelProperty(name = "productionplantphone", example = "null", value = "")
	protected String productionPlantPhone;
	@ApiModelProperty(name = "productionplantfax", example = "null", value = "")
	protected String productionPlantFax;
	@ApiModelProperty(name = "productionplantrepresentative", example = "null", value = "")
	protected String productionPlantRepresentative;
	@ApiModelProperty(name = "productionplantrepresentativetitle", example = "null", value = "")
	protected String productionPlantRepresentativeTitle;
	@ApiModelProperty(name = "productionplantcontactname", example = "null", value = "")
	protected String productionPlantContactName;
	@ApiModelProperty(name = "productionplantcontactemail", example = "null", value = "")
	protected String productionPlantContactEmail;
	@ApiModelProperty(name = "productionplantcontactphone", example = "null", value = "")
	protected String productionPlantContactPhone;
	@ApiModelProperty(name = "productionplanttype", example = "null", value = "")
	protected String productionPlantType;
	@ApiModelProperty(name = "productionplantstatus", example = "null", value = "")
	protected String productionPlantStatus;
	@ApiModelProperty(name = "productionplantemployeesnote", example = "null", value = "")
	protected String productionPlantEmployeesNote;
	@ApiModelProperty(name = "productionplantequipmentsnote", example = "null", value = "")
	protected String productionPlantEquipmentsNote;
	@ApiModelProperty(name = "productionplantprodequipmentsnote", example = "null", value = "")
	protected String productionPlantProdEquipmentsNote;
	@ApiModelProperty(name = "registrationid", example = "null", value = "")
	protected Long registrationId;
	@ApiModelProperty(name = "registrationformid", example = "null", value = "")
	protected Long registrationFormId;
	@ApiModelProperty(name = "applicantprofileid", example = "null", value = "")
	protected Long applicantProfileId;
	@ApiModelProperty(name = "modifydate", example = "null", value = "")
	protected String modifyDate;
	@ApiModelProperty(name = "syncdate", example = "null", value = "")
	protected String syncDate;
	@ApiModelProperty(name = "supplierId", example = "null", value = "")
	protected Long supplierId;

	public Long getId() {
		return id;
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
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

	public String getMappingNote() {
		return mappingNote;
	}

	public void setMappingNote(String mappingNote) {
		this.mappingNote = mappingNote;
	}

	public String getMappingStatus() {
		return mappingStatus;
	}

	public void setMappingStatus(String mappingStatus) {
		this.mappingStatus = mappingStatus;
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

	public String getProductionPlantStateCode() {
		return productionPlantStateCode;
	}

	public void setProductionPlantStateCode(String productionPlantStateCode) {
		this.productionPlantStateCode = productionPlantStateCode;
	}

	public String getProductionPlantStateName() {
		return productionPlantStateName;
	}

	public void setProductionPlantStateName(String productionPlantStateName) {
		this.productionPlantStateName = productionPlantStateName;
	}

	public String getProductionPlantProvinceCode() {
		return productionPlantProvinceCode;
	}

	public void setProductionPlantProvinceCode(String productionPlantProvinceCode) {
		this.productionPlantProvinceCode = productionPlantProvinceCode;
	}

	public String getProductionPlantProvinceName() {
		return productionPlantProvinceName;
	}

	public void setProductionPlantProvinceName(String productionPlantProvinceName) {
		this.productionPlantProvinceName = productionPlantProvinceName;
	}

	public String getProductionPlantDistrictCode() {
		return productionPlantDistrictCode;
	}

	public void setProductionPlantDistrictCode(String productionPlantDistrictCode) {
		this.productionPlantDistrictCode = productionPlantDistrictCode;
	}

	public String getProductionPlantDistrictName() {
		return productionPlantDistrictName;
	}

	public void setProductionPlantDistrictName(String productionPlantDistrictName) {
		this.productionPlantDistrictName = productionPlantDistrictName;
	}

	public String getProductionPlantEmail() {
		return productionPlantEmail;
	}

	public void setProductionPlantEmail(String productionPlantEmail) {
		this.productionPlantEmail = productionPlantEmail;
	}

	public String getProductionPlantPhone() {
		return productionPlantPhone;
	}

	public void setProductionPlantPhone(String productionPlantPhone) {
		this.productionPlantPhone = productionPlantPhone;
	}

	public String getProductionPlantFax() {
		return productionPlantFax;
	}

	public void setProductionPlantFax(String productionPlantFax) {
		this.productionPlantFax = productionPlantFax;
	}

	public String getProductionPlantRepresentative() {
		return productionPlantRepresentative;
	}

	public void setProductionPlantRepresentative(String productionPlantRepresentative) {
		this.productionPlantRepresentative = productionPlantRepresentative;
	}

	public String getProductionPlantRepresentativeTitle() {
		return productionPlantRepresentativeTitle;
	}

	public void setProductionPlantRepresentativeTitle(String productionPlantRepresentativeTitle) {
		this.productionPlantRepresentativeTitle = productionPlantRepresentativeTitle;
	}

	public String getProductionPlantContactName() {
		return productionPlantContactName;
	}

	public void setProductionPlantContactName(String productionPlantContactName) {
		this.productionPlantContactName = productionPlantContactName;
	}

	public String getProductionPlantContactEmail() {
		return productionPlantContactEmail;
	}

	public void setProductionPlantContactEmail(String productionPlantContactEmail) {
		this.productionPlantContactEmail = productionPlantContactEmail;
	}

	public String getProductionPlantContactPhone() {
		return productionPlantContactPhone;
	}

	public void setProductionPlantContactPhone(String productionPlantContactPhone) {
		this.productionPlantContactPhone = productionPlantContactPhone;
	}

	public String getProductionPlantType() {
		return productionPlantType;
	}

	public void setProductionPlantType(String productionPlantType) {
		this.productionPlantType = productionPlantType;
	}

	public String getProductionPlantStatus() {
		return productionPlantStatus;
	}

	public void setProductionPlantStatus(String productionPlantStatus) {
		this.productionPlantStatus = productionPlantStatus;
	}

	public String getProductionPlantEmployeesNote() {
		return productionPlantEmployeesNote;
	}

	public void setProductionPlantEmployeesNote(String productionPlantEmployeesNote) {
		this.productionPlantEmployeesNote = productionPlantEmployeesNote;
	}

	public String getProductionPlantEquipmentsNote() {
		return productionPlantEquipmentsNote;
	}

	public void setProductionPlantEquipmentsNote(String productionPlantEquipmentsNote) {
		this.productionPlantEquipmentsNote = productionPlantEquipmentsNote;
	}

	public String getProductionPlantProdEquipmentsNote() {
		return productionPlantProdEquipmentsNote;
	}

	public void setProductionPlantProdEquipmentsNote(String productionPlantProdEquipmentsNote) {
		this.productionPlantProdEquipmentsNote = productionPlantProdEquipmentsNote;
	}

	public Long getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(Long registrationId) {
		this.registrationId = registrationId;
	}

	public Long getRegistrationFormId() {
		return registrationFormId;
	}

	public void setRegistrationFormId(Long registrationFormId) {
		this.registrationFormId = registrationFormId;
	}

	public Long getApplicantProfileId() {
		return applicantProfileId;
	}

	public void setApplicantProfileId(Long applicantProfileId) {
		this.applicantProfileId = applicantProfileId;
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
