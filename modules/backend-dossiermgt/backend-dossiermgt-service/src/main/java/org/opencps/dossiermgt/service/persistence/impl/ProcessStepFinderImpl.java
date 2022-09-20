package org.opencps.dossiermgt.service.persistence.impl;

import java.util.List;

import org.opencps.dossiermgt.model.ProcessStep;
import org.opencps.dossiermgt.model.impl.ProcessStepImpl;
import org.opencps.dossiermgt.service.persistence.ProcessStepFinder;

import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import aQute.bnd.annotation.ProviderType;

@ProviderType
public class ProcessStepFinderImpl extends ProcessStepFinderBaseImpl
		 implements ProcessStepFinder {

	Log _log = LogFactoryUtil.getLog(ProcessStepFinderImpl.class);

	@SuppressWarnings("unchecked")
	public List<ProcessStep> findProcessStepByUserId(long userId) {

		Session session = null;
		List<ProcessStep> processStepList = null;
		String sql = "SELECT * FROM opencps_processstep WHERE processStepId IN "
				+ "(SELECT processStepId FROM opencps_processsteprole WHERE roleId IN "
				+ "(SELECT roleId FROM users_roles WHERE userId = " + (userId) + "))";
		//_log.info("SQL: " + sql);
		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("opencps_processstep", ProcessStepImpl.class);

			processStepList = q.list();
			// _log.info("SQL list deliverable: "+ deliverableList);
		} catch (Exception e) {
			try {
				throw new SystemException(e);
			} catch (SystemException se) {
				se.printStackTrace();
			}
		} finally {
			closeSession(session);
		}

		return processStepList;
	}

}
