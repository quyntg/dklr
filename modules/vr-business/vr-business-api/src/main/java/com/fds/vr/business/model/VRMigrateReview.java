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
 * The extended model interface for the VRMigrateReview service. Represents a row in the &quot;vr_migrate_review&quot; database table, with each column mapped to a property of this class.
 *
 * @author LamTV
 * @see VRMigrateReviewModel
 * @see com.fds.vr.business.model.impl.VRMigrateReviewImpl
 * @see com.fds.vr.business.model.impl.VRMigrateReviewModelImpl
 * @generated
 */
@ImplementationClassName("com.fds.vr.business.model.impl.VRMigrateReviewImpl")
@ProviderType
public interface VRMigrateReview extends VRMigrateReviewModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.fds.vr.business.model.impl.VRMigrateReviewImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<VRMigrateReview, Long> ID_ACCESSOR = new Accessor<VRMigrateReview, Long>() {
			@Override
			public Long get(VRMigrateReview vrMigrateReview) {
				return vrMigrateReview.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<VRMigrateReview> getTypeClass() {
				return VRMigrateReview.class;
			}
		};
}