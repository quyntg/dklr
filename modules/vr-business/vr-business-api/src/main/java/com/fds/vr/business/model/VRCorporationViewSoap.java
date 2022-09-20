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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LamTV
 * @generated
 */
@ProviderType
public class VRCorporationViewSoap implements Serializable {
	public static VRCorporationViewSoap toSoapModel(VRCorporationView model) {
		VRCorporationViewSoap soapModel = new VRCorporationViewSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setCorporationName(model.getCorporationName());
		soapModel.setInspectorId(model.getInspectorId());
		soapModel.setIsLeader(model.getIsLeader());

		return soapModel;
	}

	public static VRCorporationViewSoap[] toSoapModels(
		VRCorporationView[] models) {
		VRCorporationViewSoap[] soapModels = new VRCorporationViewSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRCorporationViewSoap[][] toSoapModels(
		VRCorporationView[][] models) {
		VRCorporationViewSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRCorporationViewSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRCorporationViewSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRCorporationViewSoap[] toSoapModels(
		List<VRCorporationView> models) {
		List<VRCorporationViewSoap> soapModels = new ArrayList<VRCorporationViewSoap>(models.size());

		for (VRCorporationView model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRCorporationViewSoap[soapModels.size()]);
	}

	public VRCorporationViewSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getMtCore() {
		return _mtCore;
	}

	public void setMtCore(long mtCore) {
		_mtCore = mtCore;
	}

	public String getCorporationId() {
		return _corporationId;
	}

	public void setCorporationId(String corporationId) {
		_corporationId = corporationId;
	}

	public String getCorporationName() {
		return _corporationName;
	}

	public void setCorporationName(String corporationName) {
		_corporationName = corporationName;
	}

	public long getInspectorId() {
		return _inspectorId;
	}

	public void setInspectorId(long inspectorId) {
		_inspectorId = inspectorId;
	}

	public int getIsLeader() {
		return _isLeader;
	}

	public void setIsLeader(int isLeader) {
		_isLeader = isLeader;
	}

	private long _id;
	private long _mtCore;
	private String _corporationId;
	private String _corporationName;
	private long _inspectorId;
	private int _isLeader;
}