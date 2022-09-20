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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the VRInspectionStandard service. Represents a row in the &quot;vr_inspectionstandard&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRInspectionStandardModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRInspectionStandardImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRInspectionStandard
 * @see com.fds.vr.business.model.impl.VRInspectionStandardImpl
 * @see com.fds.vr.business.model.impl.VRInspectionStandardModelImpl
 * @generated
 */
@ProviderType
public interface VRInspectionStandardModel extends BaseModel<VRInspectionStandard> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vr inspection standard model instance should use the {@link VRInspectionStandard} interface instead.
	 */

	/**
	 * Returns the primary key of this vr inspection standard.
	 *
	 * @return the primary key of this vr inspection standard
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vr inspection standard.
	 *
	 * @param primaryKey the primary key of this vr inspection standard
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vr inspection standard.
	 *
	 * @return the ID of this vr inspection standard
	 */
	public long getId();

	/**
	 * Sets the ID of this vr inspection standard.
	 *
	 * @param id the ID of this vr inspection standard
	 */
	public void setId(long id);

	/**
	 * Returns the vehicle certificate ID of this vr inspection standard.
	 *
	 * @return the vehicle certificate ID of this vr inspection standard
	 */
	public long getVehicleCertificateId();

	/**
	 * Sets the vehicle certificate ID of this vr inspection standard.
	 *
	 * @param vehicleCertificateId the vehicle certificate ID of this vr inspection standard
	 */
	public void setVehicleCertificateId(long vehicleCertificateId);

	/**
	 * Returns the deliverable code of this vr inspection standard.
	 *
	 * @return the deliverable code of this vr inspection standard
	 */
	@AutoEscape
	public String getDeliverableCode();

	/**
	 * Sets the deliverable code of this vr inspection standard.
	 *
	 * @param deliverableCode the deliverable code of this vr inspection standard
	 */
	public void setDeliverableCode(String deliverableCode);

	/**
	 * Returns the sequence no of this vr inspection standard.
	 *
	 * @return the sequence no of this vr inspection standard
	 */
	public long getSequenceNo();

	/**
	 * Sets the sequence no of this vr inspection standard.
	 *
	 * @param sequenceNo the sequence no of this vr inspection standard
	 */
	public void setSequenceNo(long sequenceNo);

	/**
	 * Returns the circularno of this vr inspection standard.
	 *
	 * @return the circularno of this vr inspection standard
	 */
	@AutoEscape
	public String getCircularno();

	/**
	 * Sets the circularno of this vr inspection standard.
	 *
	 * @param circularno the circularno of this vr inspection standard
	 */
	public void setCircularno(String circularno);

	/**
	 * Returns the circulardate of this vr inspection standard.
	 *
	 * @return the circulardate of this vr inspection standard
	 */
	public Date getCirculardate();

	/**
	 * Sets the circulardate of this vr inspection standard.
	 *
	 * @param circulardate the circulardate of this vr inspection standard
	 */
	public void setCirculardate(Date circulardate);

	/**
	 * Returns the markupstatus of this vr inspection standard.
	 *
	 * @return the markupstatus of this vr inspection standard
	 */
	public long getMarkupstatus();

	/**
	 * Sets the markupstatus of this vr inspection standard.
	 *
	 * @param markupstatus the markupstatus of this vr inspection standard
	 */
	public void setMarkupstatus(long markupstatus);

	/**
	 * Returns the module of this vr inspection standard.
	 *
	 * @return the module of this vr inspection standard
	 */
	@AutoEscape
	public String getModule();

	/**
	 * Sets the module of this vr inspection standard.
	 *
	 * @param module the module of this vr inspection standard
	 */
	public void setModule(String module);

	/**
	 * Returns the dossier ID of this vr inspection standard.
	 *
	 * @return the dossier ID of this vr inspection standard
	 */
	public long getDossierId();

	/**
	 * Sets the dossier ID of this vr inspection standard.
	 *
	 * @param dossierId the dossier ID of this vr inspection standard
	 */
	public void setDossierId(long dossierId);

	/**
	 * Returns the dossier ID ctn of this vr inspection standard.
	 *
	 * @return the dossier ID ctn of this vr inspection standard
	 */
	@AutoEscape
	public String getDossierIdCTN();

	/**
	 * Sets the dossier ID ctn of this vr inspection standard.
	 *
	 * @param dossierIdCTN the dossier ID ctn of this vr inspection standard
	 */
	public void setDossierIdCTN(String dossierIdCTN);

	/**
	 * Returns the dossier no of this vr inspection standard.
	 *
	 * @return the dossier no of this vr inspection standard
	 */
	@AutoEscape
	public String getDossierNo();

	/**
	 * Sets the dossier no of this vr inspection standard.
	 *
	 * @param dossierNo the dossier no of this vr inspection standard
	 */
	public void setDossierNo(String dossierNo);

	/**
	 * Returns the modify date of this vr inspection standard.
	 *
	 * @return the modify date of this vr inspection standard
	 */
	public Date getModifyDate();

	/**
	 * Sets the modify date of this vr inspection standard.
	 *
	 * @param modifyDate the modify date of this vr inspection standard
	 */
	public void setModifyDate(Date modifyDate);

	/**
	 * Returns the sync date of this vr inspection standard.
	 *
	 * @return the sync date of this vr inspection standard
	 */
	public Date getSyncDate();

	/**
	 * Sets the sync date of this vr inspection standard.
	 *
	 * @param syncDate the sync date of this vr inspection standard
	 */
	public void setSyncDate(Date syncDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(VRInspectionStandard vrInspectionStandard);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRInspectionStandard> toCacheModel();

	@Override
	public VRInspectionStandard toEscapedModel();

	@Override
	public VRInspectionStandard toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}