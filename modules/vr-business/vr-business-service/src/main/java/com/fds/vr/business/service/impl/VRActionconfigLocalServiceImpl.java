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

import com.fds.vr.business.model.VRActionconfig;
import com.fds.vr.business.service.base.VRActionconfigLocalServiceBaseImpl;

/**
 * The implementation of the vr actionconfig local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRActionconfigLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRActionconfigLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRActionconfigLocalServiceUtil
 */
@ProviderType
public class VRActionconfigLocalServiceImpl
	extends VRActionconfigLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRActionconfigLocalServiceUtil} to access the vr actionconfig local service.
	 */
	
	public VRActionconfig fetchByA_P(String actionCode, String processNo) {
		return vrActionconfigPersistence.fetchByA_P(actionCode, processNo);
	}
}