/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.fds.vr.business.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VRTechnicalSpec_XCG}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCG
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGWrapper implements VRTechnicalSpec_XCG,
	ModelWrapper<VRTechnicalSpec_XCG> {
	public VRTechnicalSpec_XCGWrapper(VRTechnicalSpec_XCG vrTechnicalSpec_XCG) {
		_vrTechnicalSpec_XCG = vrTechnicalSpec_XCG;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTechnicalSpec_XCG.class;
	}

	@Override
	public String getModelClassName() {
		return VRTechnicalSpec_XCG.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("convertAssembleId", getConvertAssembleId());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierNo", getDossierNo());
		attributes.put("referenceUid", getReferenceUid());
		attributes.put("dossierIdCTN", getDossierIdCTN());
		attributes.put("deliverableCode", getDeliverableCode());
		attributes.put("vehicleTypeCertificateId", getVehicleTypeCertificateId());
		attributes.put("XCG01070", getXCG01070());
		attributes.put("XCG01072", getXCG01072());
		attributes.put("XCG01083", getXCG01083());
		attributes.put("XCG01084", getXCG01084());
		attributes.put("XCG01085", getXCG01085());
		attributes.put("XCG01086", getXCG01086());
		attributes.put("XCG01087", getXCG01087());
		attributes.put("XCG01088", getXCG01088());
		attributes.put("XCG01090", getXCG01090());
		attributes.put("XCG01091", getXCG01091());
		attributes.put("XCG01092", getXCG01092());
		attributes.put("XCG01123", getXCG01123());
		attributes.put("XCG01124", getXCG01124());
		attributes.put("XCG01125", getXCG01125());
		attributes.put("XCG01156", getXCG01156());
		attributes.put("XCG01157", getXCG01157());
		attributes.put("XCG01163", getXCG01163());
		attributes.put("XCG01169", getXCG01169());
		attributes.put("XCG01170", getXCG01170());
		attributes.put("XCG01171", getXCG01171());
		attributes.put("XCG01172", getXCG01172());
		attributes.put("XCG01173", getXCG01173());
		attributes.put("XCG01182", getXCG01182());
		attributes.put("XCG01183", getXCG01183());
		attributes.put("XCG01192", getXCG01192());
		attributes.put("loai_dong_co", getLoai_dong_co());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long mtCore = (Long)attributes.get("mtCore");

		if (mtCore != null) {
			setMtCore(mtCore);
		}

		Long convertAssembleId = (Long)attributes.get("convertAssembleId");

		if (convertAssembleId != null) {
			setConvertAssembleId(convertAssembleId);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		String dossierNo = (String)attributes.get("dossierNo");

		if (dossierNo != null) {
			setDossierNo(dossierNo);
		}

		String referenceUid = (String)attributes.get("referenceUid");

		if (referenceUid != null) {
			setReferenceUid(referenceUid);
		}

		String dossierIdCTN = (String)attributes.get("dossierIdCTN");

		if (dossierIdCTN != null) {
			setDossierIdCTN(dossierIdCTN);
		}

		String deliverableCode = (String)attributes.get("deliverableCode");

		if (deliverableCode != null) {
			setDeliverableCode(deliverableCode);
		}

		Long vehicleTypeCertificateId = (Long)attributes.get(
				"vehicleTypeCertificateId");

		if (vehicleTypeCertificateId != null) {
			setVehicleTypeCertificateId(vehicleTypeCertificateId);
		}

		String XCG01070 = (String)attributes.get("XCG01070");

		if (XCG01070 != null) {
			setXCG01070(XCG01070);
		}

		String XCG01072 = (String)attributes.get("XCG01072");

		if (XCG01072 != null) {
			setXCG01072(XCG01072);
		}

		String XCG01083 = (String)attributes.get("XCG01083");

		if (XCG01083 != null) {
			setXCG01083(XCG01083);
		}

		String XCG01084 = (String)attributes.get("XCG01084");

		if (XCG01084 != null) {
			setXCG01084(XCG01084);
		}

		String XCG01085 = (String)attributes.get("XCG01085");

		if (XCG01085 != null) {
			setXCG01085(XCG01085);
		}

		String XCG01086 = (String)attributes.get("XCG01086");

		if (XCG01086 != null) {
			setXCG01086(XCG01086);
		}

		String XCG01087 = (String)attributes.get("XCG01087");

		if (XCG01087 != null) {
			setXCG01087(XCG01087);
		}

		String XCG01088 = (String)attributes.get("XCG01088");

		if (XCG01088 != null) {
			setXCG01088(XCG01088);
		}

		String XCG01090 = (String)attributes.get("XCG01090");

		if (XCG01090 != null) {
			setXCG01090(XCG01090);
		}

		String XCG01091 = (String)attributes.get("XCG01091");

		if (XCG01091 != null) {
			setXCG01091(XCG01091);
		}

		String XCG01092 = (String)attributes.get("XCG01092");

		if (XCG01092 != null) {
			setXCG01092(XCG01092);
		}

		String XCG01123 = (String)attributes.get("XCG01123");

		if (XCG01123 != null) {
			setXCG01123(XCG01123);
		}

		String XCG01124 = (String)attributes.get("XCG01124");

		if (XCG01124 != null) {
			setXCG01124(XCG01124);
		}

		String XCG01125 = (String)attributes.get("XCG01125");

		if (XCG01125 != null) {
			setXCG01125(XCG01125);
		}

		String XCG01156 = (String)attributes.get("XCG01156");

		if (XCG01156 != null) {
			setXCG01156(XCG01156);
		}

		String XCG01157 = (String)attributes.get("XCG01157");

		if (XCG01157 != null) {
			setXCG01157(XCG01157);
		}

		String XCG01163 = (String)attributes.get("XCG01163");

		if (XCG01163 != null) {
			setXCG01163(XCG01163);
		}

		String XCG01169 = (String)attributes.get("XCG01169");

		if (XCG01169 != null) {
			setXCG01169(XCG01169);
		}

		String XCG01170 = (String)attributes.get("XCG01170");

		if (XCG01170 != null) {
			setXCG01170(XCG01170);
		}

		String XCG01171 = (String)attributes.get("XCG01171");

		if (XCG01171 != null) {
			setXCG01171(XCG01171);
		}

		String XCG01172 = (String)attributes.get("XCG01172");

		if (XCG01172 != null) {
			setXCG01172(XCG01172);
		}

		String XCG01173 = (String)attributes.get("XCG01173");

		if (XCG01173 != null) {
			setXCG01173(XCG01173);
		}

		String XCG01182 = (String)attributes.get("XCG01182");

		if (XCG01182 != null) {
			setXCG01182(XCG01182);
		}

		String XCG01183 = (String)attributes.get("XCG01183");

		if (XCG01183 != null) {
			setXCG01183(XCG01183);
		}

		String XCG01192 = (String)attributes.get("XCG01192");

		if (XCG01192 != null) {
			setXCG01192(XCG01192);
		}

		String loai_dong_co = (String)attributes.get("loai_dong_co");

		if (loai_dong_co != null) {
			setLoai_dong_co(loai_dong_co);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public VRTechnicalSpec_XCG toEscapedModel() {
		return new VRTechnicalSpec_XCGWrapper(_vrTechnicalSpec_XCG.toEscapedModel());
	}

	@Override
	public VRTechnicalSpec_XCG toUnescapedModel() {
		return new VRTechnicalSpec_XCGWrapper(_vrTechnicalSpec_XCG.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTechnicalSpec_XCG.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTechnicalSpec_XCG.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTechnicalSpec_XCG.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTechnicalSpec_XCG.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTechnicalSpec_XCG> toCacheModel() {
		return _vrTechnicalSpec_XCG.toCacheModel();
	}

	@Override
	public int compareTo(VRTechnicalSpec_XCG vrTechnicalSpec_XCG) {
		return _vrTechnicalSpec_XCG.compareTo(vrTechnicalSpec_XCG);
	}

	@Override
	public int hashCode() {
		return _vrTechnicalSpec_XCG.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTechnicalSpec_XCG.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTechnicalSpec_XCGWrapper((VRTechnicalSpec_XCG)_vrTechnicalSpec_XCG.clone());
	}

	/**
	* Returns the deliverable code of this vr technical spec_xcg.
	*
	* @return the deliverable code of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrTechnicalSpec_XCG.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr technical spec_xcg.
	*
	* @return the dossier ID ctn of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTechnicalSpec_XCG.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr technical spec_xcg.
	*
	* @return the dossier no of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTechnicalSpec_XCG.getDossierNo();
	}

	/**
	* Returns the loai_dong_co of this vr technical spec_xcg.
	*
	* @return the loai_dong_co of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getLoai_dong_co() {
		return _vrTechnicalSpec_XCG.getLoai_dong_co();
	}

	/**
	* Returns the reference uid of this vr technical spec_xcg.
	*
	* @return the reference uid of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrTechnicalSpec_XCG.getReferenceUid();
	}

	/**
	* Returns the xcg01070 of this vr technical spec_xcg.
	*
	* @return the xcg01070 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01070() {
		return _vrTechnicalSpec_XCG.getXCG01070();
	}

	/**
	* Returns the xcg01072 of this vr technical spec_xcg.
	*
	* @return the xcg01072 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01072() {
		return _vrTechnicalSpec_XCG.getXCG01072();
	}

	/**
	* Returns the xcg01083 of this vr technical spec_xcg.
	*
	* @return the xcg01083 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01083() {
		return _vrTechnicalSpec_XCG.getXCG01083();
	}

	/**
	* Returns the xcg01084 of this vr technical spec_xcg.
	*
	* @return the xcg01084 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01084() {
		return _vrTechnicalSpec_XCG.getXCG01084();
	}

	/**
	* Returns the xcg01085 of this vr technical spec_xcg.
	*
	* @return the xcg01085 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01085() {
		return _vrTechnicalSpec_XCG.getXCG01085();
	}

	/**
	* Returns the xcg01086 of this vr technical spec_xcg.
	*
	* @return the xcg01086 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01086() {
		return _vrTechnicalSpec_XCG.getXCG01086();
	}

	/**
	* Returns the xcg01087 of this vr technical spec_xcg.
	*
	* @return the xcg01087 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01087() {
		return _vrTechnicalSpec_XCG.getXCG01087();
	}

	/**
	* Returns the xcg01088 of this vr technical spec_xcg.
	*
	* @return the xcg01088 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01088() {
		return _vrTechnicalSpec_XCG.getXCG01088();
	}

	/**
	* Returns the xcg01090 of this vr technical spec_xcg.
	*
	* @return the xcg01090 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01090() {
		return _vrTechnicalSpec_XCG.getXCG01090();
	}

	/**
	* Returns the xcg01091 of this vr technical spec_xcg.
	*
	* @return the xcg01091 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01091() {
		return _vrTechnicalSpec_XCG.getXCG01091();
	}

	/**
	* Returns the xcg01092 of this vr technical spec_xcg.
	*
	* @return the xcg01092 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01092() {
		return _vrTechnicalSpec_XCG.getXCG01092();
	}

	/**
	* Returns the xcg01123 of this vr technical spec_xcg.
	*
	* @return the xcg01123 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01123() {
		return _vrTechnicalSpec_XCG.getXCG01123();
	}

	/**
	* Returns the xcg01124 of this vr technical spec_xcg.
	*
	* @return the xcg01124 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01124() {
		return _vrTechnicalSpec_XCG.getXCG01124();
	}

	/**
	* Returns the xcg01125 of this vr technical spec_xcg.
	*
	* @return the xcg01125 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01125() {
		return _vrTechnicalSpec_XCG.getXCG01125();
	}

	/**
	* Returns the xcg01156 of this vr technical spec_xcg.
	*
	* @return the xcg01156 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01156() {
		return _vrTechnicalSpec_XCG.getXCG01156();
	}

	/**
	* Returns the xcg01157 of this vr technical spec_xcg.
	*
	* @return the xcg01157 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01157() {
		return _vrTechnicalSpec_XCG.getXCG01157();
	}

	/**
	* Returns the xcg01163 of this vr technical spec_xcg.
	*
	* @return the xcg01163 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01163() {
		return _vrTechnicalSpec_XCG.getXCG01163();
	}

	/**
	* Returns the xcg01169 of this vr technical spec_xcg.
	*
	* @return the xcg01169 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01169() {
		return _vrTechnicalSpec_XCG.getXCG01169();
	}

	/**
	* Returns the xcg01170 of this vr technical spec_xcg.
	*
	* @return the xcg01170 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01170() {
		return _vrTechnicalSpec_XCG.getXCG01170();
	}

	/**
	* Returns the xcg01171 of this vr technical spec_xcg.
	*
	* @return the xcg01171 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01171() {
		return _vrTechnicalSpec_XCG.getXCG01171();
	}

	/**
	* Returns the xcg01172 of this vr technical spec_xcg.
	*
	* @return the xcg01172 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01172() {
		return _vrTechnicalSpec_XCG.getXCG01172();
	}

	/**
	* Returns the xcg01173 of this vr technical spec_xcg.
	*
	* @return the xcg01173 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01173() {
		return _vrTechnicalSpec_XCG.getXCG01173();
	}

	/**
	* Returns the xcg01182 of this vr technical spec_xcg.
	*
	* @return the xcg01182 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01182() {
		return _vrTechnicalSpec_XCG.getXCG01182();
	}

	/**
	* Returns the xcg01183 of this vr technical spec_xcg.
	*
	* @return the xcg01183 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01183() {
		return _vrTechnicalSpec_XCG.getXCG01183();
	}

	/**
	* Returns the xcg01192 of this vr technical spec_xcg.
	*
	* @return the xcg01192 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01192() {
		return _vrTechnicalSpec_XCG.getXCG01192();
	}

	@Override
	public java.lang.String toString() {
		return _vrTechnicalSpec_XCG.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTechnicalSpec_XCG.toXmlString();
	}

	/**
	* Returns the modify date of this vr technical spec_xcg.
	*
	* @return the modify date of this vr technical spec_xcg
	*/
	@Override
	public Date getModifyDate() {
		return _vrTechnicalSpec_XCG.getModifyDate();
	}

	/**
	* Returns the sync date of this vr technical spec_xcg.
	*
	* @return the sync date of this vr technical spec_xcg
	*/
	@Override
	public Date getSyncDate() {
		return _vrTechnicalSpec_XCG.getSyncDate();
	}

	/**
	* Returns the convert assemble ID of this vr technical spec_xcg.
	*
	* @return the convert assemble ID of this vr technical spec_xcg
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrTechnicalSpec_XCG.getConvertAssembleId();
	}

	/**
	* Returns the dossier ID of this vr technical spec_xcg.
	*
	* @return the dossier ID of this vr technical spec_xcg
	*/
	@Override
	public long getDossierId() {
		return _vrTechnicalSpec_XCG.getDossierId();
	}

	/**
	* Returns the ID of this vr technical spec_xcg.
	*
	* @return the ID of this vr technical spec_xcg
	*/
	@Override
	public long getId() {
		return _vrTechnicalSpec_XCG.getId();
	}

	/**
	* Returns the mt core of this vr technical spec_xcg.
	*
	* @return the mt core of this vr technical spec_xcg
	*/
	@Override
	public long getMtCore() {
		return _vrTechnicalSpec_XCG.getMtCore();
	}

	/**
	* Returns the primary key of this vr technical spec_xcg.
	*
	* @return the primary key of this vr technical spec_xcg
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTechnicalSpec_XCG.getPrimaryKey();
	}

	/**
	* Returns the vehicle type certificate ID of this vr technical spec_xcg.
	*
	* @return the vehicle type certificate ID of this vr technical spec_xcg
	*/
	@Override
	public long getVehicleTypeCertificateId() {
		return _vrTechnicalSpec_XCG.getVehicleTypeCertificateId();
	}

	@Override
	public void persist() {
		_vrTechnicalSpec_XCG.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTechnicalSpec_XCG.setCachedModel(cachedModel);
	}

	/**
	* Sets the convert assemble ID of this vr technical spec_xcg.
	*
	* @param convertAssembleId the convert assemble ID of this vr technical spec_xcg
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrTechnicalSpec_XCG.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the deliverable code of this vr technical spec_xcg.
	*
	* @param deliverableCode the deliverable code of this vr technical spec_xcg
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrTechnicalSpec_XCG.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr technical spec_xcg.
	*
	* @param dossierId the dossier ID of this vr technical spec_xcg
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTechnicalSpec_XCG.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr technical spec_xcg.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr technical spec_xcg
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTechnicalSpec_XCG.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr technical spec_xcg.
	*
	* @param dossierNo the dossier no of this vr technical spec_xcg
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTechnicalSpec_XCG.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTechnicalSpec_XCG.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTechnicalSpec_XCG.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTechnicalSpec_XCG.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr technical spec_xcg.
	*
	* @param id the ID of this vr technical spec_xcg
	*/
	@Override
	public void setId(long id) {
		_vrTechnicalSpec_XCG.setId(id);
	}

	/**
	* Sets the loai_dong_co of this vr technical spec_xcg.
	*
	* @param loai_dong_co the loai_dong_co of this vr technical spec_xcg
	*/
	@Override
	public void setLoai_dong_co(java.lang.String loai_dong_co) {
		_vrTechnicalSpec_XCG.setLoai_dong_co(loai_dong_co);
	}

	/**
	* Sets the modify date of this vr technical spec_xcg.
	*
	* @param modifyDate the modify date of this vr technical spec_xcg
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTechnicalSpec_XCG.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr technical spec_xcg.
	*
	* @param mtCore the mt core of this vr technical spec_xcg
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrTechnicalSpec_XCG.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrTechnicalSpec_XCG.setNew(n);
	}

	/**
	* Sets the primary key of this vr technical spec_xcg.
	*
	* @param primaryKey the primary key of this vr technical spec_xcg
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTechnicalSpec_XCG.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTechnicalSpec_XCG.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr technical spec_xcg.
	*
	* @param referenceUid the reference uid of this vr technical spec_xcg
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrTechnicalSpec_XCG.setReferenceUid(referenceUid);
	}

	/**
	* Sets the sync date of this vr technical spec_xcg.
	*
	* @param syncDate the sync date of this vr technical spec_xcg
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTechnicalSpec_XCG.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle type certificate ID of this vr technical spec_xcg.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID of this vr technical spec_xcg
	*/
	@Override
	public void setVehicleTypeCertificateId(long vehicleTypeCertificateId) {
		_vrTechnicalSpec_XCG.setVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Sets the xcg01070 of this vr technical spec_xcg.
	*
	* @param XCG01070 the xcg01070 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01070(java.lang.String XCG01070) {
		_vrTechnicalSpec_XCG.setXCG01070(XCG01070);
	}

	/**
	* Sets the xcg01072 of this vr technical spec_xcg.
	*
	* @param XCG01072 the xcg01072 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01072(java.lang.String XCG01072) {
		_vrTechnicalSpec_XCG.setXCG01072(XCG01072);
	}

	/**
	* Sets the xcg01083 of this vr technical spec_xcg.
	*
	* @param XCG01083 the xcg01083 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01083(java.lang.String XCG01083) {
		_vrTechnicalSpec_XCG.setXCG01083(XCG01083);
	}

	/**
	* Sets the xcg01084 of this vr technical spec_xcg.
	*
	* @param XCG01084 the xcg01084 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01084(java.lang.String XCG01084) {
		_vrTechnicalSpec_XCG.setXCG01084(XCG01084);
	}

	/**
	* Sets the xcg01085 of this vr technical spec_xcg.
	*
	* @param XCG01085 the xcg01085 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01085(java.lang.String XCG01085) {
		_vrTechnicalSpec_XCG.setXCG01085(XCG01085);
	}

	/**
	* Sets the xcg01086 of this vr technical spec_xcg.
	*
	* @param XCG01086 the xcg01086 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01086(java.lang.String XCG01086) {
		_vrTechnicalSpec_XCG.setXCG01086(XCG01086);
	}

	/**
	* Sets the xcg01087 of this vr technical spec_xcg.
	*
	* @param XCG01087 the xcg01087 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01087(java.lang.String XCG01087) {
		_vrTechnicalSpec_XCG.setXCG01087(XCG01087);
	}

	/**
	* Sets the xcg01088 of this vr technical spec_xcg.
	*
	* @param XCG01088 the xcg01088 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01088(java.lang.String XCG01088) {
		_vrTechnicalSpec_XCG.setXCG01088(XCG01088);
	}

	/**
	* Sets the xcg01090 of this vr technical spec_xcg.
	*
	* @param XCG01090 the xcg01090 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01090(java.lang.String XCG01090) {
		_vrTechnicalSpec_XCG.setXCG01090(XCG01090);
	}

	/**
	* Sets the xcg01091 of this vr technical spec_xcg.
	*
	* @param XCG01091 the xcg01091 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01091(java.lang.String XCG01091) {
		_vrTechnicalSpec_XCG.setXCG01091(XCG01091);
	}

	/**
	* Sets the xcg01092 of this vr technical spec_xcg.
	*
	* @param XCG01092 the xcg01092 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01092(java.lang.String XCG01092) {
		_vrTechnicalSpec_XCG.setXCG01092(XCG01092);
	}

	/**
	* Sets the xcg01123 of this vr technical spec_xcg.
	*
	* @param XCG01123 the xcg01123 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01123(java.lang.String XCG01123) {
		_vrTechnicalSpec_XCG.setXCG01123(XCG01123);
	}

	/**
	* Sets the xcg01124 of this vr technical spec_xcg.
	*
	* @param XCG01124 the xcg01124 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01124(java.lang.String XCG01124) {
		_vrTechnicalSpec_XCG.setXCG01124(XCG01124);
	}

	/**
	* Sets the xcg01125 of this vr technical spec_xcg.
	*
	* @param XCG01125 the xcg01125 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01125(java.lang.String XCG01125) {
		_vrTechnicalSpec_XCG.setXCG01125(XCG01125);
	}

	/**
	* Sets the xcg01156 of this vr technical spec_xcg.
	*
	* @param XCG01156 the xcg01156 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01156(java.lang.String XCG01156) {
		_vrTechnicalSpec_XCG.setXCG01156(XCG01156);
	}

	/**
	* Sets the xcg01157 of this vr technical spec_xcg.
	*
	* @param XCG01157 the xcg01157 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01157(java.lang.String XCG01157) {
		_vrTechnicalSpec_XCG.setXCG01157(XCG01157);
	}

	/**
	* Sets the xcg01163 of this vr technical spec_xcg.
	*
	* @param XCG01163 the xcg01163 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01163(java.lang.String XCG01163) {
		_vrTechnicalSpec_XCG.setXCG01163(XCG01163);
	}

	/**
	* Sets the xcg01169 of this vr technical spec_xcg.
	*
	* @param XCG01169 the xcg01169 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01169(java.lang.String XCG01169) {
		_vrTechnicalSpec_XCG.setXCG01169(XCG01169);
	}

	/**
	* Sets the xcg01170 of this vr technical spec_xcg.
	*
	* @param XCG01170 the xcg01170 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01170(java.lang.String XCG01170) {
		_vrTechnicalSpec_XCG.setXCG01170(XCG01170);
	}

	/**
	* Sets the xcg01171 of this vr technical spec_xcg.
	*
	* @param XCG01171 the xcg01171 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01171(java.lang.String XCG01171) {
		_vrTechnicalSpec_XCG.setXCG01171(XCG01171);
	}

	/**
	* Sets the xcg01172 of this vr technical spec_xcg.
	*
	* @param XCG01172 the xcg01172 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01172(java.lang.String XCG01172) {
		_vrTechnicalSpec_XCG.setXCG01172(XCG01172);
	}

	/**
	* Sets the xcg01173 of this vr technical spec_xcg.
	*
	* @param XCG01173 the xcg01173 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01173(java.lang.String XCG01173) {
		_vrTechnicalSpec_XCG.setXCG01173(XCG01173);
	}

	/**
	* Sets the xcg01182 of this vr technical spec_xcg.
	*
	* @param XCG01182 the xcg01182 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01182(java.lang.String XCG01182) {
		_vrTechnicalSpec_XCG.setXCG01182(XCG01182);
	}

	/**
	* Sets the xcg01183 of this vr technical spec_xcg.
	*
	* @param XCG01183 the xcg01183 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01183(java.lang.String XCG01183) {
		_vrTechnicalSpec_XCG.setXCG01183(XCG01183);
	}

	/**
	* Sets the xcg01192 of this vr technical spec_xcg.
	*
	* @param XCG01192 the xcg01192 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01192(java.lang.String XCG01192) {
		_vrTechnicalSpec_XCG.setXCG01192(XCG01192);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCGWrapper)) {
			return false;
		}

		VRTechnicalSpec_XCGWrapper vrTechnicalSpec_XCGWrapper = (VRTechnicalSpec_XCGWrapper)obj;

		if (Objects.equals(_vrTechnicalSpec_XCG,
					vrTechnicalSpec_XCGWrapper._vrTechnicalSpec_XCG)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTechnicalSpec_XCG getWrappedModel() {
		return _vrTechnicalSpec_XCG;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTechnicalSpec_XCG.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTechnicalSpec_XCG.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTechnicalSpec_XCG.resetOriginalValues();
	}

	private final VRTechnicalSpec_XCG _vrTechnicalSpec_XCG;
}