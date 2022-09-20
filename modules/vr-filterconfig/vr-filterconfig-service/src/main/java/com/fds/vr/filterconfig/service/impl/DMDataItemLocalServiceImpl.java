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

package com.fds.vr.filterconfig.service.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.filterconfig.model.DMDataItem;
import com.fds.vr.filterconfig.service.base.DMDataItemLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.List;

/**
 * The implementation of the dm data item local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.filterconfig.service.DMDataItemLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author NhanHoang
 * @see DMDataItemLocalServiceBaseImpl
 * @see com.fds.vr.filterconfig.service.DMDataItemLocalServiceUtil
 */
@ProviderType
public class DMDataItemLocalServiceImpl extends DMDataItemLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.filterconfig.service.DMDataItemLocalServiceUtil} to access the dm data item local service.
	 */
	public List<DMDataItem> getDMData(long[] dataGroupIds,int[] levels){
		
		return dmDataItemPersistence.findByDGID_LVL(dataGroupIds, levels);
		
	}
}