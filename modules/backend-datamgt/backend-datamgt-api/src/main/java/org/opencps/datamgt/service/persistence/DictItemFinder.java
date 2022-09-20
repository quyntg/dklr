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

package org.opencps.datamgt.service.persistence;

import aQute.bnd.annotation.ProviderType;

/**
 * @author khoavu
 * @generated
 */
@ProviderType
public interface DictItemFinder {
	public java.util.List<org.opencps.datamgt.model.DictItem> findByCollection_Level_OrderBy(
		long groupId, java.lang.String collectionCode, java.lang.String level,
		java.lang.String OrderBy);

	public java.util.List<org.opencps.datamgt.model.DictItem> findByCollection_Parent_Level_OrderBy(
		long groupId, java.lang.String collectionCode,
		java.lang.String parentItemCode, java.lang.String level,
		java.lang.String OrderBy);

	public java.util.List<org.opencps.datamgt.model.DictItem> findByCollection_Group_Level_OrderBy(
		long groupId, java.lang.String collectionCode,
		java.lang.String groupCode, java.lang.String level,
		java.lang.String OrderBy);

	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public long countData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException;
}