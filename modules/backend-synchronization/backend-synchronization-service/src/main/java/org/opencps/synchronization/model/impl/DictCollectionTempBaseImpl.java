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

package org.opencps.synchronization.model.impl;

import aQute.bnd.annotation.ProviderType;

import org.opencps.synchronization.model.DictCollectionTemp;
import org.opencps.synchronization.service.DictCollectionTempLocalServiceUtil;

/**
 * The extended model base implementation for the DictCollectionTemp service. Represents a row in the &quot;opencps_dictcollection_temp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DictCollectionTempImpl}.
 * </p>
 *
 * @author trungdk
 * @see DictCollectionTempImpl
 * @see DictCollectionTemp
 * @generated
 */
@ProviderType
public abstract class DictCollectionTempBaseImpl
	extends DictCollectionTempModelImpl implements DictCollectionTemp {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dict collection temp model instance should use the {@link DictCollectionTemp} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			DictCollectionTempLocalServiceUtil.addDictCollectionTemp(this);
		}
		else {
			DictCollectionTempLocalServiceUtil.updateDictCollectionTemp(this);
		}
	}
}