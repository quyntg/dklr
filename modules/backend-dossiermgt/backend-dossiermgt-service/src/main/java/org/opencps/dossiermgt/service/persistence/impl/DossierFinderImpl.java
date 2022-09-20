package org.opencps.dossiermgt.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.impl.DossierImpl;
import org.opencps.dossiermgt.service.persistence.DossierFinder;

import java.util.List;

@ProviderType
public class DossierFinderImpl extends DossierFinderBaseImpl
		implements DossierFinder {

	Log _log = LogFactoryUtil.getLog(DossierFinderImpl.class);

	@SuppressWarnings("unchecked")
	public List<Dossier> findDossierByRequestStatus(String statusReg, int start , int end) {

		Session session = null;
		List<Dossier> DossierList = null;
		String sql = "select * from opencps_dossier where ( upper(dossierStatus) ='PAYING') or dossierId in (select dossierId from opencps_dossierrequests where statusReg in (" + statusReg + "))";
		//_log.info("SQL: " + sql);
		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("opencps_Dossier", DossierImpl.class);

			DossierList = (List<Dossier>) QueryUtil
					.list(q, getDialect(), start, end);

		} catch (Exception e) {
			_log.info("dossier_request size =0");
		} finally {
			closeSession(session);
		}

		return DossierList;
	}

}
