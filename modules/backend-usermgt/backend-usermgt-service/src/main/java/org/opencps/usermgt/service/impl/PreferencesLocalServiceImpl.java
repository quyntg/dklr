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

package org.opencps.usermgt.service.impl;

import java.util.Date;

import org.opencps.usermgt.model.Preferences;
import org.opencps.usermgt.service.base.PreferencesLocalServiceBaseImpl;

import com.liferay.asset.kernel.exception.DuplicateCategoryException;
import com.liferay.portal.kernel.exception.NoSuchUserException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringPool;

import aQute.bnd.annotation.ProviderType;
import backend.auth.api.BackendAuthImpl;
import backend.auth.api.exception.NotFoundException;
import backend.auth.api.exception.UnauthenticationException;
import backend.auth.api.exception.UnauthorizationException;
import backend.auth.api.keys.ActionKeys;
import backend.auth.api.keys.ModelNameKeys;

/**
 * The implementation of the preferences local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link org.opencps.usermgt.service.PreferencesLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Binhth
 * @see PreferencesLocalServiceBaseImpl
 * @see org.opencps.usermgt.service.PreferencesLocalServiceUtil
 */
@ProviderType
public class PreferencesLocalServiceImpl extends PreferencesLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * org.opencps.usermgt.service.PreferencesLocalServiceUtil} to
	 * access the preferences local service.
	 */
	public Preferences addPreferences(long userId, long groupId, String preferencesData, ServiceContext serviceContext)
			throws DuplicateCategoryException, UnauthenticationException, UnauthorizationException,
			NoSuchUserException {

		// authen
		BackendAuthImpl authImpl = new BackendAuthImpl();

		boolean isAuth = authImpl.isAuth(serviceContext, StringPool.BLANK, StringPool.BLANK);

		if (!isAuth) {
			throw new UnauthenticationException();
		}

		boolean hasPermission = authImpl.hasResource(serviceContext, ModelNameKeys.WORKINGUNIT_MGT_CENTER,
				ActionKeys.EDIT_DATA);

		if (!hasPermission) {
			throw new UnauthorizationException();
		}

		Date now = new Date();

		User user = userPersistence.findByPrimaryKey(userId);

		long preferencesId = counterLocalService.increment(Preferences.class.getName());

		Preferences preferences = preferencesPersistence.create(preferencesId);

		// Group instance
		preferences.setGroupId(groupId);

		// Audit fields
		preferences.setUuid(serviceContext.getUuid());
		preferences.setCompanyId(user.getCompanyId());
		preferences.setUserId(user.getUserId());
		preferences.setUserName(user.getFullName());
		preferences.setCreateDate(serviceContext.getCreateDate(now));
		preferences.setModifiedDate(serviceContext.getCreateDate(now));

		// Other fields
		preferences.setPreferences(preferencesData);

		preferences.setExpandoBridgeAttributes(serviceContext);

		preferencesPersistence.update(preferences);

		return preferences;
	}

	public Preferences deletePreferences(long preferencesId, ServiceContext serviceContext)
			throws UnauthenticationException, UnauthorizationException, NotFoundException {

		// authen
		BackendAuthImpl authImpl = new BackendAuthImpl();

		boolean isAuth = authImpl.isAuth(serviceContext, StringPool.BLANK, StringPool.BLANK);

		if (!isAuth) {
			throw new UnauthenticationException();
		}

		boolean hasPermission = authImpl.hasResource(serviceContext, ModelNameKeys.WORKINGUNIT_MGT_CENTER,
				ActionKeys.EDIT_DATA);

		if (!hasPermission) {
			throw new UnauthorizationException();
		}

		Preferences preferences;

		try {

			preferences = preferencesPersistence.remove(preferencesId);

		} catch (Exception e) {
			throw new NotFoundException();
		}

		return preferences;

	}

	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Preferences updatePreferences(long userId, long preferencesId, String preferencesData,
			ServiceContext serviceContext) throws DuplicateCategoryException, UnauthenticationException,
			UnauthorizationException, NoSuchUserException, NotFoundException {
		// authen
		BackendAuthImpl authImpl = new BackendAuthImpl();

		boolean isAuth = authImpl.isAuth(serviceContext, StringPool.BLANK, StringPool.BLANK);

		if (!isAuth) {
			throw new UnauthenticationException();
		}

		boolean hasPermission = authImpl.hasResource(serviceContext, ModelNameKeys.WORKINGUNIT_MGT_CENTER,
				ActionKeys.EDIT_DATA);

		if (!hasPermission) {
			throw new UnauthorizationException();
		}

		Date now = new Date();

		User user = userPersistence.findByPrimaryKey(userId);

		Preferences preferences = preferencesPersistence.fetchByPrimaryKey(preferencesId);

		// Audit fields
		preferences.setUserId(user.getUserId());
		preferences.setUserName(user.getFullName());
		preferences.setModifiedDate(serviceContext.getCreateDate(now));

		// Other fields
		preferences.setPreferences(preferencesData);

		preferences.setExpandoBridgeAttributes(serviceContext);

		preferencesPersistence.update(preferences);

		return preferences;
	}
	
	public Preferences fetchByF_userId(long groupId, long userId) {
		return preferencesPersistence.fetchByF_userId(groupId, userId);
	}
}