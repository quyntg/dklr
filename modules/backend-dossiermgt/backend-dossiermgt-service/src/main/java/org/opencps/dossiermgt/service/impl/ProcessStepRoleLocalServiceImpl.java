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

package org.opencps.dossiermgt.service.impl;

import java.util.List;

import org.opencps.dossiermgt.model.ProcessStep;
import org.opencps.dossiermgt.model.ProcessStepRole;
import org.opencps.dossiermgt.service.base.ProcessStepRoleLocalServiceBaseImpl;
import org.opencps.dossiermgt.service.persistence.ProcessStepRolePK;

import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the process step role local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link org.opencps.dossiermgt.service.ProcessStepRoleLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author huymq
 * @see ProcessStepRoleLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.ProcessStepRoleLocalServiceUtil
 */
@ProviderType
public class ProcessStepRoleLocalServiceImpl extends ProcessStepRoleLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * org.opencps.dossiermgt.service.ProcessStepRoleLocalServiceUtil} to access
	 * the process step role local service.
	 */

	public List<ProcessStepRole> findByP_S_ID(long processStepId) {
		return processStepRolePersistence.findByP_S_ID(processStepId);
	}

	public List<ProcessStepRole> findByP_RID(long roleId) {
		return processStepRolePersistence.findByP_RID(roleId);
	}

	public ProcessStepRole updateProcessStepRole(long processStepId, long roleId, boolean moderator, String condition) {
		ProcessStepRolePK pk = new ProcessStepRolePK(processStepId, roleId);

		ProcessStepRole processStepRole = processStepRolePersistence.fetchByPrimaryKey(pk);

		if (Validator.isNull(processStepRole)) {
			processStepRole = processStepRolePersistence.create(pk);

			processStepRole.setModerator(moderator);
			processStepRole.setCondition(condition);
		} else {
			processStepRole = processStepRolePersistence.fetchByPrimaryKey(pk);
			
			processStepRole.setModerator(moderator);
			processStepRole.setCondition(condition);
		}

		processStepRolePersistence.update(processStepRole);

		// Update index

		Indexer<ProcessStep> indexer = IndexerRegistryUtil.nullSafeGetIndexer(ProcessStep.class);

		ProcessStep processStep = processStepPersistence.fetchByPrimaryKey(processStepId);

		try {
			indexer.reindex(processStep);
		} catch (SearchException e) {
			e.printStackTrace();
		}

		return processStepRole;
	}

	public ProcessStepRole removeProcessStepRole(long processStepId, long roleId) {

		ProcessStepRolePK pk = new ProcessStepRolePK(processStepId, roleId);

		ProcessStepRole processStepRole = processStepRolePersistence.fetchByPrimaryKey(pk);

		processStepRolePersistence.remove(processStepRole);

		// Update index

		Indexer<ProcessStep> indexer = IndexerRegistryUtil.nullSafeGetIndexer(ProcessStep.class);

		ProcessStep processStep = processStepPersistence.fetchByPrimaryKey(processStepId);

		try {
			indexer.reindex(processStep);
		} catch (SearchException e) {
			e.printStackTrace();
		}

		return processStepRole;

	}

}