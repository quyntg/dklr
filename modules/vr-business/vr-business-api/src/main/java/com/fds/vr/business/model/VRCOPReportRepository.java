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
 * The extended model interface for the VRCOPReportRepository service. Represents a row in the &quot;vr_copreportrepository&quot; database table, with each column mapped to a property of this class.
 *
 * @author LamTV
 * @see VRCOPReportRepositoryModel
 * @see com.fds.vr.business.model.impl.VRCOPReportRepositoryImpl
 * @see com.fds.vr.business.model.impl.VRCOPReportRepositoryModelImpl
 * @generated
 */
@ImplementationClassName("com.fds.vr.business.model.impl.VRCOPReportRepositoryImpl")
@ProviderType
public interface VRCOPReportRepository extends VRCOPReportRepositoryModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.fds.vr.business.model.impl.VRCOPReportRepositoryImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<VRCOPReportRepository, Long> ID_ACCESSOR = new Accessor<VRCOPReportRepository, Long>() {
			@Override
			public Long get(VRCOPReportRepository vrcopReportRepository) {
				return vrcopReportRepository.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<VRCOPReportRepository> getTypeClass() {
				return VRCOPReportRepository.class;
			}
		};
}