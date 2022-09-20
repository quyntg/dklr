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
 * The extended model interface for the VRTechnicalSpec_XCGPart5 service. Represents a row in the &quot;vr_technicalspec_xcg&quot; database table, with each column mapped to a property of this class.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPart5Model
 * @see com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart5Impl
 * @see com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart5ModelImpl
 * @generated
 */
@ImplementationClassName("com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart5Impl")
@ProviderType
public interface VRTechnicalSpec_XCGPart5 extends VRTechnicalSpec_XCGPart5Model,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart5Impl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<VRTechnicalSpec_XCGPart5, Long> ID_ACCESSOR = new Accessor<VRTechnicalSpec_XCGPart5, Long>() {
			@Override
			public Long get(VRTechnicalSpec_XCGPart5 vrTechnicalSpec_XCGPart5) {
				return vrTechnicalSpec_XCGPart5.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<VRTechnicalSpec_XCGPart5> getTypeClass() {
				return VRTechnicalSpec_XCGPart5.class;
			}
		};
}