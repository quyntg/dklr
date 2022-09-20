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

package com.fds.vr.filterconfig.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the DMDataItem service. Represents a row in the &quot;dm_dataitem&quot; database table, with each column mapped to a property of this class.
 *
 * @author NhanHoang
 * @see DMDataItemModel
 * @see com.fds.vr.filterconfig.model.impl.DMDataItemImpl
 * @see com.fds.vr.filterconfig.model.impl.DMDataItemModelImpl
 * @generated
 */
@ImplementationClassName("com.fds.vr.filterconfig.model.impl.DMDataItemImpl")
@ProviderType
public interface DMDataItem extends DMDataItemModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.fds.vr.filterconfig.model.impl.DMDataItemImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<DMDataItem, Long> ID_ACCESSOR = new Accessor<DMDataItem, Long>() {
			@Override
			public Long get(DMDataItem dmDataItem) {
				return dmDataItem.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<DMDataItem> getTypeClass() {
				return DMDataItem.class;
			}
		};
}