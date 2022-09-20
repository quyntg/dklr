/**
 * 
 */
package com.fds.vr.business.service.persistence.impl;

import com.fds.vr.business.model.VRHistoryProfile;
import com.fds.vr.business.model.impl.VRHistoryProfileImpl;
import com.fds.vr.business.service.persistence.VRHistoryProfileFinder;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ddung
 *
 */
public class VRHistoryProfileFinderImpl extends VRHistoryProfileFinderBaseImpl implements VRHistoryProfileFinder {
	private final static Log log = LogFactoryUtil.getLog(VRHistoryProfileFinderImpl.class);

	public List<VRHistoryProfile> findVRHitoryProfiles(String applicantCode, String productionPlantCode, long dossierId,
			String dossierIdCTN, String dossierNo, String contentType, String contentFileTemplate, int start, int end) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM vr_history_profile ");
			query.append(" WHERE 1=1 ");

			if (Validator.isNotNull(applicantCode) && !applicantCode.isEmpty()) {
				query.append(" AND applicantCode = '" + applicantCode + "'");
			}
			if (Validator.isNotNull(productionPlantCode) && !productionPlantCode.isEmpty()) {
				query.append(" AND productionPlantCode = '" + productionPlantCode + "'");
			}
			if (Validator.isNotNull(dossierIdCTN) && !dossierIdCTN.isEmpty()) {
				query.append(" AND dossierIdCTN = '" + dossierIdCTN + "'");
			}
			if (Validator.isNotNull(dossierNo) && !dossierNo.isEmpty()) {
				query.append(" AND dossierNo = '" + dossierNo + "'");
			}
			if (Validator.isNotNull(contentType) && !contentType.isEmpty()) {
				query.append(" AND contentType = '" + contentType + "'");
			}
			if (Validator.isNotNull(contentFileTemplate) && !contentFileTemplate.isEmpty()) {
				query.append(" AND contentFileTemplate = '" + contentFileTemplate + "'");
			}
			if (Validator.isNotNull(dossierId) && dossierId > 0) {
				query.append(" AND dossierId = " + dossierId);
			}
			query.append(" order by createdDate desc ");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VRHistoryProfileImpl.TABLE_NAME, VRHistoryProfileImpl.class);

			log.debug("=========findVRHistoryProfile===" + query.toString());
			QueryPos qPos = QueryPos.getInstance(q);

			return (List<VRHistoryProfile>) QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}

		return new ArrayList<VRHistoryProfile>();
	}
}
