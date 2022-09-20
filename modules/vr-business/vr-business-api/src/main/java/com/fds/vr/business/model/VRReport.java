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
 * The extended model interface for the VRReport service. Represents a row in the &quot;vr_report&quot; database table, with each column mapped to a property of this class.
 *
 * @author LamTV
 * @see VRReportModel
 * @see com.fds.vr.business.model.impl.VRReportImpl
 * @see com.fds.vr.business.model.impl.VRReportModelImpl
 * @generated
 */
@ImplementationClassName("com.fds.vr.business.model.impl.VRReportImpl")
@ProviderType
public interface VRReport extends VRReportModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.fds.vr.business.model.impl.VRReportImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<VRReport, Long> ID_ACCESSOR = new Accessor<VRReport, Long>() {
			@Override
			public Long get(VRReport vrReport) {
				return vrReport.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<VRReport> getTypeClass() {
				return VRReport.class;
			}
		};
}