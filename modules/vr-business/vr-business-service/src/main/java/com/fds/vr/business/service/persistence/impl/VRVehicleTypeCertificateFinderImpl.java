package com.fds.vr.business.service.persistence.impl;

import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.model.VRVehicleTypeCertificate;
import com.fds.vr.business.model.impl.VRVehicleTypeCertificateImpl;
import com.fds.vr.business.model.impl.VRVehicleTypeCertificateModelImpl;
import com.fds.vr.business.service.persistence.VRVehicleTypeCertificateFinder;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.Iterator;
import java.util.List;

public class VRVehicleTypeCertificateFinderImpl extends VRVehicleTypeCertificateFinderBaseImpl
		implements VRVehicleTypeCertificateFinder {

	Log log = LogFactoryUtil.getLog(VRVehicleTypeCertificateFinderImpl.class);

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		Session session = null;
		JSONArray results = JSONFactoryUtil.createJSONArray();
		try {
			session = openSession();

			log.info("===>>>VRVehicleTypeCertificateFinder " + sql + "|" + start + "|" + end);

			SQLQuery q = session.createSQLQuery(sql);

			q.setCacheable(false);

			if (Validator.isNotNull(modelClassName) && modelClazz != null) {
				q.addEntity(modelClassName, modelClazz);
				List<VRVehicleTypeCertificate> vrVehicleTypeCertificates = (List<VRVehicleTypeCertificate>) QueryUtil
						.list(q, getDialect(), start, end);
				if (vrVehicleTypeCertificates != null) {
					for (VRVehicleTypeCertificate vrVehicleTypeCertificate : vrVehicleTypeCertificates) {
						JSONObject json = ActionUtil.object2Json(vrVehicleTypeCertificate,
								VRVehicleTypeCertificateModelImpl.class, "");
						results.put(json);
					}
				}
			} else {

				if (columnNames.size() > 1) {
					Iterator<Object[]> itr = (Iterator<Object[]>) QueryUtil.iterate(q, getDialect(), start, end);

					if (itr.hasNext()) {
						while (itr.hasNext()) {
							Object[] objects = itr.next();
							JSONObject json = ActionUtil.array2Json(objects, columnNames, dataTypes);
							results.put(json);
						}

					}
				} else if (columnNames.size() == 1) {
					Iterator itr = QueryUtil.iterate(q, getDialect(), start, end);

					if (itr.hasNext()) {
						while (itr.hasNext()) {

							JSONObject json = JSONFactoryUtil.createJSONObject();
							json.put(columnNames.get(0), itr.next());
							results.put(json);
						}

					}
				}
			}

			return results;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List<VRVehicleTypeCertificate> findExpiredVRVehicleTypeCertificates(int day, String expiredStatus) {

		Session session = null;
		List<VRVehicleTypeCertificate> vrVehicleTypeCertificates = null;
		try {
			session = openSession();

			String sql = "SELECT DISTINCT vr_vehicletypecertificate.* FROM vr_vehicletypecertificate "
					+ "LEFT JOIN vr_vehicleequipment ON vr_vehicletypecertificate.id = vr_vehicleequipment.vehicleTypeCertificateId "
					+ "WHERE (( vr_vehicletypecertificate.copReportExpireDate IS NOT NULL AND DATEDIFF( vr_vehicletypecertificate.copReportExpireDate, NOW()) <= " + day + " )"
					+ " OR ( vr_vehicletypecertificate.certificateRecordExpireDate IS NOT NULL AND DATEDIFF( vr_vehicletypecertificate.certificateRecordExpireDate, NOW()) <= " + day + " ))"
					+ " AND ( vr_vehicletypecertificate.module = '03' OR vr_vehicletypecertificate.module = '04')"
					+ " AND vr_vehicletypecertificate.expiredStatus IN (" + expiredStatus + ")";
			
			//log.info("===>>> Scheduler Expired: " + sql);

			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(VRVehicleTypeCertificateModelImpl.TABLE_NAME, VRVehicleTypeCertificateImpl.class);

			vrVehicleTypeCertificates = (List<VRVehicleTypeCertificate>) QueryUtil.list(q, getDialect(),
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

		return vrVehicleTypeCertificates;
	}

	public long countData(String sql) throws SystemException {

		Session session = null;

		try {
			session = openSession();

			log.info("===>>>VRVehicleTypeCertificateFinder " + sql);

			SQLQuery q = session.createSQLQuery(sql);

			q.setCacheable(false);

			q.addScalar("total", Type.LONG);

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
