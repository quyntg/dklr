package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "mtcore", "applicantprofileid", "applicantcode", "productionplantid",
		"productionplantcode", "sequenceno", "productclassificationcode", "productclassificationdescription",
		"classificationmode", "remarks", "status", "modifydate", "syncdate", "keyword", "start", "end", "order_asc",
		"order_desc" })
@XmlRootElement(name = "VRProductionClassificationBeanParam")
public class VRProductionClassificationBeanParam {
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
	@QueryParam(value = "applicantprofileid")
	protected Long applicantProfileId;
	@QueryParam(value = "applicantcode")
	protected String applicantCode;
	@QueryParam(value = "productionplantid")
	protected Long productionPlantId;
	@QueryParam(value = "productionplantcode")
	protected String productionPlantCode;
	@QueryParam(value = "sequenceno")
	protected Integer sequenceNo;
	@QueryParam(value = "productclassificationcode")
	protected String productClassificationCode;
	@QueryParam(value = "productclassificationdescription")
	protected String productClassificationDescription;
	@QueryParam(value = "classificationmode")
	protected String classificationMode;
	@QueryParam(value = "remarks")
	protected String remarks;
	@QueryParam(value = "status")
	protected String status;
	@QueryParam(value = "modifydate")
	protected String modifyDate;
	@QueryParam(value = "syncdate")
	protected String syncDate;
}
