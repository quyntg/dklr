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

package com.fds.vr.business.service.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRMethodOfIssue;
import com.fds.vr.business.service.base.VRMethodOfIssueLocalServiceBaseImpl;

/**
 * The implementation of the vr method of issue local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRMethodOfIssueLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRMethodOfIssueLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRMethodOfIssueLocalServiceUtil
 */
@ProviderType
public class VRMethodOfIssueLocalServiceImpl extends VRMethodOfIssueLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRMethodOfIssueLocalServiceUtil} to access the vr
	 * method of issue local service.
	 */
	public VRMethodOfIssue fetchByCertifiedAssemblyTypeProductionPlantCodeVehicleClassApplicantProfileId(
			String certifiedAssemblyType, String productionPlantCode, String vehicleClass, long applicantProfileId) {
		return vrMethodOfIssuePersistence
				.fetchBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(certifiedAssemblyType,
						productionPlantCode, vehicleClass, applicantProfileId);
	}

	public VRMethodOfIssue fetchByCertifiedAssemblyTypeProductionPlantIdVehicleClassApplicantProfileId(
			String certifiedAssemblyType, long productionPlantId, String vehicleClass, long applicantProfileId) {
		return vrMethodOfIssuePersistence
				.fetchBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(certifiedAssemblyType,
						productionPlantId, vehicleClass, applicantProfileId);
	}

	public long countByCertifiedAssemblyTypeProductionPlantCodeVehicleClassApplicantProfileId(
			String certifiedAssemblyType, String productionPlantCode, String vehicleClass, long applicantProfileId) {
		return vrMethodOfIssuePersistence
				.countBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(certifiedAssemblyType,
						productionPlantCode, vehicleClass, applicantProfileId);
	}

	public long countByCertifiedAssemblyTypeProductionPlantIdVehicleClassApplicantProfileId(
			String certifiedAssemblyType, long productionPlantId, String vehicleClass, long applicantProfileId) {
		return vrMethodOfIssuePersistence
				.countBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(certifiedAssemblyType,
						productionPlantId, vehicleClass, applicantProfileId);
	}
}