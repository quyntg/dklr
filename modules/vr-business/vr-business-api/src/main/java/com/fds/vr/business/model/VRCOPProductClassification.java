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
 * The extended model interface for the VRCOPProductClassification service. Represents a row in the &quot;vr_copproductclassification&quot; database table, with each column mapped to a property of this class.
 *
 * @author LamTV
 * @see VRCOPProductClassificationModel
 * @see com.fds.vr.business.model.impl.VRCOPProductClassificationImpl
 * @see com.fds.vr.business.model.impl.VRCOPProductClassificationModelImpl
 * @generated
 */
@ImplementationClassName("com.fds.vr.business.model.impl.VRCOPProductClassificationImpl")
@ProviderType
public interface VRCOPProductClassification
	extends VRCOPProductClassificationModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.fds.vr.business.model.impl.VRCOPProductClassificationImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<VRCOPProductClassification, Long> ID_ACCESSOR = new Accessor<VRCOPProductClassification, Long>() {
			@Override
			public Long get(
				VRCOPProductClassification vrcopProductClassification) {
				return vrcopProductClassification.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<VRCOPProductClassification> getTypeClass() {
				return VRCOPProductClassification.class;
			}
		};
}