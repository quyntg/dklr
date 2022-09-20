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
public class VRCorporationInspectorSoap implements Serializable {
	public static VRCorporationInspectorSoap toSoapModel(
		VRCorporationInspector model) {
		VRCorporationInspectorSoap soapModel = new VRCorporationInspectorSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setInspectorid(model.getInspectorid());
		soapModel.setInspectorName(model.getInspectorName());
		soapModel.setInspectorPhone(model.getInspectorPhone());
		soapModel.setInspectorEmail(model.getInspectorEmail());
		soapModel.setContactcode(model.getContactcode());
		soapModel.setRegularTthc(model.getRegularTthc());
		soapModel.setSearchVehicle(model.getSearchVehicle());
		soapModel.setTeamId(model.getTeamId());
		soapModel.setMarkupTeamLeader(model.getMarkupTeamLeader());
		soapModel.setMarkUpBoss(model.getMarkUpBoss());
		soapModel.setExecutedictionary(model.getExecutedictionary());
		soapModel.setPlace(model.getPlace());
		soapModel.setTitle(model.getTitle());
		soapModel.setFilechukyId(model.getFilechukyId());

		return soapModel;
	}

	public static VRCorporationInspectorSoap[] toSoapModels(
		VRCorporationInspector[] models) {
		VRCorporationInspectorSoap[] soapModels = new VRCorporationInspectorSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRCorporationInspectorSoap[][] toSoapModels(
		VRCorporationInspector[][] models) {
		VRCorporationInspectorSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRCorporationInspectorSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRCorporationInspectorSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRCorporationInspectorSoap[] toSoapModels(
		List<VRCorporationInspector> models) {
		List<VRCorporationInspectorSoap> soapModels = new ArrayList<VRCorporationInspectorSoap>(models.size());

		for (VRCorporationInspector model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRCorporationInspectorSoap[soapModels.size()]);
	}

	public VRCorporationInspectorSoap() {
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

	public long getInspectorid() {
		return _inspectorid;
	}

	public void setInspectorid(long inspectorid) {
		_inspectorid = inspectorid;
	}

	public String getInspectorName() {
		return _inspectorName;
	}

	public void setInspectorName(String inspectorName) {
		_inspectorName = inspectorName;
	}

	public String getInspectorPhone() {
		return _inspectorPhone;
	}

	public void setInspectorPhone(String inspectorPhone) {
		_inspectorPhone = inspectorPhone;
	}

	public String getInspectorEmail() {
		return _inspectorEmail;
	}

	public void setInspectorEmail(String inspectorEmail) {
		_inspectorEmail = inspectorEmail;
	}

	public String getContactcode() {
		return _contactcode;
	}

	public void setContactcode(String contactcode) {
		_contactcode = contactcode;
	}

	public long getRegularTthc() {
		return _regularTthc;
	}

	public void setRegularTthc(long regularTthc) {
		_regularTthc = regularTthc;
	}

	public int getSearchVehicle() {
		return _searchVehicle;
	}

	public void setSearchVehicle(int searchVehicle) {
		_searchVehicle = searchVehicle;
	}

	public long getTeamId() {
		return _teamId;
	}

	public void setTeamId(long teamId) {
		_teamId = teamId;
	}

	public int getMarkupTeamLeader() {
		return _markupTeamLeader;
	}

	public void setMarkupTeamLeader(int markupTeamLeader) {
		_markupTeamLeader = markupTeamLeader;
	}

	public int getMarkUpBoss() {
		return _markUpBoss;
	}

	public void setMarkUpBoss(int markUpBoss) {
		_markUpBoss = markUpBoss;
	}

	public String getExecutedictionary() {
		return _executedictionary;
	}

	public void setExecutedictionary(String executedictionary) {
		_executedictionary = executedictionary;
	}

	public String getPlace() {
		return _place;
	}

	public void setPlace(String place) {
		_place = place;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public long getFilechukyId() {
		return _filechukyId;
	}

	public void setFilechukyId(long filechukyId) {
		_filechukyId = filechukyId;
	}

	private long _id;
	private long _mtCore;
	private String _corporationId;
	private long _inspectorid;
	private String _inspectorName;
	private String _inspectorPhone;
	private String _inspectorEmail;
	private String _contactcode;
	private long _regularTthc;
	private int _searchVehicle;
	private long _teamId;
	private int _markupTeamLeader;
	private int _markUpBoss;
	private String _executedictionary;
	private String _place;
	private String _title;
	private long _filechukyId;
}