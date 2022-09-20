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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VRCorporationInspector}.
 * </p>
 *
 * @author LamTV
 * @see VRCorporationInspector
 * @generated
 */
@ProviderType
public class VRCorporationInspectorWrapper implements VRCorporationInspector,
	ModelWrapper<VRCorporationInspector> {
	public VRCorporationInspectorWrapper(
		VRCorporationInspector vrCorporationInspector) {
		_vrCorporationInspector = vrCorporationInspector;
	}

	@Override
	public Class<?> getModelClass() {
		return VRCorporationInspector.class;
	}

	@Override
	public String getModelClassName() {
		return VRCorporationInspector.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("corporationId", getCorporationId());
		attributes.put("inspectorid", getInspectorid());
		attributes.put("inspectorName", getInspectorName());
		attributes.put("inspectorPhone", getInspectorPhone());
		attributes.put("inspectorEmail", getInspectorEmail());
		attributes.put("contactcode", getContactcode());
		attributes.put("regularTthc", getRegularTthc());
		attributes.put("searchVehicle", getSearchVehicle());
		attributes.put("teamId", getTeamId());
		attributes.put("markupTeamLeader", getMarkupTeamLeader());
		attributes.put("markUpBoss", getMarkUpBoss());
		attributes.put("executedictionary", getExecutedictionary());
		attributes.put("place", getPlace());
		attributes.put("title", getTitle());
		attributes.put("filechukyId", getFilechukyId());

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

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		Long inspectorid = (Long)attributes.get("inspectorid");

		if (inspectorid != null) {
			setInspectorid(inspectorid);
		}

		String inspectorName = (String)attributes.get("inspectorName");

		if (inspectorName != null) {
			setInspectorName(inspectorName);
		}

		String inspectorPhone = (String)attributes.get("inspectorPhone");

		if (inspectorPhone != null) {
			setInspectorPhone(inspectorPhone);
		}

		String inspectorEmail = (String)attributes.get("inspectorEmail");

		if (inspectorEmail != null) {
			setInspectorEmail(inspectorEmail);
		}

		String contactcode = (String)attributes.get("contactcode");

		if (contactcode != null) {
			setContactcode(contactcode);
		}

		Long regularTthc = (Long)attributes.get("regularTthc");

		if (regularTthc != null) {
			setRegularTthc(regularTthc);
		}

		Integer searchVehicle = (Integer)attributes.get("searchVehicle");

		if (searchVehicle != null) {
			setSearchVehicle(searchVehicle);
		}

		Long teamId = (Long)attributes.get("teamId");

		if (teamId != null) {
			setTeamId(teamId);
		}

		Integer markupTeamLeader = (Integer)attributes.get("markupTeamLeader");

		if (markupTeamLeader != null) {
			setMarkupTeamLeader(markupTeamLeader);
		}

		Integer markUpBoss = (Integer)attributes.get("markUpBoss");

		if (markUpBoss != null) {
			setMarkUpBoss(markUpBoss);
		}

		String executedictionary = (String)attributes.get("executedictionary");

		if (executedictionary != null) {
			setExecutedictionary(executedictionary);
		}

		String place = (String)attributes.get("place");

		if (place != null) {
			setPlace(place);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		Long filechukyId = (Long)attributes.get("filechukyId");

		if (filechukyId != null) {
			setFilechukyId(filechukyId);
		}
	}

	@Override
	public VRCorporationInspector toEscapedModel() {
		return new VRCorporationInspectorWrapper(_vrCorporationInspector.toEscapedModel());
	}

	@Override
	public VRCorporationInspector toUnescapedModel() {
		return new VRCorporationInspectorWrapper(_vrCorporationInspector.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrCorporationInspector.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrCorporationInspector.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrCorporationInspector.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrCorporationInspector.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRCorporationInspector> toCacheModel() {
		return _vrCorporationInspector.toCacheModel();
	}

	@Override
	public int compareTo(VRCorporationInspector vrCorporationInspector) {
		return _vrCorporationInspector.compareTo(vrCorporationInspector);
	}

	/**
	* Returns the mark up boss of this vr corporation inspector.
	*
	* @return the mark up boss of this vr corporation inspector
	*/
	@Override
	public int getMarkUpBoss() {
		return _vrCorporationInspector.getMarkUpBoss();
	}

	/**
	* Returns the markup team leader of this vr corporation inspector.
	*
	* @return the markup team leader of this vr corporation inspector
	*/
	@Override
	public int getMarkupTeamLeader() {
		return _vrCorporationInspector.getMarkupTeamLeader();
	}

	/**
	* Returns the search vehicle of this vr corporation inspector.
	*
	* @return the search vehicle of this vr corporation inspector
	*/
	@Override
	public int getSearchVehicle() {
		return _vrCorporationInspector.getSearchVehicle();
	}

	@Override
	public int hashCode() {
		return _vrCorporationInspector.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrCorporationInspector.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRCorporationInspectorWrapper((VRCorporationInspector)_vrCorporationInspector.clone());
	}

	/**
	* Returns the contactcode of this vr corporation inspector.
	*
	* @return the contactcode of this vr corporation inspector
	*/
	@Override
	public java.lang.String getContactcode() {
		return _vrCorporationInspector.getContactcode();
	}

	/**
	* Returns the corporation ID of this vr corporation inspector.
	*
	* @return the corporation ID of this vr corporation inspector
	*/
	@Override
	public java.lang.String getCorporationId() {
		return _vrCorporationInspector.getCorporationId();
	}

	/**
	* Returns the executedictionary of this vr corporation inspector.
	*
	* @return the executedictionary of this vr corporation inspector
	*/
	@Override
	public java.lang.String getExecutedictionary() {
		return _vrCorporationInspector.getExecutedictionary();
	}

	/**
	* Returns the inspector email of this vr corporation inspector.
	*
	* @return the inspector email of this vr corporation inspector
	*/
	@Override
	public java.lang.String getInspectorEmail() {
		return _vrCorporationInspector.getInspectorEmail();
	}

	/**
	* Returns the inspector name of this vr corporation inspector.
	*
	* @return the inspector name of this vr corporation inspector
	*/
	@Override
	public java.lang.String getInspectorName() {
		return _vrCorporationInspector.getInspectorName();
	}

	/**
	* Returns the inspector phone of this vr corporation inspector.
	*
	* @return the inspector phone of this vr corporation inspector
	*/
	@Override
	public java.lang.String getInspectorPhone() {
		return _vrCorporationInspector.getInspectorPhone();
	}

	/**
	* Returns the place of this vr corporation inspector.
	*
	* @return the place of this vr corporation inspector
	*/
	@Override
	public java.lang.String getPlace() {
		return _vrCorporationInspector.getPlace();
	}

	/**
	* Returns the title of this vr corporation inspector.
	*
	* @return the title of this vr corporation inspector
	*/
	@Override
	public java.lang.String getTitle() {
		return _vrCorporationInspector.getTitle();
	}

	@Override
	public java.lang.String toString() {
		return _vrCorporationInspector.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrCorporationInspector.toXmlString();
	}

	/**
	* Returns the filechuky ID of this vr corporation inspector.
	*
	* @return the filechuky ID of this vr corporation inspector
	*/
	@Override
	public long getFilechukyId() {
		return _vrCorporationInspector.getFilechukyId();
	}

	/**
	* Returns the ID of this vr corporation inspector.
	*
	* @return the ID of this vr corporation inspector
	*/
	@Override
	public long getId() {
		return _vrCorporationInspector.getId();
	}

	/**
	* Returns the inspectorid of this vr corporation inspector.
	*
	* @return the inspectorid of this vr corporation inspector
	*/
	@Override
	public long getInspectorid() {
		return _vrCorporationInspector.getInspectorid();
	}

	/**
	* Returns the mt core of this vr corporation inspector.
	*
	* @return the mt core of this vr corporation inspector
	*/
	@Override
	public long getMtCore() {
		return _vrCorporationInspector.getMtCore();
	}

	/**
	* Returns the primary key of this vr corporation inspector.
	*
	* @return the primary key of this vr corporation inspector
	*/
	@Override
	public long getPrimaryKey() {
		return _vrCorporationInspector.getPrimaryKey();
	}

	/**
	* Returns the regular tthc of this vr corporation inspector.
	*
	* @return the regular tthc of this vr corporation inspector
	*/
	@Override
	public long getRegularTthc() {
		return _vrCorporationInspector.getRegularTthc();
	}

	/**
	* Returns the team ID of this vr corporation inspector.
	*
	* @return the team ID of this vr corporation inspector
	*/
	@Override
	public long getTeamId() {
		return _vrCorporationInspector.getTeamId();
	}

	@Override
	public void persist() {
		_vrCorporationInspector.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrCorporationInspector.setCachedModel(cachedModel);
	}

	/**
	* Sets the contactcode of this vr corporation inspector.
	*
	* @param contactcode the contactcode of this vr corporation inspector
	*/
	@Override
	public void setContactcode(java.lang.String contactcode) {
		_vrCorporationInspector.setContactcode(contactcode);
	}

	/**
	* Sets the corporation ID of this vr corporation inspector.
	*
	* @param corporationId the corporation ID of this vr corporation inspector
	*/
	@Override
	public void setCorporationId(java.lang.String corporationId) {
		_vrCorporationInspector.setCorporationId(corporationId);
	}

	/**
	* Sets the executedictionary of this vr corporation inspector.
	*
	* @param executedictionary the executedictionary of this vr corporation inspector
	*/
	@Override
	public void setExecutedictionary(java.lang.String executedictionary) {
		_vrCorporationInspector.setExecutedictionary(executedictionary);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrCorporationInspector.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrCorporationInspector.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrCorporationInspector.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the filechuky ID of this vr corporation inspector.
	*
	* @param filechukyId the filechuky ID of this vr corporation inspector
	*/
	@Override
	public void setFilechukyId(long filechukyId) {
		_vrCorporationInspector.setFilechukyId(filechukyId);
	}

	/**
	* Sets the ID of this vr corporation inspector.
	*
	* @param id the ID of this vr corporation inspector
	*/
	@Override
	public void setId(long id) {
		_vrCorporationInspector.setId(id);
	}

	/**
	* Sets the inspector email of this vr corporation inspector.
	*
	* @param inspectorEmail the inspector email of this vr corporation inspector
	*/
	@Override
	public void setInspectorEmail(java.lang.String inspectorEmail) {
		_vrCorporationInspector.setInspectorEmail(inspectorEmail);
	}

	/**
	* Sets the inspector name of this vr corporation inspector.
	*
	* @param inspectorName the inspector name of this vr corporation inspector
	*/
	@Override
	public void setInspectorName(java.lang.String inspectorName) {
		_vrCorporationInspector.setInspectorName(inspectorName);
	}

	/**
	* Sets the inspector phone of this vr corporation inspector.
	*
	* @param inspectorPhone the inspector phone of this vr corporation inspector
	*/
	@Override
	public void setInspectorPhone(java.lang.String inspectorPhone) {
		_vrCorporationInspector.setInspectorPhone(inspectorPhone);
	}

	/**
	* Sets the inspectorid of this vr corporation inspector.
	*
	* @param inspectorid the inspectorid of this vr corporation inspector
	*/
	@Override
	public void setInspectorid(long inspectorid) {
		_vrCorporationInspector.setInspectorid(inspectorid);
	}

	/**
	* Sets the mark up boss of this vr corporation inspector.
	*
	* @param markUpBoss the mark up boss of this vr corporation inspector
	*/
	@Override
	public void setMarkUpBoss(int markUpBoss) {
		_vrCorporationInspector.setMarkUpBoss(markUpBoss);
	}

	/**
	* Sets the markup team leader of this vr corporation inspector.
	*
	* @param markupTeamLeader the markup team leader of this vr corporation inspector
	*/
	@Override
	public void setMarkupTeamLeader(int markupTeamLeader) {
		_vrCorporationInspector.setMarkupTeamLeader(markupTeamLeader);
	}

	/**
	* Sets the mt core of this vr corporation inspector.
	*
	* @param mtCore the mt core of this vr corporation inspector
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrCorporationInspector.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrCorporationInspector.setNew(n);
	}

	/**
	* Sets the place of this vr corporation inspector.
	*
	* @param place the place of this vr corporation inspector
	*/
	@Override
	public void setPlace(java.lang.String place) {
		_vrCorporationInspector.setPlace(place);
	}

	/**
	* Sets the primary key of this vr corporation inspector.
	*
	* @param primaryKey the primary key of this vr corporation inspector
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrCorporationInspector.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrCorporationInspector.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the regular tthc of this vr corporation inspector.
	*
	* @param regularTthc the regular tthc of this vr corporation inspector
	*/
	@Override
	public void setRegularTthc(long regularTthc) {
		_vrCorporationInspector.setRegularTthc(regularTthc);
	}

	/**
	* Sets the search vehicle of this vr corporation inspector.
	*
	* @param searchVehicle the search vehicle of this vr corporation inspector
	*/
	@Override
	public void setSearchVehicle(int searchVehicle) {
		_vrCorporationInspector.setSearchVehicle(searchVehicle);
	}

	/**
	* Sets the team ID of this vr corporation inspector.
	*
	* @param teamId the team ID of this vr corporation inspector
	*/
	@Override
	public void setTeamId(long teamId) {
		_vrCorporationInspector.setTeamId(teamId);
	}

	/**
	* Sets the title of this vr corporation inspector.
	*
	* @param title the title of this vr corporation inspector
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_vrCorporationInspector.setTitle(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCorporationInspectorWrapper)) {
			return false;
		}

		VRCorporationInspectorWrapper vrCorporationInspectorWrapper = (VRCorporationInspectorWrapper)obj;

		if (Objects.equals(_vrCorporationInspector,
					vrCorporationInspectorWrapper._vrCorporationInspector)) {
			return true;
		}

		return false;
	}

	@Override
	public VRCorporationInspector getWrappedModel() {
		return _vrCorporationInspector;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrCorporationInspector.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrCorporationInspector.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrCorporationInspector.resetOriginalValues();
	}

	private final VRCorporationInspector _vrCorporationInspector;
}