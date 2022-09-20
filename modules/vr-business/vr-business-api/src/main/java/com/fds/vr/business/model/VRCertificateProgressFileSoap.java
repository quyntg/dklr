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
public class VRCertificateProgressFileSoap implements Serializable {
	public static VRCertificateProgressFileSoap toSoapModel(
		VRCertificateProgressFile model) {
		VRCertificateProgressFileSoap soapModel = new VRCertificateProgressFileSoap();

		soapModel.setId(model.getId());
		soapModel.setCertificateProgressID(model.getCertificateProgressID());
		soapModel.setAttachedFileID(model.getAttachedFileID());

		return soapModel;
	}

	public static VRCertificateProgressFileSoap[] toSoapModels(
		VRCertificateProgressFile[] models) {
		VRCertificateProgressFileSoap[] soapModels = new VRCertificateProgressFileSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRCertificateProgressFileSoap[][] toSoapModels(
		VRCertificateProgressFile[][] models) {
		VRCertificateProgressFileSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRCertificateProgressFileSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRCertificateProgressFileSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRCertificateProgressFileSoap[] toSoapModels(
		List<VRCertificateProgressFile> models) {
		List<VRCertificateProgressFileSoap> soapModels = new ArrayList<VRCertificateProgressFileSoap>(models.size());

		for (VRCertificateProgressFile model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRCertificateProgressFileSoap[soapModels.size()]);
	}

	public VRCertificateProgressFileSoap() {
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

	public long getCertificateProgressID() {
		return _certificateProgressID;
	}

	public void setCertificateProgressID(long certificateProgressID) {
		_certificateProgressID = certificateProgressID;
	}

	public long getAttachedFileID() {
		return _attachedFileID;
	}

	public void setAttachedFileID(long attachedFileID) {
		_attachedFileID = attachedFileID;
	}

	private long _id;
	private long _certificateProgressID;
	private long _attachedFileID;
}