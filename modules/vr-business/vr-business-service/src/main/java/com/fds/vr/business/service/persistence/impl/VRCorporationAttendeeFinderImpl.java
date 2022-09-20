package com.fds.vr.business.service.persistence.impl;

import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.model.VRCorporationAttendee;
import com.fds.vr.business.model.impl.VRCorporationAttendeeImpl;
import com.fds.vr.business.model.impl.VRCorporationAttendeeModelImpl;
import com.fds.vr.business.service.persistence.VRCorporationAttendeeFinder;
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


public class VRCorporationAttendeeFinderImpl extends VRCorporationAttendeeFinderBaseImpl
	implements VRCorporationAttendeeFinder {

	Log log = LogFactoryUtil.getLog(VRCorporationAttendeeFinderImpl.class);

	public List<VRCorporationAttendee> findByUserId(long mtCore, long userId, String startDate, String endDate) {
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			query.append("SELECT {vr_corporation_attendee.*} FROM vr_corporation_attendee ");
			query.append("WHERE vr_corporation_attendee.mtCore = "+mtCore+" AND ");
			query.append("(vr_corporation_attendee.leaderId = "+userId+" OR vr_corporation_attendee.managerId = "+userId+") ");

			if (Validator.isNotNull(startDate)) {
				query.append("AND Date(vr_corporation_attendee.inspectionDate) >= '"+startDate+"' ");
				if (Validator.isNotNull(endDate)) {
					query.append("AND Date(vr_corporation_attendee.inspectionDate) <= '"+endDate+"'");
				}
			} else {
				if (Validator.isNotNull(endDate)) {
					query.append("AND Date(vr_corporation_attendee.inspectionDate) <= '"+endDate+"'");
				}
			}

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("vr_corporation_attendee", VRCorporationAttendeeImpl.class);
			
			log.info("=========findByMappingApplicantProfile===" + query.toString() );

			return (List<VRCorporationAttendee>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}

		return null;
	}

	
	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		Session session = null;
		JSONArray results = JSONFactoryUtil.createJSONArray();
		try {
			session = openSession();

			log.info("===>>>VRCorporationAttendeeFinder " + sql + "|" + start + "|" + end);

			SQLQuery q = session.createSQLQuery(sql);

			q.setCacheable(false);

			if (Validator.isNotNull(modelClassName) && modelClazz != null) {
				q.addEntity(modelClassName, modelClazz);
				List<VRCorporationAttendee> vrCorporationAttendees = (List<VRCorporationAttendee>) QueryUtil.list(q, getDialect(),
						start, end);
				if (vrCorporationAttendees != null) {
					for (VRCorporationAttendee vrCorporationAttendee : vrCorporationAttendees) {
						
						JSONObject json = ActionUtil.object2Json(vrCorporationAttendee, VRCorporationAttendeeModelImpl.class,
								"");
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

	public long countData(String sql) throws SystemException {

		Session session = null;

		try {
			session = openSession();

			log.info("===>>>VRCorporationAttendeeFinder " + sql);

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
