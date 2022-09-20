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
 * The extended model interface for the VRTechnicalSpec_XMYPart3 service. Represents a row in the &quot;vr_technicalspec_xmy&quot; database table, with each column mapped to a property of this class.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XMYPart3Model
 * @see com.fds.vr.business.model.impl.VRTechnicalSpec_XMYPart3Impl
 * @see com.fds.vr.business.model.impl.VRTechnicalSpec_XMYPart3ModelImpl
 * @generated
 */
@ImplementationClassName("com.fds.vr.business.model.impl.VRTechnicalSpec_XMYPart3Impl")
@ProviderType
public interface VRTechnicalSpec_XMYPart3 extends VRTechnicalSpec_XMYPart3Model,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XMYPart3Impl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<VRTechnicalSpec_XMYPart3, Long> ID_ACCESSOR = new Accessor<VRTechnicalSpec_XMYPart3, Long>() {
			@Override
			public Long get(VRTechnicalSpec_XMYPart3 vrTechnicalSpec_XMYPart3) {
				return vrTechnicalSpec_XMYPart3.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<VRTechnicalSpec_XMYPart3> getTypeClass() {
				return VRTechnicalSpec_XMYPart3.class;
			}
		};
}