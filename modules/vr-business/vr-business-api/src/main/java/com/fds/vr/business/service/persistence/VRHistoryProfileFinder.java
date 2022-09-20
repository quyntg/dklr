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

package com.fds.vr.business.service.persistence;

import aQute.bnd.annotation.ProviderType;

/**
 * @author LamTV
 * @generated
 */
@ProviderType
public interface VRHistoryProfileFinder {
	public java.util.List<com.fds.vr.business.model.VRHistoryProfile> findVRHitoryProfiles(
		java.lang.String applicantCode, java.lang.String productionPlantCode,
		long dossierId, java.lang.String dossierIdCTN,
		java.lang.String dossierNo, java.lang.String contentType,
		java.lang.String contentFileTemplate, int start, int end);
}