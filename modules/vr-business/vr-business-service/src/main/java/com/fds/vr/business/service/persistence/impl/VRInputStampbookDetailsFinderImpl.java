package com.fds.vr.business.service.persistence.impl;

import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.model.VRInputStampbookDetails;
import com.fds.vr.business.model.impl.VRInputStampbookDetailsModelImpl;
import com.fds.vr.business.service.persistence.VRInputStampbookDetailsFinder;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.Iterator;
import java.util.List;


public class VRInputStampbookDetailsFinderImpl extends VRInputStampbookDetailsFinderBaseImpl
	implements VRInputStampbookDetailsFinder {

	private static final Log _log = LogFactoryUtil.getLog(VRInputStampbookDetailsFinderImpl.class);

	public Long[] findStartNoEndNoBySequence(long inputStampbookId) {
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			query.append("SELECT MIN(sequenceNo) as start, MAX(sequenceNo) as end FROM vr_inputstampbookdetails ");			
			query.append("WHERE issuingStatus = 0 AND bookId = ? ORDER BY ID ");		
			
					
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addScalar("start", Type.LONG);
			q.addScalar("end", Type.LONG);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(inputStampbookId);
			
			long start = 0;
			long end = 0;
			
			Iterator<Object[]> itr = q.iterate();

			if (itr.hasNext()) {
				Object[] value = itr.next();

				if (value != null) {
					start = GetterUtil.getLong(value[0]);
					end = GetterUtil.getLong(value[1]);
				}
			}
			
			return new Long[]{start, end};
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public List<Object[]> findStampbookByVehicleClass(String vehicleClass, long corporationId) {
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			query.append("SELECT vr_inputstampbook.bookId, vr_inputstampbook.stampShortNo, MIN(vr_inputstampbookdetails.sequenceNo) AS start, MAX(vr_inputstampbookdetails.sequenceNo) AS end FROM vr_inputstampbook  ");
			query.append("LEFT JOIN vr_inputstampbookdetails  ");
			query.append("ON vr_inputstampbook.id = vr_inputstampbookdetails.bookid ");
			query.append("WHERE (vr_inputstampbookdetails.issuingStatus = 0 OR vr_inputstampbookdetails.issuingStatus = 1) AND vr_inputstampbook.vehicleClass = ? AND vr_inputstampbookdetails.corporationId = ? GROUP BY vr_inputstampbook.bookid ");
			
					
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addScalar("bookId", Type.LONG);
			q.addScalar("stampShortNo", Type.STRING);
			q.addScalar("start", Type.LONG);
			q.addScalar("end", Type.LONG);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(vehicleClass);
			qPos.add(corporationId);
			
			return (List<Object[]>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error(e);
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

			_log.info("===>>>VRInputStampbookDetailsFinder " + sql + "|" + start + "|" + end);

			SQLQuery q = session.createSQLQuery(sql);

			q.setCacheable(false);

			if (Validator.isNotNull(modelClassName) && modelClazz != null) {
				q.addEntity(modelClassName, modelClazz);
				List<VRInputStampbookDetails> vrInputStampbookDetails = (List<VRInputStampbookDetails>) QueryUtil.list(q, getDialect(),
						start, end);
				if (vrInputStampbookDetails != null) {
					for (VRInputStampbookDetails vrInputStampbookDetail : vrInputStampbookDetails) {
						JSONObject json = ActionUtil.object2Json(vrInputStampbookDetail, VRInputStampbookDetailsModelImpl.class, "");
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

			_log.info("===>>>VRInputStampbookDetailsFinder " + sql);

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
