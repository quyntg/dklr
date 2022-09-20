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

package org.opencps.dossiermgt.model.impl;

import aQute.bnd.annotation.ProviderType;

import org.opencps.dossiermgt.model.RegistrationTemplates;
import org.opencps.dossiermgt.service.RegistrationTemplatesLocalServiceUtil;

/**
 * The extended model base implementation for the RegistrationTemplates service. Represents a row in the &quot;opencps_registrationtemplate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RegistrationTemplatesImpl}.
 * </p>
 *
 * @author huymq
 * @see RegistrationTemplatesImpl
 * @see RegistrationTemplates
 * @generated
 */
@ProviderType
public abstract class RegistrationTemplatesBaseImpl
	extends RegistrationTemplatesModelImpl implements RegistrationTemplates {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a registration templates model instance should use the {@link RegistrationTemplates} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			RegistrationTemplatesLocalServiceUtil.addRegistrationTemplates(this);
		}
		else {
			RegistrationTemplatesLocalServiceUtil.updateRegistrationTemplates(this);
		}
	}
}