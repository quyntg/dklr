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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the VRProductLine service. Represents a row in the &quot;vr_productline&quot; database table, with each column mapped to a property of this class.
 *
 * @author LamTV
 * @see VRProductLineModel
 * @see com.fds.vr.business.model.impl.VRProductLineImpl
 * @see com.fds.vr.business.model.impl.VRProductLineModelImpl
 * @generated
 */
@ImplementationClassName("com.fds.vr.business.model.impl.VRProductLineImpl")
@ProviderType
public interface VRProductLine extends VRProductLineModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.fds.vr.business.model.impl.VRProductLineImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<VRProductLine, Long> ID_ACCESSOR = new Accessor<VRProductLine, Long>() {
			@Override
			public Long get(VRProductLine vrProductLine) {
				return vrProductLine.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<VRProductLine> getTypeClass() {
				return VRProductLine.class;
			}
		};
}